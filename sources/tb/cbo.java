package tb;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.bridge.JSCallback;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cbo implements JSCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final JSCallback f16962a;
    public final WVCallBackContext b;

    static {
        t2o.a(967835657);
        t2o.a(985661544);
    }

    public cbo(JSCallback jSCallback) {
        this.f16962a = jSCallback;
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invoke(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5411b1b", new Object[]{this, obj});
            return;
        }
        JSCallback jSCallback = this.f16962a;
        if (jSCallback != null) {
            jSCallback.invoke(obj);
        }
        WVCallBackContext wVCallBackContext = this.b;
        if (wVCallBackContext != null) {
            wVCallBackContext.success(uyv.o(obj));
        }
    }

    @Override // com.taobao.weex.bridge.JSCallback
    public void invokeAndKeepAlive(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("119a8ac", new Object[]{this, obj});
        }
    }

    public cbo(WVCallBackContext wVCallBackContext) {
        this.b = wVCallBackContext;
    }

    public cbo(hjj hjjVar) {
    }
}
