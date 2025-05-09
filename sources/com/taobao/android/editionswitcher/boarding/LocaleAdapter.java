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
public class LocaleAdapter extends RecyclerView.Adapter<ViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final List<LocaleModel.LocaleData> f7615a;
    public PopWindowView.c b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ViewHolder extends RecyclerView.ViewHolder {
        static {
            t2o.a(456130635);
        }

        public ViewHolder(LocaleAdapter localeAdapter, View view) {
            super(view);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LocaleModel.LocaleData f7616a;

        public a(LocaleModel.LocaleData localeData) {
            this.f7616a = localeData;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (LocaleAdapter.M(LocaleAdapter.this) != null) {
                LocaleAdapter.M(LocaleAdapter.this).a(this.f7616a);
            }
        }
    }

    static {
        t2o.a(456130633);
    }

    public LocaleAdapter(List<LocaleModel.LocaleData> list) {
        this.f7615a = list;
    }

    public static /* synthetic */ PopWindowView.c M(LocaleAdapter localeAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopWindowView.c) ipChange.ipc$dispatch("26eb1a03", new Object[]{localeAdapter});
        }
        return localeAdapter.b;
    }

    public static /* synthetic */ Object ipc$super(LocaleAdapter localeAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/editionswitcher/boarding/LocaleAdapter");
    }

    /* renamed from: N */
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cd89550", new Object[]{this, viewHolder, new Integer(i)});
            return;
        }
        LocaleModel.LocaleData localeData = this.f7615a.get(i);
        ImageView imageView = (ImageView) viewHolder.itemView.findViewById(R.id.select_img);
        ((TextView) viewHolder.itemView.findViewById(R.id.text)).setText(localeData.value);
        if (localeData.selected) {
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(4);
        }
        ViewProxy.setOnClickListener(viewHolder.itemView, new a(localeData));
    }

    /* renamed from: O */
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewHolder) ipChange.ipc$dispatch("15ad3304", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new ViewHolder(this, LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ovs_locale_item, viewGroup, false));
    }

    public void P(PopWindowView.c cVar) {
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
        return this.f7615a.size();
    }
}
