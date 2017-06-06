//EJS: Embedded javascript: template language engine to server render our javascript frontend components
//EXPRESS

import config from './config';
import apiRouter from './api';
import sassMiddleware from 'node-sass-middleware';
import path from 'path';

//import http from 'http';
//import fs from 'fs';
//https.get('https://www.lynda.com', res =>{
//    console.log('Response status code :' , res.statusCode);
//    res.on('data' , chunk => {
//        console.log(chunk.toString());
//    });
//});
import express from 'express';
const server = express();

server.use(sassMiddleware({
    src: path.join(__dirname, 'sass'),
    dest: path.join(__dirname, 'public')
}));

server.set('view engine', 'ejs');

//server.listen(config.port, () =>);
//import serverRender from './serverRender';
import './serverRender';

server.get('/', (req,res) => {
     res.render('index', {
        content: '....'
    });
//    serverRender()
//    .then(content => {
//       
//    })
//    .catch(console.error);
//    
    
});

//with this line we can set view engine as EJS

 
server.use('/api', apiRouter);
server.use(express.static('public'));


server.listen(config.port, config.host, () => {
    console.info('Express listening on port', config.port);
});


// Http modules

//import http from 'http';
//

//const server = http.createServer((req,res) => {
//   res.write('Hello HTTP!\n'); 
//    setTimeout(() => {
//        res.write('I can stream!\n');
//        res.end();
//    }, 3000);
//});
//server.listen(8088);



//server.on('request',)


//Node Modules
//import config, {nodeEnv, logStars} from './config';
//
////console.log(config,nodeEnv);
//
//logStars('Jyoti function');