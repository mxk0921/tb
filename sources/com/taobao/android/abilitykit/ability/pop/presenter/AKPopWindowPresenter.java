package com.taobao.android.abilitykit.ability.pop.presenter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.ut.monitor.DataReceiveMonitor;
import java.lang.ref.WeakReference;
import tb.a07;
import tb.ckf;
import tb.h9;
import tb.hab;
import tb.n9;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class AKPopWindowPresenter<PARAMS extends h9, CONTEXT extends n9> extends AKBasePopPresenter<PARAMS, CONTEXT> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public PopupWindow k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        static {
            t2o.a(336593007);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            PopupWindow x = AKPopWindowPresenter.x(AKPopWindowPresenter.this);
            if (x != null) {
                x.dismiss();
            }
        }
    }

    static {
        t2o.a(336593006);
    }

    public static /* synthetic */ Object ipc$super(AKPopWindowPresenter aKPopWindowPresenter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/abilitykit/ability/pop/presenter/AKPopWindowPresenter");
    }

    public static final /* synthetic */ PopupWindow x(AKPopWindowPresenter aKPopWindowPresenter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopupWindow) ipChange.ipc$dispatch("df770a38", new Object[]{aKPopWindowPresenter});
        }
        return aKPopWindowPresenter.k;
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter
    public void k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92c7c886", new Object[]{this});
            return;
        }
        PopupWindow popupWindow = this.k;
        if (popupWindow != null) {
            ckf.d(popupWindow);
            if (popupWindow.isShowing()) {
                PopupWindow popupWindow2 = this.k;
                ckf.d(popupWindow2);
                popupWindow2.dismiss();
                return;
            }
            new Handler(Looper.getMainLooper()).post(new b());
        }
    }

    @Override // com.taobao.android.abilitykit.ability.pop.presenter.AKBasePopPresenter
    public boolean l(final PARAMS params, final View view, final View view2, final View view3, hab.a aVar) {
        final Context context;
        View view4;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17152025", new Object[]{this, params, view, view2, view3, aVar})).booleanValue();
        }
        ckf.g(params, "params");
        ckf.g(view, "container");
        ckf.g(aVar, DataReceiveMonitor.CB_LISTENER);
        WeakReference<Context> n = n();
        if (!(n == null || (context = n.get()) == null)) {
            PopupWindow popupWindow = new PopupWindow(context);
            popupWindow.setFocusable(true);
            popupWindow.setOutsideTouchable(true);
            popupWindow.setBackgroundDrawable(null);
            if (params.f20479a.v()) {
                popupWindow.setSoftInputMode(16);
            }
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            popupWindow.setWidth(-1);
            popupWindow.setHeight(-1);
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(view, layoutParams);
            xhv xhvVar = xhv.INSTANCE;
            popupWindow.setContentView(frameLayout);
            popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: com.taobao.android.abilitykit.ability.pop.presenter.AKPopWindowPresenter$doShow$$inlined$apply$lambda$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // android.widget.PopupWindow.OnDismissListener
                public final void onDismiss() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("cab76ab2", new Object[]{this});
                    } else {
                        AKPopWindowPresenter.this.u();
                    }
                }
            });
            try {
                if (view3 != null) {
                    popupWindow.showAsDropDown(view3);
                } else {
                    if (!(context instanceof Activity)) {
                        context = null;
                    }
                    Activity activity = (Activity) context;
                    if (activity == null || (window = activity.getWindow()) == null || (view4 = window.getDecorView()) == null) {
                        view4 = view2;
                    }
                    popupWindow.showAtLocation(view4, 0, 0, 0);
                }
                this.k = popupWindow;
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
