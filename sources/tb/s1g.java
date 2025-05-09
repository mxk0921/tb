package tb;

import android.os.Message;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateView.impl.constans.GLRenderType;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class s1g extends fv1 implements xgc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public LiveItem h;

    static {
        t2o.a(295699126);
        t2o.a(295699049);
    }

    public s1g(FrameLayout frameLayout, VideoInfo videoInfo, xea xeaVar) {
        super(frameLayout, videoInfo, xeaVar);
    }

    public static /* synthetic */ Object ipc$super(s1g s1gVar, String str, Object... objArr) {
        if (str.hashCode() == -1983604863) {
            super.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/good/showcase/bigcard/KandianBigCard");
    }

    @Override // tb.xgc
    public void a(LiveItem liveItem) {
        LiveItem liveItem2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d66a26de", new Object[]{this, liveItem});
        } else if (liveItem != null && (liveItem2 = this.h) != null && liveItem.itemId == liveItem2.itemId) {
            hha.b("BaseBigCard", "updateItem | update big card.");
            h(liveItem);
        }
    }

    @Override // tb.fv1
    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        super.b();
        this.f.j().U(this);
        this.c.a(this.f19548a);
        FrameLayout frameLayout = this.f19548a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.h = null;
    }

    @Override // tb.xgc
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("431c2ec8", new Object[]{this});
        } else if (this.h != null) {
            hha.b("BaseBigCard", "updateItem | followChange.");
            h(this.h);
        }
    }

    @Override // tb.fv1
    public GLRenderType d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GLRenderType) ipChange.ipc$dispatch("2dd0aef6", new Object[]{this});
        }
        return GLRenderType.KANDIAN_BIG_CARD;
    }

    public void f(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26cce372", new Object[]{this, liveItem});
            return;
        }
        this.f.j().r(this);
        if (!fv1.e(this.b, liveItem, null)) {
            hha.b("BaseBigCard", "init | singleGoodShowCheck failed.");
        } else {
            h(liveItem);
        }
    }

    public final void g(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b99af66", new Object[]{this, liveItem});
            return;
        }
        jq6.n(liveItem);
        this.d.k(this.f, liveItem, this.b, "");
        jq6.c(liveItem, pfa.m());
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        }
    }

    public void h(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44748215", new Object[]{this, liveItem});
            return;
        }
        this.h = liveItem;
        g(liveItem);
        this.f19548a.setVisibility(0);
        long currentTimeMillis = System.currentTimeMillis();
        this.c.b(this.f19548a, liveItem);
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        hha.d("BaseBigCard", "render | time=" + currentTimeMillis2);
        dvp.d(this.f, liveItem, this.b, d(), null);
    }
}
