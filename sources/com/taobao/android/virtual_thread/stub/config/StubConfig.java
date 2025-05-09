package com.taobao.android.virtual_thread.stub.config;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Pattern;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class StubConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DO_NOTHING = 0;
    public static final int USE_VIRTUAL_THREAD_POOL = 1;
    public static int stubToken = 0;
    private static Set<String> exThreadPoolConfig = new HashSet();
    private static Set<String> workThreadPoolConfig = new HashSet();
    private static volatile boolean isSupportRedexVt32 = false;

    static {
        t2o.a(974127128);
    }

    public static boolean isExcludeThread(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7adce68f", new Object[]{str})).booleanValue();
        }
        for (String str2 : exThreadPoolConfig) {
            if (Pattern.matches(str2, str)) {
                return true;
            }
        }
        if (workThreadPoolConfig.size() > 0) {
            for (String str3 : workThreadPoolConfig) {
                if (Pattern.matches(str3, str)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean isSupportRedexVt32() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13c5f187", new Object[0])).booleanValue();
        }
        return isSupportRedexVt32;
    }

    public static boolean isVirtualThreadPool() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d129b3b2", new Object[0])).booleanValue();
        }
        if ((stubToken & 1) > 0) {
            return true;
        }
        return false;
    }

    public static void setExThreadPoolConfig(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2683e13b", new Object[]{set});
        } else if (set != null) {
            exThreadPoolConfig = new HashSet(set);
        }
    }

    public static void setStubToken(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e54b153", new Object[]{new Integer(i)});
        } else {
            stubToken = i;
        }
    }

    public static void setSupportRedexVt32(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f76b7579", new Object[]{new Boolean(z)});
        } else {
            isSupportRedexVt32 = z;
        }
    }

    public static void setWorkThreadPoolConfig(Set<String> set) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3e9629d", new Object[]{set});
        } else if (set != null) {
            workThreadPoolConfig = new HashSet(set);
        }
    }
}
