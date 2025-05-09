package com.taobao.search.searchdoor.sf.widgets.suggest.cells;

import android.app.Activity;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.list.WidgetViewHolder;
import com.taobao.schedule.ViewProxy;
import com.taobao.search.searchdoor.sf.widgets.SearchDoorContext;
import com.taobao.search.searchdoor.sf.widgets.activate.data.bean.ActivateTypedBean;
import com.taobao.search.searchdoor.sf.widgets.suggest.data.SuggestCellBean;
import com.taobao.tao.Globals;
import com.taobao.tao.util.DensityUtil;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.List;
import tb.b4p;
import tb.c2p;
import tb.ja0;
import tb.rg3;
import tb.t2o;
import tb.twq;
import tb.ude;
import tb.vwq;
import tb.zuo;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class SuggestItemCellWidget extends BaseSuggestCellWidget implements View.OnClickListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final rg3.b CREATOR = new a();
    public final int m;
    public final int n;
    public final int l = zuo.e();
    public final TextView o = (TextView) this.itemView.findViewById(R.id.keyword);
    public final LinearLayout p = (LinearLayout) this.itemView.findViewById(R.id.magic_layout);
    public final View q = this.itemView.findViewById(R.id.upArrow);
    public final TextView r = (TextView) this.itemView.findViewById(R.id.tv_suggest_icon);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements rg3.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: b */
        public WidgetViewHolder a(rg3.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WidgetViewHolder) ipChange.ipc$dispatch("70fcae1f", new Object[]{this, cVar});
            }
            return new SuggestItemCellWidget(R.layout.tbsearchdoor_suggestion_item, cVar.f27354a, cVar.b, cVar.c, (c2p) cVar.f);
        }
    }

    static {
        t2o.a(815793276);
    }

    public SuggestItemCellWidget(int i, Activity activity, ude udeVar, ViewGroup viewGroup, c2p c2pVar) {
        super(LayoutInflater.from(activity).inflate(i, viewGroup, false), activity, udeVar, c2pVar);
        Resources resources = Globals.getApplication().getResources();
        this.m = resources.getColor(R.color.F_L);
        this.n = resources.getColor(R.color.tbsearch_suggest_grey);
    }

    public static /* synthetic */ Object ipc$super(SuggestItemCellWidget suggestItemCellWidget, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/searchdoor/sf/widgets/suggest/cells/SuggestItemCellWidget");
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.suggest.cells.BaseSuggestCellWidget
    public void H0(int i, ActivateTypedBean activateTypedBean) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103d56ed", new Object[]{this, new Integer(i), activateTypedBean});
            return;
        }
        SuggestCellBean suggestCellBean = (SuggestCellBean) activateTypedBean;
        this.itemView.setTag(suggestCellBean);
        ViewProxy.setOnClickListener(this.itemView, this);
        J0(suggestCellBean);
        ViewProxy.setOnClickListener(this.q, this);
        this.q.setTag(suggestCellBean);
    }

    public final List<int[]> I0(String str) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("f5f2a2c2", new Object[]{this, str});
        }
        SearchDoorContext a2 = l0().a();
        ArrayList arrayList = null;
        if (a2 == null) {
            return null;
        }
        String l = a2.l();
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(l)) {
            if (str.length() <= 50) {
                arrayList = new ArrayList();
                while (true) {
                    int indexOf = str.indexOf(l, i);
                    if (indexOf <= -1) {
                        break;
                    }
                    int length = l.length() + indexOf;
                    arrayList.add(new int[]{indexOf, length});
                    i = length;
                }
            } else {
                return null;
            }
        }
        return arrayList;
    }

    @Override // com.taobao.search.searchdoor.sf.widgets.suggest.cells.BaseSuggestCellWidget, com.taobao.android.searchbaseframe.list.WidgetViewHolder
    public String k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SuggestItemCellWidget";
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        SuggestCellBean suggestCellBean = (SuggestCellBean) view.getTag();
        if (suggestCellBean != null) {
            if (view.getId() == R.id.upArrow) {
                A0(twq.a(suggestCellBean.showText));
                return;
            }
            ja0 ja0Var = suggestCellBean.result;
            if (ja0Var != null) {
                str = ja0Var.k;
            } else {
                str = "";
            }
            A0(vwq.a(suggestCellBean.searchText, suggestCellBean.suggestRn, str, suggestCellBean.params));
        }
    }

    public final void J0(SuggestCellBean suggestCellBean) {
        List<int[]> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("172ec5dd", new Object[]{this, suggestCellBean});
            return;
        }
        try {
            list = I0(suggestCellBean.showText);
        } catch (Throwable unused) {
            b4p.b("SuggestItemCellWidget", "compute grey positions error");
            list = null;
        }
        if (list != null && list.size() > 0) {
            try {
                K0(suggestCellBean.showText, list);
            } catch (Throwable unused2) {
                b4p.b("SuggestItemCellWidget", "renderSuggestGrey error");
            }
        } else if (!TextUtils.isEmpty(suggestCellBean.showText)) {
            this.o.setText(suggestCellBean.showText);
        }
        this.o.setTextColor(this.m);
        this.o.getPaint().setFakeBoldText(false);
        this.o.setMaxWidth(((this.l - this.itemView.getPaddingLeft()) - this.itemView.getPaddingRight()) - DensityUtil.dip2px(this.o.getContext(), 53.0f));
        this.p.removeAllViews();
        if (!TextUtils.isEmpty(suggestCellBean.icon)) {
            this.r.setVisibility(0);
            this.r.setText(suggestCellBean.icon);
            return;
        }
        this.r.setVisibility(8);
    }

    public final void K0(String str, List<int[]> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce5f0ccf", new Object[]{this, str, list});
        } else if (TextUtils.isEmpty(str)) {
            this.o.setText("");
            b4p.a("SuggestItemCellWidget", "renderSuggestGrey keyword is empty");
        } else {
            SpannableString spannableString = new SpannableString(str);
            for (int[] iArr : list) {
                int i = iArr[0];
                int i2 = iArr[1];
                if (i >= 0 && i2 >= 0) {
                    spannableString.setSpan(new ForegroundColorSpan(this.n), i, i2, 33);
                }
            }
            this.o.setText(spannableString);
        }
    }
}
