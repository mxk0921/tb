package org.android.netutil;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class AsyncTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public boolean done;

    public void onTaskFinish() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52b8e6be", new Object[]{this});
        } else {
            this.done = true;
        }
    }
}
