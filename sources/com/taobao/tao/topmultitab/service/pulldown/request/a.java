package com.taobao.tao.topmultitab.service.pulldown.request;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.location.client.TBLocationClient;
import com.taobao.location.common.TBLocationDTO;
import com.taobao.login4android.api.Login;
import com.taobao.tao.topmultitab.service.pulldown.PullDownUpServiceImpl;
import com.taobao.tao.topmultitab.service.pulldown.request.SecondFloorConfigParams;
import com.ut.device.UTDevice;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import mtopsdk.mtop.domain.MtopResponse;
import tb.b3b;
import tb.bqa;
import tb.f4b;
import tb.g6j;
import tb.get;
import tb.m0b;
import tb.p78;
import tb.r4p;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements g6j<SecondFloorGetResult> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SecondFloorClient f12838a = new SecondFloorClient();
    public final PullDownUpServiceImpl b;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.tao.topmultitab.service.pulldown.request.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class RunnableC0730a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ SecondFloorGetResult f12839a;

        public RunnableC0730a(SecondFloorGetResult secondFloorGetResult) {
            this.f12839a = secondFloorGetResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            bqa.d("SecondFloorRequest", "请求回来了");
            a.c(a.this).updateSecondFloorConfig(this.f12839a.secondFloorConfigResult);
        }
    }

    static {
        t2o.a(729810296);
    }

    public a(PullDownUpServiceImpl pullDownUpServiceImpl) {
        this.b = pullDownUpServiceImpl;
    }

    public static /* synthetic */ PullDownUpServiceImpl c(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PullDownUpServiceImpl) ipChange.ipc$dispatch("e1909d8d", new Object[]{aVar});
        }
        return aVar.b;
    }

    @Override // tb.g6j
    public void b(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8463ea48", new Object[]{this, mtopResponse});
        } else {
            bqa.d("SecondFloorRequest", "onSystemFailure");
        }
    }

    public final List<String> e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d554f6fb", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        String l = f4b.l();
        if (!TextUtils.isEmpty(l)) {
            arrayList.addAll(Arrays.asList(l.split(",")));
        }
        return arrayList;
    }

    public final boolean f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("88815dcd", new Object[]{this, str})).booleanValue();
        }
        return e().contains(str);
    }

    /* renamed from: g */
    public void a(MtopResponse mtopResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb2ff8f7", new Object[]{this, mtopResponse});
        } else {
            bqa.d("SecondFloorRequest", "请求异常");
        }
    }

    /* renamed from: h */
    public void onSuccess(SecondFloorGetResult secondFloorGetResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f71c8f", new Object[]{this, secondFloorGetResult});
        } else {
            get.a().h(new RunnableC0730a(secondFloorGetResult));
        }
    }

    public void i(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e3d47e0", new Object[]{this, str});
        } else if (!f(str)) {
            bqa.d("SecondFloorRequest", "该请求类型不在白名单中，requestType：" + str);
        } else if (!this.f12838a.isRequesting()) {
            SecondFloorConfigParams.b d = d(str);
            bqa.d("SecondFloorRequest", "发起二楼请求");
            this.f12838a.execute(d.k(), this, null);
        }
    }

    public final SecondFloorConfigParams.b d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SecondFloorConfigParams.b) ipChange.ipc$dispatch("78987b67", new Object[]{this, str});
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("home_pull_down");
        arrayList.add("refresh_config");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("requestType", (Object) str);
        jSONObject.put("deviceLevel", (Object) m0b.d());
        SecondFloorConfigParams.b bVar = new SecondFloorConfigParams.b();
        bVar.n(JSON.toJSONString(arrayList)).s(Login.getSid()).q(Login.getOldNick()).t(Login.getOldUserId()).u(UTDevice.getUtdid(m0b.c())).l(b3b.c()).m(jSONObject.toString());
        if (f4b.b("enableSecondFloorLocation", false)) {
            TBLocationDTO d = p78.a() ? TBLocationClient.d() : null;
            if (d != null) {
                bVar.o(d.getLatitude()).p(d.getLongitude());
                HashMap hashMap = new HashMap();
                hashMap.put("provinceName", d.getProvinceName());
                hashMap.put(r4p.KEY_CITY_NAME, d.getCityName());
                bVar.r(JSON.toJSONString(hashMap));
            }
        }
        return bVar;
    }
}
