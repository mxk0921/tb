package com.taobao.android.detail.ttdetail.request.params;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.utils.PerformanceUtils;
import com.ut.device.UTDevice;
import java.util.HashMap;
import java.util.Map;
import tb.b5m;
import tb.h8n;
import tb.hjh;
import tb.i64;
import tb.mr7;
import tb.r4p;
import tb.rcw;
import tb.sw4;
import tb.t2o;
import tb.vbl;
import tb.wb4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class MainRequestParams implements MtopRequestParams {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String COUNTRY_CODE = "countryCode";
    public static final String CPU_CORE = "cpuCore";
    public static final String CPU_MAX_HZ = "cpuMaxHz";
    private static final String FATIGUE = "fatigue";
    public static final String INDUSTRY = "industry";
    private static final String INDUSTRY_MAIN_PIC_DEGRADE = "industryMainPicDegrade";
    private static final String K_EXPARAMS = "exParams";
    private static final String K_ITEM_ID = "itemNumId";
    private static final String K_SERVER_DETECTED_ITEM_ID = "item_id";
    private static final String LATITUDE = "latitude";
    private static final String LIVE_SHOW_AUTO_PLAY = "liveAutoPlay";
    private static final String LONGITUDE = "longitude";
    private static final int MAX_REQUEST_PARAMS_LENGTH = 6000;
    public static final String NICK = "nick";
    public static final String OPEN_FROM = "openFrom";
    private static final String PRELOAD_V = "preload_v";
    public static final String UTDID = "utdid";
    private static final String VALUE_FALSE = "false";
    private Map<String, String> mExParams;
    private h8n mQueryParams;
    private boolean mUseBundleAdjust;
    private boolean mUseMtopPost;

    static {
        t2o.a(912262183);
        t2o.a(912262184);
    }

    public MainRequestParams(Intent intent) {
        this(new h8n(intent));
    }

    private void appendBizParams(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40e2ac43", new Object[]{this, context, map});
            return;
        }
        map.put(LIVE_SHOW_AUTO_PLAY, String.valueOf(rcw.e(context)));
        map.put(INDUSTRY_MAIN_PIC_DEGRADE, "false");
        map.put(PRELOAD_V, INDUSTRY);
    }

    private void appendCommonParams(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9435934f", new Object[]{this, context, map});
            return;
        }
        map.put("openFrom", b5m.K().a());
        map.put("utdid", UTDevice.getUtdid(context));
        String a2 = hjh.a();
        if (!TextUtils.isEmpty(a2)) {
            map.put("nick", a2);
        }
        setCpuInfo(map);
        setupPositionInfo(context, map);
        map.putAll(i64.a());
    }

    private Map<String, String> buildExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f49e9f63", new Object[]{this});
        }
        HashMap hashMap = new HashMap();
        hashMap.putAll(this.mQueryParams.e());
        hashMap.put("item_id", getItemId());
        Application d = mr7.d();
        appendCommonParams(d, hashMap);
        appendBizParams(d, hashMap);
        return hashMap;
    }

    private void setCpuInfo(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77863ea", new Object[]{this, map});
            return;
        }
        sw4.d b = sw4.b();
        map.put(CPU_CORE, b.f28312a);
        map.put(CPU_MAX_HZ, b.b);
    }

    private void setupPositionInfo(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6f575ad8", new Object[]{this, context, map});
            return;
        }
        map.put("longitude", b5m.I().b(context));
        map.put("latitude", b5m.I().c(context));
        String a2 = b5m.I().a(context);
        if (a2 != null) {
            map.put(COUNTRY_CODE, a2);
        }
    }

    public String getDetailToken() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e5d35747", new Object[]{this});
        }
        return this.mQueryParams.b();
    }

    public Map<String, String> getExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("5151964b", new Object[]{this});
        }
        return this.mExParams;
    }

    public String getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("beb1faf5", new Object[]{this});
        }
        return this.mQueryParams.d();
    }

    public boolean isUseBundleAdjust() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fda610d9", new Object[]{this})).booleanValue();
        }
        return this.mUseBundleAdjust;
    }

    public boolean isUseMtopPost() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("931fafb0", new Object[]{this})).booleanValue();
        }
        return this.mUseMtopPost;
    }

    public void removeUselessExParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a2fb8bc", new Object[]{this});
        } else {
            this.mExParams.remove("detailRequestId");
        }
    }

    public void setUseBundleAdjust(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fde69fd7", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseBundleAdjust = z;
        }
    }

    public void setUseMtopPost(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72c337e0", new Object[]{this, new Boolean(z)});
        } else {
            this.mUseMtopPost = z;
        }
    }

    @Override // com.taobao.android.detail.ttdetail.request.params.MtopRequestParams
    public String toData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("add28f54", new Object[]{this});
        }
        removeUselessExParams();
        return JSON.toJSONString(buildParams());
    }

    public void updateRefreshParams(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a88f7726", new Object[]{this, map});
        } else if (map != null && !map.isEmpty()) {
            this.mExParams.putAll(map);
        }
    }

    public MainRequestParams(h8n h8nVar) {
        this.mUseBundleAdjust = false;
        this.mUseMtopPost = false;
        this.mQueryParams = h8nVar;
        this.mExParams = buildExParams();
    }

    public Map<String, String> buildParams() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("dac8310", new Object[]{this});
        }
        String itemId = getItemId();
        String str = this.mExParams.get("detail_item_id");
        if (str != null) {
            itemId = str;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("detail_v", "3.3.2");
        if (itemId != null) {
            hashMap.put(K_ITEM_ID, itemId);
        }
        if (this.mExParams.isEmpty()) {
            return hashMap;
        }
        try {
            this.mExParams.put(r4p.KEY_LOC_TYPE, JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString(r4p.KEY_LOC_TYPE));
        } catch (Exception unused) {
        }
        try {
            this.mExParams.put("pvStr", JSON.parseObject(String.valueOf(this.mExParams.get("params"))).getString("pvStr"));
        } catch (Exception unused2) {
        }
        this.mExParams.put("item_id", itemId);
        if (vbl.r()) {
            wb4.a aVar = wb4.ComponentFatigueContainer;
            aVar.m(true);
            long currentTimeMillis = System.currentTimeMillis();
            String e = aVar.e(getDetailToken());
            if (!TextUtils.isEmpty(e)) {
                this.mExParams.put("fatigue", e);
            }
            PerformanceUtils.m(getDetailToken(), wb4.GENERATE_FATIGUE_PARAMS_COST, System.currentTimeMillis() - currentTimeMillis);
        } else {
            wb4.ComponentFatigueContainer.m(false);
        }
        hashMap.put("exParams", JSON.toJSONString(this.mExParams));
        return hashMap;
    }
}
