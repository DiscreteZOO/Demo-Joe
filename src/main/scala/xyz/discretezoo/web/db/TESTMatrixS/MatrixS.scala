package xyz.discretezoo.web.db.TESTMatrixS
import java.util.UUID
import xyz.discretezoo.web.ZooObject

case class MatrixS(
ID: UUID,
mat: List[Int],
trace: Option[Int],
orthogonal: Option[Boolean],
eigenvalues: List[Int]) extends ZooObject {

def select: Map[String, _] = Map(
"mat" -> this.mat,
"trace" -> this.trace,
"orthogonal" -> this.orthogonal,
"eigenvalues" -> this.eigenvalues
)

}