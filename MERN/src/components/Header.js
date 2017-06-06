import React from 'react';
//Header component

const Header = ( {message} ) => {
    return (
    <h2 className = "Header text-center">
        {message}
    </h2>
    );
};

//to valdiate hte type of props, by using propTypes which is just an object
Header.propTypes = {
    message: React.PropTypes.string
};

export default Header;