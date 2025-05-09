package com.taobao.tao.contact;

import android.text.TextUtils;
import com.alibaba.ability.localization.Localization;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.contacts.data.member.RecentMember;
import com.taobao.share.globalmodel.ComponentType;
import com.taobao.share.multiapp.ShareBizAdapter;
import com.taobao.share.ui.engine.friend.ContactInfo;
import com.taobao.tao.friends.model.ContactType;
import com.taobao.tao.friends.model.SourceType;
import com.taobao.tao.log.TLog;
import com.taobao.tao.sharepanel.weex.WeexSharePanel;
import com.taobao.taobao.R;
import com.ut.share.business.ShareTargetType;
import tb.jkp;
import tb.mjp;
import tb.rk4;
import tb.t2o;
import tb.uk4;
import tb.whp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ShareToContactHandler implements jkp.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final int SHARE_CHANNEL = 99998;
    private static final String TAG = "ShareToContactHandler";

    static {
        t2o.a(666894391);
        t2o.a(667942940);
    }

    public String getCCodeFromGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("74913019", new Object[]{this, str});
        }
        try {
            String replace = str.replace(str.substring(str.indexOf("#"), str.indexOf("#") + 2), "");
            return replace.substring(0, replace.length() - 2);
        } catch (Exception e) {
            TLog.loge(TAG, e.toString());
            return null;
        }
    }

    @Override // tb.jkp.b
    public void shareToContact(ContactInfo contactInfo) {
        whp whpVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("59d913e2", new Object[]{this, contactInfo});
            return;
        }
        rk4 wrapToContactsView = wrapToContactsView(convertContactInfoToRecentMember(contactInfo), contactInfo);
        if (wrapToContactsView != null) {
            WeexSharePanel weexSharePanel = (WeexSharePanel) ShareBizAdapter.getInstance().getShareEngine().getCurSharePanel();
            if (weexSharePanel == null) {
                whpVar = new whp();
            } else {
                whpVar = weexSharePanel.getShareActionDispatcher();
            }
            whpVar.a(new mjp(wrapToContactsView.c().desc, wrapToContactsView), ShareBizAdapter.getInstance().getAppEnv().getApplication(), Integer.parseInt(contactInfo.getPosition()));
        }
    }

    public rk4 wrapToContactsView(RecentMember recentMember, ContactInfo contactInfo) {
        SourceType sourceType;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (rk4) ipChange.ipc$dispatch("af24317e", new Object[]{this, recentMember, contactInfo});
        }
        if (recentMember == null || contactInfo == null) {
            TLog.logi(TAG, "wrapToContactsView: recentMember or contactInfo is null");
            return null;
        }
        rk4 rk4Var = new rk4();
        if (recentMember.isTaoFriend()) {
            sourceType = SourceType.RECENT;
        } else {
            sourceType = SourceType.RECOMMEND;
        }
        rk4Var.v(sourceType);
        rk4Var.f(ComponentType.CONTACT_ITEM);
        rk4Var.e(ShareTargetType.Share2Contact.getValue());
        uk4 uk4Var = new uk4(recentMember.getName(), recentMember.getHeadUrl(), recentMember.getShareChannel(), recentMember.getBizSubType());
        uk4Var.c = ContactType.CONTINGENT;
        rk4Var.o(uk4Var);
        rk4Var.r(recentMember);
        rk4Var.q(contactInfo.getPvid());
        rk4Var.t(contactInfo.getScm());
        rk4Var.u(rk4Var.m());
        return rk4Var;
    }

    public RecentMember convertContactInfoToRecentMember(ContactInfo contactInfo) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecentMember) ipChange.ipc$dispatch("2f83675a", new Object[]{this, contactInfo});
        }
        if (contactInfo == null) {
            TLog.logi(TAG, "convertContactInfoToRecentMember: contactInfo is null");
            return null;
        }
        RecentMember recentMember = new RecentMember();
        if (!TextUtils.isEmpty(contactInfo.getUserId())) {
            recentMember.setUserId(contactInfo.getUserId());
        }
        int parseInt = Integer.parseInt(contactInfo.getContactType());
        if (parseInt == 1 || parseInt == 3) {
            if (TextUtils.isEmpty(contactInfo.getUserId())) {
                TLog.logi(TAG, "convertContactInfoToRecentMember: userId is empty");
                return null;
            }
            recentMember.setUserId(contactInfo.getUserId());
            recentMember.setTaoFriendName(contactInfo.getDisplayName());
        } else if (parseInt == 2) {
            if (TextUtils.isEmpty(contactInfo.getGroupId())) {
                TLog.logi(TAG, "convertContactInfoToRecentMember: groupId is empty");
                return null;
            }
            recentMember.setCcode(getCCodeFromGroupId(contactInfo.getGroupId()));
            recentMember.setRecordNum(Integer.parseInt(contactInfo.getGroupUserNum()));
            recentMember.setTaoFriendName(contactInfo.getGroupUserNum() + Localization.q(R.string.taobao_app_1010_1_17827));
            recentMember.setUserId((String) null);
        }
        recentMember.setName(contactInfo.getDisplayName());
        recentMember.setType(Integer.parseInt(contactInfo.getContactType()));
        recentMember.setShareChannel((int) SHARE_CHANNEL);
        if (TextUtils.isEmpty(contactInfo.getHeadUrl())) {
            recentMember.setHeadUrl("http://gw.alicdn.com/tfscom/TB1R7JxIpXXXXXDXpXXazxJIVXX-144-144.png");
        } else {
            recentMember.setHeadUrl(contactInfo.getHeadUrl());
        }
        recentMember.setTaoFlag("true");
        if (Integer.parseInt(contactInfo.getSourceType()) == 3) {
            z = false;
        }
        recentMember.setTaoFriend(z);
        recentMember.setBizSubType(contactInfo.getBizSubType());
        return recentMember;
    }
}
