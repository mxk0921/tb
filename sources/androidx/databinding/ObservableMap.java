package androidx.databinding;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ObservableMap<K, V> extends Map<K, V> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class OnMapChangedCallback<T extends ObservableMap<K, V>, K, V> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onMapChanged(T t, K k);
    }

    void addOnMapChangedCallback(OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback);

    void removeOnMapChangedCallback(OnMapChangedCallback<? extends ObservableMap<K, V>, K, V> onMapChangedCallback);
}
