package com.taobao.schedule;

import android.os.Handler;
import android.os.HandlerThread;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import com.taobao.schedule.ServerResponseBean;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ja8;
import tb.la8;
import tb.pa8;
import tb.pxn;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ServerDispatcher {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Handler f11524a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ServerDispatcher.a(ServerDispatcher.this);
            }
        }
    }

    public static /* synthetic */ void a(ServerDispatcher serverDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfb10937", new Object[]{serverDispatcher});
        } else {
            serverDispatcher.c();
        }
    }

    public static /* synthetic */ void b(ServerDispatcher serverDispatcher, ServerResponseBean.ServerStrategy serverStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b1f6fa8", new Object[]{serverDispatcher, serverStrategy});
        } else {
            serverDispatcher.g(serverStrategy);
        }
    }

    public static MtopRequest f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("8175faa3", new Object[0]);
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.alibaba.mobile.elastic.schedule");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("domain", (Object) "preload");
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.add("dx");
        jSONObject2.put("types", (Object) jSONArray2);
        jSONArray.add(jSONObject2);
        jSONObject.put(MUSMonitor.MODULE_DIM_ABILITY, (Object) jSONArray.toString());
        mtopRequest.setData(jSONObject.toString());
        return mtopRequest;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a0e8ad5", new Object[]{this});
            return;
        }
        la8.c("elastic.SeverDispatcher", "[doRequestData] called.", new Object[0]);
        MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, pa8.a()), f()).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.schedule.ServerDispatcher.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    la8.c("elastic.SeverDispatcher", "onError", "code", Integer.valueOf(i));
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                la8.c("elastic.SeverDispatcher", "onSuccess", "code", Integer.valueOf(i));
                try {
                    ServerResponseBean serverResponseBean = (ServerResponseBean) JSON.parseObject(new String(mtopResponse.getBytedata()), ServerResponseBean.class);
                    if (serverResponseBean != null) {
                        ServerDispatcher.b(ServerDispatcher.this, serverResponseBean.data);
                    }
                } catch (Exception e) {
                    la8.c("elastic.SeverDispatcher", "json parse error.", "error", e.toString());
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    la8.c("elastic.SeverDispatcher", "onSystemError", "code", Integer.valueOf(i));
                }
            }
        }).handler(e()).startRequest();
        pxn.d().q();
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d639d97", new Object[]{this});
        } else if (!pxn.d().l()) {
            la8.c("elastic.SeverDispatcher", "[fetchAbility]switcher disable.", new Object[0]);
        } else if (!pxn.d().b()) {
            la8.c("elastic.SeverDispatcher", "[fetchAbility]request in expired time.", new Object[0]);
        } else {
            ja8.d(new a(), 1500L, TimeUnit.MILLISECONDS);
        }
    }

    public final Handler e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ee203cf0", new Object[]{this});
        }
        Handler handler = this.f11524a;
        if (handler != null) {
            return handler;
        }
        synchronized (ServerDispatcher.class) {
            try {
                if (this.f11524a == null) {
                    HandlerThread handlerThread = new HandlerThread("SeverDispatcherHandler");
                    handlerThread.start();
                    this.f11524a = new Handler(handlerThread.getLooper());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f11524a;
    }

    public final void g(ServerResponseBean.ServerStrategy serverStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19dcf71b", new Object[]{this, serverStrategy});
            return;
        }
        la8.c("elastic.SeverDispatcher", "[handleServerStrategy] called.", new Object[0]);
        ServerResponseBean.AbilityContent abilityContent = serverStrategy.abilityContent.get("preload");
        if (abilityContent != null && abilityContent.success) {
            ElasticSchedulerEngine m = ElasticSchedulerEngine.m();
            if (abilityContent.abHit != null) {
                m.d().d(abilityContent.abHit.get("dx"));
            }
            for (ServerResponseBean.AbilityStrategy abilityStrategy : abilityContent.strategies) {
                if ("dx".equals(abilityStrategy.type)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("templates", abilityStrategy.templates);
                    hashMap.put("ext", abilityStrategy.ext);
                    la8.c("elastic.SeverDispatcher", "[handleServerStrategy]parse dx strategy.", new Object[0]);
                    m.d().c(hashMap);
                }
            }
        }
    }
}
