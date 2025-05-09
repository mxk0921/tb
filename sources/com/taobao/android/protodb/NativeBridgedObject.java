package com.taobao.android.protodb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.kkj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final long mNativePointer;

    public NativeBridgedObject(long j) {
        this.mNativePointer = j;
    }

    private native void freeNativeObject(long j);

    public Object clone() throws CloneNotSupportedException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("78b3604e", new Object[]{this});
        }
        return super.clone();
    }

    public void finalize() throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
            return;
        }
        super.finalize();
        if (kkj.a()) {
            freeNativeObject(getNativePointer());
        }
    }

    public long getNativePointer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5a8116eb", new Object[]{this})).longValue();
        }
        return this.mNativePointer;
    }
}
