package tb;

import android.app.Activity;
import android.app.ActivityGroup;
import android.app.LocalActivityManager;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.Window;
import android.view.WindowManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.tao.flexbox.layoutmanager.player.videodecide.VideoControllerManager;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class h01 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Handler f20335a = new Handler(Looper.getMainLooper());
    public final Activity b;
    public final h9 c;
    public final hab<?, ?> d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ActivityInfo b;

        public b(ActivityInfo activityInfo) {
            this.b = activityInfo;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Activity a2;
            Window window;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (gxv.n(h01.this.a(), false) && (a2 = h01.this.a()) != null && (window = a2.getWindow()) != null) {
                window.setBackgroundDrawable(new ColorDrawable(gxv.d(this.b, h01.this.a())));
            }
        }
    }

    static {
        t2o.a(786432117);
        t2o.a(336592971);
    }

    public h01(Activity activity, h9 h9Var, hab<?, ?> habVar) {
        ckf.g(activity, "act");
        this.b = activity;
        this.c = h9Var;
        this.d = habVar;
    }

    public final Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("f9ec16a5", new Object[]{this});
        }
        return this.b;
    }

    public final h9 b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h9) ipChange.ipc$dispatch("813516e5", new Object[]{this});
        }
        return this.c;
    }

    public final hab<?, ?> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hab) ipChange.ipc$dispatch("471e845a", new Object[]{this});
        }
        return this.d;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ boolean b;
        public final /* synthetic */ Ref$IntRef c;

        public a(boolean z, Ref$IntRef ref$IntRef) {
            this.b = z;
            this.c = ref$IntRef;
        }

        @Override // java.lang.Runnable
        public final void run() {
            e9 e9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            h9 b = h01.this.b();
            if (b != null && (e9Var = b.f20479a) != null && e9Var.E() && this.b) {
                Window window = h01.this.a().getWindow();
                ckf.f(window, pg1.ATOM_EXT_window);
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.height = -1;
                attributes.width = this.c.element;
                window.setAttributes(attributes);
                window.setGravity(8388629);
                window.addFlags(32);
            }
            hab<?, ?> c = h01.this.c();
            if (c != null) {
                c.changeGravity(null);
            }
            hab<?, ?> c2 = h01.this.c();
            if (c2 != null) {
                c2.changeSize(-1.0f, -1.0f, false);
            }
        }
    }

    public void d(int i, Configuration configuration) {
        LocalActivityManager localActivityManager;
        Activity currentActivity;
        Resources resources;
        DisplayMetrics displayMetrics;
        LocalActivityManager localActivityManager2;
        Activity currentActivity2;
        e9 e9Var;
        e9 e9Var2;
        LocalActivityManager localActivityManager3;
        Activity currentActivity3;
        Resources resources2;
        DisplayMetrics displayMetrics2;
        LocalActivityManager localActivityManager4;
        Activity currentActivity4;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ad0d95", new Object[]{this, new Integer(i), configuration});
            return;
        }
        ckf.g(configuration, VideoControllerManager.ARRAY_KEY_CONFIGURATION);
        Activity activity = this.b;
        boolean z = (activity instanceof ActivityGroup) || ckf.b(activity.getClass().getName(), "com.taobao.android.tbabilitykit.pop.StdPopContainerActivity");
        ActivityInfo activityInfo = null;
        if (i == 2) {
            Activity activity2 = this.b;
            if (!(activity2 == null || (window = activity2.getWindow()) == null)) {
                window.setBackgroundDrawable(new ColorDrawable(0));
            }
            gxv.n(this.b, true);
            Ref$IntRef ref$IntRef = new Ref$IntRef();
            ref$IntRef.element = uwo.a(this.b, configuration.screenWidthDp * 1.0f);
            if (gxv.m(this.b, false)) {
                ref$IntRef.element /= 2;
            }
            int B = TBAutoSizeConfig.x().B(this.b);
            Activity activity3 = this.b;
            if (!(activity3 instanceof ActivityGroup)) {
                activity3 = null;
            }
            ActivityGroup activityGroup = (ActivityGroup) activity3;
            Window window2 = (activityGroup == null || (localActivityManager4 = activityGroup.getLocalActivityManager()) == null || (currentActivity4 = localActivityManager4.getCurrentActivity()) == null) ? null : currentActivity4.getWindow();
            WindowManager.LayoutParams attributes = window2 != null ? window2.getAttributes() : null;
            if (attributes != null) {
                attributes.width = ref$IntRef.element;
            }
            if (attributes != null) {
                attributes.height = B;
            }
            if (window2 != null) {
                window2.setAttributes(attributes);
            }
            if (abl.E()) {
                Activity activity4 = this.b;
                if (!(activity4 instanceof ActivityGroup)) {
                    activity4 = null;
                }
                ActivityGroup activityGroup2 = (ActivityGroup) activity4;
                if (!(activityGroup2 == null || (localActivityManager3 = activityGroup2.getLocalActivityManager()) == null || (currentActivity3 = localActivityManager3.getCurrentActivity()) == null || (resources2 = currentActivity3.getResources()) == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null)) {
                    displayMetrics2.widthPixels = ref$IntRef.element;
                }
            }
            if (abl.N()) {
                long O = abl.O();
                if (qp0.b() == 2) {
                    O += 50;
                }
                this.f20335a.postDelayed(new a(z, ref$IntRef), O);
            } else {
                h9 h9Var = this.c;
                if (h9Var != null && (e9Var2 = h9Var.f20479a) != null && e9Var2.E() && z) {
                    Window window3 = this.b.getWindow();
                    ckf.f(window3, pg1.ATOM_EXT_window);
                    WindowManager.LayoutParams attributes2 = window3.getAttributes();
                    attributes2.height = -1;
                    attributes2.width = ref$IntRef.element;
                    window3.setAttributes(attributes2);
                    window3.setGravity(8388629);
                    window3.addFlags(32);
                }
                hab<?, ?> habVar = this.d;
                if (habVar != null) {
                    habVar.changeGravity(null);
                }
                hab<?, ?> habVar2 = this.d;
                if (habVar2 != null) {
                    habVar2.changeSize(-1.0f, -1.0f, false);
                }
            }
            iih.INSTANCE.a("stdPopTag", "ORIENTATION_LANDSCAPE width = " + ref$IntRef.element + " height = " + B);
        } else if (i == 1 && z) {
            int a2 = uwo.a(this.b, configuration.screenWidthDp * 1.0f);
            h9 h9Var2 = this.c;
            if (h9Var2 != null && (e9Var = h9Var2.f20479a) != null && e9Var.E() && z) {
                Window window4 = this.b.getWindow();
                ckf.f(window4, pg1.ATOM_EXT_window);
                WindowManager.LayoutParams attributes3 = window4.getAttributes();
                attributes3.height = -1;
                attributes3.width = a2;
                window4.setAttributes(attributes3);
                window4.setGravity(81);
            }
            int B2 = TBAutoSizeConfig.x().B(this.b);
            Activity activity5 = this.b;
            if (!(activity5 instanceof ActivityGroup)) {
                activity5 = null;
            }
            ActivityGroup activityGroup3 = (ActivityGroup) activity5;
            Window window5 = (activityGroup3 == null || (localActivityManager2 = activityGroup3.getLocalActivityManager()) == null || (currentActivity2 = localActivityManager2.getCurrentActivity()) == null) ? null : currentActivity2.getWindow();
            WindowManager.LayoutParams attributes4 = window5 != null ? window5.getAttributes() : null;
            if (attributes4 != null) {
                attributes4.width = a2;
            }
            if (abl.E()) {
                Activity activity6 = this.b;
                if (!(activity6 instanceof ActivityGroup)) {
                    activity6 = null;
                }
                ActivityGroup activityGroup4 = (ActivityGroup) activity6;
                if (!(activityGroup4 == null || (localActivityManager = activityGroup4.getLocalActivityManager()) == null || (currentActivity = localActivityManager.getCurrentActivity()) == null || (resources = currentActivity.getResources()) == null || (displayMetrics = resources.getDisplayMetrics()) == null)) {
                    displayMetrics.widthPixels = a2;
                }
            }
            if (attributes4 != null) {
                attributes4.height = B2;
            }
            if (window5 != null) {
                window5.setAttributes(attributes4);
            }
            hab<?, ?> habVar3 = this.d;
            if (habVar3 != null) {
                habVar3.changeGravity(null);
            }
            hab<?, ?> habVar4 = this.d;
            if (habVar4 != null) {
                habVar4.changeSize(-1.0f, -1.0f, false);
            }
            h9 h9Var3 = this.c;
            if (!(h9Var3 instanceof a9)) {
                h9Var3 = null;
            }
            a9 a9Var = (a9) h9Var3;
            if (a9Var != null) {
                activityInfo = a9Var.f();
            }
            if (!gxv.k(activityInfo, this.b)) {
                this.f20335a.postDelayed(new b(activityInfo), 20L);
            }
            iih.INSTANCE.a("stdPopTag", "ORIENTATION_PORTRAIT width = " + a2 + " height = " + B2);
        }
    }
}
