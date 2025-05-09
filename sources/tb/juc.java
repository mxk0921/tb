package tb;

import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.taobao.android.searchbaseframe.meta.uikit.MetaLayout;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public interface juc extends p9e<FrameLayout, iuc> {
    void a(ViewPager.OnPageChangeListener onPageChangeListener);

    void commit();

    ViewPager getViewPager();

    void h(ytc ytcVar);

    void i(View view);

    MetaLayout j();

    void k(PagerAdapter pagerAdapter);

    void m(bsi bsiVar);

    void q(buc bucVar);
}
