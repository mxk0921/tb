package com.taobao.android.detail.ttdetail.widget;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import tb.t2o;
import tb.v4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PendingPopulateViewPager extends TTViewPager implements v4n {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MODE_SCROLL_PAGER = 0;
    public static final int MODE_SCROLL_VIEW = 1;
    private volatile boolean mPendingPopulate;
    private volatile int mPendingPosition = -1;
    public int mMode = 0;

    static {
        t2o.a(912262910);
        t2o.a(632291347);
    }

    public PendingPopulateViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PendingPopulateViewPager pendingPopulateViewPager, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1695733278:
                super.setCurrentItem(((Number) objArr[0]).intValue(), ((Boolean) objArr[1]).booleanValue());
                return null;
            case -1328502672:
                return new Integer(super.getCurrentItem());
            case 222392114:
                super.setCurrentItem(((Number) objArr[0]).intValue());
                return null;
            case 1626033557:
                super.onAttachedToWindow();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail/ttdetail/widget/PendingPopulateViewPager");
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager
    public int getCurrentItem() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b0d0a870", new Object[]{this})).intValue();
        }
        if (getWindowToken() == null && this.mPendingPopulate && this.mPendingPosition == -1) {
            return this.mPendingPosition;
        }
        return super.getCurrentItem();
    }

    public int getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("56d77213", new Object[]{this})).intValue();
        }
        return this.mMode;
    }

    @Override // tb.v4n
    public int getPullDirection() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f748d57e", new Object[]{this})).intValue();
        }
        return 1;
    }

    @Override // tb.v4n
    public boolean isReadyForPullEnd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f76f3051", new Object[]{this})).booleanValue();
        }
        PagerAdapter adapter = getAdapter();
        if (adapter == null || getCurrentItem() != adapter.getCount() - 1 || canScrollHorizontally(1)) {
            return false;
        }
        return true;
    }

    @Override // tb.v4n
    public boolean isReadyForPullStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cf0e198", new Object[]{this})).booleanValue();
        }
        if (getAdapter() == null || getCurrentItem() != 0 || canScrollHorizontally(-1)) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60eb4d95", new Object[]{this});
            return;
        }
        super.onAttachedToWindow();
        if (this.mPendingPopulate && this.mPendingPosition != -1) {
            this.mPendingPopulate = false;
            super.setCurrentItem(this.mPendingPosition, false);
            this.mPendingPosition = -1;
        }
    }

    @Override // tb.v4n
    public void onPullAdapterAdded(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c04e19b", new Object[]{this, pullBase});
        }
    }

    @Override // tb.v4n
    public void onPullAdapterRemoved(PullBase pullBase) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea67bf7b", new Object[]{this, pullBase});
        }
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager
    public void setCurrentItem(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d416f32", new Object[]{this, new Integer(i)});
        } else if (getWindowToken() == null) {
            this.mPendingPopulate = true;
            this.mPendingPosition = i;
        } else {
            super.setCurrentItem(i);
        }
    }

    public void setMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e06b0557", new Object[]{this, new Integer(i)});
        } else if (this.mMode != i) {
            this.mMode = 0;
            if (i == 0 || i == 1) {
                this.mMode = i;
            }
        }
    }

    public PendingPopulateViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.taobao.android.detail.ttdetail.widget.TTViewPager
    public void setCurrentItem(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9aed29e2", new Object[]{this, new Integer(i), new Boolean(z)});
        } else if (getWindowToken() == null) {
            this.mPendingPopulate = true;
            this.mPendingPosition = i;
        } else {
            super.setCurrentItem(i, z);
        }
    }
}
