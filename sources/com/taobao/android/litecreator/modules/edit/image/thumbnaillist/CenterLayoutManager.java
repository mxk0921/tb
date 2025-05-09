package com.taobao.android.litecreator.modules.edit.image.thumbnaillist;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.ref.WeakReference;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class CenterLayoutManager extends LinearLayoutManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final WeakReference<RecyclerView> f8274a;
    public float b = 100.0f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class CenterSmoothScroller extends LinearSmoothScroller {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(511705239);
        }

        public CenterSmoothScroller(Context context) {
            super(context);
        }

        public static /* synthetic */ Object ipc$super(CenterSmoothScroller centerSmoothScroller, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/CenterLayoutManager$CenterSmoothScroller");
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("b808eb6f", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5)})).intValue();
            }
            return (i3 + ((i4 - i3) / 2)) - (i + ((i2 - i) / 2));
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("bbeb1cb2", new Object[]{this, displayMetrics})).floatValue();
            }
            return CenterLayoutManager.y(CenterLayoutManager.this) / displayMetrics.densityDpi;
        }
    }

    static {
        t2o.a(511705238);
    }

    public CenterLayoutManager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(CenterLayoutManager centerLayoutManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -574012007) {
            return new Boolean(super.canScrollHorizontally());
        }
        if (hashCode == 1027840325) {
            super.onLayoutChildren((RecyclerView.Recycler) objArr[0], (RecyclerView.State) objArr[1]);
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/litecreator/modules/edit/image/thumbnaillist/CenterLayoutManager");
    }

    public static /* synthetic */ float y(CenterLayoutManager centerLayoutManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ec3209e", new Object[]{centerLayoutManager})).floatValue();
        }
        return centerLayoutManager.b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public boolean canScrollHorizontally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ddc94599", new Object[]{this})).booleanValue();
        }
        if (this.f8274a.get() != null) {
            return this.f8274a.get().isEnabled();
        }
        return super.canScrollHorizontally();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d439945", new Object[]{this, recycler, state});
            return;
        }
        try {
            super.onLayoutChildren(recycler, state);
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a873752a", new Object[]{this, recyclerView, state, new Integer(i)});
            return;
        }
        CenterSmoothScroller centerSmoothScroller = new CenterSmoothScroller(recyclerView.getContext());
        centerSmoothScroller.setTargetPosition(i);
        startSmoothScroll(centerSmoothScroller);
    }

    public void z(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a404bd1", new Object[]{this, new Float(f)});
        } else {
            this.b = f;
        }
    }

    public CenterLayoutManager(Context context, int i, boolean z, RecyclerView recyclerView) {
        super(context, i, z);
        this.f8274a = new WeakReference<>(recyclerView);
    }

    public CenterLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
