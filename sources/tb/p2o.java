package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class p2o {
    public String content;
    public String expandAttribute;
    public long namespace;
    public String picUrls;
    public long targetId;
    public long targetOwnerId;
    public long targetParentId;
    public String videoUrls;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f25841a;
        public long b;
        public long c;
        public long d;
        public String e;
        public String f;
        public String g;
        public String h;

        static {
            t2o.a(817889327);
        }

        public static /* synthetic */ long access$000(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9c0443cc", new Object[]{aVar})).longValue();
            }
            return aVar.f25841a;
        }

        public static /* synthetic */ long access$100(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9d3a96ab", new Object[]{aVar})).longValue();
            }
            return aVar.b;
        }

        public static /* synthetic */ long access$200(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9e70e98a", new Object[]{aVar})).longValue();
            }
            return aVar.c;
        }

        public static /* synthetic */ long access$300(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9fa73c69", new Object[]{aVar})).longValue();
            }
            return aVar.d;
        }

        public static /* synthetic */ String access$400(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("db2a77cc", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String access$500(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a2365ecd", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String access$600(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("694245ce", new Object[]{aVar});
            }
            return aVar.g;
        }

        public static /* synthetic */ String access$700(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("304e2ccf", new Object[]{aVar});
            }
            return aVar.h;
        }

        public a setContent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("7bdaf167", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a setExpandAttribute(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("cc7b2d50", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public a setNamespace(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("d8f38803", new Object[]{this, new Long(j)});
            }
            this.f25841a = j;
            return this;
        }

        public a setPicUrls(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("c17beabc", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a setTargetId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("3c11e52e", new Object[]{this, new Long(j)});
            }
            this.b = j;
            return this;
        }

        public a setTargetOwnerId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("30c5d41", new Object[]{this, new Long(j)});
            }
            this.d = j;
            return this;
        }

        public a setTargetParentId(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("389b5764", new Object[]{this, new Long(j)});
            }
            this.c = j;
            return this;
        }

        public a setVideoUrls(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1e7c54ed", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }
    }

    static {
        t2o.a(817889326);
    }

    public p2o(a aVar) {
        this.namespace = a.access$000(aVar);
        this.targetId = a.access$100(aVar);
        this.targetParentId = a.access$200(aVar);
        this.targetOwnerId = a.access$300(aVar);
        this.content = a.access$400(aVar);
        this.picUrls = a.access$500(aVar);
        this.videoUrls = a.access$600(aVar);
        this.expandAttribute = a.access$700(aVar);
    }
}
