package com.taobao.android.industry.base;

import android.text.TextUtils;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import mtopsdk.mtop.upload.domain.UploadConstants;
import tb.abu;
import tb.fh4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class IdsMonitorUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DOWNGRAD_ERROR = "moduleInstallDowngrade";
    public static final String INSTALL_ERROR = "moduleInstallError";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public enum StageType {
        STAGE_REQUESTED(abu.FUNNEL_STEP_AFTER_REQUEST),
        STAGE_DOWNLOADED("downloaded"),
        STAGE_INSTALL("installed");
        
        private final String value;

        StageType(String str) {
            this.value = str;
        }

        public String getValue() {
            return this.value;
        }
    }

    public static void a(String str, HashMap<String, String> hashMap, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e878bcc1", new Object[]{str, hashMap, str2, str3});
            return;
        }
        if (hashMap == null) {
            hashMap = new HashMap<>();
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("bizCode", str);
        }
        AppMonitor.Alarm.commitFail("Industry_Scene", "Monitor_Module_Error", hashMap.toString(), str2, str3);
        d("commitFail: " + str2 + ", " + str3 + ", " + hashMap.toString());
    }

    public static void b(String str, HashMap<String, String> hashMap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1330e636", new Object[]{str, hashMap});
        } else if (fh4.a(fh4.NAMESPACE, "installMonitorSuccess", true)) {
            if (hashMap == null) {
                hashMap = new HashMap<>();
            }
            if (!TextUtils.isEmpty(str)) {
                hashMap.put("bizCode", str);
            }
            AppMonitor.Alarm.commitSuccess("Industry_Scene", "Monitor_Module_Error", hashMap.toString());
            d("commitSuccess: " + hashMap.toString());
        }
    }

    public static void c(String str, String str2, double d) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("39f0d5cc", new Object[]{str, str2, new Double(d)});
            return;
        }
        MeasureSet create = MeasureSet.create();
        create.addMeasure(StageType.STAGE_REQUESTED.value);
        create.addMeasure(StageType.STAGE_INSTALL.value);
        create.addMeasure(StageType.STAGE_DOWNLOADED.value);
        DimensionSet create2 = DimensionSet.create();
        create2.addDimension(UploadConstants.BIZ_CODE);
        AppMonitor.register("Industry_Scene", "Monitor_Module_trace", create, create2, false);
        AppMonitor.Stat.commit("Industry_Scene", "Monitor_Module_trace", DimensionValueSet.create().setValue(UploadConstants.BIZ_CODE, str), MeasureValueSet.create().setValue(str2, d));
        d("commitTraceStatics: " + str + "," + str2 + ", " + d);
    }

    public static void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9dd52d5", new Object[]{str});
        }
    }
}
