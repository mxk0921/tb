package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class abq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public oz8 f15645a;

    static {
        t2o.a(989856189);
    }

    public abq() {
    }

    public raq a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (raq) ipChange.ipc$dispatch("4e991149", new Object[]{this});
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            return oz8Var.a();
        }
        return null;
    }

    public qz8 b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qz8) ipChange.ipc$dispatch("32e5f1bc", new Object[]{this, str});
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            return oz8Var.n(str);
        }
        return null;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8Var.finish();
        }
    }

    public void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a86ec6e4", new Object[]{this, str});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8Var.t(str);
        }
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{this, str});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8Var.log(str);
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e0d08e", new Object[]{this, str});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8Var.A(str);
        }
    }

    public void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe13b42", new Object[]{this, str, str2});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8Var.X(str, str2);
            oz8 oz8Var2 = this.f15645a;
            oz8Var2.log("{\"H5CustomProperty\":\"" + str + "\",\"value\":\"" + str2 + "\"}");
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92722639", new Object[]{this});
            return;
        }
        oz8 oz8Var = this.f15645a;
        if (oz8Var != null) {
            oz8.ERROR_CODE.a(oz8Var, "failed");
        }
    }

    public void i(oz8 oz8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4da32c6", new Object[]{this, oz8Var});
        } else {
            this.f15645a = oz8Var;
        }
    }

    public void j(abq abqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd6524", new Object[]{this, abqVar});
        } else if (abqVar != null) {
            this.f15645a = abqVar.f15645a;
        }
    }

    public abq(oz8 oz8Var) {
        this.f15645a = oz8Var;
    }
}
