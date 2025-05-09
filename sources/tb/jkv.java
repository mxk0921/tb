package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.update.framework.UpdateRuntime;
import com.taobao.update.monitor.UpdateAlarmData;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class jkv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, Boolean> f22046a = new HashMap(2);
    public String b;

    static {
        t2o.a(955252741);
    }

    public final synchronized void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36e2d715", new Object[]{this, str});
        } else if (((HashMap) this.f22046a).get(str) == null) {
            ((HashMap) this.f22046a).put(str, Boolean.TRUE);
            AppMonitor.register("update", str, MeasureSet.create().addMeasure("elapsed_time"), DimensionSet.create().addDimension("fromVersion").addDimension("toVersion").addDimension(v4s.PARAM_UPLOAD_STAGE).addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG).addDimension("url").addDimension("disk_size"));
        }
    }

    public void stat(String str, UpdateAlarmData updateAlarmData) {
        String str2;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("366eb192", new Object[]{this, str, updateAlarmData});
        } else if (updateAlarmData != null) {
            a(str);
            if (TextUtils.isEmpty(this.b)) {
                try {
                    this.b = UpdateRuntime.getContext().getPackageManager().getPackageInfo(UpdateRuntime.getContext().getPackageName(), 0).versionName;
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            DimensionValueSet create = DimensionValueSet.create();
            if (TextUtils.isEmpty(updateAlarmData.fromVersion)) {
                str2 = this.b;
            } else {
                str2 = updateAlarmData.fromVersion;
            }
            DimensionValueSet value = create.setValue("fromVersion", str2).setValue("toVersion", updateAlarmData.toVersion).setValue(v4s.PARAM_UPLOAD_STAGE, updateAlarmData.arg);
            if (updateAlarmData.success) {
                str3 = "true";
            } else {
                str3 = "false";
            }
            AppMonitor.Stat.commit("update", str, value.setValue("success", str3).setValue("error_code", updateAlarmData.errorCode).setValue(MUSAppMonitor.ERROR_MSG, updateAlarmData.errorMsg).setValue("url", updateAlarmData.url).setValue("disk_size", updateAlarmData.disk_size), MeasureValueSet.create().setValue("elapsed_time", updateAlarmData.elapsed_time));
        }
    }
}
