package tb;

import android.os.SystemClock;
import android.text.TextUtils;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.service.event.AURAEventIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ck;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class ws implements ibb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f30882a;
    public AURAGlobalData b;
    public yi c;
    public hbb d;

    static {
        t2o.a(80740434);
        t2o.a(80740435);
    }

    public AURAGlobalData B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AURAGlobalData) ipChange.ipc$dispatch("3078f400", new Object[]{this});
        }
        return this.b;
    }

    @Override // tb.ibb
    public final void I0(AURAEventIO aURAEventIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fd450c5", new Object[]{this, aURAEventIO});
            return;
        }
        String eventType = aURAEventIO.getEventType();
        if (TextUtils.isEmpty(eventType)) {
            M0(eventType, "eventType is empty");
            ck.g().b(getClass().getSimpleName(), "handleEvent", "eventType is empty");
        } else if (aURAEventIO.getEventModel() == null) {
            M0(eventType, "AURAEventModel is empty");
            ck.g().b(getClass().getSimpleName(), "handleEvent", "AURAEventModel is null");
        } else if (L0(eventType, aURAEventIO.getEventModel().c())) {
            M0(eventType, "抖动拦截");
        } else {
            K0(aURAEventIO);
        }
    }

    public lo J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("fc4bf91a", new Object[]{this});
        }
        return this.f30882a;
    }

    public abstract void K0(AURAEventIO aURAEventIO);

    public final int L(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("61b7f894", new Object[]{this, jSONObject})).intValue();
        }
        return pn.c((String) fk.b(jSONObject, "intervalTime", String.class, String.valueOf(500)), 500);
    }

    public void M0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97d08c84", new Object[]{this, str, str2});
            return;
        }
        hbb hbbVar = this.d;
        if (hbbVar != null) {
            hbbVar.b(new mi(1, "AURAEventServiceDomain", str, str2));
        }
    }

    public void N0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e1dae8b", new Object[]{this, new Long(j)});
        }
    }

    public long m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ba78e09a", new Object[]{this})).longValue();
        }
        return 0L;
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
            return;
        }
        this.f30882a = loVar;
        this.c = yiVar;
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
            return;
        }
        this.b = aURAGlobalData;
        this.d = hbbVar;
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    public boolean r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7b09fad", new Object[]{this})).booleanValue();
        }
        return false;
    }

    public yi x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yi) ipChange.ipc$dispatch("369fbe0", new Object[]{this});
        }
        return this.c;
    }

    public final boolean L0(String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("345185ae", new Object[]{this, str, jSONObject})).booleanValue();
        }
        if (!r()) {
            return false;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int L = L(jSONObject);
        long m0 = m0();
        if (elapsedRealtime - m0() < L) {
            rbb g = ck.g();
            g.e("事件【" + str + "】 操作太频繁，限制操作" + L + "ms 上次执行时间：" + m0 + " 当前执行时间：" + elapsedRealtime, ck.b.b().i("AURA/ability").l("needControlFrequency").a());
            return true;
        }
        rbb g2 = ck.g();
        g2.e("事件【" + str + "】 操作间隔大于" + L + "ms 上次执行时间：" + m0 + " 当前执行时间：" + elapsedRealtime, ck.b.b().i("AURA/ability").l("needControlFrequency").a());
        N0(elapsedRealtime);
        return false;
    }
}
