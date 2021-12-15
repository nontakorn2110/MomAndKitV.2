var express = require('express');
var mysql = require('mysql');
var bodyparser = require('body-parser');

var con = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: '',
    database: 'momandkit'
});

var app = express();
app.use(bodyparser.json());
app.use(bodyparser.urlencoded({ extended: true }));


app.post('/register', function (req, res) {
    var username = req.body.userName;
    var password = req.body.password;
    var email = req.body.email;
    var enterPass = req.body.enterPass;

    sql = "insert into register(email,userName,password,enterPass)"
    sql += "values('" + email + "','" + username + "','" + password + "','" + enterPass + "')"
    con.query(sql, function (err, result) {
        if (err) throw err;
        res.send(result)
    });

});

app.get('/login', function (req, res) {
    var email = req.body.email;
    var password = req.body.password;
    sql = `select * from register `;
    sql += `where email ="${email}" and password ="${password}"`;
    con.query(sql, function (err, result, fields) {
        if (err) throw err;
        res.send(JSON.stringify(result));
    });

});

app.listen(3000, () =>
    console.log('On port 3000'));