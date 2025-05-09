package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.jscore.TNodeJSCore;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class rfs implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f27348a;
    public final /* synthetic */ TNodeJSCore b;

    public rfs(TNodeJSCore tNodeJSCore, String str) {
        this.b = tNodeJSCore;
        this.f27348a = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            igs.a("execute JS");
            TNodeJSCore.f(this.b).executeJS(this.f27348a, null);
            igs.c();
        } catch (Throwable th) {
            igs.c();
            th.printStackTrace();
        }
    }
}
