package tb;

import android.app.Activity;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ln9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final ln9 INSTANCE = new ln9();

    /* renamed from: a  reason: collision with root package name */
    public static final ConcurrentHashMap<Activity, Pair<dn9, View>> f23439a = new ConcurrentHashMap<>();

    public final void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
        } else if (activity != null) {
            f23439a.remove(activity);
        }
    }

    public final void b(Activity activity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13d642e9", new Object[]{this, activity, str});
        } else if (!r54.f(activity, str)) {
            for (Map.Entry<Activity, Pair<dn9, View>> entry : f23439a.entrySet()) {
                if (!entry.getValue().getFirst().a(str)) {
                    kew.C(entry.getValue().getSecond());
                } else {
                    kew.g0(entry.getValue().getSecond());
                }
            }
        }
    }

    static {
        t2o.a(766509570);
        a.i(jpu.a("hd_from_id", "tbshopmod-hd-task-visit-miniapp"));
    }
}
