import ReactDOM from 'react-dom';
import React from 'react';
import axios from 'axios';
import Header from './Header';
import ContestPreview from './ContestPreview';  
//(instead of calling data directly we are gonna use API for data)import data from '../testData';


//converting the stateless app compoent into class based componet because the header component is dynamic
// using the constructor for defining the state
class App extends React.Component{
        state = { 
            pageHeader : 'Naming contest',
            contest: this.props.initalContests
        };

componentDidMount() {
    //timers , listeners
    axios.get('/api/contests')
    .then(resp => {
        this.setState({
            contest: resp.data.contests
        });
    })
    .catch(console.error);

}
componentWillUnmount() {
    //clean timers and listerners
}
    render(){
         return (
            <div className = "App">
                <Header message = {this.state.pageHeader} />
                <div>
                    {this.state.contest.map(contest =>
             <ContestPreview key={contest.id} {...contest} />
         )}
                    
                </div>
             </div>
        );
    }
    
}

export default App;