package tb;

import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b8a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern s = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-(\\d*)");
    public static final Pattern t = Pattern.compile("(GET|HEAD) /(.*) HTTP");
    public static final Pattern u = Pattern.compile("User-Agent:(.*;systemName/Android)");

    /* renamed from: a  reason: collision with root package name */
    public final String f16243a;
    public final long b;
    public final boolean c;
    public final String d;
    public final boolean e;
    public final String f;
    public final String g;
    public final int h;
    public final long i;
    public final boolean j;
    public final int k;
    public final int l;
    public final int m;
    public final String n;
    public final String o;
    public final String p;
    public final String q;
    public final int r;

    static {
        t2o.a(774897875);
    }

    public b8a(String str) {
        String[] strArr = {a7m.PLAY_TOKEN_ID, a7m.USE_TBNET_PROXY, a7m.CDN_IP, a7m.VIDEO_LENGTH, a7m.PRE_LOAD, a7m.CONNECT_TIMEOUT, a7m.READ_TIMEOUT, a7m.RETRY_TIME, "bizCode", "videoId", a7m.VIDEO_DEFINE, a7m.PRELOAD_NET_CUT_SIZE};
        epm.b(str);
        long e = e(str);
        long max = Math.max(0L, e);
        this.b = max;
        long max2 = Math.max(0L, d(str));
        this.i = max2;
        boolean z = e >= 0;
        this.c = z;
        String f = e2n.f(g(str));
        this.d = h(str);
        String c = c(f);
        this.f = c;
        this.g = f(f, a7m.CDN_IP, "");
        this.h = b(f, a7m.VIDEO_LENGTH, Integer.MIN_VALUE);
        boolean booleanValue = a(f, a7m.PRE_LOAD, false).booleanValue();
        this.j = booleanValue;
        this.k = b(f, a7m.CONNECT_TIMEOUT, 0);
        this.l = b(f, a7m.READ_TIMEOUT, 0);
        this.m = b(f, a7m.RETRY_TIME, 0);
        this.n = f(f, "bizCode", "");
        this.o = f(f, a7m.VIDEO_PLAY_SCENES, "");
        this.p = f(f, "videoId", "");
        this.q = f(f, a7m.VIDEO_DEFINE, "");
        this.r = b(f, a7m.PRELOAD_NET_CUT_SIZE, -1);
        if (booleanValue) {
            this.e = a(f, a7m.USE_TBNET_PROXY, true).booleanValue();
        } else {
            this.e = a(f, a7m.USE_TBNET_PROXY, false).booleanValue();
        }
        String j = j(f, strArr);
        this.f16243a = j;
        feh fehVar = new feh(toString(), c);
        AVSDKLog.e(fehVar, "uri = " + j + ", start=" + max + ", end=" + max2 + ", partial=" + z);
    }

    public static b8a i(InputStream inputStream) throws IOException {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b8a) ipChange.ipc$dispatch("bf1a6022", new Object[]{inputStream});
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                return new b8a(sb.toString());
            }
            sb.append(readLine);
            sb.append('\n');
        }
    }

    public final Boolean a(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("67bfa4f8", new Object[]{this, str, str2, new Boolean(z)});
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter(str2);
            if (TextUtils.isEmpty(queryParameter)) {
                return Boolean.valueOf(z);
            }
            if ("1".equals(queryParameter)) {
                return Boolean.TRUE;
            }
            return Boolean.valueOf(ew0.s(queryParameter));
        } catch (Throwable unused) {
            return Boolean.valueOf(z);
        }
    }

    public final int b(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4bbe6f64", new Object[]{this, str, str2, new Integer(i)})).intValue();
        }
        try {
            return Integer.valueOf(Uri.parse(str).getQueryParameter(str2)).intValue();
        } catch (Throwable unused) {
            return i;
        }
    }

    public final String c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("20de343", new Object[]{this, str});
        }
        try {
            return Uri.parse(str.replace(f7l.PLUS, "%2B")).getQueryParameter(a7m.PLAY_TOKEN_ID);
        } catch (Throwable unused) {
            return "";
        }
    }

    public final long d(String str) {
        String group;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("867a6a7c", new Object[]{this, str})).longValue();
        }
        Matcher matcher = s.matcher(str);
        if (!matcher.find() || (group = matcher.group(2)) == null || TextUtils.isEmpty(group)) {
            return -1L;
        }
        return Long.parseLong(group);
    }

    public final long e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32c7c3fc", new Object[]{this, str})).longValue();
        }
        Matcher matcher = s.matcher(str);
        if (matcher.find()) {
            return Long.parseLong(matcher.group(1));
        }
        return -1L;
    }

    public final String f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3cfe60b8", new Object[]{this, str, str2, str3});
        }
        try {
            return Uri.parse(str).getQueryParameter(str2);
        } catch (Throwable unused) {
            return str3;
        }
    }

    public final String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("778761dc", new Object[]{this, str});
        }
        Matcher matcher = t.matcher(str);
        if (matcher.find()) {
            return matcher.group(2);
        }
        throw new IllegalArgumentException("Invalid request `" + str + "`: url not found!");
    }

    public final String h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33319ece", new Object[]{this, str});
        }
        Matcher matcher = u.matcher(str);
        if (matcher.find()) {
            return matcher.group(1);
        }
        return null;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "GetRequest{rangeOffset=" + this.b + ", partial=" + this.c + ", uri='" + this.f16243a + "'}";
    }

    public String j(String str, String[] strArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("983bfa1c", new Object[]{this, str, strArr});
        }
        if (strArr == null) {
            return str;
        }
        try {
            if (strArr.length == 0) {
                return str;
            }
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(f7l.BRACKET_START_STR);
            for (String str2 : strArr) {
                stringBuffer.append(str2);
                stringBuffer.append("|");
            }
            stringBuffer.deleteCharAt(stringBuffer.length() - 1);
            stringBuffer.append(f7l.BRACKET_END_STR);
            return str.replaceAll("(?<=[\\?&])" + stringBuffer.toString() + "=[^&]*&?", "").replaceAll("(\\?|\\?&|&+)$", "");
        } catch (Exception unused) {
            return str;
        }
    }
}
