package com.taobao.family.globalbubble2.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.taobao.android.nav.Nav;
import com.taobao.family.FamilyMember;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import com.taobao.taobao.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.ao9;
import tb.jr7;
import tb.xqk;
import tb.y7t;
import tb.yca;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FamilyView implements ao9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10510a;
    public View c;
    public View d;
    public ImageView e;
    public TextView f;
    public TextView g;
    public View h;
    public View i;
    public View j;
    public View k;
    public View l;
    public int o;
    public int p;
    public xqk x;
    public final List<FamilyMember> b = new ArrayList();
    public boolean m = false;
    public boolean n = false;
    public float q = 0.0f;
    public float r = 0.0f;
    public long s = 0;
    public boolean t = true;
    public boolean u = false;
    public boolean v = false;
    public final Handler w = new Handler(Looper.getMainLooper());
    public final View.OnTouchListener y = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMember f10514a;

        public a(FamilyMember familyMember) {
            this.f10514a = familyMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.l(FamilyView.this, this.f10514a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble2/view/FamilyView$11");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            FamilyView.o(FamilyView.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble2/view/FamilyView$12");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            FamilyView.p(FamilyView.this).setVisibility(8);
            FamilyView.p(FamilyView.this).setTranslationY(0.0f);
            FamilyView.p(FamilyView.this).setAlpha(0.0f);
            FamilyView.r(FamilyView.this, false);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomSheetDialog f10517a;

        public d(BottomSheetDialog bottomSheetDialog) {
            this.f10517a = bottomSheetDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f10517a.cancel();
            FamilyView.t(FamilyView.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ BottomSheetDialog f10518a;

        public e(FamilyView familyView, BottomSheetDialog bottomSheetDialog) {
            this.f10518a = bottomSheetDialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                this.f10518a.cancel();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            int rawX = (int) motionEvent.getRawX();
            int rawY = (int) motionEvent.getRawY();
            if (motionEvent.getAction() == 0) {
                FamilyView.d(FamilyView.this, rawX);
                FamilyView.g(FamilyView.this, rawY);
                FamilyView familyView = FamilyView.this;
                FamilyView.s(familyView, FamilyView.w(familyView).getTranslationX());
                FamilyView familyView2 = FamilyView.this;
                FamilyView.y(familyView2, FamilyView.w(familyView2).getTranslationY());
                FamilyView.A(FamilyView.this, System.currentTimeMillis());
                FamilyView.C(FamilyView.this, true);
                FamilyView.E(FamilyView.this, false);
            } else if (motionEvent.getAction() == 2) {
                int c = rawX - FamilyView.c(FamilyView.this);
                int e = rawY - FamilyView.e(FamilyView.this);
                if (System.currentTimeMillis() - FamilyView.z(FamilyView.this) >= ViewConfiguration.getTapTimeout()) {
                    FamilyView.E(FamilyView.this, true);
                }
                if (((int) Math.sqrt(Math.pow(c, 2.0d) + Math.pow(e, 2.0d))) >= ViewConfiguration.get(FamilyView.F(FamilyView.this)).getScaledTouchSlop()) {
                    FamilyView.C(FamilyView.this, false);
                }
                if (FamilyView.D(FamilyView.this) || !FamilyView.B(FamilyView.this)) {
                    FamilyView.w(FamilyView.this).setTranslationX(FamilyView.q(FamilyView.this) + c);
                    FamilyView.w(FamilyView.this).setTranslationY(FamilyView.x(FamilyView.this) + e);
                    FamilyView.w(FamilyView.this).setBackgroundResource(R.drawable.bg_family_dialog_bubble_drag);
                    FamilyView.G(FamilyView.this, false);
                    FamilyView.f(FamilyView.this);
                }
            } else if (motionEvent.getAction() == 1 && (FamilyView.D(FamilyView.this) || !FamilyView.B(FamilyView.this))) {
                FamilyView.w(FamilyView.this).setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
                if (FamilyView.h(FamilyView.this)) {
                    FamilyView.i(FamilyView.this);
                }
                FamilyView.j(FamilyView.this);
                FamilyView.k(FamilyView.this);
                FamilyView.G(FamilyView.this, true);
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FamilyView.w(FamilyView.this).setTranslationX(((jr7.e() - FamilyView.w(FamilyView.this).getMeasuredWidth()) / 2) - jr7.a(12.0f));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class h implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMember f10521a;

        public h(FamilyMember familyMember) {
            this.f10521a = familyMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.l(FamilyView.this, this.f10521a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class i implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FamilyView.w(FamilyView.this).setAlpha(0.38f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class j implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.m(FamilyView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class k implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.n(FamilyView.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class l implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMember f10525a;

        public l(FamilyMember familyMember) {
            this.f10525a = familyMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.l(FamilyView.this, this.f10525a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class m implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMember f10526a;

        public m(FamilyMember familyMember) {
            this.f10526a = familyMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.l(FamilyView.this, this.f10526a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class n implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ FamilyMember f10527a;

        public n(FamilyMember familyMember) {
            this.f10527a = familyMember;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                FamilyView.l(FamilyView.this, this.f10527a);
            }
        }
    }

    public FamilyView(Context context) {
        this.f10510a = context;
    }

    public static /* synthetic */ long A(FamilyView familyView, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("75912c24", new Object[]{familyView, new Long(j2)})).longValue();
        }
        familyView.s = j2;
        return j2;
    }

    public static /* synthetic */ boolean B(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d90c42b9", new Object[]{familyView})).booleanValue();
        }
        return familyView.t;
    }

    public static /* synthetic */ boolean C(FamilyView familyView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b257145", new Object[]{familyView, new Boolean(z)})).booleanValue();
        }
        familyView.t = z;
        return z;
    }

    public static /* synthetic */ boolean D(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("da429598", new Object[]{familyView})).booleanValue();
        }
        return familyView.u;
    }

    public static /* synthetic */ boolean E(FamilyView familyView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c0b97a46", new Object[]{familyView, new Boolean(z)})).booleanValue();
        }
        familyView.u = z;
        return z;
    }

    public static /* synthetic */ Context F(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("faffde6b", new Object[]{familyView});
        }
        return familyView.f10510a;
    }

    public static /* synthetic */ void G(FamilyView familyView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b938e1c2", new Object[]{familyView, new Boolean(z)});
        } else {
            familyView.V(z);
        }
    }

    public static /* synthetic */ int c(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d1c6516e", new Object[]{familyView})).intValue();
        }
        return familyView.o;
    }

    public static /* synthetic */ int d(FamilyView familyView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b9acfb5d", new Object[]{familyView, new Integer(i2)})).intValue();
        }
        familyView.o = i2;
        return i2;
    }

    public static /* synthetic */ int e(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d2fca44d", new Object[]{familyView})).intValue();
        }
        return familyView.p;
    }

    public static /* synthetic */ void f(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d022842c", new Object[]{familyView});
        } else {
            familyView.a0();
        }
    }

    public static /* synthetic */ int g(FamilyView familyView, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df41045e", new Object[]{familyView, new Integer(i2)})).intValue();
        }
        familyView.p = i2;
        return i2;
    }

    public static /* synthetic */ boolean h(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d158d70f", new Object[]{familyView})).booleanValue();
        }
        return familyView.Z();
    }

    public static /* synthetic */ void i(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d28f29ea", new Object[]{familyView});
        } else {
            familyView.b0();
        }
    }

    public static /* synthetic */ void j(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c57cc9", new Object[]{familyView});
        } else {
            familyView.R();
        }
    }

    public static /* synthetic */ void k(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4fbcfa8", new Object[]{familyView});
        } else {
            familyView.H();
        }
    }

    public static /* synthetic */ void l(FamilyView familyView, FamilyMember familyMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2c3be80", new Object[]{familyView, familyMember});
        } else {
            familyView.N(familyMember);
        }
    }

    public static /* synthetic */ void m(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d7687566", new Object[]{familyView});
        } else {
            familyView.c0();
        }
    }

    public static /* synthetic */ void n(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d89ec845", new Object[]{familyView});
        } else {
            familyView.L();
        }
    }

    public static /* synthetic */ boolean o(FamilyView familyView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b377a6b6", new Object[]{familyView, new Boolean(z)})).booleanValue();
        }
        familyView.m = z;
        return z;
    }

    public static /* synthetic */ View p(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("95c9ab85", new Object[]{familyView});
        }
        return familyView.l;
    }

    public static /* synthetic */ float q(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d432f729", new Object[]{familyView})).floatValue();
        }
        return familyView.q;
    }

    public static /* synthetic */ boolean r(FamilyView familyView, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("13c475cd", new Object[]{familyView, new Boolean(z)})).booleanValue();
        }
        familyView.n = z;
        return z;
    }

    public static /* synthetic */ float s(FamilyView familyView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4d50219", new Object[]{familyView, new Float(f2)})).floatValue();
        }
        familyView.q = f2;
        return f2;
    }

    public static /* synthetic */ void t(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6ece00c", new Object[]{familyView});
        } else {
            familyView.U();
        }
    }

    public static /* synthetic */ Handler u(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("993f05fb", new Object[]{familyView});
        }
        return familyView.w;
    }

    public static /* synthetic */ xqk v(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xqk) ipChange.ipc$dispatch("6d6b7431", new Object[]{familyView});
        }
        return familyView.x;
    }

    public static /* synthetic */ View w(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dde28c5a", new Object[]{familyView});
        }
        return familyView.d;
    }

    public static /* synthetic */ float x(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d69f9ce7", new Object[]{familyView})).floatValue();
        }
        return familyView.r;
    }

    public static /* synthetic */ float y(FamilyView familyView, float f2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4ffd141b", new Object[]{familyView, new Float(f2)})).floatValue();
        }
        familyView.r = f2;
        return f2;
    }

    public static /* synthetic */ long z(FamilyView familyView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d7d5efca", new Object[]{familyView})).longValue();
        }
        return familyView.s;
    }

    public final void H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da0466d", new Object[]{this});
            return;
        }
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        int measuredWidth = this.d.getMeasuredWidth();
        int e2 = jr7.e();
        int i2 = iArr[0] + (measuredWidth / 2);
        int a2 = ((e2 - measuredWidth) / 2) - jr7.a(12.0f);
        if (i2 > e2 / 2) {
            this.d.setTranslationX(a2);
        } else {
            this.d.setTranslationX(-a2);
        }
    }

    public final void I() {
        float f2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ece8ca10", new Object[]{this});
            return;
        }
        if (this.d.getTranslationX() > 0.0f) {
            z = true;
        }
        float translationX = this.d.getTranslationX();
        float translationY = this.d.getTranslationY();
        int a2 = jr7.a(50.0f);
        int i2 = (int) (a2 * 1.5d);
        if (z) {
            f2 = translationX - i2;
        } else {
            f2 = i2 + translationX;
        }
        if (this.h.getVisibility() == 0) {
            this.h.setTranslationX(f2);
            this.h.setTranslationY(translationY - a2);
        }
        if (this.i.getVisibility() == 0) {
            this.i.setTranslationX(f2);
            this.i.setTranslationY(a2 + translationY);
        }
        if (this.j.getVisibility() == 0) {
            this.j.setTranslationX(translationX);
            this.j.setTranslationY(translationY - (a2 * 2));
        }
        if (this.k.getVisibility() == 0) {
            this.k.setTranslationX(translationX);
            this.k.setTranslationY(translationY + (a2 * 2));
        }
    }

    public final void J() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7879e767", new Object[]{this});
        } else if (((ArrayList) this.b).size() == 3) {
            K();
        } else {
            I();
        }
    }

    public final void K() {
        float f2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3719ca53", new Object[]{this});
            return;
        }
        if (this.d.getTranslationX() > 0.0f) {
            z = true;
        }
        float translationX = this.d.getTranslationX();
        float translationY = this.d.getTranslationY();
        int a2 = jr7.a(50.0f);
        if (z) {
            f2 = translationX - (a2 * 2);
        } else {
            f2 = (a2 * 2) + translationX;
        }
        if (this.h.getVisibility() == 0) {
            this.h.setTranslationX(f2);
            this.h.setTranslationY(translationY);
        }
        if (this.i.getVisibility() == 0) {
            this.i.setTranslationX(translationX);
            this.i.setTranslationY(translationY - (a2 * 2));
        }
        if (this.j.getVisibility() == 0) {
            this.j.setTranslationX(translationX);
            this.j.setTranslationY(translationY + (a2 * 2));
        }
    }

    public final void L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcfe7c14", new Object[]{this});
            return;
        }
        ViewProxy.setOnTouchListener(this.d, this.y);
        ViewProxy.setOnClickListener(this.d, new j());
        V(true);
        this.e.setVisibility(0);
        this.e.setImageDrawable(P(R.drawable.ic_family_dialog_center_bubble));
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        this.h.setVisibility(8);
        this.i.setVisibility(8);
        this.j.setVisibility(8);
        this.k.setVisibility(8);
    }

    public final List<FamilyMember> M(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a3b36b2", new Object[]{this, list});
        }
        ArrayList arrayList = new ArrayList();
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                if (obj instanceof FamilyMember) {
                    arrayList.add((FamilyMember) obj);
                }
            }
        }
        return arrayList;
    }

    public final void N(FamilyMember familyMember) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7104f27b", new Object[]{this, familyMember});
        } else {
            Nav.from(this.f10510a).toUri(Uri.parse("http://tb.cn/n/im/dynamic/chat.html?bizType=10001&targetType=3").buildUpon().appendQueryParameter("targetId", familyMember.userId).build());
        }
    }

    public final Activity O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("d8e4874f", new Object[]{this});
        }
        WeakReference<Activity> n2 = yca.p().n();
        if (n2 != null && n2.get() != null) {
            return n2.get();
        }
        Context context = this.f10510a;
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    public final Drawable P(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Drawable) ipChange.ipc$dispatch("1029c013", new Object[]{this, new Integer(i2)});
        }
        RoundedBitmapDrawable create = RoundedBitmapDrawableFactory.create(this.f10510a.getResources(), BitmapFactory.decodeResource(this.f10510a.getResources(), i2));
        create.setCircular(true);
        return create;
    }

    public View Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        View view = this.c;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.c.getParent()).removeView(this.c);
            }
            return this.c;
        }
        View inflate = LayoutInflater.from(this.f10510a).inflate(R.layout.dialog_family, (ViewGroup) null, false);
        this.c = inflate;
        View findViewById = inflate.findViewById(R.id.family_dialog_center_bubble_rl);
        this.d = findViewById;
        findViewById.setVisibility(8);
        this.e = (ImageView) this.c.findViewById(R.id.family_dialog_center_bubble_iv);
        this.f = (TextView) this.c.findViewById(R.id.family_dialog_center_bubble_relation_tv);
        this.g = (TextView) this.c.findViewById(R.id.family_dialog_center_bubble_remark_tv);
        View findViewById2 = this.c.findViewById(R.id.family_dialog_bubble1_rl);
        this.h = findViewById2;
        findViewById2.setVisibility(8);
        View findViewById3 = this.c.findViewById(R.id.family_dialog_bubble2_rl);
        this.i = findViewById3;
        findViewById3.setVisibility(8);
        View findViewById4 = this.c.findViewById(R.id.family_dialog_bubble3_rl);
        this.j = findViewById4;
        findViewById4.setVisibility(8);
        View findViewById5 = this.c.findViewById(R.id.family_dialog_bubble4_rl);
        this.k = findViewById5;
        findViewById5.setVisibility(8);
        View findViewById6 = this.c.findViewById(R.id.family_dialog_delete_area);
        this.l = findViewById6;
        findViewById6.setVisibility(8);
        return this.c;
    }

    public final boolean S(View view, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9d12ac48", new Object[]{this, view, new Integer(i2), new Integer(i3)})).booleanValue();
        }
        if (view.getVisibility() != 0) {
            return false;
        }
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        if (i2 <= rect.left || i2 >= rect.right || i3 <= rect.top || i3 >= rect.bottom) {
            return false;
        }
        return true;
    }

    public final void T(int i2, int i3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edff3e52", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (!S(this.d, i2, i3) && !S(this.h, i2, i3) && !S(this.i, i2, i3) && !S(this.j, i2, i3) && !S(this.k, i2, i3)) {
            z = false;
        }
        this.v = z;
    }

    public final void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c10e9fe", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.d.postDelayed(new i(), 3000L);
        } else {
            this.d.setAlpha(1.0f);
        }
    }

    public void W(xqk xqkVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b4a082c", new Object[]{this, xqkVar});
        } else {
            this.x = xqkVar;
        }
    }

    public final void X(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6598a8a7", new Object[]{this, textView, str});
            return;
        }
        textView.setText(str);
        if (!TextUtils.isEmpty(str)) {
            if (str.length() <= 2) {
                textView.setTextSize(2, 16.0f);
            } else {
                textView.setTextSize(2, 17.0f);
            }
        }
    }

    public final void Y(TextView textView, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498aff23", new Object[]{this, textView, str});
        } else if (str == null) {
            textView.setText((CharSequence) null);
        } else if (str.length() > 2) {
            textView.setText(str.substring(0, 2));
        } else {
            textView.setText(str);
        }
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3271d4e", new Object[]{this})).booleanValue();
        }
        int[] iArr = new int[2];
        this.d.getLocationOnScreen(iArr);
        int measuredWidth = (this.d.getMeasuredWidth() / 2) + iArr[0];
        int measuredHeight = (this.d.getMeasuredHeight() / 2) + iArr[1];
        this.l.getLocationOnScreen(iArr);
        if (((int) Math.sqrt(Math.pow(measuredWidth - ((this.l.getMeasuredWidth() / 2) + iArr[0]), 2.0d) + Math.pow(measuredHeight - ((this.l.getMeasuredHeight() / 2) + iArr[1]), 2.0d))) <= Math.abs((this.l.getMeasuredWidth() / 2) - (this.d.getMeasuredWidth() / 2))) {
            return true;
        }
        return false;
    }

    @Override // tb.ao9
    public boolean a(View view, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7646547", new Object[]{this, view, motionEvent})).booleanValue();
        }
        if (this.c == null) {
            return false;
        }
        if (motionEvent.getAction() == 0) {
            T((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
        }
        if (!this.v) {
            return false;
        }
        try {
            this.c.dispatchTouchEvent(motionEvent);
        } catch (Throwable unused) {
        }
        return true;
    }

    @Override // tb.ao9
    public void b(List<Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("edd0be0e", new Object[]{this, list});
            return;
        }
        ((ArrayList) this.b).clear();
        ((ArrayList) this.b).addAll(M(list));
        if (this.c != null) {
            if (((ArrayList) this.b).isEmpty()) {
                this.c.setVisibility(8);
                return;
            }
            this.c.setVisibility(0);
            this.d.setVisibility(0);
            this.d.setBackgroundResource(R.drawable.bg_family_dialog_bubble_normal);
            this.d.post(new g());
            if (((ArrayList) this.b).size() == 1) {
                FamilyMember familyMember = (FamilyMember) ((ArrayList) this.b).get(0);
                this.e.setVisibility(8);
                this.f.setVisibility(0);
                X(this.f, familyMember.relationName);
                this.g.setVisibility(0);
                Y(this.g, familyMember.remarkName);
                ViewProxy.setOnClickListener(this.d, new h(familyMember));
                ViewProxy.setOnTouchListener(this.d, this.y);
                V(true);
                return;
            }
            L();
        }
    }

    public final void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("759faaf7", new Object[]{this});
            return;
        }
        Activity O = O();
        if (O != null) {
            BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(O, R.style.BottomSheetDialog);
            View inflate = LayoutInflater.from(O).inflate(R.layout.dialog_family_delete, (ViewGroup) null, false);
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.family_dialog_delete_confirm_button), new d(bottomSheetDialog));
            ViewProxy.setOnClickListener(inflate.findViewById(R.id.family_dialog_delete_cancel_button), new e(this, bottomSheetDialog));
            bottomSheetDialog.setContentView(inflate);
            bottomSheetDialog.setCancelable(true);
            bottomSheetDialog.setCanceledOnTouchOutside(true);
            bottomSheetDialog.show();
        }
    }

    public final void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ae346f", new Object[]{this});
            return;
        }
        this.e.setImageDrawable(P(R.drawable.ic_family_dialog_close));
        this.f.setVisibility(8);
        this.g.setVisibility(8);
        ViewProxy.setOnTouchListener(this.d, null);
        ViewProxy.setOnClickListener(this.d, new k());
        V(false);
        FamilyMember familyMember = (FamilyMember) ((ArrayList) this.b).get(0);
        this.h.setVisibility(0);
        View view = this.h;
        int i2 = R.drawable.bg_family_dialog_bubble_normal;
        view.setBackgroundResource(i2);
        ViewProxy.setOnClickListener(this.h, new l(familyMember));
        X((TextView) this.h.findViewById(R.id.family_dialog_bubble1_relation_tv), familyMember.relationName);
        Y((TextView) this.h.findViewById(R.id.family_dialog_bubble1_remark_tv), familyMember.remarkName);
        FamilyMember familyMember2 = (FamilyMember) ((ArrayList) this.b).get(1);
        this.i.setVisibility(0);
        this.i.setBackgroundResource(i2);
        ViewProxy.setOnClickListener(this.i, new m(familyMember2));
        X((TextView) this.i.findViewById(R.id.family_dialog_bubble2_relation_tv), familyMember2.relationName);
        Y((TextView) this.i.findViewById(R.id.family_dialog_bubble2_remark_tv), familyMember2.remarkName);
        if (((ArrayList) this.b).size() >= 3) {
            FamilyMember familyMember3 = (FamilyMember) ((ArrayList) this.b).get(2);
            this.j.setVisibility(0);
            this.j.setBackgroundResource(i2);
            ViewProxy.setOnClickListener(this.j, new n(familyMember3));
            X((TextView) this.j.findViewById(R.id.family_dialog_bubble3_relation_tv), familyMember3.relationName);
            Y((TextView) this.j.findViewById(R.id.family_dialog_bubble3_remark_tv), familyMember3.remarkName);
        }
        if (((ArrayList) this.b).size() >= 4) {
            FamilyMember familyMember4 = (FamilyMember) ((ArrayList) this.b).get(3);
            this.k.setVisibility(0);
            this.k.setBackgroundResource(i2);
            ViewProxy.setOnClickListener(this.k, new a(familyMember4));
            X((TextView) this.k.findViewById(R.id.family_dialog_bubble4_relation_tv), familyMember4.relationName);
            Y((TextView) this.k.findViewById(R.id.family_dialog_bubble4_remark_tv), familyMember4.remarkName);
        }
        J();
    }

    public final void U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68d88243", new Object[]{this});
            return;
        }
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.family.updateGlobalBubbleSwitch");
        mtopRequest.setVersion("1.0");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("switchType", (Object) 0);
        mtopRequest.setData(jSONObject.toString());
        MtopBusiness.build(Mtop.instance(null, this.f10510a.getApplicationContext(), TaoHelper.getTTID()), mtopRequest).reqMethod(MethodEnum.POST).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.family.globalbubble2.view.FamilyView.15
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.family.globalbubble2.view.FamilyView$15$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class a implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(FamilyView.F(FamilyView.this), "删除失败，请稍后重试", 0).show();
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.family.globalbubble2.view.FamilyView$15$b */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class b implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public b() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else if (FamilyView.v(FamilyView.this) != null) {
                        FamilyView.v(FamilyView.this).a();
                    }
                }
            }

            /* compiled from: Taobao */
            /* renamed from: com.taobao.family.globalbubble2.view.FamilyView$15$c */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
            public class c implements Runnable {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public c() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    } else {
                        Toast.makeText(FamilyView.F(FamilyView.this), "删除失败，请稍后重试", 0).show();
                    }
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    y7t.a("FamilyView", "onError:" + mtopResponse.getResponseCode() + "|" + mtopResponse.getRetMsg());
                }
                FamilyView.u(FamilyView.this).post(new c());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i2, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i2), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse != null) {
                    y7t.a("FamilyView", "onSuccess:" + mtopResponse.getDataJsonObject());
                }
                FamilyView.u(FamilyView.this).post(new b());
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i2, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i2), mtopResponse, obj});
                    return;
                }
                if (mtopResponse != null) {
                    y7t.a("FamilyView", "onSystemError:" + mtopResponse.getResponseCode() + "|" + mtopResponse.getRetMsg());
                }
                FamilyView.u(FamilyView.this).post(new a());
            }
        }).startRequest();
    }

    public final void R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6802a341", new Object[]{this});
        } else if (this.l.getVisibility() != 8 && !this.n) {
            this.n = true;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "alpha", 1.0f, 0.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", 0.0f, 100.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new c());
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        }
    }

    public final void a0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c4f7dbc", new Object[]{this});
        } else if (this.l.getVisibility() != 0 && !this.m) {
            this.m = true;
            this.l.setVisibility(0);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.l, "alpha", 0.0f, 1.0f);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.l, "translationY", 100.0f, 0.0f);
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.addListener(new b());
            animatorSet.setDuration(100L);
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.start();
        }
    }
}
