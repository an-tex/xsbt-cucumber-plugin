package templemore.sbt.cucumber

import java.io.File

/**
 * The options to pass to cucumber.
 *
 * @author Chris Turner
 */
case class Options(featuresLocation: String,
                   basePackage: String,
                   extraOptions: List[String],
                   beforeFunc: () => Unit,
                   afterFunc: () => Unit) {

  def featuresPresent = featuresLocation.startsWith("classpath:") || (new File(featuresLocation).exists)
}
