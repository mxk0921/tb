package mtopsdk.instanceconfigs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import mtopsdk.common.util.ConfigStoreManager;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.instanceconfigs.MtopExternalInstanceConfigsData;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.global.MtopConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.mtop.util.MtopStatistics;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final Map<String, MtopExternalInstanceConfigsData.a> f15408a = new HashMap();
    public static final Map<String, Future<String>> b = new HashMap();
    public static a c;

    /* compiled from: Taobao */
    /* renamed from: mtopsdk.instanceconfigs.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class CallableC0865a implements Callable<String> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f15409a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;

        public CallableC0865a(Context context, String str, String str2) {
            this.f15409a = context;
            this.b = str;
            this.c = str2;
        }

        /* renamed from: a */
        public String call() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5fe77b5b", new Object[]{this});
            }
            return a.a(a.this, this.f15409a, this.b, this.c);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FutureTask f15410a;

        public b(FutureTask futureTask) {
            this.f15410a = futureTask;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f15410a.run();
            }
        }
    }

    static {
        t2o.a(589299845);
    }

    public static /* synthetic */ String a(a aVar, Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bde9e089", new Object[]{aVar, context, str, str2});
        }
        return aVar.f(context, str, str2);
    }

    public static a c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("d0d531d2", new Object[0]);
        }
        if (c == null) {
            synchronized (a.class) {
                try {
                    if (c == null) {
                        c = new a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public final void b(MtopConfig mtopConfig, String str, int i, MtopResponse mtopResponse, String str2) {
        int i2 = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ca203a9", new Object[]{this, mtopConfig, str, new Integer(i), mtopResponse, str2});
            return;
        }
        MtopStatistics mtopStat = mtopResponse.getMtopStat();
        if (mtopStat != null) {
            mtopStat.configReqDomain = mtopConfig.mtopDomain.getDomain(mtopConfig.envMode);
            mtopStat.instanceId = Mtop.Id.INNER;
            mtopStat.accountSite = str;
            mtopStat.configRequestType = !StringUtils.isBlank(str) ? 1 : 0;
            mtopStat.configReqStartTime = i;
            mtopStat.configReqFinishTime = System.currentTimeMillis();
            if (!mtopResponse.isApiSuccess()) {
                i2 = -1;
            } else if (StringUtils.isBlank(str2)) {
                i2 = 0;
            }
            mtopStat.configReturnType = i2;
            mtopStat.commitCustomStatData(0, mtopStat);
        }
    }

    public final MtopExternalInstanceConfigsData.a d(String str, String str2) {
        BaseOutDo baseOutDo;
        MtopExternalInstanceConfigsData mtopExternalInstanceConfigsData;
        List<MtopExternalInstanceConfigsData.a> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("740faec5", new Object[]{this, str, str2});
        }
        if (!StringUtils.isNotBlank(str) || (baseOutDo = (BaseOutDo) JSON.parseObject(str, MtopExternalInstanceConfigsGetResponse.class)) == null || (mtopExternalInstanceConfigsData = (MtopExternalInstanceConfigsData) baseOutDo.getData()) == null || (list = mtopExternalInstanceConfigsData.externalInstanceConfigs) == null || list.size() <= 0) {
            return null;
        }
        for (MtopExternalInstanceConfigsData.a aVar : mtopExternalInstanceConfigsData.externalInstanceConfigs) {
            if (aVar != null && TextUtils.equals(null, str2)) {
                return aVar;
            }
        }
        return null;
    }

    public MtopExternalInstanceConfigsData.a e(Context context, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("274d0004", new Object[]{this, context, str, str2});
        }
        Map<String, MtopExternalInstanceConfigsData.a> map = f15408a;
        MtopExternalInstanceConfigsData.a aVar = (MtopExternalInstanceConfigsData.a) ((HashMap) map).get(str2);
        if (aVar != null) {
            return aVar;
        }
        if (context == null) {
            return null;
        }
        ConfigStoreManager instance = ConfigStoreManager.getInstance();
        MtopExternalInstanceConfigsData.a d = d(instance.getConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "MTOPSDK_INSTANCE_CONFIG_STORE" + str, "instance_config"), str2);
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.InstanceConfigsManager", "[getLocalInstanceConfig]get instanceId from store accountSite=" + str2 + "; instanceId=" + ((String) null));
        }
        if (d != null) {
            ((HashMap) map).put(str2, d);
        }
        return d;
    }

    public final String f(Context context, String str, String str2) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d5b75e", new Object[]{this, context, str, str2});
        }
        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
            TBSdkLog.i("mtopsdk.InstanceConfigsManager", "[getRemoteInstanceConfig] called!accountSite=" + str2);
        }
        int currentTimeMillis = (int) System.currentTimeMillis();
        MtopExternalInstanceConfigsGetRequest mtopExternalInstanceConfigsGetRequest = new MtopExternalInstanceConfigsGetRequest();
        Mtop instance = Mtop.instance(Mtop.Id.INNER, (Context) null);
        MtopResponse syncRequest = instance.build((IMTOPDataObject) mtopExternalInstanceConfigsGetRequest, (String) null).setBizId(4099).syncRequest();
        String str3 = "";
        if (syncRequest.isApiSuccess()) {
            try {
                byte[] bytedata = syncRequest.getBytedata();
                if (!(bytedata == null || bytedata.length == 0)) {
                    String str4 = new String(bytedata, StandardCharsets.UTF_8);
                    if (context == null) {
                        return null;
                    }
                    try {
                        ConfigStoreManager instance2 = ConfigStoreManager.getInstance();
                        instance2.saveConfigItem(context, ConfigStoreManager.MTOP_CONFIG_STORE, "MTOPSDK_INSTANCE_CONFIG_STORE" + str, "instance_config", str4);
                        str3 = str4;
                    } catch (Throwable th2) {
                        th = th2;
                        str3 = str4;
                        TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getRemoteInstanceConfig] error ---" + th.toString());
                        b(instance.getMtopConfig(), str2, currentTimeMillis, syncRequest, str3);
                        return str3;
                    }
                }
                TBSdkLog.e("mtopsdk.InstanceConfigsManager", "jsonData is blank");
                return null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        b(instance.getMtopConfig(), str2, currentTimeMillis, syncRequest, str3);
        return str3;
    }

    public MtopExternalInstanceConfigsData.a g(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("de6a0955", new Object[]{this, context, str});
        }
        return h(context, str, "", 5000L);
    }

    public MtopExternalInstanceConfigsData.a h(Context context, String str, String str2, long j) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopExternalInstanceConfigsData.a) ipChange.ipc$dispatch("f481724b", new Object[]{this, context, str, str2, new Long(j)});
        }
        if (StringUtils.isBlank(str)) {
            return null;
        }
        HashMap hashMap = (HashMap) b;
        Future future = (Future) hashMap.get(str);
        if (future == null || future.isDone()) {
            FutureTask futureTask = new FutureTask(new CallableC0865a(context, str, str2));
            MtopSDKThreadPoolExecutorFactory.submit(new b(futureTask));
            hashMap.put(str, futureTask);
            try {
                if (j > 0) {
                    return d((String) futureTask.get(j, TimeUnit.MILLISECONDS), str2);
                }
                return d((String) futureTask.get(), str2);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getInstanceFromAccountSite] error ---" + th.toString());
                return null;
            }
        } else {
            try {
                if (j > 0) {
                    str3 = (String) future.get(j, TimeUnit.MILLISECONDS);
                } else {
                    str3 = (String) future.get();
                }
                return d(str3, str2);
            } catch (Throwable th2) {
                TBSdkLog.e("mtopsdk.InstanceConfigsManager", "[getInstanceFromAccountSite] error ---" + th2.toString());
                return null;
            }
        }
    }
}
