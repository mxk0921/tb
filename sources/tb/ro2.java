package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ro2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f27494a;
    public String b;
    public String c;
    public String d;
    public boolean e;

    static {
        t2o.a(729808964);
    }

    public static ro2 a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro2) ipChange.ipc$dispatch("e8e5fe61", new Object[]{str});
        }
        ro2 ro2Var = new ro2();
        ro2Var.d = str;
        ro2Var.c = "Page_Home";
        ro2Var.b = "PageHome";
        ro2Var.f27494a = "home.request." + str;
        ro2Var.e = true;
        return ro2Var;
    }

    public static ro2 b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ro2) ipChange.ipc$dispatch("d61b579a", new Object[]{str, str2, str3});
        }
        ro2 ro2Var = new ro2();
        ro2Var.d = str3;
        ro2Var.c = str;
        ro2Var.b = str;
        ro2Var.f27494a = str2 + ".request." + str3;
        return ro2Var;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4dae8453", new Object[]{this});
        }
        return this.b;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6499dd90", new Object[]{this});
        }
        return this.c;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ec2ae570", new Object[]{this});
        }
        return this.f27494a;
    }

    public boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6db5ffc6", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e6381fa6", new Object[]{this});
        }
        return this.d;
    }

    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fef87d", new Object[]{this})).booleanValue();
        }
        if (TextUtils.isEmpty(this.d) || TextUtils.isEmpty(this.c) || TextUtils.isEmpty(this.b) || TextUtils.isEmpty(this.f27494a)) {
            return false;
        }
        return true;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "BxFeatureParam{invokeId='" + this.f27494a + "', bizIdentifier='" + this.b + "', currentScene='" + this.c + "', requestType='" + this.d + "'}";
    }
}
