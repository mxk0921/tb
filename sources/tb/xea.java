package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelStoreOwner;
import com.alibaba.fastjson.JSONObject;
import com.alipay.mobile.common.transport.monitor.RPCDataItems;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.ItemlistV2ResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.LiveItemCategoriesResponseData;
import com.taobao.android.live.plugin.atype.flexalocal.good.performance.GoodListShowPerformanceMonitor;
import com.taobao.android.live.plugin.atype.flexalocal.good.showcase.LiveGoodDataCenter;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.GoodsTopBannerBean;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.ItemCategory;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.bean.UltronInstanceViewModel;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.ItemIdentifier;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class xea implements yac {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static boolean W = false;
    public final String A;
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final LiveGoodDataCenter F;
    public boolean G;
    public boolean H;
    public String I;
    @Deprecated
    public String J;
    @Deprecated
    public String K;
    public ItemCategory L;
    public WeakReference<ux9> M;
    public cv1 N;
    public String O;
    public String P;
    public final Handler Q;
    public JSONObject R;
    public c S;
    public final GoodListShowPerformanceMonitor T;
    public HashMap<String, String> U;
    public boolean V;

    /* renamed from: a  reason: collision with root package name */
    public final Context f31332a;
    @Deprecated
    public final String b;
    @Deprecated
    public final String c;
    public final String d;
    public final com.alibaba.android.ultron.vfw.instance.a e;
    public final UltronInstanceViewModel f;
    public final HashMap<String, th5> g;
    public final HashMap<String, th5> h;
    public final HashMap<String, HashMap<String, th5>> i;
    public List<ItemIdentifier> j;
    public LiveItemCategoriesResponseData k;
    public final wda l;
    public final hia m;
    public final afa n;
    public boolean o;
    public final boolean p;
    public final boolean q;
    public final TBLiveDataModel r;
    public final boolean s;
    public final boolean t;
    public final VideoInfo u;
    public final boolean v;
    public boolean w;
    public final boolean x;
    public final String y;
    public final String z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Context f31333a;
        public final String b;
        public final String c;
        public boolean d;
        public final VideoInfo e;
        public final boolean f;
        public boolean g;
        public boolean h;
        public String i;
        public final TBLiveDataModel j;
        public LiveGoodDataCenter k;
        public String l;
        public String m;
        public String n;
        public cv1 o;

        static {
            t2o.a(295699277);
        }

        public static /* synthetic */ Context a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Context) ipChange.ipc$dispatch("1b864c5c", new Object[]{bVar});
            }
            return bVar.f31333a;
        }

        public static /* synthetic */ VideoInfo b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (VideoInfo) ipChange.ipc$dispatch("7a185862", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("27c4fb6d", new Object[]{bVar});
            }
            return bVar.m;
        }

        public static /* synthetic */ String d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("35d1254c", new Object[]{bVar});
            }
            return bVar.n;
        }

        public static /* synthetic */ cv1 e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (cv1) ipChange.ipc$dispatch("8a36fcd2", new Object[]{bVar});
            }
            return bVar.o;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("290cb25a", new Object[]{bVar})).booleanValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5152f29b", new Object[]{bVar})).booleanValue();
            }
            return bVar.h;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("2464e37a", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("32710d59", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6a6fda6c", new Object[]{bVar})).booleanValue();
            }
            return bVar.d;
        }

        public static /* synthetic */ TBLiveDataModel k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TBLiveDataModel) ipChange.ipc$dispatch("8d04f286", new Object[]{bVar});
            }
            return bVar.j;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("bafc5aee", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ String m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("6aa1b4d5", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static /* synthetic */ LiveGoodDataCenter n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (LiveGoodDataCenter) ipChange.ipc$dispatch("b2929835", new Object[]{bVar});
            }
            return bVar.k;
        }

        public static /* synthetic */ String o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("86ba0893", new Object[]{bVar});
            }
            return bVar.l;
        }

        public xea p() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (xea) ipChange.ipc$dispatch("289d0ea5", new Object[]{this});
            }
            return new xea(this);
        }

        public b q(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4865a01a", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public b r(LiveGoodDataCenter liveGoodDataCenter) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("acf9b075", new Object[]{this, liveGoodDataCenter});
            }
            this.k = liveGoodDataCenter;
            return this;
        }

        public b s(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("36753c69", new Object[]{this, new Boolean(z)});
            }
            this.h = z;
            return this;
        }

        public b t(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6b3e39cf", new Object[]{this, new Boolean(z)});
            }
            this.g = z;
            return this;
        }

        public b u(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("96e81d6a", new Object[]{this, new Boolean(z)});
            }
            this.d = z;
            return this;
        }

        public b v(String str, String str2, String str3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("957ed0ed", new Object[]{this, str, str2, str3});
            }
            this.l = str;
            this.m = str2;
            this.n = str3;
            return this;
        }

        public b w(cv1 cv1Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("99d7a003", new Object[]{this, cv1Var});
            }
            this.o = cv1Var;
            return this;
        }

        public b(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
            this.f31333a = context;
            this.j = tBLiveDataModel;
            VideoInfo videoInfo = tBLiveDataModel.mVideoInfo;
            this.e = videoInfo;
            this.f = z;
            this.b = videoInfo.liveId;
            AccountInfo accountInfo = videoInfo.broadCaster;
            if (accountInfo != null) {
                this.c = accountInfo.accountId;
            }
            wda.P(context);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {

        /* renamed from: a  reason: collision with root package name */
        public ItemlistV2ResponseData f31334a;
        public long b;
        public long c;

        static {
            t2o.a(295699278);
        }
    }

    static {
        t2o.a(295699275);
        t2o.a(806356113);
    }

    public static String C(TBLiveDataModel tBLiveDataModel) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9379d1de", new Object[]{tBLiveDataModel});
        }
        if (tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null) {
            return null;
        }
        return map.get(yj4.PARAM_TRANSPARENT_PARAMS);
    }

    public static String E(xea xeaVar) {
        WeakReference<ux9> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4627db53", new Object[]{xeaVar});
        }
        if (xeaVar == null || (weakReference = xeaVar.M) == null || weakReference.get() == null) {
            return null;
        }
        return xeaVar.M.get().C();
    }

    public static b U(Context context, TBLiveDataModel tBLiveDataModel, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (b) ipChange.ipc$dispatch("136cbca3", new Object[]{context, tBLiveDataModel, new Boolean(z)});
        }
        return new b(context, tBLiveDataModel, z);
    }

    public String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("df3f1dca", new Object[]{this});
        }
        return this.C;
    }

    public String B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("66e7cce1", new Object[]{this});
        }
        return this.E;
    }

    public com.alibaba.android.ultron.vfw.instance.a D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.alibaba.android.ultron.vfw.instance.a) ipChange.ipc$dispatch("53dc8f1e", new Object[]{this});
        }
        return this.e;
    }

    public String F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c4c1c904", new Object[]{this});
        }
        if (q() != null) {
            return q().C();
        }
        return null;
    }

    public String G() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58ad3b3d", new Object[]{this});
        }
        return this.d;
    }

    public VideoInfo H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoInfo) ipChange.ipc$dispatch("5c4fa617", new Object[]{this});
        }
        return this.u;
    }

    public UltronInstanceViewModel I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronInstanceViewModel) ipChange.ipc$dispatch("e5aa2030", new Object[]{this});
        }
        return this.f;
    }

    public boolean K() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("df5c67d1", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ef747fbc", new Object[]{this})).booleanValue();
        }
        return this.H;
    }

    public boolean M() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d4cc737e", new Object[]{this})).booleanValue();
        }
        return this.x;
    }

    public boolean N() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("899b1a0b", new Object[]{this})).booleanValue();
        }
        if (!this.v || vc.j(this.f31332a)) {
            return false;
        }
        return true;
    }

    public boolean O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("89cf8bc", new Object[]{this})).booleanValue();
        }
        return this.v;
    }

    public boolean P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fef42210", new Object[]{this})).booleanValue();
        }
        return this.m.e;
    }

    public boolean Q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ccc1f2e4", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public boolean R() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b90097c9", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a99dd889", new Object[]{this})).booleanValue();
        }
        return this.G;
    }

    public boolean T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3421c7d0", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public void V(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983eb7e4", new Object[]{this, new Boolean(z)});
        } else {
            this.H = z;
        }
    }

    public void W(th5 th5Var, ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("597ad668", new Object[]{this, th5Var, itemCategory});
        } else if (th5Var != null) {
            if (itemCategory.isIndependentTab()) {
                HashMap<String, th5> hashMap = this.i.get(itemCategory.categoryId);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.i.put(itemCategory.categoryId, hashMap);
                }
                hashMap.put(th5Var.e, th5Var);
            } else if (th5Var.f28716a == 5) {
                this.h.put(th5Var.e, th5Var);
            } else {
                HashMap<String, th5> hashMap2 = this.g;
                if (hashMap2 != null) {
                    hashMap2.put(th5Var.e, th5Var);
                }
            }
        }
    }

    public void X(ux9 ux9Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85373db3", new Object[]{this, ux9Var});
            return;
        }
        this.M = new WeakReference<>(ux9Var);
        if (ux9Var != null) {
            this.n.i(E(this));
        }
    }

    public void Y(fea feaVar) {
        LiveGoodDataCenter liveGoodDataCenter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2a9cf2d", new Object[]{this, feaVar});
            return;
        }
        if (!(feaVar == null || (liveGoodDataCenter = this.F) == null)) {
            feaVar.i(liveGoodDataCenter.E());
            feaVar.g(this.F.D());
        }
        cv1 cv1Var = this.N;
        if (cv1Var != null) {
            cv1Var.I("gl_global_cache", feaVar);
        }
    }

    public void Z(ItemCategory itemCategory) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5622b57b", new Object[]{this, itemCategory});
        } else if (itemCategory != null) {
            this.L = itemCategory;
            this.J = itemCategory.categoryId;
            this.K = itemCategory.name;
        }
    }

    @Override // tb.yac
    public void a(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b2f774f3", new Object[]{this, liveItem});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("userId", this.d);
        if (!(liveItem == null || liveItem.extendVal == null)) {
            hashMap.put("itemId", String.valueOf(liveItem.itemId));
            hashMap.put("liveId", liveItem.liveId);
            hashMap.put("categoryId", liveItem.extendVal.categoryLevelOne);
            hashMap.put(RequestConfig.KEY_ANCHOR_ID, liveItem.extendVal.anchorId);
        }
        this.U = hashMap;
    }

    public void a0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a36ca983", new Object[]{this, str});
        } else {
            this.I = str;
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.g.clear();
        this.h.clear();
        LiveGoodDataCenter liveGoodDataCenter = this.F;
        if (liveGoodDataCenter != null) {
            liveGoodDataCenter.w();
        }
        this.N = null;
        this.n.a();
        UltronInstanceViewModel ultronInstanceViewModel = this.f;
        if (ultronInstanceViewModel != null) {
            ultronInstanceViewModel.j().r(null);
            this.f.j().s(null);
        }
        this.Q.removeCallbacksAndMessages(null);
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9859777", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1624745c", new Object[]{this})).booleanValue();
        }
        return this.s;
    }

    public void c0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6537227", new Object[]{this, new Boolean(z)});
        } else {
            this.G = z;
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c825676", new Object[]{this})).booleanValue();
        }
        return this.t;
    }

    public void d0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("618046d", new Object[]{this, new Boolean(z)});
        } else {
            this.w = z;
        }
    }

    public List<th5> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("841df397", new Object[]{this});
        }
        return new ArrayList(this.g.values());
    }

    public List<th5> f() {
        int i;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("90cb2684", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.g.values());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            th5 th5Var = (th5) it.next();
            if (th5Var == null || (i = th5Var.f28716a) == 8 || i == 1 || i == 2 || pfa.J(th5Var)) {
                it.remove();
            }
        }
        return arrayList;
    }

    public String g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("308bb293", new Object[]{this});
        }
        return this.c;
    }

    public fea h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fea) ipChange.ipc$dispatch("7f264928", new Object[]{this, str});
        }
        cv1 cv1Var = this.N;
        if (cv1Var == null) {
            hha.b("GoodLiveContext", "getCacheData | liveId=" + str + ", mGlobalContext is null.");
            return null;
        }
        fea feaVar = (fea) cv1Var.o("gl_global_cache", fea.class);
        if (feaVar != null && TextUtils.equals(feaVar.e(), str)) {
            return feaVar;
        }
        return null;
    }

    public Context i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f31332a;
    }

    public LiveGoodDataCenter j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveGoodDataCenter) ipChange.ipc$dispatch("6e068f05", new Object[]{this});
        }
        return this.F;
    }

    public th5 k(ItemCategory itemCategory, int i, int i2, String str) {
        HashMap<String, th5> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("1599bd8", new Object[]{this, itemCategory, new Integer(i), new Integer(i2), str});
        }
        if (itemCategory != null && itemCategory.isIndependentTab()) {
            HashMap<String, th5> hashMap2 = this.i.get(itemCategory.categoryId);
            if (hashMap2 != null) {
                return hashMap2.get(str);
            }
            hha.b("GoodLiveContext", "getDxData | goodsIndex=" + i2 + "  itemId=" + str);
            return null;
        } else if (i == 5 && (hashMap = this.h) != null && !hashMap.isEmpty()) {
            return this.h.get(str);
        } else {
            HashMap<String, th5> hashMap3 = this.g;
            if (hashMap3 == null || !hashMap3.containsKey(str)) {
                return null;
            }
            return this.g.get(str);
        }
    }

    public th5 l(ItemCategory itemCategory, x4h x4hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("1c411021", new Object[]{this, itemCategory, x4hVar});
        }
        if (x4hVar == null) {
            return null;
        }
        return k(itemCategory, x4hVar.f31139a, x4hVar.b, x4hVar.e);
    }

    public String m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d835ead6", new Object[]{this});
        }
        return this.A;
    }

    public String n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("649f3e25", new Object[]{this});
        }
        return this.D;
    }

    public List<VideoInfo.ExtraGoodsTabItem> o() {
        ArrayList<VideoInfo.ExtraGoodsTabItem> arrayList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7a84d469", new Object[]{this});
        }
        LiveItemCategoriesResponseData liveItemCategoriesResponseData = this.k;
        if (liveItemCategoriesResponseData == null || (arrayList = liveItemCategoriesResponseData.extraGoodsTabList) == null || arrayList.isEmpty()) {
            return this.n.c();
        }
        return this.k.extraGoodsTabList;
    }

    public String p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e907d8cb", new Object[]{this});
        }
        return this.y;
    }

    public ux9 q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("59d375df", new Object[]{this});
        }
        WeakReference<ux9> weakReference = this.M;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.M.get();
    }

    public GoodsTopBannerBean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (GoodsTopBannerBean) ipChange.ipc$dispatch("6a7c8913", new Object[]{this});
        }
        return null;
    }

    public HashMap<String, String> s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("92a42ec7", new Object[]{this});
        }
        return this.U;
    }

    public TBLiveDataModel t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveDataModel) ipChange.ipc$dispatch("82cec8ab", new Object[]{this});
        }
        return this.r;
    }

    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
        }
        return this.b;
    }

    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fd7f76fc", new Object[]{this});
        }
        return this.z;
    }

    public Handler w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        return this.Q;
    }

    public th5 x(String str) {
        HashMap<String, th5> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (th5) ipChange.ipc$dispatch("ec2f6a9d", new Object[]{this, str});
        }
        if (!TextUtils.isEmpty(str) && (hashMap = this.g) != null && hashMap.containsKey(str)) {
            return this.g.get(str);
        }
        return null;
    }

    public String y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f2cfcf53", new Object[]{this});
        }
        return this.I;
    }

    public String z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
        }
        return this.B;
    }

    public xea(b bVar) {
        Boolean bool;
        this.g = new HashMap<>();
        this.h = new HashMap<>();
        this.i = new HashMap<>();
        new ArrayList();
        this.p = false;
        this.q = true;
        this.w = false;
        this.x = false;
        this.J = "";
        this.K = "全部";
        this.Q = new Handler(Looper.getMainLooper());
        Context a2 = b.a(bVar);
        this.f31332a = a2;
        this.l = new wda(b.b(bVar));
        this.m = new hia();
        this.n = new afa(b.b(bVar));
        this.b = b.h(bVar);
        this.c = b.i(bVar);
        this.d = v2s.o().u().getUserId();
        this.o = b.j(bVar);
        VideoInfo b2 = b.b(bVar);
        this.u = b2;
        this.r = b.k(bVar);
        this.v = b.l(bVar);
        this.y = b.m(bVar);
        this.F = b.n(bVar);
        this.z = b.o(bVar);
        this.A = b.c(bVar);
        this.E = b.d(bVar);
        if (a2 instanceof FragmentActivity) {
            UltronInstanceViewModel u = pfa.u((ViewModelStoreOwner) a2);
            hha.b("VMUltronInstance", "Ultron ViewModel: " + u.hashCode() + "   context=" + a2);
            if (!wda.e()) {
                this.e = u.e(this);
            }
            this.f = u;
        }
        cv1 e = b.e(bVar);
        this.N = e;
        if (!(e == null || e.k() == null)) {
            this.B = this.N.k().d();
            this.C = this.N.k().b();
            this.D = this.N.k().n0();
        }
        if (yga.m()) {
            zqq.c(b2.hasItemSearchEntrance);
        }
        this.q = yga.n();
        boolean e2 = zga.e(b2.itemTransferInfo);
        this.s = e2;
        hha.c(RPCDataItems.SWITCH_TAG_LOG, "GoodLiveContext | mEnablePcg=" + e2);
        this.t = yga.A();
        if (!(v2s.o().d() == null || v2s.o().d().a() == null || (bool = v2s.o().d().a().get("isTBLiveAPP")) == null)) {
            this.p = bool.booleanValue();
        }
        this.w = b.f(bVar);
        this.x = b.g(bVar);
        this.T = new GoodListShowPerformanceMonitor();
    }

    public static xea J(ux9 ux9Var, Context context, TBLiveDataModel tBLiveDataModel, boolean z, boolean z2, String str) {
        String str2;
        xea xeaVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xea) ipChange.ipc$dispatch("cec32c34", new Object[]{ux9Var, context, tBLiveDataModel, new Boolean(z), new Boolean(z2), str});
        }
        String str3 = null;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null || context == null || ux9Var == null) {
            hha.b("GoodLiveContext", "initGoodLiveContext | error, param null. context=" + context + "   tbLiveDataModel=" + tBLiveDataModel + " initSource=" + str);
            return null;
        }
        if (ux9Var.k() instanceof xea) {
            if (TextUtils.equals(tBLiveDataModel.mVideoInfo.liveId, ((xea) ux9Var.k()).n.f())) {
                hha.b("GoodLiveContext", "initGoodLiveContext | init already. initSource=" + str);
                return (xea) ux9Var.k();
            }
            hha.b("GoodLiveContext", "initGoodLiveContext | curLiveId=" + tBLiveDataModel.mVideoInfo.liveId + " oldLiveId=" + xeaVar.n.f());
        }
        hha.b("GoodLiveContext", "initGoodLiveContext | start init. initSource=" + str);
        cv1 j = ux9Var.j();
        if (kkr.i().d() == null || kkr.i().g() == null) {
            str2 = null;
        } else {
            str3 = kkr.i().g().g();
            str2 = kkr.i().g().c();
        }
        xea p = U(context, tBLiveDataModel, z).u(false).t(z2).s(pfa.G(ux9Var)).r(new LiveGoodDataCenter()).v(str3, str2, C(tBLiveDataModel)).w(j).q(ux9Var.f29656a).p();
        p.X(ux9Var);
        ux9Var.W(p);
        if (ux9Var.D() != null) {
            ux9Var.D().get(yj4.PARAM_ITEM_IDS);
            p.P = ux9Var.D().get(yj4.PARAM_SJSD_ITEM_ID);
        }
        p.j().G(p, ux9Var.t(), p.g, null, null);
        kkr.i().q(context, tBLiveDataModel, p, true);
        return p;
    }
}
