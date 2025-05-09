package tb;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.alibaba.android.split.core.internal.FlexaPrepareClassLoader;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tbuprofen.magic.RuntimeUtils;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class kl9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f22740a = new AtomicBoolean(false);
    public static final b4d b = (b4d) d62.a(b4d.class, new Object[0]);

    static {
        t2o.a(677380209);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16107364", new Object[]{context});
        } else if (f22740a.compareAndSet(false, true) && Build.VERSION.SDK_INT > 28 && n1r.e(context)) {
            try {
                RuntimeUtils.a();
                Log.e("FlexaRuntime", "isVerifierEnable:" + RuntimeUtils.b());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static void b(ocq ocqVar, jcq jcqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a455065", new Object[]{ocqVar, jcqVar});
        } else {
            FlexaPrepareClassLoader.tryLoad(ocqVar, jcqVar);
        }
    }
}
