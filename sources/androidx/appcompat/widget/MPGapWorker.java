package androidx.appcompat.widget;

import android.os.SystemClock;
import android.util.LruCache;
import android.view.View;
import androidx.recyclerview.widget.GapWorker;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ab.api.ABGlobal;
import com.taobao.message.kit.util.ConfigUtil;
import com.taobao.message.kit.util.ValueUtil;
import com.taobao.message.lab.comfrm.constant.Constants;
import com.taobao.message.lab.comfrm.util.Logger;
import com.taobao.message.lab.comfrm.util.TraceUtil;
import com.taobao.message.uikit.util.ApplicationUtil;
import java.util.ArrayList;
import java.util.List;
import tb.c21;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class MPGapWorker implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static boolean ALLOW_THREAD_GAP_WORK = true;
    private static final int DELAY = 24;
    private static final int FROM_DATA_CHANGE = 0;
    private static final int FROM_PREFETCH = 2;
    private static final int FROM_RESUME = 1;
    private static final int FROM_SCROLL_IDLE = 3;
    private static final String TAG = "MPGapWorker";
    private RecyclerView mAttachRecyclerView;
    private int mFrom;
    private ResetRangePrefetchListener mResetRangePrefetchListener;
    private long mScrollVersion;
    private LruCache<Integer, View> mViewCache;
    private boolean mInScrollGap = true;
    private boolean mPrefetch = false;
    private boolean mPause = false;
    private int mSingleBatchMaxSize = 0;
    private int mScrollGapDelayTime = 0;
    private int mNextPrefetchPos = -1;
    private int mDistPrefetchPost = -1;
    private List<Runnable> mNextScrollGapRunnableList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface ResetRangePrefetchListener {
        void resetRangePrefetch(int i, int i2, int i3);
    }

    static {
        t2o.a(537919489);
    }

    public static /* synthetic */ RecyclerView access$000(MPGapWorker mPGapWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("a6f938f9", new Object[]{mPGapWorker});
        }
        return mPGapWorker.mAttachRecyclerView;
    }

    public static /* synthetic */ LruCache access$100(MPGapWorker mPGapWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("9eb17ee2", new Object[]{mPGapWorker});
        }
        return mPGapWorker.mViewCache;
    }

    public static /* synthetic */ void access$200(MPGapWorker mPGapWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94bc3890", new Object[]{mPGapWorker});
        } else {
            mPGapWorker.clearCache();
        }
    }

    public static /* synthetic */ void access$300(MPGapWorker mPGapWorker, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("784572b4", new Object[]{mPGapWorker, new Integer(i)});
        } else {
            mPGapWorker.resetRangePrefetchInner(i);
        }
    }

    public static /* synthetic */ boolean access$402(MPGapWorker mPGapWorker, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("23015dcc", new Object[]{mPGapWorker, new Boolean(z)})).booleanValue();
        }
        mPGapWorker.mInScrollGap = z;
        return z;
    }

    public static /* synthetic */ int access$500(MPGapWorker mPGapWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c122e160", new Object[]{mPGapWorker})).intValue();
        }
        return mPGapWorker.mScrollGapDelayTime;
    }

    public static /* synthetic */ long access$600(MPGapWorker mPGapWorker) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7a9a6f00", new Object[]{mPGapWorker})).longValue();
        }
        return mPGapWorker.mScrollVersion;
    }

    public static /* synthetic */ long access$602(MPGapWorker mPGapWorker, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("df56e2e", new Object[]{mPGapWorker, new Long(j)})).longValue();
        }
        mPGapWorker.mScrollVersion = j;
        return j;
    }

    private void clearCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8aded33c", new Object[]{this});
        } else {
            this.mViewCache.evictAll();
        }
    }

    public static boolean isAllowThreadGapWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9aafd29", new Object[0])).booleanValue();
        }
        if (c21.g().getInt("deviceLevel", -1) == 2) {
            return ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "openMPGapWorkerLevel2");
        }
        return !ABGlobal.isFeatureOpened(ApplicationUtil.getApplication(), "closeMPGapWorker") && ALLOW_THREAD_GAP_WORK;
    }

    private void prefetchPositionFromDataChange() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad0cf62b", new Object[]{this});
        } else {
            prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
        }
    }

    private void prefetchPositionFromPrefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8e8cc28", new Object[]{this});
        } else {
            prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
        }
    }

    private void prefetchPositionFromResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("483449de", new Object[]{this});
        } else {
            prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
        }
    }

    private void prefetchPositionFromScrollIdle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8672def2", new Object[]{this});
        } else {
            prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
        }
    }

    private RecyclerView.ViewHolder prefetchPositionWithDeadline(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.ViewHolder) ipChange.ipc$dispatch("58a4fb34", new Object[]{this, new Integer(i), new Long(j)});
        }
        RecyclerView recyclerView = this.mAttachRecyclerView;
        if (GapWorker.isPrefetchPositionAttached(recyclerView, i)) {
            return null;
        }
        RecyclerView.Recycler recycler = recyclerView.mRecycler;
        try {
            TraceUtil.beginSection("MPGapWorkerPreload");
            recyclerView.onEnterLayoutOrScroll();
            RecyclerView.ViewHolder tryGetViewHolderForPositionByDeadline = recycler.tryGetViewHolderForPositionByDeadline(i, false, j);
            if (tryGetViewHolderForPositionByDeadline != null) {
                if (!tryGetViewHolderForPositionByDeadline.isBound() || tryGetViewHolderForPositionByDeadline.isInvalid()) {
                    recycler.addViewHolderToRecycledViewPool(tryGetViewHolderForPositionByDeadline, false);
                } else {
                    recycleView(tryGetViewHolderForPositionByDeadline.itemView);
                }
            }
            recyclerView.onExitLayoutOrScroll(false);
            TraceUtil.endTrace();
            return tryGetViewHolderForPositionByDeadline;
        } catch (Throwable th) {
            recyclerView.onExitLayoutOrScroll(false);
            TraceUtil.endTrace();
            throw th;
        }
    }

    private void recycleView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8575ce13", new Object[]{this, view});
            return;
        }
        RecyclerView.ViewHolder childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
        if (childViewHolderInt.isScrap()) {
            childViewHolderInt.unScrap();
        } else if (childViewHolderInt.wasReturnedFromScrap()) {
            childViewHolderInt.clearReturnedFromScrapFlag();
        }
        this.mViewCache.put(Integer.valueOf(childViewHolderInt.getAdapterPosition()), view);
    }

    public boolean isInScrollGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("566c7125", new Object[]{this})).booleanValue();
        }
        return this.mInScrollGap;
    }

    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (ALLOW_THREAD_GAP_WORK) {
            this.mPause = true;
        }
    }

    public void postNextScrollGap(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e63e35db", new Object[]{this, runnable});
        } else {
            this.mNextScrollGapRunnableList.add(runnable);
        }
    }

    public void prefetch() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b632fe", new Object[]{this});
        } else if (ALLOW_THREAD_GAP_WORK) {
            this.mPrefetch = true;
            resetRangePrefetchInner(2);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (ALLOW_THREAD_GAP_WORK && this.mInScrollGap && !this.mPause) {
            RecyclerView recyclerView = this.mAttachRecyclerView;
            if (recyclerView.isAttachedToWindow()) {
                if (this.mNextPrefetchPos < recyclerView.getAdapter().getItemCount() && this.mViewCache.get(Integer.valueOf(this.mNextPrefetchPos)) == null) {
                    try {
                        int i = this.mFrom;
                        if (i == 0) {
                            prefetchPositionFromDataChange();
                        } else if (i == 1) {
                            prefetchPositionFromResume();
                        } else if (i == 2) {
                            prefetchPositionFromPrefetch();
                        } else if (i == 3) {
                            prefetchPositionFromScrollIdle();
                        } else {
                            prefetchPositionWithDeadline(this.mNextPrefetchPos, Long.MAX_VALUE);
                        }
                    } catch (Throwable unused) {
                    }
                }
                int i2 = this.mNextPrefetchPos;
                if (i2 + 1 <= this.mDistPrefetchPost) {
                    int i3 = i2 + 1;
                    this.mNextPrefetchPos = i3;
                    if (i3 < recyclerView.getAdapter().getItemCount() && this.mInScrollGap) {
                        this.mAttachRecyclerView.postDelayed(this, 24L);
                    }
                }
            }
        }
    }

    public void runNextScrollGap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a26d52", new Object[]{this});
            return;
        }
        for (Runnable runnable : this.mNextScrollGapRunnableList) {
            runnable.run();
        }
        this.mNextScrollGapRunnableList.clear();
    }

    public void setResetRangePrefetchListener(ResetRangePrefetchListener resetRangePrefetchListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("baa146c", new Object[]{this, resetRangePrefetchListener});
        } else {
            this.mResetRangePrefetchListener = resetRangePrefetchListener;
        }
    }

    private void resetRangePrefetchInner(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3d57deb", new Object[]{this, new Integer(i)});
        } else if (this.mInScrollGap && this.mAttachRecyclerView.getChildCount() > 0 && this.mSingleBatchMaxSize > 0) {
            RecyclerView recyclerView = this.mAttachRecyclerView;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(recyclerView.getChildAt(recyclerView.getChildCount() - 1));
            if (childAdapterPosition != -1) {
                this.mFrom = i;
                int i2 = 1 + childAdapterPosition;
                this.mNextPrefetchPos = i2;
                this.mDistPrefetchPost = this.mSingleBatchMaxSize + childAdapterPosition;
                this.mAttachRecyclerView.postDelayed(this, 24L);
                ResetRangePrefetchListener resetRangePrefetchListener = this.mResetRangePrefetchListener;
                if (resetRangePrefetchListener != null) {
                    resetRangePrefetchListener.resetRangePrefetch(i2, childAdapterPosition + this.mSingleBatchMaxSize, i);
                }
            }
        }
    }

    public void attach(RecyclerView recyclerView, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aaec3b8", new Object[]{this, recyclerView, new Integer(i)});
        } else if (ALLOW_THREAD_GAP_WORK) {
            this.mScrollGapDelayTime = ValueUtil.getInteger(ConfigUtil.getValue(Constants.OrangeNS.CONTAINER, "scrollGapDelayTime", "1000"), 0);
            this.mAttachRecyclerView = recyclerView;
            this.mSingleBatchMaxSize = i;
            this.mViewCache = new LruCache<Integer, View>(i) { // from class: androidx.appcompat.widget.MPGapWorker.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/MPGapWorker$1");
                }

                public void entryRemoved(boolean z, Integer num, View view, View view2) {
                    RecyclerView.ViewHolder childViewHolderInt;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f27ad478", new Object[]{this, new Boolean(z), num, view, view2});
                    } else if (z && (childViewHolderInt = RecyclerView.getChildViewHolderInt(view)) != null) {
                        MPGapWorker.access$000(MPGapWorker.this).getRecycledViewPool().putRecycledView(childViewHolderInt);
                    }
                }
            };
            this.mAttachRecyclerView.setViewCacheExtension(new RecyclerView.ViewCacheExtension() { // from class: androidx.appcompat.widget.MPGapWorker.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/MPGapWorker$2");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.ViewCacheExtension
                public View getViewForPositionAndType(RecyclerView.Recycler recycler, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return (View) ipChange2.ipc$dispatch("32697179", new Object[]{this, recycler, new Integer(i2), new Integer(i3)});
                    }
                    View view = (View) MPGapWorker.access$100(MPGapWorker.this).get(Integer.valueOf(i2));
                    MPGapWorker.access$100(MPGapWorker.this).remove(Integer.valueOf(i2));
                    if (view != null && ApplicationUtil.isDebug()) {
                        Logger.e(MPGapWorker.TAG, "hitPos|" + i2 + "|viewCache|" + MPGapWorker.access$100(MPGapWorker.this).toString());
                    }
                    return view;
                }
            });
            this.mAttachRecyclerView.getAdapter().registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() { // from class: androidx.appcompat.widget.MPGapWorker.3
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass3 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/MPGapWorker$3");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onChanged() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ba16f5dc", new Object[]{this});
                        return;
                    }
                    MPGapWorker.access$200(MPGapWorker.this);
                    MPGapWorker.access$000(MPGapWorker.this).addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.MPGapWorker.3.1
                        public static volatile transient /* synthetic */ IpChange $ipChange;

                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                            IpChange ipChange3 = $ipChange;
                            if (ipChange3 instanceof IpChange) {
                                ipChange3.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8), new Integer(i9)});
                                return;
                            }
                            MPGapWorker.access$000(MPGapWorker.this).removeOnLayoutChangeListener(this);
                            MPGapWorker.access$300(MPGapWorker.this, 0);
                        }
                    });
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("70303dd0", new Object[]{this, new Integer(i2), new Integer(i3)});
                    } else {
                        MPGapWorker.access$200(MPGapWorker.this);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeInserted(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("8e983dea", new Object[]{this, new Integer(i2), new Integer(i3)});
                    } else {
                        MPGapWorker.access$200(MPGapWorker.this);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeMoved(int i2, int i3, int i4) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("97535514", new Object[]{this, new Integer(i2), new Integer(i3), new Integer(i4)});
                    } else {
                        MPGapWorker.access$200(MPGapWorker.this);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeRemoved(int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("f1cd027c", new Object[]{this, new Integer(i2), new Integer(i3)});
                    } else {
                        MPGapWorker.access$200(MPGapWorker.this);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.AdapterDataObserver
                public void onItemRangeChanged(int i2, int i3, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("ad2e59ac", new Object[]{this, new Integer(i2), new Integer(i3), obj});
                    } else {
                        MPGapWorker.access$200(MPGapWorker.this);
                    }
                }
            });
            this.mAttachRecyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: androidx.appcompat.widget.MPGapWorker.4
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass4 r2, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/appcompat/widget/MPGapWorker$4");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView2, int i2) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView2, new Integer(i2)});
                    } else if (i2 == 1) {
                        MPGapWorker.access$402(MPGapWorker.this, false);
                    } else if (i2 != 0) {
                    } else {
                        if (MPGapWorker.access$500(MPGapWorker.this) > 0) {
                            final long uptimeMillis = SystemClock.uptimeMillis();
                            MPGapWorker.access$602(MPGapWorker.this, uptimeMillis);
                            MPGapWorker.access$000(MPGapWorker.this).postDelayed(new Runnable() { // from class: androidx.appcompat.widget.MPGapWorker.4.1
                                public static volatile transient /* synthetic */ IpChange $ipChange;

                                @Override // java.lang.Runnable
                                public void run() {
                                    IpChange ipChange3 = $ipChange;
                                    if (ipChange3 instanceof IpChange) {
                                        ipChange3.ipc$dispatch("5c510192", new Object[]{this});
                                    } else if (uptimeMillis == MPGapWorker.access$600(MPGapWorker.this)) {
                                        MPGapWorker.access$402(MPGapWorker.this, true);
                                        MPGapWorker.this.runNextScrollGap();
                                        MPGapWorker.access$300(MPGapWorker.this, 3);
                                    }
                                }
                            }, 1000L);
                            return;
                        }
                        MPGapWorker.access$402(MPGapWorker.this, true);
                        MPGapWorker.access$300(MPGapWorker.this, 3);
                    }
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrolled(RecyclerView recyclerView2, int i2, int i3) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("b9d7be25", new Object[]{this, recyclerView2, new Integer(i2), new Integer(i3)});
                    }
                }
            });
        }
    }

    public void resume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("deb96e34", new Object[]{this});
        } else if (ALLOW_THREAD_GAP_WORK) {
            this.mPause = false;
            if (this.mPrefetch) {
                resetRangePrefetchInner(1);
            }
        }
    }
}
