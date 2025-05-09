package com.ali.user.open.core.task;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class TaskWithDialog<Params, Progress, Result> extends AbsAsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public Activity activity;

    static {
        t2o.a(71303231);
    }

    public TaskWithDialog(Activity activity) {
        this.activity = activity;
    }

    public static /* synthetic */ Object ipc$super(TaskWithDialog taskWithDialog, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/ali/user/open/core/task/TaskWithDialog");
    }

    @Override // com.ali.user.open.core.task.AbsAsyncTask
    public void doFinally() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8bc23aff", new Object[]{this});
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("873a6298", new Object[]{this});
        }
    }
}
