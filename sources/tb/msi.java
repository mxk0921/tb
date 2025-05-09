package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.nsi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class msi implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ nsi.b f24272a;
    public final /* synthetic */ nsi b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f24273a;

        public a(Object obj) {
            this.f24273a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            msi.this.getClass();
            if (!nsi.b.a(null)) {
                msi.this.getClass();
                throw null;
            }
        }
    }

    public msi(nsi nsiVar, nsi.b bVar) {
        this.b = nsiVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
        } else if (!nsi.b.a(null)) {
            nsi.b.b(null);
            throw null;
        }
    }
}
