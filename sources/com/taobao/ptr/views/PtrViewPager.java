package com.taobao.ptr.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.ptr.PullBase;
import tb.t2o;
import tb.v4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PtrViewPager extends ViewPager implements v4n {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(632291365);
        t2o.a(632291347);
    }

    public PtrViewPager(Context context) {
        super(context);
    }

    public static /* synthetic */ Object ipc$super(PtrViewPager ptrViewPager, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/ptr/views/PtrViewPager");
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
        if (adapter == null || getCurrentItem() != adapter.getCount() - 1) {
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
        if (getAdapter() == null || getCurrentItem() != 0) {
            return false;
        }
        return true;
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

    public PtrViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
