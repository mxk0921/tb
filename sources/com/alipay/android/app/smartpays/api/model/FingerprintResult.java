package com.alipay.android.app.smartpays.api.model;

import com.alipay.mobile.framework.MpaasClassInfo;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.umipublish.draft.DraftMediaHelper;

/* compiled from: Taobao */
@MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
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
    @MpaasClassInfo(ExportJarName = "unknown", Level = DraftMediaHelper.DraftType.PRODUCT, Product = ":android-phone-wallet-safepaybase")
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
        DLG_TOPWD
    }

    public FingerprintResult() {
        this.mStatus = FingerprintStatus.COMMON_SUCCESS;
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
        FingerprintStatus fingerprintStatus2 = FingerprintStatus.COMMON_SUCCESS;
        this.mStatus = fingerprintStatus;
    }

    public FingerprintResult(int i, String str) {
        this.mStatus = FingerprintStatus.COMMON_SUCCESS;
        this.mResult = i;
        this.mData = str;
    }
}
