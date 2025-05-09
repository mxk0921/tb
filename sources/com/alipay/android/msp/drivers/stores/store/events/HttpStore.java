package com.alipay.android.msp.drivers.stores.store.events;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspNetConstants;
import com.alipay.android.msp.core.context.MspTradeContext;
import com.alipay.android.msp.drivers.stores.store.LocalEventStore;
import com.alipay.android.msp.framework.statisticsv2.model.StEvent;
import com.alipay.android.msp.network.model.ResData;
import com.alipay.android.msp.pay.TradeLogicData;
import com.alipay.android.msp.plugin.manager.PluginManager;
import com.alipay.android.msp.utils.net.LdcUtils;
import com.alipay.android.msp.utils.net.LogicHeaderUtil;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import org.apache.http.Header;
import org.apache.http.message.BasicHeader;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class HttpStore extends LocalEventStore {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final HashMap<String, String> f3574a = new HashMap<>();

    public HttpStore(int i) {
        super(i);
    }

    public static Map<String, String> b(List<Header> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("71436bce", new Object[]{list});
        }
        HashMap hashMap = new HashMap(list.size());
        for (Header header : list) {
            hashMap.put(header.getName(), header.getValue());
        }
        return hashMap;
    }

    public static /* synthetic */ Object ipc$super(HttpStore httpStore, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alipay/android/msp/drivers/stores/store/events/HttpStore");
    }

    public final ResData a(JSONObject jSONObject, int i) throws Exception {
        String str;
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ResData) ipChange.ipc$dispatch("98590123", new Object[]{this, jSONObject, new Integer(i)});
        }
        Object obj = null;
        JSONObject jSONObject2 = jSONObject.containsKey("header") ? jSONObject.getJSONObject("header") : null;
        if (jSONObject2 == null) {
            jSONObject2 = new JSONObject();
        }
        if (jSONObject.containsKey(AgooConstants.MESSAGE_BODY)) {
            obj = jSONObject.get(AgooConstants.MESSAGE_BODY);
        }
        if (obj == null) {
            obj = new JSONObject();
        }
        e(obj.toString());
        for (String str3 : jSONObject2.keySet()) {
            this.f3574a.put(str3, jSONObject2.getString(str3));
        }
        if (jSONObject.containsKey("url")) {
            str = jSONObject.getString("url");
        } else {
            str = "https://mobilegw.alipay.com/mgw.htm";
        }
        if (this.f3574a.containsKey("Content-Type")) {
            str2 = this.f3574a.get("Content-Type");
        } else {
            str2 = "application/json;charset=utf-8";
        }
        this.mStEvent.onStatistic("action", "http|".concat(String.valueOf(str)));
        StEvent stEvent = this.mStEvent;
        StringBuilder sb = new StringBuilder();
        sb.append(obj.toString().length());
        stEvent.onStatistic(StEvent.SEND_MSG, sb.toString());
        ResData<byte[]> requestData = PluginManager.getTransChannel().requestData(obj.toString().getBytes(), str2, str, d(), i);
        StEvent stEvent2 = this.mStEvent;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(requestData.getLength());
        stEvent2.onStatistic(StEvent.RECV_MSG, sb2.toString());
        this.mStEvent.onStatistic(StEvent.SERVER_COST, "0");
        return requestData;
    }

    public final List<Header> d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("19344190", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList(this.f3574a.keySet().size());
        for (String str : this.f3574a.keySet()) {
            arrayList.add(new BasicHeader(str, this.f3574a.get(str)));
        }
        return arrayList;
    }

    public final void e(String str) {
        TradeLogicData tradeLogicData;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23c7e1fd", new Object[]{this, str});
            return;
        }
        for (Header header : LogicHeaderUtil.generateDefaultHeaders()) {
            this.f3574a.put(header.getName(), header.getValue());
        }
        MspTradeContext mspTradeContext = this.mMspTradeContext;
        if (!(mspTradeContext == null || (tradeLogicData = mspTradeContext.getTradeLogicData()) == null)) {
            this.f3574a.put(MspNetConstants.Request.MSP_PARAM, LdcUtils.getMspParams(tradeLogicData, str));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[Catch: all -> 0x0034, TryCatch #0 {all -> 0x0034, blocks: (B:7:0x0024, B:10:0x002d, B:15:0x0036, B:19:0x003e, B:20:0x0042, B:22:0x0048, B:24:0x0052, B:25:0x005b), top: B:29:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.alibaba.fastjson.JSONObject[] c(com.alibaba.fastjson.JSONObject r8) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = "action"
            java.lang.String r3 = "param"
            com.android.alibaba.ip.runtime.IpChange r4 = com.alipay.android.msp.drivers.stores.store.events.HttpStore.$ipChange
            boolean r5 = r4 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r5 == 0) goto L_0x001a
            java.lang.String r2 = "70db3d89"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r8
            java.lang.Object r8 = r4.ipc$dispatch(r2, r1)
            com.alibaba.fastjson.JSONObject[] r8 = (com.alibaba.fastjson.JSONObject[]) r8
            return r8
        L_0x001a:
            com.alibaba.fastjson.JSONObject r4 = new com.alibaba.fastjson.JSONObject
            r4.<init>()
            com.alibaba.fastjson.JSONObject r5 = new com.alibaba.fastjson.JSONObject
            r5.<init>()
            boolean r6 = r8.containsKey(r3)     // Catch: all -> 0x0034
            java.lang.String r7 = "params"
            if (r6 != 0) goto L_0x0036
            boolean r6 = r8.containsKey(r7)     // Catch: all -> 0x0034
            if (r6 == 0) goto L_0x0042
            goto L_0x0036
        L_0x0034:
            r8 = move-exception
            goto L_0x0060
        L_0x0036:
            boolean r6 = r8.containsKey(r3)     // Catch: all -> 0x0034
            if (r6 == 0) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r3 = r7
        L_0x003e:
            com.alibaba.fastjson.JSONObject r4 = r8.getJSONObject(r3)     // Catch: all -> 0x0034
        L_0x0042:
            boolean r3 = r8.containsKey(r2)     // Catch: all -> 0x0034
            if (r3 == 0) goto L_0x0063
            com.alibaba.fastjson.JSONObject r3 = r8.getJSONObject(r2)     // Catch: all -> 0x0034
            boolean r6 = r3.containsKey(r7)     // Catch: all -> 0x0034
            if (r6 == 0) goto L_0x005b
            com.alibaba.fastjson.JSONObject r3 = r3.getJSONObject(r7)     // Catch: all -> 0x0034
            com.alibaba.fastjson.JSONObject r3 = com.alipay.android.msp.utils.JsonUtil.merge(r4, r3)     // Catch: all -> 0x0034
            r4 = r3
        L_0x005b:
            com.alibaba.fastjson.JSONObject r5 = r8.getJSONObject(r2)     // Catch: all -> 0x0034
            goto L_0x0063
        L_0x0060:
            com.alipay.android.msp.utils.LogUtil.printExceptionStackTrace(r8)
        L_0x0063:
            r8 = 2
            com.alibaba.fastjson.JSONObject[] r8 = new com.alibaba.fastjson.JSONObject[r8]
            r8[r0] = r4
            r8[r1] = r5
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.HttpStore.c(com.alibaba.fastjson.JSONObject):com.alibaba.fastjson.JSONObject[]");
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x0171 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.alipay.android.msp.drivers.stores.store.LocalEventStore
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String onMspAction(com.alipay.android.msp.drivers.actions.EventAction r14, com.alipay.android.msp.drivers.actions.EventAction.MspEvent r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.android.msp.drivers.stores.store.events.HttpStore.onMspAction(com.alipay.android.msp.drivers.actions.EventAction, com.alipay.android.msp.drivers.actions.EventAction$MspEvent):java.lang.String");
    }
}
