package androidx.databinding;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public interface ObservableList<T> extends List<T> {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class OnListChangedCallback<T extends ObservableList> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onChanged(T t);

        public abstract void onItemRangeChanged(T t, int i, int i2);

        public abstract void onItemRangeInserted(T t, int i, int i2);

        public abstract void onItemRangeMoved(T t, int i, int i2, int i3);

        public abstract void onItemRangeRemoved(T t, int i, int i2);
    }

    void addOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);

    void removeOnListChangedCallback(OnListChangedCallback<? extends ObservableList<T>> onListChangedCallback);
}
