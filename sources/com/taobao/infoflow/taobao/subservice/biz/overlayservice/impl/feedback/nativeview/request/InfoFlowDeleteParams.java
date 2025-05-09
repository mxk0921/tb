package com.taobao.infoflow.taobao.subservice.biz.overlayservice.impl.feedback.nativeview.request;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class InfoFlowDeleteParams implements IMTOPDataObject {
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f10764a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;

        static {
            t2o.a(491782489);
        }

        public static /* synthetic */ String a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a016fb21", new Object[]{aVar});
            }
            return aVar.f10764a;
        }

        public static /* synthetic */ String b(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("aa2be900", new Object[]{aVar});
            }
            return aVar.b;
        }

        public static /* synthetic */ String c(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b440d6df", new Object[]{aVar});
            }
            return aVar.c;
        }

        public static /* synthetic */ int d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("891b3815", new Object[]{aVar})).intValue();
            }
            aVar.getClass();
            return 0;
        }

        public static /* synthetic */ String e(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c86ab29d", new Object[]{aVar});
            }
            return aVar.d;
        }

        public static /* synthetic */ String f(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d27fa07c", new Object[]{aVar});
            }
            return aVar.e;
        }

        public static /* synthetic */ String g(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc948e5b", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public static /* synthetic */ String h(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("e6a97c3a", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ String i(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f0be6a19", new Object[]{aVar});
            }
            aVar.getClass();
            return null;
        }

        public InfoFlowDeleteParams j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (InfoFlowDeleteParams) ipChange.ipc$dispatch("e9e78a60", new Object[]{this});
            }
            return new InfoFlowDeleteParams(this);
        }

        public a k(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("645c7d1", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public a l(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("aed7a25f", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public a m(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("1f970326", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public a n(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("31b6b806", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public a o(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("87400322", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public a p(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("80a4bc21", new Object[]{this, str});
            }
            this.f10764a = str;
            return this;
        }
    }

    static {
        t2o.a(491782488);
        t2o.a(589299906);
    }

    public InfoFlowDeleteParams(a aVar) {
        this.userId = a.a(aVar);
        this.deleteParam = a.b(aVar);
        this.pos = a.c(aVar);
        this.tabIndex = a.d(aVar);
        this.pvid = a.e(aVar);
        this.templateName = a.f(aVar);
        this.reasonId = a.g(aVar);
        this.reasonArgs = a.h(aVar);
        this.lastResultVersion = a.i(aVar);
    }
}
