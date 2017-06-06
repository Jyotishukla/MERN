// React

import React from 'react';
// import reactDom because we are working with browsers
import ReactDOM from 'react-dom';
import App from "./components/App"
import data from './testData';


//App.defaultProps = {
//    headerMessage: 'Hello!'
//}; 

ReactDOM.render(
//we will render the react element
 // React.createElement('h2', null, 'Hello jyoi'),
    
    //we render react argument as an object in atree and it compares the new and th old tree
    // html codes is worked because we use babel to compile the code
   <App initalContests={[]} />,
    document.getElementById('root')
);