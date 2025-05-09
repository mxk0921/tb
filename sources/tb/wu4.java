package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wu4 {
    public long browseNamespace;
    public long commentNamespace;
    public long dislikeNamespace;
    public boolean isDisLikeCount;
    public boolean isDisLikeStatus;
    public boolean isLikeCount;
    public boolean isLikeStatus;
    public long likeNamespace;
    public String[] targetIds;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f30924a;
        public String[] b;
        public long c;
        public long d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;

        static {
            t2o.a(817889321);
        }

        public static /* synthetic */ long access$000(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d6ead066", new Object[]{aVar})).longValue();
            }
            return aVar.f30924a;
        }

        public static /* synthetic */ String[] access$100(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String[]) ipChange.ipc$dispatch("3af795e0", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ long access$200(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d3acd824", new Object[]{aVar})).longValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ long access$300(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("520ddc03", new Object[]{aVar})).longValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ long access$400(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d06edfe2", new Object[]{aVar})).longValue();
            }
            return aVar.e;
        }

        public static /* synthetic */ boolean access$500(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4ecfe3d1", new Object[]{aVar})).booleanValue();
            }
            return aVar.f;
        }

        public static /* synthetic */ boolean access$600(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cd30e7b0", new Object[]{aVar})).booleanValue();
            }
            return aVar.g;
        }

        public static /* synthetic */ boolean access$700(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4b91eb8f", new Object[]{aVar})).booleanValue();
            }
            return aVar.h;
        }

        public static /* synthetic */ boolean access$800(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c9f2ef6e", new Object[]{aVar})).booleanValue();
            }
            return aVar.i;
        }

        public a setBrowseNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("4e0524c7", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setCommentNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("19bb0618", new Object[]{this, new Long(j)});
            }
            this.f30924a = j;
            return this;
        }

        public a setDisLikeCount(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cf822ada", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public a setDisLikeStatus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("bfce8f71", new Object[]{this, new Boolean(z)});
            }
            this.i = z;
            return this;
        }

        public a setDislikeNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("ef62785e", new Object[]{this, new Long(j)});
            }
            this.e = j;
            return this;
        }

        public a setLikeCount(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("256151f0", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public a setLikeNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("166d0094", new Object[]{this, new Long(j)});
            }
            this.d = j;
            return this;
        }

        public a setLikeStatus(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("25d44b1b", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public a setTargetIds(String[] strArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("e855a8ec", new Object[]{this, strArr});
            }
            this.b = strArr;
            return this;
        }
    }

    static {
        t2o.a(817889320);
    }

    public wu4(a aVar) {
        this.commentNamespace = a.access$000(aVar);
        this.targetIds = a.access$100(aVar);
        this.browseNamespace = a.access$200(aVar);
        this.likeNamespace = a.access$300(aVar);
        this.dislikeNamespace = a.access$400(aVar);
        this.isLikeCount = a.access$500(aVar);
        this.isLikeStatus = a.access$600(aVar);
        this.isDisLikeCount = a.access$700(aVar);
        this.isDisLikeStatus = a.access$800(aVar);
    }
}
