package xyz.discretezoo.web

import slick.lifted.TableQuery
import xyz.discretezoo.web.db.ZooDb

import scala.concurrent.Await
import scala.concurrent.duration.Duration
import xyz.discretezoo.web.ZooPostgresProfile.api._
import xyz.discretezoo.web.db.TESTMatrixS.MatrixSTable

object Create {

  def main(args: Array[String]): Unit = {

    object tbMatrixS extends TableQuery(new MatrixSTable(_))

    try {
      Await.result(ZooDb.db.run(DBIO.seq(
        tbMatrixS.schema.create
      )), Duration.Inf)
    }

  }

}
