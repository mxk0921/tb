package com.alibaba.android.umbrella.trace;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.alibaba.android.umbrella.trace.UmbrellaInfo;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;
import tb.idv;
import tb.odv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UmbrellaTracker {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ERROR_BUSINESS_TYPE = "UMBRELLA_ERROR";
    public static final String PURCHASE_MODULE = "Page_Trade_Govern";
    public static final String PURCHASE_POINT_POST = "_Service";
    public static final String PURCHASE_POINT_PRE = "Monitor_";
    private static HashMap<String, Integer> identifyMap = new HashMap<>();
    private static int currIndex = 1;
    private static Handler sHandler = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == 673877017) {
                super.handleMessage((Message) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/umbrella/trace/UmbrellaTracker$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            String str;
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
                return;
            }
            super.handleMessage(message);
            Object obj = message.obj;
            if (obj instanceof UmbrellaInfo) {
                UmbrellaInfo umbrellaInfo = (UmbrellaInfo) obj;
                Map<String, String> map = umbrellaInfo.args;
                if (map != null) {
                    str2 = map.get("errorCode");
                    str = umbrellaInfo.args.get("errorMsg");
                } else {
                    str2 = "";
                    str = str2;
                }
                UmbrellaTracker.commitFailureStability(umbrellaInfo, str2, str);
            }
        }
    }

    public static void commitFailureStability(UmbrellaInfo umbrellaInfo, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b05c292", new Object[]{umbrellaInfo, str, str2});
        } else if (!idv.B() && !odv.b(str) && !TextUtils.isEmpty(str) && umbrellaInfo != null && idv.p(umbrellaInfo, str)) {
            AppMonitor.Alarm.commitFail("Page_Trade_Govern", PURCHASE_POINT_PRE + umbrellaInfo.mainBizName + PURCHASE_POINT_POST, umbrellaInfo.toJsonString(), str, str2);
        }
    }

    public static void commitSuccessStability(UmbrellaInfo umbrellaInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("befc8537", new Object[]{umbrellaInfo});
        } else if (!idv.E() && umbrellaInfo != null && !TextUtils.isEmpty(umbrellaInfo.mainBizName) && idv.z(umbrellaInfo)) {
            AppMonitor.Alarm.commitSuccess("Page_Trade_Govern", PURCHASE_POINT_PRE + umbrellaInfo.mainBizName + PURCHASE_POINT_POST, umbrellaInfo.toJsonString());
        }
    }

    private static String getIdentify(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6bf3a659", new Object[]{str, str2, str3});
        }
        if (str == null) {
            str = "";
        }
        if (str2 == null) {
            str2 = "";
        }
        if (str3 == null) {
            str3 = "";
        }
        return str + "_" + str2 + "_" + str3;
    }

    private static int getMessageIndex(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("aeb7eb45", new Object[]{str})).intValue();
        }
        Integer num = identifyMap.get(str);
        if (num == null) {
            num = Integer.valueOf(currIndex);
            identifyMap.put(str, Integer.valueOf(currIndex));
            currIndex++;
        }
        return num.intValue();
    }

    public static void traceProcessBegin(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a0942a3", new Object[]{str, str2, str3, str4, str5, map, str6, str7, new Long(j)});
        } else if (!idv.B()) {
            int messageIndex = getMessageIndex(getIdentify(str, str2, str3));
            UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
            HashMap hashMap = new HashMap();
            hashMap.put("errorCode", str6);
            hashMap.put("errorMsg", str7);
            bVar.b(hashMap);
            bVar.d(str3).b(map);
            Message obtainMessage = sHandler.obtainMessage(messageIndex);
            obtainMessage.obj = bVar.a();
            sHandler.removeMessages(messageIndex);
            sHandler.sendMessageDelayed(obtainMessage, j);
        }
    }

    public static void traceProcessEnd(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d23776f6", new Object[]{str, str2, str3});
        } else if (!idv.B()) {
            sHandler.removeMessages(getMessageIndex(getIdentify(str, str2, str3)));
        }
    }

    public static void commitSuccessStability(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd1ebd8f", new Object[]{str, str2, str3, str4, str5, map});
        } else if (!idv.E()) {
            UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
            bVar.d(str3).b(map);
            commitSuccessStability(bVar.a());
        }
    }

    public static void commitFailureStability(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80feadea", new Object[]{str, str2, str3, str4, str5, map, str6, str7});
        } else if (!idv.B()) {
            UmbrellaInfo.b bVar = new UmbrellaInfo.b(str2, str3, str, str4, str5);
            bVar.d(str3).b(map);
            commitFailureStability(bVar.a(), str6, str7);
        }
    }
}
