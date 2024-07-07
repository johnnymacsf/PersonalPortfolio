const checkBtn = document.getElementById('check-btn');
checkBtn.addEventListener('click', ()=>{
  const textInput = document.getElementById('text-input').value;
  if(!textInput){
    alert("Please input a value");
    return;
  }
  const alphanumeric = /[^a-z0-9]/g;
  const textCleaned = textInput.toLowerCase().replace(alphanumeric,'');
  const textReversed = textCleaned.split('').reverse().join('');
  const result = document.getElementById('result');

  if(textCleaned === textReversed){
    result.textContent = `${textInput} is a palindrome`
  }else{
    result.textContent = `${textInput} is not a palindrome`
  }
});
