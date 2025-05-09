package com.taobao.android.detail.ttdetail.handler.fragment;

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
import java.util.List;
import java.util.Map;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class TaxDescFragment extends GeneralFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Map<String, List<Pair<String, String>>>> q;
    public TagDescAdapter r;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class TagDescAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262018);
        }

        public TagDescAdapter() {
        }

        private void bindData(int i, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("66a7ccb4", new Object[]{this, new Integer(i), aVar});
                return;
            }
            Map map = (Map) TaxDescFragment.E2(TaxDescFragment.this).get(i);
            for (String str : map.keySet()) {
                if (!TextUtils.isEmpty(str) && map.get(str) != null && ((List) map.get(str)).size() >= 1) {
                    aVar.f6843a.setText(str);
                    Pair pair = (Pair) ((List) map.get(str)).get(0);
                    if (pair != null) {
                        if (!TextUtils.isEmpty((CharSequence) pair.first)) {
                            aVar.b.setText((CharSequence) pair.first);
                            aVar.b.setVisibility(0);
                        } else {
                            aVar.b.setVisibility(8);
                        }
                        if (!TextUtils.isEmpty((CharSequence) pair.second)) {
                            aVar.c.setText((CharSequence) pair.second);
                            aVar.c.setVisibility(0);
                        } else {
                            aVar.c.setVisibility(8);
                        }
                    } else {
                        return;
                    }
                }
            }
        }

        public static /* synthetic */ Object ipc$super(TagDescAdapter tagDescAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/TaxDescFragment$TagDescAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (TaxDescFragment.E2(TaxDescFragment.this) == null) {
                return 0;
            }
            return TaxDescFragment.E2(TaxDescFragment.this).size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return TaxDescFragment.E2(TaxDescFragment.this).get(i);
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
                view = LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_tax_desc_item, (ViewGroup) null);
                aVar = new a(TaxDescFragment.this);
                aVar.f6843a = (TextView) view.findViewById(R.id.name);
                aVar.b = (TextView) view.findViewById(R.id.value);
                aVar.c = (TextView) view.findViewById(R.id.desc);
                view.setTag(aVar);
            } else {
                aVar = (a) view.getTag();
            }
            bindData(i, aVar);
            return view;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a {

        /* renamed from: a  reason: collision with root package name */
        public TextView f6843a;
        public TextView b;
        public TextView c;

        static {
            t2o.a(912262019);
        }

        public a(TaxDescFragment taxDescFragment) {
        }
    }

    static {
        t2o.a(912262017);
    }

    public static /* synthetic */ List E2(TaxDescFragment taxDescFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b509b442", new Object[]{taxDescFragment});
        }
        return taxDescFragment.q;
    }

    public static TaxDescFragment J2(String str, List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaxDescFragment) ipChange.ipc$dispatch("cc5711c3", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        bundle.putString(FloatFragment.EXTRA_TITLE, str);
        TaxDescFragment taxDescFragment = new TaxDescFragment();
        taxDescFragment.setArguments(bundle);
        taxDescFragment.K2(list);
        return taxDescFragment;
    }

    public static void M2(FragmentActivity fragmentActivity, String str, List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5cd9cfd", new Object[]{fragmentActivity, str, list});
        } else if (fragmentActivity != null && !TextUtils.isEmpty(str) && list != null && list.size() != 0) {
            FloatFragment.C2(fragmentActivity, J2(str, list));
        }
    }

    public static /* synthetic */ Object ipc$super(TaxDescFragment taxDescFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/TaxDescFragment");
    }

    public void K2(List<Map<String, List<Pair<String, String>>>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bd3ccb1", new Object[]{this, list});
        } else {
            this.q = list;
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
            TagDescAdapter tagDescAdapter = new TagDescAdapter();
            this.r = tagDescAdapter;
            this.j.setAdapter((ListAdapter) tagDescAdapter);
        }
    }
}
