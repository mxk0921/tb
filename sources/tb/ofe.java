package tb;

import android.graphics.Typeface;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.WeakHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ofe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static Typeface f25349a;
    public static final WeakHashMap<View, Void> b = new WeakHashMap<>();

    static {
        t2o.a(503317378);
    }

    public static Typeface a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("78ff04a1", new Object[]{view});
        }
        if (f25349a == null) {
            try {
                f25349a = od0.D().m().a(view.getContext());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        b.put(view, null);
        return f25349a;
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f077a4", new Object[]{view});
            return;
        }
        WeakHashMap<View, Void> weakHashMap = b;
        weakHashMap.remove(view);
        if (weakHashMap.size() == 0) {
            f25349a = null;
        }
    }
}
