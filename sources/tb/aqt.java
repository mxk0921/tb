package tb;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class aqt implements zpt {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Runnable runnable) {
            super(str);
            this.val$runnable = runnable;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/impl/ThreadExecutorImpl$1");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.val$runnable.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b extends Coordinator.TaggedRunnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Runnable val$runnable;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Runnable runnable) {
            super(str);
            this.val$runnable = runnable;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/update/impl/ThreadExecutorImpl$2");
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.val$runnable.run();
            }
        }
    }

    static {
        t2o.a(956301320);
        t2o.a(946864133);
    }

    @Override // tb.zpt
    public void delayExecute(Runnable runnable, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d05115ec", new Object[]{this, runnable, new Integer(i)});
        } else {
            Coordinator.postTask(new b("update-sdk", runnable), i);
        }
    }

    @Override // tb.zpt
    public void execute(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1afb0dfa", new Object[]{this, runnable});
        } else {
            Coordinator.postTask(new a("update-sdk", runnable));
        }
    }
}
