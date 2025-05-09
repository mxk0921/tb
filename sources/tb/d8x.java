package tb;

import com.android.alibaba.ip.runtime.IpChange;
import tb.c8x;
import tb.rpc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class d8x implements c8x {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements rpc.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ c8x.a f17654a;

        public a(d8x d8xVar, c8x.a aVar) {
            this.f17654a = aVar;
        }

        @Override // tb.rpc.a
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("eb8b0117", new Object[]{this, str, str2});
            } else {
                this.f17654a.a(str, str2);
            }
        }

        @Override // tb.rpc.a
        public void b(rpc.c cVar) {
            c cVar2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c8af2ef", new Object[]{this, cVar});
                return;
            }
            c8x.a aVar = this.f17654a;
            if (cVar == null) {
                cVar2 = null;
            } else {
                cVar2 = new c(cVar.d(), cVar.f(), cVar.h());
            }
            aVar.b(cVar2);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static final d8x INS = new d8x();

        static {
            t2o.a(982515813);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class c implements c8x.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17655a;

        static {
            t2o.a(982515814);
            t2o.a(982515810);
        }

        public c(byte[] bArr, String str, boolean z) {
            this.f17655a = str;
        }

        public String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f17655a;
        }
    }

    static {
        t2o.a(982515811);
        t2o.a(982515807);
    }

    public static d8x b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d8x) ipChange.ipc$dispatch("204278f7", new Object[0]);
        }
        return b.INS;
    }

    @Override // tb.c8x
    public void a(c8x.b bVar, c8x.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d1cb738", new Object[]{this, bVar, aVar});
        } else {
            gxh.o().b(bVar.b(), null, bVar.a(), bVar.c(), null, new a(this, aVar));
        }
    }
}
