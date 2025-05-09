package com.taobao.homepage.pop.mtop;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.mtop.PopFatigueReportMtopParams;
import com.taobao.homepage.pop.protocol.model.pop.IPopConfig;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;
import mtopsdk.mtop.domain.MtopResponse;
import tb.g6j;
import tb.vfm;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.homepage.pop.mtop.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class C0561a implements g6j<PopFatigueReportResult> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0561a(a aVar) {
        }

        @Override // tb.g6j
        public void b(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
            } else {
                vfm.f("PopFatigueReport", "pop fatigue report onSystemFailure");
            }
        }

        /* renamed from: c */
        public void a(MtopResponse mtopResponse) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
            } else {
                vfm.f("PopFatigueReport", "pop fatigue report failure");
            }
        }

        /* renamed from: d */
        public void onSuccess(PopFatigueReportResult popFatigueReportResult) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("63097fd4", new Object[]{this, popFatigueReportResult});
            }
        }
    }

    public final boolean a(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1590e7ca", new Object[]{this, iPopData})).booleanValue();
        }
        IPopConfig popConfig = iPopData.getPopConfig();
        if (popConfig == null) {
            return false;
        }
        return popConfig.enablePopControl();
    }

    public final PopFatigueReportMtopParams.b b(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PopFatigueReportMtopParams.b) ipChange.ipc$dispatch("ac4858ab", new Object[]{this, iPopData});
        }
        PopFatigueReportMtopParams.b bVar = new PopFatigueReportMtopParams.b();
        bVar.d(iPopData.getBusinessID());
        JSONObject passParam = iPopData.getPassParam();
        if (passParam != null) {
            bVar.e(passParam.toJSONString());
        }
        return bVar;
    }

    public final g6j<PopFatigueReportResult> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (g6j) ipChange.ipc$dispatch("20a15779", new Object[]{this});
        }
        return new C0561a(this);
    }

    public void d(IPopData<?> iPopData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("985a119e", new Object[]{this, iPopData});
        } else if (!a(iPopData)) {
            vfm.f("PopFatigueReport", "pop fatigue report enable is close");
        } else {
            new PopFatigueReportClient().execute(b(iPopData).c(), c(), null);
        }
    }
}
