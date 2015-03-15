require 'bunny'

conn = Bunny.new(hostname: 'localhost', admin: 'guest', password: 'guest')
conn.start

ch = conn.create_channel
x = Bunny::Exchange.new(ch, :topic, 'excaalibur.topic', durable: true)

data =<<DATA
{
  "code": "B522",
  "number": "5000030",
  "agent_id": 583
}
DATA

x.publish(data, routing_key: '#')

conn.close
