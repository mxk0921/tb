package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class c0z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final byte ARRAY16 = 49;
    public static final byte ARRAY32 = 50;
    public static final byte ARRAY8 = 48;
    public static final byte CONST_INDEX = -125;
    public static final byte DOUBLE = 39;
    public static final byte EVENT_EXPRESSION_INDEX = -126;
    public static final byte EXPRESSION_INDEX = -127;
    public static final byte FALSE = 36;
    public static final byte FIX_STR_MASK = -32;
    public static final byte FLOAT = 38;
    public static final byte INT16 = 45;
    public static final byte INT32 = 46;
    public static final byte INT64 = 47;
    public static final byte INT8 = 44;
    public static final byte LIST16 = 52;
    public static final byte LIST32 = 53;
    public static final byte LIST8 = 51;
    public static final byte MAP16 = 55;
    public static final byte MAP32 = 56;
    public static final byte MAP8 = 54;
    public static final byte NULL = 35;
    public static final byte STATE = Byte.MIN_VALUE;
    public static final byte STR16 = 33;
    public static final byte STR32 = 34;
    public static final byte STR8 = 32;
    public static final byte TRUE = 37;
    public static final byte UINT16 = 41;
    public static final byte UINT32 = 42;
    public static final byte UINT64 = 43;
    public static final byte UINT8 = 40;

    static {
        t2o.a(598737429);
    }

    public static final boolean a(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1cbf8533", new Object[]{new Byte(b)})).booleanValue();
        }
        if (((byte) (b & FIX_STR_MASK)) == 0) {
            return true;
        }
        return false;
    }
}
