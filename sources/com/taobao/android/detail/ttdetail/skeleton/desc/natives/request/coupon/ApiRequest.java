package com.taobao.android.detail.ttdetail.skeleton.desc.natives.request.coupon;

import anetwork.channel.Response;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.taobao.android.detail.ttdetail.skeleton.desc.natives.structure.Unit;
import com.taobao.message.message_open_api.ICallService;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.MtopRequest;
import tb.aov;
import tb.ar3;
import tb.t2o;
import tb.xs4;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class ApiRequest extends MtopRequest {
    public String httpUrl;
    public boolean post;
    public Map<String, Object> queryData;
    public Response response;
    public boolean wua;

    static {
        t2o.a(912262452);
    }

    public ApiRequest() {
        setNeedSession(true);
        setApiName("wdetail");
        setVersion("1.0");
    }

    private Map<String, String> appendOriginalQuery(Map<String, String> map, Map<String, String> map2) {
        if (map2 == null || map2.isEmpty()) {
            return map;
        }
        HashMap hashMap = new HashMap(map2);
        if (ar3.d(map)) {
            return hashMap;
        }
        hashMap.putAll(map);
        return hashMap;
    }

    private void setDataString() {
        Map<String, Object> map = this.queryData;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.queryData.get(str);
                if (!(obj instanceof String)) {
                    this.queryData.put(str, JSON.toJSONString(obj));
                }
            }
            setData(JSON.toJSONString(this.queryData));
        }
    }

    public ApiRequest(Unit unit, Map<String, String> map) {
        this(unit, map, true);
    }

    public ApiRequest(Unit unit, Map<String, String> map, boolean z) {
        if ("http".equals(unit.name)) {
            String str = unit.value;
            this.httpUrl = z ? aov.b(str, map) : str;
            return;
        }
        JSONObject parseObject = JSON.parseObject(unit.value);
        if (parseObject != null) {
            setApiName(xs4.b(parseObject.get("API_NAME")));
            parseObject.remove("API_NAME");
            setVersion(xs4.b(parseObject.get("VERSION")));
            parseObject.remove("VERSION");
            setNeedSession("true".equals(xs4.b(parseObject.get(ICallService.KEY_NEED_LOGIN))));
            parseObject.remove(ICallService.KEY_NEED_LOGIN);
            setNeedEcode("true".equals(xs4.b(parseObject.get(ICallService.KEY_NEED_ECODE))));
            parseObject.remove(ICallService.KEY_NEED_ECODE);
            this.wua = "true".equals(xs4.b(parseObject.get("wua")));
            this.queryData = new HashMap();
            for (String str2 : parseObject.keySet()) {
                this.queryData.put(str2, parseObject.get(str2));
            }
            String b = xs4.b(this.queryData.get("params"));
            if (!ar3.b(b)) {
                setData(b);
                return;
            }
            String b2 = xs4.b(this.queryData.get("exParams"));
            if (!ar3.b(b2)) {
                JSONObject parseObject2 = JSON.parseObject(b2);
                HashMap hashMap = new HashMap();
                for (String str3 : parseObject2.keySet()) {
                    hashMap.put(str3, xs4.b(parseObject2.get(str3)));
                }
                this.queryData.put("exParams", appendOriginalQuery(hashMap, map));
            }
            setDataString();
        }
    }
}
