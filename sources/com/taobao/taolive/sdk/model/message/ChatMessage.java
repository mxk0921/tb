package com.taobao.taolive.sdk.model.message;

import android.text.SpannableString;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.INetDataObject;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.interact.CommentGoodInfo;
import com.taobao.taolive.sdk.model.interact.MedalLevelEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class ChatMessage implements INetDataObject {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static List<Integer> COLOR_RANGE = null;
    public static final String KEY_MEDAL_LIST_DT = "medalList";
    public static final String KEY_MEDAL_LIST_TB = "taobaoMedalList";
    public int actionRes;
    public String actionUrl;
    public int bgColor;
    public ChatItemCommonData chatItemCommonData;
    public List<SpannableString> mCommentIcons;
    public String mCommentId;
    public String mContent;
    public ArrayList<UserAvatar> mEnterUsers;
    public JSONObject mExtraParams;
    public SpannableString mFansLight;
    private List<MedalLevelEntity> mMedalLevelList;
    public long mMessageId;
    public int mNickColor;
    public String mOrignalUserNick;
    private Random mRandom;
    public long mReceivedTimestamp;
    public List<SpannableString> mSpannableContent;
    public long mTimestamp;
    public String mUserIcon;
    public long mUserId;
    public String mUserNick;
    public MessageType mType = MessageType.TXT;
    public boolean isAnchor = false;
    public boolean scrollToMsg = false;
    public HashMap<String, String> renders = new HashMap<>();
    public Map<String, Object> userData = new HashMap();
    public ArrayList<CommentGoodInfo> commodities = new ArrayList<>();
    public boolean isOnScreen = true;
    public int mTextColor = 0;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class ChatItemCommonData implements INetDataObject {
        public String bizType;
        public com.alibaba.fastjson.JSONObject data;
        public String showType;
        public String templateName;
        public String voName;

        static {
            t2o.a(806356310);
            t2o.a(806355930);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public enum MessageType {
        ENTER,
        TXT,
        ZAN,
        FOLLOW,
        TRADE,
        VOTE,
        TASKREWARD,
        GOOD_RATE;
        
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(MessageType messageType, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/sdk/model/message/ChatMessage$MessageType");
        }

        public static MessageType valueOf(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MessageType) ipChange.ipc$dispatch("db79f397", new Object[]{str});
            }
            return (MessageType) Enum.valueOf(MessageType.class, str);
        }
    }

    static {
        t2o.a(806356309);
        t2o.a(806355930);
        ArrayList arrayList = new ArrayList();
        COLOR_RANGE = arrayList;
        arrayList.add(Integer.valueOf(R.color.taolive_chat_color1));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color2));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color3));
        COLOR_RANGE.add(Integer.valueOf(R.color.taolive_chat_color4));
    }

    public ChatMessage() {
        Random random = new Random();
        this.mRandom = random;
        List<Integer> list = COLOR_RANGE;
        this.mNickColor = list.get(random.nextInt(list.size())).intValue();
    }

    public static ChatMessage createConventionMessage(String str, String str2, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("9081e31f", new Object[]{str, str2, new Integer(i)});
        }
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mNickColor = i;
        chatMessage.mType = MessageType.TXT;
        chatMessage.mUserNick = str;
        chatMessage.mContent = str2;
        return chatMessage;
    }

    public int getBgColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("1061a262", new Object[]{this})).intValue();
        }
        return this.bgColor;
    }

    public List<MedalLevelEntity> getMedalLevelList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5703a33f", new Object[]{this});
        }
        return this.mMedalLevelList;
    }

    public void setBgColor(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("321c1980", new Object[]{this, new Integer(i)});
        } else {
            this.bgColor = i;
        }
    }

    public void setMedalLevelList(List<MedalLevelEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5008c505", new Object[]{this, list});
        } else {
            this.mMedalLevelList = list;
        }
    }
}
