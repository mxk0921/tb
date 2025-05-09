package com.taobao.android.mnncv.mtop;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mrt.MRT;
import com.taobao.mrt.task.MRTRuntimeException;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.util.ReflectUtil;
import tb.eqh;
import tb.kgh;
import tb.l4j;
import tb.obk;
import tb.ral;
import tb.xqh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MRTConfigRequest {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final l4j f8992a = new l4j("mtop.taobao.edgecomputer.query", "1.0", false, false, null, null, MethodEnum.GET);
    public static volatile boolean b = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f8993a;

        public a(Runnable runnable) {
            this.f8993a = runnable;
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (map != null && MRTConfigRequest.a(map.get("configVersion"))) {
                eqh.b().a(this.f8993a, MRTConfigRequest.b(OrangeConfig.getInstance().getConfig(str, "maxDelayTime", "10")));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c f8994a;
        public final /* synthetic */ long b;

        public b(c cVar, long j) {
            this.f8994a = cVar;
            this.b = j;
        }

        @Override // com.taobao.android.mnncv.mtop.MRTConfigRequest.c
        public void a(MRTRuntimeException mRTRuntimeException, String str) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e64f9ad9", new Object[]{this, mRTRuntimeException, str});
                return;
            }
            MRTConfigRequest.c(false);
            c cVar = this.f8994a;
            if (cVar != null) {
                cVar.a(mRTRuntimeException, str);
            }
            if (mRTRuntimeException != null) {
                z = false;
            }
            xqh.b(z, System.currentTimeMillis() - this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void a(MRTRuntimeException mRTRuntimeException, String str);
    }

    public static /* synthetic */ boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38fae185", new Object[]{str})).booleanValue();
        }
        return f(str);
    }

    public static /* synthetic */ int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd2b2e75", new Object[]{str})).intValue();
        }
        return d(str);
    }

    public static /* synthetic */ boolean c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b117a53d", new Object[]{new Boolean(z)})).booleanValue();
        }
        b = z;
        return z;
    }

    public static void e(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2238ad81", new Object[]{runnable});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{"edge_computer_update_info"}, new a(runnable), false);
        }
    }

    public static void g(l4j l4jVar, String str, Map<String, String> map, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddfa9e0", new Object[]{l4jVar, str, map, cVar});
            return;
        }
        kgh.a("MRTConfigRequest", "startRequest " + l4jVar.f23106a);
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName(l4jVar.f23106a);
        mtopRequest.setVersion(l4jVar.b);
        mtopRequest.setNeedEcode(l4jVar.d);
        mtopRequest.setNeedSession(l4jVar.c);
        if (map == null || map.isEmpty()) {
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(l4jVar.e));
        } else {
            HashMap hashMap = new HashMap();
            hashMap.putAll(map);
            Map<String, String> map2 = l4jVar.e;
            if (map2 != null) {
                hashMap.putAll(map2);
            }
            mtopRequest.setData(ReflectUtil.convertMapToDataStr(hashMap));
        }
        RemoteBusiness build = RemoteBusiness.build(mtopRequest);
        build.ttid(str);
        build.showLoginUI(l4jVar.f);
        build.reqMethod(MethodEnum.GET);
        ((MtopBusiness) build).requestContext = l4jVar;
        final com.taobao.android.mnncv.mtop.a aVar = cVar != null ? new com.taobao.android.mnncv.mtop.a(cVar) : null;
        build.addListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.android.mnncv.mtop.MRTConfigRequest.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    str2 = "ret code:" + mtopResponse.getRetCode() + " err msg:" + mtopResponse.getRetMsg();
                } else {
                    str2 = null;
                }
                kgh.c("MRTConfigRequest", "onError :" + str2);
                com.taobao.android.mnncv.mtop.a aVar2 = com.taobao.android.mnncv.mtop.a.this;
                if (aVar2 != null) {
                    aVar2.a(new MRTRuntimeException(81, str2), null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str2;
                Object obj2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                kgh.a("MRTConfigRequest", "onSuccess " + mtopResponse);
                if (com.taobao.android.mnncv.mtop.a.this != null) {
                    if (!(mtopResponse == null || mtopResponse.getDataJsonObject() == null)) {
                        try {
                            obj2 = mtopResponse.getDataJsonObject().get("config");
                        } catch (Throwable th) {
                            kgh.t("MRTConfigRequest", "", th);
                        }
                        if (obj2 != null) {
                            str2 = obj2.toString();
                            com.taobao.android.mnncv.mtop.a.this.a(null, str2);
                        }
                    }
                    str2 = null;
                    com.taobao.android.mnncv.mtop.a.this.a(null, str2);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                String str2;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    str2 = "ret code:" + mtopResponse.getRetCode() + " err msg:" + mtopResponse.getRetMsg();
                } else {
                    str2 = null;
                }
                kgh.a("MRTConfigRequest", "onSystemError :" + str2);
                com.taobao.android.mnncv.mtop.a aVar2 = com.taobao.android.mnncv.mtop.a.this;
                if (aVar2 != null) {
                    aVar2.a(new MRTRuntimeException(81, str2), null);
                }
            }
        });
        build.startRequest();
        kgh.a("MRTConfigRequest", "startRequest ");
    }

    public static synchronized void h(String str, c cVar) {
        synchronized (MRTConfigRequest.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1ea47d5a", new Object[]{str, cVar});
            } else if (!b) {
                b = true;
                long currentTimeMillis = System.currentTimeMillis();
                xqh.a();
                g(f8992a, str, null, new b(cVar, currentTimeMillis));
            }
        }
    }

    public static int d(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7407abdb", new Object[]{str})).intValue();
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            kgh.s("MRTConfigRequest", "parse delay string failed. delayStr:" + str);
        }
        return new Random().nextInt(i + 1) * 1000;
    }

    public static boolean f(String str) {
        Context g;
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c350a9e6", new Object[]{str})).booleanValue();
        }
        if (TextUtils.isEmpty(str) || (g = MRT.g()) == null || (sharedPreferences = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0)) == null) {
            return false;
        }
        String string = sharedPreferences.getString("walleConfigVersion", null);
        if (!TextUtils.isEmpty(string)) {
            z = true ^ str.equalsIgnoreCase(string);
        }
        if (z && (edit = g.getSharedPreferences(ral.DAI_ORANGE_SWITCH, 0).edit()) != null) {
            edit.putString("walleConfigVersion", str).apply();
        }
        return z;
    }
}
