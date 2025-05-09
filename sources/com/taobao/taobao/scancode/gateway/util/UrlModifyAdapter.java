package com.taobao.taobao.scancode.gateway.util;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.timestamp.TimeStampManager;
import com.taobao.tao.util.StringUtil;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopResponse;
import org.json.JSONArray;
import org.json.JSONObject;
import tb.ssw;
import tb.t2o;
import tb.zsf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class UrlModifyAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<c> f12926a = new ArrayList();
    public boolean b = false;
    public final Map<String, String> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class UrlModifyRequest implements IMTOPDataObject {
        public String API_NAME;
        public boolean NEED_ECODE;
        public boolean NEED_SESSION;
        public String VERSION;
        public String url;

        static {
            t2o.a(760217745);
            t2o.a(589299906);
        }

        private UrlModifyRequest() {
            this.NEED_ECODE = false;
            this.NEED_SESSION = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public HashMap<String, String> f12927a;
        public String b;
        public String c;

        static {
            t2o.a(760217743);
        }

        public b() {
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3045c10c", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String b(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ec474004", new Object[]{bVar, str});
            }
            bVar.b = str;
            return str;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9eccd24d", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String d(b bVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("efcee305", new Object[]{bVar, str});
            }
            bVar.c = str;
            return str;
        }

        public static /* synthetic */ HashMap e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("cbf2435", new Object[]{bVar});
            }
            return bVar.f12927a;
        }

        public static /* synthetic */ HashMap f(b bVar, HashMap hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("cc5e5246", new Object[]{bVar, hashMap});
            }
            bVar.f12927a = hashMap;
            return hashMap;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public b[] f12928a;
        public String b;
        public String c;
        public String d;
        public String e;

        static {
            t2o.a(760217744);
        }

        public c() {
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8bd1200a", new Object[]{cVar});
            }
            return cVar.b;
        }

        public static /* synthetic */ String b(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9f6381be", new Object[]{cVar, str});
            }
            cVar.b = str;
            return str;
        }

        public static /* synthetic */ String c(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("445de069", new Object[]{cVar});
            }
            return cVar.c;
        }

        public static /* synthetic */ String d(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e87a885d", new Object[]{cVar, str});
            }
            cVar.c = str;
            return str;
        }

        public static /* synthetic */ String e(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b5776127", new Object[]{cVar});
            }
            return cVar.d;
        }

        public static /* synthetic */ String f(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7aa8959b", new Object[]{cVar, str});
            }
            cVar.d = str;
            return str;
        }

        public static /* synthetic */ String g(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6e042186", new Object[]{cVar});
            }
            return cVar.e;
        }

        public static /* synthetic */ String h(c cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c3bf9c3a", new Object[]{cVar, str});
            }
            cVar.e = str;
            return str;
        }

        public static /* synthetic */ b[] i(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b[]) ipChange.ipc$dispatch("cf5f39b8", new Object[]{cVar});
            }
            return cVar.f12928a;
        }

        public static /* synthetic */ b[] j(c cVar, b[] bVarArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b[]) ipChange.ipc$dispatch("58136f9", new Object[]{cVar, bVarArr});
            }
            cVar.f12928a = bVarArr;
            return bVarArr;
        }
    }

    static {
        t2o.a(760217740);
    }

    public UrlModifyAdapter() {
        try {
            this.c = OrangeConfig.getInstance().getConfigs("scancode_url_mapping");
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static /* synthetic */ void a(UrlModifyAdapter urlModifyAdapter, String str, String str2, HashMap hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ad40e67", new Object[]{urlModifyAdapter, str, str2, hashMap});
        } else {
            urlModifyAdapter.l(str, str2, hashMap);
        }
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7ec60b9d", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_unify_urlmapping", "true"));
    }

    public final c c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("df87d9d8", new Object[]{this, str});
        }
        if (((ArrayList) this.f12926a).size() != 0 && !TextUtils.isEmpty(str)) {
            Iterator it = ((ArrayList) this.f12926a).iterator();
            while (it.hasNext()) {
                c cVar = (c) it.next();
                if (h(cVar, str)) {
                    return cVar;
                }
            }
        }
        return null;
    }

    public final boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("251a62a0", new Object[]{this, str})).booleanValue();
        }
        return zsf.a(str);
    }

    public void f(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3164c31", new Object[]{this, str, aVar});
        } else if (aVar != null) {
            try {
            } catch (Throwable th) {
                th.printStackTrace();
            }
            if (TextUtils.isEmpty(str)) {
                aVar.a(str);
            } else if (this.c == null) {
                aVar.a(str);
            } else if (!b()) {
                aVar.a(str);
            } else if (!g() || e(str)) {
                if (!this.b) {
                    this.b = true;
                    i(this.c);
                }
                c c2 = c(str);
                if (c2 != null) {
                    l("Page_ScanHome", "UrlMappingSuc", null);
                    k(str, aVar, c2);
                    return;
                }
                aVar.a(str);
            } else {
                aVar.a(str);
            }
        }
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("33ff6fe", new Object[]{this})).booleanValue();
        }
        return "true".equals(OrangeConfig.getInstance().getConfig("android_scancode_client", "enable_check_out_url", "true"));
    }

    public final void k(final String str, final a aVar, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55535ca9", new Object[]{this, str, aVar, cVar});
            return;
        }
        UrlModifyRequest urlModifyRequest = new UrlModifyRequest();
        urlModifyRequest.url = str;
        urlModifyRequest.API_NAME = c.a(cVar);
        urlModifyRequest.VERSION = c.c(cVar);
        RemoteBusiness registeListener = RemoteBusiness.build((IMTOPDataObject) urlModifyRequest).registeListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.taobao.scancode.gateway.util.UrlModifyAdapter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "requestfail");
                UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                aVar.a(str);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                try {
                    String string = new JSONObject(new String(mtopResponse.getBytedata())).getJSONObject("data").getString("result");
                    if (!TextUtils.isEmpty(string)) {
                        aVar.a(string);
                        UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenSuc", null);
                        return;
                    }
                    throw new NullPointerException();
                } catch (Throwable unused) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("reason", "nourlreturn");
                    UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                    aVar.a(str);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                HashMap hashMap = new HashMap();
                hashMap.put("reason", "requestsystemerror");
                UrlModifyAdapter.a(UrlModifyAdapter.this, "Page_ScanHome", "UrlMappingOpenFail", hashMap);
                aVar.a(str);
            }
        });
        registeListener.reqMethod(MethodEnum.GET);
        registeListener.startRequest();
    }

    public final void l(String str, String str2, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("772d4700", new Object[]{this, str, str2, hashMap});
            return;
        }
        try {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(str, 2201, str2, null, null, hashMap).build());
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final boolean e(String str) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f40b560", new Object[]{this, str})).booleanValue();
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (ssw.j(str) || d(str)) {
            z = false;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("time", (SystemClock.elapsedRealtime() - elapsedRealtime) + "");
        l("Page_ScanHome", "innerUrlSpendTime", hashMap);
        return z;
    }

    public final boolean h(c cVar, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe1aca23", new Object[]{this, cVar, str})).booleanValue();
        }
        if (cVar != null) {
            try {
                if (!StringUtil.isEmpty(str)) {
                    long currentTimeStamp = TimeStampManager.instance().getCurrentTimeStamp();
                    long parseLong = TextUtils.isEmpty(c.e(cVar)) ? 0L : Long.parseLong(c.e(cVar));
                    if (parseLong == 0 || parseLong <= currentTimeStamp) {
                        long parseLong2 = TextUtils.isEmpty(c.g(cVar)) ? 0L : Long.parseLong(c.g(cVar));
                        if (parseLong2 == 0 || parseLong2 >= currentTimeStamp) {
                            b[] i = c.i(cVar);
                            if (i == null) {
                                HashMap<String, String> hashMap = new HashMap<>();
                                hashMap.put("reason", "norules");
                                l("Page_ScanHome", "UrlMappingOpenFail", hashMap);
                                return false;
                            }
                            Uri parse = Uri.parse(str);
                            if (parse == null) {
                                HashMap<String, String> hashMap2 = new HashMap<>();
                                hashMap2.put("reason", "uriparsefail");
                                l("Page_ScanHome", "UrlMappingOpenFail", hashMap2);
                                return false;
                            }
                            for (b bVar : i) {
                                if (bVar != null && b.a(bVar) != null && b.a(bVar).equalsIgnoreCase(parse.getHost()) && (TextUtils.isEmpty(b.c(bVar)) || b.c(bVar).equals(parse.getPath()))) {
                                    HashMap e = b.e(bVar);
                                    if (e != null) {
                                        for (String str3 : e.keySet()) {
                                            String queryParameter = parse.getQueryParameter(str3);
                                            if (queryParameter == null) {
                                                if (e.get(str3) != null) {
                                                    break;
                                                }
                                            } else if (!queryParameter.equals(e.get(str3))) {
                                                break;
                                            }
                                        }
                                    }
                                    return true;
                                }
                            }
                            return false;
                        }
                        HashMap<String, String> hashMap3 = new HashMap<>();
                        hashMap3.put("reason", "outoftime");
                        l("Page_ScanHome", "UrlMappingOpenFail", hashMap3);
                        return false;
                    }
                    HashMap<String, String> hashMap4 = new HashMap<>();
                    hashMap4.put("reason", "outoftime");
                    l("Page_ScanHome", "UrlMappingOpenFail", hashMap4);
                    return false;
                }
            } catch (Throwable th) {
                HashMap<String, String> hashMap5 = new HashMap<>();
                if (th.getMessage() == null) {
                    str2 = "no_Msg";
                } else {
                    str2 = th.getMessage();
                }
                hashMap5.put("needmodifyfindexp", str2);
                l("Page_ScanHome", "UrlMappingOpenFail", hashMap5);
            }
        }
        return false;
    }

    public final void i(Map<String, String> map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c0e9db", new Object[]{this, map});
        } else if (map != null) {
            for (int i = 0; i < map.size(); i++) {
                try {
                    j(new JSONObject(map.get(i + "")));
                } catch (Throwable th) {
                    th.printStackTrace();
                    ((ArrayList) this.f12926a).clear();
                    HashMap<String, String> hashMap = new HashMap<>();
                    if (th.getMessage() == null) {
                        str = "no_Msg";
                    } else {
                        str = th.getMessage();
                    }
                    hashMap.put("parsefindexp", str);
                    l("Page_ScanHome", "UrlMappingOpenFail", hashMap);
                    return;
                }
            }
        }
    }

    public final void j(JSONObject jSONObject) throws Throwable {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c778e141", new Object[]{this, jSONObject});
            return;
        }
        c cVar = new c();
        c.f(cVar, jSONObject.has("startTime") ? jSONObject.getString("startTime") : null);
        c.h(cVar, jSONObject.has("endTime") ? jSONObject.getString("endTime") : null);
        c.b(cVar, jSONObject.getJSONObject("mtopAPI").getString("method"));
        c.d(cVar, jSONObject.getJSONObject("mtopAPI").getString("v"));
        JSONArray jSONArray = jSONObject.getJSONArray(MspGlobalDefine.RULES);
        int length = jSONArray == null ? 0 : jSONArray.length();
        b[] bVarArr = new b[length];
        c.j(cVar, bVarArr);
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            if (jSONObject2 != null) {
                b bVar = new b();
                bVarArr[i] = bVar;
                b.b(bVar, jSONObject2.has("host") ? jSONObject2.getString("host") : null);
                b.d(bVarArr[i], jSONObject2.has("path") ? jSONObject2.getString("path") : null);
                JSONObject jSONObject3 = jSONObject2.has("params") ? jSONObject2.getJSONObject("params") : null;
                if (jSONObject3 != null) {
                    b.f(bVarArr[i], new HashMap());
                    Iterator<String> keys = jSONObject3.keys();
                    if (keys != null) {
                        while (keys.hasNext()) {
                            String next = keys.next();
                            if (next != null) {
                                b.e(bVarArr[i]).put(next, jSONObject3.getString(next));
                            }
                        }
                    }
                }
            }
        }
        ((ArrayList) this.f12926a).add(cVar);
    }
}
