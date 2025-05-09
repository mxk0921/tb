package tb;

import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.sku.AliXSkuCore;
import com.taobao.android.sku.bizevent.SkuRequestHandler;
import com.taobao.android.sku.bizevent.SkuUserTrackHandler;
import com.taobao.android.sku.utils.SkuLogUtils;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class or0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final f8v f25586a;
    public final pr0 b;

    static {
        t2o.a(442499191);
    }

    public or0(Context context, AliXSkuCore aliXSkuCore, f8v f8vVar) {
        if (cjz.b()) {
            this.f25586a = f8vVar;
        }
        this.b = new pr0(aliXSkuCore);
        c();
    }

    public pr0 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (pr0) ipChange.ipc$dispatch("93d7acfd", new Object[]{this});
        }
        return this.b;
    }

    public f8v b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (f8v) ipChange.ipc$dispatch("c8f37c31", new Object[]{this});
        }
        if (cjz.a()) {
            SkuLogUtils.x("AliXSkuHandlerCenter.getUltronEventHandler");
        }
        return this.f25586a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76decef7", new Object[]{this});
        } else if (!cjz.a()) {
            d(t2q.EVENT_TYPE, new t2q());
            d(k2q.EVENT_TYPE, new k2q());
            d(v0r.EVENT_TYPE, new v0r());
            d(p3q.EVENT_TYPE, new p3q());
            d(SkuUserTrackHandler.EVENT_TYPE, new SkuUserTrackHandler());
            d(o3q.EVENT_TYPE, new o3q());
            this.f25586a.q(SkuRequestHandler.EVENT_TYPE, new SkuRequestHandler());
            this.f25586a.q(i3q.EVENT_TYPE, new i3q());
            this.f25586a.q(h3q.EVENT_TYPE, new h3q(this.b));
        }
    }

    public void d(String str, lfb lfbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("151bcf6", new Object[]{this, str, lfbVar});
        } else if (cjz.a()) {
            SkuLogUtils.x("AliXSkuHandlerCenter.replaceSubscriber");
        } else {
            this.f25586a.q(str, new qr0(this.b, lfbVar));
        }
    }
}
