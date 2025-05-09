package com.taobao.android.weex_uikit.widget.slide;

import android.view.View;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.ArrayList;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideNewAdapter extends SlideAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final int g = 500;

    static {
        t2o.a(986710246);
    }

    public SlideNewAdapter(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(SlideNewAdapter slideNewAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideNewAdapter");
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter, androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.d) {
            return ((ArrayList) this.b).size() * g;
        }
        return ((ArrayList) this.b).size();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.d) {
            return i;
        }
        return i % getRealCount();
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter, androidx.viewpager.widget.PagerAdapter
    public boolean isViewFromObject(View view, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
        }
        if (view == obj) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public void l(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfbf14", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= getRealCount()) {
            dwh.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem(q() + i, false);
        } else {
            viewPager.setCurrentItem(i, false);
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public void o(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c68a3eb", new Object[]{this, viewPager});
        } else if (this.d) {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem == 0) {
                viewPager.setCurrentItem(q(), false);
            } else if (currentItem == getCount() - 1) {
                viewPager.setCurrentItem((q() + ((ArrayList) this.b).size()) - 1, false);
            }
        }
    }

    public final int q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a944eb00", new Object[]{this})).intValue();
        }
        if (getRealCount() == 0) {
            return 0;
        }
        int realCount = (g * getRealCount()) / 2;
        if (realCount % getRealCount() == 0) {
            return realCount;
        }
        while (realCount % getRealCount() != 0) {
            realCount++;
        }
        return realCount;
    }
}
