package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Props;
import com.taobao.android.detail.ttdetail.widget.SelectableImageView;
import com.taobao.taobao.R;
import java.util.List;
import tb.egr;
import tb.hme;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class BundleProductInfoFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Pair<String, String>> p;
    public List<Props.a> q;
    public View r;
    public BundleProductAdapter s;
    public RecyclerView t;
    public ProductImgAdapter u;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class BundleProductAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261980);
        }

        public BundleProductAdapter() {
        }

        private void bindData(int i, Context context, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce081431", new Object[]{this, new Integer(i), context, aVar});
                return;
            }
            Pair pair = (Pair) BundleProductInfoFragment.J2(BundleProductInfoFragment.this).get(i);
            if (pair != null) {
                Object obj = pair.first;
                if (obj != null) {
                    aVar.f6832a.setText((CharSequence) obj);
                }
                Object obj2 = pair.second;
                if (obj2 != null) {
                    aVar.b.setText((CharSequence) obj2);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(BundleProductAdapter bundleProductAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/BundleProductInfoFragment$BundleProductAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (BundleProductInfoFragment.J2(BundleProductInfoFragment.this) == null) {
                return 0;
            }
            return BundleProductInfoFragment.J2(BundleProductInfoFragment.this).size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return BundleProductInfoFragment.J2(BundleProductInfoFragment.this).get(i);
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("19b1c34c", new Object[]{this, new Integer(i)})).longValue();
            }
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            a aVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            if (view == null) {
                view = LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_product_info_item, (ViewGroup) null);
                BundleProductInfoFragment bundleProductInfoFragment = BundleProductInfoFragment.this;
                bundleProductInfoFragment.getClass();
                aVar = new a(bundleProductInfoFragment);
                aVar.f6832a = (TextView) view.findViewById(R.id.name);
                aVar.b = (TextView) view.findViewById(R.id.value);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            bindData(i, tq4.d(viewGroup), aVar);
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class MyItemDecoration extends RecyclerView.ItemDecoration {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final int f6829a;

        static {
            t2o.a(912261981);
        }

        public MyItemDecoration(BundleProductInfoFragment bundleProductInfoFragment, int i) {
            this.f6829a = i;
        }

        public static /* synthetic */ Object ipc$super(MyItemDecoration myItemDecoration, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/BundleProductInfoFragment$MyItemDecoration");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("84db4eca", new Object[]{this, rect, view, recyclerView, state});
            } else if (((Integer) view.getTag()).intValue() > 0) {
                rect.left += this.f6829a;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ProductImgAdapter extends RecyclerView.Adapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public boolean f6830a = true;

        static {
            t2o.a(912261982);
        }

        public ProductImgAdapter() {
        }

        public static /* synthetic */ Object ipc$super(ProductImgAdapter productImgAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/BundleProductInfoFragment$ProductImgAdapter");
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            if (BundleProductInfoFragment.E2(BundleProductInfoFragment.this) != null) {
                return BundleProductInfoFragment.E2(BundleProductInfoFragment.this).size();
            }
            return 0;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aa17accb", new Object[]{this, viewHolder, new Integer(i)});
                return;
            }
            ProductionImgHolder productionImgHolder = (ProductionImgHolder) viewHolder;
            productionImgHolder.f6831a.setTag(Integer.valueOf(i));
            hme m = new hme.a().m();
            m.i = true;
            egr.d().f(((Props.a) BundleProductInfoFragment.E2(BundleProductInfoFragment.this).get(i)).a(), productionImgHolder.f6831a, m);
            if (i == 0 && this.f6830a) {
                this.f6830a = false;
                BundleProductInfoFragment.D2(BundleProductInfoFragment.this, productionImgHolder.f6831a);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("9e3c0169", new Object[]{this, viewGroup, new Integer(i)});
            }
            SelectableImageView selectableImageView = (SelectableImageView) LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_bundle_product_info_img, viewGroup, false);
            BundleProductInfoFragment bundleProductInfoFragment = BundleProductInfoFragment.this;
            bundleProductInfoFragment.getClass();
            ProductionImgHolder productionImgHolder = new ProductionImgHolder(selectableImageView);
            productionImgHolder.f6831a = selectableImageView;
            return productionImgHolder;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ProductionImgHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public SelectableImageView f6831a;

        static {
            t2o.a(912261983);
        }

        public ProductionImgHolder(SelectableImageView selectableImageView) {
            super(selectableImageView);
            selectableImageView.setOnClickListener(this);
            this.f6831a = selectableImageView;
        }

        public static /* synthetic */ Object ipc$super(ProductionImgHolder productionImgHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/BundleProductInfoFragment$ProductionImgHolder");
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else {
                BundleProductInfoFragment.D2(BundleProductInfoFragment.this, view);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6832a;
        public TextView b;

        static {
            t2o.a(912261984);
        }

        public a(BundleProductInfoFragment bundleProductInfoFragment) {
        }
    }

    static {
        t2o.a(912261979);
    }

    public static /* synthetic */ void D2(BundleProductInfoFragment bundleProductInfoFragment, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("228e17cc", new Object[]{bundleProductInfoFragment, view});
        } else {
            bundleProductInfoFragment.K2(view);
        }
    }

    public static /* synthetic */ List E2(BundleProductInfoFragment bundleProductInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("798b09c2", new Object[]{bundleProductInfoFragment});
        }
        return bundleProductInfoFragment.q;
    }

    public static /* synthetic */ List J2(BundleProductInfoFragment bundleProductInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d2965543", new Object[]{bundleProductInfoFragment});
        }
        return bundleProductInfoFragment.p;
    }

    public static BundleProductInfoFragment M2(String str, List<Props.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BundleProductInfoFragment) ipChange.ipc$dispatch("74ded424", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FloatFragment.EXTRA_TITLE, str);
        BundleProductInfoFragment bundleProductInfoFragment = new BundleProductInfoFragment();
        bundleProductInfoFragment.setArguments(bundle);
        bundleProductInfoFragment.q = list;
        return bundleProductInfoFragment;
    }

    public static void N2(FragmentActivity fragmentActivity, String str, List<Props.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cd9cfd", new Object[]{fragmentActivity, str, list});
        } else if (fragmentActivity != null && !TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            FloatFragment.C2(fragmentActivity, M2(str, list));
        }
    }

    public static /* synthetic */ Object ipc$super(BundleProductInfoFragment bundleProductInfoFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1512649357) {
            super.onResume();
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/handler/fragment/BundleProductInfoFragment");
        }
    }

    public final void K2(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa8e63", new Object[]{this, view});
        } else if (view != null && (view2 = this.r) != view) {
            if (view2 != null) {
                view2.setSelected(false);
            }
            this.r = view;
            view.setSelected(true);
            this.p = this.q.get(((Integer) view.getTag()).intValue()).b();
            this.s.notifyDataSetChanged();
            this.j.setVisibility(0);
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return layoutInflater.inflate(R.layout.tt_detail_float_dialog_production_params, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        } else {
            super.onResume();
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.s == null) {
            BundleProductAdapter bundleProductAdapter = new BundleProductAdapter();
            this.s = bundleProductAdapter;
            this.j.setAdapter((ListAdapter) bundleProductAdapter);
        }
        this.t = (RecyclerView) view.findViewById(R.id.pro_imgs);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(0);
        this.t.setLayoutManager(linearLayoutManager);
        this.t.addItemDecoration(new MyItemDecoration(this, ((int) getResources().getDisplayMetrics().density) * 12));
        if (this.t != null && this.u == null) {
            ProductImgAdapter productImgAdapter = new ProductImgAdapter();
            this.u = productImgAdapter;
            this.t.setAdapter(productImgAdapter);
        }
    }
}
