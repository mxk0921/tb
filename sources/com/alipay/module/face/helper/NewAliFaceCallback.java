package com.alipay.module.face.helper;

import com.alibaba.security.realidentity.RPEventListener;
import com.alibaba.security.realidentity.RPResult;
import com.alipay.mobile.verifyidentity.log.VerifyLogCat;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class NewAliFaceCallback extends RPEventListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final NewAliFaceResultCallback d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface NewAliFaceResultCallback {
        void a(int i);
    }

    public NewAliFaceCallback(NewAliFaceResultCallback newAliFaceResultCallback) {
        this.d = newAliFaceResultCallback;
    }

    public static /* synthetic */ Object ipc$super(NewAliFaceCallback newAliFaceCallback, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/module/face/helper/NewAliFaceCallback");
    }

    @Override // com.alibaba.security.realidentity.RPEventListener
    public void onFinish(RPResult rPResult, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fe467c", new Object[]{this, rPResult, str, str2});
        } else if (rPResult != null) {
            int i = rPResult.code;
            VerifyLogCat.i("AliFaceCertHelper", "集团人脸 code:" + i);
            this.d.a(i);
        } else {
            VerifyLogCat.i("AliFaceCertHelper", "集团人脸 result null");
            this.d.a(-2);
        }
    }
}
