package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class uog {
    public long namespace;
    public String origin;
    public String targetCover;
    public long targetId;
    public long targetOwnerId;
    public String targetTitle;
    public String targetUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f29534a;
        public long b;
        public long c;
        public String d;
        public String e;
        public String f;
        public String g;

        static {
            t2o.a(817889323);
        }

        public static /* synthetic */ long access$000(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3ad50009", new Object[]{aVar})).longValue();
            }
            return aVar.f29534a;
        }

        public static /* synthetic */ String access$100(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7628346c", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ long access$200(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6f0bfd47", new Object[]{aVar})).longValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ long access$300(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("89277be6", new Object[]{aVar})).longValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ String access$400(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1fab4e2f", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String access$500(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2d70170", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String access$600(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e602b4b1", new Object[]{aVar});
            }
            return aVar.g;
        }

        public a setNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bba97d80", new Object[]{this, new Long(j)});
            }
            this.f29534a = j;
            return this;
        }

        public a setOrigin(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6ef88fd5", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a setTargetCover(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6022ea91", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a setTargetId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6e83296b", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a setTargetOwnerId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4bd28a3e", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setTargetTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("10d3f8b2", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setTargetUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("deaf4789", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }
    }

    static {
        t2o.a(817889322);
    }

    public uog(a aVar) {
        this.namespace = a.access$000(aVar);
        this.targetCover = a.access$100(aVar);
        this.targetId = a.access$200(aVar);
        this.targetOwnerId = a.access$300(aVar);
        this.targetUrl = a.access$400(aVar);
        this.targetTitle = a.access$500(aVar);
        this.origin = a.access$600(aVar);
    }
}
