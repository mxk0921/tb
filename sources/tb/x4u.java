package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class x4u {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f31145a;
    public String b;
    public String c;
    public String d;
    public sjl e;

    static {
        t2o.a(628097228);
    }

    public sjl a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (sjl) ipChange.ipc$dispatch("e13662e0", new Object[]{this});
        }
        return this.e;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("60892819", new Object[]{this});
        }
        return this.c;
    }

    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae5420cd", new Object[]{this});
        }
        return this.d;
    }

    public String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("86e72be3", new Object[]{this});
        }
        return this.f31145a;
    }

    public String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4717311b", new Object[]{this});
        }
        return this.b;
    }

    public void f(sjl sjlVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71d96346", new Object[]{this, sjlVar});
        } else {
            this.e = sjlVar;
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("413a4f7d", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93198049", new Object[]{this, str});
        } else {
            this.d = str;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d83c0c5b", new Object[]{this, str});
        } else {
            this.f31145a = str;
        }
    }

    public void j(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b879bb", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TopicInfo{routeMode='" + this.f31145a + "', routeValue='" + this.b + "', fullStreamId='" + this.c + "', routeGroup='" + this.d + "'}";
    }
}
