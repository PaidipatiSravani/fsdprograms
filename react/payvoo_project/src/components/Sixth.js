import React from 'react'

function Sixth() {
  return (
    <div>
      <nav className="navbar bg-white" id='navbar'>
        <div className="container-fluid">
          <img src="payvoo_logo.png" width="120" height="30" style={{ margin: "7px 29px 7px 27px" }} />

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

        <div className="card" style={{ margin: "0px 915px -17px 260px" }} id="card1" >
          <div className="card-body" style={{ margin: "10px 10px 12px -8px" }}>
            <h5 className="card-title">How would you like to add money?</h5><br />
            <ul className="list-group list-group-flush" type="none">
              <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample" id="firstlist">
                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" className="bi bi-plus" viewBox="0 0 16 16" style={{ border: "2px solid black", borderRadius: "100px" }}>
                  <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                </svg>
                Add debit or credit cards
              </li><br />

              <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                <i className="fa fa-bank" id='bankimage'></i> Transfer to your payvoo account</li><br />
              <li>
                <div className="card" style={{ margin: "10px 4px 10px 17px", backgroundColor: "#2766A8", color: "white" }}>
                  <div className="card-body" style={{ margin: "-8px 0px -42px 7px" }}>
                    <div style={{ textAlign: "left" }}>
                      <h6>Card number<br /><br />**** **** **** 1234</h6>
                      <h5>
                        Espresso bank Ltd</h5></div>
                    <img src='mastercard1.png' id="cardimage1"></img>
                  </div>
                </div>
              </li>
              <li>
                <div className="card" style={{ margin: "10px 4px 10px 17px" }} >
                  <div className="card-body" style={{ margin: "-8px 0px -42px 7px" }}>
                    <div style={{ textAlign: "left" }}>
                      <h6>Card number<br /><br />**** **** **** 1234</h6>
                      <h5>
                        Espresso bank Ltd</h5></div>
                    <img src='mastercard1.png' id="cardimage1"></img>
                  </div>
                </div>

              </li>
              <li>
                <div className="card" style={{ margin: "10px 3px 10px 17px" }}>
                  <div className="card-body" style={{ margin: "-8px 0px -42px 7px" }}>
                    <div style={{ textAlign: "left" }}>
                      <h6>Card number<br /><br />**** **** **** 1234</h6>
                      <h5>
                        Espresso bank Ltd</h5></div>
                    <img src='mastercard1.png' id="cardimage1"></img>
                  </div>
                </div>
              </li>
            </ul>
          </div>
        </div>


        <div className="card" style={{ margin: "-617px 449px -17px 703px" }} id="card2">
          <div className="card-body" style={{ margin: "30px 10px 220px 10px" }}>
            <div style={{ textAlign: "left" }}>
              <h5 > Choose currency and amount</h5>
              <br /><br />
            </div>

            <form>
              <select className="form-select" aria-label="Default select example">
                <option selected>Choose currency</option>
              </select><br />
              <ul className="list-group list-group-flush" type="none">
                <div className="mb-3">
                  <input type="text" className="form-control" placeholder='Enter amount' />
                </div>
                <li className="list-group-item">
                  <p style={{ textAlign: "left", fontSize: "13px" }} > Note:Minimum pop-up is €10</p>
                </li>
                <li className="list-group-item" id="cardimage">
                  <i className="fa fa-bank" style={{ float: "left", fontSize: "19px" }}></i><div><b style={{ float: "left", fontSize: "13px" }}>Expresso Bank LTD</b><br />
                    <p style={{ margin: "-3px 10px 10px 21px", fontSize: "10px" }}> Mastercard *6854</p></div>
                </li>
                <li></li>
              </ul>
              <br />
            </form>
          </div>
        </div>
      </div>
      <div className="card" style={{ margin: "-617px 0px -17px 1175px" }} id="card2">
        <div className="card-body" style={{ margin: "30px 10px 266px 10px" }}>
          <div style={{ textAlign: "left" }}>
            <h5 > Enter card verification code</h5>
            <svg xmlns="http://www.w3.org/2000/svg" width="17" height="15" fill="currentColor" className="bi bi-lock" viewBox="0 0 16 16">
              <path d="M8 1a2 2 0 0 1 2 2v4H6V3a2 2 0 0 1 2-2zm3 6V3a3 3 0 0 0-6 0v4a2 2 0 0 0-2 2v5a2 2 0 0 0 2 2h6a2 2 0 0 0 2-2V9a2 2 0 0 0-2-2zM5 8h6a1 1 0 0 1 1 1v5a1 1 0 0 1-1 1H5a1 1 0 0 1-1-1V9a1 1 0 0 1 1-1z" />
            </svg>
            Card details are saved securely<br /><br />
          </div>

          <form>
            <div className="mb-3">
              <input type="text" className="form-control" id="cardName" placeholder='Sanjana' />
            </div>
            <div className="mb-3">
              <input type="text" className="form-control" id="cardNumber" placeholder='1231 3232 5656 6767' />
            </div>

            <div className="row g-0 text-center">
              <div className="col-md-8" >
                <input type="text" className="form-control  " id="expiryDate" placeholder='10/20' />
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

  )
}

export default Sixth

