# VendingMachine
The project Solving the vending machine Use case</br>

<strong>Note: Currency nickle, dime, quarter, cent is converted to some price</strong></br>  
     "nickle": 10 Rs</br>  
		 "dime": 20Rs</br>  
		 "quarter": 50RS</br>  
		 "cent", 100RS</br>  

Below is the List of the API</br>

<h4>1. To get the details of all the Available product</h4></br>

   Method: Get</br>
   Url: http://localhost:8080/vendor-machine/show-menu</br>
   Response: [</br>
    {</br>
        "productName": "Choclates",</br>
        "coinType": "nickle",</br>
        "productID": 101,</br>
        "quantity": 10</br>
    },</br>
    {</br>
        "productName": "Candy",</br></br>
        "coinType": "dime",</br>
        "productID": 102,</br>
        "quantity": 15</br>
    },</br>
    {</br>
        "productName": "Softy",</br>
        "coinType": "dime",</br>
        "productID": 103,</br>
        "quantity": 8</br>
    },</br>
    {</br>
        "productName": "Cold-drink",</br>
        "coinType": "quarter",</br>
        "productID": 104,</br>
        "quantity": 9</br>
    },</br>
    {</br>
        "productName": "Cold-drink and Chips",</br>
        "coinType": "cent",</br>
        "productID": 105,</br>
        "quantity": 10</br>
    }</br>
]</br>



<h4>2. To make a order in vending Machine</h4></br>

  Method: Post</br>
  Url: http://localhost:8080/vendor-machine/order-item</br>
  
  Request Body:</br>
  {</br>
    "productID": 104,</br>
    "coinType": "dime"</br>
  }</br>
  
  Response Body: <strong>If Order is placed Successfully and will also show remaning change if any otherwise will show 0</strong></br>
  {</br>
    "dispatchProduct": "Cold-drink",</br>
    "change": [</br>
        "quarter= 1 Coin"</br>
    ]</br>
}</br>

Response Body: <strong>If there is no change remaning</strong></br>
  {</br>
    "dispatchProduct": "Cold-drink",</br>
    "change": [</br>
        "0"</br>
    ]</br>
 }</br>
 
 Response Body: <strong>If amount is less then Product price </strong></br>
  {</br>
    Insufficient Amount!!</br>
}</br>
  
  
<h3> Unit test is written under test package to show menu and placed a order, Below is the link to see the unit test case output</h3> </br>

link: https://github.com/hiteshparwal84/VendingMachine/blob/master/VendingMachineTestCase.png  </br>

<h3> UMl class Diagrame Attached</h3></br>

link: 


   

  
  
