$(document).ready(function() {
  $('#description').summernote({height:260});
});

Vue.component('docdetail', {
  props: ['doc'],
  template: '<div id="blogdetail" class="blog-post">'+
            '<h2 class="blog-post-title">{{ doc.title }}</h2>'+
            '<p class="blog-post-meta">created by<a href="#">{{ doc.by }}</a> {{ doc.likes }}</p>'+
            '<p v-html="doc.description"></p>'+'标签:{{ doc.tags }}<br>'+
            '<button onclick="del(this)" :value="doc.id">删除文章</button>'+
            '<hr></div>'
})
var bloglist = new Vue({
  el: '#bloglist',
  data: {
    pageDoc: []
  }
})

function del(event) {
    delDoc(event.value);
}

var curPageNo=0;
var prePageNo=0;
var nexPageNo=0;

function fetchAllPre(){
    fetchAll(prePageNo);
}

function fetchAllNex(){
    fetchAll(nexPageNo);
}

function fetchAll(pageNo){
     curPageNo = pageNo;
     fetch('/index/all/'+pageNo)
      .then(function(response) {
        return response.json()
      }).then(function(json) {
        console.log(json);
        if(pageNo<json.totalPages-1){
            if(pageNo==0){
                prePageNo=pageNo;
            }else{
                prePageNo=pageNo-1;
            }
            nexPageNo=pageNo+1;
        }else{
            if(pageNo==0){
                prePageNo=pageNo;
            }else{
                prePageNo=pageNo-1;
            }
            nexPageNo=pageNo;
        }
        bloglist.pageDoc=[];
        json.content.forEach(function(e){
            bloglist.pageDoc.push(e);
        })
        return ;
      }).catch(function(ex) {
        console.log('parsing failed', ex)
      })
}

fetchAll(0);

function showForm(targetid){
    if (document.getElementById){
        target=document.getElementById(targetid);
            if (target.style.display=="block"){
                target.style.display="none";
            } else {
                target.style.display="block";
            }
    }
}

function addDoc(){
    fetch('/add', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json'
      },
      body: JSON.stringify({
          title: document.getElementById('title').value,
          description: $('#description').code(),
          tags: document.getElementById('tags').value.split(" ")
      })
    }).then(function(response) {
      console.log(response.text());
      showForm('addForm');
      fetchAll(curPageNo);
    }).catch(function(ex) {
      console.log('parsing failed', ex)
    })
}

function delDoc(docId){
    fetch('/del/'+docId).then(function(response) {
      console.log(response.text());
      fetchAll(curPageNo);
    }).catch(function(ex) {
      console.log('parsing failed', ex)
    })
}




