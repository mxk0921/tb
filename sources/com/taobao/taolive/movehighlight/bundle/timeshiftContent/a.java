package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.taolive.movehighlight.bundle.timeshiftContent.b;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import tb.d47;
import tb.t2o;
import tb.ux9;
import tb.vwa;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ux9 f13071a;
    public vwa b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.taolive.movehighlight.bundle.timeshiftContent.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0746a extends d47 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b.a f13072a;

        public C0746a(a aVar, b.a aVar2) {
            this.f13072a = aVar2;
        }

        public static /* synthetic */ Object ipc$super(C0746a aVar, String str, Object... objArr) {
            if (str.hashCode() == -83293931) {
                super.onSuccess(((Number) objArr[0]).intValue(), (NetResponse) objArr[1], (NetBaseOutDo) objArr[2], objArr[3]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/movehighlight/bundle/timeshiftContent/TimeShiftContentModel$1");
        }

        @Override // tb.d47, tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
            } else {
                onSystemError(i, netResponse, obj);
            }
        }

        @Override // tb.d47, tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
                return;
            }
            super.onSuccess(i, netResponse, netBaseOutDo, obj);
            this.f13072a.a(netResponse);
        }

        @Override // tb.d47, tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            String simpleName = b.class.getSimpleName();
            TLog.loge(simpleName, "TimeShiftContentModel.requestContentList error" + netResponse.getRetMsg());
            this.f13072a.b();
        }
    }

    static {
        t2o.a(779092567);
    }

    public a(ux9 ux9Var) {
        this.f13071a = ux9Var;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        vwa vwaVar = this.b;
        if (vwaVar != null) {
            vwaVar.destroy();
            this.b = null;
        }
    }

    public void b(String str, String str2, int i, int i2, String str3, b.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bfed615", new Object[]{this, str, str2, new Integer(i), new Integer(i2), str3, aVar});
            return;
        }
        vwa vwaVar = new vwa(new C0746a(this, aVar));
        this.b = vwaVar;
        vwaVar.K(this.f13071a, str, str2, i, i2, str3);
    }
}
