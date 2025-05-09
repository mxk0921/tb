package androidx.fragment.app;

import androidx.lifecycle.ViewModelStore;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Collection;
import java.util.Map;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class FragmentManagerNonConfig {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private final Map<String, FragmentManagerNonConfig> mChildNonConfigs;
    private final Collection<Fragment> mFragments;
    private final Map<String, ViewModelStore> mViewModelStores;

    public FragmentManagerNonConfig(Collection<Fragment> collection, Map<String, FragmentManagerNonConfig> map, Map<String, ViewModelStore> map2) {
        this.mFragments = collection;
        this.mChildNonConfigs = map;
        this.mViewModelStores = map2;
    }

    public Map<String, FragmentManagerNonConfig> getChildNonConfigs() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1dfb29e6", new Object[]{this});
        }
        return this.mChildNonConfigs;
    }

    public Collection<Fragment> getFragments() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Collection) ipChange.ipc$dispatch("54ac4dd3", new Object[]{this});
        }
        return this.mFragments;
    }

    public Map<String, ViewModelStore> getViewModelStores() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3426349c", new Object[]{this});
        }
        return this.mViewModelStores;
    }

    public boolean isRetaining(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e14846b6", new Object[]{this, fragment})).booleanValue();
        }
        Collection<Fragment> collection = this.mFragments;
        if (collection == null) {
            return false;
        }
        return collection.contains(fragment);
    }
}
