$(function agregarcomentarios() {
    $("#add").click(function () {
        let newCommentTextBox = $("#comment");
        let commentText = newCommentTextBox.val();
        $("#comments").append("<div class='div'><li>" + commentText + "</li><span class='X'>X</span></div>");
        newCommentTextBox.val('');
            $(".X").click(function(){
                $(this).parent().remove();
            })
    });
});

// + "<button #dele>" + "X" + "</button>" +



$(function ocultarinfo() {
    $("#comentario").click(function () {
    $("ul").toggle();
    $("input").toggle();
    $("#add").toggle();
    $("#del").toggle();
});
});