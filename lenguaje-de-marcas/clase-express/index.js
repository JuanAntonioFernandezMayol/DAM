const express = require('express')
const db = require('better-sqlite3')('personas.sqlite');
const db2 = require('better-sqlite3')('tablas.sqlite');
const app = express()
const port = 3000


app.use(express.json())
app.use(express.urlencoded({ extended: true }));

//crearemos la configuracion de la base de datos
app.get('/personas', (req, res) => {
    const rows = db.prepare('SELECT * FROM personas').all()
    res.render("personas", personas = rows)
  })

  app.set('view engine', 'ejs');

  app.get("/", (req, res) => {
    res.render('index', msgs={ msgs: ["Hola", "desde", "la", "ruta"]});
  });

  //devolveremos el render de la vista con un formulario

  app.get('/persona', (req, res) => {
    // personaId = req.query.id;
    // const rows = db.prepare('SELECT * FROM personas WHERE id = ?').get(personaId)
    // res.json(rows)
    res.render('persona')

  })
// app.get('/', (req, res) => {
//   res.send('Hello World!')
// })


//capturaremos el submit del formulario
app.post('/persona', (req, res) => {
    // personaId = req.body.id;
    // const rows = db.prepare('SELECT * FROM personas WHERE id = ?').get(personaId)
    // console.log(rows)
    // res.json(rows)
    console.log(req.body);
    if (req.body.nombre && req.body.apellidos) {
      const statement = db.prepare('INSERT INTO personas (nombre, apellidos) VALUES (?,?)')
    const info = statement.run(req.body.nombre, req.body.apellidos);
    console.log(info);
    }
      res.redirect('persona');
})

app.listen(port, () => {
  console.log(`Example app listening on port ${port}`)
})

// app.get('/usuaris', (req, res) => {
//   const rows = db2.prepare('SELECT * FROM Usuaris').all()
//   res.render("usuaris", {usuaris: rows})
// })
// app.get('/usuari', (req, res) => {
//   res.render('usuari')
// })
app.get('/usuaris', (req, res) => {
  const usuaris = db2.prepare('SELECT * FROM Usuaris').all();
  res.render('usuaris', { usuaris: usuaris });
});

app.get('/usuaris/:id', (req, res) => {
  const id = req.params.id;
  const usuari = db2.prepare('SELECT * FROM Usuaris WHERE id = ?').get(id);
  const comandas = db2.prepare('SELECT * FROM Comandas WHERE usuari_id = ?').all(id);
  if (usuari) {
    res.render('usuari', { usuari: usuari, comandas: comandas });
  } else {
    res.status(404).send('Usuari no trobat');
  }
});

app.get('/usuari', (req, res) => {
  res.render('crear_usuari');
});


app.post('/usuari', (req, res) => {
  const { nom, email } = req.body;
  const stmt = db2.prepare('INSERT INTO Usuaris (nom, email) VALUES (?, ?)');
  const info = stmt.run(nom, email);
  res.redirect('/usuaris/' + info.lastInsertRowid);
});

// app.get('/usuari?id', (req, res) => {
//   const rows = db2.prepare('SELECT * FROM Usuaris WHERE id = ?').get(usuariid)
//   res.json(rows)
// })

app.get('/productes', (req, res) => {
  const rows = db2.prepare('SELECT * FROM Productes').all()
  res.render("productes", { productes: rows })
})

app.get('/producte', (req, res) => {
  res.render('producte')
})

app.get('/productes/:id', (req, res) => {
  const id = req.params.id;
  const producte = db2.prepare('SELECT * FROM Productes WHERE id = ?').get(id);
  if (producte) {
    res.render('detalls_producte', { producte: producte });
  } else {
    res.send('Producte no trobat');
  }
});


// app.get('/producte?id', (req, res) => {
//   const rows = db2.prepare('SELECT * FROM Productes WHERE id = ?').get(usuariid)
//   res.json(rows)
// })

app.get('/comanda', (req, res) => {
  const comandas = db2.prepare('SELECT * FROM Comandas').all();
  res.render('comandas', { comandas: comandas });
});

// Ruta para procesar el formulario de creación de comandas
app.post('/comanda', (req, res) => {
  if (req.body.nom && req.body.email) {
    const statement = db2.prepare('INSERT INTO Comandas (nom, email) VALUES (?,?)')
    const info = statement.run(req.body.nom, req.body.email);
    console.log(info);
  }
  res.redirect('comanda');
});

app.get('/comandas/:id', (req, res) => {
  const id = req.params.id;
  const comanda = db2.prepare('SELECT * FROM Comandas WHERE id = ?').get(id);
  if (comanda) {
    const usuari = db2.prepare('SELECT * FROM Usuaris WHERE id = ?').get(comanda.usuari_id);
    const producte = db2.prepare('SELECT * FROM Productes WHERE id = ?').get(comanda.producte_id);
    res.render('detalls_comanda', { comanda: comanda, usuari: usuari, producte: producte });
  } else {
    res.send('Comanda no trobada');
  }
});


app.post('/usuari', (req, res) => {
  // personaId = req.body.id;
  // const rows = db.prepare('SELECT * FROM personas WHERE id = ?').get(personaId)
  // console.log(rows)
  // res.json(rows)
  console.log(req.body);
  if (req.body.nom && req.body.email) {
    const statement = db2.prepare('INSERT INTO Usuaris (nom, email) VALUES (?,?)')
  const info = statement.run(req.body.nom, req.body.email);
  console.log(info);
  }
    res.redirect('usuari');
})

app.post('/producte', (req, res) => {
  // personaId = req.body.id;
  // const rows = db.prepare('SELECT * FROM personas WHERE id = ?').get(personaId)
  // console.log(rows)
  // res.json(rows)
  console.log(req.body);
  if (req.body.nom && req.body.preu) {
    const statement = db2.prepare('INSERT INTO Productes (nomProducte, preu) VALUES (?,?)')
  const info = statement.run(req.body.nom, req.body.preu);
  console.log(info);
  }
    res.redirect('producte');

    console.log("hola")
})


