package com.alibaba.android.ultron.ext.vlayout.extend;

import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Closeable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class InnerRecycledViewPool extends RecyclerView.RecycledViewPool {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int d = 20;

    /* renamed from: a  reason: collision with root package name */
    public final RecyclerView.RecycledViewPool f2295a;
    public final SparseIntArray b;
    public final SparseIntArray c;

    static {
        t2o.a(156237971);
    }

    public InnerRecycledViewPool(RecyclerView.RecycledViewPool recycledViewPool) {
        this.b = new SparseIntArray();
        this.c = new SparseIntArray();
        this.f2295a = recycledViewPool;
    }

    public static /* synthetic */ Object ipc$super(InnerRecycledViewPool innerRecycledViewPool, String str, Object... objArr) {
        if (str.hashCode() == -1272099756) {
            super.clear();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/ext/vlayout/extend/InnerRecycledViewPool");
    }

    public final void a(RecyclerView.ViewHolder viewHolder) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b42af76", new Object[]{this, viewHolder});
            return;
        }
        View view = viewHolder.itemView;
        if (view instanceof Closeable) {
            try {
                ((Closeable) view).close();
            } catch (Exception e) {
                Log.getStackTraceString(e);
            }
        }
        if (viewHolder instanceof Closeable) {
            try {
                ((Closeable) viewHolder).close();
            } catch (Exception e2) {
                Log.getStackTraceString(e2);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            int keyAt = this.b.keyAt(i);
            RecyclerView.ViewHolder recycledView = this.f2295a.getRecycledView(keyAt);
            while (recycledView != null) {
                a(recycledView);
                recycledView = this.f2295a.getRecycledView(keyAt);
            }
        }
        this.b.clear();
        super.clear();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public RecyclerView.ViewHolder getRecycledView(int i) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("cda1918a", new Object[]{this, new Integer(i)});
        }
        RecyclerView.ViewHolder recycledView = this.f2295a.getRecycledView(i);
        if (recycledView != null) {
            if (this.b.indexOfKey(i) >= 0) {
                i2 = this.b.get(i);
            }
            if (i2 > 0) {
                this.b.put(i, i2 - 1);
            }
        }
        return recycledView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void putRecycledView(RecyclerView.ViewHolder viewHolder) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("abe91d0", new Object[]{this, viewHolder});
            return;
        }
        int itemViewType = viewHolder.getItemViewType();
        if (this.c.indexOfKey(itemViewType) < 0) {
            SparseIntArray sparseIntArray = this.c;
            int i2 = d;
            sparseIntArray.put(itemViewType, i2);
            setMaxRecycledViews(itemViewType, i2);
        }
        if (this.b.indexOfKey(itemViewType) >= 0) {
            i = this.b.get(itemViewType);
        }
        if (this.c.get(itemViewType) > i) {
            this.f2295a.putRecycledView(viewHolder);
            this.b.put(itemViewType, i + 1);
            return;
        }
        a(viewHolder);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public void setMaxRecycledViews(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2fa3122", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        RecyclerView.ViewHolder recycledView = this.f2295a.getRecycledView(i);
        while (recycledView != null) {
            a(recycledView);
            recycledView = this.f2295a.getRecycledView(i);
        }
        this.c.put(i, i2);
        this.b.put(i, 0);
        this.f2295a.setMaxRecycledViews(i, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public int size() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("32697bfb", new Object[]{this})).intValue();
        }
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.b.valueAt(i2);
        }
        return i;
    }

    public InnerRecycledViewPool() {
        this(new RecyclerView.RecycledViewPool());
    }
}
