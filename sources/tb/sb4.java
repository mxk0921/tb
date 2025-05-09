package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.component.data.Component;
import com.taobao.android.trade.component.data.a;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class sb4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ne8 f27925a = new ne8();
    public final irl b = new irl(this);
    public final a c = new a(this);
    public final avq d = new avq(this);
    public final gc4 e;

    static {
        t2o.a(758120453);
    }

    public sb4(gc4 gc4Var) {
        d();
        this.e = gc4Var;
    }

    public JSONObject a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cdddf1ea", new Object[]{this});
        }
        return this.d.b();
    }

    public ne8 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ne8) ipChange.ipc$dispatch("b969a3b9", new Object[]{this});
        }
        return this.f27925a;
    }

    public gc4 c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gc4) ipChange.ipc$dispatch("f05e9888", new Object[]{this});
        }
        return this.e;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("95bdc386", new Object[]{this});
        } else {
            this.f27925a = new ne8();
        }
    }

    public List<Component> e(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7c934b11", new Object[]{this, jSONObject});
        }
        return this.b.a(jSONObject);
    }

    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b807a61f", new Object[]{this, jSONObject});
        } else {
            this.c.a(jSONObject);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b025b0a", new Object[]{this});
        } else {
            this.c.b();
        }
    }
}
