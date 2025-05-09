package com.taobao.android.trade.ui.dialog;

import android.app.DialogFragment;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class AbsTradeDialog extends DialogFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public FrameLayout f9692a;
    public TextView b;
    public TextView c;
    public TextView d;
    public String h;
    public String i;
    public View.OnClickListener j;
    public View.OnClickListener k;
    public final int e = -1;
    public final int f = -1;
    public final int g = -1;
    public final boolean l = true;
    public final boolean m = true;

    static {
        t2o.a(724566022);
    }

    public static /* synthetic */ Object ipc$super(AbsTradeDialog absTradeDialog, String str, Object... objArr) {
        if (str.hashCode() == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/dialog/AbsTradeDialog");
    }

    public abstract View a(ViewGroup viewGroup);

    public void b(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8a4f564", new Object[]{this, onClickListener});
        } else {
            this.k = onClickListener;
        }
    }

    public void c(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3475966", new Object[]{this, onClickListener});
        } else {
            this.j = onClickListener;
        }
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 0);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        View inflate = layoutInflater.inflate(R.layout.trade_container_dialog, (ViewGroup) null);
        this.f9692a = (FrameLayout) inflate.findViewById(R.id.fl_container);
        this.d = (TextView) inflate.findViewById(R.id.tv_title);
        this.b = (TextView) inflate.findViewById(R.id.tv_confirm);
        this.c = (TextView) inflate.findViewById(R.id.tv_cancel);
        View a2 = a(this.f9692a);
        if (a2 != null) {
            this.f9692a.addView(a2, new ViewGroup.LayoutParams(-1, -2));
        }
        if (this.e > 0) {
            this.h = getResources().getString(this.e);
        }
        if (this.f > 0) {
            this.i = getResources().getString(this.f);
        }
        int i3 = this.g;
        if (i3 > 0) {
            this.d.setText(i3);
        }
        if (!TextUtils.isEmpty(this.h)) {
            this.b.setText(this.h);
        }
        if (!TextUtils.isEmpty(this.i)) {
            this.c.setText(this.i);
        }
        if (!TextUtils.isEmpty(null)) {
            this.d.setText((CharSequence) null);
        }
        this.b.setOnClickListener(this.j);
        this.c.setOnClickListener(this.k);
        TextView textView = this.b;
        if (this.l) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        TextView textView2 = this.c;
        if (!this.m) {
            i2 = 8;
        }
        textView2.setVisibility(i2);
        this.d.setVisibility(8);
        return inflate;
    }
}
