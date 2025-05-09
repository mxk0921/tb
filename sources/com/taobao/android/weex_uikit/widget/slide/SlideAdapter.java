package com.taobao.android.weex_uikit.widget.slide;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSView;
import java.util.ArrayList;
import java.util.List;
import tb.dwh;
import tb.mxh;
import tb.t2o;
import tb.vvh;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideAdapter extends PagerAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f10024a;
    public final MUSDKInstance c;
    public boolean d;
    public boolean e;
    public final List<ywh> b = new ArrayList(0);
    public int f = -1;

    static {
        t2o.a(986710241);
    }

    public SlideAdapter(MUSDKInstance mUSDKInstance) {
        this.c = mUSDKInstance;
    }

    public static /* synthetic */ Object ipc$super(SlideAdapter slideAdapter, String str, Object... objArr) {
        if (str.hashCode() == -2093417530) {
            super.setPrimaryItem((ViewGroup) objArr[0], ((Number) objArr[1]).intValue(), objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideAdapter");
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        MUSView mUSView = (MUSView) obj;
        if (mUSView != null) {
            mUSView.setTag(null);
            viewGroup.removeView(mUSView);
            mxh.b(mUSView);
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
        }
        if (this.d) {
            return ((ArrayList) this.b).size() + 2;
        }
        return ((ArrayList) this.b).size();
    }

    public int getRealCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("3e642a55", new Object[]{this})).intValue();
        }
        return ((ArrayList) this.b).size();
    }

    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        if (!this.d) {
            return i;
        }
        if (i == 0) {
            return getRealCount() - 1;
        }
        if (i == getCount() - 1) {
            return 0;
        }
        return i - 1;
    }

    public boolean h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af74c915", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (this.f10024a != 0) {
            return false;
        }
        if (!this.d && i >= getCount() - 1) {
            return false;
        }
        return true;
    }

    public final ywh i(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ywh) ipChange.ipc$dispatch("ecce2188", new Object[]{this, new Integer(i)});
        }
        return (ywh) ((ArrayList) this.b).get(getRealPosition(i));
    }

    @Override // androidx.viewpager.widget.PagerAdapter
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

    public void j(List<ywh> list, boolean z) {
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc585261", new Object[]{this, list, new Boolean(z)});
            return;
        }
        this.f10024a = 0;
        ((ArrayList) this.b).clear();
        if (list != null) {
            ((ArrayList) this.b).addAll(list);
            if (!z || list.size() <= 2) {
                z2 = false;
            }
            this.d = z2;
        } else {
            this.d = false;
        }
        notifyDataSetChanged();
    }

    public void k(ViewPager viewPager, int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b5af259", new Object[]{this, viewPager, new Integer(i), new Boolean(z)});
        } else if (this.f10024a == 0) {
            if (i < 0 || i >= getRealCount()) {
                dwh.a("[Slide]: scrollTo position is beyond bounds");
            } else if (!this.d) {
                viewPager.setCurrentItem(i, z);
            } else if (i != getRealPosition(viewPager.getCurrentItem())) {
                viewPager.setCurrentItem(i + 1, z);
            }
        }
    }

    public void l(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36dfbf14", new Object[]{this, viewPager, new Integer(i)});
        } else if (i < 0 || i >= getRealCount()) {
            dwh.a("[Slide]: index is beyond bounds");
        } else if (this.d) {
            viewPager.setCurrentItem(i + 1, false);
        } else {
            viewPager.setCurrentItem(i, false);
        }
    }

    public void m(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10b3de44", new Object[]{this, new Boolean(z)});
        } else {
            this.e = z;
        }
    }

    public void n(ViewPager viewPager, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9da7207", new Object[]{this, viewPager, new Integer(i)});
        } else if (this.f != i) {
            this.f = i;
            if (viewPager.getChildCount() != 0 && this.e && viewPager.beginFakeDrag()) {
                viewPager.fakeDragBy(0.0f);
                viewPager.endFakeDrag();
            }
        }
    }

    public void o(ViewPager viewPager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c68a3eb", new Object[]{this, viewPager});
        } else if (this.d) {
            int currentItem = viewPager.getCurrentItem();
            if (currentItem == 0) {
                viewPager.setCurrentItem(getCount() - 2, false);
            } else if (currentItem == getCount() - 1) {
                viewPager.setCurrentItem(1, false);
            }
        }
    }

    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
        } else {
            this.f10024a = i;
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public void setPrimaryItem(ViewGroup viewGroup, int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8338fbc6", new Object[]{this, viewGroup, new Integer(i), obj});
            return;
        }
        super.setPrimaryItem(viewGroup, i, obj);
        n((ViewPager) viewGroup, i);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
        }
        MUSView a2 = mxh.a(this.c);
        if (vvh.m()) {
            a2.setTag("slide-child-" + i);
        }
        a2.setRoot(false);
        ywh i2 = i(i);
        if (i2.n() != null) {
            i2.n().release(true);
        }
        a2.setUiNodeTree(i2);
        Object tag = this.c.getTag("enableSlidePreciseExpose");
        if (tag == null || !TextUtils.equals(tag.toString(), "true")) {
            a2.setScrollObserverEnabled(false);
        }
        viewGroup.addView(a2);
        return a2;
    }
}
