package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.biz.IMainFeedsLoopStartStopService;
import tb.h6c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class p4u implements h6c.b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ o4u f25878a;

    public p4u(o4u o4uVar) {
        this.f25878a = o4uVar;
    }

    @Override // tb.h6c.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d673366", new Object[]{this});
        }
    }

    @Override // tb.h6c.b
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("34aa13bd", new Object[]{this});
        } else if (o4u.c(this.f25878a)) {
            o4u.e(this.f25878a, false);
            o4u.f(this.f25878a).a(IMainFeedsLoopStartStopService.a.TOP_VIEW_COLD_START);
        }
    }
}
