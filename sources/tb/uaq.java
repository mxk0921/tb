package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uaq {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f29265a;
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public boolean v;

    static {
        t2o.a(1032847438);
    }

    public Map<String, Long> a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("3e203a06", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.put("tabClickTime", Long.valueOf(this.b));
        hashMap.put("initStartTime", Long.valueOf(this.c));
        hashMap.put("initEndTime", Long.valueOf(this.d));
        hashMap.put("pageOnAttachTime", Long.valueOf(this.e));
        hashMap.put("pageOnCreateStartTime", Long.valueOf(this.f));
        hashMap.put("pageOnCreateEndTime", Long.valueOf(this.g));
        hashMap.put("pageReadyFirstScreenTime", Long.valueOf(this.h));
        hashMap.put("pageReadyFirstScreenEndTime", Long.valueOf(this.i));
        hashMap.put("TMSEmbedInitStartTime", Long.valueOf(this.j));
        hashMap.put("TMSEmbedInitEndTime", Long.valueOf(this.k));
        hashMap.put("loadDataStartTime", Long.valueOf(this.l));
        hashMap.put("loadDataEndTime", Long.valueOf(this.m));
        hashMap.put("loadDataCallBackEndTime", Long.valueOf(this.n));
        hashMap.put("TMSOnLaunchStartTime", Long.valueOf(this.q));
        hashMap.put("TMSOnLaunchEndTime", Long.valueOf(this.r));
        hashMap.put("TMSonRenderStartTime", Long.valueOf(this.s));
        hashMap.put("TMSonRenderEndTime", Long.valueOf(this.t));
        hashMap.put("frontEndRenderSuccessTime", Long.valueOf(this.u));
        hashMap.put("prefetchDataStartTime", Long.valueOf(this.o));
        hashMap.put("prefetchDataEndTime", Long.valueOf(this.p));
        if (this.v) {
            hashMap.put("loadFromCache", 1L);
        } else {
            hashMap.put("loadFromCache", 0L);
        }
        TLog.loge("tab3edlp", "getCustomerStage " + JSON.toJSON(hashMap));
        return hashMap;
    }
}
