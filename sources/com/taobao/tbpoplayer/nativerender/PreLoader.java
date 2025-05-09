package com.taobao.tbpoplayer.nativerender;

import android.net.Uri;
import android.text.TextUtils;
import anetwork.channel.Response;
import anetwork.channel.degrade.DegradableNetwork;
import anetwork.channel.entity.RequestImpl;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.poplayer.PopLayer;
import com.alibaba.poplayer.trigger.a;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.tschedule.TSchedule;
import com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback;
import com.taobao.tbpoplayer.nativerender.dsl.DSLModel;
import com.taobao.tbpoplayer.nativerender.dsl.PreLoadModel;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import tb.jlj;
import tb.plj;
import tb.t2o;
import tb.wdm;
import tb.z1x;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class PreLoader {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final jlj f13405a;
    public String b;
    public String c;
    public boolean d;

    static {
        t2o.a(790626420);
    }

    public PreLoader(jlj jljVar) {
        this.f13405a = jljVar;
    }

    public boolean b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f65e531", new Object[]{this, str})).booleanValue();
        }
        try {
            Uri parse = Uri.parse(this.b);
            Uri parse2 = Uri.parse(str);
            if (parse.getHost().equals(parse2.getHost())) {
                if (parse.getPath().equals(parse2.getPath())) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            wdm.h("PreLoader.isJumpUrlEqualsPreLoadUrl.error", th);
            return false;
        }
    }

    public boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d1c99fef", new Object[]{this})).booleanValue();
        }
        return this.d;
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fdbe55f", new Object[]{this});
            return;
        }
        try {
            a M = this.f13405a.M();
            M.k().w0.put("preloadStart", (Object) Boolean.TRUE);
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + M.O());
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 2201, "/poplayer-website.popup_buried_point.popup-expose-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            wdm.h("PreLoader.trackOnDisplay.error", th);
        }
    }

    public void g(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca57c245", new Object[]{this, new Long(j)});
            return;
        }
        try {
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + this.f13405a.M().O() + "&ugPreloadTraceId=" + this.c + "&timestamp=" + j);
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 2101, "/poplayer-website.popup_buried_point.popup-click-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            wdm.h("PreLoader.trackOnJump.error", th);
        }
    }

    public final void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0b4f4b", new Object[]{this});
            return;
        }
        try {
            this.f13405a.M().k().w0.put("preloadSuccess", (Object) Boolean.TRUE);
            HashMap hashMap = new HashMap();
            hashMap.put("gokey", "activityId=" + this.f13405a.M().O() + "&ugPreloadTraceId=" + this.c + "&timestamp=" + PopLayer.getReference().getCurrentTimeStamp(false));
            UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder("https://market.m.taobao.com/app/global-popup/xRender/prod/native", 19999, "/poplayer-website.popup_buried_point.preload-success-data-statistic", "", "", hashMap).build());
        } catch (Throwable th) {
            wdm.h("PreLoader.trackOnPreLoadSuccess.error", th);
        }
    }

    public final String a(PreLoadModel preLoadModel) {
        String str;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c366c748", new Object[]{this, preLoadModel});
        }
        if (!TextUtils.isEmpty(preLoadModel.url)) {
            str = preLoadModel.url;
        } else {
            if (!TextUtils.isEmpty(preLoadModel.ERTestUrl)) {
                Response syncSend = new DegradableNetwork(this.f13405a.M().c()).syncSend(new RequestImpl(preLoadModel.ERTestUrl), null);
                if (syncSend == null) {
                    return "";
                }
                wdm.d("PreLoader.fetchERTestUrl.%s", syncSend);
                if (syncSend.getStatusCode() < 0) {
                    wdm.d("PreLoader.fetchERTestUrl.statusCodeError", new Object[0]);
                    return "";
                }
                try {
                    String str2 = new String(syncSend.getBytedata(), "UTF-8");
                    wdm.d("PreLoader.fetchERTestUrl.data=%s", str2);
                    str = JSON.parseObject(str2).getJSONObject("group_config").getString("url");
                    z = "true".equals(Uri.parse(str).getQueryParameter("usePreload"));
                    if (!z) {
                        str = "";
                    }
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
            str = "";
            z = false;
        }
        if (!z || TextUtils.isEmpty(str)) {
            return "";
        }
        this.c = UUID.randomUUID().toString().substring(0, 8);
        HashMap hashMap = new HashMap();
        hashMap.put("ugPreloadTraceId", this.c);
        hashMap.put("ugPopAid", this.f13405a.M().O());
        return plj.b(str, hashMap);
    }

    public String d(String str) {
        long j;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134e008", new Object[]{this, str});
        }
        if (!c() || !b(str)) {
            j = 0;
            z = false;
        } else {
            HashMap hashMap = new HashMap();
            j = PopLayer.getReference().getCurrentTimeStamp(false);
            hashMap.put("ugExpTime", String.valueOf(j));
            str = plj.b(str, hashMap);
        }
        if (z) {
            g(j);
        }
        return str;
    }

    public void e(DSLModel dSLModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("251be1", new Object[]{this, dSLModel});
            return;
        }
        PreLoadModel preLoadModel = dSLModel.preload;
        if (preLoadModel != null && preLoadModel.isValid()) {
            String a2 = a(preLoadModel);
            this.b = a2;
            if (!TextUtils.isEmpty(a2)) {
                f();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("type", (Object) z1x.PRE_RENDER);
                jSONObject.put("trigger", (Object) "PopLayer");
                if (!TextUtils.isEmpty(preLoadModel.containerType)) {
                    str = preLoadModel.containerType;
                } else {
                    str = "h5";
                }
                jSONObject.put("bizCode", (Object) str);
                jSONObject.put("version", (Object) "1.0");
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("url", (Object) this.b);
                jSONObject2.put("timeout", (Object) 10000);
                jSONObject2.put("spmVerifyValue", (Object) "*");
                jSONObject2.put("ignoreStatusCheck", (Object) Boolean.valueOf(preLoadModel.ignoreStatusCheck));
                jSONObject.put("params", (Object) jSONObject2);
                boolean preloadWithConfig = TSchedule.preloadWithConfig("PopLayer", "pop_user_growth", Collections.singletonList(jSONObject), new ScheduleProtocolCallback() { // from class: com.taobao.tbpoplayer.nativerender.PreLoader.1
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                    public void onPreload(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType, HashMap<String, String> hashMap) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("df1a7672", new Object[]{this, scheduleProtocolCallbackType, hashMap});
                        }
                    }

                    @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                    public boolean resolveParameter(String str2, Map<String, String> map) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("1ba0efdb", new Object[]{this, str2, map})).booleanValue();
                        }
                        return true;
                    }

                    @Override // com.taobao.android.tscheduleprotocol.ScheduleProtocolCallback
                    public boolean resolveType(ScheduleProtocolCallback.ScheduleProtocolCallbackType scheduleProtocolCallbackType) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            return ((Boolean) ipChange2.ipc$dispatch("8945bdc1", new Object[]{this, scheduleProtocolCallbackType})).booleanValue();
                        }
                        return true;
                    }
                });
                this.d = preloadWithConfig;
                wdm.d("PreLoader.startPreLoad.preloadWithConfig.mPreLoadStartSuccess=%s", Boolean.valueOf(preloadWithConfig));
                if (this.d) {
                    h();
                }
            }
        }
    }
}
