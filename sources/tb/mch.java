package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class mch {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static TBLocationDTO f23941a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* renamed from: tb.mch$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC0993a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;
            public static final RunnableC0993a INSTANCE = new RunnableC0993a();

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                IpChange ipChange2 = mch.$ipChange;
                mch.b(TBLocationClient.d());
            }
        }

        static {
            t2o.a(481297617);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final TBLocationDTO a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLocationDTO) ipChange.ipc$dispatch("738c00aa", new Object[]{this});
            }
            Coordinator.execute(RunnableC0993a.INSTANCE);
            return mch.a();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297616);
    }

    public static final /* synthetic */ TBLocationDTO a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLocationDTO) ipChange.ipc$dispatch("eb9d0aaa", new Object[0]);
        }
        return f23941a;
    }

    public static final /* synthetic */ void b(TBLocationDTO tBLocationDTO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bdc0fd8", new Object[]{tBLocationDTO});
        } else {
            f23941a = tBLocationDTO;
        }
    }
}
