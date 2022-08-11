import React ,{useState}from 'react'

function CountDemo() {
    let[count,setCount]=useState(0);
  return (
    <div>
        <p>{count}</p>
      <button className='btn btn-success'onClick={()=>setCount(count+1)}>increment</button>
      <button className='btn btn-danger' onClick={()=>setCount(count<=0?count=0:count-1)}>decrement</button>
    </div>
  )
}

export default CountDemo
