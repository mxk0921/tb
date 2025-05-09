package com.taobao.message.notification.banner.util;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MergeCallback {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private AllCompleteCallback allCompleteCallback;
    private int count = 0;
    private boolean finish = false;
    private int maxCount;
    private List<MergeCallbackTask> tasks;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface AllCompleteCallback {
        void onAllComplete();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface MergeCallbackTask {
        void run(MergeCallback mergeCallback);
    }

    static {
        t2o.a(610271262);
    }

    public MergeCallback(List<MergeCallbackTask> list, AllCompleteCallback allCompleteCallback) {
        this.tasks = list;
        this.maxCount = list.size();
        this.allCompleteCallback = allCompleteCallback;
    }

    public void complete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            return;
        }
        int i = this.count + 1;
        this.count = i;
        if (i >= this.maxCount && !this.finish) {
            this.finish = true;
            this.allCompleteCallback.onAllComplete();
        }
    }

    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        for (MergeCallbackTask mergeCallbackTask : this.tasks) {
            mergeCallbackTask.run(this);
        }
    }
}
