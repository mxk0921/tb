package com.taobao.weex.ui;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class WXRenderHandler extends Handler {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(985661655);
    }

    public WXRenderHandler() {
        super(Looper.getMainLooper());
    }

    public static /* synthetic */ Object ipc$super(WXRenderHandler wXRenderHandler, String str, Object... objArr) {
        if (str.hashCode() == 673877017) {
            super.handleMessage((Message) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/weex/ui/WXRenderHandler");
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else {
            super.handleMessage(message);
        }
    }

    public final boolean post(String str, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8de80333", new Object[]{this, str, runnable})).booleanValue();
        }
        Message obtain = Message.obtain(this, runnable);
        obtain.what = str.hashCode();
        return sendMessageDelayed(obtain, 0L);
    }
}
