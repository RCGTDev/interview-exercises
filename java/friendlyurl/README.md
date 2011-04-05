# Friendly URL Pair Programming Exercise

The goal of this exercise is to use TDD to write a method/methods that can generate search engine friendly URL slugs
such as "aunt-millies-and-co-inc" from strings such as "Aunt Millie's & Co., Inc" so you can build URL's like:

http://dining.com/restaurants/aunt-millies-and-co-inc

1. Use TDD to work through adding more cases to see how the interviewee works with string manipulation and regex's
2. Discuss string capitalization... is the URI case sensitive and should you downcase the slugs or retain case?
3. Discuss SEO, is there a difference between http://foo.com?p1=x&p2=y and http://foo.com?p2=y&p1=x and why?
4. Discuss how the candidate has built search engine friendly URL's in the framework they usually use
