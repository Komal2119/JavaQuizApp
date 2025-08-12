const quizData = [
  {
    question: "What is the size of int in Java?",
    options: ["2 bytes", "4 bytes", "8 bytes"],
    answer: "4 bytes"
  },
  {
    question: "Which keyword is used to inherit a class in Java?",
    options: ["super", "extends", "implements"],
    answer: "extends"
  }
];

function loadQuiz() {
  const quizContainer = document.getElementById("quiz");
  quizContainer.innerHTML = quizData.map((q, index) => `
    <div>
      <p>${q.question}</p>
      ${q.options.map(opt =>
        `<label><input type="radio" name="q${index}" value="${opt}"> ${opt}</label>`
      ).join("<br>")}
    </div>
  `).join("<hr>");
}

function submitQuiz() {
  let score = 0;
  quizData.forEach((q, index) => {
    const selected = document.querySelector(`input[name="q${index}"]:checked`);
    if (selected && selected.value === q.answer) {
      score++;
    }
  });
  document.getElementById("result").innerText = `You scored ${score}/${quizData.length}`;
}

loadQuiz();
