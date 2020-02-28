<template xmlns:v-slot="http://www.w3.org/1999/XSL/Transform">
    <v-container>
        <v-layout row>
            <v-flex col xs6>
                <v-dialog
                        ref="dialog"
                        v-model="modal"
                        :return-value.sync="date"
                        persistent
                        width="290px"
                >
                    <template v-slot:activator="{ on }">
                        <v-text-field
                                v-model="date"
                                label="Date"
                                prepend-icon="event"
                                readonly
                                v-on="on"
                        ></v-text-field>
                    </template>
                    <v-date-picker v-model="date" scrollable>
                        <v-spacer></v-spacer>
                        <v-btn text color="primary" @click="modal = false">Cancel</v-btn>
                        <v-btn text color="primary" @click="$refs.dialog.save(date)">OK</v-btn>
                    </v-date-picker>
                </v-dialog>
            </v-flex>
            <v-spacer></v-spacer>
            <v-flex col>
                <v-btn large color="primary" @click="addStream" xs6>
                    <v-icon>add</v-icon>
                    Добавить поток
                </v-btn>
            </v-flex>
        </v-layout>
        <v-layout>
            <v-flex>
                <v-card class="pt-3 pr-3 pb-3 pl-3">
                    <v-card-title>
                        <h1>Выберете сервис</h1>
                    </v-card-title>
                    <v-checkbox
                            v-model="service.yandex.direct.value"
                            hide-details
                            label="Яндекс.Директ"
                            light
                    ></v-checkbox>
                    <v-checkbox
                            v-model="service.yandex.metric.value"
                            hide-details
                            label="Яндекс.Метрика"
                            light
                    ></v-checkbox>
                    <v-checkbox
                            v-model="service.google.ads.value"
                            hide-details
                            label="Google Ads"
                            light
                    ></v-checkbox>
                    <v-text-field placeholder="Введите ваш ID аккаунта" style="max-width: 300px"></v-text-field>
                    <v-checkbox
                            v-model="service.google.analitics.value"
                            hide-details
                            label="Google Analitics"
                            light
                    ></v-checkbox>
                    <v-card-actions>
                        <v-spacer></v-spacer>
                        <v-btn large color="primary" @click="save">Сохранить</v-btn>
                        <v-spacer></v-spacer>
                    </v-card-actions>
                </v-card>
            </v-flex>
        </v-layout>
        <v-layout>
            <v-flex>
                <v-card class="pt-3 pr-3 pb-3 pl-3">
                    <v-card-title><h1>Список потоков</h1></v-card-title>
                    <v-card class="pt-3 pl-3 pb-3 pr-3 mb-3">
                        <h3>
                            <v-icon>add</v-icon>
                            &nbsp&nbsp&nbsp Наручные часы Xiomi
                        </h3>
                    </v-card>
                    <v-card class="pt-3 pl-3 pb-3 pr-3 mb-3">
                        <h3>
                            <v-icon>add</v-icon>
                            &nbsp&nbsp&nbsp Наручные часы Xiomi
                        </h3>
                    </v-card>
                    <v-card class="pt-3 pl-3 pb-3 pr-3 mb-3">
                        <h3>
                            <v-icon>add</v-icon>
                            &nbsp&nbsp&nbsp Наручные часы Xiomi
                        </h3>
                    </v-card>
                </v-card>
            </v-flex>
        </v-layout>
        <v-layout column>
            <v-flex md6 style="overflow: auto">
                <v-data-table
                        :headers="headers"
                        :items="desserts"
                        hide-actions
                        class="elevation-1"
                >
                    <template slot="items" slot-scope="props">
                        <td class="text-xs-center">{{ props.item.company }}</td>
                        <td class="text-xs-center">{{ props.item.advertGroup }}</td>
                        <td class="text-xs-center">{{ props.item.advert }}</td>
                        <td class="text-xs-center">{{ props.item.keyWords }}</td>
                        <td class="text-xs-center">{{ props.item.show }}</td>
                        <td class="text-xs-center">{{ props.item.clickPrice }}</td>
                        <td class="text-xs-center">{{ props.item.spending }}</td>
                        <td class="text-xs-center">{{ props.item.ctr }}</td>
                        <td class="text-xs-center">{{ props.item.targets }}</td>
                        <td class="text-xs-center">{{ props.item.sell }}</td>
                        <td class="text-xs-center">{{ props.item.win }}</td>
                        <td class="text-xs-center">{{ props.item.leadCost }}</td>
                        <td class="text-xs-center">{{ props.item.roi }}</td>
                    </template>
                </v-data-table>
            </v-flex>
        </v-layout>
    </v-container>
