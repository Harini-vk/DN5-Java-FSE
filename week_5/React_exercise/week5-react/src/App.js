
// Exercise 1
// import FirstReact from "./01-myfirstreact/App";

// function App() {
//   return <FirstReact />;
// }

// export default App;


//EXERCISE 2
// import Home from "./02-StudentApp/Home";
// import About from "./02-StudentApp/About";
// import Contact from "./02-StudentApp/Contact";

// function App() {
//     return (
//         <div className="container">
//             <Home />
//             <About />
//             <Contact />
//         </div>
//     );
// }

// export default App;


// // EXERCISE 3
// import CalculateScore from "./03-scorecalculatorapp/CalculateScore";

// function App() {
//     return (
//         <div>
//             <CalculateScore
//                 Name="Steve"
//                 School="DNV Public School"
//                 total={284}
//                 goal={3}
//             />
//         </div>
//     );
// }

// export default App;


// EXERCISE 4
// import Posts from "./04-blogapp/Posts";

// function App() {
//     return (
//         <div>
//             <Posts />
//         </div>
//     );
// }

// export default App;


// // EXERCISE 9
// import ListOfPlayers from "./09-cricketapp/ListOfPlayers";
// import IndianPlayers from "./09-cricketapp/IndianPlayers";

// function App() {

//     const flag = true;

//     if (flag) {
//         return <ListOfPlayers />;
//     } else {
//         return <IndianPlayers />;
//     }
// }

// export default App;


// EXERCISE 10
// import OfficeSpace from "./10-officespacerentalapp/OfficeSpace";

// function App() {
//     return <OfficeSpace />;
// }

// export default App;

// EXERCIESE 11
// import Counter from "./11-eventexamplesapp/Counter";
// import CurrencyConvertor from "./11-eventexamplesapp/CurrencyConvertor";

// function App() {
//     return (
//         <div>
//             <Counter />
//             <hr />
//             <CurrencyConvertor />
//         </div>
//     );
// }
// export default App;


// EXERCISE 12
// import Greeting from "./12-ticketbookingapp/Greeting";

// function App() {
//     return <Greeting />;
// }

// export default App;



// // EXERCISE 13
// import BookDetails from "./13-bloggerapp/BookDetails";
// import BlogDetails from "./13-bloggerapp/BlogDetails";
// import CourseDetails from "./13-bloggerapp/CourseDetails";

// function App() {

//     const showBooks = true;
//     const showBlogs = true;
//     const showCourses = true;

//     return (
//         <div>

//             {/* Conditional Rendering using && */}

//             {showBooks && <BookDetails />}

//             {/* Conditional Rendering using Ternary */}

//             {showBlogs ? <BlogDetails /> : <h2>No Blogs Available</h2>}

//             {/* Conditional Rendering using if */}

//             {(() => {
//                 if (showCourses) {
//                     return <CourseDetails />;
//                 } else {
//                     return <h2>No Courses Available</h2>;
//                 }
//             })()}

//         </div>
//     );
// }

// export default App;