package com.taobao.nanocompose.megability.ability;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.monitor.MUSMonitor;
import tb.a07;
import tb.dr;
import tb.fzv;
import tb.jpu;
import tb.t2o;
import tb.v3i;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final String f11359a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1022361897);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final d a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (d) ipChange.ipc$dispatch("aaeeac0c", new Object[]{this});
            }
            d dVar = new d(null);
            dr.d(dr.INSTANCE, MUSMonitor.MODULE_DIM_ABILITY, "create", kotlin.collections.a.k(jpu.a(MUSMonitor.MODULE_DIM_ABILITY, "screen"), jpu.a("__mega_context__", v3i.f(jpu.a("instanceID", d.a(dVar))))), null, null, 24, null);
            return dVar;
        }
    }

    static {
        t2o.a(1022361896);
    }

    public /* synthetic */ d(a07 a07Var) {
        this();
    }

    public static final /* synthetic */ String a(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("617c14d9", new Object[]{dVar});
        }
        return dVar.f11359a;
    }

    public d() {
        this.f11359a = fzv.a();
    }
}
