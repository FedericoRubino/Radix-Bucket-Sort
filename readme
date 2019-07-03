Federico Rubino
frubino
Assignment #4
RadixBucketSort


	The first four test runs were there just to check that the
performance doesn't change between sorted and unsorted test cases.
And even though I used a gaint test size and a small one the
difference between the two was miniscule at best.

	Then the question arrises if my program runs at O(n), and
therefore I did a few test with the sample size increasing by a factor
of 10:
        User time (seconds): 0.67 //sorted 2k
        User time (seconds): 0.71 //unsorted 2k
        User time (seconds): 1.88 //unsorted 20k
        User time (seconds): 4.13 // unsorted 200k
        User time (seconds): 21.37 // unsorted 2000k

There is a clear increase, but overall it is following the O(n).



####################### #1
//unsorted two million values
	Command being timed: "java p4"
	User time (seconds): 22.03
	System time (seconds): 6.81
	Percent of CPU this job got: 108%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:26.57
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 718608
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 181926
	Voluntary context switches: 1412
	Involuntary context switches: 236
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0

#################### #2
//sorted two million values
	Command being timed: "java p4"
	User time (seconds): 20.15
	System time (seconds): 6.36
	Percent of CPU this job got: 108%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:24.39
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 715624
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 180552
	Voluntary context switches: 1540
	Involuntary context switches: 291
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0

#################### #3
//unsorted two thousand
	Command being timed: "java p4"
	User time (seconds): 0.67
	System time (seconds): 0.07
	Percent of CPU this job got: 225%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:00.33
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 37608
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 10453
	Voluntary context switches: 521
	Involuntary context switches: 3
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0


####################### #4
//sorted two thousand
	Command being timed: "java p4"
	User time (seconds): 0.71
	System time (seconds): 0.07
	Percent of CPU this job got: 228%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:00.34
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 36756
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 9930
	Voluntary context switches: 602
	Involuntary context switches: 9
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0


################## #5
//20k
	Command being timed: "java p4"
	User time (seconds): 1.88
	System time (seconds): 0.16
	Percent of CPU this job got: 254%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:00.80
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 70072
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 19303
	Voluntary context switches: 626
	Involuntary context switches: 15
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0

#################### #6
//200k
	Command being timed: "java p4"
	User time (seconds): 4.13
	System time (seconds): 0.79
	Percent of CPU this job got: 147%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:03.34
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 173304
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 45327
	Voluntary context switches: 826
	Involuntary context switches: 94
	Swaps: 0
	File system inputs: 0
	File system outputs: 64
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0

################### #7
//2mill
	Command being timed: "java p4"
	User time (seconds): 21.37
	System time (seconds): 6.42
	Percent of CPU this job got: 108%
	Elapsed (wall clock) time (h:mm:ss or m:ss): 0:25.50
	Average shared text size (kbytes): 0
	Average unshared data size (kbytes): 0
	Average stack size (kbytes): 0
	Average total size (kbytes): 0
	Maximum resident set size (kbytes): 719972
	Average resident set size (kbytes): 0
	Major (requiring I/O) page faults: 0
	Minor (reclaiming a frame) page faults: 183366
	Voluntary context switches: 1460
	Involuntary context switches: 183
	Swaps: 0
	File system inputs: 0
	File system outputs: 224
	Socket messages sent: 0
	Socket messages received: 0
	Signals delivered: 0
	Page size (bytes): 4096
	Exit status: 0
