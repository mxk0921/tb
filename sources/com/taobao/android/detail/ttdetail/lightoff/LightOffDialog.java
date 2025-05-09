package com.taobao.android.detail.ttdetail.lightoff;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatDialog;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorTracker;
import com.taobao.android.detail.ttdetail.behavior.UserBehaviorUtils;
import com.taobao.android.detail.ttdetail.bizmessage.ShowLightOffMessage;
import com.taobao.android.detail.ttdetail.communication.ThreadMode;
import com.taobao.android.detail.ttdetail.container.GalleryCore;
import com.taobao.android.detail.ttdetail.container.MainAdapter;
import com.taobao.android.detail.ttdetail.data.meta.Feature;
import com.taobao.android.detail.ttdetail.performance.PreRenderManager;
import com.taobao.android.detail.ttdetail.utils.RuntimeUtils;
import com.taobao.android.detail.ttdetail.utils.UtUtils;
import com.taobao.android.detail.ttdetail.widget.TTViewPager;
import com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.List;
import tb.b5m;
import tb.c8n;
import tb.cy9;
import tb.jov;
import tb.ktc;
import tb.nb4;
import tb.nog;
import tb.nos;
import tb.ntc;
import tb.oa4;
import tb.pb6;
import tb.q84;
import tb.qq7;
import tb.r3q;
import tb.sx9;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.tx9;
import tb.u3a;
import tb.u5m;
import tb.vle;
import tb.wxi;
import tb.yc4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class LightOffDialog extends AppCompatDialog implements ntc<qq7>, ktc<c8n, Boolean> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean A;
    public boolean B;
    public final LightOffLayerManger C;
    public int D;
    public final ShowLightOffMessage.Source E;
    public volatile double F;
    public final DragDismissLayout.b G;
    public final TTViewPager.e H;

    /* renamed from: a  reason: collision with root package name */
    public final ze7 f6854a;
    public final Context b;
    public final List<cy9> c;
    public final Rect d;
    public int e;
    public volatile boolean f;
    public volatile boolean g;
    public final String h;
    public final int i;
    public final View j;
    public final TTViewPager k;
    public final MainAdapter l;
    public final View m;
    public final View n;
    public final View o;
    public final TextView p;
    public final TextView q;
    public final View r;
    public final View s;
    public final View t;
    public final DXFloatContainer u;
    public volatile boolean v;
    public int w;
    public i x;
    public g y;
    public h z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum CustomizedSetting {
        FORBID_FIND_SIMILARITY,
        FORBID_LONG_CLICK_SHARE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(CustomizedSetting customizedSetting, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/lightoff/LightOffDialog$CustomizedSetting");
        }

        public static CustomizedSetting valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CustomizedSetting) ipChange.ipc$dispatch("b252e6fd", new Object[]{str});
            }
            return (CustomizedSetting) Enum.valueOf(CustomizedSetting.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                LightOffDialog.this.dismiss();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            LightOffDialog.b(LightOffDialog.this);
            UtUtils.f(2101, "Page_Detail_Button_PicPage_Query", UtUtils.c(LightOffDialog.c(LightOffDialog.this).e()));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements TTViewPager.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7a45c414", new Object[]{this, new Integer(i)});
            } else if (!LightOffDialog.c(LightOffDialog.this).e().o()) {
                oa4 g = yc4.g(i, LightOffDialog.k(LightOffDialog.this).m());
                if (g instanceof cy9) {
                    ((cy9) g).K(1, i);
                }
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.d
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c2126f39", new Object[]{this, new Integer(i)});
            } else if (!LightOffDialog.c(LightOffDialog.this).e().o()) {
                oa4 g = yc4.g(i, LightOffDialog.k(LightOffDialog.this).m());
                if (g instanceof cy9) {
                    ((cy9) g).K(2, i);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public VelocityTracker f6859a;

        public d() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            VelocityTracker velocityTracker;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (this.f6859a == null) {
                this.f6859a = VelocityTracker.obtain();
            }
            this.f6859a.addMovement(motionEvent);
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && (velocityTracker = this.f6859a) != null) {
                velocityTracker.computeCurrentVelocity(1000);
                LightOffDialog.m(LightOffDialog.this, (int) this.f6859a.getXVelocity());
                this.f6859a.clear();
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements DragDismissLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void a(DragDismissLayout dragDismissLayout, View view, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5cb544c7", new Object[]{this, dragDismissLayout, view, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, false);
            tgh.b("LightOffDialog", "onRestoreEnd() for view: " + dragDismissLayout);
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void b(DragDismissLayout dragDismissLayout, View view, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("559d634b", new Object[]{this, dragDismissLayout, view, new Double(d)});
                return;
            }
            LightOffDialog.this.A(true);
            LightOffDialog.q(LightOffDialog.this, false);
            tgh.b("LightOffDialog", "onDismissEnd() for view: " + dragDismissLayout);
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void c(DragDismissLayout dragDismissLayout, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecdfec34", new Object[]{this, dragDismissLayout, view});
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void d(DragDismissLayout dragDismissLayout, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a6caeb", new Object[]{this, dragDismissLayout, view});
                return;
            }
            LightOffDialog.n(LightOffDialog.this, 0.0f);
            if (LightOffDialog.o(LightOffDialog.this) == ShowLightOffMessage.Source.MINI_VIDEO) {
                LightOffDialog.p(LightOffDialog.this, 0.0f);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void e(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb5be197", new Object[]{this, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, true);
            LightOffDialog.n(LightOffDialog.this, (float) (1.0d - d));
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void f(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9d0089f", new Object[]{this, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, true);
            float pow = (float) Math.pow(1.0d - d, 3.0d);
            LightOffDialog.n(LightOffDialog.this, (float) (1.0d - (d + LightOffDialog.r(LightOffDialog.this))));
            if (LightOffDialog.o(LightOffDialog.this) == ShowLightOffMessage.Source.MINI_VIDEO) {
                LightOffDialog.p(LightOffDialog.this, pow);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void g(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38140f1b", new Object[]{this, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, true);
            LightOffDialog.n(LightOffDialog.this, (float) (1.0d - d));
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void h(double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3ddb4cc0", new Object[]{this, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, true);
            float f = (float) (1.0d - d);
            LightOffDialog.n(LightOffDialog.this, f);
            if (LightOffDialog.o(LightOffDialog.this) == ShowLightOffMessage.Source.MINI_VIDEO) {
                LightOffDialog.p(LightOffDialog.this, f);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void i(DragDismissLayout dragDismissLayout, View view, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc56413d", new Object[]{this, dragDismissLayout, view, new Double(d)});
            } else {
                LightOffDialog.e(LightOffDialog.this);
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void j(DragDismissLayout dragDismissLayout, View view, boolean z, double d) {
            Rect rect;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d5b0ab59", new Object[]{this, dragDismissLayout, view, new Boolean(z), new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, true);
            if (!z) {
                LightOffDialog.s(LightOffDialog.this, d);
                cy9 cy9Var = (cy9) LightOffDialog.k(LightOffDialog.this).l(LightOffDialog.t(LightOffDialog.this).getCurrentItem());
                if (LightOffDialog.d(LightOffDialog.this) != null) {
                    rect = LightOffDialog.d(LightOffDialog.this).a(cy9Var);
                } else {
                    rect = null;
                }
                if (rect != null && !rect.isEmpty() && cy9Var != null) {
                    dragDismissLayout.setTargetViewInitScreenLocation(rect);
                }
            }
        }

        @Override // com.taobao.android.detail.ttdetail.widget.draglayout.DragDismissLayout.b
        public void k(DragDismissLayout dragDismissLayout, View view, double d) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7766e0ac", new Object[]{this, dragDismissLayout, view, new Double(d)});
                return;
            }
            LightOffDialog.q(LightOffDialog.this, false);
            LightOffDialog.n(LightOffDialog.this, 1.0f);
            if (LightOffDialog.o(LightOffDialog.this) == ShowLightOffMessage.Source.MINI_VIDEO) {
                LightOffDialog.p(LightOffDialog.this, 1.0f);
            }
            tgh.b("LightOffDialog", "onEnterAnimEnd() for view: " + dragDismissLayout);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class f {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail$ttdetail$lightoff$LightOffDialog$CustomizedSetting;

        static {
            int[] iArr = new int[CustomizedSetting.values().length];
            $SwitchMap$com$taobao$android$detail$ttdetail$lightoff$LightOffDialog$CustomizedSetting = iArr;
            try {
                iArr[CustomizedSetting.FORBID_FIND_SIMILARITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail$ttdetail$lightoff$LightOffDialog$CustomizedSetting[CustomizedSetting.FORBID_LONG_CLICK_SHARE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface g {
        Rect a(sx9 sx9Var);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface h {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface i {
        void a(LightOffDialog lightOffDialog, sx9 sx9Var);

        void b(LightOffDialog lightOffDialog, sx9 sx9Var);
    }

    static {
        t2o.a(912262054);
        t2o.a(912261362);
        t2o.a(912261361);
    }

    public LightOffDialog(Context context, ze7 ze7Var, List<cy9> list, boolean z, String str, Rect rect) {
        this(context, ze7Var, list, ShowLightOffMessage.Source.UNKNOWN, z, str, rect);
    }

    public static /* synthetic */ void b(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba0ef8a2", new Object[]{lightOffDialog});
        } else {
            lightOffDialog.C();
        }
    }

    public static /* synthetic */ ze7 c(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("52da35f7", new Object[]{lightOffDialog});
        }
        return lightOffDialog.f6854a;
    }

    public static /* synthetic */ g d(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g) ipChange.ipc$dispatch("47135be2", new Object[]{lightOffDialog});
        }
        return lightOffDialog.y;
    }

    public static /* synthetic */ void e(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a145912", new Object[]{lightOffDialog});
        } else {
            lightOffDialog.D();
        }
    }

    public static /* synthetic */ void f(LightOffDialog lightOffDialog, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94e53890", new Object[]{lightOffDialog, new Integer(i2)});
        } else {
            lightOffDialog.B(i2);
        }
    }

    public static /* synthetic */ int g(LightOffDialog lightOffDialog, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5b24520", new Object[]{lightOffDialog, new Integer(i2)})).intValue();
        }
        lightOffDialog.w = i2;
        return i2;
    }

    public static /* synthetic */ Context h(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("5cf5450e", new Object[]{lightOffDialog});
        }
        return lightOffDialog.b;
    }

    public static /* synthetic */ Object ipc$super(LightOffDialog lightOffDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1373052399) {
            super.dismiss();
            return null;
        } else if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == -340027132) {
            super.show();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/lightoff/LightOffDialog");
        }
    }

    public static /* synthetic */ TextView j(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("7c1c174b", new Object[]{lightOffDialog});
        }
        return lightOffDialog.q;
    }

    public static /* synthetic */ MainAdapter k(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MainAdapter) ipChange.ipc$dispatch("645d038c", new Object[]{lightOffDialog});
        }
        return lightOffDialog.l;
    }

    public static /* synthetic */ int l(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d536bd8", new Object[]{lightOffDialog})).intValue();
        }
        return lightOffDialog.D;
    }

    public static /* synthetic */ int m(LightOffDialog lightOffDialog, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("317993ef", new Object[]{lightOffDialog, new Integer(i2)})).intValue();
        }
        lightOffDialog.D = i2;
        return i2;
    }

    public static /* synthetic */ void n(LightOffDialog lightOffDialog, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f98874da", new Object[]{lightOffDialog, new Float(f2)});
        } else {
            lightOffDialog.H(f2);
        }
    }

    public static /* synthetic */ ShowLightOffMessage.Source o(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShowLightOffMessage.Source) ipChange.ipc$dispatch("cbbe9d48", new Object[]{lightOffDialog});
        }
        return lightOffDialog.E;
    }

    public static /* synthetic */ void p(LightOffDialog lightOffDialog, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32646d98", new Object[]{lightOffDialog, new Float(f2)});
        } else {
            lightOffDialog.I(f2);
        }
    }

    public static /* synthetic */ boolean q(LightOffDialog lightOffDialog, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a331c54d", new Object[]{lightOffDialog, new Boolean(z)})).booleanValue();
        }
        lightOffDialog.v = z;
        return z;
    }

    public static /* synthetic */ double r(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("981ad698", new Object[]{lightOffDialog})).doubleValue();
        }
        return lightOffDialog.F;
    }

    public static /* synthetic */ double s(LightOffDialog lightOffDialog, double d2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3f9f6f00", new Object[]{lightOffDialog, new Double(d2)})).doubleValue();
        }
        lightOffDialog.F = d2;
        return d2;
    }

    public static /* synthetic */ TTViewPager t(LightOffDialog lightOffDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TTViewPager) ipChange.ipc$dispatch("d40ad516", new Object[]{lightOffDialog});
        }
        return lightOffDialog.k;
    }

    public final void A(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa01fa40", new Object[]{this, new Boolean(z)});
            return;
        }
        LightOffLayerManger lightOffLayerManger = this.C;
        if (lightOffLayerManger != null) {
            lightOffLayerManger.k();
        }
        q84.m(this.b, this);
        q84.k(this.b, this);
        if (this.x != null && isShowing()) {
            this.x.b(this, this.l.l(this.k.getCurrentItem()));
        }
        Context context = this.b;
        if (context instanceof Activity) {
            Activity activity = (Activity) context;
            if (!activity.isFinishing() && !activity.isDestroyed()) {
                super.dismiss();
            }
        } else {
            super.dismiss();
        }
        if (!this.f) {
            this.k.destroy();
            yc4.a(-1, this.l.m());
            this.f = true;
        }
    }

    public final void B(int i2) {
        int i3;
        int i4 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a536ce15", new Object[]{this, new Integer(i2)});
        } else if (this.k.getWindowToken() != null && (i3 = this.e) != i2) {
            this.e = i2;
            cy9 cy9Var = (cy9) this.l.l(i2);
            if (cy9Var != null) {
                cy9Var.c(this.G);
                yc4.e(this.e, i3, this.l.m());
                G(cy9Var);
                this.p.setText(String.valueOf(this.e + 1));
                L(cy9Var);
                String d2 = r3q.d(this.c, this.e);
                TextView textView = this.q;
                if (this.A || TextUtils.isEmpty(d2)) {
                    i4 = 8;
                }
                textView.setVisibility(i4);
                this.k.post(new nog(this, d2));
                LightOffLayerManger lightOffLayerManger = this.C;
                if (lightOffLayerManger != null) {
                    lightOffLayerManger.q(cy9Var);
                }
                h hVar = this.z;
                if (hVar != null) {
                    ((GalleryCore.e) hVar).a(cy9Var);
                }
            }
        }
    }

    public final void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8e54cbc", new Object[]{this});
            return;
        }
        cy9 cy9Var = (cy9) this.l.l(this.k.getCurrentItem());
        if (cy9Var != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("pssource", "detail_mainpic");
            hashMap.put(wxi.KEY_PHOTO_FROM, "detail_mainpic");
            hashMap.put("item_id", this.f6854a.i().c("requestItemId"));
            hashMap.put(wxi.KEY_PIC_URL, jov.d(cy9Var.C()));
            jov.k(getContext(), jov.a("https://h5.m.taobao.com/tusou/image_editor/index.html", hashMap));
            UtUtils.f(2101, "Page_Detail_Lightoff_FindSimilar", UtUtils.c(this.f6854a.e()));
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("426e6f71", new Object[]{this});
        } else if (this.x != null && isShowing()) {
            this.x.a(this, this.l.l(this.k.getCurrentItem()));
        }
    }

    /* renamed from: E */
    public Boolean i(c8n c8nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("eb81ec17", new Object[]{this, c8nVar});
        }
        return Boolean.valueOf(isShowing());
    }

    /* renamed from: F */
    public boolean y1(qq7 qq7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f292c732", new Object[]{this, qq7Var})).booleanValue();
        }
        dismiss();
        return true;
    }

    public final void G(cy9 cy9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a8b1379", new Object[]{this, cy9Var});
        } else if (!this.g) {
            this.g = true;
            if (TextUtils.equals(this.h, ((tx9) cy9Var.getComponentData()).g())) {
                cy9Var.h(this.d);
                cy9Var.p();
                return;
            }
            H(1.0f);
        } else if (this.v) {
            tgh.b("LightOffDialog", "enterRunningAnimation() not finished correctly");
        }
    }

    public final void H(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a232a0", new Object[]{this, new Float(f2)});
            return;
        }
        this.s.setAlpha(f2);
        this.t.setAlpha(f2);
        float f3 = 0.0f;
        if (f2 > 0.0f) {
            f3 = 1.0f;
            if (f2 < 1.0f) {
                f3 = (float) Math.pow(f2, 9.96d);
            }
        }
        this.u.setAlpha(f3);
    }

    public final void I(float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3afdc5b", new Object[]{this, new Float(f2)});
            return;
        }
        cy9 cy9Var = (cy9) this.l.l(this.k.getCurrentItem());
        if (cy9Var != null) {
            cy9Var.W(f2);
        }
    }

    public void J(List<CustomizedSetting> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ae45545", new Object[]{this, list});
        } else if (list != null) {
            for (CustomizedSetting customizedSetting : list) {
                int i2 = f.$SwitchMap$com$taobao$android$detail$ttdetail$lightoff$LightOffDialog$CustomizedSetting[customizedSetting.ordinal()];
                if (i2 == 1) {
                    x();
                } else if (i2 == 2) {
                    y();
                }
            }
        }
    }

    public void K(g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f12f493", new Object[]{this, gVar});
        } else {
            this.y = gVar;
        }
    }

    public final void L(cy9 cy9Var) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b530383", new Object[]{this, cy9Var});
        } else if (!this.B) {
            this.r.setVisibility(8);
        } else {
            boolean s = yc4.s((tx9) cy9Var.getComponentData());
            View view = this.r;
            if (!s) {
                i2 = 8;
            }
            view.setVisibility(i2);
            if (s) {
                UtUtils.f(2201, "Page_Detail_Show_PicPage_Query", UtUtils.c(this.f6854a.e()));
            }
        }
    }

    public void M(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("98742a58", new Object[]{this, str});
        } else if (!TextUtils.equals(str, yc4.l(this.l.l(this.k.getCurrentItem())))) {
            int count = this.l.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                if (TextUtils.equals(yc4.l(this.l.l(i2)), str) && i2 != this.k.getCurrentItem()) {
                    this.k.setCurrentItem(i2, false);
                    return;
                }
            }
        }
    }

    public void N(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45774013", new Object[]{this, hVar});
        } else {
            this.z = hVar;
        }
    }

    public void O(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e3acbcf", new Object[]{this, nb4Var});
            return;
        }
        LightOffLayerManger lightOffLayerManger = this.C;
        if (lightOffLayerManger != null && nb4Var != null) {
            lightOffLayerManger.m(nb4Var);
        }
    }

    public void P(i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb80be74", new Object[]{this, iVar});
        } else {
            this.x = iVar;
        }
    }

    public void Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df871f62", new Object[]{this});
            return;
        }
        LightOffLayerManger lightOffLayerManger = this.C;
        if (lightOffLayerManger != null) {
            lightOffLayerManger.o();
        }
    }

    public final boolean R() {
        Rect rect;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2b7d662b", new Object[]{this})).booleanValue();
        }
        cy9 cy9Var = (cy9) this.l.l(this.k.getCurrentItem());
        g gVar = this.y;
        if (gVar != null) {
            rect = gVar.a(cy9Var);
        } else {
            rect = null;
        }
        if (rect == null || rect.isEmpty() || cy9Var == null) {
            return false;
        }
        cy9Var.h(rect);
        return cy9Var.q();
    }

    public void S(nb4 nb4Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67e73936", new Object[]{this, nb4Var});
            return;
        }
        LightOffLayerManger lightOffLayerManger = this.C;
        if (lightOffLayerManger != null && nb4Var != null) {
            lightOffLayerManger.m(nb4Var);
            this.C.p();
        }
    }

    @Override // tb.ntc
    public ThreadMode W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadMode) ipChange.ipc$dispatch("e1b5ec98", new Object[]{this});
        }
        return ThreadMode.MainThread;
    }

    @Override // androidx.appcompat.app.AppCompatDialog, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (!this.f && this.w == 0 && !R()) {
            tgh.b("LightOffDialog", "failed to startCurrentComponentExitAnimation()");
            D();
            A(true);
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialog, androidx.activity.ComponentDialog, android.app.Dialog
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setContentView(this.j, new ViewGroup.LayoutParams(-1, -1));
    }

    @Override // android.app.Dialog
    public void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        }
    }

    @Override // android.app.Dialog
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else if (!tq4.e(this.b)) {
            LightOffLayerManger lightOffLayerManger = this.C;
            if (lightOffLayerManger != null) {
                lightOffLayerManger.n();
            }
            u();
            super.show();
            nos.b(tq4.b(this), getWindow(), false);
            nos.c(getWindow(), -16777216);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deef464a", new Object[]{this});
            return;
        }
        cy9 cy9Var = (cy9) this.l.l(this.i);
        if (cy9Var != null) {
            cy9Var.y();
        }
    }

    public final int v(List<cy9> list, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bd8ff2d4", new Object[]{this, list, str})).intValue();
        }
        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                if (str.equals(((tx9) list.get(i2).getComponentData()).g())) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public final boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("98effd7a", new Object[]{this})).booleanValue();
        }
        Feature feature = (Feature) this.f6854a.e().f(Feature.class);
        if (feature == null) {
            return false;
        }
        return feature.isLightoffPageFindSimilar();
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e782eab7", new Object[]{this});
        } else {
            this.B = false;
        }
    }

    public final void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb7cb88e", new Object[]{this});
            return;
        }
        List<cy9> list = this.c;
        if (list != null) {
            for (cy9 cy9Var : list) {
                if (cy9Var.w() > 0) {
                    oa4 v = cy9Var.v(0);
                    if (v instanceof vle) {
                        ((vle) v).Q(true);
                    }
                }
            }
        }
    }

    public final int z(List<cy9> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fac9549a", new Object[]{this, list})).intValue();
        }
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return list.size();
    }

    public LightOffDialog(Context context, ze7 ze7Var, List<cy9> list, ShowLightOffMessage.Source source, boolean z, String str, Rect rect) {
        super(context, R.style.TTDetail_Dialog_FullScreen);
        this.e = -1;
        this.w = 0;
        this.G = new e();
        TTViewPager.e eVar = new TTViewPager.e() { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.7
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public boolean f6855a;
            public int b = -1;

            public static /* synthetic */ int b(AnonymousClass7 r4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("e918eb95", new Object[]{r4})).intValue();
                }
                return r4.b;
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void a(int i2, int i3, float f2, int i4) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a38f8204", new Object[]{this, new Integer(i2), new Integer(i3), new Float(f2), new Integer(i4)});
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void onPageSelected(int i2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
                } else {
                    LightOffDialog.f(LightOffDialog.this, i2);
                }
            }

            @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager.e
            public void onPageScrollStateChanged(int i2) {
                int i3;
                String str2;
                String str3;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                    return;
                }
                LightOffDialog.g(LightOffDialog.this, i2);
                if (i2 == 0) {
                    int currentItem = LightOffDialog.t(LightOffDialog.this).getCurrentItem();
                    if (!LightOffDialog.c(LightOffDialog.this).e().o() && this.f6855a && (i3 = this.b) != -1 && currentItem != i3) {
                        oa4 g2 = yc4.g(currentItem, LightOffDialog.k(LightOffDialog.this).m());
                        if (g2 instanceof sx9) {
                            sx9 sx9Var = (sx9) g2;
                            HashMap<String, String> hashMap = new HashMap<String, String>(currentItem, sx9Var, RuntimeUtils.c(sx9Var.v(1))) { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.7.1
                                public final /* synthetic */ int val$currentPosition;
                                public final /* synthetic */ String val$floatComponentName;
                                public final /* synthetic */ sx9 val$frameComponent;

                                {
                                    String str4;
                                    this.val$currentPosition = currentItem;
                                    this.val$frameComponent = sx9Var;
                                    this.val$floatComponentName = r6;
                                    put("source_index", AnonymousClass7.b(AnonymousClass7.this) + "");
                                    put("target_index", currentItem + "");
                                    if (sx9Var.M()) {
                                        str4 = "video";
                                    } else {
                                        str4 = "image";
                                    }
                                    put("target_frame_type", str4);
                                    if (!TextUtils.isEmpty(r6)) {
                                        put("target_frame_float_id", r6);
                                    }
                                }
                            };
                            Context h2 = LightOffDialog.h(LightOffDialog.this);
                            if (LightOffDialog.l(LightOffDialog.this) < 0) {
                                str2 = "rightSlide";
                            } else {
                                str2 = "leftSlide";
                            }
                            UserBehaviorTracker.l(h2, UserBehaviorUtils.COMPONENT_NAME_GALLERY_LIGHTOFF_CONTAINER, str2, hashMap);
                            JSONObject c2 = UtUtils.c(LightOffDialog.c(LightOffDialog.this).e());
                            if (LightOffDialog.l(LightOffDialog.this) < 0) {
                                str3 = "right";
                            } else {
                                str3 = "left";
                            }
                            c2.put("direction", (Object) str3);
                            c2.put("isSwipe", (Object) "1");
                            c2.putAll(hashMap);
                            oa4 v = sx9Var.v(0);
                            if (v instanceof u3a) {
                                c2.putAll(((u3a) v).x());
                            }
                            UtUtils.f(2101, "Page_Detail_Button_DarkPage_Swipe", c2);
                        }
                    }
                    this.f6855a = false;
                }
                if (i2 == 1) {
                    this.f6855a = true;
                    this.b = LightOffDialog.t(LightOffDialog.this).getCurrentItem();
                }
            }
        };
        this.b = context;
        this.f6854a = ze7Var;
        this.c = list;
        this.E = source;
        this.h = str;
        int v = v(list, str);
        this.i = v;
        this.d = rect;
        int i2 = b5m.H().isI18nEdition() ? R.layout.i18n_tt_detail_lightoff_container : R.layout.tt_detail_lightoff_container;
        PreRenderManager g2 = PreRenderManager.g(context);
        if (g2 != null) {
            this.j = g2.j(context, i2, null, true);
        } else {
            this.j = LayoutInflater.from(context).inflate(i2, (ViewGroup) null);
        }
        this.A = z;
        this.s = this.j.findViewById(R.id.view_black_bg_holder);
        this.t = this.j.findViewById(R.id.fl_front_content_holder);
        DXFloatContainer dXFloatContainer = (DXFloatContainer) this.j.findViewById(R.id.dx_float_container);
        this.u = dXFloatContainer;
        if (z) {
            this.C = new LightOffLayerManger(ze7Var, dXFloatContainer);
        }
        TTViewPager tTViewPager = (TTViewPager) this.j.findViewById(R.id.vp_lightoff_main_container);
        this.k = tTViewPager;
        if (z) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) tTViewPager.getLayoutParams();
            layoutParams.bottomMargin = pb6.f(context, 56.0f);
            tTViewPager.setLayoutParams(layoutParams);
        }
        View findViewById = this.j.findViewById(R.id.ll_top_action_container);
        this.m = findViewById;
        View findViewById2 = this.j.findViewById(R.id.iv_close);
        this.n = findViewById2;
        ViewProxy.setOnClickListener(findViewById2, new a());
        View findViewById3 = this.j.findViewById(R.id.ll_find_similar);
        this.r = findViewById3;
        ViewProxy.setOnClickListener(findViewById3, new b());
        this.B = w();
        View findViewById4 = this.j.findViewById(R.id.ll_index_container);
        this.o = findViewById4;
        Drawable d2 = u5m.d();
        if (d2 != null) {
            findViewById4.setBackground(d2);
        }
        TextView textView = (TextView) this.j.findViewById(R.id.tv_current_index);
        this.p = textView;
        TextView textView2 = (TextView) this.j.findViewById(R.id.tv_total_size);
        TextView textView3 = (TextView) this.j.findViewById(R.id.tv_sku_desc);
        this.q = textView3;
        Drawable e2 = u5m.e();
        if (e2 != null) {
            textView3.setBackground(e2);
        }
        textView.setText(String.valueOf(v + 1));
        textView2.setText(String.valueOf(z(list)));
        String d3 = r3q.d(list, v);
        textView3.setVisibility((z || TextUtils.isEmpty(d3)) ? 8 : 0);
        textView3.setText(d3);
        MainAdapter mainAdapter = new MainAdapter();
        this.l = mainAdapter;
        mainAdapter.p(list);
        tTViewPager.addOnPageChangeListener(eVar);
        tTViewPager.setAdapter(mainAdapter);
        tTViewPager.setCurrentItem(v, false);
        tTViewPager.addOnItemVisibleChangeListener(new c());
        tTViewPager.setOnTouchListener(new d());
        q84.i(context, qq7.class, this);
        q84.h(context, c8n.class, this);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById, new OnApplyWindowInsetsListener(this) { // from class: com.taobao.android.detail.ttdetail.lightoff.LightOffDialog.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.core.view.OnApplyWindowInsetsListener
            public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (WindowInsetsCompat) ipChange.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
                }
                view.setPadding(0, windowInsetsCompat.getStableInsetTop(), 0, 0);
                return windowInsetsCompat;
            }
        });
    }
}
