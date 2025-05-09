package com.alipay.mobile.verifyidentity.info;

import android.content.Context;
import android.text.TextUtils;
import com.alipay.android.msp.constants.MspGlobalDefine;
import com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider;
import com.alipay.mobile.verifyidentity.engine.MicroModuleContext;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.alipay.mobile.verifyidentity.uitl.PlatformUtils;
import com.alipay.mobile.verifyidentity.utils.CommonConstant;
import com.alipay.mobile.verifyidentity.utils.ReflectUtils;
import com.alipay.mobile.verifyidentity.utils.VIUtils;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class AppInfo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile AppInfo c;
    public static final Map<String, String> d;

    /* renamed from: a  reason: collision with root package name */
    public AppDataProvider f4296a;
    public final AppDataProvider b = new AppDataProvider() { // from class: com.alipay.mobile.verifyidentity.info.AppInfo.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getApdid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a23faff", new Object[]{this});
            }
            String apdid = PlatformUtils.getApdid(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "apdid: " + apdid);
            return apdid;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getApdidToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
            }
            String apdidToken = PlatformUtils.getApdidToken(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "apdidToken: " + apdidToken);
            return apdidToken;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppKey() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            if (context == null) {
                VerifyLogCat.e(AppInfo.access$000(), "can't get Default AppKey because context is null! ");
                return "";
            }
            String str = (String) AppInfo.access$100().get(context.getPackageName());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "Default AppKey for this app: " + str);
            return str;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            if (context != null) {
                return context.getPackageName();
            }
            VerifyLogCat.e(AppInfo.access$000(), "getAppName failed!");
            return "";
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
            }
            Context context = MicroModuleContext.getInstance().getContext();
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            } catch (Throwable th) {
                VerifyLogCat.e(AppInfo.access$000(), th);
                return "";
            }
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getTid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
            }
            String tid = VIUtils.getTid();
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "tid: " + tid);
            return tid;
        }

        @Override // com.alipay.mobile.verifyidentity.dataprovider.AppDataProvider
        public String getUmidToken() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
            }
            String umidToken = PlatformUtils.getUmidToken(MicroModuleContext.getInstance().getContext());
            String access$000 = AppInfo.access$000();
            VerifyLogCat.i(access$000, "兜底umidToken: " + umidToken);
            return umidToken;
        }
    };

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("com.taobao.mobile.dipei", "21533232");
        hashMap.put("com.alipay.m.portal", "23189718");
        hashMap.put(MspGlobalDefine.PACKAGE_AFWEALTH, "23181530");
        hashMap.put("com.antfortune.wealthrc", "23181530");
        hashMap.put("com.eg.android.AlipayGphone", "12501616");
        hashMap.put("com.eg.android.AlipayGphoneRC", "12501616");
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return "AppInfo";
    }

    public static /* synthetic */ Map access$100() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d58732ed", new Object[0]);
        }
        return d;
    }

    public static AppInfo getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AppInfo) ipChange.ipc$dispatch("57b4fd93", new Object[0]);
        }
        if (c == null) {
            synchronized (AppInfo.class) {
                try {
                    if (c == null) {
                        c = new AppInfo();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    public String getApdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a23faff", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getApdid())) {
            return this.b.getApdid();
        }
        return this.f4296a.getApdid();
    }

    public String getApdidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e63dfe7a", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getApdidToken())) {
            return this.b.getApdidToken();
        }
        return this.f4296a.getApdidToken();
    }

    public String getAppKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("49079005", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getAppKey())) {
            return this.b.getAppKey();
        }
        return this.f4296a.getAppKey();
    }

    public String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getAppName())) {
            return this.b.getAppName();
        }
        return this.f4296a.getAppName();
    }

    public String getAppVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65f009ac", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getAppVersion())) {
            return this.b.getAppVersion();
        }
        return this.f4296a.getAppVersion();
    }

    public String getDeviceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("37b43413", new Object[]{this});
        }
        return "android";
    }

    public String getTid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("12a13f40", new Object[]{this});
        }
        return this.b.getTid();
    }

    public String getUmidToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("db4aa3a9", new Object[]{this});
        }
        AppDataProvider appDataProvider = this.f4296a;
        if (appDataProvider == null || TextUtils.isEmpty(appDataProvider.getUmidToken())) {
            return this.b.getUmidToken();
        }
        return this.f4296a.getUmidToken();
    }

    public String getViSdkVersion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("41802492", new Object[]{this});
        }
        return CommonConstant.VI_SDK_VERSION;
    }

    public void setDataProvider(AppDataProvider appDataProvider) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3ca9a53", new Object[]{this, appDataProvider});
        } else {
            this.f4296a = appDataProvider;
        }
    }

    public String getMspTid() {
        Context context;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa3c6e3e", new Object[]{this});
        }
        try {
            context = MicroModuleContext.getInstance().getContext();
            VerifyLogCat.i("AppInfo", "loadTID getmspTio");
        } catch (Throwable th) {
            VerifyLogCat.i("AppInfo", "get loadTID error:" + th.getMessage());
        }
        if (context == null) {
            VerifyLogCat.e("AppInfo", "loadTID failed!");
            return "";
        }
        VerifyLogCat.i("AppInfo", "get loadTID start");
        Object invokeStaticMethod = ReflectUtils.invokeStaticMethod("com.alipay.android.msp.framework.helper.TidHelper", "loadTID", new Class[]{Context.class}, new Object[]{context});
        if (invokeStaticMethod != null) {
            VerifyLogCat.i("AppInfo", "get loadTID not null");
            Object invokeMethod = ReflectUtils.invokeMethod(invokeStaticMethod, "getTid");
            if (invokeMethod != null) {
                VerifyLogCat.i("AppInfo", "get loadTID :".concat(String.valueOf(invokeMethod)));
                return String.valueOf(invokeMethod);
            }
        }
        return "";
    }
}
