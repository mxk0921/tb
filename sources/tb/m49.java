package tb;

import com.alibaba.ut.abtest.UTABMethod;
import com.alibaba.ut.abtest.bucketing.feature.FeatureType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class m49 implements l49 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(961544292);
        t2o.a(961544291);
    }

    @Override // tb.l49
    public boolean a(FeatureType featureType, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2aab3b49", new Object[]{this, featureType, str})).booleanValue();
        }
        if (featureType == FeatureType.Crowd) {
            if (n.j().c() == UTABMethod.Push) {
                return n.j().m().isCrowd(str);
            }
            ogh.g("FeatureServiceImpl", "警告：拉模式出现人群判断！人群ID=" + str);
        }
        return false;
    }
}
