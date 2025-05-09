package com.alipay.android.msp.drivers.actions;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alipay.android.app.safepaylogv2.api.StatisticCollector;
import com.alipay.android.msp.drivers.actions.EventAction;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorCode;
import com.alipay.android.msp.framework.statisticsv2.value.ErrorType;
import com.alipay.android.msp.utils.JsonUtil;
import com.alipay.android.msp.utils.LogUtil;
import com.android.alibaba.ip.runtime.IpChange;
import java.net.URLDecoder;
import java.util.ArrayList;
import tb.f7l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class MspEventCreator {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static MspEventCreator f3564a;

    public static void a(JSONArray jSONArray, EventAction eventAction) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91d74ea1", new Object[]{jSONArray, eventAction});
        } else if (jSONArray != null) {
            for (int i = 0; i < jSONArray.size(); i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                b(jSONObject, jSONObject, eventAction);
            }
        }
    }

    public static MspEventCreator get() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MspEventCreator) ipChange.ipc$dispatch("86d17b7e", new Object[0]);
        }
        if (f3564a == null) {
            f3564a = new MspEventCreator();
        }
        return f3564a;
    }

    public EventAction createMspEvent(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventAction) ipChange.ipc$dispatch("8dab1354", new Object[]{this, str, jSONObject});
        }
        JSONArray jSONArray = null;
        if (jSONObject == null) {
            LogUtil.i("MspEventCreator", "createMspEvent", str + " json == null");
            return null;
        }
        EventAction eventAction = new EventAction();
        LogUtil.i("MspEventCreator", "createMspEvent", str + " " + eventAction.hashCode() + " " + eventAction.getType() + " " + jSONObject.toJSONString());
        eventAction.setActionData(jSONObject.toJSONString());
        if (jSONObject.containsKey("action")) {
            jSONObject2 = jSONObject.getJSONObject("action");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject.containsKey("actions")) {
            jSONArray = jSONObject.getJSONArray("actions");
        }
        if (jSONObject2 == null && jSONArray == null) {
            jSONObject2 = jSONObject;
        }
        try {
            if (jSONObject2 != null) {
                b(jSONObject, jSONObject2, eventAction);
            } else {
                a(jSONArray, eventAction);
            }
            StringBuilder sb = new StringBuilder();
            if (eventAction.getMspEvents() != null) {
                for (EventAction.MspEvent mspEvent : eventAction.getMspEvents()) {
                    sb.append(mspEvent.getActionName());
                    sb.append(",");
                }
            }
            LogUtil.i("MspEventCreator", "createMspEvent.parseFinish", eventAction.hashCode() + " " + eventAction.getType() + " mspEvents:" + sb.toString());
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return eventAction;
    }

    public EventAction createMspEventWithJsonString(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (EventAction) ipChange.ipc$dispatch("5a1c3221", new Object[]{this, str, str2});
        }
        try {
            JSONObject parseObject = JSON.parseObject(str2);
            String str3 = "";
            if (parseObject.containsKey("action")) {
                str3 = parseObject.toString();
            } else if (parseObject.containsKey("param")) {
                str3 = parseObject.getString("param");
            }
            if (TextUtils.isEmpty(str3)) {
                str3 = parseObject.toString();
            }
            JSONObject parseObject2 = JSON.parseObject(str3);
            if (parseObject2 != null) {
                return createMspEvent(str, parseObject2);
            }
            return null;
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
            return null;
        }
    }

    public static boolean d(EventAction.MspEvent mspEvent, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b3a0dab0", new Object[]{mspEvent, str})).booleanValue();
        }
        String substring = str.substring(0, str.indexOf(f7l.BRACKET_START_STR));
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        mspEvent.setActionName(substring);
        try {
            String substring2 = str.substring(str.indexOf(f7l.BRACKET_START_STR) + 1, str.length() - 1);
            if (!TextUtils.isEmpty(substring2)) {
                String trim = substring2.trim();
                if (trim.startsWith("'") && trim.endsWith("'")) {
                    String[] split = trim.substring(1, trim.length() - 1).split("'\\s*,\\s*'", -1);
                    String[] strArr = new String[split.length];
                    for (int i = 0; i < split.length; i++) {
                        String str2 = split[i];
                        if (str2 != null) {
                            strArr[i] = str2;
                        } else {
                            StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, ErrorCode.DEFAULT_JS_ACTION_NO_QUOTE, "name=".concat(str));
                        }
                    }
                    mspEvent.setActionParamsArray(strArr);
                    return true;
                }
                return false;
            }
        } catch (Exception e) {
            LogUtil.printExceptionStackTrace(e);
        }
        return false;
    }

    public static String[] e(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("85636488", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split(";");
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder(split[0]);
        arrayList.add(sb.toString());
        for (int i = 1; i < split.length; i++) {
            if (split[i].startsWith("loc:") || split[i].startsWith("/")) {
                arrayList.add(split[i]);
                sb = new StringBuilder(split[i]);
            } else {
                arrayList.set(arrayList.size() - 1, ((Object) sb) + ";" + split[i]);
                sb.append(";");
                sb.append(split[i]);
            }
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static void b(JSONObject jSONObject, JSONObject jSONObject2, EventAction eventAction) {
        EventAction.MspEvent[] mspEventArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3c103d79", new Object[]{jSONObject, jSONObject2, eventAction});
        } else if (jSONObject2 != null) {
            if (jSONObject2.containsKey("time")) {
                eventAction.setDelayTime(jSONObject2.getIntValue("time"));
            }
            if (jSONObject2.containsKey("neec")) {
                eventAction.setNetErrorCode(jSONObject2.getString("neec"));
            }
            if (jSONObject2.containsKey("name")) {
                String string = jSONObject2.getString("name");
                JSONObject jSONObject3 = jSONObject2.getJSONObject("params");
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                String[] e = e(string);
                if (e != null) {
                    mspEventArr = new EventAction.MspEvent[e.length];
                    for (int i = 0; i < e.length; i++) {
                        String str = e[i];
                        if (!TextUtils.isEmpty(str)) {
                            EventAction.MspEvent mspEvent = new EventAction.MspEvent();
                            mspEventArr[i] = mspEvent;
                            mspEvent.setActionParamsJson(jSONObject3);
                            if (!str.contains(f7l.BRACKET_START_STR) || !str.contains(f7l.BRACKET_END_STR)) {
                                if (str.startsWith("/") && str.split("/").length == 3) {
                                    str = "submit";
                                }
                                mspEventArr[i].setActionName(str);
                            } else if (!c(mspEventArr[i], str) && !d(mspEventArr[i], str)) {
                                StatisticCollector.addError(StatisticCollector.GLOBAL_AGENT, ErrorType.DEFAULT, "EventUnHandled", str);
                                LogUtil.e("MspEventCreator", "parseSingleMspCommand", "tempName unhandled=".concat(str));
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                mspEventArr = null;
            }
            if (jSONObject.containsKey("param") && mspEventArr != null) {
                for (EventAction.MspEvent mspEvent2 : mspEventArr) {
                    JSONObject merge = JsonUtil.merge(jSONObject.getJSONObject("param"), mspEvent2.getActionParamsJson());
                    if (merge.size() > 0) {
                        mspEvent2.setActionParamsJson(merge);
                    }
                }
            }
            if (mspEventArr != null) {
                eventAction.setMspEvents(mspEventArr);
            }
        }
    }

    public static boolean c(EventAction.MspEvent mspEvent, String str) {
        Throwable th;
        JSONObject parseObject;
        JSONObject parseObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6ba17c51", new Object[]{mspEvent, str})).booleanValue();
        }
        String substring = str.substring(0, str.indexOf(f7l.BRACKET_START_STR));
        if (TextUtils.isEmpty(substring)) {
            return false;
        }
        mspEvent.setActionName(substring);
        String str2 = null;
        JSONObject jSONObject = null;
        try {
            String substring2 = str.substring(str.indexOf("('") + 2, str.length() - 2);
            try {
                jSONObject = mspEvent.getActionParamsJson();
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                if ((!TextUtils.isEmpty(substring) && substring.contains(MspEventTypes.ACTION_STRING_RETURNDATA)) || (!TextUtils.isEmpty(substring) && substring.contains(MspEventTypes.ACTION_STRING_SHAREPAY))) {
                    substring2 = URLDecoder.decode(substring2, "UTF-8");
                }
                if (substring2 != null && substring2.startsWith("{") && substring2.endsWith("}") && (parseObject2 = JSON.parseObject(substring2)) != null) {
                    for (String str3 : parseObject2.keySet()) {
                        String obj = str3.toString();
                        jSONObject.put(obj, (Object) parseObject2.getString(obj));
                    }
                    mspEvent.setActionParamsJson(jSONObject);
                    return true;
                }
            } catch (Throwable th2) {
                th = th2;
                str2 = substring2;
                LogUtil.printExceptionStackTrace(th);
                if (!(str2 == null || jSONObject == null || !str2.startsWith("{") || !str2.endsWith("}") || (parseObject = JSON.parseObject(str2)) == null)) {
                    for (String str4 : parseObject.keySet()) {
                        String obj2 = str4.toString();
                        jSONObject.put(obj2, (Object) parseObject.getString(obj2));
                    }
                    mspEvent.setActionParamsJson(jSONObject);
                    return true;
                }
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            jSONObject = null;
        }
        return false;
    }
}
