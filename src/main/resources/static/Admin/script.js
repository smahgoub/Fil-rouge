// Emplacement de la base URL
const baseApiUrl = 'http://localhost:8080/api';
// Evenement lorsqu'on clique sur le bouton Enemy
document.getElementById("Enemy button").addEventListener("click", function (event) {
    event.preventDefault();
    console.log("test");
    // On récupère la dernière valeur depuis l'API
    fetch(baseApiUrl + '/admin/enemy').then(function (response) {
        response.json().then(function (enemy) {
            console.log(enemy);
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
            const title3 = document.createElement("th");
            title3.textContent = "Modification";
            newRowHead.appendChild(title3);
            const title4 = document.createElement("th");
            title4.textContent = "Suppression";
            newRowHead.appendChild(title4);
            //const newRowBody = document.createElement("tr");

            // Création des lignes de valeurs
            for (let i = 0; i < enemy.length; i++) {
                const newRowBody = document.createElement("tr");
                // Case NAME
                const nameBox = document.createElement("td");
                nameBox.textContent = enemy[i].name;
                newRowBody.appendChild(nameBox);
                // Case TYPE
                const typeBox = document.createElement("td");
                typeBox.textContent = enemy[i].type;
                newRowBody.appendChild(typeBox);
                // Création du bouton MODIFIER
                const modifBox = document.createElement("td");
                const modifButton = document.createElement("button");
                modifButton.textContent = "Modifier";
                modifBox.appendChild(modifButton);
                newRowBody.appendChild(modifBox);
                // Création du bouton SUPPRIMER
                const deleteBox = document.createElement("td");
                const deleteButton = document.createElement("button");
                deleteButton.textContent = "Supprimer";
                deleteBox.appendChild(deleteButton);
                newRowBody.appendChild(deleteBox);
                tableBody.appendChild(newRowBody);
            }
            // Ajout des lignes dans le tableau
            tableHead.appendChild(newRowHead);
            //tableBody.appendChild(newRowBody);
            table.appendChild(tableHead);
            table.appendChild(tableBody);
            document.getElementById("Section 2").appendChild(table);
        });
    }).catch(function (error) {
        console.log('Il y a eu un problème...' + error.message);
    })


    // Evenement lorsqu'on clique sur le bouton Defense Equipment
    document.getElementById("DefenseEquipment button").addEventListener("click", function (event) {
        event.preventDefault();
        console.log("test");
        // On récupère la dernière valeur depuis l'API
        fetch(baseApiUrl + '/admin/defenseequipment').then(function (response) {
            response.json().then(function (defenseequipment) {
                console.log(defenseequipment);
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
                title2.textContent = "Points";
                newRowHead.appendChild(title2);
                const title3 = document.createElement("th");
                title3.textContent = "Modification";
                newRowHead.appendChild(title3);
                const title4 = document.createElement("th");
                title4.textContent = "Suppression";
                newRowHead.appendChild(title4);
                //const newRowBody = document.createElement("tr");

                // Création des lignes de valeurs
                for (let i = 0; i < defenseequipment.length; i++) {
                    const newRowBody = document.createElement("tr");
                    // Case NAME
                    const nameBox = document.createElement("td");
                    nameBox.textContent = defenseequipment[i].name;
                    newRowBody.appendChild(nameBox);
                    // Case POINTS
                    const typeBox = document.createElement("td");
                    typeBox.textContent = defenseequipment[i].points;
                    newRowBody.appendChild(typeBox);
                    // Création du bouton MODIFIER
                    const modifBox = document.createElement("td");
                    const modifButton = document.createElement("button");
                    modifButton.textContent = "Modifier";
                    modifBox.appendChild(modifButton);
                    newRowBody.appendChild(modifBox);
                    // Création du bouton SUPPRIMER
                    const deleteBox = document.createElement("td");
                    const deleteButton = document.createElement("button");
                    deleteButton.textContent = "Supprimer";
                    deleteBox.appendChild(deleteButton);
                    newRowBody.appendChild(deleteBox);
                    tableBody.appendChild(newRowBody);
                }
                // Ajout des lignes dans le tableau
                tableHead.appendChild(newRowHead);
                //tableBody.appendChild(newRowBody);
                table.appendChild(tableHead);
                table.appendChild(tableBody);
                document.getElementById("Section 2").appendChild(table);
            });
        }).catch(function (error) {
            console.log('Il y a eu un problème...' + error.message);
        })
    });

    // Evenement lorsqu'on clique sur le bouton Weapon
    document.getElementById("Weapon button").addEventListener("click", function (event) {
        event.preventDefault();
        console.log("test");
        // On récupère la dernière valeur depuis l'API
        fetch(baseApiUrl + '/admin/weapon').then(function (response) {
            response.json().then(function (weapon) {
                console.log(weapon);

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
                title2.textContent = "Points";
                newRowHead.appendChild(title2);
                const title3 = document.createElement("th");
                title3.textContent = "Modification";
                newRowHead.appendChild(title3);
                const title4 = document.createElement("th");
                title4.textContent = "Suppression";
                newRowHead.appendChild(title4);
                //const newRowBody = document.createElement("tr");

                // Création des lignes de valeurs
                for (let i = 0; i < weapon.length; i++) {
                    const newRowBody = document.createElement("tr");
                    // Case NAME
                    const nameBox = document.createElement("td");
                    nameBox.textContent = weapon[i].name;
                    newRowBody.appendChild(nameBox);
                    // Case POINTS
                    const typeBox = document.createElement("td");
                    typeBox.textContent = weapon[i].points;
                    newRowBody.appendChild(typeBox);
                    // Création du bouton MODIFIER
                    const modifBox = document.createElement("td");
                    const modifButton = document.createElement("button");
                    modifButton.textContent = "Modifier";
                    modifBox.appendChild(modifButton);
                    newRowBody.appendChild(modifBox);
                    // Création du bouton SUPPRIMER
                    const deleteBox = document.createElement("td");
                    const deleteButton = document.createElement("button");
                    deleteButton.textContent = "Supprimer";
                    deleteBox.appendChild(deleteButton);
                    newRowBody.appendChild(deleteBox);
                    tableBody.appendChild(newRowBody);
                }
                // Ajout des lignes dans le tableau
                tableHead.appendChild(newRowHead);
                //tableBody.appendChild(newRowBody);
                table.appendChild(tableHead);
                table.appendChild(tableBody);
                document.getElementById("Section 2").appendChild(table);
            });
        }).catch(function (error) {
            console.log('Il y a eu un problème...' + error.message);
        })
    });


});