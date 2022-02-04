import React, { useState, useEffect } from "react";
import "../BILLER/Registry.css";
import Container from "@mui/material/Container";
import { Navbar, Nav } from "react-bootstrap";
import ReactHTMLTableToExcel from "react-html-table-to-excel";

const BillerStatement = () => {
  const [biller_statement, setBiller_statement] = useState([]);

  const handleClick = (e) => {
    e.preventDefault();
  };

  useEffect(() => {
    const customer = { biller_statement };
    fetch("http://localhost:8080/ebanking/registry/statement/", {
      method: "GET",
      headers: { "Content-Type": "application/json" },
    })
      .then((response) => response.json())
      .then((body) => {
        setBiller_statement(body);
      });
  }, []);

  return (
    <div className="biller-registry-body">
      <div className="statement-head">
        <Navbar bg="dark" variant="dark">
          <Container>
            <Navbar.Brand href="#">BILLER STATEMENT</Navbar.Brand>
          </Container>
        </Navbar>
      </div>
      <Container className="registry">
        <div className="registry-statement">
          <div>
            <h1 className="text-center"> Biller Statement</h1>
            <table id="statement" className="table table-bordered table-dark">
              <thead className="thead-dark">
                <tr>
                  <td>Id</td>
                  <td> Account No</td>
                  <td> Amount</td>
                  <td> Type</td>
                  <td> Transaction Id</td>
                  <td> Time Stamp</td>
                  <td> Select</td>
                </tr>
              </thead>

              <tbody>
                {biller_statement.length > 0 ? (
                  biller_statement.map((lst) => (
                    <>
                      <tr key={lst.id}>
                        <td>{lst.id}</td>
                        <td> {lst.accNumber}</td>
                        <td> {lst.amount}</td>
                        <td> {lst.type}</td>
                        <td> {lst.transIdFk}</td>
                        <td> {lst.timeStamp}</td>
                        <td>
                          <input type="checkbox" />
                        </td>
                      </tr>
                    </>
                  ))
                ) : (
                  <></>
                )}
              </tbody>
            </table>
          </div>
          <div>
            <ReactHTMLTableToExcel
              className="btn btn-info"
              table="statement"
              filename="ReportExcel"
              sheet="Sheet"
              buttonText="Export excel"
            />
          </div>
          <div></div>
        </div>
      </Container>
    </div>
  );
};
export default BillerStatement;
