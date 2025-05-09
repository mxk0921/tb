package com.taobao.taolive.sdk.utils.newutils;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.giv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TLiveBizUtils {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static AppType f13320a = null;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum AppEnv {
        ONLINE,
        PRE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AppEnv appEnv, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/utils/newutils/TLiveBizUtils$AppEnv");
        }

        public static AppEnv valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppEnv) ipChange.ipc$dispatch("7d4b9ca3", new Object[]{str});
            }
            return (AppEnv) Enum.valueOf(AppEnv.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum AppType {
        DIANTAO,
        TAOBAO;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AppType appType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/utils/newutils/TLiveBizUtils$AppType");
        }

        public static AppType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AppType) ipChange.ipc$dispatch("2d00472c", new Object[]{str});
            }
            return (AppType) Enum.valueOf(AppType.class, str);
        }
    }

    static {
        t2o.a(806356509);
    }

    public static boolean a() {
        AppType appType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c23cff1", new Object[0])).booleanValue();
        }
        AppType appType2 = f13320a;
        if (appType2 != null) {
            if (appType2 == AppType.DIANTAO) {
                return true;
            }
            return false;
        } else if (giv.c() == null) {
            return false;
        } else {
            if (giv.c().b()) {
                appType = AppType.DIANTAO;
            } else {
                appType = AppType.TAOBAO;
            }
            f13320a = appType;
            if (appType == AppType.DIANTAO) {
                return true;
            }
            return false;
        }
    }
}
