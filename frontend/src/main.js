import { createApp } from 'vue'
import { createWebHistory, createRouter} from "vue-router";
import App from './App.vue'

// router 쓰일 Component
import Home from './views/HomePage.vue';
import VotePost from "./views/VotePost.vue";

const routes = [
    {path : '/', component: Home},
    {path : '/vote-post', component: VotePost}
]
const router = createRouter({
    history: createWebHistory(),
    routes
})

const app = createApp(App)
app.use(router)
app.mount('#app')