package com.taobao.message.lab.comfrm.util;

import android.os.SystemClock;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.message.lab.comfrm.inner.Schedules;
import com.taobao.message.lab.comfrm.support.model.Function2;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TimeBuffer<T> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private int mBufferTime;
    private Observer<List<T>> mCallback;
    private volatile long mConsumeTime;
    private boolean mDirectFirst;
    private List<T> mList;
    private Function2<T, List<T>, List<T>> mMergeFunc;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LastItemMergeFunction<T> implements Function2<T, List<T>, List<T>> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(537919898);
            t2o.a(537919854);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.taobao.message.lab.comfrm.support.model.Function2
        public /* bridge */ /* synthetic */ Object map(Object obj, Object obj2) {
            return map((LastItemMergeFunction<T>) obj, (List<LastItemMergeFunction<T>>) obj2);
        }

        public List<T> map(T t, List<T> list) {
            IpChange ipChange = $ipChange;
            return ipChange instanceof IpChange ? (List) ipChange.ipc$dispatch("d6bb4c57", new Object[]{this, t, list}) : Collections.singletonList(t);
        }
    }

    static {
        t2o.a(537919895);
    }

    public TimeBuffer(boolean z, int i, Function2<T, List<T>, List<T>> function2, Observer<List<T>> observer) {
        this.mDirectFirst = z;
        this.mBufferTime = i;
        this.mMergeFunc = function2;
        this.mCallback = observer;
    }

    public static /* synthetic */ List access$000(TimeBuffer timeBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3ae57045", new Object[]{timeBuffer});
        }
        return timeBuffer.mList;
    }

    public static /* synthetic */ void access$100(TimeBuffer timeBuffer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d5f6461", new Object[]{timeBuffer});
        } else {
            timeBuffer.check();
        }
    }

    public static /* synthetic */ void access$200(TimeBuffer timeBuffer, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46d4cca", new Object[]{timeBuffer, str});
        } else {
            timeBuffer.consume(str);
        }
    }

    private void check() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17afa58f", new Object[]{this});
        } else {
            Schedules.getLogic().schedule(new Runnable() { // from class: com.taobao.message.lab.comfrm.util.TimeBuffer.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TimeBuffer.this) {
                        try {
                            if (TimeBuffer.access$000(TimeBuffer.this) != null && TimeBuffer.access$000(TimeBuffer.this).size() > 0) {
                                TimeBuffer.access$100(TimeBuffer.this);
                                TimeBuffer.access$200(TimeBuffer.this, "check");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }, this.mBufferTime, TimeUnit.MILLISECONDS);
        }
    }

    private void consume(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad26d18d", new Object[]{this, str});
            return;
        }
        synchronized (this) {
            try {
                if (this.mList != null) {
                    this.mConsumeTime = getTime();
                    List<T> list = this.mList;
                    this.mList = null;
                    Observer<List<T>> observer = this.mCallback;
                    if (observer != null) {
                        observer.onData(list);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private long getTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("fff5e63e", new Object[]{this})).longValue();
        }
        return SystemClock.uptimeMillis();
    }

    public void checkForce() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8ad05ca", new Object[]{this});
        } else {
            Schedules.logic(new Runnable() { // from class: com.taobao.message.lab.comfrm.util.TimeBuffer.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    synchronized (TimeBuffer.this) {
                        try {
                            if (TimeBuffer.access$000(TimeBuffer.this) != null && TimeBuffer.access$000(TimeBuffer.this).size() > 0) {
                                TimeBuffer.access$200(TimeBuffer.this, "check");
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            });
        }
    }

    public synchronized void close() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
            return;
        }
        synchronized (this) {
            this.mList = null;
            Observer<List<T>> observer = this.mCallback;
            if (observer != null) {
                observer.onComplete();
            }
        }
    }

    public void produce(T t) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90ace583", new Object[]{this, t});
            return;
        }
        synchronized (this) {
            try {
                if (this.mList == null) {
                    this.mList = new ArrayList();
                }
                this.mList = this.mMergeFunc.map(t, this.mList);
                long time = getTime();
                if (this.mConsumeTime == 0 || time - this.mConsumeTime >= this.mBufferTime) {
                    check();
                    if (this.mDirectFirst) {
                        consume("produce");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
