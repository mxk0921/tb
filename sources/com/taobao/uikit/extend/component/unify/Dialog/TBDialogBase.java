package com.taobao.uikit.extend.component.unify.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBDialogBase extends Dialog implements DialogInterface.OnShowListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private DialogInterface.OnShowListener mShowListener;
    public TBDialogRootLayout view;

    static {
        t2o.a(932184140);
    }

    public TBDialogBase(Context context, int i) {
        super(context, i);
    }

    public static /* synthetic */ Object ipc$super(TBDialogBase tBDialogBase, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -811600849) {
            super.setOnShowListener((DialogInterface.OnShowListener) objArr[0]);
            return null;
        } else if (hashCode == 921927566) {
            super.setContentView((View) objArr[0], (ViewGroup.LayoutParams) objArr[1]);
            return null;
        } else if (hashCode == 1683598447) {
            super.setContentView((View) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/uikit/extend/component/unify/Dialog/TBDialogBase");
        }
    }

    @Override // android.app.Dialog
    public View findViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("6fb8a9ae", new Object[]{this, new Integer(i)});
        }
        return this.view.findViewById(i);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d64de6c3", new Object[]{this, dialogInterface});
            return;
        }
        DialogInterface.OnShowListener onShowListener = this.mShowListener;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(int i) throws IllegalAccessError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("698903e0", new Object[]{this, new Integer(i)});
            return;
        }
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf9ff42f", new Object[]{this, onShowListener});
        } else {
            this.mShowListener = onShowListener;
        }
    }

    public final void setOnShowListenerInternal() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb80536", new Object[]{this});
        } else {
            super.setOnShowListener(this);
        }
    }

    public final void setViewInternal(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8574be67", new Object[]{this, view});
        } else {
            super.setContentView(view);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view) throws IllegalAccessError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6459ac6f", new Object[]{this, view});
            return;
        }
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }

    public final void setViewInternal(View view, ViewGroup.LayoutParams layoutParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff26c896", new Object[]{this, view, layoutParams});
        } else {
            super.setContentView(view, layoutParams);
        }
    }

    @Override // android.app.Dialog
    @Deprecated
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) throws IllegalAccessError {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f37f8e", new Object[]{this, view, layoutParams});
            return;
        }
        throw new IllegalAccessError("setContentView() is not supported in MaterialDialog. Specify a custom view in the Builder instead.");
    }
}
