package com.ut.share;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.share.data.ShareData;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ShareResponse {
    public ShareData data;
    public ErrorCode errorCode;
    public String errorMessage;
    public SharePlatform platform;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum ErrorCode {
        ERR_SUCCESS,
        ERR_CANCEL,
        ERR_FAIL,
        ERR_START;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ErrorCode errorCode, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ut/share/ShareResponse$ErrorCode");
        }

        public static ErrorCode valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ErrorCode) ipChange.ipc$dispatch("77efd72d", new Object[]{str});
            }
            return (ErrorCode) Enum.valueOf(ErrorCode.class, str);
        }
    }

    static {
        t2o.a(662700051);
    }

    public ShareResponse() {
    }

    public ShareResponse(SharePlatform sharePlatform, ShareData shareData, ErrorCode errorCode, String str) {
        this.platform = sharePlatform;
        this.data = shareData;
        this.errorCode = errorCode;
        this.errorMessage = str;
    }
}
