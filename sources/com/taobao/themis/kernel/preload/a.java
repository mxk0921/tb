package com.taobao.themis.kernel.preload;

import android.app.Application;
import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppInfoScene;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.inside.adapter.TLogAdapterImpl;
import com.taobao.themis.kernel.adapter.IEnvironmentService;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.executor.ExecutorType;
import com.taobao.themis.kernel.executor.IExecutorService;
import com.taobao.themis.kernel.metaInfo.appinfo.core.AppInfoStrategy;
import com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.AbsAppInfoRequestConfig;
import com.taobao.themis.kernel.preload.GetTopAppClient;
import java.util.ArrayList;
import tb.n51;
import tb.p8s;
import tb.q9s;
import tb.r64;
import tb.t2o;
import tb.wcs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.themis.kernel.preload.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class RunnableC0774a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (a.a().booleanValue()) {
                a.b();
            }
        }
    }

    static {
        t2o.a(839909920);
    }

    public static /* synthetic */ Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("a0cec934", new Object[0]);
        }
        return c();
    }

    public static /* synthetic */ void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1bc42b8", new Object[0]);
        } else {
            f();
        }
    }

    public static Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("f688466f", new Object[0]);
        }
        TMSLogger.a("TopAppPreloadJob", "try preload");
        Application applicationContext = ((IEnvironmentService) p8s.g(IEnvironmentService.class)).getApplicationContext();
        long b = wcs.b(applicationContext, "lastTopAppPreloadTimeStamp", -1L);
        long K3 = q9s.K3();
        TMSLogger.a("TopAppPreloadJob", "lastResourcePreloadTimeStamp: " + b + ", minSecondsFromLast : " + K3);
        if (b != -1 && b >= System.currentTimeMillis() - (K3 * 1000)) {
            return Boolean.FALSE;
        }
        wcs.h(applicationContext, "lastTopAppPreloadTimeStamp", System.currentTimeMillis());
        TMSLogger.a("TopAppPreloadJob", "need preload");
        return Boolean.TRUE;
    }

    public static void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be50ac85", new Object[0]);
        } else if (q9s.r2()) {
            ((IExecutorService) p8s.g(IExecutorService.class)).getExecutor(ExecutorType.NORMAL).execute(new RunnableC0774a());
        }
    }

    public static JSONArray e() {
        String[] split;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONArray) ipChange.ipc$dispatch("ffa9e15", new Object[0]);
        }
        JSONArray jSONArray = new JSONArray();
        String b = q9s.b();
        if (!TextUtils.isEmpty(b)) {
            for (String str : b.split(",")) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_id", (Object) str);
                jSONArray.add(jSONObject);
            }
        }
        r64<JSONArray, JSONObject> execute = new GetTopAppClient().execute(new GetTopAppClient.getTopAppParam(null));
        if (execute.f27135a) {
            jSONArray.addAll(execute.d);
            return jSONArray;
        }
        TMSLogger.b(TLogAdapterImpl.TLOG_MODULE, "getTopAppError: " + execute.c);
        return jSONArray;
    }

    public static void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("33fb716a", new Object[0]);
            return;
        }
        JSONArray e = e();
        if (!e.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < e.size(); i++) {
                JSONObject jSONObject = e.getJSONObject(i);
                String string = jSONObject.getString("app_id");
                String string2 = jSONObject.getString("url");
                if (n51.i().d(AppInfoScene.ONLINE, string) != AppInfoStrategy.LOCAL_LOAD) {
                    TMSLogger.a("TopAppPreloadJob", "add preload appid [" + string + "]");
                    arrayList.add(new AbsAppInfoRequestConfig.BasicRequestParam(string, "*", string2));
                }
            }
            if (!arrayList.isEmpty()) {
                com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a aVar = new com.taobao.themis.kernel.metaInfo.appinfo.core.requestConfig.a(arrayList);
                aVar.b = true;
                aVar.c = AbsAppInfoRequestConfig.AppInfoRequestScene.PRELOAD;
                n51.i().p(aVar, null);
            }
        }
    }
}
