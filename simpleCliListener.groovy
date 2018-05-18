

def server = new ServerSocket(4040)

while(true) {
    server.accept{ socket ->
        println "processing new connection"

        socket.withStreams { input, output ->
            //def json = input.readLines()
            //json.forEach{
            //    println it
            //}
            println inut.newReader().readLine()
        }
        println "processing/thread complete"
    }
}
