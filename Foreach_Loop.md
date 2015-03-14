## Syntax ##

### Example ###
```
for unit enemy in enemyGroup
	enemy.kill()

```

### General ###

```
for TYPE VARNAME in EXPR
	BODY

```

### translates to ###

```
val iterator = EXPR.iterator()
while iterator.hasNext()
	TYPE VARNAME = iterator.next()
	BODY
iterator.close()
```

So this loop can be used for anything with an iterator function. Note that [ExtensionFunction](ExtensionFunction.md)s can be used to make native types like group iterable.