package com.taobao.android.detail.ttdetail.handler.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentHostCallback;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentManagerImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import java.lang.reflect.Field;
import tb.mr7;
import tb.nj7;
import tb.nos;
import tb.olq;
import tb.qhw;
import tb.t2o;
import tb.tgh;
import tb.tq4;
import tb.uv2;
import tb.vi8;
import tb.zao;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class FloatFragment extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_TITLE = "titleTextView";
    public Context d;
    public String e;
    public TextView f;
    public TextView g;
    public View h;
    public RelativeLayout i;
    public ListView j;
    public qhw k;
    public qhw l;
    public vi8 m;

    /* renamed from: a  reason: collision with root package name */
    public final int f6833a = 16973840;
    public final int c = R.color.detail_theme_color;
    public String n = null;
    public final View.OnClickListener o = new e();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements uv2 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(FloatFragment floatFragment) {
        }

        @Override // tb.uv2
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e9f05795", new Object[]{this, jSONObject});
            }
        }

        @Override // tb.uv2
        public void b(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e2ca4390", new Object[]{this, jSONObject});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements qhw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(FloatFragment floatFragment) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements qhw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(FloatFragment floatFragment) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements vi8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d(FloatFragment floatFragment) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            FloatFragment floatFragment = FloatFragment.this;
            floatFragment.r2(floatFragment.h);
            FloatFragment.this.A2();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements Animation.AnimationListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("724c33d", new Object[]{this, animation});
                return;
            }
            try {
                FloatFragment.this.dismissAllowingStateLoss();
            } catch (Throwable unused) {
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

    static {
        t2o.a(912261986);
    }

    public static void C2(FragmentActivity fragmentActivity, DialogFragment dialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("241c23d2", new Object[]{fragmentActivity, dialogFragment});
            return;
        }
        try {
            dialogFragment.show(fragmentActivity.getSupportFragmentManager(), dialogFragment.getTag());
        } catch (IllegalStateException e2) {
            tgh.c("FloatFragment", "startFragment", e2);
        }
    }

    public static /* synthetic */ Object ipc$super(FloatFragment floatFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1840095042:
                super.setupDialog((Dialog) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1373052399:
                super.dismiss();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 937454072:
                super.dismissAllowingStateLoss();
                return null;
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/FloatFragment");
        }
    }

    public void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("477ec71a", new Object[]{this});
        } else if (!z2()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 1.0f);
            translateAnimation.setDuration(300L);
            translateAnimation.setFillAfter(true);
            translateAnimation.setAnimationListener(new f());
            this.i.startAnimation(translateAnimation);
        } else {
            try {
                dismissAllowingStateLoss();
            } catch (Throwable unused) {
            }
        }
    }

    public void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4dd14d3", new Object[]{this});
        } else if (!z2()) {
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 1.0f, 1, 0.0f);
            translateAnimation.setDuration(300L);
            this.i.startAnimation(translateAnimation);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ae28e211", new Object[]{this});
        } else if (z2()) {
            olq.a(getActivity(), this.n);
        } else {
            super.dismiss();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void dismissAllowingStateLoss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37e069f8", new Object[]{this});
        } else if (z2()) {
            olq.a(getActivity(), this.n);
        } else {
            super.dismissAllowingStateLoss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return layoutInflater.inflate(R.layout.tt_detail_float_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        this.h = view.findViewById(R.id.ll_container);
        if (z2()) {
            this.h.setBackgroundColor(-1);
            this.h.setPadding(0, SystemBarDecorator.SystemBarConfig.getStatusBarHeight(mr7.d()), 0, 0);
            View findViewById = view.findViewById(R.id.tm_detail_background);
            if (findViewById != null) {
                findViewById.setVisibility(8);
            }
        }
        this.f = (TextView) view.findViewById(R.id.tv_title);
        this.g = (TextView) view.findViewById(R.id.tv_close);
        this.i = (RelativeLayout) view.findViewById(R.id.rl_panel);
        this.j = (ListView) view.findViewById(R.id.lv_data);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.fl_loading);
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(R.id.custome_data);
        this.k = v2();
        this.l = s2();
        this.m = u2();
        if (!TextUtils.isEmpty(this.e)) {
            this.f.setText(this.e);
        } else {
            this.f.setVisibility(8);
        }
        this.g.setBackgroundResource(this.c);
        this.g.setOnClickListener(this.o);
        ViewProxy.setOnClickListener(this.h, this.o);
        p2(this.h);
        B2();
    }

    public void p2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99fdd1cb", new Object[]{this, view});
        } else if (!z2()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
    }

    public void r2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43fec832", new Object[]{this, view});
        } else if (!z2()) {
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            alphaAnimation.setDuration(300L);
            view.startAnimation(alphaAnimation);
        }
    }

    public qhw s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qhw) ipChange.ipc$dispatch("190cb828", new Object[]{this});
        }
        return new c(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925260be", new Object[]{this, dialog, new Integer(i)});
            return;
        }
        super.setupDialog(dialog, i);
        if (dialog != null) {
            nos.b(tq4.c(this), dialog.getWindow(), false);
            nos.c(dialog.getWindow(), -1);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        zao j;
        if (nj7.h()) {
            try {
                Field declaredField = FragmentManagerImpl.class.getDeclaredField("mContainer");
                declaredField.setAccessible(true);
                Object obj = declaredField.get(fragmentManager);
                Field declaredField2 = FragmentHostCallback.class.getDeclaredField("mActivity");
                declaredField2.setAccessible(true);
                Activity activity = (Activity) declaredField2.get(obj);
                String str2 = "detail_float_" + System.currentTimeMillis();
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putString("stdPopPopId", str2);
                arguments.putFloat("stdPopMaxH", nj7.i(activity) ? 1.0f : 0.8f);
                setArguments(arguments);
                if (olq.j(activity, this, new a(this)).f32653a) {
                    this.n = str2;
                    return;
                }
                tgh.b("FloatFragment", "call StdPop fail on pad: " + j.b + ", " + j.c);
                return;
            } catch (Throwable th) {
                tgh.c("FloatFragment", "hook pop fail on pad", th);
            }
        }
        super.show(fragmentManager, str);
    }

    public vi8 u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vi8) ipChange.ipc$dispatch("86d65bb5", new Object[]{this});
        }
        return new d(this);
    }

    public qhw v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qhw) ipChange.ipc$dispatch("b95fd2d9", new Object[]{this});
        }
        return new b(this);
    }

    public boolean z2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ebede357", new Object[]{this})).booleanValue();
        }
        if (this.n != null) {
            return true;
        }
        return false;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.d = getActivity();
        setStyle(0, this.f6833a);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.e = arguments.getString(EXTRA_TITLE, "");
        }
    }
}
