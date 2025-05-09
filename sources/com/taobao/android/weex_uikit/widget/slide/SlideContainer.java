package com.taobao.android.weex_uikit.widget.slide;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_uikit.ui.MUSNodeHost;
import com.taobao.android.weex_uikit.widget.slide.effect.ScaleEffect;
import java.util.List;
import tb.t2o;
import tb.ywh;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class SlideContainer extends FrameLayout {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final SlideViewPager viewPager;

    static {
        t2o.a(986710243);
    }

    public SlideContainer(Context context) {
        super(context);
        SlideViewPager slideViewPager = new SlideViewPager(context);
        this.viewPager = slideViewPager;
        addView(slideViewPager, new FrameLayout.LayoutParams(-1, -1));
    }

    public static /* synthetic */ Object ipc$super(SlideContainer slideContainer, String str, Object... objArr) {
        if (str.hashCode() == 1621401666) {
            super.invalidate();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/weex_uikit/widget/slide/SlideContainer");
    }

    public int getRealPosition(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ff70a612", new Object[]{this, new Integer(i)})).intValue();
        }
        return this.viewPager.getRealPosition(i);
    }

    @Override // android.view.View
    public void invalidate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60a4a042", new Object[]{this});
            return;
        }
        super.invalidate();
        if (getParent() instanceof MUSNodeHost) {
            ((MUSNodeHost) getParent()).invalidateChild(this);
        }
    }

    public boolean isTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81ad9998", new Object[]{this})).booleanValue();
        }
        return this.viewPager.isTouching();
    }

    public void mount(ViewPager.OnPageChangeListener onPageChangeListener, MUSDKInstance mUSDKInstance, List<ywh> list, boolean z, boolean z2, boolean z3, int i, int i2, int i3, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("818bb39d", new Object[]{this, onPageChangeListener, mUSDKInstance, list, new Boolean(z), new Boolean(z2), new Boolean(z3), new Integer(i), new Integer(i2), new Integer(i3), jSONObject});
            return;
        }
        updateEffect(jSONObject);
        this.viewPager.removeOnPageChangeListener(onPageChangeListener);
        this.viewPager.addOnPageChangeListener(onPageChangeListener);
        this.viewPager.mount(mUSDKInstance, list, z, z2, z3, i, i2, i3);
    }

    public void refresh(MUSDKInstance mUSDKInstance, List<ywh> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5e7525e", new Object[]{this, mUSDKInstance, list, new Integer(i)});
        } else {
            this.viewPager.refresh(mUSDKInstance, list, i);
        }
    }

    public void resetTouching() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("307b9a39", new Object[]{this});
        } else {
            this.viewPager.resetTouching();
        }
    }

    public void scrollTo(int i, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1f85320", new Object[]{this, new Integer(i), new Boolean(z)});
        } else {
            this.viewPager.scrollTo(i, z);
        }
    }

    public void setAutoPlay(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c396e48", new Object[]{this, new Boolean(z)});
        } else {
            this.viewPager.setAutoPlay(z);
        }
    }

    public void setIndex(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46180fcc", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.setIndex(i);
        }
    }

    public void setInfinite(List<ywh> list, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91604f86", new Object[]{this, list, new Boolean(z)});
        } else {
            this.viewPager.setInfinite(list, z);
        }
    }

    public void setInterval(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f94af075", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.setInterval(i);
        }
    }

    public void setScrollable(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f9c4d24", new Object[]{this, new Boolean(z)});
        } else {
            this.viewPager.setScrollable(z);
        }
    }

    public void unmount(ViewPager.OnPageChangeListener onPageChangeListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdda7b2a", new Object[]{this, onPageChangeListener});
            return;
        }
        this.viewPager.removeOnPageChangeListener(onPageChangeListener);
        this.viewPager.unmount();
        this.viewPager.setOffscreenPageLimit(1);
        this.viewPager.setClipChildren(true);
        this.viewPager.setPageTransformer(false, null);
        setClipChildren(true);
    }

    public void updateState(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3165b14", new Object[]{this, new Integer(i)});
        } else {
            this.viewPager.updateState(i);
        }
    }

    public void updateEffect(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4f2aebcf", new Object[]{this, jSONObject});
        } else if (jSONObject == null) {
            this.viewPager.setPageTransformer(false, null);
        } else {
            String string = jSONObject.getString("type");
            if (TextUtils.isEmpty(string)) {
                this.viewPager.setPageTransformer(false, null);
                return;
            }
            string.hashCode();
            if (string.equals("scale")) {
                this.viewPager.setPageTransformer(false, new ScaleEffect(jSONObject.getJSONObject("param")));
            }
        }
    }
}
