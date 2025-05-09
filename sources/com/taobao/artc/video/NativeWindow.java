package com.taobao.artc.video;

import android.view.Surface;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class NativeWindow implements Closeable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public long f10076a;

    static {
        t2o.a(395313320);
    }

    public NativeWindow(Surface surface) {
        if (surface != null) {
            this.f10076a = nInitialize(surface);
            return;
        }
        throw null;
    }

    private static native long nInitialize(Surface surface);

    private static native void nRelease(long j);

    private static native int nSendImage(long j, byte[] bArr);

    private static native int nSetBuffersGeometry(long j, int i, int i2, int i3);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        long j = this.f10076a;
        if (0 != j) {
            nRelease(j);
            this.f10076a = 0L;
        }
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8329687", new Object[]{this});
        } else if (0 == this.f10076a) {
            throw new IllegalStateException();
        }
    }

    public void finalize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a35321a5", new Object[]{this});
        } else {
            close();
        }
    }

    public int g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("99783ff4", new Object[]{this, bArr})).intValue();
        }
        e();
        if (bArr != null) {
            return nSendImage(this.f10076a, bArr);
        }
        throw null;
    }

    public int w(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fa42f64c", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)})).intValue();
        }
        e();
        return nSetBuffersGeometry(this.f10076a, i, i2, i3);
    }
}
