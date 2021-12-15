// herseyi seç 
// yapılacaklar formunu seçin
const todoForm = document.querySelector('.todo-form');
// giriş kutusunu seçin 
const todoInput = document.querySelector('.todo-input');
// select the <ul> with class="todo-items"
const todoItemsList = document.querySelector('.todo-items');

//her todoyu saklayan dizi
let todos = [];

// forma bir eventListener ekleyin ve gönderme olayını dinleyin 
todoForm.addEventListener('submit', function(event) {
  // formu gönderirken sayfanın yeniden yüklenmesini engelle
  event.preventDefault();
  addTodo(todoInput.value); // giriş kutusu geçerli değeri ile addTodo işlevini çağırın
});

// yapılacaklar ekleme işlevi
function addTodo(item) {
  // öğe boş değilse
  if (item !== '') {
    // kimliği, adı ve tamamlanmış özellikleri olan bir yapılacaklar nesnesi yapın
    const todo = {
      id: Date.now(),
      name: item,
      completed: false
    };

    // sonra onu todos dizisine ekle
    todos.push(todo);
    addToLocalStorage(todos); // 

    

    // nihayet giriş kutusu değerini temizle
    todoInput.value = '';
  }
}

// verilen yapılacakları ekrana işleme işlevi
function renderTodos(todos) {
  // class=todo-items ile <ul> içindeki her şeyi temizle
  todoItemsList.innerHTML = '';

  // todos içindeki her bir öğeyi gözden geçir
  todos.forEach(function(item) {
    // öğenin tamamlanıp tamamlanmadığını kontrol et

    const checked = item.completed ? 'checked': null;

    // bir <li> elemanı oluştur ve onu doldur
    // <li> </li>
    const li = document.createElement('li');
    // <li class="item"> </li>
    li.setAttribute('class', 'item');
    // <li class="item" data-key="20200708"> </li>
    li.setAttribute('data-key', item.id);
    /* <li class="item" data-key="20200708"> 
          <input type="checkbox" class="checkbox">
          Go to Gym
          <button class="delete-button">X</button>
        </li> */
    // öğe tamamlandıysa, <li> öğesine 'kontrol edildi' adı verilen ve satır arası stili ekleyecek bir sınıf ekleyin
    if (item.completed === true) {
      li.classList.add('checked');
    }

    li.innerHTML = `
      <input type="checkbox" class="checkbox" ${checked}>
      ${item.name}
      <button class="delete-button">X</button>
    `;
    // son olarak <li>'yi <ul>'a ekleyin
    todoItemsList.append(li);
  });

}

// yerel depolamaya yapılacaklar ekleme işlevi
function addToLocalStorage(todos) {
  // diziyi dizgeye dönüştürün ve sonra saklayın.
  localStorage.setItem('todos', JSON.stringify(todos));
  // onları ekrana yansıt
  renderTodos(todos);
}

//işlev, yerel depolamadan her şeyi almaya yardımcı olur
function getFromLocalStorage() {
  const reference = localStorage.getItem('todos');
  // referans varsa
  if (reference) {
    //diziye geri dönüştürür ve onu todos dizisinde saklar
    todos = JSON.parse(reference);
    renderTodos(todos);
  }
}


// değeri tamamlandı ve tamamlanmadı olarak değiştirin
function toggle(id) {
    todos.forEach(function(item) {
        //== değil === kullanın, çünkü burada türler farklıdır. Biri sayı, diğeri dize   
          if (item.id == id) {
        //değeri değiştir
        item.completed = !item.completed;
          }
    });
  
    addToLocalStorage(todos);
  }
  
  // yapılacaklar dizisinden bir yapılacakları siler, ardından yerel depolamayı günceller ve güncellenmiş listeyi ekrana işler
  function deleteTodo(id) {
    // <li> ile kimliği filtreler ve todos dizisini günceller
    todos = todos.filter(function(item) {
      // != değil !== kullanın, çünkü burada türler farklıdır. Biri sayı, diğeri dize
      return item.id != id;
    });
  
    // localStorage'ı güncelle
    addToLocalStorage(todos);
  }




// başlangıçta her şeyi localStorage'dan al
getFromLocalStorage();

// bundan sonra class=todoItems ile addEventListener <ul>. Çünkü tüm sil butonlarında ve onay kutularında click olayını dinlememiz gerekiyor.

todoItemsList.addEventListener('click', function(event) {
    // check if the event is on checkbox
    if (event.target.type === 'checkbox') {
      //durumu değiştir
      toggle(event.target.parentElement.getAttribute('data-key'));
    }
  
    // bunun bir silme düğmesi olup olmadığını kontrol edin
    if (event.target.classList.contains('delete-button')) {
      // silme düğmesinin mevcut olduğu veri anahtarı özniteliğinin <li> ebeveyn değerinden kimliği al 
      deleteTodo(event.target.parentElement.getAttribute('data-key'));
    }
  });