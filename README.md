<!DOCTYPE html>
<html lang="en">
<head>
   <meta charset="UTF-8">
   <title>Famous Quotes Generator</title>
   <style>
       body {
           font-family: Arial, sans-serif;
           max-width: 800px;
           margin: 0 auto;
           padding: 20px;
           line-height: 1.6;
       }
       .container {
           background-color: #f5f5f5;
           padding: 20px;
           border-radius: 8px;
       }
       .code-block {
           background-color: #f0f0f0;
           padding: 15px;
           border-radius: 5px;
           overflow-x: auto;
       }
       .emoji {
           font-size: 1.5em;
       }
   </style>
</head>
<body>
   <div class="container">
       <h1><span class="emoji">📜</span> Famous Quotes Generator</h1>
       
       <p>A simple Java application that serves up inspiration like a fortune cookie! This program randomly displays motivational quotes based on user input.</p>

       <div class="image-placeholder">
           [Program Screenshot Placeholder]
       </div>

       <h2><span class="emoji">🎯</span> What Does It Do?</h2>
       <p>Think of this program as a digital fortune cookie machine. Instead of cracking open a cookie, you pick a number, and out pops a piece of wisdom!</p>

       <h2><span class="emoji">🛠️</span> How It Works</h2>
       <ol>
           <li>Enter a number (1-10)</li>
           <li>Get your quote</li>
           <li>Choose whether to get another one</li>
       </ol>

       <h2><span class="emoji">📝</span> Code Breakdown</h2>
       <h3>The Ingredients (Components)</h3>
       <div class="code-block">
           <pre>
import java.util.Scanner;  // Our tool to read user input
String[] conciseQuotes    // Our box of fortune cookies
Scanner in                // Our order-taker
           </pre>
       </div>

       <h2><span class="emoji">🔄</span> The Process</h2>
       <div class="image-placeholder">
           [Flowchart Image Placeholder]
       </div>
       <ul>
           <li><strong>The Menu (Quote Array)</strong>
               <ul>
                   <li>10 short, inspiring quotes</li>
                   <li>Each one ready to be served</li>
               </ul>
           </li>
           <li><strong>The Order Loop (while loop)</strong>
               <ul>
                   <li>Keeps serving quotes until you're satisfied</li>
                   <li>Like a restaurant that stays open until you say you're done</li>
               </ul>
           </li>
       </ul>

       <h2><span class="emoji">🎮</span> How to Use</h2>
       <div class="image-placeholder">
           [Usage Screenshots Placeholder]
       </div>
       <ol>
           <li>Run the program</li>
           <li>Enter a number 1-10</li>
           <li>Read your quote</li>
           <li>Type 'yes' to continue or 'no' to exit</li>
       </ol>

       <h2><span class="emoji">⚠️</span> Error Messages</h2>
       <ul>
           <li><strong>Error 101</strong>: Oops! Something went wrong (like ordering item #11 from a 10-item menu)</li>
       </ul>

       <h2><span class="emoji">🔧</span> Future Improvements</h2>
       <ul>
           <li>Add more quotes</li>
           <li>Add categories</li>
           <li>Include author names</li>
           <li>Add colorful formatting</li>
       </ul>

       <h2><span class="emoji">📸</span> Screenshots</h2>
       <div class="image-placeholder">
           [Screenshots Coming Soon]
       </div>

       <h2><span class="emoji">🤝</span> Contributing</h2>
       <p>Feel free to add your favorite quotes to the collection!</p>

       <hr>
       <footer>
           <p>Made with <span class="emoji">☕</span> and Java</p>
       </footer>
   </div>
</body>
</html>
