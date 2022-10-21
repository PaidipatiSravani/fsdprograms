import React, { useState } from 'react'

function SubscribeDemo() {
    let[count,setCount]=useState(0);
    let[msg,setMsg]=useState("welcome to ReactJs.Please subscribe")
    let[button,setButton]=useState("subscribe") 
    function subscribe(){
        setCount(count+1)
    
          setMsg("Thanks for subscribing")
          setButton("Unsubscribe")
        //   if(count>0){setMsg("already sub");setCount(count=1);}
    if(count>0){
        setCount(count=0)
        setMsg("welcome to ReactJs.Please subscribe")
        setButton("Subscribe")
        const textarea = document. querySelector('textarea')
        textarea.hidden = false
         document.getElementById("button").hidden=false
        // button.hidden = false
    }
    }
    function submitFeedBack(){
        //const textarea1 = document. querySelector('textarea')
        // textarea1.hidden = true
        alert("thank you for giving your valuable feedback")
        window.location.reload(true)
    }
  return (
    <div>
        <p>{msg}</p>
        <p>{count}</p>
      <button className='btn btn-danger' onClick={subscribe}>{button}</button><br/><br/>
      <textarea id="textarea" placeholder='Feedback' rows={5} cols={20} hidden></textarea><br/><br/>
      <button id="button" className='btn btn-primary' onClick={submitFeedBack} hidden >submit</button>

    </div>
  )
}

export default SubscribeDemo
