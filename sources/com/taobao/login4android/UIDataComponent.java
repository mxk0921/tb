package com.taobao.login4android;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.qrcode.callback.ICallback;
import com.taobao.login4android.qrcode.result.LoginResult;
import com.taobao.login4android.qrcode.task.QrLoginTask2;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class UIDataComponent {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static UIDataComponent mInstance;
    private QrLoginTask2 mQrTask2;

    static {
        t2o.a(70254915);
    }

    public static UIDataComponent getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UIDataComponent) ipChange.ipc$dispatch("4823b152", new Object[0]);
        }
        if (mInstance == null) {
            synchronized (UIDataComponent.class) {
                try {
                    if (mInstance == null) {
                        mInstance = new UIDataComponent();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return mInstance;
    }

    public void qrLogin(String str, long j, ICallback<LoginResult> iCallback) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a868f13", new Object[]{this, str, new Long(j), iCallback});
            return;
        }
        QrLoginTask2 qrLoginTask2 = this.mQrTask2;
        if (qrLoginTask2 != null) {
            qrLoginTask2.stop();
        }
        QrLoginTask2 qrLoginTask22 = new QrLoginTask2(str, j, iCallback);
        this.mQrTask2 = qrLoginTask22;
        qrLoginTask22.execute();
    }

    public void stopQrLogin() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("748ee8ed", new Object[]{this});
            return;
        }
        QrLoginTask2 qrLoginTask2 = this.mQrTask2;
        if (qrLoginTask2 != null) {
            qrLoginTask2.stop();
        }
    }
}
