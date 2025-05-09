package com.taobao.artc.utils;

import android.os.Process;
import android.util.Log;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.artc.api.AConstants;
import com.taobao.artc.api.IArtcLogHandle;
import com.taobao.tlog.adapter.AdapterForTLog;
import com.taobao.trtc.utils.TrtcLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ArtcLog {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String preTag = "jartc.";
    private static final String webrtcPreTag = "nartc";
    private static final Object LOG_BREAK = "|";
    private static boolean isPrintLog = true;
    private static boolean isUseTlog = true;
    private static boolean isForcePrintLog = false;
    private static Level forcePrintLevel = Level.D;
    private static IArtcLogHandle artcLogCbHandle = null;
    private static boolean forcePrintAllTlog = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum Level {
        I,
        V,
        D,
        W,
        E,
        L;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Level level, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/utils/ArtcLog$Level");
        }

        public static Level valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Level) ipChange.ipc$dispatch("52795820", new Object[]{str});
            }
            return (Level) Enum.valueOf(Level.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum LoggingSeverity {
        LS_UNKNOWN,
        LS_DEFAULT,
        LS_VERBOSE,
        LS_DEBUG,
        LS_INFO,
        LS_WARNING,
        LS_ERROR,
        LS_LOG_FATAL,
        LS_NONE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LoggingSeverity loggingSeverity, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/utils/ArtcLog$LoggingSeverity");
        }

        public static LoggingSeverity valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LoggingSeverity) ipChange.ipc$dispatch("abd9afe8", new Object[]{str});
            }
            return (LoggingSeverity) Enum.valueOf(LoggingSeverity.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity;

        static {
            int[] iArr = new int[LoggingSeverity.values().length];
            $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity = iArr;
            try {
                iArr[LoggingSeverity.LS_DEBUG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[LoggingSeverity.LS_VERBOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[LoggingSeverity.LS_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[LoggingSeverity.LS_WARNING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[LoggingSeverity.LS_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[LoggingSeverity.LS_LOG_FATAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static String buildLogMsg(String str, Object... objArr) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fe17598b", new Object[]{str, objArr});
        }
        if (str == null && objArr == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (str != null) {
            sb.append(" ");
            sb.append(str);
        }
        if (objArr != null) {
            while (true) {
                int i2 = i + 1;
                if (i2 >= objArr.length) {
                    break;
                }
                sb.append(" ");
                sb.append(formatKv(objArr[i], objArr[i2]));
                i += 2;
            }
            if (i == objArr.length - 1) {
                sb.append(" ");
                sb.append(objArr[i]);
            }
        }
        return sb.toString();
    }

    private static String buildLogTag(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("774883eb", new Object[]{str});
        }
        int myPid = Process.myPid();
        int myTid = Process.myTid();
        return preTag + str + ("[" + Thread.currentThread().getName() + "|" + myPid + "|" + myTid + "]");
    }

    public static void d(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d89652", new Object[]{str, str2, objArr});
            return;
        }
        IArtcLogHandle iArtcLogHandle = artcLogCbHandle;
        if (iArtcLogHandle != null) {
            AConstants.ArtcLogLevel artcLogLevel = AConstants.ArtcLogLevel.ARTC_LOG_DEBUG;
            iArtcLogHandle.onLogPrint(artcLogLevel, buildLogTag(str) + buildLogMsg(str2, objArr));
        } else if (!isPrintLog(Level.D)) {
        } else {
            if (isUseTlog) {
                if (forcePrintAllTlog) {
                    AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
                } else {
                    AdapterForTLog.logd(buildLogTag(str), buildLogMsg(str2, objArr));
                }
                if (isForcePrintLog) {
                    buildLogTag(str);
                    buildLogMsg(str2, objArr);
                    return;
                }
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc61b1", new Object[]{str, str2, objArr});
        } else {
            e(str, str2, null, objArr);
        }
    }

    private static String formatKv(Object obj, Object obj2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4425a33f", new Object[]{obj, obj2});
        }
        StringBuilder sb = new StringBuilder();
        if (obj == null) {
            obj = "";
        }
        sb.append(obj);
        sb.append(":");
        if (obj2 == null) {
            obj2 = "";
        }
        sb.append(obj2);
        return sb.toString();
    }

    public static boolean getUseTlog() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c88344c", new Object[0])).booleanValue();
        }
        return isUseTlog;
    }

    public static void i(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25eb8f2d", new Object[]{str, str2, objArr});
            return;
        }
        IArtcLogHandle iArtcLogHandle = artcLogCbHandle;
        if (iArtcLogHandle != null) {
            AConstants.ArtcLogLevel artcLogLevel = AConstants.ArtcLogLevel.ARTC_LOG_INFO;
            iArtcLogHandle.onLogPrint(artcLogLevel, buildLogTag(str) + buildLogMsg(str2, objArr));
        } else if (!isPrintLog(Level.E)) {
        } else {
            if (isUseTlog) {
                if (forcePrintAllTlog) {
                    AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
                } else {
                    AdapterForTLog.logi(buildLogTag(str), buildLogMsg(str2, objArr));
                }
                if (isForcePrintLog) {
                    buildLogTag(str);
                    buildLogMsg(str2, objArr);
                    return;
                }
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static boolean isPrintLog(Level level) {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e82849d3", new Object[]{level})).booleanValue();
        }
        if (forcePrintAllTlog) {
            return true;
        }
        if (!isPrintLog) {
            return false;
        }
        if (!isUseTlog) {
            return true;
        }
        Level level2 = Level.L;
        try {
            level2 = Level.valueOf(AdapterForTLog.getLogLevel());
        } catch (Exception e) {
            e.printStackTrace();
            new StringBuilder("error: ").append(e.getMessage());
        }
        if (level.ordinal() >= level2.ordinal()) {
            z = true;
        } else {
            z = false;
        }
        if (level2.ordinal() != forcePrintLevel.ordinal()) {
            isForcePrintLog = false;
        } else {
            isForcePrintLog = true;
        }
        return z;
    }

    public static void setArtcLogCallbackHandle(IArtcLogHandle iArtcLogHandle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c540fed1", new Object[]{iArtcLogHandle});
        } else {
            artcLogCbHandle = iArtcLogHandle;
        }
    }

    public static void setPrintLog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c80ec2f4", new Object[]{new Boolean(z)});
            return;
        }
        isPrintLog = z;
        TrtcLog.e(z);
    }

    public static void setUseTlog(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ac80298", new Object[]{new Boolean(z)});
            return;
        }
        isUseTlog = z;
        TrtcLog.f(z);
    }

    public static void v(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("741ce300", new Object[]{str, str2, objArr});
            return;
        }
        IArtcLogHandle iArtcLogHandle = artcLogCbHandle;
        if (iArtcLogHandle != null) {
            AConstants.ArtcLogLevel artcLogLevel = AConstants.ArtcLogLevel.ARTC_LOG_VERBOSE;
            iArtcLogHandle.onLogPrint(artcLogLevel, buildLogTag(str) + buildLogMsg(str2, objArr));
        } else if (!isPrintLog(Level.V)) {
        } else {
            if (isUseTlog) {
                if (forcePrintAllTlog) {
                    AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
                } else {
                    AdapterForTLog.logv(buildLogTag(str), buildLogMsg(str2, objArr));
                }
                if (isForcePrintLog) {
                    buildLogTag(str);
                    buildLogMsg(str2, objArr);
                    return;
                }
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a20ae5f", new Object[]{str, str2, objArr});
        } else {
            w(str, str2, null, objArr);
        }
    }

    public static void e(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56d61a9c", new Object[]{str, str2, th, objArr});
            return;
        }
        IArtcLogHandle iArtcLogHandle = artcLogCbHandle;
        if (iArtcLogHandle != null) {
            AConstants.ArtcLogLevel artcLogLevel = AConstants.ArtcLogLevel.ARTC_LOG_ERROR;
            iArtcLogHandle.onLogPrint(artcLogLevel, buildLogTag(str) + buildLogMsg(str2, objArr));
        } else if (!isPrintLog(Level.E)) {
        } else {
            if (isUseTlog) {
                AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr), th);
                if (isForcePrintLog) {
                    Log.e(buildLogTag(str), buildLogMsg(str2, objArr), th);
                    return;
                }
                return;
            }
            Log.e(buildLogTag(str), buildLogMsg(str2, objArr), th);
        }
    }

    public static void onArtcLog(int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9de7aa1", new Object[]{new Integer(i), str});
            return;
        }
        LoggingSeverity loggingSeverity = LoggingSeverity.LS_ERROR;
        if (i >= loggingSeverity.ordinal()) {
            loggingSeverity.ordinal();
        }
        switch (a.$SwitchMap$com$taobao$artc$utils$ArtcLog$LoggingSeverity[loggingSeverity.ordinal()]) {
            case 1:
                d(webrtcPreTag, str, new Object[0]);
                return;
            case 2:
            case 3:
                i(webrtcPreTag, str, new Object[0]);
                return;
            case 4:
                w(webrtcPreTag, str, new Object[0]);
                return;
            case 5:
            case 6:
                e(webrtcPreTag, str, new Object[0]);
                return;
            default:
                d(webrtcPreTag, str, new Object[0]);
                return;
        }
    }

    public static void w(String str, String str2, Throwable th, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f5e26ae", new Object[]{str, str2, th, objArr});
            return;
        }
        IArtcLogHandle iArtcLogHandle = artcLogCbHandle;
        if (iArtcLogHandle != null) {
            AConstants.ArtcLogLevel artcLogLevel = AConstants.ArtcLogLevel.ARTC_LOG_WARN;
            iArtcLogHandle.onLogPrint(artcLogLevel, buildLogTag(str) + buildLogMsg(str2, objArr));
        } else if (!isPrintLog(Level.W)) {
        } else {
            if (isUseTlog) {
                if (forcePrintAllTlog) {
                    AdapterForTLog.loge(buildLogTag(str), buildLogMsg(str2, objArr));
                } else {
                    AdapterForTLog.logw(buildLogTag(str), buildLogMsg(str2, objArr));
                }
                if (isForcePrintLog) {
                    buildLogTag(str);
                    buildLogMsg(str2, objArr);
                    return;
                }
                return;
            }
            buildLogTag(str);
            buildLogMsg(str2, objArr);
        }
    }

    static {
        t2o.a(395313310);
    }
}
