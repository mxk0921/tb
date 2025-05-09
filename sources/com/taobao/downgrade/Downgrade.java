package com.taobao.downgrade;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.downgrade.rule.AvailableBizRule;
import com.taobao.downgrade.rule.BusinessRule;
import com.taobao.downgrade.rule.DefaultRule;
import com.taobao.orange.OrangeConfig;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import tb.fsw;
import tb.fwf;
import tb.hoq;
import tb.obk;
import tb.qxl;
import tb.t81;
import tb.tvn;
import tb.vnq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class Downgrade implements Handler.Callback {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String CONFIG_KEY_BIZ = "BizConfig";
    private static final String CONFIG_KEY_EFF = "AvailableBiz";
    private static final String CONFIG_KEY_GLOBAL = "GlobalConfig";
    private static final String CONFIG_NAMESPACE_EFF = "android_kite_effective_biz";
    private static final String CONFIG_NAMESPACE_GLOBAL = "android_kite_global_config";
    private static final int MSG_AVAILABLE = 3;
    private static final int MSG_GIZ = 1;
    private static final int MSG_GLOBAL = 2;
    private static final String NULL_BIZ = "nullBiz";
    public static final String TAG = "BYDowngrade";
    private static AtomicBoolean init = new AtomicBoolean(false);
    public static boolean isTest = false;
    private DefaultRule mDefaultRule;
    private qxl mPerformanceMonitor;
    private final vnq mStorage;
    private Handler mWorkHandler;
    private HandlerThread mWorkHandlerThread;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            String config;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
            } else if (Downgrade.CONFIG_NAMESPACE_GLOBAL.equals(str)) {
                String config2 = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_GLOBAL, null);
                if (config2 != null) {
                    Message.obtain(Downgrade.access$000(Downgrade.this), 2, config2).sendToTarget();
                }
            } else if (Downgrade.CONFIG_NAMESPACE_EFF.equals(str) && (config = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_EFF, null)) != null) {
                Message.obtain(Downgrade.access$000(Downgrade.this), 3, config).sendToTarget();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements obk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.obk
        public void onConfigUpdate(String str, Map<String, String> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4f2fc4ea", new Object[]{this, str, map});
                return;
            }
            String config = OrangeConfig.getInstance().getConfig(str, Downgrade.CONFIG_KEY_BIZ, null);
            if (config != null) {
                Message.obtain(Downgrade.access$000(Downgrade.this), 1, config).sendToTarget();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final Downgrade f10388a = new Downgrade(null);
    }

    public /* synthetic */ Downgrade(a aVar) {
        this();
    }

    public static /* synthetic */ Handler access$000(Downgrade downgrade) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e6e3d708", new Object[]{downgrade});
        }
        return downgrade.mWorkHandler;
    }

    public static Downgrade getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Downgrade) ipChange.ipc$dispatch("1826310b", new Object[0]);
        }
        return c.f10388a;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
        } else if (t81.s() != null && t81.s().equals(t81.v())) {
            initGlobalListener();
        }
    }

    private void initBizListener(AvailableBizRule availableBizRule) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("368690a1", new Object[]{this, availableBizRule});
        } else if (availableBizRule != null && availableBizRule.getBizMap() != null) {
            Set<String> keySet = availableBizRule.getBizMap().keySet();
            if (keySet.size() != 0) {
                String[] strArr = new String[keySet.size()];
                keySet.toArray(strArr);
                OrangeConfig.getInstance().registerListener(strArr, new b(), false);
            }
        }
    }

    private void initGlobalListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dd9c7ae", new Object[]{this});
        } else {
            OrangeConfig.getInstance().registerListener(new String[]{CONFIG_NAMESPACE_EFF, CONFIG_NAMESPACE_GLOBAL}, new a(), false);
        }
    }

    private void initWorkHandlerThread() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb4ae3a", new Object[]{this});
            return;
        }
        HandlerThread handlerThread = new HandlerThread("downgradeThread");
        this.mWorkHandlerThread = handlerThread;
        handlerThread.start();
        this.mWorkHandler = new Handler(this.mWorkHandlerThread.getLooper(), this);
    }

    private AvailableBizRule saveAndCleanAvailableConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AvailableBizRule) ipChange.ipc$dispatch("b9169c6c", new Object[]{this, str});
        }
        AvailableBizRule b2 = fwf.b(str);
        if (!this.mStorage.d(str)) {
            return null;
        }
        this.mStorage.c(str);
        return b2;
    }

    private void saveBizConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b94dc9", new Object[]{this, str});
        } else {
            this.mStorage.f(str);
        }
    }

    private void saveGlobalConfig(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8046b3f3", new Object[]{this, str});
        } else {
            this.mStorage.e(str);
        }
    }

    private void startPerformanceMonitor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f024b993", new Object[]{this});
        } else if (this.mPerformanceMonitor == null) {
            qxl qxlVar = new qxl(this.mWorkHandler, this.mStorage);
            this.mPerformanceMonitor = qxlVar;
            qxlVar.c();
        }
    }

    public DowngradeStrategy getDowngradeStrategy(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DowngradeStrategy) ipChange.ipc$dispatch("f5075067", new Object[]{this, str});
        }
        DefaultRule b2 = this.mStorage.b("default");
        if (b2 == null || !b2.power) {
            return com.taobao.downgrade.b.c();
        }
        if (b2.degrade) {
            return com.taobao.downgrade.b.a();
        }
        if (TextUtils.isEmpty(str)) {
            return com.taobao.downgrade.b.b(b2, NULL_BIZ);
        }
        BusinessRule a2 = this.mStorage.a(str);
        if (a2 == null) {
            return com.taobao.downgrade.b.b(b2, str);
        }
        DowngradeStrategy d = com.taobao.downgrade.b.d(a2, b2);
        return d == null ? com.taobao.downgrade.b.b(b2, str) : d;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        AvailableBizRule saveAndCleanAvailableConfig;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("282a8c1d", new Object[]{this, message})).booleanValue();
        }
        int i = message.what;
        if (i == 1) {
            saveBizConfig((String) message.obj);
        } else if (i == 2) {
            saveGlobalConfig((String) message.obj);
        } else if (i == 3 && (saveAndCleanAvailableConfig = saveAndCleanAvailableConfig((String) message.obj)) != null) {
            initBizListener(saveAndCleanAvailableConfig);
        }
        return false;
    }

    private Downgrade() {
        vnq a2 = hoq.a(0);
        this.mStorage = a2;
        initWorkHandlerThread();
        if (!(this.mWorkHandler == null || a2 == null)) {
            startPerformanceMonitor();
        }
        fsw.i(AliHADowngradeSDKBridge.JS_BRIDGE_SDK_NAME, AliHADowngradeSDKBridge.class, false);
    }

    public static void init(Context context, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48838554", new Object[]{context, map});
        } else if (init.compareAndSet(false, true)) {
            if (map != null) {
                t81.B(tvn.a(map, "appVersion", ""));
                t81.F(tvn.a(map, "userId", "0"));
                t81.G(tvn.a(map, "deviceId", ""));
                t81.E(tvn.a(map, "process", ""));
                t81.D(tvn.a(map, "packageName", ""));
            }
            t81.C(context);
            getInstance().init();
        }
    }
}
