package com.taobao.taolive.sdk.model.message;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class TopAtmosphereMessage implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public ContentData data;
    public int msgSubType;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ContentData implements INetDataObject {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String atmosphere;
        public String backgroundImg;
        public String backgroundTitle;
        public String content;
        public String contentHash;
        public int count;
        public String countShow;
        public String iconImg;
        public int maxCount;
        public String maxCountShow;
        public long pushTime;

        static {
            t2o.a(806356347);
            t2o.a(806355930);
        }

        public ContentData() {
        }

        public String getCountShow() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("1b3e32c3", new Object[]{this});
            }
            String str = this.countShow;
            if (TextUtils.isEmpty(str) && this.count > 0) {
                str = this.count + "";
            }
            int i = this.maxCount;
            if (i <= 0 || this.count < i || TextUtils.isEmpty(this.maxCountShow)) {
                return str;
            }
            return this.maxCountShow;
        }

        public ContentData(String str, String str2, String str3, String str4) {
            this.backgroundImg = str;
            this.iconImg = str2;
            this.backgroundTitle = str3;
            this.content = str4;
        }

        public ContentData(String str, String str2, String str3, String str4, String str5, String str6) {
            this.backgroundImg = str3;
            this.backgroundTitle = str;
            this.content = str2;
            this.contentHash = str4;
            this.countShow = str6;
            this.maxCount = 1000000;
            this.maxCountShow = "999999+";
            try {
                this.count = Integer.parseInt(str5);
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum TopAtmosphereMessageType {
        UNKNOWN(-1),
        COMMENT_COMBO(20000),
        BRAND_HOT(20001),
        ANCHOR_CERTIFICATE(20002);
        
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private int value;

        TopAtmosphereMessageType(int i) {
            this.value = i;
        }

        public static /* synthetic */ int access$000(TopAtmosphereMessageType topAtmosphereMessageType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("d8b24b12", new Object[]{topAtmosphereMessageType})).intValue();
            }
            return topAtmosphereMessageType.value;
        }

        public static TopAtmosphereMessageType getMessageType(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopAtmosphereMessageType) ipChange.ipc$dispatch("dfe7338d", new Object[]{new Integer(i)});
            }
            TopAtmosphereMessageType topAtmosphereMessageType = UNKNOWN;
            switch (i) {
                case 20000:
                    return COMMENT_COMBO;
                case 20001:
                    return BRAND_HOT;
                case 20002:
                    return ANCHOR_CERTIFICATE;
                default:
                    return topAtmosphereMessageType;
            }
        }

        public static /* synthetic */ Object ipc$super(TopAtmosphereMessageType topAtmosphereMessageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/message/TopAtmosphereMessage$TopAtmosphereMessageType");
        }

        public static TopAtmosphereMessageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (TopAtmosphereMessageType) ipChange.ipc$dispatch("9a1a8665", new Object[]{str});
            }
            return (TopAtmosphereMessageType) Enum.valueOf(TopAtmosphereMessageType.class, str);
        }
    }

    static {
        t2o.a(806356346);
        t2o.a(806355930);
    }

    public static TopAtmosphereMessage buildFromAccountTag(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopAtmosphereMessage) ipChange.ipc$dispatch("4a429fbe", new Object[]{str, str2, str3, str4});
        }
        TopAtmosphereMessage topAtmosphereMessage = new TopAtmosphereMessage();
        topAtmosphereMessage.msgSubType = TopAtmosphereMessageType.access$000(TopAtmosphereMessageType.ANCHOR_CERTIFICATE);
        ContentData contentData = new ContentData(str4, str3, str, str2);
        topAtmosphereMessage.data = contentData;
        contentData.pushTime = System.currentTimeMillis();
        return topAtmosphereMessage;
    }

    public static TopAtmosphereMessage buildFromCommentCountMessage(CommentCountMessage commentCountMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopAtmosphereMessage) ipChange.ipc$dispatch("3481a39f", new Object[]{commentCountMessage});
        }
        TopAtmosphereMessage topAtmosphereMessage = new TopAtmosphereMessage();
        topAtmosphereMessage.msgSubType = TopAtmosphereMessageType.access$000(TopAtmosphereMessageType.COMMENT_COMBO);
        String str = commentCountMessage.backgroundTitle;
        CommentCountMessage.CommentCount commentCount = commentCountMessage.data;
        ContentData contentData = new ContentData(str, commentCount.content, commentCountMessage.backgroundImg, commentCount.commentHash, commentCount.count, commentCount.countShow);
        topAtmosphereMessage.data = contentData;
        contentData.atmosphere = commentCountMessage.data.atmosphere;
        contentData.pushTime = commentCountMessage.pushTime;
        return topAtmosphereMessage;
    }

    public TopAtmosphereMessageType getMessageType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TopAtmosphereMessageType) ipChange.ipc$dispatch("52b7fbcc", new Object[]{this});
        }
        return TopAtmosphereMessageType.getMessageType(this.msgSubType);
    }
}
