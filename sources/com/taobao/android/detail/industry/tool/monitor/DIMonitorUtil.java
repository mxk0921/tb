package com.taobao.android.detail.industry.tool.monitor;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.h55;
import tb.t2o;
import tb.yh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class DIMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BLANK_ERROR = "renderBlankError";

    /* renamed from: a  reason: collision with root package name */
    public static final String f6609a = "industry_monitor";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum StageType {
        STAGE_CREATE("create"),
        STAGE_OPEN_CAMERA("open_camera"),
        STAGE_SYNC_RENDER("sync_render"),
        STAGE_ASYNC_RENDER("async_render");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final String value;

        StageType(String str) {
            this.value = str;
        }

        public static /* synthetic */ String access$000(StageType stageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3219773b", new Object[]{stageType});
            }
            return stageType.value;
        }

        public static /* synthetic */ Object ipc$super(StageType stageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/industry/tool/monitor/DIMonitorUtil$StageType");
        }

        public static StageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StageType) ipChange.ipc$dispatch("57d30a85", new Object[]{str});
            }
            return (StageType) Enum.valueOf(StageType.class, str);
        }

        public String getValue() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5308aa1e", new Object[]{this});
            }
            return this.value;
        }
    }

    static {
        t2o.a(440402013);
    }

    public static void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        } else {
            h55.b(f6609a, str);
        }
    }

    public static void a(String str, String str2, String str3, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66ffddc2", new Object[]{str, str2, str3, new Double(d)});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(StageType.access$000(StageType.STAGE_OPEN_CAMERA));
        create.addMeasure(StageType.access$000(StageType.STAGE_SYNC_RENDER));
        create.addMeasure(StageType.access$000(StageType.STAGE_ASYNC_RENDER));
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension("subBizcode");
        create2.addDimension("componentKey");
        create2.addDimension("deviceLevel");
        AppMonitor.register("Detail_Industry_Custom", "Monitor_Component_trace", create, create2, false);
        DimensionValueSet value = DimensionValueSet.create().setValue("subBizcode", str);
        value.setValue("componentKey", str2);
        value.setValue("deviceLevel", yh.a().b);
        AppMonitor.Stat.commit("Detail_Industry_Custom", "Monitor_Component_trace", value, MeasureValueSet.create().setValue(str3, d));
        b("commitTraceStatics: " + str + "," + str2 + "," + str3 + ", " + d);
    }
}
