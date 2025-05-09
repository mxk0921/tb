package com.taobao.android.detail2.core.framework.base.windvane;

import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.trade.event.Event;
import java.util.List;
import tb.hxj;
import tb.nsw;
import tb.pt1;
import tb.rj8;
import tb.t2o;
import tb.txj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class NewDetailWVPlugin extends NewDetailBaseWVPlugin {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ACTION_NEW_DETAIL_WV_MESSAGE = "NEW_DETAIL_WV_MESSAGE";
    private static final String ERROR_CODE_EMPTY_PARAMS = "10001";
    private static final String ERROR_CODE_EMPTY_TOKEN = "10002";
    private static final String ERROR_CODE_NO_HANDLER = "10003";
    private static final String ERROR_CODE_TOKEN_INVALID = "10004";
    private static final String ERROR_MSG_EMPTY_PARAMS = "params为空";
    private static final String ERROR_MSG_EMPTY_TOKEN = "token为空";
    private static final String ERROR_MSG_NO_HANDLER = "不支持该action";
    private static final String ERROR_MSG_TOKEN_INVALID = "token不合法";
    public static final String NAME = "NewDetailCenter";
    public static final String SUCCESS_CODE = "200";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements pt1.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final WVCallBackContext f7114a;
        public final String b;
        public final String c;

        static {
            t2o.a(352321765);
            t2o.a(352321624);
        }

        public a(WVCallBackContext wVCallBackContext, String str, String str2) {
            this.f7114a = wVCallBackContext;
            this.b = str;
            this.c = str2;
        }

        @Override // tb.pt1.a
        public void a(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d7adbb21", new Object[]{this, jSONObject});
            } else if (jSONObject == null) {
                txj.e(txj.TAG_WINDVANE, "windvane callback失败 message为空, action: " + this.b + ", from: " + this.c);
                this.f7114a.error(new nsw("HY_FAILED"));
            } else if (jSONObject.getBoolean(pt1.CALLBACK_IS_SUCCESS).booleanValue()) {
                txj.e(txj.TAG_WINDVANE, "windvane callback成功, action: " + this.b + ", from: " + this.c);
                this.f7114a.success(new nsw("HY_SUCCESS"));
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject(pt1.CALLBACK_EVENT_KEY);
                nsw nswVar = new nsw("HY_FAILED");
                if (jSONObject2 != null) {
                    for (String str : jSONObject2.keySet()) {
                        if (!TextUtils.isEmpty(str)) {
                            nswVar.b(str, jSONObject2.getString(str));
                        }
                    }
                    txj.e(txj.TAG_WINDVANE, "windvane callback失败, action: " + this.b + ", from: " + this.c + ", result: " + jSONObject2.toJSONString());
                } else {
                    txj.e(txj.TAG_WINDVANE, "windvane callback失败, action: " + this.b + ", from: " + this.c);
                }
                this.f7114a.error(nswVar);
            }
        }
    }

    static {
        t2o.a(352321764);
    }

    public static /* synthetic */ Object ipc$super(NewDetailWVPlugin newDetailWVPlugin, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/detail2/core/framework/base/windvane/NewDetailWVPlugin");
    }

    @Override // com.taobao.android.detail2.core.framework.base.windvane.NewDetailBaseWVPlugin, tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bcd41fd1", new Object[]{this, str, str2, wVCallBackContext})).booleanValue();
        }
        txj.e(txj.TAG_WINDVANE, "windvane execute执行 message为空, action: " + str + ", params: " + str2);
        JSONObject parseObject = JSON.parseObject(str2);
        if (parseObject == null) {
            handleCallbackFail("10001", ERROR_MSG_EMPTY_PARAMS, wVCallBackContext);
            return false;
        }
        String string = parseObject.getString("from");
        if (TextUtils.isEmpty(string)) {
            txj.e(txj.TAG_WINDVANE, "handleUpdateData from is null");
        }
        a aVar = new a(wVCallBackContext, str, string);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(hxj.EVENT_KEY, (Object) str);
        jSONObject.put("params", (Object) parseObject);
        jSONObject.put("callback", (Object) aVar);
        jSONObject.put(hxj.UNIQID, (Object) parseObject.getString("targetNid"));
        List<Event> c = hxj.c(null, jSONObject);
        if (c == null || c.size() == 0) {
            handleCallbackFail("10003", ERROR_MSG_NO_HANDLER, wVCallBackContext);
            return false;
        }
        String string2 = parseObject.getString("token");
        if (TextUtils.isEmpty(string2)) {
            handleCallbackFail("10002", ERROR_MSG_EMPTY_TOKEN, wVCallBackContext);
            return false;
        }
        for (Event event : c) {
            rj8.b(string2).f(event);
        }
        return true;
    }

    @Override // com.taobao.android.detail2.core.framework.base.windvane.NewDetailBaseWVPlugin
    public boolean onExecute(String str, JSONObject jSONObject, WVCallBackContext wVCallBackContext, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c452fe34", new Object[]{this, str, jSONObject, wVCallBackContext, str2})).booleanValue();
        }
        a aVar = new a(wVCallBackContext, str, str2);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(hxj.EVENT_KEY, (Object) str);
        jSONObject2.put("params", (Object) jSONObject);
        jSONObject2.put("callback", (Object) aVar);
        jSONObject2.put(hxj.UNIQID, (Object) jSONObject.getString("targetNid"));
        List<Event> c = hxj.c(null, jSONObject2);
        if (c == null || c.size() == 0) {
            handleCallbackFail("10003", ERROR_MSG_NO_HANDLER, wVCallBackContext);
            return false;
        }
        String string = jSONObject.getString("token");
        if (TextUtils.isEmpty(string)) {
            handleCallbackFail("10002", ERROR_MSG_EMPTY_TOKEN, wVCallBackContext);
            return false;
        }
        for (Event event : c) {
            rj8.b(string).f(event);
        }
        return true;
    }
}
