package com.taobao.search.searchdoor;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class BaseSearchDoorFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11606a;
    public boolean c;
    public boolean d;
    public boolean e;
    public ViewGroup f;

    static {
        t2o.a(815792928);
    }

    public final void A2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4325830", new Object[]{this, new Boolean(z)});
            return;
        }
        this.f11606a = z;
        C2();
    }

    public final void B2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10207228", new Object[]{this, new Boolean(z)});
        } else if (this.e != z) {
            this.e = z;
            onWindowFocusChanged(z);
        }
    }

    public final void C2() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb7451cf", new Object[]{this});
            return;
        }
        if (this.c && this.f11606a) {
            z = true;
        }
        if (z != this.d) {
            if (z) {
                u2();
            } else {
                v2();
            }
        }
        this.d = z;
    }

    public final View a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b1091e01", new Object[]{this, layoutInflater, viewGroup});
        }
        ViewGroup viewGroup2 = this.f;
        if (viewGroup2 != null) {
            return viewGroup2;
        }
        View b = b(layoutInflater, viewGroup);
        ckf.d(b);
        return b;
    }

    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("dd0a66fc", new Object[]{this, layoutInflater, viewGroup});
        }
        ViewGroup p2 = p2(layoutInflater, viewGroup);
        this.f = p2;
        return p2;
    }

    public final void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        this.c = false;
        C2();
    }

    public final void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        this.c = true;
        C2();
    }

    public void onWindowFocusChanged(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88097302", new Object[]{this, new Boolean(z)});
        }
    }

    public abstract ViewGroup p2(LayoutInflater layoutInflater, ViewGroup viewGroup);

    public final ViewGroup r2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("26a69771", new Object[]{this});
        }
        return this.f;
    }

    public final void s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1efde788", new Object[]{this});
        } else {
            this.f11606a = true;
        }
    }

    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("121b4972", new Object[]{this});
        }
    }

    public void v2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b8c0914", new Object[]{this});
        }
    }

    public final void z2(ViewGroup viewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b29a716f", new Object[]{this, viewGroup});
        } else {
            this.f = viewGroup;
        }
    }
}
