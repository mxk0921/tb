package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListTouchCallback;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailRecyclerview;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailAddButtonViewHolder;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailBaseViewHolder;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailMediaViewHolder;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.viewholder.ThumbnailPlaceholderViewHolder;
import com.taobao.taobao.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.ed2;
import tb.odg;
import tb.sug;
import tb.t2o;
import tb.trt;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailListAdapter extends RecyclerView.Adapter<ThumbnailBaseViewHolder> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_TAG_MEDIA_IMAGE = "MEDIA_IMAGE";
    public static final String TYPE_TAG_MEDIA_VIDEO = "MEDIA_VIDEO";
    public static final String TYPE_TAG_TEMPLATE_MULTI = "TEMPLATE_MULTI";
    public boolean c;
    public String e;
    public String f;
    public boolean g;
    public ThumbnailItem i;
    public CenterLayoutManager j;
    public RecyclerView k;
    public int l;
    public boolean m;
    public final j n;
    public final Bitmap q;
    public ItemTouchHelper r;
    public final Vibrator s;

    /* renamed from: a  reason: collision with root package name */
    public int f8276a = 9;
    public boolean b = true;
    public int d = 5;
    public int h = 0;
    public final ArrayList<ThumbnailItem> o = new ArrayList<>();
    public final ArrayList<ThumbnailItem> p = new ArrayList<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8277a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f8277a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = this.f8277a;
            if (i == this.b) {
                ThumbnailListAdapter.M(ThumbnailListAdapter.this, i - 1);
            } else {
                ThumbnailListAdapter.M(ThumbnailListAdapter.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8278a;

        public b(int i) {
            this.f8278a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ThumbnailListAdapter.M(ThumbnailListAdapter.this, this.f8278a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f8279a;

        public c(int i) {
            this.f8279a = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ThumbnailListAdapter.M(ThumbnailListAdapter.this, this.f8279a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements ThumbnailListTouchCallback.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8f7ec311", new Object[]{this});
            }
            return ThumbnailListAdapter.W(ThumbnailListAdapter.this);
        }

        public void b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("461ab9ac", new Object[]{this, new Integer(i), new Integer(i2)});
                return;
            }
            sug.b(ThumbnailListAdapter.N(ThumbnailListAdapter.this), i, i2);
            sug.b(ThumbnailListAdapter.S(ThumbnailListAdapter.this), ThumbnailListAdapter.T(ThumbnailListAdapter.this, i), ThumbnailListAdapter.T(ThumbnailListAdapter.this, i2));
            ThumbnailListAdapter.U(ThumbnailListAdapter.this).a(ThumbnailListAdapter.T(ThumbnailListAdapter.this, i), ThumbnailListAdapter.T(ThumbnailListAdapter.this, i2));
        }

        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6c714b8", new Object[]{this, new Integer(i)});
                return;
            }
            ThumbnailListAdapter.U(ThumbnailListAdapter.this).c(ThumbnailListAdapter.T(ThumbnailListAdapter.this, i), true, ThumbnailListAdapter.V(ThumbnailListAdapter.this).equals(ThumbnailListAdapter.N(ThumbnailListAdapter.this).get(i)));
            ThumbnailListAdapter.this.v0(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThumbnailBaseViewHolder f8281a;

        public e(ThumbnailBaseViewHolder thumbnailBaseViewHolder) {
            this.f8281a = thumbnailBaseViewHolder;
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.i
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aadfa351", new Object[]{this, new Integer(i)});
            } else if (ThumbnailListAdapter.X(ThumbnailListAdapter.this) != i) {
                boolean equals = ThumbnailListAdapter.V(ThumbnailListAdapter.this).equals(ThumbnailListAdapter.N(ThumbnailListAdapter.this).get(i));
                ThumbnailListAdapter.M(ThumbnailListAdapter.this, i);
                ThumbnailListAdapter.U(ThumbnailListAdapter.this).c(ThumbnailListAdapter.T(ThumbnailListAdapter.this, i), false, equals);
            } else if (ThumbnailListAdapter.Y(ThumbnailListAdapter.this)) {
                ThumbnailListAdapter.this.x0(true);
                ThumbnailListAdapter.U(ThumbnailListAdapter.this).e(ThumbnailListAdapter.T(ThumbnailListAdapter.this, i), this.f8281a.itemView);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.i
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aadfa351", new Object[]{this, new Integer(i)});
            } else {
                ThumbnailListAdapter.U(ThumbnailListAdapter.this).b(ThumbnailListAdapter.Z(ThumbnailListAdapter.this) - ThumbnailListAdapter.S(ThumbnailListAdapter.this).size());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements ThumbnailBaseViewHolder.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ i f8283a;
        public final /* synthetic */ ThumbnailBaseViewHolder b;

        public g(ThumbnailListAdapter thumbnailListAdapter, i iVar, ThumbnailBaseViewHolder thumbnailBaseViewHolder) {
            this.f8283a = iVar;
            this.b = thumbnailBaseViewHolder;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("470a949d", new Object[]{this});
                return;
            }
            i iVar = this.f8283a;
            if (iVar != null) {
                iVar.a(this.b.getAdapterPosition());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements ThumbnailBaseViewHolder.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ThumbnailBaseViewHolder f8284a;

        public h(ThumbnailBaseViewHolder thumbnailBaseViewHolder) {
            this.f8284a = thumbnailBaseViewHolder;
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4158281", new Object[]{this});
                return;
            }
            ThumbnailListAdapter thumbnailListAdapter = ThumbnailListAdapter.this;
            ThumbnailListAdapter.O(thumbnailListAdapter, ThumbnailListAdapter.X(thumbnailListAdapter));
            ThumbnailListAdapter.P(ThumbnailListAdapter.this).startDrag(this.f8284a);
            ThumbnailListAdapter.Q(ThumbnailListAdapter.this);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface i {
        void a(int i);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface j {
        void a(int i, int i2);

        void b(int i);

        void c(int i, boolean z, boolean z2);

        void d();

        void e(int i, View view);
    }

    static {
        t2o.a(511705247);
    }

    public ThumbnailListAdapter(Context context, j jVar) {
        this.n = jVar;
        this.q = BitmapFactory.decodeResource(context.getResources(), R.drawable.video_frame_place_holder);
        this.s = (Vibrator) context.getSystemService("vibrator");
    }

    public static /* synthetic */ void M(ThumbnailListAdapter thumbnailListAdapter, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81f11174", new Object[]{thumbnailListAdapter, new Integer(i2)});
        } else {
            thumbnailListAdapter.u0(i2);
        }
    }

    public static /* synthetic */ ArrayList N(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("9a3237ca", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.p;
    }

    public static /* synthetic */ int O(ThumbnailListAdapter thumbnailListAdapter, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("38fd616", new Object[]{thumbnailListAdapter, new Integer(i2)})).intValue();
        }
        thumbnailListAdapter.l = i2;
        return i2;
    }

    public static /* synthetic */ ItemTouchHelper P(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ItemTouchHelper) ipChange.ipc$dispatch("2044a052", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.r;
    }

    public static /* synthetic */ void Q(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68696060", new Object[]{thumbnailListAdapter});
        } else {
            thumbnailListAdapter.q0();
        }
    }

    public static /* synthetic */ ArrayList S(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4dab49cb", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.o;
    }

    public static /* synthetic */ int T(ThumbnailListAdapter thumbnailListAdapter, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f131ac44", new Object[]{thumbnailListAdapter, new Integer(i2)})).intValue();
        }
        return thumbnailListAdapter.e0(i2);
    }

    public static /* synthetic */ j U(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (j) ipChange.ipc$dispatch("4458eb74", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.n;
    }

    public static /* synthetic */ ThumbnailItem V(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThumbnailItem) ipChange.ipc$dispatch("704a4478", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.i;
    }

    public static /* synthetic */ String W(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e00c12cb", new Object[]{thumbnailListAdapter});
        }
        return thumbnailListAdapter.e;
    }

    public static /* synthetic */ int X(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6ce8d6e9", new Object[]{thumbnailListAdapter})).intValue();
        }
        return thumbnailListAdapter.h;
    }

    public static /* synthetic */ boolean Y(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5294337b", new Object[]{thumbnailListAdapter})).booleanValue();
        }
        return thumbnailListAdapter.c0();
    }

    public static /* synthetic */ int Z(ThumbnailListAdapter thumbnailListAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("383f8feb", new Object[]{thumbnailListAdapter})).intValue();
        }
        return thumbnailListAdapter.f8276a;
    }

    public static /* synthetic */ Object ipc$super(ThumbnailListAdapter thumbnailListAdapter, String str, Object... objArr) {
        if (str.hashCode() == 2130396206) {
            super.onAttachedToRecyclerView((RecyclerView) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/ThumbnailListAdapter");
    }

    public void A0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b2545f", new Object[]{this, new Integer(i2)});
            return;
        }
        int d0 = d0(i2);
        if (d0 >= 0 && d0 < getItemCount()) {
            notifyItemChanged(d0, Integer.valueOf(d0));
        }
    }

    public void a0(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7485d997", new Object[]{this, list});
        } else if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(this.f)) {
                int size = list.size();
                int size2 = this.o.size() + this.d;
                this.o.addAll(list);
                this.p.addAll(size2, list);
                s0(this.o, 0);
                int s0 = s0(this.p, this.d);
                if (s0 > 0) {
                    z0(size2, size, s0);
                } else {
                    y0(size2, size);
                }
            } else {
                b0(list);
            }
        }
    }

    public final void b0(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af8d2c57", new Object[]{this, list});
            return;
        }
        int size = list.size();
        int size2 = this.o.size() + this.d;
        this.o.addAll(list);
        this.p.addAll(size2, list);
        y0(size2, size);
    }

    public final boolean c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f142cc2f", new Object[]{this})).booleanValue();
        }
        if ((this.g || this.o.size() > 1) && !k0()) {
            return true;
        }
        return false;
    }

    public final int d0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff69b74b", new Object[]{this, new Integer(i2)})).intValue();
        }
        return i2 + this.d;
    }

    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        ed2.n(this.q);
        Iterator<ThumbnailItem> it = this.o.iterator();
        while (it.hasNext()) {
            ed2.n(it.next().coverThumbnail);
        }
        for (int i2 = 0; i2 < this.k.getChildCount(); i2++) {
            RecyclerView recyclerView = this.k;
            RecyclerView.ViewHolder childViewHolder = recyclerView.getChildViewHolder(recyclerView.getChildAt(i2));
            if (childViewHolder instanceof ThumbnailMediaViewHolder) {
                ((ThumbnailMediaViewHolder) childViewHolder).onDestroy();
            }
        }
    }

    public final int e0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("11fe68e", new Object[]{this, new Integer(i2)})).intValue();
        }
        return i2 - this.d;
    }

    public final void f0(ThumbnailBaseViewHolder thumbnailBaseViewHolder, i iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0db2791", new Object[]{this, thumbnailBaseViewHolder, iVar});
        } else {
            thumbnailBaseViewHolder.d0(new g(this, iVar, thumbnailBaseViewHolder));
        }
    }

    public final void g0(ThumbnailBaseViewHolder thumbnailBaseViewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ae72503", new Object[]{this, thumbnailBaseViewHolder});
        } else {
            thumbnailBaseViewHolder.e0(new h(thumbnailBaseViewHolder));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
        }
        return this.p.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("65c98627", new Object[]{this, new Integer(i2)})).intValue();
        }
        if (i2 < this.d || i2 > this.o.size() + this.d) {
            return 1;
        }
        if (i2 != this.o.size() + this.d) {
            return 0;
        }
        if (n0()) {
            return 2;
        }
        return 1;
    }

    public ThumbnailItem h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThumbnailItem) ipChange.ipc$dispatch("300f8d20", new Object[]{this, str});
        }
        return new ThumbnailItem(str);
    }

    public final List<ThumbnailItem> i0(String str, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("688267b0", new Object[]{this, str, new Integer(i2)});
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(h0(str));
        }
        return arrayList;
    }

    public List<ThumbnailItem> j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9bbe5f6e", new Object[]{this});
        }
        return this.o;
    }

    public final boolean k0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c7ccbb2e", new Object[]{this})).booleanValue();
        }
        return this.m;
    }

    public final void l0(ThumbnailRecyclerview.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("950e6b00", new Object[]{this, dVar});
        } else if (dVar != null) {
            this.f8276a = dVar.f8289a;
            this.b = dVar.e;
            this.e = dVar.d;
            this.f = dVar.c;
            this.d = dVar.b;
            this.g = dVar.f;
            this.c = dVar.g;
        }
    }

    public final boolean m0(ThumbnailItem thumbnailItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("421ea10a", new Object[]{this, thumbnailItem})).booleanValue();
        }
        return TextUtils.equals(thumbnailItem.typeTag, this.e);
    }

    public final boolean n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("be76904b", new Object[]{this})).booleanValue();
        }
        if (this.o.size() < this.f8276a) {
            return true;
        }
        return false;
    }

    /* renamed from: o0 */
    public void onBindViewHolder(ThumbnailBaseViewHolder thumbnailBaseViewHolder, int i2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd0f2662", new Object[]{this, thumbnailBaseViewHolder, new Integer(i2)});
            return;
        }
        if (getItemViewType(i2) == 0) {
            ((ThumbnailMediaViewHolder) thumbnailBaseViewHolder).f0(this.q);
            f0(thumbnailBaseViewHolder, new e(thumbnailBaseViewHolder));
            if (!m0(this.p.get(i2))) {
                g0(thumbnailBaseViewHolder);
            }
        } else if (getItemViewType(i2) == 2) {
            f0(thumbnailBaseViewHolder, new f());
        }
        ThumbnailItem thumbnailItem = this.p.get(i2);
        if (this.h != i2) {
            z = false;
        }
        thumbnailBaseViewHolder.b0(thumbnailItem, i2, z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7efb442e", new Object[]{this, recyclerView});
            return;
        }
        super.onAttachedToRecyclerView(recyclerView);
        this.k = recyclerView;
        this.j = (CenterLayoutManager) recyclerView.getLayoutManager();
        ThumbnailListTouchCallback thumbnailListTouchCallback = new ThumbnailListTouchCallback();
        thumbnailListTouchCallback.f(new d());
        ItemTouchHelper itemTouchHelper = new ItemTouchHelper(thumbnailListTouchCallback);
        this.r = itemTouchHelper;
        itemTouchHelper.attachToRecyclerView(recyclerView);
    }

    /* renamed from: p0 */
    public ThumbnailBaseViewHolder onCreateViewHolder(ViewGroup viewGroup, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThumbnailBaseViewHolder) ipChange.ipc$dispatch("58b8aab2", new Object[]{this, viewGroup, new Integer(i2)});
        }
        if (i2 == 1) {
            return new ThumbnailPlaceholderViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_normal_item, viewGroup, false));
        }
        if (i2 != 2) {
            return new ThumbnailMediaViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_media_item, viewGroup, false), this.b, this.c);
        }
        this.n.d();
        return new ThumbnailAddButtonViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_thumbnail_list_add_item, viewGroup, false));
    }

    public final void q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("919eb455", new Object[]{this});
            return;
        }
        Vibrator vibrator = this.s;
        if (vibrator != null && vibrator.hasVibrator()) {
            this.s.vibrate(50L);
        }
    }

    public void r0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb677405", new Object[]{this, new Integer(i2)});
            return;
        }
        int d0 = d0(i2);
        boolean n0 = n0();
        this.o.remove(this.p.remove(d0));
        if (!n0) {
            int size = this.o.size();
            int i3 = this.d;
            int i4 = size + i3;
            if (i3 > 0) {
                this.p.set(i4, h0("ADD_BUTTON"));
            } else {
                this.p.add(i4, h0("ADD_BUTTON"));
            }
            notifyItemRangeChanged(d0, this.p.size() - d0);
            trt.d(new a(d0, i4), 100L);
            return;
        }
        notifyItemRangeRemoved(d0, 1);
        notifyItemRangeChanged(d0, this.p.size() - d0);
        if (d0 == this.o.size() + this.d) {
            u0(d0 - 1);
        } else {
            u0(d0);
        }
    }

    public final int s0(List<ThumbnailItem> list, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e6b363d3", new Object[]{this, list, new Integer(i2)})).intValue();
        }
        if (TextUtils.isEmpty(this.f)) {
            return 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            ThumbnailItem thumbnailItem = list.get(i3);
            if (!(i3 == i2 || thumbnailItem == null || !TextUtils.equals(this.f, thumbnailItem.typeTag))) {
                arrayList.add(Integer.valueOf(i3));
            }
        }
        int size = arrayList.size();
        if (size <= 0) {
            return 0;
        }
        for (int i4 = size - 1; i4 >= 0; i4--) {
            ThumbnailItem thumbnailItem2 = list.get(((Integer) arrayList.get(i4)).intValue());
            list.remove(thumbnailItem2);
            list.add(i2, thumbnailItem2);
        }
        return size;
    }

    public void t0(List<ThumbnailItem> list, ThumbnailRecyclerview.d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfc73d", new Object[]{this, list, dVar});
        } else if (list != null && !list.isEmpty()) {
            l0(dVar);
            this.p.clear();
            this.o.clear();
            s0(list, 0);
            this.o.addAll(list);
            this.p.addAll(i0("PLACEHOLDER", this.d));
            this.p.addAll(list);
            if (n0()) {
                this.p.add(h0("ADD_BUTTON"));
                this.p.addAll(i0("PLACEHOLDER", this.d - 1));
            } else {
                this.p.addAll(i0("PLACEHOLDER", this.d));
            }
            notifyDataSetChanged();
        }
    }

    public final void u0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i2)});
        } else if (i2 >= 0 && i2 < getItemCount()) {
            odg.b("ThumbnailListAdapter", "aYou thumbnail setSelectedIndex, mSelectedIndex=" + this.h + " ,mLastTabIndex=" + this.l + " ,position=" + i2);
            int i3 = this.l;
            if (i2 != i3) {
                this.h = i2;
                notifyItemChanged(i3, Integer.valueOf(i3));
                notifyItemChanged(i2, Integer.valueOf(i2));
                this.j.smoothScrollToPosition(this.k, new RecyclerView.State(), i2);
            }
            this.i = this.p.get(i2);
            this.l = i2;
        }
    }

    public void v0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c99b1c", new Object[]{this, new Integer(i2)});
        } else if (i2 >= 0 && i2 < getItemCount()) {
            this.h = i2;
            int indexOf = this.p.indexOf(this.i);
            notifyItemChanged(indexOf, Integer.valueOf(indexOf));
            notifyItemChanged(i2, Integer.valueOf(i2));
            this.j.smoothScrollToPosition(this.k, new RecyclerView.State(), i2);
            this.i = this.p.get(i2);
            this.l = i2;
            odg.b("ThumbnailListAdapter", "ayou thumbnail setSelectedIndexByDrag, mSelectedIndex=" + this.h + " ,mLastTabIndex=" + this.l + " ,position=" + i2);
        }
    }

    public void w0(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13e24356", new Object[]{this, new Integer(i2)});
        } else {
            u0(d0(i2));
        }
    }

    public void x0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b9f2dab", new Object[]{this, new Boolean(z)});
        } else {
            this.m = z;
        }
    }

    public final void y0(int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b1668f9", new Object[]{this, new Integer(i2), new Integer(i3)});
            return;
        }
        if (!n0()) {
            int i4 = i3 + i2;
            if (this.d > 0) {
                this.p.set(i4, h0("PLACEHOLDER"));
                notifyItemRangeChanged(i2, this.p.size() - i2);
            } else {
                this.p.remove(i4);
                notifyItemRemoved(i4);
            }
        } else {
            notifyItemRangeInserted(i2, i3);
        }
        trt.c(new b(i2));
    }

    public final void z0(int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f8e4ca4", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        if (!n0()) {
            int i5 = i2 + i3;
            if (this.d > 0) {
                this.p.set(i5, h0("PLACEHOLDER"));
            } else {
                this.p.remove(i5);
            }
        }
        int i6 = this.d;
        notifyItemRangeChanged(i6, this.p.size() - i6);
        trt.c(new c((i4 + this.d) - 1));
    }
}
