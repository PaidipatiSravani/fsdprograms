import React from 'react'

function TwentyFive() {
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

            <div className='twentyfive'>
                <div className="collapse" id="collapseExampl">

                    <div className="card" >
                        <div className="card-body" >
                            <h5 className="card-title">How would you like to add money?</h5><br />
                            <ul className="list-group list-group-flush">
                                <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample" style={{ color: "#2766a8" }}>
                                    <i className="fa fa-plus" style={{ border: "1px solid black", borderRadius: "90px" }}></i>

                                    Add debit or credit cards
                                </li><br />

                                <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample" role="button" aria-expanded="false" aria-controls="collapseExample">
                                    <i className="fa fa-bank" id='bankimage'></i> Transfer to your payvoo account</li>
                                <li className="list-group-item" >
                                    <div className="twentyfivecard">
                                        <div className="card"  >
                                            <div className="card-body" >
                                                <div style={{ textAlign: "left" }}>
                                                    <h6>Card number<br /><br />**** **** **** 6942</h6>
                                                    <h5>
                                                        Trailer bank Ltd</h5></div>
                                                <img src='mastercard1.png' id="cardimage1"></img>
                                            </div>
                                        </div>
                                    </div></li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default TwentyFive
