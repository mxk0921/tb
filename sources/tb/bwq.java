package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.message.WVSubscribePlugin;
import com.taobao.android.live.plugin.atype.flexalocal.subscribe.IObserverX;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class bwq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Class<?> f16687a;

    static {
        t2o.a(295699823);
    }

    public static void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d0515d7", new Object[0]);
        } else if (f16687a == null) {
            try {
                f16687a = Class.forName("com.taobao.live.live.adapterimpl.subscribe.SubscribeX");
            } catch (Throwable th) {
                o3s.e("SubscribeX", th.getMessage());
            }
        }
    }

    public static void b(boolean z, String str, String str2, String str3, String str4, IObserverX iObserverX) {
        try {
            a();
            f16687a.getMethod("dXTaoLiveEndRecommendSubscribe", Boolean.TYPE, String.class, String.class, String.class, String.class, IObserverX.class).invoke(null, Boolean.valueOf(z), str, str2, str3, str4, iObserverX);
        } catch (Throwable th) {
            o3s.e("SubscribeX", th.getMessage());
        }
    }

    public static void c(String str, String str2, String str3, String str4, IObserverX iObserverX) {
        try {
            a();
            f16687a.getMethod(WVSubscribePlugin.ACTION_QUERY_SUBSCRIBE, String.class, String.class, String.class, String.class, IObserverX.class).invoke(null, str, str2, str3, str4, iObserverX);
        } catch (Throwable th) {
            o3s.e("SubscribeX", th.getMessage());
        }
    }
}
