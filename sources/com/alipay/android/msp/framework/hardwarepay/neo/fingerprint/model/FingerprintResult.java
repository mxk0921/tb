package com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model;

import com.alipay.android.msp.utils.EventLogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintResult {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String mData;
    public String mMessage;
    public int mResult;
    public FingerprintStatus mStatus;
    public String mTokenId;
    public int mType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FingerprintStatus {
        COMMON_SUCCESS,
        COMMON_FAILED,
        COMMON_BUSY,
        COMMON_VERIFYING,
        COMMON_CANCELED,
        COMMON_TIMEOUT,
        COMMON_TO_PWD,
        RETRY_ING,
        RETRY_LIMIT,
        DLG_CANCEL,
        DLG_TOPWD,
        OEM_NEED_UPGRADE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FingerprintStatus fingerprintStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/hardwarepay/neo/fingerprint/model/FingerprintResult$FingerprintStatus");
        }

        public static FingerprintStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintStatus) ipChange.ipc$dispatch("23cbc41d", new Object[]{str});
            }
            return (FingerprintStatus) Enum.valueOf(FingerprintStatus.class, str);
        }
    }

    public FingerprintResult() {
        this.mStatus = FingerprintStatus.COMMON_SUCCESS;
        EventLogUtil.logPayEvent("104851", "content_type", "FingerprintResult");
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return ((((("mType:" + this.mType + ",") + "mResult:" + this.mResult + ",") + "mMessage:" + this.mMessage + ",") + "mData:" + this.mData + ",") + "mTokenId:" + this.mTokenId + ",") + "mStatus:" + this.mStatus;
    }

    public FingerprintResult(String str) {
        this.mStatus = FingerprintStatus.COMMON_SUCCESS;
        this.mData = str;
    }

    public FingerprintResult(FingerprintStatus fingerprintStatus) {
        IpChange ipChange = FingerprintStatus.$ipChange;
        this.mStatus = fingerprintStatus;
    }

    public FingerprintResult(int i, String str) {
        this.mStatus = FingerprintStatus.COMMON_SUCCESS;
        this.mResult = i;
        this.mData = str;
    }
}
