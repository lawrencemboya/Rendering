import Api from "./Api";

const app = document.querySelector("#app")

const divElement = document.createElement("div")
Api().getRequest("http://localhost:8080/api/students", (studentCollection) => {
    let name
    studentCollection.forEach((student) => {
        name = student.name
        const pElement = document.createElement("p")
        pElement.textContent = name
        app.append(pElement)
    })
})
