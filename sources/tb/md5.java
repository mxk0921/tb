package tb;

import android.text.TextUtils;
import com.alibaba.android.bindingx.core.a;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class md5 implements a.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Map<String, a.g> f23967a = new HashMap();

    static {
        t2o.a(444596645);
        t2o.a(87031833);
    }

    @Override // com.alibaba.android.bindingx.core.a.d
    public void a(String str, a.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26e51eab", new Object[]{this, str, gVar});
        } else {
            g(str);
        }
    }

    @Override // com.alibaba.android.bindingx.core.a.d
    public void b(String str, a.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6357c288", new Object[]{this, str, gVar});
        } else {
            h(str, gVar);
        }
    }

    public a.g c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a.g) ipChange.ipc$dispatch("6134a6ea", new Object[]{this, str});
        }
        if (this.f23967a == null || TextUtils.isEmpty(str)) {
            return null;
        }
        return this.f23967a.get(str);
    }

    public void d(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5fd6666", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        a.g c = c(str);
        if (c != null) {
            c.i(i, i2);
        }
    }

    public void e(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdae692d", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        a.g c = c(str);
        if (c != null) {
            c.a();
        }
    }

    public void f(String str, int i, int i2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a671358d", new Object[]{this, str, new Integer(i), new Integer(i2), jSONObject});
            return;
        }
        a.g c = c(str);
        if (c != null) {
            c.l(i, i2);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("158785e9", new Object[]{this, str});
        } else if (this.f23967a != null && !TextUtils.isEmpty(str)) {
            this.f23967a.remove(str);
        }
    }

    public void h(String str, a.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8987e36", new Object[]{this, str, gVar});
            return;
        }
        if (this.f23967a == null) {
            this.f23967a = new HashMap();
        }
        this.f23967a.put(str, gVar);
    }
}
