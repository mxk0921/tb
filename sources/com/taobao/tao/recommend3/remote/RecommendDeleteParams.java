package com.taobao.tao.recommend3.remote;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class RecommendDeleteParams implements IMTOPDataObject {
    public String deleteParam;
    public String lastResultVersion;
    public String pos;
    public String pvid;
    public String reasonArgs;
    public String reasonId;
    public int tabIndex;
    public String templateName;
    public String userId;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f12661a;
        public String b;
        public String c;
        public int d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;

        static {
            t2o.a(729809865);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9d2225ed", new Object[]{bVar});
            }
            return bVar.f12661a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ff7d3ccc", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("61d853ab", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4d8b90c9", new Object[]{bVar})).intValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("268e8169", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("88e99848", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("eb44af27", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("4d9fc606", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("affadce5", new Object[]{bVar});
            }
            return bVar.i;
        }

        public RecommendDeleteParams j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (RecommendDeleteParams) ipChange.ipc$dispatch("ce898014", new Object[]{this});
            }
            return new RecommendDeleteParams(this);
        }

        public b k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("71672185", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("82c5b382", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public b m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("921ffe13", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5a635fda", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b88734ba", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1bba40bc", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("45c2aa79", new Object[]{this, new Integer(i)});
            }
            if (i >= 0) {
                this.d = i;
            }
            return this;
        }

        public b r(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("2a1883d6", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b s(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c43f45d5", new Object[]{this, str});
            }
            this.f12661a = str;
            return this;
        }
    }

    static {
        t2o.a(729809863);
        t2o.a(589299906);
    }

    private RecommendDeleteParams(b bVar) {
        this.userId = b.a(bVar);
        this.deleteParam = b.b(bVar);
        this.pos = b.c(bVar);
        this.tabIndex = b.d(bVar);
        this.pvid = b.e(bVar);
        this.templateName = b.f(bVar);
        this.reasonId = b.g(bVar);
        this.reasonArgs = b.h(bVar);
        this.lastResultVersion = b.i(bVar);
    }
}
