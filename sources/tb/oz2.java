package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.nio.ByteBuffer;
import java.nio.ShortBuffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class oz2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int MODE_NV21 = 0;

    /* renamed from: a  reason: collision with root package name */
    public final ByteBuffer f25759a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final boolean i;

    static {
        t2o.a(245366900);
    }

    public oz2() {
    }

    public ByteBuffer a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ByteBuffer) ipChange.ipc$dispatch("4536ce3f", new Object[]{this});
        }
        return this.f25759a;
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a62067ae", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public int c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd49bc13", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d006f05", new Object[]{this, new Boolean(z)});
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "CameraData{, mColorWidth=" + this.b + ", mColorHeight=" + this.c + ", mColorFrameMode=" + this.d + ", mDepthWidth=" + this.e + ", mDepthHeight=" + this.f + ", mPreviewWidth=" + this.g + ", mPreviewHeight=" + this.h + ", mMirror=" + this.i + '}';
    }

    public oz2(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7) {
        this(byteBuffer, i, i2, i3, shortBuffer, i4, i5, i6, i7, false);
    }

    public oz2(ByteBuffer byteBuffer, int i, int i2, int i3, ShortBuffer shortBuffer, int i4, int i5, int i6, int i7, boolean z) {
        this.f25759a = byteBuffer;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = z;
    }
}
