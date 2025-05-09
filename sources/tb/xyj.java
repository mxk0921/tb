package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.recommend3.newface.gateway.action.NewFaceDataProcessAction;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xyj implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Throwable f31697a;
    public final /* synthetic */ NewFaceDataProcessAction b;

    public xyj(NewFaceDataProcessAction newFaceDataProcessAction, Throwable th) {
        this.b = newFaceDataProcessAction;
        this.f31697a = th;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        throw this.f31697a;
    }
}
