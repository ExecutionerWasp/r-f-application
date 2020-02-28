<template>
    <v-app>
        <app-header></app-header>
        <router-view></router-view>
    </v-app>
</template>

<script>
    import AppHeader from "./views/sections/AppHeader.vue";

    export default {
        components: {AppHeader}
    }
</script>
<style>

</style>
