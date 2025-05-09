package com.taobao.tao.channel;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.alibaba.fastjson.JSON;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.task.Coordinator;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.globalmodel.TBShareContent;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.statistic.TBS;
import com.taobao.tao.channel.a;
import com.taobao.tao.channel.mtop.GetNewBizConfigRequest;
import com.taobao.tao.channel.mtop.GetPanelInfoResponse;
import com.taobao.tao.channel.mtop.GetPanelInfoResponseData;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.tao.util.SpUtils;
import com.taobao.taobao.R;
import com.ut.share.business.ShareBusiness;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import mtopsdk.mtop.common.MtopListener;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.IMTOPDataObject;
import mtopsdk.mtop.domain.MtopResponse;
import tb.bwr;
import tb.fwr;
import tb.kip;
import tb.kkp;
import tb.li3;
import tb.ma4;
import tb.mi3;
import tb.mip;
import tb.rip;
import tb.t2o;
import tb.vi3;
import tb.xjp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ChannelProvider implements a.c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHANNEL_LIST_KEY = "channelList";
    public static final String TOOL_LIST_KEY = "toolList";

    /* renamed from: a  reason: collision with root package name */
    public List<ma4> f11920a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                SpUtils.clearMtopCacheData();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ TBShareContent f11922a;
        public final /* synthetic */ String b;

        public b(TBShareContent tBShareContent, String str) {
            this.f11922a = tBShareContent;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            SpUtils.saveCacheData(this.f11922a.businessId, this.b, String.valueOf(System.currentTimeMillis()));
            SpUtils.saveCacheVerison(kip.b());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public interface c {
        void onConfigData(TBShareContent tBShareContent, li3 li3Var, String str, int i, boolean z, String str2, String str3, String str4);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public static final ChannelProvider f11923a = new ChannelProvider(null);

        static {
            t2o.a(666894374);
        }

        public static /* synthetic */ ChannelProvider a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ChannelProvider) ipChange.ipc$dispatch("2a58965", new Object[0]);
            }
            return f11923a;
        }
    }

    static {
        t2o.a(666894369);
        t2o.a(666894378);
    }

    public /* synthetic */ ChannelProvider(a aVar) {
        this();
    }

    public static ChannelProvider n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChannelProvider) ipChange.ipc$dispatch("6b392d01", new Object[0]);
        }
        return d.a();
    }

    public final boolean a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2c7fe45b", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String l = kip.l();
        if (!l.contains(",")) {
            return l.equals(str);
        }
        for (String str2 : l.split(",")) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public List<ma4> b(List<vi3> list, rip ripVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b440325b", new Object[]{this, list, ripVar});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (vi3 vi3Var : list) {
            mi3 mi3Var = new mi3();
            mi3Var.h(vi3Var);
            mi3Var.d(ripVar);
            mi3Var.e(vi3Var.k());
            mi3Var.f(ComponentType.CHANNEL_ITEM);
            arrayList.add(mi3Var);
        }
        return arrayList;
    }

    public List<ma4> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("d55e52f7", new Object[]{this});
        }
        return this.f11920a;
    }

    public List<ma4> d(List<vi3> list, rip ripVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("9878e7de", new Object[]{this, list, ripVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        List<ma4> e = e(list, ripVar, z);
        List<ma4> k = k(list, ripVar, z);
        if (k != null && k.size() > 0) {
            arrayList.addAll(k);
        }
        if (e != null && e.size() > 0) {
            arrayList.addAll(e);
        }
        return arrayList;
    }

    public List<ma4> e(List<vi3> list, rip ripVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c697533d", new Object[]{this, list, ripVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        TBShareContent e = bwr.h().e();
        for (vi3 vi3Var : list) {
            if (!vi3Var.l()) {
                mi3 mi3Var = new mi3();
                mi3Var.h(vi3Var);
                mi3Var.d(ripVar);
                mi3Var.e(vi3Var.k());
                mi3Var.f(ComponentType.CHANNEL_ITEM);
                arrayList.add(mi3Var);
                if (z && e != null) {
                    String str = e.businessId;
                    TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Channel_expose", str, null, vi3Var.k() + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId());
                }
            }
        }
        return arrayList;
    }

    public Map<String, List<ChannelInfo>> f(List<vi3> list, rip ripVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("76b19b4e", new Object[]{this, list, ripVar});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (vi3 vi3Var : list) {
            if (!TextUtils.isEmpty(vi3Var.e())) {
                ChannelInfo channelInfo = new ChannelInfo();
                channelInfo.setType(vi3Var.k());
                channelInfo.setTitle(vi3Var.g());
                channelInfo.setIcon(vi3Var.e());
                channelInfo.setMark(vi3Var.f());
                if (!vi3Var.l()) {
                    arrayList.add(channelInfo);
                } else {
                    mi3 mi3Var = new mi3();
                    mi3Var.h(vi3Var);
                    mi3Var.d(ripVar);
                    mi3Var.e(vi3Var.k());
                    mi3Var.f(ComponentType.CHANNEL_ITEM);
                    if (o(mi3Var)) {
                        arrayList2.add(channelInfo);
                    }
                }
            }
        }
        HashMap hashMap = new HashMap();
        hashMap.put(CHANNEL_LIST_KEY, arrayList);
        hashMap.put(TOOL_LIST_KEY, arrayList2);
        return hashMap;
    }

    public final void g(TBShareContent tBShareContent, li3 li3Var, c cVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c9e1a7f1", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        String cacheShareData = SpUtils.getCacheShareData(tBShareContent.businessId);
        if (!TextUtils.isEmpty(cacheShareData)) {
            com.taobao.tao.channel.a.d().g(tBShareContent, li3Var, cVar, z, z2, true, cacheShareData);
        } else {
            h(tBShareContent, li3Var, cVar, z, z2);
        }
    }

    public void h(final TBShareContent tBShareContent, final li3 li3Var, final c cVar, final boolean z, final boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5f32a392", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2)});
            return;
        }
        GetNewBizConfigRequest getNewBizConfigRequest = new GetNewBizConfigRequest();
        if (tBShareContent != null) {
            getNewBizConfigRequest.setBizCode(tBShareContent.businessId);
            getNewBizConfigRequest.setTargetUrl(tBShareContent.url);
        }
        RemoteBusiness.build((IMTOPDataObject) getNewBizConfigRequest, ShareBizAdapter.getInstance().getAppEnv().getTTID()).registeListener((MtopListener) new IRemoteBaseListener() { // from class: com.taobao.tao.channel.ChannelProvider.2
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    com.taobao.tao.channel.a.d().g(tBShareContent, li3Var, cVar, z, z2, false, null);
                }
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteListener
            public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                String str;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    return;
                }
                if (mtopResponse.getDataJsonObject() != null) {
                    str = mtopResponse.getDataJsonObject().toString();
                } else {
                    str = "";
                }
                com.taobao.tao.channel.a.d().g(tBShareContent, li3Var, cVar, z, z2, false, str);
            }

            @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
            public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                } else {
                    com.taobao.tao.channel.a.d().g(tBShareContent, li3Var, cVar, z, z2, false, null);
                }
            }
        }).startRequest(GetPanelInfoResponse.class);
    }

    public void i(TBShareContent tBShareContent, li3 li3Var, c cVar, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b31511b", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2)});
        } else if (tBShareContent != null) {
            ShareBusiness.sShareUTArgs.put(ShareBusiness.BIZ_CONFIG_START_KEY, (Object) Long.valueOf(System.currentTimeMillis()));
            String c2 = kip.c(tBShareContent.businessId);
            if (!TextUtils.isEmpty(c2)) {
                com.taobao.tao.channel.a.d().g(tBShareContent, li3Var, cVar, z, z2, true, c2);
                return;
            }
            boolean a2 = a(tBShareContent.businessId);
            if (mip.n() && (kip.z() || a2)) {
                if (!SpUtils.getCacheVerison().equals(kip.b())) {
                    Coordinator.execute(new a());
                    h(tBShareContent, li3Var, cVar, z, z2);
                    return;
                }
                String cacheDataValidTime = SpUtils.getCacheDataValidTime(tBShareContent.businessId);
                if (!TextUtils.isEmpty(cacheDataValidTime)) {
                    try {
                        if (System.currentTimeMillis() - Long.parseLong(cacheDataValidTime) <= kip.g()) {
                            g(tBShareContent, li3Var, cVar, z, z2);
                            return;
                        }
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                }
            }
            h(tBShareContent, li3Var, cVar, z, z2);
        }
    }

    public List<ma4> k(List<vi3> list, rip ripVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("2317fd1c", new Object[]{this, list, ripVar, new Boolean(z)});
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        TBShareContent e = bwr.h().e();
        for (vi3 vi3Var : list) {
            if (vi3Var.l()) {
                mi3 mi3Var = new mi3();
                mi3Var.h(vi3Var);
                mi3Var.d(ripVar);
                mi3Var.e(vi3Var.k());
                mi3Var.f(ComponentType.CHANNEL_ITEM);
                if (o(mi3Var)) {
                    arrayList.add(mi3Var);
                    if (z && e != null) {
                        String str = e.businessId;
                        TBS.Ext.commitEvent("Page_Share", 19999, "Page_Share_Tool_expose", str, null, vi3Var.k() + "," + e.templateId + "," + ShareBizAdapter.getInstance().getLogin().getUserId());
                    }
                }
            }
        }
        return arrayList;
    }

    public void l(TBShareContent tBShareContent, li3 li3Var, c cVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9c76e7", new Object[]{this, tBShareContent, li3Var, cVar});
        } else if (tBShareContent != null) {
            li3Var.j(tBShareContent);
            tBShareContent.templateId = "common";
            boolean p = Localization.p();
            if (!Localization.p()) {
                li3Var.e();
            }
            cVar.onConfigData(tBShareContent, li3Var, "", 1, p, "2", "2", null);
            AppMonitor.Alarm.commitFail("share", "getbizconfig", "SHARE_GETBIZCONFIG_FAILED", Localization.q(R.string.taobao_app_1010_1_17870), tBShareContent.businessId);
            fwr.b("ChannelProvider", "GetNewBizConfigRequest onError | onSystemError");
        }
    }

    public void p(List<ma4> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7037534d", new Object[]{this, list});
        } else {
            this.f11920a = list;
        }
    }

    public ChannelProvider() {
    }

    public void j(TBShareContent tBShareContent, c cVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0b2218a", new Object[]{this, tBShareContent, cVar, new Boolean(z)});
            return;
        }
        kkp.e().a(kkp.KEY_SHAREPANELGETSHARECONFIGSTART);
        li3 li3Var = new li3();
        li3Var.b(true);
        String str = tBShareContent.templateId;
        if (str == null || TextUtils.isEmpty(str)) {
            tBShareContent.templateId = "common";
        }
        com.taobao.tao.channel.a.d().h();
        com.taobao.tao.channel.a.d().i(this);
        com.taobao.tao.channel.a.d().f(tBShareContent, li3Var, cVar, z);
    }

    public final boolean o(mi3 mi3Var) {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e893f90c", new Object[]{this, mi3Var})).booleanValue();
        }
        vi3 g = mi3Var.g();
        TBShareContent e = bwr.h().e();
        if (TextUtils.equals("video", g.k())) {
            return false;
        }
        if (!TextUtils.equals("saveVideo", g.k())) {
            return xjp.b().d(mi3Var);
        }
        if (e == null || (map = e.extraParams) == null || !TextUtils.equals("true", map.get("isMarvelScheme"))) {
            return false;
        }
        return xjp.b().d(mi3Var);
    }

    public void m(TBShareContent tBShareContent, li3 li3Var, c cVar, boolean z, boolean z2, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cb5faac", new Object[]{this, tBShareContent, li3Var, cVar, new Boolean(z), new Boolean(z2), str});
            return;
        }
        GetPanelInfoResponseData getPanelInfoResponseData = (GetPanelInfoResponseData) JSON.parseObject(str, GetPanelInfoResponseData.class);
        if (tBShareContent != null && getPanelInfoResponseData != null) {
            li3Var.j(tBShareContent);
            bwr.h().w(bwr.GETBIZCONFIG, getPanelInfoResponseData.shareDataTrack);
            tBShareContent.templateId = getPanelInfoResponseData.getTemplateId();
            tBShareContent.openMultiTargetUrl = getPanelInfoResponseData.getOpenMultiTargetUrl();
            li3Var.d(tBShareContent.markMap, getPanelInfoResponseData.getChannelList(), getPanelInfoResponseData.getToolList(), z);
            cVar.onConfigData(tBShareContent, li3Var, str, getPanelInfoResponseData.getPanelType(), getPanelInfoResponseData.getShowFriend(), getPanelInfoResponseData.getShowFriendType(), getPanelInfoResponseData.getShowChannelType(), getPanelInfoResponseData.getActivityUrl());
            if (z2) {
                AppMonitor.Alarm.commitSuccess("share", "getbizconfigbycache", tBShareContent.businessId);
                return;
            }
            AppMonitor.Alarm.commitSuccess("share", "getbizconfig", tBShareContent.businessId);
            Coordinator.execute(new b(tBShareContent, str));
        }
    }
}
