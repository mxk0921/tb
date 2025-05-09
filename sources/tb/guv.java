package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ultron.common.model.IDMComponent;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class guv extends l6v {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(157286527);
    }

    public static /* synthetic */ Object ipc$super(guv guvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/event/UserTrackSubscriber");
    }

    @Override // tb.l6v
    public void t(b8v b8vVar) {
        int i;
        String str;
        String str2;
        Map<String, String> utParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("827a7510", new Object[]{this, b8vVar});
            return;
        }
        JSONObject fields = j().getFields();
        if (fields != null) {
            try {
                i = fields.getInteger("eventId").intValue();
            } catch (Exception unused) {
                i = -1;
            }
            if (i >= 0) {
                String string = fields.getString("page");
                if (!TextUtils.isEmpty(string)) {
                    String string2 = fields.getString("arg1");
                    String string3 = fields.getString("arg2");
                    String string4 = fields.getString("arg3");
                    String str3 = "";
                    String str4 = TextUtils.isEmpty(string3) ? str3 : string3;
                    if (!TextUtils.isEmpty(string4)) {
                        str3 = string4;
                    }
                    JSONObject jSONObject = fields.getJSONObject("args");
                    o5e n = b8vVar.n();
                    if (!(n == null || (utParams = n.getUtParams()) == null)) {
                        if (jSONObject == null) {
                            jSONObject = new JSONObject();
                        }
                        jSONObject.putAll(utParams);
                        if (b8vVar.d() != null) {
                            jSONObject.put("componentId", (Object) b8vVar.d().getKey());
                        }
                        UnifyLog.g("UserTrackSubscriber", "utPrams:" + JSON.toJSONString(utParams) + " args:" + jSONObject.toJSONString());
                    }
                    HashMap hashMap = new HashMap();
                    if (jSONObject != null) {
                        for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                            String key = entry.getKey();
                            Object value = entry.getValue();
                            if (!TextUtils.isEmpty(key) && value != null) {
                                IDMComponent iDMComponent = this.e;
                                if (iDMComponent != null) {
                                    str2 = String.valueOf(zr8.a(iDMComponent.getData(), value));
                                } else {
                                    str2 = String.valueOf(value);
                                }
                                hashMap.put(key, str2);
                            }
                        }
                    }
                    if (n != null) {
                        try {
                            if (n.h() != null) {
                                n.h().a(string, i, string2, str4, str3, hashMap);
                            }
                        } catch (Throwable th) {
                            lbq.c(this.d.getBizName(), "UserTrackSubscriber.onHandleEvent", th);
                        }
                    }
                    UTAnalytics.getInstance().getDefaultTracker().send(new UTOriginalCustomHitBuilder(string, i, string2, str4, str3, hashMap).build());
                }
                JSONObject jSONObject2 = fields.getJSONObject("nextPage");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2 != null) {
                    for (Map.Entry<String, Object> entry2 : jSONObject2.entrySet()) {
                        String key2 = entry2.getKey();
                        Object value2 = entry2.getValue();
                        if (!TextUtils.isEmpty(key2) && value2 != null) {
                            IDMComponent iDMComponent2 = this.e;
                            if (iDMComponent2 != null) {
                                str = String.valueOf(zr8.a(iDMComponent2.getData(), value2));
                            } else {
                                str = String.valueOf(value2);
                            }
                            hashMap2.put(key2, str);
                        }
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageProperties(hashMap2);
                    } catch (Throwable th2) {
                        UnifyLog.e("UserTrackSubscriber", th2.getMessage());
                    }
                    try {
                        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(JSON.toJSONString(hashMap2));
                    } catch (Throwable th3) {
                        UnifyLog.e("UserTrackSubscriber", th3.getMessage());
                    }
                }
            }
        }
    }
}
