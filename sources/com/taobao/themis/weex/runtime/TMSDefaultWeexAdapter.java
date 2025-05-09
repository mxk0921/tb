package com.taobao.themis.weex.runtime;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex.WeexInstance;
import com.taobao.android.weex.b;
import com.taobao.android.weex_framework.a;
import com.taobao.themis.kernel.adapter.IWeexAdapter;
import com.taobao.themis.kernel.page.ITMSPage;
import java.util.HashMap;
import tb.ckf;
import tb.kdb;
import tb.ocs;
import tb.qcs;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class TMSDefaultWeexAdapter implements IWeexAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(851443722);
        t2o.a(839909491);
    }

    @Override // com.taobao.themis.kernel.adapter.IWeexAdapter
    public String getHttpAcceptHeader() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6eef4b06", new Object[]{this});
        }
        String httpAcceptHeader = b.d().getHttpAcceptHeader();
        ckf.f(httpAcceptHeader, "engine().httpAcceptHeader");
        return httpAcceptHeader;
    }

    @Override // com.taobao.themis.kernel.adapter.IWeexAdapter
    public ITMSPage getTMSPageFromIAbilityContext(kdb kdbVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITMSPage) ipChange.ipc$dispatch("fceb38fe", new Object[]{this, kdbVar});
        }
        ckf.g(kdbVar, "abilityContext");
        Object userContext = kdbVar.getUserContext();
        HashMap hashMap = userContext instanceof HashMap ? (HashMap) userContext : null;
        Object obj = hashMap == null ? null : hashMap.get("instance");
        if (obj instanceof a) {
            Object tag = ((a) obj).getTag("themis_page");
            if (tag instanceof ITMSPage) {
                return (ITMSPage) tag;
            }
            return null;
        } else if (!(obj instanceof WeexInstance)) {
            return null;
        } else {
            Object tag2 = ((WeexInstance) obj).getTag("themis_page");
            if (tag2 instanceof ITMSPage) {
                return (ITMSPage) tag2;
            }
            return null;
        }
    }

    @Override // com.taobao.themis.kernel.adapter.IWeexAdapter
    public String getUserAgent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e170aa6b", new Object[]{this, str});
        }
        ckf.g(str, "userAgent");
        return str;
    }

    @Override // com.taobao.themis.kernel.adapter.IWeexAdapter
    public qcs getWeexRender(ITMSPage iTMSPage, ocs ocsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (qcs) ipChange.ipc$dispatch("8b7d773", new Object[]{this, iTMSPage, ocsVar});
        }
        ckf.g(iTMSPage, "page");
        ckf.g(ocsVar, "renderListener");
        return new TMSWeexRender(iTMSPage, ocsVar);
    }
}
