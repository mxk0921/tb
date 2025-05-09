package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.room.TaoLiveVideoActivity;
import com.taobao.uikit.actionbar.TBPublicMenu;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class m7t implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ TBPublicMenu f23828a;
    public final /* synthetic */ TaoLiveVideoActivity b;

    public m7t(TaoLiveVideoActivity taoLiveVideoActivity, TBPublicMenu tBPublicMenu) {
        this.b = taoLiveVideoActivity;
        this.f23828a = tBPublicMenu;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        TBPublicMenu tBPublicMenu = this.f23828a;
        if (tBPublicMenu != null) {
            tBPublicMenu.show();
            this.f23828a.addOnShareMenuClickListener(TaoLiveVideoActivity.D3(this.b));
            this.f23828a.setDefaultPublicMenuClickListener(TaoLiveVideoActivity.D3(this.b));
        }
    }
}
