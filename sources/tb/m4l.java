package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.live.plugin.atype.flexalocal.push.model.BizInfo;
import com.taobao.message.notification.openPushAbility.OpenPushService;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class m4l implements v3d {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String OPEN_PUSH_TAG = "OpenPush";
    public static Boolean c;

    /* renamed from: a  reason: collision with root package name */
    public final BizInfo f23770a;
    public ty1 b;

    static {
        t2o.a(295699622);
        t2o.a(806355148);
    }

    public m4l(BizInfo bizInfo, ty1 ty1Var) {
        o3s.b("OpenPushManager", "init");
        this.f23770a = bizInfo;
        this.b = ty1Var;
        if (a() && bizInfo != null && this.b != null) {
            b();
        }
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("52a596fc", new Object[0])).booleanValue();
        }
        if (c == null) {
            c = Boolean.valueOf(d4s.e("enableOpenPush", true));
        }
        o3s.b("OpenPushManager", "isEnableOpenPush: " + c);
        return c.booleanValue();
    }

    public final void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bc9cd80a", new Object[]{this});
            return;
        }
        o3s.b("OpenPushManager", "registerOpenPushHandler");
        if (this.f23770a != null && this.b != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interceptBizType", (Object) this.f23770a.bizCode);
            jSONObject.put(BaseMnnRunUnit.KEY_TASK_NAME, (Object) this.f23770a.taskName);
            try {
                OpenPushService.getInstance().addInAppPushInterceptNotify(jSONObject, this.b);
            } catch (Exception e) {
                o3s.b("OpenPushManager", e.toString());
            }
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17f171d1", new Object[]{this});
            return;
        }
        o3s.b("OpenPushManager", "unregisterOpenPushHandler");
        if (this.f23770a != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("interceptBizType", (Object) this.f23770a.bizCode);
            jSONObject.put(BaseMnnRunUnit.KEY_TASK_NAME, (Object) this.f23770a.taskName);
            try {
                OpenPushService.getInstance().removeInAppPushInterceptNotify(jSONObject);
            } catch (Exception e) {
                o3s.b("OpenPushManager", e.toString());
            }
        }
    }

    @Override // tb.v3d
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        o3s.b("OpenPushManager", "destroy");
        if (a() && this.f23770a != null) {
            ty1 ty1Var = this.b;
            if (ty1Var != null) {
                ty1Var.a();
            }
            this.b = null;
            c();
        }
    }

    @Override // tb.v3d
    public void setEnabled(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bb1a20e", new Object[]{this, new Boolean(z)});
            return;
        }
        o3s.b("OpenPushManager", "setEnabled: " + z);
        ty1 ty1Var = this.b;
        if (ty1Var != null) {
            ty1Var.c(z);
        }
    }
}
