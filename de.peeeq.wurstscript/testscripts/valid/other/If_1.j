globals
endglobals
function test_init takes nothing returns nothing
	if 2 == 2 then
	call testSuccess()
	else
	call testFail("defect in equality if")
	endif
endfunction

function wurst__init_globals takes nothing returns nothing
endfunction

function main takes nothing returns nothing
	call wurst__init_globals()
	call test_init()
endfunction

