import React from "react";
import { Link } from "react-router-dom";

function Inicio() {
  return (
    <div className="text-center p-3 mb-2 bg-dark text-white">
      <div>
        <h1>Bienvenido a la aplicación de razas de gatos</h1>
        <Link to="/breeds">Ver razas de gatos</Link>
        <div>
          <p>
            ¡Bienvenido a nuestra página web dedicada a los amantes de los
            gatos! Aquí encontrarás una amplia colección de información
            detallada y hermosas imágenes de diversas razas felinas de todo el
            mundo.
          </p>
          <p>
            Nuestro objetivo es proporcionarte una experiencia inmersiva y
            educativa sobre las distintas características, temperamentos y
            peculiaridades de cada raza de gato. Ya seas un entusiasta
            experimentado o estés buscando información sobre tu próxima mascota
            felina, ¡has llegado al lugar adecuado!
          </p>
          <p>
            Explora nuestra extensa base de datos donde podrás descubrir desde
            las populares razas como el elegante siamés o el majestuoso maine
            coon, hasta las menos conocidas pero igualmente fascinantes razas
            regionales. Cada página dedicada a una raza incluye una descripción
            detallada de su historia, características físicas, temperamento
            típico y cuidados especiales que puedan necesitar.
          </p>
        </div>
      </div>
    </div>
  );
}

export default Inicio;
