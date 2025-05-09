package com.taobao.alimama.services;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface IBaseService {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum Names {
        SERVICE_CONFIGURATION,
        SERVICE_IMAGE_DOWNLOAD,
        SERVICE_LOGIN,
        SERVICE_USER_TRACK,
        SERVICE_TIME,
        SERVICE_URL_NAV,
        SERVICE_TAOBAO_LOCATION;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(Names names, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/alimama/services/IBaseService$Names");
        }

        public static Names valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Names) ipChange.ipc$dispatch("e92fc2d8", new Object[]{str});
            }
            return (Names) Enum.valueOf(Names.class, str);
        }
    }

    String d();
}
