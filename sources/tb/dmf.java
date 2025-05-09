package tb;

import android.app.Activity;
import android.view.View;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class dmf {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f17917a;
    public boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
        void B(boolean z, Integer num, String str);

        void j(boolean z, View view);

        void k();

        void n(boolean z, Integer num, String str);

        int u(int i);
    }

    static {
        t2o.a(481297221);
    }

    public dmf(a aVar) {
        this.f17917a = aVar;
    }

    public abstract boolean a();

    public abstract void b();

    public abstract void c(String str, String str2, Map<String, ? extends Object> map);

    public final a d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("217a5a9", new Object[]{this});
        }
        return this.f17917a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1fac80f9", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public abstract void f(Activity activity, Map<String, String> map);

    public abstract void g();

    public abstract void h();

    public void i(Integer num) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4537c1", new Object[]{this, num});
        }
    }

    public final void j(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("579e1b8b", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public abstract void k();

    public abstract void l();

    public abstract void m(boolean z);

    public abstract void n(JSONArray jSONArray);

    public abstract void o(boolean z);

    public abstract void p(JSONObject jSONObject);

    public abstract void q(JSONObject jSONObject);
}
