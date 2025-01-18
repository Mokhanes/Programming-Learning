import flask
myApp=flask.Flask(__name__)
@myApp.route("/mokhanes")
def home():
    return("<h1>Hi MOKHANES<h1>")

@myApp.route("/<lat>/<long>")
def data(lat,long):
    print("Latitude:"+lat+"\nLongitude:"+long)
    return("<h1>Latitude:<h1>"+lat+"\n<h1>Longitude:<h1>"+long)
myApp.run(host='0.0.0.0')


#157.51.81.19 -->ipv4

#192.168.43.100 -->Local Network IP
