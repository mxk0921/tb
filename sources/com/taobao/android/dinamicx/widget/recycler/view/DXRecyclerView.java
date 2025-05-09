package com.taobao.android.dinamicx.widget.recycler.view;

import android.content.Context;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DinamicXEngine;
import com.taobao.android.dinamicx.f;
import com.taobao.android.dinamicx.widget.recycler.RecyclerAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import tb.gp8;
import tb.h36;
import tb.hxb;
import tb.ic5;
import tb.nb6;
import tb.t2o;
import tb.xv5;
import tb.zg5;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class DXRecyclerView extends RecyclerView implements hxb {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public gp8 exposeHelper;
    private boolean ignoreMotionEvent;
    public ArrayList<RecyclerView.OnScrollListener> mExtraScrollerListeners;
    private Parcelable saveInstanceState = null;
    private boolean isNeedScrollAfterLayout = false;
    private int offsetX = 0;
    private int offsetY = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f7494a;
        public final /* synthetic */ int b;

        public a(int i, int i2) {
            this.f7494a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                DXRecyclerView.access$000(DXRecyclerView.this, this.f7494a, this.b);
            }
        }
    }

    static {
        t2o.a(444597615);
        t2o.a(444597071);
    }

    public DXRecyclerView(Context context) {
        super(context);
    }

    public static /* synthetic */ void access$000(DXRecyclerView dXRecyclerView, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8b4e700", new Object[]{dXRecyclerView, new Integer(i), new Integer(i2)});
        } else {
            dXRecyclerView.internalScrollByAfterLayout(i, i2);
        }
    }

    private void correctSpanCountChangeError(int i) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        int spanCount;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8b2adf", new Object[]{this, new Integer(i)});
            return;
        }
        try {
            if ((getLayoutManager() instanceof StaggeredGridLayoutManager) && !nb6.i() && (spanCount = (staggeredGridLayoutManager = (StaggeredGridLayoutManager) getLayoutManager()).getSpanCount()) >= 2) {
                int[] iArr = new int[spanCount];
                staggeredGridLayoutManager.findFirstCompletelyVisibleItemPositions(iArr);
                if (iArr[0] > spanCount) {
                    z = false;
                }
                if (i == 0 && z) {
                    staggeredGridLayoutManager.invalidateSpanAssignments();
                }
            }
        } catch (Exception unused) {
        }
    }

    private void internalScrollByAfterLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ffd2ec", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        this.isNeedScrollAfterLayout = true;
        this.offsetX = i;
        this.offsetY = i2;
        requestLayout();
    }

    public static /* synthetic */ Object ipc$super(DXRecyclerView dXRecyclerView, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1447998406:
                return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
            case -1233452803:
                super.addOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case -244855388:
                super.onLayout(((Boolean) objArr[0]).booleanValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), ((Number) objArr[4]).intValue());
                return null;
            case 27005610:
                return super.onSaveInstanceState();
            case 80153535:
                super.onRestoreInstanceState((Parcelable) objArr[0]);
                return null;
            case 949399698:
                super.onDetachedFromWindow();
                return null;
            case 1107673824:
                super.removeOnScrollListener((RecyclerView.OnScrollListener) objArr[0]);
                return null;
            case 1243377869:
                super.clearOnScrollListeners();
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/widget/recycler/view/DXRecyclerView");
        }
    }

    private void scrollByOffset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cf27ebe", new Object[]{this});
        } else if (this.isNeedScrollAfterLayout) {
            this.isNeedScrollAfterLayout = false;
            scrollBy(this.offsetX, this.offsetY);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void addOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b67b00fd", new Object[]{this, onScrollListener});
            return;
        }
        super.addOnScrollListener(onScrollListener);
        if (this.mExtraScrollerListeners == null) {
            this.mExtraScrollerListeners = new ArrayList<>();
        }
        this.mExtraScrollerListeners.add(onScrollListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void clearOnScrollListeners() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a1c70cd", new Object[]{this});
            return;
        }
        super.clearOnScrollListeners();
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public gp8 getExposeHelper() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gp8) ipChange.ipc$dispatch("d25921db", new Object[]{this});
        }
        return this.exposeHelper;
    }

    public boolean isIgnoreMotionEvent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c2ae3d3", new Object[]{this})).booleanValue();
        }
        return this.ignoreMotionEvent;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        try {
            Parcelable parcelable = this.saveInstanceState;
            if (parcelable != null) {
                onRestoreInstanceState(parcelable);
            }
            super.onAttachedToWindow();
            if (this.exposeHelper != null) {
                h36.b("DXRecyclerView", "exposeHelper.attach();");
                this.exposeHelper.b();
            }
        } catch (Throwable th) {
            f fVar = new f(h36.TAG);
            f.a aVar = new f.a("native", "native_crash", f.DX_ERROR_CODE_RECYCLER_LAYOUT_230008);
            aVar.e = xv5.a(th);
            if (fVar.c == null) {
                fVar.c = new ArrayList();
            }
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        try {
            if (!zg5.z2()) {
                this.saveInstanceState = onSaveInstanceState();
            }
            super.onDetachedFromWindow();
            if (zg5.z2()) {
                this.saveInstanceState = onSaveInstanceState();
            }
            if (this.exposeHelper != null) {
                h36.b("DXRecyclerView", "exposeHelper.detach();");
                this.exposeHelper.c();
            }
        } catch (Throwable th) {
            f fVar = new f(h36.TAG);
            f.a aVar = new f.a("native", "native_crash", f.DX_ERROR_CODE_RECYCLER_LAYOUT_230009);
            aVar.e = xv5.a(th);
            if (fVar.c == null) {
                fVar.c = new ArrayList();
            }
            ((ArrayList) fVar.c).add(aVar);
            ic5.p(fVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f167cda4", new Object[]{this, new Boolean(z), new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4)});
            return;
        }
        try {
            super.onLayout(z, i, i2, i3, i4);
            gp8 gp8Var = this.exposeHelper;
            if (gp8Var != null) {
                gp8Var.d();
            }
            scrollByOffset();
        } catch (Throwable th) {
            xv5.b(th);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            SavedState savedState = (SavedState) parcelable;
            super.onRestoreInstanceState(savedState.getSuperState());
            RecyclerView.Adapter adapter = getAdapter();
            if (DinamicXEngine.j0()) {
                h36.g("DXSavedState", parcelable.hashCode() + " onRestoreInstanceState mLoadMoreState: " + savedState.mLoadMoreState);
            }
            if ((adapter instanceof RecyclerAdapter) && (i = savedState.mLoadMoreState) != 1) {
                ((RecyclerAdapter) adapter).y0(i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter instanceof RecyclerAdapter) {
            savedState.mLoadMoreState = ((RecyclerAdapter) adapter).a0();
        }
        if (DinamicXEngine.j0()) {
            h36.g("DXSavedState", savedState.hashCode() + " onSaveInstanceState mLoadMoreState: " + savedState.mLoadMoreState);
        }
        return savedState;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
            return;
        }
        super.onScrollStateChanged(i);
        correctSpanCountChangeError(i);
    }

    public void onScrollStateChangedExtra(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338eb3b", new Object[]{this, new Integer(i)});
            return;
        }
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList != null) {
            Iterator<RecyclerView.OnScrollListener> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().onScrollStateChanged(this, i);
            }
            correctSpanCountChangeError(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        if (this.ignoreMotionEvent) {
            return false;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, com.alilive.adapter.uikit.a
    public void removeOnScrollListener(RecyclerView.OnScrollListener onScrollListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4205c2e0", new Object[]{this, onScrollListener});
            return;
        }
        super.removeOnScrollListener(onScrollListener);
        ArrayList<RecyclerView.OnScrollListener> arrayList = this.mExtraScrollerListeners;
        if (arrayList != null) {
            arrayList.remove(onScrollListener);
        }
    }

    public void scrollByAfterLayout(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c86c1b29", new Object[]{this, new Integer(i), new Integer(i2)});
        } else if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            post(new a(i, i2));
        } else {
            internalScrollByAfterLayout(i, i2);
        }
    }

    public void setExposeHelper(gp8 gp8Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c4f19e1", new Object[]{this, gp8Var});
        } else {
            this.exposeHelper = gp8Var;
        }
    }

    public void setIgnoreMotionEvent(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5103e1d", new Object[]{this, new Boolean(z)});
        } else {
            this.ignoreMotionEvent = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        int mLoadMoreState;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static class a implements Parcelable.Creator<SavedState> {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState) ipChange.ipc$dispatch("1d2d42ea", new Object[]{this, parcel});
                }
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (SavedState[]) ipChange.ipc$dispatch("6db55053", new Object[]{this, new Integer(i)});
                }
                return new SavedState[i];
            }
        }

        static {
            t2o.a(444597617);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.mLoadMoreState = 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.mLoadMoreState);
        }

        public SavedState(Parcel parcel) {
            super(parcel);
            this.mLoadMoreState = 1;
            this.mLoadMoreState = parcel.readInt();
        }
    }

    public DXRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DXRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
