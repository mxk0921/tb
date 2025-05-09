package tb;

import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.interact.Comment;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.LiveEndMessage;
import com.taobao.taolive.sdk.model.message.LiveInteractiveMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tb.aof;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class bpr implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int MSG_POWER_MSG = 1000;
    public static final int MSG_TYPE_ACTOR_SWITCH = 1016;
    public static final int MSG_TYPE_ANCHOR_BACK = 1007;
    public static final int MSG_TYPE_ANCHOR_BROADCAST = 1019;
    public static final int MSG_TYPE_ANCHOR_LEAVE = 1006;
    public static final int MSG_TYPE_BIZ_MEDIAPLATFORM_INFO = 2037;
    public static final int MSG_TYPE_BROADCAST_MSG = 1037;
    public static final int MSG_TYPE_CHAT_AI_MESSAGE = 1050;
    public static final int MSG_TYPE_COMMON_TIPS_SHOW = 1057;
    public static final int MSG_TYPE_CUSTOM_SERVE_GOOD_INTRO = 1056;
    public static final int MSG_TYPE_DEFAULT = 1018;
    public static final int MSG_TYPE_DISPATCH_ERROR = 1027;
    public static final int MSG_TYPE_ENTER_FAIL = 100000;
    public static final int MSG_TYPE_ENTER_GROUP_SHOW = 10035;
    public static final int MSG_TYPE_ENTER_SUCCESS = 1005;
    public static final int MSG_TYPE_FANS_LEVEL_UPGRADE = 1051;
    public static final int MSG_TYPE_FAVOR = 1002;
    public static final int MSG_TYPE_FOLLOW = 1049;
    public static final int MSG_TYPE_GET_ROOM_INFO = 1013;
    public static final int MSG_TYPE_GET_USERS = 1012;
    public static final int MSG_TYPE_GIFT = 1008;
    public static final int MSG_TYPE_H265_MSG = 1024;
    public static final int MSG_TYPE_INTERACTIVE = 1014;
    public static final int MSG_TYPE_LINK_LIVE = 1020;
    public static final int MSG_TYPE_LIVE_END = 1004;
    public static final int MSG_TYPE_MEDIA_PLATFORM = 1036;
    public static final int MSG_TYPE_MEDIA_PLATFORM_LEVEL = 1053;
    public static final int MSG_TYPE_MEDIA_PLATFORM_NORMAL = 1052;
    public static final int MSG_TYPE_NOTICE_MSG = 1023;
    public static final int MSG_TYPE_PLAYER_SWITCH = 1017;
    public static final int MSG_TYPE_PLAY_ERROR_MSG = 1026;
    public static final int MSG_TYPE_PRODUCT = 1001;
    public static final int MSG_TYPE_PRODUCT_LIST = 1009;
    public static final int MSG_TYPE_PULL_MESSAGE = 1029;
    public static final int MSG_TYPE_ROOM_SWITCH = 1039;
    public static final int MSG_TYPE_STAGE_GROUP_TIPS_SHOW = 1062;
    public static final int MSG_TYPE_SYSTEM = 100;
    public static final int MSG_TYPE_SYSTEM_BROADCAST = 1015;
    public static final int MSG_TYPE_SYSTEM_STUDIO = 101;
    public static final int MSG_TYPE_TAOLIVE_PK_ASSIST = 1061;
    public static final int MSG_TYPE_TAOLIVE_PK_HOT = 1060;
    public static final int MSG_TYPE_TAOLIVE_PV = 1059;
    public static final int MSG_TYPE_TAOLIVE_SWITCH_ROOM = 1058;
    public static final int MSG_TYPE_TASK_INTERACTIVE_MSG = 1055;
    public static final int MSG_TYPE_TIMESHIFT = 2000;
    public static final int MSG_TYPE_TRADE_SHOW = 1011;
    public static final int MSG_TYPE_TXT = 1000;
    public static final int MSG_TYPE_UPDATE_BROADCASTER_SCORE = 1033;
    public static final int MSG_TYPE_UPDATE_SKIN = 1041;
    public static final int MSG_TYPE_UPDATE_SKIN_4_FRAME = 1042;
    public static final int MSG_TYPE_USER_LEVEL_ENTER = 1040;
    public static final int MSG_TYPE_USER_UPDATE = 1003;
    public static final int MSG_TYPE_USER_UPDATE_ITEM = 102;
    public static final int MSG_TYPE_VIDEO_HIGHLIGHTS_MSG = 1038;

    /* renamed from: a  reason: collision with root package name */
    public final String f16536a;
    public final int b;
    public final boolean d;
    public c34 e;
    public aof f;
    public c g;
    public final boolean i;
    public HashSet<String> k;
    public boolean l;
    public String m;
    public long c = 5000;
    public jyw h = null;
    public final q3s j = new q3s();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements aof.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.aof.b
        public void onError(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5eb5434c", new Object[]{this, obj});
            } else {
                bpr.b(bpr.this, qvs.o0());
            }
        }

        @Override // tb.aof.b
        public void onSuccess(Object obj) {
            List<ShareGoodsListMessage> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ea580ec7", new Object[]{this, obj});
                return;
            }
            if ((obj instanceof List) && (list = (List) obj) != null && list.size() > 0) {
                for (ShareGoodsListMessage shareGoodsListMessage : list) {
                    bpr.a(bpr.this, shareGoodsListMessage, false);
                }
            }
            bpr.b(bpr.this, qvs.o0());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            bpr bprVar = bpr.this;
            bpr.f(bprVar, bpr.d(bprVar));
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            String str;
            boolean z;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null) {
                FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.getData();
                if (fetchCommentResponseData != null) {
                    ArrayList<Comment> arrayList = fetchCommentResponseData.comments;
                    if (arrayList != null && arrayList.size() > 0) {
                        Iterator<Comment> it = fetchCommentResponseData.comments.iterator();
                        while (it.hasNext()) {
                            Comment next = it.next();
                            joc u = v2s.o().u();
                            if (u != null) {
                                str = u.getNick();
                            } else {
                                str = "";
                            }
                            if (obj instanceof String) {
                                z = TextUtils.equals(String.valueOf(obj), "");
                            } else {
                                z = true;
                            }
                            if (TextUtils.isEmpty(str) || !str.equals(next.publisherNick) || z) {
                                ChatMessage chatMessage = new ChatMessage();
                                chatMessage.mMessageId = next.timestamp;
                                if (!TextUtils.isEmpty(next.tbNick)) {
                                    chatMessage.mUserNick = next.tbNick;
                                } else {
                                    chatMessage.mUserNick = next.publisherNick;
                                }
                                chatMessage.mTimestamp = next.timestamp;
                                chatMessage.mContent = next.content;
                                chatMessage.mUserId = next.publisherId;
                                chatMessage.renders = next.renders;
                                chatMessage.commodities = next.commodities;
                                if (bpr.c(bpr.this) != null && bpr.c(bpr.this).d() < 200) {
                                    bpr.c(bpr.this).i(chatMessage);
                                }
                            }
                        }
                    }
                    long j = fetchCommentResponseData.delay;
                    if (j != 0) {
                        bpr.e(bpr.this, j);
                    }
                    bpr bprVar = bpr.this;
                    bpr.f(bprVar, bpr.d(bprVar));
                    return;
                }
                bpr bprVar2 = bpr.this;
                bpr.f(bprVar2, bpr.d(bprVar2));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            bpr bprVar = bpr.this;
            bpr.f(bprVar, bpr.d(bprVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface c {
        void onMessageReceived(int i, Object obj);
    }

    static {
        t2o.a(779091999);
        t2o.a(806356161);
    }

    public bpr(int i, String str, boolean z, boolean z2, c cVar) {
        this.f16536a = str;
        this.b = i;
        this.d = z;
        this.g = cVar;
        this.i = z2;
    }

    public static /* synthetic */ void a(bpr bprVar, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8021c46b", new Object[]{bprVar, shareGoodsListMessage, new Boolean(z)});
        } else {
            bprVar.r(shareGoodsListMessage, z);
        }
    }

    public static /* synthetic */ void b(bpr bprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebaba16e", new Object[]{bprVar, new Long(j)});
        } else {
            bprVar.k(j);
        }
    }

    public static /* synthetic */ q3s c(bpr bprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (q3s) ipChange.ipc$dispatch("97587073", new Object[]{bprVar});
        }
        return bprVar.j;
    }

    public static /* synthetic */ long d(bpr bprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2977ea0c", new Object[]{bprVar})).longValue();
        }
        return bprVar.c;
    }

    public static /* synthetic */ long e(bpr bprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("7f2755e", new Object[]{bprVar, new Long(j)})).longValue();
        }
        bprVar.c = j;
        return j;
    }

    public static /* synthetic */ void f(bpr bprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9272e6cb", new Object[]{bprVar, new Long(j)});
        } else {
            bprVar.l(j);
        }
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1002ca60", new Object[]{this, str});
            return;
        }
        try {
            if (this.k == null) {
                this.k = new HashSet<>();
            }
            if (!TextUtils.isEmpty(str)) {
                this.k.add(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void h(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7182b206", new Object[]{this, tLiveMsg});
        } else if (tLiveMsg != null) {
            if (iw0.j(imr.b().a())) {
                Intent intent = new Intent("action.com.taobao.taolive.room.powerMessage");
                String jSONString = JSON.toJSONString(tLiveMsg);
                intent.putExtra("msg", jSONString);
                LocalBroadcastManager.getInstance(imr.b().a()).sendBroadcast(intent);
                cwd A = v2s.o().A();
                A.b(cwd.LOG_TAG, "Message: dispatch msg: " + jSONString);
            }
            if (this.h == null) {
                this.h = new jyw(this);
            }
            Message obtainMessage = this.h.obtainMessage(1000);
            obtainMessage.obj = tLiveMsg;
            if (p(tLiveMsg)) {
                this.h.sendMessageDelayed(obtainMessage, qvs.I0());
            } else {
                this.h.sendMessage(obtainMessage);
            }
        }
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            return;
        }
        int i = message.what;
        if (i == 273) {
            if (this.f == null) {
                this.f = new aof();
            }
            if (!TextUtils.isEmpty(null)) {
                this.f.b(this.m, null, new a());
            }
        } else if (i == 1000) {
            m((TLiveMsg) message.obj);
        } else if (i == 10000) {
            if (this.e == null) {
                this.e = new c34();
            }
            this.e.g(this.f16536a, this.b, this.i, new b());
        }
    }

    public void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        q3s q3sVar = this.j;
        if (q3sVar != null) {
            q3sVar.a();
        }
        HashSet<String> hashSet = this.k;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public void j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        w();
        c34 c34Var = this.e;
        if (c34Var != null) {
            c34Var.f();
            this.e = null;
        }
        aof aofVar = this.f;
        if (aofVar != null) {
            aofVar.a();
            this.f = null;
        }
    }

    public final void k(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64056847", new Object[]{this, new Long(j)});
            return;
        }
        if (this.h == null) {
            this.h = new jyw(this);
        }
        this.h.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
        this.h.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, j);
    }

    public final void l(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613d628d", new Object[]{this, new Long(j)});
            return;
        }
        if (this.h == null) {
            this.h = new jyw(this);
        }
        this.h.removeMessages(10000);
        this.h.sendEmptyMessageDelayed(10000, j);
    }

    public void n(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a62424", new Object[]{this, new Boolean(z)});
        } else {
            this.l = z;
        }
    }

    public final void q(String str) {
        c cVar;
        c cVar2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ef142", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                if ("expTask".equals(parseObject.getString("type"))) {
                    TaskStatusMsg taskStatusMsg = (TaskStatusMsg) JSON.parseObject(parseObject.getString("data"), TaskStatusMsg.class);
                    if ("normal".equals(taskStatusMsg.type)) {
                        c cVar3 = this.g;
                        if (cVar3 != null) {
                            cVar3.onMessageReceived(1052, taskStatusMsg);
                        }
                    } else if (m09.TASK_TYPE_LEVEL.equals(taskStatusMsg.type) && (cVar2 = this.g) != null) {
                        cVar2.onMessageReceived(1053, taskStatusMsg);
                    }
                } else if (o(parseObject) && (cVar = this.g) != null) {
                    cVar.onMessageReceived(2037, str);
                    return;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        c cVar4 = this.g;
        if (cVar4 != null) {
            cVar4.onMessageReceived(1036, str);
        }
    }

    public final boolean s(ChatMessage chatMessage) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8340ab8d", new Object[]{this, chatMessage})).booleanValue();
        }
        if (chatMessage == null) {
            return false;
        }
        joc u = v2s.o().u();
        if (u != null) {
            str = u.getUserId();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str) || !str.equals(String.valueOf(chatMessage.mUserId))) {
            return false;
        }
        return true;
    }

    public void t(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.m = str;
        }
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.g = null;
        q3s q3sVar = this.j;
        if (q3sVar != null) {
            q3sVar.a();
        }
        HashSet<String> hashSet = this.k;
        if (hashSet != null) {
            hashSet.clear();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df9ac62", new Object[]{this});
            return;
        }
        c34 c34Var = this.e;
        if (c34Var != null) {
            c34Var.e();
        }
        q3s q3sVar = this.j;
        if (q3sVar != null) {
            q3sVar.a();
        }
        jyw jywVar = this.h;
        if (jywVar != null) {
            jywVar.removeMessages(10000);
        }
    }

    public final void r(ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        ShareGoodMessage[] shareGoodMessageArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b179e05", new Object[]{this, shareGoodsListMessage, new Boolean(z)});
        } else if (shareGoodsListMessage != null && (shareGoodMessageArr = shareGoodsListMessage.goodsList) != null && shareGoodMessageArr.length > 0) {
            String str = "";
            if (z && v2s.o().E() != null) {
                HashMap hashMap = new HashMap();
                hashMap.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                hashMap.put("liveId", this.m);
                hashMap.put("topic", this.f16536a);
                hashMap.put("userId", v2s.o().u() != null ? v2s.o().u().getUserId() : str);
                v2s.o().E().track4Click(glr.UT_PAGE_NAME, "PM_goodMsg", hashMap);
            }
            ShareGoodMessage[] shareGoodMessageArr2 = shareGoodsListMessage.goodsList;
            if (!(shareGoodMessageArr2 == null || shareGoodMessageArr2[0] == null)) {
                if (this.k == null) {
                    this.k = new HashSet<>();
                }
                Map<String, String> map = shareGoodMessageArr2[0].extendVal;
                if (map != null) {
                    String str2 = map.get(cpr.TYPE_MSG_UUID);
                    if (!TextUtils.isEmpty(str2) && this.k.contains(str2)) {
                        return;
                    }
                    if (!TextUtils.isEmpty(str2) && !this.k.contains(str2)) {
                        g(str2);
                        if (!z) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                            hashMap2.put("liveId", this.m);
                            hashMap2.put("topic", this.f16536a);
                            if (v2s.o().u() != null) {
                                str = v2s.o().u().getUserId();
                            }
                            hashMap2.put("userId", str);
                            v2s.o().E().track4Click(glr.UT_PAGE_NAME, "CDN_goodMsg", hashMap2);
                        }
                    }
                }
            }
            this.g.onMessageReceived(1009, shareGoodsListMessage);
        }
    }

    public void m(TLiveMsg tLiveMsg) {
        TBLivePVMsg tBLivePVMsg;
        TBLiveSwitchMsg tBLiveSwitchMsg;
        TBTVProgramMessage tBTVProgramMessage;
        Map<String, String> map;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
            return;
        }
        int i = tLiveMsg.type;
        try {
            if (iw0.j(imr.b().a())) {
                cwd A = v2s.o().A();
                A.b(cwd.LOG_TAG, "Message: handlePowerMessage msg: " + JSON.toJSONString(tLiveMsg));
            }
            if (i == 10105) {
                ChatMessage a2 = u2j.a(tLiveMsg);
                if (!s(a2) && !this.d) {
                    this.j.i(a2);
                }
                c cVar2 = this.g;
                if (!(cVar2 == null || this.d)) {
                    cVar2.onMessageReceived(1000, tLiveMsg);
                }
            } else if (i == 10001) {
                String str = new String(tLiveMsg.data);
                c cVar3 = this.g;
                if (cVar3 != null) {
                    cVar3.onMessageReceived(100, str);
                }
                String e = u2j.e(str);
                if ("endLiveVideo".equals(e)) {
                    if (this.g != null) {
                        this.g.onMessageReceived(1004, (LiveEndMessage) JSON.parseObject(str, LiveEndMessage.class));
                    }
                } else if ("playerswitch".equals(e)) {
                    LiveSystemMessage liveSystemMessage = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    c cVar4 = this.g;
                    if (cVar4 != null) {
                        cVar4.onMessageReceived(1017, liveSystemMessage);
                    }
                } else if ("1".equals(e) || "2".equals(e) || "3".equals(e)) {
                    LiveSystemMessage liveSystemMessage2 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    c cVar5 = this.g;
                    if (cVar5 != null) {
                        cVar5.onMessageReceived(1015, liveSystemMessage2);
                    }
                }
            } else {
                Long l = null;
                if (i == 10002) {
                    String str2 = new String(tLiveMsg.data);
                    c cVar6 = this.g;
                    if (cVar6 != null) {
                        cVar6.onMessageReceived(101, str2);
                    }
                    String e2 = u2j.e(str2);
                    if ("liveVideoStreamBreak".equals(e2)) {
                        c cVar7 = this.g;
                        if (cVar7 != null) {
                            cVar7.onMessageReceived(1006, null);
                        }
                    } else if ("liveVideoStreamRestore".equals(e2) && (cVar = this.g) != null) {
                        cVar.onMessageReceived(1007, null);
                    }
                } else if (i == 23001) {
                    LiveInteractiveMessage liveInteractiveMessage = new LiveInteractiveMessage();
                    liveInteractiveMessage.messageId = tLiveMsg.messageId;
                    String str3 = new String(tLiveMsg.data);
                    liveInteractiveMessage.data = str3;
                    if (this.g == null) {
                        return;
                    }
                    if (u2j.c(str3)) {
                        this.g.onMessageReceived(1055, liveInteractiveMessage);
                    } else {
                        this.g.onMessageReceived(1014, liveInteractiveMessage);
                    }
                } else if (i == 10103) {
                    JoinNotifyMessage joinNotifyMessage = (JoinNotifyMessage) JSON.parseObject(new String(tLiveMsg.data), JoinNotifyMessage.class);
                    if (!(joinNotifyMessage == null || (map = joinNotifyMessage.addUsers) == null)) {
                        ArrayList arrayList = new ArrayList();
                        for (String str4 : map.keySet()) {
                            joc u = v2s.o().u();
                            if (u == null || !str4.equals(u.getUserId())) {
                                UserAvatar userAvatar = new UserAvatar();
                                userAvatar.id = zqq.h(str4);
                                userAvatar.name = map.get(str4);
                                userAvatar.headImg = imr.b().a().getString(R.string.minilive_user_header_url, Long.valueOf(userAvatar.id));
                                arrayList.add(userAvatar);
                            }
                        }
                        c cVar8 = this.g;
                        if (cVar8 != null) {
                            cVar8.onMessageReceived(102, joinNotifyMessage);
                            this.g.onMessageReceived(1003, arrayList);
                        }
                    }
                } else if (i == 10104) {
                    Map<String, Long> map2 = ((CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class)).value;
                    if (map2 != null) {
                        l = map2.get(PowerMsgType.KEY_FAVOR);
                    }
                    c cVar9 = this.g;
                    if (!(cVar9 == null || l == null)) {
                        cVar9.onMessageReceived(1002, l);
                    }
                } else if (i == 10101) {
                    if (this.g != null) {
                        try {
                            r((ShareGoodsListMessage) JSON.parseObject(new String(tLiveMsg.data), ShareGoodsListMessage.class), true);
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                } else if (i == 10010) {
                    c cVar10 = this.g;
                    if (cVar10 != null) {
                        cVar10.onMessageReceived(1011, tLiveMsg.from);
                    }
                } else if (i == 10035) {
                    c cVar11 = this.g;
                    if (cVar11 != null) {
                        cVar11.onMessageReceived(10035, tLiveMsg.from);
                    }
                } else if (i == 10055) {
                    if (this.g != null) {
                        this.g.onMessageReceived(1057, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                    }
                } else if (i == 70008) {
                    c cVar12 = this.g;
                    if (cVar12 != null) {
                        cVar12.onMessageReceived(1050, tLiveMsg);
                    }
                } else if (i == 20002) {
                    c cVar13 = this.g;
                    if (cVar13 != null) {
                        cVar13.onMessageReceived(1023, tLiveMsg);
                    }
                } else if (i == 10099) {
                    if (this.g != null) {
                        this.g.onMessageReceived(1024, (LiveSystemMessage) JSON.parseObject(new String(tLiveMsg.data), LiveSystemMessage.class));
                    }
                } else if (i == 10098) {
                    c cVar14 = this.g;
                    if (cVar14 != null) {
                        cVar14.onMessageReceived(1026, new String(tLiveMsg.data));
                    }
                } else {
                    if (!(i == 10015 || i == 60008)) {
                        if (i == 10016) {
                            if (!(this.g == null || (tBTVProgramMessage = (TBTVProgramMessage) JSON.parseObject(new String(tLiveMsg.data), TBTVProgramMessage.class)) == null || !tBTVProgramMessage.inTime)) {
                                this.g.onMessageReceived(1039, tBTVProgramMessage);
                                return;
                            }
                            return;
                        } else if (i == 40001) {
                            if (!(this.g == null || (tBLiveSwitchMsg = (TBLiveSwitchMsg) JSON.parseObject(new String(tLiveMsg.data), TBLiveSwitchMsg.class)) == null)) {
                                this.g.onMessageReceived(1058, tBLiveSwitchMsg);
                                return;
                            }
                            return;
                        } else if (i == 40002) {
                            if (!(this.g == null || (tBLivePVMsg = (TBLivePVMsg) JSON.parseObject(new String(tLiveMsg.data), TBLivePVMsg.class)) == null)) {
                                this.g.onMessageReceived(1059, tBLivePVMsg);
                                return;
                            }
                            return;
                        } else if (i == 10031) {
                            c cVar15 = this.g;
                            if (cVar15 != null) {
                                cVar15.onMessageReceived(1040, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 10033) {
                            c cVar16 = this.g;
                            if (cVar16 != null) {
                                cVar16.onMessageReceived(1051, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 10056) {
                            c cVar17 = this.g;
                            if (cVar17 != null) {
                                cVar17.onMessageReceived(1056, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 122233) {
                            c cVar18 = this.g;
                            if (cVar18 != null) {
                                cVar18.onMessageReceived(1060, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 122234) {
                            c cVar19 = this.g;
                            if (cVar19 != null) {
                                cVar19.onMessageReceived(1061, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 30005) {
                            c cVar20 = this.g;
                            if (cVar20 != null) {
                                cVar20.onMessageReceived(2000, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i != 10119) {
                            c cVar21 = this.g;
                            if (cVar21 != null) {
                                cVar21.onMessageReceived(1018, tLiveMsg);
                                return;
                            }
                            return;
                        } else if (this.g != null) {
                            this.g.onMessageReceived(1062, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                            return;
                        } else {
                            return;
                        }
                    }
                    q(new String(tLiveMsg.data));
                }
            }
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    public final boolean o(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3831cd34", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("type");
        return ("activity".equals(string) && "auction".equals(JSON.parseObject(jSONObject.getString("data")).getString("bizType"))) || "auction".equals(string);
    }

    public final boolean p(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("470a0b9", new Object[]{this, tLiveMsg})).booleanValue();
        }
        int i = tLiveMsg.type;
        if (i == 10099 || i == 10016) {
            return true;
        }
        if (i == 10001) {
            return "playerswitch".equals(u2j.e(new String(tLiveMsg.data)));
        }
        return false;
    }
}
