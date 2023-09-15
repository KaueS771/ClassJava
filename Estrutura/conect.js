const mysql = require(mysql);

const connection = mysql.createConnection({
    host : "locahost",
    use : "root",
    passoword : "",
    database : "activiweb",
})
connection.end()

module.exports = connection 