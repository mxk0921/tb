package com.alipay.android.msp.framework.taskscheduler;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class MspAsyncTask<Params, Progress, Result> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private static InternalHandler jD;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class AsyncTaskResult<Data> {
        public final Data[] mData;
        public final MspAsyncTask mTask;

        public AsyncTaskResult(MspAsyncTask mspAsyncTask, Data... dataArr) {
            this.mTask = mspAsyncTask;
            this.mData = dataArr;
        }
    }

    public static /* synthetic */ void access$100(MspAsyncTask mspAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fdbcd88", new Object[]{mspAsyncTask, obj});
            return;
        }
        LogUtil.record(2, "", "MspAsyncTask::finish", "finished");
        mspAsyncTask.onPostExecute(obj);
    }

    private static Handler getHandler() {
        InternalHandler internalHandler;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("e690ed4b", new Object[0]);
        }
        synchronized (MspAsyncTask.class) {
            try {
                if (jD == null) {
                    jD = new InternalHandler();
                }
                internalHandler = jD;
            } catch (Throwable th) {
                throw th;
            }
        }
        return internalHandler;
    }

    public abstract Result doInBackground(Params... paramsArr);

    public void onPostExecute(Result result) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b105c779", new Object[]{this, result});
        }
    }

    public final void execute(final Params... paramsArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32d18835", new Object[]{this, paramsArr});
            return;
        }
        LogUtil.record(2, "", "MspAsyncTask::execute", "start");
        Thread thread = new Thread(new Runnable() { // from class: com.alipay.android.msp.framework.taskscheduler.MspAsyncTask.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                Object obj;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                LogUtil.record(2, "", "MspAsyncTask::executeOnThread", "running...");
                try {
                    obj = MspAsyncTask.this.doInBackground(paramsArr);
                } catch (Throwable th) {
                    obj = null;
                    try {
                        LogUtil.printExceptionStackTrace(th);
                    } finally {
                        MspAsyncTask.access$000(MspAsyncTask.this, obj);
                    }
                }
            }
        });
        thread.setName("MspAsyncTask");
        thread.start();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class InternalHandler extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public InternalHandler() {
            super(Looper.getMainLooper());
        }

        public static /* synthetic */ Object ipc$super(InternalHandler internalHandler, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/framework/taskscheduler/MspAsyncTask$InternalHandler");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            AsyncTaskResult asyncTaskResult = (AsyncTaskResult) message.obj;
            if (message.what == 1) {
                LogUtil.record(2, "", "MspAsyncTask::handleMessage", "received message.");
                MspAsyncTask.access$100(asyncTaskResult.mTask, asyncTaskResult.mData[0]);
            }
        }
    }

    public static /* synthetic */ Object access$000(MspAsyncTask mspAsyncTask, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("74289b69", new Object[]{mspAsyncTask, obj});
        }
        LogUtil.record(2, "", "MspAsyncTask::postResult", "send message.");
        getHandler().obtainMessage(1, new AsyncTaskResult(mspAsyncTask, obj)).sendToTarget();
        return obj;
    }
}
