package com.alibaba.aliweex.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.lp0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class MemoryMonitor {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final MemoryStatus f2096a;
    public static final MemoryStatus b;
    public static boolean c = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public enum MemoryStatus {
        NORMAL("good"),
        HIGH("normal"),
        DANGEROUS("dangerous"),
        CRITICAL("fatal");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String status;

        MemoryStatus(String str) {
            this.status = str;
        }

        public static /* synthetic */ Object ipc$super(MemoryStatus memoryStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/aliweex/utils/MemoryMonitor$MemoryStatus");
        }

        public static MemoryStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MemoryStatus) ipChange.ipc$dispatch("e398f59f", new Object[]{str});
            }
            return (MemoryStatus) Enum.valueOf(MemoryStatus.class, str);
        }

        public boolean dangerous() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d87a11d5", new Object[]{this})).booleanValue();
            }
            return equals(DANGEROUS);
        }

        public boolean fatal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1376978f", new Object[]{this})).booleanValue();
            }
            return equals(CRITICAL);
        }

        public boolean good() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7e6d5ec8", new Object[]{this})).booleanValue();
            }
            return equals(NORMAL);
        }

        public boolean normal() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b51575f2", new Object[]{this})).booleanValue();
            }
            return equals(HIGH);
        }
    }

    static {
        t2o.a(85983299);
        MemoryStatus memoryStatus = MemoryStatus.NORMAL;
        f2096a = memoryStatus;
        b = memoryStatus;
        String str = memoryStatus.status;
    }

    public static String a() {
        lp0.e f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("10d90f1f", new Object[0]);
        }
        if (!c) {
            return "unknown";
        }
        try {
            lp0 d = lp0.d();
            if (d == null || (f = d.f()) == null) {
                return "unknown";
            }
            int i = f.f23479a;
            if (i == -1) {
                return "unknown";
            }
            if (i == 0) {
                return "high_end";
            }
            if (i != 2) {
                return "medium";
            }
            return "low_end";
        } catch (Throwable unused) {
            c = false;
            return "unknown";
        }
    }

    public static String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("cb6defd0", new Object[0]);
        }
        MemoryStatus memoryStatus = f2096a;
        if (memoryStatus.good() && b.good()) {
            return MemoryStatus.NORMAL.status;
        }
        if (!memoryStatus.fatal()) {
            MemoryStatus memoryStatus2 = b;
            if (!memoryStatus2.fatal()) {
                if (memoryStatus.dangerous() || memoryStatus2.dangerous()) {
                    return MemoryStatus.DANGEROUS.status;
                }
                if (memoryStatus.normal() || memoryStatus2.normal()) {
                    return MemoryStatus.HIGH.status;
                }
                return MemoryStatus.NORMAL.status;
            }
        }
        return MemoryStatus.CRITICAL.status;
    }

    public static void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ef5762f", new Object[0]);
        }
    }
}
