$(function () {
    $("#add").click(function () {
        let newCommentTextBox = $("#comment");
        let commentText = newCommentTextBox.val();
        $("#comments").append("<li>" + commentText + "</li>");
        newCommentTextBox.val('');
    });
});

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