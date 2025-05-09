package tb;

import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class fv1 implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f19548a;
    public final VideoInfo b;
    public final jqd c;
    public final jq6 d;
    public final xea f;
    public boolean g = true;
    public final jyw e = new jyw(this);

    static {
        t2o.a(295699046);
        t2o.a(806356161);
    }

    public fv1(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        jq6 jq6Var = new jq6();
        this.d = jq6Var;
        boolean z = true;
        this.f19548a = frameLayout;
        this.b = videoInfo;
        this.f = xeaVar;
        boolean z2 = false;
        if (xeaVar != null) {
            boolean Q = xeaVar.Q();
            wda wdaVar = xeaVar.l;
            if (!Q) {
                z2 = (!xeaVar.c() || !wdaVar.h) ? false : z;
            }
            jq6Var.d(wdaVar.e, wdaVar.f);
        }
        if (wda.x() || GLRenderType.KANDIAN_BIG_CARD == d() || GLRenderType.BIG_CARD == d()) {
            this.c = new kwp(xeaVar, z2, d());
        } else {
            this.c = new iwp(xeaVar, frameLayout.getContext(), z2);
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.e.removeCallbacksAndMessages(null);
        }
    }

    public GLRenderType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GLRenderType) ipChange.ipc$dispatch("2dd0aef6", new Object[]{this});
        }
        return GLRenderType.SMALL_CARD;
    }

    public static boolean e(VideoInfo videoInfo, LiveItem liveItem, xea xeaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2a4d283", new Object[]{videoInfo, liveItem, xeaVar})).booleanValue();
        }
        if (liveItem == null || videoInfo == null) {
            return false;
        }
        if (pfa.F(liveItem)) {
            hha.b("BaseGoodPlayer", "showProducts | not show for gray, id=" + liveItem.itemId + " goodIndx=" + liveItem.goodsIndex + "  name=" + liveItem.itemName);
            return false;
        } else if (pfa.P(videoInfo.liveId, liveItem)) {
            return true;
        } else {
            hha.b("BaseGoodPlayer", "showProducts| liveid check fail. mVideoInfo.liveId=" + videoInfo.liveId);
            return false;
        }
    }
}
