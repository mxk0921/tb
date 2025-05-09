package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class wx1 extends wa {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        static {
            t2o.a(689963145);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    static {
        t2o.a(689963144);
    }

    public static /* synthetic */ Object ipc$super(wx1 wx1Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/core/message/observer/BaseMessageObserver");
    }

    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "tabType");
        vgh.c(this, "BaseMessageObserver", "Tab创建的时机，tabId=" + str + "，tabType=" + str2);
    }

    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        vgh.c(this, "BaseMessageObserver", "Tab销毁的时机，tabId=".concat(str));
    }

    public void C(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        vgh.c(this, "BaseMessageObserver", "Tab开启的时机，tabId=" + str + "，changeType=" + str2);
    }

    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(str2, "changeType");
        vgh.c(this, "BaseMessageObserver", "Tab暂停的时机，tabId=" + str + "，changeType=" + str2);
    }

    public void E(String str, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("38cb302f", new Object[]{this, str, map});
            return;
        }
        ckf.g(str, vaj.KEY_TAB_ID);
        ckf.g(map, "tabURLQuery");
        vgh.c(this, "BaseMessageObserver", "Tab URL参数发生改变的时机，tabId=" + str + "，tabURLQuery=" + map);
    }

    @Override // tb.wa
    public void o(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("524eaf26", new Object[]{this, bmiVar});
            return;
        }
        ckf.g(bmiVar, "message");
        vgh.c(this, "BaseMessageObserver", "收到消息，message=" + bmiVar);
        String c = bmiVar.c();
        switch (c.hashCode()) {
            case -1752420584:
                if (c.equals(tx1.PAGE_URL_QUERY_CHANGE_NAME)) {
                    s(bmiVar);
                    return;
                }
                break;
            case -1431924590:
                if (c.equals(tx1.PAGE_STATE_CHANGE_NAME)) {
                    r(bmiVar);
                    return;
                }
                break;
            case -459761762:
                if (c.equals(tx1.TAB_URL_QUERY_CHANGE_NAME)) {
                    u(bmiVar);
                    return;
                }
                break;
            case 1256744396:
                if (c.equals(tx1.TAB_STATE_CHANGE_NAME)) {
                    t(bmiVar);
                    return;
                }
                break;
        }
        vgh.c(this, "BaseMessageObserver", "收到其他消息，message=" + bmiVar);
    }

    public final void r(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fe4fc8", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("changeType");
            Object obj2 = a2.get("state");
            if (ckf.b(obj2, "create")) {
                v();
            } else if (ckf.b(obj2, "start")) {
                if (!(obj instanceof String)) {
                    vgh.c(this, "BaseMessageObserver", "处理页面状态发生改变的消息，changeType无效");
                } else {
                    x((String) obj);
                }
            } else if (ckf.b(obj2, "stop")) {
                if (!(obj instanceof String)) {
                    vgh.c(this, "BaseMessageObserver", "处理页面状态发生改变的消息，changeType无效");
                } else {
                    y((String) obj);
                }
            } else if (ckf.b(obj2, "destroy")) {
                w();
            } else {
                vgh.c(this, "BaseMessageObserver", "处理页面状态发生改变的消息，state无效");
            }
        }
    }

    public final void s(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18fe465e", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("urlQuery");
            if (!(obj instanceof Map)) {
                vgh.c(this, "BaseMessageObserver", "处理页面URL参数发生改变的消息，urlQuery无效");
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && ((CharSequence) key).length() > 0 && (value instanceof String)) {
                    linkedHashMap.put(key, value);
                }
            }
            if (linkedHashMap.isEmpty()) {
                vgh.c(this, "BaseMessageObserver", "处理页面URL参数发生改变的消息，copyURLQuery为空");
            } else {
                z(linkedHashMap);
            }
        }
    }

    public final void t(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6377cc12", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("id");
            if (!(obj instanceof String) || ((CharSequence) obj).length() == 0) {
                vgh.c(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，id无效");
                return;
            }
            Object obj2 = a2.get("state");
            if (ckf.b(obj2, "create")) {
                Object obj3 = a2.get("type");
                if (!(obj3 instanceof String) || ((CharSequence) obj3).length() == 0) {
                    vgh.c(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，type无效");
                } else {
                    A((String) obj, (String) obj3);
                }
            } else if (ckf.b(obj2, "start")) {
                Object obj4 = a2.get("changeType");
                if (!(obj4 instanceof String)) {
                    vgh.c(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，changeType无效");
                } else {
                    C((String) obj, (String) obj4);
                }
            } else if (ckf.b(obj2, "stop")) {
                Object obj5 = a2.get("changeType");
                if (!(obj5 instanceof String)) {
                    vgh.c(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，changeType无效");
                } else {
                    D((String) obj, (String) obj5);
                }
            } else if (ckf.b(obj2, "destroy")) {
                B((String) obj);
            } else {
                vgh.c(this, "BaseMessageObserver", "处理Tab状态发生改变的消息，state无效");
            }
        }
    }

    public final void u(bmi bmiVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2664edd4", new Object[]{this, bmiVar});
            return;
        }
        JSONObject a2 = bmiVar.a();
        if (a2 != null) {
            Object obj = a2.get("id");
            if (!(obj instanceof String) || ((CharSequence) obj).length() == 0) {
                vgh.c(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，id无效");
                return;
            }
            Object obj2 = a2.get("urlQuery");
            if (!(obj2 instanceof Map)) {
                vgh.c(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，urlQuery无效");
                return;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((Map) obj2).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && ((CharSequence) key).length() > 0 && (value instanceof String)) {
                    linkedHashMap.put(key, value.toString());
                }
            }
            if (linkedHashMap.isEmpty()) {
                vgh.c(this, "BaseMessageObserver", "处理Tab URL参数发生改变的消息，copyURLQuery为空");
            } else {
                E((String) obj, linkedHashMap);
            }
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d5e10581", new Object[]{this});
        } else {
            vgh.c(this, "BaseMessageObserver", "页面创建的时机");
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5077dfb2", new Object[]{this});
        } else {
            vgh.c(this, "BaseMessageObserver", "页面销毁的时机");
        }
    }

    public void x(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f4c9e4", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        vgh.c(this, "BaseMessageObserver", "页面开启的时机，changeType=".concat(str));
    }

    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7efda30", new Object[]{this, str});
            return;
        }
        ckf.g(str, "changeType");
        vgh.c(this, "BaseMessageObserver", "页面暂停的时机，changeType=".concat(str));
    }

    public void z(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6ed1a11", new Object[]{this, map});
            return;
        }
        ckf.g(map, "pageURLQuery");
        vgh.c(this, "BaseMessageObserver", "页面URL参数发生改变的时机，pageURLQuery=" + map);
    }
}
