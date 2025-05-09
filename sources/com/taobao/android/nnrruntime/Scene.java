package com.taobao.android.nnrruntime;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Scene {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f9049a;
    public final a b;
    public long c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface a {
        long a();

        void release();
    }

    static {
        t2o.a(609222663);
    }

    public Scene(long j, a aVar, a aVar2) {
        this.f9049a = aVar;
        this.b = aVar2;
        this.c = j;
    }

    public static Scene c(String str, a aVar, a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Scene) ipChange.ipc$dispatch("14a12f26", new Object[]{str, aVar, aVar2});
        }
        if (!OpenGLUtils.f9045a) {
            return null;
        }
        long nativeCreateFromFile = nativeCreateFromFile(str, aVar.a());
        if (0 == nativeCreateFromFile) {
            return null;
        }
        return new Scene(nativeCreateFromFile, aVar, aVar2);
    }

    public static native long nativeCreateFromBuffer(byte[] bArr, long j);

    public static native long nativeCreateFromFile(String str, long j);

    public static native long nativeGetPosition(long j, String str);

    public static native void nativeRelease(long j);

    public static native int nativeRender(long j, long j2);

    public static native int nativeReplaceFromBuffer(byte[] bArr, long j, String str, String str2, long j2);

    public static native int nativeReplaceFromFile(String str, long j, String str2, String str3, long j2);

    public static native int nativeReset(long j, String str);

    public static native int nativeSetComponent(long j, byte[] bArr, long j2);

    public long a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5180c315", new Object[]{this, str})).longValue();
        }
        long j = this.c;
        if (0 == j) {
            return 0L;
        }
        return nativeGetPosition(j, str);
    }

    public a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("c3bcdf12", new Object[]{this});
        }
        return this.b;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
            return;
        }
        long j = this.c;
        if (0 != j) {
            nativeRelease(j);
            this.c = 0L;
            this.b.release();
            this.f9049a.release();
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("471a0b1d", new Object[]{this});
            return;
        }
        long j = this.c;
        if (0 != j) {
            nativeRender(j, this.b.a());
        }
    }

    public void f(byte[] bArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4599addb", new Object[]{this, bArr, new Long(j)});
            return;
        }
        long j2 = this.c;
        if (0 != j2) {
            nativeSetComponent(j2, bArr, j);
        }
    }

    public void g(float[] fArr, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("459b7f57", new Object[]{this, fArr, new Long(j)});
        } else if (0 != this.c) {
            ByteBuffer allocate = ByteBuffer.allocate(fArr.length * 4);
            allocate.order(ByteOrder.nativeOrder());
            allocate.asFloatBuffer().put(fArr);
            nativeSetComponent(this.c, allocate.array(), j);
        }
    }
}
