package tb;

import android.content.Context;
import android.taobao.windvane.WindVaneSDK;
import android.taobao.windvane.extra.InitWVParamsTask;
import android.taobao.windvane.extra.WVIAdapter;
import android.taobao.windvane.extra.WVSchemeProcessor;
import android.taobao.windvane.extra.config.TBConfigManager;
import android.taobao.windvane.extra.jsbridge.TBJsApiManager;
import android.taobao.windvane.extra.uc.WVUCPrecacheManager;
import android.taobao.windvane.extra.uc.pool.WebViewPool;
import android.taobao.windvane.monitor.WVLocPerformanceMonitor;
import android.text.TextUtils;
import com.alipay.mobile.common.logging.api.ProcessInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.themis.kernel.basic.TMSLogger;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class lex {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "WindVaneSDKForTB";

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f23303a = new AtomicBoolean(false);
    public static final String[] TB_UC_SDK_APP_KEY_SEC = {"YKIXAXN/9v6Tez0oeIRx9ilCfTkSFozXf+nmGRTPG7ruP1KycnZL8vCcjyaMMGajricmE9blrBlr\nO+HGrJUsuw==\n", "RjpgSKj6piHyametkuIC/9mWn1DKkVntRLhh4mOYlf6/g/wO1kioAHE7weTqAdqn05FXCu0dJU+p6pKC6I+k8w=="};
    public static WVIAdapter b = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class b implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f23305a;

        static {
            t2o.a(989855752);
            t2o.a(989856388);
        }

        public b(Context context) {
            this.f23305a = context;
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            kqw kqwVar = new kqw(false);
            if (i == 7001) {
                v7t.i("WVConfigManager", "receive orange register");
                TBConfigManager.getInstance().initAfterAWP(this.f23305a);
                lqw.d().h(this);
            }
            return kqwVar;
        }
    }

    static {
        t2o.a(989855750);
    }

    public static /* synthetic */ boolean a(boolean z) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("e1554b7f", new Object[]{new Boolean(z)})).booleanValue() : z;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class a implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ chb f23304a;

        public a(chb chbVar) {
            this.f23304a = chbVar;
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
                return;
            }
            lex.a(this.f23304a.getBoolean("isInBackground", false));
            boolean z = trw.getPackageMonitorInterface() != null;
            if (i == 2) {
                long currentTimeMillis = System.currentTimeMillis();
                v7t.i(lex.TAG, "app active at time : " + currentTimeMillis);
                yaa.k = false;
                if (z && trw.getPackageMonitorInterface() != null) {
                    trw.getPackageMonitorInterface().uploadStartAppTime(currentTimeMillis);
                }
            }
            if (i == 1) {
                long currentTimeMillis2 = System.currentTimeMillis();
                v7t.i(lex.TAG, "app background at time : " + currentTimeMillis2);
                yaa.k = true;
                if (z && trw.getPackageMonitorInterface() != null) {
                    trw.getPackageMonitorInterface().uploadBackgroundTime(currentTimeMillis2);
                }
            }
        }
    }

    public static void b(Context context, String str, int i, lpw lpwVar, HashMap<String, Object> hashMap) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9b46c7b", new Object[]{context, str, new Integer(i), lpwVar, hashMap});
        } else if (h8s.a(context.getApplicationContext())) {
            TMSLogger.b("TMSEarlyInitializer", "skip WindVaneSDKForTB");
        } else {
            if (ABGlobal.isFeatureOpened(context, "OptInitWindVane")) {
                str2 = (String) hashMap.get("process");
            } else {
                str2 = x74.h(context);
            }
            if (!TextUtils.isEmpty(str2) && !str2.endsWith("sandboxed_process0") && !str2.endsWith("sandboxed_privilege_process0") && !str2.endsWith(ProcessInfo.ALIAS_GPU_PROCESS)) {
                if (f23303a.compareAndSet(false, true)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    if (lpwVar.f == null) {
                        lpwVar.f = TB_UC_SDK_APP_KEY_SEC;
                    }
                    if (ABGlobal.isFeatureOpened(context, "OptInitWvParam") || InitWVParamsTask.isInitWVParamOpenV2(context)) {
                        try {
                            if (vpw.commonConfig.O) {
                                long currentTimeMillis2 = System.currentTimeMillis();
                                gvm.a(context);
                                v7t.d(TAG, "opt useTime PreStartup " + (System.currentTimeMillis() - currentTimeMillis2));
                            }
                        } catch (Throwable th) {
                            th.printStackTrace();
                        }
                    }
                    WVUCPrecacheManager.getInstance();
                    yru yruVar = new yru();
                    yruVar.f32310a = "windvane";
                    yruVar.b = "vKFaqtcEUEHI15lIOzsI6jIQldPpaCZ3";
                    yruVar.e = 1;
                    yruVar.d = 1;
                    yruVar.c = og8.b();
                    lpwVar.g = yruVar;
                    if (!mpw.a().b()) {
                        mpw.a().c(lpwVar);
                        yaa.f().k(lpwVar);
                    }
                    TBConfigManager.getInstance().initEarly(context);
                    WindVaneSDK.init(context, str, i, lpwVar);
                    TBConfigManager.getInstance().initConfig();
                    long currentTimeMillis3 = System.currentTimeMillis() - currentTimeMillis;
                    vrw.getInstance().init(context, true);
                    dpw.a();
                    nrw.init();
                    TBJsApiManager.initJsApi();
                    if (og8.d()) {
                        lqw.d().c(WVLocPerformanceMonitor.getInstance(), lqw.f);
                        lqw.d().e(3009);
                    }
                    psw.b(new WVSchemeProcessor());
                    try {
                        lqw.d().c(new b(context), lqw.e);
                        c21.c(new a(c21.g()));
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                    }
                    y71.commitWVInitTime(currentTimeMillis3, System.currentTimeMillis() - currentTimeMillis);
                    WebViewPool.setUp(context);
                    return;
                }
                v7t.d("InitWindVane", "windvane has already initiated");
            }
        }
    }
}
