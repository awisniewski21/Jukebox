<p float="left" align="left">
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/558a0546-f1f6-4f4e-b3e2-3e674a432fcf" height="100"/> 
</p>

# What is Jukebox? 🎶

Jukebox is a front-end Android project designed to improve music at social events. It’s not always easy to have good music, since hosts may lack inspiration and time to create playlists, and guests may disagree with song choices or be too shy to suggest songs. Our app allows guests to suggest songs before the party starts, skip songs during the party, and for hosts to set more fine-grained controls on these systems.

This project was completed as part of CS465 (User Interface Design) at [The University Of Illinois](https://illinois.edu/).

# Host: Creating a Party

## Enter Party Information
To create a party, the host first enters in information about the party, such as the name, theme, date, time, and location. Then, they can choose to set limits on song suggestions and skips. These are designed to avoid a vocal minority taking control of the party's music.
</br>
</br>
<p float="left" align="middle">
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/ad64859c-493d-4b70-ae52-cd06c5630b3e" width="190" height="425"/> 
  &nbsp;
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/3f904fe0-747b-41c6-a884-cec49ce54f40" width="190" height="425" /> 
  &nbsp;
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/a9072b0d-3572-4dde-ba4c-eb1c902f2c67" width="190" height="425" />
  &nbsp;
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/09b8b75d-4320-48b7-b057-4e3fcad57103" width="190" height="425" />
</p>

## Input Validation
Date and time fields use special input types for ease of access.
</br>
<p float="left" align="left">
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/2b0f9579-644c-445a-8a1d-878b5d680778" width="190" height="350"/> 
  &nbsp;
  <img width="190" height="350" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/f84e3454-0de8-4224-bf70-bb708b317e4c">
</p>
Every text field is validated and appropriate error messages are displayed if necessary.
</br>
</br>
<p float="left" align="left">
  <img height="190" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/494750bc-f12b-4fc9-8280-9993dbd2e19f">
</p>
Sliders have recommended ranges and display warnings if the value goes outside of the range.
</br>
</br>
<img width="400" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/recommendation_sliders_small.gif">
<img width="400" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/e23eac1e-ed1e-4d95-a397-c7a5f89a19ce">

# Guests: Joining a Party in Advance
Guests can join a party by entering the corresponding four-letter party code. If the code is valid, guests can then see the details about the party and submit song suggestions before the party begins. 
</br>
</br>
<p float="left" align="middle">
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/ad64859c-493d-4b70-ae52-cd06c5630b3e" width="190" height="425"/> 
  &nbsp;
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/0580f6dd-0097-4da5-a4fa-ea6458084a2f" width="190" height="425"/> 
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/65c894a5-ca6b-4a52-bf0f-5745b926e74f">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/delete_suggestions.gif">
</p>

# Host: Starting a Party
When the host is ready, they can start the party after confirming. The host has complete control over pausing and skipping songs. They can also remove songs from the queue and edit settings if needed.
</br>
</br>
<p float="left" align="middle">
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/0cf48dfc-8d2b-4b3a-b947-87702ab02877">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/a52277b0-3e09-4707-8a97-9434d8e65aa5">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/host_controls.gif">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/assets/43355483/772c7776-3309-437b-922b-f51f88ef83fb">
 </p>

# Guests: Joining an Ongoing Party
Guests can join an ongoing party in a similar fashion as before. They are given a chance to vote to skip at the beginning of each song. They can also vote on what the next song should be. If not enough votes to skip are received within the timeframe, votes are no longer allowed until the next song begins. The number of votes needed to skip and the time given to skip are configurable by the host.
</br>
</br>
<p float="left" align="middle">
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/ad64859c-493d-4b70-ae52-cd06c5630b3e" width="190" height="425"/> 
  &nbsp;
  <img src="https://github.com/awisniewski21/Jukebox/assets/43355483/0580f6dd-0097-4da5-a4fa-ea6458084a2f" width="190" height="425"/> 
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/skip_song_success.gif">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/skip_song_fail.gif">
</p>

# Host: Ending a Party
When the host is ready, they can end the party after confirming. They will be presented with a summary page detailing statistics about the party. 
</br>
</br>
<p float="left" align="middle">
  <img width="190" height="425" src="https://github.com/awisniewski21/Jukebox/assets/43355483/4ab52df0-f9e6-4e9e-adc8-811eedea3d70">
  &nbsp;
  <img width="190" height="425" alt="image" src="https://github.com/awisniewski21/Jukebox/blob/master/media/end_of_party.gif">
</p>
