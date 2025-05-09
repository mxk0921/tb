package com.taobao.android.detail.alicom.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.alicom.model.ContractCityInfo;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PhonenumCityAdapter extends BaseAdapter implements SectionIndexer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<ContractCityInfo> list;
    private Context mContext;
    private long selectItem = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6527a;
        public TextView b;
        public ImageView c;
        public View d;

        static {
            t2o.a(703594500);
        }
    }

    static {
        t2o.a(703594499);
    }

    public PhonenumCityAdapter(Context context, List<ContractCityInfo> list) {
        this.mContext = context;
        this.list = list;
    }

    public static /* synthetic */ Object ipc$super(PhonenumCityAdapter phonenumCityAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/adapter/PhonenumCityAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<ContractCityInfo> list = this.list;
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

    @Override // android.widget.SectionIndexer
    public int getPositionForSection(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e0637254", new Object[]{this, new Integer(i)})).intValue();
        }
        for (int i2 = 0; i2 < getCount(); i2++) {
            try {
                if (this.list.get(i2).sortLetters.toUpperCase().charAt(0) == i) {
                    return i2;
                }
            } catch (Exception unused) {
            }
        }
        return -1;
    }

    @Override // android.widget.SectionIndexer
    public int getSectionForPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("efc76a4c", new Object[]{this, new Integer(i)})).intValue();
        }
        try {
            return this.list.get(i).sortLetters.charAt(0);
        } catch (Exception unused) {
            return -1;
        }
    }

    @Override // android.widget.SectionIndexer
    public Object[] getSections() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Object[]) ipChange.ipc$dispatch("dc4d8fcc", new Object[]{this});
        }
        return null;
    }

    public long getSelectItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6d77e820", new Object[]{this})).longValue();
        }
        return this.selectItem;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        a aVar;
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        ContractCityInfo contractCityInfo = this.list.get(i);
        if (view == null) {
            aVar = new a();
            view2 = LayoutInflater.from(this.mContext).inflate(R.layout.detail_phonenum_city_item, (ViewGroup) null);
            aVar.b = (TextView) view2.findViewById(R.id.detail_phonenum_city_item_name);
            aVar.c = (ImageView) view2.findViewById(R.id.detail_phonenum_city_item_select);
            aVar.f6527a = (TextView) view2.findViewById(R.id.detail_phonenum_city_item_catagory);
            aVar.d = view2.findViewById(R.id.detail_phonenum_city_item_divider);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (a) view.getTag();
        }
        int sectionForPosition = getSectionForPosition(i);
        if (sectionForPosition == -1 || i != getPositionForSection(sectionForPosition)) {
            aVar.f6527a.setVisibility(8);
        } else {
            aVar.f6527a.setVisibility(0);
            aVar.f6527a.setText(contractCityInfo.sortLetters);
        }
        if (sectionForPosition == -1 || sectionForPosition != getSectionForPosition(1 + i)) {
            aVar.d.setVisibility(8);
        } else {
            aVar.d.setVisibility(0);
        }
        if (i == this.selectItem) {
            aVar.c.setVisibility(0);
        } else {
            aVar.c.setVisibility(8);
        }
        aVar.b.setText(this.list.get(i).city.name);
        return view2;
    }

    public void setSelectItem(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c2d8c", new Object[]{this, new Long(j)});
        } else {
            this.selectItem = j;
        }
    }

    public void updateListView(List<ContractCityInfo> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7852a9c4", new Object[]{this, list});
            return;
        }
        this.list = list;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public ContractCityInfo getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ContractCityInfo) ipChange.ipc$dispatch("a7c1e632", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.list.size()) {
            return null;
        }
        return this.list.get(i);
    }
}
