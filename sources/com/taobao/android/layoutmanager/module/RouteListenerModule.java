package com.taobao.android.layoutmanager.module;

import android.app.Activity;
import android.net.Uri;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.browser.BrowserActivity;
import com.taobao.orange.OrangeConfig;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.core.o;
import com.taobao.tao.flexbox.layoutmanager.module.CleanAnnotation;
import com.ut.mini.UTTracker;
import java.util.Map;
import java.util.WeakHashMap;
import tb.c2v;
import tb.n3v;
import tb.p3v;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
@CleanAnnotation(name = "clean")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class RouteListenerModule {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "RouteListenerModule";

    /* renamed from: a  reason: collision with root package name */
    public static final WeakHashMap<String, d.j> f8216a = new WeakHashMap<>();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class a implements b.AbstractC0434b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public void a(String str, String str2, String str3, String str4) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2feeb30d", new Object[]{this, str, str2, str3, str4});
            } else if (str != null && str2 != null && str3 != null && str4 != null) {
                tfs.e("TnodeRouteListenerModule", "routePath:" + str + "->" + str3);
                for (Map.Entry<String, d.j> entry : RouteListenerModule.f8216a.entrySet()) {
                    d.j value = entry.getValue();
                    if (value != null) {
                        value.c.a(value, RouteListenerModule.a(str, str2, str3, str4));
                    }
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static b h = null;

        /* renamed from: a  reason: collision with root package name */
        public int f8217a = 1;
        public String b = "";
        public String c = "";
        public String d = "";
        public String e = "";
        public AbstractC0434b f = null;
        public n3v g = null;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public class a extends n3v {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
                if (str.hashCode() == -1491668773) {
                    super.pageAppear((UTTracker) objArr[0], objArr[1], (String) objArr[2], ((Boolean) objArr[3]).booleanValue());
                    return null;
                }
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/layoutmanager/module/RouteListenerModule$TrackPath$1");
            }

            @Override // tb.n3v
            public void pageAppear(UTTracker uTTracker, Object obj, String str, boolean z) {
                Uri data;
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("a716f0db", new Object[]{this, uTTracker, obj, str, new Boolean(z)});
                    return;
                }
                try {
                    super.pageAppear(uTTracker, obj, str, z);
                    b.a(b.this, 2);
                    if (str != null) {
                        updatePageName(uTTracker, obj, str);
                    }
                    if ((obj instanceof BrowserActivity) && (data = ((Activity) obj).getIntent().getData()) != null) {
                        updatePageName(uTTracker, obj, data.getHost() + data.getPath());
                    }
                } catch (Throwable th) {
                    tfs.e(RouteListenerModule.TAG, th.getMessage());
                }
            }

            @Override // tb.n3v
            public void pageDisAppear(UTTracker uTTracker, Object obj) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("2941721f", new Object[]{this, uTTracker, obj});
                } else {
                    b.a(b.this, 1);
                }
            }

            @Override // tb.n3v
            public String trackerListenerName() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    return (String) ipChange.ipc$dispatch("1d8246a2", new Object[]{this});
                }
                return "tnode";
            }

            @Override // tb.n3v
            public void updatePageName(UTTracker uTTracker, Object obj, String str) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("20fa4c9a", new Object[]{this, uTTracker, obj, str});
                } else if (str != null) {
                    try {
                        if (!str.equals(b.this.c) && obj != null && b.a(b.this, 4)) {
                            b bVar = b.this;
                            bVar.b = bVar.c;
                            bVar.d = bVar.e;
                            bVar.c = str;
                            bVar.e = obj.getClass().getSimpleName();
                            b bVar2 = b.this;
                            ((a) bVar2.f).a(bVar2.b, bVar2.d, bVar2.c, bVar2.e);
                        }
                    } catch (Throwable th) {
                        tfs.e(RouteListenerModule.TAG, th.getMessage());
                    }
                }
            }
        }

        /* compiled from: Taobao */
        /* renamed from: com.taobao.android.layoutmanager.module.RouteListenerModule$b$b  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public interface AbstractC0434b {
        }

        static {
            t2o.a(502268136);
        }

        public static /* synthetic */ boolean a(b bVar, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("70de092f", new Object[]{bVar, new Integer(i)})).booleanValue();
            }
            return bVar.b(i);
        }

        public static void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("89c49781", new Object[0]);
                return;
            }
            try {
                b bVar = h;
                if (!(bVar == null || bVar.g == null)) {
                    p3v.getInstance().unregisterListener(h.g);
                }
                h = null;
            } catch (Throwable th) {
                tfs.e(RouteListenerModule.TAG, "exception:" + th.getMessage());
            }
        }

        public static void e(AbstractC0434b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9aabedbb", new Object[]{bVar});
            } else if (h == null) {
                b bVar2 = new b();
                h = bVar2;
                bVar2.f();
                h.f = bVar;
            }
        }

        public final boolean b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b3b50ef", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i != 1) {
                if (i != 2) {
                    if (i == 4 && d(2)) {
                        this.f8217a = i;
                        return true;
                    }
                } else if (d(1)) {
                    this.f8217a = i;
                    return true;
                }
            } else if (d(7)) {
                this.f8217a = i;
                return true;
            }
            return false;
        }

        public final boolean d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d3f3fbe9", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if ((i & this.f8217a) != 0) {
                return true;
            }
            return false;
        }

        public final void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("76b9808a", new Object[]{this});
                return;
            }
            try {
                this.g = new a();
                p3v.getInstance().registerListener(this.g);
                if (c2v.getInstance() != null) {
                    this.c = c2v.getInstance().getCurrentPageName();
                }
            } catch (Throwable th) {
                tfs.e(RouteListenerModule.TAG, "exception:" + th.getMessage());
            }
        }
    }

    static {
        t2o.a(502268134);
        t2o.a(503316559);
    }

    public static /* synthetic */ JSONObject a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5fb847bf", new Object[]{str, str2, str3, str4});
        }
        return b(str, str2, str3, str4);
    }

    public static JSONObject b(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("aafe387a", new Object[]{str, str2, str3, str4});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("lastPage", (Object) str);
        jSONObject.put("lastActivity", (Object) str2);
        jSONObject.put("currentPage", (Object) str3);
        jSONObject.put("currentActivity", (Object) str4);
        return jSONObject;
    }

    public static void clean(o oVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("557c1de0", new Object[]{oVar});
            return;
        }
        f8216a.clear();
        b.c();
    }

    public static void registerPageListener(d.j jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3fa894a6", new Object[]{jVar});
        } else if ("true".equals(OrangeConfig.getInstance().getConfig("tnode", "openRouteListenerModule", "true"))) {
            JSON json = jVar.b;
            if (json instanceof JSONObject) {
                String string = ((JSONObject) json).getString("scence");
                if (!TextUtils.isEmpty(string)) {
                    f8216a.put(string, jVar);
                    b.e(new a());
                }
            }
        }
    }

    public static void unregisterPageListener(d.j jVar) {
        String string;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("846732ad", new Object[]{jVar});
            return;
        }
        JSON json = jVar.b;
        if ((json instanceof JSONObject) && (string = ((JSONObject) json).getString("scence")) != null) {
            WeakHashMap<String, d.j> weakHashMap = f8216a;
            weakHashMap.remove(string);
            if (weakHashMap.size() == 0) {
                b.c();
            }
        }
    }
}
