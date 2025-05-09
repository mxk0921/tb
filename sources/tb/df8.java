package tb;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.ui.view.NewDetailMaskFrameLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class df8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f17772a;
    public NewDetailMaskFrameLayout b;
    public boolean c;
    public cba e;
    public boolean d = false;
    public final NewDetailMaskFrameLayout.j f = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends NewDetailMaskFrameLayout.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/business/enter/EnterOptHandler$1");
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.j
        public String d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d0a42b93", new Object[]{this});
            }
            return "delay";
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.j
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9425d337", new Object[]{this});
                return;
            }
            if (df8.a(df8.this) != null) {
                df8.a(df8.this).m0(true);
            }
            sjr.g().d("com.taobao.taolive.room.ent.opt.animation.end");
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends NewDetailMaskFrameLayout.k {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(df8 df8Var) {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1846830367) {
                super.c((String) objArr[0], (String) objArr[1], (Throwable) objArr[2]);
                return null;
            } else if (hashCode == 1973968276) {
                super.b((String) objArr[0], (String) objArr[1]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/business/enter/EnterOptHandler$2");
            }
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.k
        public void b(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75a85d94", new Object[]{this, str, str2});
            } else {
                super.b(str, str2);
            }
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.k
        public void c(String str, String str2, Throwable th) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91eb9ae1", new Object[]{this, str, str2, th});
            } else {
                super.c(str, str2, th);
            }
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.k
        public boolean d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bd395fda", new Object[]{this})).booleanValue();
            }
            return true;
        }

        @Override // com.taobao.taolive.ui.view.NewDetailMaskFrameLayout.k
        public int h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a6428b2", new Object[]{this})).intValue();
            }
            return 1;
        }
    }

    static {
        t2o.a(779092409);
    }

    public df8(Activity activity) {
        this.f17772a = activity;
    }

    public static /* synthetic */ cba a(df8 df8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cba) ipChange.ipc$dispatch("102eaabc", new Object[]{df8Var});
        }
        return df8Var.e;
    }

    public void b(View view) {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddda6f45", new Object[]{this, view});
        } else if (g() && (newDetailMaskFrameLayout = this.b) != null) {
            newDetailMaskFrameLayout.addView(view);
        }
    }

    public void c(cba cbaVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3044a9e9", new Object[]{this, cbaVar});
        } else if (g()) {
            this.e = cbaVar;
            if (cbaVar != null) {
                cbaVar.j0(true);
            }
        }
    }

    public final void e(Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7adb4b22", new Object[]{this, bundle});
        } else if (bundle != null) {
            this.c = false;
        } else {
            Intent intent = this.f17772a.getIntent();
            Bundle bundleExtra = intent.getBundleExtra("nav_animation_extra");
            if (!intent.getBooleanExtra("extraEnableTransition", false) || !d(bundleExtra)) {
                z = false;
            }
            this.c = z;
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71c636f9", new Object[]{this});
        } else if (v2s.o().p() != null) {
            this.d = zqq.c(v2s.o().p().b("tblive", "enableLiveRoomEnterOpt0304", "true"));
        }
    }

    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("10689ce9", new Object[]{this})).booleanValue();
        }
        if (!k() || !j()) {
            return false;
        }
        return true;
    }

    public void h() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44908f9a", new Object[]{this});
        } else if (g() && (newDetailMaskFrameLayout = this.b) != null) {
            newDetailMaskFrameLayout.onFinish();
        }
    }

    public void i(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f555dd", new Object[]{this, bundle});
            return;
        }
        e(bundle);
        f();
        l();
    }

    public final boolean j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("149e5e14", new Object[]{this})).booleanValue();
        }
        return this.c;
    }

    public final boolean k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2911d1f", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc4b0461", new Object[]{this});
        } else if (g()) {
            try {
                Activity activity = this.f17772a;
                if (activity != null) {
                    activity.setTheme(R.style.Theme_TransparentLive);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public void m() {
        Activity activity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else if (g() && (activity = this.f17772a) != null) {
            activity.setContentView(R.layout.taolive_animation_layout);
            NewDetailMaskFrameLayout newDetailMaskFrameLayout = (NewDetailMaskFrameLayout) this.f17772a.findViewById(R.id.rootAnimFrameLayout);
            this.b = newDetailMaskFrameLayout;
            if (newDetailMaskFrameLayout != null) {
                newDetailMaskFrameLayout.prepareActivity();
                this.b.setParentFrameLayout((FrameLayout) this.f17772a.findViewById(R.id.rootParentFrameLayout));
                this.b.setMaskFrameLayoutHandler(new b(this));
                this.b.getNewDetailMaskFrameLayoutContext().q(this.f);
                this.b.initAnim();
            }
        }
    }

    public void n() {
        NewDetailMaskFrameLayout newDetailMaskFrameLayout;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (g() && (newDetailMaskFrameLayout = this.b) != null) {
            newDetailMaskFrameLayout.destroy();
        }
    }

    public final boolean d(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("561f304b", new Object[]{this, bundle})).booleanValue();
        }
        return bundle != null && bundle.containsKey("view_screen_start_x") && bundle.containsKey("view_screen_start_y") && bundle.getFloat("view_height", -1.0f) > 0.0f && bundle.getFloat("view_width", -1.0f) > 0.0f;
    }
}
