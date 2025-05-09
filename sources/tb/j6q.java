package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartErrorCode;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel;
import com.taobao.android.live.plugin.proxy.smartlayer.ISmartLayerServiceProxy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import tb.q6q;
import tb.u6q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class j6q implements drd, brd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "SmartLayerContainer";

    /* renamed from: a  reason: collision with root package name */
    public final l6q f21799a;
    public final g6q b;
    public zqd c;
    public n6q d;
    public final WeakReference<ViewGroup> e;
    public ISmartLayerServiceProxy.b f;

    static {
        t2o.a(295699755);
        t2o.a(295699811);
        t2o.a(295699756);
    }

    public j6q(l6q l6qVar, g6q g6qVar, ViewGroup viewGroup) {
        this.f21799a = l6qVar;
        this.b = g6qVar;
        this.e = new WeakReference<>(viewGroup);
    }

    @Override // tb.drd
    public void a(SmartLayerViewModel smartLayerViewModel, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4d19433", new Object[]{this, smartLayerViewModel, str});
            return;
        }
        l6q l6qVar = this.f21799a;
        if (l6qVar != null) {
            if (smartLayerViewModel == null || this.b == null || smartLayerViewModel.mCurrentModel == null) {
                zqd zqdVar = this.c;
                if (zqdVar != null) {
                    SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_DATA_LOAD;
                    SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_VIEW_MODEL_EMPTY;
                    ((u6q.a) zqdVar).b(this, smartLayerConstant$SmartLayerStage, smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
                    return;
                }
                return;
            }
            SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_DATA_LOAD;
            l6qVar.e(smartLayerConstant$SmartLayerStage2);
            b7q.e(this.b, this.f21799a, smartLayerConstant$SmartLayerStage2, SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, null);
            i(smartLayerViewModel);
        }
    }

    @Override // tb.drd
    public void b(SmartLayerViewModel smartLayerViewModel, String str, String str2, String str3) {
        g6q g6qVar;
        zqd zqdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c6ba852", new Object[]{this, smartLayerViewModel, str, str2, str3});
            return;
        }
        if (smartLayerViewModel == null || (g6qVar = smartLayerViewModel.mSmartConfig) == null) {
            g6qVar = null;
        }
        SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER;
        p6q.e(smartLayerConstant$SmartLayerStage, g6qVar, TAG, "请求失败，返回结果：", str2 + str3, false);
        if ((smartLayerViewModel == null || smartLayerViewModel.mCurrentModel == null) && (zqdVar = this.c) != null) {
            ((u6q.a) zqdVar).b(this, SmartLayerConstant$SmartLayerStage.SMART_DATA_LOAD, str2, str3);
        }
    }

    public boolean c() {
        Boolean bool;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c52fd389", new Object[]{this})).booleanValue();
        }
        l6q l6qVar = this.f21799a;
        if (!(l6qVar == null || l6qVar.y == null || TextUtils.isEmpty(l6qVar.f23140a))) {
            HashMap<String, Boolean> hashMap = this.f21799a.y.c;
            if (!hashMap.isEmpty() && (bool = hashMap.get(this.f21799a.f23140a)) != null && bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        u6q u6qVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9b05d59a", new Object[]{this})).booleanValue();
        }
        l6q l6qVar = this.f21799a;
        if (l6qVar == null || (u6qVar = l6qVar.y) == null) {
            return false;
        }
        ArrayList<j6q> t = u6qVar.t(l6qVar.f23140a, "PopLayer");
        if (t == null || t.size() <= 0 || t.contains(this)) {
            return true;
        }
        return false;
    }

    public void f(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c76c4f0", new Object[]{this, str, str2, str3});
            return;
        }
        if (this.f != null) {
            if (TextUtils.isEmpty(str2)) {
                ((q6q.a) this.f).a(SmartLayerConstant$SmartLayerStage.SMART_CLOSE.stage, null, null);
            } else {
                ((q6q.a) this.f).a(SmartLayerConstant$SmartLayerStage.SMART_ERROR_CLOSE.stage, str2, str3);
            }
        }
        zqd zqdVar = this.c;
        if (zqdVar != null) {
            ((u6q.a) zqdVar).a(this);
        }
    }

    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9814c91", new Object[]{this});
            return;
        }
        ISmartLayerServiceProxy.b bVar = this.f;
        if (bVar != null) {
            ((q6q.a) bVar).a(SmartLayerConstant$SmartLayerStage.SMART_SHOW.stage, null, null);
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("146e3ec8", new Object[]{this});
            return;
        }
        ISmartLayerServiceProxy.b bVar = this.f;
        if (bVar != null) {
            ((q6q.a) bVar).a(SmartLayerConstant$SmartLayerStage.SMART_DISPLAY.stage, null, null);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070 A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:12:0x0032, B:17:0x0046, B:22:0x0053, B:30:0x0066, B:31:0x0070, B:33:0x007b, B:35:0x0090, B:37:0x00ad, B:39:0x00b3, B:41:0x00b9, B:42:0x00c2), top: B:52:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007b A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:12:0x0032, B:17:0x0046, B:22:0x0053, B:30:0x0066, B:31:0x0070, B:33:0x007b, B:35:0x0090, B:37:0x00ad, B:39:0x00b3, B:41:0x00b9, B:42:0x00c2), top: B:52:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad A[Catch: Exception -> 0x0050, TryCatch #0 {Exception -> 0x0050, blocks: (B:12:0x0032, B:17:0x0046, B:22:0x0053, B:30:0x0066, B:31:0x0070, B:33:0x007b, B:35:0x0090, B:37:0x00ad, B:39:0x00b3, B:41:0x00b9, B:42:0x00c2), top: B:52:0x0032 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i(com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel r11) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.j6q.i(com.taobao.android.live.plugin.atype.flexalocal.smartlayer.viewmodel.SmartLayerViewModel):boolean");
    }

    public void e() {
        SmartLayerViewModel smartLayerViewModel;
        boolean d = d();
        g6q g6qVar = this.b;
        if (!d) {
            zqd zqdVar = this.c;
            if (zqdVar != null) {
                SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER;
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_CREATE_HAS_LAYER;
                ((u6q.a) zqdVar).b(this, smartLayerConstant$SmartLayerStage, smartLayerConstant$SmartErrorCode.errorCode, smartLayerConstant$SmartErrorCode.errorMessage);
            }
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, g6qVar, TAG, "存在同类型SmartLayer阻碍此次展示");
            return;
        }
        try {
            smartLayerViewModel = (SmartLayerViewModel) g6qVar.i.getConstructor(l6q.class, g6q.class).newInstance(this.f21799a, g6qVar);
        } catch (Exception e) {
            e.printStackTrace();
            smartLayerViewModel = null;
        }
        if (smartLayerViewModel == null) {
            zqd zqdVar2 = this.c;
            if (zqdVar2 != null) {
                SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage2 = SmartLayerConstant$SmartLayerStage.SMART_TRIGGER;
                SmartLayerConstant$SmartErrorCode smartLayerConstant$SmartErrorCode2 = SmartLayerConstant$SmartErrorCode.ERROR_CONTAINER_VIEW_MODEL_EMPTY;
                ((u6q.a) zqdVar2).b(this, smartLayerConstant$SmartLayerStage2, smartLayerConstant$SmartErrorCode2.errorCode, smartLayerConstant$SmartErrorCode2.errorMessage);
            }
            p6q.c(SmartLayerConstant$SmartLayerStage.SMART_TRIGGER, g6qVar, TAG, "ViewModel创建失败");
            return;
        }
        smartLayerViewModel.load(this);
        zqd zqdVar3 = this.c;
        if (zqdVar3 != null) {
            ((u6q.a) zqdVar3).c(this);
        }
    }
}
