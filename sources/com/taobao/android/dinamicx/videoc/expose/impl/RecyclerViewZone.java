package com.taobao.android.dinamicx.videoc.expose.impl;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.aa6;
import tb.c10;
import tb.h4c;
import tb.m4c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class RecyclerViewZone<ExposeKey, ExposeData> extends c10<ExposeKey, ExposeData> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final WeakReference<RecyclerView> c;
    public final RecyclerView.OnScrollListener d;
    public final RecyclerView.OnChildAttachStateChangeListener e;
    public final h4c<ExposeKey, ExposeData> f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RecyclerViewZoneChildStateListener<ExposeKey, ExposeData> implements RecyclerView.OnChildAttachStateChangeListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WeakReference<RecyclerView> f7345a;
        public final b<ExposeKey, ExposeData> b;
        public final h4c<ExposeKey, ExposeData> c;
        public final String d;

        static {
            t2o.a(444597144);
        }

        public RecyclerViewZoneChildStateListener(WeakReference<RecyclerView> weakReference, b<ExposeKey, ExposeData> bVar, h4c<ExposeKey, ExposeData> h4cVar, String str) {
            this.f7345a = weakReference;
            this.b = bVar;
            this.c = h4cVar;
            this.d = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewAttachedToWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("517542da", new Object[]{this, view});
                return;
            }
            WeakReference<RecyclerView> weakReference = this.f7345a;
            if (weakReference != null) {
                RecyclerView recyclerView = weakReference.get();
                b<ExposeKey, ExposeData> bVar = this.b;
                if (bVar != null && recyclerView != null) {
                    ((aa6) bVar).j(this.c, this.d, recyclerView, view);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener
        public void onChildViewDetachedFromWindow(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8a66017d", new Object[]{this, view});
                return;
            }
            WeakReference<RecyclerView> weakReference = this.f7345a;
            if (weakReference != null) {
                RecyclerView recyclerView = weakReference.get();
                b<ExposeKey, ExposeData> bVar = this.b;
                if (bVar != null && recyclerView != null) {
                    bVar.b(this.c, this.d, recyclerView, view);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class RecyclerViewZoneScrollListener<ExposeKey, ExposeData> extends RecyclerView.OnScrollListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final b<ExposeKey, ExposeData> f7346a;
        public final h4c<ExposeKey, ExposeData> b;
        public final String c;

        static {
            t2o.a(444597145);
        }

        public RecyclerViewZoneScrollListener(b<ExposeKey, ExposeData> bVar, h4c<ExposeKey, ExposeData> h4cVar, String str) {
            this.f7346a = bVar;
            this.b = h4cVar;
            this.c = str;
        }

        public static /* synthetic */ Object ipc$super(RecyclerViewZoneScrollListener recyclerViewZoneScrollListener, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -1177043419) {
                super.onScrolled((RecyclerView) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue());
                return null;
            } else if (hashCode == 1361287682) {
                super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/videoc/expose/impl/RecyclerViewZone$RecyclerViewZoneScrollListener");
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            b<ExposeKey, ExposeData> bVar = this.f7346a;
            if (bVar != null) {
                ((aa6) bVar).k(this.b, this.c, recyclerView, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView, new Integer(i), new Integer(i2)});
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            b<ExposeKey, ExposeData> bVar = this.f7346a;
            if (bVar != null) {
                bVar.a(this.b, this.c, recyclerView, i, i2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<ExposeKey, ExposeData> implements m4c.a<ExposeKey, ExposeData> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final RecyclerView f7347a;
        public b<ExposeKey, ExposeData> b;

        static {
            t2o.a(444597142);
            t2o.a(444597129);
        }

        public a(RecyclerView recyclerView) {
            this.f7347a = recyclerView;
        }

        /* renamed from: a */
        public RecyclerViewZone<ExposeKey, ExposeData> c(h4c<ExposeKey, ExposeData> h4cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerViewZone) ipChange.ipc$dispatch("f8ab1d6", new Object[]{this, h4cVar});
            }
            return new RecyclerViewZone<>(this.f7347a, this.b, h4cVar);
        }

        /* renamed from: b */
        public RecyclerViewZone<ExposeKey, ExposeData> d(h4c<ExposeKey, ExposeData> h4cVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecyclerViewZone) ipChange.ipc$dispatch("138d5260", new Object[]{this, h4cVar, str});
            }
            return new RecyclerViewZone<>(this.f7347a, this.b, h4cVar, str);
        }

        public a<ExposeKey, ExposeData> e(b<ExposeKey, ExposeData> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("29f3e492", new Object[]{this, bVar});
            }
            this.b = bVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b<ExposeKey, ExposeData> {
        void a(h4c<ExposeKey, ExposeData> h4cVar, String str, RecyclerView recyclerView, int i, int i2);

        void b(h4c<ExposeKey, ExposeData> h4cVar, String str, RecyclerView recyclerView, View view);
    }

    static {
        t2o.a(444597141);
    }

    public RecyclerViewZone(RecyclerView recyclerView, b<ExposeKey, ExposeData> bVar, h4c<ExposeKey, ExposeData> h4cVar) {
        this(recyclerView, bVar, h4cVar, null);
    }

    public static /* synthetic */ Object ipc$super(RecyclerViewZone recyclerViewZone, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1965438900) {
            super.attach();
            return null;
        } else if (hashCode == -1212966246) {
            super.detach();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/dinamicx/videoc/expose/impl/RecyclerViewZone");
        }
    }

    @Override // tb.m4c
    public h4c<ExposeKey, ExposeData> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h4c) ipChange.ipc$dispatch("38948420", new Object[]{this});
        }
        return this.f;
    }

    @Override // tb.c10, tb.m4c
    public void attach() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ad9c84c", new Object[]{this});
        } else if (!c() && (recyclerView = this.c.get()) != null) {
            super.attach();
            recyclerView.addOnScrollListener(this.d);
            recyclerView.addOnChildAttachStateChangeListener(this.e);
            this.g = true;
        }
    }

    @Override // tb.m4c
    public void b() {
        RecyclerView recyclerView;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4e2f2b6", new Object[]{this});
        } else if (c() && (recyclerView = this.c.get()) != null && this.e != null) {
            for (int i = 0; i < recyclerView.getChildCount(); i++) {
                ((RecyclerViewZoneChildStateListener) this.e).onChildViewAttachedToWindow(recyclerView.getChildAt(i));
            }
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6f518279", new Object[]{this})).booleanValue();
        }
        return this.g;
    }

    @Override // tb.c10, tb.m4c
    public void detach() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7b39a9a", new Object[]{this});
        } else if (c()) {
            super.detach();
            RecyclerView recyclerView = this.c.get();
            if (recyclerView == null) {
                this.g = false;
                return;
            }
            recyclerView.removeOnScrollListener(this.d);
            recyclerView.removeOnChildAttachStateChangeListener(this.e);
            this.g = false;
        }
    }

    public RecyclerViewZone(RecyclerView recyclerView, b<ExposeKey, ExposeData> bVar, h4c<ExposeKey, ExposeData> h4cVar, String str) {
        super(str);
        this.g = false;
        WeakReference<RecyclerView> weakReference = new WeakReference<>(recyclerView);
        this.c = weakReference;
        this.f = h4cVar;
        this.d = new RecyclerViewZoneScrollListener(bVar, h4cVar, str);
        this.e = new RecyclerViewZoneChildStateListener(weakReference, bVar, h4cVar, str);
    }
}
