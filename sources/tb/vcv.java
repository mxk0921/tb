package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vcv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29925a = false;
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    public boolean e = false;

    static {
        t2o.a(157286681);
    }

    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88758841", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e5f3275", new Object[]{this})).booleanValue();
        }
        return this.f29925a;
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb8d090", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fccb1af2", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public vcv e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vcv) ipChange.ipc$dispatch("3b9d4996", new Object[]{this, new Boolean(z)});
        }
        this.d = z;
        return this;
    }

    public vcv f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vcv) ipChange.ipc$dispatch("3cbf663a", new Object[]{this, new Boolean(z)});
        }
        this.f29925a = z;
        return this;
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4718c300", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public vcv h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vcv) ipChange.ipc$dispatch("57dacdf7", new Object[]{this, new Boolean(z)});
        }
        this.b = z;
        return this;
    }

    public vcv i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vcv) ipChange.ipc$dispatch("f8cbe554", new Object[]{this, new Boolean(z)});
        }
        this.c = z;
        return this;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("583c0a45", new Object[]{this})).booleanValue();
        }
        return this.c;
    }
}
