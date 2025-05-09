package tb;

import android.content.Context;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.AsyncServiceBinder;
import mtopsdk.common.util.MtopUtils;
import mtopsdk.common.util.RemoteConfig;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.global.SwitchConfig;
import mtopsdk.mtop.intf.Mtop;
import mtopsdk.mtop.util.MtopSDKThreadPoolExecutorFactory;
import mtopsdk.xstate.XStateService;
import mtopsdk.xstate.aidl.IXState;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class inx {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static AsyncServiceBinder<IXState> b;
    public static knx c;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<String, String> f21470a = new ConcurrentHashMap<>();
    public static final AtomicBoolean d = new AtomicBoolean(false);
    public static final AtomicBoolean e = new AtomicBoolean(false);
    public static volatile AtomicBoolean f = new AtomicBoolean(false);
    public static Context g = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class a extends AsyncServiceBinder<IXState> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.inx$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
        public class RunnableC0947a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC0947a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    inx.n();
                }
            }
        }

        public a(Class cls, Class cls2) {
            super(cls, cls2);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/xstate/XState$1");
        }

        @Override // mtopsdk.common.util.AsyncServiceBinder
        public void afterAsyncBind() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb59fc64", new Object[]{this});
                return;
            }
            inx.f.compareAndSet(true, false);
            MtopSDKThreadPoolExecutorFactory.submit(new RunnableC0947a());
        }
    }

    static {
        t2o.a(589300085);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a0cdf0ee", new Object[0])).booleanValue();
        }
        AsyncServiceBinder<IXState> asyncServiceBinder = b;
        if (asyncServiceBinder == null) {
            return false;
        }
        if (asyncServiceBinder.getService() != null) {
            return true;
        }
        b.asyncBind(g);
        return false;
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ee74af03", new Object[0]);
        }
        return c("t_offset");
    }

    public static String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a4afea14", new Object[]{str});
        }
        return d(null, str);
    }

    public static String d(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a5f588a", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        if (StringUtils.isNotBlank(str)) {
            str2 = StringUtils.concatStr(str, str2);
        }
        if (c != null) {
            if (d.get()) {
                return c.a(str2);
            }
            return f21470a.get(str2);
        } else if (!a() || !f.get()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.XState", "[getValue]Attention :Use XState Local Mode: key:" + str2);
            }
            return f21470a.get(str2);
        } else {
            try {
                return b.getService().getValue(str2);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.XState", "[getValue] IXState.getValue(Key) failed,key:" + str2, e2);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[getValue]Attention :Use XState Local Mode: key:" + str2);
                }
                return f21470a.get(str2);
            }
        }
    }

    public static void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("609fd211", new Object[]{context});
        } else if (context == null) {
            TBSdkLog.e("mtopsdk.XState", "[init]init error,context is null");
        } else if (!e.compareAndSet(false, true)) {
            TBSdkLog.e("mtopsdk.XState", "[init]isInited = true");
        } else {
            g = context.getApplicationContext();
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e("mtopsdk.XState", "[init]XState init called");
            }
            try {
                RemoteConfig.getInstance().loadLocalUserAgentConfig(context.getApplicationContext());
                g(context);
            } catch (Throwable unused) {
            }
            String currentProcessName = MtopUtils.getCurrentProcessName(context);
            try {
                RemoteConfig.getInstance().loadLocalWidgetConfig(context.getApplicationContext());
                if (SwitchConfig.getInstance().isWidgetUseLocalData()) {
                    if (!Mtop.WIDGET_PROCESS_NAME.equals(currentProcessName)) {
                        if (Mtop.XIAOMI_WIDGET_PROCESS_NAME.equals(currentProcessName)) {
                        }
                    }
                    TBSdkLog.e("mtopsdk.XState", "[widgetProcess] use local data, process=" + currentProcessName);
                    return;
                }
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.XState", "[widgetProcess] use local data error: " + th.getMessage());
            }
            if (SwitchConfig.getInstance().isSimpleLinkEnable(context) && "com.taobao.taobao".equals(currentProcessName)) {
                if (c == null) {
                    c = new knx(context);
                }
                TBSdkLog.e("mtopsdk.XState", "[init]main process use local proxy.");
                c.b();
                for (Map.Entry<String, String> entry : f21470a.entrySet()) {
                    c.d(entry.getKey(), entry.getValue());
                }
                d.set(true);
            } else if (b == null) {
                a aVar = new a(IXState.class, XStateService.class);
                b = aVar;
                aVar.asyncBind(context);
            } else {
                n();
            }
        }
    }

    public static void f(Context context, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c2bc02", new Object[]{context, hashMap});
            return;
        }
        if (hashMap != null) {
            try {
                String str = (String) hashMap.get("deviceId");
                if (str != null) {
                    f21470a.put("utdid", str);
                }
            } catch (Throwable unused) {
                TBSdkLog.e("mtopsdk.XState", "[init]init error, params get exception");
                return;
            }
        }
        RemoteConfig.getInstance().loadLocalChannelLazyConfig(context.getApplicationContext());
        if (!SwitchConfig.getInstance().getEnableChannelLazy() || !"com.taobao.taobao:channel".equals(MtopUtils.getCurrentProcessName(context))) {
            e(context);
        } else {
            TBSdkLog.e("mtopsdk.XState", "[init]channel process init, Don't init XState");
        }
    }

    public static void g(Context context) {
        String utdid;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4aecc95", new Object[]{context});
            return;
        }
        try {
            String d2 = s1m.d(context);
            if (d2 != null) {
                f21470a.put(MspGlobalDefine.UA, d2);
            }
            ConcurrentHashMap<String, String> concurrentHashMap = f21470a;
            if (concurrentHashMap.get("utdid") == null && (utdid = UTDevice.getUtdid(context)) != null) {
                concurrentHashMap.put("utdid", utdid);
            }
            concurrentHashMap.put("t_offset", "0");
        } catch (Throwable th) {
            TBSdkLog.e("mtopsdk.XState", "[initPhoneInfo]initPhoneInfo error", th);
        }
    }

    public static boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3ca5f730", new Object[0])).booleanValue();
        }
        String c2 = c("AppBackground");
        if (c2 == null) {
            return false;
        }
        try {
            return Boolean.valueOf(c2).booleanValue();
        } catch (Exception unused) {
            TBSdkLog.e("mtopsdk.XState", "[isAppBackground] parse KEY_APP_BACKGROUND error");
            return false;
        }
    }

    public static boolean i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ae907f84", new Object[0])).booleanValue();
        }
        return e.get();
    }

    public static String j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8b95d10a", new Object[]{str, str2});
        }
        if (StringUtils.isBlank(str2)) {
            return null;
        }
        if (StringUtils.isNotBlank(str)) {
            str2 = StringUtils.concatStr(str, str2);
        }
        if (c != null) {
            if (d.get()) {
                return c.c(str2);
            }
            f21470a.remove(str2);
        }
        if (!a() || !f.get()) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                TBSdkLog.i("mtopsdk.XState", "[removeKey]Attention :Use XState Local Mode: key:" + str2);
            }
            f21470a.remove(str2);
        } else {
            try {
                return b.getService().removeKey(str2);
            } catch (Exception e2) {
                TBSdkLog.e("mtopsdk.XState", "[removeKey] IXState.removeKey(key) failed,key:" + str2, e2);
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[removeKey]Attention :Use XState Local Mode: key:" + str2);
                }
                f21470a.remove(str2);
            }
        }
        return null;
    }

    public static void k(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ff2f260", new Object[]{new Boolean(z)});
        } else {
            l("AppBackground", String.valueOf(z));
        }
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b8d794a", new Object[]{str, str2});
        } else {
            m(null, str, str2);
        }
    }

    public static void m(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e086a494", new Object[]{str, str2, str3});
        } else if (!StringUtils.isBlank(str2) && !StringUtils.isBlank(str3)) {
            if (StringUtils.isNotBlank(str)) {
                str2 = StringUtils.concatStr(str, str2);
            }
            if (c != null) {
                if (d.get()) {
                    c.d(str2, str3);
                } else {
                    f21470a.put(str2, str3);
                }
            } else if (!a() || !f.get()) {
                if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.WarnEnable)) {
                    TBSdkLog.i("mtopsdk.XState", "[setValue]Attention :Use XState Local Mode: key:" + str2 + ",value:" + str3);
                }
                f21470a.put(str2, str3);
            } else {
                try {
                    b.getService().setValue(str2, str3);
                } catch (Exception e2) {
                    TBSdkLog.e("mtopsdk.XState", "[setValue] IXState.setValue(key,value) failed,key:" + str2 + ",value:" + str3, e2);
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                        TBSdkLog.i("mtopsdk.XState", "[setValue]Attention :Use XState Local Mode: key:" + str2 + ",value:" + str3);
                    }
                    f21470a.put(str2, str3);
                }
            }
        }
    }

    public static void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17894e3", new Object[0]);
        } else if (a()) {
            IXState service = b.getService();
            try {
                service.init();
                for (Map.Entry<String, String> entry : f21470a.entrySet()) {
                    String key = entry.getKey();
                    String value = entry.getValue();
                    try {
                        service.setValue(key, value);
                        if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.InfoEnable)) {
                            TBSdkLog.i("mtopsdk.XState", "[syncToRemote] sync succeed, key:" + key + ",value:" + value);
                        }
                    } catch (Exception e2) {
                        TBSdkLog.e("mtopsdk.XState", "[syncToRemote] sync error, key:" + key + ",value:" + value, e2);
                    }
                }
                f.compareAndSet(false, true);
            } catch (Throwable th) {
                TBSdkLog.e("mtopsdk.XState", "syncToRemote error.", th);
            }
        }
    }
}
