package tb;

import android.content.Intent;
import android.taobao.windvane.standardmodal.WVStandardEventCenter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail.ttdetail.constant.Constants$WVActionData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class npw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f24885a = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements jqw {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(912261342);
            t2o.a(989856388);
        }

        @Override // tb.jqw
        public kqw onEvent(int i, iqw iqwVar, Object... objArr) {
            JSONObject jSONObject;
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (kqw) ipChange.ipc$dispatch("75ee5a2a", new Object[]{this, new Integer(i), iqwVar, objArr});
            }
            if (i == 3005) {
                Object obj = objArr[0];
                if (!(obj instanceof String)) {
                    return null;
                }
                try {
                    jSONObject = JSON.parseObject((String) obj);
                    str = null;
                } catch (Throwable th) {
                    str = th.toString();
                    jSONObject = null;
                }
                if (jSONObject == null) {
                    return new kqw(false, str);
                }
                if (!"99tm".equals(jSONObject.getString("bizName"))) {
                    return new kqw(false, "is not 99tm channel");
                }
                if ("TBTradeDetailUpdateState".equals(jSONObject.getString("event"))) {
                    Intent intent = new Intent();
                    intent.setAction(Constants$WVActionData.INTENT_ACTION_99_CART_UPDATE);
                    intent.putExtra(Constants$WVActionData.INTENT_EXTRA_DATA, (String) objArr[0]);
                    intent.addCategory("android.intent.category.DEFAULT");
                    iqwVar.getClass();
                    LocalBroadcastManager.getInstance(null).sendBroadcast(intent);
                } else if ("TBTradeDetailClose".equals(jSONObject.getString("event"))) {
                    Intent intent2 = new Intent();
                    intent2.setAction(Constants$WVActionData.INTENT_ACTION_CLOSE_99_TM_ACTIVITY);
                    intent2.putExtra(Constants$WVActionData.INTENT_EXTRA_DATA, (String) objArr[0]);
                    intent2.addCategory("android.intent.category.DEFAULT");
                    iqwVar.getClass();
                    LocalBroadcastManager.getInstance(null).sendBroadcast(intent2);
                }
            }
            return null;
        }
    }

    static {
        t2o.a(912261341);
    }

    public static synchronized void a() {
        synchronized (npw.class) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bbdd68c0", new Object[0]);
            } else if (!f24885a) {
                f24885a = true;
                lqw.d().b(new a());
            }
        }
    }

    public static void b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1a8c7b4", new Object[]{str, str2});
        } else {
            WVStandardEventCenter.postNotificationToJS(str, str2);
        }
    }
}
