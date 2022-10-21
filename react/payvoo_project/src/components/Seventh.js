import React from 'react'

function Seventh() {
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
                            <li className="list-group-item"  >
                                <svg xmlns="http://www.w3.org/2000/svg" width="18" height="18" fill="currentColor" className="bi bi-plus" viewBox="0 0 16 16" style={{ border: "2px solid black", borderRadius: "100px" }}>
                                    <path d="M8 4a.5.5 0 0 1 .5.5v3h3a.5.5 0 0 1 0 1h-3v3a.5.5 0 0 1-1 0v-3h-3a.5.5 0 0 1 0-1h3v-3A.5.5 0 0 1 8 4z" />
                                </svg>
                                Add debit or credit cards
                            </li><br />

                            <li className="list-group-item" data-bs-toggle="collapse" href="#collapseExample1" role="button" aria-expanded="false" aria-controls="collapseExample" id="firstlist">
                                <i className="fa fa-bank" id='bankimage'></i> Transfer to your payvoo account</li>
                        </ul>
                    </div>
                </div>
            </div>
            <div className="collapse" id="collapseExample1">
                <div className='secondcard'>
                    <div className="card"  >
                        <div className="card-body" >
                            <div>
                                <h5 style={{ color: "black" }}>Accounts Details</h5>
                                <input type="button" value={"Local"}  />
                                <input type="button" value={"Swift"} data-bs-toggle="collapse" href="#collapseExample3" role="button" aria-expanded="false" aria-controls="collapseExample" />
                            </div>
                            <div className="collapse" id="collapseExample3">
                                <div className="card-body" >
                                    <div className='swift'>
                                        <ul>
                                            <li className="list-group-item">
                                                Beneficiary<br /><h6>John Doe</h6>IBAN<br /><h6>GWDF 6165 6542 6513 6515 9876</h6>BIC<br /><h6>PAYVOO65136</h6>
                                            </li>
                                            <li className="list-group-item">
                                                <i className='fas fa-coins'></i>  Intermediary or sender's bank may charge you for international payments<br /><br />
                                                <i class="fa fa-clock"></i>   Transfers usually take 1 to 3 working days to appear on your PayVoo account<br /><br />
                                                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-flag" viewBox="0 0 16 16">
                                                    <path d="M14.778.085A.5.5 0 0 1 15 .5V8a.5.5 0 0 1-.314.464L14.5 8l.186.464-.003.001-.006.003-.023.009a12.435 12.435 0 0 1-.397.15c-.264.095-.631.223-1.047.35-.816.252-1.879.523-2.71.523-.847 0-1.548-.28-2.158-.525l-.028-.01C7.68 8.71 7.14 8.5 6.5 8.5c-.7 0-1.638.23-2.437.477A19.626 19.626 0 0 0 3 9.342V15.5a.5.5 0 0 1-1 0V.5a.5.5 0 0 1 1 0v.282c.226-.079.496-.17.79-.26C4.606.272 5.67 0 6.5 0c.84 0 1.524.277 2.121.519l.043.018C9.286.788 9.828 1 10.5 1c.7 0 1.638-.23 2.437-.477a19.587 19.587 0 0 0 1.349-.476l.019-.007.004-.002h.001M14 1.221c-.22.078-.48.167-.766.255-.81.252-1.872.523-2.734.523-.886 0-1.592-.286-2.203-.534l-.008-.003C7.662 1.21 7.139 1 6.5 1c-.669 0-1.606.229-2.415.478A21.294 21.294 0 0 0 3 1.845v6.433c.22-.078.48-.167.766-.255C4.576 7.77 5.638 7.5 6.5 7.5c.847 0 1.548.28 2.158.525l.028.01C9.32 8.29 9.86 8.5 10.5 8.5c.668 0 1.606-.229 2.415-.478A21.317 21.317 0 0 0 14 7.655V1.222z" />
                                                </svg> Only SWIFT transfers are accepted<br />
                                                <br />
                                                <button type="submit">close</button>
                                            </li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                            
                        </div>
                    </div>
                </div>
            </div>
        </div>
    )
}

export default Seventh
