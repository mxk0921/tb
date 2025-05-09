package tb;

import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.LogLevel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class odh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tao$log$LogLevel;

        static {
            int[] iArr = new int[LogLevel.values().length];
            $SwitchMap$com$taobao$tao$log$LogLevel = iArr;
            try {
                iArr[LogLevel.D.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tao$log$LogLevel[LogLevel.I.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tao$log$LogLevel[LogLevel.W.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$tao$log$LogLevel[LogLevel.E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$tao$log$LogLevel[LogLevel.V.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(767557732);
    }

    public static void a(LogLevel logLevel, String str, String str2, String str3) {
        int i;
        StringBuilder sb = new StringBuilder();
        if (str3 == null) {
            str3 = "";
        }
        if (TextUtils.isEmpty(str)) {
            sb.append(str2);
        } else {
            sb.append(str);
            sb.append(".");
            sb.append(str2);
        }
        String sb2 = sb.toString();
        if (Build.VERSION.SDK_INT >= 30 && sb2.length() > 100) {
            sb2 = sb2.substring(0, 100);
        }
        int i2 = a.$SwitchMap$com$taobao$tao$log$LogLevel[logLevel.ordinal()];
        if (i2 == 1) {
            i = Log.d(sb2, str3);
        } else if (i2 == 2) {
            i = Log.i(sb2, str3);
        } else if (i2 == 3) {
            i = Log.w(sb2, str3);
        } else if (i2 != 4) {
            i = Log.v(sb2, str3);
        } else {
            i = Log.e(sb2, str3);
        }
        if (i == -100) {
            try {
                Log.class.getMethod(logLevel.getName().toLowerCase(), String.class, String.class).invoke(null, sb2, str3);
            } catch (Exception unused) {
            }
        }
    }
}
