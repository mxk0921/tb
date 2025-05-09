package tb;

import com.alibaba.ability.localization.Localization;
import com.alibaba.ability.localization.constants.Language;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.base.Versions;
import com.taobao.android.task.Coordinator;
import com.taobao.message.lab.comfrm.StdActions;
import com.taobao.message.lab.comfrm.core.Action;
import com.taobao.message.lab.comfrm.core.ActionDispatcher;
import com.taobao.message.lab.comfrm.inner2.Command;
import com.taobao.message.lab.comfrm.inner2.Source;
import com.taobao.mytaobao.base.MtbGlobalEnv;
import com.taobao.tao.Globals;
import com.taobao.taobao.R;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class cbx implements Source<JSONObject> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public ActionDispatcher f16966a;
    public final JSONObject b = new JSONObject();
    public final int c = 5;
    public final long d = 500;
    public int e;
    public long f;

    static {
        t2o.a(745537852);
        t2o.a(537919645);
    }

    public final JSONObject a(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1ba8c9e8", new Object[]{this, str, str2});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put((JSONObject) "spm", str2);
        return gl6.Companion.a("Page_MYTBSettingVC_aboutTB", str, jSONObject);
    }

    public final boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a45694f2", new Object[]{this})).booleanValue();
        }
        return Versions.isDebug();
    }

    public final String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa7cfaf0", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("SoftwareLicense_");
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        sb.append(h.getTag());
        String f = ih4.f(sb.toString(), "");
        if (f != null && f.length() != 0) {
            return f;
        }
        if (Localization.h() == Language.SIMPLIFIED_CHINESE) {
            return "http://terms.alicdn.com/legal-agreement/terms/suit_bu1_taobao/suit_bu1_taobao201901082305_94250.html";
        }
        return "https://terms.alicdn.com/legal-agreement/terms/c_end_product_protocol/20240707181310588/20240707181310588.html";
    }

    public final String d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("109f2d7c", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("CopyrightInformation_");
        Language h = Localization.h();
        ckf.c(h, "Localization.getLanguage()");
        sb.append(h.getTag());
        String f = ih4.f(sb.toString(), "");
        if (f != null && f.length() != 0) {
            return f;
        }
        if (Localization.h() == Language.SIMPLIFIED_CHINESE) {
            return "http://h5.m.taobao.com/other/android_legal.html";
        }
        return "https://h5.m.taobao.com/other/ios_legal.html?ut_sk=1.ZQ13pploqAcDAHqcg58cySy1_21380790_1716197474350.Copy.windvane&suid=B13A2B9E-ACFC-4ECD-B226-2E5ECB39ACF5&sourceType=other&ttid=201200%40taobao_iphone_10.35.30&un=37ea548c8b25c9fe686897b71d2d2124&share_crt_v=1&un_site=0&spm=a2159r.13376460.0.0&sp_tk=YXpxWVdGeWU2OU8%3D&cpp=1&shareurl=true&short_name=h.g2xtOjz&bxsign=scdAKCk-iFrvXsOIW82pVUdKhAwZVmPbhPLCpKyFjU2VcBEYYf7y0CbXjdcXbepvL1x1Yo6Azo9bnkKKIbVMQDhcqFI_09BoyT9neWWRHLtlbvNTlyaQsx4qL_VsWWRqpx2&app=chrome";
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void dispose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            this.f16966a = null;
        }
    }

    public final String e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("134d0c8b", new Object[]{this, new Integer(i)});
        }
        String string = Globals.getApplication().getString(i);
        ckf.c(string, "Globals.getApplication().getString(resId)");
        return string;
    }

    public final void f() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1ae4861", new Object[]{this});
            return;
        }
        this.b.put((JSONObject) "title", Localization.q(R.string.mt_aboutMTTitle));
        JSONObject jSONObject = this.b;
        jSONObject.put((JSONObject) "version", e(R.string.mt_version) + " " + Globals.getVersionName());
        g(b(), this.b);
        JSONObject jSONObject2 = this.b;
        if (MtbGlobalEnv.t()) {
            str = "false";
        } else {
            str = "true";
        }
        jSONObject2.put((JSONObject) "hasVersionUpdate", str);
        if (!MtbGlobalEnv.t()) {
            Coordinator.execute(bbx.INSTANCE);
        }
        this.b.put((JSONObject) "goCommentTxt", Localization.q(R.string.mt_aboutMTToEvaluate));
        this.b.put((JSONObject) "applicationLink", "market://details?id=com.taobao.taobao");
        this.b.put((JSONObject) "goCommentUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_去评价", "a2141.20998086.4.2"));
        this.b.put((JSONObject) "versionUpdateTxt", Localization.q(R.string.mt_aboutMTVersionUpdate));
        this.b.put((JSONObject) "versionUpdateUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_版本更新", "a2141.20998086.4.3"));
        this.b.put((JSONObject) "copyRightTxt", Localization.q(R.string.mt_aboutMTCopyrightInfo));
        this.b.put((JSONObject) "copyRightNavUrl", d());
        this.b.put((JSONObject) "copyRightUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_版权信息", "a2141.20998086.4.4"));
        this.b.put((JSONObject) "appPolicyTxt", Localization.q(R.string.mt_aboutMTSoftwareLicense));
        this.b.put((JSONObject) "appPolicyNavUrl", c());
        this.b.put((JSONObject) "appPolicyUserTrack", (String) a("Page_MYTBSettingVC_aboutTB_软件许可使用协议", "a2141.20998086.4.6"));
        this.b.put((JSONObject) "fillCodeTxt", ih4.f("fillCodeTxt", Localization.q(R.string.mt_aboutMTCasenumber)));
        this.b.put((JSONObject) "fillCodeNavUrl", ih4.f("fillCodeUrl", "https://beian.miit.gov.cn"));
        this.b.put((JSONObject) "lastText", "");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put((JSONObject) "info", (String) this.b);
        ActionDispatcher actionDispatcher = this.f16966a;
        if (actionDispatcher != null) {
            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject3).build());
        }
    }

    public final void g(boolean z, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc3b634b", new Object[]{this, new Boolean(z), jSONObject});
        } else if (z) {
            jSONObject.put((JSONObject) "builderId", "Build id: " + Globals.getApplication().getString(R.string.packageTag));
        } else {
            jSONObject.put((JSONObject) "builderId", "");
        }
    }

    /* renamed from: h */
    public JSONObject updateOriginalData(Action action, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("f961e72e", new Object[]{this, action, jSONObject});
        }
        ckf.h(action, "updateAction");
        return null;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void subscribe(ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c519475", new Object[]{this, actionDispatcher});
            return;
        }
        ckf.h(actionDispatcher, "actionDispatcher");
        this.f16966a = actionDispatcher;
    }

    @Override // com.taobao.message.lab.comfrm.inner2.Source
    public void use(Command command, Map<String, Object> map, ActionDispatcher actionDispatcher) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c1c59d34", new Object[]{this, command, map, actionDispatcher});
            return;
        }
        ckf.h(command, "command");
        ckf.h(map, "props");
        String name = command.getName();
        if (name != null) {
            int hashCode = name.hashCode();
            if (hashCode != 254455115) {
                if (hashCode == 907028016 && name.equals("clickVersion") && !b() && this.e > -1) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j = this.f;
                    if (j > 0 && currentTimeMillis - j > this.d) {
                        this.e = 0;
                    }
                    int i = this.e + 1;
                    this.e = i;
                    this.f = currentTimeMillis;
                    if (i >= this.c) {
                        this.e = -1;
                        g(true, this.b);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "info", (String) this.b);
                        if (actionDispatcher != null) {
                            actionDispatcher.dispatch(new Action.Build(StdActions.UPDATE_ORIGINAL_DATA).data(jSONObject).build());
                        }
                    }
                }
            } else if (name.equals(StdActions.COMMAND_INIT_SOURCE)) {
                f();
            }
        }
    }
}
