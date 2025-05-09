package tb;

import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.config.BHRTaskConfigBase;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Map;
import mtopsdk.mtop.domain.MtopResponse;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class yd3 extends lmb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a extends ux {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f31998a;

        public a(String str) {
            this.f31998a = str;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartTabClickSubscriber$1");
        }

        @Override // tb.ojd
        public void b(int i, MtopResponse mtopResponse, Object obj, fsb fsbVar, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e4ca5d12", new Object[]{this, new Integer(i), mtopResponse, obj, fsbVar, map});
                return;
            }
            RecyclerView recyclerView = (RecyclerView) yd3.r(yd3.this).e().o();
            recyclerView.post(new RunnableC1107a(recyclerView));
        }

        /* compiled from: Taobao */
        /* renamed from: tb.yd3$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
        public class RunnableC1107a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ RecyclerView f31999a;

            public RunnableC1107a(RecyclerView recyclerView) {
                this.f31999a = recyclerView;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                this.f31999a.scrollToPosition(0);
                ub3.m("TabFilter", "总耗时", true, 1.0f, null);
            }
        }

        @Override // tb.ojd
        public void a(int i, MtopResponse mtopResponse, Object obj, boolean z, Map<String, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd7a0a5", new Object[]{this, new Integer(i), mtopResponse, obj, new Boolean(z), map});
                return;
            }
            yd3.p(yd3.this).W(this.f31998a);
            yd3.q(yd3.this).e().D();
            ub3.m("TabFilter", "总耗时", false, 1.0f, null);
        }
    }

    static {
        t2o.a(479199430);
    }

    public static /* synthetic */ Object ipc$super(yd3 yd3Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/icart/core/event/CartTabClickSubscriber");
    }

    public static /* synthetic */ zxb p(yd3 yd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zxb) ipChange.ipc$dispatch("88d3debf", new Object[]{yd3Var});
        }
        return yd3Var.k;
    }

    public static /* synthetic */ kmb q(yd3 yd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("3e7c88f9", new Object[]{yd3Var});
        }
        return yd3Var.j;
    }

    public static /* synthetic */ kmb r(yd3 yd3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmb) ipChange.ipc$dispatch("fa25b718", new Object[]{yd3Var});
        }
        return yd3Var.j;
    }

    public final void s(Map<String, String> map) {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("199266b9", new Object[]{this, map});
        } else if (this.e.getData() != null && this.e.getData().getJSONObject("features") != null && this.e.getData().getJSONObject("features").getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT) != null && (jSONObject = this.e.getData().getJSONObject("features").getJSONObject(BHRTaskConfigBase.TYPE_CONFIG_UT).getJSONObject("args")) != null) {
            for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                Object value = entry.getValue();
                if (value instanceof String) {
                    map.put(entry.getKey(), (String) value);
                }
            }
        }
    }

    public final void t(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af98a117", new Object[]{this, map});
            return;
        }
        s(map);
        UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(this.j.W().o(), 2101, "Page_ShoppingCart_TabCard_TabClick", "", "", map).build());
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0135  */
    @Override // tb.l12
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(tb.lcu r12) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.yd3.j(tb.lcu):void");
    }
}
