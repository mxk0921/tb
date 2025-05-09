package androidx.core.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.io.PrintWriter;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public final class TimeUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HUNDRED_DAY_FIELD_LEN = 19;
    private static final int SECONDS_PER_DAY = 86400;
    private static final int SECONDS_PER_HOUR = 3600;
    private static final int SECONDS_PER_MINUTE = 60;
    private static final Object sFormatSync = new Object();
    private static char[] sFormatStr = new char[24];

    private TimeUtils() {
    }

    private static int accumField(int i, int i2, boolean z, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("abe8c0aa", new Object[]{new Integer(i), new Integer(i2), new Boolean(z), new Integer(i3)})).intValue();
        }
        if (i > 99 || (z && i3 >= 3)) {
            return i2 + 3;
        }
        if (i > 9 || (z && i3 >= 2)) {
            return i2 + 2;
        }
        if (z || i > 0) {
            return i2 + 1;
        }
        return 0;
    }

    public static void formatDuration(long j, StringBuilder sb) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72546519", new Object[]{new Long(j), sb});
            return;
        }
        synchronized (sFormatSync) {
            sb.append(sFormatStr, 0, formatDurationLocked(j, 0));
        }
    }

    private static int printField(char[] cArr, int i, char c, int i2, boolean z, int i3) {
        int i4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aa92266f", new Object[]{cArr, new Integer(i), new Character(c), new Integer(i2), new Boolean(z), new Integer(i3)})).intValue();
        }
        if (!z && i <= 0) {
            return i2;
        }
        if ((!z || i3 < 3) && i <= 99) {
            i4 = i2;
        } else {
            int i5 = i / 100;
            cArr[i2] = (char) (i5 + 48);
            i4 = i2 + 1;
            i -= i5 * 100;
        }
        if ((z && i3 >= 2) || i > 9 || i2 != i4) {
            int i6 = i / 10;
            cArr[i4] = (char) (i6 + 48);
            i4++;
            i -= i6 * 10;
        }
        cArr[i4] = (char) (i + 48);
        cArr[1 + i4] = c;
        return i4 + 2;
    }

    public static void formatDuration(long j, PrintWriter printWriter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24418338", new Object[]{new Long(j), printWriter, new Integer(i)});
            return;
        }
        synchronized (sFormatSync) {
            printWriter.print(new String(sFormatStr, 0, formatDurationLocked(j, i)));
        }
    }

    public static void formatDuration(long j, PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19f1952b", new Object[]{new Long(j), printWriter});
        } else {
            formatDuration(j, printWriter, 0);
        }
    }

    public static void formatDuration(long j, long j2, PrintWriter printWriter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb656cb", new Object[]{new Long(j), new Long(j2), printWriter});
        } else if (j == 0) {
            printWriter.print("--");
        } else {
            formatDuration(j - j2, printWriter, 0);
        }
    }

    private static int formatDurationLocked(long j, int i) {
        char c;
        int i2;
        int i3;
        int i4;
        int i5;
        long j2 = j;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e694054e", new Object[]{new Long(j2), new Integer(i)})).intValue();
        }
        if (sFormatStr.length < i) {
            sFormatStr = new char[i];
        }
        char[] cArr = sFormatStr;
        int i6 = (j2 > 0L ? 1 : (j2 == 0L ? 0 : -1));
        if (i6 == 0) {
            int i7 = i - 1;
            while (i7 > 0) {
                cArr[0] = ' ';
            }
            cArr[0] = '0';
            return 1;
        }
        if (i6 > 0) {
            c = '+';
        } else {
            j2 = -j2;
            c = '-';
        }
        int i8 = (int) (j2 % 1000);
        int floor = (int) Math.floor(j2 / 1000);
        if (floor > 86400) {
            i2 = floor / 86400;
            floor -= 86400 * i2;
        } else {
            i2 = 0;
        }
        if (floor > 3600) {
            i3 = floor / 3600;
            floor -= i3 * 3600;
        } else {
            i3 = 0;
        }
        if (floor > 60) {
            i4 = floor / 60;
            floor -= i4 * 60;
        } else {
            i4 = 0;
        }
        if (i != 0) {
            int accumField = accumField(i2, 1, false, 0);
            int accumField2 = accumField + accumField(i3, 1, accumField > 0, 2);
            int accumField3 = accumField2 + accumField(i4, 1, accumField2 > 0, 2);
            int accumField4 = accumField3 + accumField(floor, 1, accumField3 > 0, 2);
            i5 = 0;
            for (int accumField5 = accumField4 + accumField(i8, 2, true, accumField4 > 0 ? 3 : 0) + 1; accumField5 < i; accumField5++) {
                cArr[i5] = ' ';
                i5++;
            }
        } else {
            i5 = 0;
        }
        cArr[i5] = c;
        int i9 = i5 + 1;
        boolean z = i != 0;
        int printField = printField(cArr, i2, 'd', i9, false, 0);
        int printField2 = printField(cArr, i3, 'h', printField, printField != i9, z ? 2 : 0);
        int printField3 = printField(cArr, i4, 'm', printField2, printField2 != i9, z ? 2 : 0);
        int printField4 = printField(cArr, floor, 's', printField3, printField3 != i9, z ? 2 : 0);
        int printField5 = printField(cArr, i8, 'm', printField4, true, (!z || printField4 == i9) ? 0 : 3);
        cArr[printField5] = 's';
        return printField5 + 1;
    }
}
