package tb;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class t49 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ARG_DOWNLOAD = "download";
    public static final String ARG_ENV_CHECK = "envcheck";
    public static final String ARG_EXTRAT = "extract";
    public static final String ARG_INSTALL = "install";
    public static final String ARG_NETWORK_CHECK = "networkcheck";
    public static final String ARG_REVUPDATE = "revupdate";
    public static final String ARG_VERIFY = "verify";
    public static Context context;
    public static SharedPreferences preferences;

    public static void stat(boolean z, String str, long j, int i, String str2, String str3) {
        String str4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2d06f6", new Object[]{new Boolean(z), str, new Long(j), new Integer(i), str2, str3});
            return;
        }
        DimensionValueSet value = DimensionValueSet.create().setValue("toVersion", String.valueOf(str3)).setValue(v4s.PARAM_UPLOAD_STAGE, str).setValue("cost", String.valueOf(j));
        if (z) {
            str4 = "true";
        } else {
            str4 = "false";
        }
        AppMonitor.Stat.commit("update_featureupdate", "featureupdate", value.setValue("success", str4).setValue("error_code", String.valueOf(i)).setValue(MUSAppMonitor.ERROR_MSG, str2), MeasureValueSet.create());
    }

    static {
        t2o.a(951058443);
        AppMonitor.register("update_featureupdate", "featureupdate", MeasureSet.create(), DimensionSet.create().addDimension("toVersion").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("cost").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG));
        Application application = kjv.sContext;
        context = application;
        preferences = application.getSharedPreferences("featureupdate", 0);
    }
}
