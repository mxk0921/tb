package tb;

import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.Set;
import mtopsdk.common.util.TBSdkLog;
import mtopsdk.mtop.stat.IUploadStats;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class dmv implements IUploadStats {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f17949a = false;

    static {
        t2o.a(590348295);
        t2o.a(589299986);
    }

    public dmv() {
        try {
            IpChange ipChange = AppMonitor.$ipChange;
            f17949a = true;
        } catch (Throwable unused) {
            if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                TBSdkLog.e("qmtopsdk.UploadStatImpl", "didn't find app-monitor-sdk or ut-analytics sdk.");
            }
        }
    }

    @Override // mtopsdk.mtop.stat.IUploadStats
    public void onCommit(String str, String str2, Map<String, String> map, Map<String, Double> map2) {
        DimensionValueSet create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d76ac5b1", new Object[]{this, str, str2, map, map2});
        } else if (f17949a) {
            MeasureValueSet measureValueSet = null;
            if (map != null) {
                try {
                    create = DimensionValueSet.create();
                    create.setMap(map);
                } catch (Throwable th) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        TBSdkLog.e("qmtopsdk.UploadStatImpl", "call AppMonitor.onCommit error.", th);
                        return;
                    }
                    return;
                }
            } else {
                create = null;
            }
            if (map2 != null) {
                measureValueSet = MeasureValueSet.create();
                for (Map.Entry<String, Double> entry : map2.entrySet()) {
                    measureValueSet.setValue(entry.getKey(), entry.getValue().doubleValue());
                }
            }
            AppMonitor.Stat.commit(str, str2, create, measureValueSet);
        }
    }

    @Override // mtopsdk.mtop.stat.IUploadStats
    public void onRegister(String str, String str2, Set<String> set, Set<String> set2, boolean z) {
        DimensionSet create;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3d76b57", new Object[]{this, str, str2, set, set2, new Boolean(z)});
        } else if (f17949a) {
            MeasureSet measureSet = null;
            if (set != null) {
                try {
                    create = DimensionSet.create(set);
                } catch (Throwable th) {
                    if (TBSdkLog.isLogEnable(TBSdkLog.LogEnable.ErrorEnable)) {
                        TBSdkLog.e("qmtopsdk.UploadStatImpl", "call AppMonitor.register error.", th);
                        return;
                    }
                    return;
                }
            } else {
                create = null;
            }
            if (set2 != null) {
                measureSet = MeasureSet.create(set2);
            }
            AppMonitor.register(str, str2, measureSet, create, z);
        }
    }
}
