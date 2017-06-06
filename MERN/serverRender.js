// fetch the data from the api

import config from './config';
import axios from 'axios';

axios.get(`${config.serverUrl}/api/contests`)
  .then(resp => {
    console.log(resp.data);
  })
.catch(error => {
console.error("error");
});


////import react from 'react';
////import ReactDOMServer from 'react-dom/server';
////import App from './src/components/App';
//// fetch the data from api
//import axios from 'axios';
//import config from './config';
//
////const serverRender = () =>
//
//    axios.get('${config.serverUrl}/api/contests')
//        .then(resp => {
//        //this will read the react code and convert everything into string
////        return ReactDOMServer.rendertoString(
////            <App initalContests={resp.data.contests} />
////        );
//            console.log(resp.data);
//    })
//.catch(error => {
//console.error("error");
//});
//
////export default serverRender;