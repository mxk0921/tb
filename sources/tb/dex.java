package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;
import tb.vu3;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class dex implements eee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f17766a;
    public final IMainFeedsViewService<?> b;

    static {
        t2o.a(491782790);
        t2o.a(487587890);
    }

    public dex(cfc cfcVar) {
        this.f17766a = cfcVar;
        this.b = (IMainFeedsViewService) cfcVar.a(IMainFeedsViewService.class);
    }

    @Override // tb.eee
    public int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3422ea02", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findBottomPosition(i, z);
        }
        return 0;
    }

    @Override // tb.eee
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fa11477", new Object[]{this, str, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getViewExposureRatio(i);
        }
        return vu3.b.GEO_NOT_SUPPORT;
    }

    @Override // tb.eee
    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abecc2c0", new Object[]{this, str, new Integer(i)})).intValue();
        }
        IMainFeedsViewService<?> iMainFeedsViewService = this.b;
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findTopPosition(i);
        }
        return 0;
    }
}
