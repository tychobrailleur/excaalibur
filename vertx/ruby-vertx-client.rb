require 'vertx'

id = Vertx::EventBus.register_handler('excaalibur.words') do |message|
    puts "Received word: #{message.body}" 
end
