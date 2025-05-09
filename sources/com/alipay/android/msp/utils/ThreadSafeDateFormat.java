package com.alipay.android.msp.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class ThreadSafeDateFormat {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static final Map<String, ThreadLocal<SimpleDateFormat>> patternMap = new HashMap();

    public static String format(Date date, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("9ab452d7", new Object[]{date, str}) : getSimpleDateFormat(str).format(date);
    }

    private static synchronized SimpleDateFormat getSimpleDateFormat(final String str) {
        synchronized (ThreadSafeDateFormat.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SimpleDateFormat) ipChange.ipc$dispatch("1aebcd3b", new Object[]{str});
            }
            Map<String, ThreadLocal<SimpleDateFormat>> map = patternMap;
            ThreadLocal<SimpleDateFormat> threadLocal = map.get(str);
            if (threadLocal == null) {
                threadLocal = new ThreadLocal<SimpleDateFormat>() { // from class: com.alipay.android.msp.utils.ThreadSafeDateFormat.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str2, Object... objArr) {
                        str2.hashCode();
                        int hashCode = str2.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str2 + "' with hashcode " + hashCode + " in com/alipay/android/msp/utils/ThreadSafeDateFormat$1");
                    }

                    @Override // java.lang.ThreadLocal
                    public SimpleDateFormat initialValue() {
                        IpChange ipChange2 = $ipChange;
                        return ipChange2 instanceof IpChange ? (SimpleDateFormat) ipChange2.ipc$dispatch("2acb5bc5", new Object[]{this}) : new SimpleDateFormat(str, Locale.CHINA);
                    }
                };
                map.put(str, threadLocal);
            }
            return threadLocal.get();
        }
    }

    public static Date parse(String str, String str2) throws ParseException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Date) ipChange.ipc$dispatch("2a4ef1a9", new Object[]{str, str2});
        }
        return getSimpleDateFormat(str2).parse(str);
    }

    public static String format(long j, String str) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (String) ipChange.ipc$dispatch("c755ccd0", new Object[]{new Long(j), str}) : getSimpleDateFormat(str).format(Long.valueOf(j));
    }
}
