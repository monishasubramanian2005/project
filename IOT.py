// Define the GPIO pins 
#define switchPin 27    // Pin for the switch (with INPUT_PULLUP) 
#define buzzerPin 26    // Pin for the buzzer 

// Define the default latitude and longitude for NGP College, Kalapatti Road 
const float latitude = 11.0502;    // Latitude of NGP College, Kalapatti Road 
const float longitude =77.0322;   // Longitude of NGP College, Kalapatti Road 
// Google Maps link with the coordinates 
String googleMapsLink = "https://www.google.com/maps?q=" + String(latitude, 4) + 
"," + String(longitude, 4); 


void setup() { 
// Start serial communication for debugging 
Serial.begin(115200); 
// Set the buzzer pin as an output 
pinMode(buzzerPin, OUTPUT); 
// Set the switch pin as input with internal pull-up resistor 
pinMode(switchPin, INPUT_PULLUP); 
// Print initial location to the serial monitor 
Serial.print("Location of NGP College, Kalapatti Road: "); 
Serial.print("Latitude: "); 
46 
Serial.print(latitude, 4); 
Serial.print(" , Longitude: "); 
Serial.println(longitude, 4); 
} 


void loop() { 
// Check if the switch is pressed (LOW means pressed because of INPUT_PULLUP) 
if (digitalRead(switchPin) == LOW) { 
// Print the location to the serial monitor 
Serial.print("Switch pressed! Sending location: "); 
Serial.print("Latitude: "); 
Serial.print(latitude, 4); 
Serial.print(" , Longitude: "); 
Serial.println(longitude, 4); 
// Activate the buzzer for 5 seconds 
digitalWrite(buzzerPin, HIGH); 
delay(5000);     // Wait for 5 seconds 
digitalWrite(buzzerPin, LOW);  
// 
//  Send SMS to multiple numbers 
sendSMS("+918072746995");  // Number 1 
sendSMS("+919942523616");  // Number 2 
sendSMS("+919790504095");  // Number 3 
sendSMS("+918438171226");  // Number 4 
sendSMS("+919843473947");  // Number 5} 
// Add a small delay to debounce the switch 
47 
delay(100);} 


// Function to send SMS 
void sendSMS(String phoneNumber) { 
Serial.println("AT+CMGF=1");    // Set SMS mode to text 
delay(1000); 
Serial.println("AT+CMGS=\"" + phoneNumber + "\"\r"); // Set the recipient's phone 
number 
delay(500); 
Serial.println(googleMapsLink);  // Send the Google Maps link 
delay(100); 
Serial.println((char)26);
delay(4000);                  
} 
        //
 End the message with CTRL+Z 
   // Wait for the SMS to be sent 
