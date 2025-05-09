package org.tensorflow.contrib.tmall.task;

import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.internal.compute.ServiceListener;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class TaskManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static TaskManager sInstance = null;
    private long nativeHandle;

    static {
        t2o.a(1034944745);
    }

    private TaskManager() {
        this.nativeHandle = 0L;
        this.nativeHandle = nativeGetHandle();
    }

    public static TaskManager getInstance() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskManager) ipChange.ipc$dispatch("f096e00b", new Object[0]);
        }
        if (sInstance == null) {
            sInstance = new TaskManager();
        }
        return sInstance;
    }

    private static native void nativeAddListener(long j, ServiceListener serviceListener);

    private static native long nativeGetHandle();

    private static native void nativeInit();

    private static native void nativeInitializeMonitor(boolean z);

    private static native void nativeSetDevicePreviewEnabled(boolean z);

    public void addListener(ServiceListener serviceListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da332a54", new Object[]{this, serviceListener});
        } else {
            nativeAddListener(this.nativeHandle, serviceListener);
        }
    }

    public void initializeMonitor(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("297f91c3", new Object[]{this, new Boolean(z)});
        } else {
            nativeInitializeMonitor(z);
        }
    }

    public void onNativeInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56ae368d", new Object[]{this});
        } else {
            nativeInit();
        }
    }

    public void setDevicePreviewEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fba2c3fc", new Object[]{this, new Boolean(z)});
        } else {
            nativeSetDevicePreviewEnabled(z);
        }
    }
}
