package com.taobao.taolive.movehighlight.bundle.timeshift.timeshiftDx.single.adapter;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import java.lang.ref.WeakReference;
import java.util.List;
import tb.jyw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class AutoPollRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable autoPollTask;
    private boolean canInsertItem;
    private boolean canRun;
    private int mCurrentScrolledDy;
    private boolean running;
    private jyw weakHandler;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        private final WeakReference<AutoPollRecyclerView> f13066a;
        private int b;
        private List<ChatMessage> c;

        static {
            t2o.a(779092540);
        }

        public a(AutoPollRecyclerView autoPollRecyclerView, int i, List<ChatMessage> list) {
            this.f13066a = new WeakReference<>(autoPollRecyclerView);
            this.b = i;
            this.c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            AutoPollRecyclerView autoPollRecyclerView = this.f13066a.get();
            if (autoPollRecyclerView != null && AutoPollRecyclerView.access$000(autoPollRecyclerView) && AutoPollRecyclerView.access$100(autoPollRecyclerView) && this.c != null && AutoPollRecyclerView.access$200(autoPollRecyclerView)) {
                this.c.size();
                CommentListAdapter commentListAdapter = (CommentListAdapter) autoPollRecyclerView.getAdapter();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) autoPollRecyclerView.getLayoutManager();
                if (commentListAdapter != null && linearLayoutManager != null) {
                    int size = this.c.size();
                    int i = this.b;
                    if (size > i) {
                        commentListAdapter.M(this.c.get(i));
                        commentListAdapter.notifyDataSetChanged();
                        linearLayoutManager.scrollToPositionWithOffset(commentListAdapter.getItemCount() - 1, Integer.MIN_VALUE);
                        int size2 = this.c.size();
                        int i2 = this.b + 1;
                        if (size2 > i2) {
                            autoPollRecyclerView.setAutoPollTask(new a(autoPollRecyclerView, i2, this.c));
                            autoPollRecyclerView.postDelayed(AutoPollRecyclerView.access$300(autoPollRecyclerView), (long) ((Math.random() * 1500.0d) + 500.0d));
                            autoPollRecyclerView.setCanInsertItem(true);
                            return;
                        }
                        autoPollRecyclerView.setCanInsertItem(false);
                    }
                }
            }
        }
    }

    static {
        t2o.a(779092539);
    }

    public AutoPollRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static /* synthetic */ boolean access$000(AutoPollRecyclerView autoPollRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("34a3bd62", new Object[]{autoPollRecyclerView})).booleanValue();
        }
        return autoPollRecyclerView.running;
    }

    public static /* synthetic */ boolean access$100(AutoPollRecyclerView autoPollRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2107a81", new Object[]{autoPollRecyclerView})).booleanValue();
        }
        return autoPollRecyclerView.canRun;
    }

    public static /* synthetic */ boolean access$200(AutoPollRecyclerView autoPollRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f7d37a0", new Object[]{autoPollRecyclerView})).booleanValue();
        }
        return autoPollRecyclerView.canInsertItem;
    }

    public static /* synthetic */ Runnable access$300(AutoPollRecyclerView autoPollRecyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("7e63c8f9", new Object[]{autoPollRecyclerView});
        }
        return autoPollRecyclerView.autoPollTask;
    }

    public static /* synthetic */ Object ipc$super(AutoPollRecyclerView autoPollRecyclerView, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1447998406) {
            return new Boolean(super.onTouchEvent((MotionEvent) objArr[0]));
        }
        if (hashCode == 589342167) {
            return new Boolean(super.dispatchNestedScroll(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue(), ((Number) objArr[3]).intValue(), (int[]) objArr[4]));
        }
        if (hashCode == 1893018130) {
            super.onScrolled(((Number) objArr[0]).intValue(), ((Number) objArr[1]).intValue());
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/taolive/movehighlight/bundle/timeshift/timeshiftDx/single/adapter/AutoPollRecyclerView");
    }

    @Override // androidx.recyclerview.widget.RecyclerView, androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? ((Boolean) ipChange.ipc$dispatch("40f48794", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr, new Integer(i5)})).booleanValue() : dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("12db3b6f", new Object[]{this})).floatValue();
        }
        return 0.0f;
    }

    public void initData(jyw jywVar, List<ChatMessage> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89962ca5", new Object[]{this, jywVar, list, new Integer(i)});
            return;
        }
        this.weakHandler = jywVar;
        this.autoPollTask = new a(this, i, list);
        this.canInsertItem = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70d52a12", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        super.onScrolled(i, i2);
        if (getScrollState() == 1) {
            this.mCurrentScrolledDy = i2;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
            if (this.running) {
                stop();
            }
        } else if (action == 1 || action == 3 || action == 4) {
            this.mCurrentScrolledDy = 0;
            getParent().requestDisallowInterceptTouchEvent(false);
            if (this.canRun) {
                start();
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setAutoPollTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7610d0ba", new Object[]{this, runnable});
        } else {
            this.autoPollTask = runnable;
        }
    }

    public void setCanInsertItem(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fae91753", new Object[]{this, new Boolean(z)});
        } else {
            this.canInsertItem = z;
        }
    }

    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        if (this.running) {
            stop();
        }
        this.canRun = true;
        this.running = true;
        jyw jywVar = this.weakHandler;
        if (jywVar != null && this.canInsertItem) {
            jywVar.postDelayed(this.autoPollTask, (long) ((Math.random() * 1500.0d) + 500.0d));
        }
    }

    public void stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.running = false;
        jyw jywVar = this.weakHandler;
        if (jywVar != null) {
            jywVar.removeCallbacks(this.autoPollTask);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        int i5;
        int i6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2320a5d7", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), iArr})).booleanValue();
        }
        if (this.mCurrentScrolledDy != 0) {
            i6 = i2 + i4;
            i5 = 0;
        } else {
            i6 = i2;
            i5 = i4;
        }
        return super.dispatchNestedScroll(i, i6, i3, i5, iArr);
    }
}
