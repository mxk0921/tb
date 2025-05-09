package com.taobao.android.shop.features.category;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.ArrayList;
import java.util.List;
import tb.frp;
import tb.lf3;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CategoryAdapter extends RecyclerView.Adapter<MyHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f9404a = -1;
    public List<lf3> b;
    public final LayoutInflater c;
    public e d;
    public Context e;
    public View f;
    public TextView g;
    public View h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class MyHolder extends RecyclerView.ViewHolder {

        /* renamed from: a  reason: collision with root package name */
        public final TextView f9405a;
        public final TUrlImageView b;
        public final View c;
        public final TextView d;
        public final View e;
        public final View f;

        static {
            t2o.a(764411965);
        }

        public MyHolder(View view, int i) {
            super(view);
            if (i == 0) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_item1_title);
                View findViewById = view.findViewById(R.id.shop_category_group_item1_divider);
                this.e = findViewById;
                this.f = view.findViewById(R.id.shop_category_group_item1_selected);
                findViewById.setVisibility(0);
                ((TextView) view.findViewById(R.id.shop_category_group_item1_all)).setVisibility(8);
                ((ImageView) view.findViewById(R.id.shop_category_group_item1_next_img)).setVisibility(0);
            } else if (i == 1) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_item1_title);
                View findViewById2 = view.findViewById(R.id.shop_category_group_item1_divider);
                this.e = findViewById2;
                this.f = view.findViewById(R.id.shop_category_group_item1_selected);
                findViewById2.setVisibility(8);
                ((TextView) view.findViewById(R.id.shop_category_group_item1_all)).setVisibility(0);
                ((ImageView) view.findViewById(R.id.shop_category_group_item1_next_img)).setVisibility(8);
            } else if (i == 2) {
                this.f9405a = (TextView) view.findViewById(R.id.shop_category_child_gridview_item_title);
                this.b = (TUrlImageView) view.findViewById(R.id.shop_category_child_gridview_item_img);
                this.c = view.findViewById(R.id.shop_category_child_gridview_item_selected);
            } else if (i == 3) {
                this.d = (TextView) view.findViewById(R.id.shop_category_group_all_item_title);
                ImageView imageView = (ImageView) view.findViewById(R.id.shop_category_group_all_item_next_img);
                this.e = view.findViewById(R.id.shop_category_group_all_item_divider);
                this.f = view.findViewById(R.id.shop_category_group_all_item_selected);
            } else if (i == 4) {
                this.f9405a = (TextView) view.findViewById(R.id.shop_category_child_gridview_item_title);
                this.b = (TUrlImageView) view.findViewById(R.id.shop_category_child_gridview_item_img);
                this.c = view.findViewById(R.id.shop_category_child_gridview_item_selected);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MyHolder f9406a;

        public a(MyHolder myHolder) {
            this.f9406a = myHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int adapterPosition = this.f9406a.getAdapterPosition();
            if (adapterPosition != -1) {
                CategoryAdapter.Q(CategoryAdapter.this, adapterPosition);
                CategoryAdapter.this.d.OnItemClick(adapterPosition);
                CategoryAdapter.this.O();
                CategoryAdapter.this.P(this.f9406a, adapterPosition);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MyHolder f9407a;

        public b(MyHolder myHolder) {
            this.f9407a = myHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            int adapterPosition = this.f9407a.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            CategoryAdapter.this.d.OnItemLongClick(adapterPosition);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MyHolder f9408a;

        public c(MyHolder myHolder) {
            this.f9408a = myHolder;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            int adapterPosition = this.f9408a.getAdapterPosition();
            if (adapterPosition != -1) {
                CategoryAdapter.Q(CategoryAdapter.this, adapterPosition);
                CategoryAdapter.this.d.OnItemClick(adapterPosition);
                CategoryAdapter.this.O();
                CategoryAdapter.this.P(this.f9408a, adapterPosition);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d implements View.OnLongClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ MyHolder f9409a;

        public d(MyHolder myHolder) {
            this.f9409a = myHolder;
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("7edba102", new Object[]{this, view})).booleanValue();
            }
            int adapterPosition = this.f9409a.getAdapterPosition();
            if (adapterPosition == -1) {
                return false;
            }
            CategoryAdapter.this.d.OnItemLongClick(adapterPosition);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
        void OnItemClick(int i);

        void OnItemLongClick(int i);
    }

    static {
        t2o.a(764411960);
    }

    public CategoryAdapter(List<lf3> list, Context context) {
        this.e = context;
        if (list != null) {
            this.b = list;
        } else {
            ArrayList arrayList = new ArrayList();
            this.b = arrayList;
            arrayList.add(new lf3(null, null, null, null, null, -1, -1, false));
        }
        this.b = list;
        this.c = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public static /* synthetic */ int Q(CategoryAdapter categoryAdapter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bce241a", new Object[]{categoryAdapter, new Integer(i)})).intValue();
        }
        categoryAdapter.f9404a = i;
        return i;
    }

    public static /* synthetic */ Object ipc$super(CategoryAdapter categoryAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/shop/features/category/CategoryAdapter");
    }

    public void M(MyHolder myHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fad5a976", new Object[]{this, myHolder, new Integer(i)});
            return;
        }
        List<lf3> list = this.b;
        if (list != null && list.get(i) != null) {
            if (this.b.get(i).d != 2 && this.b.get(i).d != 4) {
                myHolder.d.setText(this.b.get(i).b);
            } else if (this.b.get(i).d == 2 || this.b.get(i).d == 4) {
                lf3 lf3Var = this.b.get(i);
                if (!TextUtils.isEmpty(lf3Var.c)) {
                    myHolder.b.setVisibility(0);
                    myHolder.b.setImageUrl(lf3Var.c);
                } else {
                    myHolder.b.setVisibility(8);
                }
                if ((myHolder.b.getVisibility() == 0 && myHolder.b.getDrawable() == null) || myHolder.b.getVisibility() == 8) {
                    myHolder.f9405a.setText(this.b.get(i).b);
                }
            }
        }
    }

    public boolean N(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34724051", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.b.get(i).d == 0 || this.b.get(i).d == 1) {
            return false;
        }
        if (this.b.get(i).d == 2) {
            boolean z = this.b.get(i).e;
        }
        return true;
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c7ff29f", new Object[]{this});
            return;
        }
        View view = this.f;
        if (view != null) {
            view.setVisibility(8);
        }
        TextView textView = this.g;
        if (textView != null) {
            textView.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        }
        View view2 = this.h;
        if (view2 != null) {
            view2.setBackgroundColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_C));
        }
    }

    public void P(MyHolder myHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17113dd2", new Object[]{this, myHolder, new Integer(i)});
        } else if (i == this.f9404a) {
            if (this.b.get(i).d == 0) {
                if (i != 0) {
                    View view = myHolder.f;
                    this.f = view;
                    this.g = myHolder.d;
                    view.setVisibility(0);
                    myHolder.d.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_B));
                } else if (i == 0) {
                    View view2 = myHolder.f;
                    this.f = view2;
                    view2.setVisibility(0);
                    TextView textView = myHolder.d;
                    this.g = textView;
                    textView.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_B));
                }
            } else if (this.b.get(i).d == 1) {
                View view3 = myHolder.f;
                this.f = view3;
                this.g = myHolder.d;
                view3.setVisibility(0);
                myHolder.d.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_B));
            } else if (this.b.get(i).d == 2) {
                View view4 = myHolder.c;
                this.h = view4;
                view4.setBackgroundColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_B));
            }
        } else if (this.b.get(i).d == 2) {
            myHolder.c.setBackgroundColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_C));
        } else if (this.b.get(i).d == 0) {
            if (i != 0) {
                myHolder.f.setVisibility(8);
                myHolder.d.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_J));
            } else if (i == 0) {
                myHolder.f.setVisibility(8);
                myHolder.d.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_J));
            }
        } else if (this.b.get(i).d == 1) {
            myHolder.f.setVisibility(8);
            myHolder.d.setTextColor(this.e.getApplicationContext().getResources().getColor(R.color.SC_A_J));
        }
    }

    /* renamed from: S */
    public void onBindViewHolder(MyHolder myHolder, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5fbedd50", new Object[]{this, myHolder, new Integer(i)});
            return;
        }
        if (this.b.get(i).d != 2) {
            ViewProxy.setOnClickListener(myHolder.itemView, new a(myHolder));
            ViewProxy.setOnLongClickListener(myHolder.itemView, new b(myHolder));
        } else {
            myHolder.f9405a.setOnClickListener(new c(myHolder));
            myHolder.f9405a.setOnLongClickListener(new d(myHolder));
        }
        M(myHolder, i);
        P(myHolder, i);
    }

    /* renamed from: T */
    public MyHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MyHolder) ipChange.ipc$dispatch("f8508284", new Object[]{this, viewGroup, new Integer(i)});
        }
        View view = null;
        if (i == 3) {
            view = this.c.inflate(R.layout.shop_category_head_view, (ViewGroup) null);
        } else if (i == 0) {
            view = this.c.inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        } else if (i == 1) {
            view = this.c.inflate(R.layout.shop_category_group_item_1, (ViewGroup) null);
        } else if (i == 2 || i == 4) {
            view = this.c.inflate(R.layout.shop_category_child_gridview_item, (ViewGroup) null);
            view.setLayoutParams(new AbsListView.LayoutParams((MCategoryController.width / 2) - 5, (int) (frp.c() * 51.0f)));
        }
        return new MyHolder(view, i);
    }

    public void U(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818385d2", new Object[]{this, eVar});
        } else {
            this.d = eVar;
        }
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.d = null;
        this.e = null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        List<lf3> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i)})).intValue();
        }
        if (this.b.get(i).d == 0) {
            if (i == 0) {
                return 3;
            }
            return 0;
        } else if (this.b.get(i).d == 1) {
            return 1;
        } else {
            if (this.b.get(i).d != 2) {
                return -1;
            }
            if (this.b.get(i).e) {
                return 4;
            }
            return 2;
        }
    }

    public void setData(List<lf3> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28ddf4a4", new Object[]{this, list});
        } else {
            this.b = list;
        }
    }
}
