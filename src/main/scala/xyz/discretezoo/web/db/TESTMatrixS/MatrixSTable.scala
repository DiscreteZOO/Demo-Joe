package xyz.discretezoo.web.db.TESTMatrixS
import java.util.UUID
import slick.collection.heterogeneous.HNil
import slick.lifted.{ProvenShape, Rep}
import xyz.discretezoo.web.DynamicSupport.ColumnSelector
import xyz.discretezoo.web.ZooPostgresProfile.api._

final class MatrixSTable(tag: Tag) extends Table[MatrixS](tag, "TEST_MATRIXS") with ColumnSelector {

def ID: Rep[UUID] = column[UUID]("ID", O.PrimaryKey)
def mat: Rep[List[Int]] = column[List[Int]]("MAT")
def trace: Rep[Option[Int]] = column[Option[Int]]("TRACE")
def orthogonal: Rep[Option[Boolean]] = column[Option[Boolean]]("ORTHOGONAL")
def eigenvalues: Rep[List[Int]] = column[List[Int]]("EIGENVALUES")

def * : ProvenShape[MatrixS] = (
ID ::
mat ::
trace ::
orthogonal ::
eigenvalues ::
HNil
).mapTo[MatrixS]

val select: Map[String, Rep[_]] = Map(
"mat" -> this.mat,
"trace" -> this.trace,
"orthogonal" -> this.orthogonal,
"eigenvalues" -> this.eigenvalues
)

val inCollection: Map[String, Rep[Boolean]] = Map(
"ID" -> true
)

}