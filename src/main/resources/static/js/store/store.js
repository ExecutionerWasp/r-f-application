import Vue from 'vue';
import Vuex from "vuex";
import axios from "axios";

Vue.use(Vuex);

export default new Vuex.Store({
    state: {
        user: null
    },

    mutations: {
        login(state, user) {
            state.currentUser = user;
            state.userEvents = user.events;
        }
    },

    actions: {
        login({commit}, u) {
            return axios
                .post("/api/user/login?login=" + u.login + "&password=" + u.password)
                .then(data => {
                    commit("login", data.data);
                })
        }
    }
});
