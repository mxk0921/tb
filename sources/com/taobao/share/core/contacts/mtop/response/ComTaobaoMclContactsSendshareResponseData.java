package com.taobao.share.core.contacts.mtop.response;

import android.text.TextUtils;
import android.util.Log;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.taobao.contacts.data.member.ShareResultMember;
import java.io.Serializable;
import mtopsdk.mtop.domain.IMTOPDataObject;
import tb.aj;
import tb.hjp;
import tb.t2o;

/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ComTaobaoMclContactsSendshareResponseData implements IMTOPDataObject, Serializable {
    private static final String TAG = "ComTaobaoMclContactsSendshareResponseData";
    public String feedId;
    public ShareResultMember[] friendList;
    public String intercept;
    public String isBizSuccess;
    public String isOpenActivity;
    public ShareResultMember[] needSendMsgList;
    public String rankPic;
    public ShareResultMember[] sendSuccessList;
    public String shareType;
    public ShareResultMember[] tf;

    static {
        t2o.a(664797236);
        t2o.a(589299906);
    }

    private String decrypt(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            str = SecurityGuardManager.getInstance(hjp.a()).getStaticDataEncryptComp().staticSafeDecrypt(16, "share_secret", str, "");
        } catch (Exception e) {
            Log.e(aj.KEY_DECRYPT, "failed : " + e.getMessage());
        }
        Log.e(aj.KEY_DECRYPT, "decrypt dst : " + str);
        return str;
    }

    private ShareResultMember[] decryptFriend(ShareResultMember[] shareResultMemberArr) {
        if (shareResultMemberArr == null) {
            return shareResultMemberArr;
        }
        for (ShareResultMember shareResultMember : shareResultMemberArr) {
            shareResultMember.setName(decrypt(shareResultMember.getName()));
            shareResultMember.setPhone(decrypt(shareResultMember.getPhone()));
            shareResultMember.setUserNick(shareResultMember.getUserId());
        }
        return shareResultMemberArr;
    }

    public String getFeedId() {
        return this.feedId;
    }

    public ShareResultMember[] getFriendList() {
        return this.friendList;
    }

    public String getIntercept() {
        return this.intercept;
    }

    public String getIsBizSuccess() {
        return this.isBizSuccess;
    }

    public String getIsOpenActivity() {
        return this.isOpenActivity;
    }

    public ShareResultMember[] getNeedSendMsgList() {
        return this.needSendMsgList;
    }

    public String getRankPic() {
        return this.rankPic;
    }

    public ShareResultMember[] getSendSuccessList() {
        return this.sendSuccessList;
    }

    public String getShareType() {
        return this.shareType;
    }

    public ShareResultMember[] getTf() {
        return this.tf;
    }

    public void setFeedId(String str) {
        this.feedId = str;
    }

    public void setFriendList(ShareResultMember[] shareResultMemberArr) {
        this.friendList = decryptFriend(shareResultMemberArr);
    }

    public void setIntercept(String str) {
        this.intercept = str;
    }

    public void setIsBizSuccess(String str) {
        this.isBizSuccess = str;
    }

    public void setIsOpenActivity(String str) {
        this.isOpenActivity = str;
    }

    public void setNeedSendMsgList(ShareResultMember[] shareResultMemberArr) {
        this.needSendMsgList = shareResultMemberArr;
    }

    public void setRankPic(String str) {
        this.rankPic = str;
    }

    public void setSendSuccessList(ShareResultMember[] shareResultMemberArr) {
        this.sendSuccessList = decryptFriend(shareResultMemberArr);
    }

    public void setShareType(String str) {
        this.shareType = str;
    }

    public void setTf(ShareResultMember[] shareResultMemberArr) {
        this.tf = shareResultMemberArr;
    }
}
