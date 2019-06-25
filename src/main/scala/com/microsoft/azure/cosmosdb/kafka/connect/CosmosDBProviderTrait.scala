package com.microsoft.azure.cosmosdb.kafka.connect

import java.util.concurrent.CountDownLatch

import com.microsoft.azure.cosmosdb.rx.AsyncDocumentClient

trait CosmosDBProviderTrait {
  def upsertDocuments[T](docs: scala.List[T], databaseName: String, collectionName: String, completionLatch: CountDownLatch): Unit
}
