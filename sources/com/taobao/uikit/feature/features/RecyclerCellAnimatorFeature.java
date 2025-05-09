package com.taobao.uikit.feature.features;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.uikit.feature.callback.RecyclerAdapterCallback;
import com.taobao.uikit.feature.features.cellanimator.RecyclerCellAnimatorAdapter;
import com.taobao.uikit.feature.features.cellanimator.RecyclerCellAnimatorController;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class RecyclerCellAnimatorFeature extends AbsFeature<RecyclerView> implements RecyclerAdapterCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AnimatorAdapter mAnimatorAdapter;
    private CustomAnimatorFactory mCustomAnimatorFactory;
    private int mInitialDelayMillis = 100;
    private int mAnimatorDelayMillis = 100;
    private int mAnimatorDurationMillis = 400;
    private boolean mIsAnimatorEnable = true;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface CustomAnimatorFactory {
        Animator[] generateAnimators(ViewGroup viewGroup, View view);
    }

    static {
        t2o.a(931135557);
    }

    public static /* synthetic */ CustomAnimatorFactory access$000(RecyclerCellAnimatorFeature recyclerCellAnimatorFeature) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CustomAnimatorFactory) ipChange.ipc$dispatch("747e0e43", new Object[]{recyclerCellAnimatorFeature});
        }
        return recyclerCellAnimatorFeature.mCustomAnimatorFactory;
    }

    public static /* synthetic */ Object ipc$super(RecyclerCellAnimatorFeature recyclerCellAnimatorFeature, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/RecyclerCellAnimatorFeature");
    }

    @Override // com.taobao.uikit.feature.features.AbsFeature
    public void constructor(Context context, AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8928939c", new Object[]{this, context, attributeSet, new Integer(i)});
        } else if (attributeSet != null && (obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CellAnimatorFeature, i, 0)) != null) {
            this.mInitialDelayMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_initialDelay, this.mInitialDelayMillis);
            this.mAnimatorDelayMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_animatorDelay, this.mAnimatorDelayMillis);
            this.mAnimatorDurationMillis = obtainStyledAttributes.getInt(R.styleable.CellAnimatorFeature_uik_animatorDuration, this.mAnimatorDurationMillis);
            obtainStyledAttributes.recycle();
        }
    }

    public int getAnimatorDelayMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fd834386", new Object[]{this})).intValue();
        }
        return this.mAnimatorDelayMillis;
    }

    public int getAnimatorDurationMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("bdf273b1", new Object[]{this})).intValue();
        }
        return this.mAnimatorDurationMillis;
    }

    public int getInitialDelayMillis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("990a40b5", new Object[]{this})).intValue();
        }
        return this.mInitialDelayMillis;
    }

    public boolean isAnimatorEnable() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f211959f", new Object[]{this})).booleanValue();
        }
        return this.mIsAnimatorEnable;
    }

    public void resetAnimators() {
        AnimatorAdapter animatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67fb0be4", new Object[]{this});
        } else if (getHost() != null && (animatorAdapter = this.mAnimatorAdapter) != null) {
            animatorAdapter.reset();
        }
    }

    public void setAnimatorDelayMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62b26adc", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimatorDelayMillis = i;
        }
    }

    public void setAnimatorDurationMillis(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8748279", new Object[]{this, new Integer(i)});
        } else {
            this.mAnimatorDurationMillis = i;
        }
    }

    public void setAnimatorEnable(boolean z) {
        AnimatorAdapter animatorAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7372a661", new Object[]{this, new Boolean(z)});
            return;
        }
        this.mIsAnimatorEnable = z;
        if (getHost() != null && (animatorAdapter = this.mAnimatorAdapter) != null) {
            animatorAdapter.setAnimatorEnable(z);
        }
    }

    public void setCustomAnimatorFactory(CustomAnimatorFactory customAnimatorFactory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9d80b967", new Object[]{this, customAnimatorFactory});
        } else {
            this.mCustomAnimatorFactory = customAnimatorFactory;
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

    @Override // com.taobao.uikit.feature.callback.RecyclerAdapterCallback
    public RecyclerView.Adapter wrapAdapter(RecyclerView.Adapter adapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView.Adapter) ipChange.ipc$dispatch("723dadc", new Object[]{this, adapter});
        }
        if (adapter == null || (adapter instanceof AnimatorAdapter)) {
            return adapter;
        }
        RecyclerCellAnimatorController recyclerCellAnimatorController = new RecyclerCellAnimatorController(getHost());
        recyclerCellAnimatorController.setInitialDelayMillis(this.mInitialDelayMillis);
        recyclerCellAnimatorController.setAnimationDelayMillis(this.mAnimatorDelayMillis);
        recyclerCellAnimatorController.setAnimationDurationMillis(this.mAnimatorDurationMillis);
        AnimatorAdapter animatorAdapter = new AnimatorAdapter(adapter);
        this.mAnimatorAdapter = animatorAdapter;
        animatorAdapter.setRecyclerCellAnimatorController(recyclerCellAnimatorController);
        this.mAnimatorAdapter.setAnimatorEnable(this.mIsAnimatorEnable);
        return this.mAnimatorAdapter;
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class AnimatorAdapter extends RecyclerCellAnimatorAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(931135558);
        }

        public AnimatorAdapter(RecyclerView.Adapter adapter) {
            super(adapter);
        }

        public static /* synthetic */ Object ipc$super(AnimatorAdapter animatorAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/uikit/feature/features/RecyclerCellAnimatorFeature$AnimatorAdapter");
        }

        @Override // com.taobao.uikit.feature.features.cellanimator.RecyclerCellAnimatorAdapter
        public Animator[] getAnimators(ViewGroup viewGroup, View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Animator[]) ipChange.ipc$dispatch("dd2f3838", new Object[]{this, viewGroup, view});
            }
            if (RecyclerCellAnimatorFeature.access$000(RecyclerCellAnimatorFeature.this) == null) {
                return new Animator[]{ObjectAnimator.ofFloat(view, "translationY", 400.0f, 0.0f), ObjectAnimator.ofFloat(view, "rotationX", 15.0f, 0.0f)};
            }
            return RecyclerCellAnimatorFeature.access$000(RecyclerCellAnimatorFeature.this).generateAnimators(viewGroup, view);
        }
    }
}
