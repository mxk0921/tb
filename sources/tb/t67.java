package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class t67 implements trd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(677380236);
        t2o.a(676331606);
    }

    @Override // tb.trd
    public ucq create(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucq) ipChange.ipc$dispatch("8f0eb09e", new Object[]{this, context});
        }
        return new wcq(new ycq(context), context);
    }
}
