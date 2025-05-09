package com.taobao.trtc.utils;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tlog.adapter.AdapterForTLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TrtcLog {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static boolean f13974a = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TrtcLogLevel {
        E_LOG_LEVEL_NONE,
        E_LOG_LEVEL_ERROR,
        E_LOG_LEVEL_WARN,
        E_LOG_LEVEL_INFO,
        E_LOG_LEVEL_DEBUG,
        E_LOG_LEVEL_VERBOSE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(TrtcLogLevel trtcLogLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/utils/TrtcLog$TrtcLogLevel");
        }

        public static TrtcLogLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TrtcLogLevel) ipChange.ipc$dispatch("38f161c5", new Object[]{str});
            }
            return (TrtcLogLevel) Enum.valueOf(TrtcLogLevel.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel;

        static {
            int[] iArr = new int[TrtcLogLevel.values().length];
            $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel = iArr;
            try {
                iArr[TrtcLogLevel.E_LOG_LEVEL_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[TrtcLogLevel.E_LOG_LEVEL_WARN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[TrtcLogLevel.E_LOG_LEVEL_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[TrtcLogLevel.E_LOG_LEVEL_DEBUG.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[TrtcLogLevel.E_LOG_LEVEL_VERBOSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static {
        t2o.a(395313644);
    }

    public static String a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4213c00b", new Object[]{str});
        }
        Process.myPid();
        Process.myTid();
        String name = Thread.currentThread().getName();
        if (str == "Ntrtc") {
            return str + "/" + name;
        }
        return "Jtrtc/" + name + "/" + str;
    }

    public static void b(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a6c1a47", new Object[]{str, trtcLogLevel, str2});
        } else if (!f13974a || !AdapterForTLog.isValid()) {
            c(str, trtcLogLevel, str2);
        } else {
            g(str, trtcLogLevel, str2);
        }
    }

    public static void c(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c65553e", new Object[]{str, trtcLogLevel, str2});
        } else if (a.$SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[trtcLogLevel.ordinal()] == 1) {
            Log.e(str, str2);
        }
    }

    public static void d(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7c70fc1", new Object[]{new Integer(i), str});
        } else if (i >= 0 && i <= TrtcLogLevel.values().length - 1) {
            int i2 = a.$SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[TrtcLogLevel.values()[i].ordinal()];
            if (i2 == 1) {
                i("Ntrtc", str);
            } else if (i2 == 2) {
                l("Ntrtc", str);
            } else if (i2 == 3) {
                j("Ntrtc", str);
            } else if (i2 == 4) {
                h("Ntrtc", str);
            } else if (i2 == 5) {
                k("Ntrtc", str);
            }
        }
    }

    public static void e(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b15148b4", new Object[]{new Boolean(z)});
        }
    }

    public static void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43351e98", new Object[]{new Boolean(z)});
        } else {
            f13974a = z;
        }
    }

    public static void g(String str, TrtcLogLevel trtcLogLevel, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1d7ae0", new Object[]{str, trtcLogLevel, str2});
            return;
        }
        int i = a.$SwitchMap$com$taobao$trtc$utils$TrtcLog$TrtcLogLevel[trtcLogLevel.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            AdapterForTLog.loge(str, str2);
        } else if (i == 4) {
            AdapterForTLog.logd(str, str2);
        } else if (i == 5) {
            AdapterForTLog.logv(str, str2);
        }
    }

    public static void h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f180e7f", new Object[]{str, str2});
        } else {
            b(a(str), TrtcLogLevel.E_LOG_LEVEL_DEBUG, str2);
        }
    }

    public static void i(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb83980", new Object[]{str, str2});
        } else {
            b(a(str), TrtcLogLevel.E_LOG_LEVEL_ERROR, str2);
        }
    }

    public static void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e38e584", new Object[]{str, str2});
        } else {
            b(a(str), TrtcLogLevel.E_LOG_LEVEL_INFO, str2);
        }
    }

    public static void k(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("625b1491", new Object[]{str, str2});
        } else {
            b(a(str), TrtcLogLevel.E_LOG_LEVEL_VERBOSE, str2);
        }
    }

    public static void l(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefb3f92", new Object[]{str, str2});
        } else {
            b(a(str), TrtcLogLevel.E_LOG_LEVEL_WARN, str2);
        }
    }
}
