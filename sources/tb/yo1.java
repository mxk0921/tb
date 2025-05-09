package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class yo1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final c4q f32226a;

    static {
        t2o.a(491782833);
    }

    public yo1(cfc cfcVar) {
        this.f32226a = new c4q(cfcVar);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0e05ceb", new Object[]{this});
            return;
        }
        fve.e("BannerFestivalRefresher", "BannerFestivalRefresher.onFestivalRefresh");
        eve.c("BannerFestivalRefresher", "onFestivalRefresh");
        this.f32226a.d();
        eve.b("BannerFestivalRefresher", "onFestivalRefresh");
    }
}
