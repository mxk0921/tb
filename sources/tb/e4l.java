package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class e4l implements u3d {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final w3d f18274a;

    static {
        t2o.a(779093049);
        t2o.a(806355744);
    }

    public e4l(w3d w3dVar) {
        this.f18274a = w3dVar;
    }

    @Override // tb.u3d
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff0df7ac", new Object[]{this});
            return;
        }
        w3d w3dVar = this.f18274a;
        if (w3dVar != null) {
            w3dVar.retryVideo();
        }
    }
}
