package mtopsdk.mtop.upload.util;

import android.os.Process;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import mtopsdk.common.util.StringUtils;
import mtopsdk.common.util.TBSdkLog;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class FileUploadThreadPoolExecutorFactory {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int KEEP_ALIVE_TIME = 10;
    private static final int REMOVE_TASKS_CORE_POOL_SIZE = 1;
    private static final int REMOVE_TASKS_MAX_POOL_SIZE = 1;
    private static final String TAG = "mtopsdk.FileUploadThreadPoolExecutorFactory";
    private static int priority = 10;
    private static volatile ThreadPoolExecutor removeTasksExecutor;
    private static volatile ThreadPoolExecutor uploadTasksExecutor;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class FileUploadThreadFactory implements ThreadFactory {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final AtomicInteger mCount = new AtomicInteger();
        private int priority;
        private String type;

        static {
            t2o.a(595591197);
        }

        public FileUploadThreadFactory(int i, String str) {
            this.priority = 10;
            this.type = "";
            this.priority = i;
            this.type = str;
        }

        public static /* synthetic */ int access$000(FileUploadThreadFactory fileUploadThreadFactory) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("482bb3cf", new Object[]{fileUploadThreadFactory})).intValue();
            }
            return fileUploadThreadFactory.priority;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Thread) ipChange.ipc$dispatch("d8079a58", new Object[]{this, runnable});
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("FileUpload ");
            if (StringUtils.isNotBlank(this.type)) {
                sb.append(this.type);
                sb.append(" ");
            }
            sb.append("Thread:");
            sb.append(this.mCount.getAndIncrement());
            return new Thread(runnable, sb.toString()) { // from class: mtopsdk.mtop.upload.util.FileUploadThreadPoolExecutorFactory.FileUploadThreadFactory.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1548812690) {
                        super.run();
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in mtopsdk/mtop/upload/util/FileUploadThreadPoolExecutorFactory$FileUploadThreadFactory$1");
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5c510192", new Object[]{this});
                        return;
                    }
                    Process.setThreadPriority(FileUploadThreadFactory.access$000(FileUploadThreadFactory.this));
                    super.run();
                }
            };
        }
    }

    static {
        t2o.a(595591196);
    }

    private static ThreadPoolExecutor createExecutor(int i, int i2, int i3, int i4, ThreadFactory threadFactory) {
        LinkedBlockingQueue linkedBlockingQueue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ThreadPoolExecutor) ipChange.ipc$dispatch("d514e25d", new Object[]{new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), threadFactory});
        }
        if (i4 > 0) {
            linkedBlockingQueue = new LinkedBlockingQueue(i4);
        } else {
            linkedBlockingQueue = new LinkedBlockingQueue();
        }
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i2, i3, TimeUnit.SECONDS, linkedBlockingQueue, threadFactory);
        if (i3 > 0) {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        }
        return threadPoolExecutor;
    }

    public static void setUploadTasksThreadPoolExecutor(ThreadPoolExecutor threadPoolExecutor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97ec15a5", new Object[]{threadPoolExecutor});
        } else if (threadPoolExecutor != null) {
            uploadTasksExecutor = threadPoolExecutor;
        }
    }

    public static Future<?> submitRemoveTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("92791b7c", new Object[]{runnable});
        }
        try {
            if (removeTasksExecutor == null) {
                synchronized (FileUploadThreadPoolExecutorFactory.class) {
                    if (removeTasksExecutor == null) {
                        removeTasksExecutor = createExecutor(1, 1, 10, 0, new FileUploadThreadFactory(priority, "RemoveTasks"));
                    }
                }
            }
            return removeTasksExecutor.submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitRemoveTask]submit runnable to FileUpload RemoveTasks ThreadPool error ---" + th.toString());
            return null;
        }
    }

    public static Future<?> submitUploadTask(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Future) ipChange.ipc$dispatch("973795f9", new Object[]{runnable});
        }
        try {
            if (uploadTasksExecutor == null) {
                synchronized (FileUploadThreadPoolExecutorFactory.class) {
                    if (uploadTasksExecutor == null) {
                        int uploadThreadsNums = FileUploadSetting.getUploadThreadsNums();
                        uploadTasksExecutor = createExecutor(uploadThreadsNums, uploadThreadsNums, 10, 0, new FileUploadThreadFactory(priority, "UploadTasks"));
                    }
                }
            }
            return uploadTasksExecutor.submit(runnable);
        } catch (Throwable th) {
            TBSdkLog.e(TAG, "[submitUploadTask]submit runnable to FileUpload UploadTasks ThreadPool error ---" + th.toString());
            return null;
        }
    }
}
