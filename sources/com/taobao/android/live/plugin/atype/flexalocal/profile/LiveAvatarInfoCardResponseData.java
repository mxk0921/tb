package com.taobao.android.live.plugin.atype.flexalocal.profile;

import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class LiveAvatarInfoCardResponseData implements INetDataObject {
    public String agencyCompany;
    public AnchorSubscribeInfo anchorSubscribeInfo;
    public List<AnchorTag> anchorTags;
    public String brief;
    public String broadCasterName;
    public String broadCasterPic;
    public List<Object> broadCasterTags;
    public boolean canShowFavoriteDesc;
    public ChatGroupInfo chatGroupInfo;
    public List<Object> countStrDetails;
    public boolean dianTaoStyle;
    public boolean follow;
    public String headAtmospherePic;
    public String headJumpUrl;
    public String managerContent;
    public String managerShop;
    public SimpleReplayLive playbackInfo;
    public PreLiveInfo preLiveInfo;
    public String shopJumpUrl;
    public ShopWindow shopWindow;
    public String sourceType;
    public boolean topFollow;
    public List<SimpleContent> videos;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class AnchorSubscribeInfo implements Serializable {
        public String jumpUrl;
        public String title;

        static {
            t2o.a(295699561);
        }

        public AnchorSubscribeInfo() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class AnchorTag implements Serializable {
        public String desc;
        public String detailDesc;
        public String detailTitle;
        public String tagName;
        public int tagType;

        static {
            t2o.a(295699562);
        }

        public AnchorTag() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class ChatGroupInfo implements Serializable {
        public static final long serialVersionUID = 1;
        public String canJoinChatGroup;
        public String chatGroupID;
        public String isInChatGroup;

        static {
            t2o.a(295699563);
        }

        public ChatGroupInfo() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class GenerateParams implements Serializable {
        public String controlName;
        public HashMap<String, String> params;

        static {
            t2o.a(295699564);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class PreLiveInfo implements Serializable {
        public String content;
        public String jumpUrl;
        public long liveId;
        public String title;

        static {
            t2o.a(295699565);
        }

        public PreLiveInfo() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ShopItem implements Serializable {
        public String itemId;
        public String itemName;
        public String itemPic;
        public String itemUrl;
        public String liveId;
        public String promotionPrice;
        public UtParams utParams;

        static {
            t2o.a(295699566);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class ShopWindow implements Serializable {
        public List<ShopItem> itemList;
        public TitleSection titleSection;
        public UtParams utParams;

        static {
            t2o.a(295699567);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class SimpleContent implements Serializable {
        public static final long serialVersionUID = 1;
        public String cover;
        public Long id;
        public String jumpUrl;
        public String name;
        public String sourceType;
        public String type;

        static {
            t2o.a(295699568);
        }

        public SimpleContent() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class SimpleReplayLive implements Serializable {
        public static final long serialVersionUID = 1;
        public String content;
        public String jumpUrl;
        public long liveId;
        public String startTime;
        public String title;

        static {
            t2o.a(295699569);
        }

        public SimpleReplayLive() {
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class TitleSection implements Serializable {
        public String desc;
        public String jumpUrl;
        public String title;

        static {
            t2o.a(295699570);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class UtParams implements Serializable {
        public GenerateParams clickParams;
        public GenerateParams showParams;

        static {
            t2o.a(295699571);
        }
    }

    static {
        t2o.a(295699558);
        t2o.a(806355930);
    }
}
