package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.smartlayer.constant.SmartLayerConstant$SmartLayerStage;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class l6q {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public String f23140a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public HashMap<String, Object> g;
    public HashMap<String, String> h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public VideoInfo o;
    public String p;
    public String q;
    public JSONObject r;
    public a2e s;
    public ux9 t;
    public WeakReference<Activity> u;
    public final boolean v;
    public final boolean w;
    public HashMap<SmartLayerConstant$SmartLayerStage, Long> x;
    public final u6q y;

    static {
        t2o.a(295699741);
    }

    public l6q(HashMap<String, Object> hashMap, Activity activity, Object obj, u6q u6qVar, boolean z) {
        if (hashMap != null && activity != null && u6qVar != null && !hashMap.isEmpty()) {
            this.y = u6qVar;
            this.v = z;
            this.w = z;
            d(hashMap, activity, obj, z);
        }
    }

    public Activity a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Activity) ipChange.ipc$dispatch("81223f9c", new Object[]{this});
        }
        WeakReference<Activity> weakReference = this.u;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return this.u.get();
    }

    public a2e b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a2e) ipChange.ipc$dispatch("a341ea31", new Object[]{this});
        }
        return this.s;
    }

    public long c(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage) {
        Long l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b329ef9c", new Object[]{this, smartLayerConstant$SmartLayerStage})).longValue();
        }
        HashMap<SmartLayerConstant$SmartLayerStage, Long> hashMap = this.x;
        if (hashMap == null || hashMap.get(smartLayerConstant$SmartLayerStage) == null || (l = this.x.get(smartLayerConstant$SmartLayerStage)) == null) {
            return 0L;
        }
        return l.longValue();
    }

    public void d(HashMap<String, Object> hashMap, Activity activity, Object obj, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26ae0e40", new Object[]{this, hashMap, activity, obj, new Boolean(z)});
        } else if (hashMap != null && activity != null) {
            if (z || obj != null) {
                this.b = String.valueOf(hashMap.get("liveSource"));
                this.c = String.valueOf(hashMap.get("accountId"));
                this.d = String.valueOf(hashMap.get("entryLiveSource"));
                this.e = String.valueOf(hashMap.get("liveId"));
                this.i = String.valueOf(hashMap.get("spm"));
                this.p = String.valueOf(hashMap.get("spmCnt"));
                this.j = String.valueOf(hashMap.get("entrySpm"));
                this.k = String.valueOf(hashMap.get("switchIndex"));
                this.l = String.valueOf(hashMap.get(yj4.PARAM_INTENT_URL));
                String.valueOf(hashMap.get("dispatchItemID"));
                this.q = String.valueOf(hashMap.get("trackInfo"));
                this.m = String.valueOf(hashMap.get("entryspmpre"));
                this.n = String.valueOf(hashMap.get("entrylivesourcepre"));
                this.f = String.valueOf(hashMap.get("uniqueIdentification"));
                Object obj2 = hashMap.get("track_adapter");
                if (obj2 instanceof a2e) {
                    this.s = (a2e) obj2;
                }
                Object obj3 = hashMap.get("videoInfo");
                if (obj3 instanceof VideoInfo) {
                    this.o = (VideoInfo) obj3;
                }
                Object obj4 = hashMap.get("actionData");
                if (obj4 instanceof JSONObject) {
                    this.r = (JSONObject) obj4;
                }
                this.g = hashMap;
                if (!z) {
                    new WeakReference(obj);
                }
                if (nh4.K0() && (obj instanceof ux9)) {
                    this.t = (ux9) obj;
                }
                this.u = new WeakReference<>(activity);
                if (obj == null) {
                    this.f23140a = b7q.c(activity);
                } else {
                    this.f23140a = b7q.c(obj);
                }
                this.h = new HashMap<>();
                HashMap<String, Object> hashMap2 = this.g;
                if (!(hashMap2 == null || hashMap2.isEmpty() || this.g.keySet().isEmpty())) {
                    for (String str : this.g.keySet()) {
                        Object obj5 = this.g.get(str);
                        if (obj5 instanceof String) {
                            this.h.put(str, String.valueOf(obj5));
                        }
                    }
                }
            }
        }
    }

    public void e(SmartLayerConstant$SmartLayerStage smartLayerConstant$SmartLayerStage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c59ed6b4", new Object[]{this, smartLayerConstant$SmartLayerStage});
            return;
        }
        if (this.x == null) {
            this.x = new HashMap<>();
        }
        this.x.put(smartLayerConstant$SmartLayerStage, Long.valueOf(gq0.m().getServerTime()));
    }
}
