package com.taobao.android.tschedule.task;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.taskcontext.PhenixTaskContext;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import tb.lqm;
import tb.s8d;
import tb.t2o;
import tb.wms;
import tb.zms;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class PhenixScheduleTask extends ScheduleTask<PhenixTaskContext> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static LruCache<String, Drawable> imgCache = new LruCache<>(5);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(PhenixScheduleTask phenixScheduleTask) {
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            String url = succPhenixEvent.getUrl();
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (TextUtils.isEmpty(url) || drawable == null) {
                return false;
            }
            PhenixScheduleTask.imgCache.put(url, drawable);
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements s8d<lqm> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b(PhenixScheduleTask phenixScheduleTask) {
        }

        /* renamed from: a */
        public boolean onHappen(lqm lqmVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8c43379", new Object[]{this, lqmVar})).booleanValue();
            }
            return true;
        }
    }

    static {
        t2o.a(329252982);
    }

    public PhenixScheduleTask(String str, PhenixTaskContext phenixTaskContext) {
        super(str, phenixTaskContext);
    }

    public static /* synthetic */ Object ipc$super(PhenixScheduleTask phenixScheduleTask, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tschedule/task/PhenixScheduleTask");
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean isFinished() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9673ae47", new Object[]{this})).booleanValue();
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005c A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:16:0x002b, B:17:0x0056, B:19:0x005c, B:22:0x0069, B:23:0x0071, B:26:0x007f, B:27:0x0086, B:29:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b3, B:35:0x00b9), top: B:38:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:16:0x002b, B:17:0x0056, B:19:0x005c, B:22:0x0069, B:23:0x0071, B:26:0x007f, B:27:0x0086, B:29:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b3, B:35:0x00b9), top: B:38:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:16:0x002b, B:17:0x0056, B:19:0x005c, B:22:0x0069, B:23:0x0071, B:26:0x007f, B:27:0x0086, B:29:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b3, B:35:0x00b9), top: B:38:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3 A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:8:0x001b, B:10:0x001e, B:12:0x0024, B:16:0x002b, B:17:0x0056, B:19:0x005c, B:22:0x0069, B:23:0x0071, B:26:0x007f, B:27:0x0086, B:29:0x008e, B:30:0x0092, B:32:0x0098, B:33:0x00b3, B:35:0x00b9), top: B:38:0x001b }] */
    @Override // com.taobao.android.tschedule.task.ScheduleTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void realExecute(java.lang.String r9, java.lang.Object... r10) {
        /*
            Method dump skipped, instructions count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tschedule.task.PhenixScheduleTask.realExecute(java.lang.String, java.lang.Object[]):void");
    }

    public PhenixScheduleTask(String str, PhenixTaskContext phenixTaskContext, ScheduleProtocolCallback scheduleProtocolCallback) {
        super(str, phenixTaskContext, scheduleProtocolCallback);
    }

    @Override // com.taobao.android.tschedule.task.ScheduleTask
    public boolean validate(String str, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("152894ae", new Object[]{this, str, objArr})).booleanValue();
        }
        T t = this.taskContext;
        if (!(t == 0 || ((PhenixTaskContext) t).params == null || !zms.b(wms.SWITCH_KEY_ENABLE_TASK_PHENIX, false))) {
            T t2 = this.taskContext;
            if (((PhenixTaskContext) t2).params.imgUrls != null && !((PhenixTaskContext) t2).params.imgUrls.isEmpty()) {
                return true;
            }
        }
        return false;
    }
}
