package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.network.QueryContractPhoneNumberData;
import com.taobao.taobao.R;
import java.util.List;
import tb.dsq;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PhonenumNumberAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context ctx;
    private List<QueryContractPhoneNumberData.PhoneNumberList> list;
    private int selectItem = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6529a;

        static {
            t2o.a(703594504);
        }

        public a(PhonenumNumberAdapter phonenumNumberAdapter) {
        }
    }

    static {
        t2o.a(703594503);
    }

    public PhonenumNumberAdapter(Context context, List<QueryContractPhoneNumberData.PhoneNumberList> list) {
        this.ctx = context;
        this.list = list;
    }

    public static /* synthetic */ Object ipc$super(PhonenumNumberAdapter phonenumNumberAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/adapter/PhonenumNumberAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<QueryContractPhoneNumberData.PhoneNumberList> list = this.list;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    public QueryContractPhoneNumberData.PhoneNumberList getSelectItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (QueryContractPhoneNumberData.PhoneNumberList) ipChange.ipc$dispatch("dfb599bd", new Object[]{this});
        }
        int i = this.selectItem;
        if (i == -1 || i >= this.list.size()) {
            return null;
        }
        return this.list.get(this.selectItem);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.ctx).inflate(R.layout.detail_phonenum_number_item, (ViewGroup) null);
            aVar = new a(this);
            aVar.f6529a = (TextView) view.findViewById(R.id.detail_phonenum_number_item_tv);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f6529a.setText(dsq.a(this.list.get(i).phoneNum));
        if (i == this.selectItem) {
            aVar.f6529a.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f6529a.setTextColor(-16777216);
            view.setBackgroundResource(R.drawable.detail_phonenum_gray_bg);
        }
        return view;
    }

    public void setSelectItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c29cb", new Object[]{this, new Integer(i)});
        } else {
            this.selectItem = i;
        }
    }

    public void update(List<QueryContractPhoneNumberData.PhoneNumberList> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28dd1dc1", new Object[]{this, list});
            return;
        }
        this.list = list;
        this.selectItem = -1;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public QueryContractPhoneNumberData.PhoneNumberList getItem(int i) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (QueryContractPhoneNumberData.PhoneNumberList) ipChange.ipc$dispatch("bb594284", new Object[]{this, new Integer(i)}) : this.list.get(i);
    }
}
