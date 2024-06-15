import axios from 'axios';

const instance = axios.create({
    baseURL: 'http://localhost:18080/', // Spring Boot 서버의 기본 URL
    headers: {
        'Content-Type': 'application/json'
    }
});

export default instance;