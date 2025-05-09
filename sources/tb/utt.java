package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.FandomInfo;
import com.taobao.taolive.sdk.model.common.FandomPreLiveInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class utt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29609a;
    public int b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    static {
        t2o.a(806356079);
    }

    public utt(txb txbVar) {
    }

    public FandomInfo a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6c3d3d9", new Object[]{this});
        }
        if (v2s.o().l() == null || !(v2s.o().l().g() instanceof FandomInfo)) {
            return null;
        }
        return (FandomInfo) v2s.o().l().g();
    }

    public FandomInfo b(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomInfo) ipChange.ipc$dispatch("6d047dc0", new Object[]{this, tBLiveDataModel});
        }
        if (tBLiveDataModel == null && v2s.o().l() != null && (v2s.o().l().b() instanceof TBLiveDataModel)) {
            tBLiveDataModel = (TBLiveDataModel) v2s.o().l().b();
        }
        if (tBLiveDataModel != null) {
            return tBLiveDataModel.mFandomInfo;
        }
        return null;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("90694151", new Object[]{this});
        }
        return this.g;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4275211", new Object[]{this});
        }
        return this.e;
    }

    public FandomPreLiveInfo e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FandomPreLiveInfo) ipChange.ipc$dispatch("700d8e71", new Object[]{this});
        }
        return null;
    }

    public String f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("739809c", new Object[]{this});
        }
        return this.c;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f8a06fee", new Object[]{this});
        }
        return this.d;
    }

    public int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59018301", new Object[]{this})).intValue();
        }
        return this.b;
    }

    public String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d81a8ab3", new Object[]{this});
        }
        return this.f;
    }

    public boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("82c90a1f", new Object[]{this})).booleanValue();
        }
        if (a() != null) {
            return true;
        }
        return false;
    }

    public boolean k(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47d21958", new Object[]{this, tBLiveDataModel})).booleanValue();
        }
        if (b(tBLiveDataModel) != null) {
            return true;
        }
        return false;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9bf4e7e", new Object[]{this})).booleanValue();
        }
        return this.f29609a;
    }

    public void m(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61089145", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void o(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2494ab85", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("731bccd2", new Object[]{this, new Boolean(z)});
        } else {
            this.f29609a = z;
        }
    }

    public void q(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7adc1c2", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void r(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e34308b0", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void s(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd5f3729", new Object[]{this, new Integer(i)});
        } else {
            this.b = i;
        }
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67795a23", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
