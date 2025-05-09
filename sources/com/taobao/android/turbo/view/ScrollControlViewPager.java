package com.taobao.android.turbo.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.ali.user.mobile.app.constant.UTConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.tpu;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/taobao/android/turbo/view/ScrollControlViewPager;", "Landroidx/viewpager/widget/ViewPager;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "direction", "canScrollHorizontally", "(I)Z", "enableScroll", "Z", "getEnableScroll", "()Z", "setEnableScroll", "(Z)V", "", "initialX", UTConstant.Args.UT_SUCCESS_F, "Companion", "a", "turboflow_biz_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ScrollControlViewPager extends ViewPager {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    private static final String TAG = "ScrollControlViewPager";
    private boolean enableScroll = true;
    private float initialX;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static final class a {
        static {
            t2o.a(916455784);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(916455783);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollControlViewPager(Context context) {
        super(context);
        ckf.g(context, "context");
    }

    public static /* synthetic */ Object ipc$super(ScrollControlViewPager scrollControlViewPager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -614473710) {
            return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
        }
        if (hashCode == -407533570) {
            return new Boolean(super.onInterceptTouchEvent((MotionEvent) objArr[0]));
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/turbo/view/ScrollControlViewPager");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (!this.enableScroll || !super.canScrollHorizontally(i)) {
            return false;
        }
        return true;
    }

    public final boolean getEnableScroll() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9dbdde31", new Object[]{this})).booleanValue();
        }
        return this.enableScroll;
    }

    public final void setEnableScroll(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f594a6bb", new Object[]{this, new Boolean(z)});
        } else {
            this.enableScroll = z;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollControlViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ckf.g(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        if (!this.enableScroll) {
            return false;
        }
        PagerAdapter adapter = getAdapter();
        int count = adapter != null ? adapter.getCount() : 0;
        if (count <= 0) {
            return false;
        }
        Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.initialX = motionEvent.getX();
        } else if (valueOf != null && valueOf.intValue() == 2) {
            float x = motionEvent.getX() - this.initialX;
            float f = 0;
            if (x > f && getCurrentItem() == 0) {
                return false;
            }
            if (x < f && getCurrentItem() == count - 1) {
                return false;
            }
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            tpu.Companion.a(TAG, "判断是否拦截触摸事件，调用父类方法异常", e);
            return false;
        }
    }
}
