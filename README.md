# Walkock

Walkock is an alarm clock application which works in two modes. The normal mode and the walk mode.
The normal mode functions just like an ordinary app. It rings at the set the time and can be turned off by toggling the radio button avaiable on screen.

The walk mode uses GOOGLE's application programming interface(API) to generate an alarm which doesn't stop ringing until the person sleeping beisdes his smart phone 
gets up and starts walking. IOS has CMMOTIONACTIVITY which works on the same principle as Google API. Google's API functions uses the principles of machine learning 
on the raw data it gets from the accelerometer to determine the activity executed by the person and thus neither the internet service nor the location service is 
necessary for the app. In this app, Google api refreshes every 300 milliseconds to get to know whether the person is foot('walking' or 'running') or not. Thereafter the information
is passed on. Then the alarm stops ringing if the person is on foot, else it keeps on ringing.

# Upcoming Updates:

1. Setting up multiple alarms.
2. Setting up alarms for any day in the week.
3. Repeat the alarm on daily and weekly basis.
4. Get to choose between custom ringtones.
5. Setting Reminders.
6. Better UI.
7. More accurate in terms of time when the alarm starts ringing in accordance with the actual time and the distance required to detect walking.

# Idea By

Idea by Sanyam Rajpal.
