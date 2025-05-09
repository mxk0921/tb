package tb;

import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vkv implements p6e {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements z6e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ s6e f30077a;

        public a(vkv vkvVar, s6e s6eVar) {
            this.f30077a = s6eVar;
        }

        @Override // tb.z6e
        public String getBizType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
            }
            return this.f30077a.getBizType();
        }

        @Override // tb.z6e
        public String getFilePath() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1bcb7a22", new Object[]{this});
            }
            return this.f30077a.getFilePath();
        }

        @Override // tb.z6e
        public String getFileType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("105a7e2d", new Object[]{this});
            }
            return this.f30077a.getFileType();
        }

        @Override // tb.z6e
        public Map<String, String> getMetaInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("8d01c005", new Object[]{this});
            }
            return this.f30077a.getMetaInfo();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements mzd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ u6e f30078a;
        public final /* synthetic */ s6e b;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements v6e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ozd f30079a;

            public a(b bVar, ozd ozdVar) {
                this.f30079a = ozdVar;
            }

            public String a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("de71c0fc", new Object[]{this});
                }
                return this.f30079a.a();
            }
        }

        /* compiled from: Taobao */
        /* renamed from: tb.vkv$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class C1078b implements t6e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ ndt f30080a;

            public C1078b(b bVar, ndt ndtVar) {
                this.f30080a = ndtVar;
            }

            public String a() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("fa4e0476", new Object[]{this});
                }
                ndt ndtVar = this.f30080a;
                if (ndtVar != null) {
                    return ndtVar.f24666a;
                }
                return null;
            }

            public String b() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("ed0ac055", new Object[]{this});
                }
                ndt ndtVar = this.f30080a;
                if (ndtVar != null) {
                    return ndtVar.c;
                }
                return null;
            }

            public String c() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("89c81762", new Object[]{this});
                }
                ndt ndtVar = this.f30080a;
                if (ndtVar != null) {
                    return ndtVar.b;
                }
                return null;
            }
        }

        public b(vkv vkvVar, u6e u6eVar, s6e s6eVar) {
            this.f30078a = u6eVar;
            this.b = s6eVar;
        }

        @Override // tb.mzd
        public void onCancel(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7d021ed", new Object[]{this, z6eVar});
            } else {
                this.f30078a.d(this.b);
            }
        }

        @Override // tb.mzd
        public void onFailure(z6e z6eVar, ndt ndtVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7789334b", new Object[]{this, z6eVar, ndtVar});
            } else {
                this.f30078a.e(this.b, new C1078b(this, ndtVar));
            }
        }

        @Override // tb.mzd
        public void onPause(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c85aa60f", new Object[]{this, z6eVar});
            } else {
                this.f30078a.b(this.b);
            }
        }

        @Override // tb.mzd
        public void onProgress(z6e z6eVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34b23fa9", new Object[]{this, z6eVar, new Integer(i)});
            } else {
                this.f30078a.c(this.b, i);
            }
        }

        @Override // tb.mzd
        public void onResume(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e581d4da", new Object[]{this, z6eVar});
            } else {
                this.f30078a.g(this.b);
            }
        }

        @Override // tb.mzd
        public void onStart(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f33e623", new Object[]{this, z6eVar});
            } else {
                this.f30078a.h(this.b);
            }
        }

        @Override // tb.mzd
        public void onSuccess(z6e z6eVar, ozd ozdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("10b3127c", new Object[]{this, z6eVar, ozdVar});
            } else {
                this.f30078a.f(this.b, new a(this, ozdVar));
            }
        }

        @Override // tb.mzd
        public void onWait(z6e z6eVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e3e24ed2", new Object[]{this, z6eVar});
            } else {
                this.f30078a.a(this.b);
            }
        }
    }

    static {
        t2o.a(779092387);
        t2o.a(806355941);
    }

    @Override // tb.p6e
    public void a(s6e s6eVar, u6e u6eVar, Handler handler) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bdb77dfe", new Object[]{this, s6eVar, u6eVar, handler});
        } else {
            omv.a().uploadAsync(new a(this, s6eVar), new b(this, u6eVar, s6eVar), handler);
        }
    }
}
