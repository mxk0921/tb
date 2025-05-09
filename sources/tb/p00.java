package tb;

import android.os.Build;
import com.alipay.mobile.common.logging.util.perf.Constants;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class p00 implements jzd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MoreLiveGuideFrame = "TaoMoreLiveRightGuideFrame";

    static {
        t2o.a(295698801);
        t2o.a(806355075);
    }

    @Override // tb.jzd
    public List<FluidTaskConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41516fa5", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        boolean b = b();
        String str = "background";
        if (!vwl.e().a() || !vwl.e().f()) {
            arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-chat", 500L, b ? str : "main"));
        } else {
            arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-chat", 3000L, b ? str : "main"));
        }
        arrayList.add(new FluidTaskConfig("FrameInstallTask_SystemComponent", 1500L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_RankEntranceFrame", 1500L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-message-card", 1500L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_TaoMoreLiveRightGuideFrame", 2000L, "main"));
        if (!b) {
            str = "main";
        }
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-important-event", Constants.STARTUP_TIME_LEVEL_1, str));
        if (nh4.G()) {
            arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-favor-anim", nh4.X0(), "main"));
        }
        return arrayList;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6cf133cc", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT > 27) {
            return true;
        }
        return false;
    }
}
