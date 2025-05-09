package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.framework.data.datamodel.a;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class kaw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private static boolean h = false;

        /* renamed from: a  reason: collision with root package name */
        private Context f22523a;
        private String b;
        private JSONObject c;
        private int d;
        private HashMap<String, String> e;
        private h9e f;
        private String g = null;

        /* compiled from: Taobao */
        /* renamed from: tb.kaw$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class C0966a implements h9e {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public C0966a() {
            }

            @Override // tb.h9e
            public void onCancel(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("44139f0a", new Object[]{this, str});
                } else if (a.a(a.this) != null) {
                    a.a(a.this).onCancel(str);
                }
            }

            @Override // tb.h9e
            public void onError(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("ac367d3a", new Object[]{this, str});
                } else if (a.a(a.this) != null) {
                    a.a(a.this).onError(str);
                }
            }

            @Override // tb.h9e
            public void onFinish(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                    return;
                }
                if (!a.b()) {
                    ggs.e("TAB2_VIDEO_PRELOAD_STAGE", "cachedVideo");
                    a.c(true);
                }
                if (a.a(a.this) != null) {
                    a.a(a.this).onFinish(i);
                }
            }

            @Override // tb.h9e
            public void onProgress(int i) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
                } else if (a.a(a.this) != null) {
                    a.a(a.this).onProgress(i);
                }
            }

            @Override // tb.h9e
            public void onStart(String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
                } else if (a.a(a.this) != null) {
                    a.a(a.this).onStart(str);
                }
            }
        }

        static {
            t2o.a(468714725);
        }

        public a(Context context, String str, JSONObject jSONObject, int i, HashMap<String, String> hashMap, h9e h9eVar) {
            this.f22523a = context;
            this.b = str;
            this.c = jSONObject;
            this.d = i;
            this.e = hashMap;
            this.f = h9eVar;
        }

        public static /* synthetic */ h9e a(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (h9e) ipChange.ipc$dispatch("26beab51", new Object[]{aVar});
            }
            return aVar.f;
        }

        public static /* synthetic */ boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f1bc42bc", new Object[0])).booleanValue();
            }
            return h;
        }

        public static /* synthetic */ boolean c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("4936785e", new Object[]{new Boolean(z)})).booleanValue();
            }
            h = z;
            return z;
        }

        public static /* synthetic */ String d(a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("58bf7bd5", new Object[]{aVar});
            }
            return aVar.g;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                this.g = lv7.d(this.f22523a, this.b, this.c, this.d, this.e, new C0966a());
            }
        }
    }

    static {
        t2o.a(468714724);
    }

    public static void a(Context context, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d0bbd7d", new Object[]{context, aVar});
        } else if (aVar != null) {
            uyr.a(aVar);
            qmm.a(context, a.d(aVar));
        }
    }

    public static a b(Context context, com.taobao.android.fluid.framework.data.datamodel.a aVar, int i, HashMap<String, String> hashMap, h9e h9eVar, int i2) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("a75897fd", new Object[]{context, aVar, new Integer(i), hashMap, h9eVar, new Integer(i2)});
        }
        if (context == null || aVar == null || aVar.e() == null || aVar.e().z()) {
            if (h9eVar != null) {
                h9eVar.onError("mediaSetData invalid");
            }
            return null;
        }
        a.d e = aVar.e();
        a.e K = e.K();
        if (K == null) {
            if (h9eVar != null) {
                h9eVar.onError("ShortVideoDetail invalid");
            }
            return null;
        }
        String f = e.f();
        try {
            jSONObject = new JSONObject(K.m());
        } catch (Exception e2) {
            ir9.c("VideoPreLoadAssistant", "parse video resource error", e2);
            jSONObject = null;
        }
        if (jSONObject != null) {
            return c(context, f, jSONObject, i, hashMap, h9eVar, i2);
        }
        if (h9eVar != null) {
            h9eVar.onError("video resource is null");
        }
        return null;
    }

    public static a c(Context context, String str, JSONObject jSONObject, int i, HashMap<String, String> hashMap, h9e h9eVar, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("7d2a9298", new Object[]{context, str, jSONObject, new Integer(i), hashMap, h9eVar, new Integer(i2)});
        }
        if (context != null && jSONObject != null) {
            a aVar = new a(context, str, jSONObject, i, hashMap, h9eVar);
            uyr.b(aVar, i2);
            return aVar;
        } else if (h9eVar == null) {
            return null;
        } else {
            h9eVar.onError("videoResourceJson or context invalid");
            return null;
        }
    }
}