</template>

<script>
    export default {
        name: "Main",

        data() {
            return {
                modal: false,
                date: null,
                service: {
                    yandex: {
                        direct: {
                            value: false
                        },

                        metric: {
                            value: false
                        }
                    },

                    google: {
                        ads: {
                            value: false
                        },
                        analitics: {
                            value: false
                        }
                    }
                },
                headers: [
                    {
                        text: 'Компания',
                        align: 'start',
                        sortable: false,
                        value: 'company',
                    },
                    { text: 'Группа объявлений', value: 'advertGroup', sortable: false },
                    { text: 'Объявление', value: 'advert', sortable: false },
                    { text: 'Ключевые слова', value: 'keyWords', sortable: false },
                    { text: 'Показы', value: 'show', sortable: false },
                    { text: 'Цена клика', value: 'clickPrice', sortable: false },
                    { text: 'Расход', value: 'spending', sortable: false },
                    { text: 'CTR', value: 'ctr', sortable: false },
                    { text: 'Цели', value: 'targets', sortable: false },
                    { text: 'Продано', value: 'sell', sortable: false },
                    { text: 'Заработано', value: 'win', sortable: false },
                    { text: 'Стоимость лида', value: 'leadCost', sortable: false },
                    { text: 'ROI', value: 'roi', sortable: false }
                ],
                desserts: [
                    {
                        company: 'company',
                        advertGroup: 'advertGroup',
                        advert: 'advert',
                        keyWords: 'keyWords',
                        show: 'show',
                        clickPrice: 'clickPrice',
                        spending: 'spending',
                        ctr: 'ctr',
                        targets: 'targets',
                        sell: 'sell',
                        win: 'win',
                        leadCost: 'leadCost',
                        roi: 'roi'
                    },
                    {
                        company: 'company',
                        advertGroup: 'advertGroup',
                        advert: 'advert',
                        keyWords: 'keyWords',
                        show: 'show',
                        clickPrice: 'clickPrice',
                        spending: 'spending',
                        ctr: 'ctr',
                        targets: 'targets',
                        sell: 'sell',
                        win: 'win',
                        leadCost: 'leadCost',
                        roi: 'roi'
                    },
                    {
                        company: 'company',
                        advertGroup: 'advertGroup',
                        advert: 'advert',
                        keyWords: 'keyWords',
                        show: 'show',
                        clickPrice: 'clickPrice',
                        spending: 'spending',
                        ctr: 'ctr',
                        targets: 'targets',
                        sell: 'sell',
                        win: 'win',
                        leadCost: 'leadCost',
                        roi: 'roi'
                    },
                    {
                        company: 'company',
                        advertGroup: 'advertGroup',
                        advert: 'advert',
                        keyWords: 'keyWords',
                        show: 'show',
                        clickPrice: 'clickPrice',
                        spending: 'spending',
                        ctr: 'ctr',
                        targets: 'targets',
                        sell: 'sell',
                        win: 'win',
                        leadCost: 'leadCost',
                        roi: 'roi'
                    },
                    {
                        company: 'ИТОГО',
                        advertGroup: 's',
                        advert: 's',
                        keyWords: 's',
                        show: 's',
                        clickPrice: 's',
                        spending: 's',
                        ctr: 's',
                        targets: 's',
                        sell: 's',
                        win: 's',
                        leadCost: 's',
                        roi: 's'
                    }
                ]
            }
        },

        methods: {
            save() {

            }
            ,

            addStream() {

            }
        }
    }
</script>

<style scoped>
    th {
        color: gray !important;
    }

    tr {
        color: gray !important;
    }
</style>
