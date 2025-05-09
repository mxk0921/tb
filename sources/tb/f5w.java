package tb;

import android.content.Context;
import android.util.LongSparseArray;
import com.uc.webview.export.media.CommandID;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import tb.hs9;
import tb.lnt;
import tb.sce;
import tb.wsi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class f5w {

    /* renamed from: a  reason: collision with root package name */
    public final wsi f19034a;
    public final lnt d;
    public final Context e;
    public final pa2 f;
    public final LongSparseArray<wsi> b = new LongSparseArray<>();
    public final LongSparseArray<lnt.b> g = new LongSparseArray<>();
    public final f7w c = new f7w();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements wsi.c {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f19035a;

        public a(long j) {
            this.f19035a = j;
        }

        @Override // tb.wsi.c
        public void a(vsi vsiVar, wsi.d dVar) {
            String str = vsiVar.f30223a;
            str.hashCode();
            long j = this.f19035a;
            f5w f5wVar = f5w.this;
            Object obj = vsiVar.b;
            char c = 65535;
            switch (str.hashCode()) {
                case -1259780487:
                    if (str.equals(iu2.CALENDAR_EVENT_ADD)) {
                        c = 0;
                        break;
                    }
                    break;
                case -39033168:
                    if (str.equals("getCurrentTime")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3443508:
                    if (str.equals("play")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3540994:
                    if (str.equals("stop")) {
                        c = 3;
                        break;
                    }
                    break;
                case 106440182:
                    if (str.equals("pause")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1398977065:
                    if (str.equals(CommandID.setMuted)) {
                        c = 5;
                        break;
                    }
                    break;
                case 1984755238:
                    if (str.equals("setLoop")) {
                        c = 6;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    f5wVar.c.a(j, ((JSONObject) obj).optString("type"));
                    return;
                case 1:
                    float e = f5wVar.c.e(j);
                    HashMap hashMap = new HashMap();
                    hashMap.put("time", Float.valueOf(e));
                    if (f5wVar.b.get(j) != null) {
                        ((wsi) f5wVar.b.get(j)).c("time", hashMap);
                        return;
                    }
                    return;
                case 2:
                    f5wVar.c.g(j);
                    return;
                case 3:
                    f5wVar.c.k(j);
                    return;
                case 4:
                    f5wVar.c.f(j);
                    return;
                case 5:
                    f5wVar.c.j(j, ((JSONObject) obj).optBoolean("muted"));
                    return;
                case 6:
                    f5wVar.c.i(j, ((JSONObject) obj).optBoolean("loop"));
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class b implements sce.a {
        public b() {
        }

        @Override // tb.sce.a
        public void a(long j) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("paused", null);
            }
        }

        @Override // tb.sce.a
        public void b(long j, long j2, long j3, int i, int i2, int i3) {
            HashMap hashMap = new HashMap();
            hashMap.put("textureId", Long.valueOf(j2));
            hashMap.put("duration", Long.valueOf(j3));
            hashMap.put("width", Integer.valueOf(i));
            hashMap.put("height", Integer.valueOf(i2));
            hashMap.put("rotationCorrection", Integer.valueOf(i3));
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("initialized", hashMap);
            }
        }

        @Override // tb.sce.a
        public void c(long j, int i, int i2) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("code", Integer.valueOf(i));
                hashMap.put("message", String.valueOf(i2));
                ((wsi) f5wVar.b.get(j)).c("error", hashMap);
            }
        }

        @Override // tb.sce.a
        public void d(long j, Map<String, Object> map) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("timeupdate", map);
            }
        }

        @Override // tb.sce.a
        public void e(long j) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("ended", null);
            }
        }

        @Override // tb.sce.a
        public void f(long j) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("playing", null);
            }
        }

        @Override // tb.sce.a
        public void g(long j, Map<String, Object> map) {
            f5w f5wVar = f5w.this;
            if (f5wVar.b.get(j) != null) {
                ((wsi) f5wVar.b.get(j)).c("firstvideoframe", map);
            }
        }
    }

    static {
        t2o.a(945815742);
    }

    public f5w(pa2 pa2Var, lnt lntVar, Context context) {
        c cVar = new c(this);
        this.f = pa2Var;
        wsi wsiVar = new wsi(pa2Var, "unicorn/platform_video", drf.INSTANCE);
        this.f19034a = wsiVar;
        wsiVar.f(cVar);
        this.d = lntVar;
        this.e = context;
    }

    public static void f() {
        c.b();
    }

    public void c(Object obj, wsi.d dVar) {
        lnt.b g = ((hs9) this.d).g();
        JSONObject jSONObject = (JSONObject) obj;
        jSONObject.optString("video-id");
        String optString = jSONObject.optString("src");
        long optLong = jSONObject.optLong("id");
        Iterator<String> keys = jSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject.opt(next));
        }
        wsi wsiVar = new wsi(this.f, "unicorn/platform_video/player_" + optLong, drf.INSTANCE);
        wsiVar.f(new a(optLong));
        this.b.put(optLong, wsiVar);
        this.g.put(optLong, g);
        hs9.c cVar = (hs9.c) g;
        this.c.b(optLong, cVar.f(), optString, this.e, hashMap, cVar.a(), new b());
    }

    public void d() {
        LongSparseArray<lnt.b> longSparseArray;
        int i = 0;
        int i2 = 0;
        while (true) {
            longSparseArray = this.g;
            if (i2 < longSparseArray.size()) {
                lnt.b valueAt = longSparseArray.valueAt(i2);
                if (valueAt != null) {
                    valueAt.release();
                }
                i2++;
            }
        }
        while (true) {
            LongSparseArray<wsi> longSparseArray2 = this.b;
            if (i < longSparseArray2.size()) {
                wsi valueAt2 = longSparseArray2.valueAt(i);
                if (valueAt2 != null) {
                    valueAt2.f(null);
                }
                i++;
            } else {
                this.c.d();
                longSparseArray.clear();
                longSparseArray2.clear();
                this.f19034a.f(null);
                return;
            }
        }
    }

    public void e(Object obj, wsi.d dVar) {
        long j;
        try {
            j = ((JSONObject) obj).getLong("id");
        } catch (JSONException e) {
            hdh.b("VideoChannel", e.toString());
            j = -1;
        }
        if (j != -1) {
            LongSparseArray<lnt.b> longSparseArray = this.g;
            lnt.b bVar = longSparseArray.get(j);
            if (bVar != null) {
                bVar.release();
            }
            LongSparseArray<wsi> longSparseArray2 = this.b;
            if (longSparseArray2.get(j) != null) {
                longSparseArray2.get(j).f(null);
            }
            this.c.c(j);
            longSparseArray.remove(j);
            longSparseArray2.remove(j);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public static class c implements wsi.c {

        /* renamed from: a  reason: collision with root package name */
        public final f5w f19037a;

        static {
            t2o.a(945815745);
            t2o.a(945815771);
        }

        public c(f5w f5wVar) {
            this.f19037a = f5wVar;
        }

        @Override // tb.wsi.c
        public void a(vsi vsiVar, wsi.d dVar) {
            String str = vsiVar.f30223a;
            str.hashCode();
            f5w f5wVar = this.f19037a;
            Object obj = vsiVar.b;
            if (str.equals("create")) {
                f5wVar.c(obj, dVar);
            } else if (str.equals("destroy")) {
                f5wVar.e(obj, dVar);
            }
        }

        public static void b() {
        }
    }
}
