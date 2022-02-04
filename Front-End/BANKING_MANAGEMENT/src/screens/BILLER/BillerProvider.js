import React, { useState } from "react";
// import ReactDOM from 'react-dom';
import "../BILLER/Registry.css";
import Button from "@material-ui/core/Button";
import Box from "@material-ui/core/Box";
import TextField from "@material-ui/core/TextField";
import MenuItem from "@material-ui/core/MenuItem";
import InputLabel from "@material-ui/core/InputLabel";
import Select from "@material-ui/core/Select";
import Container from "@material-ui/core/Container";
import FormControl from "@material-ui/core/FormControl";
import { Navbar, Nav } from "react-bootstrap";

function BillerProvider() {
  const [consumerNumberFk, setConsumerNumberFk] = useState("");
  const [accNumber, setAccNumber] = useState("");
  const [amount, setAmount] = useState("");
  const [provider] = useState("");

  const handleClick = (e) => {
    e.preventDefault();
    const customer = { consumerNumberFk, accNumber, amount };
    console.log(provider);
    fetch("http://localhost:8080/ebanking/registry/provider/", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(customer),
    }).then(() => {
      alert("go to payment page...");
    });
  };

  return (
    <div className="biller-registry-body">
      <Container className="registry">
        <Navbar bg="dark" variant="dark">
          <Container>
            <Navbar.Brand href="#">BILLER PROVIDER</Navbar.Brand>
          </Container>
        </Navbar>
        <div className="registry-field">
          <Box className="cons-number">
            <TextField
              required
              label="ConsumerNumber"
              defaultValue=""
              placeholder="mob or cons number"
              value={consumerNumberFk}
              onChange={(e) => setConsumerNumberFk(e.target.value)}
            />
          </Box>
          <Box className="biller-Select">
            <FormControl variant="filled" fullWidth>
              <InputLabel>Acc Number</InputLabel>
              <Select
                labelId="demo-simple-select-filled-label"
                id="demo-simple-select-filled"
                fullWidth
                value={accNumber}
                onChange={(e) => setAccNumber(e.target.value)}
              >
                <MenuItem value="">
                  <em>None</em>
                </MenuItem>
                <MenuItem value="101">101</MenuItem>
                <MenuItem value="102">102</MenuItem>
              </Select>
            </FormControl>
          </Box>
          <Box id="cons-number">
            <TextField
              required
              label="Amount"
              defaultValue=""
              placeholder="1000"
              value={amount}
              onChange={(e) => setAmount(e.target.value)}
            />
          </Box>
          <br></br>
          <Button variant="contained" onClick={handleClick} className="btn">
            Pay
          </Button>
          <br></br>
        </div>
      </Container>
    </div>
  );
}

export default BillerProvider;
