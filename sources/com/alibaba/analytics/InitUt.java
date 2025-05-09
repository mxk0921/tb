package com.alibaba.analytics;

import android.app.Application;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import java.io.Serializable;
import java.util.HashMap;
import tb.b1v;
import tb.o4e;
import tb.p4e;
import tb.u2v;
import tb.x4e;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class InitUt implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static String KEY_SHOULD_FALLBACK_TO_OLD_UT = "shouldFallbackToOldUt";
    private static final String TAG = "Analytics.InitUt";
    private static final String WIDGET_PROCESS_NAME = "com.taobao.taobao:widgetProvider";
    private static boolean isNotUiSubProcess;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements o4e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f2112a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ boolean d;

        public a(InitUt initUt, String str, String str2, String str3, boolean z) {
            this.f2112a = str;
            this.b = str2;
            this.c = str3;
            this.d = z;
        }

        @Override // tb.o4e
        public String getUTAppVersion() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f5fc98ad", new Object[]{this});
            }
            return this.f2112a;
        }

        @Override // tb.o4e
        public String getUTChannel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("738ca0eb", new Object[]{this});
            }
            return this.b;
        }

        @Override // tb.o4e
        public p4e getUTCrashCraughtListener() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (p4e) ipChange.ipc$dispatch("3267ae60", new Object[]{this});
            }
            return null;
        }

        @Override // tb.o4e
        public x4e getUTRequestAuthInstance() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (x4e) ipChange.ipc$dispatch("1ae7bc70", new Object[]{this});
            }
            return new u2v(this.c);
        }

        @Override // tb.o4e
        public boolean isAliyunOsSystem() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e9718b9c", new Object[]{this})).booleanValue();
            }
            return false;
        }

        @Override // tb.o4e
        public boolean isUTCrashHandlerDisable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2fc5647", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // tb.o4e
        public boolean isUTLogEnable() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("515bc429", new Object[]{this})).booleanValue();
            }
            if (this.d) {
                return true;
            }
            return false;
        }
    }

    public void init(Application application, HashMap<String, Object> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dddb138b", new Object[]{this, application, hashMap});
        } else if (application == null || hashMap == null) {
            if (application == null) {
                Log.e(TAG, "ut init error: application is null");
            }
            if (hashMap == null) {
                Log.e(TAG, "ut init error: params is null");
            }
        } else {
            if (hashMap.get("isDebuggable") != null ? ((Boolean) hashMap.get("isDebuggable")).booleanValue() : false) {
                application.toString();
                hashMap.toString();
            }
            StringBuilder sb = new StringBuilder();
            sb.append(hashMap.get("appVersion"));
            String str = "";
            sb.append(str);
            String sb2 = sb.toString();
            String str2 = hashMap.get("ttid") + str;
            String str3 = hashMap.get("constantAppkey") + str;
            boolean booleanValue = hashMap.get("isUserTracklogEnable") != null ? ((Boolean) hashMap.get("isUserTracklogEnable")).booleanValue() : false;
            boolean booleanValue2 = hashMap.get("isMiniPackage") != null ? ((Boolean) hashMap.get("isMiniPackage")).booleanValue() : false;
            try {
                isNotUiSubProcess = "1".equalsIgnoreCase(hashMap.get(KEY_SHOULD_FALLBACK_TO_OLD_UT) + str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            b1v.bJTrackExtend = true;
            b1v.bAntiCheat = true;
            b1v.bUTMtopConfig = true;
            b1v.bXmodule = true;
            if (hashMap.get("process") != null) {
                str = hashMap.get("process") + str;
            }
            if ("com.taobao.taobao:widgetProvider".equals(str)) {
                b1v.bXmodule = false;
            }
            UTAnalytics.getInstance().setAppApplicationInstance(application, new a(this, sb2, str2, str3, booleanValue));
            UTAnalytics.getInstance().turnOffAutoPageTrack();
            if (booleanValue2) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("isMiniPackage", "true");
                UTAnalytics.getInstance().updateSessionProperties(hashMap2);
            }
        }
    }
}
