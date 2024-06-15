import Vue from 'vue';
import VueRouter from 'vue-router';
import VotePost from "@/views/VotePost.vue";  // 새로 추가된 라우트 컴포넌트

Vue.use(VueRouter);

const routes = [
    {
        path: '/vote-post',  // 새로운 경로 설정
        name: 'VotePost',
        component: VotePost
    }
];

const router = new VueRouter({
    mode: 'history',
    base: process.env.BASE_URL,
    routes
});

export default router;
