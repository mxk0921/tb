package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.TrtcEngineImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class xju implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f31432a;
    public final /* synthetic */ String b;
    public final /* synthetic */ TrtcEngineImpl c;

    public xju(TrtcEngineImpl trtcEngineImpl, String str, String str2) {
        this.c = trtcEngineImpl;
        this.f31432a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            TrtcEngineImpl.W(this.c, this.f31432a, this.b, "", "");
        }
    }
}
