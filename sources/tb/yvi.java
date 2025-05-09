package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yvi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicReference f32376a = new AtomicReference(null);

    static {
        t2o.a(677380185);
    }

    public static xvi a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xvi) ipChange.ipc$dispatch("196705fe", new Object[]{context});
        }
        return new awi(context, Runtime.getRuntime(), new wvi(context, context.getPackageManager()), f32376a);
    }
}
