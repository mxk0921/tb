package com.taobao.search.jarvis.rcmd.cell;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.android.searchbaseframe.util.ListStyle;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import tb.t2o;
import tb.ude;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class XslAuctionCellWidget extends WidgetViewHolder<XslDegradeCellBean, Void> implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public TextView l;
    public TextView m;
    public TextView n;
    public XslUrlImageView o;
    public XslDegradeCellBean p;

    static {
        t2o.a(815792312);
    }

    public XslAuctionCellWidget(View view, Activity activity, ude udeVar, ListStyle listStyle, int i) {
        super(view, activity, udeVar, listStyle, i, null);
        G0();
    }

    public static /* synthetic */ Object ipc$super(XslAuctionCellWidget xslAuctionCellWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/jarvis/rcmd/cell/XslAuctionCellWidget");
    }

    public final void G0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1d31fad", new Object[]{this});
            return;
        }
        this.o = (XslUrlImageView) this.itemView.findViewById(R.id.iv_auction);
        this.l = (TextView) this.itemView.findViewById(R.id.tv_title);
        this.m = (TextView) this.itemView.findViewById(R.id.tv_price);
        this.n = (TextView) this.itemView.findViewById(R.id.tv_sold_cnt);
        this.o.setPlaceHoldImageResId(R.drawable.tbsearch_android_wf_img_placeholder);
        ViewProxy.setOnClickListener(this.itemView, this);
    }

    public final float H0() {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("13ea484c", new Object[]{this})).floatValue();
        }
        XslDegradeCellBean xslDegradeCellBean = this.p;
        int i2 = xslDegradeCellBean.width;
        int i3 = xslDegradeCellBean.height;
        if (i2 != 0) {
            i = i2;
        }
        return (i3 * 1.0f) / i;
    }

    /* renamed from: I0 */
    public void u0(int i, XslDegradeCellBean xslDegradeCellBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f190b2e", new Object[]{this, new Integer(i), xslDegradeCellBean});
        } else if (this.p != xslDegradeCellBean) {
            this.p = xslDegradeCellBean;
            this.o.setRatio(H0());
            this.o.setImageUrl(this.p.imageUrl);
            this.l.setText(this.p.title);
            this.m.setText(this.p.price);
            this.n.setText(this.p.soldCount);
        }
    }

    @Override // com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return getClass().getSimpleName();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        } else if (this.p != null) {
            Nav.from(getActivity()).toUri(this.p.itemUrl);
        }
    }
}
