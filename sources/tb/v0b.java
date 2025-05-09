package tb;

import android.content.Context;
import android.view.ViewStub;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRenderOptions;
import com.taobao.android.dinamicx.DXRootView;
import com.taobao.tao.log.TLog;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class v0b extends t0b {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = v0b.class.getSimpleName();
    public DXRootView e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements wl7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.wl7
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67253d14", new Object[]{this});
                return;
            }
            String d = v0b.d();
            TLog.loge(d, "onInflateFail," + v0b.e(v0b.this));
        }

        @Override // tb.wl7
        public void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6fc7a84f", new Object[]{this});
                return;
            }
            String d = v0b.d();
            TLog.loge(d, "onInflateSuccess," + v0b.e(v0b.this));
        }
    }

    static {
        t2o.a(310378727);
    }

    public v0b(ViewStub viewStub, Context context, b0h b0hVar) {
        super(viewStub, context, b0hVar);
    }

    public static /* synthetic */ String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7022ea09", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ String e(v0b v0bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e8227d3", new Object[]{v0bVar});
        }
        return v0bVar.f;
    }

    public static /* synthetic */ Object ipc$super(v0b v0bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeMainFloatDXView");
    }

    public void f(Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8358cb4b", new Object[]{this, obj, new Boolean(z)});
        } else if (!lrq.a(this.f)) {
            this.e = this.c.q().getDinamicSdkManager().createDX(this.d, this.f, new a());
            g();
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c063b76", new Object[]{this});
        } else if (this.b != null && this.e != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("newChannel", (Object) "true");
            jSONObject.put("pad", (Object) Boolean.valueOf(sj7.w(this.d)));
            jSONObject.put("foldDevice", (Object) Boolean.valueOf(sj7.s(this.d)));
            jSONObject.put("hasTBLHomeAnimatedView", (Object) "true");
            b0h b0hVar = this.c;
            if (b0hVar != null) {
                jSONObject.put("spmPre", (Object) b0hVar.g);
                jSONObject.put("livesourcePre", (Object) this.c.f);
                jSONObject.put("entityId", (Object) this.c.h);
                jSONObject.put("launcherType", (Object) this.c.n());
            }
            this.b.removeAllViews();
            if (this.c.q().getDinamicSdkManager().renderDX(this.d, this.e, jSONObject, new DXRenderOptions.b().E(new p0b()).q(), new x0b(this))) {
                this.b.addView(this.e);
            }
        }
    }

    public void h(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde46ef8", new Object[]{this, str});
        } else {
            this.f = str;
        }
    }
}
