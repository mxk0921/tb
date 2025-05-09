package tb;

import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.alibaba.android.nextrpc.internal.utils.UnifyLog;
import com.alibaba.android.nextrpc.streamv2.trace.TraceName;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import mtopsdk.common.util.StringUtils;
import mtopsdk.mtop.util.ErrorConstant;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class z0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final m7j f32448a;
    public final Map<String, List<String>> b;
    public JSONObject c;
    public final String d;
    public final Map<String, Integer> e;
    public final boolean g;
    public final a3o i;
    public int f = -1;
    public String h = "";

    public z0i(m7j m7jVar, a3o a3oVar) {
        JSONObject jSONObject;
        ckf.g(m7jVar, "mtopStreamResponse");
        ckf.g(a3oVar, "request");
        this.f32448a = m7jVar;
        this.i = a3oVar;
        Map<String, List<String>> map = m7jVar.g;
        this.b = map == null ? new LinkedHashMap<>() : map;
        byte[] bArr = m7jVar.e;
        if (bArr != null) {
            this.d = new String(bArr, uj3.UTF_8);
        } else {
            this.d = "";
        }
        n9u n9uVar = n9u.INSTANCE;
        TraceName traceName = TraceName.NEXTRPC_PARSE_JSON_OBJECT;
        n9uVar.a(traceName);
        if (ckf.b(a3oVar.b(), Boolean.TRUE)) {
            jSONObject = new JSONObject();
        } else {
            jSONObject = l();
        }
        this.c = jSONObject;
        n9uVar.b(traceName);
        TraceName traceName2 = TraceName.NEXTRPC_PARSE_STAT;
        n9uVar.a(traceName2);
        this.e = k();
        n9uVar.b(traceName2);
        TraceName traceName3 = TraceName.NEXTRPC_PARSE_RET;
        n9uVar.a(traceName3);
        Pair<String, String> c = c();
        n9uVar.b(traceName3);
        m7jVar.f23820a = c.getFirst();
        m7jVar.b = c.getSecond();
        this.g = ckf.b("SUCCESS", m7jVar.f23820a);
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cf121b6b", new Object[]{this});
        }
        if (this.h.length() > 0) {
            return this.h;
        }
        List<String> list = this.b.get(HttpConstant.EAGLE_EYE_ID_2);
        if (list == null || list.isEmpty()) {
            return "";
        }
        String str = (String) i04.a0(list);
        this.h = str;
        return str;
    }

    public final Map<String, Integer> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c78b3f2b", new Object[]{this});
        }
        return this.e;
    }

    public final JSONObject e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("615be7c7", new Object[]{this});
        }
        return this.c;
    }

    public final Map<String, List<String>> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d35b98fc", new Object[]{this});
        }
        return this.b;
    }

    public final m7j g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m7j) ipChange.ipc$dispatch("d4050ea7", new Object[]{this});
        }
        return this.f32448a;
    }

    public final int h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f085b797", new Object[]{this})).intValue();
        }
        return this.f;
    }

    public final String i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e644dfdc", new Object[]{this});
        }
        return this.d;
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3b7e3c5", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[Catch: UnsupportedEncodingException -> 0x00da, TryCatch #0 {UnsupportedEncodingException -> 0x00da, blocks: (B:14:0x003f, B:18:0x004a, B:20:0x0050, B:22:0x0056, B:23:0x0078, B:25:0x007e, B:27:0x008c, B:28:0x0098, B:29:0x00ad, B:31:0x00b3, B:33:0x00c6, B:34:0x00cc, B:35:0x00d4, B:36:0x00d5), top: B:40:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[Catch: UnsupportedEncodingException -> 0x00da, TryCatch #0 {UnsupportedEncodingException -> 0x00da, blocks: (B:14:0x003f, B:18:0x004a, B:20:0x0050, B:22:0x0056, B:23:0x0078, B:25:0x007e, B:27:0x008c, B:28:0x0098, B:29:0x00ad, B:31:0x00b3, B:33:0x00c6, B:34:0x00cc, B:35:0x00d4, B:36:0x00d5), top: B:40:0x003f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Map<java.lang.String, java.lang.Integer> k() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = tb.z0i.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "e8fb5cc8"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L_0x0015:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.b
            java.lang.String r1 = "mtop-nextrpc-attached-responses-stat"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x0029
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.b
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            goto L_0x003d
        L_0x0029:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.b
            java.lang.String r1 = "MTOP-nextrpc-attached-responses-stat"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x003c
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r0 = r4.b
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            goto L_0x003d
        L_0x003c:
            r0 = 0
        L_0x003d:
            if (r0 == 0) goto L_0x0048
            java.lang.Object r0 = tb.i04.c0(r0)     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.String r0 = (java.lang.String) r0     // Catch: UnsupportedEncodingException -> 0x00da
            if (r0 == 0) goto L_0x0048
            goto L_0x004a
        L_0x0048:
            java.lang.String r0 = ""
        L_0x004a:
            int r1 = r0.length()     // Catch: UnsupportedEncodingException -> 0x00da
            if (r1 != 0) goto L_0x0056
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: UnsupportedEncodingException -> 0x00da
            r0.<init>()     // Catch: UnsupportedEncodingException -> 0x00da
            return r0
        L_0x0056:
            java.lang.String r1 = "UTF-8"
            java.lang.String r0 = java.net.URLDecoder.decode(r0, r1)     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.String r1 = "URLDecoder.decode(temp, \"UTF-8\")"
            tb.ckf.f(r0, r1)     // Catch: UnsupportedEncodingException -> 0x00da
            com.alibaba.fastjson.JSONObject r0 = com.alibaba.fastjson.JSON.parseObject(r0)     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.String r1 = "jsonObject"
            tb.ckf.f(r0, r1)     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap     // Catch: UnsupportedEncodingException -> 0x00da
            r1.<init>()     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Set r0 = r0.entrySet()     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Iterator r0 = r0.iterator()     // Catch: UnsupportedEncodingException -> 0x00da
        L_0x0078:
            boolean r2 = r0.hasNext()     // Catch: UnsupportedEncodingException -> 0x00da
            if (r2 == 0) goto L_0x0098
            java.lang.Object r2 = r0.next()     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.Object r3 = r2.getValue()     // Catch: UnsupportedEncodingException -> 0x00da
            boolean r3 = r3 instanceof java.lang.Integer     // Catch: UnsupportedEncodingException -> 0x00da
            if (r3 == 0) goto L_0x0078
            java.lang.Object r3 = r2.getKey()     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.Object r2 = r2.getValue()     // Catch: UnsupportedEncodingException -> 0x00da
            r1.put(r3, r2)     // Catch: UnsupportedEncodingException -> 0x00da
            goto L_0x0078
        L_0x0098:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap     // Catch: UnsupportedEncodingException -> 0x00da
            int r2 = r1.size()     // Catch: UnsupportedEncodingException -> 0x00da
            int r2 = tb.v3i.e(r2)     // Catch: UnsupportedEncodingException -> 0x00da
            r0.<init>(r2)     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Set r1 = r1.entrySet()     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Iterator r1 = r1.iterator()     // Catch: UnsupportedEncodingException -> 0x00da
        L_0x00ad:
            boolean r2 = r1.hasNext()     // Catch: UnsupportedEncodingException -> 0x00da
            if (r2 == 0) goto L_0x00d5
            java.lang.Object r2 = r1.next()     // Catch: UnsupportedEncodingException -> 0x00da
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.Object r3 = r3.getKey()     // Catch: UnsupportedEncodingException -> 0x00da
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.Object r2 = r2.getValue()     // Catch: UnsupportedEncodingException -> 0x00da
            if (r2 == 0) goto L_0x00cc
            java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: UnsupportedEncodingException -> 0x00da
            r0.put(r3, r2)     // Catch: UnsupportedEncodingException -> 0x00da
            goto L_0x00ad
        L_0x00cc:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch: UnsupportedEncodingException -> 0x00da
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Int"
            r0.<init>(r1)     // Catch: UnsupportedEncodingException -> 0x00da
            throw r0     // Catch: UnsupportedEncodingException -> 0x00da
        L_0x00d5:
            java.util.Map r0 = kotlin.collections.a.t(r0)     // Catch: UnsupportedEncodingException -> 0x00da
            return r0
        L_0x00da:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.z0i.k():java.util.Map");
    }

    public final void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6972353", new Object[]{this, new Integer(i)});
        } else {
            this.f = i;
        }
    }

    public final JSONObject l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5b14284", new Object[]{this});
        }
        m7j m7jVar = this.f32448a;
        JSONObject jSONObject = m7jVar.i;
        if (jSONObject == null) {
            byte[] bArr = m7jVar.e;
            if (bArr != null) {
                try {
                    Object parseObject = JSON.parseObject(bArr, JSONObject.class, new Feature[0]);
                    ckf.f(parseObject, "JSONObject.parseObject(m…, JSONObject::class.java)");
                    return (JSONObject) parseObject;
                } catch (Exception e) {
                    UnifyLog.d("MainResponse", "JSON Parse error msg=" + e.getMessage(), new Object[0]);
                }
            }
            return new JSONObject();
        }
        ckf.f(jSONObject, "mtopStreamResponse.originFastJsonObject");
        return jSONObject;
    }

    public final Pair<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("5e8d75d", new Object[]{this});
        }
        String[] strArr = this.f32448a.h;
        if (strArr != null) {
            return d(strArr);
        }
        if (this.d.length() != 0) {
            if (ckf.b(this.i.b(), Boolean.TRUE)) {
                if (acl.a() && wsq.e0(this.d, "\"ret\":[\"SUCCESS::调用成功\"],\"v\"", 0, false, 6, null) != -1) {
                    return new Pair<>("SUCCESS", "调用成功");
                }
                this.c = l();
                UnifyLog.d("NextRPC", "getCodeAndMsg disableJSONParse optimize failed", new Object[0]);
            }
            if (!this.c.isEmpty()) {
                try {
                    JSONArray jSONArray = this.c.getJSONArray(rb.RESULT_KEY);
                    if (jSONArray != null) {
                        String[] strArr2 = new String[jSONArray.size()];
                        int size = jSONArray.size();
                        for (int i = 0; i < size; i++) {
                            strArr2[i] = jSONArray.get(i).toString();
                        }
                        this.f32448a.h = strArr2;
                        return d(strArr2);
                    }
                } catch (Exception unused) {
                    return new Pair<>(ErrorConstant.ERRCODE_JSONDATA_PARSE_ERROR, ErrorConstant.ERRMSG_JSONDATA_PARSE_ERROR);
                }
            }
            return new Pair<>("", "");
        } else if (TextUtils.isEmpty(this.f32448a.f23820a) || TextUtils.isEmpty(this.f32448a.b)) {
            return new Pair<>(ErrorConstant.ERRCODE_JSONDATA_BLANK, ErrorConstant.ERRMSG_JSONDATA_BLANK);
        } else {
            m7j m7jVar = this.f32448a;
            return new Pair<>(m7jVar.f23820a, m7jVar.b);
        }
    }

    public final Pair<String, String> d(String[] strArr) {
        List list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("c11e06a4", new Object[]{this, strArr});
        }
        if (!(strArr.length == 0)) {
            String str = strArr[0];
            if (StringUtils.isNotBlank(str)) {
                ckf.d(str);
                List<String> split = new Regex("::").split(str, 0);
                if (!split.isEmpty()) {
                    ListIterator<String> listIterator = split.listIterator(split.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = i04.v0(split, listIterator.nextIndex() + 1);
                            break;
                        }
                    }
                }
                list = yz3.i();
                Object[] array = list.toArray(new String[0]);
                if (array != null) {
                    String[] strArr2 = (String[]) array;
                    if (strArr2.length > 1) {
                        return new Pair<>(strArr2[0], strArr2[1]);
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
        }
        return new Pair<>("", "");
    }
}
