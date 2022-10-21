import React from 'react'



function Second() {
  return (
    <div>

      <nav className="navbar bg-white" id='navbar'>
        <div className="container-fluid">
          <img src="payvoo_logo.png" width="130" height="35" style={{ margin: "17px 28px 16px 33px" }} />

          <i className="fa-duotone fa-bell"></i>

        </div>
      </nav>

      <div className="sidebar">
        <a></a>
        
        <a className="active" data-bs-toggle="collapse" href="#collapseExampl" role="button" aria-expanded="false" aria-controls="collapseExample">
          Accounts
        </a>

        <a href="#news">Analytics</a>
        <a href="#contact">Payments</a>
        <a href="#about">Cards</a>
        <a href="#about">Settings</a>
      </div>
      <h2 style={{ margin: "25px 870px -21px 6px" }}>Add money<br /></h2>

      <b><svg xmlns="http://www.w3.org/2000/svg" width="1091px" height="63px" fill="currentColor" classname="bi bi-arrow-left" viewBox="17 870 -21 6">
        <path fill-rule="evenodd" d="M15 8a.5.5 0 0 0-.5-.5H2.707l3.147-3.146a.5.5 0 1 0-.708-.708l-4 4a.5.5 0 0 0 0 .708l4 4a.5.5 0 0 0 .708-.708L2.707 8.5H14.5A.5.5 0 0 0 15 8z" />
      </svg></b>


      <div className="collapse" id="collapseExampl">

        <div className="card" style={{ margin: "0px 915px -17px 260px" }} id="card1">
          <div className="card-body" style={{ margin: "10px 10px 353px -8px" }}>
            <h5 className="card-title">How would you like to add money?</h5><br />
            <ul className="list-group list-group-flush">
              <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample" id="firstlist">
                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" className="bi bi-plus" viewBox="0 0 16 16" style={{border:"2px solid black",borderRadius:"100px"}}>
                  <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                </svg>
                Add debit or credit cards
              </li><br />

              <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                <img src="banklogo2.png" id="bankImage" /> Transfer to your payvoo account</li>
            </ul>
          </div>
        </div>
        <div className="collapse" id="collapseExample">
          <div className="card" style={{ margin: "-558px 441px -17px 716px" }} id="card2">
            <div className="card-body" style={{ margin: "30px 10px 206px 10px" }}>
              <div style={{ textAlign: "left" }}>
                <h5 > Enter card details</h5>
                <svg xmlns="http://www.w3.org/2000/svg" width="17" height="15" fill="currentColor" className="bi bi-lock" viewBox="0 0 16 16">
                  <path d="M8 1a2 2 0 0 1 2 2v4H6V3a2 2 0 0 1 2-2zm3 6V3a3 3 0 0 0-6 0v4a2 2 0 0 0-2 2v5a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2zM5 8h6a1 1 0 0 1 1 1v5a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V9a1 1 0 0 1 1-1z" />
                </svg>
                Card details are saved securely<br /><br />
              </div>

              <form>
                <div className="mb-3">
                  <input type="text" className="form-control" id="cardName" placeholder='Name on card' />
                </div>
                <div className="mb-3">
                  <input type="text" className="form-control" id="cardNumber" placeholder='12-19 digit number'/>
                </div>
               
                <div className="row g-0 text-center">
                  <div className="col-md-8" >
                    <input type="text" className="form-control  " id="expiryDate" placeholder='Expiry Date' />
                  </div>

                  <div className="col-md-4">
                    <input type="text" className="form-control ms-2" id="cvv" placeholder='CVV' /></div>
                </div>
                <br />

                <button type='submit' >cancel</button>
                <button type='submit' >Save card</button>

              </form>
            </div>
          </div>
        </div>
      </div>
    </div>



  )
}

export default Second
