package tb;

import com.alibaba.marvel.Const;
import com.alibaba.marvel.java.OnCompleteListener;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class w6w implements OnCompleteListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ u6w f30490a;

    public w6w(u6w u6wVar) {
        this.f30490a = u6wVar;
    }

    public void onComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cbffcbf", new Object[]{this});
        } else if (this.f30490a.isPlaying() && u6w.M0(this.f30490a) != null) {
            u6w.M0(this.f30490a).seekTo(0L, Const.SeekFlag.SeekEnd);
            u6w.M0(this.f30490a).start();
        }
    }
}
