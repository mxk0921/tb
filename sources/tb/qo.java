package tb;

import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.render.AURARenderComponent;
import com.alibaba.android.aura.datamodel.render.AURARenderComponentData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: Taobao */
@AURAExtensionImpl(code = qo.AURA_CODE)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class qo extends ws {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String AURA_CODE = "aura.impl.event.userTrack";
    public static final String EVENT_TYPE = "userTrack";
    public static final String KEY_ARG1 = "arg1";
    public static final String KEY_ARG2 = "arg2";
    public static final String KEY_ARG3 = "arg3";
    public static final String KEY_ARGS = "args";
    public static final String KEY_EVENT_ID = "eventId";
    public static final String KEY_PAGE = "page";
    public ExecutorService e;
    public Boolean f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAEventIO f26842a;

        public a(AURAEventIO aURAEventIO) {
            this.f26842a = aURAEventIO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                qo.O0(qo.this, this.f26842a);
            }
        }
    }

    static {
        t2o.a(81789087);
    }

    public static /* synthetic */ void O0(qo qoVar, AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f128d4b", new Object[]{qoVar, aURAEventIO});
        } else {
            qoVar.P0(aURAEventIO);
        }
    }

    public static /* synthetic */ Object ipc$super(qo qoVar, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == -1162528052) {
            super.onDataChanged((AURAFlowData) objArr[0], (AURAGlobalData) objArr[1], (hbb) objArr[2]);
            return null;
        } else if (hashCode == -25033014) {
            super.onCreate((lo) objArr[0], (yi) objArr[1]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/alibaba/android/aura/taobao/adapter/extension/event/userTrack/AURAUserTrackEvent");
        }
    }

    @Override // tb.ws
    public void K0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53a1928f", new Object[]{this, aURAEventIO});
        } else if (Q0()) {
            this.e.execute(new a(aURAEventIO));
        } else {
            P0(aURAEventIO);
        }
    }

    public final boolean Q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380c5fa3", new Object[]{this})).booleanValue();
        }
        if (this.f == null) {
            this.f = (Boolean) J0().h("enableAsyncUT", Boolean.class, Boolean.FALSE);
        }
        Boolean bool = this.f;
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public final Map<String, String> R0(JSONObject jSONObject, JSONObject jSONObject2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("1aea5c08", new Object[]{this, jSONObject, jSONObject2});
        }
        HashMap hashMap = new HashMap();
        if (!(jSONObject == null || jSONObject2 == null)) {
            for (String str : jSONObject.keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = jSONObject.get(str);
                    if (obj instanceof String) {
                        hashMap.put(str, String.valueOf(wr8.a(jSONObject2, obj)));
                    }
                }
            }
        }
        return hashMap;
    }

    @Override // tb.ws, tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        super.onCreate(loVar, yiVar);
        this.e = dn.d(1, 3, 3L, TimeUnit.SECONDS, "AURAUserTrackEvent");
    }

    @Override // tb.ws, tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        } else {
            super.onDataChanged(aURAFlowData, aURAGlobalData, hbbVar);
        }
    }

    @Override // tb.ws, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        ExecutorService executorService = this.e;
        if (executorService != null && !executorService.isShutdown()) {
            this.e.shutdown();
        }
        this.e = null;
    }

    @Override // tb.ibb
    public String t0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("45cb977b", new Object[]{this});
        }
        return "userTrack";
    }

    public final void P0(AURAEventIO aURAEventIO) {
        JSONObject jSONObject;
        AURARenderComponentData aURARenderComponentData;
        Map<String, Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869a54f3", new Object[]{this, aURAEventIO});
            return;
        }
        JSONObject c = aURAEventIO.getEventModel().c();
        if (c == null) {
            M0("userTrack", "eventFields is null!");
            return;
        }
        int intValue = c.getIntValue("eventId");
        if (intValue == 0) {
            M0("userTrack", "eventId is null!");
            return;
        }
        String string = c.getString("page");
        String string2 = c.getString("arg1");
        String string3 = c.getString("arg2");
        String string4 = c.getString("arg3");
        try {
            jSONObject = c.getJSONObject("args");
        } catch (Throwable unused) {
            M0("userTrack", "args 格式不对");
            jSONObject = null;
        }
        JSONObject jSONObject2 = new JSONObject();
        AURARenderComponent j = aURAEventIO.getEventModel().j();
        if (!(j == null || (aURARenderComponentData = j.data) == null || (map = aURARenderComponentData.fields) == null)) {
            try {
                jSONObject2.putAll(map);
            } catch (Exception e) {
                M0("userTrack", e.toString());
                ck.g().b("AURAUserTrackEvent", "doTrack", e.toString());
            }
        }
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("fields", (Object) jSONObject2);
        Map<String, String> R0 = R0(jSONObject, jSONObject3);
        List f = x().f(adb.class);
        HashMap hashMap = new HashMap(R0);
        if (!f.isEmpty() && j != null) {
            Iterator it = f.iterator();
            while (it.hasNext()) {
                adb adbVar = (adb) it.next();
                if (adbVar != null) {
                    it = it;
                    string3 = string3;
                    hashMap = hashMap;
                    j = j;
                    Map<String, String> a0 = adbVar.a0(new po(j, string, intValue, string2, string3, string4, R0));
                    if (a0 != null) {
                        hashMap.putAll(a0);
                    }
                } else {
                    it = it;
                    j = j;
                    string3 = string3;
                    hashMap = hashMap;
                }
            }
        }
        List<bdb> f2 = x().f(bdb.class);
        if (f2.isEmpty()) {
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, intValue, string2, string3, string4, hashMap).build());
            return;
        }
        for (bdb bdbVar : f2) {
            bdbVar.p0(string, intValue, string2, string3, string4, hashMap);
        }
    }
}
