package com.alibaba.ability.impl.toast;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsToastAbility;
import com.taobao.homepage.pop.utils.PopConst;
import java.util.Map;
import tb.a07;
import tb.abl;
import tb.bee;
import tb.ckf;
import tb.g0u;
import tb.g8;
import tb.hbl;
import tb.jdb;
import tb.kdb;
import tb.qde;
import tb.t2o;
import tb.vu3;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ToastAbility extends AbsToastAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String API_SHOW = "show";
    public static final a Companion = new a(null);
    public static final int DURATION_TIME_SHORT = 2000;

    /* renamed from: a  reason: collision with root package name */
    public final bee f2056a = g8.a();
    public Handler b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(137363459);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ Toast b;
        public final /* synthetic */ Context c;
        public final /* synthetic */ g0u d;

        public b(Toast toast, Context context, g0u g0uVar) {
            this.b = toast;
            this.c = context;
            this.d = g0uVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ToastAbility toastAbility = ToastAbility.this;
            Toast toast = this.b;
            ckf.f(toast, "toast");
            ToastAbility.access$showToast(toastAbility, toast, this.c, this.d);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class c implements qde {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f2058a;
        public final /* synthetic */ Toast b;

        public c(Context context, Toast toast) {
            this.f2058a = context;
            this.b = toast;
        }

        @Override // tb.qde
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1414cfeb", new Object[]{this, view});
                return;
            }
            ckf.g(view, "view");
            FrameLayout frameLayout = new FrameLayout(this.f2058a);
            if (view.getLayoutParams() != null) {
                view.setLayoutParams(new FrameLayout.LayoutParams(view.getLayoutParams().width, view.getLayoutParams().height, 17));
            }
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
            frameLayout.addView(view);
            this.b.setView(frameLayout);
            this.b.show();
        }

        @Override // tb.qde
        public void onEvent(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9589844c", new Object[]{this, str});
            }
        }

        @Override // tb.qde
        public void onFailed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("616e008d", new Object[]{this, str});
            } else {
                this.b.show();
            }
        }
    }

    static {
        t2o.a(137363458);
    }

    public static final /* synthetic */ void access$showToast(ToastAbility toastAbility, Toast toast, Context context, g0u g0uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("679aed18", new Object[]{toastAbility, toast, context, g0uVar});
        } else {
            toastAbility.b(toast, context, g0uVar);
        }
    }

    public static /* synthetic */ Object ipc$super(ToastAbility toastAbility, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/toast/ToastAbility");
    }

    public final Handler a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("590b0a64", new Object[]{this});
        }
        Handler handler = this.b;
        if (handler != null) {
            return handler;
        }
        Handler handler2 = new Handler(Looper.getMainLooper());
        this.b = handler2;
        return handler2;
    }

    public final void b(Toast toast, Context context, g0u g0uVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d171d74d", new Object[]{this, toast, context, g0uVar});
        } else if (this.f2056a == null || abl.f()) {
            toast.show();
        } else {
            bee beeVar = this.f2056a;
            if (beeVar != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("duration", (Object) Double.valueOf(g0uVar.b));
                jSONObject.put("content", (Object) g0uVar.f19667a);
                String str = g0uVar.d;
                String str2 = "";
                if (str == null) {
                    str = str2;
                }
                jSONObject.put("iconFont", (Object) str);
                String str3 = g0uVar.e;
                if (str3 != null) {
                    str2 = str3;
                }
                jSONObject.put("iconURL", (Object) str2);
                jSONObject.put("delay", (Object) g0uVar.c);
                xhv xhvVar = xhv.INSTANCE;
                beeVar.d("toast", jSONObject, context, new c(context, toast));
            }
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        bee beeVar = this.f2056a;
        if (beeVar != null) {
            beeVar.destroy();
        }
        this.b = null;
    }

    @Override // com.taobao.android.abilityidl.ability.AbsToastAbility
    public void show(kdb kdbVar, g0u g0uVar, jdb jdbVar) {
        int i = 1;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dbe5e8c", new Object[]{this, kdbVar, g0uVar, jdbVar});
            return;
        }
        ckf.g(kdbVar, "abilityContext");
        ckf.g(g0uVar, "params");
        ckf.g(jdbVar, "callback");
        Context context = kdbVar.l().getContext();
        if (context != null) {
            String str = g0uVar.f19667a;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            if (str != null) {
                if (hbl.g()) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("content", (Object) g0uVar.f19667a);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("api", (Object) "Toast.show");
                        jSONObject2.put("params", (Object) jSONObject);
                        jSONObject2.put("namespace", (Object) kdbVar.l().getNamespace());
                        jSONObject2.put(PopConst.BRIDGE_KEY_BUSINESS_ID, (Object) kdbVar.l().getBusinessID());
                        jSONObject2.put("url", kdbVar.m("url"));
                        AppMonitor.Alarm.commitSuccess("Megability", "WidgetMonitor", jSONObject2.toJSONString());
                    } catch (Exception unused) {
                    }
                }
                if (g0uVar.b <= 2000) {
                    i = 0;
                }
                Toast makeText = Toast.makeText(context, str, i);
                makeText.setGravity(23, 0, 0);
                Double d = g0uVar.c;
                if (d == null) {
                    d = Double.valueOf((double) vu3.b.GEO_NOT_SUPPORT);
                }
                double doubleValue = d.doubleValue();
                if (doubleValue > 0) {
                    a().postDelayed(new b(makeText, context, g0uVar), (long) doubleValue);
                } else {
                    b(makeText, context, g0uVar);
                }
            } else {
                jdbVar.O(new ErrorResult("CONTENT_EMPTY", "content is empty", (Map) null, 4, (a07) null));
            }
        } else {
            jdbVar.O(ErrorResult.a.Companion.g("NoAppCtx"));
        }
    }
}
