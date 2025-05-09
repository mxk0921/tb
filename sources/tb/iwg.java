package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class iwg {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f21610a;
    public String b;
    public Map<String, String> c;
    public boolean d;
    public String e;
    public final txb f;
    public ux9 g;

    static {
        t2o.a(806356075);
    }

    public iwg(txb txbVar) {
        this.f = txbVar;
    }

    public Map<String, String> a() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("a3dbecd9", new Object[]{this});
        }
        if (this.c == null) {
            this.c = new HashMap();
        }
        ux9 ux9Var = this.g;
        if (!(ux9Var == null || ux9Var.j() == null || this.g.j().k() == null || this.g.j().k().q() == null)) {
            haa q = this.g.j().k().q();
            jaa X0 = this.g.j().k().X0();
            ((HashMap) this.c).put("spmCnt", q.F());
            ((HashMap) this.c).put("entrySpm", q.n());
            ((HashMap) this.c).put("spmUrl", q.E());
            ((HashMap) this.c).put("entryLiveSource", q.g());
            ((HashMap) this.c).put("pvId", q.A());
            ((HashMap) this.c).put("feedtype", q.s());
            ((HashMap) this.c).put("liveSource", q.L());
            ((HashMap) this.c).put("clickId", X0.n());
        }
        txb txbVar = this.f;
        if (!(txbVar == null || txbVar.p0() == null)) {
            jwg p0 = this.f.p0();
            Map<String, String> map = this.c;
            if (p0.e()) {
                str = "1";
            } else {
                str = "";
            }
            ((HashMap) map).put("ad", str);
        }
        txb txbVar2 = this.f;
        if (!(txbVar2 == null || txbVar2.Q0() == null)) {
            ((HashMap) this.c).put("kandianId", this.f.Q0().f());
        }
        txb txbVar3 = this.f;
        if (!(txbVar3 == null || txbVar3.W1() == null)) {
            ((HashMap) this.c).put("watchId", this.f.W1().b());
        }
        ((HashMap) this.c).put("accountId", this.f21610a);
        ((HashMap) this.c).put("contentId", this.b);
        ((HashMap) this.c).put("originPage", "Livewatch");
        ((HashMap) this.c).put("appKey", "21646297");
        ((HashMap) this.c).putAll(c());
        return this.c;
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8af78969", new Object[]{this});
        }
        return this.e;
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("800f189c", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public void e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12b18302", new Object[]{this, str});
        } else {
            this.f21610a = str;
        }
    }

    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a23734cf", new Object[]{this, str});
        } else {
            this.b = str;
        }
    }

    public void g(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        } else {
            this.g = ux9Var;
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91b75a74", new Object[]{this, new Boolean(z)});
        } else {
            this.d = z;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ae32b2d", new Object[]{this, str});
        } else {
            this.e = str;
        }
    }

    public final Map<String, String> c() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("ac9e03ca", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        try {
            ux9 ux9Var = this.g;
            if (!(ux9Var == null || ux9Var.j() == null || this.g.j().k() == null || this.g.j().k().q() == null)) {
                String z = this.g.j().k().q().z();
                if (TextUtils.isEmpty(z)) {
                    return hashMap;
                }
                Uri parse = Uri.parse(z);
                Set<String> queryParameterNames = parse.getQueryParameterNames();
                if (queryParameterNames.contains("boostType")) {
                    hashMap.put("boostType", parse.getQueryParameter("boostType"));
                }
                if (queryParameterNames.contains("isBoost")) {
                    hashMap.put("isBoost", parse.getQueryParameter("isBoost"));
                }
                for (String str : qvs.y0().split(",")) {
                    if (queryParameterNames.contains(str)) {
                        hashMap.put(str, parse.getQueryParameter(str));
                    }
                }
            }
        } catch (Exception e) {
            o3s.b("LiveBasicData", "getOtherInteractiveParams catch exception:" + e.getMessage());
        }
        return hashMap;
    }
}
