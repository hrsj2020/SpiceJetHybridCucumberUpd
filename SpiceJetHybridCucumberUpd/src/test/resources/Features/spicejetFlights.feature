Feature: spicejetFlights

Scenario: Booking the Flights
Given Open browser and Go to Url
When verify the title
Then Clicking on Flights
Then Click Round Trip
Then Click From Departure City Dropdown
Then Select Departure City
Then Select Arrival City
Then Click Depart Date
Then close window wrong returndate
Then click Return Date Calendar
Then select next month
Then Click Return Date
Then Click Passengers Dropdown
Then Select number of Adults
Then Click on Currency Dropdown
Then Select Currency
Then Click Search
Then Verify Fare Details
Then Click Continue button
Then Take Screenshot
And Close the Browser