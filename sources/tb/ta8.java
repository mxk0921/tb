package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.editionswitcher.LocationCallBack;
import com.taobao.android.revisionswitch.TBRevisionSwitchManager;
import com.taobao.tao.Globals;
import com.taobao.tao.log.TLog;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ta8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f28588a;
    public Map<String, String> b;
    public String c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ta8 f28589a = new ta8();

        static {
            t2o.a(456130573);
        }

        public static /* synthetic */ ta8 a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ta8) ipChange.ipc$dispatch("754fe3e6", new Object[0]);
            }
            return f28589a;
        }
    }

    static {
        t2o.a(456130572);
    }

    public ta8() {
        this.f28588a = o78.s(Globals.getApplication()) && d();
        this.c = TBRevisionSwitchManager.c().f(LocationCallBack.ORIGIN_ELDER_HOME, true);
        TLog.loge("Page_Home", o78.TAG, "stdElderHome=" + this.f28588a + "originElderHome=" + this.c);
    }

    public static ta8 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ta8) ipChange.ipc$dispatch("aac547ab", new Object[0]);
        }
        return a.a();
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6067608d", new Object[0])).booleanValue();
        }
        return "1".equals(TBRevisionSwitchManager.c().e("elderHome"));
    }

    public static boolean h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ce1d1bb4", new Object[]{context})).booleanValue();
        }
        return a().b(context);
    }

    public static void j(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bcca50c", new Object[]{context, jSONObject});
        } else {
            a().c(context, jSONObject);
        }
    }

    public final boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9df024aa", new Object[]{this, context})).booleanValue();
        }
        if (this.f28588a) {
            sa8.e(context);
            return true;
        } else if (!o78.s(Globals.getApplication()) || !"1".equals(this.c)) {
            return false;
        } else {
            sa8.d(context);
            return true;
        }
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f0570dfb", new Object[]{this})).booleanValue();
        }
        return this.f28588a;
    }

    public void f(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eefe8415", new Object[]{this, map});
        } else {
            this.b = map;
        }
    }

    public void g(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6270b85", new Object[]{this, new Boolean(z)});
        } else {
            this.f28588a = z;
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27b888b", new Object[]{this, str});
        } else {
            this.c = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Unknown variable types count: 1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(android.content.Context r11, com.alibaba.fastjson.JSONObject r12) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.ta8.c(android.content.Context, com.alibaba.fastjson.JSONObject):void");
    }
}
