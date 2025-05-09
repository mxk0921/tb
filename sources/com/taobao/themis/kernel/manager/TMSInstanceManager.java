package com.taobao.themis.kernel.manager;

import android.app.Activity;
import android.app.Application;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import com.alibaba.ariver.kernel.RVConstants;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.TMSContainerType;
import com.taobao.themis.kernel.basic.TMSLogger;
import com.taobao.themis.kernel.entity.InstanceStartParams;
import com.taobao.themis.kernel.solution.TMSSolutionType;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.JvmStatic;
import mtopsdk.mtop.intf.Mtop;
import tb.bbs;
import tb.ckf;
import tb.lcs;
import tb.mcs;
import tb.rds;
import tb.rio;
import tb.t2o;
import tb.wsq;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSInstanceManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final TMSInstanceManager INSTANCE = new TMSInstanceManager();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, WeakReference<bbs>> f13588a = new ConcurrentHashMap<>();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class InstanceControlStrategy extends Enum<InstanceControlStrategy> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final InstanceControlStrategy UNI_APP_SINGLETON = new InstanceControlStrategy("UNI_APP_SINGLETON", 0);
        private static final /* synthetic */ InstanceControlStrategy[] $VALUES = $values();

        private static final /* synthetic */ InstanceControlStrategy[] $values() {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (InstanceControlStrategy[]) ipChange.ipc$dispatch("fd823122", new Object[0]) : new InstanceControlStrategy[]{UNI_APP_SINGLETON};
        }

        private InstanceControlStrategy(String str, int i) {
        }

        public static /* synthetic */ Object ipc$super(InstanceControlStrategy instanceControlStrategy, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/manager/TMSInstanceManager$InstanceControlStrategy");
        }

        public static InstanceControlStrategy valueOf(String str) {
            Object valueOf;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                valueOf = ipChange.ipc$dispatch("e7229a97", new Object[]{str});
            } else {
                valueOf = Enum.valueOf(InstanceControlStrategy.class, str);
            }
            return (InstanceControlStrategy) valueOf;
        }

        public static InstanceControlStrategy[] values() {
            Object clone;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                clone = ipChange.ipc$dispatch("28b2f9c6", new Object[0]);
            } else {
                clone = $VALUES.clone();
            }
            return (InstanceControlStrategy[]) clone;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            t2o.a(839909762);
            int[] iArr = new int[InstanceControlStrategy.values().length];
            iArr[InstanceControlStrategy.UNI_APP_SINGLETON.ordinal()] = 1;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        t2o.a(839909760);
    }

    @JvmStatic
    public static final bbs a(Activity activity, InstanceStartParams instanceStartParams, TMSContainerType tMSContainerType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("990ac9c2", new Object[]{activity, instanceStartParams, tMSContainerType});
        }
        ckf.g(activity, "activity");
        ckf.g(instanceStartParams, RVConstants.EXTRA_START_PARAMS);
        ckf.g(tMSContainerType, "containerType");
        bbs bbsVar = new bbs(activity, instanceStartParams, tMSContainerType);
        bbsVar.k0(new rio(bbsVar));
        bbsVar.F(new lcs(bbsVar));
        ConcurrentHashMap<String, WeakReference<bbs>> concurrentHashMap = f13588a;
        String Q = bbsVar.Q();
        ckf.f(Q, "instance.instanceId");
        concurrentHashMap.put(Q, new WeakReference<>(bbsVar));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "instanceId", bbsVar.g);
        jSONObject.put((JSONObject) "url", bbsVar.e0());
        jSONObject.put((JSONObject) "containerType", tMSContainerType.name());
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_GLOBAL_CONTAINER, Mtop.Id.OPEN, mcs.GLOBAL_EVENT_ROOT_ID, "TMS_1", jSONObject);
        return bbsVar;
    }

    public static /* synthetic */ bbs c(Application application, Uri uri, TMSContainerType tMSContainerType, JSONObject jSONObject, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("a38ae4dc", new Object[]{application, uri, tMSContainerType, jSONObject, new Integer(i), obj});
        }
        if ((i & 4) != 0) {
            tMSContainerType = TMSContainerType.GENERIC;
        }
        if ((i & 8) != 0) {
            jSONObject = null;
        }
        return b(application, uri, tMSContainerType, jSONObject);
    }

    @JvmStatic
    public static final bbs e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("d9c83fa1", new Object[]{str});
        }
        WeakReference<bbs> weakReference = f13588a.get(str);
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @JvmStatic
    public static final void f(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbb4a35c", new Object[]{bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        f13588a.remove(bbsVar.Q());
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "instanceId", bbsVar.g);
        jSONObject.put((JSONObject) "url", bbsVar.e0());
        xhv xhvVar = xhv.INSTANCE;
        mcs.e(mcs.MODULE_GLOBAL_CONTAINER, "CLOSE", mcs.GLOBAL_EVENT_ROOT_ID, "TMS_1", jSONObject);
    }

    @JvmStatic
    public static final void d(bbs bbsVar, InstanceControlStrategy instanceControlStrategy) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc647b78", new Object[]{bbsVar, instanceControlStrategy});
            return;
        }
        ckf.g(bbsVar, "newInstance");
        ckf.g(instanceControlStrategy, "controlStrategy");
        if (a.$EnumSwitchMapping$0[instanceControlStrategy.ordinal()] == 1) {
            for (Map.Entry<String, WeakReference<bbs>> entry : f13588a.entrySet()) {
                bbs bbsVar2 = entry.getValue().get();
                if (bbsVar2 != null && bbsVar2.a0() == TMSSolutionType.UNIAPP && ckf.b(bbsVar2.d0(), bbsVar.d0()) && bbsVar2.O() == TMSContainerType.GENERIC && !ckf.b(bbsVar2.g, bbsVar.g)) {
                    bbsVar2.W().e();
                }
            }
        }
    }

    @JvmStatic
    public static final bbs b(Application application, Uri uri, TMSContainerType tMSContainerType, JSONObject jSONObject) {
        InstanceStartParams instanceStartParams;
        String queryParameter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("5c08e526", new Object[]{application, uri, tMSContainerType, jSONObject});
        }
        ckf.g(application, "application");
        ckf.g(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        ckf.g(tMSContainerType, "containerType");
        rds.f("TMSInstanceManager#createInstance", null, null, 6, null);
        try {
            String uri2 = uri.toString();
            ckf.f(uri2, "uri.toString()");
            Bundle bundle = new Bundle();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            ckf.f(queryParameterNames, "uri.queryParameterNames");
            for (String str : queryParameterNames) {
                if (!ckf.b(str, "query") && (queryParameter = uri.getQueryParameter(str)) != null) {
                    bundle.putString(str, queryParameter);
                }
            }
            Bundle bundle2 = new Bundle();
            String queryParameter2 = uri.getQueryParameter("query");
            if (queryParameter2 != null) {
                for (String str2 : wsq.z0(queryParameter2, new String[]{"&"}, false, 0, 6, null)) {
                    List z0 = wsq.z0(str2, new String[]{"="}, false, 0, 6, null);
                    if (z0.size() >= 2) {
                        bundle2.putString((String) z0.get(0), (String) z0.get(1));
                    }
                }
            }
            xhv xhvVar = xhv.INSTANCE;
            instanceStartParams = new InstanceStartParams(uri2, bundle, bundle2, jSONObject == null ? new JSONObject() : jSONObject);
        } catch (Exception e) {
            TMSLogger.c("TMSInstanceManager", "createInstance error", e);
            String uri3 = uri.toString();
            ckf.f(uri3, "uri.toString()");
            instanceStartParams = new InstanceStartParams(uri3, new Bundle(), new Bundle());
        }
        bbs bbsVar = new bbs(application, instanceStartParams, tMSContainerType);
        bbsVar.k0(new rio(bbsVar));
        bbsVar.F(new lcs(bbsVar));
        ConcurrentHashMap<String, WeakReference<bbs>> concurrentHashMap = f13588a;
        String Q = bbsVar.Q();
        ckf.f(Q, "instance.instanceId");
        concurrentHashMap.put(Q, new WeakReference<>(bbsVar));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put((JSONObject) "instanceId", bbsVar.g);
        jSONObject2.put((JSONObject) "url", bbsVar.e0());
        jSONObject2.put((JSONObject) "containerType", tMSContainerType.name());
        xhv xhvVar2 = xhv.INSTANCE;
        mcs.e(mcs.MODULE_GLOBAL_CONTAINER, Mtop.Id.OPEN, mcs.GLOBAL_EVENT_ROOT_ID, "TMS_1", jSONObject2);
        return bbsVar;
    }
}
