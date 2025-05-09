package com.taobao.calendar.bridge.jsbridge;

import android.content.Context;
import android.os.RemoteException;
import android.taobao.windvane.jsbridge.WVCallBackContext;
import android.text.TextUtils;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.taobao.calendar.bridge.listener.CalendarListener;
import com.taobao.calendar.bridge.model.ScheduleDTOModule;
import com.taobao.calendar.exception.CalendarResult;
import com.taobao.calendar.permission.LifePermissionFragment;
import org.json.JSONException;
import tb.a84;
import tb.azl;
import tb.hu2;
import tb.kpw;
import tb.nsw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class CalendarJsBridge extends kpw {
    public static final String PLUGIN_NAME = "TBCalendar";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a implements azl {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f10262a;
        public final /* synthetic */ String b;
        public final /* synthetic */ WVCallBackContext c;

        public a(String str, String str2, WVCallBackContext wVCallBackContext) {
            this.f10262a = str;
            this.b = str2;
            this.c = wVCallBackContext;
        }

        public void a() {
            CalendarResult calendarResult = CalendarResult.kTCALENDAR_NO_PERMISSION;
            this.c.error(CalendarJsBridge.this.getFailedData(calendarResult.getCode(), calendarResult.getMessage()));
        }

        public void b() {
            CalendarJsBridge.this.excuteAction(this.f10262a, this.b, this.c);
        }
    }

    static {
        t2o.a(693108748);
    }

    private void addCalendarPlan(WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            CalendarResult calendarResult = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult.getCode(), calendarResult.getMessage()));
        }
        ScheduleDTOModule d = a84.d(parseObject);
        if (d == null) {
            CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult2.getCode(), calendarResult2.getMessage()));
        }
        hu2 f = hu2.f();
        if (f != null) {
            addQueryListener(f, wVCallBackContext);
            f.c(d);
        }
    }

    private void addQueryListener(hu2 hu2Var, final WVCallBackContext wVCallBackContext) {
        if (hu2Var != null) {
            hu2Var.j(new CalendarListener.Stub() { // from class: com.taobao.calendar.bridge.jsbridge.CalendarJsBridge.2
                @Override // com.taobao.calendar.bridge.listener.CalendarListener
                public void onError(String str, String str2) throws RemoteException {
                    wVCallBackContext.error(CalendarJsBridge.this.getFailedData(str, str2));
                }

                @Override // com.taobao.calendar.bridge.listener.CalendarListener
                public void onSuccess(boolean z, String str) throws RemoteException {
                    if (z) {
                        wVCallBackContext.success(str);
                        return;
                    }
                    WVCallBackContext wVCallBackContext2 = wVCallBackContext;
                    CalendarJsBridge calendarJsBridge = CalendarJsBridge.this;
                    CalendarResult calendarResult = CalendarResult.KTCALENDAR_INVALID_PARAM;
                    wVCallBackContext2.error(calendarJsBridge.getFailedData(calendarResult.getCode(), calendarResult.getMessage()));
                }
            });
        }
    }

    private void cancelCalendarPlan(WVCallBackContext wVCallBackContext, String str) {
        JSONObject parseObject = JSON.parseObject(str);
        if (parseObject == null) {
            CalendarResult calendarResult = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult.getCode(), calendarResult.getMessage()));
            return;
        }
        try {
            String string = parseObject.getString("bizId");
            String string2 = parseObject.getString("outId");
            hu2 f = hu2.f();
            if (f != null) {
                addQueryListener(f, wVCallBackContext);
                f.d(string, string2);
            }
        } catch (Exception unused) {
            CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult2.getCode(), calendarResult2.getMessage(), null, null));
        }
    }

    private void checkCalendarPlanIsExist(WVCallBackContext wVCallBackContext, String str) {
        JSONArray jSONArray;
        if (TextUtils.isEmpty(str) || wVCallBackContext == null) {
            CalendarResult calendarResult = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult.getCode(), calendarResult.getMessage()));
            return;
        }
        try {
            jSONArray = JSON.parseObject(str).getJSONArray("calendarPlanList");
        } catch (Exception e) {
            wVCallBackContext.error(getFailedData(CalendarResult.KTCALENDAR_INVALID_PARAM.getCode(), e.getMessage()));
            jSONArray = null;
        }
        if (jSONArray == null || jSONArray.isEmpty()) {
            CalendarResult calendarResult2 = CalendarResult.KTCALENDAR_INVALID_PARAM;
            wVCallBackContext.error(getFailedData(calendarResult2.getCode(), calendarResult2.getMessage()));
            return;
        }
        hu2 f = hu2.f();
        addQueryListener(f, wVCallBackContext);
        f.e(str);
    }

    private void checkPermission(String str, String str2, WVCallBackContext wVCallBackContext, azl azlVar) {
        Context context;
        if (wVCallBackContext.getWebview() != null && (context = wVCallBackContext.getWebview().getContext()) != null && (context instanceof FragmentActivity)) {
            boolean z = false;
            boolean z2 = ContextCompat.checkSelfPermission(context, "android.permission.WRITE_CALENDAR") == 0;
            if ("checkCalendarPermission".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                if (z2) {
                    jSONObject.put("status", (Object) "1");
                    wVCallBackContext.success(jSONObject.toJSONString());
                    return;
                }
                jSONObject.put("status", (Object) "0");
                wVCallBackContext.error(jSONObject.toJSONString());
            } else if (z2) {
                excuteAction(str, str2, wVCallBackContext);
            } else {
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject parseObject = JSON.parseObject(str2);
                        if (parseObject != null) {
                            z = parseObject.getBooleanValue("checkOnce");
                        }
                    } catch (Throwable unused) {
                    }
                }
                LifePermissionFragment lifePermissionFragment = new LifePermissionFragment();
                lifePermissionFragment.r2(z);
                lifePermissionFragment.s2(azlVar);
                ((FragmentActivity) context).getSupportFragmentManager().beginTransaction().add(lifePermissionFragment, LifePermissionFragment.TAG).commitAllowingStateLoss();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void excuteAction(String str, String str2, WVCallBackContext wVCallBackContext) {
        if ("addCalendarPlan".equals(str)) {
            addCalendarPlan(wVCallBackContext, str2);
        } else if ("cancelCalendarPlan".equals(str)) {
            cancelCalendarPlan(wVCallBackContext, str2);
        } else if ("checkCalendarPlanIsExist".equals(str)) {
            checkCalendarPlanIsExist(wVCallBackContext, str2);
        }
    }

    private nsw getFailedData(String str, String str2, String str3, String str4) {
        nsw nswVar = new nsw();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("errCode", str);
            jSONObject.put("errMsg", str2);
            jSONObject.put("bizId", str3);
            jSONObject.put("outId", str4);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        nswVar.h(jSONObject);
        return nswVar;
    }

    @Override // tb.kpw
    public boolean execute(String str, String str2, WVCallBackContext wVCallBackContext) {
        checkPermission(str, str2, wVCallBackContext, new a(str, str2, wVCallBackContext));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public nsw getFailedData(String str, String str2) {
        return getFailedData(str, str2, "", "");
    }
}
