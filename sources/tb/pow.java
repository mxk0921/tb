package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.DAI;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class pow {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static pow b;

    /* renamed from: a  reason: collision with root package name */
    public Context f26219a;

    static {
        t2o.a(1034944578);
    }

    public pow() {
        new HashSet().add(kqv.NAME);
        HashSet hashSet = new HashSet();
        hashSet.add("pv_node");
        hashSet.add("expose_node");
        hashSet.add("tap_node");
        hashSet.add("scroll_node");
        hashSet.add("request_node");
        hashSet.add("new_edge");
    }

    public static synchronized pow c() {
        synchronized (pow.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (pow) ipChange.ipc$dispatch("c6406dcd", new Object[0]);
            }
            if (b == null) {
                b = new pow();
            }
            return b;
        }
    }

    public static void d(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1dcfb91", new Object[]{context});
        } else {
            c().e(context);
        }
    }

    public Context a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f26219a;
    }

    public tno b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (tno) ipChange.ipc$dispatch("e6e7bda9", new Object[]{this});
        }
        if (DAI.loadNativeDBBeforeStart() != 1) {
            return null;
        }
        return tno.b();
    }

    public void e(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a164154", new Object[]{this, context});
        } else {
            this.f26219a = context;
        }
    }
}
