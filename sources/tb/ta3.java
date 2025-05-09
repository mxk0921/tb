package tb;

import android.content.Context;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradePriceViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeRichTextViewConstructor;
import com.alibaba.android.ultron.trade.dinamicX.constructor.TradeTextInputConstructor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.g2s;
import tb.xxr;
import tb.z1s;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class ta3 extends ku<a> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final a b = new a();
    public boolean c = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final Map<String, sn7> f28585a = new HashMap();
        public final Map<Long, qub> b = new HashMap();

        static {
            t2o.a(479199523);
        }

        public void a(String str, sn7 sn7Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e7e73f77", new Object[]{this, str, sn7Var});
            } else {
                ((HashMap) this.f28585a).put(str, sn7Var);
            }
        }

        public void b(long j, qub qubVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9bc83cb", new Object[]{this, new Long(j), qubVar});
            } else {
                ((HashMap) this.b).put(Long.valueOf(j), qubVar);
            }
        }

        public Map<String, sn7> c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1c608ae1", new Object[]{this});
            }
            return this.f28585a;
        }

        public Map<Long, qub> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Map) ipChange.ipc$dispatch("1e39de00", new Object[]{this});
            }
            return this.b;
        }
    }

    static {
        t2o.a(479199522);
    }

    public static /* synthetic */ Object ipc$super(ta3 ta3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/performance/preloader/task/impl/CartDXViewPreloader");
    }

    @Override // tb.ku
    public void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("781f8ee3", new Object[]{this, context});
            return;
        }
        this.b.a(TradePriceViewConstructor.VIEW_TAG, new TradePriceViewConstructor());
        this.b.a(TradeRichTextViewConstructor.VIEW_TAG, new TradeRichTextViewConstructor());
        this.b.a(TradeTextInputConstructor.VIEW_TAG, new TradeTextInputConstructor());
        this.b.b(z1s.DX_WIDGET_ID, new z1s.a());
        this.b.b(g2s.DX_WIDGET_ID, new g2s.a());
        this.b.b(xxr.DX_WIDGET_ID, new xxr.e());
        hav.d(c9x.CART_BIZ_NAME, "CartDXViewPreloader预加载成功");
        this.c = true;
    }

    /* renamed from: f */
    public a b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("72a2a68b", new Object[]{this, new Boolean(z)});
        }
        if (!this.c) {
            return null;
        }
        return this.b;
    }
}
