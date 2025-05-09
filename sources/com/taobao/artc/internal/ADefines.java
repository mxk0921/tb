package com.taobao.artc.internal;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public interface ADefines {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public enum AccsStatus {
        ARTC_ACCS_UNINIT,
        ARTC_ACCS_INIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(AccsStatus accsStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/artc/internal/ADefines$AccsStatus");
        }

        public static AccsStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AccsStatus) ipChange.ipc$dispatch("251af631", new Object[]{str});
            }
            return (AccsStatus) Enum.valueOf(AccsStatus.class, str);
        }
    }
}
