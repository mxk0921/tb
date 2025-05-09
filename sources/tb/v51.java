package tb;

import android.text.TextUtils;
import com.alibaba.ariver.resource.api.models.AppModel;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class v51 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(839909774);
    }

    public static String a(AppModel appModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62ad0db7", new Object[]{appModel, str});
        }
        if (appModel == null || appModel.getAppInfoModel() == null || appModel.getAppInfoModel().getSourcemap() == null) {
            return "";
        }
        return appModel.getAppInfoModel().getSourcemap() + "/" + str;
    }

    public static String b(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dd624fa8", new Object[]{appModel});
        }
        if (!(appModel == null || appModel.getExtendInfos() == null)) {
            try {
                String string = appModel.getExtendInfos().getString("bizType");
                if (TextUtils.isEmpty(string)) {
                    return "";
                }
                String string2 = appModel.getExtendInfos().getString(qxq.SUB_KEY_FRAGMENT_JUMP);
                if (TextUtils.isEmpty(string2)) {
                    return string;
                }
                return string + "_" + string2;
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    public static String c(AppModel appModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9dd43092", new Object[]{appModel});
        }
        if (appModel == null || appModel.getExtendInfos() == null) {
            return "";
        }
        return appModel.getExtendInfos().getString("engineType");
    }
}
