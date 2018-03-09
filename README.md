# P1 - version 2


Log:


Important Dates:

Team Declaration - Saturday, March 3
UML - Sunday, March 11
Project Submission - Friday, March 23

Goal:
For this project, our goal is to find the Potential Suspects from a string of ongoing crimes accross the island. To do this, we are given
input files from different companies that have a list of phone numbers that were in the area at the time of occurence for the particular 
crimes. We are to use 4 different approaches given by the instructions to sort through the data and find the potential suspects. After we
find the potential suspects, we must prove the validity of our results empirically. Our proof of concept must be in the form of a graph
that we produce via google drive sheets or an excel sheet were the data is organized and represented clearly.



Requirements/Restrictions:
- Use the 4 algorithms given to sort through the data
- Upload the results to excel and graph the information clearly
- You cannot use anything from the Java API related to sets. Other use of API is up to our discretion
- Create 3 classes for the algorithms (P1&P2, P3, and P4)
- Create two testers for the project (P1Main class for the algorithmg and P2Main for the output files)


Classes:
P1Main class (in progress) - tester for P1-P4 strategies for project 1st requirement
P2Main (not created) - tester for uploading the files to google drive for project 2nd requirement
P1&P2 (not created) - strategies P1 (ArrayList) and P2 (Maps) where we use a bucket for each crime and find the intersection between all
P3 (not created) - strategy for P3 (ArrayList/Maps) where we put buckets into a box and count the frequency of each phone in the buckets
P4 (not created) - strategy for P4 (Maps) where we put buckets into a box and count the frequency of each phone in the buckets


Methods:
Union Method (done) - unites the elements of two sets into a single bucket (repeats elements if the element is in both buckets)
Intersection method (in progress) - verify if the same element is in both sets and puts it in a new set (demo: interSet)


Algorithms:
P1 - Every crime is a bucket. Find the intersecting marble between all of the buckets. If a particular marble is in all of the buckets,
that particular marble is a Potential Suspect. (hypothesis: least effective method) 

P2 - Every crime is a bucket. Find the intersecting marble between all of the buckets. If a particular marble is in all of the buckets,
that particular marble is a Potential Suspect. (hypothesis: 2nd least effective method)

P3 - All the marbles are put into 1 bucket. We count the amount of marbles of a specific color and if the frequency of that particular 
marble = # crimes, that marble is a Potential Suspect. (hypothesis: 2nd most effective method) 

P4 - All the marbles are put into 1 bucket. We count the amount of marbles of a specific color and if the frequency of that particular
marble = # crimes, that marble is a Potential Suspect. ((hypothesis: most effective method) 

Efficiency Hypothesis: P1 < P2 < P3 < P4



To do:
UML (in progress)
P1Main class (in progress) 
P2Main class (not created)
P1&P2 class (not created) 
P3 class (not created) 
P4 class (not created)
P1 algorithm (understood theoretically but not coded)
P2 algorithm (understood theoretically but not coded)
P3 algorithm (understood theoretically but not coded)
P4 algorithm (understood theoretically but not coded)
