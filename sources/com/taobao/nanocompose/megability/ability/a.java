package com.taobao.nanocompose.megability.ability;

import com.alipay.android.msp.framework.db.MspDBHelper;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import tb.a07;
import tb.dr;
import tb.fzv;
import tb.ht4;
import tb.jpu;
import tb.t2o;
import tb.v3i;
import tb.zm8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final C0638a Companion = new C0638a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f11357a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.nanocompose.megability.ability.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class C0638a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361643);
        }

        public /* synthetic */ C0638a(a07 a07Var) {
            this();
        }

        public final a a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (a) ipChange.ipc$dispatch("95150b62", new Object[]{this});
            }
            a aVar = new a(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", a.a(aVar))))), null, null, 24, null);
            return aVar;
        }

        public final DeviceType b() {
            String e;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DeviceType) ipChange.ipc$dispatch("34cf96a9", new Object[]{this});
            }
            Map<?, ?> a2 = zm8.a(dr.g(dr.INSTANCE, MspDBHelper.BizEntry.COLUMN_NAME_DEVICE, NetworkAbility.API_GET_TYPE, new LinkedHashMap(), null, 8, null));
            if (a2 == null || (e = ht4.e(a2, "result")) == null) {
                return null;
            }
            return DeviceType.Companion.a(e);
        }

        public C0638a() {
        }
    }

    static {
        t2o.a(1022361642);
    }

    public /* synthetic */ a(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e88159c3", new Object[]{aVar});
        }
        return aVar.f11357a;
    }

    public a() {
        this.f11357a = fzv.a();
    }
}
