package com.example.starter.globalParam

import com.example.starter.common.MONGO_CONNECTION_STTRING
import com.mongodb.reactivestreams.client.MongoClients

//mongo database set and collection set
const val database:String ="car"
const val carCollection :String ="carHourCounts"

/**
 * singleton , only one mongoClient instance in this service
 * maybe I can setting something
 */
object mongoClient{
  val mongo = MongoClients.create(MONGO_CONNECTION_STTRING)
}
