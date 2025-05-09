package tb;

import android.text.TextUtils;
import com.alibaba.android.icart.core.multiplecolumn.ColumnHelper;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class obj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(479199494);
    }

    public static zwc a(kmb kmbVar, String str) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zwc) ipChange.ipc$dispatch("649a78c2", new Object[]{kmbVar, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        imb h0 = kmbVar.e().h0();
        if (h0 != null) {
            i = h0.m();
        } else {
            i = -1;
        }
        if (str.startsWith("cartCalculateGlobal")) {
            return new cu2(kmbVar, ColumnHelper.a(4, i));
        }
        if (str.startsWith(na3.sKeyEditGroupPopWindow)) {
            return new xi8(kmbVar, 3);
        }
        return null;
    }
}
