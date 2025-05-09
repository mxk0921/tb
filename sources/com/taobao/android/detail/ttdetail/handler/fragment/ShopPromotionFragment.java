package com.taobao.android.detail.ttdetail.handler.fragment;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.Resource;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;
import com.taobao.android.detail.ttdetail.widget.FilterImageView;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.egr;
import tb.ir;
import tb.mr7;
import tb.t2o;
import tb.tq4;
import tb.ze7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ShopPromotionFragment extends FloatFragment {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public List<Resource.h> p;
    public ShopPromotionAdapter q;
    public int r;
    public ze7 s;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$1  reason: invalid class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class AnonymousClass1 extends JSONObject {
        public final /* synthetic */ String val$url;

        public AnonymousClass1(String str) {
            this.val$url = str;
            put("type", "openUrl");
            put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.1.1
                {
                    put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.1.1.1
                        {
                            put("url", (Object) AnonymousClass1.this.val$url);
                        }
                    });
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ShopPromotionAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$ShopPromotionAdapter$3  reason: invalid class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class AnonymousClass3 implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Resource.h f6840a;

            /* compiled from: Taobao */
            /* renamed from: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment$ShopPromotionAdapter$3$1  reason: invalid class name */
            /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
            public class AnonymousClass1 extends JSONObject {
                public AnonymousClass1() {
                    put("type", "openUrl");
                    put("fields", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.3.1.1
                        {
                            put("params", (Object) new JSONObject() { // from class: com.taobao.android.detail.ttdetail.handler.fragment.ShopPromotionFragment.ShopPromotionAdapter.3.1.1.1
                                {
                                    put("url", (Object) AnonymousClass3.this.f6840a.a());
                                }
                            });
                        }
                    });
                }
            }

            public AnonymousClass3(Resource.h hVar) {
                this.f6840a = hVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ShopPromotionFragment.J2(ShopPromotionFragment.this).b().h(new ir(new AnonymousClass1()), new RuntimeAbilityParam[0]);
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ Resource.h f6841a;

            public a(Resource.h hVar) {
                this.f6841a = hVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                } else {
                    ShopPromotionFragment.E2(ShopPromotionFragment.this, this.f6841a.a());
                }
            }
        }

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class b implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f6842a;

            public b(String str) {
                this.f6842a = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                ShopPromotionFragment shopPromotionFragment = ShopPromotionFragment.this;
                ShopPromotionFragment.E2(shopPromotionFragment, shopPromotionFragment.d.getString(R.string.tt_detail_url, this.f6842a));
            }
        }

        static {
            t2o.a(912262008);
        }

        public ShopPromotionAdapter() {
        }

        private void addDivision(RelativeLayout relativeLayout, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45935758", new Object[]{this, relativeLayout, new Integer(i)});
                return;
            }
            View view = new View(ShopPromotionFragment.this.d);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, 1);
            layoutParams.setMargins(0, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 12, 0, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 12);
            view.setBackgroundColor(436207616);
            layoutParams.addRule(1, R.id.icon_text);
            layoutParams.addRule(3, i);
            view.setLayoutParams(layoutParams);
            relativeLayout.addView(view);
        }

        private void bindData2(int i, Context context, ViewGroup viewGroup) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("19c58d76", new Object[]{this, new Integer(i), context, viewGroup});
                return;
            }
            Resource.h hVar = ShopPromotionFragment.this.p.get(i);
            if (hVar.c() == null || hVar.c().size() <= 0) {
                handleNoGiftContent(viewGroup, hVar);
            } else {
                handleWithGiftContent(viewGroup, hVar);
            }
        }

        private View createGiftOfContentItemView(Context context, Resource.e eVar, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("e128d423", new Object[]{this, context, eVar, new Integer(i), new Integer(i2)});
            }
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            FilterImageView filterImageView = new FilterImageView(context);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            layoutParams.setMargins(0, 0, 0, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 3);
            linearLayout.addView(filterImageView, layoutParams);
            egr.d().e(eVar.b(), filterImageView);
            TextView textView = new TextView(context);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(mr7.b(context, 2.0f), 0, 0, 0);
            textView.setMinLines(2);
            textView.setMaxLines(2);
            textView.setLineSpacing(ShopPromotionFragment.D2(ShopPromotionFragment.this) * 2, 1.0f);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(context.getResources().getColor(R.color.tt_detail_6));
            textView.setTextSize(12.0f);
            textView.setText(eVar.c());
            linearLayout.addView(textView, layoutParams2);
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
            if (i2 > 0) {
                layoutParams3.setMargins(ShopPromotionFragment.D2(ShopPromotionFragment.this) * 3, 0, 0, 0);
            }
            linearLayout.setLayoutParams(layoutParams3);
            return linearLayout;
        }

        private int getSize() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ae43b971", new Object[]{this})).intValue();
            }
            int f = (mr7.f(tq4.c(ShopPromotionFragment.this)) - (mr7.b(ShopPromotionFragment.this.d, 22.0f) * 2)) / 3;
            return f - (f / 6);
        }

        private boolean handleGift(Resource.h hVar, int i, ViewGroup viewGroup) {
            ArrayList<Resource.e> arrayList;
            View view;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bb1a1813", new Object[]{this, hVar, new Integer(i), viewGroup})).booleanValue();
            }
            Iterator<Resource.f> it = hVar.c().iterator();
            Resource.f fVar = null;
            while (it.hasNext()) {
                Resource.f next = it.next();
                if (next.f6761a == i) {
                    fVar = next;
                }
            }
            if (fVar == null || (arrayList = fVar.b) == null || arrayList.size() == 0) {
                return false;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.d).inflate(R.layout.tt_detail_main_shop_promotion_sub_item, viewGroup, false);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(0, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 6, 0, 0);
            layoutParams.addRule(3, R.id.sub_container);
            layoutParams.addRule(1, R.id.icon_text);
            inflate.setLayoutParams(layoutParams);
            LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.recommend_items_container);
            int size = getSize();
            for (int i2 = 0; i2 < fVar.b.size(); i2++) {
                try {
                    String a2 = fVar.b.get(i2).a();
                    view = createGiftOfContentItemView(ShopPromotionFragment.this.d, fVar.b.get(i2), size, i2);
                    ViewProxy.setOnClickListener(view, new b(a2));
                } catch (Exception unused) {
                    view = null;
                }
                linearLayout.addView(view);
            }
            viewGroup.addView(inflate);
            return true;
        }

        private void handleMoreGiftContent(ViewGroup viewGroup, Resource.h hVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c07e2a3", new Object[]{this, viewGroup, hVar, new Integer(i)});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.d).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (hVar.d() == null || "".equals(hVar.d())) {
                textView.setVisibility(8);
            } else {
                textView.setText(hVar.d());
            }
            textView.setVisibility(4);
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!TextUtils.isEmpty(hVar.e())) {
                textView2.setVisibility(0);
                textView2.setText(hVar.e());
            } else {
                textView2.setVisibility(8);
            }
            relativeLayout.findViewById(R.id.right_icon).setVisibility(8);
            ((TextView) relativeLayout.findViewById(R.id.content)).setText(hVar.b().get(i));
            viewGroup.addView(relativeLayout);
            if (handleGift(hVar, i, relativeLayout)) {
                if (i < hVar.b().size() - 1) {
                    addDivision(relativeLayout, R.id.recommend_items);
                }
            } else if (i < hVar.b().size() - 1) {
                addDivision(relativeLayout, R.id.sub_container);
            }
        }

        private void handleNoGiftContent(ViewGroup viewGroup, Resource.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8e9a8ecc", new Object[]{this, viewGroup, hVar});
                return;
            }
            View inflate = LayoutInflater.from(ShopPromotionFragment.this.d).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) inflate.findViewById(R.id.icon_text);
            if (hVar.d() == null || "".equals(hVar.d())) {
                textView.setVisibility(8);
            } else {
                textView.setText(hVar.d());
            }
            TextView textView2 = (TextView) inflate.findViewById(R.id.period);
            if (!TextUtils.isEmpty(hVar.e())) {
                textView2.setVisibility(0);
                textView2.setText(hVar.e());
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) inflate.findViewById(R.id.right_icon);
            if (!TextUtils.isEmpty(hVar.a())) {
                textView3.setVisibility(0);
                ViewProxy.setOnClickListener(inflate, new AnonymousClass3(hVar));
                inflate.setClickable(true);
            } else {
                textView3.setVisibility(8);
                inflate.setClickable(false);
            }
            StringBuilder sb = new StringBuilder();
            if (hVar.b() != null) {
                for (int i = 0; i < hVar.b().size(); i++) {
                    sb.append(hVar.b().get(i));
                    if (i != hVar.b().size() - 1) {
                        sb.append(';');
                    }
                }
                ((TextView) inflate.findViewById(R.id.content)).setText(sb.toString());
            }
            viewGroup.addView(inflate);
        }

        private void handleWithGiftContent(ViewGroup viewGroup, Resource.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("faa2e451", new Object[]{this, viewGroup, hVar});
                return;
            }
            RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(ShopPromotionFragment.this.d).inflate(R.layout.tt_detail_main_shop_promotion_item, viewGroup, false);
            TextView textView = (TextView) relativeLayout.findViewById(R.id.icon_text);
            if (hVar.d() == null || "".equals(hVar.d())) {
                textView.setVisibility(8);
            } else {
                textView.setText(hVar.d());
            }
            TextView textView2 = (TextView) relativeLayout.findViewById(R.id.period);
            if (!TextUtils.isEmpty(hVar.e())) {
                textView2.setVisibility(0);
                textView2.setText(hVar.e());
            } else {
                textView2.setVisibility(8);
            }
            TextView textView3 = (TextView) relativeLayout.findViewById(R.id.right_icon);
            if (!TextUtils.isEmpty(hVar.a())) {
                textView3.setVisibility(0);
                textView3.setOnClickListener(new a(hVar));
            } else {
                textView3.setVisibility(8);
            }
            if (hVar.b() != null && hVar.b().size() > 0) {
                ((TextView) relativeLayout.findViewById(R.id.content)).setText(hVar.b().get(0));
            }
            viewGroup.addView(relativeLayout);
            if (hVar.b() != null && hVar.b().size() > 0) {
                if (handleGift(hVar, 0, relativeLayout)) {
                    if (hVar.b().size() > 1) {
                        addDivision(relativeLayout, R.id.recommend_items);
                    }
                } else if (hVar.b().size() > 1) {
                    addDivision(relativeLayout, R.id.sub_container);
                }
            }
            if (hVar.b() != null && hVar.b().size() > 1) {
                for (int i = 1; i < hVar.b().size(); i++) {
                    handleMoreGiftContent(viewGroup, hVar, i);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(ShopPromotionAdapter shopPromotionAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/handler/fragment/ShopPromotionFragment$ShopPromotionAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            List<Resource.h> list = ShopPromotionFragment.this.p;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return ShopPromotionFragment.this.p.get(i);
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
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("277ed392", new Object[]{this, new Integer(i), view, viewGroup});
            }
            LinearLayout linearLayout = new LinearLayout(tq4.d(viewGroup));
            AbsListView.LayoutParams layoutParams = new AbsListView.LayoutParams(-1, -2);
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setPadding(ShopPromotionFragment.D2(ShopPromotionFragment.this) * 12, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 15, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 12, ShopPromotionFragment.D2(ShopPromotionFragment.this) * 15);
            bindData2(i, tq4.d(viewGroup), linearLayout);
            return linearLayout;
        }
    }

    static {
        t2o.a(912262004);
    }

    public static /* synthetic */ int D2(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b57f6287", new Object[]{shopPromotionFragment})).intValue();
        }
        return shopPromotionFragment.r;
    }

    public static /* synthetic */ void E2(ShopPromotionFragment shopPromotionFragment, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4efd4fbd", new Object[]{shopPromotionFragment, str});
        } else {
            shopPromotionFragment.M2(str);
        }
    }

    public static /* synthetic */ ze7 J2(ShopPromotionFragment shopPromotionFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ze7) ipChange.ipc$dispatch("c53bba68", new Object[]{shopPromotionFragment});
        }
        return shopPromotionFragment.s;
    }

    public static ShopPromotionFragment K2(String str, List<Resource.h> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ShopPromotionFragment) ipChange.ipc$dispatch("d0d68072", new Object[]{str, list});
        }
        Bundle bundle = new Bundle();
        ShopPromotionFragment shopPromotionFragment = new ShopPromotionFragment();
        shopPromotionFragment.O2(list);
        shopPromotionFragment.setArguments(bundle);
        return shopPromotionFragment;
    }

    public static void Q2(FragmentActivity fragmentActivity, String str, List<Resource.h> list, ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baebd561", new Object[]{fragmentActivity, str, list, ze7Var});
        } else if (fragmentActivity != null && !TextUtils.isEmpty(str) && list != null) {
            ShopPromotionFragment K2 = K2(str, list);
            K2.N2(ze7Var);
            FloatFragment.C2(fragmentActivity, K2);
        }
    }

    public static /* synthetic */ Object ipc$super(ShopPromotionFragment shopPromotionFragment, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -641568046) {
            super.onCreate((Bundle) objArr[0]);
            return null;
        } else if (hashCode == 1860817453) {
            super.onViewCreated((View) objArr[0], (Bundle) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/detail/ttdetail/handler/fragment/ShopPromotionFragment");
        }
    }

    public final void M2(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f95f9f", new Object[]{this, str});
        } else {
            this.s.b().h(new ir(new AnonymousClass1(str)), new RuntimeAbilityParam[0]);
        }
    }

    public final void N2(ze7 ze7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6da58e47", new Object[]{this, ze7Var});
        } else {
            this.s = ze7Var;
        }
    }

    public void O2(List<Resource.h> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53702541", new Object[]{this, list});
        } else {
            this.p = list;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        super.onCreate(bundle);
        this.r = (int) getResources().getDisplayMetrics().density;
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        return layoutInflater.inflate(R.layout.tt_detail_float_dialog, viewGroup, false);
    }

    @Override // com.taobao.android.detail.ttdetail.handler.fragment.FloatFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee9d22d", new Object[]{this, view, bundle});
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.q == null) {
            ShopPromotionAdapter shopPromotionAdapter = new ShopPromotionAdapter();
            this.q = shopPromotionAdapter;
            this.j.setAdapter((ListAdapter) shopPromotionAdapter);
            List<Resource.h> list = this.p;
            if (list != null && list.size() == 1) {
                this.j.setDivider(null);
            }
        }
    }
}
