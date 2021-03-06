package jadx.core.dex.instructions;

public enum InsnType {

	CONST,
	CONST_STR,
	CONST_CLASS,

	ARITH,
	NEG,
	NOT,

	MOVE,
	CAST,

	RETURN,
	GOTO,

	THROW,
	MOVE_EXCEPTION,

	CMP_L,
	CMP_G,
	IF,
	SWITCH,

	MONITOR_ENTER,
	MONITOR_EXIT,

	CHECK_CAST,
	INSTANCE_OF,

	ARRAY_LENGTH,
	FILL_ARRAY,
	FILLED_NEW_ARRAY,

	AGET,
	APUT,

	NEW_ARRAY,
	NEW_INSTANCE,

	IGET,
	IPUT,

	SGET,
	SPUT,

	INVOKE,

	// *** Additional instructions ***

	// replacement for removed instructions
	NOP,

	TERNARY,
	CONSTRUCTOR,

	BREAK,
	CONTINUE,

	// strings concatenation
	STR_CONCAT,

	// just generate one argument
	ONE_ARG,
	PHI,

	// fake insn to keep arguments which will be used in regions codegen
	REGION_ARG,

	// TODO: now multidimensional arrays created using Array.newInstance function
	NEW_MULTIDIM_ARRAY
}
