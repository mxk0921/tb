package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.sf.context.CommonSearchContext;
import com.taobao.search.sf.datasource.CommonSearchResult;
import com.taobao.search.sf.widgets.searchbar.SearchBarTagBean;
import java.util.ArrayList;
import kotlin.jvm.JvmStatic;
import tb.xll;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class bol {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final CommonSearchContext f16512a;
    public final xll b;
    public final ArrayList<SearchBarTagBean> c;
    public final boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792557);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        @JvmStatic
        public final bol a(CommonSearchContext commonSearchContext, g1i g1iVar, g1i g1iVar2, ArrayList<SearchBarTagBean> arrayList, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (bol) ipChange.ipc$dispatch("10ea3ea4", new Object[]{this, commonSearchContext, g1iVar, g1iVar2, arrayList, new Boolean(z)});
            }
            ckf.g(commonSearchContext, "searchContext");
            ckf.g(g1iVar, "initDatasource");
            ckf.g(g1iVar2, "currentDatasource");
            CommonSearchResult commonSearchResult = (CommonSearchResult) g1iVar2.getTotalSearchResult();
            if (commonSearchResult != null) {
                CommonSearchResult commonSearchResult2 = (CommonSearchResult) g1iVar.getTotalSearchResult();
                commonSearchResult.setTabs(commonSearchResult2 != null ? commonSearchResult2.getTabs() : null);
            }
            xll.a aVar = xll.Companion;
            return new bol(commonSearchContext, aVar.a(g1iVar), aVar.a(g1iVar2), arrayList, z);
        }

        public a() {
        }
    }

    static {
        t2o.a(815792556);
    }

    public bol(CommonSearchContext commonSearchContext, xll xllVar, xll xllVar2, ArrayList<SearchBarTagBean> arrayList, boolean z) {
        ckf.g(xllVar, "rebuildInitDSRecord");
        ckf.g(xllVar2, "rebuildCurrentDSRecord");
        this.f16512a = commonSearchContext;
        this.b = xllVar2;
        this.c = arrayList;
        this.d = z;
    }

    @JvmStatic
    public static final bol a(CommonSearchContext commonSearchContext, g1i g1iVar, g1i g1iVar2, ArrayList<SearchBarTagBean> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bol) ipChange.ipc$dispatch("10ea3ea4", new Object[]{commonSearchContext, g1iVar, g1iVar2, arrayList, new Boolean(z)});
        }
        return Companion.a(commonSearchContext, g1iVar, g1iVar2, arrayList, z);
    }

    public final xll b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xll) ipChange.ipc$dispatch("3b594288", new Object[]{this});
        }
        return this.b;
    }

    public final ArrayList<SearchBarTagBean> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("fc8ebe2e", new Object[]{this});
        }
        return this.c;
    }

    public final CommonSearchContext d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CommonSearchContext) ipChange.ipc$dispatch("8a092ea8", new Object[]{this});
        }
        return this.f16512a;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f594de2", new Object[]{this})).booleanValue();
        }
        return this.d;
    }
}
