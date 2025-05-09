package tb;

import android.text.TextUtils;
import com.alipay.android.msp.framework.statisticsv2.value.CountValue;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.update.dynamicfeature.FeatureUpdateData;
import com.taobao.update.dynamicfeature.utils.Constants;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f49 implements czm<q49> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final gdh f18993a = fih.getLog(f49.class, (gdh) null);

    static {
        t2o.a(951058456);
        t2o.a(947912754);
    }

    public final void a(File file) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd572a1e", new Object[]{this, file});
            return;
        }
        try {
            new File(file, CountValue.T_DEPRECATED).createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void deprecatedHisUpdateVersion(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("631b4bc1", new Object[]{this, str});
            return;
        }
        try {
            File[] listFiles = new File(bcq.a().e().P(), "features-update").listFiles();
            if (listFiles != null && listFiles.length > 0) {
                for (File file : listFiles) {
                    if (TextUtils.equals(str, file.getName())) {
                        a(file);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void execute(q49 q49Var) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("211c1f10", new Object[]{this, q49Var});
            return;
        }
        q49Var.stage = "install";
        this.f18993a.w("FeatureInstallProcessor start");
        String[] strArr = new String[q49Var.featureUpdateData.updateFeatures.size()];
        HashSet hashSet = new HashSet();
        for (int i = 0; i < q49Var.featureUpdateData.updateFeatures.size(); i++) {
            String str = q49Var.featureUpdateData.updateFeatures.get(i).featureName;
            strArr[i] = str;
            hashSet.add(str);
        }
        gdh gdhVar = this.f18993a;
        gdhVar.w("FeatureInstallProcessor update:" + String.valueOf(q49Var.featureUpdateData.featureUpdateVersion) + q49Var.featureUpdateData.updateFeatures);
        try {
            z = bcq.a().h(kjv.sContext, true, String.valueOf(q49Var.featureUpdateData.featureUpdateVersion), strArr);
        } catch (Exception e) {
            e.printStackTrace();
            z = false;
        }
        if (!z) {
            q49Var.success = false;
            q49Var.errorCode = -6;
            q49Var.errorMsg = Constants.getMsg(-6);
        } else if (q49Var.newUpdate) {
            r48.h().l(nkv.getVersionName(), String.valueOf(q49Var.featureUpdateData.featureUpdateVersion), Boolean.valueOf(q49Var.featureUpdateData.beta).booleanValue(), hashSet);
            for (FeatureUpdateData.FeatureInfo featureInfo : q49Var.featureUpdateData.updateFeatures) {
                r48.h().m(featureInfo.featureName, featureInfo.version);
            }
        } else {
            q48.e().h(nkv.getVersionName(), String.valueOf(q49Var.featureUpdateData.featureUpdateVersion), Boolean.valueOf(q49Var.featureUpdateData.beta).booleanValue(), hashSet);
            for (FeatureUpdateData.FeatureInfo featureInfo2 : q49Var.featureUpdateData.updateFeatures) {
                q48.e().i(featureInfo2.featureName, featureInfo2.version);
            }
        }
    }
}
