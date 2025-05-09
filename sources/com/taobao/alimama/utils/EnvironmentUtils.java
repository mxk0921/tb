package com.taobao.alimama.utils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.utils.Global;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class EnvironmentUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Env {
        UNKNOW(""),
        TAOBAO("com.taobao.taobao"),
        TMALL("com.tmall.wireless"),
        TAOBAO_LITE("com.taobao.htao.android"),
        IDLE_FISH("com.taobao.idlefish");
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String PackageName;

        Env(String str) {
            this.PackageName = str;
        }

        public static /* synthetic */ Object ipc$super(Env env, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/utils/EnvironmentUtils$Env");
        }

        public static Env valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Env) ipChange.ipc$dispatch("127c0d29", new Object[]{str});
            }
            return (Env) Enum.valueOf(Env.class, str);
        }
    }

    static {
        t2o.a(1018167407);
    }

    private EnvironmentUtils() {
    }

    public static Env getCurrentEnv() {
        Env[] values;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Env) ipChange.ipc$dispatch("d1ab17a1", new Object[0]);
        }
        for (Env env : Env.values()) {
            if (env.PackageName.equals(Global.getPackageName())) {
                return env;
            }
        }
        return Env.UNKNOW;
    }

    public static boolean isInTaobao() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4144b008", new Object[0])).booleanValue();
        }
        if (getCurrentEnv() == Env.TAOBAO) {
            return true;
        }
        return false;
    }
}
