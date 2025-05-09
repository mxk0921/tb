package tb;

import android.app.Activity;
import android.content.Context;
import com.alibaba.ability.hub.AbilityHubAdapter;
import com.alibaba.ability.impl.stdpop.StdPopAbility;
import com.alibaba.ability.result.ErrorResult;
import com.alibaba.ability.result.ExecuteResult;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.utils.CashDeskLog;
import tb.xhi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xhi {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a implements msc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "MegaAbility：msg " + errorResult.getMsg());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ vii f31401a;
        public final /* synthetic */ Context b;

        public b(vii viiVar, Context context) {
            this.f31401a = viiVar;
            this.b = context;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "MegaAbility：showLoading");
            u6h a2 = u6h.a();
            if (a2 != null) {
                this.f31401a.c((Activity) this.b, a2, null);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class c implements d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Runnable f31402a;

        public c(Runnable runnable) {
            this.f31402a = runnable;
        }

        @Override // tb.xhi.d
        public void a(String str, String str2, String str3) {
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6558de82", new Object[]{this, str, str2, str3});
                return;
            }
            hav.d("MegaAbility", "MegaAbility:" + str + ",code:" + str2 + ",message:" + str3);
            if (xal.a("enableOnFailCloseCb", true) && (runnable = this.f31402a) != null) {
                runnable.run();
            }
        }

        @Override // tb.xhi.d
        public void onSuccess(String str) {
            Runnable runnable;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("37d948b5", new Object[]{this, str});
                return;
            }
            hav.d("MegaAbility", "MegaAbility:" + str);
            if ("onClose".equals(str) && (runnable = this.f31402a) != null) {
                runnable.run();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface d {
        void a(String str, String str2, String str3);

        void onSuccess(String str);
    }

    public static void b(vii viiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f4dcddd9", new Object[]{viiVar});
        } else if (viiVar != null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "MegaAbility：hideLoading");
            viiVar.b(null);
        }
    }

    public static /* synthetic */ void d(d dVar, ExecuteResult executeResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93ab6cf5", new Object[]{dVar, executeResult});
            return;
        }
        String type = executeResult.getType();
        if (executeResult instanceof ErrorResult) {
            ErrorResult errorResult = (ErrorResult) executeResult;
            String code = errorResult.getCode();
            String msg = errorResult.getMsg();
            hav.d("MegaAbility", "error message code:" + code + ";message:" + msg + ";type:" + type);
            dVar.a(type, code, msg);
            return;
        }
        dVar.onSuccess(type);
    }

    public static void e(vii viiVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e319c34", new Object[]{viiVar, context});
        } else if (context instanceof Activity) {
            ((Activity) context).runOnUiThread(new b(viiVar, context));
        }
    }

    public static void f(Activity activity, JSONObject jSONObject, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f53941e1", new Object[]{activity, jSONObject, runnable});
        } else {
            c(activity, jSONObject, "fields", runnable);
        }
    }

    public static void g(Activity activity, String str, String str2, JSONObject jSONObject, final d dVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("daddcdd0", new Object[]{activity, str, str2, jSONObject, dVar});
        } else if (jSONObject != null && (string = jSONObject.getString("bizId")) != null) {
            AbilityHubAdapter abilityHubAdapter = new AbilityHubAdapter(new zq(string, "tbCashier").a(activity));
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "MegaAbility：打开浮层");
            abilityHubAdapter.j(str, str2, new xq().p(activity.getWindow().getDecorView()), jSONObject, new s2d() { // from class: tb.whi
                @Override // tb.s2d
                public final void onCallback(ExecuteResult executeResult) {
                    xhi.d(xhi.d.this, executeResult);
                }
            });
        }
    }

    public static void h(Activity activity, JSONObject jSONObject, Runnable runnable) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a619b4f", new Object[]{activity, jSONObject, runnable});
        } else {
            c(activity, jSONObject, "params", runnable);
        }
    }

    public static void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1afc03b", new Object[]{str});
            return;
        }
        CashDeskLog.e(CashDeskLog.TagLevel.CORE, "MegaAbility：showToast[" + str + "]");
        hji.a().b(str, new a());
    }

    public static void j(Activity activity, JSONObject jSONObject, JSONObject jSONObject2, d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("758feead", new Object[]{activity, jSONObject, jSONObject2, dVar});
            return;
        }
        if (jSONObject2 != null) {
            jSONObject.put("content", (Object) jSONObject2);
        }
        g(activity, "stdPop", StdPopAbility.API_WEEX2, jSONObject, dVar);
    }

    public static void c(Activity activity, JSONObject jSONObject, String str, Runnable runnable) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12f6e7b5", new Object[]{activity, jSONObject, str, runnable});
        } else if (jSONObject != null) {
            CashDeskLog.e(CashDeskLog.TagLevel.CORE, "execute invokeMega，params：" + jSONObject.toJSONString());
            JSONObject jSONObject2 = jSONObject.getJSONObject(str);
            if (jSONObject2 != null && (string = jSONObject.getString("type")) != null) {
                String[] split = string.split("\\.");
                if (split.length == 2) {
                    g(activity, split[0], split[1], jSONObject2, new c(runnable));
                }
            }
        }
    }
}
