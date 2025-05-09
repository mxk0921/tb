package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ku6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final SimpleDateFormat f22926a = new SimpleDateFormat("yyyyMMdd", Locale.US);

    public static Date a(Date date, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("52ab4c60", new Object[]{date, new Integer(i)});
        }
        Calendar instance = Calendar.getInstance();
        instance.setTime(date);
        instance.add(5, i);
        return instance.getTime();
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc00ccc4", new Object[0]);
        }
        return f22926a.format(Long.valueOf(new Date().getTime()));
    }

    public static String c(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76faef03", new Object[]{date});
        }
        return f22926a.format(Long.valueOf(date.getTime()));
    }

    static {
        t2o.a(329252966);
    }
}
