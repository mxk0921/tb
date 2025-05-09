package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.launcher.task.FluidTaskConfig;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rkv extends p00 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(295698804);
    }

    public static /* synthetic */ Object ipc$super(rkv rkvVar, String str, Object... objArr) {
        if (str.hashCode() == 1095856037) {
            return super.a();
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/configs/UpdownSwitchCommonConfigStrategy");
    }

    @Override // tb.p00, tb.jzd
    public List<FluidTaskConfig> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("41516fa5", new Object[]{this});
        }
        List<FluidTaskConfig> a2 = super.a();
        a2.add(new FluidTaskConfig("FrameInstallTask_RightComponent", 2000L, "main"));
        a2.add(new FluidTaskConfig("FrameInstallTask_dynamic_h5_sdk", 2000L, "main"));
        return a2;
    }
}
