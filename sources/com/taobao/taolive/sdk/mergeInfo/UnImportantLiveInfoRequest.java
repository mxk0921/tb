package com.taobao.taolive.sdk.mergeInfo;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class UnImportantLiveInfoRequest implements INetDataObject {
    public AtmosphereResourceReq atmosphereResourceReq;
    public GrowthReq growthReq;
    public IntimacyReq intimacyReq;
    public ItemCardListReq itemCardListReq;
    public MessReq messReq;
    public PopReq popReq;
    public ShareReq shareReq;
    public SlideReq slideReq;
    public TabInfoReq tabInfoReq;
    public TrivialReq trivialReq;
    public String API_NAME = "mtop.roomstudio.live.postdetail";
    public String VERSION = "1.0";
    private boolean NEED_ECODE = false;
    private boolean NEED_SESSION = false;
    public String whiteList = "";
    public String blackList = "mtop.tblive.live.growth.query,mtop.tblive.recommend.popview.query";
    public String type = "all";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class AtmosphereResourceReq implements INetDataObject {
        public String anchorId;
        public String encryptAnchorId;
        public String liveId;

        static {
            t2o.a(806356136);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class GrowthReq implements INetDataObject {
        public String liveId;
        public String liveSource;

        static {
            t2o.a(806356137);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class IntimacyReq implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean hasMember;
        public boolean member;
        private String invokeType = null;
        private String spm = null;
        private String bizCode = null;
        private String showCodes = null;
        private String source = null;
        private String targetUid = null;
        private boolean follow = false;
        private String liveId = null;
        private long roomType = 0;

        static {
            t2o.a(806356138);
            t2o.a(806355930);
        }

        public String getBizCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
            }
            return this.bizCode;
        }

        public String getInvokeType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("15c0d831", new Object[]{this});
            }
            return this.invokeType;
        }

        public String getLiveId() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3d7740fc", new Object[]{this});
            }
            return this.liveId;
        }

        public long getRoomType() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("45ab5326", new Object[]{this})).longValue();
            }
            return this.roomType;
        }

        public String getShowCodes() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8e6f7866", new Object[]{this});
            }
            return this.showCodes;
        }

        public String getSource() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3139e888", new Object[]{this});
            }
            return this.source;
        }

        public String getSpm() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d8ae70bf", new Object[]{this});
            }
            return this.spm;
        }

        public String getTargetUid() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1f69050", new Object[]{this});
            }
            return this.targetUid;
        }

        public boolean isFollow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8867c86", new Object[]{this})).booleanValue();
            }
            return this.follow;
        }

        public void setBizCode(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
            } else {
                this.bizCode = str;
            }
        }

        public void setFollow(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc90e45a", new Object[]{this, new Boolean(z)});
            } else {
                this.follow = z;
            }
        }

        public void setInvokeType(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1943b565", new Object[]{this, str});
            } else {
                this.invokeType = str;
            }
        }

        public void setLiveId(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
            } else {
                this.liveId = str;
            }
        }

        public void setRoomType(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("295f046", new Object[]{this, new Long(j)});
            } else {
                this.roomType = j;
            }
        }

        public void setShowCodes(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c1bd5038", new Object[]{this, str});
            } else {
                this.showCodes = str;
            }
        }

        public void setSource(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("95ad15ee", new Object[]{this, str});
            } else {
                this.source = str;
            }
        }

        public void setSpm(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bac89ff", new Object[]{this, str});
            } else {
                this.spm = str;
            }
        }

        public void setTargetUid(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bf19358e", new Object[]{this, str});
            } else {
                this.targetUid = str;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ItemCardListReq implements INetDataObject {
        public String creatorId;
        public String entryLiveSource;
        public String holdItemIds;
        public String interacts;
        public boolean isHighlight;
        public String itemHoldType;
        public String itemTransferInfo;
        public String liveId;
        public String liveSource;
        public boolean needRecommendItem;
        public String todayExposureCount;

        static {
            t2o.a(806356139);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class MessReq implements INetDataObject {
        public String accountStays;
        public String creatorId = null;
        public String liveId;
        public long n;
        public long s;
        public String serviceVersion;
        public String type;

        static {
            t2o.a(806356140);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class PopReq implements INetDataObject {
        public String accountId = null;
        public String spm = null;
        public String liveSource = null;
        public String entryLiveSource = null;
        public String itemIds = null;
        public String entrySpm = null;
        public String liveId = "";
        public String shareType = null;
        public String query = null;
        public String switchIndex = null;
        public String recExtParams = null;
        public String s = "1";
        public String n = "10";
        public String expInfoList = null;

        static {
            t2o.a(806356141);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ShareReq implements INetDataObject {
        public String anchorId;
        public String liveId;
        public String liveSource;

        static {
            t2o.a(806356142);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class SlideReq implements INetDataObject {
        public String anchorId;
        public String appVersion = "20240713";
        public String entryLiveId;
        public String entryLiveSource;
        public String entrySpm;
        public String extendParams;
        public String liveId;
        public String liveSource;
        public boolean needRec;
        public String tppParam;

        static {
            t2o.a(806356143);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TabInfoReq implements INetDataObject {
        public String anchorId;
        public String appVersion = "20240713";
        public String liveId;
        public String useWelfareCenterEntry;

        static {
            t2o.a(806356144);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class TrivialReq implements INetDataObject {
        public String creatorId;
        public String liveId;

        static {
            t2o.a(806356145);
            t2o.a(806355930);
        }
    }

    static {
        t2o.a(806356135);
        t2o.a(806355930);
    }
}
