package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.business.publishinsert.IPublishInsertService;
import com.taobao.android.fluid.business.videocollection.ICollectionService;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.card.ICardService;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.list.IFeedsListService;
import com.taobao.android.fluid.framework.preload.IUsePreloadService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import tb.kon;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class k58 implements n1c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f22410a;
    public final IDataService c;
    public final IFeedsListService d;
    public final ICollectionService e;
    public List<String> f;
    public final LinkedList<kon.h> b = new LinkedList<>();
    public int g = -1;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements dzb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.dzb
        public void onDetailRequestSuccess() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("91cae82b", new Object[]{this});
                return;
            }
            k58.b(k58.this, -1);
            ir9.b("DynamicRecommendManager", "[动态推荐]刷新，重置最大深度 mDynamicRecMaxPosition:" + k58.a(k58.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((IFeedsListService) k58.c(k58.this).getService(IFeedsListService.class)).preloadNext(((ICardService) k58.c(k58.this).getService(ICardService.class)).getActiveCard(), false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements sv2<kon.h> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        /* renamed from: b */
        public void a(kon.h hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3e07d958", new Object[]{this, hVar});
            } else if (hVar == null) {
                ir9.b("DynamicRecommendManager", "requestForCommendData onCall target==null");
            } else if (hVar.f) {
                ir9.b("DynamicRecommendManager", "requestForCommendData onCall target isDetailLoading");
            } else {
                if (((IFeedsListService) k58.c(k58.this).getService(IFeedsListService.class)).getRecyclerView().getScrollState() == 0) {
                    ((IDataService) k58.c(k58.this).getService(IDataService.class)).insertDetailListAtCurrent(hVar);
                } else {
                    k58.d(k58.this).addLast(hVar);
                }
                ir9.b("DynamicRecommendManager", "[动态推荐]动态推荐完成:" + hVar.g);
                if (hVar.c() && aps.r() && aps.u() && (!aps.K() || ((IUsePreloadService) k58.c(k58.this).getService(IUsePreloadService.class)).enableTab3UseCacheData())) {
                    LinkedList convertToMediaSetDataList = ((IDataService) k58.c(k58.this).getService(IDataService.class)).convertToMediaSetDataList(hVar.f22810a, hVar.c);
                    ejf.h(k58.c(k58.this), convertToMediaSetDataList);
                    ir9.b("DynamicRecommendManager", "[动态推荐]动态推荐完成插入cache:" + convertToMediaSetDataList.size());
                }
                if (hVar.c()) {
                    k58 k58Var = k58.this;
                    k58.b(k58Var, Math.max(k58.a(k58Var), ((IDataService) k58.c(k58.this).getService(IDataService.class)).getCurrentMediaPosition()));
                    ir9.b("DynamicRecommendManager", "[动态推荐]动态推荐完成 mDynamicRecMaxPosition:" + k58.a(k58.this));
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public final String f22414a;
        public final int b;
        public final List<com.taobao.android.fluid.framework.data.datamodel.a> c;

        static {
            t2o.a(468714283);
        }

        public d(int i, String str, List<com.taobao.android.fluid.framework.data.datamodel.a> list) {
            this.b = i;
            this.f22414a = str;
            this.c = list;
        }
    }

    static {
        t2o.a(468714279);
        t2o.a(468714284);
    }

    public k58(FluidContext fluidContext) {
        this.f22410a = fluidContext;
        this.e = (ICollectionService) fluidContext.getService(ICollectionService.class);
        IDataService iDataService = (IDataService) fluidContext.getService(IDataService.class);
        this.c = iDataService;
        this.d = (IFeedsListService) fluidContext.getService(IFeedsListService.class);
        iDataService.addDetailRequestSuccessListener(new a());
    }

    public static /* synthetic */ int a(k58 k58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d946e0fc", new Object[]{k58Var})).intValue();
        }
        return k58Var.g;
    }

    public static /* synthetic */ int b(k58 k58Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("21a53d0f", new Object[]{k58Var, new Integer(i)})).intValue();
        }
        k58Var.g = i;
        return i;
    }

    public static /* synthetic */ FluidContext c(k58 k58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("52f7b120", new Object[]{k58Var});
        }
        return k58Var.f22410a;
    }

    public static /* synthetic */ LinkedList d(k58 k58Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("11c75747", new Object[]{k58Var});
        }
        return k58Var.b;
    }

    @Override // tb.n1c
    public boolean dynamicRecommend(aon aonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a98b0ccb", new Object[]{this, aonVar})).booleanValue();
        }
        return f(aonVar, new c());
    }

    public final boolean e(aon aonVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4cdc8d8f", new Object[]{this, aonVar})).booleanValue();
        }
        if (!b93.C() && this.e.isCollectionScene()) {
            return false;
        }
        if (!b93.C() && ((IPublishInsertService) this.f22410a.getService(IPublishInsertService.class)).isPublishIInsertEnable()) {
            return false;
        }
        int j = this.c.getConfig().j().j();
        if (j > 0 && this.g >= 0) {
            int currentMediaPosition = this.c.getCurrentMediaPosition();
            if (currentMediaPosition - this.g < j) {
                ir9.b("DynamicRecommendManager", "[动态推荐] 动态推荐疲劳度限制。current:" + currentMediaPosition + " mDynamicRecMaxPosition:" + this.g + " inTimeRecMinGap:" + j);
                return false;
            }
        }
        if (this.c.getConfig().j().h || this.c.getConfig().j().M) {
            ir9.b("DynamicRecommendManager", "[动态推荐] 服务端下发，全局禁用动态推荐 ");
            return false;
        } else if (!b93.C() && this.c.getConfig().j().d) {
            return false;
        } else {
            if (this.d.getRecyclerView().getScrollState() != 0) {
                ir9.b("DynamicRecommendManager", "[动态推荐] 滑动中，禁用动态推荐 ");
                return false;
            }
            com.taobao.android.fluid.framework.data.datamodel.a aVar = aonVar.b;
            if (aVar != null) {
                if (aVar.e().g().config.disableInTimeRec4Content) {
                    ir9.b("DynamicRecommendManager", "[动态推荐] 该内容禁用动态推荐 disableInTimeRec4Content=true, contentId=" + aonVar.b.e().f());
                    return false;
                } else if (aonVar.b.m() != null) {
                    ir9.b("DynamicRecommendManager", "[动态推荐] 发布上墙内容，该内容禁用动态推荐 ");
                    return false;
                } else {
                    String f = aonVar.b.e().f();
                    if (!sz3.a(this.f) && ((ArrayList) this.f).contains(f)) {
                        ir9.b("DynamicRecommendManager", "[动态推荐]disableDynamicRecommend 该内容禁用动态推荐 contentid=" + f);
                        return false;
                    }
                }
            }
            return true;
        }
    }

    public final boolean f(aon aonVar, sv2<kon.h> sv2Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3eb414bd", new Object[]{this, aonVar, sv2Var})).booleanValue();
        }
        if (aonVar == null || this.c.getLoadingState(false) || !e(aonVar)) {
            return false;
        }
        ((IDataService) this.f22410a.getService(IDataService.class)).requestForCommendData(false, false, true, -1, null, aonVar.u(((IDataService) this.f22410a.getService(IDataService.class)).getTransmission()).v(((IDataService) this.f22410a.getService(IDataService.class)).getDetailUnlikeRecorder()).k(e59.a(this.f22410a)).s(false), sv2Var);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0123, code lost:
        r14.removeAll(r6);
        r13 = r13.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012e, code lost:
        if (r13.hasNext() == false) goto L_0x0160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0130, code lost:
        r0 = r13.next();
        r1 = (com.taobao.android.fluid.framework.data.datamodel.a) r5.get(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x013c, code lost:
        if (r1 == null) goto L_0x0158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0142, code lost:
        if (r7.isEmpty() != false) goto L_0x0158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0144, code lost:
        r1.e().g().index = ((java.lang.Integer) r7.poll()).intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0158, code lost:
        r14.add(r5.get(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0160, code lost:
        r14.addAll(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0168, code lost:
        return new tb.k58.d(r2, r15, r14);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final tb.k58.d g(java.util.List<java.lang.String> r13, java.util.List<com.taobao.android.fluid.framework.data.datamodel.a> r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 361
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.k58.g(java.util.List, java.util.List, java.lang.String):tb.k58$d");
    }

    @Override // tb.n1c
    public LinkedList<kon.h> getFeedbackList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LinkedList) ipChange.ipc$dispatch("7e945bee", new Object[]{this});
        }
        return this.b;
    }

    public final void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("356d5e3a", new Object[]{this, str});
            return;
        }
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(":");
            Iterator it = ((IDataService) this.f22410a.getService(IDataService.class)).getMediaSetList().iterator();
            while (it.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a aVar = (com.taobao.android.fluid.framework.data.datamodel.a) it.next();
                if (!(aVar == null || aVar.e() == null)) {
                    sb.append(aVar.e().f());
                    sb.append('-');
                }
            }
            sb.append("UnMove:");
            Iterator it2 = ((IDataService) this.f22410a.getService(IDataService.class)).getUnRemoveMediaSetList().iterator();
            while (it2.hasNext()) {
                com.taobao.android.fluid.framework.data.datamodel.a aVar2 = (com.taobao.android.fluid.framework.data.datamodel.a) it2.next();
                if (!(aVar2 == null || aVar2.e() == null)) {
                    sb.append(aVar2.e().f());
                    sb.append('-');
                }
            }
            ir9.a("DynamicRecommendManager", "reOrderLog" + ((Object) sb));
        } catch (Throwable unused) {
            ir9.b("DynamicRecommendManager", "reOrderLogError");
        }
    }

    @Override // tb.n1c
    public void updateNoDynamicRecContents(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eb65b6ae", new Object[]{this, str, new Boolean(z)});
            return;
        }
        if (this.f == null) {
            this.f = new ArrayList();
        }
        if (z) {
            this.f.add(str);
        } else {
            this.f.remove(str);
        }
    }

    @Override // tb.n1c
    public boolean reOrderTailUnExposeList(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("780399e2", new Object[]{this, list})).booleanValue();
        }
        try {
            h("before");
            ArrayList arrayList = new ArrayList(((IDataService) this.f22410a.getService(IDataService.class)).getMediaSetList());
            ArrayList arrayList2 = new ArrayList(((IDataService) this.f22410a.getService(IDataService.class)).getUnRemoveMediaSetList());
            d g = g(list, arrayList, null);
            if (g.b != -1) {
                d g2 = g(list, arrayList2, g.f22414a);
                if (!(g.b == -1 || g2.b == -1)) {
                    Collections.copy(((IDataService) this.f22410a.getService(IDataService.class)).getMediaSetList(), arrayList);
                    Collections.copy(((IDataService) this.f22410a.getService(IDataService.class)).getUnRemoveMediaSetList(), arrayList2);
                    h("after");
                    ((IFeedsListService) this.f22410a.getService(IFeedsListService.class)).getMediaCardListAdapter().notifyItemRangeChanged(g.b, ((IDataService) this.f22410a.getService(IDataService.class)).getMediaSetList().size() - g.b);
                    hr9.c(this.f22410a);
                    int currentMediaPosition = ((IDataService) this.f22410a.getService(IDataService.class)).getCurrentMediaPosition();
                    String f = ((com.taobao.android.fluid.framework.data.datamodel.a) ((IDataService) this.f22410a.getService(IDataService.class)).getMediaSetList().get(g.b)).e().f();
                    if (g.b == currentMediaPosition + 1 && !g.f22414a.equals(f)) {
                        ((IDataService) this.f22410a.getService(IDataService.class)).getmPreloadNextHandler().removeMessages(0);
                        ((IDataService) this.f22410a.getService(IDataService.class)).getmPreloadNextHandler().post(new b());
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            ir9.b("DynamicRecommendManager", "reOrderTailUnExposeList");
            return false;
        }
    }
}
