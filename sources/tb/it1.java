package tb;

import android.app.Activity;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector;
import com.taobao.tao.log.TLog;
import java.util.HashSet;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class it1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f21559a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a extends PostureCenterLifeCycleDetector.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final it1 f21560a;
        public final HashSet<String> b = new HashSet<>();

        static {
            t2o.a(404750586);
        }

        public a(it1 it1Var) {
            this.f21560a = it1Var;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            switch (str.hashCode()) {
                case -1536849291:
                    super.onActivityPaused((Activity) objArr[0]);
                    return null;
                case -55310051:
                    super.onSwitchForeground();
                    return null;
                case 1049280322:
                    super.onActivityResumed((Activity) objArr[0]);
                    return null;
                case 1946552200:
                    super.onSwitchBackground();
                    return null;
                default:
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/behavix/postureCenter/services/info/BaseDelegate$LifecycleHandler");
            }
        }

        @Override // com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector.a, tb.h82
        public void onActivityPaused(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
                return;
            }
            super.onActivityPaused(activity);
            if (this.b.contains(activity.getClass().getName())) {
                this.f21560a.b();
            }
        }

        @Override // com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector.a, tb.h82
        public void onActivityResumed(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
                return;
            }
            super.onActivityResumed(activity);
            if (this.b.contains(activity.getClass().getName())) {
                this.f21560a.a();
            }
        }

        @Override // com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector.a, tb.h82
        public void onSwitchBackground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("74060788", new Object[]{this});
                return;
            }
            super.onSwitchBackground();
            TLog.loge("BaseDelegateLifecycleHandler", "onSwitchBackground");
        }

        @Override // com.taobao.android.behavix.postureCenter.core.PostureCenterLifeCycleDetector.a, tb.h82
        public void onSwitchForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fcb4091d", new Object[]{this});
                return;
            }
            super.onSwitchForeground();
            TLog.loge("BaseDelegateLifecycleHandler", "onSwitchForeground");
        }
    }

    static {
        t2o.a(404750585);
    }

    public it1() {
        if (this.f21559a == null) {
            a aVar = new a(this);
            this.f21559a = aVar;
            PostureCenterLifeCycleDetector c = uim.c();
            if (c != null) {
                c.a(aVar);
            }
        }
    }

    public abstract void a();

    public abstract void b();
}
