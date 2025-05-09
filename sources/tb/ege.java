package tb;

import android.util.Pair;
import com.alibaba.fastjson.JSONObject;
import com.alipay.birdnest.util.UiUtil;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.external.UCPManager;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabMsgMode;
import java.util.regex.Pattern;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class ege implements fge {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Pattern b = Pattern.compile("^[1-9]\\d*$");
    public static final Pair<JSONObject, JSONObject> c = new Pair<>(new JSONObject(), new JSONObject());

    /* renamed from: a  reason: collision with root package name */
    public final Pattern f18558a = Pattern.compile(wpj.b());

    public static boolean c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1d54e55c", new Object[]{str})).booleanValue();
        }
        return b.matcher(str).matches();
    }

    public Pair<JSONObject, JSONObject> a(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("b4368f3f", new Object[]{this, str, str2, str3});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (UCPManager.e("bottomBar", str, "alienEffect", str3, jSONObject, jSONObject2)) {
            return new Pair<>(jSONObject, jSONObject2);
        }
        jhj.b("IconRuleCheckResultProvider", "Update message count failed for materialSubType is limited!" + str + " " + str3);
        return null;
    }

    public Pair<JSONObject, JSONObject> b(String str, NavigationTabMsgMode navigationTabMsgMode, String str2) {
        boolean matches;
        String str3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Pair) ipChange.ipc$dispatch("26708336", new Object[]{this, str, navigationTabMsgMode, str2});
        }
        if (str2 == null || "0".equals(str2)) {
            return c;
        }
        if (navigationTabMsgMode == NavigationTabMsgMode.DEFAULT || navigationTabMsgMode == NavigationTabMsgMode.GUARDIAN_DEFAULT) {
            matches = b.matcher(str2).matches();
            str3 = UiUtil.INPUT_TYPE_VALUE_NUM;
        } else {
            matches = this.f18558a.matcher(str2).matches();
            str3 = "text";
        }
        if (!matches) {
            String c2 = y9a.c();
            TLog.loge(c2, "IconRuleCheckResultProvider", "Update message count failed for message format error!" + str + " " + navigationTabMsgMode + " " + str2);
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        if (UCPManager.e("bottomBar", str, "commonMark", str3, jSONObject, jSONObject2)) {
            return new Pair<>(jSONObject, jSONObject2);
        }
        String c3 = y9a.c();
        TLog.loge(c3, "IconRuleCheckResultProvider", "Update message count failed for materialSubType is limited!" + str + " " + str3 + " " + str2);
        return null;
    }
}
