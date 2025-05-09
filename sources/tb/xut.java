package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xut {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(310378914);
    }

    public static boolean a(long j, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4390236", new Object[]{new Long(j), str})).booleanValue();
        }
        Date date = new Date(j);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str);
        if (simpleDateFormat.format(date).equals(simpleDateFormat.format(new Date()))) {
            return true;
        }
        return false;
    }

    public static boolean b(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eca6414a", new Object[]{new Long(j)})).booleanValue();
        }
        return a(j, "yyyy-MM-dd");
    }
}
