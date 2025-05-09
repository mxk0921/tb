package tb;

import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a4q {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String KEY_OPEN_SLIDE_PRE_RENDER = "openSlidePreRender";

    /* renamed from: a  reason: collision with root package name */
    public static Boolean f15542a;

    static {
        t2o.a(729809653);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5b1d053b", new Object[0])).booleanValue();
        }
        Boolean bool = f15542a;
        if (bool != null) {
            return bool.booleanValue();
        }
        Boolean valueOf = Boolean.valueOf(Boolean.parseBoolean(os6.b(KEY_OPEN_SLIDE_PRE_RENDER, null)));
        f15542a = valueOf;
        return valueOf.booleanValue();
    }

    public static void b(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7aa52f44", new Object[]{jSONObject});
            return;
        }
        boolean parseBoolean = Boolean.parseBoolean(jSONObject != null ? jSONObject.getString(KEY_OPEN_SLIDE_PRE_RENDER) : null);
        if (a() != parseBoolean) {
            fve.e("SlidePreRenderSwitchPatch", "updateSlidePreRenderSwitch isOpenSlidePreRender ：" + parseBoolean);
            f15542a = Boolean.valueOf(parseBoolean);
            os6.h(KEY_OPEN_SLIDE_PRE_RENDER, String.valueOf(parseBoolean));
        }
    }
}
