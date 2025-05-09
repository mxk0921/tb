package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class xns {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static int f31488a = 2;
    public static final LinkedList<Activity> b = new LinkedList<>();

    static {
        t2o.a(912262853);
    }

    public static void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b69cdfa", new Object[]{activity});
        } else if (activity != null) {
            LinkedList<Activity> linkedList = b;
            if (!linkedList.contains(activity)) {
                linkedList.add(activity);
                if (linkedList.size() > f31488a) {
                    linkedList.poll().finish();
                }
            }
        }
    }

    public static Activity b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("fd00c0fa", new Object[]{str});
        }
        Iterator<Activity> it = b.iterator();
        while (it.hasNext()) {
            Activity next = it.next();
            if (next.toString().equals(str)) {
                return next;
            }
        }
        return null;
    }

    public static void c(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7da0c2e8", new Object[]{activity});
            return;
        }
        d(activity);
        a(activity);
    }

    public static void d(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a4681d", new Object[]{activity});
        } else if (activity != null) {
            b.remove(activity);
        }
    }

    public static void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80d968fc", new Object[]{new Integer(i)});
        } else if (i > 0) {
            f31488a = i;
            int size = b.size() - f31488a;
            for (int i2 = 0; i2 < size; i2++) {
                Activity poll = b.poll();
                if (poll != null) {
                    poll.finish();
                }
            }
        }
    }
}
