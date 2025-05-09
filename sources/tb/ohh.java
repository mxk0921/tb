package tb;

import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import java.util.Formatter;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ohh {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String COMMON_TAG = "STRATEGY.ALL";

    /* renamed from: a  reason: collision with root package name */
    public static Integer f25392a;
    public static StringBuilder d;
    public static Formatter e;
    public static final char LEVEL_V = 'V';
    public static final char LEVEL_D = 'D';
    public static final char LEVEL_I = 'I';
    public static final char LEVEL_W = 'W';
    public static final char LEVEL_E = 'E';
    public static final char LEVEL_L = 'L';
    public static final char[] sLogTypes = {LEVEL_V, LEVEL_D, LEVEL_I, LEVEL_W, LEVEL_E, LEVEL_L};
    public static final boolean b = AdapterForTLog.isValid();
    public static final Object c = new Object();

    public static void a(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
        } else if (!f(LEVEL_D)) {
        } else {
            if (b) {
                AdapterForTLog.logd(str, c(str2, objArr));
            } else {
                c(str2, objArr);
            }
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else if (!f(LEVEL_E)) {
        } else {
            if (b) {
                AdapterForTLog.loge(str, c(str2, objArr));
            } else {
                Log.e(str, c(str2, objArr));
            }
        }
    }

    public static String c(String str, Object... objArr) {
        String substring;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7bb8d953", new Object[]{str, objArr});
        }
        synchronized (c) {
            try {
                StringBuilder sb = d;
                if (sb == null) {
                    d = new StringBuilder(250);
                } else {
                    sb.setLength(0);
                }
                if (e == null) {
                    e = new Formatter(d, Locale.getDefault());
                }
                e.format(str, objArr);
                substring = d.substring(0);
            } catch (Throwable th) {
                throw th;
            }
        }
        return substring;
    }

    public static int d(char c2) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e5910dbf", new Object[]{new Character(c2)})).intValue();
        }
        while (true) {
            char[] cArr = sLogTypes;
            if (i >= cArr.length) {
                return -1;
            }
            if (cArr[i] == c2) {
                return i;
            }
            i++;
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
        } else if (!f(LEVEL_I)) {
        } else {
            if (b) {
                AdapterForTLog.logi(str, c(str2, objArr));
            } else {
                c(str2, objArr);
            }
        }
    }

    public static boolean f(char c2) {
        char c3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9a545473", new Object[]{new Character(c2)})).booleanValue();
        }
        if (f25392a == null) {
            if (b) {
                String logLevel = AdapterForTLog.getLogLevel();
                if (TextUtils.isEmpty(logLevel)) {
                    c3 = LEVEL_L;
                } else {
                    c3 = logLevel.charAt(0);
                }
                f25392a = Integer.valueOf(d(c3));
            } else {
                f25392a = Integer.valueOf(d(LEVEL_V));
            }
        }
        if (d(c2) >= f25392a.intValue()) {
            return true;
        }
        return false;
    }

    public static void g(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else if (!f(LEVEL_W)) {
        } else {
            if (b) {
                AdapterForTLog.logw(str, c(str2, objArr));
            } else {
                c(str2, objArr);
            }
        }
    }
}
