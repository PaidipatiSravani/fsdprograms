import React from 'react'

function NavBar() {
  return (
    <div>
      <nav classnameName="navbar bg-light">
  <div classnameName="container-fluid">
    <a classname="navbar-brand">Navbar</a>
    <form classname="d-flex" role="search">
      <input classname="form-control me-2" type="search" placeholder="Search" aria-label="Search"/>
      <button classname="btn btn-outline-success" type="submit">Search</button>
    </form>
  </div>
</nav>



</div>
   
  )
}

export default NavBar
