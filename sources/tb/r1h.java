package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.model.message.TLiveMsg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class r1h implements awd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public awd f27046a;

    static {
        t2o.a(779092330);
        t2o.a(806355923);
    }

    @Override // tb.awd
    public void a(int i, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ce5e2af", new Object[]{this, new Integer(i), obj});
            return;
        }
        awd awdVar = this.f27046a;
        if (awdVar != null) {
            awdVar.a(i, obj);
        }
    }

    @Override // tb.awd
    public void b(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8d56b849", new Object[]{this, tLiveMsg});
            return;
        }
        awd awdVar = this.f27046a;
        if (awdVar != null) {
            awdVar.b(tLiveMsg);
        }
    }

    public void c(awd awdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("221e3410", new Object[]{this, awdVar});
        } else {
            this.f27046a = awdVar;
        }
    }
}
