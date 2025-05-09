package tb;

import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class sgv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_PAGE_BUY = "purchase";
    public static final String BIZ_PAGE_CART = "cart";
    public static final String BIZ_PAGE_ORDER_LIST = "orderList";
    public static final sgv INSTANCE = new sgv();

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28046a;
        public final /* synthetic */ ArrayList b;

        public b(String str, ArrayList arrayList) {
            this.f28046a = str;
            this.b = arrayList;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                sgv.a(sgv.INSTANCE, this.f28046a, this.b);
            }
        }
    }

    static {
        t2o.a(157286915);
    }

    public static final /* synthetic */ void a(sgv sgvVar, String str, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7fbb32", new Object[]{sgvVar, str, arrayList});
        } else {
            sgvVar.e(str, arrayList);
        }
    }

    public static final /* synthetic */ void b(sgv sgvVar, RecyclerView recyclerView, rgv rgvVar, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2277cdeb", new Object[]{sgvVar, recyclerView, rgvVar, arrayList});
        } else {
            sgvVar.g(recyclerView, rgvVar, arrayList);
        }
    }

    @JvmStatic
    public static final void c(String str, ViewGroup viewGroup, RecyclerView recyclerView, ViewGroup viewGroup2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3b2f9290", new Object[]{str, viewGroup, recyclerView, viewGroup2});
            return;
        }
        ckf.g(str, "bizName");
        pav.k(new a(str, viewGroup, recyclerView, viewGroup2));
    }

    @JvmStatic
    public static final void d(String str, ArrayList<Pair<String, DXRootView>> arrayList, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0706572", new Object[]{str, arrayList, new Boolean(z)});
            return;
        }
        ckf.g(str, "bizName");
        if (z) {
            pav.k(new b(str, arrayList));
        } else {
            INSTANCE.e(str, arrayList);
        }
    }

    @JvmStatic
    public static final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b123660", new Object[]{str})).booleanValue();
        }
        ckf.g(str, "bizName");
        return rgv.b(str);
    }

    @JvmStatic
    public static final void h(rgv rgvVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5bff0d1", new Object[]{rgvVar, str});
            return;
        }
        ckf.g(rgvVar, "monitor");
        ckf.g(str, "pageUrl");
        rgvVar.e(str);
    }

    @JvmStatic
    public static final void i(rgv rgvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b71bf630", new Object[]{rgvVar});
            return;
        }
        ckf.g(rgvVar, "monitor");
        rgvVar.q();
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f28045a;
        public final /* synthetic */ ViewGroup b;
        public final /* synthetic */ RecyclerView c;
        public final /* synthetic */ ViewGroup d;

        public a(String str, ViewGroup viewGroup, RecyclerView recyclerView, ViewGroup viewGroup2) {
            this.f28045a = str;
            this.b = viewGroup;
            this.c = recyclerView;
            this.d = viewGroup2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            String str;
            int i;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                rgv rgvVar = new rgv();
                rgvVar.q();
                if (!rgvVar.a(this.f28045a)) {
                    hav.g("UnexpectedReachMonitorUtil", "checkUnexpectedReach:", this.f28045a + " not hit orange");
                } else if ((this.b instanceof ViewGroup) || (this.c instanceof RecyclerView) || (this.d instanceof ViewGroup)) {
                    ArrayList arrayList = new ArrayList();
                    ViewGroup viewGroup = this.b;
                    if (viewGroup instanceof ViewGroup) {
                        rgvVar.f(viewGroup, arrayList);
                    }
                    RecyclerView recyclerView = this.c;
                    if (recyclerView instanceof RecyclerView) {
                        sgv.b(sgv.INSTANCE, recyclerView, rgvVar, arrayList);
                    }
                    ViewGroup viewGroup2 = this.d;
                    if (viewGroup2 instanceof ViewGroup) {
                        rgvVar.f(viewGroup2, arrayList);
                    }
                    if (arrayList.isEmpty()) {
                        rgvVar.o("页面无DX组件");
                        rgvVar.p(false);
                        rgvVar.d(this.f28045a);
                        return;
                    }
                    ArrayList arrayList2 = new ArrayList();
                    List<String> j = rgvVar.j(this.f28045a);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        DXRootView dXRootView = (DXRootView) it.next();
                        ckf.f(dXRootView, "dxItemView");
                        boolean z = dXRootView.getHeight() > 0;
                        boolean z2 = dXRootView.getChildCount() > 0;
                        if (!z || !z2) {
                            List<String> list = j;
                            if (list != null && !list.isEmpty()) {
                                String m = rgvVar.m(dXRootView);
                                ckf.f(m, "monitor.getTag(dxItemView)");
                                if (j.contains(m)) {
                                    DXTemplateItem dxTemplateItem = dXRootView.getDxTemplateItem();
                                    if (dxTemplateItem == null || (str = dxTemplateItem.f7343a) == null) {
                                        str = "default";
                                    }
                                    DXTemplateItem dxTemplateItem2 = dXRootView.getDxTemplateItem();
                                    if (dxTemplateItem2 != null) {
                                        i = Long.valueOf(dxTemplateItem2.b);
                                    } else {
                                        i = -1;
                                    }
                                    rgvVar.o("黑名单中的DX组件渲染失败-tag:" + m + "-name:" + str + "-version:" + i + "-height:" + z + "-children:" + z2);
                                    rgvVar.p(false);
                                    rgvVar.d(this.f28045a);
                                    return;
                                }
                            }
                        } else {
                            arrayList2.add(dXRootView);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        rgvVar.o("所有DX组件渲染失败");
                        rgvVar.p(false);
                        rgvVar.d(this.f28045a);
                        return;
                    }
                    rgvVar.p(true);
                    rgvVar.d(this.f28045a);
                } else {
                    rgvVar.o("页面无元素");
                    rgvVar.p(false);
                    rgvVar.d(this.f28045a);
                }
            } catch (Throwable th) {
                hav.g("UnexpectedReachMonitorUtil", "checkUnexpectedReach:", this.f28045a + " throwable " + th);
            }
        }
    }

    public final void g(RecyclerView recyclerView, rgv rgvVar, ArrayList<DXRootView> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58662a86", new Object[]{this, recyclerView, rgvVar, arrayList});
        } else if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
            RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
                int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
                if (findFirstVisibleItemPosition >= 0 && findLastVisibleItemPosition >= 0 && findLastVisibleItemPosition >= findFirstVisibleItemPosition) {
                    ArrayList arrayList2 = new ArrayList();
                    if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                        while (true) {
                            RecyclerView.ViewHolder findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(findFirstVisibleItemPosition);
                            View view = findViewHolderForLayoutPosition != null ? findViewHolderForLayoutPosition.itemView : null;
                            if (view != null && !(view instanceof RecyclerView)) {
                                arrayList2.add(view);
                            }
                            if (findFirstVisibleItemPosition == findLastVisibleItemPosition) {
                                break;
                            }
                            findFirstVisibleItemPosition++;
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            rgvVar.f((View) it.next(), arrayList);
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x013f, code lost:
        r0 = "页面无元素";
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(java.lang.String r17, java.util.ArrayList<android.util.Pair<java.lang.String, com.taobao.android.dinamicx.DXRootView>> r18) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.sgv.e(java.lang.String, java.util.ArrayList):void");
    }
}
