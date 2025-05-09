package com.taobao.android.tab2liveroom.liveroom;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import java.util.Map;
import tb.htd;
import tb.lrm;
import tb.mqu;
import tb.o3s;
import tb.od0;
import tb.q2h;
import tb.qpu;
import tb.qu6;
import tb.t2o;
import tb.tfs;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LivePreload extends htd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String LIVE_PREFETCH_INFO = "live_prefetch_info";
    private static final String TAG = "LivePreload";
    private static boolean setPreloadConfigCalled = false;
    private qpu engineContext;
    private long lastPrefetchTime;
    private int prefetchCount;
    private int lastType = -1;
    private String prefetchDay = "";

    static {
        t2o.a(779092108);
    }

    public LivePreload(qpu qpuVar, String str) {
        super(qpuVar, str);
        o3s.b(TAG, "LivePreload construct");
        this.engineContext = qpuVar;
    }

    private void doPreload(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3a3f30b", new Object[]{this, jSONObject});
            return;
        }
        Context context = this.engineContext.getContext();
        setPreloadConfig(context, jSONObject);
        q2h d = q2h.d();
        if (d != null) {
            d.c(context, jSONObject);
        }
        this.lastPrefetchTime = System.currentTimeMillis();
        updatePrefetchCount();
    }

    public static /* synthetic */ Object ipc$super(LivePreload livePreload, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/LivePreload");
    }

    private void setPreloadConfig(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b898d998", new Object[]{this, context, jSONObject});
            return;
        }
        o3s.b(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
    }

    private static void setPreloadConfigInternal(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df4f6b5", new Object[]{context, jSONObject});
            return;
        }
        q2h.d().h(jSONObject);
        tfs.e(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
    }

    @Override // tb.htd
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.htd
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
        } else {
            initPrefetchCount();
        }
    }

    @Override // tb.htd
    public boolean onPreload(Map<String, Object> map, int i, lrm lrmVar) {
        ViewGroup Q;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("12d72337", new Object[]{this, map, new Integer(i), lrmVar})).booleanValue();
        }
        o3s.b(TAG, "LivePreload onPreload：" + map.toString());
        if (!(lrmVar == null || lrmVar.a() == null)) {
            o3s.b(TAG, "LivePreload onPreload：" + lrmVar.a().toString());
        }
        try {
            Context context = this.engineContext.getContext();
            if ((context instanceof Application) && (Q = od0.D().f().Q()) != null) {
                context = Q.getContext();
            }
            JSONObject constructParams = constructParams(map, lrmVar, context);
            if (!setPreloadConfigCalled) {
                setPreloadConfigInternal(this.engineContext.getContext(), constructParams);
            }
            q2h d = q2h.d();
            if (d.e().e()) {
                tfs.e(TAG, "进入预加载逻辑");
                d.c(context, constructParams);
                new JSONObject().put((JSONObject) "enabled", (String) Boolean.TRUE);
            }
        } catch (Throwable th) {
            th.printStackTrace();
            tfs.e(TAG, th.getMessage());
        }
        return true;
    }

    private boolean checkPreloadLimit(lrm lrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c99bf65", new Object[]{this, lrmVar})).booleanValue();
        }
        if (lrmVar == null) {
            return false;
        }
        if (lrmVar.c()) {
            o3s.b(TAG, "getDisablePreloading is true，禁止预加载");
            return false;
        }
        if (lrmVar.b() > 0.0f) {
            if (lrmVar.b() < 0.4f) {
                o3s.b(TAG, "getCtrRankScore is" + lrmVar.b() + "，禁止预加载");
                return false;
            }
        } else if (this.prefetchCount >= lrmVar.d()) {
            o3s.b(TAG, "prefetchCount is " + this.prefetchCount + ", limit is" + lrmVar.d() + "，禁止预加载");
            return false;
        }
        if (this.prefetchCount >= 50) {
            o3s.b(TAG, "prefetchCount is " + this.prefetchCount + ", maxLimit is50，禁止预加载");
            return false;
        } else if (System.currentTimeMillis() - this.lastPrefetchTime >= 5000) {
            return true;
        } else {
            o3s.b(TAG, "intervalLimit 禁止预加载");
            return false;
        }
    }

    private JSONObject constructParams(Map<String, Object> map, lrm lrmVar, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("5dec1387", new Object[]{this, map, lrmVar, context});
        }
        JSONObject jSONObject = new JSONObject();
        if (map.isEmpty()) {
            jSONObject.put("type", (Object) 1);
            jSONObject.put("extraParams", (Object) new JSONObject());
        } else {
            jSONObject.put("type", (Object) 3);
        }
        if (!(lrmVar == null || lrmVar.a() == null)) {
            jSONObject.put("prefetchConfig", (Object) lrmVar.a());
        }
        return jSONObject;
    }

    private void initPrefetchCount() {
        String[] split;
        int d;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69a636af", new Object[]{this});
            return;
        }
        this.prefetchDay = qu6.Companion.a("MM_dd");
        IStorageAdapter a2 = ud0.a();
        mqu.a aVar = mqu.Companion;
        String i = aVar.i(a2.a(LIVE_PREFETCH_INFO), null);
        if (!TextUtils.isEmpty(i) && (split = i.split("=")) != null && split.length == 2) {
            String str = split[0];
            String str2 = split[1];
            if (str == this.prefetchDay && (d = aVar.d(str2, 0)) > 0) {
                this.prefetchCount = d;
            }
        }
        o3s.b(TAG, "初始化当前预加载次数" + this.prefetchCount);
    }

    private void updatePrefetchCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c642c16", new Object[]{this});
            return;
        }
        String a2 = qu6.Companion.a("MM_dd");
        if (!TextUtils.equals(a2, this.prefetchDay)) {
            this.prefetchCount = 0;
            this.prefetchDay = a2;
        } else {
            this.prefetchCount++;
        }
        String str = this.prefetchDay + "=" + this.prefetchCount;
        ud0.a().b(LIVE_PREFETCH_INFO, str);
        o3s.b(TAG, "更新当前预加载次数" + str);
    }
}
