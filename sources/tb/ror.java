package tb;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.taobao.tao.navigation.TBFragmentTabHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public interface ror extends dvd {
    <T extends View> T findViewById(int i);

    Context getContext();

    Fragment getCurrentFragment();

    TBFragmentTabHost getFragmentTabHost();

    String getName();

    String getSimpleName();

    boolean isLowMemory();

    void restoreTabHost();
}
