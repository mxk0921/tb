package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPReachViewState;
import com.taobao.homepage.pop.protocol.model.pop.IPopData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class esu implements k3e {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int CODE_ERROR = 3;
    public static final int CODE_OK = 0;
    public static final int CODE_TERMINAL = 2;
    public static final int CODE_WARNING = 1;
    public static final String ERROR_DX_RENDER_FAILED = "DxRenderFailed";
    public static final String ERROR_MSG_ANCHOR_VIEW_INVALID = "AnchorViewInvalid";
    public static final String ERROR_MSG_NO_POP_DATA = "NoPopDataError";
    public static final String ERROR_MSG_SHOW_COUNT_INVALID = "ShowCountInvalid";
    public static final String ERROR_MSG_TARGET_VIEW_ERROR = "TargetViewError";
    public static final String ERROR_OTHER_ERROR = "OtherError";
    public static final String ERROR_WEEX_RENDER_FAILED = "WeexRenderFailed";
    public static final String KEY_BIZ_CHECK = "BizCheck";
    public static final String KEY_CANCEL = "Cancel";
    public static final String KEY_CLICK = "Click";
    public static final String KEY_ERROR = "Error";
    public static final String KEY_EXPOSE = "Expose";
    public static final String KEY_PAUSE = "Stop";
    public static final String KEY_RESUME = "Resume";
    public static final String KEY_TERMINAL = "Terminal";

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f18797a;
    public final JSONObject b;
    public final k3e c;
    public boolean d;
    public boolean e;

    public esu(JSONObject jSONObject, JSONObject jSONObject2, k3e k3eVar) {
        this.f18797a = jSONObject;
        this.b = jSONObject2;
        this.c = k3eVar;
    }

    public static esu b(JSONObject jSONObject, JSONObject jSONObject2, k3e k3eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (esu) ipChange.ipc$dispatch("34e0dc55", new Object[]{jSONObject, jSONObject2, k3eVar});
        }
        return new esu(jSONObject, jSONObject2, k3eVar);
    }

    public String c() {
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("58f54ea8", new Object[]{this});
        }
        JSONObject jSONObject2 = this.f18797a;
        if (jSONObject2 == null || (jSONObject = jSONObject2.getJSONObject("ext")) == null) {
            return "";
        }
        return jSONObject.getString("businessId");
    }

    public boolean d(IPopData<?> iPopData) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("96578df8", new Object[]{this, iPopData})).booleanValue();
        }
        if (iPopData != null) {
            try {
                if (iPopData.getUCPConfig() == null || !iPopData.getUCPConfig().enable() || (jSONObject = this.f18797a) == null || (jSONObject2 = jSONObject.getJSONObject("ext")) == null) {
                    return false;
                }
                String string = jSONObject2.getString("businessId");
                if (TextUtils.isEmpty(string)) {
                    return false;
                }
                return TextUtils.equals(iPopData.getBusinessID(), string);
            } catch (Exception e) {
                vfm.d(h3b.TAG, e);
            }
        }
        return false;
    }

    public void e(String str, int i, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7b46bdb", new Object[]{this, str, new Integer(i), str2});
            return;
        }
        UCPReachViewState uCPReachViewState = new UCPReachViewState();
        uCPReachViewState.group = h3b.KEY_UCP_PROTOCOL;
        uCPReachViewState.key = str;
        uCPReachViewState.code = i;
        uCPReachViewState.msg = str2;
        uCPReachViewState.trackInfo = this.b;
        a(uCPReachViewState);
    }

    @Override // tb.k3e
    public void a(UCPReachViewState uCPReachViewState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74fcfcef", new Object[]{this, uCPReachViewState});
        } else if (uCPReachViewState != null) {
            vfm.f(h3b.TAG, "synchronizeState, key = " + uCPReachViewState.key + ", code = " + uCPReachViewState.code + ", msg = " + uCPReachViewState.msg);
            if (TextUtils.equals(uCPReachViewState.key, "Expose")) {
                if (this.e) {
                    vfm.f(h3b.TAG, "synchronizeState, already exposed");
                    return;
                }
                this.e = true;
            }
            if (TextUtils.equals(uCPReachViewState.key, KEY_BIZ_CHECK)) {
                if (this.d) {
                    vfm.f(h3b.TAG, "synchronizeState, already checked");
                    return;
                }
                this.d = true;
            }
            if (uCPReachViewState.code == 0) {
                bgm.e(uCPReachViewState.key, c(), String.valueOf(uCPReachViewState.code), uCPReachViewState.msg);
            } else {
                bgm.d(uCPReachViewState.key, c(), String.valueOf(uCPReachViewState.code), uCPReachViewState.msg);
            }
            k3e k3eVar = this.c;
            if (k3eVar != null) {
                k3eVar.a(uCPReachViewState);
            }
        }
    }
}
