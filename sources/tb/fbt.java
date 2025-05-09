package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.screen.frame.FullScreenFrame;
import com.taobao.taolive.movehighlight.screen.frame.HighlightFullScreenFrame;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.kat;
import tb.o1j;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fbt extends kat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements PlayerController2.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ kat.a f19175a;

        public a(fbt fbtVar, kat.a aVar) {
            this.f19175a = aVar;
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.s
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e0eee41", new Object[]{this})).booleanValue();
            }
            ((o1j.a) this.f19175a).b();
            return true;
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.s
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f78e0fd9", new Object[]{this})).booleanValue();
            }
            ((o1j.a) this.f19175a).c();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FrameLayout.LayoutParams f19176a;

        public b(FrameLayout.LayoutParams layoutParams) {
            this.f19176a = layoutParams;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                fbt.this.d.v(this.f19176a);
            }
        }
    }

    static {
        t2o.a(779092709);
    }

    public fbt(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, kat.a aVar) {
        super(baseFrame, viewGroup, k0eVar, context, tBLiveDataModel, z, aVar);
    }

    public static /* synthetic */ Object ipc$super(fbt fbtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/screen/screenstyle/TaoliveHalfRoomScreen");
    }

    @Override // tb.kat
    public void c(ux9 ux9Var) {
        kat.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c54a8f8", new Object[]{this, ux9Var});
        } else if (this.f22518a != null && (aVar = this.h) != null) {
            ((o1j.a) aVar).f(true);
            if (qvs.R0() && this.d != null) {
                int a2 = a();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2);
                int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                VideoInfo e = cxg.e(this.f);
                if (e != null) {
                    e.positionForVideo = "0.2";
                    if (!TextUtils.isEmpty("0.2")) {
                        int c = (int) (gw0.c() * zqq.e(e.positionForVideo));
                        if (a2 + c + up6.R(ux9Var) <= gw0.c()) {
                            dimensionPixelSize = c;
                        }
                    }
                }
                layoutParams.topMargin = dimensionPixelSize;
                this.c.post(new b(layoutParams));
                BaseFrame baseFrame = this.f22518a;
                if (baseFrame instanceof FullScreenFrame) {
                    ((FullScreenFrame) baseFrame).setBackView(this.d.getContentView());
                }
                if (e != null) {
                    ((o1j.a) this.h).d(e.backgroundImageURL);
                }
            } else if (this.d != null) {
                this.d.w(a());
            }
            b(false, ux9Var);
            ((o1j.a) this.h).e(this.f22518a);
        }
    }

    public fbt d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbt) ipChange.ipc$dispatch("f7d4f1c", new Object[]{this});
        }
        k0e k0eVar = this.d;
        if (k0eVar != null) {
            PlayerController2 g = k0eVar.g();
            if (qvs.i() && g != null) {
                g.hideController();
            }
        }
        return this;
    }

    public fbt e(kat.a aVar) {
        PlayerController2 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbt) ipChange.ipc$dispatch("b02b6ae5", new Object[]{this, aVar});
        }
        k0e k0eVar = this.d;
        if (!(k0eVar == null || (g = k0eVar.g()) == null)) {
            g.setToggleScreenListener(new a(this, aVar));
        }
        return this;
    }

    public fbt f(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fbt) ipChange.ipc$dispatch("411aaa09", new Object[]{this, ux9Var});
        }
        if (qvs.R0()) {
            BaseFrame a2 = ((o1j.a) this.h).a();
            this.f22518a = a2;
            if (a2 != null && (!(a2 instanceof HighlightFullScreenFrame) || a2.isLandscape())) {
                this.b.deleteComponent(this.f22518a);
                this.f22518a.onDestroy();
                this.f22518a = null;
                this.c.removeAllViews();
            }
            if (this.f22518a == null) {
                HighlightFullScreenFrame highlightFullScreenFrame = new HighlightFullScreenFrame(this.e, false, this.f, ux9Var);
                this.f22518a = highlightFullScreenFrame;
                highlightFullScreenFrame.onCreateView2(this.c);
                this.b.addComponent(this.f22518a);
            }
            ((o1j.a) this.h).e(this.f22518a);
        }
        return this;
    }
}
