package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.wireless.link.model.ActivityIdTime;
import com.taobao.wireless.link.model.ActivityOutTime;
import com.taobao.wireless.link.model.BrandVersion;
import com.taobao.wireless.link.model.MessageData;
import com.taobao.wireless.link.model.SupportBrandVersion;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qd1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1030750228);
    }

    public static void A(cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76a0da85", new Object[]{cnoVar});
            return;
        }
        mr4.b().c = null;
        cnoVar.f("growth_assistant_message_needshow");
    }

    public static void B(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bea30691", new Object[]{context, str});
            return;
        }
        String k = k(context);
        if (md1.h().c == null || md1.h().c.size() == 0) {
            md1 h = md1.h();
            cno b = cno.b(context);
            h.c = b.c("growth_assistant_updateTime_" + k);
        }
        md1.h().c.remove(str);
        cno b2 = cno.b(context);
        b2.f("growth_assistant_updateTime_" + k);
    }

    public static void C(Context context, cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8ece75f", new Object[]{context, cnoVar});
            return;
        }
        String k = k(context);
        mr4.b().l = "true";
        mr4.b().m = "true";
        cnoVar.d("growth_assistant_switch_show_" + k, "true");
        cnoVar.d("growth_assistant_switch_open_" + k, "true");
        irg.a("link_tag", "AssistantUtils === writeSwitch === isAssistantSwitchShow=" + mr4.b().l + "  isAssistantSwitchOpen=" + mr4.b().m);
    }

    public static void a(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e30a0391", new Object[]{context});
        } else if (Build.VERSION.SDK_INT >= 23) {
            irg.a("link_tag", "AssistantUtils === RequestOverlayPermission === 系统版本大于6.0，没有悬浮窗权限，申请权限");
            Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse("package:" + context.getPackageName()));
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
    }

    public static ActivityIdTime c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ActivityIdTime) ipChange.ipc$dispatch("5114a58e", new Object[]{context});
        }
        try {
            if (ypg.e().c.d == null) {
                ypg.e().c.d = (ActivityIdTime) cno.b(context).a("activityOutTime", new ActivityIdTime());
            }
        } catch (Exception e) {
            irg.a("link_tag", "AssistantUtils === getActivityTimeLIst === 获取活动过期时间异常=" + e.getMessage());
        }
        return ypg.e().c.d;
    }

    public static long d(MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c15de7f1", new Object[]{messageData})).longValue();
        }
        if (messageData != null) {
            long j = messageData.assistant_animation_time;
            if (j > 0) {
                return j;
            }
        }
        return 8000L;
    }

    public static nd1 e(Context context, cno cnoVar, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nd1) ipChange.ipc$dispatch("2915d1d3", new Object[]{context, cnoVar, str, str2});
        }
        nd1 nd1Var = new nd1();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            irg.a("link_tag", "AssistantUtils === getAssistantData === tag或者id为空,返回默认对象");
            return nd1Var;
        }
        if (md1.h().b != null || md1.h().b.size() > 0) {
            nd1Var = md1.h().b.get(str2);
        }
        if (nd1Var != null && !TextUtils.isEmpty(nd1Var.b)) {
            return nd1Var;
        }
        return (nd1) cnoVar.a(str2 + "_" + str, new nd1());
    }

    public static String f(Context context, MessageData messageData) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d76da7a8", new Object[]{context, messageData});
        }
        if (messageData == null || TextUtils.isEmpty(messageData.assistant_logo_url)) {
            str = "https://gw.alicdn.com/tfs/TB1L9v4qlv0gK0jSZKbXXbK2FXa-160-160.png";
        } else {
            str = messageData.assistant_logo_url;
        }
        nd1 e = e(context, cno.b(context), k(context), messageData.activity_id);
        if (e != null && !TextUtils.isEmpty(e.c)) {
            str = e.c;
        }
        irg.a("link_tag", "DisplayCenter === getDefaultUrl === 获取到的默认URL=" + str);
        return str;
    }

    public static MessageData g(cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("bd022aea", new Object[]{cnoVar});
        }
        MessageData messageData = mr4.b().d;
        if (messageData == null) {
            return (MessageData) cnoVar.a("growth_assistant_message_last", new MessageData());
        }
        return messageData;
    }

    public static Map<String, String> h(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("90133728", new Object[]{context});
        }
        Map<String, String> map = md1.h().f23956a;
        if (map != null) {
            return map;
        }
        cno b = cno.b(context);
        return b.c("growth_assistant_activityList_" + k(context));
    }

    public static MessageData i(cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MessageData) ipChange.ipc$dispatch("17fdb3e", new Object[]{cnoVar});
        }
        MessageData messageData = mr4.b().c;
        if (messageData == null) {
            return (MessageData) cnoVar.a("growth_assistant_message_needshow", new MessageData());
        }
        return messageData;
    }

    public static String k(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d478bf03", new Object[]{context});
        }
        String k = jsg.k();
        String l = jsg.l(context);
        if (TextUtils.isEmpty(k)) {
            k = l;
        }
        irg.a("link_tag", "AssistantUtils === getTag === tag=" + k);
        return k;
    }

    public static Map<String, String> l(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8ba6cff4", new Object[]{context, str});
        }
        if (md1.h().c != null && md1.h().c.size() == 0) {
            md1 h = md1.h();
            cno b = cno.b(context);
            h.c = b.c("growth_assistant_updateTime_" + str);
        }
        return md1.h().c;
    }

    public static boolean n(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbbc91c1", new Object[]{l})).booleanValue();
        }
        if (jsg.f() < l.longValue()) {
            return true;
        }
        return false;
    }

    public static void s(cno cnoVar, Map<String, String> map, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b559b05", new Object[]{cnoVar, map, str});
        } else if (map != null) {
            md1.h().f23956a = map;
            if (cnoVar != null) {
                cnoVar.e("growth_assistant_activityList_" + str, map);
            }
        }
    }

    public static void t(cno cnoVar, String str, String str2, nd1 nd1Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42734610", new Object[]{cnoVar, str, str2, nd1Var});
        } else if (md1.h().b != null && nd1Var != null) {
            md1.h().b.put(str, nd1Var);
            if (cnoVar != null) {
                cnoVar.d(str + "_" + str2, nd1Var);
            }
        }
    }

    public static void u(cno cnoVar, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed22c97b", new Object[]{cnoVar, messageData});
            return;
        }
        mr4.b().d = messageData;
        cnoVar.d("growth_assistant_message_last", messageData);
    }

    public static void v(cno cnoVar, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a2d77d5", new Object[]{cnoVar, messageData});
            return;
        }
        mr4.b().c = messageData;
        cnoVar.d("growth_assistant_message_needshow", messageData);
    }

    public static void w(Context context, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1971947a", new Object[]{context, str, str2, str3});
            return;
        }
        md1.h().c.put(str, str3);
        cno b = cno.b(context);
        b.e("growth_assistant_updateTime_" + str2, md1.h().c);
    }

    public static void x(Context context, cno cnoVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173aaa3a", new Object[]{context, cnoVar, str});
            return;
        }
        String k = k(context);
        if (md1.h().b == null || md1.h().b.size() == 0) {
            md1 h = md1.h();
            cno b = cno.b(context);
            h.b = (Map) b.a(str + "_" + k, new HashMap());
        }
        md1.h().b.remove(str);
        cnoVar.f(str + "_" + k);
    }

    public static void y(cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3712bb8", new Object[]{cnoVar});
            return;
        }
        A(cnoVar);
        z(cnoVar);
    }

    public static void z(cno cnoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1979c42", new Object[]{cnoVar});
            return;
        }
        mr4.b().d = null;
        cnoVar.f("growth_assistant_message_last");
    }

    public static boolean b(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("941a3854", new Object[]{context})).booleanValue();
        }
        boolean q = q(context);
        boolean j = j(context);
        if (!q || !j) {
            irg.a("link_tag", "AssistantUtils === startAndShowAssistant === assistantSwitchShow=" + q + "  assistantSwitchOpen=" + j);
            return false;
        }
        Map<String, String> h = h(context);
        if (h == null || h.size() == 0) {
            irg.a("link_tag", "AssistantUtils === startAndShowAssistant === 本地存储的活动信息为空");
            return false;
        } else if (!p(context, h)) {
            irg.a("link_tag", "AssistantUtils === startAndShowAssistant === 本地存储的活动，全部过期");
            return false;
        } else if (jsg.a(context)) {
            return r(context);
        } else {
            irg.a("link_tag", "AssistantUtils === startAndShowAssistant === 没有权限，不显示小助手");
            return false;
        }
    }

    public static boolean j(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aa0c99fe", new Object[]{context})).booleanValue();
        }
        try {
            str = mr4.b().m;
            if (TextUtils.isEmpty(str)) {
                String k = k(context);
                cno b = cno.b(context);
                str = (String) b.a("growth_assistant_switch_open_" + k, "false");
            }
            irg.a("link_tag", "AssistantUtils === isShowSwitch === isSwitchOpen=" + str);
        } catch (Exception e) {
            irg.a("link_tag", "AssistantUtils === isShowSwitch === isSwitchOpen解析异常=" + e);
        }
        return TextUtils.equals("true", str);
    }

    public static boolean m(Context context, MessageData messageData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bee005d4", new Object[]{context, messageData})).booleanValue();
        }
        try {
            List<ActivityOutTime> list = c(context).activities;
            if (list != null) {
                for (ActivityOutTime activityOutTime : list) {
                    if (TextUtils.equals(activityOutTime.id, messageData.activity_id) && jsg.f() < activityOutTime.outTime.longValue()) {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            irg.a("link_tag", "AssistantUtils === isActivityExpired === 消息对应活动是否过期比对异常" + e.getMessage());
        }
        return true;
    }

    public static boolean o(Context context) {
        List<BrandVersion> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("77fdaef7", new Object[]{context})).booleanValue();
        }
        SupportBrandVersion supportBrandVersion = ypg.e().c.e;
        if (supportBrandVersion == null) {
            try {
                supportBrandVersion = (SupportBrandVersion) cno.b(context).a("supportBrandVersion", new SupportBrandVersion());
            } catch (Exception e) {
                irg.a("link_tag", "AssistantUtils === isInAdapterPhone === 获取小助手支持的品牌和系统版本异常=" + e.getMessage());
            }
        }
        if (!(supportBrandVersion == null || (list = supportBrandVersion.supportBrandVersion) == null)) {
            for (BrandVersion brandVersion : list) {
                String str = brandVersion.brand;
                String str2 = Build.MANUFACTURER;
                if (str.contains(str2.toLowerCase())) {
                    String str3 = brandVersion.version;
                    String str4 = Build.VERSION.RELEASE;
                    if (str3.contains(str4)) {
                        irg.a("link_tag", "AssistantUtils === isInAdapterPhone === 系统版本为：" + str4 + " 手机厂商为：" + str2.toLowerCase() + "，支持小助手功能");
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean p(Context context, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("79eee8da", new Object[]{context, map})).booleanValue();
        }
        ActivityIdTime c = c(context);
        irg.a("link_tag", "AssistantUtils === isOutDate === activityTimeLIst=" + c);
        List<ActivityOutTime> list = c.activities;
        if (!(list == null || list == null)) {
            Set<String> keySet = map.keySet();
            for (ActivityOutTime activityOutTime : list) {
                for (String str : keySet) {
                    if (TextUtils.equals(str, activityOutTime.id) && n(activityOutTime.outTime)) {
                        irg.a("link_tag", "AssistantUtils === isOutDate === activity.id=" + activityOutTime.id + " activity.outTime=" + activityOutTime.outTime);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static boolean q(Context context) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e26b75aa", new Object[]{context})).booleanValue();
        }
        try {
            str = mr4.b().l;
            if (TextUtils.isEmpty(str)) {
                String k = k(context);
                cno b = cno.b(context);
                str = (String) b.a("growth_assistant_switch_show_" + k, "false");
            }
            irg.a("link_tag", "AssistantUtils === isShowSwitch === isShowSwitch=" + str);
        } catch (Exception e) {
            irg.a("link_tag", "AssistantUtils === isShowSwitch === isShowSwitch解析异常=" + e);
        }
        return TextUtils.equals("true", str);
    }

    public static boolean r(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c80696ac", new Object[]{context})).booleanValue();
        }
        if (TextUtils.isEmpty(ypg.e().c.b)) {
            ypg.e().c.b = cno.b(context).c("link_in_common_local").get("tbVersion");
        }
        String str = ypg.e().b;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(ypg.e().c.b)) {
            irg.a("link_tag", "AssistantUtils === isSupportAssistant === 不支持小助手能力,versionName=" + str + " double11Version=" + ypg.e().c.b);
            return false;
        } else if (jsg.c(str, ypg.e().c.b) != 1 || !o(context)) {
            irg.a("link_tag", "AssistantUtils === isSupportAssistant === 不支持小助手能力");
            return false;
        } else {
            irg.a("link_tag", "AssistantUtils === isSupportAssistant === 系统版本、手机厂商、手淘版本为:" + str + "，均支持小助手");
            return true;
        }
    }
}
