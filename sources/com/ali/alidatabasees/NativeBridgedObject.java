package com.ali.alidatabasees;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class NativeBridgedObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f1868a;
    private long mNativePointer;

    static {
        try {
            System.loadLibrary("sqlite3");
            System.loadLibrary("AliDatabaseES");
            f1868a = true;
        } catch (Throwable unused) {
            f1868a = false;
        }
    }

    public NativeBridgedObject(long j) {
        this.mNativePointer = j;
    }

    private native void freeNativeObject();

    public synchronized void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("152aa53e", new Object[]{this});
            return;
        }
        freeNativeObject();
        this.mNativePointer = 0L;
    }

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
        if (f1868a && this.mNativePointer != 0) {
            a();
        }
    }
}
