package tb;

import android.view.Menu;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.weex.WXSDKInstance;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public abstract class fzc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public interface a {
        void a(int i);
    }

    static {
        t2o.a(85983239);
    }

    public abstract euw getHeight(WXSDKInstance wXSDKInstance);

    public abstract euw getStatusBarHeight(WXSDKInstance wXSDKInstance);

    public abstract euw hasMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract euw hide(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract boolean onCreateOptionsMenu(WXSDKInstance wXSDKInstance, Menu menu);

    public abstract euw setBadgeStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract euw setLeftItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract euw setMoreItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract euw setRightItem(WXSDKInstance wXSDKInstance, JSONObject jSONObject, a aVar);

    public abstract euw setStyle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract euw setTitle(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract euw setTransparent(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public abstract euw show(WXSDKInstance wXSDKInstance, JSONObject jSONObject);

    public euw showMenu(WXSDKInstance wXSDKInstance, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (euw) ipChange.ipc$dispatch("9e4b4ac0", new Object[]{this, wXSDKInstance, jSONObject});
        }
        euw euwVar = new euw();
        euwVar.f18829a = "WX_NOT_SUPPORTED";
        euwVar.b = "Only Taobao app support showMenu(), check implement in TBNavBarAdapter";
        return euwVar;
    }
}
