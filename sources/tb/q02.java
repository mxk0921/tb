package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONException;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.datasource.impl.BaseSearchResult;
import com.taobao.android.searchbaseframe.net.ResultError;
import com.taobao.android.searchbaseframe.net.ResultException;
import java.io.BufferedReader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import tb.gy;
import tb.m1p;
import tb.r5j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class q02<RESULT extends BaseSearchResult> extends hy<RESULT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001777);
    }

    public q02(yko ykoVar, xno xnoVar) {
        super(ykoVar, xnoVar);
    }

    public static /* synthetic */ Object ipc$super(q02 q02Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/datasource/impl/BaseSearchResultAdapter");
    }

    @Override // tb.hy
    public r7b e(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7b) ipChange.ipc$dispatch("3069cb56", new Object[]{this, map});
        }
        return null;
    }

    @Override // tb.hy
    public boolean p(bsj bsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5d61c1fe", new Object[]{this, bsjVar})).booleanValue();
        }
        return !TextUtils.isEmpty(t(((r5j.a) ((r5j) bsjVar).f16602a).c));
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [OPTIONS, tb.r5j$b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [API, tb.r5j$a] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.Map, java.util.HashMap, PARAMS] */
    /* JADX WARN: Unknown variable types count: 2 */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public tb.r5j d(java.util.Map<java.lang.String, java.lang.String> r6, tb.gy.c r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.q02.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001b
            java.lang.String r3 = "eb62067d"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            java.lang.Object r6 = r2.ipc$dispatch(r3, r4)
            tb.r5j r6 = (tb.r5j) r6
            return r6
        L_0x001b:
            tb.r5j r2 = new tb.r5j
            r2.<init>()
            tb.r5j$a r7 = r5.s(r6, r7)
            r2.f16602a = r7
            tb.yko r7 = r5.g()
            com.taobao.android.searchbaseframe.chitu.ChiTuRewriteUtils r7 = r7.c()
            API r3 = r2.f16602a
            tb.r5j$a r3 = (tb.r5j.a) r3
            java.lang.String r3 = r3.c
            r7.d(r6, r3)
            tb.yko r7 = r5.g()
            API r3 = r2.f16602a
            tb.r5j$a r3 = (tb.r5j.a) r3
            java.lang.String r3 = r3.c
            tb.p80.o(r7, r6, r3)
            java.util.HashMap r7 = new java.util.HashMap
            r7.<init>()
            r2.b = r7
            r7.putAll(r6)
            tb.r5j$b r6 = new tb.r5j$b
            r6.<init>()
            r2.c = r6
            r6.f27125a = r0
            r6.b = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.q02.d(java.util.Map, tb.gy$c):tb.r5j");
    }

    /* renamed from: r */
    public r7b f(Map<String, String> map, bsj bsjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r7b) ipChange.ipc$dispatch("17fa5fdf", new Object[]{this, map, bsjVar});
        }
        r5j r5jVar = (r5j) bsjVar;
        String str = ((r5j.a) r5jVar.f16602a).c;
        new HashMap((Map) r5jVar.b).putAll(map);
        return new r7b(g6p.c(t(str), map));
    }

    public abstract r5j.a s(Map<String, String> map, gy.c cVar);

    public String t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51e28c51", new Object[]{this, str});
        }
        String k = p80.k(g(), str);
        if (TextUtils.isEmpty(k)) {
            return g().c().b(str);
        }
        return k;
    }

    public void u(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c093c0f0", new Object[]{this, result});
        } else {
            g().l().c("BaseSearchResultAdapter", "Result Summary:\n %s", result);
        }
    }

    public void v(RESULT result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669340e4", new Object[]{this, result});
        }
    }

    public void w(RESULT result, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988d9d6f", new Object[]{this, result, jSONObject});
            return;
        }
        String string = jSONObject.getString("parser");
        if (TextUtils.isEmpty(string)) {
            string = null;
        }
        g().h().a(string).a(result, jSONObject, this.f20955a);
    }

    /* renamed from: A */
    public void o(nsj nsjVar, RESULT result, weq weqVar, m1p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("332772f5", new Object[]{this, nsjVar, result, weqVar, aVar});
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(new String(nsjVar.a(), uj3.UTF_8.name())));
            String[] split = bufferedReader.readLine().split(":");
            String readLine = bufferedReader.readLine();
            String substring = readLine.substring(readLine.indexOf(":"));
            if (TextUtils.equals(split[1], "data")) {
                w(result, JSON.parseObject(substring));
                v(result);
            } else if (TextUtils.equals(split[1], "complete")) {
                result.setSseFinished(true);
            } else if (TextUtils.equals(split[1], "error")) {
                result.setSseFinished(true);
                result.setResultError(new ResultError(6, substring));
            }
        } catch (Exception unused) {
            result.setResultError(new ResultError(6, "流式数据 parse 出错"));
        }
    }

    /* renamed from: x */
    public void l(nsj nsjVar, RESULT result, qrj qrjVar, m1p.a aVar, y5p y5pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f90eab6", new Object[]{this, nsjVar, result, qrjVar, aVar, y5pVar});
            return;
        }
        HashMap hashMap = new HashMap();
        xno xnoVar = this.b;
        if (xnoVar != null) {
            xnoVar.f(nsjVar, hashMap);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            JSONObject a2 = qrjVar.a(nsj.c(nsjVar));
            long currentTimeMillis2 = System.currentTimeMillis();
            y5pVar.l = currentTimeMillis2 - currentTimeMillis;
            try {
                if (this.f20955a.g().isDebug()) {
                    result._setDebugRawResult(a2);
                }
                w(result, a2);
                long currentTimeMillis3 = System.currentTimeMillis();
                y5pVar.o = currentTimeMillis3;
                y5pVar.m = currentTimeMillis3 - currentTimeMillis2;
                if (g().g().isDebug()) {
                    try {
                        u(result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                g().l().e("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
                if (this.b != null) {
                    hashMap.put("errCode", String.valueOf(3));
                    hashMap.put("errMsg", e.getMessage());
                    this.b.g(hashMap);
                }
            }
            v(result);
            if (aVar != null) {
                try {
                    if (result.isSuccess()) {
                        aVar.a(a2.toJSONString(), result);
                    }
                } catch (Exception unused2) {
                    g().l().d("BaseSearchResultAdapter", "transformApiResult setCache Failed!");
                }
            }
        } catch (ResultException e2) {
            result.setResultError(e2.getError());
            if (this.b != null) {
                ResultError error = e2.getError();
                hashMap.put("errCode", String.valueOf(error.getErrorCode()));
                hashMap.put("errMsg", error.toString());
                this.b.g(hashMap);
            }
        }
    }

    /* renamed from: y */
    public void m(Object obj, RESULT result) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84d80ce2", new Object[]{this, obj, result});
            return;
        }
        try {
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else if (obj instanceof String) {
                jSONObject = JSON.parseObject((String) obj);
            } else {
                throw new IllegalArgumentException("preload must be String or JSONObject(fastjson)");
            }
            try {
                if (this.f20955a.g().isDebug()) {
                    result._setDebugRawResult(jSONObject);
                }
                w(result, jSONObject);
                if (g().g().isDebug()) {
                    try {
                        u(result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                g().l().e("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
            }
            v(result);
        } catch (JSONException e2) {
            result.setResultError(new ResultError(7, e2));
        }
    }

    /* renamed from: z */
    public void n(nsj nsjVar, RESULT result, m1p.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4da4040", new Object[]{this, nsjVar, result, aVar});
            return;
        }
        try {
            JSONObject c = nsj.c(nsjVar);
            try {
                if (this.f20955a.g().isDebug()) {
                    result._setDebugRawResult(c);
                }
                w(result, c);
                if (g().g().isDebug()) {
                    try {
                        u(result);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception e) {
                g().l().e("BaseSearchResultAdapter", "error parse", e);
                result.setResultError(new ResultError(3, e));
            }
            v(result);
            if (aVar != null) {
                try {
                    if (result.isSuccess()) {
                        aVar.a(c.toJSONString(), result);
                    }
                } catch (Exception unused2) {
                    g().l().d("BaseSearchResultAdapter", "transformApiResult setCache Failed!");
                }
            }
        } catch (ResultException e2) {
            result.setResultError(e2.getError());
        }
    }
}
