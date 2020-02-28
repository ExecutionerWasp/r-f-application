import Vue from 'vue'
import VueRouter from 'vue-router'
import Main from "../views/Main.vue";

Vue.use(VueRouter);

const routes = [
    {path: '/', component: Main},
    {path: '*', component: Main}
];

export default new VueRouter({
    mode: 'history',
    routes
})
