var numero = Math.floor(Math.random() * 3 + 1);
var aviso = document.getElementById("msg_aviso");

if (numero == 1) {
  aviso.innerHTML = "<p>Abrimos aos sábados e domingos!</p>";
} else if (numero == 2) {
  aviso.innerHTML = "<p>Abrimos em feriados nacionais!</p>";
} else if (numero == 3) {
  aviso.innerHTML = "<p>Ofertas para datas comemorativas!</p>";
}

var cupom = document.createElement("i")
cupom.innerHTML= "Use o cupom <code>CUPOM10</code> para ganhar 10% de desconto!"
var cupomSection = document.getElementById("cupom")
cupomSection.appendChild(cupom)

var linha = document.createElement("hr")
var avisoSection = document.querySelector("body > #aviso")
var paragrafo = document.querySelector("body > #aviso > p")
avisoSection = avisoSection.insertBefore(linha, paragrafo)
