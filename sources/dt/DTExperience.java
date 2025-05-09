package dt;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.r7t;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class DTExperience {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public enum LogType {
        ERROR,
        WARN,
        DEBUG,
        INFO;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(LogType logType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in dt/DTExperience$LogType");
        }

        public static LogType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogType) ipChange.ipc$dispatch("8d2d3937", new Object[]{str});
            }
            return (LogType) Enum.valueOf(LogType.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public interface a {
        HashMap<String, String> a();

        long b(r7t r7tVar, long j, long j2, Map<String, String> map);

        boolean c(String str, String str2);

        String d(String str);
    }

    static {
        t2o.a(774897995);
    }

    public static a a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("4a5e95ed", new Object[0]);
        }
        return null;
    }
}
