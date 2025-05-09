package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.c;
import com.taobao.trtc.impl.TrtcEngineImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yju implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TrtcConfig f32134a;
    public final /* synthetic */ TrtcEngineImpl b;

    public yju(TrtcEngineImpl trtcEngineImpl, TrtcConfig trtcConfig) {
        this.b = trtcEngineImpl;
        this.f32134a = trtcConfig;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.b.D1(this.f32134a);
        tmu.f("TrtcEngine", "API - startService, loadLibraryElapsed: " + c.f13894a + " ms");
        if (TrtcEngineImpl.d0(this.b) != null) {
            TrtcEngineImpl.d0(this.b).s(this.f32134a, true);
        }
    }
}
