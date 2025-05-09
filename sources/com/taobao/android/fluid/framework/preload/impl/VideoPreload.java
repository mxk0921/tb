package com.taobao.android.fluid.framework.preload.impl;

import android.app.Application;
import android.content.Context;
import android.taobao.windvane.jsbridge.IJsApiFailedCallBack;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.fluid.FluidSDK;
import com.taobao.android.fluid.core.FluidInstance;
import com.taobao.android.fluid.framework.preload.IPreloadService;
import com.taobao.android.fluid.framework.preload.impl.VideoPreload;
import com.taobao.android.turbo.adapter.IStorageAdapter;
import com.taobao.android.weex.b;
import tb.akt;
import tb.grm;
import tb.htd;
import tb.ir9;
import tb.kee;
import tb.lrm;
import tb.mqu;
import tb.qpu;
import tb.qu6;
import tb.r4c;
import tb.t2o;
import tb.ud0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class VideoPreload extends htd {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String TAG = "VideoPreload";
    private static final String VIDEO_PREFETCH_INFO = "video_prefetch_info";
    private qpu engineContext;
    private long lastPrefetchTime;
    private lrm lastPreloadConfig;
    private int prefetchCount;
    private int lastType = -1;
    private String prefetchDay = "";
    private boolean zcachePreloaded = false;
    private boolean weexInitted = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements r4c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(VideoPreload videoPreload) {
        }

        @Override // tb.r4c
        public void b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("310f3b65", new Object[]{this, str});
            }
        }

        @Override // android.taobao.windvane.jsbridge.IJsApiSucceedCallBack
        public void succeed(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e5b77b53", new Object[]{this, str});
            } else {
                ir9.b(VideoPreload.TAG, "预加载ZCache成功");
            }
        }
    }

    static {
        t2o.a(468714679);
    }

    public VideoPreload(qpu qpuVar, String str) {
        super(qpuVar, str);
        this.engineContext = qpuVar;
    }

    private void doPreload(JSONObject jSONObject, boolean z) {
        FluidInstance fluidInstance;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0db2129", new Object[]{this, jSONObject, new Boolean(z)});
            return;
        }
        Context context = this.engineContext.getContext();
        if (!isFixPreloadMemoryLeak() || !z) {
            setPreloadConfig(context, jSONObject);
            fluidInstance = getFluidInstance(context);
        } else {
            fluidInstance = getFluidInstanceOnly();
        }
        if (fluidInstance != null) {
            ((IPreloadService) fluidInstance.getService(IPreloadService.class)).doPreload(fluidInstance, context, jSONObject);
        }
        if (!z) {
            this.lastPrefetchTime = System.currentTimeMillis();
            updatePrefetchCount();
        }
    }

    private FluidInstance getFluidInstance(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("279048e2", new Object[]{this, context});
        }
        return FluidSDK.getPreloadRecommendTabInstance(context);
    }

    private FluidInstance getFluidInstanceOnly() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FluidInstance) ipChange.ipc$dispatch("6a210806", new Object[]{this});
        }
        return FluidSDK.getPreloadRecommendTabInstanceOnly();
    }

    private IPreloadService getPreloadService(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IPreloadService) ipChange.ipc$dispatch("91e02a20", new Object[]{this, context});
        }
        FluidInstance fluidInstance = getFluidInstance(context);
        if (fluidInstance == null) {
            return null;
        }
        return (IPreloadService) fluidInstance.getService(IPreloadService.class);
    }

    public static /* synthetic */ Object ipc$super(VideoPreload videoPreload, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/fluid/framework/preload/impl/VideoPreload");
    }

    private boolean isFixPreloadMemoryLeak() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("59fd272d", new Object[]{this})).booleanValue();
        }
        return FluidSDK.getRemoteConfigAdapter().getOrangeBooleanConfig("isFixPreloadMemoryLeak", true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$preloadZCache$0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93bee291", new Object[]{str});
        } else {
            ir9.b(TAG, "预加载ZCache失败");
        }
    }

    private void preloadWeex(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcb11fb7", new Object[]{this, context});
        } else if (!this.weexInitted && akt.p2("ShortVideo.enableInitWeex", true)) {
            this.weexInitted = true;
            b.d().i((Application) context.getApplicationContext(), null);
        }
    }

    private void setPreloadConfig(Context context, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b898d998", new Object[]{this, context, jSONObject});
        } else if (jSONObject.containsKey("prefetchConfig")) {
            getPreloadService(context).setPreloadABConfig(jSONObject);
            ud0.a().b(grm.TBVIDESDK_RED_POINT_PRELOAD_CONFIG, jSONObject.get("prefetchConfig"));
            ir9.b(TAG, "setPreloadConfig：" + jSONObject.toJSONString());
        }
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

    private void preloadZCache() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("310fbe98", new Object[]{this});
        } else if (!this.zcachePreloaded) {
            this.zcachePreloaded = true;
            kee keeVar = (kee) this.engineContext.getService(kee.class);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "tab2_interaction", (String) new JSONObject());
            jSONObject.put((JSONObject) "immersive-flow", (String) new JSONObject());
            keeVar.Q0("ZCache", "prefetch", jSONObject, new a(this), new IJsApiFailedCallBack() { // from class: tb.law
                @Override // android.taobao.windvane.jsbridge.IJsApiFailedCallBack
                public final void fail(String str) {
                    VideoPreload.lambda$preloadZCache$0(str);
                }
            });
            ir9.b(TAG, "预加载ZCache");
        }
    }

    private boolean checkPreloadLimit(lrm lrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7c99bf65", new Object[]{this, lrmVar})).booleanValue();
        }
        if (lrmVar.c()) {
            ir9.b(TAG, "getDisablePreloading is true，禁止预加载");
            return false;
        }
        if (lrmVar.b() > 0.0f) {
            if (lrmVar.b() < 0.4f) {
                ir9.b(TAG, "getCtrRankScore is" + lrmVar.b() + "，禁止预加载");
                return false;
            }
        } else if (this.prefetchCount >= lrmVar.d()) {
            ir9.b(TAG, "prefetchCount is " + this.prefetchCount + ", limit is" + lrmVar.d() + "，禁止预加载");
            return false;
        }
        if (this.prefetchCount >= 50) {
            ir9.b(TAG, "prefetchCount is " + this.prefetchCount + ", maxLimit is50，禁止预加载");
            return false;
        } else if (System.currentTimeMillis() - this.lastPrefetchTime >= 5000) {
            return true;
        } else {
            ir9.b(TAG, "intervalLimit 禁止预加载");
            return false;
        }
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
        String i = aVar.i(a2.a(VIDEO_PREFETCH_INFO), null);
        if (!TextUtils.isEmpty(i) && (split = i.split("=")) != null && split.length == 2) {
            String str = split[0];
            String str2 = split[1];
            if (str == this.prefetchDay && (d = aVar.d(str2, 0)) > 0) {
                this.prefetchCount = d;
            }
        }
        ir9.b(TAG, "初始化当前预加载次数" + this.prefetchCount);
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
        ud0.a().b(VIDEO_PREFETCH_INFO, str);
        ir9.b(TAG, "更新当前预加载次数" + str);
    }

    @Override // tb.htd
    public boolean cancel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("707fe605", new Object[]{this})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", (Object) 0);
        lrm lrmVar = this.lastPreloadConfig;
        if (lrmVar != null) {
            jSONObject.put("prefetchConfig", (Object) lrmVar.a());
        }
        doPreload(jSONObject, true);
        this.lastType = 0;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // tb.htd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onPreload(java.util.Map<java.lang.String, java.lang.Object> r12, int r13, tb.lrm r14) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.fluid.framework.preload.impl.VideoPreload.onPreload(java.util.Map, int, tb.lrm):boolean");
    }
}
