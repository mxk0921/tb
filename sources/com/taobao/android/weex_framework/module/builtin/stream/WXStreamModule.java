package com.taobao.android.weex_framework.module.builtin.stream;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.phone.iifaa.did.rpc.model.CredentialRpcData;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstanceImpl;
import com.taobao.android.weex.WeexValue;
import com.taobao.android.weex.module.WeexInnerModule;
import com.taobao.android.weex_framework.devtool.NetworkResourceType;
import com.taobao.android.weex_framework.module.builtin.stream.Options;
import com.taobao.android.weex_framework.ui.MUSMethod;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;
import tb.bxh;
import tb.dwh;
import tb.dxh;
import tb.f4x;
import tb.f7l;
import tb.gpc;
import tb.okq;
import tb.pg1;
import tb.r3x;
import tb.t2o;
import tb.vvh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class WXStreamModule extends WeexInnerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_USER_AGENT = "user-agent";
    public static final String MODULE_NAME = "stream";
    public static final String STATUS = "status";
    public static final String STATUS_TEXT = "statusText";
    private static final String TAG = "WXStreamModule";
    public final gpc mAdapter = r3x.f();
    public static final String[] METHODS = {CredentialRpcData.ACTION_FETCH};
    public static final Pattern CHARSET_PATTERN = Pattern.compile("charset=([a-z0-9-]+)");

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements gpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b f9983a;
        public final f4x b;
        public final JSONObject c;
        public Map<String, String> d;

        static {
            t2o.a(982516186);
            t2o.a(982516042);
        }

        public /* synthetic */ c(b bVar, f4x f4xVar, a aVar) {
            this(bVar, f4xVar);
        }

        @Override // tb.gpc.a
        public void a(dxh dxhVar) {
            String str;
            byte[] bArr;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebddd68c", new Object[]{this, dxhVar});
                return;
            }
            b bVar = this.f9983a;
            if (bVar != null) {
                ((a) bVar).a(dxhVar, this.d);
            }
            if (dwh.r()) {
                if (dxhVar == null || (bArr = dxhVar.b) == null) {
                    str = "response data is NUll!";
                } else {
                    str = new String(bArr);
                }
                dwh.b(WXStreamModule.TAG, str);
            }
        }

        public c(b bVar, f4x f4xVar) {
            this.c = new JSONObject();
            this.f9983a = bVar;
            this.b = f4xVar;
        }

        @Override // tb.gpc.a
        public void onHttpResponseProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c1a5c7", new Object[]{this, new Integer(i)});
                return;
            }
            this.c.put(pg1.ATOM_length, (Object) Integer.valueOf(i));
            f4x f4xVar = this.b;
            if (f4xVar != null) {
                f4xVar.a(this.c);
            }
        }

        @Override // tb.gpc.a
        public void onHttpStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5005ca2", new Object[]{this});
            } else if (this.b != null) {
                this.c.put("readyState", (Object) 1);
                this.c.put(pg1.ATOM_length, (Object) 0);
                this.b.a(this.c);
            }
        }

        @Override // tb.gpc.a
        public void onHeadersReceived(int i, Map<String, List<String>> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6683fc51", new Object[]{this, new Integer(i), map});
                return;
            }
            this.c.put("readyState", (Object) 2);
            this.c.put("status", (Object) Integer.valueOf(i));
            HashMap hashMap = new HashMap();
            if (map != null) {
                for (Map.Entry<String, List<String>> entry : map.entrySet()) {
                    if (entry.getValue().size() != 0) {
                        String str = "_";
                        if (entry.getValue().size() == 1) {
                            if (entry.getKey() != null) {
                                str = entry.getKey();
                            }
                            hashMap.put(str, entry.getValue().get(0));
                        } else {
                            if (entry.getKey() != null) {
                                str = entry.getKey();
                            }
                            hashMap.put(str, entry.getValue().toString());
                        }
                    }
                }
            }
            this.c.put("headers", (Object) hashMap);
            this.d = hashMap;
            f4x f4xVar = this.b;
            if (f4xVar != null) {
                f4xVar.a(this.c);
            }
        }
    }

    static {
        t2o.a(982516183);
    }

    private void extractHeaders(JSONObject jSONObject, Options.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe495c04", new Object[]{this, jSONObject, bVar});
            return;
        }
        String d = vvh.d("system", "userAgent");
        if (jSONObject != null) {
            for (String str : jSONObject.keySet()) {
                if (str.equals("user-agent")) {
                    d = jSONObject.getString(str);
                } else {
                    bVar.b(str, jSONObject.getString(str));
                }
            }
        }
        bVar.b("user-agent", d);
    }

    public static String getHeader(Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9b30007b", new Object[]{map, str});
        }
        if (map == null || str == null) {
            return null;
        }
        if (map.containsKey(str)) {
            return map.get(str);
        }
        return map.get(str.toLowerCase(Locale.ROOT));
    }

    public static /* synthetic */ Object ipc$super(WXStreamModule wXStreamModule, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_framework/module/builtin/stream/WXStreamModule");
    }

    private void sendRequest(Options options, b bVar, f4x f4xVar) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("65bd339d", new Object[]{this, options, bVar, f4xVar});
            return;
        }
        bxh bxhVar = new bxh();
        bxhVar.d = options.c();
        bxhVar.c = options.f();
        bxhVar.e = options.a();
        bxhVar.f = options.d();
        NetworkResourceType networkResourceType = NetworkResourceType.Fetch;
        if (getWeexInstance() != null) {
            i = getWeexInstance().getInstanceId();
        } else {
            i = -1;
        }
        bxhVar.g = new bxh.a(networkResourceType, i);
        if (options.b() != null) {
            ((ConcurrentHashMap) bxhVar.b).putAll(options.b());
        }
        gpc gpcVar = this.mAdapter;
        if (gpcVar == null) {
            gpcVar = r3x.f();
        }
        if (gpcVar != null) {
            gpcVar.a(bxhVar, new c(bVar, f4xVar, null));
        } else {
            dwh.f(TAG, "No HttpAdapter found,request failed.");
        }
    }

    @Override // com.taobao.android.weex.module.WeexInnerModule
    public WeexValue callModuleMethod(WeexInstanceImpl weexInstanceImpl, String str, String str2, WeexValue[] weexValueArr) throws Exception {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeexValue) ipChange.ipc$dispatch("ffafd8f7", new Object[]{this, weexInstanceImpl, str, str2, weexValueArr});
        }
        fetch(getArg(weexValueArr, 0).toJSONObjectOrNull(), getCallback(weexValueArr, 1), getCallback(weexValueArr, 2));
        return null;
    }

    @MUSMethod(uiThread = false)
    public void fetch(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7271eaab", new Object[]{this, jSONObject, f4xVar, f4xVar2});
            return;
        }
        try {
            doFetchInternal(jSONObject, f4xVar, f4xVar2);
        } catch (Throwable th) {
            dwh.h(TAG, th);
        }
    }

    public Object parseData(String str, Options.Type type) throws JSONException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8121d9b1", new Object[]{this, str, type});
        }
        if (type == Options.Type.json) {
            return JSON.parse(str);
        }
        if (type != Options.Type.jsonp) {
            return str;
        }
        if (str == null || str.isEmpty()) {
            return new JSONObject();
        }
        int indexOf = str.indexOf(f7l.BRACKET_START_STR) + 1;
        int lastIndexOf = str.lastIndexOf(f7l.BRACKET_END_STR);
        if (indexOf == 0 || indexOf >= lastIndexOf || lastIndexOf <= 0) {
            return new JSONObject();
        }
        return JSON.parse(str.substring(indexOf, lastIndexOf));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ f4x f9982a;
        public final /* synthetic */ Options b;

        public a(f4x f4xVar, Options options) {
            this.f9982a = f4xVar;
            this.b = options;
        }

        public void a(dxh dxhVar, Map<String, String> map) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("121fed73", new Object[]{this, dxhVar, map});
            } else if (this.f9982a != null) {
                JSONObject jSONObject = new JSONObject();
                if (dxhVar == null || "-1".equals(dxhVar.f18133a)) {
                    jSONObject.put("status", (Object) (-1));
                    jSONObject.put("statusText", (Object) "ERR_CONNECT_FAILED");
                } else {
                    int parseInt = Integer.parseInt(dxhVar.f18133a);
                    jSONObject.put("status", (Object) Integer.valueOf(parseInt));
                    jSONObject.put("ok", (Object) Boolean.valueOf(parseInt >= 200 && parseInt <= 299));
                    byte[] bArr = dxhVar.b;
                    if (bArr == null) {
                        jSONObject.put("data", (Object) null);
                    } else {
                        if (map != null) {
                            str = WXStreamModule.getHeader(map, "Content-Type");
                        } else {
                            str = "";
                        }
                        try {
                            jSONObject.put("data", WXStreamModule.this.parseData(WXStreamModule.readAsString(bArr, str), this.b.e()));
                        } catch (JSONException e) {
                            dwh.h("", e);
                            jSONObject.put("ok", (Object) Boolean.FALSE);
                            jSONObject.put("data", (Object) "{'err':'Data parse failed!'}");
                        }
                    }
                    jSONObject.put("statusText", (Object) okq.a(dxhVar.f18133a));
                }
                jSONObject.put("headers", (Object) map);
                this.f9982a.b(jSONObject);
            }
        }
    }

    public static String readAsString(byte[] bArr, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c54174f", new Object[]{bArr, str});
        }
        try {
            if (str != null) {
                Matcher matcher = CHARSET_PATTERN.matcher(str.toLowerCase(Locale.ROOT));
                if (matcher.find()) {
                    str2 = matcher.group(1);
                    return new String(bArr, str2);
                }
            }
            return new String(bArr, str2);
        } catch (UnsupportedEncodingException e) {
            dwh.h("", e);
            return new String(bArr);
        }
        str2 = "utf-8";
    }

    private void doFetchInternal(JSONObject jSONObject, f4x f4xVar, f4x f4xVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6ecfad9", new Object[]{this, jSONObject, f4xVar, f4xVar2});
        } else if (jSONObject != null && jSONObject.getString("url") != null) {
            String string = jSONObject.getString("method");
            String string2 = jSONObject.getString("url");
            JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
            String string3 = jSONObject.getString(AgooConstants.MESSAGE_BODY);
            String string4 = jSONObject.getString("type");
            int intValue = jSONObject.getIntValue("timeout");
            if (string != null) {
                string = string.toUpperCase(Locale.ROOT);
            }
            Options.b bVar = new Options.b();
            if (!"GET".equals(string) && !"POST".equals(string) && !"PUT".equals(string) && !"DELETE".equals(string) && !"HEAD".equals(string) && !"PATCH".equals(string)) {
                string = "GET";
            }
            Options.b e = bVar.d(string).g(string2).c(string3).f(string4).e(intValue);
            extractHeaders(jSONObject2, e);
            Options a2 = e.a();
            sendRequest(a2, new a(f4xVar, a2), f4xVar2);
        } else if (f4xVar != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("ok", Boolean.FALSE);
            hashMap.put("statusText", "ERR_INVALID_REQUEST");
            f4xVar.b(hashMap);
        }
    }
}
