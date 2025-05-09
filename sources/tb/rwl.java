package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rwl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DIMENSION_DECODE = "decode";
    public static final String DIMEN_PROCESS_GOODS_CODE = "processCode_Goods";
    public static final String DIMEN_RAPID = "rapid";
    public static final String KEY_DIMENSION = "businessType";
    public static final String KEY_DIMENSION_SUCCESS = "success";
    public static final String KEY_MEASURE_TIME = "time";
    public static final String MODULE = "TBPhotoSearch";
    public static final String POINT = "tbpsBusiness";

    /* renamed from: a  reason: collision with root package name */
    public static boolean f27650a = false;

    static {
        t2o.a(760217606);
    }

    public static void a(String str, long j, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13024ce0", new Object[]{str, new Long(j), new Boolean(z)});
        } else {
            b(str, j, z, false);
        }
    }

    public static void b(String str, long j, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d4801f4", new Object[]{str, new Long(j), new Boolean(z), new Boolean(z2)});
        } else if (z) {
            if (!f27650a) {
                f27650a = true;
                MeasureSet create = MeasureSet.create();
                create.addMeasure("time");
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension(KEY_DIMENSION);
                create2.addDimension("success");
                create2.addDimension(DIMEN_RAPID);
                AppMonitor.register(MODULE, POINT, create, create2);
            }
            DimensionValueSet create3 = DimensionValueSet.create();
            create3.setValue(KEY_DIMENSION, str);
            create3.setValue("success", String.valueOf(z));
            create3.setValue(DIMEN_RAPID, String.valueOf(z2));
            MeasureValueSet create4 = MeasureValueSet.create();
            create4.setValue("time", j);
            AppMonitor.Stat.commit(MODULE, POINT, create3, create4);
        }
    }
}
