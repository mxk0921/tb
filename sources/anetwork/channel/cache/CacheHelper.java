package anetwork.channel.cache;

import anet.channel.util.HttpConstant;
import anet.channel.util.HttpHelper;
import anetwork.channel.cache.Cache;
import com.alipay.mobile.common.transport.utils.HeaderConstant;
import com.android.alibaba.ip.runtime.IpChange;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import mtopsdk.common.util.HttpHeaderConstant;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CacheHelper {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String FORMAT_VALUE = "EEE, dd MMM yyyy HH:mm:ss 'GMT'";
    private static final TimeZone GMT = TimeZone.getTimeZone("GMT");
    private static final ThreadLocal<SimpleDateFormat> threadLocal = new ThreadLocal<>();

    static {
        t2o.a(607126026);
    }

    private static SimpleDateFormat getDateFormat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SimpleDateFormat) ipChange.ipc$dispatch("33f9e957", new Object[0]);
        }
        ThreadLocal<SimpleDateFormat> threadLocal2 = threadLocal;
        SimpleDateFormat simpleDateFormat = threadLocal2.get();
        if (simpleDateFormat != null) {
            return simpleDateFormat;
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat(FORMAT_VALUE, Locale.US);
        simpleDateFormat2.setTimeZone(GMT);
        threadLocal2.set(simpleDateFormat2);
        return simpleDateFormat2;
    }

    private static long parseGMTDate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4e9becae", new Object[]{str})).longValue();
        }
        if (str.length() == 0) {
            return 0L;
        }
        try {
            ParsePosition parsePosition = new ParsePosition(0);
            Date parse = getDateFormat().parse(str, parsePosition);
            if (parsePosition.getIndex() == str.length()) {
                return parse.getTime();
            }
        } catch (Exception unused) {
        }
        return 0L;
    }

    public static String toGMTDate(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dc832284", new Object[]{new Long(j)});
        }
        return getDateFormat().format(new Date(j));
    }

    public static Cache.Entry parseCacheHeaders(Map<String, List<String>> map) {
        long j;
        long j2;
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Cache.Entry) ipChange.ipc$dispatch("df723469", new Object[]{map});
        }
        long currentTimeMillis = System.currentTimeMillis();
        String singleHeaderFieldByKey = HttpHelper.getSingleHeaderFieldByKey(map, HttpConstant.CACHE_CONTROL);
        if (singleHeaderFieldByKey != null) {
            String[] split = singleHeaderFieldByKey.toLowerCase().split(",");
            j = 0;
            while (true) {
                if (i >= split.length) {
                    break;
                }
                String trim = split[i].trim();
                if (trim.equals("no-store")) {
                    return null;
                }
                if (trim.equals(HttpHeaderConstant.NO_CACHE)) {
                    j = 0;
                    break;
                }
                if (trim.startsWith("max-age=")) {
                    try {
                        j = Long.parseLong(trim.substring(8));
                    } catch (Exception unused) {
                    }
                }
                i++;
            }
            i = 1;
        } else {
            j = 0;
        }
        String singleHeaderFieldByKey2 = HttpHelper.getSingleHeaderFieldByKey(map, "Date");
        long parseGMTDate = singleHeaderFieldByKey2 != null ? parseGMTDate(singleHeaderFieldByKey2) : 0L;
        String singleHeaderFieldByKey3 = HttpHelper.getSingleHeaderFieldByKey(map, "Expires");
        long parseGMTDate2 = singleHeaderFieldByKey3 != null ? parseGMTDate(singleHeaderFieldByKey3) : 0L;
        String singleHeaderFieldByKey4 = HttpHelper.getSingleHeaderFieldByKey(map, "Last-Modified");
        long parseGMTDate3 = singleHeaderFieldByKey4 != null ? parseGMTDate(singleHeaderFieldByKey4) : 0L;
        String singleHeaderFieldByKey5 = HttpHelper.getSingleHeaderFieldByKey(map, HeaderConstant.HEADER_KEY_ETAG);
        if (i != 0) {
            currentTimeMillis += j * 1000;
        } else if (parseGMTDate <= 0 || parseGMTDate2 < parseGMTDate) {
            j2 = parseGMTDate3;
            if (j2 <= 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis != 0 && singleHeaderFieldByKey5 == null) {
                return null;
            }
            Cache.Entry entry = new Cache.Entry();
            entry.etag = singleHeaderFieldByKey5;
            entry.ttl = currentTimeMillis;
            entry.serverDate = parseGMTDate;
            entry.lastModified = j2;
            entry.responseHeaders = map;
            return entry;
        } else {
            currentTimeMillis += parseGMTDate2 - parseGMTDate;
        }
        j2 = parseGMTDate3;
        if (currentTimeMillis != 0) {
        }
        Cache.Entry entry2 = new Cache.Entry();
        entry2.etag = singleHeaderFieldByKey5;
        entry2.ttl = currentTimeMillis;
        entry2.serverDate = parseGMTDate;
        entry2.lastModified = j2;
        entry2.responseHeaders = map;
        return entry2;
    }
}
