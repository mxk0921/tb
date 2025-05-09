package org.android.spdy;

import android.util.Log;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.IpChange;
import tb.l0r;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class spduLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static int defaultLogLevel;
    private static volatile boolean isValid;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class Level {
        public static final int D = 1;
        public static final int E = 4;
        public static final int F = 5;
        public static final int I = 2;
        public static final int V = 0;
        public static final int W = 3;
    }

    static {
        try {
            IpChange ipChange = ALog.$ipChange;
            isValid = true;
        } catch (ClassNotFoundException unused) {
            isValid = false;
        }
        defaultLogLevel = 4;
    }

    public static void Logd(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be5ebbdb", new Object[]{str, str2});
        } else if (SpdyAgent.enableDebug && str != null && str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getId());
            sb.append(" - ");
            sb.append(str2);
        }
    }

    public static void Loge(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4afee6dc", new Object[]{str, str2});
        } else if (SpdyAgent.enableDebug && str != null && str2 != null) {
            Log.e(str, Thread.currentThread().getId() + " - " + str2);
        }
    }

    public static void Logi(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d7f92e0", new Object[]{str, str2});
        } else if (SpdyAgent.enableDebug && str != null && str2 != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(Thread.currentThread().getId());
            sb.append(" - ");
            sb.append(str2);
        }
    }

    public static void Tloge(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ea6e17", new Object[]{str, str2, str3, objArr});
        } else {
            logAdapter(4, str, str2, str3, objArr);
        }
    }

    private static void d(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d85ce08", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (isValid) {
                ALog.d(str, str2, str3, objArr);
            }
        } catch (Throwable unused) {
        }
    }

    private static void e(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66871fa7", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (isValid) {
                ALog.e(str, str2, str3, objArr);
            }
        } catch (Throwable unused) {
        }
    }

    private static void i(String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca8c6623", new Object[]{str, str2, str3, objArr});
            return;
        }
        try {
            if (isValid) {
                ALog.i(str, str2, str3, objArr);
            }
        } catch (Throwable unused) {
        }
    }

    public static void Logd(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be4b8af7", new Object[]{str, str2, obj});
        } else if (SpdyAgent.enableDebug) {
            Logd(str, str2 + String.valueOf(obj));
        }
    }

    public static void Loge(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf0157b8", new Object[]{str, str2, obj});
        } else if (SpdyAgent.enableDebug) {
            Loge(str, str2 + obj);
        }
    }

    public static void Logi(String str, String str2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32733fe4", new Object[]{str, str2, new Long(j)});
        } else if (SpdyAgent.enableDebug) {
            Logi(str, str2 + String.valueOf(j));
        }
    }

    public static void logAdapter(int i, String str, String str2, String str3, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfece2", new Object[]{new Integer(i), str, str2, str3, objArr});
        } else if (l0r.W() && i >= defaultLogLevel) {
            if (i == 1) {
                d(str, str3 + "|", str2, objArr);
            } else if (i == 2) {
                i(str, str3 + "|", str2, objArr);
            } else if (i == 4) {
                e(str, str3 + "|", str2, objArr);
            }
        }
    }

    public static void Logi(String str, String str2, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d88abc", new Object[]{str, str2, obj});
        } else if (SpdyAgent.enableDebug) {
            Logi(str, str2 + obj);
        }
    }
}
