# Practices - Data engineering

## TP - Data processing with Apache Spark
To process a large amount of data partitioned on a data lake, you can use data processing frameworks such as Apache Spark :
1. Read : https://spark.apache.org/docs/latest/sql-programming-guide.html

Some questions :
* Spark RDD API: RDD stands for Resilient Distributed Datasets, and the RDD API is the core of Apache Spark's programming model. RDD is an immutable distributed collection of objects, partitioned across a cluster of machines, that can be processed in parallel. The RDD API provides a set of operations to manipulate data in RDDs, such as transformations and actions. Transformations create a new RDD from an existing one, while actions compute a result or side effect and return a value to the driver program or store data to an external storage system.

*  Spark Dataset API: The Dataset API is an extension of the RDD API that was introduced in Spark 1.6. Datasets are strongly typed distributed collections of objects, like RDDs, but with the additional benefits of providing a compile-time type safety and a more expressive API. Datasets can be converted to and from RDDs, and support both SQL and functional-style operations.

* Spark can be used with multiple languages, including Scala, Java, Python, R, and SQL. The Spark APIs are available in all of these languages, although the syntax and semantics can vary somewhat between them.

* Spark can work with a wide variety of data sources and data sinks, including Hadoop Distributed File System (HDFS), Apache Cassandra, Apache HBase, Amazon S3, JDBC databases, and more. Spark also provides connectors for various streaming data sources, such as Apache Kafka, Apache Flume, and Twitter.
### Analyse data with Apache Spark and Scala 
One engineering team of your company created for you a TV News data stored as JSON inside the folder `data-news-json/`.

Your goal is to analyze it with your savoir-faire, enrich it with metadata, and store it as [a column-oriented format](https://parquet.apache.org/).

1. Look at `src/main/scala/com/github/polomarcus/main/Main.scala` and update the code 

**Important note:** As you work for a top-notch software company following world-class practices, and you care about your project quality, you'll write a test for every function you write.

You can see tests inside `src/test/scala/` and run them with `sbt test`

### How can you deploy your app to a cluster of machines ?
* https://spark.apache.org/docs/latest/cluster-overview.html

### Business Intelligence (BI)
How could use we Spark to display data on a BI tool such as [Metabase](https://www.metabase.com/) ?

Tips: https://github.com/polomarcus/television-news-analyser#spin-up-1-postgres-metabase-nginxand-load-data-to-pg

### Continuous build and test
**Pro Tips** : https://www.scala-sbt.org/1.x/docs/Running.html#Continuous+build+and+test

Make a command run when one or more source files change by prefixing the command with ~. For example, in sbt shell try:
```bash
sbt
> ~ testQuick
```