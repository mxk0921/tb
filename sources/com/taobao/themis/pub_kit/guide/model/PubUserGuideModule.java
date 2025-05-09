package com.taobao.themis.pub_kit.guide.model;

import com.alibaba.fastjson.JSONObject;
import com.alipay.android.msp.constants.MspFlybirdDefine;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import tb.t2o;
import tb.wua;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\f\"\u0004\b#\u0010\u000eR\u001c\u0010$\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010\u000eR\u001c\u0010'\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\f\"\u0004\b)\u0010\u000eR\"\u0010*\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010+X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001c\u00100\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001c\u00103\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0018\"\u0004\b5\u0010\u001aR\u001c\u00106\u001a\u0004\u0018\u000107X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010<\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\f\"\u0004\b>\u0010\u000eR\u001c\u0010?\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\f\"\u0004\bA\u0010\u000eR\u001c\u0010B\u001a\u0004\u0018\u00010CX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u001c\u0010H\u001a\u0004\u0018\u00010IX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001c\u0010N\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0018\"\u0004\bP\u0010\u001aR\u001c\u0010Q\u001a\u0004\u0018\u00010RX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010T\"\u0004\bU\u0010VR\u001c\u0010W\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0018\"\u0004\bY\u0010\u001a¨\u0006Z"}, d2 = {"Lcom/taobao/themis/pub_kit/guide/model/PubUserGuideModule;", "Ljava/io/Serializable;", "()V", "addIconTips", "Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "getAddIconTips", "()Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;", "setAddIconTips", "(Lcom/taobao/themis/pub_kit/guide/model/PubAddIconTipsModel;)V", "appName", "", "getAppName", "()Ljava/lang/String;", "setAppName", "(Ljava/lang/String;)V", "authConfig", "Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;", "getAuthConfig", "()Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;", "setAuthConfig", "(Lcom/taobao/themis/pub_kit/guide/model/PubAuthConfigModel;)V", "backHomeAnim", "Lcom/alibaba/fastjson/JSONObject;", "getBackHomeAnim", "()Lcom/alibaba/fastjson/JSONObject;", "setBackHomeAnim", "(Lcom/alibaba/fastjson/JSONObject;)V", "closeButtonTip", "Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "getCloseButtonTip", "()Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;", "setCloseButtonTip", "(Lcom/taobao/themis/pub_kit/guide/model/PubCloseButtonModel;)V", "dosaLogo", "getDosaLogo", "setDosaLogo", "dosaName", "getDosaName", "setDosaName", "enableAddToTBHome", "getEnableAddToTBHome", "setEnableAddToTBHome", "expBuckets", "", "getExpBuckets", "()Ljava/util/List;", "setExpBuckets", "(Ljava/util/List;)V", "favorSimpleGuidePopup", "getFavorSimpleGuidePopup", "setFavorSimpleGuidePopup", "favorTips", "getFavorTips", "setFavorTips", "iconChangeGuidePopup", "Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "getIconChangeGuidePopup", "()Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;", "setIconChangeGuidePopup", "(Lcom/taobao/themis/pub_kit/guide/model/PubIconChangeGuidePopupModel;)V", MspFlybirdDefine.FLYBIRD_DIALOG_LOGO, "getLogo", "setLogo", "miniappId", "getMiniappId", "setMiniappId", "navbar", "Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;", "getNavbar", "()Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;", "setNavbar", "(Lcom/taobao/themis/pub_kit/guide/model/PubNavBarModel;)V", wua.KEY_PROPERTIES, "Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;", "getProperties", "()Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;", "setProperties", "(Lcom/taobao/themis/pub_kit/guide/model/PubPropertiesModel;)V", "revisitPopupByAdd", "getRevisitPopupByAdd", "setRevisitPopupByAdd", "revisitPopupByReturn", "Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "getRevisitPopupByReturn", "()Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;", "setRevisitPopupByReturn", "(Lcom/taobao/themis/pub_kit/guide/model/PubRevisitGuideModelNew;)V", "userActiveIconChangeGuidePopup", "getUserActiveIconChangeGuidePopup", "setUserActiveIconChangeGuidePopup", "themis_pub_kit_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class PubUserGuideModule implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private PubAddIconTipsModel addIconTips;
    private String appName;
    private PubAuthConfigModel authConfig;
    private JSONObject backHomeAnim;
    private PubCloseButtonModel closeButtonTip;
    private String dosaLogo;
    private String dosaName;
    private String enableAddToTBHome;
    private List<String> expBuckets;
    private JSONObject favorSimpleGuidePopup;
    private JSONObject favorTips;
    private PubIconChangeGuidePopupModel iconChangeGuidePopup;
    private String logo;
    private String miniappId;
    private PubNavBarModel navbar;
    private PubPropertiesModel properties;
    private JSONObject revisitPopupByAdd;
    private PubRevisitGuideModelNew revisitPopupByReturn;
    private JSONObject userActiveIconChangeGuidePopup;

    static {
        t2o.a(845152331);
    }

    public final PubAddIconTipsModel getAddIconTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubAddIconTipsModel) ipChange.ipc$dispatch("981f4ea", new Object[]{this});
        }
        return this.addIconTips;
    }

    public final String getAppName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("92150ca3", new Object[]{this});
        }
        return this.appName;
    }

    public final PubAuthConfigModel getAuthConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubAuthConfigModel) ipChange.ipc$dispatch("251e7172", new Object[]{this});
        }
        return this.authConfig;
    }

    public final JSONObject getBackHomeAnim() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b2bdd934", new Object[]{this});
        }
        return this.backHomeAnim;
    }

    public final PubCloseButtonModel getCloseButtonTip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubCloseButtonModel) ipChange.ipc$dispatch("6c5215ed", new Object[]{this});
        }
        return this.closeButtonTip;
    }

    public final String getDosaLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("985bf45f", new Object[]{this});
        }
        return this.dosaLogo;
    }

    public final String getDosaName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("54970b7f", new Object[]{this});
        }
        return this.dosaName;
    }

    public final String getEnableAddToTBHome() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a70e64c9", new Object[]{this});
        }
        return this.enableAddToTBHome;
    }

    public final List<String> getExpBuckets() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("40d2c0be", new Object[]{this});
        }
        return this.expBuckets;
    }

    public final JSONObject getFavorSimpleGuidePopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("1cd409b1", new Object[]{this});
        }
        return this.favorSimpleGuidePopup;
    }

    public final JSONObject getFavorTips() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("b5950b87", new Object[]{this});
        }
        return this.favorTips;
    }

    public final PubIconChangeGuidePopupModel getIconChangeGuidePopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubIconChangeGuidePopupModel) ipChange.ipc$dispatch("980f3752", new Object[]{this});
        }
        return this.iconChangeGuidePopup;
    }

    public final String getLogo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bfcecf78", new Object[]{this});
        }
        return this.logo;
    }

    public final String getMiniappId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ceb6fea", new Object[]{this});
        }
        return this.miniappId;
    }

    public final PubNavBarModel getNavbar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubNavBarModel) ipChange.ipc$dispatch("91fc8f92", new Object[]{this});
        }
        return this.navbar;
    }

    public final PubPropertiesModel getProperties() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubPropertiesModel) ipChange.ipc$dispatch("22440f52", new Object[]{this});
        }
        return this.properties;
    }

    public final JSONObject getRevisitPopupByAdd() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("610d4387", new Object[]{this});
        }
        return this.revisitPopupByAdd;
    }

    public final PubRevisitGuideModelNew getRevisitPopupByReturn() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PubRevisitGuideModelNew) ipChange.ipc$dispatch("485f5b5b", new Object[]{this});
        }
        return this.revisitPopupByReturn;
    }

    public final JSONObject getUserActiveIconChangeGuidePopup() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("ff815e67", new Object[]{this});
        }
        return this.userActiveIconChangeGuidePopup;
    }

    public final void setAddIconTips(PubAddIconTipsModel pubAddIconTipsModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aac43e60", new Object[]{this, pubAddIconTipsModel});
        } else {
            this.addIconTips = pubAddIconTipsModel;
        }
    }

    public final void setAppName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b790109b", new Object[]{this, str});
        } else {
            this.appName = str;
        }
    }

    public final void setAuthConfig(PubAuthConfigModel pubAuthConfigModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd580ad6", new Object[]{this, pubAuthConfigModel});
        } else {
            this.authConfig = pubAuthConfigModel;
        }
    }

    public final void setBackHomeAnim(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a3c0bd0", new Object[]{this, jSONObject});
        } else {
            this.backHomeAnim = jSONObject;
        }
    }

    public final void setCloseButtonTip(PubCloseButtonModel pubCloseButtonModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3630a595", new Object[]{this, pubCloseButtonModel});
        } else {
            this.closeButtonTip = pubCloseButtonModel;
        }
    }

    public final void setDosaLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fdfff1f7", new Object[]{this, str});
        } else {
            this.dosaLogo = str;
        }
    }

    public final void setDosaName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c927bed7", new Object[]{this, str});
        } else {
            this.dosaName = str;
        }
    }

    public final void setEnableAddToTBHome(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383d3c35", new Object[]{this, str});
        } else {
            this.enableAddToTBHome = str;
        }
    }

    public final void setExpBuckets(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a5c3d66", new Object[]{this, list});
        } else {
            this.expBuckets = list;
        }
    }

    public final void setFavorSimpleGuidePopup(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9a48348b", new Object[]{this, jSONObject});
        } else {
            this.favorSimpleGuidePopup = jSONObject;
        }
    }

    public final void setFavorTips(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("56971f75", new Object[]{this, jSONObject});
        } else {
            this.favorTips = jSONObject;
        }
    }

    public final void setIconChangeGuidePopup(PubIconChangeGuidePopupModel pubIconChangeGuidePopupModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ddc8b2f4", new Object[]{this, pubIconChangeGuidePopupModel});
        } else {
            this.iconChangeGuidePopup = pubIconChangeGuidePopupModel;
        }
    }

    public final void setLogo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce8a5ffe", new Object[]{this, str});
        } else {
            this.logo = str;
        }
    }

    public final void setMiniappId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2c04934", new Object[]{this, str});
        } else {
            this.miniappId = str;
        }
    }

    public final void setNavbar(PubNavBarModel pubNavBarModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("906fa2c2", new Object[]{this, pubNavBarModel});
        } else {
            this.navbar = pubNavBarModel;
        }
    }

    public final void setProperties(PubPropertiesModel pubPropertiesModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6947bc68", new Object[]{this, pubPropertiesModel});
        } else {
            this.properties = pubPropertiesModel;
        }
    }

    public final void setRevisitPopupByAdd(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e2a31b75", new Object[]{this, jSONObject});
        } else {
            this.revisitPopupByAdd = jSONObject;
        }
    }

    public final void setRevisitPopupByReturn(PubRevisitGuideModelNew pubRevisitGuideModelNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0e2986f", new Object[]{this, pubRevisitGuideModelNew});
        } else {
            this.revisitPopupByReturn = pubRevisitGuideModelNew;
        }
    }

    public final void setUserActiveIconChangeGuidePopup(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fa4677fd", new Object[]{this, jSONObject});
        } else {
            this.userActiveIconChangeGuidePopup = jSONObject;
        }
    }
}
