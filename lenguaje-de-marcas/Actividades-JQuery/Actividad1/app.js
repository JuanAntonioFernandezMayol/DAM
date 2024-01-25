$(function agregarcomentarios() {
    $("#add").click(function () {
        let newCommentTextBox = $("#comment");
        let commentText = newCommentTextBox.val();
        $("#comments").append("<li>" + commentText + "</li>");
        newCommentTextBox.val('');
    });
});

// + "<button #dele>" + "X" + "</button>" +

function eliminarultimo() {
    $("li:last").remove();
}

$(function ocultarinfo() {
    $("#comentario").click(function () {
    $("ul").toggle();
    $("input").toggle();
    $("#add").toggle();
    $("#del").toggle();
});
});