package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Login;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a18 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile a18 d;
    public static final ConcurrentHashMap<b, o6w> e = new ConcurrentHashMap<>();

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<o6w, Object> f15476a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<o6w, Object> b = new ConcurrentHashMap<>();
    public WeakReference<Context> c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements wbd {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f15477a;

        static {
            t2o.a(491782198);
            t2o.a(774897702);
        }

        public b() {
            this.f15477a = 0L;
        }

        @Override // tb.wbd
        public void onProgress(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5ec8f5b0", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.wbd
        public void onStart(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("938ad014", new Object[]{this, str});
            } else {
                this.f15477a = System.currentTimeMillis();
            }
        }

        @Override // tb.wbd
        public void onFinish(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6a105f4a", new Object[]{this, new Integer(i)});
                return;
            }
            a18.a().remove(this);
            HashMap hashMap = new HashMap(2);
            if (this.f15477a != 0) {
                hashMap.put("cost", String.valueOf(System.currentTimeMillis() - this.f15477a));
                if (a18.a().containsKey(this) && a18.a().get(this) != null) {
                    Object obj = a18.a().get(this);
                    Objects.requireNonNull(obj);
                    hashMap.put("videoId", ((o6w) obj).a());
                }
            }
            hashMap.put("player_type", "dwplayer");
            tve.c("video", "video_downloadCost", "", "Page_Home_VideoPlayer_Count", "", hashMap);
        }
    }

    static {
        t2o.a(491782196);
    }

    public static /* synthetic */ ConcurrentHashMap a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ConcurrentHashMap) ipChange.ipc$dispatch("21008e2e", new Object[0]);
        }
        return e;
    }

    public static a18 e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a18) ipChange.ipc$dispatch("34404b79", new Object[0]);
        }
        if (d == null) {
            synchronized (a18.class) {
                try {
                    if (d == null) {
                        d = new a18();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return d;
    }

    public void b(Context context, String str, o6w o6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("988a313c", new Object[]{this, context, str, o6wVar});
        } else if (o6wVar != null && !this.f15476a.containsKey(o6wVar) && context != null) {
            this.c = new WeakReference<>(context);
            HashMap hashMap = new HashMap();
            hashMap.put("playScenes", "");
            hashMap.put("userId", Login.getUserId());
            hashMap.put("from", "recmd");
            JSONObject jSONObject = null;
            b bVar = new b();
            e.put(bVar, o6wVar);
            if (this.c.get() != null) {
                if (str != null) {
                    try {
                        if (!str.isEmpty()) {
                            jSONObject = new JSONObject(str);
                        }
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
                if (jSONObject != null) {
                    e95.b(this.c.get(), jSONObject, hashMap, -1, bVar);
                    this.f15476a.put(o6wVar, jSONObject);
                    return;
                }
                String b2 = o6wVar.b();
                qmm.m(this.c.get(), b2, -1, 1000000, bVar);
                this.f15476a.put(o6wVar, b2);
            }
        }
    }

    public void c() {
        WeakReference<Context> weakReference;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("186d51ce", new Object[]{this});
        } else if (!this.f15476a.isEmpty() && (weakReference = this.c) != null && weakReference.get() != null) {
            this.b.clear();
            for (Map.Entry<o6w, Object> entry : this.f15476a.entrySet()) {
                if (entry.getKey().b() != null) {
                    f(this.c.get(), entry.getKey());
                    this.b.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3a8dda40", new Object[]{this});
            return;
        }
        c();
        this.b.clear();
        e.clear();
    }

    public void f(Context context, o6w o6wVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d81adbf0", new Object[]{this, context, o6wVar});
        } else if (o6wVar != null && this.f15476a.containsKey(o6wVar) && context != null) {
            new WeakReference(context);
            qmm.a(context, o6wVar.b());
            this.f15476a.remove(o6wVar);
            if (this.b.containsKey(o6wVar)) {
                this.b.remove(o6wVar);
            }
        }
    }

    public void g(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74f3d610", new Object[]{this, context});
        } else if (!this.b.isEmpty() && context != null) {
            for (Map.Entry<o6w, Object> entry : this.b.entrySet()) {
                if (entry.getKey().b() != null) {
                    b(context, String.valueOf(entry.getValue()), entry.getKey());
                    this.b.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
