package com.taobao.android.editionswitcher.boarding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.boarding.LocaleModel;
import com.taobao.android.editionswitcher.boarding.PopWindowView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CentralAsiaAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<LocaleModel.LocaleData> f7613a;
    public PopWindowView.c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(456130616);
        }

        public ViewHolder(CentralAsiaAdapter centralAsiaAdapter, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocaleModel.LocaleData f7614a;

        public a(LocaleModel.LocaleData localeData) {
            this.f7614a = localeData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            for (LocaleModel.LocaleData localeData : CentralAsiaAdapter.M(CentralAsiaAdapter.this)) {
                localeData.selected = false;
            }
            this.f7614a.selected = true;
            if (CentralAsiaAdapter.N(CentralAsiaAdapter.this) != null) {
                CentralAsiaAdapter.N(CentralAsiaAdapter.this).a(this.f7614a);
            }
            CentralAsiaAdapter.this.notifyDataSetChanged();
        }
    }

    static {
        t2o.a(456130614);
    }

    public CentralAsiaAdapter(List<LocaleModel.LocaleData> list) {
        this.f7613a = list;
    }

    public static /* synthetic */ List M(CentralAsiaAdapter centralAsiaAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("ed7ac781", new Object[]{centralAsiaAdapter});
        }
        return centralAsiaAdapter.f7613a;
    }

    public static /* synthetic */ PopWindowView.c N(CentralAsiaAdapter centralAsiaAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView.c) ipChange.ipc$dispatch("3d256621", new Object[]{centralAsiaAdapter});
        }
        return centralAsiaAdapter.b;
    }

    public static /* synthetic */ Object ipc$super(CentralAsiaAdapter centralAsiaAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/CentralAsiaAdapter");
    }

    /* renamed from: O */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58cd608b", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        LocaleModel.LocaleData localeData = this.f7613a.get(i);
        View findViewById = viewHolder.itemView.findViewById(R.id.item);
        ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R.id.select_img);
        ((TextView) viewHolder.itemView.findViewById(R.id.text)).setText(localeData.value);
        ((ImageView) viewHolder.itemView.findViewById(R.id.flag)).setImageResource(localeData.nationalFlag);
        if (localeData.selected) {
            findViewById.setBackgroundResource(R.drawable.ovs_i18n_locale_selected_bg);
            imageView.setImageResource(R.drawable.ovs_i18n_locale_selected);
        } else {
            findViewById.setBackgroundResource(R.drawable.ovs_i18n_locale_unselected_bg);
            imageView.setImageResource(R.drawable.ovs_i18n_locale_unselected);
        }
        ViewProxy.setOnClickListener(viewHolder.itemView, new a(localeData));
    }

    /* renamed from: P */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("498072ed", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ovs_locale_item_ru, viewGroup, false));
    }

    public void Q(PopWindowView.c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("31aeb2e1", new Object[]{this, cVar});
        } else {
            this.b = cVar;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.f7613a.size();
    }
}
