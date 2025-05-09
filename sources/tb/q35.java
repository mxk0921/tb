package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.TaskDeffer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class q35<T, R> implements fxq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a<T, R> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f26478a;
        public final eft<T, R> b;
        public final aft<T, R> c;
        public ket<T, R> d;

        public a(String str, eft<T, R> eftVar, aft<T, R> aftVar) {
            this.f26478a = str;
            this.b = eftVar;
            this.c = aftVar;
        }

        public q35<T, R> a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (q35) ipChange.ipc$dispatch("78c5c231", new Object[]{this});
            }
            return new r35(this.f26478a, this.b, this.c, this.d);
        }

        public a<T, R> b(TaskDeffer<T, R> taskDeffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c96f884", new Object[]{this, taskDeffer});
            }
            return this;
        }

        public a<T, R> c(ket<T, R> ketVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("873b08fa", new Object[]{this, ketVar});
            }
            this.d = ketVar;
            return this;
        }
    }

    public abstract lc7<T> e();

    public abstract fn8 f(xto xtoVar);

    public abstract String g();

    public abstract Map<T, fn8> h(StringBuilder sb);
}
