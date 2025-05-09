package tb;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.result.ErrorResult;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.FavoriteGuideResultData;
import com.taobao.android.abilityidl.ability.FavoriteResultData;
import com.taobao.android.detail.ttdetail.handler.bizhandlers.CollectorImplementor;
import com.taobao.taobao.R;
import java.util.Map;
import tb.b5m;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class f9t {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "TaobaoCollectHelperV2";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements usc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.p f19124a;

        public a(b5m.p pVar) {
            this.f19124a = pVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                f9t.a(this.f19124a, errorResult);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.p pVar = this.f19124a;
            if (pVar != null) {
                pVar.onSuccess(Boolean.TRUE.equals(favoriteResultData.favorite));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements usc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f19125a;

        public b(b5m.k kVar) {
            this.f19125a = kVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                f9t.b(this.f19125a, errorResult);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.k kVar = this.f19125a;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class c implements usc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.k f19126a;

        public c(b5m.k kVar) {
            this.f19126a = kVar;
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                f9t.b(this.f19126a, errorResult);
            }
        }

        @Override // tb.m5c
        public void q0(FavoriteResultData favoriteResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c7700a9d", new Object[]{this, favoriteResultData});
                return;
            }
            b5m.k kVar = this.f19126a;
            if (kVar != null) {
                kVar.onSuccess();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class d implements hky {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b5m.y f19127a;

        public d(b5m.y yVar) {
            this.f19127a = yVar;
        }

        @Override // tb.k5c
        public void L(FavoriteGuideResultData favoriteGuideResultData) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9816549", new Object[]{this, favoriteGuideResultData});
            } else {
                ((CollectorImplementor.a) this.f19127a).b(Boolean.TRUE.equals(favoriteGuideResultData.needShowGuide));
            }
        }

        @Override // tb.jdb
        public void O(ErrorResult errorResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("14182866", new Object[]{this, errorResult});
            } else {
                ((CollectorImplementor.a) this.f19127a).a(errorResult.getCode(), errorResult.getMsg());
            }
        }
    }

    static {
        t2o.a(354418737);
    }

    public static /* synthetic */ void a(b5m.p pVar, ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cafcc5f", new Object[]{pVar, errorResult});
        } else {
            j(pVar, errorResult);
        }
    }

    public static /* synthetic */ void b(b5m.k kVar, ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2909c60", new Object[]{kVar, errorResult});
        } else {
            i(kVar, errorResult);
        }
    }

    public static void c(String str, Map<String, String> map, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b319457", new Object[]{str, map, kVar});
            return;
        }
        h39 a2 = h39.Companion.a(str, "ITEM");
        if (a2 != null) {
            a2.d = map;
        }
        oii.c().b(a2, new b(kVar));
    }

    public static void d(String str, b5m.k kVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e794261", new Object[]{str, kVar});
        } else {
            oii.c().h(str, "ITEM", new c(kVar));
        }
    }

    public static String e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c72c4bb7", new Object[0]);
        }
        return Localization.q(R.string.tt_detail_app_busy_system_tired);
    }

    public static String f(String str, String str2) {
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("14131568", new Object[]{str, str2});
        }
        if (str2 == null) {
            str3 = g(str);
        } else {
            str3 = h(str, str2);
        }
        if (TextUtils.equals("-1", str3)) {
            return null;
        }
        return str3;
    }

    public static String g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74d255f5", new Object[]{str});
        }
        oii c2 = oii.c();
        h39 a2 = h39.Companion.a(str, "ITEM");
        if (a2 == null) {
            return "-1";
        }
        tao<String, ErrorResult> d2 = c2.d(a2);
        if (d2.d() != null) {
            return "-1";
        }
        String c3 = d2.c();
        if (TextUtils.isEmpty(c3)) {
            return "-1";
        }
        return c3;
    }

    public static String h(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("22b9f757", new Object[]{str, str2});
        }
        oii c2 = oii.c();
        f39 a2 = f39.Companion.a("detail", str, str2, "ITEM");
        if (a2 == null) {
            return "-1";
        }
        tao<String, ErrorResult> f = c2.f(a2);
        if (f.d() != null) {
            return "-1";
        }
        String c3 = f.c();
        if (TextUtils.isEmpty(c3)) {
            return "-1";
        }
        return c3;
    }

    public static void i(b5m.k kVar, ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42210cbc", new Object[]{kVar, errorResult});
        } else if (kVar != null) {
            String code = errorResult.getCode();
            if (TextUtils.isEmpty(code)) {
                code = "unknown";
            }
            String msg = errorResult.getMsg();
            if (TextUtils.isEmpty(msg)) {
                msg = e();
            }
            kVar.onFailure(code, msg);
        }
    }

    public static void j(b5m.p pVar, ErrorResult errorResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46ca171a", new Object[]{pVar, errorResult});
        } else if (pVar != null) {
            String code = errorResult.getCode();
            if (TextUtils.isEmpty(code)) {
                code = "unknown";
            }
            String msg = errorResult.getMsg();
            if (TextUtils.isEmpty(msg)) {
                msg = e();
            }
            pVar.onFailure(code, msg);
        }
    }

    public static void k(String str, b5m.p pVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af37d0d", new Object[]{str, pVar});
        } else {
            oii.c().i(str, "ITEM", new a(pVar));
        }
    }

    public static void l(boolean z, b5m.y yVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69824120", new Object[]{new Boolean(z), yVar});
            return;
        }
        oii c2 = oii.c();
        g39 a2 = g39.a();
        if (a2 == null) {
            ((CollectorImplementor.a) yVar).b(false);
            return;
        }
        a2.f19708a = "detail";
        a2.b = Boolean.valueOf(z);
        c2.a(a2, new d(yVar));
    }
}
