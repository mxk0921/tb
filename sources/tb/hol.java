package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.usertrack.ITrackService;
import com.taobao.android.fluid.business.usertrack.track.PageStartTimeBean;
import com.taobao.android.fluid.core.FluidContext;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class hol {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713587);
    }

    public static PageStartTimeBean a(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageStartTimeBean) ipChange.ipc$dispatch("57cc27e2", new Object[]{fluidContext});
        }
        long navStartTime = ((ITrackService) fluidContext.getService(ITrackService.class)).getNavStartTime();
        if (navStartTime <= 0) {
            PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
            if (pageCreateTimeBean == null) {
                return new PageStartTimeBean();
            }
            return pageCreateTimeBean;
        }
        PageStartTimeBean pageStartTimeBean = new PageStartTimeBean();
        pageStartTimeBean.pageStartTime = navStartTime;
        return pageStartTimeBean;
    }

    public static long b(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3183a5f7", new Object[]{fluidContext})).longValue();
        }
        PageStartTimeBean pageCreateTimeBean = ((ITrackService) fluidContext.getService(ITrackService.class)).getPageCreateTimeBean();
        if (pageCreateTimeBean == null) {
            return 0L;
        }
        return pageCreateTimeBean.pageStartTime;
    }
}
