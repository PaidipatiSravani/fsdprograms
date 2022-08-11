import React from 'react'

function Contactpage() {
  return (
    <div>
      <img src='image1.png' alt='image here' width={"100%"} height={"300px"}/>
      <div class="row row-cols-1 row-cols-md-2 g-4">
      <div class="card-body">
      <h1 id="contact"><b>Contact</b></h1>
      <h1 id="heading"><b>Contact Us</b></h1>
    <div className='contain'>
     <input class="form-control" type={"text"} placeholder={"your name"}/><br/>
     <input class="form-control" type={"text"} placeholder={"your email"}/><br/>
        <textarea class="form-control" placeholder="FeedBack" rows={'4'} cols={'10'}></textarea><br/>
        <button type="button" class="btn btn-danger">Send feedback</button>
    </div>
    </div>
    </div>
  </div>
  )
}

export default Contactpage
