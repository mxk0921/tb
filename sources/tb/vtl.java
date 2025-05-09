package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class vtl {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_DOWNLOAD = "download";
    public static final String ARG_INSTALL = "install";
    public static final String ARG_MTOP_REQUEST = "request";
    public static final String ARG_PATCHDECODE = "patchdecode";
    public static final String ARG_REVUPDATE = "revupdate";

    public static void stat(boolean z, String str, long j, int i, String str2, long j2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("159f6c18", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, new Long(j2)});
            return;
        }
        DimensionValueSet value = DimensionValueSet.create().setValue("toVersion", String.valueOf(j2)).setValue(v4s.PARAM_UPLOAD_STAGE, str);
        if (z) {
            str3 = "true";
        } else {
            str3 = "false";
        }
        AppMonitor.Stat.commit("update_instantpatch", gjv.HOTPATCH, value.setValue("success", str3).setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create().setValue("elapsed_time", j));
    }

    static {
        t2o.a(955252737);
        AppMonitor.register("update_instantpatch", gjv.HOTPATCH, MeasureSet.create().addMeasure("elapsed_time"), DimensionSet.create().addDimension("toVersion").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
    }
}
