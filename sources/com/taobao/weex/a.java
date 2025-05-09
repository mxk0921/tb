package com.taobao.weex;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.adapter.ClassLoaderAdapter;
import com.taobao.weex.adapter.IDrawableLoader;
import com.taobao.weex.adapter.IWXFoldDeviceAdapter;
import com.taobao.weex.adapter.IWXHttpAdapter;
import com.taobao.weex.adapter.IWXImgLoaderAdapter;
import com.taobao.weex.adapter.IWXJSExceptionAdapter;
import com.taobao.weex.adapter.IWXJsFileLoaderAdapter;
import com.taobao.weex.adapter.IWXJscProcessManager;
import com.taobao.weex.adapter.IWXSoLoaderAdapter;
import com.taobao.weex.adapter.IWXUserTrackAdapter;
import com.taobao.weex.adapter.URIAdapter;
import java.util.LinkedList;
import java.util.List;
import tb.dgb;
import tb.ebe;
import tb.t2o;
import tb.ube;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public IWXHttpAdapter f14133a;
    public IDrawableLoader b;
    public IWXImgLoaderAdapter c;
    public IWXUserTrackAdapter d;
    public com.taobao.weex.appfram.storage.b e;
    public IWXSoLoaderAdapter f;
    public URIAdapter g;
    public ube h;
    public IWXJSExceptionAdapter i;
    public String j;
    public ClassLoaderAdapter k;
    public dgb l;
    public IWXJsFileLoaderAdapter m;
    public IWXJscProcessManager n;
    public IWXFoldDeviceAdapter o;
    public ebe p;
    public List<String> q;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public IWXHttpAdapter f14134a;
        public IWXImgLoaderAdapter b;
        public IDrawableLoader c;
        public IWXUserTrackAdapter d;
        public com.taobao.weex.appfram.storage.b e;
        public URIAdapter f;
        public IWXJSExceptionAdapter g;
        public String h;
        public ube i;
        public dgb j;
        public IWXJsFileLoaderAdapter k;
        public IWXFoldDeviceAdapter l;
        public final List<String> m = new LinkedList();
        public IWXJscProcessManager n;

        static {
            t2o.a(985661447);
        }

        public b a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f1e0ba0d", new Object[]{this, str});
            }
            ((LinkedList) this.m).add(str);
            return this;
        }

        public a b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("985a7e43", new Object[]{this});
            }
            a aVar = new a();
            a.b(aVar, this.f14134a);
            a.j(aVar, this.b);
            a.k(aVar, this.c);
            a.l(aVar, this.d);
            a.m(aVar, this.e);
            a.n(aVar, null);
            a.o(aVar, this.h);
            a.p(aVar, this.f);
            a.q(aVar, this.i);
            a.a(aVar, this.g);
            a.c(aVar, null);
            a.d(aVar, this.j);
            a.e(aVar, this.k);
            a.f(aVar, this.n);
            a.g(aVar, this.m);
            a.h(aVar, this.l);
            a.i(aVar, null);
            return aVar;
        }

        public b c(dgb dgbVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d0f6abec", new Object[]{this, dgbVar});
            }
            this.j = dgbVar;
            return this;
        }

        public b d(IDrawableLoader iDrawableLoader) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dbab23f9", new Object[]{this, iDrawableLoader});
            }
            this.c = iDrawableLoader;
            return this;
        }

        public b e(IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("adae1d9e", new Object[]{this, iWXFoldDeviceAdapter});
            }
            this.l = iWXFoldDeviceAdapter;
            return this;
        }

        public b f(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4a2f5f4", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b g(IWXHttpAdapter iWXHttpAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("373d71be", new Object[]{this, iWXHttpAdapter});
            }
            this.f14134a = iWXHttpAdapter;
            return this;
        }

        public b h(IWXImgLoaderAdapter iWXImgLoaderAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8c8fe63d", new Object[]{this, iWXImgLoaderAdapter});
            }
            this.b = iWXImgLoaderAdapter;
            return this;
        }

        public b i(IWXJSExceptionAdapter iWXJSExceptionAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f318dd8a", new Object[]{this, iWXJSExceptionAdapter});
            }
            this.g = iWXJSExceptionAdapter;
            return this;
        }

        public b j(IWXJsFileLoaderAdapter iWXJsFileLoaderAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("965747be", new Object[]{this, iWXJsFileLoaderAdapter});
            }
            this.k = iWXJsFileLoaderAdapter;
            return this;
        }

        public b k(IWXJscProcessManager iWXJscProcessManager) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c7cdad9e", new Object[]{this, iWXJscProcessManager});
            }
            this.n = iWXJscProcessManager;
            return this;
        }

        public b l(com.taobao.weex.appfram.storage.b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("528a5f56", new Object[]{this, bVar});
            }
            this.e = bVar;
            return this;
        }

        public b m(URIAdapter uRIAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("178260e4", new Object[]{this, uRIAdapter});
            }
            this.f = uRIAdapter;
            return this;
        }

        public b n(IWXUserTrackAdapter iWXUserTrackAdapter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5eb0ed53", new Object[]{this, iWXUserTrackAdapter});
            }
            this.d = iWXUserTrackAdapter;
            return this;
        }

        public b o(ube ubeVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("8af5a6dd", new Object[]{this, ubeVar});
            }
            this.i = ubeVar;
            return this;
        }
    }

    static {
        t2o.a(985661445);
    }

    public static /* synthetic */ IWXJSExceptionAdapter a(a aVar, IWXJSExceptionAdapter iWXJSExceptionAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJSExceptionAdapter) ipChange.ipc$dispatch("39cfe658", new Object[]{aVar, iWXJSExceptionAdapter});
        }
        aVar.i = iWXJSExceptionAdapter;
        return iWXJSExceptionAdapter;
    }

    public static /* synthetic */ IWXHttpAdapter b(a aVar, IWXHttpAdapter iWXHttpAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter) ipChange.ipc$dispatch("c762e17a", new Object[]{aVar, iWXHttpAdapter});
        }
        aVar.f14133a = iWXHttpAdapter;
        return iWXHttpAdapter;
    }

    public static /* synthetic */ ClassLoaderAdapter c(a aVar, ClassLoaderAdapter classLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoaderAdapter) ipChange.ipc$dispatch("7f242a8b", new Object[]{aVar, classLoaderAdapter});
        }
        aVar.k = classLoaderAdapter;
        return classLoaderAdapter;
    }

    public static /* synthetic */ dgb d(a aVar, dgb dgbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgb) ipChange.ipc$dispatch("618088fe", new Object[]{aVar, dgbVar});
        }
        aVar.l = dgbVar;
        return dgbVar;
    }

    public static /* synthetic */ IWXJsFileLoaderAdapter e(a aVar, IWXJsFileLoaderAdapter iWXJsFileLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("6293f929", new Object[]{aVar, iWXJsFileLoaderAdapter});
        }
        aVar.m = iWXJsFileLoaderAdapter;
        return iWXJsFileLoaderAdapter;
    }

    public static /* synthetic */ IWXJscProcessManager f(a aVar, IWXJscProcessManager iWXJscProcessManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJscProcessManager) ipChange.ipc$dispatch("1bb1db68", new Object[]{aVar, iWXJscProcessManager});
        }
        aVar.n = iWXJscProcessManager;
        return iWXJscProcessManager;
    }

    public static /* synthetic */ List g(a aVar, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("23284ea7", new Object[]{aVar, list});
        }
        aVar.q = list;
        return list;
    }

    public static /* synthetic */ IWXFoldDeviceAdapter h(a aVar, IWXFoldDeviceAdapter iWXFoldDeviceAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("77ef5aa6", new Object[]{aVar, iWXFoldDeviceAdapter});
        }
        aVar.o = iWXFoldDeviceAdapter;
        return iWXFoldDeviceAdapter;
    }

    public static /* synthetic */ ebe i(a aVar, ebe ebeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebe) ipChange.ipc$dispatch("8e58245", new Object[]{aVar, ebeVar});
        }
        aVar.p = ebeVar;
        return ebeVar;
    }

    public static /* synthetic */ IWXImgLoaderAdapter j(a aVar, IWXImgLoaderAdapter iWXImgLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("7c88c985", new Object[]{aVar, iWXImgLoaderAdapter});
        }
        aVar.c = iWXImgLoaderAdapter;
        return iWXImgLoaderAdapter;
    }

    public static /* synthetic */ IDrawableLoader k(a aVar, IDrawableLoader iDrawableLoader) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDrawableLoader) ipChange.ipc$dispatch("68c41df6", new Object[]{aVar, iDrawableLoader});
        }
        aVar.b = iDrawableLoader;
        return iDrawableLoader;
    }

    public static /* synthetic */ IWXUserTrackAdapter l(a aVar, IWXUserTrackAdapter iWXUserTrackAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXUserTrackAdapter) ipChange.ipc$dispatch("975d07d7", new Object[]{aVar, iWXUserTrackAdapter});
        }
        aVar.d = iWXUserTrackAdapter;
        return iWXUserTrackAdapter;
    }

    public static /* synthetic */ com.taobao.weex.appfram.storage.b m(a aVar, com.taobao.weex.appfram.storage.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("291b5940", new Object[]{aVar, bVar});
        }
        aVar.e = bVar;
        return bVar;
    }

    public static /* synthetic */ IWXSoLoaderAdapter n(a aVar, IWXSoLoaderAdapter iWXSoLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXSoLoaderAdapter) ipChange.ipc$dispatch("bc3ca275", new Object[]{aVar, iWXSoLoaderAdapter});
        }
        aVar.f = iWXSoLoaderAdapter;
        return iWXSoLoaderAdapter;
    }

    public static /* synthetic */ String o(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1bc7954", new Object[]{aVar, str});
        }
        aVar.j = str;
        return str;
    }

    public static /* synthetic */ URIAdapter p(a aVar, URIAdapter uRIAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("65b6f393", new Object[]{aVar, uRIAdapter});
        }
        aVar.g = uRIAdapter;
        return uRIAdapter;
    }

    public static /* synthetic */ ube q(a aVar, ube ubeVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ube) ipChange.ipc$dispatch("617b8232", new Object[]{aVar, ubeVar});
        }
        aVar.h = ubeVar;
        return ubeVar;
    }

    public IWXJsFileLoaderAdapter A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJsFileLoaderAdapter) ipChange.ipc$dispatch("66c27bd5", new Object[]{this});
        }
        return this.m;
    }

    public IWXJscProcessManager B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJscProcessManager) ipChange.ipc$dispatch("e9eb7853", new Object[]{this});
        }
        return this.n;
    }

    public Iterable<String> C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Iterable) ipChange.ipc$dispatch("9433f6cc", new Object[]{this});
        }
        if (this.q == null) {
            this.q = new LinkedList();
        }
        return this.q;
    }

    public ebe D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ebe) ipChange.ipc$dispatch("79a391fa", new Object[]{this});
        }
        return this.p;
    }

    public com.taobao.weex.appfram.storage.b E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.weex.appfram.storage.b) ipChange.ipc$dispatch("ed4d5ca9", new Object[]{this});
        }
        return this.e;
    }

    public URIAdapter F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (URIAdapter) ipChange.ipc$dispatch("348c27a7", new Object[]{this});
        }
        return this.g;
    }

    public IWXUserTrackAdapter G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXUserTrackAdapter) ipChange.ipc$dispatch("5e86ff94", new Object[]{this});
        }
        return this.d;
    }

    public ube H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ube) ipChange.ipc$dispatch("9600c460", new Object[]{this});
        }
        return this.h;
    }

    public a I(ClassLoaderAdapter classLoaderAdapter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("8a11787b", new Object[]{this, classLoaderAdapter});
        }
        this.k = classLoaderAdapter;
        return this;
    }

    public dgb r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (dgb) ipChange.ipc$dispatch("c61b53c9", new Object[]{this});
        }
        return this.l;
    }

    public ClassLoaderAdapter s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ClassLoaderAdapter) ipChange.ipc$dispatch("85275ee5", new Object[]{this});
        }
        return this.k;
    }

    public IDrawableLoader t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDrawableLoader) ipChange.ipc$dispatch("e8074480", new Object[]{this});
        }
        return this.b;
    }

    public IWXFoldDeviceAdapter u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXFoldDeviceAdapter) ipChange.ipc$dispatch("b494f53", new Object[]{this});
        }
        return this.o;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7ef828b1", new Object[]{this});
        }
        return this.j;
    }

    public IWXHttpAdapter w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXHttpAdapter) ipChange.ipc$dispatch("956dba35", new Object[]{this});
        }
        return this.f14133a;
    }

    public IWXSoLoaderAdapter x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXSoLoaderAdapter) ipChange.ipc$dispatch("3a634c81", new Object[]{this});
        }
        return this.f;
    }

    public IWXImgLoaderAdapter y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXImgLoaderAdapter) ipChange.ipc$dispatch("9254c012", new Object[]{this});
        }
        return this.c;
    }

    public IWXJSExceptionAdapter z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IWXJSExceptionAdapter) ipChange.ipc$dispatch("d0ebf17f", new Object[]{this});
        }
        return this.i;
    }

    public a() {
    }
}
