package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.playercontrol.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ofi implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ a f25355a;

    public ofi(a aVar) {
        this.f25355a = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (a.b(this.f25355a) != null && a.b(this.f25355a).getVideo() != null && a.b(this.f25355a).getVideo().getVideoState() == 1) {
            a.b(this.f25355a).getVideo().pauseVideo();
        } else if (a.b(this.f25355a) != null && a.b(this.f25355a).getVideo() != null && a.b(this.f25355a).getVideo().getVideoState() == 2) {
            a.b(this.f25355a).getVideo().playVideo();
        } else if (a.b(this.f25355a) != null && a.b(this.f25355a).getVideo() != null && a.b(this.f25355a).getVideo().getVideoState() != 2) {
            a.b(this.f25355a).getVideo().c();
        }
    }
}
