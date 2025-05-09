package com.taobao.taolive.movehighlight.bundle.timeshiftContent;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.Map;
import tb.cxg;
import tb.t2o;
import tb.ufo;
import tb.ux9;
import tb.yj4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class b {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public int f13073a = 0;
    public final com.taobao.taolive.movehighlight.bundle.timeshiftContent.a b;
    public final TBLiveDataModel c;
    public String d;
    public final VideoInfo e;
    public String f;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface a {
        void a(NetResponse netResponse);

        void b();
    }

    static {
        t2o.a(779092569);
    }

    public b(TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        this.c = tBLiveDataModel;
        this.b = new com.taobao.taolive.movehighlight.bundle.timeshiftContent.a(ux9Var);
        b();
        this.e = cxg.e(tBLiveDataModel);
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f0306f9b", new Object[]{this});
            return;
        }
        com.taobao.taolive.movehighlight.bundle.timeshiftContent.a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final void b() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8f683acf", new Object[]{this});
            return;
        }
        TBLiveDataModel tBLiveDataModel = this.c;
        if (tBLiveDataModel != null && (map = tBLiveDataModel.mInitParams) != null) {
            String str = this.c.mInitParams.get(yj4.PARAM_TRANSPARENT_PARAMS);
            this.d = str;
            this.d = ufo.c(str, map.get("timeMovingPcmIdParam"));
        }
    }

    public void c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbbe1094", new Object[]{this, aVar});
        } else {
            this.b.b(this.e.liveId, this.f, this.f13073a, 15, this.d, aVar);
        }
    }

    public void d(String str, a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c3e65e", new Object[]{this, str, aVar});
            return;
        }
        this.f13073a = 0;
        this.f = str;
        this.b.b(this.e.liveId, str, 0, 10, this.d, aVar);
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd5cc04", new Object[]{this, new Integer(i)});
        } else if (!TextUtils.isEmpty(this.f)) {
            this.f13073a = (this.f13073a + i) - 1;
        } else {
            this.f13073a += i;
        }
    }
}
