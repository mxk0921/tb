package com.taobao.android.sku.widget;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatDialog;
import androidx.appcompat.app.AppCompatDialogFragment;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.SkuCore;
import com.taobao.android.sku.presenter.AliXSkuPresenterEngine;
import com.taobao.android.sku.utils.SkuLogUtils;
import java.lang.reflect.Field;
import tb.h6e;
import tb.nfb;
import tb.o2q;
import tb.rgv;
import tb.sgv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SkuDialogFragment extends AppCompatDialogFragment implements h6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public AliXSkuPresenterEngine.c S0;
    public rgv T0;

    /* renamed from: a  reason: collision with root package name */
    public View f9485a;
    public boolean c;
    public boolean d;
    public DialogInterface.OnDismissListener e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public nfb l;
    public AliXSkuPresenterEngine.b m;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Window f9487a;

        public a(Window window) {
            this.f9487a = window;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f9487a.setWindowAnimations(SkuDialogFragment.r2(SkuDialogFragment.this));
            }
        }
    }

    static {
        t2o.a(442499374);
        t2o.a(157286907);
    }

    public static /* synthetic */ Object ipc$super(SkuDialogFragment skuDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1840095042:
                super.setupDialog((Dialog) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -596517775:
                super.show((FragmentManager) objArr[0], (String) objArr[1]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1002290867:
                super.onActivityCreated((Bundle) objArr[0]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/widget/SkuDialogFragment");
        }
    }

    public static /* synthetic */ AliXSkuPresenterEngine.b p2(SkuDialogFragment skuDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AliXSkuPresenterEngine.b) ipChange.ipc$dispatch("eb01eead", new Object[]{skuDialogFragment});
        }
        return skuDialogFragment.m;
    }

    public static /* synthetic */ int r2(SkuDialogFragment skuDialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("25132b8d", new Object[]{skuDialogFragment})).intValue();
        }
        return skuDialogFragment.k;
    }

    public void A2(AliXSkuPresenterEngine.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c3841ad", new Object[]{this, bVar});
        } else {
            this.m = bVar;
        }
    }

    public void B2(DialogInterface.OnDismissListener onDismissListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29d2d87", new Object[]{this, onDismissListener});
        } else {
            this.e = onDismissListener;
        }
    }

    public void C2(nfb nfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("327992e9", new Object[]{this, nfbVar});
        } else {
            this.l = nfbVar;
        }
    }

    @Override // tb.h6e
    public rgv D0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("9c85efa3", new Object[]{this, str});
        }
        return null;
    }

    @Override // tb.h6e
    public rgv M0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rgv) ipChange.ipc$dispatch("e33438b6", new Object[]{this});
        }
        if (this.T0 == null) {
            this.T0 = new rgv();
        }
        return this.T0;
    }

    public final void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4fc433", new Object[]{this});
        } else if (o2q.c("enable_unexpect_reach_monitor")) {
            AliXSkuPresenterEngine.c cVar = this.S0;
            if (cVar == null) {
                SkuLogUtils.l("SkuDialogFragment", "onGetPageInfoListener is null");
                return;
            }
            JSONObject a2 = ((SkuCore.b) cVar).a();
            if (a2 == null || a2.isEmpty()) {
                SkuLogUtils.l("SkuDialogFragment", "onGetPageInfoListener pageInfo is null");
                return;
            }
            String string = a2.getString("url");
            if (TextUtils.isEmpty(string)) {
                SkuLogUtils.l("SkuDialogFragment", "onGetPageInfoListener url is empty :" + string);
                return;
            }
            sgv.h(M0(), string);
        }
    }

    public void f(AliXSkuPresenterEngine.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("633d7b7d", new Object[]{this, cVar});
        } else {
            this.S0 = cVar;
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ce275e1", new Object[]{this});
        } else if (o2q.c("enable_unexpect_reach_monitor")) {
            sgv.i(M0());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bbdbeb3", new Object[]{this, bundle});
            return;
        }
        super.onActivityCreated(bundle);
        if (getDialog() != null && this.d) {
            u2(getDialog());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        g();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        setStyle(1, 0);
        return new AppCompatDialog(getContext(), getTheme()) { // from class: com.taobao.android.sku.widget.SkuDialogFragment.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 143326307) {
                    super.onBackPressed();
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/sku/widget/SkuDialogFragment$1");
            }

            @Override // androidx.activity.ComponentDialog, android.app.Dialog
            public void onBackPressed() {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("88afc63", new Object[]{this});
                } else if (SkuDialogFragment.p2(SkuDialogFragment.this) == null || !SkuDialogFragment.p2(SkuDialogFragment.this).onBackPressed()) {
                    super.onBackPressed();
                }
            }
        };
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return this.f9485a;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c9109f4", new Object[]{this, dialogInterface});
            return;
        }
        super.onDismiss(dialogInterface);
        this.c = false;
        DialogInterface.OnDismissListener onDismissListener = this.e;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        nfb nfbVar = this.l;
        if (nfbVar != null) {
            nfbVar.c();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        nfb nfbVar = this.l;
        if (nfbVar != null) {
            nfbVar.a();
        }
        if (this.f9485a != null && getDialog() != null && getDialog().getWindow() != null) {
            this.f9485a.post(new a(getDialog().getWindow()));
        } else if (this.f9485a == null && o2q.c("enableDismissSkuOnRecover")) {
            dismiss();
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
        nfb nfbVar = this.l;
        if (nfbVar != null) {
            nfbVar.d();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        if (!(getDialog() == null || getDialog().getWindow() == null)) {
            getDialog().getWindow().setWindowAnimations(0);
        }
        nfb nfbVar = this.l;
        if (nfbVar != null) {
            nfbVar.e();
        }
        e();
    }

    public void s2(int i, int i2, int i3, int i4, int i5, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b405587", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6)});
            return;
        }
        this.d = true;
        this.f = i;
        this.g = i2;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public void setupDialog(Dialog dialog, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("925260be", new Object[]{this, dialog, new Integer(i)});
            return;
        }
        super.setupDialog(dialog, i);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setSoftInputMode(51);
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
            window.setStatusBarColor(0);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        if (!this.c) {
            try {
                Field declaredField = DialogFragment.class.getDeclaredField("mDismissed");
                declaredField.setAccessible(true);
                declaredField.set(this, Boolean.FALSE);
                Field declaredField2 = DialogFragment.class.getDeclaredField("mShownByMe");
                declaredField2.setAccessible(true);
                declaredField2.set(this, Boolean.TRUE);
                FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
                beginTransaction.add(this, str);
                beginTransaction.commitAllowingStateLoss();
            } catch (Throwable th) {
                super.show(fragmentManager, str);
                SkuLogUtils.i("fragment show error : " + th.getMessage());
            }
            this.c = true;
        }
    }

    public final void u2(Dialog dialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8f480bd", new Object[]{this, dialog});
            return;
        }
        Window window = dialog.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = this.h;
        attributes.width = this.f;
        attributes.height = this.g;
        attributes.x = this.i;
        attributes.y = this.j;
        attributes.windowAnimations = this.k;
        window.setAttributes(attributes);
        window.setBackgroundDrawableResource(17170445);
        window.clearFlags(131072);
    }

    public boolean v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d3c33646", new Object[]{this})).booleanValue();
        }
        if (this.c || (getDialog() != null && getDialog().isShowing())) {
            return true;
        }
        return false;
    }

    public void z2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
        } else {
            this.f9485a = view;
        }
    }
}
