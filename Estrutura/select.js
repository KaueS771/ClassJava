const connection = require('./conect')

let sql = "select * from cursos where id = ?"
let id = 3

connection.query(sql,id, function(error,results,fields){
    if(erro) throw error
    if(results == 0){
        console.log("Nenhum curso encontrado")
        return
    }
    let curso = results[0]
    console.log(curso.id = ":" + curso.nome + ":" + cursot.tipo)
})
connection.end()