import React, { useEffect, useState } from "react";

const StudentList = () => {
  // const [students, setStudents] = useState([
  //   {id: 1, name: "vishal", school: "APS", marks: 5},
  //   {id: 2, name: "ajay", school: "APS", marks: 5},
  //   {id: 3, name: "Vipul", school: "APS", marks: 5}
  // ]);
  const [students, setStudents] = useState([]);

  useEffect(() => {
    fetch("http://localhost:8080/api/students")
    .then((res) => res.json())
    .then(data => setStudents(data))
     .catch((error) => console.error("Error fetching students:", error));
  }, [])

  return (
    <div>
      <h2>Registered Students</h2>
      <table>
        <thead>
          <tr>
            <th>ID</th>
            <th>NAME</th>
            <th>MARKS</th>
            <th>SCHOOL</th>
          </tr>
        </thead>
        <tbody>
          {students.map((value, index) => (
            <tr key={index}>
              <td>{value.id}</td>
              <td>{value.name}</td>
              <td>{value.marks}</td>
              <td>{value.school}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
};

export default StudentList;
