package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateBaseModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateModel;
import com.taobao.tbpoplayer.nativerender.dsl.StateVersionModel;
import com.taobao.tbpoplayer.nativerender.dsl.WidgetAnimModel;
import com.taobao.tbpoplayer.nativerender.dsl.style.StyleModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tb.fcx;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class gmj extends ve8 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f20090a;
    public final String b;
    public String c;
    public b d;
    public final Handler e;
    public final oe8 f;
    public final d93 g;
    public volatile boolean h = false;
    public volatile boolean i = false;
    public Runnable j;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a extends TypeReference<ArrayList<JSONObject>> {
        public a(gmj gmjVar) {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b {
    }

    static {
        t2o.a(790626391);
    }

    public gmj(Context context, String str, String str2, Map<String, String> map, b bVar) {
        if (bVar != null) {
            if (context == null || TextUtils.isEmpty(str)) {
                ((fcx.a) bVar).a("PARAM_INVALID", "");
                return;
            }
            this.f20090a = str;
            this.b = str2;
            this.d = bVar;
            Handler handler = new Handler(Looper.getMainLooper());
            this.e = handler;
            oe8 oe8Var = new oe8(context, handler, 1, this);
            this.f = oe8Var;
            this.g = new d93(oe8Var);
            oe8Var.j().Y(map);
            u();
        }
    }

    public static /* synthetic */ Object ipc$super(gmj gmjVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tbpoplayer/nativerender/NativeWidgetEngine");
    }

    @Override // tb.ve8, tb.oe8.a
    public void a() {
        StateBaseModel f;
        long j;
        int i;
        WidgetAnimModel widgetAnimModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c832df14", new Object[]{this});
            return;
        }
        wdm.d("NativeWidgetEngine.onRenderStart", new Object[0]);
        me8 j2 = this.f.j();
        if (j2 != null && (f = j2.f()) != null) {
            StyleModel styleModel = f.style;
            if (styleModel == null || (widgetAnimModel = styleModel.widgetAnimBackground) == null) {
                j = -1;
                i = -1;
            } else {
                i = widgetAnimModel.times;
                j = widgetAnimModel.interval;
            }
            ((fcx.a) this.d).b(j2.c(), j2.d(), i, j);
        }
    }

    @Override // tb.ve8, tb.oe8.a
    public void b(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e720d97", new Object[]{this, str, str2, str3});
            return;
        }
        try {
            this.f.j().W(true);
            ((fcx.a) this.d).a(str, str2);
            s();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @Override // tb.ve8, tb.oe8.a
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f5949e8", new Object[]{this});
            return;
        }
        wdm.d("NativeWidgetEngine.onImageLoaded", new Object[0]);
        this.f.j().G();
        y();
    }

    @Override // tb.ve8, tb.oe8.a
    public void j(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e972d0d", new Object[]{this, str, str2});
        } else {
            b(str, str2, "");
        }
    }

    public final void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.g.b();
        Runnable runnable = this.j;
        if (runnable != null) {
            this.e.removeCallbacks(runnable);
        }
        this.d = null;
    }

    public final void t(String str) {
        JSONObject parseObject;
        List<JSONObject> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6102b9b", new Object[]{this, str});
            return;
        }
        try {
            if (!(TextUtils.isEmpty(str) || (parseObject = JSON.parseObject(str)) == null)) {
                String string = parseObject.getString("clickAreas");
                if (!TextUtils.isEmpty(string) && (list = (List) JSON.parseObject(string, new a(this).getType(), new Feature[0])) != null) {
                    for (JSONObject jSONObject : list) {
                        if (jSONObject != null) {
                            String h = a1n.h(this.f, jSONObject.getString("deepUrl"), false);
                            if (!TextUtils.isEmpty(h)) {
                                jSONObject.put("deepUrl", (Object) h);
                            }
                        }
                    }
                    parseObject.put("clickAreas", (Object) JSON.toJSONString(list));
                    this.c = JSON.toJSONString(parseObject);
                }
            }
        } catch (Throwable th) {
            wdm.h("NativeWidgetEngine.handleWidgetClickAreas.error", th);
        }
    }

    public final void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c16091b8", new Object[]{this});
        } else if (!TextUtils.isEmpty(this.b)) {
            try {
                this.f.j().x().put("initServerParam", (Object) JSON.parseObject(this.b));
            } catch (Throwable unused) {
                wdm.d("NativeWidgetEngine.parseLaunchParam.error.", new Object[0]);
            }
        }
    }

    public final /* synthetic */ void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93cadee0", new Object[]{this});
            return;
        }
        try {
            if (this.f.j().u() > 0 && !this.i) {
                this.f.s("LoadResOutOfTime", "");
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3508b42", new Object[]{this});
            return;
        }
        try {
            me8 j = this.f.j();
            if (j.B()) {
                wdm.d("NativeWidgetEngine.tryDisplay.isEngineClosed.return.", new Object[0]);
                return;
            }
            j.U(true);
            View c = this.g.c();
            ((fcx.a) this.d).c(c, plj.e(j, c), this.c);
            s();
        } catch (Throwable th) {
            wdm.h("NativeWidgetEngine.tryDisplay.runInGlobalThread.error", th);
            this.f.s("LOAD_BITMAP_ERROR", String.valueOf(th.getMessage()));
        }
    }

    public void x() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        wdm.d("DSLFetcher.fetchDSL.dsl=%s", this.f20090a);
        if (TextUtils.isEmpty(this.f20090a)) {
            this.f.s("DSL_EMPTY", "");
            return;
        }
        try {
            DSLModel dSLModel = (DSLModel) JSON.parseObject(this.f20090a, DSLModel.class);
            if (!dSLModel.isValid()) {
                this.f.s("DSL_INVALID", "");
                return;
            }
            this.f.j().V(dSLModel);
            t(dSLModel.extraInfo);
            if (!af4.a(dSLModel.condition, this.f, true)) {
                this.f.t("DisplayConditionCheckNotPass", "", null);
                return;
            }
            Pair<StateModel, StateVersionModel> e = this.f.e(null, dSLModel.startStates, false, false);
            if (e == null || (obj = e.first) == null) {
                this.f.s("GetFirstStateVerFailed", "");
            } else if (this.g.e((StateModel) obj, (StateVersionModel) e.second) == null) {
                this.f.s("InitStateViewError", "");
            } else {
                this.h = true;
                y();
                if (!this.i) {
                    Runnable fmjVar = new Runnable() { // from class: tb.fmj
                        @Override // java.lang.Runnable
                        public final void run() {
                            gmj.this.v();
                        }
                    };
                    this.j = fmjVar;
                    this.e.postDelayed(fmjVar, 60000L);
                }
            }
        } catch (Throwable unused) {
            this.f.s("DSL_INVALID_CATCH_ERROR", "");
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb557f8e", new Object[]{this});
        } else if ((this.f.j().t() == 0 || this.f.j().u() <= 0) && !this.i && this.h && !this.f.j().B()) {
            this.i = true;
            this.f.w(new Runnable() { // from class: tb.emj
                @Override // java.lang.Runnable
                public final void run() {
                    gmj.this.w();
                }
            });
        }
    }
}
