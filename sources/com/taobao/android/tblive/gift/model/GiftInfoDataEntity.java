package com.taobao.android.tblive.gift.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.o9c;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class GiftInfoDataEntity implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public String animationImg;
    public String animationMp4;
    public String backgroundEndColor;
    public String backgroundStartColor;
    public String comboId;
    public int comboNum;
    public String contentCenter;
    public String contentPrefix;
    public String contentType;
    public int giftCount;
    public long giftGradeScore;
    public String giftIcon;
    public int giftId;
    public int giftLevel;
    public String giftName;
    public JSONObject giftPlayFinishAction;
    public int giftPrice;
    public long giftScore;
    public String giftSendScene;
    public String giftSourceType;
    public int giftType;
    public String headImg;
    public String limitRules;
    public String masterAnimationMp4;
    public String namingImg;
    public String nickName;
    public int price;
    public String scoreUnit;
    public int sendType;
    public String senderId;
    public String utdid;

    static {
        t2o.a(806355323);
    }

    public static TBLiveGiftEntity transferToGiftEntity(String str, o9c o9cVar, String str2) {
        PMGiftMsgDataEntity pMGiftMsgDataEntity;
        GiftInfoDataEntity giftEffectInfo;
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TBLiveGiftEntity) ipChange.ipc$dispatch("b1de34c2", new Object[]{str, o9cVar, str2});
        }
        if (TextUtils.isEmpty(str) || o9cVar == null) {
            return null;
        }
        try {
            pMGiftMsgDataEntity = (PMGiftMsgDataEntity) JSON.parseObject(str, PMGiftMsgDataEntity.class);
        } catch (Throwable unused) {
            pMGiftMsgDataEntity = null;
        }
        if (pMGiftMsgDataEntity == null || (giftEffectInfo = pMGiftMsgDataEntity.getGiftEffectInfo()) == null) {
            return null;
        }
        TBLiveGiftEntity tBLiveGiftEntity = new TBLiveGiftEntity();
        tBLiveGiftEntity.mSenderNick = giftEffectInfo.nickName;
        tBLiveGiftEntity.mMsgId = str2;
        tBLiveGiftEntity.mGiftId = giftEffectInfo.giftId;
        tBLiveGiftEntity.mGiftName = giftEffectInfo.giftName;
        tBLiveGiftEntity.mGiftCount = giftEffectInfo.giftCount;
        tBLiveGiftEntity.mGiftType = giftEffectInfo.giftType;
        tBLiveGiftEntity.mGiftLevel = giftEffectInfo.giftLevel;
        tBLiveGiftEntity.mGiftSourceType = giftEffectInfo.giftSourceType;
        tBLiveGiftEntity.mIcon = giftEffectInfo.giftIcon;
        tBLiveGiftEntity.mPrice = giftEffectInfo.price;
        tBLiveGiftEntity.mHeadImg = giftEffectInfo.headImg;
        tBLiveGiftEntity.mShowMills = o9cVar.i();
        tBLiveGiftEntity.mEnableShowSmallGiftView = true;
        tBLiveGiftEntity.mAnimationImg = giftEffectInfo.animationImg;
        tBLiveGiftEntity.mAnimationMp4 = giftEffectInfo.animationMp4;
        if (!TextUtils.equals(o9cVar.l(), giftEffectInfo.utdid) && !TextUtils.equals(o9cVar.getUserId(), giftEffectInfo.senderId)) {
            z = false;
        }
        tBLiveGiftEntity.mIsSelfGift = z;
        tBLiveGiftEntity.buildPoolTime = System.currentTimeMillis();
        tBLiveGiftEntity.mExpireTime = o9cVar.e();
        if (TextUtils.isEmpty(giftEffectInfo.backgroundStartColor)) {
            giftEffectInfo.backgroundStartColor = "#66000000";
        }
        if (TextUtils.isEmpty(giftEffectInfo.backgroundEndColor)) {
            giftEffectInfo.backgroundEndColor = "#20000000";
        }
        tBLiveGiftEntity.originGiftData = (JSONObject) JSON.toJSON(giftEffectInfo);
        tBLiveGiftEntity.mComboId = giftEffectInfo.comboId;
        tBLiveGiftEntity.mComboNum = giftEffectInfo.comboNum;
        tBLiveGiftEntity.mMasterAnimationMP4 = giftEffectInfo.masterAnimationMp4;
        tBLiveGiftEntity.mLimitRules = giftEffectInfo.limitRules;
        tBLiveGiftEntity.mContentCenter = giftEffectInfo.contentCenter;
        tBLiveGiftEntity.mContentType = giftEffectInfo.contentType;
        tBLiveGiftEntity.mSendType = giftEffectInfo.sendType;
        tBLiveGiftEntity.mGiftSendScene = giftEffectInfo.giftSendScene;
        tBLiveGiftEntity.mGiftPlayFinishAction = giftEffectInfo.giftPlayFinishAction;
        tBLiveGiftEntity.mNamingImg = giftEffectInfo.namingImg;
        return tBLiveGiftEntity;
    }

    public String getAnimationImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8dbbc604", new Object[]{this});
        }
        return this.animationImg;
    }

    public String getAnimationMp4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8fb29f96", new Object[]{this});
        }
        return this.animationMp4;
    }

    public String getBackgroundEndColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("609ea9ed", new Object[]{this});
        }
        return this.backgroundEndColor;
    }

    public String getBackgroundStartColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3aaf9bb4", new Object[]{this});
        }
        return this.backgroundStartColor;
    }

    public String getComboId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5b369dc6", new Object[]{this});
        }
        return this.comboId;
    }

    public int getComboNum() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a5cbba08", new Object[]{this})).intValue();
        }
        return this.comboNum;
    }

    public String getContentCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("adbf3f81", new Object[]{this});
        }
        return this.contentCenter;
    }

    public String getContentPrefix() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("91069164", new Object[]{this});
        }
        return this.contentPrefix;
    }

    public String getContentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7290f8fc", new Object[]{this});
        }
        return this.contentType;
    }

    public int getGiftCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a84c7f03", new Object[]{this})).intValue();
        }
        return this.giftCount;
    }

    public long getGiftGradeScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1d052f3c", new Object[]{this})).longValue();
        }
        return this.giftGradeScore;
    }

    public String getGiftIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("17cc3d1a", new Object[]{this});
        }
        return this.giftIcon;
    }

    public int getGiftId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e611f55b", new Object[]{this})).intValue();
        }
        return this.giftId;
    }

    public int getGiftLevel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f50286f8", new Object[]{this})).intValue();
        }
        return this.giftLevel;
    }

    public String getGiftName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("65a3de48", new Object[]{this});
        }
        return this.giftName;
    }

    public JSONObject getGiftPlayFinishAction() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("d1d4a5ea", new Object[]{this});
        }
        return this.giftPlayFinishAction;
    }

    public int getGiftPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d906323d", new Object[]{this})).intValue();
        }
        return this.giftPrice;
    }

    public long getGiftScore() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d69ff307", new Object[]{this})).longValue();
        }
        return this.giftScore;
    }

    public String getGiftSendScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("dfc92edb", new Object[]{this});
        }
        return this.giftSendScene;
    }

    public String getGiftSourceType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("da6d759e", new Object[]{this});
        }
        return this.giftSourceType;
    }

    public int getGiftType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("eaf7167a", new Object[]{this})).intValue();
        }
        return this.giftType;
    }

    public String getHeadImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ea1578c", new Object[]{this});
        }
        return this.headImg;
    }

    public String getLimitRules() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82735847", new Object[]{this});
        }
        return this.limitRules;
    }

    public String getMasterAnimationMp4() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("151f29d4", new Object[]{this});
        }
        return this.masterAnimationMp4;
    }

    public String getNamingImg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("2ec6cb4", new Object[]{this});
        }
        return this.namingImg;
    }

    public String getNickName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca3bff75", new Object[]{this});
        }
        return this.nickName;
    }

    public int getPrice() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("80a6da8d", new Object[]{this})).intValue();
        }
        return this.price;
    }

    public String getScoreUnit() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fa9b9a79", new Object[]{this});
        }
        return this.scoreUnit;
    }

    public int getSendType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("51bca4d2", new Object[]{this})).intValue();
        }
        return this.sendType;
    }

    public String getSenderId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e603eb13", new Object[]{this});
        }
        return this.senderId;
    }

    public String getUtdid() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3fdfad6f", new Object[]{this});
        }
        return this.utdid;
    }

    public void setAnimationImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ba5b6ef2", new Object[]{this, str});
        } else {
            this.animationImg = str;
        }
    }

    public void setAnimationMp4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73fc7a0", new Object[]{this, str});
        } else {
            this.animationMp4 = str;
        }
    }

    public void setBackgroundEndColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17084f29", new Object[]{this, str});
        } else {
            this.backgroundEndColor = str;
        }
    }

    public void setBackgroundStartColor(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff8d8342", new Object[]{this, str});
        } else {
            this.backgroundStartColor = str;
        }
    }

    public void setComboId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12a0a3d8", new Object[]{this, str});
        } else {
            this.comboId = str;
        }
    }

    public void setComboNum(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6826202", new Object[]{this, new Integer(i)});
        } else {
            this.comboNum = i;
        }
    }

    public void setContentCenter(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3ec8927d", new Object[]{this, str});
        } else {
            this.contentCenter = str;
        }
    }

    public void setContentPrefix(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c46b7cfa", new Object[]{this, str});
        } else {
            this.contentPrefix = str;
        }
    }

    public void setContentType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f7455562", new Object[]{this, str});
        } else {
            this.contentType = str;
        }
    }

    public void setGiftCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("293a3dff", new Object[]{this, new Integer(i)});
        } else {
            this.giftCount = i;
        }
    }

    public void setGiftGradeScore(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d1e5eff0", new Object[]{this, new Long(j)});
        } else {
            this.giftGradeScore = j;
        }
    }

    public void setGiftIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c98c09c", new Object[]{this, str});
        } else {
            this.giftIcon = str;
        }
    }

    public void setGiftId(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("72929e0f", new Object[]{this, new Integer(i)});
        } else {
            this.giftId = i;
        }
    }

    public void setGiftLevel(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("734534aa", new Object[]{this, new Integer(i)});
        } else {
            this.giftLevel = i;
        }
    }

    public void setGiftName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9b5452e", new Object[]{this, str});
        } else {
            this.giftName = str;
        }
    }

    public void setGiftPlayFinishAction(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("100521da", new Object[]{this, jSONObject});
        } else {
            this.giftPlayFinishAction = jSONObject;
        }
    }

    public void setGiftPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb6f205", new Object[]{this, new Integer(i)});
        } else {
            this.giftPrice = i;
        }
    }

    public void setGiftScore(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c5554e1d", new Object[]{this, new Long(j)});
        } else {
            this.giftScore = j;
        }
    }

    public void setGiftSendScene(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4dfc8e63", new Object[]{this, str});
        } else {
            this.giftSendScene = str;
        }
    }

    public void setGiftSourceType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("840d5f98", new Object[]{this, str});
        } else {
            this.giftSourceType = str;
        }
    }

    public void setGiftType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6c293d0", new Object[]{this, new Integer(i)});
        } else {
            this.giftType = i;
        }
    }

    public void setHeadImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c8d22d2", new Object[]{this, str});
        } else {
            this.headImg = str;
        }
    }

    public void setLimitRules(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42e1380f", new Object[]{this, str});
        } else {
            this.limitRules = str;
        }
    }

    public void setMasterAnimationMp4(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f297cc22", new Object[]{this, str});
        } else {
            this.masterAnimationMp4 = str;
        }
    }

    public void setNamingImg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcdee5aa", new Object[]{this, str});
        } else {
            this.namingImg = str;
        }
    }

    public void setNickName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82149a1", new Object[]{this, str});
        } else {
            this.nickName = str;
        }
    }

    public void setPrice(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c25939b5", new Object[]{this, new Integer(i)});
        } else {
            this.price = i;
        }
    }

    public void setScoreUnit(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db157085", new Object[]{this, str});
        } else {
            this.scoreUnit = str;
        }
    }

    public void setSendType(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78aed078", new Object[]{this, new Integer(i)});
        } else {
            this.sendType = i;
        }
    }

    public void setSenderId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6556d1c3", new Object[]{this, str});
        } else {
            this.senderId = str;
        }
    }

    public void setUtdid(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ee964f", new Object[]{this, str});
        } else {
            this.utdid = str;
        }
    }
}
