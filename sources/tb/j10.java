package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public abstract class j10 implements y1e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final y1e f21696a;

        static {
            t2o.a(614465741);
        }

        public a(y1e y1eVar) {
            this.f21696a = y1eVar;
        }

        public a a(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5848c4ad", new Object[]{this, l});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).a(l);
            }
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("f2ad8cb2", new Object[]{this});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).b();
            }
            return this;
        }

        public a c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("fa4de828", new Object[]{this, str});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).c(str);
            }
            return this;
        }

        public a d(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5bb15805", new Object[]{this, l});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).d(l);
            }
            return this;
        }

        public a e(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7d2bdae8", new Object[]{this, str});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).e(str);
            }
            return this;
        }

        public a f(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6cab2539", new Object[]{this, str, str2});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).f(str, str2);
            }
            return this;
        }

        public a g(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("5f44d9c6", new Object[]{this, l});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).g(l);
            }
            return this;
        }

        public a h(Long l) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6074fe1f", new Object[]{this, l});
            }
            y1e y1eVar = this.f21696a;
            if (y1eVar instanceof j10) {
                ((j10) y1eVar).h(l);
            }
            return this;
        }
    }

    static {
        t2o.a(614465740);
        t2o.a(297795617);
    }

    public abstract j10 a(Long l);

    public abstract j10 b();

    public abstract j10 c(String str);

    public abstract j10 d(Long l);

    public abstract j10 e(String str);

    public abstract j10 f(String str, String str2);

    public abstract j10 g(Long l);

    public abstract j10 h(Long l);
}
