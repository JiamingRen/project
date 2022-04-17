# Bundle Calculator

## Context
Social media Influencers have been basing the price of their social media post on a single post basis. So If a brand required 10 posts (for example spread over a period) then they would be charged 10x the cost of a single post. One company has decided to allow social media influencers to sell posts in bundles and charge the brand on a per bundle basis. So if the Influencer sold image based posts in bundles of 5 and 10 and brand ordered 15 they would get a bundle of 10 and a bundle of 5.

The company currently allows the influencer to monitize the following submission formats:

Submission format | Format code | Bundles
----------------- | ----------- | -------
Image | IMG | 5 @ $450 10 @ $800
Audio | Flac | 3 @ $427.50 6 @ $810 9 @ $1147.50
Video | VID | 3 @ $570 5 @ $900 9 @ $1530

## Task

Given a brands order, you are required to determine the cost and bundle breakdown for each submission format. For simplicity, each order should contain the minimal number of bundles.

### Input:
Each order has a series of lines with each line containing the number of items followed by the submission format code
An example input:
```
10 IMG
15 FLAC
13 VID
```

### Output:
A successfully passing test(s) that demonstrates the following output: (The format of the output is not important)
```
10 IMG $800
  1 x 10 $800
15 FLAC $1957.50
  1 x 9 $1147.50
  1 x 6 $810
13 VID $2370
  2 x 5 $1800
  1 x 3 $570
```

Solution:
Given a bundle size [10,5], iterate all the possible combinations of 10.

set the input number is 16

step 1: 16 divided by 10, we get 1.6. The whole number 1 is the amount of a combination of 10 

step 2: find remainder. Use previous total remaining (16) minus the amount of previsous combination
16 - 1 x 10 = 6

step 3: Use the mext bundle size repeat step 1 and 2.

repeat step 1, 2, 3 until all possible combinations are fund.

Run:
Require java 1.8


