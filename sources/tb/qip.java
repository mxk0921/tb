package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.ThreadMode;
import com.ut.share.business.ShareBusiness;
import com.ut.share.business.ShareContent;
import com.ut.share.business.TBShareMediaInfo;
import com.ut.share.business.TBShareMediaPublisher;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class qip implements rl8<pip> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f26772a;

    static {
        t2o.a(352321542);
        t2o.a(723517460);
    }

    public qip(Activity activity) {
        this.f26772a = activity;
    }

    @Override // tb.rl8
    public ThreadMode R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("6de50c9b", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    /* renamed from: a */
    public gl8 h(pip pipVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gl8) ipChange.ipc$dispatch("25a34121", new Object[]{this, pipVar});
        }
        if (pipVar == null) {
            return gl8.FAILURE;
        }
        ShareContent a2 = new oip().b(pipVar.f).f(pipVar.i).c(pipVar.g).d(pipVar.e).e(pipVar.h).a();
        TBShareMediaPublisher tBShareMediaPublisher = new TBShareMediaPublisher();
        a2.mediaPublisher = tBShareMediaPublisher;
        tBShareMediaPublisher.setAvatar(pipVar.k);
        a2.mediaPublisher.setNick(pipVar.j);
        TBShareMediaInfo tBShareMediaInfo = new TBShareMediaInfo();
        a2.mediaInfo = tBShareMediaInfo;
        tBShareMediaInfo.setType(pipVar.l);
        a2.mediaInfo.setWidth(pipVar.m);
        a2.mediaInfo.setHeight(pipVar.n);
        a2.templateParams = pipVar.o;
        ShareBusiness.share(this.f26772a, a2);
        return gl8.SUCCESS;
    }
}
