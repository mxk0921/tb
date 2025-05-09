package com.taobao.android.fluid.framework.hostcontainer.tnode.component;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.common.view.FscrmidFavorFrameLayout;
import com.taobao.android.fluid.framework.list.view.LockableRecycerView;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.core.Component;
import com.taobao.tao.flexbox.layoutmanager.core.n;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.ct7;
import tb.d0c;
import tb.ir9;
import tb.jfw;
import tb.nwv;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class FullPageAlbumComponent extends Component<RecyclerView, c> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String h = FullPageAlbumComponent.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public LockableRecycerView f7826a;
    public RecyclerViewAdapter b;
    public long d;
    public boolean e;
    public boolean f;
    public int c = -1;
    public final Runnable g = new b();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class AlbumModel implements Serializable {
        public double interval;
        public List<Pic> pics;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class Pic implements Serializable {
            public String height;
            public String url;
            public String width;

            static {
                t2o.a(468714414);
            }
        }

        static {
            t2o.a(468714413);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LocalPagerSnapHelper extends PagerSnapHelper {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(468714415);
        }

        public static /* synthetic */ Object ipc$super(LocalPagerSnapHelper localPagerSnapHelper, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1160778905) {
                return new Integer(super.findTargetSnapPosition((RecyclerView.LayoutManager) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
            }
            if (hashCode == -259228053) {
                return super.findSnapView((RecyclerView.LayoutManager) objArr[0]);
            }
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$LocalPagerSnapHelper");
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dcf93662", new Object[]{this, new Integer(i)});
            }
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public View findSnapView(RecyclerView.LayoutManager layoutManager) {
            int position;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (View) ipChange.ipc$dispatch("f08c7e6b", new Object[]{this, layoutManager});
            }
            View findSnapView = super.findSnapView(layoutManager);
            if (!(findSnapView == null || (position = layoutManager.getPosition(findSnapView)) == -1)) {
                a(position);
            }
            return findSnapView;
        }

        @Override // androidx.recyclerview.widget.PagerSnapHelper, androidx.recyclerview.widget.SnapHelper
        public int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bacfeb67", new Object[]{this, layoutManager, new Integer(i), new Integer(i2)})).intValue();
            }
            int findTargetSnapPosition = super.findTargetSnapPosition(layoutManager, i, i2);
            if (findTargetSnapPosition != -1) {
                a(findTargetSnapPosition);
            }
            return findTargetSnapPosition;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class LocalViewHolder extends RecyclerView.ViewHolder {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final TUrlImageView f7829a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends d0c.a {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ct7 f7830a;
            public final /* synthetic */ RecyclerViewAdapter.a b;

            public a(ct7 ct7Var, RecyclerViewAdapter.a aVar) {
                this.f7830a = ct7Var;
                this.b = aVar;
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$LocalViewHolder$1");
            }

            @Override // tb.d0c.a, tb.d0c
            public void c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("70b73f2e", new Object[]{this});
                }
            }

            @Override // tb.d0c.a, tb.d0c
            public void d() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7bcd6a37", new Object[]{this});
                    return;
                }
                ct7 ct7Var = this.f7830a;
                if (ct7Var != null) {
                    ct7Var.d();
                }
            }

            @Override // tb.d0c.a, tb.d0c
            public boolean e(boolean z) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("5f358e04", new Object[]{this, new Boolean(z)})).booleanValue();
                }
                ct7 ct7Var = this.f7830a;
                if (ct7Var != null) {
                    ct7Var.e(z);
                }
                return false;
            }

            @Override // tb.d0c.a, tb.d0c
            public void f(float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("7f84119f", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                ct7 ct7Var = this.f7830a;
                if (ct7Var != null) {
                    ct7Var.f(f, f2);
                }
            }

            @Override // tb.d0c.a, tb.d0c
            public void h(float f, float f2) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e461e8c8", new Object[]{this, new Float(f), new Float(f2)});
                    return;
                }
                RecyclerViewAdapter.a aVar = this.b;
                if (aVar != null) {
                    ((a) aVar).a(LocalViewHolder.this.getAdapterPosition());
                }
                ct7 ct7Var = this.f7830a;
                if (ct7Var != null) {
                    ct7Var.h(f, f2);
                }
            }
        }

        static {
            t2o.a(468714416);
        }

        public LocalViewHolder(ViewGroup viewGroup, RecyclerViewAdapter.a aVar) {
            super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fluid_sdk_item_album_card, viewGroup, false));
            TUrlImageView tUrlImageView = new TUrlImageView(viewGroup.getContext());
            this.f7829a = tUrlImageView;
            tUrlImageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            ((ViewGroup) this.itemView).addView(tUrlImageView);
            if (this.itemView instanceof FscrmidFavorFrameLayout) {
                ViewProxy.setOnClickListener(this.itemView, new ct7(new a(FullPageAlbumComponent.j(viewGroup), aVar)));
                try {
                    Bitmap decodeResource = BitmapFactory.decodeResource(viewGroup.getResources(), R.drawable.fluid_sdk_album_double_click);
                    if (decodeResource != null) {
                        ((FscrmidFavorFrameLayout) this.itemView).setBitmap(decodeResource);
                    }
                } catch (Throwable th) {
                    String l = FullPageAlbumComponent.l();
                    ir9.b(l, "e =" + th);
                }
            }
        }

        public static /* synthetic */ Object ipc$super(LocalViewHolder localViewHolder, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$LocalViewHolder");
        }

        public void b0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c9bc6cd8", new Object[]{this, str});
                return;
            }
            this.f7829a.setImageUrl(str);
            this.f7829a.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }

        public void c0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1e4b81e8", new Object[]{this, new Boolean(z)});
                return;
            }
            View view = this.itemView;
            if (view instanceof FscrmidFavorFrameLayout) {
                ((FscrmidFavorFrameLayout) view).disableTouch(!z);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class RecyclerViewAdapter extends RecyclerView.Adapter<LocalViewHolder> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public List<AlbumModel.Pic> f7831a;
        public a b;
        public boolean c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public interface a {
        }

        static {
            t2o.a(468714418);
        }

        private RecyclerViewAdapter() {
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewAdapter recyclerViewAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$RecyclerViewAdapter");
        }

        /* renamed from: M */
        public void onBindViewHolder(LocalViewHolder localViewHolder, int i) {
            AlbumModel.Pic pic;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b81d4de4", new Object[]{this, localViewHolder, new Integer(i)});
                return;
            }
            List<AlbumModel.Pic> list = this.f7831a;
            if (list != null && i < list.size() && (pic = this.f7831a.get(i)) != null) {
                localViewHolder.b0(pic.url);
                localViewHolder.c0(this.c);
            }
        }

        /* renamed from: N */
        public LocalViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LocalViewHolder) ipChange.ipc$dispatch("c665bcb4", new Object[]{this, viewGroup, new Integer(i)});
            }
            return new LocalViewHolder(viewGroup, this.b);
        }

        public void O(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("47460acf", new Object[]{this, aVar});
            } else {
                this.b = aVar;
            }
        }

        public void P(List<AlbumModel.Pic> list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e5d4fa3", new Object[]{this, list});
            } else {
                this.f7831a = list;
            }
        }

        public void Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4d1615a6", new Object[]{this, new Boolean(z)});
            } else {
                this.c = z;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("970ddc80", new Object[]{this})).intValue();
            }
            List<AlbumModel.Pic> list = this.f7831a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements RecyclerViewAdapter.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("237695e6", new Object[]{this, new Integer(i)});
            } else {
                FullPageAlbumComponent.q(FullPageAlbumComponent.this, i);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            FullPageAlbumComponent fullPageAlbumComponent = FullPageAlbumComponent.this;
            if (fullPageAlbumComponent.f7826a != null && FullPageAlbumComponent.r(fullPageAlbumComponent) != null && FullPageAlbumComponent.s(FullPageAlbumComponent.this)) {
                if (FullPageAlbumComponent.h(FullPageAlbumComponent.this) < FullPageAlbumComponent.r(FullPageAlbumComponent.this).getItemCount() - 1) {
                    FullPageAlbumComponent.this.f7826a.smoothScrollToPosition(FullPageAlbumComponent.h(FullPageAlbumComponent.this) + 1);
                    return;
                }
                FullPageAlbumComponent.this.f7826a.scrollToPosition(0);
                FullPageAlbumComponent.r(FullPageAlbumComponent.this).notifyDataSetChanged();
                FullPageAlbumComponent.m(FullPageAlbumComponent.this, 0);
                FullPageAlbumComponent.n(FullPageAlbumComponent.this);
            }
        }
    }

    static {
        t2o.a(468714407);
    }

    public static /* synthetic */ int h(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6a69e027", new Object[]{fullPageAlbumComponent})).intValue();
        }
        return fullPageAlbumComponent.c;
    }

    public static /* synthetic */ boolean i(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4aeba817", new Object[]{fullPageAlbumComponent})).booleanValue();
        }
        return fullPageAlbumComponent.f;
    }

    public static /* synthetic */ Object ipc$super(FullPageAlbumComponent fullPageAlbumComponent, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -703216504) {
            super.applyAttrForView((View) objArr[0], (jfw) objArr[1], (Map) objArr[2], ((Boolean) objArr[3]).booleanValue());
            return null;
        } else if (hashCode == 2127624665) {
            super.onDetach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent");
        }
    }

    public static /* synthetic */ ct7 j(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct7) ipChange.ipc$dispatch("eb9278bf", new Object[]{view});
        }
        return v(view);
    }

    public static /* synthetic */ boolean k(FullPageAlbumComponent fullPageAlbumComponent, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("63168da7", new Object[]{fullPageAlbumComponent, new Boolean(z)})).booleanValue();
        }
        fullPageAlbumComponent.f = z;
        return z;
    }

    public static /* synthetic */ String l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d2afaf99", new Object[0]);
        }
        return h;
    }

    public static /* synthetic */ void m(FullPageAlbumComponent fullPageAlbumComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42410151", new Object[]{fullPageAlbumComponent, new Integer(i)});
        } else {
            fullPageAlbumComponent.z(i);
        }
    }

    public static /* synthetic */ void n(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bef37d1", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.A();
        }
    }

    public static /* synthetic */ void o(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec70ffb0", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.x();
        }
    }

    public static /* synthetic */ void p(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccf2c78f", new Object[]{fullPageAlbumComponent});
        } else {
            fullPageAlbumComponent.B();
        }
    }

    public static /* synthetic */ void q(FullPageAlbumComponent fullPageAlbumComponent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30d50556", new Object[]{fullPageAlbumComponent, new Integer(i)});
        } else {
            fullPageAlbumComponent.y(i);
        }
    }

    public static /* synthetic */ RecyclerViewAdapter r(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerViewAdapter) ipChange.ipc$dispatch("4a522160", new Object[]{fullPageAlbumComponent});
        }
        return fullPageAlbumComponent.b;
    }

    public static /* synthetic */ boolean s(FullPageAlbumComponent fullPageAlbumComponent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4ef9e70f", new Object[]{fullPageAlbumComponent})).booleanValue();
        }
        return fullPageAlbumComponent.e;
    }

    public static ct7 v(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ct7) ipChange.ipc$dispatch("9f0ce49", new Object[]{view});
        }
        if (view == null) {
            return null;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        View view2 = (View) parent;
        Object tag = view2.getTag();
        if (tag instanceof ct7) {
            return (ct7) tag;
        }
        return v(view2);
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96050e0c", new Object[]{this});
            return;
        }
        LockableRecycerView lockableRecycerView = this.f7826a;
        if (lockableRecycerView != null) {
            lockableRecycerView.removeCallbacks(this.g);
            if (this.e) {
                long j = this.d;
                if (j > 0) {
                    this.f7826a.postDelayed(this.g, j);
                }
            }
        }
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3c7e1ac", new Object[]{this});
            return;
        }
        LockableRecycerView lockableRecycerView = this.f7826a;
        if (lockableRecycerView != null) {
            lockableRecycerView.removeCallbacks(this.g);
        }
    }

    @Override // com.taobao.tao.flexbox.layoutmanager.core.Component
    public void onDetach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        B();
    }

    /* renamed from: t */
    public void applyAttrForView(RecyclerView recyclerView, c cVar, Map map, boolean z) {
        RecyclerViewAdapter recyclerViewAdapter;
        long j;
        List<AlbumModel.Pic> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cbed1", new Object[]{this, recyclerView, cVar, map, new Boolean(z)});
            return;
        }
        super.applyAttrForView(recyclerView, cVar, map, z);
        if (recyclerView != null && (recyclerViewAdapter = this.b) != null && cVar != null) {
            AlbumModel albumModel = cVar.w0;
            if (albumModel != null) {
                j = (long) (albumModel.interval * 1000.0d);
            } else {
                j = 0;
            }
            this.d = j;
            this.e = cVar.x0;
            if (albumModel != null) {
                list = albumModel.pics;
            } else {
                list = null;
            }
            recyclerViewAdapter.P(list);
            this.b.Q(cVar.y0);
            int i = cVar.z0;
            if (i < this.b.getItemCount()) {
                recyclerView.scrollToPosition(i);
            }
            this.b.notifyDataSetChanged();
            this.c = i;
            A();
        }
    }

    /* renamed from: u */
    public c generateViewParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c) ipChange.ipc$dispatch("ffa84bfa", new Object[]{this});
        }
        return new c();
    }

    /* renamed from: w */
    public RecyclerView onCreateView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("5ff65508", new Object[]{this, context});
        }
        LockableRecycerView lockableRecycerView = new LockableRecycerView(context);
        this.f7826a = lockableRecycerView;
        lockableRecycerView.setHookScrollHorizontally();
        this.f7826a.setLayoutManager(new LinearLayoutManager(this, context, 0, false) { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                if (str.hashCode() == 1545422228) {
                    return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$1");
            }

            @Override // androidx.recyclerview.widget.LinearLayoutManager
            public int getExtraLayoutSpace(RecyclerView.State state) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    return ((Number) ipChange2.ipc$dispatch("5c1d4594", new Object[]{this, state})).intValue();
                }
                return super.getExtraLayoutSpace(state) + 100;
            }
        });
        new LocalPagerSnapHelper() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$2");
            }

            @Override // com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.LocalPagerSnapHelper
            public void a(int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("dcf93662", new Object[]{this, new Integer(i)});
                } else if (FullPageAlbumComponent.h(FullPageAlbumComponent.this) != i || FullPageAlbumComponent.i(FullPageAlbumComponent.this)) {
                    FullPageAlbumComponent.k(FullPageAlbumComponent.this, false);
                    FullPageAlbumComponent.m(FullPageAlbumComponent.this, i);
                }
            }
        }.attachToRecyclerView(this.f7826a);
        this.f7826a.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.fluid.framework.hostcontainer.tnode.component.FullPageAlbumComponent.3
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$3");
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                } else if (i == 0) {
                    FullPageAlbumComponent.n(FullPageAlbumComponent.this);
                } else if (i == 1) {
                    FullPageAlbumComponent.k(FullPageAlbumComponent.this, true);
                    FullPageAlbumComponent.o(FullPageAlbumComponent.this);
                    FullPageAlbumComponent.p(FullPageAlbumComponent.this);
                }
            }
        });
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
        this.b = recyclerViewAdapter;
        recyclerViewAdapter.O(new a());
        this.f7826a.setAdapter(this.b);
        this.c = 0;
        return this.f7826a;
    }

    public final void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7802b976", new Object[]{this});
            return;
        }
        n nVar = this.node;
        if (nVar != null && ((String) nVar.H("onuserdragstart")) != null) {
            sendMessage(this.node, "onuserdragstart", null, null, null);
        }
    }

    public final void y(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
            return;
        }
        n nVar = this.node;
        if (nVar != null && ((String) nVar.H("onitemclick")) != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("position", String.valueOf(i));
            sendMessage(this.node, "onitemclick", null, hashMap, null);
        }
    }

    public final void z(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c224f1", new Object[]{this, new Integer(i)});
        } else if (i >= 0) {
            this.c = i;
            n nVar = this.node;
            if (nVar != null && ((String) nVar.H("onselectchange")) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("position", String.valueOf(i));
                sendMessage(this.node, "onselectchange", null, hashMap, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c extends jfw {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public AlbumModel w0;
        public boolean x0;
        public boolean y0;
        public int z0;

        static {
            t2o.a(468714420);
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -407167169) {
                super.v((Context) objArr[0], (String) objArr[1], objArr[2]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/hostcontainer/tnode/component/FullPageAlbumComponent$TBAlbumViewParams");
        }

        @Override // tb.jfw
        public void v(Context context, String str, Object obj) {
            char c;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7bb1f3f", new Object[]{this, context, str, obj});
                return;
            }
            super.v(context, str, obj);
            try {
                switch (str.hashCode()) {
                    case -1162090388:
                        if (str.equals("testsence")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case -338115564:
                        if (str.equals("showlike")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 224506198:
                        if (str.equals("selectindex")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 249929369:
                        if (str.equals("albumdata")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1439562083:
                        if (str.equals("autoplay")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c != 0) {
                    if (c == 1) {
                        this.x0 = nwv.o(obj, false);
                    } else if (c != 2) {
                        if (c == 3) {
                            this.y0 = nwv.o(obj, false);
                        } else if (c == 4) {
                            String str2 = (String) obj;
                        }
                    } else if (obj instanceof String) {
                        this.z0 = Integer.parseInt((String) obj);
                    }
                } else if (obj instanceof JSONObject) {
                    this.w0 = (AlbumModel) JSON.parseObject(((JSONObject) obj).toJSONString(), AlbumModel.class);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
