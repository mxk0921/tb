package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.impl.TrtcEngineImpl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aku implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f15795a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ TrtcEngineImpl d;

    public aku(TrtcEngineImpl trtcEngineImpl, String str, String str2, String str3) {
        this.d = trtcEngineImpl;
        this.f15795a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else {
            TrtcEngineImpl.L(this.d, this.f15795a, this.b, this.c);
        }
    }
}
