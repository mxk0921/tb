package tb;

import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ib5 implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FrameLayout f21205a;
    public final /* synthetic */ View b;
    public final /* synthetic */ so c;
    public final /* synthetic */ jb5 d;

    public ib5(jb5 jb5Var, FrameLayout frameLayout, View view, so soVar) {
        this.f21205a = frameLayout;
        this.b = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        this.f21205a.addView(this.b, new FrameLayout.LayoutParams(-1, -1));
        this.b.setId(R.id.aura_video_player_view_id);
        throw null;
    }
}
