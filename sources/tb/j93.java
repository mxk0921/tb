package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.infoflow.protocol.model.datamodel.card.BaseSectionModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class j93 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(486539393);
    }

    public static boolean a(BaseSectionModel<?> baseSectionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4dcbdf3", new Object[]{baseSectionModel})).booleanValue();
        }
        if (baseSectionModel == null) {
            return false;
        }
        String sectionBizCode = baseSectionModel.getSectionBizCode();
        if (TextUtils.isEmpty(sectionBizCode)) {
            return false;
        }
        return sectionBizCode.contains(lz7.DRESS_UP_BIZ_CODE);
    }
}
