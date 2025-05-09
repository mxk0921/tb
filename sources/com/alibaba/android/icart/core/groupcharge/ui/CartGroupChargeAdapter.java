package com.alibaba.android.icart.core.groupcharge.ui;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.kmb;
import tb.kwm;
import tb.lcu;
import tb.ptq;
import tb.ska;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class CartGroupChargeAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private View.OnClickListener listener;
    private kmb mCartPresenter;
    private IDMComponent mComponent;
    private Context mContext;
    private List<ska> mGroupDatas;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ska f2208a;

        public a(ska skaVar) {
            this.f2208a = skaVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            List<IDMComponent> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            lcu d = CartGroupChargeAdapter.access$000(CartGroupChargeAdapter.this).g().d();
            d.l("cartSubmit");
            d.i(CartGroupChargeAdapter.access$100(CartGroupChargeAdapter.this));
            d.q("");
            ska skaVar = this.f2208a;
            if (skaVar != null) {
                list = skaVar.f();
            } else {
                list = null;
            }
            d.k(list);
            CartGroupChargeAdapter.access$000(CartGroupChargeAdapter.this).g().h(d);
            if (CartGroupChargeAdapter.access$200(CartGroupChargeAdapter.this) != null) {
                CartGroupChargeAdapter.access$200(CartGroupChargeAdapter.this).onClick(view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public View f2209a;
        public TextView b;
        public TextView c;
        public TextView d;
        public View e;

        static {
            t2o.a(479199465);
        }
    }

    static {
        t2o.a(479199463);
    }

    public CartGroupChargeAdapter(kmb kmbVar, IDMComponent iDMComponent) {
        if (kmbVar != null) {
            this.mContext = kmbVar.getContext();
            this.mCartPresenter = kmbVar;
            this.mComponent = iDMComponent;
            return;
        }
        throw new IllegalArgumentException("presenter can not be null");
    }

    public static /* synthetic */ kmb access$000(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("7aba8bd", new Object[]{cartGroupChargeAdapter});
        }
        return cartGroupChargeAdapter.mCartPresenter;
    }

    public static /* synthetic */ IDMComponent access$100(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("6f9e8c79", new Object[]{cartGroupChargeAdapter});
        }
        return cartGroupChargeAdapter.mComponent;
    }

    public static /* synthetic */ View.OnClickListener access$200(CartGroupChargeAdapter cartGroupChargeAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View.OnClickListener) ipChange.ipc$dispatch("a1b5255f", new Object[]{cartGroupChargeAdapter});
        }
        return cartGroupChargeAdapter.listener;
    }

    private void applyStyle(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f48574", new Object[]{this, bVar});
            return;
        }
        ptq.c(bVar.b, "group_charge_item_group_title");
        ptq.c(bVar.c, "group_charge_item_total_quantity");
        ptq.c(bVar.e, "group_charge_item_btn_charge");
        ptq.c(bVar.f2209a, "groupCharge_itemRoot");
    }

    public static /* synthetic */ Object ipc$super(CartGroupChargeAdapter cartGroupChargeAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/groupcharge/ui/CartGroupChargeAdapter");
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<ska> list = this.mGroupDatas;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
        }
        List<ska> list = this.mGroupDatas;
        if (list == null || list.size() <= i) {
            return null;
        }
        return this.mGroupDatas.get(i);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        ska skaVar = this.mGroupDatas.get(i);
        if (view == null) {
            view = LayoutInflater.from(this.mContext).inflate(R.layout.icart_group_charge_listview_item, (ViewGroup) null);
            bVar = new b();
            bVar.f2209a = view;
            bVar.b = (TextView) view.findViewById(R.id.tv_group_title);
            bVar.c = (TextView) view.findViewById(R.id.tv_total_quantity);
            bVar.d = (TextView) view.findViewById(R.id.tv_total_price);
            bVar.e = view.findViewById(R.id.btn_charge);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        bVar.e.setTag(Integer.valueOf(i));
        ViewProxy.setOnClickListener(bVar.e, new a(skaVar));
        if (skaVar != null) {
            bVar.c.setText(String.format(this.mContext.getResources().getString(R.string.cart_group_charge_quantity), String.valueOf(skaVar.g())));
            bVar.b.setText(skaVar.e());
            kwm.c(bVar.d, skaVar.i(), skaVar.b());
        }
        applyStyle(bVar);
        return view;
    }

    public void setGroupDatas(List<ska> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ff2244", new Object[]{this, list});
        } else {
            this.mGroupDatas = list;
        }
    }

    public void setListener(View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9a1825c", new Object[]{this, onClickListener});
        } else {
            this.listener = onClickListener;
        }
    }
}
