$(document).ready(function () {
    $("#start-date, #end-date").datepicker({
        dateFormat: "dd/mm/yy",
        minDate: 0
    });

    $("#start-date, #end-date, #destination").on("input", filtrarTarjetas);

    $("#budget-slider").slider({
        range: "max",
        min: 0,
        max: 1000,
        values: [0, 500],
        slide: function (event, ui) {
            $("#budget-amount").text(ui.values[0] + "€ - " + ui.values[1] + "€");
            filtrarTarjetas();
        },
    });
});

let availableDestinations = ["Barcelona", "Valencia", "Mallorca"];

$("#destination").autocomplete({
    source: availableDestinations
});

function formatDate(date) {
    let day = date.getDate();
    let month = date.getMonth() + 1;
    let year = date.getFullYear();

    return year + '-' + (month < 10 ? '0' : '') + month + '-' + (day < 10 ? '0' : '') + day;
}

function filtrarTarjetas() {
    let fechaInicio = $("#start-date").datepicker("getDate");
    let fechaFin = $("#end-date").datepicker("getDate");
    let destino = $("#destination").val().toLowerCase();
    let presupuestoMin = $("#budget-slider").slider("values", 0);
    let presupuestoMax = $("#budget-slider").slider("values", 1);

    $(".tarjetas .targeta").each(function () {
        let fechaTarjeta = $(this).data("start-date").split("-");
        fechaTarjeta = new Date(fechaTarjeta[0], fechaTarjeta[1] - 1, fechaTarjeta[2]);
        let fechaFinTarjeta = $(this).data("end-date").split("-");
        fechaFinTarjeta = new Date(fechaFinTarjeta[0], fechaFinTarjeta[1] - 1, fechaFinTarjeta[2]);
        let destinoTarjeta = $(this).data("destination").toLowerCase();
        let precioTarjeta = Number($(this).attr("data-precio"));

        let fechaDentroDelRango = (!fechaInicio || fechaInicio <= fechaTarjeta) && (!fechaFin || fechaTarjeta <= fechaFin);
        let destinoCoincide = destino === '' || destinoTarjeta.includes(destino);
        let precioDentroDelPresupuesto = presupuestoMin <= precioTarjeta && precioTarjeta <= presupuestoMax;

        if (fechaDentroDelRango && destinoCoincide && precioDentroDelPresupuesto) {
            $(this).show();
        } else {
            $(this).hide();
        }
    });
}






