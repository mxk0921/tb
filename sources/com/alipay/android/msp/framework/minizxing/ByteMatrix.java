package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;
import java.lang.reflect.Array;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ByteMatrix {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[][] f3632a;
    public final int b;
    public final int c;

    public ByteMatrix(int i, int i2) {
        this.f3632a = (byte[][]) Array.newInstance(Byte.TYPE, i2, i);
        this.b = i;
        this.c = i2;
    }

    public final void clear(byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d17c96e8", new Object[]{this, new Byte(b)});
            return;
        }
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                this.f3632a[i][i2] = b;
            }
        }
    }

    public final byte get(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec8715e9", new Object[]{this, new Integer(i), new Integer(i2)})).byteValue();
        }
        return this.f3632a[i2][i];
    }

    public final byte[][] getArray() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[][]) ipChange.ipc$dispatch("c1966f36", new Object[]{this});
        }
        return this.f3632a;
    }

    public final int getHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final int getWidth() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fc48d08a", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public final void set(int i, int i2, byte b) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd4fd3", new Object[]{this, new Integer(i), new Integer(i2), new Byte(b)});
        } else {
            this.f3632a[i2][i] = b;
        }
    }

    public final String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder((this.b * 2 * this.c) + 2);
        for (int i = 0; i < this.c; i++) {
            for (int i2 = 0; i2 < this.b; i2++) {
                byte b = this.f3632a[i][i2];
                if (b == 0) {
                    sb.append(" 0");
                } else if (b != 1) {
                    sb.append("  ");
                } else {
                    sb.append(" 1");
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public final void set(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cd6a1a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.f3632a[i2][i] = (byte) i3;
        }
    }

    public final void set(int i, int i2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17cda9eb", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
        } else {
            this.f3632a[i2][i] = z ? (byte) 1 : (byte) 0;
        }
    }
}
