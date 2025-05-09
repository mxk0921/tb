package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class muv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(352321679);
    }

    public static String a(x3w x3wVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("798454ed", new Object[]{x3wVar, str});
        }
        if (x3wVar == null || x3wVar.v() == null || TextUtils.isEmpty(x3wVar.v().spmCnt)) {
            return str;
        }
        return x3wVar.v().spmCnt;
    }
}
