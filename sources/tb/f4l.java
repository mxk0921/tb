package tb;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.handler.event.RuntimeAbilityParam;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f4l implements zre {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_TYPE = "openPop";

    /* renamed from: a  reason: collision with root package name */
    public final Context f18998a;

    static {
        t2o.a(912261903);
        t2o.a(912261826);
    }

    public f4l(Context context, ze7 ze7Var) {
        this.f18998a = context;
    }

    @Override // tb.zre
    public boolean a(ir irVar, RuntimeAbilityParam... runtimeAbilityParamArr) {
        JSONObject a2;
        Window window;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5228eae5", new Object[]{this, irVar, runtimeAbilityParamArr})).booleanValue();
        }
        if (irVar == null || (a2 = irVar.a()) == null) {
            return false;
        }
        View j = yc4.j(runtimeAbilityParamArr);
        if (j == null) {
            Context context = this.f18998a;
            if ((context instanceof Activity) && (window = ((Activity) context).getWindow()) != null) {
                j = window.getDecorView();
            }
        }
        if (j == null) {
            tgh.b("OpenPopImplementor", "not found root view");
            return false;
        }
        n9 n9Var = new n9();
        n9Var.i(this.f18998a);
        n9Var.m(j);
        new y7().a(a2, n9Var, null);
        return true;
    }
}
