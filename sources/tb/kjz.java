package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.kr;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class kjz<T> implements sud {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final a Companion = new a(null);
    public static final int ERROR_CODE = 10086;
    public static final String TAG = "PageRefreshAbility";

    /* renamed from: a  reason: collision with root package name */
    public final zfr<T> f22717a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(804257808);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(804257807);
        t2o.a(803209236);
    }

    public kjz(jfr<T> jfrVar, zfr<T> zfrVar) {
        ckf.g(jfrVar, "context");
        ckf.g(zfrVar, "pageManager");
        this.f22717a = zfrVar;
    }

    @Override // tb.sud
    public void a(String str, JSONObject jSONObject, lr lrVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c8c347dc", new Object[]{this, str, jSONObject, lrVar});
            return;
        }
        ckf.g(str, "name");
        ckf.g(jSONObject, "data");
        wfr wfrVar = wfr.INSTANCE;
        wfrVar.d(TAG, "execute page refresh");
        try {
            T e = this.f22717a.a().d().e();
            if (e == null) {
                wfrVar.b(TAG, "current data model is null");
                if (lrVar != null) {
                    lrVar.a(new kr.a(10086, "current data model is null"));
                    return;
                }
                return;
            }
            this.f22717a.r(e);
            if (lrVar != null) {
                lrVar.a(kr.b.INSTANCE);
            }
        } catch (Exception e2) {
            wfr.INSTANCE.c(TAG, "refresh page error", e2);
            if (lrVar != null) {
                lrVar.a(new kr.a(10086, "refresh page error: " + e2.getMessage()));
            }
        }
    }
}
