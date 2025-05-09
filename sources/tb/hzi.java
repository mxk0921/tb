package tb;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.alipay.mobile.common.transportext.biz.diagnose.network.Configuration;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.utils.FileUtil;
import com.taobao.android.weex_framework.MUSAppMonitor;
import com.taobao.phenix.compat.stat.TBImageFlowMonitor;
import tb.amo;
import tb.l0j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class hzi implements wyi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f20983a;
    public static boolean b;

    public final String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("961679a9", new Object[]{this, new Long(j)});
        }
        if (0 == j) {
            return "0";
        }
        if (j < 1024) {
            return "<1k";
        }
        if (j < FileUtil.LOCAL_REPORT_FILE_MAX_SIZE) {
            return "1k<n<10k";
        }
        if (j < 102400) {
            return "10k<n<100k";
        }
        if (j < 512000) {
            return "100k<n<500k";
        }
        if (j < 1048576) {
            return "500k<n<1M";
        }
        return (j / 1048576) + "M";
    }

    public void c(String str, String str2, String str3, String str4, String str5) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dba43351", new Object[]{this, str, str2, str3, str4, str5});
        } else {
            AppMonitor.Alarm.commitFail(str, str2, str3, str4, str5);
        }
    }

    public void d(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58149f2e", new Object[]{this, str, str2, str3});
        } else {
            AppMonitor.Alarm.commitSuccess(str, str2, str3);
        }
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c282bfc0", new Object[]{this, str});
            return;
        }
        if (TextUtils.equals(str, "stat")) {
            if (!f20983a) {
                f20983a = true;
            } else {
                return;
            }
        } else if (TextUtils.equals(str, "download_task")) {
            if (!b) {
                b = true;
            } else {
                return;
            }
        }
        AppMonitor.register("download-sdk", str, MeasureSet.create().addMeasure("connectTime").addMeasure(amo.c.POINT_NAME).addMeasure(TBImageFlowMonitor.SPEED_MEASURE).addMeasure(Configuration.LOG_TYPE_TRAFFIC).addMeasure("totalTime").addMeasure("md5CheckTime").addMeasure("taskAllTime"), DimensionSet.create().addDimension("host").addDimension("https").addDimension("size").addDimension("net").addDimension("url").addDimension(x96.REFRESH_TYPE_RANGE).addDimension("retry").addDimension("success").addDimension("error_code").addDimension(MUSAppMonitor.ERROR_MSG).addDimension("biz").addDimension("prefetch").addDimension("opt_thread").addDimension("boost_degraded").addDimension("md5").addDimension("scene").addDimension("priorityLevel").addDimension("opt_strategy").addDimension("delete_temp_file").addDimension("mergeBoostFileFiled"));
    }

    public void e(l0j.a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6aa61826", new Object[]{this, aVar, str});
            return;
        }
        b(str);
        if (aVar.f23039a != null) {
            String str2 = "true";
            DimensionValueSet value = DimensionValueSet.create().setValue("host", aVar.f23039a.getHost()).setValue("https", "https".equals(aVar.f23039a.getProtocol()) ? str2 : "false").setValue("size", a(aVar.b)).setValue("net", String.valueOf(xh4.n)).setValue("url", aVar.f23039a.toString()).setValue(x96.REFRESH_TYPE_RANGE, aVar.d ? str2 : "false").setValue("retry", "false").setValue("success", aVar.c ? str2 : "false").setValue("error_code", aVar.s).setValue(MUSAppMonitor.ERROR_MSG, aVar.t).setValue("biz", aVar.i).setValue("prefetch", "false").setValue("opt_thread", String.valueOf(true)).setValue("boost_degraded", String.valueOf(aVar.k)).setValue("md5", aVar.l).setValue("scene", aVar.n).setValue("priorityLevel", aVar.o).setValue("opt_strategy", String.valueOf(xh4.r)).setValue("delete_temp_file", aVar.p ? str2 : "false");
            if (!aVar.q) {
                str2 = "false";
            }
            AppMonitor.Stat.commit("download-sdk", str, value.setValue("mergeBoostFileFiled", str2), MeasureValueSet.create().setValue("connectTime", aVar.e).setValue(amo.c.POINT_NAME, aVar.f).setValue(TBImageFlowMonitor.SPEED_MEASURE, aVar.h).setValue(Configuration.LOG_TYPE_TRAFFIC, aVar.r / 1048576.0d).setValue("totalTime", System.currentTimeMillis() - aVar.g).setValue("md5CheckTime", aVar.j).setValue("taskAllTime", aVar.m));
        }
    }
}
