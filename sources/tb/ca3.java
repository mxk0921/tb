package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ca3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final LinkedList<Activity> f16935a = new LinkedList<>();

    static {
        t2o.a(697303043);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b69cdfa", new Object[]{activity});
        } else if (activity != null) {
            Iterator<Activity> it = f16935a.iterator();
            while (it.hasNext()) {
                if (it.next() == activity) {
                    return;
                }
            }
            LinkedList<Activity> linkedList = f16935a;
            linkedList.add(activity);
            if (linkedList.size() > 2) {
                linkedList.poll().finish();
            }
        }
    }

    public static void b(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4681d", new Object[]{activity});
        } else {
            f16935a.remove(activity);
        }
    }
}
