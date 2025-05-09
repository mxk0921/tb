package com.taobao.android.fluid.framework.adapter.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.adapter.IMTopAdapter;
import com.taobao.android.layoutmanager.module.MtopModule;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a<T extends BaseOutDo> {

    /* renamed from: a  reason: collision with root package name */
    public final IMTOPDataObject f7765a;
    public final JSONObject b;
    public final IMTopAdapter.b<T> c;
    public final IMTopAdapter.a<T> d;
    public final Class<T> e;
    public final MtopModule.c f;
    public final boolean g;
    public final Map<String, String> h;
    public final MtopModule.d i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b<T extends BaseOutDo> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public MtopModule.d f7766a;
        public IMTOPDataObject b;
        public JSONObject c;
        public IMTopAdapter.b<T> d;
        public IMTopAdapter.a<T> e;
        public Class<T> f;
        public MtopModule.c g;
        public boolean h;
        public Map<String, String> i;
        public boolean j;

        static {
            t2o.a(468713840);
        }

        public static /* synthetic */ IMTOPDataObject a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMTOPDataObject) ipChange.ipc$dispatch("b8c793b6", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ JSONObject b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("ba973cff", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ IMTopAdapter.b c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMTopAdapter.b) ipChange.ipc$dispatch("35d98fdd", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ IMTopAdapter.a d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (IMTopAdapter.a) ipChange.ipc$dispatch("55eccd08", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ Class e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Class) ipChange.ipc$dispatch("e83a67cf", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ MtopModule.c f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MtopModule.c) ipChange.ipc$dispatch("ea047d21", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("e34b0ea8", new Object[]{bVar})).booleanValue();
            }
            return bVar.h;
        }

        public static /* synthetic */ boolean h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8ac6e869", new Object[]{bVar})).booleanValue();
            }
            return bVar.j;
        }

        public static /* synthetic */ Map i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("298b19db", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static <T extends BaseOutDo> b m() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("89233c1a", new Object[0]);
            }
            return new b();
        }

        public a<T> j() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("feff23c4", new Object[]{this});
            }
            return new a<>(this);
        }

        public b k(IMTopAdapter.b<T> bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9f5bfea", new Object[]{this, bVar});
            }
            this.d = bVar;
            return this;
        }

        public b l(Class<T> cls) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e3dc9a7f", new Object[]{this, cls});
            }
            this.f = cls;
            return this;
        }

        public b n(MtopModule.d dVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("bf9d2b5", new Object[]{this, dVar});
            }
            this.f7766a = dVar;
            return this;
        }

        public b o(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("32963a71", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public b p(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e275971a", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public b q(MtopModule.c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("378c184", new Object[]{this, cVar});
            }
            this.g = cVar;
            return this;
        }

        public b r(IMTopAdapter.a<T> aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("532341b", new Object[]{this, aVar});
            }
            this.e = aVar;
            return this;
        }

        public b s(IMTOPDataObject iMTOPDataObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9d12bf2b", new Object[]{this, iMTOPDataObject});
            }
            this.b = iMTOPDataObject;
            return this;
        }

        public b t(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a348a0", new Object[]{this, jSONObject});
            }
            this.c = jSONObject;
            return this;
        }

        public b u(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e80de5ae", new Object[]{this, str});
            }
            return this;
        }

        public b v(Map map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e7194e63", new Object[]{this, map});
            }
            this.i = map;
            return this;
        }
    }

    static {
        t2o.a(468713838);
    }

    public a(b<T> bVar) {
        this.f7765a = b.a(bVar);
        this.b = b.b(bVar);
        this.c = b.c(bVar);
        this.d = b.d(bVar);
        this.e = b.e(bVar);
        this.f = b.f(bVar);
        this.g = b.g(bVar);
        b.h(bVar);
        this.i = bVar.f7766a;
        this.h = b.i(bVar);
    }
}
