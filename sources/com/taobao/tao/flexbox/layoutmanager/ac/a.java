package com.taobao.tao.flexbox.layoutmanager.ac;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.flexbox.layoutmanager.module.NetModule;
import java.io.UnsupportedEncodingException;
import tb.o6c;
import tb.od0;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f11963a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements o6c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f11965a;
        public final /* synthetic */ c b;

        public b(a aVar, boolean[] zArr, c cVar) {
            this.f11965a = zArr;
            this.b = cVar;
        }

        @Override // tb.o6c.a
        public void a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e95dcb1", new Object[]{this, bArr});
                return;
            }
            boolean[] zArr = this.f11965a;
            if (!zArr[0]) {
                zArr[0] = true;
                c cVar = this.b;
                if (cVar != null) {
                    cVar.a(bArr);
                }
            }
        }

        @Override // tb.o6c.a
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            boolean[] zArr = this.f11965a;
            if (!zArr[0]) {
                zArr[0] = true;
                c cVar = this.b;
                if (cVar != null) {
                    cVar.onFailed();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void a(byte[] bArr);

        void onFailed();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
    }

    static {
        t2o.a(503316535);
    }

    public static synchronized a d() {
        synchronized (a.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b48f350f", new Object[0]);
            }
            if (f11963a == null) {
                f11963a = new a();
            }
            return f11963a;
        }
    }

    public void a(String str, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97f739c2", new Object[]{this, str, cVar});
        } else {
            c(str, true, cVar);
        }
    }

    public void b(String str, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80c608dc", new Object[]{this, str, dVar});
        } else {
            od0.D().l().b(str, new C0675a(this, new boolean[]{false}, dVar));
        }
    }

    public void c(String str, boolean z, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4f37940", new Object[]{this, str, new Boolean(z), cVar});
        } else {
            od0.D().l().c(str, z, new b(this, new boolean[]{false}, cVar));
        }
    }

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.flexbox.layoutmanager.ac.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0675a implements o6c.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean[] f11964a;
        public final /* synthetic */ d b;

        public C0675a(a aVar, boolean[] zArr, d dVar) {
            this.f11964a = zArr;
            this.b = dVar;
        }

        @Override // tb.o6c.a
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
                return;
            }
            boolean[] zArr = this.f11964a;
            if (!zArr[0]) {
                zArr[0] = true;
                d dVar = this.b;
                if (dVar != null) {
                    ((NetModule.a) dVar).a();
                }
            }
        }

        @Override // tb.o6c.a
        public void a(byte[] bArr) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5e95dcb1", new Object[]{this, bArr});
                return;
            }
            boolean[] zArr = this.f11964a;
            if (!zArr[0]) {
                zArr[0] = true;
                if (this.b != null) {
                    if (bArr != null) {
                        try {
                            str = new String(bArr, 0, bArr.length, "utf-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        ((NetModule.a) this.b).b(str);
                    }
                    str = null;
                    ((NetModule.a) this.b).b(str);
                }
            }
        }
    }
}
