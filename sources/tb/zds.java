package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep;
import com.taobao.themis.kernel.manager.TMSInstanceManager;
import com.taobao.themis.kernel.metaInfo.TMSMetaInfoWrapper;
import com.taobao.themis.kernel.metaInfo.manifest.AppManifest;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class zds extends TMSBaseLaunchStep {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(848297988);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(848297987);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zds(bbs bbsVar, a9s a9sVar) {
        super(bbsVar, a9sVar);
        ckf.g(bbsVar, "instance");
        ckf.g(a9sVar, wzi.LAUNCHER);
    }

    public static /* synthetic */ Object ipc$super(zds zdsVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/uniapp/launch/TMSUniAppInstanceControlStep");
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "TMSUniAppInstanceControlStep";
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1ef60dff", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1e2985e", new Object[]{this});
        }
    }

    @Override // com.taobao.themis.kernel.launcher.step.TMSBaseLaunchStep
    public void h() {
        AppManifest r;
        AppManifest.Container container;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67daaada", new Object[]{this});
        } else if (!q9s.M0()) {
            String str = this.e;
            String str2 = this.d;
            String str3 = this.c;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "breakMsg", "ORANGE_DISABLE");
            xhv xhvVar = xhv.INSTANCE;
            mcs.e(str, mcs.EVENT_ON_CONTINUE, str2, str3, jSONObject);
            i();
        } else {
            TMSMetaInfoWrapper U = this.b.U();
            AppManifest.InstanceControl instanceControl = null;
            if (!(U == null || (r = U.r()) == null || (container = r.getContainer()) == null)) {
                instanceControl = container.getInstanceControl();
            }
            if (instanceControl == null) {
                String str4 = this.e;
                String str5 = this.d;
                String str6 = this.c;
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put((JSONObject) "breakMsg", "NO_CONFIG");
                xhv xhvVar2 = xhv.INSTANCE;
                mcs.e(str4, mcs.EVENT_ON_CONTINUE, str5, str6, jSONObject2);
                i();
            } else if (!ckf.b(instanceControl.getSingletonApp(), Boolean.TRUE)) {
                String str7 = this.e;
                String str8 = this.d;
                String str9 = this.c;
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put((JSONObject) "breakMsg", "NOT_SINGLE");
                xhv xhvVar3 = xhv.INSTANCE;
                mcs.e(str7, mcs.EVENT_ON_CONTINUE, str8, str9, jSONObject3);
                i();
            } else {
                bbs bbsVar = this.b;
                ckf.f(bbsVar, "mInstance");
                TMSInstanceManager.d(bbsVar, TMSInstanceManager.InstanceControlStrategy.UNI_APP_SINGLETON);
                i();
            }
        }
    }
}
