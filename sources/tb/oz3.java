package tb;

import android.os.Looper;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.async.AsyncProcessor;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class oz3 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ viq f25760a;
        public final /* synthetic */ String b;

        public a(viq viqVar, String str) {
            this.f25760a = viqVar;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.f25760a.f("isCollected", this.b);
            }
        }
    }

    static {
        t2o.a(912262753);
    }

    public static boolean a(oa4 oa4Var) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("935ac1b2", new Object[]{oa4Var})).booleanValue();
        }
        if (!vbl.Y() || oa4Var == null || (f = oa4Var.getComponentData().f()) == null || f.getJSONObject("_dObserveStates") == null) {
            return false;
        }
        return true;
    }

    public static void b(ze7 ze7Var, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a31ca2", new Object[]{ze7Var, new Boolean(z)});
        } else if (ze7Var != null) {
            viq i = ze7Var.i();
            if (z) {
                str = "true";
            } else {
                str = "false";
            }
            Object c = i.c("isCollected");
            if ((c instanceof String) && TextUtils.equals(str, (String) c)) {
                return;
            }
            if (Looper.getMainLooper() == Looper.myLooper()) {
                i.f("isCollected", str);
            } else {
                ze7Var.h().g(new a(i, str));
            }
        }
    }

    public static boolean d(oa4 oa4Var, boolean z) {
        JSONObject f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e3600f6a", new Object[]{oa4Var, new Boolean(z)})).booleanValue();
        }
        if (oa4Var == null || (f = oa4Var.getComponentData().f()) == null || !f.getBooleanValue("detail3")) {
            return false;
        }
        f.put("collected", (Object) Boolean.valueOf(z));
        return true;
    }

    public static boolean c(oa4 oa4Var, JSONObject jSONObject, boolean z) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8aab8e53", new Object[]{oa4Var, jSONObject, new Boolean(z)})).booleanValue();
        }
        if (oa4Var == null || jSONObject == null) {
            return false;
        }
        if (z) {
            str = "collected";
        } else {
            str = "uncollected";
        }
        AsyncProcessor.t(jSONObject.getJSONObject(str), com.taobao.android.detail.ttdetail.async.a.g(jSONObject), oa4Var.getComponentData());
        return true;
    }
}
