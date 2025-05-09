package com.taobao.informationflowdataservice.dataservice.bizcode.remote;

import com.android.alibaba.ip.runtime.IpChange;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(487587848);
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1d6eeb53", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7cdec632", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dc4ea111", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5878aea3", new Object[]{bVar})).intValue();
            }
            throw null;
        }

        public static /* synthetic */ String e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("9b2e56cf", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("fa9e31ae", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("5a0e0c8d", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b97de76c", new Object[]{bVar});
            }
            throw null;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("18edc24b", new Object[]{bVar});
            }
            throw null;
        }
    }

    static {
        t2o.a(487587846);
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
