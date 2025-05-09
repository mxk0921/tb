package com.alipay.android.msp.framework.wire;

import com.alipay.android.msp.framework.wire.ProtoEnum;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class EnumAdapter<E extends ProtoEnum> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Comparator<ProtoEnum> e = new Comparator<ProtoEnum>() { // from class: com.alipay.android.msp.framework.wire.EnumAdapter.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public int compare(ProtoEnum protoEnum, ProtoEnum protoEnum2) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? ((Number) ipChange.ipc$dispatch("15075c7f", new Object[]{this, protoEnum, protoEnum2})).intValue() : protoEnum.getValue() - protoEnum2.getValue();
        }
    };

    /* renamed from: a  reason: collision with root package name */
    public final Class<E> f3683a;
    public final int[] b;
    public final E[] c;
    public final boolean d;

    public EnumAdapter(Class<E> cls) {
        this.f3683a = cls;
        E[] enumConstants = cls.getEnumConstants();
        this.c = enumConstants;
        Arrays.sort(enumConstants, e);
        int length = enumConstants.length;
        if (enumConstants[0].getValue() == 1 && enumConstants[length - 1].getValue() == length) {
            this.d = true;
            this.b = null;
            return;
        }
        this.d = false;
        this.b = new int[length];
        for (int i = 0; i < length; i++) {
            this.b[i] = this.c[i].getValue();
        }
    }

    public final E fromInt(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (E) ((ProtoEnum) ipChange.ipc$dispatch("7ae8389c", new Object[]{this, new Integer(i)}));
        }
        if (this.d) {
            i2 = i - 1;
        } else {
            i2 = Arrays.binarySearch(this.b, i);
        }
        try {
            return this.c[i2];
        } catch (IndexOutOfBoundsException unused) {
            throw new IllegalArgumentException("Unknown enum tag " + i + " for " + this.f3683a.getCanonicalName());
        }
    }

    public final int toInt(E e2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2ee9cbed", new Object[]{this, e2})).intValue();
        }
        return e2.getValue();
    }
}
