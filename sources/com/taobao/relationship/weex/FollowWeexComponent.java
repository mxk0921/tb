package com.taobao.relationship.weex;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.relationship.module.FollowModule;
import com.taobao.relationship.view.FollowWeexButton;
import com.taobao.weex.WXSDKInstance;
import com.taobao.weex.ui.action.BasicComponentData;
import com.taobao.weex.ui.component.WXComponent;
import com.taobao.weex.ui.component.WXVContainer;
import tb.bu9;
import tb.gt9;
import tb.ht9;
import tb.pt9;
import tb.rgw;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class FollowWeexComponent extends WXComponent<FollowWeexButton> {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private FollowWeexButton mFollowButton;
    private ht9 mFollowContext;
    private FollowModule mFollowModule;
    private boolean mHasInit = false;
    private pt9 mOperateConfig;
    private bu9 mViewConfig;

    static {
        t2o.a(759169073);
    }

    public FollowWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, BasicComponentData basicComponentData, FollowModule followModule) {
        super(wXSDKInstance, wXVContainer, basicComponentData);
    }

    private void followInit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("640b4068", new Object[]{this});
            return;
        }
        FollowModule followModule = this.mFollowModule;
        if (followModule != null) {
            pt9 pt9Var = this.mOperateConfig;
            if (pt9Var != null) {
                followModule.u(pt9Var);
            }
            bu9 bu9Var = this.mViewConfig;
            if (bu9Var != null) {
                this.mFollowModule.w(bu9Var);
            }
            this.mFollowModule.i();
            this.mHasInit = true;
        }
    }

    public static /* synthetic */ Object ipc$super(FollowWeexComponent followWeexComponent, String str, Object... objArr) {
        if (str.hashCode() == -869057037) {
            super.bindData((WXComponent) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/relationship/weex/FollowWeexComponent");
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public void bindData(WXComponent wXComponent) {
        Object obj;
        Object obj2;
        Object obj3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc333df3", new Object[]{this, wXComponent});
            return;
        }
        super.bindData(wXComponent);
        if (!this.mHasInit && getAttrs() != null) {
            if (getAttrs().containsKey("params") && (obj3 = getAttrs().get("params")) != null) {
                setParams(obj3.toString());
            }
            if (getAttrs().containsKey("viewconfig") && (obj2 = getAttrs().get("viewconfig")) != null) {
                setViewconfig(obj2.toString());
            }
            if (getAttrs().containsKey("operateconfig") && (obj = getAttrs().get("operateconfig")) != null) {
                setOperateconfig(obj.toString());
            }
            followInit();
        }
    }

    public void setOperateconfig(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f261bc15", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            this.mOperateConfig = new pt9();
            if (parseObject.containsKey("cancelAutoCheckForState")) {
                this.mOperateConfig.f = parseObject.getBoolean("cancelAutoCheckForState").booleanValue();
            }
            if (parseObject.containsKey(gt9.MTOP_ISFOLLOW)) {
                this.mOperateConfig.g = parseObject.getBoolean(gt9.MTOP_ISFOLLOW).booleanValue();
            }
            if (parseObject.containsKey("hideFollowAnimation")) {
                this.mOperateConfig.b = parseObject.getBoolean("hideFollowAnimation").booleanValue();
            }
            if (parseObject.containsKey("hideUnFollowActionSheet")) {
                this.mOperateConfig.f26282a = parseObject.getBoolean("hideUnFollowActionSheet").booleanValue();
            }
            if (parseObject.containsKey("syncFollowStatus")) {
                this.mOperateConfig.e = parseObject.getBoolean("syncFollowStatus").booleanValue();
            }
            if (parseObject.containsKey("toastImgURL")) {
                this.mOperateConfig.c = parseObject.getString("toastImgURL");
            }
            if (parseObject.containsKey("cardImgURL")) {
                this.mOperateConfig.d = parseObject.getString("cardImgURL");
            }
        }
    }

    public void setParams(String str) {
        JSONObject parseObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacff519", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            this.mFollowContext = new ht9();
            if (parseObject.containsKey("accountId")) {
                this.mFollowContext.f20882a = parseObject.getLong("accountId").longValue();
            } else if (parseObject.containsKey("followedId")) {
                this.mFollowContext.f20882a = parseObject.getLong("followedId").longValue();
            }
            if (parseObject.containsKey("accountType")) {
                this.mFollowContext.b = parseObject.getInteger("accountType").intValue();
            }
            if (parseObject.containsKey("type")) {
                this.mFollowContext.g = parseObject.getInteger("type").intValue();
            }
            if (parseObject.containsKey("option")) {
                this.mFollowContext.h = parseObject.getInteger("option").intValue();
            }
            this.mFollowContext.c = parseObject.getString("originBiz");
            if (parseObject.containsKey("originPage")) {
                this.mFollowContext.d = parseObject.getString("originPage");
            }
            if (parseObject.containsKey("originFlag")) {
                this.mFollowContext.e = parseObject.getString("originFlag");
            }
            if (this.mFollowButton != null && getInstance() != null && (getInstance().getContext() instanceof Activity)) {
                this.mFollowModule = new FollowModule((Activity) getInstance().getContext(), this.mFollowContext, this.mFollowButton);
            }
        }
    }

    @Override // com.taobao.weex.ui.component.WXComponent
    public FollowWeexButton initComponentHostView(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FollowWeexButton) ipChange.ipc$dispatch("a75a9c6e", new Object[]{this, context});
        }
        FollowWeexButton followWeexButton = new FollowWeexButton(context);
        this.mFollowButton = followWeexButton;
        return followWeexButton;
    }

    public FollowWeexComponent(WXSDKInstance wXSDKInstance, WXVContainer wXVContainer, int i, BasicComponentData basicComponentData, FollowModule followModule) {
        super(wXSDKInstance, wXVContainer, i, basicComponentData);
    }

    public void setViewconfig(String str) {
        JSONObject parseObject;
        String[] split;
        String[] split2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a1aa39fa", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str) && (parseObject = JSON.parseObject(str)) != null) {
            this.mViewConfig = new bu9();
            String string = parseObject.getString("followSize");
            if (!TextUtils.isEmpty(string) && (split2 = string.split(",")) != null && split2.length >= 1) {
                this.mViewConfig.c = Integer.parseInt(split2[0]);
                this.mViewConfig.d = Integer.parseInt(split2[1]);
            }
            String string2 = parseObject.getString("unFollowSize");
            if (!TextUtils.isEmpty(string2) && (split = string2.split(",")) != null && split.length >= 1) {
                this.mViewConfig.f16638a = Integer.parseInt(split[0]);
                this.mViewConfig.b = Integer.parseInt(split[1]);
            }
            if (parseObject.containsKey("followTitleSize")) {
                this.mViewConfig.e = parseObject.getInteger("followTitleSize").intValue();
            }
            if (parseObject.containsKey("unFollowTitleSize")) {
                this.mViewConfig.f = parseObject.getInteger("unFollowTitleSize").intValue();
            }
            if (parseObject.containsKey("followImageSize")) {
                this.mViewConfig.g = parseObject.getInteger("followImageSize").intValue();
            }
            if (parseObject.containsKey("unFollowImageSize")) {
                this.mViewConfig.h = parseObject.getInteger("unFollowImageSize").intValue();
            }
            if (parseObject.containsKey("followTitleColor")) {
                this.mViewConfig.i = rgw.b(parseObject.getString("followTitleColor"));
            }
            if (parseObject.containsKey("unFollowTitleColor")) {
                this.mViewConfig.j = rgw.b(parseObject.getString("unFollowTitleColor"));
            }
            if (parseObject.containsKey("followBackgroundColor")) {
                this.mViewConfig.m = rgw.b(parseObject.getString("followBackgroundColor"));
            }
            if (parseObject.containsKey("unFollowBackgroundColor")) {
                this.mViewConfig.n = rgw.b(parseObject.getString("unFollowBackgroundColor"));
            }
            if (parseObject.containsKey("borderCornerRadius")) {
                int intValue = parseObject.getInteger("borderCornerRadius").intValue();
                bu9 bu9Var = this.mViewConfig;
                float f = intValue;
                bu9Var.q = f;
                bu9Var.r = f;
            }
            if (parseObject.containsKey("followBorderWidth")) {
                this.mViewConfig.o = parseObject.getInteger("followBorderWidth").intValue();
            }
            if (parseObject.containsKey("unFollowBorderWidth")) {
                this.mViewConfig.p = parseObject.getInteger("unFollowBorderWidth").intValue();
            }
            if (parseObject.containsKey("hasFollowIcon")) {
                this.mViewConfig.s = parseObject.getBoolean("hasFollowIcon").booleanValue();
            }
            if (parseObject.containsKey("isUnfollowGradientBackground")) {
                this.mViewConfig.t = parseObject.getBoolean("isUnfollowGradientBackground").booleanValue();
            }
            if (parseObject.containsKey("unfollowGradientLetfColor")) {
                this.mViewConfig.u = rgw.b(parseObject.getString("unfollowGradientLetfColor"));
            }
            if (parseObject.containsKey("unfollowGradientRightColor")) {
                this.mViewConfig.v = rgw.b(parseObject.getString("unfollowGradientRightColor"));
            }
        }
    }
}
