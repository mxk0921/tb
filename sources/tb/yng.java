package tb;

import android.content.Context;
import com.alibaba.android.aura.AURAFlowData;
import com.alibaba.android.aura.AURAGlobalData;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.android.aura.datamodel.parse.AURAParseIO;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "lightbuy.impl.nextrpc.attachedData.weex")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class yng implements wbb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public lo f32216a;
    public cog b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ AURAParseIO f32217a;

        public a(AURAParseIO aURAParseIO) {
            this.f32217a = aURAParseIO;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            List<rl> data = this.f32217a.getData();
            ArrayList arrayList = new ArrayList();
            for (rl rlVar : data) {
                JSONObject b = rlVar.b();
                if (b != null) {
                    arrayList.add(b);
                }
            }
            cog r = yng.r(yng.this);
            if (r == null) {
                ck.g().e("LightBuyDataSourceManager is null !!");
            } else {
                r.a(yng.x(yng.this).f(), null, arrayList);
            }
        }
    }

    static {
        t2o.a(708837396);
        t2o.a(80740477);
    }

    public static /* synthetic */ cog r(yng yngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cog) ipChange.ipc$dispatch("b7d6a70f", new Object[]{yngVar});
        }
        return yngVar.B();
    }

    public static /* synthetic */ lo x(yng yngVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (lo) ipChange.ipc$dispatch("f18e6957", new Object[]{yngVar});
        }
        return yngVar.f32216a;
    }

    public final cog B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (cog) ipChange.ipc$dispatch("49652c7d", new Object[]{this});
        }
        cog cogVar = this.b;
        if (cogVar != null) {
            return cogVar;
        }
        aog aogVar = (aog) this.f32216a.g(aog.KEY_LIGHT_BUY, aog.class);
        if (aogVar == null) {
            return null;
        }
        cog b = aogVar.b();
        this.b = b;
        return b;
    }

    public final void L(AURAParseIO aURAParseIO) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46589676", new Object[]{this, aURAParseIO});
        } else {
            dn.h(new a(aURAParseIO));
        }
    }

    @Override // tb.ybb
    public void onCreate(lo loVar, yi yiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8206ca", new Object[]{this, loVar, yiVar});
        } else {
            this.f32216a = loVar;
        }
    }

    @Override // tb.lbb
    public void onDataChanged(AURAFlowData aURAFlowData, AURAGlobalData aURAGlobalData, hbb hbbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bab53acc", new Object[]{this, aURAFlowData, aURAGlobalData, hbbVar});
        }
    }

    @Override // tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        }
    }

    @Override // tb.wbb
    public boolean R(AURAParseIO aURAParseIO, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6c61f92", new Object[]{this, aURAParseIO, str})).booleanValue();
        }
        Context f = this.f32216a.f();
        if (!(f instanceof lud) || !"weex".equals(((lud) f).g1())) {
            return false;
        }
        L(aURAParseIO);
        return true;
    }
}
