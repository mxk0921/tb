package com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.f7l;
import tb.skl;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PackingListAdapter extends AbsRecyclerViewAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<skl.b> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BodyViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TextView f6888a;

        static {
            t2o.a(912262318);
        }

        public BodyViewHolder(PackingListAdapter packingListAdapter, View view) {
            super(view);
            this.f6888a = (TextView) view.findViewById(R.id.item_tv);
        }

        public static /* synthetic */ Object ipc$super(BodyViewHolder bodyViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/PackingListAdapter$BodyViewHolder");
        }

        public TextView getTextView() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TextView) ipChange.ipc$dispatch("852baee3", new Object[]{this});
            }
            return this.f6888a;
        }
    }

    static {
        t2o.a(912262317);
    }

    public PackingListAdapter(Context context, ArrayList<skl.b> arrayList) {
        super(context);
        this.e = arrayList;
        this.f6887a.getResources().getColor(R.color.tt_detail_transparent);
    }

    public static /* synthetic */ Object ipc$super(PackingListAdapter packingListAdapter, String str, Object... objArr) {
        if (str.hashCode() == -1441289013) {
            super.onBindViewHolder((RecyclerView.ViewHolder) objArr[0], ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/PackingListAdapter");
    }

    public void N(ArrayList<skl.b> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68f6969c", new Object[]{this, arrayList});
        } else {
            this.e = arrayList;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        ArrayList<skl.b> arrayList = this.e;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
        }
        return i;
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        super.onBindViewHolder(viewHolder, i);
        TextView textView = ((BodyViewHolder) viewHolder).getTextView();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.e.get(i).f28116a);
        if (this.e.get(i).b > 0) {
            stringBuffer.append(f7l.BRACKET_START_STR);
            stringBuffer.append(this.e.get(i).b);
            stringBuffer.append(f7l.BRACKET_END_STR);
        }
        textView.setText(stringBuffer.toString());
    }

    @Override // com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.AbsRecyclerViewAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new BodyViewHolder(this, LayoutInflater.from(this.f6887a).inflate(R.layout.tt_detail_desc_packing_list_item, (ViewGroup) null));
    }
}
