package com.taobao.taobao.scancode.huoyan.ui;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import tb.eic;
import tb.t2o;
import tb.y7t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class KaDialogFragment extends DialogFragment implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public eic f12946a;
    public View.OnClickListener c;
    public boolean d;

    static {
        t2o.a(760217764);
    }

    public static /* synthetic */ Object ipc$super(KaDialogFragment kaDialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case -185779930:
                super.onCancel((DialogInterface) objArr[0]);
                return null;
            case 78846931:
                return new Integer(super.show((FragmentTransaction) objArr[0], (String) objArr[1]));
            case 1860817453:
                super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
                return null;
            case 2089880052:
                super.onDismiss((DialogInterface) objArr[0]);
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/huoyan/ui/KaDialogFragment");
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4ed3926", new Object[]{this, dialogInterface});
            return;
        }
        super.onCancel(dialogInterface);
        eic eicVar = this.f12946a;
        if (eicVar != null) {
            eicVar.onCancel();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        View.OnClickListener onClickListener = this.c;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setStyle(2, getTheme());
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
        } else {
            super.onDetach();
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
        this.d = false;
        eic eicVar = this.f12946a;
        if (eicVar != null) {
            eicVar.onDismiss();
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
        this.d = true;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        try {
            super.onStart();
        } catch (WindowManager.BadTokenException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        if (view != null) {
            ViewProxy.setOnClickListener(view, this);
        }
        if (getDialog() != null) {
            getDialog().setCanceledOnTouchOutside(true);
        }
        super.onViewCreated(view, bundle);
    }

    public final void p2(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ba6739", new Object[]{this, fragmentTransaction, str});
        } else if (fragmentTransaction != null) {
            try {
                Fragment findFragmentByTag = getFragmentManager().findFragmentByTag(str);
                if (findFragmentByTag != null) {
                    new StringBuilder("#####find dialog").append(str);
                    fragmentTransaction.remove(findFragmentByTag);
                }
            } catch (Exception unused) {
            }
        }
    }

    public void r2(eic eicVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c0a626e", new Object[]{this, eicVar});
        } else {
            this.f12946a = eicVar;
        }
    }

    public void s2(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8408cbf7", new Object[]{this, onClickListener});
        } else {
            this.c = onClickListener;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public synchronized int show(FragmentTransaction fragmentTransaction, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4b31bd3", new Object[]{this, fragmentTransaction, str})).intValue();
        }
        if (this.d) {
            p2(fragmentTransaction, str);
        }
        this.d = true;
        try {
            return super.show(fragmentTransaction, str);
        } catch (IllegalStateException e) {
            y7t.a("KaDialogFragment", "show dialogFragment error is " + e.getLocalizedMessage());
            return -1;
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public synchronized void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        if (fragmentManager != null) {
            show(fragmentManager.beginTransaction(), str);
        }
    }
}
