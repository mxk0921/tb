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
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.t2o;
import tb.tq4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class GeneralFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public GeneralAdapter p;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class GeneralAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261998);
        }

        public GeneralAdapter() {
        }

        private void bindData(int i, Context context, a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd9d80be", new Object[]{this, new Integer(i), context, aVar});
                return;
            }
            Pair pair = (Pair) GeneralFragment.D2(GeneralFragment.this).get(i);
            if (pair != null) {
                Object obj = pair.first;
                if (obj == null || TextUtils.isEmpty((CharSequence) obj)) {
                    aVar.c.setVisibility(8);
                    aVar.f6838a.setVisibility(8);
                } else {
                    aVar.f6838a.setText((CharSequence) pair.first);
                }
                Object obj2 = pair.second;
                if (obj2 != null) {
                    aVar.b.setText((CharSequence) obj2);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(GeneralAdapter generalAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/GeneralFragment$GeneralAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            if (GeneralFragment.D2(GeneralFragment.this) == null) {
                return 0;
            }
            return GeneralFragment.D2(GeneralFragment.this).size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return GeneralFragment.D2(GeneralFragment.this).get(i);
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
                view = LayoutInflater.from(tq4.d(viewGroup)).inflate(R.layout.tt_detail_main_general_info_item, (ViewGroup) null);
                aVar = new a(GeneralFragment.this);
                aVar.f6838a = (TextView) view.findViewById(R.id.name);
                aVar.b = (TextView) view.findViewById(R.id.value);
                aVar.c = view.findViewById(R.id.space);
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
        public TextView f6838a;
        public TextView b;
        public View c;

        static {
            t2o.a(912262000);
        }

        public a(GeneralFragment generalFragment) {
        }
    }

    static {
        t2o.a(912261997);
    }

    public static /* synthetic */ ArrayList D2(GeneralFragment generalFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9205e133", new Object[]{generalFragment});
        }
        generalFragment.getClass();
        return null;
    }

    public static /* synthetic */ Object ipc$super(GeneralFragment generalFragment, String str, Object... objArr) {
        if (str.hashCode() == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/GeneralFragment");
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.p == null) {
            GeneralAdapter generalAdapter = new GeneralAdapter();
            this.p = generalAdapter;
            this.j.setAdapter((ListAdapter) generalAdapter);
        }
    }
}
