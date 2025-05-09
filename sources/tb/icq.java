package tb;

import com.alibaba.android.split.SplitFileInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.android.tools.bundleInfo.BundleInfoManager;
import com.android.tools.bundleInfo.DynamicFeatureInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class icq implements qcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(676331551);
        t2o.a(676331556);
    }

    @Override // tb.qcq
    public SplitFileInfo a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SplitFileInfo) ipChange.ipc$dispatch("6bb1e295", new Object[]{this, str});
        }
        DynamicFeatureInfo dynamicFeatureInfo = BundleInfoManager.instance().getDynamicFeatureInfo(str);
        if (dynamicFeatureInfo == null) {
            return null;
        }
        SplitFileInfo splitFileInfo = new SplitFileInfo();
        splitFileInfo.url = dynamicFeatureInfo.url;
        splitFileInfo.status = dynamicFeatureInfo.status;
        splitFileInfo.appVersion = dynamicFeatureInfo.appVersion;
        splitFileInfo.version = dynamicFeatureInfo.version;
        splitFileInfo.md5 = dynamicFeatureInfo.md5;
        splitFileInfo.fileSize = dynamicFeatureInfo.size;
        splitFileInfo.splitName = dynamicFeatureInfo.featureName;
        return splitFileInfo;
    }
}
