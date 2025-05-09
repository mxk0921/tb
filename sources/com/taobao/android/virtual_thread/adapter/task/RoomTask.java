package com.taobao.android.virtual_thread.adapter.task;

import android.os.Handler;
import android.os.Looper;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.TaskExecutor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.VirtualExecutors;
import com.taobao.android.virtual_thread.VirtualThread;
import com.taobao.android.virtual_thread.adapter.task.RoomTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import tb.ghh;
import tb.j1r;
import tb.t2o;
import tb.yct;
import tb.yiw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class RoomTask implements yct {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final j1r f9889a;
    public final yiw b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class DefaultTaskExecutor extends TaskExecutor {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Object f9890a = new Object();
        public final ExecutorService b = VirtualExecutors.newFixedVirtualThreadPool(2, new ThreadFactory() { // from class: tb.wfo
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                Thread b;
                b = RoomTask.DefaultTaskExecutor.b(runnable);
                return b;
            }
        });
        public volatile Handler c;

        static {
            t2o.a(970981401);
        }

        public static /* synthetic */ Thread b(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("4e66d8b3", new Object[]{runnable});
            }
            return new VirtualThread(runnable, "room");
        }

        public static /* synthetic */ Object ipc$super(DefaultTaskExecutor defaultTaskExecutor, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/virtual_thread/adapter/task/RoomTask$DefaultTaskExecutor");
        }

        @Override // androidx.arch.core.executor.TaskExecutor
        public void executeOnDiskIO(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7fcea15c", new Object[]{this, runnable});
            } else {
                this.b.execute(runnable);
            }
        }

        @Override // androidx.arch.core.executor.TaskExecutor
        public boolean isMainThread() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("83ffd3f8", new Object[]{this})).booleanValue();
            }
            if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
                return true;
            }
            return false;
        }

        @Override // androidx.arch.core.executor.TaskExecutor
        public void postToMainThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a92b6643", new Object[]{this, runnable});
                return;
            }
            if (this.c == null) {
                synchronized (this.f9890a) {
                    try {
                        if (this.c == null) {
                            this.c = new Handler(Looper.getMainLooper());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.c.post(runnable);
        }
    }

    static {
        t2o.a(970981400);
        t2o.a(970981409);
    }

    public RoomTask(j1r j1rVar, yiw yiwVar) {
        this.f9889a = j1rVar;
        this.b = yiwVar;
    }

    @Override // tb.yct
    public void execute() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e48bb97c", new Object[]{this});
        } else if (this.f9889a.c("useRoomVirtualThread", this.b.a())) {
            ArchTaskExecutor.getInstance().setDelegate(new DefaultTaskExecutor());
            ghh.a("RoomTask", "succ");
        } else {
            ghh.a("RoomTask", "failed");
        }
    }
}
