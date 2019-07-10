# Week4Day2-Flicker

What is the difference in RxJava v1 and v2?
⦁	Created Reactive Streams for RxJava in v2.
⦁	Changed implementation string when adding it to gradle.module
⦁	Flowable is the new Observable. Succinctly - it’s a backpressure-enabled base reactive class.
⦁	(Flowable = Observable + backpressure handling)
⦁	has special subscribers called Observer's

2.  What is backpressure?
When you have an observable which emits items so fast that consumer can't keep up with the flow leading to the existence of emitted but unconsumed items.
3.  Describe how the Observer subscriber pattern works?
Observer is a behavioral design pattern that lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.
4.  What is the operators map and flatmap.  How do they differ?
The map() method produces one output value for each input value in the stream. So if there are n elements in the stream, map() operation will produce a stream of n output elements.
