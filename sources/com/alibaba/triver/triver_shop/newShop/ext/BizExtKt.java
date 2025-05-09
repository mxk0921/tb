package com.alibaba.triver.triver_shop.newShop.ext;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ariver.kernel.common.utils.IOUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.security.realidentity.p1;
import com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.JsonTypeEnum;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.intf.MtopPrefetch;
import tb.brf;
import tb.ckf;
import tb.g1a;
import tb.hp2;
import tb.jht;
import tb.n8;
import tb.n9;
import tb.npp;
import tb.r54;
import tb.t2o;
import tb.u1a;
import tb.xhv;
import tb.y7;
import tb.z7b;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class BizExtKt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements MtopPrefetch.IPrefetchCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public final /* synthetic */ g1a<String, xhv> f3094a;

        /* JADX WARN: Multi-variable type inference failed */
        public a(g1a<? super String, xhv> g1aVar) {
            this.f3094a = g1aVar;
        }

        @Override // mtopsdk.mtop.intf.MtopPrefetch.IPrefetchCallback
        public final void onPrefetch(String str, HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("58e86b4c", new Object[]{this, str, hashMap});
                return;
            }
            npp.a aVar = npp.Companion;
            StringBuilder sb = new StringBuilder("on shop mtop prefetch callback : ");
            sb.append((Object) str);
            sb.append(", ");
            ckf.f(hashMap, p1.d);
            sb.append((Object) r54.X(hashMap));
            aVar.b(sb.toString());
            g1a<String, xhv> g1aVar = this.f3094a;
            if (g1aVar != null) {
                ckf.f(str, "p0");
                g1aVar.invoke(str);
            }
        }
    }

    static {
        t2o.a(766509486);
    }

    public static final MtopBusiness a(Context context, MtopRequest mtopRequest, String str) {
        MethodEnum methodEnum;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("23f3f3c7", new Object[]{context, mtopRequest, str});
        }
        ckf.g(context, "context");
        ckf.g(mtopRequest, "request");
        MtopBusiness build = MtopBusiness.build(mtopRequest, Mtop.instance(Mtop.Id.INNER, context).getMtopConfig().ttid);
        if (ckf.b(str, "GET")) {
            methodEnum = MethodEnum.GET;
        } else {
            methodEnum = MethodEnum.POST;
        }
        MtopBusiness reqMethod = build.reqMethod(methodEnum);
        ckf.f(reqMethod, "build(request, instance.mtopConfig.ttid)\n        .reqMethod(if (requestMethod == \"GET\") MethodEnum.GET else MethodEnum.POST)");
        return reqMethod;
    }

    public static /* synthetic */ MtopBusiness b(Context context, MtopRequest mtopRequest, String str, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopBusiness) ipChange.ipc$dispatch("64ef6b9f", new Object[]{context, mtopRequest, str, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            str = "GET";
        }
        return a(context, mtopRequest, str);
    }

    public static final MtopRequest c(String str, String str2, Map<String, String> map, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("2ac1aac4", new Object[]{str, str2, map, new Boolean(z), new Boolean(z2)});
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(str);
        mtopRequest.setVersion(str2);
        mtopRequest.dataParams = map;
        mtopRequest.setNeedSession(z);
        mtopRequest.setNeedEcode(z2);
        if (map != null) {
            mtopRequest.setData(JSON.toJSONString(map));
        }
        return mtopRequest;
    }

    public static /* synthetic */ MtopRequest d(String str, String str2, Map map, boolean z, boolean z2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("9eab2e2e", new Object[]{str, str2, map, new Boolean(z), new Boolean(z2), new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            map = null;
        }
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        return c(str, str2, map, z, z2);
    }

    public static /* synthetic */ z7b f(String str, Map map, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7b) ipChange.ipc$dispatch("10382abb", new Object[]{str, map, new Integer(i), obj});
        }
        if ((i & 2) != 0) {
            map = null;
        }
        return e(str, map);
    }

    public static final void g(Context context, String str, String str2, Map<String, String> map, final g1a<? super JSONObject, xhv> g1aVar, final u1a<? super Integer, ? super String, xhv> u1aVar, boolean z, boolean z2, boolean z3, String str3, boolean z4, Map<String, String> map2, g1a<? super String, xhv> g1aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d344fb1b", new Object[]{context, str, str2, map, g1aVar, u1aVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str3, new Boolean(z4), map2, g1aVar2});
        } else if (context != null) {
            MtopBusiness a2 = a(context, c(str, str2, map, z, z2), str3);
            if (z4) {
                a2.setJsonType(JsonTypeEnum.ORIGINALJSON);
            }
            if (map2 != null) {
                a2.headers(map2);
            }
            a2.registerListener((IRemoteListener) new DefaultMtopListenerImp() { // from class: com.alibaba.triver.triver_shop.newShop.ext.BizExtKt$sendMTopRequest$2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(BizExtKt$sendMTopRequest$2 bizExtKt$sendMTopRequest$2, String str4, Object... objArr) {
                    int hashCode = str4.hashCode();
                    if (hashCode == -743105213) {
                        super.onSystemError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == -662674828) {
                        super.onError(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], objArr[2]);
                        return null;
                    } else if (hashCode == 2057952281) {
                        super.onSuccess(((Number) objArr[0]).intValue(), (MtopResponse) objArr[1], (BaseOutDo) objArr[2], objArr[3]);
                        return null;
                    } else {
                        int hashCode2 = str4.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str4 + "' with hashcode " + hashCode2 + " in com/alibaba/triver/triver_shop/newShop/ext/BizExtKt$sendMTopRequest$2");
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onError(i, mtopResponse, obj);
                    u1a<Integer, String, xhv> u1aVar2 = u1aVar;
                    if (u1aVar2 != null) {
                        Integer valueOf = Integer.valueOf(i);
                        String str4 = null;
                        if (mtopResponse == null) {
                            bArr = null;
                        } else {
                            bArr = mtopResponse.getBytedata();
                        }
                        JSONObject l = brf.l(bArr);
                        if (l != null) {
                            str4 = l.toString();
                        }
                        u1aVar2.invoke(valueOf, str4);
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    super.onSuccess(i, mtopResponse, baseOutDo, obj);
                    g1a<JSONObject, xhv> g1aVar3 = g1aVar;
                    if (g1aVar3 != null) {
                        if (mtopResponse == null) {
                            bArr = null;
                        } else {
                            bArr = mtopResponse.getBytedata();
                        }
                        g1aVar3.invoke(brf.l(bArr));
                    }
                }

                @Override // com.alibaba.triver.triver_shop.adapter.DefaultMtopListenerImp, com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    byte[] bArr;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    super.onSystemError(i, mtopResponse, obj);
                    u1a<Integer, String, xhv> u1aVar2 = u1aVar;
                    if (u1aVar2 != null) {
                        Integer valueOf = Integer.valueOf(i);
                        String str4 = null;
                        if (mtopResponse == null) {
                            bArr = null;
                        } else {
                            bArr = mtopResponse.getBytedata();
                        }
                        JSONObject l = brf.l(bArr);
                        if (l != null) {
                            str4 = l.toString();
                        }
                        u1aVar2.invoke(valueOf, str4);
                    }
                }
            });
            if (z3) {
                a2.prefetch(10000L, (MtopPrefetch.IPrefetchCallback) new a(g1aVar2)).startRequest();
            } else {
                a2.startRequest();
            }
        }
    }

    public static /* synthetic */ void h(Context context, String str, String str2, Map map, g1a g1aVar, u1a u1aVar, boolean z, boolean z2, boolean z3, String str3, boolean z4, Map map2, g1a g1aVar2, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faa046c1", new Object[]{context, str, str2, map, g1aVar, u1aVar, new Boolean(z), new Boolean(z2), new Boolean(z3), str3, new Boolean(z4), map2, g1aVar2, new Integer(i), obj});
        } else {
            g(context, str, str2, (8 & i) != 0 ? null : map, g1aVar, u1aVar, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) != 0 ? "GET" : str3, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? null : map2, (i & 4096) != 0 ? null : g1aVar2);
        }
    }

    public static final void i(Activity activity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5228672a", new Object[]{activity, jSONObject});
            return;
        }
        ckf.g(activity, "activity");
        ckf.g(jSONObject, "popParams");
        n9 n9Var = new n9();
        n9Var.i(activity);
        n9Var.m(activity.getWindow().getDecorView());
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "type", jht.actionShowWindVanePop);
        jSONObject2.put((JSONObject) "params", (String) jSONObject);
        new y7().b(new n8(jSONObject2), n9Var, null);
    }

    public static final z7b e(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z7b) ipChange.ipc$dispatch("59d28f73", new Object[]{str, map});
        }
        ckf.g(str, "url");
        URLConnection openConnection = new URL(str).openConnection();
        if (openConnection != null) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                InputStream inputStream = httpURLConnection.getInputStream();
                ckf.f(inputStream, "inputStream");
                byte[] c = hp2.c(inputStream);
                IOUtils.closeQuietly(inputStream);
                httpURLConnection.disconnect();
                return new z7b(responseCode, true, c);
            }
            httpURLConnection.disconnect();
            return new z7b(responseCode, false, null);
        }
        throw new NullPointerException("null cannot be cast to non-null type java.net.HttpURLConnection");
    }
}
