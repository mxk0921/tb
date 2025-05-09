package tb;

import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class g92 {

    /* renamed from: a  reason: collision with root package name */
    public final d f19793a;
    public final c b;
    public final e c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public d f19794a;
        public c b;
        public e c;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class a implements d {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a(b bVar) {
            }

            @Override // tb.g92.d
            public View a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (View) ipChange.ipc$dispatch("1ec4f6b9", new Object[]{this});
                }
                return null;
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.g92$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
        public class C0932b implements e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0932b(b bVar) {
            }

            public boolean a(exq exqVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return ((Boolean) ipChange.ipc$dispatch("73462628", new Object[]{this, exqVar})).booleanValue();
                }
                return false;
            }

            public void b(exq exqVar) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("49ec26e3", new Object[]{this, exqVar});
                }
            }
        }

        static {
            t2o.a(976224267);
        }

        public g92 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (g92) ipChange.ipc$dispatch("23d9d0ce", new Object[]{this});
            }
            if (this.f19794a == null) {
                this.f19794a = new a(this);
            }
            if (this.c == null) {
                this.c = new C0932b(this);
            }
            return new g92(this.f19794a, this.b, this.c);
        }

        public b b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8a6c7554", new Object[]{this, cVar});
            }
            this.b = cVar;
            return this;
        }

        public b c(d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d5e6000c", new Object[]{this, dVar});
            }
            this.f19794a = dVar;
            return this;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface c {
        void a(ljw ljwVar);

        void onClose();

        void onHide();

        void onShow();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface d {
        View a();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface e {
    }

    static {
        t2o.a(976224265);
    }

    public g92(d dVar, c cVar, e eVar) {
        this.f19793a = dVar;
        this.b = cVar;
        this.c = eVar;
    }
}
