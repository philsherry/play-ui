resolvers ++= Seq(
  Resolver.url("hmrc-sbt-plugin-releases", url("https://dl.bintray.com/hmrc/sbt-plugin-releases"))(
    Resolver.ivyStylePatterns),
  "HMRC Releases" at "https://dl.bintray.com/hmrc/releases",
  "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases/"
)

addSbtPlugin("uk.gov.hmrc" % "sbt-auto-build" % "1.15.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-git-versioning" % "1.17.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-twirl" % "1.3.15")

addSbtPlugin("uk.gov.hmrc" % "sbt-play-cross-compilation" % "0.15.0")

addSbtPlugin("uk.gov.hmrc" % "sbt-artifactory" % "0.18.0")
