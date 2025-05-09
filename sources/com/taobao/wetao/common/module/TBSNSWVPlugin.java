package com.taobao.wetao.common.module;

import android.os.Vibrator;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import org.json.JSONException;
import tb.kpw;
import tb.od0;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TBSNSWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String REAL_TIME_TRACE = "realTimeTrace";
    private final String GUANGGUANG_IMPACTFEEDBACK = "impactFeedback";
    private final String GUANGGUANG_PLAYSOUND = "playSound";

    public static /* synthetic */ Object ipc$super(TBSNSWVPlugin tBSNSWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wetao/common/module/TBSNSWVPlugin");
    }

    private void realTimeTrace(String str, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7db2948", new Object[]{this, str, wVCallBackContext});
        } else if (TextUtils.isEmpty(str)) {
            wVCallBackContext.error("params null");
        } else {
            JSONObject parseObject = JSON.parseObject(str);
            String string = parseObject.getString("pageName");
            String string2 = parseObject.getString("arg1");
            String string3 = parseObject.getString("arg2");
            String string4 = parseObject.getString("arg3");
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3) || TextUtils.isEmpty(string4)) {
                wVCallBackContext.error("params empty");
                return;
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("pageName", (Object) string);
            jSONObject.put(PopConst.POP_EVENT_ID_KEY, (Object) 19997);
            jSONObject.put("arg1", (Object) string2);
            jSONObject.put("arg2", (Object) string3);
            jSONObject.put("arg3", (Object) string4);
            jSONObject.put("args", (Object) parseObject.getJSONObject("args"));
            TrackerModule.commit(new d.j(null, jSONObject, null), false);
            wVCallBackContext.success();
        }
    }

    private boolean playSound(String str) {
        String optString;
        String optString2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d03f3a90", new Object[]{this, str})).booleanValue();
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            optString = jSONObject.optString("type");
            optString2 = jSONObject.optString("url");
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.isEmpty(optString) || !TextUtils.isDigitsOnly(optString)) {
            if (!TextUtils.isEmpty(optString2)) {
                od0.D().y().a(optString2);
                return true;
            }
            return false;
        }
        od0.D().y().b(Integer.valueOf(optString).intValue());
        return true;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("playSound".equals(str)) {
            return playSound(str2);
        }
        if ("impactFeedback".equals(str)) {
            return impactFeedback(str2);
        }
        if (!REAL_TIME_TRACE.equals(str)) {
            return false;
        }
        realTimeTrace(str2, wVCallBackContext);
        return true;
    }

    private boolean impactFeedback(String str) {
        char c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("48d4f40", new Object[]{this, str})).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Vibrator vibrator = (Vibrator) this.mContext.getSystemService("vibrator");
        try {
            String optString = new org.json.JSONObject(str).optString("type");
            if (TextUtils.isEmpty(optString)) {
                optString = "light";
            }
            switch (optString.hashCode()) {
                case -1078030475:
                    if (optString.equals("medium")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 3535914:
                    if (optString.equals("soft")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 99152071:
                    if (optString.equals("heavy")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 102970646:
                    if (optString.equals("light")) {
                        c = 0;
                        break;
                    }
                    c = 65535;
                    break;
                case 108511787:
                    if (optString.equals("rigid")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            int i = 60;
            if (c != 0) {
                if (c == 1) {
                    i = 90;
                } else if (c == 2) {
                    i = 120;
                } else if (c == 3) {
                    i = 150;
                } else if (c == 4) {
                    i = 180;
                }
            }
            vibrator.vibrate(i);
            return true;
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }
}
