let sql = 'insert into cursos set ?'
let dados = {nome:'Infor', tipo: 'exatas'}
connection.query(sql,dados, function(errosr,results,fields){
    if(error) throw error
    connsole.log("Curso salvo no BD", results.insertID)
})
connection.end()