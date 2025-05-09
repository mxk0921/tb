package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ixl implements jzd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698803);
        t2o.a(806355075);
    }

    @Override // tb.jzd
    public List<FluidTaskConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41516fa5", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-top-bar", 70000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-top-bar", 80000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-bottom-bar-native", 90000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-bottom-bar-native", 100000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-favor-anim", 110000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-favor-anim", 120000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-showcase-common", 130000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-showcase-common", 140000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-message-card", 150000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-message-card", 160000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl_7days_subscribe", 170000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl_7days_subscribe", m.CONFIG_REQUEST_EXPERIMENT_DATA_INTERVAL_TIME_DEFAULT, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_SystemComponent", 190000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_SystemComponent", 200000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-chat", 210000L, "background"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-chat", 220000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_tl-important-event", 230000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_tl-important-event", 240000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_RankEntranceFrame", 250000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_RankEntranceFrame", 260000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_RightComponent", 270000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameInstallTask_dynamic_h5_sdk", 270000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_RightComponent", 280000L, "main"));
        arrayList.add(new FluidTaskConfig("FrameUnInstallTask_dynamic_h5_sdk", 280000L, "main"));
        return arrayList;
    }
}
