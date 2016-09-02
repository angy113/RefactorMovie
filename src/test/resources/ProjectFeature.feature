Feature: Pivotal Tracker Testing

  Scenario: Verify to get an specific Project API
    Given I have set a connection to pivotal_tracker API service
    When I send a /projects GET request
    Then I expect Status code 200

  Scenario: Verify to get an specific Story API
      Given I have set a connection to pivotal_tracker API service
      When I send a /projects POST with the json
          """
          {"name":"angtyrty154541gh"}
          """
      Then I expect Status code 200
#          And I store as a [Project1]
#      When I send a /projects/[Project1.id] PUT with the json
#      """
#        {
#          "name":"angy113"
#        }
#      """
#      Then I expect Status code 200
#      When I send a /project/[Project1.id]/stories GET request
#      Then I expect Status code 200

#  Scenario: Verify method POST for Project API
#    Given I have set a connection to pivotal_tracker API service
#    When I send a /projects POST with the json
#    """
#      {
#        "name":"angy11"
#      }
#    """
#    Then I expect Status code 200



#  Scenario: Verify method PUT for Project API
#    Given I have set a connection to pivotal_tracker API service
#    When I send a project PUT request with json
#    |Name|Angy12|
#    Then I expect Status code 200

#   Scenario: Verify method PUT for Project API
#       Given I have set a connection to pivotal_tracker API service
#       When I send a project PUT request with json
#       |Name|Description|
#       |Angy13|Hello|
#       |Angy14|Hello|
#       |Angy15|Hello|
#       Then I expect Status code 200

#  Scenario: Verify method DELETE for Project API
#    Given I have set a connection to pivotal_tracker API service
#    When I send a project DELETE request
#    Then I expect Status code 204
