package com.alipay.android.msp.framework.minizxing;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BlockPair {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f3631a;
    public final byte[] b;

    public BlockPair(byte[] bArr, byte[] bArr2) {
        this.f3631a = bArr;
        this.b = bArr2;
    }

    public final byte[] getDataBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("370463eb", new Object[]{this});
        }
        return this.f3631a;
    }

    public final byte[] getErrorCorrectionBytes() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (byte[]) ipChange.ipc$dispatch("6e39051b", new Object[]{this});
        }
        return this.b;
    }
}
