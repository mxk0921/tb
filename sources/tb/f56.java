package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class f56 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte INVALID = 0;
    public static final byte MAX_COUNT = 51;
    public static final byte OP_AS = 36;
    public static final byte OP_AS_OR_NULL = 37;
    public static final byte OP_BIN_ADD = 7;
    public static final byte OP_BIN_DIV = 10;
    public static final byte OP_BIN_MOD = 11;
    public static final byte OP_BIN_MUL = 9;
    public static final byte OP_BIN_SUB = 8;
    public static final byte OP_BOOL_AND = 20;
    public static final byte OP_BOOL_EQUAL = 18;
    public static final byte OP_BOOL_LARGER = 14;
    public static final byte OP_BOOL_LARGER_OR_EQUAL = 15;
    public static final byte OP_BOOL_LESS = 16;
    public static final byte OP_BOOL_LESS_OR_EQUAL = 17;
    public static final byte OP_BOOL_NOT = 22;
    public static final byte OP_BOOL_NOT_EQUAL = 19;
    public static final byte OP_BOOL_OR = 21;
    public static final byte OP_CALL_FUNC = 40;
    public static final byte OP_CALL_INNER_FUNC = 43;
    public static final byte OP_CALL_MEGA = 42;
    public static final byte OP_CALL_MEGA_CALLBACK = 50;
    public static final byte OP_COPY_VAR = 4;
    public static final byte OP_GET_BY_DOT = 6;
    public static final byte OP_GET_BY_INDEX = 5;
    public static final byte OP_GET_CONST = 2;
    public static final byte OP_GET_INNER_FUNC = 45;
    public static final byte OP_GET_OPT_JUMP = 35;
    public static final byte OP_GET_VAR = 1;
    public static final byte OP_GOTO = 33;
    public static final byte OP_GOTO_IF_FALSE = 12;
    public static final byte OP_GOTO_IF_TRUE = 13;
    public static final byte OP_IS = 38;
    public static final byte OP_IS_NOT = 39;
    public static final byte OP_LOAD = 49;
    public static final byte OP_MINIFY_CALL_FUNC = 41;
    public static final byte OP_MINIFY_CALL_INNER_FUNC = 44;
    public static final byte OP_POP_VAR = 3;
    public static final byte OP_PUSH_DOUBLE_64 = 29;
    public static final byte OP_PUSH_FALSE = 24;
    public static final byte OP_PUSH_INT_16 = 26;
    public static final byte OP_PUSH_INT_32 = 27;
    public static final byte OP_PUSH_INT_64 = 28;
    public static final byte OP_PUSH_INT_8 = 25;
    public static final byte OP_PUSH_NULL = 30;
    public static final byte OP_PUSH_TRUE = 23;
    public static final byte OP_PUSH_UNDEFINED = 31;
    public static final byte OP_RETURN = 46;
    public static final byte OP_RETURN_VOID = 47;
    public static final byte OP_STORE = 48;
    public static final byte OP_TYPEOF = 34;
    public static final byte OP_UNARY_MIN = 32;
    public static final int PROP_INDEX_OP_ARGC = 2;
    public static final int PROP_INDEX_OP_ARG_SIZE = 3;
    public static final int PROP_INDEX_OP_NAME = 0;
    public static final int PROP_INDEX_OP_SIZE = 1;
    public static final int PROP_INDEX_OP_STACK_DELTA = 4;

    /* renamed from: a  reason: collision with root package name */
    public static final Object[][] f19019a;

    static {
        int i;
        t2o.a(444597895);
        Object[][] objArr = {new Object[]{v7b.DEFAULT_HTTPS_ERROR_INVALID, 0, 0, new int[0], 0}, new Object[]{"OP_GET_VAR", 2, 1, new int[]{2}, 1}, new Object[]{"OP_GET_CONST", 2, 1, new int[]{2}, 1}, new Object[]{"OP_POP_VAR", 0, 0, new int[0], -1}, new Object[]{"OP_COPY_VAR", 0, 0, new int[0], 1}, new Object[]{"OP_GET_BY_INDEX", 0, 0, new int[0], -1}, new Object[]{"OP_GET_BY_DOT", 2, 1, new int[]{2}, 0}, new Object[]{"OP_BIN_ADD", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_SUB", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_MUL", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_DIV", 0, 0, new int[0], -1}, new Object[]{"OP_BIN_MOD", 0, 0, new int[0], -1}, new Object[]{"OP_GOTO_IF_FALSE", 3, 1, new int[]{3}, -1}, new Object[]{"OP_GOTO_IF_TRUE", 3, 1, new int[]{3}, -1}, new Object[]{"OP_BOOL_LARGER", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LARGER_OR_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LESS", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_LESS_OR_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_NOT_EQUAL", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_AND", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_OR", 0, 0, new int[0], -1}, new Object[]{"OP_BOOL_NOT", 0, 0, new int[0], 0}, new Object[]{"OP_PUSH_TRUE", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_FALSE", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_INT_8", 1, 1, new int[]{1}, 1}, new Object[]{"OP_PUSH_INT_16", 2, 1, new int[]{2}, 1}, new Object[]{"OP_PUSH_INT_32", 4, 1, new int[]{4}, 1}, new Object[]{"OP_PUSH_INT_64", 8, 1, new int[]{8}, 1}, new Object[]{"OP_PUSH_DOUBLE_64", 8, 1, new int[]{8}, 1}, new Object[]{"OP_PUSH_NULL", 0, 0, new int[0], 1}, new Object[]{"OP_PUSH_UNDEFINED", 0, 0, new int[0], 1}, new Object[]{"OP_UNARY_MIN", 0, 0, new int[0], 0}, new Object[]{"OP_GOTO", 3, 1, new int[]{3}, 0}, new Object[]{"OP_TYPEOF", 0, 0, new int[0], 0}, new Object[]{"OP_GET_OPT_JUMP", 3, 1, new int[]{3}, 0}, new Object[]{"OP_AS", 0, 0, new int[0], 0}, new Object[]{"OP_AS_OR_NULL", 0, 0, new int[0], 0}, new Object[]{"OP_IS", 0, 0, new int[0], 0}, new Object[]{"OP_IS_NOT", 0, 0, new int[0], 0}, new Object[]{"OP_CALL_FUNC", 1, 1, new int[]{1}, 0}, new Object[]{"OP_MINIFY_CALL_FUNC", -1, 4, new int[]{2, 1, 2, -1}, 0}, new Object[]{"OP_CALL_MEGA", 9, 3, new int[]{1, 4, 4}, -1}, new Object[]{"OP_CALL_INNER_FUNC", 1, 1, new int[]{1}, 0}, new Object[]{"OP_MINIFY_CALL_INNER_FUNC", 1, 1, new int[]{1}, 0}, new Object[]{"OP_GET_INNER_FUNC", 4, 1, new int[]{4}, 0}, new Object[]{"OP_RETURN", 0, 0, new int[0], -1}, new Object[]{"OP_RETURN_VOID", 0, 0, new int[0], 0}, new Object[]{"OP_STORE", 2, 1, new int[]{2}, -1}, new Object[]{"OP_LOAD", 2, 1, new int[]{2}, 1}, new Object[]{"OP_CALL_MEGA_CALLBACK", 1, 1, new int[]{1}, 0}};
        f19019a = objArr;
        if (objArr.length == 51) {
            int i2 = 0;
            while (i2 < 51) {
                try {
                    Object[][] objArr2 = f19019a;
                    int intValue = ((Integer) objArr2[i2][1]).intValue();
                    int intValue2 = ((Integer) objArr2[i2][2]).intValue();
                    int[] iArr = (int[]) objArr2[i2][3];
                    if (iArr.length == intValue2) {
                        if (intValue == -1) {
                            i = 1;
                        } else {
                            int i3 = 0;
                            for (int i4 = 0; i4 < intValue2; i4++) {
                                i3 += iArr[i4];
                            }
                            i = 1;
                            if (i3 != intValue) {
                                throw new IllegalStateException("size error" + i2);
                            }
                        }
                        i2 += i;
                    } else {
                        throw new IllegalStateException();
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("OP Init error:" + e);
                }
            }
            return;
        }
        throw new IllegalStateException("OP_PROP cnt error");
    }

    public static int a(byte[] bArr, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1aeebe44", new Object[]{bArr, new Integer(i)})).intValue();
        }
        if (i < bArr.length) {
            int i2 = bArr[i] & 255;
            if (i2 < 51) {
                return i2;
            }
            throw new IllegalArgumentException(String.format("Code %02x not a op", Byte.valueOf(bArr[i])));
        }
        throw new IllegalArgumentException("getOpSize pos Overflow");
    }

    public static String b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("764dd246", new Object[]{new Integer(i)});
        }
        return (String) f19019a[i][0];
    }

    public static int c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db59ddd7", new Object[]{new Integer(i)})).intValue();
        }
        return ((Integer) f19019a[i][1]).intValue();
    }
}
