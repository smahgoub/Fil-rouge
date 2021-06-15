// Emplacement de la base URL
const baseApiUrl = 'http://localhost:8080';
// Evenement lorsqu'on clique sur le bouton Enemy
document.getElementById("Enemy button").addEventListener("click", function (event) {
    event.preventDefault();
    // On récupère la dernière valeur depuis l'API
    fetch(baseApiUrl + '/api/admin/enemy').then(function (response) {
        response.json().then(function (result) {
            console.log(result);
            // On fait une boucle pour supprimer le dernier tableau affiché
            const sectionResult = document.getElementById("Section 2");
            const elementNumber = sectionResult.childElementCount;
            for (let i = 0; i < elementNumber; i++) {
                sectionResult.removeChild(sectionResult.firstElementChild);
                console.log(i);
            }
            // Création du tableau contenant les valeurs de l'objet RESULT
            // Création d'une table et d'un body
            let table = document.createElement("table");
            let tableHead = document.createElement("thead");
            let tableBody = document.createElement("tbody");
            // Création de la ligne de titre
            const newRowHead = document.createElement("tr");
            const title1 = document.createElement("th");
            title1.textContent = "Nom";
            newRowHead.appendChild(title1);
            const title2 = document.createElement("th");
            title2.textContent = "Type";
            newRowHead.appendChild(title2);
            // Création du bouton MODIFIER
            const title3 = document.createElement("td");
            const buttonModify = document.createElement("button");
            button.textContent = "Modifier";
            title3.appendChild(button);
            newRowHead.appendChild(title3);
            // Création du bouton SUPPRIMER
            const title4 = document.createElement("td");
            const buttonDelete = document.createElement("button");
            button.textContent = "Supprimer";
            title4.appendChild(button);
            newRowHead.appendChild(title4);
            // Création des lignes de valeurs
            for (let i = 0; i < result.length; i++) {
                // Case NAME
                const nameLine = document.createElement("tr");
                const td1 = document.createElement("td");
                td1.textContent = result[i].name;
                nameLine.appendChild(td1);
                // Case TYPE
                const typeLine = document.createElement("tr");
                const td2 = document.createElement("td");
                td2.textContent = result[i].type;
                typeLine.appendChild(td2);
            }
            // Ajout des lignes dans le tableau
            tableHead.appendChild(newRowHead);
            table.appendChild(tableHead);
            table.appendChild(tableBody);
            document.getElementById("Section 2").appendChild(table);
        });
    }).catch(function (error) {
        console.log('Il y a eu un problème...' + error.message);
    })
});

