package com.taobao.android.trade.ui.dialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class TradeAlertDialog extends AbsTradeDialog {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final int n = -1;
    public TextView o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                TradeAlertDialog.this.dismiss();
            }
        }
    }

    static {
        t2o.a(724566028);
    }

    public static /* synthetic */ Object ipc$super(TradeAlertDialog tradeAlertDialog, String str, Object... objArr) {
        if (str.hashCode() == -1126882532) {
            return super.onCreateView((LayoutInflater) objArr[0], (ViewGroup) objArr[1], (Bundle) objArr[2]);
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/trade/ui/dialog/TradeAlertDialog");
    }

    @Override // com.taobao.android.trade.ui.dialog.AbsTradeDialog
    public View a(ViewGroup viewGroup) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("b7351610", new Object[]{this, viewGroup});
        }
        TextView textView = new TextView(getActivity());
        this.o = textView;
        textView.setTextColor(getResources().getColor(R.color.TC_A_H));
        this.o.setTextSize(1, 16.0f);
        TextView textView2 = this.o;
        if (this.n != -1) {
            str = getResources().getString(this.n);
        } else {
            str = null;
        }
        textView2.setText(str);
        return this.o;
    }

    @Override // com.taobao.android.trade.ui.dialog.AbsTradeDialog, android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        a aVar = new a();
        setCancelable(false);
        if (this.j == null) {
            c(aVar);
        }
        if (this.k == null) {
            b(aVar);
        }
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }
}
