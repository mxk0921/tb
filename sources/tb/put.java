package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Calendar;
import java.util.Date;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class put {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final long ONE_DAY = 86400000;
    public static final long ONE_HOUR = 3600000;
    public static final long ONE_MINUS = 60000;
    public static final long ONE_SECOND = 1000;

    /* renamed from: a  reason: collision with root package name */
    public static final StringBuffer f26333a = new StringBuffer(16);

    static {
        t2o.a(503317252);
    }

    public static String b(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fb85dd2", new Object[]{new Integer(i), new Integer(i2), new Integer(i3)});
        }
        StringBuffer stringBuffer = f26333a;
        stringBuffer.delete(0, stringBuffer.length());
        if (i != 0) {
            stringBuffer.append(i);
            stringBuffer.append("-");
        }
        if (i2 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i2);
        } else {
            stringBuffer.append(i2);
        }
        stringBuffer.append("-");
        if (i3 < 10) {
            stringBuffer.append("0");
            stringBuffer.append(i3);
        } else {
            stringBuffer.append(i3);
        }
        return stringBuffer.toString();
    }

    public static long c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7cda1621", new Object[0])).longValue();
        }
        return new Date().getTime();
    }

    public static String a(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c630c45", new Object[]{new Long(j)});
        }
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        long c = c();
        Calendar instance2 = Calendar.getInstance();
        if (c != 0) {
            instance2.setTimeInMillis(c);
        }
        long timeInMillis = instance2.getTimeInMillis() - instance.getTimeInMillis();
        int i = instance.get(1);
        int i2 = instance2.get(1);
        int i3 = instance.get(2);
        int i4 = instance.get(5);
        int i5 = (timeInMillis > 60000L ? 1 : (timeInMillis == 60000L ? 0 : -1));
        if (i5 < 0) {
            return "刚刚";
        }
        if (i5 >= 0 && timeInMillis < 3600000) {
            return (timeInMillis / 60000) + "分钟前";
        } else if (timeInMillis >= 3600000 && timeInMillis < 86400000) {
            return (timeInMillis / 3600000) + "小时前";
        } else if (i == i2) {
            return b(0, i3 + 1, i4);
        } else {
            return b(i, i3 + 1, i4);
        }
    }
}
