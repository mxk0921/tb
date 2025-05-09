package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ugm implements IPullRefreshService.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final e3b f29360a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ugm.a(ugm.this).f().D(0.0f, 0.0f);
            }
        }
    }

    static {
        t2o.a(491782606);
        t2o.a(488636592);
    }

    public ugm(cfc cfcVar, e3b e3bVar) {
        this.f29360a = e3bVar;
    }

    public static /* synthetic */ e3b a(ugm ugmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e3b) ipChange.ipc$dispatch("c7075afe", new Object[]{ugmVar});
        }
        return ugmVar.f29360a;
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
    public void onPullDistance(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2dcc8a23", new Object[]{this, new Integer(i)});
        } else if (i == 0) {
            get.a().f(new a(), 0L);
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
    public void onRefresh() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9cbba83", new Object[]{this});
        }
    }

    @Override // com.taobao.infoflow.protocol.subservice.biz.IPullRefreshService.a
    public void onRefreshStateChanged(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("645061a", new Object[]{this, str, str2});
        }
    }
}
