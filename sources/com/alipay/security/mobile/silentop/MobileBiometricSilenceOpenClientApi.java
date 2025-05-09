package com.alipay.security.mobile.silentop;

import com.alipay.mobile.framework.service.annotation.OperationType;
import com.alipay.mobile.framework.service.annotation.SignCheck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public interface MobileBiometricSilenceOpenClientApi {
    @OperationType("alipay.bic.silence.doRegister")
    @SignCheck
    void doSilenceRegister(BiometricSilenceOperationSubmitData biometricSilenceOperationSubmitData);

    @OperationType("alipay.bic.silence.doRegister.withResult")
    @SignCheck
    SilenceRpcResult doSilenceRegisterWithResult(BiometricSilenceOperationSubmitData biometricSilenceOperationSubmitData);
}
