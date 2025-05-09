package com.taobao.social.sdk.net;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ISocialBusinessListener<T> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public enum ErrorType {
        ERROR_LIMITING,
        ERROR_NET,
        ERROR_SERVICE,
        ERROR_OTHER;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ErrorType errorType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/social/sdk/net/ISocialBusinessListener$ErrorType");
        }

        public static ErrorType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorType) ipChange.ipc$dispatch("af05b0b8", new Object[]{str});
            }
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }
    }

    void onError(ErrorType errorType, String str, String str2);

    void onSuccess(MtopResponse mtopResponse, T t);
}
