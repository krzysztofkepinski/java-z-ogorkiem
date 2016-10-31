# java-z-ogorkiem

Technology requirements:

## Parallel execution
gradle-cucumber-jvm-plugin: github.com/commercehub-oss/gradle-cucumber-jvm-plugin

cucumber {
    maxParallelForks = 3
}

## Test results aggregation
By default, gradle-cucumber-jvm-plugin will generate reports based on masterthought's Cucumber reporting project.

## Jenkins integration (plugin to show test results)
wiki.jenkins-ci.org/display/JENKINS/Cucumber+Reports+Plugin

## Fast execution
junit based, java-quick

## Stable tools/libraries
all java environment

## Migrations to newest version can be done
YES

## Tools/libraries need to be supported
all open-source in active development

## Support productivity
once initial boiler-plate code is produced and extracted to external dependency, it will be easily reused and creating
tests in new repos can be quickly stared

## Support BDD
by design, it's Cucumber

## Easy migrations to newest version
that highly depends on how it's implemented

## Tools/libraries are developed
YES

## Low entry level
if you're familiar with basics of Java, Webdriver and REST

## Broad community
YES

# pros and cons:
+ good choice for java repos as they already have most of the needed dependencies

- requires jvm compilation before run

+ can be run/debugged in intellij
