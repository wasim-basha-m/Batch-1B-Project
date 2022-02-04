import axios from 'axios';

const Statement_Data_url = "http://localhost:8080/registry/statement/";

class Statemntapi {
    getStatement(){
        return axios.get(Statement_Data_url);
    }
}

export default new Statemntapi();