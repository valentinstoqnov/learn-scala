var assertionsEnabled = true

def myAssert(predicate: => Boolean) =
    if(assertionsEnabled && !predicate)
	throw new AssertionError

myAssert(1 > 0)

//predicate is evaluated before the call to boolAssert
def boolAssert(predicate: Boolean) =
    if(assertionsEnabled && !predicate)
	throw new AssertionError

boolAssert(2 > 3)
