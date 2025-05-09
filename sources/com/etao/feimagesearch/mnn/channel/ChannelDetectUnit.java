package com.etao.feimagesearch.mnn.channel;

import android.os.SystemClock;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.mnn.BaseMnnRunUnit;
import com.taobao.android.mnncv.MNNCVExecutor;
import com.taobao.mrt.task.MRTRuntimeException;
import java.util.HashMap;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import tb.a07;
import tb.agh;
import tb.ckf;
import tb.njg;
import tb.oi3;
import tb.pi3;
import tb.t2o;
import tb.wuc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class ChannelDetectUnit extends BaseMnnRunUnit<oi3, pi3> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TASK_NAME = "plt_channel_detect";
    public final String p;
    public static final a Companion = new a(null);
    public static final njg<ChannelDetectUnit> q = kotlin.a.a(LazyThreadSafetyMode.SYNCHRONIZED, ChannelDetectUnit$Companion$instance$2.INSTANCE);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(481297044);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public final ChannelDetectUnit a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChannelDetectUnit) ipChange.ipc$dispatch("7db7abc6", new Object[]{this});
            }
            return (ChannelDetectUnit) ChannelDetectUnit.L().getValue();
        }

        public a() {
        }
    }

    static {
        t2o.a(481297043);
    }

    public /* synthetic */ ChannelDetectUnit(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ njg L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (njg) ipChange.ipc$dispatch("59beb729", new Object[0]);
        }
        return q;
    }

    public static final /* synthetic */ String M(ChannelDetectUnit channelDetectUnit) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dba04ec7", new Object[]{channelDetectUnit});
        }
        return channelDetectUnit.p;
    }

    public static final /* synthetic */ void N(ChannelDetectUnit channelDetectUnit, int i, wuc wucVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3ff5ed3", new Object[]{channelDetectUnit, new Integer(i), wucVar, str, new Long(j)});
        } else {
            channelDetectUnit.O(i, wucVar, str, j);
        }
    }

    public static /* synthetic */ Object ipc$super(ChannelDetectUnit channelDetectUnit, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/mnn/channel/ChannelDetectUnit");
    }

    public final void O(int i, wuc<pi3> wucVar, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58e22a51", new Object[]{this, new Integer(i), wucVar, str, new Long(j)});
        } else {
            wucVar.onResult(new pi3(Integer.valueOf(i), str, j));
        }
    }

    public ChannelDetectUnit() {
        super(TASK_NAME);
        this.p = "ChannelDetectUnit";
    }

    /* renamed from: P */
    public void b(oi3 oi3Var, Object obj, wuc<pi3> wucVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("92ea69e", new Object[]{this, oi3Var, obj, wucVar});
            return;
        }
        ckf.g(oi3Var, "input");
        ckf.g(wucVar, "callback");
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap<String, Object> g = com.etao.feimagesearch.mnn.utils.a.g(oi3Var.c());
        if (g == null) {
            O(-2, wucVar, "cannot find format of bitmap", SystemClock.elapsedRealtime() - elapsedRealtime);
            return;
        }
        if (oi3Var.d()) {
            str = oi3Var.a();
        } else {
            str = "";
        }
        g.put(com.etao.feimagesearch.mnn.utils.a.KEY_QUERY_SRC, str);
        E(g, false, new b(wucVar, elapsedRealtime));
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class b implements MNNCVExecutor.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ wuc<pi3> b;
        public final /* synthetic */ long c;

        public b(wuc<pi3> wucVar, long j) {
            this.b = wucVar;
            this.c = j;
        }

        @Override // com.taobao.android.mnncv.MNNCVExecutor.h
        public final void onResult(MRTRuntimeException mRTRuntimeException, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce89cd6", new Object[]{this, mRTRuntimeException, map});
                return;
            }
            if (mRTRuntimeException != null) {
                ChannelDetectUnit channelDetectUnit = ChannelDetectUnit.this;
                wuc<pi3> wucVar = this.b;
                long j = this.c;
                String M = ChannelDetectUnit.M(channelDetectUnit);
                agh.h(M, "----errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()));
                ChannelDetectUnit.N(channelDetectUnit, -2, wucVar, "errorCode: " + mRTRuntimeException.errorCode + ", errorMsg: " + ((Object) mRTRuntimeException.getMessage()), SystemClock.elapsedRealtime() - j);
            }
            if (map != null) {
                ChannelDetectUnit channelDetectUnit2 = ChannelDetectUnit.this;
                wuc<pi3> wucVar2 = this.b;
                long j2 = this.c;
                Object obj = map.get("imgClientChannel");
                String a2 = com.etao.feimagesearch.mnn.utils.a.a(map);
                if (obj == null || !(obj instanceof Integer)) {
                    ChannelDetectUnit.N(channelDetectUnit2, -3, wucVar2, TextUtils.isEmpty(a2) ? "extraInfo is empty" : a2, SystemClock.elapsedRealtime() - j2);
                } else {
                    wucVar2.onResult(new pi3((Integer) obj, a2, SystemClock.elapsedRealtime() - j2));
                }
            }
        }
    }
}
