package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class vcq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final trd f29922a = (trd) d62.a(trd.class, new Object[0]);

    static {
        t2o.a(676331582);
    }

    public static ucq a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ucq) ipChange.ipc$dispatch("8f0eb09e", new Object[]{context});
        }
        return f29922a.create(context);
    }
}
