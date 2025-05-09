package androidx.recyclerview.widget;

import android.util.SparseArray;
import android.util.SparseIntArray;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
interface ViewTypeStorage {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class IsolatedViewTypeStorage implements ViewTypeStorage {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SparseArray<NestedAdapterWrapper> mGlobalTypeToWrapper = new SparseArray<>();
        public int mNextViewType = 0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class WrapperViewTypeLookup implements ViewTypeLookup {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final NestedAdapterWrapper mWrapper;
            private SparseIntArray mLocalToGlobalMapping = new SparseIntArray(1);
            private SparseIntArray mGlobalToLocalMapping = new SparseIntArray(1);

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("226c8326", new Object[]{this});
                } else {
                    IsolatedViewTypeStorage.this.removeWrapper(this.mWrapper);
                }
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5e0ed2e2", new Object[]{this, new Integer(i)})).intValue();
                }
                int indexOfKey = this.mGlobalToLocalMapping.indexOfKey(i);
                if (indexOfKey >= 0) {
                    return this.mGlobalToLocalMapping.valueAt(indexOfKey);
                }
                throw new IllegalStateException("requested global type " + i + " does not belong to the adapter:" + this.mWrapper.adapter);
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fc08e66", new Object[]{this, new Integer(i)})).intValue();
                }
                int indexOfKey = this.mLocalToGlobalMapping.indexOfKey(i);
                if (indexOfKey > -1) {
                    return this.mLocalToGlobalMapping.valueAt(indexOfKey);
                }
                int obtainViewType = IsolatedViewTypeStorage.this.obtainViewType(this.mWrapper);
                this.mLocalToGlobalMapping.put(i, obtainViewType);
                this.mGlobalToLocalMapping.put(obtainViewType, i);
                return obtainViewType;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewTypeLookup) ipChange.ipc$dispatch("2b25a44b", new Object[]{this, nestedAdapterWrapper});
            }
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NestedAdapterWrapper) ipChange.ipc$dispatch("780b0de3", new Object[]{this, new Integer(i)});
            }
            NestedAdapterWrapper nestedAdapterWrapper = this.mGlobalTypeToWrapper.get(i);
            if (nestedAdapterWrapper != null) {
                return nestedAdapterWrapper;
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        public int obtainViewType(NestedAdapterWrapper nestedAdapterWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("57366ec8", new Object[]{this, nestedAdapterWrapper})).intValue();
            }
            int i = this.mNextViewType;
            this.mNextViewType = 1 + i;
            this.mGlobalTypeToWrapper.put(i, nestedAdapterWrapper);
            return i;
        }

        public void removeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79bf064a", new Object[]{this, nestedAdapterWrapper});
                return;
            }
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                if (this.mGlobalTypeToWrapper.valueAt(size) == nestedAdapterWrapper) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SharedIdRangeViewTypeStorage implements ViewTypeStorage {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public SparseArray<List<NestedAdapterWrapper>> mGlobalTypeToWrapper = new SparseArray<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class WrapperViewTypeLookup implements ViewTypeLookup {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final NestedAdapterWrapper mWrapper;

            public WrapperViewTypeLookup(NestedAdapterWrapper nestedAdapterWrapper) {
                this.mWrapper = nestedAdapterWrapper;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public void dispose() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("226c8326", new Object[]{this});
                } else {
                    SharedIdRangeViewTypeStorage.this.removeWrapper(this.mWrapper);
                }
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int globalToLocal(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("5e0ed2e2", new Object[]{this, new Integer(i)})).intValue();
                }
                return i;
            }

            @Override // androidx.recyclerview.widget.ViewTypeStorage.ViewTypeLookup
            public int localToGlobal(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fc08e66", new Object[]{this, new Integer(i)})).intValue();
                }
                List<NestedAdapterWrapper> list = SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.get(i);
                if (list == null) {
                    list = new ArrayList<>();
                    SharedIdRangeViewTypeStorage.this.mGlobalTypeToWrapper.put(i, list);
                }
                if (!list.contains(this.mWrapper)) {
                    list.add(this.mWrapper);
                }
                return i;
            }
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ViewTypeLookup) ipChange.ipc$dispatch("2b25a44b", new Object[]{this, nestedAdapterWrapper});
            }
            return new WrapperViewTypeLookup(nestedAdapterWrapper);
        }

        @Override // androidx.recyclerview.widget.ViewTypeStorage
        public NestedAdapterWrapper getWrapperForGlobalType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (NestedAdapterWrapper) ipChange.ipc$dispatch("780b0de3", new Object[]{this, new Integer(i)});
            }
            List<NestedAdapterWrapper> list = this.mGlobalTypeToWrapper.get(i);
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            throw new IllegalArgumentException("Cannot find the wrapper for global view type " + i);
        }

        public void removeWrapper(NestedAdapterWrapper nestedAdapterWrapper) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79bf064a", new Object[]{this, nestedAdapterWrapper});
                return;
            }
            for (int size = this.mGlobalTypeToWrapper.size() - 1; size >= 0; size--) {
                List<NestedAdapterWrapper> valueAt = this.mGlobalTypeToWrapper.valueAt(size);
                if (valueAt.remove(nestedAdapterWrapper) && valueAt.isEmpty()) {
                    this.mGlobalTypeToWrapper.removeAt(size);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface ViewTypeLookup {
        void dispose();

        int globalToLocal(int i);

        int localToGlobal(int i);
    }

    ViewTypeLookup createViewTypeWrapper(NestedAdapterWrapper nestedAdapterWrapper);

    NestedAdapterWrapper getWrapperForGlobalType(int i);
}
