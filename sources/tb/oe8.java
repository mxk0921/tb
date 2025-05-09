package tb;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.tbpoplayer.nativerender.PreRequestFetcher;
import com.taobao.tbpoplayer.nativerender.dsl.ActionModel;
import com.taobao.tbpoplayer.nativerender.dsl.ActionsItemModel;
import com.taobao.tbpoplayer.nativerender.dsl.ComponentBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.hst;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class oe8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jl1 f25329a;
    public final me8 b;
    public final PreRequestFetcher c;
    public kmj d;
    public final a e;
    public final yam f;
    public final ThreadPoolExecutor g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface a {
        void a();

        void b(String str, String str2, String str3);

        void c(ell ellVar);

        void d();

        void e();

        void f(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list);

        void g(String str, String str2, boolean z, ell ellVar);

        void h(Rect rect);

        View i(StateModel stateModel, StateVersionModel stateVersionModel);

        void j(String str, String str2);

        String k(String str);

        boolean l(String str, String str2);

        boolean m(List<String> list, List<String> list2, boolean z, boolean z2);

        boolean n(boolean z, List<String> list);

        void needShow();

        void o();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
        void a(boolean z);
    }

    static {
        t2o.a(790626380);
    }

    public oe8(Context context, Handler handler, int i, a aVar) {
        boolean z;
        boolean T = TBAutoSizeConfig.x().T(context);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f25329a = new jl1(context, T, z);
        this.b = new me8(context, handler, i);
        this.e = aVar;
        this.f = new yam();
        this.c = new PreRequestFetcher(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new hst.a("NativePopEngineSingleThreadPool"));
        this.g = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    public void A(String str, String str2, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2f8eb4", new Object[]{this, str, str2, jSONObject});
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && jSONObject != null) {
            String replaceAll = str.replaceAll("[$]", "");
            String replaceAll2 = str2.replaceAll("[$]", "");
            JSONObject x = this.b.x();
            JSONObject jSONObject2 = x.getJSONObject(replaceAll);
            if (jSONObject2 == null) {
                jSONObject2 = new JSONObject();
            }
            jSONObject2.put(replaceAll2, (Object) jSONObject);
            x.put(replaceAll, (Object) jSONObject2);
        }
    }

    public void B(kmj kmjVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("329001c4", new Object[]{this, kmjVar});
        } else {
            this.d = kmjVar;
        }
    }

    public void C() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            this.e.needShow();
        }
    }

    public boolean D(List<String> list, List<String> list2, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d513ecaa", new Object[]{this, list, list2, new Boolean(z), new Boolean(z2)})).booleanValue();
        }
        return this.e.m(list, list2, z, z2);
    }

    public void E(ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1c36b2f", new Object[]{this, ellVar});
        } else {
            this.e.c(ellVar);
        }
    }

    public void a(Rect rect) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4d9e79e4", new Object[]{this, rect});
        } else {
            this.e.h(rect);
        }
    }

    public void b(String str, String str2, boolean z, ell ellVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30169cf3", new Object[]{this, str, str2, new Boolean(z), ellVar});
        } else {
            this.e.g(str, str2, z, ellVar);
        }
    }

    public boolean c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("17b3e663", new Object[]{this, str, str2})).booleanValue();
        }
        return this.e.l(str, str2);
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8cf616a", new Object[]{this});
        } else {
            this.c.d(this.b.p());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x0097, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.util.Pair<com.taobao.tbpoplayer.nativerender.dsl.StateModel, com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel> e(java.util.List<java.lang.String> r9, java.util.List<java.lang.String> r10, boolean r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.oe8.e(java.util.List, java.util.List, boolean, boolean):android.util.Pair");
    }

    public yam f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yam) ipChange.ipc$dispatch("94722f3f", new Object[]{this});
        }
        return this.f;
    }

    public jl1 g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (jl1) ipChange.ipc$dispatch("5a54e362", new Object[]{this});
        }
        return this.f25329a;
    }

    public long h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c7ad8aca", new Object[]{this})).longValue();
        }
        if (this.b.l() > 0) {
            return SystemClock.elapsedRealtime() - this.b.l();
        }
        return 0L;
    }

    public JSONObject i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("9b1d6359", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("stateIndex", (Object) Integer.valueOf(this.b.j()));
        jSONObject.put("stateId", (Object) this.b.i());
        jSONObject.put("stateVerId", (Object) this.b.m());
        return jSONObject;
    }

    public me8 j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (me8) ipChange.ipc$dispatch("9a0dda6e", new Object[]{this});
        }
        return this.b;
    }

    public kmj k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmj) ipChange.ipc$dispatch("c7019a73", new Object[]{this});
        }
        return this.d;
    }

    public void l(ComponentBaseModel componentBaseModel, String str, ActionModel actionModel, List<ActionsItemModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4745bd98", new Object[]{this, componentBaseModel, str, actionModel, list});
        } else {
            this.e.f(componentBaseModel, str, actionModel, list);
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
        } else {
            this.e.e();
        }
    }

    public String n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("76f0776d", new Object[]{this, str});
        }
        return this.e.k(str);
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b6af", new Object[]{this});
        } else {
            this.e.o();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
        } else {
            this.e.d();
        }
    }

    public boolean q(boolean z, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dd6ba627", new Object[]{this, new Boolean(z), list})).booleanValue();
        }
        return this.e.n(z, list);
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8569aa5a", new Object[]{this});
            return;
        }
        JSONObject jSONObject = this.b.f().appendTraceInfo;
        if (jSONObject != null) {
            this.b.h0(a1n.h(this, jSONObject.toJSONString(), false));
        } else {
            this.b.h0("");
        }
    }

    public void s(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("466bafef", new Object[]{this, str, str2});
        } else {
            this.e.j(str, str2);
        }
    }

    public void t(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f545bf9", new Object[]{this, str, str2, str3});
        } else {
            this.e.b(str, str2, str3);
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d4b8ef3", new Object[]{this});
        } else {
            this.e.a();
        }
    }

    public View v(StateModel stateModel, StateVersionModel stateVersionModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fabb5796", new Object[]{this, stateModel, stateVersionModel});
        }
        return this.e.i(stateModel, stateVersionModel);
    }

    public void w(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cf9b0fe", new Object[]{this, runnable});
        } else if (runnable != null) {
            this.g.execute(runnable);
        }
    }

    public void x(Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e093de53", new Object[]{this, runnable});
        } else if (runnable == null) {
        } else {
            if (Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else {
                this.b.v().post(runnable);
            }
        }
    }

    public void y(Runnable runnable, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9511ab", new Object[]{this, runnable, new Long(j)});
        } else if (runnable != null) {
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i <= 0 && Looper.getMainLooper() == Looper.myLooper()) {
                runnable.run();
            } else if (i > 0) {
                this.b.v().postDelayed(runnable, j);
            } else {
                this.b.v().post(runnable);
            }
        }
    }

    public void z(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c66eebe", new Object[]{this, str, jSONObject});
        } else if (!TextUtils.isEmpty(str) && jSONObject != null) {
            this.b.x().put(str.replaceAll("[$]", ""), (Object) jSONObject);
        }
    }
}
