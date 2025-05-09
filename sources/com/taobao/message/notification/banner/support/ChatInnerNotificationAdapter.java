package com.taobao.message.notification.banner.support;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.view.View;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.taobao.android.nav.Nav;
import com.taobao.message.notification.banner.InnerNotificationAdapter;
import com.taobao.message.notification.banner.InnerPushVO;
import com.taobao.message.notification.banner.view.DefaultBannerView;
import com.taobao.message.notification.constans.SettingContants;
import com.taobao.message.notification.util.EnvUtil;
import com.taobao.message.notification.util.ParseUtil;
import com.taobao.statistic.TBS;
import com.ut.mini.UTAnalytics;
import java.util.HashMap;
import java.util.Map;
import org.android.agoo.common.AgooConstants;
import tb.s0j;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ChatInnerNotificationAdapter extends InnerNotificationAdapter {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String mBizType;
    private String mMsgId;
    private String mMsgType;
    private String mTemplateId;
    private long mTime;
    private String mUrl;

    static {
        t2o.a(610271257);
    }

    public ChatInnerNotificationAdapter(Context context, InnerPushVO innerPushVO) {
        super(context, innerPushVO);
        Map<String, String> parseBody = ParseUtil.parseBody(innerPushVO.mParam.getString(AgooConstants.MESSAGE_BODY));
        if (parseBody != null) {
            this.mMsgId = parseBody.get("messageId");
            this.mBizType = parseBody.get("bizType");
            this.mTemplateId = parseBody.get("templateId");
            this.mMsgType = parseBody.get("msg_type_id");
            String str = parseBody.get("jump_url");
            this.mUrl = str;
            if (TextUtils.isEmpty(str)) {
                this.mUrl = parseBody.get("url");
            }
        }
        this.mTime = System.currentTimeMillis();
        onInitUT();
    }

    public static /* synthetic */ Object ipc$super(ChatInnerNotificationAdapter chatInnerNotificationAdapter, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1912803358) {
            super.onClick((View) objArr[0]);
            return null;
        } else if (hashCode == -1865040893) {
            super.onShow();
            return null;
        } else if (hashCode == -893949262) {
            super.onDismiss();
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/message/notification/banner/support/ChatInnerNotificationAdapter");
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        DefaultBannerView.ViewDataModel viewDataModel = new DefaultBannerView.ViewDataModel();
        viewDataModel.mContext = this.mContext.getApplicationContext();
        InnerPushVO innerPushVO = this.mVO;
        viewDataModel.mIcon = innerPushVO.iconUrl;
        viewDataModel.mTitle = innerPushVO.title;
        viewDataModel.mContent = innerPushVO.content;
        viewDataModel.mGoodsUrl = innerPushVO.img;
        viewDataModel.mTime = this.mTime;
        return DefaultBannerView.build(viewDataModel).getView();
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public boolean needShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("47da8fbe", new Object[]{this})).booleanValue();
        }
        if (PreferenceManager.getDefaultSharedPreferences(this.mContext.getApplicationContext()).getInt(SettingContants.IS_IM_NOTIFICATION, 1) == 1) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
            return;
        }
        super.onClick(view);
        onClickUT();
        Activity topActivity = EnvUtil.getTopActivity();
        String urlSplicingFromParam = ParseUtil.urlSplicingFromParam(this.mUrl);
        if (topActivity == null) {
            Nav.from(this.mContext.getApplicationContext()).disableTransition().withFlags(65536).toUri(urlSplicingFromParam);
        } else if (!topActivity.isFinishing()) {
            Nav.from(topActivity).withFlags(65536).disableTransition().toUri(urlSplicingFromParam);
        }
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onDismiss() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cab76ab2", new Object[]{this});
        } else {
            super.onDismiss();
        }
    }

    public void onInitUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d813dff5", new Object[]{this});
            return;
        }
        TBS.Ext.commitEvent("Page_Extend", 2201, "SendTaoMessage", "Type=" + this.mMsgType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    @Override // com.taobao.message.notification.banner.InnerNotificationAdapter, com.taobao.message.notification.banner.IInnerNotificationAdapter
    public void onShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90d5bc03", new Object[]{this});
            return;
        }
        super.onShow();
        onShowUT();
    }

    public void onClickUT() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e1d2fcf", new Object[]{this});
            return;
        }
        String str = "agoo^cc^" + this.mMsgId;
        String str2 = this.mMsgId;
        String str3 = this.mBizType;
        String str4 = this.mTemplateId;
        Bundle bundle = this.mVO.mParam;
        EnvUtil.UTClick(EnvUtil.createUTData(str, str2, str3, "1", str4, String.valueOf(bundle != null ? bundle.get("source") : null), null), 1, null);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(s0j.MTS_TAG_CLICK_TIME, (Object) String.valueOf(System.currentTimeMillis()));
        jSONObject.put(PushConstants.KEY_PUSH_ID, (Object) ("agoo^0^" + this.mMsgId));
        jSONObject.put("messageId", (Object) this.mMsgId);
        jSONObject.put("bizType", (Object) this.mBizType);
        jSONObject.put("messageType", (Object) this.mTemplateId);
        jSONObject.put("innerPush", (Object) "1");
        jSONObject.put("pushMsgId", (Object) ("sync^cc^" + this.mMsgId));
        UTAnalytics.getInstance().getDefaultTracker().updateNextPageUtparam(jSONObject.toJSONString());
        TBS.Ext.commitEvent("Page_Extend", 2101, "ClickTaoMessage", "Type=" + this.mBizType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }

    public void onShowUT() {
        Bundle bundle;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7517022", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        InnerPushVO innerPushVO = this.mVO;
        if (!(innerPushVO == null || (bundle = innerPushVO.mParam) == null)) {
            if (bundle.getBoolean("is_agoo_notify")) {
                str = "true";
            } else {
                str = "false";
            }
            hashMap.put("is_agoo_notify", str);
        }
        String str2 = "agoo^cc^" + this.mMsgId;
        String str3 = this.mMsgId;
        String str4 = this.mBizType;
        String str5 = this.mTemplateId;
        Bundle bundle2 = this.mVO.mParam;
        EnvUtil.UTShow(EnvUtil.createUTData(str2, str3, str4, "1", str5, String.valueOf(bundle2 != null ? bundle2.get("source") : null), hashMap), 1, null);
        TBS.Ext.commitEvent("Page_Extend", 2001, "ShowTaoMessage", "Type=" + this.mBizType, "msgid=" + this.mMsgId, "isBackground=" + EnvUtil.isAppBackGround());
    }
}
