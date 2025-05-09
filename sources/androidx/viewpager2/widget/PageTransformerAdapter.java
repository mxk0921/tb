package androidx.viewpager2.widget;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Locale;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class PageTransformerAdapter extends ViewPager2.OnPageChangeCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final LinearLayoutManager mLayoutManager;
    private ViewPager2.PageTransformer mPageTransformer;

    public PageTransformerAdapter(LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    public static /* synthetic */ Object ipc$super(PageTransformerAdapter pageTransformerAdapter, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/viewpager2/widget/PageTransformerAdapter");
    }

    public ViewPager2.PageTransformer getPageTransformer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewPager2.PageTransformer) ipChange.ipc$dispatch("2c84211c", new Object[]{this});
        }
        return this.mPageTransformer;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i)});
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageScrolled(int i, float f, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i), new Float(f), new Integer(i2)});
        } else if (this.mPageTransformer != null) {
            float f2 = -f;
            for (int i3 = 0; i3 < this.mLayoutManager.getChildCount(); i3++) {
                View childAt = this.mLayoutManager.getChildAt(i3);
                if (childAt != null) {
                    this.mPageTransformer.transformPage(childAt, (this.mLayoutManager.getPosition(childAt) - i) + f2);
                } else {
                    Locale locale = Locale.US;
                    int childCount = this.mLayoutManager.getChildCount();
                    throw new IllegalStateException("LayoutManager returned a null child at pos " + i3 + "/" + childCount + " while transforming pages");
                }
            }
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
    public void onPageSelected(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i)});
        }
    }

    public void setPageTransformer(ViewPager2.PageTransformer pageTransformer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5075fa2", new Object[]{this, pageTransformer});
        } else {
            this.mPageTransformer = pageTransformer;
        }
    }
}
