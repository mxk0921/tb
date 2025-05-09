package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class wu6 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final DateFormat[] f30926a;
    public static final wu6 INSTANCE = new wu6();
    public static final TimeZone b = TimeZone.getTimeZone(pg1.ATOM_EXT_UTC);

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{this, str})).booleanValue();
        }
        return Pattern.compile("[0-9]*").matcher(str).matches();
    }

    static {
        t2o.a(843055195);
        String[] strArr = {"yyyy-MM-dd HH:mm:ss", "EEE, dd MMM yyyy HH:mm:ss zzz", "yyyyMMddHHmmss"};
        DateFormat[] dateFormatArr = new DateFormat[3];
        for (int i = 0; i < 3; i++) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(strArr[i], Locale.ENGLISH);
            simpleDateFormat.setTimeZone(b);
            xhv xhvVar = xhv.INSTANCE;
            dateFormatArr[i] = simpleDateFormat;
        }
        f30926a = dateFormatArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e8, code lost:
        if (tb.wsq.Y(r6, "-", 0, false, 6, null) == 0) goto L_0x00ea;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.Date b(java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.wu6.b(java.lang.String):java.util.Date");
    }
}
