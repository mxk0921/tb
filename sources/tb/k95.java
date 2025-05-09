package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.core.model.DWStabilityData;
import com.taobao.taobaoavsdk.CodeUsageCounter;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class k95 implements stb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(451936282);
        t2o.a(452985048);
    }

    public k95() {
        DimensionSet create = DimensionSet.create();
        create.addDimension("player_type");
        create.addDimension("videoUrl");
        create.addDimension("useCache");
        create.addDimension("hitCache");
        create.addDimension("completeHitCache");
        create.addDimension("usePlayManger");
        create.addDimension("videoDefinition");
        create.addDimension("useTBNet");
        create.addDimension("useHardwareHevc");
        create.addDimension("useHardwareAvc");
        create.addDimension("playToken");
        create.addDimension("interactId");
        create.addDimension("videoSource");
        create.addDimension(xau.PROPERTY_VIDEO_ID);
        create.addDimension("userId");
        create.addDimension("contentId");
        create.addDimension("page");
        MeasureSet create2 = MeasureSet.create();
        create2.addMeasure("first_frame_start");
        create2.addMeasure("first_frame_end");
        create2.addMeasure("first_frame_render");
        AppMonitor.register("DWVideo", "first_frame_render", create2, create);
        CodeUsageCounter.c().a(CodeUsageCounter.componentName.dw_adapter_DWStabilityAdapter);
    }

    public void a(Context context, String str, String str2, boolean z, DWStabilityData dWStabilityData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd882d5", new Object[]{this, context, str, str2, new Boolean(z), dWStabilityData});
        } else if (!z) {
            AppMonitor.Alarm.commitFail(str, str2, dWStabilityData.args, dWStabilityData.code, dWStabilityData.msg);
        } else if (dWStabilityData == null || TextUtils.isEmpty(dWStabilityData.args)) {
            AppMonitor.Alarm.commitSuccess(str, str2);
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, dWStabilityData.args);
        }
    }

    public void b(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("710c8ea6", new Object[]{this, str, str2, map, map2});
        } else {
            AppMonitor.Stat.commit(str, str2, DimensionValueSet.fromStringMap(map), MeasureValueSet.create(map2));
        }
    }
}
