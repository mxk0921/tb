package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;
import java.util.Observable;
import java.util.Observer;
import kotlin.jvm.JvmStatic;
import tb.e8t;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class e8t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public static String f18362a;
    public static boolean b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815792681);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final void d(Observable observable, Object obj) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4661e617", new Object[]{observable, obj});
            } else if (obj instanceof JSONObject) {
                IpChange ipChange2 = e8t.$ipChange;
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("data");
                if (jSONObject == null || (str = jSONObject.getString("cacheParams")) == null) {
                    str = "";
                }
                e8t.d(str);
                mno.h(Globals.getApplication(), "tbsearch:tpp_params", e8t.b());
            }
        }

        @JvmStatic
        public final String a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("48f31a27", new Object[]{this});
            }
            b();
            if (e8t.b() == null) {
                e8t.d(mno.c(Globals.getApplication(), "tbsearch:tpp_params"));
            }
            String b = e8t.b();
            return b == null ? "" : b;
        }

        public final void b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4794b1d6", new Object[]{this});
            } else if (!e8t.a()) {
                e8t.c(true);
                cca.INSTANCE.d("TaoPP", new Observer() { // from class: tb.sqz
                    @Override // java.util.Observer
                    public final void update(Observable observable, Object obj) {
                        e8t.a.d(observable, obj);
                    }
                });
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(815792680);
    }

    public static final /* synthetic */ boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dc2f1cb6", new Object[0])).booleanValue();
        }
        return b;
    }

    public static final /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f52fd55a", new Object[0]);
        }
        return f18362a;
    }

    public static final /* synthetic */ void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e08bc5d6", new Object[]{new Boolean(z)});
        } else {
            b = z;
        }
    }

    public static final /* synthetic */ void d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c196f75c", new Object[]{str});
        } else {
            f18362a = str;
        }
    }
}
