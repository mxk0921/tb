package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.TaoLiveVideoActivity;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class l7t implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TaoLiveVideoActivity f23161a;

    public l7t(TaoLiveVideoActivity taoLiveVideoActivity) {
        this.f23161a = taoLiveVideoActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (!TaoLiveVideoActivity.z3(this.f23161a)) {
            TaoLiveVideoActivity.B3(this.f23161a).r();
        }
    }
}
