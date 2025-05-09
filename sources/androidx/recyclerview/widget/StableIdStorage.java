package androidx.recyclerview.widget;

import androidx.collection.LongSparseArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
interface StableIdStorage {

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class IsolatedStableIdStorage implements StableIdStorage {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public long mNextStableId = 0;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class WrapperStableIdLookup implements StableIdLookup {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            private final LongSparseArray<Long> mLocalToGlobalLookup = new LongSparseArray<>();

            public WrapperStableIdLookup() {
            }

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fc09228", new Object[]{this, new Long(j)})).longValue();
                }
                Long l = this.mLocalToGlobalLookup.get(j);
                if (l == null) {
                    l = Long.valueOf(IsolatedStableIdStorage.this.obtainId());
                    this.mLocalToGlobalLookup.put(j, l);
                }
                return l.longValue();
            }
        }

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StableIdLookup) ipChange.ipc$dispatch("a47e046f", new Object[]{this});
            }
            return new WrapperStableIdLookup();
        }

        public long obtainId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d39c91b", new Object[]{this})).longValue();
            }
            long j = this.mNextStableId;
            this.mNextStableId = 1 + j;
            return j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class NoStableIdStorage implements StableIdStorage {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StableIdLookup mNoIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.NoStableIdStorage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fc09228", new Object[]{this, new Long(j)})).longValue();
                }
                return -1L;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StableIdLookup) ipChange.ipc$dispatch("a47e046f", new Object[]{this});
            }
            return this.mNoIdLookup;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class SharedPoolStableIdStorage implements StableIdStorage {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final StableIdLookup mSameIdLookup = new StableIdLookup() { // from class: androidx.recyclerview.widget.StableIdStorage.SharedPoolStableIdStorage.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.recyclerview.widget.StableIdStorage.StableIdLookup
            public long localToGlobal(long j) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Number) ipChange.ipc$dispatch("3fc09228", new Object[]{this, new Long(j)})).longValue();
                }
                return j;
            }
        };

        @Override // androidx.recyclerview.widget.StableIdStorage
        public StableIdLookup createStableIdLookup() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (StableIdLookup) ipChange.ipc$dispatch("a47e046f", new Object[]{this});
            }
            return this.mSameIdLookup;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface StableIdLookup {
        long localToGlobal(long j);
    }

    StableIdLookup createStableIdLookup();
}
