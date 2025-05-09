package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import tb.m;
import tb.puf;

/* compiled from: Taobao */
@Deprecated
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public abstract class JobIntentService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final boolean DEBUG = false;
    public static final String TAG = "JobIntentService";
    public final ArrayList<CompatWorkItem> mCompatQueue;
    public WorkEnqueuer mCompatWorkEnqueuer;
    public CommandProcessor mCurProcessor;
    public CompatJobEngine mJobImpl;
    public static final Object sLock = new Object();
    public static final HashMap<ComponentName, WorkEnqueuer> sClassWorkEnqueuer = new HashMap<>();
    public boolean mInterruptIfStopped = false;
    public boolean mStopped = false;
    public boolean mDestroyed = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class CommandProcessor extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public CommandProcessor() {
        }

        public static /* synthetic */ Object ipc$super(CommandProcessor commandProcessor, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/JobIntentService$CommandProcessor");
        }

        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            while (true) {
                GenericWorkItem dequeueWork = JobIntentService.this.dequeueWork();
                if (dequeueWork == null) {
                    return null;
                }
                JobIntentService.this.onHandleWork(dequeueWork.getIntent());
                dequeueWork.complete();
            }
        }

        public void onCancelled(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2edba5e0", new Object[]{this, r5});
            } else {
                JobIntentService.this.processorFinished();
            }
        }

        public void onPostExecute(Void r5) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("213d104", new Object[]{this, r5});
            } else {
                JobIntentService.this.processorFinished();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface CompatJobEngine {
        IBinder compatGetBinder();

        GenericWorkItem dequeueWork();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class CompatWorkEnqueuer extends WorkEnqueuer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Context mContext;
        private final PowerManager.WakeLock mLaunchWakeLock;
        public boolean mLaunchingService;
        private final PowerManager.WakeLock mRunWakeLock;
        public boolean mServiceProcessing;

        public CompatWorkEnqueuer(Context context, ComponentName componentName) {
            super(componentName);
            this.mContext = context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.mLaunchWakeLock = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.mRunWakeLock = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        public static /* synthetic */ Object ipc$super(CompatWorkEnqueuer compatWorkEnqueuer, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/JobIntentService$CompatWorkEnqueuer");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("315a8cfd", new Object[]{this, intent});
                return;
            }
            Intent intent2 = new Intent(intent);
            intent2.setComponent(this.mComponentName);
            if (this.mContext.startService(intent2) != null) {
                synchronized (this) {
                    try {
                        if (!this.mLaunchingService) {
                            this.mLaunchingService = true;
                            if (!this.mServiceProcessing) {
                                this.mLaunchWakeLock.acquire(60000L);
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingFinished() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c9a87c1", new Object[]{this});
                return;
            }
            synchronized (this) {
                try {
                    if (this.mServiceProcessing) {
                        if (this.mLaunchingService) {
                            this.mLaunchWakeLock.acquire(60000L);
                        }
                        this.mServiceProcessing = false;
                        this.mRunWakeLock.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceProcessingStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c36837c0", new Object[]{this});
                return;
            }
            synchronized (this) {
                try {
                    if (!this.mServiceProcessing) {
                        this.mServiceProcessing = true;
                        this.mRunWakeLock.acquire(m.CONFIG_TRACK_1022_INTERVAL_TIME);
                        this.mLaunchWakeLock.release();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void serviceStartReceived() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("358a4535", new Object[]{this});
                return;
            }
            synchronized (this) {
                this.mLaunchingService = false;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public final class CompatWorkItem implements GenericWorkItem {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final Intent mIntent;
        public final int mStartId;

        public CompatWorkItem(Intent intent, int i) {
            this.mIntent = intent;
            this.mStartId = i;
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public void complete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e77d7140", new Object[]{this});
            } else {
                JobIntentService.this.stopSelf(this.mStartId);
            }
        }

        @Override // androidx.core.app.JobIntentService.GenericWorkItem
        public Intent getIntent() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
            }
            return this.mIntent;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public interface GenericWorkItem {
        void complete();

        Intent getIntent();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class JobServiceEngineImpl extends JobServiceEngine implements CompatJobEngine {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final boolean DEBUG = false;
        public static final String TAG = "JobServiceEngineImpl";
        public final Object mLock = new Object();
        public JobParameters mParams;
        public final JobIntentService mService;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
        public final class WrapperWorkItem implements GenericWorkItem {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public final JobWorkItem mJobWork;

            public WrapperWorkItem(JobWorkItem jobWorkItem) {
                this.mJobWork = jobWorkItem;
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public void complete() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("e77d7140", new Object[]{this});
                    return;
                }
                synchronized (JobServiceEngineImpl.this.mLock) {
                    try {
                        JobParameters jobParameters = JobServiceEngineImpl.this.mParams;
                        if (jobParameters != null) {
                            jobParameters.completeWork(this.mJobWork);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }

            @Override // androidx.core.app.JobIntentService.GenericWorkItem
            public Intent getIntent() {
                Intent intent;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (Intent) ipChange.ipc$dispatch("cdc34bda", new Object[]{this});
                }
                intent = this.mJobWork.getIntent();
                return intent;
            }
        }

        public JobServiceEngineImpl(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.mService = jobIntentService;
        }

        public static /* synthetic */ Object ipc$super(JobServiceEngineImpl jobServiceEngineImpl, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/JobIntentService$JobServiceEngineImpl");
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public IBinder compatGetBinder() {
            IBinder binder;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IBinder) ipChange.ipc$dispatch("7a0686d8", new Object[]{this});
            }
            binder = getBinder();
            return binder;
        }

        @Override // androidx.core.app.JobIntentService.CompatJobEngine
        public GenericWorkItem dequeueWork() {
            JobWorkItem dequeueWork;
            Intent intent;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (GenericWorkItem) ipChange.ipc$dispatch("9b3acb2", new Object[]{this});
            }
            synchronized (this.mLock) {
                try {
                    JobParameters jobParameters = this.mParams;
                    if (jobParameters == null) {
                        return null;
                    }
                    dequeueWork = jobParameters.dequeueWork();
                    if (dequeueWork == null) {
                        return null;
                    }
                    intent = dequeueWork.getIntent();
                    intent.setExtrasClassLoader(this.mService.getClassLoader());
                    return new WrapperWorkItem(dequeueWork);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStartJob(JobParameters jobParameters) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55aa337d", new Object[]{this, jobParameters})).booleanValue();
            }
            this.mParams = jobParameters;
            this.mService.ensureProcessorRunningLocked(false);
            return true;
        }

        @Override // android.app.job.JobServiceEngine
        public boolean onStopJob(JobParameters jobParameters) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8d429dbb", new Object[]{this, jobParameters})).booleanValue();
            }
            boolean doStopCurrentWork = this.mService.doStopCurrentWork();
            synchronized (this.mLock) {
                this.mParams = null;
            }
            return doStopCurrentWork;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static final class JobWorkEnqueuer extends WorkEnqueuer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final JobInfo mJobInfo;
        private final JobScheduler mJobScheduler;

        public JobWorkEnqueuer(Context context, ComponentName componentName, int i) {
            super(componentName);
            ensureJobId(i);
            this.mJobInfo = new JobInfo.Builder(i, this.mComponentName).setOverrideDeadline(0L).build();
            this.mJobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }

        public static /* synthetic */ Object ipc$super(JobWorkEnqueuer jobWorkEnqueuer, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in androidx/core/app/JobIntentService$JobWorkEnqueuer");
        }

        @Override // androidx.core.app.JobIntentService.WorkEnqueuer
        public void enqueueWork(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("315a8cfd", new Object[]{this, intent});
            } else {
                this.mJobScheduler.enqueue(this.mJobInfo, puf.a(intent));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
    public static abstract class WorkEnqueuer {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final ComponentName mComponentName;
        public boolean mHasJobId;
        public int mJobId;

        public WorkEnqueuer(ComponentName componentName) {
            this.mComponentName = componentName;
        }

        public abstract void enqueueWork(Intent intent);

        public void ensureJobId(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("acaeeb82", new Object[]{this, new Integer(i)});
            } else if (!this.mHasJobId) {
                this.mHasJobId = true;
                this.mJobId = i;
            } else if (this.mJobId != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.mJobId);
            }
        }

        public void serviceProcessingFinished() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4c9a87c1", new Object[]{this});
            }
        }

        public void serviceProcessingStarted() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c36837c0", new Object[]{this});
            }
        }

        public void serviceStartReceived() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("358a4535", new Object[]{this});
            }
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.mCompatQueue = null;
        } else {
            this.mCompatQueue = new ArrayList<>();
        }
    }

    public static void enqueueWork(Context context, Class<?> cls, int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8268bdab", new Object[]{context, cls, new Integer(i), intent});
        } else {
            enqueueWork(context, new ComponentName(context, cls), i, intent);
        }
    }

    public static WorkEnqueuer getWorkEnqueuer(Context context, ComponentName componentName, boolean z, int i) {
        WorkEnqueuer compatWorkEnqueuer;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WorkEnqueuer) ipChange.ipc$dispatch("ac05a1b4", new Object[]{context, componentName, new Boolean(z), new Integer(i)});
        }
        HashMap<ComponentName, WorkEnqueuer> hashMap = sClassWorkEnqueuer;
        WorkEnqueuer workEnqueuer = hashMap.get(componentName);
        if (workEnqueuer == null) {
            if (Build.VERSION.SDK_INT < 26) {
                compatWorkEnqueuer = new CompatWorkEnqueuer(context, componentName);
            } else if (z) {
                compatWorkEnqueuer = new JobWorkEnqueuer(context, componentName, i);
            } else {
                throw new IllegalArgumentException("Can't be here without a job id");
            }
            workEnqueuer = compatWorkEnqueuer;
            hashMap.put(componentName, workEnqueuer);
        }
        return workEnqueuer;
    }

    public static /* synthetic */ Object ipc$super(JobIntentService jobIntentService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in androidx/core/app/JobIntentService");
        }
    }

    public GenericWorkItem dequeueWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GenericWorkItem) ipChange.ipc$dispatch("9b3acb2", new Object[]{this});
        }
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.dequeueWork();
        }
        synchronized (this.mCompatQueue) {
            try {
                if (this.mCompatQueue.size() <= 0) {
                    return null;
                }
                return this.mCompatQueue.remove(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean doStopCurrentWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("11a200c8", new Object[]{this})).booleanValue();
        }
        CommandProcessor commandProcessor = this.mCurProcessor;
        if (commandProcessor != null) {
            commandProcessor.cancel(this.mInterruptIfStopped);
        }
        this.mStopped = true;
        return onStopCurrentWork();
    }

    public void ensureProcessorRunningLocked(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce61438", new Object[]{this, new Boolean(z)});
        } else if (this.mCurProcessor == null) {
            this.mCurProcessor = new CommandProcessor();
            WorkEnqueuer workEnqueuer = this.mCompatWorkEnqueuer;
            if (workEnqueuer != null && z) {
                workEnqueuer.serviceProcessingStarted();
            }
            this.mCurProcessor.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public boolean isStopped() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d2d2044e", new Object[]{this})).booleanValue();
        }
        return this.mStopped;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        CompatJobEngine compatJobEngine = this.mJobImpl;
        if (compatJobEngine != null) {
            return compatJobEngine.compatGetBinder();
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.mJobImpl = new JobServiceEngineImpl(this);
            this.mCompatWorkEnqueuer = null;
            return;
        }
        this.mJobImpl = null;
        this.mCompatWorkEnqueuer = getWorkEnqueuer(this, new ComponentName(this, getClass()), false, 0);
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.mDestroyed = true;
                this.mCompatWorkEnqueuer.serviceProcessingFinished();
            }
        }
    }

    public abstract void onHandleWork(Intent intent);

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.mCompatQueue == null) {
            return 2;
        }
        this.mCompatWorkEnqueuer.serviceStartReceived();
        synchronized (this.mCompatQueue) {
            ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new CompatWorkItem(intent, i2));
            ensureProcessorRunningLocked(true);
        }
        return 3;
    }

    public boolean onStopCurrentWork() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b492b6f4", new Object[]{this})).booleanValue();
        }
        return true;
    }

    public void processorFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("528711ab", new Object[]{this});
            return;
        }
        ArrayList<CompatWorkItem> arrayList = this.mCompatQueue;
        if (arrayList != null) {
            synchronized (arrayList) {
                try {
                    this.mCurProcessor = null;
                    ArrayList<CompatWorkItem> arrayList2 = this.mCompatQueue;
                    if (arrayList2 != null && arrayList2.size() > 0) {
                        ensureProcessorRunningLocked(false);
                    } else if (!this.mDestroyed) {
                        this.mCompatWorkEnqueuer.serviceProcessingFinished();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public void setInterruptIfStopped(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ccebc1be", new Object[]{this, new Boolean(z)});
        } else {
            this.mInterruptIfStopped = z;
        }
    }

    public static void enqueueWork(Context context, ComponentName componentName, int i, Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("700eccb9", new Object[]{context, componentName, new Integer(i), intent});
        } else if (intent != null) {
            synchronized (sLock) {
                WorkEnqueuer workEnqueuer = getWorkEnqueuer(context, componentName, true, i);
                workEnqueuer.ensureJobId(i);
                workEnqueuer.enqueueWork(intent);
            }
        } else {
            throw new IllegalArgumentException("work must not be null");
        }
    }
}
