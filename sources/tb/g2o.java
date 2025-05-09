package tb;

import android.app.Activity;
import android.os.Bundle;
import android.os.Debug;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.icart.BaseICartFragmentProxy;
import com.taobao.android.opencart.AddBagRequester;
import com.taobao.tao.TBMainHost;
import com.taobao.tao.navigation.TBFragmentTabHost;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import kotlin.jvm.JvmStatic;
import tb.ub3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class g2o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(478150902);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final void a(Activity activity, Bundle bundle, BaseICartFragmentProxy.FragmentProxyType fragmentProxyType) {
            String currentTabTag;
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ac31e56", new Object[]{this, activity, bundle, fragmentProxyType});
                return;
            }
            ckf.g(activity, "activity");
            ckf.g(fragmentProxyType, "fragmentProxyType");
            HashMap hashMap = new HashMap();
            TBMainHost b = TBMainHost.b();
            ckf.f(b, "TBMainHost.get()");
            boolean z2 = b.getContext() == activity;
            if (bundle == null) {
                z = false;
            }
            String a2 = wj7.a();
            if (bundle != null) {
                currentTabTag = bundle.getString("curTab");
            } else {
                TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
                currentTabTag = o != null ? o.getCurrentTabTag() : null;
            }
            hashMap.put("isMain", String.valueOf(z2));
            hashMap.put("isRecreate", String.valueOf(z));
            hashMap.put("currentTab", String.valueOf(currentTabTag));
            hashMap.put("fragmentProxyType", fragmentProxyType.name());
            ckf.f(a2, "devices");
            hashMap.put("devices", a2);
            if (bundle != null && wj7.b()) {
                Runtime runtime = Runtime.getRuntime();
                long j = runtime.totalMemory();
                long maxMemory = runtime.maxMemory();
                hashMap.put("javaUsed", String.valueOf(j - runtime.freeMemory()));
                hashMap.put("javaTotal", String.valueOf(j));
                hashMap.put("javaMax", String.valueOf(maxMemory));
                hashMap.put("pss", String.valueOf(Debug.getPss() * 1024));
                hashMap.put("nativeHeapSize", String.valueOf(Debug.getNativeHeapSize()));
                hashMap.put("nativeHeapFreeSize", String.valueOf(Debug.getNativeHeapFreeSize()));
                hashMap.put("nativeHeapAllocatedSize", String.valueOf(Debug.getNativeHeapAllocatedSize()));
                long j2 = bundle.getLong("fragmentPauseTime", 0L);
                if (j2 > 0) {
                    hashMap.put("fragmentPauseDuration", String.valueOf(System.currentTimeMillis() - j2));
                }
            }
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(AddBagRequester.sUTPageShoppingCart, 19999, "Page_ShoppingCart_EnterCartFragment", null, null, hashMap);
            UTAnalytics instance = UTAnalytics.getInstance();
            ckf.f(instance, "UTAnalytics.getInstance()");
            instance.getDefaultTracker().send(uTOriginalCustomHitBuilder.build());
            ub3.e(ub3.a.a("enterCartFragment").tag("进入购物车").message("进入购物车").sampling(0.1f).dimension("d1", String.valueOf(z2)).dimension("d2", String.valueOf(z)).dimension("d3", fragmentProxyType.name()).dimension("d4", a2).dimension("d5", String.valueOf(currentTabTag)));
        }
    }

    static {
        t2o.a(478150901);
    }

    @JvmStatic
    public static final void a(Activity activity, Bundle bundle, BaseICartFragmentProxy.FragmentProxyType fragmentProxyType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ac31e56", new Object[]{activity, bundle, fragmentProxyType});
        } else {
            Companion.a(activity, bundle, fragmentProxyType);
        }
    }
}
