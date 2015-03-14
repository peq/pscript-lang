### static if replacement ###
If the Variables in the if are constant the optimiezr should automatically remove the if + the never used block.


### Features: ###

  * constant globals
  * sized arrays
  * delimited comments /**...**/
  * break keyword for loops
  * custom native declaration (e.g. for the UnitAlive one from common.ai )
  * forced inlining
  * Enumerations with customizable values
  * Some easier way to convert integer/reals to strings
  * template functions
  * Some way of hooking natives and adding code to .j init-functions
  * Integration of vJassdoc ?
  * BuildIn leakcheck
  * 