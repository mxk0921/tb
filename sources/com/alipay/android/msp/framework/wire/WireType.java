package com.alipay.android.msp.framework.wire;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public enum WireType {
    VARINT(0),
    FIXED64(1),
    LENGTH_DELIMITED(2),
    START_GROUP(3),
    END_GROUP(4),
    FIXED32(5);
    
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int FIXED_32_SIZE = 4;
    public static final int FIXED_64_SIZE = 8;
    public static final int TAG_TYPE_BITS = 3;
    private static final int TAG_TYPE_MASK = 7;
    private final int value;

    WireType(int i) {
        this.value = i;
    }

    public static /* synthetic */ Object ipc$super(WireType wireType, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/wire/WireType");
    }

    public static WireType valueOf(String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (WireType) ipChange.ipc$dispatch("690381d0", new Object[]{str}) : (WireType) Enum.valueOf(WireType.class, str);
    }

    public final int value() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d249f56b", new Object[]{this})).intValue();
        }
        return this.value;
    }

    public static WireType valueOf(int i) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WireType) ipChange.ipc$dispatch("b8dc62f5", new Object[]{new Integer(i)});
        }
        int i2 = i & 7;
        if (i2 == 0) {
            return VARINT;
        }
        if (i2 == 1) {
            return FIXED64;
        }
        if (i2 == 2) {
            return LENGTH_DELIMITED;
        }
        if (i2 == 3) {
            return START_GROUP;
        }
        if (i2 == 4) {
            return END_GROUP;
        }
        if (i2 == 5) {
            return FIXED32;
        }
        throw new IOException("No WireType for type " + i2);
    }
}
