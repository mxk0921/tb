package com.taobao.android.fluid.business.videocollection;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilitykit.ability.pop.render.IAKPopRender;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.business.videocollection.dramacollection.DramaPopContent;
import com.taobao.android.fluid.business.videocollection.normalcollection.NormalPopContent;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.taobao.R;
import java.util.HashMap;
import java.util.Map;
import tb.bob;
import tb.cob;
import tb.iim;
import tb.ir9;
import tb.kon;
import tb.nz3;
import tb.s6o;
import tb.t2o;
import tb.xau;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class PopupDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATION_DURATION = 300;
    public static final int POP_LAYER_HEIGHT = (int) ((s6o.m() + s6o.z(FluidSDK.getContext())) * 0.69d);
    public static final String TAG = "PopupDialog";

    /* renamed from: a  reason: collision with root package name */
    public int f7702a;
    public int c;
    public int d;
    public boolean e;
    public FluidContext g;
    public ValueAnimator h;
    public ValueAnimator i;
    public cob l;
    public iim m;
    public bob n;
    public boolean f = true;
    public boolean k = true;
    public boolean o = true;
    public boolean p = true;
    public final long j = SystemClock.uptimeMillis();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PopupDialog popupDialog = PopupDialog.this;
            int i = popupDialog.c;
            int i2 = popupDialog.d;
            float f = (i - i2) + (i2 * (1.0f - floatValue));
            PopupDialog popupDialog2 = PopupDialog.this;
            int i3 = popupDialog2.c;
            int i4 = popupDialog2.d;
            popupDialog2.l.o(new com.taobao.android.fluid.framework.data.datamodel.pop.a(i3, i3 - i4, 0, (int) f, i4, popupDialog2.f7702a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
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
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/PopupDialog$2");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            int i2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            PopupDialog popupDialog = PopupDialog.this;
            float f = popupDialog.c - popupDialog.d;
            PopupDialog popupDialog2 = PopupDialog.this;
            popupDialog2.l.m(IAKPopRender.LifecycleType.IN_ANIMATION_END, new com.taobao.android.fluid.framework.data.datamodel.pop.a(popupDialog2.c, i - i2, 0, (int) f, popupDialog2.d, popupDialog2.f7702a));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                return;
            }
            super.onAnimationStart(animator, z);
            PopupDialog popupDialog = PopupDialog.this;
            int i = popupDialog.c;
            int i2 = popupDialog.d;
            popupDialog.l.m(IAKPopRender.LifecycleType.IN_ANIMATION_START, new com.taobao.android.fluid.framework.data.datamodel.pop.a(i, i - i2, 0, PopupDialog.this.c, i2, popupDialog.f7702a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PopupDialog popupDialog = PopupDialog.this;
            int i = popupDialog.c;
            int i2 = popupDialog.d;
            float f = (i - i2) + (i2 * floatValue);
            PopupDialog popupDialog2 = PopupDialog.this;
            int i3 = popupDialog2.c;
            int i4 = popupDialog2.d;
            popupDialog2.l.o(new com.taobao.android.fluid.framework.data.datamodel.pop.a(i3 - i4, i3, 0, (int) f, i4, popupDialog2.f7702a));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            if (str.hashCode() == -2145066406) {
                super.onAnimationEnd((Animator) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/PopupDialog$4");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
                return;
            }
            super.onAnimationEnd(animator);
            PopupDialog.p2(PopupDialog.this);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcb3fd3", new Object[]{this, animator, new Boolean(z)});
                return;
            }
            super.onAnimationStart(animator, z);
            PopupDialog popupDialog = PopupDialog.this;
            PopupDialog popupDialog2 = PopupDialog.this;
            int i = popupDialog2.c;
            int i2 = popupDialog2.d;
            popupDialog2.l.m(IAKPopRender.LifecycleType.OUT_ANIMATION_START, new com.taobao.android.fluid.framework.data.datamodel.pop.a(i, i - i2, 0, popupDialog.c - popupDialog.d, i2, popupDialog2.f7702a));
        }
    }

    static {
        t2o.a(468713666);
    }

    public static /* synthetic */ Object ipc$super(PopupDialog popupDialog, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/videocollection/PopupDialog");
        }
    }

    public static /* synthetic */ void p2(PopupDialog popupDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("291abea3", new Object[]{popupDialog});
        } else {
            popupDialog.r2();
        }
    }

    public static PopupDialog z2(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupDialog) ipChange.ipc$dispatch("e61adfd1", new Object[]{fluidContext});
        }
        PopupDialog popupDialog = new PopupDialog();
        popupDialog.D2(fluidContext);
        return popupDialog;
    }

    public final void B2() {
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df014d18", new Object[]{this});
        } else if (this.n != null) {
            Map<String, Map<String, Object>> map2 = ((IDataService) this.g.getService(IDataService.class)).getConfig().j().I;
            if (map2 != null) {
                map = map2.get("header");
            } else {
                map = null;
            }
            this.n.b(((IDataService) this.g.getService(IDataService.class)).getCurrentMediaSetData(), map);
        }
    }

    public void C2(cob cobVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a623a7bd", new Object[]{this, cobVar});
        } else {
            this.l = cobVar;
        }
    }

    public void D2(FluidContext fluidContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6d2e4d40", new Object[]{this, fluidContext});
            return;
        }
        this.g = fluidContext;
        this.n = A2(fluidContext);
    }

    public void E2(iim iimVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eda2ff07", new Object[]{this, iimVar});
        } else {
            this.m = iimVar;
        }
    }

    public void J2(kon.h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e030105a", new Object[]{this, hVar});
            return;
        }
        bob bobVar = this.n;
        if (bobVar == null) {
            return;
        }
        if (this.o) {
            B2();
        } else {
            bobVar.d(hVar);
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(0, R.style.FluidDialogTheme);
        bob bobVar = this.n;
        if (bobVar != null) {
            bobVar.onCreate();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        bob bobVar = this.n;
        if (bobVar != null) {
            bobVar.onDestroy();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.e = false;
        nz3.j(this.g, false);
        this.f = false;
        this.d = POP_LAYER_HEIGHT;
        if (getDialog() == null) {
            r2();
        } else if (!this.k) {
            r2();
        } else if (getDialog().getWindow() == null || this.l == null) {
            r2();
        } else {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.i = ofFloat;
            ofFloat.setDuration(300L);
            this.i.addUpdateListener(new c());
            this.i.addListener(new d());
            this.i.start();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        if (isAdded() && getActivity() != null && !getActivity().isFinishing()) {
            this.k = true;
            this.d = POP_LAYER_HEIGHT;
            this.f7702a = getResources().getDisplayMetrics().widthPixels;
            this.c = getResources().getDisplayMetrics().heightPixels + s6o.z(getContext());
            if (getDialog().getWindow() != null && this.l != null) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.setDuration(300L);
                this.h.addUpdateListener(new a());
                this.h.addListener(new b());
                this.h.start();
            }
        }
    }

    public void s2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8249dc35", new Object[]{this, new Boolean(z)});
            return;
        }
        this.k = z;
        dismissAllowingStateLoss();
    }

    public bob u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bob) ipChange.ipc$dispatch("84eaa8aa", new Object[]{this});
        }
        return this.n;
    }

    public boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a92ee174", new Object[]{this})).booleanValue();
        }
        return this.e;
    }

    public void K2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e91cc8b", new Object[]{this});
        } else if (getView() != null) {
            this.o = false;
            B2();
            HashMap hashMap = new HashMap();
            hashMap.put("svm_cost", String.valueOf(SystemClock.uptimeMillis() - this.j));
            hashMap.put("isNative", "true");
            xau.E(this.g, "Button-GlobalWebPopHasShow", hashMap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        ((ViewGroup.LayoutParams) attributes).width = -1;
        ((ViewGroup.LayoutParams) attributes).height = POP_LAYER_HEIGHT;
        getDialog().getWindow().setGravity(80);
        getDialog().getWindow().setAttributes(attributes);
        if (this.p) {
            HashMap hashMap = new HashMap();
            hashMap.put("svm_cost", String.valueOf(SystemClock.uptimeMillis() - this.j));
            hashMap.put("isNative", "true");
            xau.E(this.g, "Button-GlobalWebPopWillShow", hashMap);
            this.p = false;
        }
        super.onResume();
    }

    public final void r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("764f9306", new Object[]{this});
            return;
        }
        int i = this.c;
        int i2 = this.d;
        com.taobao.android.fluid.framework.data.datamodel.pop.a aVar = new com.taobao.android.fluid.framework.data.datamodel.pop.a(i, i - i2, 0, i, i2, this.f7702a);
        cob cobVar = this.l;
        if (cobVar != null) {
            cobVar.m(IAKPopRender.LifecycleType.BEFORE_CLOSE, aVar);
        }
        iim iimVar = this.m;
        if (iimVar != null) {
            iimVar.g(false);
        }
    }

    public final bob A2(FluidContext fluidContext) {
        JSONObject b2;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bob) ipChange.ipc$dispatch("2a9cf1e", new Object[]{this, fluidContext});
        }
        if (!FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("enableDramaPop", true) || (b2 = nz3.b(((IDataService) this.g.getService(IDataService.class)).getCurrentMediaSetData())) == null || !TextUtils.equals(b2.getString("collectionType"), "3")) {
            z = false;
        }
        ir9.b("PopupDialog", "makePopContent useDramaPop=" + z);
        if (z) {
            return new DramaPopContent(fluidContext, this);
        }
        return new NormalPopContent(fluidContext, this);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        ir9.b("PopupDialog", "onCreateView");
        this.e = true;
        nz3.j(this.g, true);
        getDialog().getWindow().setBackgroundDrawable(new ColorDrawable(0));
        bob bobVar = this.n;
        if (bobVar != null) {
            return bobVar.onCreateView(layoutInflater, viewGroup, bundle);
        }
        return new View(layoutInflater.getContext());
    }
}
