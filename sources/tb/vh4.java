package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.job.core.TaskDeffer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class vh4 {

    /* renamed from: a  reason: collision with root package name */
    public final ket<String, Void> f30013a;
    public final aft<String, Void> b;
    public final TaskDeffer<String, Void> c;
    public final fft<String, Void> d;
    public final j6a<String> e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ket<String, Void> f30014a;
        public final aft<String, Void> b;
        public final j6a<String> c;
        public String d = null;
        public TaskDeffer<String, Void> e;
        public fft<String, Void> f;

        public b(ket<String, Void> ketVar, aft<String, Void> aftVar, j6a<String> j6aVar) {
            this.f30014a = ketVar;
            this.b = aftVar;
            this.c = j6aVar;
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("98780651", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public vh4 b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (vh4) ipChange.ipc$dispatch("5e28326b", new Object[]{this});
            }
            return new vh4(this.f30014a, this.b, this.c, this.d, this.e, this.f);
        }

        public b c(fft<String, Void> fftVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("38ac1e51", new Object[]{this, fftVar});
            }
            this.f = fftVar;
            return this;
        }

        public b d(TaskDeffer<String, Void> taskDeffer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4cde6fbe", new Object[]{this, taskDeffer});
            }
            this.e = taskDeffer;
            return this;
        }
    }

    public vh4(ket<String, Void> ketVar, aft<String, Void> aftVar, j6a<String> j6aVar, String str, TaskDeffer<String, Void> taskDeffer, fft<String, Void> fftVar) {
        this.b = aftVar;
        this.e = j6aVar;
        this.f30013a = ketVar;
        this.c = taskDeffer;
        this.d = fftVar;
    }
}
