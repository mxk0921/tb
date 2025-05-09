package com.taobao.mytaobao.biztool;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.taobao.search.sf.util.tlog.TLogTracker;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/taobao/mytaobao/biztool/WrapContentRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "dstVHHeight", "Ltb/xhv;", "refreshHeight", "(I)V", "lastHeight", TLogTracker.LEVEL_INFO, "Landroid/animation/ValueAnimator;", "mAnim", "Landroid/animation/ValueAnimator;", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class WrapContentRecyclerView extends RecyclerView {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private HashMap _$_findViewCache;
    private int lastHeight;
    private ValueAnimator mAnim;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", AdvanceSetting.NETWORK_TYPE, "Ltb/xhv;", "onAnimationUpdate", "(Landroid/animation/ValueAnimator;)V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements ValueAnimator.AnimatorUpdateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ ViewGroup.LayoutParams b;

        public a(ViewGroup.LayoutParams layoutParams) {
            this.b = layoutParams;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ffc03bf", new Object[]{this, valueAnimator});
                return;
            }
            ckf.c(valueAnimator, AdvanceSetting.NETWORK_TYPE);
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup.LayoutParams layoutParams = this.b;
                layoutParams.height = intValue;
                WrapContentRecyclerView.this.setLayoutParams(layoutParams);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.Int");
        }
    }

    static {
        t2o.a(745537674);
    }

    public WrapContentRecyclerView(Context context) {
        this(context, null, 0, 6, null);
    }

    public static /* synthetic */ Object ipc$super(WrapContentRecyclerView wrapContentRecyclerView, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mytaobao/biztool/WrapContentRecyclerView");
    }

    public void _$_clearFindViewByIdCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677c9886", new Object[]{this});
            return;
        }
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("399f7ed2", new Object[]{this, new Integer(i)});
        }
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void refreshHeight(int i) {
        int i2;
        ValueAnimator valueAnimator;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c462dcba", new Object[]{this, new Integer(i)});
            return;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (itemCount % 3 == 0) {
                i2 = itemCount / 3;
            } else {
                i2 = (itemCount / 3) + 1;
            }
            int i3 = i2 * i;
            if (this.lastHeight != i3) {
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (this.lastHeight > 0) {
                    ValueAnimator valueAnimator2 = this.mAnim;
                    if (!(valueAnimator2 == null || !valueAnimator2.isRunning() || (valueAnimator = this.mAnim) == null)) {
                        valueAnimator.end();
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(this.lastHeight, i3);
                    ofInt.addUpdateListener(new a(layoutParams));
                    ofInt.setDuration(300L);
                    ofInt.start();
                    this.mAnim = ofInt;
                    this.lastHeight = i3;
                    return;
                }
                layoutParams.height = i3;
                setLayoutParams(layoutParams);
                this.lastHeight = i3;
            }
        }
    }

    public WrapContentRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrapContentRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ckf.h(context, "context");
    }

    public /* synthetic */ WrapContentRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, a07 a07Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
