require 'net/http'

describe "external site" do
  it "returns 'World' by visiting Google" do
    uri = URI('https://api.giphy.com/v1/gifs/search')
    params = {'api_key' => 'e4pkTexbU0PGWf4jUqruw6bOOx8fMkOm',
              'q'=> "cat", 'limit' => '10', 
              'offset'=> 2, 'rating' => 'g',
               'lang' => 'en'}
    result = Net::HTTP.post_form(uri, params) 

    result.should match("200 ok")
    #=> true
  end
end