package com.taobao.message.kit.util;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.android.virtual_thread.face.c;
import com.taobao.message.uikit.util.DisplayUtil;
import com.taobao.taobao.R;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class DateFormatUtil {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String DATE2_FORMAT = "yy/MM/dd";
    private static final String DATE_FORMAT = "yy.MM.dd";
    private static final String DAY_FORMAT = "HH:mm";
    private static final String YEAR_FORMAT = "MM.dd";
    private static final String DATE3_FORMAT = DisplayUtil.localizedString(R.string.mp_yyyy_year_mm_month_dd);
    private static final ThreadLocal<Calendar> CALENDAR = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return Calendar.getInstance();
        }
    });
    private static final ThreadLocal<SimpleDateFormat> DATE = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.2
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return new SimpleDateFormat(DateFormatUtil.DATE_FORMAT, Locale.getDefault());
        }
    });
    private static final ThreadLocal<SimpleDateFormat> DATE2 = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.3
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return new SimpleDateFormat(DateFormatUtil.DATE2_FORMAT, Locale.getDefault());
        }
    });
    private static final ThreadLocal<SimpleDateFormat> DATE3 = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.4
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return new SimpleDateFormat(DateFormatUtil.access$000(), Locale.getDefault());
        }
    });
    private static final ThreadLocal<SimpleDateFormat> YEAR = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.5
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return new SimpleDateFormat(DateFormatUtil.YEAR_FORMAT, Locale.getDefault());
        }
    });
    private static final ThreadLocal<SimpleDateFormat> DAY = VExecutors.newThreadLocalWithInitial(new c.a() { // from class: com.taobao.message.kit.util.DateFormatUtil.6
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // com.taobao.android.virtual_thread.face.c.a
        public Object get() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("6352d3f5", new Object[]{this});
            }
            return new SimpleDateFormat(DateFormatUtil.DAY_FORMAT, Locale.getDefault());
        }
    });

    static {
        t2o.a(529530994);
    }

    public static /* synthetic */ String access$000() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return DATE3_FORMAT;
    }

    public static String formatDate(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5abff613", new Object[]{date});
        }
        return getDateFormat().format(date);
    }

    public static String formatDate2(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62b10acb", new Object[]{date});
        }
        return getDate2Format().format(date);
    }

    public static String formatDate3(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c403a76a", new Object[]{date});
        }
        return getDate3Format().format(date);
    }

    public static String formatDay(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67306e33", new Object[]{date});
        }
        return getDayFormat().format(date);
    }

    public static String formatYear(Date date) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("467adae4", new Object[]{date});
        }
        return getYearFormat().format(date);
    }

    public static Calendar getCalendar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Calendar) ipChange.ipc$dispatch("899b8c", new Object[0]);
        }
        return CALENDAR.get();
    }

    private static SimpleDateFormat getDate2Format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("2b84ef2d", new Object[0]);
        }
        return DATE2.get();
    }

    private static SimpleDateFormat getDate3Format() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("8cd78bcc", new Object[0]);
        }
        return DATE3.get();
    }

    private static SimpleDateFormat getDateFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("33f9e957", new Object[0]);
        }
        return DATE.get();
    }

    private static SimpleDateFormat getDayFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("5175ee55", new Object[0]);
        }
        return DAY.get();
    }

    private static SimpleDateFormat getYearFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("1fb4ce28", new Object[0]);
        }
        return YEAR.get();
    }

    public static String parseDate(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21ff9a39", new Object[]{l});
        }
        try {
            return getDateFormat().format(l);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String parseDay(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8f54a851", new Object[]{l});
        }
        try {
            return getDayFormat().format(l);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static String parseYear(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dba7f0a", new Object[]{l});
        }
        try {
            return getYearFormat().format(l);
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
