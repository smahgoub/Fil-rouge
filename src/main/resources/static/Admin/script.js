// Emplacement de la base URL
const baseApiUrl = 'http://localhost:8080';
<<<<<<< HEAD
// Evenement lorsqu'on clique sur le bouton Enemy
document.getElementById("Enemy button").addEventListener("click", function (event) {
    event.preventDefault();
=======

// Evenement lorsqu'on clique sur le bouton Enemy
document.getElementById("Enemy button").addEventListener("click", function (event) {
    event.preventDefault();

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
    // On récupère la dernière valeur depuis l'API
    fetch(baseApiUrl + '/api/admin/enemy').then(function (response) {
        response.json().then(function (result) {
            console.log(result);
<<<<<<< HEAD
=======

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // On fait une boucle pour supprimer le dernier tableau affiché
            const sectionResult = document.getElementById("Section 2");
            const elementNumber = sectionResult.childElementCount;
            for (let i = 0; i < elementNumber; i++) {
                sectionResult.removeChild(sectionResult.firstElementChild);
                console.log(i);
            }
<<<<<<< HEAD
            // Création du tableau contenant les valeurs de l'objet RESULT
=======

            // Création du tableau contenant les valeurs de l'objet RESULT

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // Création d'une table et d'un body
            let table = document.createElement("table");
            let tableHead = document.createElement("thead");
            let tableBody = document.createElement("tbody");
<<<<<<< HEAD
=======

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // Création de la ligne de titre
            const newRowHead = document.createElement("tr");
            const title1 = document.createElement("th");
            title1.textContent = "Nom";
            newRowHead.appendChild(title1);
<<<<<<< HEAD
            const title2 = document.createElement("th");
            title2.textContent = "Type";
            newRowHead.appendChild(title2);
=======

            const title2 = document.createElement("th");
            title2.textContent = "Type";
            newRowHead.appendChild(title2);

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // Création du bouton MODIFIER
            const title3 = document.createElement("td");
            const buttonModify = document.createElement("button");
            button.textContent = "Modifier";
            title3.appendChild(button);
            newRowHead.appendChild(title3);
<<<<<<< HEAD
=======

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // Création du bouton SUPPRIMER
            const title4 = document.createElement("td");
            const buttonDelete = document.createElement("button");
            button.textContent = "Supprimer";
            title4.appendChild(button);
            newRowHead.appendChild(title4);
<<<<<<< HEAD
            // Création des lignes de valeurs
            for (let i = 0; i < result.length; i++) {
=======

            // Création des lignes de valeurs
            for (let i = 0; i < result.length; i++) {

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
                // Case NAME
                const nameLine = document.createElement("tr");
                const td1 = document.createElement("td");
                td1.textContent = result[i].name;
                nameLine.appendChild(td1);
<<<<<<< HEAD
=======

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
                // Case TYPE
                const typeLine = document.createElement("tr");
                const td2 = document.createElement("td");
                td2.textContent = result[i].type;
                typeLine.appendChild(td2);
            }
<<<<<<< HEAD
=======

>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
            // Ajout des lignes dans le tableau
            tableHead.appendChild(newRowHead);
            table.appendChild(tableHead);
            table.appendChild(tableBody);
            document.getElementById("Section 2").appendChild(table);
        });
    }).catch(function (error) {
        console.log('Il y a eu un problème...' + error.message);
    })
<<<<<<< HEAD
})
=======
});
>>>>>>> 2b81a0a8479c7a5b831b132b2038968fa3fc89fc
