package com.taobao.falco;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.util.ALog;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ah0;
import tb.c0c;
import tb.crt;
import tb.jk;
import tb.sg0;
import tb.uz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoUMPerception implements sg0.c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f10452a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f10453a;

        public a(Map map) {
            this.f10453a = map;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                FalcoUMPerception.c(FalcoUMPerception.this, this.f10453a);
            } catch (Exception e) {
                ALog.e("falco.UMPerception", "[handlerFlowEnter] error", null, e, new Object[0]);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final FalcoUMPerception f10454a = new FalcoUMPerception();

        public static /* synthetic */ FalcoUMPerception a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FalcoUMPerception) ipChange.ipc$dispatch("5845c539", new Object[0]);
            }
            return f10454a;
        }
    }

    public static /* synthetic */ void c(FalcoUMPerception falcoUMPerception, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3232e693", new Object[]{falcoUMPerception, map});
        } else {
            falcoUMPerception.f(map);
        }
    }

    public static String d(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee3cfce8", new Object[]{str, str2, str3, new Long(j)});
        }
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("domain", (Object) "deviceEvent");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("afcLink");
        jSONObject2.put("types", (Object) jSONArray2);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("afcId", (Object) str);
        jSONObject3.put("linkUrl", (Object) str2);
        jSONObject3.put("launchType", (Object) str3);
        jSONObject3.put("lastColdStart", (Object) Long.valueOf(j));
        jSONObject2.put("content", (Object) jSONObject3);
        jSONArray.add(jSONObject2);
        jSONObject.put(MUSMonitor.MODULE_DIM_ABILITY, (Object) jSONArray.toString());
        return jSONObject.toJSONString();
    }

    public static FalcoUMPerception e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FalcoUMPerception) ipChange.ipc$dispatch("3a10f5be", new Object[0]);
        }
        return b.a();
    }

    @Override // tb.sg0.c
    public void a(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("283ab0d4", new Object[]{this, map});
        }
    }

    @Override // tb.sg0.c
    public void b(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ea9b13", new Object[]{this, map});
        } else {
            crt.f(new a(map));
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{this, context});
        } else if (!uz8.d(context)) {
            ALog.e("falco.UMPerception", "[init] not main process", null, new Object[0]);
        } else {
            this.f10452a = context;
            sg0.d(this);
        }
    }

    public final void f(Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7042e5fe", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            String str = (String) map.get(ah0.AFC_ID);
            if (TextUtils.isEmpty(str)) {
                ALog.e("falco.UMPerception", "[handlerFlowEnter] afcId is empty", null, new Object[0]);
                return;
            }
            String[] split = str.split(c0c.UNESCAPED_SEPARATOR);
            if (split != null && split.length != 0 && "afc_link".equals(split[0])) {
                String str2 = (String) map.get("source_url");
                FalcoEnvironmentImpl m = FalcoEnvironmentImpl.m();
                if (m == null) {
                    ALog.e("falco.UMPerception", "[handlerFlowEnter] falcoEnvironment is null", null, new Object[0]);
                } else {
                    h(str, str2, FalcoLifecycleActionMonitor.A, m.a().h);
                }
            }
        }
    }

    public final void h(String str, String str2, String str3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7ed1f8", new Object[]{this, str, str2, str3, new Long(j)});
            return;
        }
        Mtop instance = Mtop.instance(Mtop.Id.INNER, this.f10452a);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.mobile.elastic.schedule");
        mtopRequest.setVersion("1.0");
        String d = d(str, str2, str3, j);
        mtopRequest.setData(d);
        IRemoteBaseListener iRemoteBaseListener = new IRemoteBaseListener() { // from class: com.taobao.falco.FalcoUMPerception.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ALog.e("falco.UMPerception", "[onError]", null, jk.KEY_RET_CODE, mtopResponse != null ? mtopResponse.getRetCode() : null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                } else {
                    ALog.e("falco.UMPerception", "[onSuccess]", null, jk.KEY_RET_CODE, mtopResponse != null ? mtopResponse.getRetCode() : null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    ALog.e("falco.UMPerception", "[onSystemError]", null, jk.KEY_RET_CODE, mtopResponse != null ? mtopResponse.getRetCode() : null);
                }
            }
        };
        ALog.e("falco.UMPerception", "send mtop request.", null, "params", d);
        MtopBusiness build = MtopBusiness.build(instance, mtopRequest);
        build.addHttpQueryParameter("asac", "2A25423Q6C1XQ5BISGCGXU");
        build.registerListener((IRemoteListener) iRemoteBaseListener);
        build.startRequest();
    }
}
