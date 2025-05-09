package com.taobao.login4android.qrcode.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.callback.ICallback;
import com.taobao.login4android.qrcode.result.LoginResult;
import com.taobao.login4android.qrcode.util.ThreadPool;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class QrLoginTask2 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private ICallback<LoginResult> mCallback;
    private long mQrCheckInterval;
    public volatile boolean mStop;
    private String mToken;

    static {
        t2o.a(70254978);
    }

    public QrLoginTask2(String str, long j, ICallback<LoginResult> iCallback) {
        this.mToken = str;
        this.mQrCheckInterval = j;
        this.mCallback = iCallback;
    }

    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
            return;
        }
        ThreadPool.getInstance().remove(this);
        ThreadPool.getInstance().postDelayed(this, this.mQrCheckInterval);
    }

    public void release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca5510e", new Object[]{this});
        } else {
            this.mStop = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0092  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.login4android.qrcode.task.QrLoginTask2.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0012
            java.lang.String r3 = "5c510192"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r10
            r2.ipc$dispatch(r3, r1)
            return
        L_0x0012:
            com.taobao.login4android.qrcode.callback.ICallback<com.taobao.login4android.qrcode.result.LoginResult> r2 = r10.mCallback
            boolean r3 = r10.mStop
            if (r3 != 0) goto L_0x00a5
            java.lang.String r3 = r10.mToken
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0022
            goto L_0x00a5
        L_0x0022:
            com.taobao.login4android.qrcode.result.LoginResult r3 = new com.taobao.login4android.qrcode.result.LoginResult
            r3.<init>()
            r4 = 0
            java.lang.String r5 = r10.mToken     // Catch: all -> 0x002f
            com.ali.user.mobile.rpc.login.model.DefaultLoginResponseData r5 = com.taobao.login4android.UIHavanaComponent.qrLogin(r5)     // Catch: all -> 0x002f
            goto L_0x0034
        L_0x002f:
            r5 = move-exception
            r5.printStackTrace()
            r5 = r4
        L_0x0034:
            r6 = 3000(0xbb8, float:4.204E-42)
            r7 = 14031(0x36cf, float:1.9662E-41)
            if (r5 == 0) goto L_0x0055
            int r8 = r5.code
            r9 = 14030(0x36ce, float:1.966E-41)
            if (r8 != r9) goto L_0x0041
            goto L_0x0079
        L_0x0041:
            if (r8 != r7) goto L_0x0047
            r3.setResultCode(r7)
            goto L_0x0079
        L_0x0047:
            if (r8 != r6) goto L_0x0057
            T r9 = r5.returnValue
            if (r9 == 0) goto L_0x0057
            com.ali.user.mobile.rpc.login.model.LoginReturnData r9 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r9
            com.ali.user.mobile.base.helper.LoginDataHelper.processLoginReturnData(r1, r9)
            r3.setResultCode(r6)
        L_0x0055:
            r1 = 0
            goto L_0x0079
        L_0x0057:
            r3.setResultCode(r8)
            java.lang.String r1 = r5.actionType
            r3.setActionType(r1)
            T r1 = r5.returnValue
            if (r1 == 0) goto L_0x0072
            com.ali.user.mobile.rpc.login.model.LoginReturnData r1 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r1
            java.lang.String r1 = r1.h5Url
            r3.setUrl(r1)
            T r1 = r5.returnValue
            com.ali.user.mobile.rpc.login.model.LoginReturnData r1 = (com.ali.user.mobile.rpc.login.model.LoginReturnData) r1
            r3.setLoginData(r1)
            goto L_0x0055
        L_0x0072:
            r3.setUrl(r4)
            r3.setLoginData(r4)
            goto L_0x0055
        L_0x0079:
            if (r1 == 0) goto L_0x0080
            boolean r4 = r10.mStop
            if (r4 == 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r0 = r1
        L_0x0081:
            if (r0 == 0) goto L_0x0092
            if (r2 == 0) goto L_0x008e
            int r0 = r3.getResultCode()
            if (r7 != r0) goto L_0x008e
            r2.onScaned(r3)
        L_0x008e:
            r10.execute()
            goto L_0x00a4
        L_0x0092:
            r10.release()
            if (r2 == 0) goto L_0x00a4
            int r0 = r3.getResultCode()
            if (r6 != r0) goto L_0x00a1
            r2.onSuccess(r3)
            goto L_0x00a4
        L_0x00a1:
            r2.onFailure(r3)
        L_0x00a4:
            return
        L_0x00a5:
            r10.release()
            if (r2 == 0) goto L_0x00b4
            com.taobao.login4android.qrcode.result.LoginResult r0 = new com.taobao.login4android.qrcode.result.LoginResult
            r0.<init>()
            r1 = -104(0xffffffffffffff98, float:NaN)
            r0.setResultCode(r1)
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.login4android.qrcode.task.QrLoginTask2.run():void");
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.mStop = true;
        this.mToken = null;
        release();
        ThreadPool.getInstance().remove(this);
    }
}
