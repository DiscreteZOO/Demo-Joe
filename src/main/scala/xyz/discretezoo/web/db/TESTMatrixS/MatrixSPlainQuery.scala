package xyz.discretezoo.web.db.TESTMatrixS
import java.util.UUID
import slick.jdbc.GetResult
import xyz.discretezoo.web.PlainSQLSupport
import xyz.discretezoo.web.ZooPostgresProfile.api._

object MatrixSPlainQuery extends PlainSQLSupport[MatrixS] {

override val tableName: String = "TEST_MATRIXS"
override implicit val getResult: GetResult[MatrixS] = GetResult(r => MatrixS(r.nextObject.asInstanceOf[UUID], r.<<[Seq[Int]].toList, r.<<, r.<<, r.<<[Seq[Int]].toList))

val inCollection: Map[String, String] = Map(
"MatrixS" -> "ID"
)

}