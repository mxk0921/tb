package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter;
import com.taobao.android.litecreator.widgets.LCBubble;
import com.taobao.schedule.ViewProxy;
import com.taobao.taobao.R;
import java.util.List;
import tb.i0e;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ThumbnailRecyclerview extends RecyclerView implements com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "ThumbnailRecyclerview";
    private ThumbnailListAdapter mAdapter;
    private i0e mCallback;
    private CenterLayoutManager mLinearLayoutManager;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements ThumbnailListAdapter.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.j
        public void a(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("41cb95b9", new Object[]{this, new Integer(i), new Integer(i2)});
            } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) != null) {
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).a(i, i2);
            }
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.j
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("de19137e", new Object[]{this, new Integer(i)});
            } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) != null) {
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).b(i);
            }
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.j
        public void c(int i, boolean z, boolean z2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("efd2bc02", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            } else if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) != null) {
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).c(i, z, z2);
            }
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.j
        public void d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4a4f5dc2", new Object[]{this});
            } else {
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).d();
            }
        }

        @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.ThumbnailListAdapter.j
        public void e(int i, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d0c204a9", new Object[]{this, new Integer(i), view});
                return;
            }
            ThumbnailRecyclerview.access$100(ThumbnailRecyclerview.this, i, view);
            ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).e(i);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements View.OnClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ LCBubble f8287a;
        public final /* synthetic */ int b;

        public b(LCBubble lCBubble, int i) {
            this.f8287a = lCBubble;
            this.b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
                return;
            }
            this.f8287a.j();
            ThumbnailRecyclerview.access$200(ThumbnailRecyclerview.this).r0(this.b);
            if (ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this) != null) {
                ThumbnailRecyclerview.access$000(ThumbnailRecyclerview.this).f(this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements LCBubble.j {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void a(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("edabee77", new Object[]{this, lCBubble});
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void b(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a63d3d9a", new Object[]{this, lCBubble});
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void c(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b5fc6f2a", new Object[]{this, lCBubble});
            } else {
                ThumbnailRecyclerview.access$200(ThumbnailRecyclerview.this).x0(false);
            }
        }

        @Override // com.taobao.android.litecreator.widgets.LCBubble.j
        public void d(LCBubble lCBubble) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cd2fbcc1", new Object[]{this, lCBubble});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String c;
        public String d;
        public boolean f;
        public boolean g;

        /* renamed from: a  reason: collision with root package name */
        public int f8289a = 9;
        public int b = 5;
        public boolean e = true;

        static {
            t2o.a(511705264);
        }

        public d a(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("2a8edf83", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public d b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d0a5bc79", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public d c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("e0782b01", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public d d(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("d9701a28", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public d e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("c5b73c3b", new Object[]{this, new Integer(i)});
            }
            this.f8289a = i;
            return this;
        }

        public d f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("82cdf8bf", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public d g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("60f3afc7", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }
    }

    static {
        t2o.a(511705260);
        t2o.a(511705241);
    }

    public ThumbnailRecyclerview(Context context) {
        super(context);
        init();
    }

    public static /* synthetic */ i0e access$000(ThumbnailRecyclerview thumbnailRecyclerview) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (i0e) ipChange.ipc$dispatch("d56467f", new Object[]{thumbnailRecyclerview});
        }
        return thumbnailRecyclerview.mCallback;
    }

    public static /* synthetic */ void access$100(ThumbnailRecyclerview thumbnailRecyclerview, int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("651f09da", new Object[]{thumbnailRecyclerview, new Integer(i), view});
        } else {
            thumbnailRecyclerview.showDeleteBubble(i, view);
        }
    }

    public static /* synthetic */ ThumbnailListAdapter access$200(ThumbnailRecyclerview thumbnailRecyclerview) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThumbnailListAdapter) ipChange.ipc$dispatch("2127f244", new Object[]{thumbnailRecyclerview});
        }
        return thumbnailRecyclerview.mAdapter;
    }

    private void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        this.mAdapter = new ThumbnailListAdapter(getContext(), new a());
        CenterLayoutManager centerLayoutManager = new CenterLayoutManager(getContext(), 0, false, (RecyclerView) null);
        this.mLinearLayoutManager = centerLayoutManager;
        centerLayoutManager.z(150.0f);
        setLayoutManager(this.mLinearLayoutManager);
        setAdapter(this.mAdapter);
    }

    public static /* synthetic */ Object ipc$super(ThumbnailRecyclerview thumbnailRecyclerview, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/ThumbnailRecyclerview");
    }

    private void showDeleteBubble(int i, View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12cb9daa", new Object[]{this, new Integer(i), view});
            return;
        }
        LCBubble lCBubble = new LCBubble(getContext());
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.lay_lc_thumbnail_delete_bubble, (ViewGroup) null, false);
        ViewProxy.setOnClickListener(inflate, new b(lCBubble, i));
        LCBubble.h f = new LCBubble.h().m(false).n(false).c(true).d(Long.MAX_VALUE).g(inflate).b(view).e(0).f(0);
        lCBubble.h(new c());
        lCBubble.l(f);
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void addItems(List<ThumbnailItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7485d997", new Object[]{this, list});
        } else {
            this.mAdapter.a0(list);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            this.mAdapter.destroy();
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public List<ThumbnailItem> getItems() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("46e3e096", new Object[]{this});
        }
        return this.mAdapter.j0();
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void notifyDataChanged() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd821ca8", new Object[]{this});
        } else {
            this.mAdapter.notifyDataSetChanged();
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void removeItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb677405", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.r0(i);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void setIThumbnailCallback(i0e i0eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8582ee6", new Object[]{this, i0eVar});
        } else {
            this.mCallback = i0eVar;
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void setItems(List<ThumbnailItem> list, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bfc73d", new Object[]{this, list, dVar});
        } else {
            this.mAdapter.t0(list, dVar);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void setSelectedIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a74476c7", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.w0(i);
        }
    }

    @Override // com.taobao.android.litecreator.modules.edit.image.thumbnaillist.a
    public void updateCorrespondingItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d8b2545f", new Object[]{this, new Integer(i)});
        } else {
            this.mAdapter.A0(i);
        }
    }

    public ThumbnailRecyclerview(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init();
    }

    public ThumbnailRecyclerview(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init();
    }
}
