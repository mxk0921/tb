package androidx.viewpager2.widget;

import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.view.View;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class WindowInsetsApplier implements OnApplyWindowInsetsListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private WindowInsetsApplier() {
    }

    private WindowInsetsCompat consumeAllInsets(WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("fbfdaf00", new Object[]{this, windowInsetsCompat});
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.CONSUMED;
        if (windowInsetsCompat2.toWindowInsets() != null) {
            return windowInsetsCompat2;
        }
        return windowInsetsCompat.consumeSystemWindowInsets().consumeStableInsets();
    }

    public static boolean install(ViewPager2 viewPager2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ceb6e79", new Object[]{viewPager2})).booleanValue();
        }
        ApplicationInfo applicationInfo = viewPager2.getContext().getApplicationInfo();
        if (Build.VERSION.SDK_INT >= 30 && applicationInfo.targetSdkVersion >= 30) {
            return false;
        }
        ViewCompat.setOnApplyWindowInsetsListener(viewPager2, new WindowInsetsApplier());
        return true;
    }

    @Override // androidx.core.view.OnApplyWindowInsetsListener
    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowInsetsCompat) ipChange.ipc$dispatch("eb890e0c", new Object[]{this, view, windowInsetsCompat});
        }
        ViewPager2 viewPager2 = (ViewPager2) view;
        WindowInsetsCompat onApplyWindowInsets = ViewCompat.onApplyWindowInsets(viewPager2, windowInsetsCompat);
        if (onApplyWindowInsets.isConsumed()) {
            return onApplyWindowInsets;
        }
        RecyclerView recyclerView = viewPager2.mRecyclerView;
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            ViewCompat.dispatchApplyWindowInsets(recyclerView.getChildAt(i), new WindowInsetsCompat(onApplyWindowInsets));
        }
        return consumeAllInsets(onApplyWindowInsets);
    }
}
