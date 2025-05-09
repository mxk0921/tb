package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import tb.lat;
import tb.t4l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ebt extends lat {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements PlayerController2.s {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ lat.a f18462a;

        public a(lat.a aVar) {
            this.f18462a = aVar;
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.s
        public boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5e0eee41", new Object[]{this})).booleanValue();
            }
            ux9 ux9Var = ebt.this.i;
            if (ux9Var != null && (ux9Var instanceof cdr) && ((cdr) ux9Var).A() != null && ((cdr) ebt.this.i).A().abilityCompontent != null && !((ibt) ((cdr) ebt.this.i).A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate)) {
                return true;
            }
            ((t4l.a) this.f18462a).b();
            return true;
        }

        @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.s
        public boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f78e0fd9", new Object[]{this})).booleanValue();
            }
            ux9 ux9Var = ebt.this.i;
            if (ux9Var != null && (ux9Var instanceof cdr) && ((cdr) ux9Var).A() != null && ((cdr) ebt.this.i).A().abilityCompontent != null && !((ibt) ((cdr) ebt.this.i).A().abilityCompontent).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Horizontal_live_rotate)) {
                return true;
            }
            ((t4l.a) this.f18462a).c();
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PlayerController2 g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            k0e k0eVar = ebt.this.d;
            if (k0eVar != null && (g = k0eVar.g()) != null) {
                g.setDefaultControllerHolder(ebt.this.i);
                if (up6.t0(ebt.this.i)) {
                    g.showController(4);
                } else {
                    g.showController(3);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class c implements uvd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ViewGroup f18464a;
        public final /* synthetic */ int b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ Drawable d;

        public c(ViewGroup viewGroup, int i, Context context, Drawable drawable) {
            this.f18464a = viewGroup;
            this.b = i;
            this.c = context;
            this.d = drawable;
        }

        @Override // tb.uvd
        public void onError(Object obj) {
            Drawable drawable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
                return;
            }
            if (this.b != 0) {
                drawable = this.c.getResources().getDrawable(this.b);
            } else {
                drawable = this.d;
            }
            ebt.g(this.f18464a, drawable);
        }

        @Override // tb.uvd
        public void onSuccess(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
            ViewGroup viewGroup = this.f18464a;
            if (viewGroup != null) {
                ebt.g(viewGroup, bitmapDrawable);
            }
        }
    }

    static {
        t2o.a(779092921);
    }

    public ebt(BaseFrame baseFrame, ViewGroup viewGroup, k0e k0eVar, Context context, TBLiveDataModel tBLiveDataModel, boolean z, ux9 ux9Var, lat.a aVar) {
        super(baseFrame, viewGroup, k0eVar, context, tBLiveDataModel, z, ux9Var, aVar);
    }

    public static /* synthetic */ void g(ViewGroup viewGroup, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b50dfeda", new Object[]{viewGroup, drawable});
        } else {
            k(viewGroup, drawable);
        }
    }

    public static /* synthetic */ Object ipc$super(ebt ebtVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/controller2/player/screenstyle/TaoliveHalfRoomScreen");
    }

    public static void k(ViewGroup viewGroup, Drawable drawable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5704d22f", new Object[]{viewGroup, drawable});
        } else if (viewGroup != null && drawable != null) {
            viewGroup.setBackground(drawable);
        }
    }

    public static void l(Context context, ViewGroup viewGroup, String str, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b33e3ad", new Object[]{context, viewGroup, str, new Integer(i)});
        } else if (context != null) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.taolive_slice_scroll_common);
            k(viewGroup, drawable);
            if (!TextUtils.isEmpty(str)) {
                yvd n = v2s.o().n();
                n.load(str + pvs.p2()).b(new c(viewGroup, i, context, drawable)).a();
            }
        }
    }

    public static void o(View view, FrameLayout.LayoutParams layoutParams, String str) {
        int i;
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c1af1ed", new Object[]{view, layoutParams, str});
        } else if (view != null) {
            if (layoutParams != null) {
                i2 = layoutParams.topMargin;
                i = layoutParams.height;
            } else {
                i = 0;
                i2 = 0;
            }
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i);
            layoutParams2.topMargin = 0;
            layoutParams2.height = i + i2;
            if (view instanceof ViewGroup) {
                view.setPadding(0, i2, 0, 0);
                view.setLayoutParams(layoutParams2);
                l(view.getContext(), (ViewGroup) view, str, 0);
            }
        }
    }

    @Override // tb.lat
    public void e() {
        lat.a aVar;
        final String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46110dd0", new Object[]{this});
        } else if (this.f23215a != null && (aVar = this.h) != null) {
            ((t4l.a) aVar).f(true);
            if (pvs.W2() && this.d != null) {
                int a2 = a();
                final FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, a2);
                int dimensionPixelSize = this.e.getResources().getDimensionPixelSize(R.dimen.taolive_video_top_margin);
                VideoInfo e = cxg.e(this.f);
                if (e != null) {
                    e.positionForVideo = "0.2";
                    if (!TextUtils.isEmpty("0.2")) {
                        int g = (int) (hw0.g() * yqq.j(e.positionForVideo));
                        if (a2 + g + up6.R(this.i) <= hw0.g()) {
                            dimensionPixelSize = g;
                        }
                    }
                }
                layoutParams.topMargin = dimensionPixelSize;
                if (e != null) {
                    str = e.backgroundImageURL;
                } else {
                    str = null;
                }
                z1i.a().c(new Runnable() { // from class: tb.dbt
                    @Override // java.lang.Runnable
                    public final void run() {
                        ebt.this.j(layoutParams, str);
                    }
                });
                BaseFrame baseFrame = this.f23215a;
                if (baseFrame instanceof m8c) {
                    ((m8c) baseFrame).setBackView(this.d.getContentView());
                }
                if (!TextUtils.isEmpty(str)) {
                    ((t4l.a) this.h).d(str);
                }
            } else if (this.d != null) {
                this.d.w(a());
            }
            c(false);
            ((t4l.a) this.h).e(this.f23215a);
        }
    }

    public ebt h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebt) ipChange.ipc$dispatch("ba2a4856", new Object[]{this});
        }
        k0e k0eVar = this.d;
        if (k0eVar != null) {
            PlayerController2 g = k0eVar.g();
            if (pvs.d() && g != null) {
                g.hideController();
            }
        }
        return this;
    }

    public ebt i(lat.a aVar) {
        PlayerController2 g;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebt) ipChange.ipc$dispatch("958beebd", new Object[]{this, aVar});
        }
        k0e k0eVar = this.d;
        if (!(k0eVar == null || (g = k0eVar.g()) == null)) {
            g.setToggleScreenListener(new a(aVar));
        }
        return this;
    }

    public final /* synthetic */ void j(FrameLayout.LayoutParams layoutParams, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e56e1a4", new Object[]{this, layoutParams, str});
        } else {
            this.d.z(layoutParams, str);
        }
    }

    public ebt m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebt) ipChange.ipc$dispatch("c2a11425", new Object[]{this});
        }
        BaseFrame a2 = ((t4l.a) this.h).a();
        this.f23215a = a2;
        if (a2 != null && (!d9m.l().isInstanceOfFullScreenLiveFrame2(this.f23215a) || this.f23215a.isLandscape())) {
            this.b.deleteComponent(this.f23215a);
            this.f23215a.onDestroy();
            this.f23215a = null;
            this.c.removeAllViews();
        }
        if (this.f23215a == null) {
            this.i.c = false;
            BaseFrame createFullScreenLiveFrame2 = d9m.l().createFullScreenLiveFrame2(this.e, false, this.f, this.i);
            this.f23215a = createFullScreenLiveFrame2;
            if (createFullScreenLiveFrame2 != null) {
                createFullScreenLiveFrame2.onCreateView2(this.c);
                this.b.addComponent(this.f23215a);
            }
        }
        ((t4l.a) this.h).e(this.f23215a);
        new Handler(Looper.getMainLooper()).post(new b());
        return this;
    }

    public ebt n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebt) ipChange.ipc$dispatch("7349eb8a", new Object[]{this});
        }
        if (pvs.W2()) {
            BaseFrame a2 = ((t4l.a) this.h).a();
            this.f23215a = a2;
            if (a2 != null && (!d9m.l().isInstanceOfFullScreenReplayFrame2(this.f23215a) || this.f23215a.isLandscape())) {
                this.b.deleteComponent(this.f23215a);
                this.f23215a.onDestroy();
                this.f23215a = null;
                this.c.removeAllViews();
            }
            if (this.f23215a == null) {
                BaseFrame createFullScreenReplayFrame2 = d9m.l().createFullScreenReplayFrame2(this.e, false, this.f, this.i);
                this.f23215a = createFullScreenReplayFrame2;
                if (createFullScreenReplayFrame2 != null) {
                    createFullScreenReplayFrame2.onCreateView2(this.c);
                    this.b.addComponent(this.f23215a);
                }
            }
            ((t4l.a) this.h).e(this.f23215a);
        }
        return this;
    }
}
