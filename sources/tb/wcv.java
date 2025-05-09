package tb;

import com.alibaba.android.ultron.engine.logic.UltronWebViewJsEngine;
import com.alibaba.android.ultron.vfw.instance.UltronError;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class wcv implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UltronError f30617a;
    public final /* synthetic */ UltronWebViewJsEngine b;

    public wcv(UltronWebViewJsEngine ultronWebViewJsEngine, UltronError ultronError) {
        this.b = ultronWebViewJsEngine;
        this.f30617a = ultronError;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (UltronWebViewJsEngine.d(this.b) != null) {
            UltronWebViewJsEngine.d(this.b).a(this.f30617a);
        }
    }
}
