package android.taobao.windvane.util.log;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.util.tlog.TLogTracker;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ILog {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public enum LogLevelEnum {
        VERBOSE(0, "V"),
        DEBUG(1, TLogTracker.LEVEL_DEBUG),
        INFO(2, TLogTracker.LEVEL_INFO),
        WARNING(3, "W"),
        ERROR(4, "E");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int LogLevel;
        private String LogLevelName;

        LogLevelEnum(int i, String str) {
            this.LogLevelName = str;
            this.LogLevel = i;
        }

        public static /* synthetic */ Object ipc$super(LogLevelEnum logLevelEnum, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/util/log/ILog$LogLevelEnum");
        }

        public static LogLevelEnum valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogLevelEnum) ipChange.ipc$dispatch("2710b4d6", new Object[]{str});
            }
            return (LogLevelEnum) Enum.valueOf(LogLevelEnum.class, str);
        }

        public int getLogLevel() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("8d423990", new Object[]{this})).intValue();
            }
            return this.LogLevel;
        }

        public String getLogLevelName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e73f1dd8", new Object[]{this});
            }
            return this.LogLevelName;
        }
    }

    void d(String str, String str2);

    void d(String str, String str2, Throwable th);

    void e(String str, String str2);

    void e(String str, String str2, Throwable th);

    void i(String str, String str2);

    void i(String str, String str2, Throwable th);

    void v(String str, String str2);

    void v(String str, String str2, Throwable th);

    void w(String str, String str2);

    void w(String str, String str2, Throwable th);
}
