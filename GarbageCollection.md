# Reference Counting #

Every object has a field which counts the references to the object.

For every assignment "set x = blub":
  * decrease refcount of x
  * increase refcount of blub

If refcount reaches zero call the objects onDestroy method and remove it.

If a object is removed the reference count for all objects referenced by the removed object is decreased.

If this is too much work at once a buffer could be used.

The user can handle references himself by calling `blub.incRef` and `blub.decRef`. Typically those functions are only used by library developers who convert an object into an integer and store it somewhere, as this would bypass the reference counting mechanism otherwise.

Classes can be excluded from reference counting by a special keyword `unmanaged`:

```
unmanaged class CyclicClass
	CyclicClass prev
	CyclicClass next
endclass
```

Those classes can be destroyed with `destroy blub`.