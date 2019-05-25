 function() {
  var config = {
    apiURL: 'http://dummy.restapiexample.com/api/v1/'
  };

  karate.configure('connectTimeout', 5000);
  karate.configure('readTimeout', 5000);
  return config;
}