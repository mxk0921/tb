package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ViewModelStores {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    private ViewModelStores() {
    }

    @Deprecated
    public static ViewModelStore of(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelStore) ipChange.ipc$dispatch("e7c619b0", new Object[]{fragmentActivity}) : fragmentActivity.getViewModelStore();
    }

    @Deprecated
    public static ViewModelStore of(Fragment fragment) {
        IpChange ipChange = $ipChange;
        return ipChange instanceof IpChange ? (ViewModelStore) ipChange.ipc$dispatch("7b7ebd7f", new Object[]{fragment}) : fragment.getViewModelStore();
    }
}
