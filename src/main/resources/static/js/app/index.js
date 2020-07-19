//이 객체 안에서 해당 객체에서 필요한 모든 function을 선언한다
//main 객체 안에서만 function이 유효하므로 다른 js와 겹칠 위험이 없다
const main = {
  init : function() {
    let _this=this;
    $('#btn-save').on('click', function() {
      _this.save();
    });
    $('#btn-update').on('click', function () {
      _this.update();
    });
    $('#btn-delete').on('click', function() {
      _this.delete();
    })
  },
  save : function () {
    let data = {
      title: $('#title').val(),
      author: $('#author').val(),
      content: $('#content').val()
    };

    $.ajax({
      type: 'POST',
      url: '/api/v1/posts',
      dataType: 'json',
      contentType: 'application/json; charset-utf-8',
      data: JSON.stringify(data)
    }).done(function() {
      alert('글이 등록되었습니다.');
      window.location.href = '/';
    }).fail(function(error) {
      alert(JSON.stringify(error));
    })
  },
  update: function () {
    let data = {
      title: $('#title').val(),
      content: $('#content').val()
    };
    const id = $('#id').val();

    $.ajax({
      type: 'PUT',
      url: '/api/v1/posts/'+id,
      dataType: 'json',
      contentType: 'application/json; charset-utf-8',
      data: JSON.stringify(data)
    }).done(function() {
      alert('글이 수정되었습니다.');
      window.location.href = '/';
    }).fail(function(error) {
      alert(JSON.stringify(error));
    })
  },
  delete: function () {
    const id = $('#id').val();

    $.ajax({
      type: 'DELETE',
      url: '/api/v1/posts/' + id,
      dataType: 'json',
      contentType: 'application/json; charset-utf-8',
    }).done(function() {
      alert('글이 삭제되었습니다.');
      window.location.href = '/';
    }).fail(function(error) {
      alert(JSON.stringify(error));
    })

  }
}

main.init();