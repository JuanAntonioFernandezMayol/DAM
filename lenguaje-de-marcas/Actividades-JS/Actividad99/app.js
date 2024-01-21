
let tareas = [];

function agregarTarea() {
    const entradaTarea = document.getElementById('entradaTarea');
    const textoTarea = entradaTarea.value.trim();

    if (textoTarea !== '') {
        tareas.push({ texto: textoTarea, completada: false, eliminada: false });
        entradaTarea.value = '';
        mostrarTareas();
    }
}

function mostrarTareas() {
    const listaPendientes = document.getElementById('listaPendientes');
    const listaCompletadas = document.getElementById('listaCompletadas');
    const listaEliminadas = document.getElementById('listaEliminadas');

    listaPendientes.innerHTML = '';
    listaCompletadas.innerHTML = '';
    listaEliminadas.innerHTML = '';

    tareas.forEach((tarea, indice) => {
        const elementoTarea = crearElementoTarea(tarea, indice);

        if (tarea.completada) {
            listaCompletadas.appendChild(elementoTarea);
        } else if (tarea.eliminada) {
            listaEliminadas.appendChild(elementoTarea);
        } else {
            listaPendientes.appendChild(elementoTarea);
        }
    });
}

function cambiarEstadoTarea(indice) {
    tareas[indice].completada = !tareas[indice].completada;
    mostrarTareas();
}

function eliminarTarea(indice) {
    tareas[indice].eliminada = !tareas[indice].eliminada;

    // Si la tarea se está restaurando, marcarla como no completada
    if (!tareas[indice].eliminada) {
        tareas[indice].completada = false;
    }

    mostrarTareas();
}

function filtrarTareas(filtro) {
    const tareasFiltradas = tareas.filter(tarea => {
        if (filtro === 'todas') {
            return true;
        } else if (filtro === 'pendientes') {
            return !tarea.completada && !tarea.eliminada;
        } else if (filtro === 'completadas') {
            return tarea.completada && !tarea.eliminada;
        }
    });

    mostrarTareasFiltradas(tareasFiltradas);
}

function mostrarTareasFiltradas(tareasFiltradas) {
    const listaPendientes = document.getElementById('listaPendientes');
    const listaCompletadas = document.getElementById('listaCompletadas');
    const listaEliminadas = document.getElementById('listaEliminadas');

    listaPendientes.innerHTML = '';
    listaCompletadas.innerHTML = '';
    listaEliminadas.innerHTML = '';

    tareasFiltradas.forEach(tarea => {
        const elementoTarea = crearElementoTarea(tarea, tareas.indexOf(tarea));
        if (tarea.completada) {
            listaCompletadas.appendChild(elementoTarea);
        } else if (tarea.eliminada) {
            listaEliminadas.appendChild(elementoTarea);
        } else {
            listaPendientes.appendChild(elementoTarea);
        }
    });
}

function crearElementoTarea(tarea, indice) {
    const elementoTarea = document.createElement('li');
    elementoTarea.className = 'tarea';
    const checkbox = document.createElement('input');
    checkbox.type = 'checkbox';
    checkbox.checked = tarea.completada;
    checkbox.addEventListener('change', () => cambiarEstadoTarea(indice));

    const textoTarea = document.createElement('span');
    textoTarea.textContent = tarea.texto;
    if (tarea.completada) {
        textoTarea.classList.add('completada');
    } else if (tarea.eliminada) {
        textoTarea.classList.add('eliminada');
    }

    const botonEliminar = document.createElement('button');
    botonEliminar.textContent = tarea.eliminada ? 'Restaurar' : 'Eliminar';
    botonEliminar.addEventListener('click', () => eliminarTarea(indice));

    elementoTarea.appendChild(checkbox);
    elementoTarea.appendChild(textoTarea);
    elementoTarea.appendChild(botonEliminar);

    return elementoTarea;
}

mostrarTareas();
