# globalstudiossingapore-android

GSS is an android project done for SMU's Mobile & Pervasive Technology.

# Context:
This app aims to replace the physical paper map given to theme park patrons. It utilizes bluetooth beacons to detect patrons entering and exiting the attraction, which automates the calculation for the queues' waiting time.
It also provides directions to app user to selected attractions. There is an emergency call function within the app to contact theme park staff in case of an emergency. Lastly, AR phototaking function so that theme park goers can take photos with their favourite mascots anywhere and anytime.


# Key features:
1. QR code scanner to authenticate and log in user

2. In app guide map to replace physical paper maps - built on top of PhotoView library to allow scaling as well as to pick out the coordinates at the point when tapped.

3. Attractions and Dining lists built using RecyclerView and CardView, sorted using a comparator.

4. Timing for Thomie's Mine Train and Dare Devil calculated based on the number of people entered into the ride's region. Built using Estimote Bluetooth Beacon and SDK.

5. AR phototaking using AR Core and ViroCore Renderer.


# Architecture

Backend: (MySQL database, Apache Tomcat) inside Ubuntu server

Http request/response: REST API within Retrofit

Frontend: Android


Team members: Marcus Ong (myself), Darryl Ong, Theresa Lee, Yang FengFeng
