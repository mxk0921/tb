package com.alibaba.analytics.core.config;

import android.net.Uri;
import com.alibaba.analytics.core.config.UTClientConfigMgr;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.f3v;
import tb.hsq;
import tb.nhh;
import tb.t2o;
import tb.wu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static a d = null;

    /* renamed from: a  reason: collision with root package name */
    public final List<f3v> f2116a = new LinkedList();
    public final Map<String, String> b = new HashMap();
    public String c = "";

    static {
        t2o.a(962592851);
    }

    public a() {
        nhh.f("UTMCTPKBiz", "init tpk Content", "[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]");
        c("[{\"kn\":\"adid\",\"ty\":\"nearby\"},{\"kn\":\"ucm\",\"ty\":\"nearby\"},{\"kn\":\"bdid\",\"ty\":\"far\"},{\"kn\":\"ref_pid\",\"ty\":\"far\"},{\"kn\":\"pid\",\"ty\":\"far\"},{\"kn\":\"tpa\",\"ty\":\"far\"},{\"kn\":\"point\",\"ty\":\"far\"},{\"kn\":\"ali_trackid\",\"ty\":\"far\"},{\"kn\":\"xncode\",\"ty\":\"nearby\"},{\"kn\":\"ybhpss\",\"ty\":\"nearby\"},{\"kn\":\"a_n\",\"ty\":\"far\"},{\"kn\":\"i_d\",\"ty\":\"far\"},{\"kn\":\"h_d\",\"ty\":\"far\"},{\"kn\":\"r_n\",\"ty\":\"far\"},{\"kn\":\"uplusRankId\",\"ty\":\"nearby\"}]");
        UTClientConfigMgr.c().e(new C0058a());
    }

    public static /* synthetic */ String e(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("614aede4", new Object[]{aVar});
        }
        return aVar.c;
    }

    public static /* synthetic */ void f(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e24e887", new Object[]{aVar, str});
        } else {
            aVar.c(str);
        }
    }

    public static a i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("654c8cc9", new Object[0]);
        }
        if (d == null) {
            synchronized (a.class) {
                try {
                    if (d == null) {
                        d = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public final void a(f3v f3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d51d98c", new Object[]{this, f3vVar});
        } else if (f3vVar != null && !hsq.f(f3vVar.a())) {
            for (f3v f3vVar2 : this.f2116a) {
                if (f3vVar2.a().equalsIgnoreCase(f3vVar.a())) {
                    this.f2116a.remove(f3vVar2);
                }
            }
            this.f2116a.add(f3vVar);
        }
    }

    public final String b(String str, Uri uri, Map<String, String> map) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97d7ab78", new Object[]{this, str, uri, map});
        }
        if (hsq.f(str)) {
            return null;
        }
        if (str.startsWith("${url|") && str.length() > 7) {
            String substring = str.substring(6, str.length() - 1);
            if (!hsq.f(substring) && uri != null) {
                return uri.getQueryParameter(substring);
            }
        } else if (str.startsWith("${ut|") && str.length() > 6) {
            String substring2 = str.substring(5, str.length() - 1);
            if (!hsq.f(substring2) && map != null) {
                return map.get(substring2);
            }
        } else if (!str.startsWith("${") || str.length() <= 3) {
            return str;
        } else {
            String substring3 = str.substring(2, str.length() - 1);
            if (!hsq.f(substring3)) {
                if (map != null && (str2 = map.get(substring3)) != null) {
                    return str2;
                }
                if (uri != null) {
                    return uri.getQueryParameter(substring3);
                }
            }
        }
        return null;
    }

    public synchronized void g(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db35592f", new Object[]{this, str, str2});
            return;
        }
        if (!hsq.f(str)) {
            if (str2 == null) {
                ((HashMap) this.b).remove(str);
            } else {
                ((HashMap) this.b).put(str, str2);
            }
        }
    }

    public synchronized void h(f3v f3vVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3864901d", new Object[]{this, f3vVar});
            return;
        }
        if (f3vVar != null) {
            a(f3vVar);
            d();
        }
    }

    public synchronized String j(Uri uri, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d549f1", new Object[]{this, uri, map});
        }
        for (f3v f3vVar : this.f2116a) {
            String a2 = f3vVar.a();
            String c = f3vVar.c();
            String b = f3vVar.b();
            if (hsq.f(a2)) {
                return null;
            }
            if (hsq.f((String) ((HashMap) this.b).get(a2))) {
                String b2 = b(b, uri, map);
                if (!hsq.f(b2)) {
                    ((HashMap) this.b).put(a2, b2);
                }
            } else if (!f3v.TYPE_FAR.equals(c)) {
                String b3 = b(b, uri, map);
                if (!hsq.f(b3)) {
                    ((HashMap) this.b).put(a2, b3);
                }
            }
        }
        if (!((HashMap) this.b).containsKey("ttid") && !hsq.f(wu3.c().d())) {
            ((HashMap) this.b).put("ttid", wu3.c().d());
        }
        if (((HashMap) this.b).size() <= 0) {
            return null;
        }
        return "{" + hsq.a(this.b) + "}";
    }

    public synchronized void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17d804f2", new Object[]{this});
        } else {
            ((HashMap) this.b).clear();
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.alibaba.analytics.core.config.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class C0058a implements UTClientConfigMgr.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0058a() {
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public String getKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("16c52370", new Object[]{this});
            }
            return "tpk_string";
        }

        @Override // com.alibaba.analytics.core.config.UTClientConfigMgr.a
        public void onChange(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5bfd17c0", new Object[]{this, str});
                return;
            }
            nhh.f("UTMCTPKBiz", "onChange tpk_string", str);
            if (hsq.f(str) || str.equalsIgnoreCase(a.e(a.this))) {
                nhh.f("UTMCTPKBiz", "tpk_string do not need change");
            } else {
                a.f(a.this, str);
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4324f066", new Object[]{this});
        } else if (nhh.n()) {
            for (f3v f3vVar : this.f2116a) {
                nhh.f("UTMCTPKBiz", "mTPKItems kn", f3vVar.a(), "type", f3vVar.c(), "kv", f3vVar.b());
            }
        }
    }

    public final synchronized void c(String str) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("be55259d", new Object[]{this, str});
            } else if (!hsq.f(str)) {
                nhh.f("UTMCTPKBiz", "_onTPKConfArrive update ConfContent", str);
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    for (int i = 0; i < jSONArray.length(); i++) {
                        JSONObject optJSONObject = jSONArray.optJSONObject(i);
                        if (optJSONObject != null && optJSONObject.has("kn") && !optJSONObject.isNull("kn")) {
                            String string = optJSONObject.getString("kn");
                            if (!"a".equals(string)) {
                                f3v f3vVar = new f3v();
                                String optString = optJSONObject.optString("v");
                                if (hsq.f(optString)) {
                                    optString = "${" + string + "}";
                                }
                                String optString2 = optJSONObject.optString("ty", f3v.TYPE_FAR);
                                f3vVar.d(string);
                                f3vVar.e(optString);
                                f3vVar.f(optString2);
                                a(f3vVar);
                            }
                        }
                    }
                } catch (Exception unused) {
                }
                this.c = str;
            }
        }
    }
}
