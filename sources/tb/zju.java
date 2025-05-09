package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.TrtcEngineImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class zju implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TrtcEngineImpl f32810a;

    public zju(TrtcEngineImpl trtcEngineImpl) {
        this.f32810a = trtcEngineImpl;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        tmu.f("TrtcEngine", "API - stopService");
        if (TrtcEngineImpl.d0(this.f32810a) != null) {
            TrtcEngineImpl.d0(this.f32810a).t();
        }
    }
}
