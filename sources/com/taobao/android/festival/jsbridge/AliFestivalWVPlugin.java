package com.taobao.android.festival.jsbridge;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import java.util.HashMap;
import java.util.Map;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class AliFestivalWVPlugin extends kpw {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final Map<String, String> EMPTY_MAP = new HashMap(0);
    public static final String PARAMS_DEFAULT_VALUE = "defaultValue";
    public static final String PARAMS_KEY = "key";
    public static final String PARAMS_MODULE_NAME = "moduleName";

    static {
        t2o.a(464519225);
    }

    public static /* synthetic */ Object ipc$super(AliFestivalWVPlugin aliFestivalWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/festival/jsbridge/AliFestivalWVPlugin");
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        if ("getFestivalConfigByModule".equals(str)) {
            return getFestivalConfigByModule(str2, wVCallBackContext);
        }
        if ("getFestivalConfigByKey".equals(str)) {
            return getFestivalConfigByKey(str2, wVCallBackContext);
        }
        nsw nswVar = new nsw();
        nswVar.b("errorMsg", "no matched method");
        wVCallBackContext.error(nswVar);
        return false;
    }

    public boolean getFestivalConfigByKey(String str, WVCallBackContext wVCallBackContext) {
        String string;
        String string2;
        String string3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47cda9ea", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        if (TextUtils.isEmpty(str)) {
            nswVar.b("errorMsg", "empty params");
            wVCallBackContext.error(nswVar);
            return false;
        }
        try {
            JSONObject parseObject = JSON.parseObject(str);
            string = parseObject.getString(PARAMS_MODULE_NAME);
            string2 = parseObject.getString("key");
            string3 = parseObject.getString(PARAMS_DEFAULT_VALUE);
        } catch (Throwable unused) {
            nswVar.b("errorMsg", "empty params");
            wVCallBackContext.error(nswVar);
        }
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
            String f = FestivalMgr.i().f(string, string2);
            if (TextUtils.isEmpty(f)) {
                if (TextUtils.isEmpty(string3)) {
                    string3 = "";
                }
                nswVar.b(string2, string3);
            } else {
                nswVar.b(string2, f);
            }
            wVCallBackContext.success(nswVar);
            return false;
        }
        nswVar.b("errorMsg", "mo module name or config key");
        wVCallBackContext.error(nswVar);
        return false;
    }

    public boolean getFestivalConfigByModule(String str, WVCallBackContext wVCallBackContext) {
        String string;
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2860c925", new Object[]{this, str, wVCallBackContext})).booleanValue();
        }
        nsw nswVar = new nsw();
        if (TextUtils.isEmpty(str)) {
            nswVar.b("errorMsg", "empty params");
            wVCallBackContext.error(nswVar);
            return false;
        }
        try {
            string = JSON.parseObject(str).getString(PARAMS_MODULE_NAME);
        } catch (Throwable unused) {
            nswVar.b("errorMsg", "empty params");
            wVCallBackContext.error(nswVar);
        }
        if (TextUtils.isEmpty(string)) {
            nswVar.b("errorMsg", "mo module name");
            wVCallBackContext.error(nswVar);
            return false;
        }
        Map<String, String> j = FestivalMgr.i().j(string);
        if (j == null) {
            obj = EMPTY_MAP;
        } else {
            obj = JSON.toJSONString(j);
        }
        nswVar.a(string, obj);
        wVCallBackContext.success(nswVar);
        return false;
    }
}
