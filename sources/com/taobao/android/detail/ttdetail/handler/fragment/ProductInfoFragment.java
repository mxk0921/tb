package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.b5m;
import tb.mr7;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ProductInfoFragment extends GeneralFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ArrayList<Pair<String, String>> q;
    public ProductAdapter r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ProductAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262002);
        }

        public ProductAdapter() {
        }

        private void bindData(int i, Context context, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a879ed3", new Object[]{this, new Integer(i), context, aVar});
                return;
            }
            Pair pair = (Pair) ProductInfoFragment.E2(ProductInfoFragment.this).get(i);
            if (pair != null) {
                Object obj = pair.first;
                if (obj != null) {
                    aVar.f6839a.setText((CharSequence) obj);
                }
                Object obj2 = pair.second;
                if (obj2 != null) {
                    aVar.b.setText((CharSequence) obj2);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(ProductAdapter productAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/ProductInfoFragment$ProductAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (ProductInfoFragment.E2(ProductInfoFragment.this) == null) {
                return 0;
            }
            return ProductInfoFragment.E2(ProductInfoFragment.this).size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return ProductInfoFragment.E2(ProductInfoFragment.this).get(i);
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
                aVar = new a(ProductInfoFragment.this);
                aVar.f6839a = (TextView) view.findViewById(R.id.name);
                if (b5m.H().isI18nEdition()) {
                    ViewGroup.LayoutParams layoutParams = aVar.f6839a.getLayoutParams();
                    layoutParams.width = mr7.a(120.0f);
                    aVar.f6839a.setLayoutParams(layoutParams);
                }
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
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6839a;
        public TextView b;

        static {
            t2o.a(912262003);
        }

        public a(ProductInfoFragment productInfoFragment) {
        }
    }

    static {
        t2o.a(912262001);
    }

    public static /* synthetic */ ArrayList E2(ProductInfoFragment productInfoFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("5bd74cbe", new Object[]{productInfoFragment});
        }
        return productInfoFragment.q;
    }

    public static ProductInfoFragment J2(String str, ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductInfoFragment) ipChange.ipc$dispatch("ed89caf", new Object[]{str, arrayList});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FloatFragment.EXTRA_TITLE, str);
        ProductInfoFragment productInfoFragment = new ProductInfoFragment();
        productInfoFragment.setArguments(bundle);
        productInfoFragment.K2(arrayList);
        return productInfoFragment;
    }

    public static void M2(FragmentActivity fragmentActivity, String str, ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2311b11e", new Object[]{fragmentActivity, str, arrayList});
        } else if (fragmentActivity != null && !TextUtils.isEmpty(str) && arrayList != null && arrayList.size() != 0) {
            FloatFragment.C2(fragmentActivity, J2(str, arrayList));
        }
    }

    public static /* synthetic */ Object ipc$super(ProductInfoFragment productInfoFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/ProductInfoFragment");
    }

    public void K2(ArrayList<Pair<String, String>> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7b931ea", new Object[]{this, arrayList});
        } else {
            this.q = arrayList;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.GeneralFragment, com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.r == null) {
            ProductAdapter productAdapter = new ProductAdapter();
            this.r = productAdapter;
            this.j.setAdapter((ListAdapter) productAdapter);
        }
    }
}
