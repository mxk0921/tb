package com.taobao.android.fluid.business.containerframe.frames;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.layoutmanager.container.SlidingLayout;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AlbumDetailViewGroup extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private Runnable mPullRightCallback;
    private SlidingLayout.b mPullRightHelper;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a extends SlidingLayout.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(View view) {
            super(view);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/business/containerframe/frames/AlbumDetailViewGroup$1");
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2372e0ed", new Object[]{this});
            }
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("badeed9", new Object[]{this});
            } else if (AlbumDetailViewGroup.access$000(AlbumDetailViewGroup.this) != null) {
                AlbumDetailViewGroup.access$000(AlbumDetailViewGroup.this).run();
            }
        }

        @Override // com.taobao.android.layoutmanager.container.SlidingLayout.b
        public void h(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3b042fc9", new Object[]{this, new Float(f)});
            }
        }
    }

    static {
        t2o.a(468713486);
    }

    public AlbumDetailViewGroup(Context context) {
        this(context, null);
    }

    public static /* synthetic */ Runnable access$000(AlbumDetailViewGroup albumDetailViewGroup) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("8f8db065", new Object[]{albumDetailViewGroup});
        }
        return albumDetailViewGroup.mPullRightCallback;
    }

    private void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
        } else {
            this.mPullRightHelper = new a(this);
        }
    }

    public static /* synthetic */ Object ipc$super(AlbumDetailViewGroup albumDetailViewGroup, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -614473710) {
            return new Boolean(super.canScrollHorizontally(((Number) objArr[0]).intValue()));
        }
        if (hashCode == 949399698) {
            super.onDetachedFromWindow();
            return null;
        }
        int hashCode2 = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/android/fluid/business/containerframe/frames/AlbumDetailViewGroup");
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db5fe012", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 0 || !isShown()) {
            return super.canScrollHorizontally(i);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3896b092", new Object[]{this});
            return;
        }
        super.onDetachedFromWindow();
        this.mPullRightHelper.l();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e7b587fe", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.mPullRightHelper.g(motionEvent);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a9b14c3a", new Object[]{this, motionEvent})).booleanValue();
        }
        return this.mPullRightHelper.j(motionEvent);
    }

    public void setPullRightCallback(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4409af7f", new Object[]{this, runnable});
        } else {
            this.mPullRightCallback = runnable;
        }
    }

    public AlbumDetailViewGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AlbumDetailViewGroup(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        initView();
    }
}
