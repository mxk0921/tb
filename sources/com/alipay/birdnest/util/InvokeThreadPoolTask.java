package com.alipay.birdnest.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.alipay.android.app.template.JSPluginManager;
import com.alipay.birdnest.util.InvokeThreadPoolTask;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.flybird.FBDocument;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;
import tb.jst;
import tb.l2w;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public abstract class InvokeThreadPoolTask {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ExecutorService f3832a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class HandlerInstanceHolder {

        /* renamed from: a  reason: collision with root package name */
        public static final Handler f3833a = new Handler(Looper.getMainLooper()) { // from class: com.alipay.birdnest.util.InvokeThreadPoolTask.HandlerInstanceHolder.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/birdnest/util/InvokeThreadPoolTask$HandlerInstanceHolder$1");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                String valueOf;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                } else if (message.what == 16) {
                    TaskResult taskResult = (TaskResult) message.obj;
                    InvokeThreadPoolTask invokeThreadPoolTask = taskResult.f3834a;
                    Object obj = taskResult.b;
                    FBDocument.AnonymousClass16 r0 = (FBDocument.AnonymousClass16) invokeThreadPoolTask;
                    FBDocument.this.W.remove(taskResult);
                    if (FBDocument.this.mCore != 0 && r0.b == FBDocument.this.mCore) {
                        FBDocument fBDocument = FBDocument.this;
                        if (fBDocument.k0 != null && fBDocument.k != null && r0.f != 0 && obj != FBDocument.NO_RESULT) {
                            if (obj == null) {
                                valueOf = "{}";
                            } else {
                                try {
                                    valueOf = String.valueOf(obj);
                                } catch (Throwable th) {
                                    FBLogger.e("FBDocument", th);
                                    return;
                                }
                            }
                            if (!FBDocument.this.a() || !jst.b()) {
                                FBDocument.a(FBDocument.this, r0.f, valueOf, FBDocument.g);
                            } else {
                                FBDocument.nativeCallJsMethodWithJson(FBDocument.this.mCore, r0.f, valueOf);
                            }
                        }
                    }
                }
            }
        };
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static class TaskResult {

        /* renamed from: a  reason: collision with root package name */
        public InvokeThreadPoolTask f3834a;
        public Object b;
    }

    public InvokeThreadPoolTask(ExecutorService executorService) {
        this.f3832a = executorService;
    }

    public TaskResult a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaskResult) ipChange.ipc$dispatch("681cb00", new Object[]{this});
        }
        final TaskResult taskResult = new TaskResult();
        this.f3832a.execute(new Runnable() { // from class: tb.wkf
            @Override // java.lang.Runnable
            public final void run() {
                InvokeThreadPoolTask.this.a(taskResult);
            }
        });
        return taskResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TaskResult taskResult) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf10eefa", new Object[]{this, taskResult});
            return;
        }
        FBDocument.AnonymousClass16 r2 = (FBDocument.AnonymousClass16) this;
        if (FBDocument.this.mCore == 0 || r2.b != FBDocument.this.mCore) {
            obj = null;
        } else {
            if (r2.c) {
                String[] d = l2w.d(r2.d);
                if (JSPluginManager.INVOKE_NS_FB.equals(d[0]) && FBDocument.this.a(d[1], r2.e, r2.f)) {
                    obj = FBDocument.NO_RESULT;
                }
            } else if (FBDocument.this.a(r2.d, r2.e, r2.f)) {
                obj = FBDocument.NO_RESULT;
            }
            try {
                JSPluginManager instanse = JSPluginManager.getInstanse();
                FBDocument fBDocument = FBDocument.this;
                obj = instanse.performInvoke(fBDocument.k, r2.d, r2.e, fBDocument, r2.f, r2.c);
            } catch (Throwable th) {
                FBLogger.e("FBDocument", th);
                obj = new JSONObject();
            }
        }
        taskResult.b = obj;
        taskResult.f3834a = this;
        Handler handler = HandlerInstanceHolder.f3833a;
        handler.sendMessage(handler.obtainMessage(16, taskResult));
    }
}
