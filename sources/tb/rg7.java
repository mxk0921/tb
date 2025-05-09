package tb;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.core.FluidContext;
import com.taobao.android.fluid.framework.data.IDataService;
import com.taobao.android.fluid.framework.data.datamodel.MediaMixContentDetail;
import com.taobao.android.fluid.framework.scene.ISceneConfigService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class rg7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ERROR_CODE_DELETED = -1;
    public static final String ERROR_CODE_I_007 = "I_007";
    public static final String ERROR_CODE_I_008 = "I_008";
    public static final int ERROR_CODE_PRIVACY_1 = 1;
    public static final int ERROR_CODE_PRIVACY_1000 = -1000;
    public static final int ERROR_CODE_PRIVACY_1001 = -1001;
    public static final int ERROR_CODE_PRIVACY_1002 = -1002;
    public static final int ERROR_CODE_PRIVACY_1003 = -1003;
    public static final int ERROR_CODE_PRIVACY_2 = -2;

    /* renamed from: a  reason: collision with root package name */
    public final FluidContext f27355a;
    public final yif b;
    public final miv c = new miv();
    public final iaw d = new iaw();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yao[] f27356a;
        public final /* synthetic */ d b;
        public final /* synthetic */ boolean[] c;

        public a(yao[] yaoVarArr, d dVar, boolean[] zArr) {
            this.f27356a = yaoVarArr;
            this.b = dVar;
            this.c = zArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.rg7.c
        public void onResult(yao yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
                return;
            }
            IDataService iDataService = (IDataService) rg7.a(rg7.this).getService(IDataService.class);
            if (iDataService != null) {
                iDataService.onResult(yaoVar);
            }
            yao[] yaoVarArr = this.f27356a;
            yaoVarArr[0] = yaoVar;
            d dVar = this.b;
            if (dVar != 0) {
                yao yaoVar2 = yaoVarArr[1];
                if (yaoVar2 != null || !this.c[1]) {
                    dVar.onResult(yaoVar, yaoVar2);
                }
            }
        }

        @Override // tb.rg7.c
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
                return;
            }
            IDataService iDataService = (IDataService) rg7.a(rg7.this).getService(IDataService.class);
            if (iDataService != null) {
                iDataService.onStartRequest();
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.onStartRequest(0);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ yao[] f27357a;
        public final /* synthetic */ d b;
        public final /* synthetic */ boolean[] c;

        public b(yao[] yaoVarArr, d dVar, boolean[] zArr) {
            this.f27357a = yaoVarArr;
            this.b = dVar;
            this.c = zArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.rg7.c
        public void onResult(yao yaoVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8fcf9b57", new Object[]{this, yaoVar});
                return;
            }
            IDataService iDataService = (IDataService) rg7.a(rg7.this).getService(IDataService.class);
            if (iDataService != null) {
                iDataService.onResult(yaoVar);
            }
            yao[] yaoVarArr = this.f27357a;
            yaoVarArr[1] = yaoVar;
            d dVar = this.b;
            if (dVar != 0) {
                yao yaoVar2 = yaoVarArr[0];
                if (yaoVar2 != null || !this.c[0]) {
                    dVar.onResult(yaoVar2, yaoVar);
                }
            }
        }

        @Override // tb.rg7.c
        public void onStartRequest() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("adbafdd3", new Object[]{this});
                return;
            }
            IDataService iDataService = (IDataService) rg7.a(rg7.this).getService(IDataService.class);
            if (iDataService != null) {
                iDataService.onStartRequest();
            }
            d dVar = this.b;
            if (dVar != null) {
                dVar.onStartRequest(1);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar);

        void onStartRequest();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d {
        void onResult(yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar2);

        void onStartRequest(int i);
    }

    static {
        t2o.a(468714253);
    }

    public rg7(FluidContext fluidContext) {
        this.f27355a = fluidContext;
        yif yifVar = new yif();
        this.b = yifVar;
        yifVar.a(new ms2(fluidContext, this));
        yifVar.a(new nvh(fluidContext, this));
    }

    public static /* synthetic */ FluidContext a(rg7 rg7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidContext) ipChange.ipc$dispatch("d5a8d9cf", new Object[]{rg7Var});
        }
        return rg7Var.f27355a;
    }

    public void b(tg7 tg7Var, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f709bb2", new Object[]{this, tg7Var, cVar});
        } else if (tg7Var != null) {
            ir9.b("DetailRequestManager", "fetchContentDetail, id:" + tg7Var.b() + ",args:" + tg7Var.d());
            if (((ISceneConfigService) this.f27355a.getService(ISceneConfigService.class)).getSessionParams() == null) {
                h1u.d(this.f27355a.getContext(), "参数错误，请检查参数");
                h(cVar, yao.a("SessionParams is missing", "SessionParams is missing", null));
                return;
            }
            ir9.b("DetailRequestManager", "onStartFetch");
            if (cVar != null) {
                cVar.onStartRequest();
            }
            new nq6(this.f27355a, this, 0, tg7Var, cVar).c(tg7Var, cVar);
        }
    }

    public void c(tg7 tg7Var, tg7 tg7Var2, d dVar) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdac97d4", new Object[]{this, tg7Var, tg7Var2, dVar});
            return;
        }
        yao[] yaoVarArr = new yao[2];
        String str2 = null;
        if (tg7Var != null) {
            str = tg7Var.b();
        } else {
            str = null;
        }
        if (tg7Var2 != null) {
            str2 = tg7Var2.b();
        }
        boolean z2 = !TextUtils.isEmpty(str);
        if (TextUtils.isEmpty(str2) || TextUtils.equals(str, str2)) {
            z = false;
        } else {
            z = true;
        }
        boolean[] zArr = {z2, z};
        if (zArr[0]) {
            b(tg7Var, new a(yaoVarArr, dVar, zArr));
        }
        if (zArr[1]) {
            b(tg7Var2, new b(yaoVarArr, dVar, zArr));
        }
    }

    public Context d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("e1727078", new Object[]{this});
        }
        return this.f27355a.getContext();
    }

    public yif e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yif) ipChange.ipc$dispatch("d7b12762", new Object[]{this});
        }
        return this.b;
    }

    public miv f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (miv) ipChange.ipc$dispatch("7357efd", new Object[]{this});
        }
        return this.c;
    }

    public iaw g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (iaw) ipChange.ipc$dispatch("7214e3d3", new Object[]{this});
        }
        return this.d;
    }

    public void h(c cVar, yao<Pair<com.taobao.android.fluid.framework.data.datamodel.a, MediaMixContentDetail>> yaoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e71ba78", new Object[]{this, cVar, yaoVar});
            return;
        }
        ir9.b("DetailRequestManager", "notifyContentDetailCallback");
        if (cVar != null) {
            cVar.onResult(yaoVar);
        }
        ncp j = ((IDataService) this.f27355a.getService(IDataService.class)).getConfig().j();
        boolean equalsIgnoreCase = "video".equalsIgnoreCase(this.f27355a.getInstanceConfig().getTabId());
        if (j != null && equalsIgnoreCase) {
            ggs.e("tab2FrameworkRefactor", Boolean.valueOf(j.F));
        }
    }
}
