package tb;

import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.tmall.android.dai.trigger.EventProcessResult;
import com.tmall.android.dai.trigger.TriggerMatchResult;
import tb.d0q;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public abstract class egu<Source, SinkInput, Sink extends d0q<SinkInput>> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final cgu<Source> f18568a;
    public final Sink b;

    static {
        t2o.a(1034944730);
    }

    public egu(String str, cgu<Source> cguVar, Sink sink, String str2) {
        this.f18568a = cguVar;
        this.b = sink;
    }

    public abstract SinkInput a(Source source);

    public abstract String b();

    public String d(cgu<Source> cguVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c197de9a", new Object[]{this, cguVar});
        }
        return cguVar.toString();
    }

    public String e(Source source) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c9354f2", new Object[]{this, source});
        }
        return String.valueOf(source);
    }

    public EventProcessResult c(Source source) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventProcessResult) ipChange.ipc$dispatch("5d5e8686", new Object[]{this, source});
        }
        String b = b();
        TriggerMatchResult a2 = this.f18568a.a(source);
        if (b == null || !qtf.a().b(b)) {
            z = false;
        }
        if (a2.f14216a) {
            if (z) {
                kgh.a(zfu.TAG, "modelName " + b + "matched success");
            }
            this.b.a(a(source));
            return EventProcessResult.RESULT_COMPLETE;
        }
        if (z && a2.a()) {
            kgh.a(zfu.TAG, "mach failed modelName " + b + " onEvent: " + e(source) + "pattern:" + d(this.f18568a) + " triggermatchresult: " + JSON.toJSONString(a2));
        }
        return EventProcessResult.RESULT_IGNORE;
    }
}
