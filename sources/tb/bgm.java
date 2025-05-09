package tb;

import android.text.TextUtils;
import anet.channel.appmonitor.AppMonitor;
import anet.channel.statist.AlarmObject;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bgm {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    public static String f(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("21cb33c9", new Object[]{str, str2, new Boolean(z)});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put(v4s.PARAM_UPLOAD_STAGE, (Object) str);
        jSONObject.put("isUcp", (Object) Boolean.valueOf(z));
        return jSONObject.toJSONString();
    }

    public static String g(boolean z, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bc60c199", new Object[]{new Boolean(z), new Integer(i)});
        }
        if (z) {
            if (i == 1) {
                return "PopViewResumeByPopLayer";
            }
            if (i == 3 || i == 4) {
                return "PopViewResumeByTabSwitch";
            }
            return "PopViewResumeByPageSwitch";
        } else if (i == 1) {
            return "PopViewPauseByPopLayer";
        } else {
            if (i == 3 || i == 4) {
                return "PopViewPauseByTabSwitch";
            }
            return "PopViewPauseByPageSwitch";
        }
    }

    public static String h(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("786c134d", new Object[]{new Integer(i)});
        }
        if (i == 0) {
            return "PopViewConfirm";
        }
        if (i == 1) {
            return "PopViewCancel";
        }
        if (i == 2) {
            return "PopViewTimeFinish";
        }
        if (i == 3) {
            return "PopViewRemoveByDataRefresh";
        }
        if (i == 4) {
            return "PopViewEnter";
        }
        if (i != 5) {
            return "UNKNOWN_EVENT";
        }
        return "PopViewBack";
    }

    public static void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b12d0c62", new Object[]{str, str2});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(v4s.PARAM_UPLOAD_STAGE, (Object) "UcpSendEvent");
        jSONObject.put("actionType", (Object) str);
        jSONObject.put("actionName", (Object) str2);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8d11599", new Object[]{str, str2, str3, str4});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(v4s.PARAM_UPLOAD_STAGE, (Object) str);
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put("code", (Object) str3);
        jSONObject.put("msg", (Object) str4);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = false;
        alarmObject.errorCode = str3;
        alarmObject.errorMsg = str4;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void e(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7898cfa5", new Object[]{str, str2, str3, str4});
            return;
        }
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "Page_Home";
        alarmObject.modulePoint = "pop_monitor";
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(v4s.PARAM_UPLOAD_STAGE, (Object) str);
        jSONObject.put("businessId", (Object) str2);
        jSONObject.put("code", (Object) str3);
        jSONObject.put("msg", (Object) str4);
        alarmObject.arg = jSONObject.toJSONString();
        alarmObject.isSuccess = true;
        AppMonitor.getInstance().commitAlarm(alarmObject);
    }

    public static void a(String str, IPopData iPopData, String str2, String str3) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ba4d156", new Object[]{str, iPopData, str2, str3});
        } else if (!TextUtils.isEmpty(str) && iPopData != null && !iPopData.isResetShowCount()) {
            String businessID = iPopData.getBusinessID();
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "Page_Home";
            alarmObject.modulePoint = "pop_monitor";
            if (iPopData.getUCPConfig() == null || !iPopData.getUCPConfig().enable()) {
                z = false;
            }
            alarmObject.arg = f(str, businessID, z);
            alarmObject.isSuccess = false;
            alarmObject.errorCode = str2;
            alarmObject.errorMsg = str3;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            vfm.f("monitor failed", "point=" + str + ", businessId=" + businessID);
        }
    }

    public static void b(String str, IPopData iPopData) {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b12891c", new Object[]{str, iPopData});
        } else if (!TextUtils.isEmpty(str) && iPopData != null && !iPopData.isResetShowCount()) {
            String businessID = iPopData.getBusinessID();
            AlarmObject alarmObject = new AlarmObject();
            alarmObject.module = "Page_Home";
            alarmObject.modulePoint = "pop_monitor";
            if (iPopData.getUCPConfig() != null && iPopData.getUCPConfig().enable()) {
                z = true;
            }
            alarmObject.arg = f(str, businessID, z);
            alarmObject.isSuccess = true;
            AppMonitor.getInstance().commitAlarm(alarmObject);
            vfm.f("monitor success", "point=" + str + ", businessId=" + businessID);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
        if (r4.equals("endTime") == false) goto L_0x0020;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String i(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bgm.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "8450e079"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L_0x0015:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case -1607243192: goto L_0x0090;
                case -1367724422: goto L_0x0085;
                case -935651083: goto L_0x0079;
                case -907680051: goto L_0x006d;
                case -906021636: goto L_0x0061;
                case 106069776: goto L_0x0055;
                case 951117504: goto L_0x004a;
                case 1282360109: goto L_0x003e;
                case 1340673488: goto L_0x0031;
                case 1842531918: goto L_0x0023;
                default: goto L_0x0020;
            }
        L_0x0020:
            r0 = -1
            goto L_0x0099
        L_0x0023:
            java.lang.String r0 = "netWork"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x002d
            goto L_0x0020
        L_0x002d:
            r0 = 9
            goto L_0x0099
        L_0x0031:
            java.lang.String r0 = "refreshCardView"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003b
            goto L_0x0020
        L_0x003b:
            r0 = 8
            goto L_0x0099
        L_0x003e:
            java.lang.String r0 = "removePop"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0048
            goto L_0x0020
        L_0x0048:
            r0 = 7
            goto L_0x0099
        L_0x004a:
            java.lang.String r0 = "confirm"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0053
            goto L_0x0020
        L_0x0053:
            r0 = 6
            goto L_0x0099
        L_0x0055:
            java.lang.String r0 = "other"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x005f
            goto L_0x0020
        L_0x005f:
            r0 = 5
            goto L_0x0099
        L_0x0061:
            java.lang.String r0 = "select"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x006b
            goto L_0x0020
        L_0x006b:
            r0 = 4
            goto L_0x0099
        L_0x006d:
            java.lang.String r0 = "scroll"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0077
            goto L_0x0020
        L_0x0077:
            r0 = 3
            goto L_0x0099
        L_0x0079:
            java.lang.String r0 = "unSelect"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0083
            goto L_0x0020
        L_0x0083:
            r0 = 2
            goto L_0x0099
        L_0x0085:
            java.lang.String r0 = "cancel"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x008e
            goto L_0x0020
        L_0x008e:
            r0 = 1
            goto L_0x0099
        L_0x0090:
            java.lang.String r1 = "endTime"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0099
            goto L_0x0020
        L_0x0099:
            switch(r0) {
                case 0: goto L_0x00ba;
                case 1: goto L_0x00b7;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00b1;
                case 4: goto L_0x00ae;
                case 5: goto L_0x00ab;
                case 6: goto L_0x00a8;
                case 7: goto L_0x00a5;
                case 8: goto L_0x00a2;
                case 9: goto L_0x009f;
                default: goto L_0x009c;
            }
        L_0x009c:
            java.lang.String r4 = "UNKNOWN_MESSAGE"
            return r4
        L_0x009f:
            java.lang.String r4 = "PopViewReqSendSuccess"
            return r4
        L_0x00a2:
            java.lang.String r4 = "MESSAGE_TYPE_REFRESH_VIEW"
            return r4
        L_0x00a5:
            java.lang.String r4 = "MESSAGE_TYPE_REMOVE_POP_VIEW"
            return r4
        L_0x00a8:
            java.lang.String r4 = "PopViewConfirm"
            return r4
        L_0x00ab:
            java.lang.String r4 = "MESSAGE_TYPE_OTHER"
            return r4
        L_0x00ae:
            java.lang.String r4 = "PopViewEnter"
            return r4
        L_0x00b1:
            java.lang.String r4 = "MESSAGE_TYPE_SCROLL"
            return r4
        L_0x00b4:
            java.lang.String r4 = "PopViewBack"
            return r4
        L_0x00b7:
            java.lang.String r4 = "PopViewCancel"
            return r4
        L_0x00ba:
            java.lang.String r4 = "PopViewTimeFinish"
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bgm.i(java.lang.String):java.lang.String");
    }
}
