package com.alipay.android.msp.framework.smartpay.fingerprint.impl;

import android.content.Context;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.callback.IFingerprintCallback;
import com.alipay.android.msp.framework.hardwarepay.neo.fingerprint.model.FingerprintResult;
import com.alipay.android.msp.framework.taskscheduler.TaskHelper;
import com.alipay.android.msp.utils.LogUtil;
import com.alipay.security.mobile.auth.AuthInfo;
import com.alipay.security.mobile.auth.AuthenticatorCallback;
import com.alipay.security.mobile.auth.AuthenticatorFactory;
import com.alipay.security.mobile.auth.IAuthenticator;
import com.alipay.security.mobile.auth.message.AuthenticatorMessage;
import com.alipay.security.mobile.auth.message.AuthenticatorResponse;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class FingerprintAuthenticator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int HARDWAREPAY_TYPE_FP = 1;

    /* renamed from: a  reason: collision with root package name */
    public IAuthenticator f3658a;

    public static /* synthetic */ AuthenticatorCallback access$000(FingerprintAuthenticator fingerprintAuthenticator, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AuthenticatorCallback) ipChange.ipc$dispatch("2ffb90c8", new Object[]{fingerprintAuthenticator, iFingerprintCallback});
        }
        return new AuthenticatorCallback() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                FingerprintResult fingerprintResult = new FingerprintResult();
                fingerprintResult.mType = authenticatorResponse.getType();
                fingerprintResult.mResult = authenticatorResponse.getResult();
                fingerprintResult.mMessage = authenticatorResponse.getResultMessage();
                fingerprintResult.mData = authenticatorResponse.getData();
                fingerprintResult.mStatus = FingerprintAuthenticator.access$200(FingerprintAuthenticator.this, authenticatorResponse.getResult());
                List<String> resgistedTokens = authenticatorResponse.getResgistedTokens();
                if (resgistedTokens != null && resgistedTokens.size() > 0) {
                    fingerprintResult.mTokenId = resgistedTokens.get(0);
                }
                LogUtil.record(2, "FingerprintAuthenticator::getProcessAsyncCallback", fingerprintResult.toString());
                IFingerprintCallback iFingerprintCallback2 = iFingerprintCallback;
                if (iFingerprintCallback2 != null) {
                    iFingerprintCallback2.onCallBack(fingerprintResult);
                }
            }
        };
    }

    public static /* synthetic */ IAuthenticator access$100(FingerprintAuthenticator fingerprintAuthenticator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IAuthenticator) ipChange.ipc$dispatch("6eb363d0", new Object[]{fingerprintAuthenticator});
        }
        return fingerprintAuthenticator.f3658a;
    }

    public static /* synthetic */ FingerprintResult.FingerprintStatus access$200(FingerprintAuthenticator fingerprintAuthenticator, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FingerprintResult.FingerprintStatus) ipChange.ipc$dispatch("114e9ecb", new Object[]{fingerprintAuthenticator, new Integer(i)});
        }
        if (i == 100) {
            return FingerprintResult.FingerprintStatus.COMMON_SUCCESS;
        }
        if (i == 102) {
            return FingerprintResult.FingerprintStatus.COMMON_CANCELED;
        }
        if (i == 113) {
            return FingerprintResult.FingerprintStatus.COMMON_TIMEOUT;
        }
        if (i == 121) {
            return FingerprintResult.FingerprintStatus.COMMON_TO_PWD;
        }
        if (i == 129) {
            return FingerprintResult.FingerprintStatus.COMMON_BUSY;
        }
        if (i != 406) {
            return FingerprintResult.FingerprintStatus.COMMON_FAILED;
        }
        return FingerprintResult.FingerprintStatus.OEM_NEED_UPGRADE;
    }

    public void cancel(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9196b8e7", new Object[]{this, context});
            return;
        }
        a(context);
        try {
            this.f3658a.cancel(context);
        } catch (Throwable unused) {
        }
    }

    public int initHardwarePay(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6037502e", new Object[]{this, context, str})).intValue();
        }
        a(context);
        return this.f3658a.init(context, new AuthenticatorCallback() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.alipay.security.mobile.auth.AuthenticatorCallback
            public void callback(AuthenticatorResponse authenticatorResponse) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("e8b9fa1b", new Object[]{this, authenticatorResponse});
                    return;
                }
                LogUtil.record(2, "FingerprintAuthenticator:initHardwarePay", "callback, type=" + authenticatorResponse.getType());
            }
        }, str);
    }

    public void processAsync(final Context context, final String str, final int i, final int i2, final String str2, final IFingerprintCallback iFingerprintCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e133676b", new Object[]{this, context, str, new Integer(i), new Integer(i2), str2, iFingerprintCallback});
        } else {
            TaskHelper.execute(new Runnable() { // from class: com.alipay.android.msp.framework.smartpay.fingerprint.impl.FingerprintAuthenticator.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    AuthenticatorCallback access$000 = FingerprintAuthenticator.access$000(FingerprintAuthenticator.this, iFingerprintCallback);
                    try {
                        FingerprintAuthenticator.this.initHardwarePay(context, str);
                        FingerprintAuthenticator.access$100(FingerprintAuthenticator.this).process(new AuthenticatorMessage(i, i2, str2), access$000);
                    } catch (Throwable unused) {
                    }
                    int i3 = i;
                    int i4 = i2;
                    String str3 = str2;
                    LogUtil.record(2, "FingerprintAuthenticator::processAsync", "type=" + i3 + ", version=" + i4 + ", data=" + str3);
                }
            });
        }
    }

    public int checkUserStatus(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a982b739", new Object[]{this, context, str})).intValue();
        }
        a(context);
        int checkUserStatus = this.f3658a.checkUserStatus(str);
        LogUtil.record(2, "FingerprintAuthenticator::checkUserStatus", "userId:" + str + ",result:" + checkUserStatus);
        return checkUserStatus;
    }

    public String getAuthInfo(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c5e408b", new Object[]{this, context});
        }
        a(context);
        JSONObject jSONObject = new JSONObject();
        try {
            AuthInfo authInfo = this.f3658a.getAuthInfo();
            if (authInfo == null) {
                LogUtil.record(2, "FingerprintAuthenticator::getAuthInfo", "authInfo is null");
            } else {
                jSONObject.put("authInfoType", authInfo.getType());
                jSONObject.put("vendor", authInfo.getVendor());
                jSONObject.put("phoneModel", authInfo.getPhoneModle());
                jSONObject.put("protocolVersion", authInfo.getProtocolVersion());
                jSONObject.put("protocolType", authInfo.getProtocolType());
                jSONObject.put("mfacDownloadUrl", authInfo.getDownloadUrl());
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    public String process(Context context, int i, int i2, String str) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f0155e4", new Object[]{this, context, new Integer(i), new Integer(i2), str});
        }
        a(context);
        try {
            str2 = this.f3658a.process(new AuthenticatorMessage(i, i2, str));
        } catch (Throwable unused) {
            str2 = "";
        }
        LogUtil.record(2, "FingerprintAuthenticator::process", "version=" + i2 + ",data=" + str + ",type=" + i + ",result=" + str2);
        return str2;
    }

    public int registeredFingerPrintNumber(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a554e229", new Object[]{this, context})).intValue();
        }
        a(context);
        int registedFingerPrintNumber = this.f3658a.registedFingerPrintNumber();
        LogUtil.record(2, "FingerprintAuthenticator::registeredFingerPrintNumber", "num:".concat(String.valueOf(registedFingerPrintNumber)));
        return registedFingerPrintNumber;
    }

    public final void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42f6cf7", new Object[]{this, context});
        } else if (this.f3658a == null) {
            LogUtil.record(2, "FingerprintAuthenticator::initAuthenticator", "mAuthenticator is null");
            try {
                this.f3658a = AuthenticatorFactory.create(context, 1);
            } catch (Throwable unused) {
            }
        }
    }
}
