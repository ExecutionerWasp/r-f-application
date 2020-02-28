<template>
    <v-toolbar>
        <v-toolbar-title>
            Server Integration
        </v-toolbar-title>
        <v-spacer></v-spacer>
        <div v-if="this.$route.path !== '/'">
            <v-btn color="warning" @click="onUpdate">Update Data</v-btn>
            <v-btn color="error" @click="onLogout">Logout</v-btn>
        </div>
    </v-toolbar>
</template>

<script>
    export default {
        name: "AppHeader",

        methods: {
            onUpdate() {

            },

            onLogout() {
                this.$router.push("/");
            }
        }
    }
</script>

<style scoped>

</style>
