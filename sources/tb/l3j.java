package tb;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.android.tbelder.TBElder;
import com.taobao.login4android.api.Login;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.mytaobao.basement.weex.BasementFeedDataProvider;
import com.taobao.mytaobao.homepage.busniess.acds.DealInfo;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.TaoHelper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class l3j {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile int f23092a;
    public static volatile MtopResponse b;
    public static JSONObject d;
    public static volatile DealInfo e;
    public static boolean f;
    public static String g;
    public static int h;
    public static int i;
    public static final l3j INSTANCE = new l3j();
    public static CountDownLatch c = new CountDownLatch(1);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/l3j$b", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            uv6.b("preloadMainData", 0);
            l3j l3jVar = l3j.INSTANCE;
            MtopResponse g = l3j.g(l3jVar);
            uv6.c("preloadMainData", 0);
            l3j.f(l3jVar, g);
            l3j.e(l3jVar, 2);
            l3j.c(l3jVar).countDown();
        }
    }

    static {
        t2o.a(745537676);
    }

    public static final /* synthetic */ int a(l3j l3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e1d6352c", new Object[]{l3jVar})).intValue();
        }
        return f23092a;
    }

    public static final /* synthetic */ MtopResponse b(l3j l3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("5316212", new Object[]{l3jVar});
        }
        return b;
    }

    public static final /* synthetic */ CountDownLatch c(l3j l3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (CountDownLatch) ipChange.ipc$dispatch("ba5276cd", new Object[]{l3jVar});
        }
        return c;
    }

    public static final /* synthetic */ void d(l3j l3jVar, MtopResponse mtopResponse, o32 o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efeba5ce", new Object[]{l3jVar, mtopResponse, o32Var});
        } else {
            l3jVar.x(mtopResponse, o32Var);
        }
    }

    public static final /* synthetic */ void e(l3j l3jVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad7fb8f6", new Object[]{l3jVar, new Integer(i2)});
        } else {
            f23092a = i2;
        }
    }

    public static final /* synthetic */ void f(l3j l3jVar, MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6a1f7fa", new Object[]{l3jVar, mtopResponse});
        } else {
            b = mtopResponse;
        }
    }

    public static final /* synthetic */ MtopResponse g(l3j l3jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("e64f5976", new Object[]{l3jVar});
        }
        return l3jVar.A();
    }

    public final MtopResponse A() {
        MtopResponse mtopResponse;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopResponse) ipChange.ipc$dispatch("f06d05f2", new Object[]{this});
        }
        MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, Globals.getApplication()), h(), TaoHelper.getTTID());
        build.setUnitStrategy("UNIT_TRADE");
        build.reqMethod(MethodEnum.POST);
        try {
            mtopResponse = build.syncRequest();
        } catch (Throwable unused) {
            mtopResponse = null;
        }
        if (mtopResponse != null) {
            mtopResponse.parseJsonByte();
        }
        return mtopResponse;
    }

    public final MtopRequest h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MtopRequest) ipChange.ipc$dispatch("cd63970", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("new2021UIEnable", (Object) Boolean.valueOf(TBRevisionSwitchManager.c().d("new2021UIEnable")));
        String jSONString = JSON.toJSONString(sb7.b(Login.getUserId()).c());
        if (!TextUtils.isEmpty(jSONString)) {
            jSONObject2.put("orderFatigue", (Object) jSONString);
        }
        if (TBElder.b()) {
            jSONObject2.put("elderFont", (Object) "true");
        }
        Float k = MtbGlobalEnv.k();
        if (k != null) {
            jSONObject2.put("aspectRatio", (Object) k);
        }
        jSONObject.put(PushConstants.PARAMS, (Object) JSON.toJSONString(jSONObject2));
        jSONObject.put("deviceLevel", (Object) String.valueOf(MtbGlobalEnv.f()));
        MtopRequest mtopRequest = new MtopRequest();
        mtopRequest.setApiName("mtop.taobao.reborn.mclaren");
        mtopRequest.setVersion("2.0");
        mtopRequest.setData(JSON.toJSONString(jSONObject));
        return mtopRequest;
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        }
    }

    public final void j(o32<JSONObject> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("19be22b7", new Object[]{this, o32Var});
            return;
        }
        ckf.h(o32Var, "callback");
        p3j.g(new a(o32Var));
    }

    public final JSONObject k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d6d18b0f", new Object[]{this});
        }
        JSONObject jSONObject = d;
        if (jSONObject != null) {
            return jSONObject;
        }
        ish g2 = ish.g();
        ckf.c(g2, "MTBDataProvider.getInstance()");
        return g2.k();
    }

    public final DealInfo l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (DealInfo) ipChange.ipc$dispatch("dde2daa4", new Object[]{this});
        }
        return e;
    }

    public final int m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f0b840e", new Object[]{this})).intValue();
        }
        return h;
    }

    public final int n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1f0b4baa", new Object[]{this})).intValue();
        }
        return i;
    }

    public final String o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("491bf265", new Object[]{this});
        }
        return g;
    }

    public final boolean p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("75092f3a", new Object[]{this})).booleanValue();
        }
        return f;
    }

    public final void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92bda321", new Object[]{this});
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f943666", new Object[]{this});
        } else if (f) {
            uv6.k("进入preFetchFeedData");
            ish g2 = ish.g();
            ckf.c(g2, "MTBDataProvider.getInstance()");
            BasementFeedDataProvider.INSTANCE.F(g2.c());
        }
    }

    public final void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8daf0b81", new Object[]{this});
        } else if (Login.checkSessionValid() && f23092a == 0) {
            f23092a = 1;
            c = new CountDownLatch(1);
            p3j.d(new b());
        }
    }

    public final boolean u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("54bf0d10", new Object[]{this})).booleanValue();
        }
        if (!Login.checkSessionValid()) {
            return false;
        }
        ish g2 = ish.g();
        ckf.c(g2, "MTBDataProvider.getInstance()");
        d = g2.k();
        q();
        return true;
    }

    public final void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69e8b3b0", new Object[]{this});
            return;
        }
        Object b2 = lgj.b(lgj.ORDER_NUM);
        if (!(b2 instanceof DealInfo)) {
            b2 = null;
        }
        e = (DealInfo) b2;
    }

    public final void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c833d37", new Object[]{this});
        }
    }

    public final void y(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfb7ebc", new Object[]{this, new Integer(i2)});
        } else {
            h = i2;
        }
    }

    public final void z(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a35da0", new Object[]{this, new Integer(i2)});
        } else {
            i = i2;
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/l3j$a", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "taobao_mytaobao_release"}, k = 1, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ o32 f23093a;

        public a(o32 o32Var) {
            this.f23093a = o32Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            StringBuilder sb = new StringBuilder("fetchMainData，预请求状态:");
            l3j l3jVar = l3j.INSTANCE;
            sb.append(l3j.a(l3jVar));
            TLog.loge("mtbMainLink", sb.toString());
            int a2 = l3j.a(l3jVar);
            if (a2 == 1) {
                try {
                    l3j.c(l3jVar).await(10L, TimeUnit.SECONDS);
                } catch (Throwable unused) {
                }
                l3j l3jVar2 = l3j.INSTANCE;
                MtopResponse b = l3j.b(l3jVar2);
                l3j.f(l3jVar2, null);
                l3j.e(l3jVar2, 0);
                l3j.d(l3jVar2, b, this.f23093a);
            } else if (a2 != 2) {
                l3j.d(l3jVar, l3j.g(l3jVar), this.f23093a);
            } else {
                MtopResponse b2 = l3j.b(l3jVar);
                l3j.f(l3jVar, null);
                l3j.e(l3jVar, 0);
                l3j.d(l3jVar, b2, this.f23093a);
            }
        }
    }

    public final void q() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9bccb41", new Object[]{this});
            return;
        }
        try {
            JSONObject jSONObject4 = d;
            if (jSONObject4 != null && (jSONObject = jSONObject4.getJSONObject("data")) != null && (jSONObject2 = jSONObject.getJSONObject("global")) != null && (jSONObject3 = jSONObject2.getJSONObject("secScreenFragment")) != null) {
                if (ckf.b("true", jSONObject3.getString("newBasementContainer")) && ckf.b("weex", jSONObject3.getString("pageType"))) {
                    z = true;
                }
                f = z;
                g = jSONObject3.getString("fragmentWeexUrl");
                Log.e("dssdw", "parseSnapshotMainData");
            }
        } catch (Throwable unused) {
        }
    }

    public final void x(MtopResponse mtopResponse, o32<JSONObject> o32Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ca3f350", new Object[]{this, mtopResponse, o32Var});
        } else if (mtopResponse == null) {
            o32Var.a(false, "mtopResponse=null", null);
            TLog.loge("mtbDataLink", "主接口onResult,errorMsg=mtopResponse=null");
        } else if (mtopResponse.isApiSuccess()) {
            try {
                JSONObject originFastJsonObject = mtopResponse.getOriginFastJsonObject();
                if (originFastJsonObject == null) {
                    originFastJsonObject = (JSONObject) JSON.parseObject(mtopResponse.getBytedata(), JSONObject.class, new Feature[0]);
                }
                o32Var.a(true, null, originFastJsonObject);
                byte[] bytedata = mtopResponse.getBytedata();
                ckf.c(bytedata, "mtopResponse.bytedata");
                TLog.loge("mtbDataLink", "主接口onResult success,data=".concat(new String(bytedata, uj3.UTF_8)));
            } catch (Throwable th) {
                o32Var.a(false, th.getMessage(), null);
                TLog.loge("mtbDataLink", "主接口onResult exception,errMsg=" + th.getMessage());
            }
        } else {
            o32Var.a(false, mtopResponse.getRetCode() + mtopResponse.getRetMsg(), null);
            TLog.loge("mtbDataLink", "主接口onResult failed,errMsg=" + mtopResponse.getRetCode() + mtopResponse.getRetMsg());
        }
    }
}
