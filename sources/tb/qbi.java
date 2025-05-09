package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class qbi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f26652a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h = 0;
    public int i = 0;
    public boolean j = true;
    public final feh k;

    static {
        t2o.a(774897968);
    }

    public qbi() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00ff, code lost:
        if (r1 != false) goto L_0x0101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
        r14 = (int) (r6 * r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0106, code lost:
        r15 = (int) (r3 / r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r1 != false) goto L_0x0106;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 405
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.qbi.a(int, int):void");
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9b371757", new Object[]{this})).intValue();
        }
        return this.h;
    }

    public float c() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c0487f5e", new Object[]{this})).floatValue();
        }
        int i2 = this.f;
        if (i2 <= 0 || (i = this.g) <= 0) {
            return 0.0f;
        }
        return i2 / i;
    }

    public int d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e10b2f7d", new Object[]{this})).intValue();
        }
        return this.g;
    }

    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3b0f3e64", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public void f(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fa8dd2b", new Object[]{this, new Integer(i)});
        } else {
            this.h = i;
        }
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8703ce", new Object[]{this, new Integer(i)});
        } else {
            this.i = i;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20df4e58", new Object[]{this, new Boolean(z)});
        } else {
            this.j = z;
        }
    }

    public void i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("171dcde5", new Object[]{this, new Integer(i)});
            return;
        }
        feh fehVar = this.k;
        AVSDKLog.e(fehVar, "setVideoRotation, rotation=" + i);
        this.e = i;
    }

    public void j(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b886d77", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.c = i;
        this.d = i2;
    }

    public void k(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a29c3881", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        feh fehVar = this.k;
        AVSDKLog.e(fehVar, "setVideoSize, videoWidth=" + i + ", videoHeight=" + i2);
        int i3 = this.e;
        if ((i3 == 90 || i3 == 270) && ja1.t0) {
            this.f26652a = i2;
            this.b = i;
            feh fehVar2 = this.k;
            AVSDKLog.e(fehVar2, "setVideoSize:mEnableFixRotateVideo=true and set original width=" + i2 + ", height=" + i2 + " without rotation=" + this.e);
            return;
        }
        this.f26652a = i;
        this.b = i2;
        feh fehVar3 = this.k;
        AVSDKLog.e(fehVar3, "setVideoSize:mEnableFixRotateVideo=false and set original width=" + i2 + ", height=" + i2 + " with rotation=" + this.e);
    }

    public qbi(String str) {
        this.k = new feh(toString(), str);
    }
}
