package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class uut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(468713758);
    }

    public static boolean a(long j, long j2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d78811b", new Object[]{new Long(j), new Long(j2), new Integer(i)})).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        if ((instance2.getTimeInMillis() - instance.getTimeInMillis()) / 86400000 >= i) {
            return true;
        }
        return false;
    }

    public static boolean b(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66eb7f17", new Object[]{new Long(j), new Long(j2)})).booleanValue();
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        Calendar instance2 = Calendar.getInstance();
        instance2.setTimeInMillis(j2);
        instance2.set(11, 0);
        instance2.set(12, 0);
        instance2.set(13, 0);
        instance2.set(14, 0);
        if (instance2.getTimeInMillis() == instance.getTimeInMillis()) {
            return true;
        }
        return false;
    }
}
