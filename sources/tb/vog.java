package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class vog {
    public String namespace;
    public String origin;
    public String targetCover;
    public String targetId;
    public String targetOwnerId;
    public String targetTitle;
    public String targetUrl;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f30140a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public String g;

        static {
            t2o.a(817889325);
        }

        public static /* synthetic */ String access$000(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("17e3fe5", new Object[]{aVar});
            }
            return aVar.f30140a;
        }

        public static /* synthetic */ String access$100(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("83c8f4c4", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String access$200(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("613a9a3", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String access$300(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("885e5e82", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ String access$400(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa91361", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String access$500(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8cf3c840", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String access$600(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f3e7d1f", new Object[]{aVar});
            }
            return aVar.g;
        }

        public a setNamespace(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("36d7890", new Object[]{this, str});
            }
            this.f30140a = str;
            return this;
        }

        public a setOrigin(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("305902e1", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public a setTargetCover(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("6479ffa5", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a setTargetId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("acba1fbb", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a setTargetOwnerId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("dc6011ce", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a setTargetTitle(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c9eab5a4", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setTargetUrl(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("b77941ad", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }
    }

    static {
        t2o.a(817889324);
    }

    public vog(a aVar) {
        this.namespace = a.access$000(aVar);
        this.targetCover = a.access$100(aVar);
        this.targetId = a.access$200(aVar);
        this.targetOwnerId = a.access$300(aVar);
        this.targetUrl = a.access$400(aVar);
        this.targetTitle = a.access$500(aVar);
        this.origin = a.access$600(aVar);
    }
}
