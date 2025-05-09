package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.PhotoFrom;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import com.taobao.search.mmd.rebuild.PageRebuildModelMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import tb.zmf;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class smf {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EXTRA_IRP_REBUILD_TOKEN = "irp_rebuild_token";

    /* renamed from: a  reason: collision with root package name */
    public PhotoFrom f28146a;
    public Uri b;
    public int c;
    public Map<String, String> d;
    public Map<String, String> e;
    public Bitmap f;
    public List<RectF> g;
    public List<zmf.a> h;
    public Map<String, String> i;
    public nmf j;
    public Integer[] k;
    public static final a Companion = new a(null);
    public static final PageRebuildModelMap<String, smf> l = new PageRebuildModelMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297118);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final smf a(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (smf) ipChange.ipc$dispatch("c69c57e3", new Object[]{this, str});
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            return (smf) smf.a().remove(str);
        }

        @JvmStatic
        public final smf b(IrpDatasource irpDatasource) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (smf) ipChange.ipc$dispatch("df705f65", new Object[]{this, irpDatasource});
            }
            ckf.g(irpDatasource, "datasource");
            smf smfVar = new smf(null);
            smfVar.t(irpDatasource.B());
            smfVar.w(irpDatasource.K());
            smfVar.v(irpDatasource.J());
            smfVar.s(irpDatasource.A());
            smfVar.n(irpDatasource.m());
            smfVar.u(irpDatasource.I());
            smfVar.o(irpDatasource.n());
            smfVar.m(irpDatasource.l());
            smfVar.q(irpDatasource.q());
            smfVar.r(irpDatasource.s());
            smfVar.p(irpDatasource.o());
            return smfVar;
        }

        @JvmStatic
        public final smf c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (smf) ipChange.ipc$dispatch("868c1525", new Object[]{this, str});
            }
            if (str == null || str.length() == 0) {
                return null;
            }
            return (smf) smf.a().remove(str);
        }

        @JvmStatic
        public final boolean d(String str, smf smfVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b5015fd", new Object[]{this, str, smfVar})).booleanValue();
            }
            if (str == null || str.length() == 0) {
                return false;
            }
            if (smfVar == null) {
                smf.a().remove(str);
            } else {
                smf.a().put(str, smfVar);
            }
            return true;
        }

        public a() {
        }
    }

    static {
        t2o.a(481297117);
    }

    public /* synthetic */ smf(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ PageRebuildModelMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PageRebuildModelMap) ipChange.ipc$dispatch("4c87a0c8", new Object[0]);
        }
        return l;
    }

    public final List<RectF> b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b2613698", new Object[]{this});
        }
        return this.g;
    }

    public final Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3efbbbc2", new Object[]{this});
        }
        return this.e;
    }

    public final Integer[] d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer[]) ipChange.ipc$dispatch("59499961", new Object[]{this});
        }
        return this.k;
    }

    public final nmf e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nmf) ipChange.ipc$dispatch("cdf00b22", new Object[]{this});
        }
        return this.j;
    }

    public final List<zmf.a> f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("3fe3cec6", new Object[]{this});
        }
        return this.h;
    }

    public final Map<String, String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("df061062", new Object[]{this});
        }
        return this.i;
    }

    public final Map<String, String> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f10013f8", new Object[]{this});
        }
        return this.d;
    }

    public final PhotoFrom i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PhotoFrom) ipChange.ipc$dispatch("22177411", new Object[]{this});
        }
        return this.f28146a;
    }

    public final Bitmap j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8f7181a6", new Object[]{this});
        }
        return this.f;
    }

    public final int k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("14b458f8", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public final Uri l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Uri) ipChange.ipc$dispatch("24b0efd8", new Object[]{this});
        }
        return this.b;
    }

    public final void m(List<RectF> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8737c34", new Object[]{this, list});
        } else {
            this.g = list;
        }
    }

    public final void n(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b34080c", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.e = map;
    }

    public final void o(Integer[] numArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8116cc65", new Object[]{this, numArr});
        } else {
            this.k = numArr;
        }
    }

    public final void p(nmf nmfVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54210652", new Object[]{this, nmfVar});
        } else {
            this.j = nmfVar;
        }
    }

    public final void q(List<zmf.a> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f00e9dc6", new Object[]{this, list});
        } else {
            this.h = list;
        }
    }

    public final void r(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b88ed404", new Object[]{this, map});
        } else {
            this.i = map;
        }
    }

    public final void s(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70906a96", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.d = map;
    }

    public final void t(PhotoFrom photoFrom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ff88ba9", new Object[]{this, photoFrom});
            return;
        }
        ckf.g(photoFrom, "<set-?>");
        this.f28146a = photoFrom;
    }

    public final void u(Bitmap bitmap) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb2d0b72", new Object[]{this, bitmap});
        } else {
            this.f = bitmap;
        }
    }

    public final void v(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cba39312", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final void w(Uri uri) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d51e73a", new Object[]{this, uri});
        } else {
            this.b = uri;
        }
    }

    public smf() {
        this.f28146a = PhotoFrom.Values.UNKNOWN;
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
    }
}
