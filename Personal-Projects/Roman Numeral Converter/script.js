const romanNumerals = [
  {numeral: 'M', value: 1000},
  {numeral: 'CM', value: 900},
  {numeral: 'D', value: 500},
  {numeral: 'CD', value: 400},
  {numeral: 'C', value: 100},
  {numeral: 'XC', value: 90},
  {numeral: 'L', value: 50},
  {numeral: 'XL', value: 40},
  {numeral: 'X', value: 10},
  {numeral: 'IX', value: 9},
  {numeral: 'V', value: 5},
  {numeral: 'IV', value: 4},
  {numeral: 'I',  value: 1}
];

const convertBtn = document.getElementById('convert-btn');

convertBtn.addEventListener('click', () => {
  const inputNumber = parseInt(document.getElementById('number').value);
  const output = document.getElementById('output');

  if (!inputNumber) {
    output.textContent = "Please enter a valid number";
    return;
  } else if (inputNumber < 1) {
    output.textContent = "Please enter a number greater than or equal to 1";
    return;
  } else if (inputNumber >= 4000) {
    output.textContent = "Please enter a number less than or equal to 3999";
    return;
  } else {
    let converted = '';
    let number = inputNumber;
    for (let i = 0; i < romanNumerals.length; i++) {
      while (number >= romanNumerals[i].value) {
        converted += romanNumerals[i].numeral;
        number -= romanNumerals[i].value;
      }
    }
    output.textContent = converted;
    return;
  }
});
