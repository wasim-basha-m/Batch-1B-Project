import React, { useState, useEffect } from "react";

import { Card, Table } from "react-bootstrap";

import { useDispatch, useSelector } from "react-redux";
import { FetchTransList } from "../../actions/adminActions/adminActions";
import "./listTransaction.css";

const ListTransaction = (props) => {
  const dispatch = useDispatch();

  const adminTransactionList = useSelector(
    (store) => store.adminTransactionList
  );
  const { error, response, loading } = adminTransactionList;

  useEffect(() => {
    dispatch(FetchTransList());
  }, []);

  useEffect(() => {}, [error, response, loading]);

  return (
    <Card className={"border border-dark bg-white text-dark"}>
      <Card.Header><h2>List Of All Transaction</h2></Card.Header>
      <Card.Body>
        <div>
          <Table >
            <thead className="text-white">
              <tr>
                <th>Id</th>
                <th>Date</th>
                <th>Time</th>
                <th>Description</th>
                <th>Type</th>
                <th>Amount</th>
                <th>Available Balance</th>
              </tr>
            </thead>
            <tbody>
              {response &&
                response.length > 0 &&
                response.map((list) => {
                  return (
                    <tr>
                      <td>{list.id}</td>
                      <td>{list.date}</td>
                      <td>{list.time}</td>
                      <td>{list.description}</td>
                      <td>{list.type}</td>
                      <td>{list.amount}</td>
                      <td>{list.availableBalance}</td>
                    </tr>
                  );
                })}
            </tbody>
          </Table>
        </div>
      </Card.Body>
    </Card>
  );
};

export default ListTransaction;
