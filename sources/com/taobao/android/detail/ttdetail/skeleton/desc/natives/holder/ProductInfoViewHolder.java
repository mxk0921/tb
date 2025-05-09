package com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.widget.desc.image.DetailImageView;
import com.taobao.tao.image.ImageStrategyConfig;
import com.taobao.tao.util.ImageStrategyDecider;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.hme;
import tb.kd7;
import tb.koe;
import tb.lvp;
import tb.mr7;
import tb.pzm;
import tb.q84;
import tb.t2o;
import tb.z3a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ProductInfoViewHolder extends kd7<pzm> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int DETAIL_IMG_BIZ_CODE = 15;
    public static final String DETAIL_IMG_BIZ_NAME = "detail";
    public final LinearLayout j;
    public final int m;
    public final koe n;
    public TextView o;
    public final hme p;
    public int q;
    public final int r;
    public final int s;
    public final int t;
    public int h = 8;
    public int i = 5;
    public ArrayList<pzm.b> k = null;
    public ProductInfoAdapter l = null;
    public final ImageStrategyConfig u = ImageStrategyConfig.v("detail", 15).d(false).a();
    public final View.OnClickListener v = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class ProductInfoAdapter extends BaseAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public ArrayList<pzm.b> list;
        public ArrayList<pzm.b> showlist;
        public int shownumber;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
        public class a implements View.OnClickListener {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ DetailImageView f6898a;
            public final /* synthetic */ String b;

            public a(DetailImageView detailImageView, String str) {
                this.f6898a = detailImageView;
                this.b = str;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                    return;
                }
                z3a z3aVar = new z3a();
                z3aVar.f32510a = true;
                z3aVar.b = 0;
                z3aVar.e = this.f6898a;
                z3aVar.d.add(this.b);
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(ImageStrategyDecider.decideUrl(this.b, 430, 430, ProductInfoViewHolder.H(ProductInfoViewHolder.this)));
                z3aVar.a(arrayList);
                q84.f(ProductInfoViewHolder.this.f22590a, new lvp(z3aVar));
            }
        }

        static {
            t2o.a(912262391);
        }

        public ProductInfoAdapter(ArrayList<pzm.b> arrayList) {
            int i;
            this.list = null;
            this.showlist = null;
            this.shownumber = ProductInfoViewHolder.C(ProductInfoViewHolder.this);
            this.list = arrayList;
            this.showlist = new ArrayList<>();
            int size = arrayList.size();
            if (size > ProductInfoViewHolder.C(ProductInfoViewHolder.this)) {
                i = ProductInfoViewHolder.C(ProductInfoViewHolder.this);
            } else {
                i = size;
            }
            this.shownumber = i;
            for (int i2 = 0; i2 < this.shownumber; i2++) {
                this.showlist.add(arrayList.get(i2));
            }
            if (size > ProductInfoViewHolder.C(ProductInfoViewHolder.this)) {
                ProductInfoViewHolder.y(ProductInfoViewHolder.this, 1);
            }
        }

        public static /* synthetic */ Object ipc$super(ProductInfoAdapter productInfoAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ProductInfoViewHolder$ProductInfoAdapter");
        }

        @Override // android.widget.Adapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.showlist.size();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("8bc6621f", new Object[]{this, new Integer(i)});
            }
            return this.showlist.get(i);
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
            pzm.b bVar = this.showlist.get(i);
            TextView textView = new TextView(ProductInfoViewHolder.this.f22590a);
            textView.setIncludeFontPadding(false);
            textView.setTextColor(ProductInfoViewHolder.this.c.getColor(R.color.tt_detail_desc_product_key));
            textView.setTextSize(1, 14.0f);
            textView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.D(ProductInfoViewHolder.this), -2));
            textView.setGravity(48);
            textView.setText(bVar.f26413a);
            if (bVar.b != null) {
                TextView textView2 = new TextView(ProductInfoViewHolder.this.f22590a);
                textView2.setText(bVar.b);
                textView2.setTextColor(ProductInfoViewHolder.this.c.getColor(R.color.tt_detail_desc_normal_text));
                textView2.setIncludeFontPadding(false);
                textView2.setTextSize(1, 14.0f);
                return ProductInfoViewHolder.this.J(textView, textView2);
            }
            ArrayList<View> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < bVar.c.size(); i2++) {
                DetailImageView detailImageView = new DetailImageView(ProductInfoViewHolder.this.f22590a);
                detailImageView.setLayoutParams(new ViewGroup.LayoutParams(ProductInfoViewHolder.E(ProductInfoViewHolder.this), ProductInfoViewHolder.E(ProductInfoViewHolder.this)));
                String str = bVar.c.get(i2);
                ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
                productInfoViewHolder.n(detailImageView, str, ProductInfoViewHolder.F(productInfoViewHolder), null, ProductInfoViewHolder.G(ProductInfoViewHolder.this));
                detailImageView.setOnClickListener(new a(detailImageView, str));
                arrayList.add(detailImageView);
            }
            ProductInfoViewHolder productInfoViewHolder2 = ProductInfoViewHolder.this;
            return productInfoViewHolder2.J(textView, productInfoViewHolder2.L(arrayList));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            if (2 == ProductInfoViewHolder.x(ProductInfoViewHolder.this)) {
                ProductInfoViewHolder.z(ProductInfoViewHolder.this).showlist.clear();
                for (int i = 0; i < ProductInfoViewHolder.z(ProductInfoViewHolder.this).shownumber; i++) {
                    ProductInfoViewHolder.z(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.A(ProductInfoViewHolder.this).get(i));
                }
                if (ProductInfoViewHolder.A(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.z(ProductInfoViewHolder.this).shownumber) {
                    ProductInfoViewHolder.y(ProductInfoViewHolder.this, 1);
                }
            } else if (1 == ProductInfoViewHolder.x(ProductInfoViewHolder.this)) {
                for (int i2 = ProductInfoViewHolder.z(ProductInfoViewHolder.this).shownumber; i2 < ProductInfoViewHolder.A(ProductInfoViewHolder.this).size(); i2++) {
                    ProductInfoViewHolder.z(ProductInfoViewHolder.this).showlist.add(ProductInfoViewHolder.A(ProductInfoViewHolder.this).get(i2));
                }
                if (ProductInfoViewHolder.A(ProductInfoViewHolder.this).size() > ProductInfoViewHolder.B(ProductInfoViewHolder.this)) {
                    ProductInfoViewHolder.y(ProductInfoViewHolder.this, 2);
                } else {
                    ProductInfoViewHolder.y(ProductInfoViewHolder.this, 0);
                }
            }
            ProductInfoViewHolder productInfoViewHolder = ProductInfoViewHolder.this;
            productInfoViewHolder.w(ProductInfoViewHolder.z(productInfoViewHolder));
        }
    }

    static {
        t2o.a(912262389);
    }

    public ProductInfoViewHolder(Context context) {
        super(context);
        this.j = null;
        int a2 = mr7.a(56.0f);
        this.r = a2;
        int a3 = mr7.a(18.0f);
        this.s = a3;
        int a4 = mr7.a(25.0f);
        this.t = a4;
        int f = ((((mr7.f(context) - a2) - a3) - a4) - 2) / 3;
        this.m = f;
        this.n = new koe(f, f);
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        this.j = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(this.f22590a.getResources().getColor(R.color.tt_detail_desc_normal_background));
        hme.a aVar = new hme.a();
        int i = R.drawable.tt_detail_img_load_fail;
        this.p = aVar.p(i).q(i).t(ImageView.ScaleType.CENTER_CROP).m();
    }

    public static /* synthetic */ ArrayList A(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("3ddd12d5", new Object[]{productInfoViewHolder});
        }
        return productInfoViewHolder.k;
    }

    public static /* synthetic */ int B(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("67156e0d", new Object[]{productInfoViewHolder})).intValue();
        }
        return productInfoViewHolder.h;
    }

    public static /* synthetic */ int C(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("36d5a1ac", new Object[]{productInfoViewHolder})).intValue();
        }
        return productInfoViewHolder.i;
    }

    public static /* synthetic */ int D(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("695d54b", new Object[]{productInfoViewHolder})).intValue();
        }
        return productInfoViewHolder.r;
    }

    public static /* synthetic */ int E(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d65608ea", new Object[]{productInfoViewHolder})).intValue();
        }
        return productInfoViewHolder.m;
    }

    public static /* synthetic */ koe F(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (koe) ipChange.ipc$dispatch("eba96cd", new Object[]{productInfoViewHolder});
        }
        return productInfoViewHolder.n;
    }

    public static /* synthetic */ hme G(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hme) ipChange.ipc$dispatch("632fc0ad", new Object[]{productInfoViewHolder});
        }
        return productInfoViewHolder.p;
    }

    public static /* synthetic */ ImageStrategyConfig H(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ImageStrategyConfig) ipChange.ipc$dispatch("e9a680b5", new Object[]{productInfoViewHolder});
        }
        return productInfoViewHolder.u;
    }

    public static /* synthetic */ Object ipc$super(ProductInfoViewHolder productInfoViewHolder, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/ProductInfoViewHolder");
    }

    public static /* synthetic */ int x(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f7d4d330", new Object[]{productInfoViewHolder})).intValue();
        }
        return productInfoViewHolder.q;
    }

    public static /* synthetic */ int y(ProductInfoViewHolder productInfoViewHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ce1cc05b", new Object[]{productInfoViewHolder, new Integer(i)})).intValue();
        }
        productInfoViewHolder.q = i;
        return i;
    }

    public static /* synthetic */ ProductInfoAdapter z(ProductInfoViewHolder productInfoViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ProductInfoAdapter) ipChange.ipc$dispatch("b62181a0", new Object[]{productInfoViewHolder});
        }
        return productInfoViewHolder.l;
    }

    public LinearLayout J(View view, View view2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("74c0ddcd", new Object[]{this, view, view2});
        }
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        linearLayout.setOrientation(0);
        view2.setPadding(this.t, 0, 0, 0);
        linearLayout.setPadding(this.s, 0, 0, 0);
        linearLayout.addView(view);
        linearLayout.addView(view2);
        return linearLayout;
    }

    /* renamed from: K */
    public View j(pzm pzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e924c82d", new Object[]{this, pzmVar});
        }
        int i = pzmVar.k;
        if (i > 0) {
            this.h = i;
        }
        int i2 = pzmVar.l;
        if (i2 > 0) {
            this.i = i2;
        }
        int i3 = this.i;
        if (i3 >= this.h) {
            this.h = i3;
        }
        ArrayList<pzm.b> arrayList = pzmVar.m;
        this.k = arrayList;
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f22590a);
        }
        ProductInfoAdapter productInfoAdapter = new ProductInfoAdapter(this.k);
        this.l = productInfoAdapter;
        w(productInfoAdapter);
        return this.j;
    }

    public LinearLayout L(ArrayList<View> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinearLayout) ipChange.ipc$dispatch("5ad9fff5", new Object[]{this, arrayList});
        }
        LinearLayout linearLayout = new LinearLayout(this.f22590a);
        linearLayout.setOrientation(0);
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == 0) {
                int i2 = this.m;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
                View view = arrayList.get(i);
                view.setLayoutParams(layoutParams);
                linearLayout.addView(view);
            } else {
                int i3 = this.m;
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(i3, i3);
                View view2 = arrayList.get(i);
                layoutParams2.setMargins(mr7.a(3.0f), 0, 0, 0);
                view2.setLayoutParams(layoutParams2);
                linearLayout.addView(view2);
            }
        }
        return linearLayout;
    }

    public View M(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8b29bd", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f22590a);
        }
        if (this.o == null) {
            TextView textView = new TextView(this.f22590a);
            this.o = textView;
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.o.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.o.setPadding(0, mr7.a(10.0f), 0, mr7.a(10.0f));
            this.o.setGravity(17);
            this.o.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.o.setTextSize(1, 14.0f);
        }
        this.o.setText(str);
        this.o.setOnClickListener(onClickListener);
        return this.o;
    }

    /* renamed from: e */
    public void h(pzm pzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40680d39", new Object[]{this, pzmVar});
        }
    }

    /* renamed from: k */
    public boolean m(pzm pzmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c3f413bd", new Object[]{this, pzmVar})).booleanValue();
        }
        return false;
    }

    public void w(BaseAdapter baseAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c0eebc4", new Object[]{this, baseAdapter});
            return;
        }
        int count = baseAdapter.getCount();
        this.j.removeAllViews();
        for (int i = 0; i < count; i++) {
            View view = baseAdapter.getView(i, null, null);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.topMargin = mr7.a(12.0f);
            if (view instanceof TextView) {
                layoutParams.gravity = 1;
            }
            if (i == count - 1) {
                layoutParams.bottomMargin = mr7.a(12.0f);
            }
            this.j.addView(view, layoutParams);
        }
        int i2 = this.q;
        if (i2 == 1) {
            TextView textView = this.o;
            if (textView == null) {
                M(this.c.getString(R.string.tt_detail_desc_see_more), this.v);
            } else {
                textView.setText(this.c.getString(R.string.tt_detail_desc_see_more));
            }
            this.j.addView(this.o);
        } else if (i2 == 2) {
            TextView textView2 = this.o;
            if (textView2 == null) {
                M(this.c.getString(R.string.tt_detail_desc_pack_up), this.v);
            } else {
                textView2.setText(this.c.getString(R.string.tt_detail_desc_pack_up));
            }
            this.j.addView(this.o);
        }
    }
}
