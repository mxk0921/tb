package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.adapter.PackingListAdapter;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.holder.common.GridItemDecoration;
import com.taobao.taobao.R;
import java.util.ArrayList;
import tb.skl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class rkl extends kd7<skl> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int DEFAULT_HEIGHT = mr7.a(40.0f);
    public final LinearLayout j;
    public final RecyclerView k;
    public boolean l;
    public TextView m;
    public ArrayList<skl.b> n;
    public ArrayList<skl.b> o;
    public int h = 5;
    public int i = 8;
    public PackingListAdapter p = null;
    public final View.OnClickListener q = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            } else if (rkl.w(rkl.this) != null) {
                if (rkl.x(rkl.this) && rkl.z(rkl.this) != null && rkl.z(rkl.this).size() > 0) {
                    int size = ((int) ((rkl.z(rkl.this).size() / 2.0f) + 0.5f)) * rkl.DEFAULT_HEIGHT;
                    rkl rklVar = rkl.this;
                    rkl.B(rklVar, rkl.A(rklVar), -1, size);
                    rkl rklVar2 = rkl.this;
                    rkl.C(rklVar2, rkl.A(rklVar2));
                    rkl.w(rkl.this).N(rkl.z(rkl.this));
                    rkl.w(rkl.this).notifyDataSetChanged();
                    rkl.D(rkl.this).setText(rkl.this.c.getString(R.string.tt_detail_desc_pack_up));
                    rkl rklVar3 = rkl.this;
                    rkl.y(rklVar3, true ^ rkl.x(rklVar3));
                } else if (!rkl.x(rkl.this) && rkl.E(rkl.this) != null && rkl.E(rkl.this).size() > 0) {
                    int F = rkl.F(rkl.this) * rkl.DEFAULT_HEIGHT;
                    rkl rklVar4 = rkl.this;
                    rkl.B(rklVar4, rkl.A(rklVar4), -1, F);
                    rkl rklVar5 = rkl.this;
                    rkl.C(rklVar5, rkl.A(rklVar5));
                    rkl.w(rkl.this).N(rkl.E(rkl.this));
                    rkl.w(rkl.this).notifyDataSetChanged();
                    rkl.D(rkl.this).setText(rkl.this.c.getString(R.string.tt_detail_desc_see_more));
                    rkl rklVar6 = rkl.this;
                    rkl.y(rklVar6, true ^ rkl.x(rklVar6));
                }
            }
        }
    }

    static {
        t2o.a(912262381);
    }

    public rkl(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.tt_detail_desc_packing_list_layout, (ViewGroup) null);
        this.j = linearLayout;
        this.k = (RecyclerView) linearLayout.findViewById(R.id.dataColumn);
    }

    public static /* synthetic */ RecyclerView A(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("14a8e357", new Object[]{rklVar});
        }
        return rklVar.k;
    }

    public static /* synthetic */ void B(rkl rklVar, RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7604b6a8", new Object[]{rklVar, recyclerView, new Integer(i), new Integer(i2)});
        } else {
            rklVar.K(recyclerView, i, i2);
        }
    }

    public static /* synthetic */ void C(rkl rklVar, RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84baa749", new Object[]{rklVar, recyclerView});
        } else {
            rklVar.L(recyclerView);
        }
    }

    public static /* synthetic */ TextView D(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TextView) ipChange.ipc$dispatch("1a9aa981", new Object[]{rklVar});
        }
        return rklVar.m;
    }

    public static /* synthetic */ ArrayList E(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("2b42a186", new Object[]{rklVar});
        }
        return rklVar.n;
    }

    public static /* synthetic */ int F(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("15667f3e", new Object[]{rklVar})).intValue();
        }
        return rklVar.h;
    }

    public static /* synthetic */ Object ipc$super(rkl rklVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/skeleton/desc/natives/holder/PackingListViewHolder");
    }

    public static /* synthetic */ PackingListAdapter w(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PackingListAdapter) ipChange.ipc$dispatch("515faf3a", new Object[]{rklVar});
        }
        return rklVar.p;
    }

    public static /* synthetic */ boolean x(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("672515f6", new Object[]{rklVar})).booleanValue();
        }
        return rklVar.l;
    }

    public static /* synthetic */ boolean y(rkl rklVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d51428", new Object[]{rklVar, new Boolean(z)})).booleanValue();
        }
        rklVar.l = z;
        return z;
    }

    public static /* synthetic */ ArrayList z(rkl rklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("80f4baeb", new Object[]{rklVar});
        }
        return rklVar.o;
    }

    /* renamed from: H */
    public View j(skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("cc5e07d7", new Object[]{this, sklVar});
        }
        ArrayList<skl.b> arrayList = sklVar.k;
        this.o = arrayList;
        int i = sklVar.l;
        if (i > 0) {
            this.i = i;
        }
        int i2 = sklVar.m;
        if (i2 > 0) {
            this.h = i2;
        }
        int i3 = this.h;
        if (i3 >= this.i) {
            this.i = i3;
        }
        if (arrayList == null || arrayList.size() == 0) {
            return new View(this.f22590a);
        }
        int size = this.o.size();
        this.n = new ArrayList<>();
        int i4 = (int) ((size / 2.0f) + 0.5f);
        if (size <= this.i * 2) {
            this.n = this.o;
            TextView textView = this.m;
            if (textView != null) {
                textView.setVisibility(8);
            }
            this.l = false;
        } else {
            for (int i5 = 0; i5 < this.h * 2; i5++) {
                this.n.add(this.o.get(i5));
            }
            TextView textView2 = this.m;
            if (textView2 != null) {
                textView2.setVisibility(0);
            } else {
                I(this.c.getString(R.string.tt_detail_desc_see_more), this.q);
                this.j.addView(this.m);
            }
            this.l = true;
            i4 = this.h;
        }
        this.p = new PackingListAdapter(this.f22590a, this.n);
        int i6 = i4 * DEFAULT_HEIGHT;
        this.k.setHasFixedSize(false);
        L(this.k);
        K(this.k, -1, i6);
        this.p.M(2);
        this.k.setAdapter(this.p);
        return this.j;
    }

    public View I(String str, View.OnClickListener onClickListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("f8b29bd", new Object[]{this, str, onClickListener});
        }
        if (TextUtils.isEmpty(str) || onClickListener == null) {
            return new View(this.f22590a);
        }
        if (this.m == null) {
            TextView textView = new TextView(this.f22590a);
            this.m = textView;
            textView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.m.setBackgroundColor(this.c.getColor(R.color.tt_detail_white));
            this.m.setPadding(0, mr7.a(10.0f), 0, mr7.a(10.0f));
            this.m.setGravity(17);
            this.m.setTextColor(this.c.getColor(R.color.tt_detail_gray));
            this.m.setTextSize(1, 14.0f);
        }
        this.m.setText(str);
        this.m.setOnClickListener(onClickListener);
        return this.m;
    }

    public final void K(RecyclerView recyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5d2d89ef", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) recyclerView.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        recyclerView.setLayoutParams(layoutParams);
        recyclerView.addItemDecoration(new GridItemDecoration(this.f22590a));
        recyclerView.setOverScrollMode(2);
    }

    public final void L(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8246b8f", new Object[]{this, recyclerView});
            return;
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f22590a, 2);
        gridLayoutManager.setOrientation(1);
        recyclerView.setLayoutManager(gridLayoutManager);
    }

    /* renamed from: e */
    public void h(skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9aec363", new Object[]{this, sklVar});
        }
    }

    /* renamed from: k */
    public boolean m(skl sklVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4d3ac9e7", new Object[]{this, sklVar})).booleanValue();
        }
        return false;
    }
}
