package tb;

import android.app.Application;
import android.content.Intent;
import android.os.Message;
import android.text.TextUtils;
import android.widget.Toast;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.Feature;
import com.alipay.security.mobile.alipayauthenticatorservice.message.Result;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.adapter.network.NetBaseOutDo;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.business.interact.comment.FetchCommentResponseData;
import com.taobao.taolive.sdk.model.LiveEmbedType;
import com.taobao.taolive.sdk.model.common.UserAvatar;
import com.taobao.taolive.sdk.model.interact.Comment;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.taolive.sdk.model.message.CommentCountMessage;
import com.taobao.taolive.sdk.model.message.CountInfoMessage;
import com.taobao.taolive.sdk.model.message.DisableAddOneCommentMessage;
import com.taobao.taolive.sdk.model.message.ExplainBehaviorReportMessage;
import com.taobao.taolive.sdk.model.message.JoinNotifyMessage;
import com.taobao.taolive.sdk.model.message.LiveCommonTipsMsg;
import com.taobao.taolive.sdk.model.message.LiveEndMessage;
import com.taobao.taolive.sdk.model.message.LiveGiftMessage;
import com.taobao.taolive.sdk.model.message.LiveInteractiveMessage;
import com.taobao.taolive.sdk.model.message.LiveSystemMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveEndMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveInfoMessage;
import com.taobao.taolive.sdk.model.message.OfficialLiveSwitchNextMessage;
import com.taobao.taolive.sdk.model.message.PowerMsgType;
import com.taobao.taolive.sdk.model.message.ShareGoodMessage;
import com.taobao.taolive.sdk.model.message.ShareGoodsListMessage;
import com.taobao.taolive.sdk.model.message.SwitchOfficialMessage;
import com.taobao.taolive.sdk.model.message.TBLivePVMsg;
import com.taobao.taolive.sdk.model.message.TBLiveSwitchMsg;
import com.taobao.taolive.sdk.model.message.TBTVProgramMessage;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import com.taobao.taolive.sdk.model.message.TUserMsg;
import com.taobao.taolive.sdk.model.message.TaskStatusMsg;
import com.taobao.taolive.sdk.model.message.TopAtmosphereMessage;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class cpr implements ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String I = cpr.class.getSimpleName();
    public static String J = null;
    public static final int MSG_POWER_MSG = 1000;
    public static final int MSG_TYPE_ACTOR_SWITCH = 1016;
    public static final int MSG_TYPE_ANCHOR_BACK = 1007;
    public static final int MSG_TYPE_ANCHOR_BROADCAST = 1019;
    public static final int MSG_TYPE_ANCHOR_LEAVE = 1006;
    public static final int MSG_TYPE_BIZ_MEDIAPLATFORM_INFO = 2037;
    public static final int MSG_TYPE_CHATTOP_MESSAGE_BROADCAST = 3009;
    public static final int MSG_TYPE_CHAT_AI_MESSAGE = 1050;
    public static final int MSG_TYPE_CHAT_ROOM_INFO = 6004;
    public static final int MSG_TYPE_CHEER_BUY_GIFT = 2999;
    public static final int MSG_TYPE_COMMENT = 3007;
    public static final int MSG_TYPE_COMMENT_COUNT = 1043;
    public static final int MSG_TYPE_COMMENT_STATUS = 1072;
    public static final int MSG_TYPE_COMMON_TIPS_SHOW = 1057;
    public static final int MSG_TYPE_CUSTOM_SERVE_GOOD_INTRO = 1056;
    public static final int MSG_TYPE_DEFAULT = 1018;
    public static final int MSG_TYPE_DISPATCH_ERROR = 1027;
    public static final int MSG_TYPE_DUKE_GIFT = 3001;
    public static final int MSG_TYPE_DUKE_LEAD_BOARD = 3002;
    public static final int MSG_TYPE_ENTER_FAIL = 100000;
    public static final int MSG_TYPE_ENTER_GROUP_SHOW = 10035;
    public static final int MSG_TYPE_ENTER_SUCCESS = 1005;
    public static final int MSG_TYPE_FANDOM_LIVE_START = 10001;
    public static final int MSG_TYPE_FANS_LEVEL_UPGRADE = 1051;
    public static final int MSG_TYPE_FAVOR = 1002;
    public static final int MSG_TYPE_GIFT = 1008;
    public static final int MSG_TYPE_GIFT_PK_RANK = 3003;
    public static final int MSG_TYPE_GIFT_WISH = 2998;
    public static final int MSG_TYPE_GOODS_SIMPLE_RIGHTS = 2001;
    public static final int MSG_TYPE_H265_MSG = 1024;
    public static final int MSG_TYPE_HOT_BUY = 1070;
    public static final int MSG_TYPE_IMPORTANT_EVENT_NOTIFY = 2888;
    public static final int MSG_TYPE_IMPORTANT_REWARD_ENTER = 6002;
    public static final int MSG_TYPE_INTERACTIVE = 1014;
    public static final int MSG_TYPE_LINK_LIVE = 1020;
    public static final int MSG_TYPE_LIVE_END = 1004;
    public static final int MSG_TYPE_LIVE_PUNISH = 880000291;
    public static final int MSG_TYPE_MEDIADATA = 3005;
    public static final int MSG_TYPE_MEDIA_PLATFORM = 1036;
    public static final int MSG_TYPE_MEDIA_PLATFORM_LEVEL = 1053;
    public static final int MSG_TYPE_MEDIA_PLATFORM_NORMAL = 1052;
    public static final int MSG_TYPE_NOTICE_DX = 6001;
    public static final int MSG_TYPE_NOTICE_MSG = 1023;
    public static final int MSG_TYPE_PLAYER_SWITCH = 1017;
    public static final int MSG_TYPE_PLAY_ERROR_MSG = 1026;
    public static final int MSG_TYPE_PRODUCT_EXPLAIN_DELETE = 10097;
    public static final int MSG_TYPE_PRODUCT_EXPLAIN_NEW = 10096;
    public static final int MSG_TYPE_PRODUCT_HIDE_CASE_WITH_PM = 10094;
    public static final int MSG_TYPE_PRODUCT_HOT_GOOD = 10095;
    public static final int MSG_TYPE_PRODUCT_ITEM_NO_BEAUTY_UPDATE = 10099;
    public static final int MSG_TYPE_PRODUCT_LIST = 1009;
    public static final int MSG_TYPE_PRODUCT_LIST_ITEM_UPDATE = 10098;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_CDN = 10092;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_CDN_INVALID = 10093;
    public static final int MSG_TYPE_PRODUCT_LIST_WITH_PM = 10091;
    public static final int MSG_TYPE_PULL_MESSAGE = 1029;
    public static final int MSG_TYPE_RANK_USERS = 3000;
    public static final int MSG_TYPE_REWARD_FEED_CAT_UPDATE = 6003;
    public static final int MSG_TYPE_REWARD_SMALL_CARD_ACTIVITY = 6000;
    public static final int MSG_TYPE_REWARD_TOAST = 6005;
    public static final int MSG_TYPE_ROOM_SETTINGS_CHANGE = 6006;
    public static final int MSG_TYPE_ROOM_SWITCH = 1039;
    public static final int MSG_TYPE_SECKILL_SELLOUT = 1071;
    public static final int MSG_TYPE_STAGE_GROUP_TIPS_SHOW = 1062;
    public static final int MSG_TYPE_SWITCH_OFFICIAL = 3006;
    public static final int MSG_TYPE_SYSTEM = 100;
    public static final int MSG_TYPE_SYSTEM_BROADCAST = 1015;
    public static final int MSG_TYPE_SYSTEM_STUDIO = 101;
    public static final int MSG_TYPE_TAOLIVE_MSG_AI_REPLY_MESSAGE = 1068;
    public static final int MSG_TYPE_TAOLIVE_MSG_AI_REPLY_RECOMMEND = 1069;
    public static final int MSG_TYPE_TAOLIVE_MSG_CARD = 1064;
    public static final int MSG_TYPE_TAOLIVE_PK_ASSIST = 1061;
    public static final int MSG_TYPE_TAOLIVE_PK_HOT = 1060;
    public static final int MSG_TYPE_TAOLIVE_PV = 1059;
    public static final int MSG_TYPE_TAOLIVE_SWITCH_ROOM = 1058;
    public static final int MSG_TYPE_TASK_INTERACTIVE_BEAN_MSG = 11056;
    public static final int MSG_TYPE_TASK_INTERACTIVE_COIN_MSG = 11055;
    public static final int MSG_TYPE_TASK_INTERACTIVE_MSG = 1055;
    public static final int MSG_TYPE_TIMESHIFT = 2000;
    public static final int MSG_TYPE_TOP_ATMOSPHERE = 1044;
    public static final int MSG_TYPE_TRADE_SHOW = 1011;
    public static final int MSG_TYPE_TXT_HISTORY = 1993;
    public static final int MSG_TYPE_USER_LEVEL_ENTER = 1040;
    public static final int MSG_TYPE_USER_LEVEL_ENTER_FOR_DUKE = 3008;
    public static final int MSG_TYPE_USER_UPDATE = 1003;
    public static final int MSG_TYPE_USER_UPDATE_ITEM = 102;
    public static final int MSG_USER_MSG = 5000;
    public static final String TYPE_MSG_UUID = "msgUuid";
    public boolean A;
    public boolean C;
    public List<String> D;
    public boolean E;
    public String F;
    public String G;
    public String H;

    /* renamed from: a  reason: collision with root package name */
    public final int f17221a;
    public final String b;
    public final String c;
    public long d;
    public c34 f;
    public final ArrayList<String> g;
    public final Set<String> h;
    public aof i;
    public c3s j;
    public b k;
    public jyw l;
    public hbd m;
    public final boolean n;
    public final boolean o;
    public final q3s p;
    public Queue<String> q;
    public boolean r;
    public int s;
    public ncc t;
    public LiveEmbedType u;
    public boolean v;
    public final bwd w;
    public String x;
    public String y;
    public String z;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements b0d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.b0d
        public void onError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6dfe77ca", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            cpr cprVar = cpr.this;
            cpr.i(cprVar, cpr.g(cprVar));
        }

        @Override // tb.b0d
        public void onSuccess(int i, NetResponse netResponse, NetBaseOutDo netBaseOutDo, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fb090915", new Object[]{this, new Integer(i), netResponse, netBaseOutDo, obj});
            } else if (netBaseOutDo != null) {
                FetchCommentResponseData fetchCommentResponseData = (FetchCommentResponseData) netBaseOutDo.getData();
                if (fetchCommentResponseData != null) {
                    ArrayList<Comment> arrayList = fetchCommentResponseData.comments;
                    if (arrayList != null && arrayList.size() > 0) {
                        cpr.f(cpr.this, obj, fetchCommentResponseData.comments);
                    }
                    long j = fetchCommentResponseData.delay;
                    if (j != 0) {
                        cpr.h(cpr.this, j);
                    }
                }
                cpr cprVar = cpr.this;
                cpr.i(cprVar, cpr.g(cprVar));
            }
        }

        @Override // tb.b0d
        public void onSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bfdbcd9", new Object[]{this, new Integer(i), netResponse, obj});
                return;
            }
            cpr cprVar = cpr.this;
            cpr.i(cprVar, cpr.g(cprVar));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public interface b extends gtc {
    }

    static {
        t2o.a(806356190);
        t2o.a(806356161);
    }

    public cpr(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, b bVar) {
        this(i, str, str2, z, z2, z3, z4, null, bVar);
    }

    public static /* synthetic */ void f(cpr cprVar, Object obj, ArrayList arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("64494123", new Object[]{cprVar, obj, arrayList});
        } else {
            cprVar.p(obj, arrayList);
        }
    }

    public static /* synthetic */ long g(cpr cprVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("c5b2100", new Object[]{cprVar})).longValue();
        }
        return cprVar.d;
    }

    public static /* synthetic */ long h(cpr cprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b340746a", new Object[]{cprVar, new Long(j)})).longValue();
        }
        cprVar.d = j;
        return j;
    }

    public static /* synthetic */ void i(cpr cprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("803fca17", new Object[]{cprVar, new Long(j)});
        } else {
            cprVar.D(j);
        }
    }

    public static /* synthetic */ void j(cpr cprVar, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b7a501ec", new Object[]{cprVar, obj});
        } else {
            cprVar.V(obj);
        }
    }

    public static /* synthetic */ void k(cpr cprVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85191593", new Object[]{cprVar, new Long(j)});
        } else {
            cprVar.B(j);
        }
    }

    public static /* synthetic */ void l(cpr cprVar, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef6940e", new Object[]{cprVar, shareGoodsListMessage, new Boolean(z)});
        } else {
            cprVar.U(shareGoodsListMessage, z);
        }
    }

    public final void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7fa6fb64", new Object[]{this});
        } else if (this.r && !TextUtils.isEmpty(this.H)) {
            if (this.j == null) {
                this.j = new c3s(new epr(this));
            }
            this.j.b(this.H);
        } else if (this.r && !TextUtils.isEmpty(this.G) && qvs.n0()) {
            if (this.i == null) {
                this.i = new aof();
            }
            this.i.b(this.F, this.G, new fpr(this));
        }
    }

    public final void B(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f627235", new Object[]{this, new Long(j)});
            return;
        }
        if (this.l == null) {
            this.l = new jyw(this);
        }
        this.l.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
        this.l.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, j);
    }

    public final void D(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("613d628d", new Object[]{this, new Long(j)});
            return;
        }
        if (this.l == null) {
            this.l = new jyw(this);
        }
        this.l.removeMessages(10000);
        this.l.sendEmptyMessageDelayed(10000, j);
    }

    public bwd E() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwd) ipChange.ipc$dispatch("80c7fafa", new Object[]{this});
        }
        return this.w;
    }

    public void I(TUserMsg tUserMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d12610d", new Object[]{this, tUserMsg});
            return;
        }
        b bVar = this.k;
        if (bVar != null) {
            try {
                bVar.onMessageReceived(tUserMsg.type, tUserMsg);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47a62424", new Object[]{this, new Boolean(z)});
        } else {
            this.E = z;
        }
    }

    public boolean L() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1b5b881a", new Object[]{this})).booleanValue();
        }
        return this.A;
    }

    public final void N(String str) {
        b bVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45ef142", new Object[]{this, str});
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                String string = parseObject.getString("type");
                if ("expTask".equals(string)) {
                    TaskStatusMsg taskStatusMsg = (TaskStatusMsg) JSON.parseObject(parseObject.getString("data"), TaskStatusMsg.class);
                    if ("normal".equals(taskStatusMsg.type)) {
                        b bVar2 = this.k;
                        if (bVar2 != null) {
                            bVar2.onMessageReceived(1052, taskStatusMsg);
                        }
                    } else if (m09.TASK_TYPE_LEVEL.equals(taskStatusMsg.type) && (bVar = this.k) != null) {
                        bVar.onMessageReceived(1053, taskStatusMsg);
                    }
                } else if ("intimacyCoinTask".equals(string)) {
                    String string2 = parseObject.getString("data");
                    b bVar3 = this.k;
                    if (bVar3 != null) {
                        bVar3.onMessageReceived(MSG_TYPE_TASK_INTERACTIVE_COIN_MSG, string2);
                    }
                } else if ("intimacyCoin".equals(string)) {
                    String string3 = parseObject.getString("data");
                    b bVar4 = this.k;
                    if (bVar4 != null) {
                        bVar4.onMessageReceived(MSG_TYPE_TASK_INTERACTIVE_BEAN_MSG, string3);
                    }
                } else if (K(parseObject)) {
                    String string4 = parseObject.getString(TYPE_MSG_UUID);
                    if (!TextUtils.isEmpty(string4)) {
                        if (this.q == null) {
                            this.s = qvs.s0();
                            this.q = new ArrayDeque(this.s);
                        }
                        if (!((ArrayDeque) this.q).contains(string4)) {
                            if (((ArrayDeque) this.q).size() == this.s) {
                                ((ArrayDeque) this.q).poll();
                            }
                            ((ArrayDeque) this.q).offer(string4);
                        } else {
                            return;
                        }
                    }
                    b bVar5 = this.k;
                    if (bVar5 != null) {
                        bVar5.onMessageReceived(2037, str);
                        return;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        b bVar6 = this.k;
        if (bVar6 != null) {
            bVar6.onMessageReceived(1036, str);
        }
    }

    public void O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
        }
    }

    public void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
        }
    }

    public final HashMap<String, String> Q(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("6b1eb0ae", new Object[]{this, jSONObject});
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (jSONObject != null) {
            try {
                for (Map.Entry<String, Object> entry : jSONObject.entrySet()) {
                    String key = entry.getKey();
                    Object value = entry.getValue();
                    if (value instanceof JSONObject) {
                        hashMap.putAll(Q((JSONObject) value));
                    } else {
                        hashMap.put(key, JSON.toJSONString(value));
                    }
                }
            } catch (Exception unused) {
            }
        }
        return hashMap;
    }

    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53907538", new Object[]{this});
            return;
        }
        bwd bwdVar = this.w;
        if (bwdVar != null) {
            bwdVar.a();
        }
    }

    public final void U(ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b179e05", new Object[]{this, shareGoodsListMessage, new Boolean(z)});
        } else {
            T(null, shareGoodsListMessage, z);
        }
    }

    public final void V(Object obj) {
        ShareGoodsListMessage shareGoodsListMessage;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b975e7c6", new Object[]{this, obj});
        } else if (obj instanceof String) {
            JSONObject parseObject = JSON.parseObject(String.valueOf(obj));
            Iterator it = ((ArrayList) this.D).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                JSONArray jSONArray = parseObject.getJSONArray(str);
                if (jSONArray != null && jSONArray.size() > 0) {
                    if (TextUtils.equals(str, String.valueOf(10101))) {
                        Iterator<Object> it2 = jSONArray.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if ((next instanceof JSONObject) && (shareGoodsListMessage = (ShareGoodsListMessage) JSON.parseObject(JSON.toJSONString(next), ShareGoodsListMessage.class)) != null) {
                                U(shareGoodsListMessage, false);
                            }
                        }
                    } else {
                        Iterator<Object> it3 = jSONArray.iterator();
                        while (it3.hasNext()) {
                            Object next2 = it3.next();
                            if ((next2 instanceof JSONObject) && TextUtils.equals(str, String.valueOf(10015))) {
                                try {
                                    N(((JSONObject) next2).toJSONString());
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void W(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ffbd38cb", new Object[]{this, chatMessage});
        } else if (chatMessage != null && chatMessage.renders != null) {
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(chatMessage.renders.get("userReply2UserCommentId"))) {
                hashMap.put("is_reply", "1");
            } else {
                hashMap.put("is_reply", "0");
            }
            if (!TextUtils.isEmpty(chatMessage.renders.get("comment_type"))) {
                hashMap.put("comment_type", chatMessage.renders.get("comment_type"));
            }
            if (!TextUtils.isEmpty(chatMessage.renders.get("comment_location"))) {
                hashMap.put("comment_location", chatMessage.renders.get("comment_location"));
            }
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", "Comment_LineDrop", hashMap);
            if (qvs.q()) {
                o3s.b(I, "reportMessageQueueDrop");
            }
        }
    }

    public void Y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("484c1aa1", new Object[]{this});
            return;
        }
        bwd bwdVar = this.w;
        if (bwdVar != null) {
            bwdVar.l();
        }
    }

    public void Z(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13b8cc9c", new Object[]{this, str});
        } else {
            this.H = str;
        }
    }

    public final void a(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d3d036", new Object[]{this, tLiveMsg});
        }
    }

    public void a0(ncc nccVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74714414", new Object[]{this, nccVar});
        } else {
            this.t = nccVar;
        }
    }

    public void b0(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f68ac9bc", new Object[]{this, new Boolean(z)});
        } else {
            this.A = z;
        }
    }

    public void c0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("271c751b", new Object[]{this, str});
        } else {
            this.G = str;
        }
    }

    public void d0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("111acbfa", new Object[]{this, str});
        } else {
            this.F = str;
        }
    }

    public void e0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e77def99", new Object[]{this, str});
        } else {
            this.x = str;
        }
    }

    public void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88f9a85", new Object[]{this, str});
        } else {
            this.y = str;
        }
    }

    public void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("720b3ec7", new Object[]{this, str});
        } else {
            this.z = str;
        }
    }

    public void h0(LiveEmbedType liveEmbedType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24e24319", new Object[]{this, liveEmbedType});
            return;
        }
        this.u = liveEmbedType;
        this.v = qvs.T();
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
            A();
        } else if (i == 1000) {
            H((TLiveMsg) message.obj);
        } else if (i == 5000) {
            Object obj = message.obj;
            if (obj instanceof TUserMsg) {
                I((TUserMsg) obj);
            }
        } else if (i == 10000) {
            if (this.f == null) {
                this.f = new c34();
            }
            this.f.h(this.b, this.c, this.o, this.n, new a());
        }
    }

    public void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
        }
    }

    public void j0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52ea3a16", new Object[]{this});
        } else if (this.r) {
            if (this.l == null) {
                this.l = new jyw(this);
            }
            this.l.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
            this.l.sendEmptyMessageDelayed(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR, qvs.o0());
        }
    }

    public void l0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6623bb89", new Object[]{this});
            return;
        }
        this.k = null;
        this.t = null;
        this.m = null;
        q3s q3sVar = this.p;
        if (q3sVar != null) {
            q3sVar.a();
        }
        Queue<String> queue = this.q;
        if (queue != null) {
            queue.clear();
        }
    }

    public final boolean m(ChatMessage chatMessage) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("92b372a", new Object[]{this, chatMessage})).booleanValue();
        }
        if (this.p == null || chatMessage == null) {
            return false;
        }
        if (!qvs.w() || this.p.f() || !this.p.b(chatMessage)) {
            if (this.p.j() >= 300) {
                W(this.p.g());
                this.p.h();
            }
            this.p.i(chatMessage);
            return true;
        }
        String str = I;
        o3s.b(str, "Duplicate Message: " + chatMessage.mMessageId);
        return false;
    }

    public void m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("80ad0db6", new Object[]{this});
        } else if (this.r) {
            Queue<String> queue = this.q;
            if (queue != null) {
                queue.clear();
            }
            jyw jywVar = this.l;
            if (jywVar != null) {
                jywVar.removeMessages(Result.ALIPAY_GET_HARD_DEVICE_ID_ERROR);
            }
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1002ca60", new Object[]{this, str});
            return;
        }
        try {
            if (this.q == null) {
                this.s = qvs.s0();
                this.q = new ArrayDeque(this.s);
            }
            if (!TextUtils.isEmpty(str)) {
                if (this.q.size() == this.s) {
                    this.q.poll();
                }
                this.q.offer(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void n0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8df9ac62", new Object[]{this});
            return;
        }
        c34 c34Var = this.f;
        if (c34Var != null) {
            c34Var.e();
        }
        q3s q3sVar = this.p;
        if (q3sVar != null) {
            q3sVar.a();
        }
        jyw jywVar = this.l;
        if (jywVar != null) {
            jywVar.removeMessages(10000);
        }
    }

    public void o0(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a7e7cc2", new Object[]{this, tLiveMsg});
        } else if (hjr.v() && iw0.i() && v2s.o().f() != null && v2s.o().f().getApplication() != null) {
            Application application = v2s.o().f().getApplication();
            Toast.makeText(application, "PM串流异常: " + tLiveMsg, 1).show();
        }
    }

    public final void p(Object obj, ArrayList<Comment> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("47ed0a52", new Object[]{this, obj, arrayList});
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        String utdid = v2s.o().F().getUtdid(v2s.o().f().getApplication());
        long r = qvs.r();
        Iterator<Comment> it = arrayList.iterator();
        while (it.hasNext()) {
            Comment next = it.next();
            arrayList2.add(next.commentId);
            if (v(next, obj) && m(r(next))) {
                if (Math.abs((next.commentId + utdid).hashCode()) % 100000 < r) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("commentId", next.commentId);
                    hashMap.put("receiveTs", String.valueOf(v2s.o().C().getServerTime()));
                    hashMap.put("topic", this.b);
                    v2s.o().E().track4Show("Page_TaobaoLiveWatch", "Show-commentReceive", hashMap);
                }
            }
        }
        this.g.clear();
        this.g.addAll(arrayList2);
    }

    public void p0(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c99aeea3", new Object[]{this, str, str2});
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("topic", str2);
        if (this instanceof wkr) {
            hashMap.put("isKMP", "1");
        } else {
            hashMap.put("isKMP", "0");
        }
        ncc nccVar = this.t;
        if (nccVar != null) {
            hashMap.putAll(nccVar.getHeartParams());
            if (this.t.getHeartParams().get("liveAlgoParams") != null) {
                hashMap.putAll(Q(fkx.d(this.t.getHeartParams().get("liveAlgoParams"))));
            }
            if (this.t.getHeartParams().get("liveServerParams") != null) {
                hashMap.putAll(Q(fkx.d(this.t.getHeartParams().get("liveServerParams"))));
            }
        }
        if (v2s.o().E() != null) {
            v2s.o().E().track4Click("Page_TaobaoLiveWatch", str, hashMap);
        }
    }

    public void q(hbd hbdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ef6cf7", new Object[]{this, hbdVar});
        } else {
            this.m = hbdVar;
        }
    }

    public final ChatMessage r(Comment comment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ChatMessage) ipChange.ipc$dispatch("a1dea02f", new Object[]{this, comment});
        }
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.mCommentId = comment.commentId;
        long j = comment.timestamp;
        chatMessage.mMessageId = j;
        chatMessage.mTimestamp = j;
        if (v2s.o().C() != null) {
            chatMessage.mReceivedTimestamp = v2s.o().C().getServerTime();
        }
        chatMessage.mContent = comment.content;
        chatMessage.mUserId = comment.publisherId;
        chatMessage.renders = comment.renders;
        chatMessage.commodities = comment.commodities;
        chatMessage.mUserNick = comment.getDisplayUserNick(this.c);
        chatMessage.mUserIcon = comment.publisherIcon;
        return chatMessage;
    }

    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e2056d6", new Object[]{this});
            return;
        }
        Queue<String> queue = this.q;
        if (queue != null) {
            queue.clear();
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dec10943", new Object[]{this});
            return;
        }
        ArrayList<String> arrayList = this.g;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void w(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7182b206", new Object[]{this, tLiveMsg});
        } else if (tLiveMsg != null) {
            if (iw0.j(v2s.o().f().getApplication())) {
                Intent intent = new Intent("action.com.taobao.taolive.room.powerMessage");
                String jSONString = JSON.toJSONString(tLiveMsg);
                intent.putExtra("msg", jSONString);
                LocalBroadcastManager.getInstance(v2s.o().f().getApplication()).sendBroadcast(intent);
                cwd A = v2s.o().A();
                A.b(cwd.LOG_TAG, "Message: dispatch msg: " + jSONString);
            }
            if (this.l == null) {
                this.l = new jyw(this);
            }
            Message obtainMessage = this.l.obtainMessage(1000);
            obtainMessage.obj = tLiveMsg;
            if (M(tLiveMsg)) {
                this.l.sendMessageDelayed(obtainMessage, qvs.I0());
            } else {
                this.l.sendMessage(obtainMessage);
            }
        }
    }

    public void x(TLiveMsg tLiveMsg) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("88896dbb", new Object[]{this, tLiveMsg});
        } else {
            w(tLiveMsg);
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a81652", new Object[]{this});
            return;
        }
        q3s q3sVar = this.p;
        if (q3sVar != null) {
            q3sVar.a();
        }
        Queue<String> queue = this.q;
        if (queue != null) {
            queue.clear();
        }
    }

    public void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6d8f98", new Object[]{this});
            return;
        }
        n0();
        c34 c34Var = this.f;
        if (c34Var != null) {
            c34Var.f();
            this.f = null;
        }
        aof aofVar = this.i;
        if (aofVar != null) {
            aofVar.a();
            this.i = null;
        }
        c3s c3sVar = this.j;
        if (c3sVar != null) {
            c3sVar.a();
            this.j = null;
        }
        ((HashSet) this.h).clear();
    }

    public cpr(int i, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, bwd bwdVar, b bVar) {
        this.d = 5000L;
        this.g = new ArrayList<>();
        this.h = new HashSet();
        this.l = null;
        this.s = 100;
        this.C = false;
        this.b = str;
        this.c = str2;
        this.f17221a = i;
        if (z && !z4) {
            qvs.s();
        }
        this.k = bVar;
        this.n = z3;
        this.o = z4;
        if (bwdVar != null) {
            this.w = bwdVar;
        } else {
            this.w = v2s.o().a();
        }
        this.p = new q3s();
        qvs.t0();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b0 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:9:0x0024, B:11:0x0035, B:13:0x003f, B:16:0x0052, B:21:0x0074, B:26:0x0081, B:33:0x0092, B:35:0x009c, B:37:0x00aa, B:39:0x00b0, B:41:0x00b4), top: B:45:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean F(com.taobao.taolive.sdk.model.message.TLiveMsg r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.cpr.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001c
            java.lang.String r3 = "c2ec2f58"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r6
            r4[r0] = r7
            java.lang.Object r7 = r2.ipc$dispatch(r3, r4)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            return r7
        L_0x001c:
            if (r7 == 0) goto L_0x00bd
            int r2 = r7.type
            r3 = 10086(0x2766, float:1.4133E-41)
            if (r2 != r3) goto L_0x00bd
            java.lang.String r2 = new java.lang.String     // Catch: all -> 0x007f
            byte[] r7 = r7.data     // Catch: all -> 0x007f
            r2.<init>(r7)     // Catch: all -> 0x007f
            java.lang.Class<com.taobao.taolive.sdk.model.message.InteractiveMsg> r7 = com.taobao.taolive.sdk.model.message.InteractiveMsg.class
            java.lang.Object r7 = tb.fkx.f(r2, r7)     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.message.InteractiveMsg r7 = (com.taobao.taolive.sdk.model.message.InteractiveMsg) r7     // Catch: all -> 0x007f
            if (r7 == 0) goto L_0x00bd
            java.lang.String r2 = "anchor-me"
            java.lang.String r3 = r7.name     // Catch: all -> 0x007f
            boolean r2 = r2.equals(r3)     // Catch: all -> 0x007f
            if (r2 == 0) goto L_0x00bd
            java.util.ArrayList<com.taobao.taolive.sdk.model.message.InteractiveMsg$Component> r7 = r7.components     // Catch: all -> 0x007f
            java.lang.Object r7 = r7.get(r1)     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.message.InteractiveMsg$Component r7 = (com.taobao.taolive.sdk.model.message.InteractiveMsg.Component) r7     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.message.InteractiveMsg$Data r7 = r7.data     // Catch: all -> 0x007f
            java.lang.String r7 = r7.message     // Catch: all -> 0x007f
            com.alibaba.fastjson.JSONObject r7 = tb.fkx.d(r7)     // Catch: all -> 0x007f
            if (r7 != 0) goto L_0x0052
            return r1
        L_0x0052:
            java.lang.String r2 = "content"
            java.lang.String r2 = r7.getString(r2)     // Catch: all -> 0x007f
            java.lang.String r3 = "requestId"
            r7.getString(r3)     // Catch: all -> 0x007f
            java.lang.String r3 = "type"
            java.lang.String r3 = r7.getString(r3)     // Catch: all -> 0x007f
            int r4 = r3.hashCode()     // Catch: all -> 0x007f
            r5 = 954925063(0x38eb0007, float:1.1205678E-4)
            if (r4 == r5) goto L_0x0081
            r5 = 989204668(0x3af610bc, float:0.0018773298)
            if (r4 == r5) goto L_0x0074
            goto L_0x008c
        L_0x0074:
            java.lang.String r4 = "recommend"
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x007f
            if (r3 == 0) goto L_0x008c
            r3 = 1
            goto L_0x008d
        L_0x007f:
            r7 = move-exception
            goto L_0x00ba
        L_0x0081:
            java.lang.String r4 = "message"
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x007f
            if (r3 == 0) goto L_0x008c
            r3 = 0
            goto L_0x008d
        L_0x008c:
            r3 = -1
        L_0x008d:
            if (r3 == 0) goto L_0x00b0
            if (r3 == r0) goto L_0x0092
            goto L_0x00bd
        L_0x0092:
            java.lang.Class<com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg> r3 = com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg.class
            java.lang.Object r2 = tb.fkx.f(r2, r3)     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg r2 = (com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg) r2     // Catch: all -> 0x007f
            if (r2 == 0) goto L_0x00bd
            java.util.List<com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg$ItemList> r2 = r2.itemList     // Catch: all -> 0x007f
            java.lang.Object r2 = r2.get(r1)     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg$ItemList r2 = (com.taobao.taolive.sdk.model.message.AiReplyRecommendMsg.ItemList) r2     // Catch: all -> 0x007f
            com.taobao.taolive.sdk.model.common.LiveItem r2 = r2.info     // Catch: all -> 0x007f
            tb.cpr$b r2 = r6.k     // Catch: all -> 0x007f
            if (r2 == 0) goto L_0x00af
            r3 = 1069(0x42d, float:1.498E-42)
            r2.onMessageReceived(r3, r7)     // Catch: all -> 0x007f
        L_0x00af:
            return r0
        L_0x00b0:
            tb.cpr$b r2 = r6.k     // Catch: all -> 0x007f
            if (r2 == 0) goto L_0x00b9
            r3 = 1068(0x42c, float:1.497E-42)
            r2.onMessageReceived(r3, r7)     // Catch: all -> 0x007f
        L_0x00b9:
            return r0
        L_0x00ba:
            r7.printStackTrace()
        L_0x00bd:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.cpr.F(com.taobao.taolive.sdk.model.message.TLiveMsg):boolean");
    }

    public void H(TLiveMsg tLiveMsg) {
        int i;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        byte[] bArr7;
        TBLivePVMsg tBLivePVMsg;
        TBLiveSwitchMsg tBLiveSwitchMsg;
        TBTVProgramMessage tBTVProgramMessage;
        b bVar;
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9de90a98", new Object[]{this, tLiveMsg});
        } else if (!F(tLiveMsg)) {
            hbd hbdVar = this.m;
            if (hbdVar != null && hbdVar.a(tLiveMsg)) {
                return;
            }
            if (!TextUtils.equals(tLiveMsg.topic, this.b)) {
                this.C = true;
                this.w.h(this.f17221a, tLiveMsg, 502);
                o0(tLiveMsg);
                return;
            }
            try {
                if (iw0.j(v2s.o().f().getApplication())) {
                    cwd A = v2s.o().A();
                    A.b(cwd.LOG_TAG, "Message: handlePowerMessage msg: " + JSON.toJSONString(tLiveMsg));
                }
                i = tLiveMsg.type;
                if (hjr.o()) {
                    this.k.onMessageReceived(i, tLiveMsg);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (i == 10001) {
                String str = new String(tLiveMsg.data);
                b bVar2 = this.k;
                if (bVar2 != null) {
                    bVar2.onMessageReceived(100, str);
                }
                String e2 = u2j.e(str);
                if ("endLiveVideo".equals(e2)) {
                    if (this.k != null) {
                        this.k.onMessageReceived(1004, (LiveEndMessage) JSON.parseObject(str, LiveEndMessage.class));
                    }
                } else if ("actorswitch".equals(e2)) {
                    LiveSystemMessage liveSystemMessage = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    b bVar3 = this.k;
                    if (bVar3 != null) {
                        bVar3.onMessageReceived(1016, liveSystemMessage);
                    }
                } else if ("playerswitch".equals(e2)) {
                    LiveSystemMessage liveSystemMessage2 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    b bVar4 = this.k;
                    if (bVar4 != null) {
                        bVar4.onMessageReceived(1017, liveSystemMessage2);
                    }
                } else {
                    if (!"1".equals(e2) && !"2".equals(e2) && !"3".equals(e2)) {
                        if ("liveVideoPlayerBroadcast".equals(e2)) {
                            LiveSystemMessage liveSystemMessage3 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                            b bVar5 = this.k;
                            if (bVar5 != null) {
                                bVar5.onMessageReceived(1019, liveSystemMessage3);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    LiveSystemMessage liveSystemMessage4 = (LiveSystemMessage) JSON.parseObject(str, LiveSystemMessage.class);
                    b bVar6 = this.k;
                    if (bVar6 != null) {
                        bVar6.onMessageReceived(1015, liveSystemMessage4);
                    }
                }
            } else if (i == 10002) {
                String str2 = new String(tLiveMsg.data);
                b bVar7 = this.k;
                if (bVar7 != null) {
                    bVar7.onMessageReceived(101, str2);
                }
                String e3 = u2j.e(str2);
                if ("liveVideoStreamBreak".equals(e3)) {
                    b bVar8 = this.k;
                    if (bVar8 != null) {
                        bVar8.onMessageReceived(1006, null);
                    }
                } else if ("liveVideoStreamRestore".equals(e3)) {
                    b bVar9 = this.k;
                    if (bVar9 != null) {
                        bVar9.onMessageReceived(1007, null);
                    }
                } else if ("liveGift".equals(e3)) {
                    LiveGiftMessage liveGiftMessage = (LiveGiftMessage) JSON.parseObject(str2, LiveGiftMessage.class);
                    liveGiftMessage.msgId = tLiveMsg.timestamp;
                    b bVar10 = this.k;
                    if (bVar10 != null) {
                        bVar10.onMessageReceived(1008, liveGiftMessage);
                    }
                }
            } else if (i == 23001) {
                LiveInteractiveMessage liveInteractiveMessage = new LiveInteractiveMessage();
                liveInteractiveMessage.messageId = tLiveMsg.messageId;
                String str3 = new String(tLiveMsg.data);
                liveInteractiveMessage.data = str3;
                if (this.k == null) {
                    return;
                }
                if (u2j.c(str3)) {
                    this.k.onMessageReceived(1055, liveInteractiveMessage);
                } else {
                    this.k.onMessageReceived(1014, liveInteractiveMessage);
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
                            userAvatar.headImg = v2s.o().f().getApplication().getString(R.string.taolive_user_header_url, Long.valueOf(userAvatar.id));
                            arrayList.add(userAvatar);
                        }
                    }
                    b bVar11 = this.k;
                    if (bVar11 != null) {
                        bVar11.onMessageReceived(102, joinNotifyMessage);
                        this.k.onMessageReceived(1003, arrayList);
                    }
                }
            } else if (i == 200001) {
                JoinNotifyMessage joinNotifyMessage2 = (JoinNotifyMessage) JSON.parseObject(new String(tLiveMsg.data), JoinNotifyMessage.class);
                if (!(joinNotifyMessage2 == null || (bVar = this.k) == null)) {
                    bVar.onMessageReceived(102, joinNotifyMessage2);
                }
            } else if (i == 10104) {
                CountInfoMessage countInfoMessage = (CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class);
                b bVar12 = this.k;
                if (!(bVar12 == null || countInfoMessage == null)) {
                    bVar12.onMessageReceived(1002, countInfoMessage);
                }
            } else if (i == 200002) {
                CountInfoMessage countInfoMessage2 = (CountInfoMessage) JSON.parseObject(new String(tLiveMsg.data), CountInfoMessage.class);
                b bVar13 = this.k;
                if (!(bVar13 == null || countInfoMessage2 == null)) {
                    bVar13.onMessageReceived(1002, countInfoMessage2);
                }
            } else {
                if (i == 10101) {
                    if (this.k != null) {
                        try {
                            this.w.m(tLiveMsg, 104, true);
                            Map<String, String> l = igq.n().l(tLiveMsg);
                            l.put("status", "1");
                            igq.n().s("Page_TaobaoLiveWatch", "PM_STEP_ITEM_PARSE_JSON", l);
                            T(tLiveMsg, (ShareGoodsListMessage) JSON.parseObject(new String(tLiveMsg.data), ShareGoodsListMessage.class), true);
                            return;
                        } catch (Exception e4) {
                            this.w.m(tLiveMsg, 104, false);
                            Map<String, String> l2 = igq.n().l(tLiveMsg);
                            l2.put("status", "0");
                            l2.put("errorCode", igq.n().k(e4));
                            igq n = igq.n();
                            n.o("PM_STEP_ITEM_PARSE_JSON:" + new String(tLiveMsg.data) + ":" + igq.n().k(e4));
                            igq.n().c("liveroomItemMsg", JSON.toJSONString(l2), "PM_STEP_ITEM_PARSE_JSON", igq.n().k(e4));
                            e4.printStackTrace();
                            return;
                        }
                    } else {
                        return;
                    }
                } else if (i == 10010) {
                    b bVar14 = this.k;
                    if (bVar14 != null) {
                        bVar14.onMessageReceived(1011, tLiveMsg.from);
                        return;
                    }
                    return;
                } else if (i == 11015) {
                    b bVar15 = this.k;
                    if (bVar15 != null) {
                        bVar15.onMessageReceived(3009, tLiveMsg);
                        return;
                    }
                    return;
                } else if (i == 10055) {
                    if (this.k != null) {
                        this.k.onMessageReceived(1057, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                        return;
                    }
                    return;
                } else if (i == 10021) {
                    b bVar16 = this.k;
                    if (bVar16 != null) {
                        bVar16.onMessageReceived(1020, new String(tLiveMsg.data));
                        return;
                    }
                    return;
                } else if (i == 70008) {
                    b bVar17 = this.k;
                    if (bVar17 != null) {
                        bVar17.onMessageReceived(1050, tLiveMsg);
                        return;
                    }
                    return;
                } else if (i == 20002) {
                    b bVar18 = this.k;
                    if (bVar18 != null) {
                        bVar18.onMessageReceived(1023, tLiveMsg);
                        return;
                    }
                    return;
                } else if (i == 10099) {
                    if (this.k != null) {
                        this.k.onMessageReceived(1024, (LiveSystemMessage) JSON.parseObject(new String(tLiveMsg.data), LiveSystemMessage.class));
                        return;
                    }
                    return;
                } else if (i == 10098) {
                    b bVar19 = this.k;
                    if (bVar19 != null) {
                        bVar19.onMessageReceived(1026, new String(tLiveMsg.data));
                        return;
                    }
                    return;
                } else {
                    if (!(i == 10015 || i == 60008)) {
                        if (i == 10016) {
                            if (!(this.k == null || (tBTVProgramMessage = (TBTVProgramMessage) JSON.parseObject(new String(tLiveMsg.data), TBTVProgramMessage.class)) == null || !tBTVProgramMessage.inTime)) {
                                this.k.onMessageReceived(1039, tBTVProgramMessage);
                                return;
                            }
                            return;
                        } else if (i == 40001) {
                            if (!(this.k == null || (tBLiveSwitchMsg = (TBLiveSwitchMsg) JSON.parseObject(new String(tLiveMsg.data), TBLiveSwitchMsg.class)) == null)) {
                                this.k.onMessageReceived(1058, tBLiveSwitchMsg);
                                return;
                            }
                            return;
                        } else if (i == 40002) {
                            if (!(this.k == null || (tBLivePVMsg = (TBLivePVMsg) JSON.parseObject(new String(tLiveMsg.data), TBLivePVMsg.class)) == null)) {
                                this.k.onMessageReceived(1059, tBLivePVMsg);
                                return;
                            }
                            return;
                        } else if (i == 10031) {
                            b bVar20 = this.k;
                            if (bVar20 != null) {
                                bVar20.onMessageReceived(1040, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 100000000) {
                            if (this.k != null) {
                                this.k.onMessageReceived(3008, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 10033) {
                            b bVar21 = this.k;
                            if (bVar21 != null) {
                                bVar21.onMessageReceived(1051, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 10056) {
                            b bVar22 = this.k;
                            if (bVar22 != null) {
                                bVar22.onMessageReceived(1056, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 122233) {
                            b bVar23 = this.k;
                            if (bVar23 != null) {
                                bVar23.onMessageReceived(1060, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 880000284) {
                            b bVar24 = this.k;
                            if (bVar24 != null) {
                                bVar24.onMessageReceived(PowerMsgType.MULTI_PK_HOT_MSG, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 122234) {
                            b bVar25 = this.k;
                            if (bVar25 != null) {
                                bVar25.onMessageReceived(1061, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 30005) {
                            b bVar26 = this.k;
                            if (bVar26 != null) {
                                bVar26.onMessageReceived(2000, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 610000) {
                            b bVar27 = this.k;
                            if (bVar27 != null) {
                                bVar27.onMessageReceived(MSG_TYPE_MEDIADATA, tLiveMsg);
                                return;
                            }
                            return;
                        } else if (i == 10119) {
                            if (this.k != null) {
                                this.k.onMessageReceived(1062, (LiveCommonTipsMsg) JSON.parseObject(new String(tLiveMsg.data), LiveCommonTipsMsg.class));
                                return;
                            }
                            return;
                        } else if (i == 10036) {
                            b bVar28 = this.k;
                            if (bVar28 != null) {
                                bVar28.onMessageReceived(MSG_TYPE_TAOLIVE_MSG_CARD, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 10110) {
                            if (this.k != null) {
                                this.k.onMessageReceived(MSG_TYPE_COMMENT_COUNT, (CommentCountMessage) fkx.f(new String(tLiveMsg.data), CommentCountMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 10144) {
                            if (this.k != null) {
                                this.k.onMessageReceived(MSG_TYPE_TOP_ATMOSPHERE, (TopAtmosphereMessage) fkx.f(new String(tLiveMsg.data), TopAtmosphereMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 200003) {
                            if (this.k != null) {
                                this.k.onMessageReceived(10001, JSON.parseObject(new String(tLiveMsg.data)).getString("liveId"));
                                return;
                            }
                            return;
                        } else if (i == 18782) {
                            b bVar29 = this.k;
                            if (bVar29 != null) {
                                bVar29.onMessageReceived(3001, tLiveMsg);
                                return;
                            }
                            return;
                        } else if (i == 18790) {
                            b bVar30 = this.k;
                            if (bVar30 != null) {
                                bVar30.onMessageReceived(3002, tLiveMsg);
                                return;
                            }
                            return;
                        } else if (i == 100000009) {
                            b bVar31 = this.k;
                            if (bVar31 != null) {
                                bVar31.onMessageReceived(3003, tLiveMsg);
                                return;
                            }
                            return;
                        } else if (i == 100000010) {
                            a(tLiveMsg);
                            return;
                        } else if (i == 880000090) {
                            b bVar32 = this.k;
                            if (!(bVar32 == null || (bArr7 = tLiveMsg.data) == null)) {
                                bVar32.onMessageReceived(MSG_TYPE_PRODUCT_HIDE_CASE_WITH_PM, new String(bArr7));
                                return;
                            }
                            return;
                        } else if (i == 880000112) {
                            if (this.k != null) {
                                this.k.onMessageReceived(MSG_TYPE_SWITCH_OFFICIAL, (SwitchOfficialMessage) JSON.parseObject(new String(tLiveMsg.data), SwitchOfficialMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 881000154) {
                            b bVar33 = this.k;
                            if (!(bVar33 == null || (bArr6 = tLiveMsg.data) == null)) {
                                bVar33.onMessageReceived(MSG_TYPE_HOT_BUY, new String(bArr6));
                                return;
                            }
                            return;
                        } else if (i == 880000160) {
                            b bVar34 = this.k;
                            if (!(bVar34 == null || (bArr5 = tLiveMsg.data) == null)) {
                                bVar34.onMessageReceived(MSG_TYPE_SECKILL_SELLOUT, new String(bArr5));
                                return;
                            }
                            return;
                        } else if (i == 880000157) {
                            b bVar35 = this.k;
                            if (!(bVar35 == null || (bArr4 = tLiveMsg.data) == null)) {
                                bVar35.onMessageReceived(2001, new String(bArr4));
                                return;
                            }
                            return;
                        } else if (i == 880000168) {
                            b bVar36 = this.k;
                            if (!(bVar36 == null || (bArr3 = tLiveMsg.data) == null)) {
                                bVar36.onMessageReceived(PowerMsgType.swash_letters_msg, new String(bArr3));
                                return;
                            }
                            return;
                        } else if (i == 880000202) {
                            b bVar37 = this.k;
                            if (!(bVar37 == null || (bArr2 = tLiveMsg.data) == null)) {
                                bVar37.onMessageReceived(MSG_TYPE_COMMENT_STATUS, new String(bArr2));
                                return;
                            }
                            return;
                        } else if (i == 880000204) {
                            b bVar38 = this.k;
                            if (!(bVar38 == null || (bArr = tLiveMsg.data) == null)) {
                                bVar38.onMessageReceived(MSG_TYPE_PRODUCT_HOT_GOOD, new String(bArr));
                                return;
                            }
                            return;
                        } else if (i == 880000205) {
                            this.k.onMessageReceived(MSG_TYPE_PRODUCT_EXPLAIN_NEW, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000206) {
                            this.k.onMessageReceived(MSG_TYPE_PRODUCT_EXPLAIN_DELETE, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000210) {
                            this.k.onMessageReceived(MSG_TYPE_IMPORTANT_EVENT_NOTIFY, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000238) {
                            this.k.onMessageReceived(MSG_TYPE_CHEER_BUY_GIFT, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000248) {
                            this.k.onMessageReceived(MSG_TYPE_GIFT_WISH, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000242) {
                            this.k.onMessageReceived(3000, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000247) {
                            this.k.onMessageReceived(6000, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000253) {
                            this.k.onMessageReceived(6001, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000255) {
                            this.k.onMessageReceived(6002, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000258) {
                            this.k.onMessageReceived(6004, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000257) {
                            this.k.onMessageReceived(6003, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000277) {
                            this.k.onMessageReceived(6006, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000264) {
                            this.k.onMessageReceived(6005, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000217) {
                            this.k.onMessageReceived(i, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000219) {
                            this.k.onMessageReceived(10098, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000227) {
                            this.k.onMessageReceived(10099, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000228) {
                            this.k.onMessageReceived(10080, new String(tLiveMsg.data));
                            return;
                        } else if (i == 881000244) {
                            this.k.onMessageReceived(10084, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000246) {
                            this.k.onMessageReceived(10085, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000249) {
                            this.k.onMessageReceived(PowerMsgType.ASIAN_GAMES_BADGE_MSG, new String(tLiveMsg.data));
                            return;
                        } else if (i == 880000272 && !hjr.o()) {
                            b bVar39 = this.k;
                            if (bVar39 != null) {
                                bVar39.onMessageReceived(PowerMsgType.FANS_CLUB_MSG, new String(tLiveMsg.data));
                                return;
                            }
                            return;
                        } else if (i == 888000111) {
                            if (this.k != null) {
                                this.k.onMessageReceived(i, (OfficialLiveSwitchNextMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveSwitchNextMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 888000112) {
                            if (this.k != null) {
                                this.k.onMessageReceived(i, (OfficialLiveInfoMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveInfoMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 888000113) {
                            if (this.k != null) {
                                this.k.onMessageReceived(i, (OfficialLiveEndMessage) JSON.parseObject(new String(tLiveMsg.data), OfficialLiveEndMessage.class));
                                return;
                            }
                            return;
                        } else if (i == 880000269) {
                            if (this.k != null) {
                                this.k.onMessageReceived(i, (DisableAddOneCommentMessage) JSON.parseObject(new String(tLiveMsg.data), DisableAddOneCommentMessage.class));
                                return;
                            }
                            return;
                        } else if (i != 880000279) {
                            b bVar40 = this.k;
                            if (bVar40 != null) {
                                bVar40.onMessageReceived(1018, tLiveMsg);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("type", (Object) Integer.valueOf(i));
                                String str5 = new String(tLiveMsg.data);
                                if (!TextUtils.isEmpty(str5)) {
                                    jSONObject.put("subType", (Object) u2j.e(str5));
                                    try {
                                        jSONObject.put("data", (Object) JSON.parseObject(str5));
                                    } catch (Exception e5) {
                                        String str6 = I;
                                        o3s.b(str6, "handlePowerMessage error: " + e5.getMessage());
                                    }
                                }
                                this.k.onMessageReceived(bl9.f(), jSONObject);
                                return;
                            }
                            return;
                        } else if (this.k != null) {
                            this.k.onMessageReceived(i, (ExplainBehaviorReportMessage) fkx.g(tLiveMsg.data, ExplainBehaviorReportMessage.class, new Feature[0]));
                            return;
                        } else {
                            return;
                        }
                    }
                    N(new String(tLiveMsg.data));
                    return;
                }
                e.printStackTrace();
            }
        }
    }

    public final boolean K(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3831cd34", new Object[]{this, jSONObject})).booleanValue();
        }
        String string = jSONObject.getString("type");
        return ("activity".equals(string) && "auction".equals(JSON.parseObject(jSONObject.getString("data")).getString("bizType"))) || "auction".equals(string);
    }

    public final boolean M(TLiveMsg tLiveMsg) {
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

    public final void T(TLiveMsg tLiveMsg, ShareGoodsListMessage shareGoodsListMessage, boolean z) {
        ShareGoodMessage[] shareGoodMessageArr;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("386162f2", new Object[]{this, tLiveMsg, shareGoodsListMessage, new Boolean(z)});
            return;
        }
        String str = "CDN";
        if (shareGoodsListMessage == null || (shareGoodMessageArr = shareGoodsListMessage.goodsList) == null || shareGoodMessageArr.length <= 0) {
            if (tLiveMsg != null) {
                this.w.m(tLiveMsg, 105, false);
            }
            if (shareGoodsListMessage != null) {
                Map<String, String> l = igq.n().l(tLiveMsg);
                l.put("status", "0");
                if (z) {
                    str = "PM";
                }
                l.put("type", str);
                l.put("errorCode", "goodsMsg:" + JSON.toJSONString(shareGoodsListMessage));
                igq n = igq.n();
                n.o("PM_STEP_ITEM_CHECK_GOOD_LIST:" + JSON.toJSONString(shareGoodsListMessage));
                igq.n().c("liveroomItemMsg", JSON.toJSONString(l), "PM_STEP_ITEM_CHECK_GOOD_LIST", "PM_STEP_ITEM_CHECK_GOOD_LIST");
                return;
            }
            return;
        }
        if (z) {
            this.w.m(tLiveMsg, 105, true);
        }
        ShareGoodMessage[] shareGoodMessageArr2 = shareGoodsListMessage.goodsList;
        if (!(shareGoodMessageArr2 == null || shareGoodMessageArr2[0] == null)) {
            if (this.q == null) {
                this.s = qvs.s0();
                this.q = new ArrayDeque(this.s);
            }
            Map<String, String> map = shareGoodMessageArr2[0].extendVal;
            if (map != null) {
                String str2 = map.get(TYPE_MSG_UUID);
                if (TextUtils.isEmpty(str2) || !this.q.contains(str2)) {
                    if (!TextUtils.isEmpty(str2) && !this.q.contains(str2)) {
                        n(str2);
                        Map<String, String> l2 = igq.n().l(tLiveMsg);
                        l2.put("itemId", shareGoodsListMessage.goodsList[0].itemId);
                        if (z) {
                            str = "PM";
                        }
                        l2.put("type", str);
                        igq.n().s("Page_TaobaoLiveWatch", "ItemInfoArrivalFirst", l2);
                        if (tLiveMsg != null) {
                            this.w.m(tLiveMsg, 106, true);
                        }
                    } else if (TextUtils.isEmpty(str2) && !z) {
                        return;
                    }
                } else if (tLiveMsg != null) {
                    this.w.m(tLiveMsg, 199, true);
                    igq.n().d("liveroomItemMsg");
                    b bVar = this.k;
                    if (bVar != null) {
                        bVar.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_CDN_INVALID, tLiveMsg);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
        }
        this.k.onMessageReceived(1009, shareGoodsListMessage);
        if (tLiveMsg != null) {
            this.k.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_PM, tLiveMsg);
        } else {
            this.k.onMessageReceived(MSG_TYPE_PRODUCT_LIST_WITH_CDN, shareGoodsListMessage);
        }
    }

    public final boolean v(Comment comment, Object obj) {
        HashMap<String, String> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("380801d0", new Object[]{this, comment, obj})).booleanValue();
        }
        HashMap<String, String> hashMap2 = comment.renders;
        boolean z = hashMap2 != null && ("follow".equals(hashMap2.get(yj4.PARAM_CHAT_RENDERS_ENHANCE)) || "share".equals(comment.renders.get(yj4.PARAM_CHAT_RENDERS_ENHANCE)) || "fandomShare".equals(comment.renders.get(yj4.PARAM_CHAT_RENDERS_ENHANCE)));
        boolean contains = true ^ this.g.contains(comment.commentId);
        if (TextUtils.isEmpty(J) || (hashMap = comment.renders) == null || !J.equals(hashMap.get("userToken")) || z) {
            return contains;
        }
        return false;
    }
}
