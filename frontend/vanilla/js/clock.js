const globalArea = document.querySelector(".header-time");
const clockArea = document.querySelector(".header-clock");
const dateArea = document.querySelector(".header-date");

const clock = (date) => {
    let hour = date.getHours();
    let minute = (date.getUTCMinutes().toString().length === 1) ? '0'+date.getUTCMinutes() : date.getUTCMinutes();

    return `${hour}:${minute}`;
}

const date = (date) => {
    let locate_pt = new Intl.Locale('Pt', {
         region: 'PT', hourCycle: 'h24', calendar: 'gregory'
    });
    let day = date.getDay();
    let month = date.toLocaleDateString(locate_pt, { month: "long" });
    let year = date.getFullYear();
 
    return `${day} - ${month} - ${year}`;
}

let clockTimeout = setInterval(() => {
    clockArea.innerHTML = clock(new Date());
    dateArea.innerHTML = date(new Date());
    
}, 1000);