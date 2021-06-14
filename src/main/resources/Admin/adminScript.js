// Emplacement de la base URL
const baseApiUrl = 'http://localhost:8080';

// Récupérer la liste des ennemis déjà en DB
fetch(baseApiUrl + '/api/admin/enemy')
    .then(function (response) {
        response.json()
            .then(function (enemy) {

                    for (let i = 0; i < enemy.length; i++) {

                        // Création de la case ID Enemy
                        const td1 = document.createElement("td");
                        td1.textContent = enemy[i].id;
                        rowEnemy.appendChild(td1);

                        // Création de la case Name (en allant cherher l'id de l'enemy dans l'API)
                        const td2 = document.createElement("td");
                        fetch(baseApiUrl + '/api/admin/' + enemy[i].enemyIdx).then(function (response) {
                            response.json().then(function (enemy) {
                                td2.textContent = enemy.name;
                            });
                        });
                        rowEnemy.appendChild(td2);

                        // Création de la case Type
                        const td3 = document.createElement("td");
                        td3.textContent = enemy[i].description;
                        rowEnemy.appendChild(td3);

                        // On ajoute les lignes au tableau
                        document.getElementById("table-body").appendChild(rowEnemy);

                    }
                }
            )
    });