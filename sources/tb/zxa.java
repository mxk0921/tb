package tb;

import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class zxa {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(815793084);
    }

    public static yxa<?> a(mv1 mv1Var, boolean z, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yxa) ipChange.ipc$dispatch("6bb03a1e", new Object[]{mv1Var, new Boolean(z), context});
        }
        if (mv1Var instanceof jlt) {
            jlt jltVar = (jlt) mv1Var;
            if (!TextUtils.isEmpty(jltVar.d())) {
                return new klt(jltVar, z);
            }
            return null;
        } else if (mv1Var instanceof ire) {
            return new jre((ire) mv1Var, z, context);
        } else {
            if (mv1Var instanceof pre) {
                return new qre((pre) mv1Var, z, context);
            }
            return null;
        }
    }
}
