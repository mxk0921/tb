package tb;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.PositionInfo;
import com.taobao.android.editionswitcher.homepage.CTaoEditionSwitchView;
import com.taobao.android.editionswitcher.homepage.EditionSwitchView;
import com.taobao.android.editionswitcher.homepage.HTaoEditionSwitchView;
import com.taobao.android.editionswitcher.homepage.OldEditionSwitchView;
import com.taobao.android.editionswitcher.request.HomeLocationResult;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.util.DensityUtil;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.component.unify.Dialog.TBMaterialDialog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v78 implements xad {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public View f29828a;
    public View b;
    public final TBMaterialDialog c;
    public boolean d = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ozb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310393e8", new Object[]{this});
            } else {
                v78.a(v78.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements DialogInterface.OnDismissListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f29830a;

        public b(Activity activity) {
            this.f29830a = activity;
        }

        @Override // android.content.DialogInterface.OnDismissListener
        public void onDismiss(DialogInterface dialogInterface) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
                return;
            }
            View customView = v78.b(v78.this).getCustomView();
            if (customView instanceof EditionSwitchView) {
                EditionSwitchView editionSwitchView = (EditionSwitchView) customView;
                editionSwitchView.traceCancelEvent();
                editionSwitchView.onDismiss();
            }
            if (v78.c(v78.this) != null) {
                wcm.a(v78.c(v78.this)).a(v78.this);
            }
            v78.d(v78.this, this.f29830a);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ PositionInfo f29831a;
        public final /* synthetic */ View b;
        public final /* synthetic */ Activity c;
        public final /* synthetic */ Animation d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (c.this.b.getVisibility() != 0) {
                } else {
                    if (c.this.b.isShown()) {
                        c cVar = c.this;
                        cVar.b.startAnimation(cVar.d);
                        return;
                    }
                    c.this.b.setVisibility(8);
                }
            }
        }

        public c(PositionInfo positionInfo, View view, Activity activity, Animation animation) {
            this.f29831a = positionInfo;
            this.b = view;
            this.c = activity;
            this.d = animation;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                new Handler(this.c.getMainLooper()).postDelayed(new a(), 3000L);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
                return;
            }
            if (TextUtils.equals(o78.CHINA_MAINLAND, this.f29831a.countryCode)) {
                str = this.f29831a.editionCode;
            } else {
                str = "global";
            }
            tza.g(str, true);
            this.b.setVisibility(0);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f29833a;

        public d(View view) {
            this.f29833a = view;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
            } else {
                this.f29833a.setVisibility(8);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8f2883e7", new Object[]{this, animation});
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2d146c4", new Object[]{this, animation});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f29834a;
        public final /* synthetic */ Animation b;

        public e(v78 v78Var, View view, Animation animation) {
            this.f29834a = view;
            this.b = animation;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f29834a.startAnimation(this.b);
            }
        }
    }

    static {
        t2o.a(456130672);
    }

    public v78(Activity activity, int i, HomeLocationResult homeLocationResult) {
        this.c = e(activity, i, homeLocationResult);
    }

    public static /* synthetic */ void a(v78 v78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e10f3953", new Object[]{v78Var});
        } else {
            v78Var.f();
        }
    }

    public static /* synthetic */ TBMaterialDialog b(v78 v78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMaterialDialog) ipChange.ipc$dispatch("72e7b792", new Object[]{v78Var});
        }
        return v78Var.c;
    }

    public static /* synthetic */ String c(v78 v78Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5e1e93af", new Object[]{v78Var});
        }
        v78Var.getClass();
        return null;
    }

    public static /* synthetic */ boolean d(v78 v78Var, Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("976e0e46", new Object[]{v78Var, activity})).booleanValue();
        }
        return v78Var.j(activity);
    }

    public final TBMaterialDialog e(Activity activity, int i, HomeLocationResult homeLocationResult) {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBMaterialDialog) ipChange.ipc$dispatch("65bf5067", new Object[]{this, activity, new Integer(i), homeLocationResult});
        }
        if (activity == null) {
            return null;
        }
        try {
            a aVar = new a();
            if (o78.s(activity)) {
                if (o78.u(activity)) {
                    view = new OldEditionSwitchView(activity, i, aVar);
                } else {
                    if (!o78.v(activity) && ((i != 0 || o78.l(activity) || !o78.x(activity)) && (i != 1 || !o78.x(activity)))) {
                        view = new HTaoEditionSwitchView(activity, i, aVar);
                    }
                    view = new CTaoEditionSwitchView(activity, i, aVar);
                }
            } else if (o78.w(activity)) {
                view = new CTaoEditionSwitchView(activity, i, aVar);
            } else if (o78.t(activity)) {
                view = new OldEditionSwitchView(activity, i, aVar);
            } else {
                view = new HTaoEditionSwitchView(activity, i, aVar);
            }
            TBMaterialDialog build = new TBMaterialDialog.Builder(view.getContext()).customView(view, false).cardDialog(true).build();
            g(build);
            build.setOnDismissListener(new b(activity));
            return build;
        } catch (Throwable th) {
            TLog.loge("EditionSwitcherPopOperation", th.toString());
            return null;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dfa707f9", new Object[]{this});
            return;
        }
        TBMaterialDialog tBMaterialDialog = this.c;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.setOnDismissListener(null);
            this.c.dismiss();
        }
    }

    public final void g(TBMaterialDialog tBMaterialDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f90f7d23", new Object[]{this, tBMaterialDialog});
        } else {
            o78.w(tBMaterialDialog.getContext());
        }
    }

    public final void h(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6230d437", new Object[]{this, activity});
            return;
        }
        if (this.b == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_base);
            ((FrameLayout.LayoutParams) viewStub.getLayoutParams()).topMargin = DensityUtil.dip2px(Globals.getApplication(), 40.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            this.b = viewStub.inflate();
        }
        View view = this.f29828a;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void i(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6dab5ad", new Object[]{this, activity});
            return;
        }
        if (this.f29828a == null) {
            ViewStub viewStub = (ViewStub) activity.findViewById(R.id.home_edition_tips_old);
            ((FrameLayout.LayoutParams) viewStub.getLayoutParams()).topMargin = DensityUtil.dip2px(Globals.getApplication(), 45.0f) + SystemBarDecorator.getStatusBarHeight(Globals.getApplication());
            this.f29828a = viewStub.inflate();
        }
        View view = this.b;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    @Override // tb.xad
    public boolean isShown() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d57d5b12", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    @Override // tb.xad
    public long l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ea8707e9", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.xad
    public String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5f996fc7", new Object[]{this});
        }
        return "normal";
    }

    @Override // tb.xad
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        this.d = true;
        TBMaterialDialog tBMaterialDialog = this.c;
        if (tBMaterialDialog != null) {
            tBMaterialDialog.show();
            View customView = this.c.getCustomView();
            if (customView instanceof EditionSwitchView) {
                ((EditionSwitchView) customView).traceShowEvent();
                return;
            }
            return;
        }
        f();
    }

    public final boolean j(Activity activity) {
        String str;
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b1cb1837", new Object[]{this, activity})).booleanValue();
        }
        if (activity == null) {
            return false;
        }
        PositionInfo i = o78.i(activity);
        if (TextUtils.equals(o78.CHINA_MAINLAND, i.countryCode)) {
            str = i.editionCode;
        } else {
            str = "global";
        }
        if (tza.e(str) || ((!o78.u(activity) && o78.s(activity)) || o78.p(activity))) {
            return false;
        }
        if (o78.t(activity)) {
            i(activity);
            view = this.f29828a;
            ((TextView) view.findViewById(R.id.home_edition_tips_content)).setText("您可以随时通过这里切回标准版手淘");
        } else if (!o78.u(activity) || !o78.s(activity)) {
            h(activity);
            view = this.b;
        } else {
            view = null;
        }
        if (view == null) {
            return false;
        }
        Animation loadAnimation = AnimationUtils.loadAnimation(activity, R.anim.home_common_fade_in);
        Animation loadAnimation2 = AnimationUtils.loadAnimation(activity, R.anim.home_common_fade_out);
        loadAnimation.setAnimationListener(new c(i, view, activity, loadAnimation2));
        loadAnimation2.setAnimationListener(new d(view));
        ViewProxy.setOnClickListener(view, new e(this, view, loadAnimation2));
        view.startAnimation(loadAnimation);
        return true;
    }
}
