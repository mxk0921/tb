package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.request.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class xpq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final kk4<?, a> f31520a;
    public final int b;
    public int c;
    public final int d;
    public boolean e;
    public int f;
    public byte[] g;

    static {
        t2o.a(620757109);
    }

    public xpq(kk4<?, a> kk4Var, int i, int i2) {
        this.f31520a = kk4Var;
        this.d = i;
        this.b = i2;
    }

    public ud8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ud8) ipChange.ipc$dispatch("6be79530", new Object[]{this});
        }
        return new ud8(true ^ e(), this.g, 0, this.f);
    }

    public int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ca45b8c", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public boolean c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2ddccf8a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i2 = this.d;
        if (i2 <= 0 || this.f + i <= i2) {
            return true;
        }
        return false;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f6f240b5", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean e() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3a4c8bfd", new Object[]{this})).booleanValue();
        }
        if (this.g == null || ((i = this.d) > 0 && this.f != i)) {
            return true;
        }
        return false;
    }

    public synchronized boolean f(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7fae6b6b", new Object[]{this, new Integer(i)})).booleanValue();
        }
        int i3 = this.f + i;
        this.f = i3;
        kk4<?, a> kk4Var = this.f31520a;
        if (kk4Var == null) {
            return true;
        }
        int i4 = this.d;
        if (i4 > 0 && (i2 = this.b) > 0) {
            float f = i3 / i4;
            int i5 = (int) ((100.0f * f) / i2);
            if (i5 > this.c || i3 == i4) {
                this.c = i5;
                kk4Var.onProgressUpdate(f);
            }
        }
        if (!this.f31520a.getContext().i()) {
            return true;
        }
        fiv.s("Stream", this.f31520a.getContext(), "Request is cancelled while reading stream", new Object[0]);
        this.f31520a.b();
        this.e = true;
        return false;
    }

    public void g(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b540da15", new Object[]{this, bArr});
        } else {
            this.g = bArr;
        }
    }
}
