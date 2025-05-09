package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.subservice.framework.IMainFeedsViewService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ys6 implements jee {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cfc f32314a;

    static {
        t2o.a(729809397);
        t2o.a(729809945);
    }

    public ys6(cfc cfcVar) {
        this.f32314a = cfcVar;
    }

    @Override // tb.jee
    public int a(String str, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3422ea02", new Object[]{this, str, new Integer(i), new Boolean(z)})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32314a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findBottomPosition(i, z);
        }
        fve.e("DataServiceWindVaneProvider", "findBottomPosition mainFeedsViewService is null");
        return -1;
    }

    @Override // tb.jee
    public double b(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7fa11477", new Object[]{this, str, new Integer(i)})).doubleValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32314a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.getViewExposureRatio(i);
        }
        fve.e("DataServiceWindVaneProvider", "getViewExposureRatio mainFeedsViewService is null");
        return -1.0d;
    }

    @Override // tb.jee
    public int c(String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abecc2c0", new Object[]{this, str, new Integer(i)})).intValue();
        }
        IMainFeedsViewService iMainFeedsViewService = (IMainFeedsViewService) this.f32314a.a(IMainFeedsViewService.class);
        if (iMainFeedsViewService != null) {
            return iMainFeedsViewService.findTopPosition(i);
        }
        fve.e("DataServiceWindVaneProvider", "findTopPosition mainFeedsViewService is null");
        return -1;
    }
}
