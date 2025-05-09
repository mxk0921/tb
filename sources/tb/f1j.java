package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class f1j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final BaseFrame f18939a;
    public final Context b;
    public final Runnable c;
    public final Runnable d;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final PopupWindow f;
    public final ux9 g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (!(f1j.a(f1j.this) == null || f1j.b(f1j.this) == null)) {
                    View viewByName = f1j.b(f1j.this).getViewByName("more");
                    if (!(viewByName == null || f1j.c(f1j.this) == null)) {
                        f1j.c(f1j.this).showAsDropDown(viewByName, -hw0.b(f1j.a(f1j.this), 148.0f), -viewByName.getHeight());
                    }
                    rbu.c0(f1j.d(f1j.this), "Show-BottomToast_Definition", null);
                    f1j.f(f1j.this).postDelayed(f1j.e(f1j.this), pvs.y2() * 1000);
                    x5t.h("MoreSwitchGuideTip", "real show");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                if (f1j.c(f1j.this) != null) {
                    f1j.c(f1j.this).dismiss();
                }
                x5t.h("MoreSwitchGuideTip", "dismiss");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    static {
        t2o.a(779093077);
    }

    public f1j(Context context, BaseFrame baseFrame, ux9 ux9Var) {
        this.b = context;
        this.f18939a = baseFrame;
        this.g = ux9Var;
        View inflate = LayoutInflater.from(context).inflate(R.layout.taolive_more_switch_tip_layout, (ViewGroup) null, false);
        TUrlImageView tUrlImageView = (TUrlImageView) inflate.findViewById(R.id.taolive_more_switch_tip_image);
        if (tUrlImageView != null) {
            tUrlImageView.setImageUrl("https://gw.alicdn.com/imgextra/i3/O1CN01XfVozo1SikKy11ZcW_!!6000000002281-2-tps-435-108.png");
            PopupWindow popupWindow = new PopupWindow(context);
            this.f = popupWindow;
            popupWindow.setContentView(inflate);
            popupWindow.setAnimationStyle(R.style.taolive_switch_pop_anim_style);
            popupWindow.setBackgroundDrawable(null);
            popupWindow.setWidth(-2);
            popupWindow.setHeight(-2);
        }
        this.c = new a();
        this.d = new b();
    }

    public static /* synthetic */ Context a(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("87694f6c", new Object[]{f1jVar});
        }
        return f1jVar.b;
    }

    public static /* synthetic */ BaseFrame b(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BaseFrame) ipChange.ipc$dispatch("1954528d", new Object[]{f1jVar});
        }
        return f1jVar.f18939a;
    }

    public static /* synthetic */ PopupWindow c(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("3e0e4ac2", new Object[]{f1jVar});
        }
        return f1jVar.f;
    }

    public static /* synthetic */ ux9 d(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("32da4a4d", new Object[]{f1jVar});
        }
        return f1jVar.g;
    }

    public static /* synthetic */ Runnable e(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("486036a4", new Object[]{f1jVar});
        }
        return f1jVar.d;
    }

    public static /* synthetic */ Handler f(f1j f1jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("639fbe57", new Object[]{f1jVar});
        }
        return f1jVar.e;
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        x5t.h("MoreSwitchGuideTip", DMComponent.RESET);
        this.e.removeCallbacks(this.c);
        this.e.removeCallbacks(this.d);
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
            return;
        }
        x5t.h("MoreSwitchGuideTip", "show");
        rbu.c0(this.g, "Show-DefinitionTip_Switch", null);
        this.e.postDelayed(this.c, 3200L);
    }
}
