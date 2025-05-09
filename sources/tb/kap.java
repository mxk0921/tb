package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.ut.userbehavior.module.BasicUBF;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class kap {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(964689923);
    }

    public static void a(BasicUBF basicUBF, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b9f03d3", new Object[]{basicUBF, str});
        } else if (basicUBF != null) {
            zdt.c().f(new a(basicUBF, str));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BasicUBF f22517a;
        public final /* synthetic */ String b;

        public a(BasicUBF basicUBF, String str) {
            this.f22517a = basicUBF;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                this.f22517a.setEndTime(mqv.n().m());
                this.f22517a.setLogType(this.b);
                if (l5v.b(this.f22517a.getName())) {
                    str = "undefined";
                } else {
                    str = this.f22517a.getName();
                }
                String str2 = "/ut.ubf." + str;
                HashMap hashMap = new HashMap();
                hashMap.put("ubf", JSON.toJSONString(this.f22517a));
                if (j5v.d()) {
                    j5v.a("sendUBFLog", hashMap);
                }
                UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("UT_UBF", 19997, str2, "", "", hashMap).build());
            } catch (Throwable th) {
                j5v.c("sendUBFLog", th);
            }
        }
    }
}
