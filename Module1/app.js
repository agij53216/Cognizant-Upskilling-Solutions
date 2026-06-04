// app.js - Community Event Portal

const events = [
  {
    id: 1,
    name: "Tech Meetup",
    category: "tech",
    seats: 10,
    date: "2026-06-10",
  },
  {
    id: 2,
    name: "Art Workshop",
    category: "art",
    seats: 0,
    date: "2026-05-01",
  },
  {
    id: 3,
    name: "Music Night",
    category: "music",
    seats: 5,
    date: "2026-06-15",
  },
];

// Exercise 1 - console log
console.log("Welcome to the Community Portal");

// Exercise 2 - template literals
const eventInfo = `Event: ${events[0].name}, Date: ${events[0].date}, Seats: ${events[0].seats}`;
console.log(eventInfo);

// Exercise 3 - filter valid events
events.forEach((event) => {
  if (event.seats > 0 && new Date(event.date) > new Date()) {
    console.log("Valid event: " + event.name);
  }
});

// Exercise 4 - closure for registration count
function categoryCounter() {
  let count = 0;
  return function () {
    return ++count;
  };
}
const techCount = categoryCounter();
console.log("Tech registrations: " + techCount());

// Exercise 5 - filter music events
const musicEvents = events.filter((e) => e.category === "music");
console.log("Music events:", musicEvents);

// Exercise 6 - map to display cards
const cards = events.map((e) => `${e.name} - ${e.seats} seats left`);
console.log(cards);

// Exercise 7 - DOM manipulation (runs in browser)
function loadEvents() {
  const container = document.getElementById("eventContainer");
  if (!container) return;
  events.forEach((e) => {
    const div = document.createElement("div");
    div.textContent = e.name + " - " + e.seats + " seats";
    container.appendChild(div);
  });
}

// Exercise 8 - Shopping cart addEventListener (PYQ pattern)
document.addEventListener("DOMContentLoaded", function () {
  // Exercise 7 - Load events into DOM
  loadEvents();

  const btn = document.getElementById("addToCart");
  if (btn) {
    btn.addEventListener("click", function () {
      const qty = document.getElementById("quantity");
      if (qty) {
        qty.textContent = parseInt(qty.textContent) + 1;
      }
    });
  }
});
