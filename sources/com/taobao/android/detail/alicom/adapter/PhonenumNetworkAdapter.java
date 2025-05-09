package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.FetchComponentData$FetchModel;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PhonenumNetworkAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Context ctx;
    private List<FetchComponentData$FetchModel.ComponentData.Network> list;
    private int selectItem = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6528a;

        static {
            t2o.a(703594502);
        }

        public a(PhonenumNetworkAdapter phonenumNetworkAdapter) {
        }
    }

    static {
        t2o.a(703594501);
    }

    public PhonenumNetworkAdapter(Context context, List<FetchComponentData$FetchModel.ComponentData.Network> list) {
        this.ctx = context;
        this.list = list;
    }

    public static /* synthetic */ Object ipc$super(PhonenumNetworkAdapter phonenumNetworkAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/adapter/PhonenumNetworkAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FetchComponentData$FetchModel.ComponentData.Network> list = this.list;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    public FetchComponentData$FetchModel.ComponentData.Network getSelectedItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData.Network) ipChange.ipc$dispatch("a422bd8e", new Object[]{this});
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
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = LayoutInflater.from(this.ctx).inflate(R.layout.detail_phonenum_network_item, (ViewGroup) null);
            aVar = new a(this);
            aVar.f6528a = (TextView) view.findViewById(R.id.detail_phonenumber_network_item_tv);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        TextView textView = aVar.f6528a;
        if (this.list.get(i) == null) {
            str = "";
        } else {
            str = this.list.get(i).name;
        }
        textView.setText(str);
        if (i == this.selectItem) {
            aVar.f6528a.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f6528a.setTextColor(Color.parseColor("#555555"));
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

    public void update(List<FetchComponentData$FetchModel.ComponentData.Network> list) {
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
    public FetchComponentData$FetchModel.ComponentData.Network getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData.Network) ipChange.ipc$dispatch("63a0ec66", new Object[]{this, new Integer(i)});
        }
        if (i == -1 || i >= this.list.size()) {
            return null;
        }
        return this.list.get(i);
    }
}
