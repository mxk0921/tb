package androidx.core.app;

import android.app.Activity;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class FrameMetricsAggregator {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ANIMATION_DURATION = 256;
    public static final int ANIMATION_INDEX = 8;
    public static final int COMMAND_DURATION = 32;
    public static final int COMMAND_INDEX = 5;
    public static final int DELAY_DURATION = 128;
    public static final int DELAY_INDEX = 7;
    public static final int DRAW_DURATION = 8;
    public static final int DRAW_INDEX = 3;
    public static final int EVERY_DURATION = 511;
    public static final int INPUT_DURATION = 2;
    public static final int INPUT_INDEX = 1;
    private static final int LAST_INDEX = 8;
    public static final int LAYOUT_MEASURE_DURATION = 4;
    public static final int LAYOUT_MEASURE_INDEX = 2;
    public static final int SWAP_DURATION = 64;
    public static final int SWAP_INDEX = 6;
    public static final int SYNC_DURATION = 16;
    public static final int SYNC_INDEX = 4;
    public static final int TOTAL_DURATION = 1;
    public static final int TOTAL_INDEX = 0;
    private final FrameMetricsBaseImpl mInstance;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FrameMetricsApi24Impl extends FrameMetricsBaseImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        private static final int NANOS_PER_MS = 1000000;
        private static final int NANOS_ROUNDING_VALUE = 500000;
        private static Handler sHandler;
        private static HandlerThread sHandlerThread;
        public int mTrackingFlags;
        public SparseIntArray[] mMetrics = new SparseIntArray[9];
        private final ArrayList<WeakReference<Activity>> mActivities = new ArrayList<>();
        public Window.OnFrameMetricsAvailableListener mListener = new Window.OnFrameMetricsAvailableListener() { // from class: androidx.core.app.FrameMetricsAggregator.FrameMetricsApi24Impl.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e6a75cee", new Object[]{this, window, frameMetrics, new Integer(i)});
                    return;
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl.mTrackingFlags & 1) != 0) {
                    frameMetricsApi24Impl.addDurationItem(frameMetricsApi24Impl.mMetrics[0], frameMetrics.getMetric(8));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl2 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl2.mTrackingFlags & 2) != 0) {
                    frameMetricsApi24Impl2.addDurationItem(frameMetricsApi24Impl2.mMetrics[1], frameMetrics.getMetric(1));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl3 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl3.mTrackingFlags & 4) != 0) {
                    frameMetricsApi24Impl3.addDurationItem(frameMetricsApi24Impl3.mMetrics[2], frameMetrics.getMetric(3));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl4 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl4.mTrackingFlags & 8) != 0) {
                    frameMetricsApi24Impl4.addDurationItem(frameMetricsApi24Impl4.mMetrics[3], frameMetrics.getMetric(4));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl5 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl5.mTrackingFlags & 16) != 0) {
                    frameMetricsApi24Impl5.addDurationItem(frameMetricsApi24Impl5.mMetrics[4], frameMetrics.getMetric(5));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl6 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl6.mTrackingFlags & 64) != 0) {
                    frameMetricsApi24Impl6.addDurationItem(frameMetricsApi24Impl6.mMetrics[6], frameMetrics.getMetric(7));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl7 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl7.mTrackingFlags & 32) != 0) {
                    frameMetricsApi24Impl7.addDurationItem(frameMetricsApi24Impl7.mMetrics[5], frameMetrics.getMetric(6));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl8 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl8.mTrackingFlags & 128) != 0) {
                    frameMetricsApi24Impl8.addDurationItem(frameMetricsApi24Impl8.mMetrics[7], frameMetrics.getMetric(0));
                }
                FrameMetricsApi24Impl frameMetricsApi24Impl9 = FrameMetricsApi24Impl.this;
                if ((frameMetricsApi24Impl9.mTrackingFlags & 256) != 0) {
                    frameMetricsApi24Impl9.addDurationItem(frameMetricsApi24Impl9.mMetrics[8], frameMetrics.getMetric(2));
                }
            }
        };

        public FrameMetricsApi24Impl(int i) {
            this.mTrackingFlags = i;
        }

        public static /* synthetic */ Object ipc$super(FrameMetricsApi24Impl frameMetricsApi24Impl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/FrameMetricsAggregator$FrameMetricsApi24Impl");
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public void add(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b69cdfa", new Object[]{this, activity});
                return;
            }
            if (sHandlerThread == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                sHandlerThread = handlerThread;
                handlerThread.start();
                sHandler = new Handler(sHandlerThread.getLooper());
            }
            for (int i = 0; i <= 8; i++) {
                SparseIntArray[] sparseIntArrayArr = this.mMetrics;
                if (sparseIntArrayArr[i] == null && (this.mTrackingFlags & (1 << i)) != 0) {
                    sparseIntArrayArr[i] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.mListener, sHandler);
            this.mActivities.add(new WeakReference<>(activity));
        }

        public void addDurationItem(SparseIntArray sparseIntArray, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("221aa589", new Object[]{this, sparseIntArray, new Long(j)});
            } else if (sparseIntArray != null) {
                int i = (int) ((500000 + j) / 1000000);
                if (j >= 0) {
                    sparseIntArray.put(i, sparseIntArray.get(i) + 1);
                }
            }
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] getMetrics() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("64f16557", new Object[]{this});
            }
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] remove(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("6f15686e", new Object[]{this, activity});
            }
            Iterator<WeakReference<Activity>> it = this.mActivities.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                WeakReference<Activity> next = it.next();
                if (next.get() == activity) {
                    this.mActivities.remove(next);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
            return this.mMetrics;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("d5d7e4d5", new Object[]{this});
            }
            SparseIntArray[] sparseIntArrayArr = this.mMetrics;
            this.mMetrics = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.FrameMetricsBaseImpl
        public SparseIntArray[] stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("16735c82", new Object[]{this});
            }
            for (int size = this.mActivities.size() - 1; size >= 0; size--) {
                WeakReference<Activity> weakReference = this.mActivities.get(size);
                Activity activity = weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.mListener);
                    this.mActivities.remove(size);
                }
            }
            return this.mMetrics;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static class FrameMetricsBaseImpl {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void add(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6b69cdfa", new Object[]{this, activity});
            }
        }

        public SparseIntArray[] getMetrics() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("64f16557", new Object[]{this});
            }
            return null;
        }

        public SparseIntArray[] remove(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("6f15686e", new Object[]{this, activity});
            }
            return null;
        }

        public SparseIntArray[] reset() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("d5d7e4d5", new Object[]{this});
            }
            return null;
        }

        public SparseIntArray[] stop() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SparseIntArray[]) ipChange.ipc$dispatch("16735c82", new Object[]{this});
            }
            return null;
        }
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public @interface MetricType {
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void add(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b69cdfa", new Object[]{this, activity});
        } else {
            this.mInstance.add(activity);
        }
    }

    public SparseIntArray[] getMetrics() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray[]) ipChange.ipc$dispatch("64f16557", new Object[]{this});
        }
        return this.mInstance.getMetrics();
    }

    public SparseIntArray[] remove(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray[]) ipChange.ipc$dispatch("6f15686e", new Object[]{this, activity});
        }
        return this.mInstance.remove(activity);
    }

    public SparseIntArray[] reset() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray[]) ipChange.ipc$dispatch("d5d7e4d5", new Object[]{this});
        }
        return this.mInstance.reset();
    }

    public SparseIntArray[] stop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SparseIntArray[]) ipChange.ipc$dispatch("16735c82", new Object[]{this});
        }
        return this.mInstance.stop();
    }

    public FrameMetricsAggregator(int i) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.mInstance = new FrameMetricsApi24Impl(i);
        } else {
            this.mInstance = new FrameMetricsBaseImpl();
        }
    }
}
