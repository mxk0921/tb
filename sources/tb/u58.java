package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;
import com.google.android.gms.common.GoogleApiAvailability;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.HashMap;
import tb.y49;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class u58 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC = "taobao_android_address_dynamic";
    public static final String DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC = "order_map";
    public static final String TAG = "DynamicUtils";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements y49.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.u58$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class RunnableC1066a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public RunnableC1066a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                try {
                    boolean g = bcq.a().g(ff0.a(), false, u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
                    AdapterForTLog.loge(u58.TAG, "observerAddressDynamic load:" + g);
                    boolean a2 = u58.a(ff0.a());
                    AdapterForTLog.loge(u58.TAG, "observerAddressDynamic init:" + a2);
                } catch (Exception e) {
                    AdapterForTLog.loge(u58.TAG, "observerAddressDynamic init err", e);
                }
            }
        }

        @Override // tb.y49.a
        public void onFeatureStatusChange(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acce9b03", new Object[]{this, new Integer(i)});
                return;
            }
            String a2 = ddq.a().a(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC, "baseline");
            AdapterForTLog.loge(u58.TAG, "taobao_android_address_dynamic install status:" + i + " installSource:" + a2);
            if (i == 3) {
                AdapterForTLog.loge(u58.TAG, "observerAddressDynamic start load and init");
                kst.b(new RunnableC1066a());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            u58.e(u58.DYNAMIC_NAME_TAOBAO_ANDROID_AMAP_DYNAMIC);
            u58.e(u58.DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements rqk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29152a;
        public final /* synthetic */ HashMap b;

        public c(String str, HashMap hashMap) {
            this.f29152a = str;
            this.b = hashMap;
        }

        @Override // tb.rqk
        public void onFailure(Exception exc) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ebfde814", new Object[]{this, exc});
                return;
            }
            AdapterForTLog.loge(u58.TAG, "isDynamicFeatureLoadSync fail", exc);
            mtv.b(mtv.PAGE_NAME_ADDRESS_DYNAMIC, 19999, "isDynamicFeatureLoadSync", "fail", this.f29152a, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements gvk<Integer> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f29153a;
        public final /* synthetic */ HashMap b;

        public d(String str, HashMap hashMap) {
            this.f29153a = str;
            this.b = hashMap;
        }

        /* renamed from: b */
        public void onSuccess(Integer num) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("af0b58ec", new Object[]{this, num});
                return;
            }
            AdapterForTLog.loge(u58.TAG, "isDynamicFeatureLoadSync suc:" + num);
            mtv.b(mtv.PAGE_NAME_ADDRESS_DYNAMIC, 19999, "isDynamicFeatureLoadSync", "suc", this.f29153a, this.b);
        }
    }

    public static boolean a(Context context) {
        boolean z = false;
        try {
            AdapterForTLog.loge(TAG, "AddressDynamic start init");
            Class<?> cls = Class.forName("com.taobao.android.address.AddressDynamic");
            z = ((Boolean) cls.getMethod("init", Context.class).invoke(cls, context)).booleanValue();
            AdapterForTLog.loge(TAG, "AddressDynamic init:" + z);
            return z;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init AddressDynamic error", th);
            return z;
        }
    }

    public static boolean b(Context context) {
        boolean z = false;
        try {
            AdapterForTLog.loge(TAG, "addressOverseaDynamicInit start init");
            Class<?> cls = Class.forName("com.taobao.android.address.oversea.AddressOverseaDynamic");
            z = ((Boolean) cls.getMethod("init", Context.class).invoke(cls, context)).booleanValue();
            AdapterForTLog.loge(TAG, "addressOverseaDynamicInit init:" + z);
            return z;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "init addressOverseaDynamicInit error", th);
            return z;
        }
    }

    public static void c(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88e7c15d", new Object[]{new Integer(i)});
        } else if (rf0.j("isAddressDynamicFeatureInstallSync")) {
            kst.c(new b(), rf0.e("dynamicFeatureInstallMs", i));
        }
    }

    public static synchronized boolean e(String str) {
        Throwable th;
        HashMap hashMap;
        boolean d2;
        boolean z = false;
        synchronized (u58.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("424a0657", new Object[]{str})).booleanValue();
            }
            try {
                hashMap = new HashMap();
                d2 = d(str);
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " install1:" + d2);
                hashMap.put("install1", String.valueOf(d2));
                hashMap.put(ru1.FEATURE_NAME, str);
            } catch (Throwable th3) {
                th = th3;
                z = d2;
                AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync error dump:", th);
                AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " install:" + z);
                return z;
            }
            if (!d2) {
                boolean g = bcq.a().g(ff0.a(), false, str);
                AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " loaded:" + g);
                hashMap.put(com.taobao.android.weex_uikit.widget.musview.a.EVENT_LOAD, String.valueOf(g));
                if (g) {
                    z = d(str);
                    AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " install2:" + z);
                    hashMap.put("install2", String.valueOf(z));
                    hashMap.put("install", String.valueOf(z));
                    mtv.b(mtv.PAGE_NAME_ADDRESS_DYNAMIC, 19999, str, "install=" + z, "", hashMap);
                    AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " install:" + z);
                    return z;
                }
                AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " startInstall");
                vcq.a(ff0.a()).c(xcq.c().l(str).n()).c(new d(str, hashMap)).b(new c(str, hashMap));
            }
            z = d2;
            hashMap.put("install", String.valueOf(z));
            mtv.b(mtv.PAGE_NAME_ADDRESS_DYNAMIC, 19999, str, "install=" + z, "", hashMap);
            AdapterForTLog.loge(TAG, "isDynamicFeatureLoadSync featureName:" + str + " install:" + z);
            return z;
        }
    }

    public static boolean f(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("90e65ab1", new Object[]{context})).booleanValue();
        }
        try {
            if (GoogleApiAvailability.getInstance().isGooglePlayServicesAvailable(context) == 0) {
                return true;
            }
            return false;
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "isGooglePlayServicesAvailable error", th);
            return false;
        }
    }

    public static void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c458aa0", new Object[]{context});
            return;
        }
        try {
            AdapterForTLog.loge(TAG, "observerAddressDynamic start");
            o49.b().d(DYNAMIC_NAME_TAOBAO_ANDROID_ADDRESS_DYNAMIC, new a(), kst.a());
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "observerAddressDynamic error", th);
        }
    }

    public static void h(Activity activity, int i, int i2, Intent intent, boolean z) {
        try {
            AdapterForTLog.loge(TAG, "ocrMgronActivityResult");
            Class<?> cls = Class.forName("com.taobao.android.address.ocr.OcrMgr");
            Object invoke = cls.getMethod("getInstance", new Class[0]).invoke(cls, new Object[0]);
            Class<?> cls2 = Integer.TYPE;
            cls.getMethod("onActivityResult", Activity.class, cls2, cls2, Intent.class, Boolean.TYPE).invoke(invoke, activity, Integer.valueOf(i), Integer.valueOf(i2), intent, Boolean.valueOf(z));
        } catch (Throwable th) {
            AdapterForTLog.loge(TAG, "ocrMgronActivityResult error dump: ", th);
        }
    }

    public static synchronized boolean d(String str) {
        boolean z = false;
        boolean z2 = true;
        synchronized (u58.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("a9602fef", new Object[]{str})).booleanValue();
            }
            AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall featureName:" + str);
            ucq h = com.taobao.appbundle.a.Companion.a().h();
            if (h != null) {
                DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
                if (dynamicFeatureInfo == null) {
                    AdapterForTLog.loge("模块内置：" + dynamicFeatureInfo.featureName, new String[0]);
                } else {
                    if (h.f().contains(dynamicFeatureInfo.featureName)) {
                        AdapterForTLog.loge("模块已经安装完成：" + dynamicFeatureInfo.featureName, new String[0]);
                    }
                    AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall install:" + z + " featureName:" + str);
                    z2 = z;
                }
                z = true;
                AdapterForTLog.loge(TAG, "isAddressDynamicFeatureInstall install:" + z + " featureName:" + str);
                z2 = z;
            } else {
                AdapterForTLog.loge("manager is null", new String[0]);
            }
            return z2;
        }
    }
}
