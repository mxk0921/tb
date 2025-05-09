package com.taobao.uikit.feature.features.cellanimator;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.WeakHashMap;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecyclerCellAnimatorController {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int DEFAULT_ANIMATION_DELAY_MILLIS = 100;
    private static final int DEFAULT_ANIMATION_DURATION_MILLIS = 300;
    private static final int INITIAL_DELAY_MILLIS = 150;
    private static final String SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION = "savedinstancestate_firstanimatedposition";
    private static final String SAVEDINSTANCESTATE_LASTANIMATEDPOSITION = "savedinstancestate_lastanimatedposition";
    private static final String SAVEDINSTANCESTATE_SHOULDANIMATE = "savedinstancestate_shouldanimate";
    private final RecyclerView mRecyclerView;
    private final WeakHashMap<View, Animator> mAnimators = new WeakHashMap<>();
    private int mInitialDelayMillis = 150;
    private int mAnimationDelayMillis = 100;
    private int mAnimationDurationMillis = 300;
    private boolean mShouldAnimate = true;
    private long mAnimationStartMillis = -1;
    private int mFirstAnimatedPosition = -1;
    private int mLastAnimatedPosition = -1;

    static {
        t2o.a(931135569);
    }

    public RecyclerCellAnimatorController(RecyclerView recyclerView) {
        this.mRecyclerView = recyclerView;
        recyclerView.setRecyclerListener(new RecyclerView.RecyclerListener() { // from class: com.taobao.uikit.feature.features.cellanimator.RecyclerCellAnimatorController.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.recyclerview.widget.RecyclerView.RecyclerListener
            public void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("891ac20", new Object[]{this, viewHolder});
                    return;
                }
                Animator animator = (Animator) RecyclerCellAnimatorController.access$000(RecyclerCellAnimatorController.this).get(viewHolder.itemView);
                if (animator != null) {
                    animator.end();
                }
                RecyclerCellAnimatorController.access$000(RecyclerCellAnimatorController.this).remove(viewHolder.itemView);
            }
        });
    }

    public static /* synthetic */ WeakHashMap access$000(RecyclerCellAnimatorController recyclerCellAnimatorController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WeakHashMap) ipChange.ipc$dispatch("8fee3d54", new Object[]{recyclerCellAnimatorController});
        }
        return recyclerCellAnimatorController.mAnimators;
    }

    private void animateView(int i, View view, Animator[] animatorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13db1396", new Object[]{this, new Integer(i), view, animatorArr});
            return;
        }
        Animator animator = this.mAnimators.get(view);
        if (animator != null) {
            animator.cancel();
        }
        if (this.mAnimationStartMillis == -1) {
            this.mAnimationStartMillis = SystemClock.uptimeMillis();
        }
        view.setAlpha(0.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(animatorArr);
        animatorSet.setStartDelay(calculateAnimationDelay(i));
        animatorSet.setDuration(this.mAnimationDurationMillis);
        animatorSet.start();
        this.mAnimators.put(view, animatorSet);
    }

    private int calculateAnimationDelay(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b399f10a", new Object[]{this, new Integer(i)})).intValue();
        }
        int lastVisiblePosition = getLastVisiblePosition() - getFirstVisiblePosition();
        int i3 = this.mFirstAnimatedPosition;
        if (lastVisiblePosition + 1 >= (i - 1) - i3) {
            return Math.max(0, (int) ((-SystemClock.uptimeMillis()) + this.mAnimationStartMillis + this.mInitialDelayMillis + ((i - i3) * this.mAnimationDelayMillis)));
        }
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            i2 = ((GridLayoutManager) layoutManager).getSpanCount();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            i2 = ((StaggeredGridLayoutManager) layoutManager).getSpanCount();
        } else {
            i2 = 1;
        }
        return this.mAnimationDelayMillis * ((i % i2) + 1);
    }

    private int getFirstVisiblePosition() {
        int[] findFirstVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d9d3335b", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        int i = Integer.MAX_VALUE;
        for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findFirstVisibleItemPositions(null)) {
            if (i2 < i) {
                i = i2;
            }
        }
        return i;
    }

    private int getLastVisiblePosition() {
        int[] findLastVisibleItemPositions;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("db8409", new Object[]{this})).intValue();
        }
        RecyclerView.LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) layoutManager).findLastVisibleItemPosition();
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
            return 0;
        }
        int i = Integer.MIN_VALUE;
        for (int i2 : ((StaggeredGridLayoutManager) layoutManager).findLastVisibleItemPositions(null)) {
            if (i2 > i) {
                i = i2;
            }
        }
        return i;
    }

    public void animateViewIfNecessary(int i, View view, Animator[] animatorArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("499fbed0", new Object[]{this, new Integer(i), view, animatorArr});
        } else if (this.mShouldAnimate && i > this.mLastAnimatedPosition) {
            if (this.mFirstAnimatedPosition == -1) {
                this.mFirstAnimatedPosition = i;
            }
            animateView(i, view, animatorArr);
            this.mLastAnimatedPosition = i;
        }
    }

    public void clearAnimators() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96f07fa6", new Object[]{this});
            return;
        }
        for (Animator animator : this.mAnimators.values()) {
            animator.end();
        }
        this.mAnimators.clear();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c70bbf", new Object[]{this, parcelable});
        } else if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.mFirstAnimatedPosition = bundle.getInt(SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION);
            this.mLastAnimatedPosition = bundle.getInt(SAVEDINSTANCESTATE_LASTANIMATEDPOSITION);
            this.mShouldAnimate = bundle.getBoolean(SAVEDINSTANCESTATE_SHOULDANIMATE);
        }
    }

    public Parcelable onSaveInstanceState() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Parcelable) ipChange.ipc$dispatch("19c12aa", new Object[]{this});
        }
        Bundle bundle = new Bundle();
        bundle.putInt(SAVEDINSTANCESTATE_FIRSTANIMATEDPOSITION, this.mFirstAnimatedPosition);
        bundle.putInt(SAVEDINSTANCESTATE_LASTANIMATEDPOSITION, this.mLastAnimatedPosition);
        bundle.putBoolean(SAVEDINSTANCESTATE_SHOULDANIMATE, this.mShouldAnimate);
        return bundle;
    }

    public void reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("788e6256", new Object[]{this});
            return;
        }
        clearAnimators();
        this.mFirstAnimatedPosition = -1;
        this.mLastAnimatedPosition = -1;
        this.mAnimationStartMillis = -1L;
    }

    public void setAnimationDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8891cb5", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimationDelayMillis = i;
        }
    }

    public void setAnimationDurationMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3bb6d600", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimationDurationMillis = i;
        }
    }

    public void setAnimatorEnable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mShouldAnimate = z;
        if (!z) {
            clearAnimators();
        }
    }

    public void setInitialDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e6e2ff5", new Object[]{this, new Integer(i)});
        } else {
            this.mInitialDelayMillis = i;
        }
    }

    public void setLastAnimatedPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d898bb8", new Object[]{this, new Integer(i)});
        } else {
            this.mLastAnimatedPosition = i;
        }
    }

    public void setShouldAnimateFromPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be2da13d", new Object[]{this, new Integer(i)});
            return;
        }
        setAnimatorEnable(true);
        int i2 = i - 1;
        this.mFirstAnimatedPosition = i2;
        this.mLastAnimatedPosition = i2;
    }

    public void setShouldAnimateNotVisible() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a992eb2", new Object[]{this});
            return;
        }
        setAnimatorEnable(true);
        this.mFirstAnimatedPosition = getFirstVisiblePosition();
        this.mLastAnimatedPosition = getLastVisiblePosition();
    }
}
