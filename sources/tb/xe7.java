package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.data.meta.DetailClientData;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class xe7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f31331a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912262107);
        }

        public a() {
        }

        @JvmStatic
        public final Boolean a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("3e37ff5d", new Object[]{this});
            }
            if (xe7.a() != null) {
                return xe7.a();
            }
            try {
                String g = lg7.g(mr7.d(), "mainApiBatchPreload");
                if (g != null) {
                    return Boolean.valueOf(Boolean.parseBoolean(g));
                }
                return null;
            } catch (Throwable th) {
                tgh.c("DetailClientOptHandler", "getDetailClientOpt", th);
                return null;
            }
        }

        @JvmStatic
        public final void b(DetailClientData detailClientData) {
            String string;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fd4fc93c", new Object[]{this, detailClientData});
            } else if (detailClientData != null) {
                try {
                    JSONObject jSONObject = detailClientData.detailClientOpt;
                    if (jSONObject != null && (string = jSONObject.getString("mainApiBatchPreload")) != null) {
                        lg7.l(mr7.d(), "mainApiBatchPreload", string);
                        xe7.b(Boolean.valueOf(Boolean.parseBoolean(string)));
                    }
                } catch (Throwable th) {
                    tgh.c("DetailClientOptHandler", "saveDetailClientOpt", th);
                }
            }
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(912262106);
    }

    public static final /* synthetic */ Boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("72890a9b", new Object[0]);
        }
        return f31331a;
    }

    public static final /* synthetic */ void b(Boolean bool) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3aae9063", new Object[]{bool});
        } else {
            f31331a = bool;
        }
    }

    @JvmStatic
    public static final Boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Boolean) ipChange.ipc$dispatch("3e37ff5d", new Object[0]);
        }
        return Companion.a();
    }

    @JvmStatic
    public static final void d(DetailClientData detailClientData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd4fc93c", new Object[]{detailClientData});
        } else {
            Companion.b(detailClientData);
        }
    }
}
