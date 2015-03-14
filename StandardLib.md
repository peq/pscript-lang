# Ideas for the Standard Library #

Pscript will not use Natives directly, so the standard library has to wrap all natives.

The standard library should not only copy the native functions signature but improve their usability:

  * make the first parameter the "subject"
  * shorten names and make use of overloading (all destroy methods can be called "destroy" instead of "DestroyEffect" etc.)
  * return a meaningful value, to allow for a fluid style
  * no function should return nothing

Example:
```
// Jass:
set e = AddSpecialEffectTarget("head", u, EXPLOSION_MODEL)
call DestroyEffect(e)

// Pscript:
u.addSpecialEffec("head", EXPLOSION_MODEL).destroy()
```

```
//Jass:
set t = NewTimer()
call AttachObject( t, "target", target )
call AttachReal( t, "damage", damage )
call TimerStart( t, 0.00, false, function HealHolyAmuletTarget )
// note that you should not use handleVars anymore ;)

//Pscript (with fluent API:)
newTimer()
	.attach("target", target)
	.attach("damage", damage)
	.start(0.0, false, function healHolyAmuletTarget )
```