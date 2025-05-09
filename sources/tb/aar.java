package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class aar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f15632a = "/sre.buy.init_container";
    public static final String b = "/sre.buy.halfbuy_init_container";
    public static final String c = "/sre.buy.full_init_container";
    public static final String d = "/sre.buy.lightbuy_init_container";
    public static final String e = "/sre.buy.lightbuy_close_container";
    public static final String f = "/sre.buy.halfbuy_close_container";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f15633a;

        public a(String str) {
            this.f15633a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("Page_Order", 19997, this.f15633a, null, null, null).build());
            }
        }
    }

    static {
        t2o.a(708837571);
    }

    public static void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ced3be", new Object[]{str});
        } else {
            dn.h(new a(str));
        }
    }
}
