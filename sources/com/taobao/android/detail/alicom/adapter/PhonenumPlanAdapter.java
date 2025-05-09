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
public class PhonenumPlanAdapter extends BaseAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private LayoutInflater inflater;
    private List<FetchComponentData$FetchModel.ComponentData.Plan> plans;
    private long selectItem = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6530a;
        public TextView b;

        static {
            t2o.a(703594506);
        }
    }

    static {
        t2o.a(703594505);
    }

    public PhonenumPlanAdapter(List<FetchComponentData$FetchModel.ComponentData.Plan> list, Context context) {
        this.plans = list;
        this.inflater = LayoutInflater.from(context);
    }

    public static /* synthetic */ Object ipc$super(PhonenumPlanAdapter phonenumPlanAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/alicom/adapter/PhonenumPlanAdapter");
    }

    @Override // android.widget.Adapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        List<FetchComponentData$FetchModel.ComponentData.Plan> list = this.plans;
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
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
        }
        if (view == null) {
            view = this.inflater.inflate(R.layout.detail_phonenum_plan_item, viewGroup, false);
            aVar = new a();
            aVar.f6530a = (TextView) view.findViewById(R.id.detail_phonenum_plan_item_name);
            aVar.b = (TextView) view.findViewById(R.id.detail_phonenum_plan_item_descrip);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        aVar.f6530a.setText(this.plans.get(i).name);
        aVar.b.setText(this.plans.get(i).nativeDesc);
        if (i == this.selectItem) {
            aVar.f6530a.setTextColor(-1);
            aVar.b.setTextColor(-1);
            view.setBackgroundResource(R.drawable.detail_phonenum_red_bg);
        } else {
            aVar.f6530a.setTextColor(Color.parseColor("#555555"));
            aVar.b.setTextColor(Color.parseColor("#555555"));
            view.setBackgroundResource(R.drawable.detail_phonenum_gray_bg);
        }
        return view;
    }

    public void setSelectItem(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("785c2d8c", new Object[]{this, new Long(j)});
        } else {
            this.selectItem = j;
        }
    }

    @Override // android.widget.Adapter
    public FetchComponentData$FetchModel.ComponentData.Plan getItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FetchComponentData$FetchModel.ComponentData.Plan) ipChange.ipc$dispatch("1bea4839", new Object[]{this, new Integer(i)});
        }
        if (i < 0 || i >= this.plans.size()) {
            return null;
        }
        return this.plans.get(i);
    }
}
