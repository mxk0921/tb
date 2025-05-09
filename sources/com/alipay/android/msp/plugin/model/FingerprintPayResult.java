package com.alipay.android.msp.plugin.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintPayResult {
    public String mData;
    public String mMessage;
    public FingerprintPayStatus mPayStatus;
    public FingerprintProgressStatus mProgressStatus;
    public FingerprintRegStatus mRegStatus;
    public int mResult;
    public String mTokenId;
    public int mType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FingerprintPayStatus {
        SUCCESS,
        FAILED,
        BUSY,
        CANCELED,
        TOPWD,
        TIMEOUT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FingerprintPayStatus fingerprintPayStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/plugin/model/FingerprintPayResult$FingerprintPayStatus");
        }

        public static FingerprintPayStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintPayStatus) ipChange.ipc$dispatch("fe026b17", new Object[]{str});
            }
            return (FingerprintPayStatus) Enum.valueOf(FingerprintPayStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FingerprintProgressStatus {
        SUCCESS,
        FAILED,
        BUSY,
        VERIFYING,
        CANCELED,
        TOPWD,
        TIMEOUT,
        RETRY_ING,
        RETRY_LIMIT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FingerprintProgressStatus fingerprintProgressStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/plugin/model/FingerprintPayResult$FingerprintProgressStatus");
        }

        public static FingerprintProgressStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintProgressStatus) ipChange.ipc$dispatch("86e4cb06", new Object[]{str});
            }
            return (FingerprintProgressStatus) Enum.valueOf(FingerprintProgressStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public enum FingerprintRegStatus {
        SUCCESS,
        FAILED,
        BUSY,
        CANCELED,
        TIMEOUT;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(FingerprintRegStatus fingerprintRegStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/plugin/model/FingerprintPayResult$FingerprintRegStatus");
        }

        public static FingerprintRegStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (FingerprintRegStatus) ipChange.ipc$dispatch("e9d1e1ab", new Object[]{str});
            }
            return (FingerprintRegStatus) Enum.valueOf(FingerprintRegStatus.class, str);
        }
    }
}
