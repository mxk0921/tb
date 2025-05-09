package com.taobao.android.shop.application;

import android.app.Application;
import android.text.TextUtils;
import android.util.Log;
import com.alibaba.aliweex.utils.MemoryMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.orange.OrangeConfig;
import com.taobao.weex.WXEnvironment;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.utils.WXFileUtils;
import com.taobao.weex.utils.WXLogUtils;
import java.io.Serializable;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import mtopsdk.common.util.SymbolExpUtil;
import tb.e4x;
import tb.iqx;
import tb.opp;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ShopLauncher implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static volatile AtomicBoolean prepared = new AtomicBoolean(false);
    private static final long serialVersionUID = -8810965795436012371L;
    private Runnable mRunnable = new a();

    static {
        t2o.a(764411949);
    }

    public static /* synthetic */ void access$000(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd32a15", new Object[]{str, str2, str3});
        } else {
            loadRaxFramework(str, str2, str3);
        }
    }

    private static void loadRaxFramework(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2800b40", new Object[]{str, str2, str3});
            return;
        }
        String streamByUrl = iqx.getStreamByUrl("rax", str3);
        if (TextUtils.isEmpty(streamByUrl)) {
            streamByUrl = WXFileUtils.loadAsset(str2, WXEnvironment.getApplication());
        }
        boolean registerService = WXSDKEngine.registerService(str, streamByUrl, new HashMap());
        WXLogUtils.d("rax framework init " + str2 + " result: " + registerService);
    }

    public void prepareJS(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a174a89d", new Object[]{this, new Boolean(z)});
        } else if (!prepared.compareAndSet(true, true)) {
            opp.p("main-cost", "ShopLauncher prepareJS ", Boolean.valueOf(z));
            try {
                String config = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_frame_js", "https://market.m.taobao.com/apps/market/shop/weex_v2.html");
                if (!TextUtils.isEmpty(config)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int z2 = e4x.t().z(config);
                    if (opp.f().booleanValue() && -1 != z2) {
                        opp.o("main-cost", "ShopApplication prepare first js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms. ", Integer.valueOf(z2), Thread.currentThread().getName());
                    }
                }
                if (z) {
                    this.mRunnable.run();
                } else {
                    Coordinator.execute(this.mRunnable, 20);
                }
            } catch (Exception e) {
                Log.e("shop", "error in init ShopLauncher.prepareJS", e);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                String config = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_inner_js", "//market.m.taobao.com/app/tb-source-app/shopindex/pages/index");
                int i = -1;
                if (!TextUtils.isEmpty(config)) {
                    long currentTimeMillis = System.currentTimeMillis();
                    int z = e4x.t().z(config);
                    if (opp.f().booleanValue() && -1 != z) {
                        opp.o("main-cost", "ShopApplication prepare homepage js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis), " ms. ", Integer.valueOf(z), Thread.currentThread().getName());
                    }
                }
                String config2 = OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_other_js", "");
                if (!TextUtils.isEmpty(config2)) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    String[] split = config2.split(SymbolExpUtil.SYMBOL_VERTICALBAR);
                    if (split != null && split.length > 0) {
                        int i2 = 0;
                        while (i2 < split.length) {
                            if (!TextUtils.isEmpty(split[i2])) {
                                int z2 = e4x.t().z(split[i2]);
                                if (opp.f().booleanValue() && i != z2) {
                                    opp.o("main-cost", "ShopApplication prepare other js-bundle done. cost ", Long.valueOf(System.currentTimeMillis() - currentTimeMillis2), " ms. ", Integer.valueOf(z2), Thread.currentThread().getName());
                                }
                            }
                            i2++;
                            i = -1;
                        }
                    }
                }
                if ("true".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_rax_js", "false"))) {
                    long currentTimeMillis3 = System.currentTimeMillis();
                    ShopLauncher.access$000("rax14", "rax14.js", "http://h5.m.taobao.com/app/rax/rax14.js");
                    if (opp.f().booleanValue()) {
                        opp.o("main-cost", "loadRaxFramework done. cost " + (System.currentTimeMillis() - currentTimeMillis3) + " ms. " + Thread.currentThread().getName());
                    }
                }
            } catch (Throwable th) {
                Log.e("shop", "error in init ShopLauncher.prepareJS runnable", th);
            }
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
            return;
        }
        if (opp.f().booleanValue()) {
            opp.o("main-cost", "ShopLauncher init.  deviceLevel is " + MemoryMonitor.a() + " launcher_shop_init is " + OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init", "true") + " launcher_shop_init_on_low_device is " + OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_on_low_device", "true"));
        }
        if (!"false".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_by_launcher", "true"))) {
            if (!"low_end".equals(MemoryMonitor.a()) || !"false".equals(OrangeConfig.getInstance().getConfig("shop_render", "launcher_shop_init_on_low_device", "true"))) {
                prepareJS(true);
            }
        }
    }
}
