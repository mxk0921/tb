package com.taobao.android.weex_uikit.widget.slide;

import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import java.util.ArrayList;
import tb.dwh;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideAdapterRTL extends SlideAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(986710242);
    }

    public SlideAdapterRTL(MUSDKInstance mUSDKInstance) {
        super(mUSDKInstance);
    }

    public static /* synthetic */ Object ipc$super(SlideAdapterRTL slideAdapterRTL, String str, Object... objArr) {
        if (str.hashCode() == -9394670) {
            return new Integer(super.getRealPosition(((Number) objArr[0]).intValue()));
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideAdapterRTL");
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        return (((ArrayList) this.b).size() - 1) - super.getRealPosition(i);
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af74c915", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f10024a != 0) {
            return false;
        }
        if (!this.d && i <= 0) {
            return false;
        }
        return true;
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public void k(ViewPager viewPager, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5af259", new Object[]{this, viewPager, new Integer(i), new Boolean(z)});
        } else if (this.f10024a == 0) {
            if (i < 0 || i >= getRealCount()) {
                dwh.a("[Slide]: scrollTo position is beyond bounds");
            } else if (!this.d) {
                viewPager.setCurrentItem(getCount() - i, z);
            } else if (i != getRealPosition(viewPager.getCurrentItem())) {
                viewPager.setCurrentItem(i - 1, z);
            }
        }
    }

    @Override // com.taobao.android.weex_uikit.widget.slide.SlideAdapter
    public void l(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfbf14", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= getRealCount()) {
            dwh.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem((getCount() - i) - 2, false);
        } else {
            viewPager.setCurrentItem((getCount() - i) - 1, false);
        }
    }
}
