package androidx.viewpager2.widget;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class CompositePageTransformer implements ViewPager2.PageTransformer {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final List<ViewPager2.PageTransformer> mTransformers = new ArrayList();

    public void addTransformer(ViewPager2.PageTransformer pageTransformer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4cda9a32", new Object[]{this, pageTransformer});
        } else {
            this.mTransformers.add(pageTransformer);
        }
    }

    public void removeTransformer(ViewPager2.PageTransformer pageTransformer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5010cbd5", new Object[]{this, pageTransformer});
        } else {
            this.mTransformers.remove(pageTransformer);
        }
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b6a8f50", new Object[]{this, view, new Float(f)});
            return;
        }
        for (ViewPager2.PageTransformer pageTransformer : this.mTransformers) {
            pageTransformer.transformPage(view, f);
        }
    }
}
