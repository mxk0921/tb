package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import com.taobao.android.dinamicx.expression.event.tab.DXOnTabClickEvent;
import com.taobao.android.ultron.datamodel.imp.DMComponent;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u3u {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ENTRY_TYPE_LIVE_CART = "liveCart";

    static {
        t2o.a(295699000);
    }

    public static mbc a(DXRuntimeContext dXRuntimeContext) {
        Map<String, Object> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (mbc) ipChange.ipc$dispatch("3ff00907", new Object[]{dXRuntimeContext});
        }
        if (dXRuntimeContext.q() instanceof HashMap) {
            Object obj = ((HashMap) dXRuntimeContext.q()).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
            if (obj instanceof DMComponent) {
                Object obj2 = ((DMComponent) obj).getExtMap().get("keyViewHandler");
                if (obj2 instanceof mbc) {
                    return (mbc) obj2;
                }
            }
        }
        fl6 S = dXRuntimeContext.S();
        if (!(S instanceof beg) || (f = ((beg) S).f()) == null) {
            return null;
        }
        Object obj3 = f.get("keyViewHandler");
        if (obj3 instanceof mbc) {
            return (mbc) obj3;
        }
        return null;
    }

    public static void b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8a4df2a", new Object[]{dXEvent, objArr, dXRuntimeContext});
            return;
        }
        mbc a2 = a(dXRuntimeContext);
        if (a2 != null && (dXEvent instanceof DXOnTabClickEvent)) {
            a2.f(((DXOnTabClickEvent) dXEvent).getIndex());
        }
    }

    public static boolean c(DXRuntimeContext dXRuntimeContext, xea xeaVar, Object[] objArr) {
        i3u i3uVar;
        Map<String, Object> f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac2375b2", new Object[]{dXRuntimeContext, xeaVar, objArr})).booleanValue();
        }
        if (objArr == null || objArr.length < 2) {
            return false;
        }
        if (dXRuntimeContext.S() instanceof i3u) {
            i3uVar = (i3u) dXRuntimeContext.S();
        } else {
            i3uVar = null;
            if (dXRuntimeContext.q() instanceof HashMap) {
                Object obj = ((HashMap) dXRuntimeContext.q()).get(xo7.TAG_DINAMICX_VIEW_COMPONENT);
                if (obj instanceof DMComponent) {
                    Object obj2 = ((DMComponent) obj).getExtMap().get("keyTopBarHandler");
                    if (obj2 instanceof i3u) {
                        i3uVar = (i3u) obj2;
                    }
                }
            } else if ((dXRuntimeContext.S() instanceof beg) && (f = ((beg) dXRuntimeContext.S()).f()) != null) {
                Object obj3 = f.get("keyTopBarHandler");
                if (obj3 instanceof i3u) {
                    i3uVar = (i3u) obj3;
                }
            }
        }
        try {
            iha.k((String) objArr[1]);
        } catch (Exception unused) {
            iha.k("埋点参数类型转换异常");
        }
        if (TextUtils.equals("more", (String) objArr[1])) {
            if (i3uVar != null) {
                i3uVar.m(dXRuntimeContext, xeaVar, (JSONObject) objArr[2]);
            }
        } else if (TextUtils.equals("search", (String) objArr[1])) {
            if (i3uVar != null) {
                i3uVar.o();
            }
        } else if (TextUtils.equals("order", (String) objArr[1])) {
            if (i3uVar != null) {
                i3uVar.n((JSONObject) objArr[2]);
            }
        } else if (TextUtils.equals("cart", (String) objArr[1])) {
            if (i3uVar != null) {
                i3uVar.k((JSONObject) objArr[2]);
            }
        } else if (TextUtils.equals(ENTRY_TYPE_LIVE_CART, (String) objArr[1])) {
            if (i3uVar != null) {
                i3uVar.l((JSONObject) objArr[2]);
            }
        } else if (objArr.length > 2) {
            Object obj4 = objArr[2];
            if (obj4 instanceof JSONObject) {
                String string = ((JSONObject) obj4).getString(rg0.JUMP_URL);
                if (!TextUtils.isEmpty(string)) {
                    kkr.i().l().a(dXRuntimeContext.h(), string);
                }
                iha.k(string);
            }
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (objArr.length > 3) {
            Object obj5 = objArr[3];
            if (obj5 instanceof String) {
                hashMap.put("gl_scene", (String) obj5);
            }
        }
        if (i3uVar != null) {
            Object obj6 = objArr[1];
            if ((obj6 instanceof String) && !TextUtils.equals("more", (String) obj6)) {
                i3uVar.i();
                Object obj7 = objArr[2];
                if (obj7 instanceof JSONObject) {
                    String string2 = ((JSONObject) obj7).getString("count");
                    if (!TextUtils.isEmpty(string2)) {
                        hashMap.put(objArr[1] + "_count", string2);
                    }
                }
            }
        }
        if (kkr.i().o() != null) {
            b2e o = kkr.i().o();
            o.c("gl_entry_" + ((String) objArr[1]), hashMap);
        }
        return true;
    }
}
