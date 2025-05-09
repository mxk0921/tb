package com.taobao.taolive.sdk.model.interact;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class MedalLevelEntity implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TYPE_FANS_LEVEL = "FansLevelMedal";
    public static final String TYPE_FAVORITE = "FavoriteMedal";
    public static final String TYPE_LEAD_BOARD = "LiveRoomRewardMedal";
    public static final String TYPE_REWARD_LEVEL = "RewardLevelMedal";
    public String bgColor;
    public boolean customized;
    public int height;
    public int level;
    public String medalIcon;
    public String medalType;
    public String text;
    public int type;
    public int width;

    static {
        t2o.a(806356297);
        t2o.a(806355930);
    }

    public static MedalLevelEntity constructFansLevelEntity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MedalLevelEntity) ipChange.ipc$dispatch("8cb45f1f", new Object[]{new Integer(i)});
        }
        MedalLevelEntity medalLevelEntity = new MedalLevelEntity();
        medalLevelEntity.medalType = TYPE_FANS_LEVEL;
        medalLevelEntity.level = i;
        return medalLevelEntity;
    }

    public static MedalLevelEntity constructFavorEntity(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MedalLevelEntity) ipChange.ipc$dispatch("a52a8c8", new Object[]{new Boolean(z)});
        }
        MedalLevelEntity medalLevelEntity = new MedalLevelEntity();
        medalLevelEntity.medalType = TYPE_FAVORITE;
        medalLevelEntity.level = z ? 1 : 0;
        return medalLevelEntity;
    }

    public static MedalLevelEntity constructLeadBoardEntity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MedalLevelEntity) ipChange.ipc$dispatch("f79e2e5", new Object[]{new Integer(i)});
        }
        MedalLevelEntity medalLevelEntity = new MedalLevelEntity();
        medalLevelEntity.medalType = TYPE_LEAD_BOARD;
        medalLevelEntity.level = i;
        return medalLevelEntity;
    }

    public static MedalLevelEntity constructRewardEntity(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (MedalLevelEntity) ipChange.ipc$dispatch("eaf5bd38", new Object[]{new Integer(i)});
        }
        MedalLevelEntity medalLevelEntity = new MedalLevelEntity();
        medalLevelEntity.medalType = TYPE_REWARD_LEVEL;
        medalLevelEntity.level = i;
        return medalLevelEntity;
    }
}
