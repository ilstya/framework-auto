package api.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class ApiStepDefinitions {

    private Response response;

    @Given("I send a GET request to {string}")
    public void i_send_a_get_request_to(String url) {
        response = given().when().get(url);
    }

    @Given("I send a POST request to {string} with body:")
    public void i_send_a_post_request_to_with_body(String url, String body) {
        response = given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(url);
    }

    @Then("The response status code should be {int}")
    public void the_response_status_code_should_be(int statusCode) {
        Assert.assertEquals(statusCode, response.getStatusCode());
    }

    @Then("The response should contain a list of users")
    public void the_response_should_contain_a_list_of_users() {
        Assert.assertTrue(response.body().asString().contains("data"));
    }

    @Then("The response should contain the user with ID {int}")
    public void the_response_should_contain_the_user_with_id(int userId) {
        Assert.assertTrue(response.body().asString().contains("\"id\":" + userId));
    }

    @Then("The response should contain the name {string} and job {string}")
    public void the_response_should_contain_the_name_and_job(String name, String job) {
        Assert.assertTrue(response.body().asString().contains("\"name\":\"" + name + "\""));
        Assert.assertTrue(response.body().asString().contains("\"job\":\"" + job + "\""));
    }
}