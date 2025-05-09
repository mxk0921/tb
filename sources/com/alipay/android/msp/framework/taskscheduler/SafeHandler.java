package com.alipay.android.msp.framework.taskscheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class SafeHandler extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public SafeHandler(Looper looper) {
        super(looper);
    }

    public static /* synthetic */ Object ipc$super(SafeHandler safeHandler, String str, Object... objArr) {
        if (str.hashCode() == 72182663) {
            super.dispatchMessage((Message) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/taskscheduler/SafeHandler");
    }

    @Override // android.os.Handler
    public void dispatchMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44d6b87", new Object[]{this, message});
            return;
        }
        try {
            super.dispatchMessage(message);
        } catch (Throwable th) {
            LogUtil.printExceptionStackTrace(th);
        }
    }

    public SafeHandler(Looper looper, Handler.Callback callback) {
        super(looper, callback);
    }

    public SafeHandler() {
    }

    public SafeHandler(Handler.Callback callback) {
        super(callback);
    }
}
