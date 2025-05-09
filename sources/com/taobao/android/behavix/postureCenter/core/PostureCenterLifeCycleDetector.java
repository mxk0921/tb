package com.taobao.android.behavix.postureCenter.core;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.postureCenter.services.info.DevicesDelegate;
import java.util.Iterator;
import java.util.LinkedList;
import tb.h82;
import tb.t2o;
import tb.uim;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class PostureCenterLifeCycleDetector implements h82 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActivityStatus f6455a = ActivityStatus.DESTROYED;
    public LinkedList<a> b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public enum ActivityStatus {
        CREATED,
        SAVE_INSTANCE_STATE,
        STARTED,
        RESUMED,
        PAUSED,
        STOPPED,
        DESTROYED;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(ActivityStatus activityStatus, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/core/PostureCenterLifeCycleDetector$ActivityStatus");
        }

        public static ActivityStatus valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityStatus) ipChange.ipc$dispatch("99e44f3d", new Object[]{str});
            }
            return (ActivityStatus) Enum.valueOf(ActivityStatus.class, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements h82 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(404750555);
            t2o.a(404750621);
        }

        @Override // tb.h82
        public void onActivityCreated(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            }
        }

        @Override // tb.h82
        public void onActivityDestroyed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        @Override // tb.h82
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            }
        }

        @Override // tb.h82
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            }
        }

        @Override // tb.h82
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        @Override // tb.h82
        public void onSwitchBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74060788", new Object[]{this});
            }
        }

        @Override // tb.h82
        public void onSwitchForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final PostureCenterLifeCycleDetector f6456a = new PostureCenterLifeCycleDetector();

        static {
            t2o.a(404750556);
        }

        public static /* synthetic */ PostureCenterLifeCycleDetector a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PostureCenterLifeCycleDetector) ipChange.ipc$dispatch("e72f4345", new Object[0]);
            }
            return f6456a;
        }
    }

    static {
        t2o.a(404750553);
        t2o.a(404750621);
    }

    public static final PostureCenterLifeCycleDetector b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PostureCenterLifeCycleDetector) ipChange.ipc$dispatch("21b30adb", new Object[0]);
        }
        return b.a();
    }

    public void a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b32dfde", new Object[]{this, aVar});
            return;
        }
        if (this.b == null) {
            this.b = new LinkedList<>();
        }
        this.b.add(aVar);
    }

    @Override // tb.h82
    public void onActivityCreated(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onActivityCreated(activity, bundle);
            }
        }
        activity.getClass();
        ActivityStatus activityStatus = this.f6455a;
        ActivityStatus activityStatus2 = ActivityStatus.CREATED;
        if (activityStatus != activityStatus2) {
            this.f6455a = activityStatus2;
        }
    }

    @Override // tb.h82
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onActivityDestroyed(activity);
            }
        }
        ActivityStatus activityStatus = this.f6455a;
        ActivityStatus activityStatus2 = ActivityStatus.DESTROYED;
        if (activityStatus != activityStatus2) {
            this.f6455a = activityStatus2;
        }
    }

    @Override // tb.h82
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        DevicesDelegate a2 = uim.a();
        if (a2 != null && TextUtils.equals(a2.l(), "global")) {
            a2.h();
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onActivityPaused(activity);
            }
        }
        ActivityStatus activityStatus = this.f6455a;
        ActivityStatus activityStatus2 = ActivityStatus.PAUSED;
        if (activityStatus != activityStatus2) {
            this.f6455a = activityStatus2;
        }
    }

    @Override // tb.h82
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onActivityResumed(activity);
            }
        }
        ActivityStatus activityStatus = this.f6455a;
        ActivityStatus activityStatus2 = ActivityStatus.RESUMED;
        if (activityStatus != activityStatus2) {
            this.f6455a = activityStatus2;
        }
    }

    @Override // tb.h82
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onActivitySaveInstanceState(activity, bundle);
            }
        }
        ActivityStatus activityStatus = this.f6455a;
        ActivityStatus activityStatus2 = ActivityStatus.SAVE_INSTANCE_STATE;
        if (activityStatus != activityStatus2) {
            this.f6455a = activityStatus2;
        }
    }

    @Override // tb.h82
    public void onSwitchBackground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74060788", new Object[]{this});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onSwitchBackground();
            }
        }
        DevicesDelegate a2 = uim.a();
        if (a2 != null) {
            a2.h();
        }
    }

    @Override // tb.h82
    public void onSwitchForeground() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
            return;
        }
        LinkedList<a> linkedList = this.b;
        if (linkedList != null) {
            Iterator<a> it = linkedList.iterator();
            while (it.hasNext()) {
                it.next().onSwitchForeground();
            }
        }
        DevicesDelegate a2 = uim.a();
        if (a2 != null) {
            a2.n("global");
        }
    }
}
