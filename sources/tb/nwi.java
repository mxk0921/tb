package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class nwi {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_CODE = "TopShow";

    /* renamed from: a  reason: collision with root package name */
    public ei2 f24992a;
    public boolean b;
    public final mh2 c;
    public final pwi d = new pwi();

    static {
        t2o.a(573571074);
    }

    public nwi(mh2 mh2Var) {
        this.c = mh2Var;
        mh2Var.h(this);
    }

    public pwi a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pwi) ipChange.ipc$dispatch("c82ab91b", new Object[]{this});
        }
        return this.d;
    }

    public ei2 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ei2) ipChange.ipc$dispatch("1fa7b3f5", new Object[]{this});
        }
        return this.f24992a;
    }

    public mh2 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mh2) ipChange.ipc$dispatch("20feadc5", new Object[]{this});
        }
        return this.c;
    }

    public abstract cq6 d();

    public abstract vu7 e();

    public abstract nj8 f();

    public abstract j0o g();

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4992905f", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public void i(ei2 ei2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6b9086f", new Object[]{this, ei2Var});
        } else {
            this.f24992a = ei2Var;
        }
    }

    public void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8a2db11", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
