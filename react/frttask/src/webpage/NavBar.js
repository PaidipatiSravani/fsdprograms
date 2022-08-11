import React, { Component } from 'react'
import About from './About';
import Contactpage from './Contactpage';
import Courses from './Courses';
import Teachers from './Teachers';
import { BrowserRouter , Routes, Route, Link } from "react-router-dom";
import Home from './Home';
 class NavBar extends Component {
  render() {
    return (
      <div>
         <h1 id="head"><span style={{color:"orange"}}>E</span>COURSES</h1>
        <BrowserRouter>
        <ul type="none">
        <li><Link to="/Home">HOME</Link></li>
        <li><Link to="/About">ABOUT</Link></li>
        <li><Link to="/Courses">COURSES</Link></li>
        <li><Link to="/Teachers">TEACHERS</Link></li>
        <li><Link to="/Contactpage">CONTACT</Link> </li>
       </ul>
            <Routes>
                <Route path='/Home' element={<Home/>}/>
                <Route path='/About' element={<About/>}/>
                <Route path='/Courses' element={<Courses/>}/>
                <Route path='/Teachers' element={<Teachers/>}/>
                <Route path='/Contactpage' element={<Contactpage/>}/>
            </Routes> 
       </BrowserRouter>
       </div>
      
    )
  }
}

export default NavBar
