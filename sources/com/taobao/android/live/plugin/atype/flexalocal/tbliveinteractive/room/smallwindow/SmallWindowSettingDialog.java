package com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.RelativeLayout;
import android.widget.Switch;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.giv;
import tb.i0m;
import tb.iw0;
import tb.qvs;
import tb.t2o;
import tb.ux9;
import tb.z1i;
import tb.z3s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class SmallWindowSettingDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f8686a;
    public RelativeLayout c;
    public RelativeLayout d;
    public RelativeLayout e;
    public Switch f;
    public Switch g;
    public Switch h;
    public i0m.b i;
    public i0m.b j;
    public i0m.b k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i0m.b f8689a;

        public a(i0m.b bVar) {
            this.f8689a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean canDrawOverlays;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (Build.VERSION.SDK_INT >= 24) {
                canDrawOverlays = Settings.canDrawOverlays(SmallWindowSettingDialog.E2(SmallWindowSettingDialog.this));
                if (!canDrawOverlays) {
                    i0m.a(SmallWindowSettingDialog.E2(SmallWindowSettingDialog.this), this.f8689a);
                }
            }
        }
    }

    static {
        t2o.a(295699937);
    }

    public static /* synthetic */ Switch A2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Switch) ipChange.ipc$dispatch("786479fe", new Object[]{smallWindowSettingDialog});
        }
        return smallWindowSettingDialog.g;
    }

    public static /* synthetic */ i0m.b C2(SmallWindowSettingDialog smallWindowSettingDialog, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0m.b) ipChange.ipc$dispatch("86798f25", new Object[]{smallWindowSettingDialog, bVar});
        }
        smallWindowSettingDialog.k = bVar;
        return bVar;
    }

    public static /* synthetic */ Switch D2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Switch) ipChange.ipc$dispatch("f9157c3c", new Object[]{smallWindowSettingDialog});
        }
        return smallWindowSettingDialog.h;
    }

    public static /* synthetic */ Context E2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("9c1e7861", new Object[]{smallWindowSettingDialog});
        }
        return smallWindowSettingDialog.f8686a;
    }

    public static SmallWindowSettingDialog Q2(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SmallWindowSettingDialog) ipChange.ipc$dispatch("84dad9db", new Object[]{ux9Var});
        }
        SmallWindowSettingDialog smallWindowSettingDialog = new SmallWindowSettingDialog();
        smallWindowSettingDialog.B2(ux9Var);
        return smallWindowSettingDialog;
    }

    public static /* synthetic */ Object ipc$super(SmallWindowSettingDialog smallWindowSettingDialog, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -596517775) {
            super.show((FragmentManager) objArr[0], (String) objArr[1]);
            return null;
        } else if (hashCode == 462397159) {
            super.onDestroyView();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/live/plugin/atype/flexalocal/tbliveinteractive/room/smallwindow/SmallWindowSettingDialog");
        }
    }

    public static /* synthetic */ i0m.b p2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0m.b) ipChange.ipc$dispatch("518240bf", new Object[]{smallWindowSettingDialog});
        }
        return smallWindowSettingDialog.i;
    }

    public static /* synthetic */ i0m.b r2(SmallWindowSettingDialog smallWindowSettingDialog, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0m.b) ipChange.ipc$dispatch("f56db9a0", new Object[]{smallWindowSettingDialog, bVar});
        }
        smallWindowSettingDialog.i = bVar;
        return bVar;
    }

    public static /* synthetic */ void s2(SmallWindowSettingDialog smallWindowSettingDialog, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b94d1cb0", new Object[]{smallWindowSettingDialog, bVar});
        } else {
            smallWindowSettingDialog.J2(bVar);
        }
    }

    public static /* synthetic */ void u2(SmallWindowSettingDialog smallWindowSettingDialog, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8213ad8", new Object[]{smallWindowSettingDialog, str});
        } else {
            smallWindowSettingDialog.R2(str);
        }
    }

    public static /* synthetic */ i0m.b v2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0m.b) ipChange.ipc$dispatch("980ed2dc", new Object[]{smallWindowSettingDialog});
        }
        return smallWindowSettingDialog.j;
    }

    public static /* synthetic */ i0m.b z2(SmallWindowSettingDialog smallWindowSettingDialog, i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0m.b) ipChange.ipc$dispatch("1941a023", new Object[]{smallWindowSettingDialog, bVar});
        }
        smallWindowSettingDialog.j = bVar;
        return bVar;
    }

    public void B2(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
        }
    }

    public final void J2(i0m.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("910e5b17", new Object[]{this, bVar});
        } else {
            z1i.a().c(new a(bVar));
        }
    }

    public final boolean K2() {
        boolean canDrawOverlays;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9549414", new Object[]{this})).booleanValue();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            canDrawOverlays = Settings.canDrawOverlays(this.f8686a);
            if (!canDrawOverlays) {
                return false;
            }
        }
        return true;
    }

    public final void M2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2daea9bf", new Object[]{this});
            return;
        }
        this.f.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog$1$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class a implements i0m.b {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a(AnonymousClass1 r1) {
                }

                @Override // tb.i0m.b
                public void onDenied() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                    }
                }

                @Override // tb.i0m.b
                public void onGranted() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("48392e63", new Object[]{this});
                    }
                }
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                z3s.j("KEY_WINDOW_ZOOM_SWITCH", z);
                if (z) {
                    if (SmallWindowSettingDialog.p2(SmallWindowSettingDialog.this) == null) {
                        SmallWindowSettingDialog.r2(SmallWindowSettingDialog.this, new a(this));
                    }
                    SmallWindowSettingDialog smallWindowSettingDialog = SmallWindowSettingDialog.this;
                    SmallWindowSettingDialog.s2(smallWindowSettingDialog, SmallWindowSettingDialog.p2(smallWindowSettingDialog));
                }
            }
        });
        this.g.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog$2$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class a implements i0m.b {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // tb.i0m.b
                public void onDenied() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                    } else {
                        SmallWindowSettingDialog.A2(SmallWindowSettingDialog.this).setChecked(false);
                    }
                }

                @Override // tb.i0m.b
                public void onGranted() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("48392e63", new Object[]{this});
                    } else {
                        SmallWindowSettingDialog.A2(SmallWindowSettingDialog.this).setChecked(true);
                    }
                }
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                z3s.j("KEY_WINDOW_INTERNAL_SWITCH", z);
                SmallWindowSettingDialog.u2(SmallWindowSettingDialog.this, "followwindow_click");
                if (SmallWindowSettingDialog.v2(SmallWindowSettingDialog.this) == null) {
                    SmallWindowSettingDialog.z2(SmallWindowSettingDialog.this, new a());
                }
                if (z) {
                    SmallWindowSettingDialog smallWindowSettingDialog = SmallWindowSettingDialog.this;
                    SmallWindowSettingDialog.s2(smallWindowSettingDialog, SmallWindowSettingDialog.v2(smallWindowSettingDialog));
                }
            }
        });
        this.h.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.live.plugin.atype.flexalocal.tbliveinteractive.room.smallwindow.SmallWindowSettingDialog$3$a */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
            public class a implements i0m.b {
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public a() {
                }

                @Override // tb.i0m.b
                public void onDenied() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("b9ed19e1", new Object[]{this});
                    } else {
                        SmallWindowSettingDialog.D2(SmallWindowSettingDialog.this).setChecked(false);
                    }
                }

                @Override // tb.i0m.b
                public void onGranted() {
                    IpChange ipChange = $ipChange;
                    if (ipChange instanceof IpChange) {
                        ipChange.ipc$dispatch("48392e63", new Object[]{this});
                    } else {
                        SmallWindowSettingDialog.D2(SmallWindowSettingDialog.this).setChecked(true);
                    }
                }
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d2d88ae", new Object[]{this, compoundButton, new Boolean(z)});
                    return;
                }
                z3s.j("KEY_WINDOW_OUTSIDE_SWITCH", z);
                SmallWindowSettingDialog.u2(SmallWindowSettingDialog.this, "desktopwindow_click");
                if (SmallWindowSettingDialog.B2(SmallWindowSettingDialog.this) == null) {
                    SmallWindowSettingDialog.C2(SmallWindowSettingDialog.this, new a());
                }
                if (z) {
                    SmallWindowSettingDialog smallWindowSettingDialog = SmallWindowSettingDialog.this;
                    SmallWindowSettingDialog.s2(smallWindowSettingDialog, SmallWindowSettingDialog.B2(smallWindowSettingDialog));
                }
            }
        });
    }

    public final void N2() {
        boolean z;
        boolean z2;
        boolean z3 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2828b6fd", new Object[]{this});
            return;
        }
        boolean b = z3s.b("KEY_WINDOW_ZOOM_SWITCH", true);
        boolean K2 = K2();
        Switch r5 = this.f;
        if (!K2() || !b) {
            z = false;
        } else {
            z = true;
        }
        r5.setChecked(z);
        boolean b2 = z3s.b("KEY_WINDOW_INTERNAL_SWITCH", false);
        boolean b3 = z3s.b("KEY_WINDOW_OUTSIDE_SWITCH", false);
        if (!b) {
            this.g.setChecked(b2);
            this.h.setChecked(b3);
        } else {
            boolean b4 = z3s.b("KEY_WINDOW_ZOOM_SWITCH", false);
            Switch r3 = this.g;
            if ((!K2 || !b4) && !z3s.b("KEY_WINDOW_INTERNAL_SWITCH", true)) {
                z2 = false;
            } else {
                z2 = true;
            }
            r3.setChecked(z2);
            Switch r32 = this.h;
            if ((K2 && b4) || z3s.b("KEY_WINDOW_OUTSIDE_SWITCH", true)) {
                z3 = true;
            }
            r32.setChecked(z3);
        }
        S2();
    }

    public final void O2(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("55b93576", new Object[]{this, view});
        } else if (view != null) {
            this.c = (RelativeLayout) view.findViewById(R.id.taolive_window_setting_switch_container);
            this.d = (RelativeLayout) view.findViewById(R.id.taolive_window_taobao_internal_setting_switch_container);
            this.e = (RelativeLayout) view.findViewById(R.id.taolive_window_taobao_outside_setting_switch_container);
            this.f = (Switch) view.findViewById(R.id.taolive_window_setting_switch);
            this.g = (Switch) view.findViewById(R.id.taolive_window_taobao_internal_setting_switch);
            this.h = (Switch) view.findViewById(R.id.taolive_window_taobao_outside_setting_switch);
            U2();
            N2();
            M2();
        }
    }

    public final void R2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e53c848", new Object[]{this, str});
        } else if (giv.f() != null) {
            giv.f().d(str, new String[0]);
        }
    }

    public final void S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd061901", new Object[]{this});
            return;
        }
        if (this.g.isChecked() && giv.f() != null) {
            giv.f().a("followwindow", null);
        }
        if (this.h.isChecked() && giv.f() != null) {
            giv.f().a("desktopwindow", null);
        }
    }

    public final void U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f186afc1", new Object[]{this});
        } else if (qvs.Z()) {
            this.c.setVisibility(8);
            this.e.setVisibility(0);
            this.d.setVisibility(0);
        } else {
            this.c.setVisibility(0);
            this.e.setVisibility(8);
            this.d.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Dialog) ipChange.ipc$dispatch("cc7a75a5", new Object[]{this, bundle});
        }
        this.f8686a = getContext();
        Dialog dialog = new Dialog(this.f8686a, R.style.TL_BottomSheetDialog_SmallWindow);
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.taolive_small_window_setting_flexalocal, (ViewGroup) null, false);
        dialog.setContentView(inflate);
        dialog.setCanceledOnTouchOutside(true);
        O2(inflate);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            attributes.width = -1;
            attributes.height = iw0.a(this.f8686a, 214.0f);
            attributes.dimAmount = 0.0f;
            window.setAttributes(attributes);
            window.setWindowAnimations(R.style.TL_BottomSheetDialog_Anim);
        }
        return dialog;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b8f9ee7", new Object[]{this});
        } else {
            super.onDestroyView();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc71dc71", new Object[]{this, fragmentManager, str});
            return;
        }
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ i0m.b B2(SmallWindowSettingDialog smallWindowSettingDialog) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (i0m.b) ipChange.ipc$dispatch("1c6c899a", new Object[]{smallWindowSettingDialog}) : smallWindowSettingDialog.k;
    }
}
