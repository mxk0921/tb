package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.teb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p5a implements x2e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public x4a f25890a;
    public x4a b;
    public x4a c;
    public x4a d;
    public x4a e;
    public final xs6 f;
    public final q5a g;
    public final boolean h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements teb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(p5a p5aVar, JSONObject jSONObject, String[] strArr) {
        }
    }

    static {
        t2o.a(487587949);
        t2o.a(487587965);
    }

    public p5a(xs6 xs6Var, imi imiVar, boolean z) {
        this.h = z;
        this.f = xs6Var;
        this.g = new q5a(xs6Var, imiVar);
        c();
    }

    public final void A(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a5fae75", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("ViewClick", this.c, strArr, jSONObject);
    }

    public final void B(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9ddc881", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("ViewClick", this.d, strArr, jSONObject);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("edcc83ca", new Object[]{this});
        }
        if (this.h) {
            return "recommend_home_main";
        }
        return i2b.HOMEPAGE_NEWFACE;
    }

    public final JSONObject b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("3a85ae99", new Object[]{this, jSONObject});
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject("bizParam");
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
            jSONObject.put("bizParam", (Object) jSONObject2);
        }
        jSONObject2.put(q5a.c, (Object) Boolean.TRUE);
        return jSONObject;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb1a5fd4", new Object[]{this});
            return;
        }
        this.f25890a = new x4a(a());
        this.b = new x4a(a());
        this.c = new x4a(a() + ".error");
        this.d = new x4a(a() + ".loading");
        this.e = new x4a(a() + ".*.overlay");
    }

    public final boolean d(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f64d28d9", new Object[]{this, strArr, jSONObject})).booleanValue();
        }
        teb a2 = this.f.a(strArr);
        if (a2 != null) {
            return a2.c("PageBack", strArr, jSONObject, new a(this, jSONObject, strArr));
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0135, code lost:
        if (r8.equals("OrderListPrefetchDataConsume") == false) goto L_0x0034;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean e(java.lang.String r8, java.lang.String[] r9, com.alibaba.fastjson.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p5a.e(java.lang.String, java.lang.String[], com.alibaba.fastjson.JSONObject):boolean");
    }

    public final void f(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("814254cb", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("ChangeCity", this.f25890a, strArr, jSONObject);
    }

    public final void g(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94f37be", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("ColdStart", this.f25890a, strArr, b(jSONObject));
    }

    public final void h(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221dfb3a", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("PageBack", this.f25890a, strArr, jSONObject);
    }

    public final void i(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d10493dc", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("DeleteOperation", this.e, strArr, jSONObject);
    }

    public final void j(String[] strArr, JSONObject jSONObject) {
        teb b;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("656d65e7", new Object[]{this, strArr, jSONObject});
        } else if (strArr != null && strArr.length == 1 && (b = this.f.b(strArr[0])) != null) {
            b.a("DragEnd", strArr[0], jSONObject);
        }
    }

    public final void k(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f014b672", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("EditionSwitch", this.f25890a, strArr, b(jSONObject));
    }

    public final void l(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f6133a5", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("HotStart", this.f25890a, strArr, b(jSONObject));
    }

    public final void m(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0b9cc1c", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("LoadCache", this.f25890a, strArr, jSONObject);
    }

    public final void n(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("376d841f", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("LocationChanged", this.f25890a, strArr, jSONObject);
    }

    public void o(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5df823", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("OnlyRequest", this.f25890a, strArr, b(jSONObject));
    }

    public final void p(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("87b5243b", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("OnlyUiRefresh", this.f25890a, strArr, b(jSONObject));
    }

    public void q(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed2984d6", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g("OrderListPrefetchDataConsume", this.f25890a, strArr, b(jSONObject));
    }

    public void r(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c29803", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        this.g.g(ael.GROUP, this.f25890a, strArr, b(jSONObject));
    }

    public final void s(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94d350a6", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        if (!d(strArr, jSONObject)) {
            this.g.g("PageBack", this.f25890a, strArr, jSONObject);
        }
    }

    public final void t(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58f15c69", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("PageEnter", this.f25890a, strArr, jSONObject);
    }

    public final void u(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74dbd233", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("PageSwitch", this.f25890a, strArr, jSONObject);
    }

    public final void v(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("436eaba8", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("Preview", this.f25890a, strArr, jSONObject);
    }

    public final void w(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f7546b6", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("PullToRefresh", this.f25890a, strArr, b(jSONObject));
    }

    public final void x(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6694b6a", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("HomeTabAppear", this.f25890a, strArr, jSONObject);
    }

    public final void y(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afe319f", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.k()};
        }
        if (strArr.length >= 1 && this.h) {
            jSONObject.put("containerId", (Object) strArr[0]);
        }
        this.g.g("ViewAppear", this.b, strArr, jSONObject);
    }

    public final void z(String[] strArr, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43f19e3e", new Object[]{this, strArr, jSONObject});
            return;
        }
        if (strArr == null) {
            strArr = new String[]{this.f.i(), this.f.k()};
        }
        this.g.g("UserLogin", this.f25890a, strArr, b(jSONObject));
    }
}
