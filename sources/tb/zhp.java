package tb;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.family.globalbubble.GlobalWindowFactory;
import com.taobao.orange.OrangeConfig;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class zhp extends dv1 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String GB_IMQUICK_CHAT_DISMISSED = "gbIMQuickChatDismissed";
    public static final String QUICK_CHAT_URL = "https://tb.cn/n/im/dynamic/quickchat.html";
    public final boolean r = OrangeConfig.getInstance().getConfig("social_global_bubble", "showSocialBubble", "true").equals("true");

    public zhp(Context context, boolean z, int i) {
        super(context, z, i);
    }

    public static /* synthetic */ Object ipc$super(zhp zhpVar, String str, Object... objArr) {
        if (str.hashCode() == -81335666) {
            return new Boolean(super.B());
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/family/globalbubble/share/ShareBackGlobalWindow");
    }

    public String H() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b9b36c81", new Object[]{this});
        }
        JSONObject jSONObject = yca.p().l;
        String string = jSONObject == null ? null : jSONObject.getString("popPageUrl");
        return (string == null || string.contains("wh_ttid=native")) ? string : string.concat("&wh_ttid=native");
    }

    @Override // tb.dv1, tb.dac
    public void a(String str, Map<String, Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d335924c", new Object[]{this, str, map});
        } else if (GlobalWindowFactory.EVENT_SHARE_BACK_POP.equals(str)) {
            this.b.sendEmptyMessage(1);
        }
    }

    @Override // tb.dv1
    public String u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ab0b021f", new Object[]{this});
        }
        return "shareback_bubble";
    }

    @Override // tb.dv1
    public String v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8a171b2b", new Object[]{this});
        }
        return "ShareBackBubble";
    }

    @Override // tb.dv1
    public boolean B() {
        String str;
        JSONObject jSONObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb26ea8e", new Object[]{this})).booleanValue();
        }
        return super.B() || !this.r || (str = this.e) == null || (!str.equals("com.taobao.tao.detail.activity.DetailActivity") && !this.e.equals("com.taobao.android.detail.wrapper.activity.DetailActivity")) || yca.p().t(GlobalWindowFactory.WINDOW_AFFECTION) || (jSONObject = yca.p().l) == null || !jSONObject.getBooleanValue("isShowPop") || TextUtils.isEmpty(H()) || jSONObject.getJSONObject(u59.KEY_POPDATA) == null;
    }
}
