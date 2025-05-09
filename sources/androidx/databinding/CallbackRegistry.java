package androidx.databinding;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class CallbackRegistry<C, T, A> implements Cloneable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "CallbackRegistry";
    private List<C> mCallbacks = new ArrayList();
    private long mFirst64Removed = 0;
    private int mNotificationLevel;
    private final NotifierCallback<C, T, A> mNotifier;
    private long[] mRemainderRemoved;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class NotifierCallback<C, T, A> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public abstract void onNotifyCallback(C c, T t, int i, A a2);
    }

    public CallbackRegistry(NotifierCallback<C, T, A> notifierCallback) {
        this.mNotifier = notifierCallback;
    }

    private boolean isRemoved(int i) {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8c6954a", new Object[]{this, new Integer(i)})).booleanValue();
        }
        if (i >= 64) {
            long[] jArr = this.mRemainderRemoved;
            if (jArr == null || (i2 = (i / 64) - 1) >= jArr.length || ((1 << (i % 64)) & jArr[i2]) == 0) {
                return false;
            }
            return true;
        } else if (((1 << i) & this.mFirst64Removed) != 0) {
            return true;
        } else {
            return false;
        }
    }

    private void notifyFirst64(T t, int i, A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("122b1257", new Object[]{this, t, new Integer(i), a2});
        } else {
            notifyCallbacks(t, i, a2, 0, Math.min(64, this.mCallbacks.size()), this.mFirst64Removed);
        }
    }

    private void notifyRemainder(T t, int i, A a2, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b1f71c3", new Object[]{this, t, new Integer(i), a2, new Integer(i2)});
        } else if (i2 < 0) {
            notifyFirst64(t, i, a2);
        } else {
            long j = this.mRemainderRemoved[i2];
            int i3 = (i2 + 1) * 64;
            int min = Math.min(this.mCallbacks.size(), i3 + 64);
            notifyRemainder(t, i, a2, i2 - 1);
            notifyCallbacks(t, i, a2, i3, min, j);
        }
    }

    private void removeRemovedCallbacks(int i, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26edf65a", new Object[]{this, new Integer(i), new Long(j)});
            return;
        }
        long j2 = Long.MIN_VALUE;
        for (int i2 = i + 63; i2 >= i; i2--) {
            if ((j & j2) != 0) {
                this.mCallbacks.remove(i2);
            }
            j2 >>>= 1;
        }
    }

    private void setRemovalBit(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20655db9", new Object[]{this, new Integer(i)});
        } else if (i < 64) {
            this.mFirst64Removed = (1 << i) | this.mFirst64Removed;
        } else {
            int i2 = (i / 64) - 1;
            long[] jArr = this.mRemainderRemoved;
            if (jArr == null) {
                this.mRemainderRemoved = new long[this.mCallbacks.size() / 64];
            } else if (jArr.length <= i2) {
                long[] jArr2 = new long[this.mCallbacks.size() / 64];
                long[] jArr3 = this.mRemainderRemoved;
                System.arraycopy(jArr3, 0, jArr2, 0, jArr3.length);
                this.mRemainderRemoved = jArr2;
            }
            long j = 1 << (i % 64);
            long[] jArr4 = this.mRemainderRemoved;
            jArr4[i2] = j | jArr4[i2];
        }
    }

    public synchronized void add(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba2da84", new Object[]{this, c});
        } else if (c != null) {
            int lastIndexOf = this.mCallbacks.lastIndexOf(c);
            if (lastIndexOf < 0 || isRemoved(lastIndexOf)) {
                this.mCallbacks.add(c);
            }
        } else {
            throw new IllegalArgumentException("callback cannot be null");
        }
    }

    public synchronized void clear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.clear();
        } else if (!this.mCallbacks.isEmpty()) {
            for (int size = this.mCallbacks.size() - 1; size >= 0; size--) {
                setRemovalBit(size);
            }
        }
    }

    public synchronized ArrayList<C> copyCallbacks() {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ArrayList) ipChange.ipc$dispatch("7f5e10ba", new Object[]{this});
            }
            ArrayList<C> arrayList = new ArrayList<>(this.mCallbacks.size());
            int size = this.mCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (!isRemoved(i)) {
                    arrayList.add(this.mCallbacks.get(i));
                }
            }
            return arrayList;
        }
    }

    public synchronized void notifyCallbacks(T t, int i, A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c96acb7", new Object[]{this, t, new Integer(i), a2});
            return;
        }
        this.mNotificationLevel++;
        notifyRecurse(t, i, a2);
        int i2 = this.mNotificationLevel - 1;
        this.mNotificationLevel = i2;
        if (i2 == 0) {
            long[] jArr = this.mRemainderRemoved;
            if (jArr != null) {
                for (int length = jArr.length - 1; length >= 0; length--) {
                    long j = this.mRemainderRemoved[length];
                    if (j != 0) {
                        removeRemovedCallbacks((length + 1) * 64, j);
                        this.mRemainderRemoved[length] = 0;
                    }
                }
            }
            long j2 = this.mFirst64Removed;
            if (j2 != 0) {
                removeRemovedCallbacks(0, j2);
                this.mFirst64Removed = 0L;
            }
        }
    }

    public synchronized void remove(C c) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec2dfe27", new Object[]{this, c});
            return;
        }
        if (this.mNotificationLevel == 0) {
            this.mCallbacks.remove(c);
        } else {
            int lastIndexOf = this.mCallbacks.lastIndexOf(c);
            if (lastIndexOf >= 0) {
                setRemovalBit(lastIndexOf);
            }
        }
    }

    public synchronized CallbackRegistry<C, T, A> clone() {
        CloneNotSupportedException e;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (CallbackRegistry) ipChange.ipc$dispatch("c5fb6779", new Object[]{this});
            }
            CallbackRegistry<C, T, A> callbackRegistry = null;
            try {
                callbackRegistry = (CallbackRegistry) super.clone();
                try {
                    callbackRegistry.mFirst64Removed = 0L;
                    callbackRegistry.mRemainderRemoved = null;
                    callbackRegistry.mNotificationLevel = 0;
                    callbackRegistry.mCallbacks = new ArrayList();
                    int size = this.mCallbacks.size();
                    for (int i = 0; i < size; i++) {
                        if (!isRemoved(i)) {
                            callbackRegistry.mCallbacks.add(this.mCallbacks.get(i));
                        }
                    }
                } catch (CloneNotSupportedException e2) {
                    e = e2;
                    callbackRegistry = callbackRegistry;
                    e.printStackTrace();
                    return callbackRegistry;
                }
            } catch (CloneNotSupportedException e3) {
                e = e3;
            }
            return callbackRegistry;
        }
    }

    private void notifyRecurse(T t, int i, A a2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce2004a6", new Object[]{this, t, new Integer(i), a2});
            return;
        }
        int size = this.mCallbacks.size();
        long[] jArr = this.mRemainderRemoved;
        int length = jArr == null ? -1 : jArr.length - 1;
        notifyRemainder(t, i, a2, length);
        notifyCallbacks(t, i, a2, (length + 2) * 64, size, 0L);
    }

    public synchronized boolean isEmpty() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f187dd4e", new Object[]{this})).booleanValue();
        } else if (this.mCallbacks.isEmpty()) {
            return true;
        } else {
            if (this.mNotificationLevel == 0) {
                return false;
            }
            int size = this.mCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (!isRemoved(i)) {
                    return false;
                }
            }
            return true;
        }
    }

    public synchronized void copyCallbacks(List<C> list) {
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dfbb29d1", new Object[]{this, list});
                return;
            }
            list.clear();
            int size = this.mCallbacks.size();
            for (int i = 0; i < size; i++) {
                if (!isRemoved(i)) {
                    list.add(this.mCallbacks.get(i));
                }
            }
        }
    }

    private void notifyCallbacks(T t, int i, A a2, int i2, int i3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3eb264d", new Object[]{this, t, new Integer(i), a2, new Integer(i2), new Integer(i3), new Long(j)});
            return;
        }
        long j2 = 1;
        while (i2 < i3) {
            if ((j & j2) == 0) {
                this.mNotifier.onNotifyCallback(this.mCallbacks.get(i2), t, i, a2);
            }
            j2 <<= 1;
            i2++;
        }
    }
}
