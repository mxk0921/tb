package tb;

import com.alibaba.android.nextrpc.streamv2.request.FinishErrorType;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class fj9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final boolean f19339a;
    public final FinishErrorType b;

    public fj9(boolean z, FinishErrorType finishErrorType, a3o a3oVar) {
        ckf.g(finishErrorType, "errorType");
        ckf.g(a3oVar, "request");
        this.f19339a = z;
        this.b = finishErrorType;
    }

    public final FinishErrorType a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FinishErrorType) ipChange.ipc$dispatch("cc71078", new Object[]{this});
        }
        return this.b;
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6049a784", new Object[]{this})).booleanValue();
        }
        return this.f19339a;
    }
}
