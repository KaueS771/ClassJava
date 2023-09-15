let sql = 'delete from cursos where id = ?'
let id = 2 
connection.query(sql, id, function(erro,results,fiels){
    if(error) throw error
    console.log("Apagado com sucesso!")
})
connection.end()