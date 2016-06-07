# Example projects for RESTEasy services and clients

This repository features two pairs of projects:

1. `SimpleClient` and `SimpleService`
1. `AdderClientResteasy` and `AdderServiceResteasy`

The Simple projects show the minimal set of capabilities, whereas the RESTEasy projects illustrate some of JAX-WS' features.

## Running the simple project
To run the advanced project, proceed as follows.

1. Clone this repository to a temporary folder.
1. Import the project as described in the [basic Java EE tutorial](https://wwu-pi.github.io/tutorials/lectures/acse/020_tutorial_jboss_project.html#import). 
1. Once you published the Simple projects onto your application server and started the server, your adder service is accessible under <a href="http://localhost:8080/SimpleService/">http://localhost:8080/SimpleService/</a>.
1. Try changing the query parameters of the URI, i.e. <a href="http://localhost:8080/SimpleService/?first=3&second=5">.../?first=3&second=5</a>.
1. Also try the <a href="http://localhost:8080/SimpleClient/index.xhtml">sample client</a> that uses the simple service.

## Running the advanced project
To run the advanced project, proceed as follows.

1. Clone this repository to a temporary folder.
1. Import the project as described in the [basic Java EE tutorial](https://wwu-pi.github.io/tutorials/lectures/acse/020_tutorial_jboss_project.html#import). 
1. Once you published your projects onto your application server and started the server, your adder service is accessible under <a href="http://localhost:8080/AdderServiceResteasy/api/">http://localhost:8080/AdderServiceResteasy/api/</a>.
1. Try changing parts of the URI, i.e. <a href="http://localhost:8080/AdderServiceResteasy/api/add/1/3/">.../api/add/1/3/</a>. Also try to send different Accept-Header using a [curl](http://curl.haxx.se/)-like tool such as [httpie](https://github.com/jkbr/httpie), [REST Console for Chrome](https://chrome.google.com/webstore/detail/rest-console/cokgbflfommojglbmbpenpphppikmonn), or [RESTClient for Firefox](https://addons.mozilla.org/firefox/addon/restclient/) to see how the resource responds with different representations.
1. Also try the <a href="http://localhost:8080/AdderClientResteasy/index.xhtml">sample client</a> that uses the RESTEasy web service.
