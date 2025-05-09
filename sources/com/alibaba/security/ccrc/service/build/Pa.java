package com.alibaba.security.ccrc.service.build;

import com.alibaba.security.ccrc.common.util.JsonUtils;
import com.alibaba.security.ccrc.service.build.C1174ka;
import com.alibaba.security.client.smart.core.core.WukongBhNativeParser;
import com.alibaba.security.client.smart.core.model.BxParseResult;
import com.alibaba.security.client.smart.core.track.TrackManager;
import com.alibaba.security.client.smart.core.track.model.TrackLog;
import com.alibaba.security.wukong.bx.algo.BxData;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class Pa implements Na {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;

    /* renamed from: a  reason: collision with root package name */
    public static final String f2568a = "UpdatedBhDataParser";
    public final C1199x b;
    public final WukongBhNativeParser c = new WukongBhNativeParser();

    public Pa(C1199x xVar) {
        this.b = xVar;
    }

    private boolean b(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("39066b4a", new Object[]{this, map, str})).booleanValue();
        }
        if (!map.containsKey("ccrcCode") || map.get("ccrcCode") == null || !map.get("ccrcCode").equals(str)) {
            return false;
        }
        return true;
    }

    @Override // com.alibaba.security.ccrc.service.build.Na
    public BxData.a a(Map<String, Object> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BxData.a) ipChange.ipc$dispatch("2d37b458", new Object[]{this, map, str});
        }
        if (!b(map, this.b.getCcrcCode())) {
            return BxData.a.a(-2, "Not belongs to current scene", null);
        }
        return a(str);
    }

    private BxData.a a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BxData.a) ipChange.ipc$dispatch("e6963cad", new Object[]{this, str});
        }
        BxData.a aVar = new BxData.a();
        long currentTimeMillis = System.currentTimeMillis();
        BxParseResult a2 = this.c.a(this.b.g(), str);
        if (a2 == null) {
            return null;
        }
        aVar.h = a2.isParseSuccess;
        aVar.f = a2.errorMessage;
        aVar.i = str;
        aVar.e = JsonUtils.toMap(a2.parseResult);
        a(this.b.d(), this.b.getCcrcCode(), a2.isParseSuccess, a2.errorMessage, a2.parseResult, System.currentTimeMillis() - currentTimeMillis);
        return aVar;
    }

    private void a(String str, String str2, boolean z, String str3, String str4, long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1f1b658", new Object[]{this, str, str2, new Boolean(z), str3, str4, new Long(j)});
            return;
        }
        TrackLog.Builder operation = TrackLog.newBuilder().setpId(str).setCcrcCode(str2).setPhase(C1174ka.b.f).setOperation("end");
        if (!z) {
            i = -1;
        }
        TrackManager.track(operation.setStatus(i).addParam("costTime", Long.valueOf(j)).addParam("errorMsg", str3).addParam("parseResult", str4).build());
    }
}
