package com.taobao.weex.bridge;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.utils.WXLogUtils;
import java.util.ArrayList;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class WXInitDelayTask {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "WXInitDelayTask";
    private static volatile WXInitDelayTask mInstance;
    private volatile Boolean enableInitDelay = Boolean.FALSE;
    private List<Runnable> initDelayTaskList = new ArrayList();

    static {
        t2o.a(985661548);
    }

    public static synchronized WXInitDelayTask getInstance() {
        synchronized (WXInitDelayTask.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (WXInitDelayTask) ipChange.ipc$dispatch("57af4167", new Object[0]);
            }
            if (mInstance == null) {
                mInstance = new WXInitDelayTask();
            }
            return mInstance;
        }
    }

    public synchronized void addDelayTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a25b68c", new Object[]{this, runnable});
            return;
        }
        WXLogUtils.e(TAG, "addDelayTask");
        this.initDelayTaskList.add(runnable);
    }

    public synchronized void flushTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37cccab0", new Object[]{this});
            return;
        }
        try {
        } catch (Exception e) {
            WXLogUtils.e(TAG, e.getMessage());
        }
        if (!this.initDelayTaskList.isEmpty()) {
            WXLogUtils.e(TAG, "flush Task. task list size is " + this.initDelayTaskList.size());
            for (Runnable runnable : this.initDelayTaskList) {
                WXLogUtils.e(TAG, "run flushTask");
                runnable.run();
            }
            this.initDelayTaskList.clear();
            WXLogUtils.e(TAG, "finish flush Task");
        }
    }

    public void setEnableInitDelay(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4da8858", new Object[]{this, bool});
        } else {
            this.enableInitDelay = bool;
        }
    }

    public void tryDelayTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("de4c78b2", new Object[]{this, runnable});
        } else if (this.enableInitDelay.booleanValue()) {
            addDelayTask(runnable);
        } else {
            WXLogUtils.e("disableInitDelay,run init task directly");
            runnable.run();
        }
    }
}
