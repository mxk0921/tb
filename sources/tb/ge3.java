package tb;

import android.os.AsyncTask;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ge3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f19923a;
        public final /* synthetic */ JSONObject b;

        public a(Map map, JSONObject jSONObject) {
            this.f19923a = map;
            this.b = jSONObject;
        }

        @Override // java.lang.Runnable
        public void run() {
            JSONObject jSONObject;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            Map map = this.f19923a;
            if (ge3.p(ge3.this) != null) {
                jSONObject = ge3.q(ge3.this).getData();
            } else {
                jSONObject = null;
            }
            ge3.r(map, jSONObject, this.b);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class b extends AsyncTask<Void, Void, Void> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, String> f19924a;
        public final JSONObject b;
        public final JSONObject c;

        static {
            t2o.a(479199435);
        }

        public /* synthetic */ b(Map map, JSONObject jSONObject, JSONObject jSONObject2, a aVar) {
            this(map, jSONObject, jSONObject2);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartUserTrackSubscriber$TrackAsyncTask");
        }

        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Void) ipChange.ipc$dispatch("6194eca6", new Object[]{this, voidArr});
            }
            try {
                ge3.r(this.f19924a, this.c, this.b);
                return null;
            } catch (Exception e) {
                UnifyLog.e("CartUserTracker", "sendTracker error message=" + e.getMessage());
                return null;
            }
        }

        public b(Map<String, String> map, JSONObject jSONObject, JSONObject jSONObject2) {
            this.c = jSONObject;
            this.f19924a = map;
            this.b = jSONObject2;
        }
    }

    static {
        t2o.a(479199433);
    }

    public static /* synthetic */ Object ipc$super(ge3 ge3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartUserTrackSubscriber");
    }

    public static /* synthetic */ IDMComponent p(ge3 ge3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("e787c960", new Object[]{ge3Var});
        }
        return ge3Var.e;
    }

    public static /* synthetic */ IDMComponent q(ge3 ge3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IDMComponent) ipChange.ipc$dispatch("76134a61", new Object[]{ge3Var});
        }
        return ge3Var.e;
    }

    public static /* synthetic */ void r(Map map, JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b6adf6c", new Object[]{map, jSONObject, jSONObject2});
        } else {
            s(map, jSONObject, jSONObject2);
        }
    }

    public static void s(Map<String, String> map, JSONObject jSONObject, JSONObject jSONObject2) {
        int i;
        JSONObject l;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27d01a0e", new Object[]{map, jSONObject, jSONObject2});
            return;
        }
        try {
            i = jSONObject2.getInteger("eventId").intValue();
        } catch (Exception unused) {
            i = -1;
        }
        if (i >= 0) {
            JSONObject jSONObject3 = jSONObject2.getJSONObject("args");
            HashMap hashMap = new HashMap();
            if (jSONObject3 != null) {
                for (Map.Entry<String, Object> entry : jSONObject3.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (!TextUtils.isEmpty(key)) {
                        if (!(value instanceof String)) {
                            hashMap.put(key, value + "");
                        } else {
                            hashMap.put(key, String.valueOf(zr8.a(jSONObject, value)));
                        }
                    }
                }
                map.putAll(hashMap);
            }
            if (jSONObject2.getBooleanValue("mergeAutoUTArgs") && (l = ml1.l(jSONObject)) != null) {
                for (Map.Entry<String, Object> entry2 : l.entrySet()) {
                    map.put(entry2.getKey(), String.valueOf(entry2.getValue()));
                }
            }
            String string = jSONObject2.getString("page");
            String string2 = jSONObject2.getString("arg1");
            String string3 = jSONObject2.getString("arg2");
            String string4 = jSONObject2.getString("arg3");
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, TextUtils.isEmpty(string2) ? "" : string2, TextUtils.isEmpty(string3) ? "" : string3, TextUtils.isEmpty(string4) ? "" : string4, map).build());
        }
    }

    @Override // tb.l12
    public void j(lcu lcuVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8fbad8af", new Object[]{this, lcuVar});
            return;
        }
        JSONObject fields = g().getFields();
        if (fields != null) {
            String string = fields.getString(DMComponent.EXTEND_TYPE);
            Map hashMap = new HashMap();
            if ("item".equals(string)) {
                hashMap = vo0.b(this.e, this.j, new String[0]);
            } else if ("shop".equals(string)) {
                hashMap = vo0.d(this.e, this.j, new String[0]);
            }
            hashMap.putAll(ml1.h(this.j));
            if (h0r.f()) {
                pav.k(new a(hashMap, fields));
                return;
            }
            IDMComponent iDMComponent = this.e;
            new b(hashMap, iDMComponent != null ? iDMComponent.getData() : null, fields, null).execute(new Void[0]);
        }
    }
}
