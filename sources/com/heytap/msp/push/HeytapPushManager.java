package com.heytap.msp.push;

import android.content.Context;
import com.heytap.msp.push.callback.ICallBackResultService;
import com.heytap.msp.push.callback.IGetAppNotificationCallBackService;
import com.heytap.msp.push.callback.ISetAppNotificationCallBackService;
import com.heytap.msp.push.mode.DataMessage;
import com.heytap.msp.push.mode.MessageStat;
import com.heytap.msp.push.notification.PushNotificationManager;
import com.heytap.msp.push.statis.StatisticUtils;
import java.util.List;
import org.json.JSONObject;
import tb.b6n;
import tb.ct2;
import tb.t2o;
import tb.uiq;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class HeytapPushManager {
    static {
        t2o.a(612368433);
    }

    public static void cancelNotification(JSONObject jSONObject) {
        b6n.s().f(jSONObject);
    }

    public static void clearNotificationType(JSONObject jSONObject) {
        b6n.s().l(jSONObject);
    }

    public static void clearNotifications() {
        clearNotifications(null);
    }

    public static void disableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        b6n.s().n(iSetAppNotificationCallBackService);
    }

    public static void enableAppNotificationSwitch(ISetAppNotificationCallBackService iSetAppNotificationCallBackService) {
        b6n.s().o(iSetAppNotificationCallBackService);
    }

    public static void getAppNotificationSwitch(IGetAppNotificationCallBackService iGetAppNotificationCallBackService) {
        b6n.s().p(iGetAppNotificationCallBackService);
    }

    public static String getMcsPackageName(Context context) {
        return b6n.s().u(context);
    }

    public static void getNotificationStatus(JSONObject jSONObject) {
        b6n.s().w(jSONObject);
    }

    public static ICallBackResultService getPushCallback() {
        return b6n.s().z();
    }

    public static PushNotificationManager getPushNotificationManager() {
        return PushNotificationManager.getInstance();
    }

    public static void getPushStatus() {
        b6n.s().C();
    }

    public static int getPushVersionCode() {
        return b6n.s().D();
    }

    public static String getPushVersionName() {
        return b6n.s().E();
    }

    public static String getReceiveSdkAction(Context context) {
        return b6n.s().F(context);
    }

    public static void getRegister(JSONObject jSONObject) {
        b6n.s().G(jSONObject);
    }

    public static String getRegisterID() {
        return b6n.s().H();
    }

    public static int getSDKVersionCode() {
        int[] iArr = b6n.k;
        return ct2.ZCACHE_ERROR_CODE_MAX;
    }

    public static String getSDKVersionName() {
        int[] iArr = b6n.k;
        return "3.1.0";
    }

    public static void init(Context context, boolean z) {
        b6n.s().I(context, z);
    }

    public static boolean isSupportPush(Context context) {
        return b6n.s().K(context);
    }

    public static void openNotificationSettings(JSONObject jSONObject) {
        b6n.s().M(jSONObject);
    }

    public static void pausePush(JSONObject jSONObject) {
        b6n.s().N(jSONObject);
    }

    public static void register(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        b6n.s().O(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void requestNotificationPermission() {
        b6n.s().P();
    }

    public static void resumePush(JSONObject jSONObject) {
        b6n.s().Q(jSONObject);
    }

    public static void setAppKeySecret(String str, String str2) {
        b6n.s().R(str, str2);
    }

    public static void setNotificationType(int i, JSONObject jSONObject) {
        b6n.s().S(i, jSONObject);
    }

    public static void setPushCallback(ICallBackResultService iCallBackResultService) {
        b6n.s().T(iCallBackResultService);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4, JSONObject jSONObject) throws IllegalArgumentException {
        b6n.s().U(list, i, i2, i3, i4, jSONObject);
    }

    public static void setRegisterID(String str) {
        b6n.s().V(str);
    }

    public static void statisticEvent(Context context, String str, DataMessage dataMessage) {
        StatisticUtils.statisticEvent(context, str, dataMessage);
    }

    @Deprecated
    public static void statisticMessage(Context context, MessageStat messageStat) {
        uiq.b(context, messageStat);
    }

    public static void unRegister(Context context, String str, String str2, JSONObject jSONObject, ICallBackResultService iCallBackResultService) {
        b6n.s().Y(context, str, str2, jSONObject, iCallBackResultService);
    }

    public static void clearNotificationType() {
        clearNotificationType(null);
    }

    public static void clearNotifications(JSONObject jSONObject) {
        b6n.s().m(jSONObject);
    }

    public static void getNotificationStatus() {
        getNotificationStatus(null);
    }

    public static void getRegister() {
        getRegister(null);
    }

    public static void openNotificationSettings() {
        openNotificationSettings(null);
    }

    public static void pausePush() {
        pausePush(null);
    }

    public static void register(Context context, String str, String str2, ICallBackResultService iCallBackResultService) {
        register(context, str, str2, null, iCallBackResultService);
    }

    public static void resumePush() {
        resumePush(null);
    }

    public static void setNotificationType(int i) {
        setNotificationType(i, null);
    }

    public static void setPushTime(List<Integer> list, int i, int i2, int i3, int i4) {
        setPushTime(list, i, i2, i3, i4, null);
    }

    @Deprecated
    public static void statisticMessage(Context context, List<MessageStat> list) {
        uiq.c(context, list);
    }

    public static void unRegister(JSONObject jSONObject) {
        b6n.s().Z(jSONObject);
    }

    public static void unRegister() {
        unRegister(null);
    }
}
