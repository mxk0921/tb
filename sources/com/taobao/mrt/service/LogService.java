package com.taobao.mrt.service;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public interface LogService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum LogLevel {
        INFO("INFO"),
        DEBUG("DEBUG"),
        WARNING("WARN"),
        ERROR("ERROR"),
        MODEL("MODEL"),
        CONFIG("CONFIG");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;

        LogLevel(String str) {
            this.name = str;
        }

        public static /* synthetic */ Object ipc$super(LogLevel logLevel, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/service/LogService$LogLevel");
        }

        public static LogLevel valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogLevel) ipChange.ipc$dispatch("b3cce866", new Object[]{str});
            }
            return (LogLevel) Enum.valueOf(LogLevel.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum LogReceiver {
        None(0),
        Console(1),
        All(2),
        WorkStation(3);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int value;

        LogReceiver(int i) {
            this.value = i;
        }

        public static /* synthetic */ Object ipc$super(LogReceiver logReceiver, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/service/LogService$LogReceiver");
        }

        public static LogReceiver valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogReceiver) ipChange.ipc$dispatch("1ecebe9d", new Object[]{str});
            }
            return (LogReceiver) Enum.valueOf(LogReceiver.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public enum LogSource {
        JAVA("java"),
        C("C"),
        PYTHON("python");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String name;

        LogSource(String str) {
            this.name = str;
        }

        public static /* synthetic */ Object ipc$super(LogSource logSource, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mrt/service/LogService$LogSource");
        }

        public static LogSource valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LogSource) ipChange.ipc$dispatch("4923ee31", new Object[]{str});
            }
            return (LogSource) Enum.valueOf(LogSource.class, str);
        }
    }
}
