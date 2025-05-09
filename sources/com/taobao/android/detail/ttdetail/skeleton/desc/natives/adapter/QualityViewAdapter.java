package com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.viewmodel.QualityViewModel;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.egr;
import tb.gt4;
import tb.lvp;
import tb.q84;
import tb.t2o;
import tb.z3a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class QualityViewAdapter extends RecyclerView.Adapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f6889a;
    public final List<QualityViewModel.QualityContentModel> b;
    public final List<String> c;
    public final List<String> d = new ArrayList();
    public final Map<String, String> e = new HashMap();
    public final Map<String, String> f = new HashMap();
    public final int[] g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class QualityItemViewHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final DetailImageView f6890a;
        public final TextView b;

        static {
            t2o.a(912262321);
        }

        public QualityItemViewHolder(QualityViewAdapter qualityViewAdapter, View view) {
            super(view);
            this.f6890a = (DetailImageView) view.findViewById(R.id.iv_desc_quality_item);
            this.b = (TextView) view.findViewById(R.id.iv_desc_quality_item_title);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f6891a;

        public a(int i) {
            this.f6891a = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            z3a z3aVar = new z3a();
            z3aVar.c = new ArrayList<>(QualityViewAdapter.M(QualityViewAdapter.this));
            z3aVar.d = new ArrayList<>(QualityViewAdapter.M(QualityViewAdapter.this));
            z3aVar.f = new HashMap<>(QualityViewAdapter.N(QualityViewAdapter.this));
            z3aVar.g = new HashMap<>(QualityViewAdapter.O(QualityViewAdapter.this));
            z3aVar.b = QualityViewAdapter.P(QualityViewAdapter.this)[this.f6891a];
            z3aVar.e = view;
            q84.f(QualityViewAdapter.Q(QualityViewAdapter.this), new lvp(z3aVar));
        }
    }

    static {
        t2o.a(912262319);
    }

    public QualityViewAdapter(Context context, QualityViewModel qualityViewModel) {
        int i;
        this.f6889a = context;
        List<QualityViewModel.QualityContentModel> list = qualityViewModel.l;
        this.b = list;
        if (!(list == null || list.isEmpty())) {
            this.c = qualityViewModel.k;
            this.g = new int[list.size()];
            int i2 = 0;
            for (int i3 = 0; i3 < this.b.size(); i3++) {
                this.g[i3] = i2;
                QualityViewModel.QualityContentModel qualityContentModel = this.b.get(i3);
                S(qualityContentModel);
                List<String> list2 = qualityContentModel.images;
                if (list2 == null) {
                    i = 0;
                } else {
                    i = list2.size();
                }
                i2 += i;
            }
        }
    }

    public static /* synthetic */ List M(QualityViewAdapter qualityViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2a68f02a", new Object[]{qualityViewAdapter});
        }
        return qualityViewAdapter.d;
    }

    public static /* synthetic */ Map N(QualityViewAdapter qualityViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3d3ee911", new Object[]{qualityViewAdapter});
        }
        return qualityViewAdapter.e;
    }

    public static /* synthetic */ Map O(QualityViewAdapter qualityViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aaaba630", new Object[]{qualityViewAdapter});
        }
        return qualityViewAdapter.f;
    }

    public static /* synthetic */ int[] P(QualityViewAdapter qualityViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (int[]) ipChange.ipc$dispatch("abe9ed8a", new Object[]{qualityViewAdapter});
        }
        return qualityViewAdapter.g;
    }

    public static /* synthetic */ Context Q(QualityViewAdapter qualityViewAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("2cd1b9f1", new Object[]{qualityViewAdapter});
        }
        return qualityViewAdapter.f6889a;
    }

    public static /* synthetic */ Object ipc$super(QualityViewAdapter qualityViewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/adapter/QualityViewAdapter");
    }

    public final void S(QualityViewModel.QualityContentModel qualityContentModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("112a348c", new Object[]{this, qualityContentModel});
        } else if (qualityContentModel != null && qualityContentModel.images != null) {
            List<String> list = this.c;
            if (list == null || list.isEmpty()) {
                str = null;
            } else {
                str = gt4.b(this.c, "    ");
            }
            for (String str2 : qualityContentModel.images) {
                this.d.add(str2);
                this.e.put(str2, qualityContentModel.desc);
                if (!TextUtils.isEmpty(str)) {
                    this.f.put(str2, str);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<QualityViewModel.QualityContentModel> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        List<QualityViewModel.QualityContentModel> list;
        QualityViewModel.QualityContentModel qualityContentModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
        } else if ((viewHolder instanceof QualityItemViewHolder) && (list = this.b) != null && i < list.size() && (qualityContentModel = this.b.get(i)) != null) {
            QualityItemViewHolder qualityItemViewHolder = (QualityItemViewHolder) viewHolder;
            if (!TextUtils.isEmpty(qualityContentModel.desc)) {
                qualityItemViewHolder.b.setText(qualityContentModel.desc);
                qualityItemViewHolder.b.setVisibility(0);
            } else {
                qualityItemViewHolder.b.setVisibility(8);
            }
            List<String> list2 = qualityContentModel.images;
            if (list2 != null && !list2.isEmpty()) {
                egr.d().e(qualityContentModel.images.get(0), qualityItemViewHolder.f6890a);
                qualityItemViewHolder.f6890a.setOnClickListener(new a(i));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
        }
        return new QualityItemViewHolder(this, LayoutInflater.from(this.f6889a).inflate(R.layout.tt_detail_desc_quality_item, (ViewGroup) null));
    }
}
