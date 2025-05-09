package com.taobao.tao.powermsg.managers.pull;

import androidx.collection.ArrayMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.messagekit.base.MsgRouter;
import com.taobao.tao.messagekit.base.monitor.MonitorManager;
import com.taobao.tao.messagekit.core.model.ErrorMessage;
import com.taobao.tao.messagekit.core.utils.MsgLog;
import com.taobao.tao.messagekit.core.utils.MsgMonitor;
import com.taobao.tao.powermsg.managers.a;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import java.util.HashMap;
import java.util.Map;
import tb.b5n;
import tb.gay;
import tb.ikl;
import tb.jg4;
import tb.k2r;
import tb.l2o;
import tb.l5y;
import tb.lkd;
import tb.t2o;
import tb.vxx;
import tb.w4n;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class PullMsgListener implements lkd {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final int f12585a = jg4.a("pull_retry_error", 5);
    public final w4n b;

    static {
        t2o.a(628097287);
        t2o.a(628097161);
    }

    public PullMsgListener(w4n w4nVar) {
        this.b = w4nVar;
    }

    public static /* synthetic */ w4n a(PullMsgListener pullMsgListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w4n) ipChange.ipc$dispatch("28eaacda", new Object[]{pullMsgListener});
        }
        return pullMsgListener.b;
    }

    public static /* synthetic */ int b(PullMsgListener pullMsgListener) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("745184c0", new Object[]{pullMsgListener})).intValue();
        }
        return pullMsgListener.f12585a;
    }

    @Override // tb.lkd
    public void onResult(final int i, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170ed185", new Object[]{this, new Integer(i), map});
            return;
        }
        if (map == null) {
            map = new HashMap<>();
        }
        Object obj = map.get("context");
        if (!(obj instanceof Long) || obj.equals(this.b.g)) {
            l5y.m(map).I(gay.a()).K(new vxx<Map<String, Object>>() { // from class: com.taobao.tao.powermsg.managers.pull.PullMsgListener.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                /* renamed from: a */
                public void accept(Map<String, Object> map2) {
                    long j;
                    int i2;
                    int i3;
                    int i4;
                    int i5;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("5d08b616", new Object[]{this, map2});
                        return;
                    }
                    PullMsgListener.a(PullMsgListener.this).m.set(0);
                    if (map2 == null || !(map2.get("data") instanceof k2r)) {
                        i3 = -1;
                        j = -1;
                        i2 = 0;
                    } else {
                        k2r k2rVar = (k2r) map2.get("data");
                        i2 = k2rVar.b;
                        j = k2rVar.f22367a;
                        i3 = k2rVar.c;
                    }
                    MsgMonitor.e("POWERMSG", "pullCost", new ArrayMap<String, String>(this) { // from class: com.taobao.tao.powermsg.managers.pull.PullMsgListener.1.1
                        {
                            put("POWERMSG_DIMENS_BIZ", "" + PullMsgListener.a(PullMsgListener.this).f30452a);
                            PullMsgListener pullMsgListener = PullMsgListener.this;
                            put("MKT_DIMENS_TOPIC", PullMsgListener.a(pullMsgListener).b);
                            put("code", "" + i);
                            put("mode", "" + PullMsgListener.a(pullMsgListener).d);
                            put("time", "" + PullMsgListener.a(pullMsgListener).e);
                        }
                    }, new ArrayMap<String, Double>(this) { // from class: com.taobao.tao.powermsg.managers.pull.PullMsgListener.1.2
                        {
                            put("POWERMSG_MEASURE_DURATION", Double.valueOf((System.nanoTime() - PullMsgListener.a(PullMsgListener.this).g.longValue()) / 1000.0d));
                        }
                    });
                    if (j > 0) {
                        PullMsgListener.a(PullMsgListener.this).f = j;
                    }
                    if (i == 1000) {
                        PullMsgListener.a(PullMsgListener.this).i = 0;
                        a.o(PullMsgListener.a(PullMsgListener.this).b, PullMsgListener.a(PullMsgListener.this).c, i2, i3);
                        MsgLog.i(b5n.TAG, "receivePullMsg >", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).d), "role:", Integer.valueOf(i2), TypedValues.CycleType.S_WAVE_PERIOD, Integer.valueOf(i3), "offset:", Long.valueOf(PullMsgListener.a(PullMsgListener.this).f), "topic:", PullMsgListener.a(PullMsgListener.this).b, l2o.COL_BTAG, PullMsgListener.a(PullMsgListener.this).c);
                        if (-2 == PullMsgListener.a(PullMsgListener.this).k.get()) {
                            a.n(PullMsgListener.a(PullMsgListener.this).b, PullMsgListener.a(PullMsgListener.this).c, i2, i3);
                        }
                        PullMsgListener.a(PullMsgListener.this).k.set(1);
                        MsgMonitor.a("MKT", "pcs", 1.0d);
                        MsgMonitor.f("MKT", "pull");
                        return;
                    }
                    w4n a2 = PullMsgListener.a(PullMsgListener.this);
                    int i6 = a2.i + 1;
                    a2.i = i6;
                    if (i6 % PullMsgListener.b(PullMsgListener.this) != 0 || (PullMsgListener.a(PullMsgListener.this).d != 2 && 1 == PullMsgListener.a(PullMsgListener.this).j.get())) {
                        i5 = i3;
                        i4 = i2;
                    } else {
                        ErrorMessage create = ErrorMessage.create();
                        create.bizCode = PullMsgListener.a(PullMsgListener.this).f30452a;
                        create.header.f18091a = PullMsgListener.a(PullMsgListener.this).b;
                        create.header.c = PowerMsgType.MSG_ERROR;
                        create.sysCode = 1;
                        i5 = i3;
                        i4 = i2;
                        MsgLog.e(b5n.TAG, "notify pull Error >", Integer.valueOf(i), "type", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).d), "topic:", PullMsgListener.a(PullMsgListener.this).b, l2o.COL_BTAG, PullMsgListener.a(PullMsgListener.this).c);
                        l5y.m(new ikl(create)).a(MsgRouter.e().d());
                    }
                    PullMsgListener.a(PullMsgListener.this).j.set(0);
                    String str = (String) (map2 != null ? map2.get("re_msg") : null);
                    MsgMonitor.a("MKT", "pcf", 1.0d);
                    MsgMonitor.c("MKT", "pull", "" + i, str);
                    int i7 = i;
                    if (i7 == -3001) {
                        PullMsgListener.a(PullMsgListener.this).k.set(2);
                        MsgMonitor.a("MKT", "pcft", 1.0d);
                        MsgLog.g(b5n.TAG, "PullMsg Timeout >", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).d), "offset:", Long.valueOf(PullMsgListener.a(PullMsgListener.this).f), "topic:", PullMsgListener.a(PullMsgListener.this).b, l2o.COL_BTAG, PullMsgListener.a(PullMsgListener.this).c);
                    } else if (i7 != 4001) {
                        PullMsgListener.a(PullMsgListener.this).k.set(1);
                        MsgLog.g(b5n.TAG, "pullMsg Mtop Error >", Integer.valueOf(i), str, "type", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).d), "offset:", Long.valueOf(PullMsgListener.a(PullMsgListener.this).f), "duration:", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).e), "topic:", PullMsgListener.a(PullMsgListener.this).b, l2o.COL_BTAG, PullMsgListener.a(PullMsgListener.this).c);
                        a.n(PullMsgListener.a(PullMsgListener.this).b, PullMsgListener.a(PullMsgListener.this).c, i4, i5);
                    } else if (-2 != PullMsgListener.a(PullMsgListener.this).k.get()) {
                        PullMsgListener.a(PullMsgListener.this).k.set(-2);
                        MsgLog.g(b5n.TAG, "PullMsg flow limit >", Integer.valueOf(PullMsgListener.a(PullMsgListener.this).d), "offset:", Long.valueOf(PullMsgListener.a(PullMsgListener.this).f), "pullConf.topic:", PullMsgListener.a(PullMsgListener.this).b);
                        int a3 = jg4.a("pull_time_limit", 20);
                        String str2 = PullMsgListener.a(PullMsgListener.this).b;
                        String str3 = PullMsgListener.a(PullMsgListener.this).c;
                        int i8 = PullMsgListener.a(PullMsgListener.this).d;
                        if (PullMsgListener.a(PullMsgListener.this).e > a3) {
                            a3 = (int) (PullMsgListener.a(PullMsgListener.this).e * 1.5d);
                        }
                        a.n(str2, str3, i8, a3);
                    } else {
                        return;
                    }
                    if (PullMsgListener.a(PullMsgListener.this).i > 600) {
                        PullMsgListener.a(PullMsgListener.this).i = 0;
                        return;
                    }
                    l2o l2oVar = new l2o(MonitorManager.a(null, null), 2, PullMsgListener.a(PullMsgListener.this).f30452a, PullMsgListener.a(PullMsgListener.this).b, PullMsgListener.a(PullMsgListener.this).c, i, PullMsgListener.a(PullMsgListener.this).d);
                    l2oVar.f = 2;
                    l2oVar.h = "" + PullMsgListener.a(PullMsgListener.this).f;
                    MonitorManager.k(l2oVar);
                }
            });
        }
    }
}
