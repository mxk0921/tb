package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class tc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<View, Boolean> f28626a = new ConcurrentHashMap<>();

    static {
        t2o.a(989856198);
    }

    public static boolean a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aed63b08", new Object[]{view})).booleanValue();
        }
        if (!vpw.commonConfig.k2) {
            return true;
        }
        if (view == null) {
            return false;
        }
        Boolean bool = f28626a.get(view);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }

    public static void b(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5864a9c", new Object[]{view});
        } else if (view != null) {
            f28626a.remove(view);
        }
    }

    public static void c(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("530be98e", new Object[]{view, new Boolean(z)});
        } else if (vpw.commonConfig.k2 && view != null) {
            f28626a.put(view, Boolean.valueOf(z));
        }
    }
}
