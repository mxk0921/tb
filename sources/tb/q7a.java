package tb;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.searchbaseframe.ace.model.JsonRpcRequest;
import com.taobao.android.searchbaseframe.uikit.screentype.ScreenType;
import com.taobao.message.sp.framework.model.SimpleProfile;
import com.taobao.weex.utils.tools.TimeCalculator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class q7a extends nw1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(993001609);
    }

    public static /* synthetic */ Object ipc$super(q7a q7aVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/searchbaseframe/ace/rpc/method/GetInfoMethod");
    }

    /* renamed from: c */
    public Object b(JsonRpcRequest jsonRpcRequest) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("963513dc", new Object[]{this, jsonRpcRequest});
        }
        Context a2 = t70.c().a();
        Point point = new Point();
        ((WindowManager) a2.getSystemService(pg1.ATOM_EXT_window)).getDefaultDisplay().getSize(point);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", (Object) qxv.c(a2));
        jSONObject.put("packageType", (Object) qxv.d(a2));
        jSONObject.put(SimpleProfile.KEY_DISPLAYNAME, (Object) qxv.b(a2));
        jSONObject.put("os", (Object) TimeCalculator.PLATFORM_ANDROID);
        jSONObject.put("deviceName", (Object) Build.DEVICE);
        jSONObject.put("screenHeight", (Object) String.valueOf(point.y));
        jSONObject.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) String.valueOf(point.x));
        jSONObject.put("systemVersion", (Object) Build.VERSION.RELEASE);
        jSONObject.put("isFoldable", (Object) String.valueOf(ScreenType.IS_FOLDABLE));
        jSONObject.put("isPad", (Object) String.valueOf(ScreenType.IS_PAD));
        jSONObject.put(k7m.KEY_DEVICE_TYPE, (Object) ScreenType.d());
        yko g = j3p.g();
        if (g != null) {
            jSONObject.put("sversion", (Object) g.g().a());
            jSONObject.put("utdid", (Object) g.g().getUtdid());
        }
        return jSONObject;
    }
}
