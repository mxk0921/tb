package com.etao.feimagesearch.immerse;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.newresult.base.IrpDatasource;
import kotlin.a;
import tb.ckf;
import tb.gnf;
import tb.njg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class IrpManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final IrpDatasource f4731a;
    public final njg b = a.b(IrpManager$widgetEventBus$2.INSTANCE);

    static {
        t2o.a(481296986);
    }

    public IrpManager(IrpDatasource irpDatasource) {
        ckf.g(irpDatasource, "datasource");
        this.f4731a = irpDatasource;
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            c().a();
        }
    }

    public final IrpDatasource b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IrpDatasource) ipChange.ipc$dispatch("49f24164", new Object[]{this});
        }
        return this.f4731a;
    }

    public final gnf c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gnf) ipChange.ipc$dispatch("16782de3", new Object[]{this});
        }
        return (gnf) this.b.getValue();
    }
}
