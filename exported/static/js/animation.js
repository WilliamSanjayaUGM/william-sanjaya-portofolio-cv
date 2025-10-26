const canvas = document.getElementById('stars');
const ctx = canvas.getContext('2d');
let stars = [];

function resizeCanvas() {
  canvas.width = window.innerWidth;
  canvas.height = window.innerHeight;
}

window.addEventListener('resize', resizeCanvas);
resizeCanvas();

// Generate stars in 3 layers for parallax depth
function createStars() {
  const numStars = 250;
  for (let i = 0; i < numStars; i++) {
    stars.push({
      x: Math.random() * canvas.width,
      y: Math.random() * canvas.height,
      z: Math.random() * 3, // depth layer
      size: Math.random() * 1.2,
      speed: 0.02 + Math.random() * 0.05
    });
  }
}

createStars();

function animateStars() {
  ctx.clearRect(0, 0, canvas.width, canvas.height);

  stars.forEach(star => {
    star.y += star.speed * star.z;
    if (star.y > canvas.height) star.y = 0;

    ctx.beginPath();
    const brightness = 0.6 + 0.4 * Math.sin(Date.now() * 0.002 + star.x);
    ctx.fillStyle = `rgba(255,255,255,${brightness})`;
    ctx.arc(star.x, star.y, star.size * star.z, 0, Math.PI * 2);
    ctx.fill();
  });

  requestAnimationFrame(animateStars);
}

animateStars();
