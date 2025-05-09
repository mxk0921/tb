package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.widget.DXWidgetNode;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class dkv extends m8<tk6> {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String UPDATEMAPAREAHEIGHT = "472344406834477190";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements w8 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(713031767);
            t2o.a(336592930);
        }

        /* renamed from: a */
        public dkv build(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (dkv) ipChange.ipc$dispatch("1e8fbb94", new Object[]{this, obj});
            }
            return new dkv();
        }
    }

    static {
        t2o.a(713031766);
    }

    public static /* synthetic */ Object ipc$super(dkv dkvVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/order/bundle/dinamicX/ability/UpdateMapAreaInfoAbility");
    }

    /* renamed from: i */
    public c8 f(n8 n8Var, tk6 tk6Var, u8 u8Var) {
        Throwable th;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (c8) ipChange.ipc$dispatch("f0bde67e", new Object[]{this, n8Var, tk6Var, u8Var});
        }
        JSONObject jSONObject = null;
        if (!(n8Var == null || n8Var.h() == null || tk6Var == null)) {
            JSONObject h = n8Var.h();
            String string = h.getString("height");
            String string2 = h.getString("nodeUserId");
            String string3 = h.getString("showLabel");
            if (TextUtils.isEmpty(string2)) {
                return new f8(null);
            }
            try {
                DXWidgetNode queryWidgetNodeByUserId = tk6Var.p().L().getFlattenWidgetNode().queryWidgetNodeByUserId(string2);
                if (queryWidgetNodeByUserId instanceof nub) {
                    try {
                        if (!TextUtils.isEmpty(string)) {
                            int f = pb6.f(tk6Var.d(), Float.parseFloat(string));
                            if (f > 0) {
                                ((nub) queryWidgetNodeByUserId).setCurrentMapRect(f);
                            }
                            JSONObject jSONObject2 = new JSONObject();
                            try {
                                jSONObject2.put("yOffset", (Object) string);
                                jSONObject = jSONObject2;
                            } catch (Throwable th2) {
                                th = th2;
                                jSONObject = jSONObject2;
                                lor.c("UpdateMapHeight", "updateMapRect-error", th.toString());
                                return new f8(jSONObject);
                            }
                        }
                        ((nub) queryWidgetNodeByUserId).showMapText(!"false".equals(string3));
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (NullPointerException e) {
                lor.c("UpdateMapHeight", "updateMapRect-NullPointer", e.toString());
                return new f8(null);
            }
        }
        return new f8(jSONObject);
    }
}
