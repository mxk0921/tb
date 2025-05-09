package tb;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.util.Pair;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.agoo.TaobaoConstants;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.tao.log.TLog;
import java.util.HashMap;
import org.android.agoo.common.AgooConstants;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class bt4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(588251185);
    }

    public static Integer c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Integer) ipChange.ipc$dispatch("86cff4ff", new Object[]{str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -256003955:
                if (str.equals("IMPORTANCE_HIGH")) {
                    c = 0;
                    break;
                }
                break;
            case -255819229:
                if (str.equals("IMPORTANCE_NONE")) {
                    c = 1;
                    break;
                }
                break;
            case 1515766505:
                if (str.equals("IMPORTANCE_LOW")) {
                    c = 2;
                    break;
                }
                break;
            case 1515767033:
                if (str.equals("IMPORTANCE_MAX")) {
                    c = 3;
                    break;
                }
                break;
            case 1515767271:
                if (str.equals("IMPORTANCE_MIN")) {
                    c = 4;
                    break;
                }
                break;
            case 1877482326:
                if (str.equals("IMPORTANCE_DEFAULT")) {
                    c = 5;
                    break;
                }
                break;
            case 1985295820:
                if (str.equals("IMPORTANCE_UNSPECIFIED")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 4;
            case 1:
                return 0;
            case 2:
                return 2;
            case 3:
                return 5;
            case 4:
                return 1;
            case 5:
                return 3;
            case 6:
                return -1000;
            default:
                return null;
        }
    }

    public static Pair<String, Integer> e(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("ca121d3a", new Object[]{intent});
        }
        try {
            JSONObject jSONObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT)).getJSONObject("notifPop").getJSONObject("classif");
            return Pair.create(b(jSONObject.getString("cat")), c(jSONObject.getString("imp")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Bundle d(Intent intent) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bundle) ipChange.ipc$dispatch("d3a64e19", new Object[]{intent});
        }
        Bundle bundle = null;
        if (intent == null) {
            return null;
        }
        try {
            String stringExtra = intent.getStringExtra("id");
            if (TextUtils.isEmpty(stringExtra)) {
                return null;
            }
            Bundle bundle2 = new Bundle();
            try {
                bundle2.putBoolean("is_agoo_notify", intent.getBooleanExtra("is_agoo_notify", false));
                Pair<String, Integer> e = e(intent);
                if (e != null) {
                    if (!TextUtils.isEmpty(e.first)) {
                        bundle2.putString("category", e.first);
                    }
                    Integer num = e.second;
                    if (num != null) {
                        bundle2.putInt("importance", num.intValue());
                    }
                }
                bundle2.putString("id", stringExtra);
                String stringExtra2 = intent.getStringExtra(AgooConstants.MESSAGE_BODY);
                String stringExtra3 = intent.getStringExtra("task_id");
                if (!TextUtils.isEmpty(stringExtra3)) {
                    bundle2.putString("task_id", stringExtra3);
                }
                if (TextUtils.isEmpty(stringExtra2)) {
                    return null;
                }
                bundle2.putString(AgooConstants.MESSAGE_BODY, stringExtra2);
                org.json.JSONObject jSONObject = new org.json.JSONObject(stringExtra2);
                String string = jSONObject.getString("url");
                if (!TextUtils.isEmpty(string)) {
                    bundle2.putString(TaobaoConstants.MESSAGE_URL, string);
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject(Constants.KEY_EXTS);
                if (optJSONObject == null) {
                    return bundle2;
                }
                String string2 = optJSONObject.getString("messageId");
                if (TextUtils.isEmpty(string2)) {
                    return bundle2;
                }
                bundle2.putString("messageId", string2);
                return bundle2;
            } catch (Throwable th2) {
                th = th2;
                bundle = bundle2;
                TLog.loge("agoo_push", Log.getStackTraceString(th));
                HashMap hashMap = new HashMap();
                hashMap.put("arg1", "Page_Push_TBMSGPush_Agoo_Exception");
                hashMap.put("pushType", "innerBanner");
                EnvUtil.alarmCommitFail(hashMap, EnvUtil.AGOO_PUSH_DATA_PROCESS_FAIL, "ConvertUtil.convertMsgExtras get data crash");
                return bundle;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:164:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.msgnotification.mode.MsgNotficationDTO a(android.content.Intent r40) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bt4.a(android.content.Intent):com.taobao.msgnotification.mode.MsgNotficationDTO");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00dc, code lost:
        if (r5.equals("CATEGORY_SOCIAL") == false) goto L_0x0028;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String b(java.lang.String r5) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bt4.b(java.lang.String):java.lang.String");
    }

    public static boolean f(Intent intent) {
        JSONObject jSONObject;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b22645e", new Object[]{intent})).booleanValue();
        }
        try {
            JSONObject parseObject = JSON.parseObject(intent.getStringExtra(AgooConstants.MESSAGE_EXT));
            if (!parseObject.containsKey("notifPop") || (jSONObject = parseObject.getJSONObject("notifPop")) == null || !jSONObject.containsKey("enable")) {
                return true;
            }
            if (jSONObject.getInteger("enable").intValue() == 1) {
                z = true;
            }
            return z;
        } catch (Throwable th) {
            TLog.loge("ConvertUtil", "parseEnable error, " + Log.getStackTraceString(th));
            return true;
        }
    }
}
