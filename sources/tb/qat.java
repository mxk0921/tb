package tb;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import tb.kat;
import tb.o1j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class qat extends kat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(779092708);
    }

    public qat(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, kat.a aVar) {
        super(baseFrame, viewGroup, k0eVar, context, tBLiveDataModel, z, aVar);
    }

    public static /* synthetic */ Object ipc$super(qat qatVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/screen/screenstyle/TaoliveFullRoomScreen");
    }

    @Override // tb.kat
    public void c(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c54a8f8", new Object[]{this, ux9Var});
        } else if (this.f22518a != null && this.h != null) {
            up6.O0(this.g, ux9Var);
            ((o1j.a) this.h).f(false);
            VideoInfo e = cxg.e(this.f);
            if (this.d != null) {
                if (!gw0.e(this.e, ux9Var) || this.g) {
                    this.d.y();
                } else {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams((gw0.b() * 9) / 16, -1);
                    layoutParams.gravity = 17;
                    this.d.v(layoutParams);
                    if (e != null) {
                        ((o1j.a) this.h).d(e.backgroundImageURL);
                    }
                }
                BaseFrame baseFrame = this.f22518a;
                if (baseFrame instanceof FullScreenFrame) {
                    ((FullScreenFrame) baseFrame).setBackView(this.d.getContentView());
                }
            }
            b(this.g, ux9Var);
            ((o1j.a) this.h).e(this.f22518a);
        }
    }

    public kat d(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kat) ipChange.ipc$dispatch("a3d9b4ab", new Object[]{this, ux9Var});
        }
        BaseFrame a2 = ((o1j.a) this.h).a();
        this.f22518a = a2;
        if (a2 != null && (!(a2 instanceof HighlightFullScreenFrame) || a2.isLandscape() != this.g)) {
            this.b.deleteComponent(this.f22518a);
            this.f22518a.onDestroy();
            this.f22518a = null;
            this.c.removeAllViews();
        }
        if (this.f22518a == null) {
            HighlightFullScreenFrame highlightFullScreenFrame = new HighlightFullScreenFrame(this.e, this.g, this.f, ux9Var);
            this.f22518a = highlightFullScreenFrame;
            highlightFullScreenFrame.onCreateView2(this.c);
            this.b.addComponent(this.f22518a);
        }
        ((o1j.a) this.h).e(this.f22518a);
        return this;
    }
}
