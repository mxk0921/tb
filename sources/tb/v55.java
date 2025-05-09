package tb;

import android.util.Base64;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.android.ultron.datamodel.imp.ParseModule;
import com.taobao.android.ultron.datamodel.imp.a;
import com.taobao.android.ultronx.engine.UltronEngine;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class v55 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean c;
    public JSONObject e;
    public String f;
    public UltronEngine g;

    /* renamed from: a  reason: collision with root package name */
    public final ParseModule f29788a = new ParseModule();
    public ptd b = new a();
    public final eq6 d = new eq6();

    static {
        t2o.a(83886155);
    }

    public v55(String str, boolean z) {
        new arl();
        this.c = true;
        this.f = str;
        this.c = z;
        s();
    }

    public static String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4f06f88d", new Object[]{str});
        }
        try {
            return c(str.getBytes("utf-8"));
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public DMComponent d(u55 u55Var, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DMComponent) ipChange.ipc$dispatch("7e90a31b", new Object[]{this, u55Var, jSONObject, str});
        }
        return this.f29788a.c(u55Var, jSONObject, str);
    }

    public List<IDMComponent> e(u55 u55Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6f3daf3", new Object[]{this, u55Var, str});
        }
        return this.f29788a.i(u55Var, str);
    }

    public eq6 f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (eq6) ipChange.ipc$dispatch("3ad4985a", new Object[]{this});
        }
        return this.d;
    }

    public JSONObject g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2d156cb", new Object[]{this});
        }
        return this.e;
    }

    public IDMComponent h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("17ba7e90", new Object[]{this});
        }
        return this.f29788a.o();
    }

    public boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d9ab717f", new Object[]{this})).booleanValue();
        }
        return this.f29788a.r();
    }

    public void k(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df6a5aef", new Object[]{this, u55Var});
        } else {
            this.f29788a.G(u55Var);
        }
    }

    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8853690d", new Object[]{this, str});
            return;
        }
        this.f = str;
        s();
    }

    public void m(List<IDMComponent> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df4bea29", new Object[]{this, list});
        } else {
            this.f29788a.N(list);
        }
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21ea1b9e", new Object[]{this, new Boolean(z)});
        } else {
            this.f29788a.P(z);
        }
    }

    public void o(kz kzVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("61472130", new Object[]{this, kzVar});
        } else {
            this.f29788a.R(kzVar);
        }
    }

    public void p(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f8f7f1", new Object[]{this, new Boolean(z)});
        } else {
            this.f29788a.Q(z);
        }
    }

    public void q(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbd47f91", new Object[]{this, new Boolean(z)});
        } else {
            this.f29788a.S(z);
        }
    }

    public void r(ptd ptdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("616284df", new Object[]{this, ptdVar});
        } else if (ptdVar != null) {
            this.b = ptdVar;
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ce96ad0", new Object[]{this});
        } else if (this.g == null && ycv.a(this.f)) {
            this.g = UltronEngine.generateUltronEngine();
        }
    }

    public String t(u55 u55Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("287dd7f2", new Object[]{this, u55Var});
        }
        String jSONString = JSON.toJSONString(((a) this.b).e(u55Var));
        if (this.c) {
            return b(jSONString);
        }
        return jSONString;
    }

    public static String c(byte[] bArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f9053530", new Object[]{bArr});
        }
        byte[] a2 = zcv.a(bArr);
        if (a2 == null) {
            return "";
        }
        try {
            return Base64.encodeToString(a2, 0);
        } catch (Exception e) {
            hav.a("zipCompressError", e.getMessage());
            return "";
        }
    }

    public String a(u55 u55Var, IDMComponent iDMComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f120e1e", new Object[]{this, u55Var, iDMComponent});
        }
        JSONObject a2 = this.b.a(u55Var, iDMComponent);
        if (!this.c) {
            return JSON.toJSONString(a2);
        }
        if (vav.a(u55Var.getBizName(), "ultronGZipCompressWithBytes", false)) {
            return c(JSON.toJSONBytes(a2, SerializeConfig.globalInstance, new SerializerFeature[0]));
        }
        return b(JSON.toJSONString(a2));
    }

    public boolean j(u55 u55Var, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6a902a6b", new Object[]{this, u55Var, jSONObject, str})).booleanValue();
        }
        if (this.g == null || !ycv.a(this.f) || u55Var.P()) {
            this.e = jSONObject;
            long currentTimeMillis = System.currentTimeMillis();
            u55Var.V();
            boolean u = this.f29788a.u(u55Var, jSONObject);
            Log.e("ultronXPerformance", "normal ultron parse cost:" + (System.currentTimeMillis() - currentTimeMillis));
            return u;
        }
        long currentTimeMillis2 = System.currentTimeMillis();
        this.f29788a.v(u55Var, jSONObject, this.g, str);
        Log.e("ultronXPerformance", "ultronX parse cost:" + (System.currentTimeMillis() - currentTimeMillis2));
        return true;
    }
}
