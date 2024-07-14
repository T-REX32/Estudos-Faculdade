const http = require("http")
const fs = require("fs")

const port = 7297

const server = http.createServer((req, res) => {
    
    console.log('1log')
    const urlInfo = require('url').parse(req.url, true)
    const name = urlInfo.query.name

    console.log(name)

    console.log('2log')
    if(!name) {
            console.log('3log')
            fs.readFile("index.html", function(err, data){
            res.writeHead(200, {"Content-Type": "text/html"})
            res.write(data)
            return res.end()
        })
    } else {
        console.log('4log')
            
        fs.writeFile("arquivo.txt", name, function(err, data) {

            console.log('5log')

            res.writeHead(302, {
                Location: "/"
            })

            return res.end()
        })
    }
})

server.listen(port, () => {
    console.log(`Servidor rodando na porta ${port}`)
})