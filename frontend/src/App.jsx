import React from "react";
import ReactDOM from "react-dom";

import "./index.scss";

const App = () => {
  fetch('/demo/all').then(res => res.json()).then(res => console.log(res));

  return (<div className="mt-10 text-3xl mx-auto max-w-6xl">
    <div>Name: frontend</div>
    <div>Framework: react</div>
    <div>Language: JavaScript</div>
    <div>CSS: Tailwind</div>
  </div>);
};
ReactDOM.render(<App />, document.getElementById("app"));
