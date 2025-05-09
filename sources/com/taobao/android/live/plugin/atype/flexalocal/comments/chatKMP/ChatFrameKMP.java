package com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.accs.common.Constants;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.ChatFrameKMP;
import com.taobao.android.live.plugin.atype.flexalocal.comments.chatKMP.component.Normal.NormalComponent;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.enter.ITaoLiveKtEnterAtmosphereEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResponse;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentShowPriority;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.TaoLiveKtCommentDriverResult;
import com.taobao.taobao.R;
import com.taobao.taolive.room.business.trivial.TrivialQueryResponseData;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.adapter.network.NetResponse;
import com.taobao.taolive.sdk.mergeInfo.UnImportantLiveInfoResponseData;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.a4s;
import tb.azd;
import tb.bhw;
import tb.cj2;
import tb.clo;
import tb.cpr;
import tb.d9m;
import tb.e9m;
import tb.f3c;
import tb.fgv;
import tb.fkx;
import tb.fzf;
import tb.g1a;
import tb.giv;
import tb.hha;
import tb.hp3;
import tb.hw0;
import tb.hzf;
import tb.ibt;
import tb.jp3;
import tb.jv0;
import tb.k8p;
import tb.nh4;
import tb.o3s;
import tb.op3;
import tb.p44;
import tb.q0h;
import tb.q6b;
import tb.qf1;
import tb.s3c;
import tb.si6;
import tb.sjr;
import tb.t2o;
import tb.u1a;
import tb.urf;
import tb.ux9;
import tb.uyg;
import tb.vc;
import tb.x0d;
import tb.xf1;
import tb.xhv;
import tb.zl8;
import tb.zrl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ChatFrameKMP extends BaseFrame implements x0d, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String CHAT_VIEW_STYLE_CHANGE = "com.taobao.taolive.room.chat_view_style_change";
    private static final String TAG = "ChatFrameKMP";
    private jv0 anchorResponseComponent;
    private qf1 atTopComponent;
    private xf1 atmosphere2Component;
    private cj2 bottomComponent;
    private ITaoLiveKtCommentManager commentManager;
    private ITaoLiveKtCommentShowPriority commentShowPriority;
    private int containerOriginalHeight;
    private zl8 everyBodySayComponent;
    private q6b hotSaleComponent;
    private FrameLayout mAuctionFrameLayout;
    private NormalComponent normalComponent;
    private int offset;
    private ValueAnimator onSabAtmosphereDismissAnimator;
    private ValueAnimator onSabAtmosphereShowAnimator;
    private int originalHeight;
    private k8p securityWarningComponent;
    private Map<String, String> mOpenConfig = new HashMap();
    private hp3 mChatStyleConfig = jp3.b();
    private boolean hideHotSale = false;
    private final Handler mMainHandler = new Handler(Looper.getMainLooper());
    private final cpr.b mMessageListener = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            JSONObject d;
            TBLiveDataModel tBLiveDataModel;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (i == 1072 && (obj instanceof String) && (d = fkx.d(String.valueOf(obj))) != null && (tBLiveDataModel = ChatFrameKMP.this.mLiveDataModel) != null && tBLiveDataModel.mVideoInfo != null) {
                HashMap hashMap = new HashMap();
                if (d.getIntValue("switchStatus") == 1) {
                    ChatFrameKMP.this.hide();
                    hashMap.put("switchStatus", "1");
                    if (ChatFrameKMP.access$000(ChatFrameKMP.this) != null) {
                        ChatFrameKMP.access$000(ChatFrameKMP.this).stopManager();
                    }
                    ChatFrameKMP.access$100(ChatFrameKMP.this);
                } else {
                    ChatFrameKMP.access$200(ChatFrameKMP.this);
                    ChatFrameKMP.access$300(ChatFrameKMP.this);
                    ChatFrameKMP chatFrameKMP = ChatFrameKMP.this;
                    ChatFrameKMP.access$400(chatFrameKMP, chatFrameKMP.mLiveDataModel);
                    ChatFrameKMP.access$500(ChatFrameKMP.this);
                    ChatFrameKMP.this.show();
                }
                giv.f().o(ChatFrameKMP.this.mFrameContext, 19999, "pmCommentSwitchStatus", hashMap);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            ChatFrameKMP chatFrameKMP = ChatFrameKMP.this;
            ChatFrameKMP.access$602(chatFrameKMP, chatFrameKMP.getComponentView().getMeasuredHeight());
            o3s.b(ChatFrameKMP.TAG, "initContainerOriginalHeight |set containerOriginalHeight=" + ChatFrameKMP.access$600(ChatFrameKMP.this));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f8411a;

        public c(String str) {
            this.f8411a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ChatFrameKMP.access$700(ChatFrameKMP.this, this.f8411a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements fgv.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8d54c3ef", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSuccess(int i, NetResponse netResponse, UnImportantLiveInfoResponseData unImportantLiveInfoResponseData, Object obj) {
            String str;
            TrivialQueryResponseData trivialQueryResponseData;
            TrivialQueryResponseData.ResultVoData resultVoData;
            TrivialQueryResponseData.CommonPMV0 commonPMV0;
            List<TrivialQueryResponseData.ChatItemCommonData> list;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3bacf307", new Object[]{this, new Integer(i), netResponse, unImportantLiveInfoResponseData, obj});
            } else if (unImportantLiveInfoResponseData != null && (str = unImportantLiveInfoResponseData.trivialData) != null && (trivialQueryResponseData = (TrivialQueryResponseData) zrl.b(str, TrivialQueryResponseData.class)) != null && (resultVoData = trivialQueryResponseData.resultVO) != null && (commonPMV0 = resultVoData.commonPMVO) != null && (list = commonPMV0.pmlist) != null && !list.isEmpty()) {
                for (TrivialQueryResponseData.ChatItemCommonData chatItemCommonData : list) {
                    Map<String, ? extends Object> b = urf.b((JSONObject) fkx.h(chatItemCommonData));
                    if (ChatFrameKMP.access$000(ChatFrameKMP.this) != null) {
                        ChatFrameKMP.access$000(ChatFrameKMP.this).updateDetailTrivialComment(b);
                    }
                }
            }
        }

        @Override // tb.fgv.e
        public void onUnImportantLiveInfoSystemError(int i, NetResponse netResponse, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61b1993e", new Object[]{this, new Integer(i), netResponse, obj});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(ChatFrameKMP chatFrameKMP) {
        }

        public static /* synthetic */ Object ipc$super(e eVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/ChatFrameKMP$5");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            if (i == 1072) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f8413a;

        public f(Object obj) {
            this.f8413a = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            if (ChatFrameKMP.access$800(ChatFrameKMP.this) == 0 && ChatFrameKMP.access$900(ChatFrameKMP.this) == 0) {
                ChatFrameKMP chatFrameKMP = ChatFrameKMP.this;
                ChatFrameKMP.access$802(chatFrameKMP, chatFrameKMP.getComponentView().getMeasuredHeight());
                ChatFrameKMP.access$902(ChatFrameKMP.this, ((Integer) this.f8413a).intValue() / 3);
            }
            o3s.b(ChatFrameKMP.TAG, "onSabAtmosphereShow | liveId=" + ChatFrameKMP.this.getLiveId() + ", originalHeight=" + ChatFrameKMP.access$800(ChatFrameKMP.this) + ", offset=" + ChatFrameKMP.access$900(ChatFrameKMP.this));
            if (ChatFrameKMP.access$800(ChatFrameKMP.this) > 0 && ChatFrameKMP.access$900(ChatFrameKMP.this) > 0) {
                ChatFrameKMP chatFrameKMP2 = ChatFrameKMP.this;
                ChatFrameKMP.access$1002(chatFrameKMP2, ChatFrameKMP.access$1100(chatFrameKMP2, ChatFrameKMP.access$800(chatFrameKMP2), ChatFrameKMP.access$800(ChatFrameKMP.this) - ChatFrameKMP.access$900(ChatFrameKMP.this)));
                if (ChatFrameKMP.access$1200(ChatFrameKMP.this) != null && ChatFrameKMP.access$1200(ChatFrameKMP.this).isRunning()) {
                    ChatFrameKMP.access$1200(ChatFrameKMP.this).cancel();
                }
                ChatFrameKMP.access$1000(ChatFrameKMP.this).start();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ChatFrameKMP.access$1302(ChatFrameKMP.this, false);
            }
        }
    }

    static {
        t2o.a(295698615);
        t2o.a(295698644);
        t2o.a(806355016);
    }

    public ChatFrameKMP(Context context, ux9 ux9Var) {
        super(context, ux9Var);
    }

    public static /* synthetic */ ITaoLiveKtCommentManager access$000(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ITaoLiveKtCommentManager) ipChange.ipc$dispatch("834a51ce", new Object[]{chatFrameKMP});
        }
        return chatFrameKMP.commentManager;
    }

    public static /* synthetic */ void access$100(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c7b77c8", new Object[]{chatFrameKMP});
        } else {
            chatFrameKMP.cleanComponentData();
        }
    }

    public static /* synthetic */ ValueAnimator access$1000(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("3cdadd7e", new Object[]{chatFrameKMP});
        }
        return chatFrameKMP.onSabAtmosphereShowAnimator;
    }

    public static /* synthetic */ ValueAnimator access$1002(ChatFrameKMP chatFrameKMP, ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("913dd3c0", new Object[]{chatFrameKMP, valueAnimator});
        }
        chatFrameKMP.onSabAtmosphereShowAnimator = valueAnimator;
        return valueAnimator;
    }

    public static /* synthetic */ ValueAnimator access$1100(ChatFrameKMP chatFrameKMP, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("5f2fa3d", new Object[]{chatFrameKMP, new Integer(i), new Integer(i2)});
        }
        return chatFrameKMP.getValueAnimator(i, i2);
    }

    public static /* synthetic */ ValueAnimator access$1200(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("cf08eabc", new Object[]{chatFrameKMP});
        }
        return chatFrameKMP.onSabAtmosphereDismissAnimator;
    }

    public static /* synthetic */ boolean access$1302(ChatFrameKMP chatFrameKMP, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4bd4e8c3", new Object[]{chatFrameKMP, new Boolean(z)})).booleanValue();
        }
        chatFrameKMP.hideHotSale = z;
        return z;
    }

    public static /* synthetic */ void access$200(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a21cba67", new Object[]{chatFrameKMP});
        } else {
            chatFrameKMP.initOpenConfig();
        }
    }

    public static /* synthetic */ void access$300(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7bdfd06", new Object[]{chatFrameKMP});
        } else {
            chatFrameKMP.initComponents();
        }
    }

    public static /* synthetic */ void access$400(ChatFrameKMP chatFrameKMP, TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79ac2d5e", new Object[]{chatFrameKMP, tBLiveDataModel});
        } else {
            chatFrameKMP.updateLiveDetail(tBLiveDataModel);
        }
    }

    public static /* synthetic */ void access$500(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73008244", new Object[]{chatFrameKMP});
        } else {
            chatFrameKMP.initCommentManager();
        }
    }

    public static /* synthetic */ int access$600(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("b8a1c4d6", new Object[]{chatFrameKMP})).intValue();
        }
        return chatFrameKMP.containerOriginalHeight;
    }

    public static /* synthetic */ int access$602(ChatFrameKMP chatFrameKMP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("cb702575", new Object[]{chatFrameKMP, new Integer(i)})).intValue();
        }
        chatFrameKMP.containerOriginalHeight = i;
        return i;
    }

    public static /* synthetic */ void access$700(ChatFrameKMP chatFrameKMP, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af7a14cc", new Object[]{chatFrameKMP, str});
        } else {
            chatFrameKMP.updateChatViewStyle(str);
        }
    }

    public static /* synthetic */ int access$800(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("43e44a14", new Object[]{chatFrameKMP})).intValue();
        }
        return chatFrameKMP.originalHeight;
    }

    public static /* synthetic */ int access$802(ChatFrameKMP chatFrameKMP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a87e47f7", new Object[]{chatFrameKMP, new Integer(i)})).intValue();
        }
        chatFrameKMP.originalHeight = i;
        return i;
    }

    public static /* synthetic */ int access$900(ChatFrameKMP chatFrameKMP) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("89858cb3", new Object[]{chatFrameKMP})).intValue();
        }
        return chatFrameKMP.offset;
    }

    public static /* synthetic */ int access$902(ChatFrameKMP chatFrameKMP, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("17055938", new Object[]{chatFrameKMP, new Integer(i)})).intValue();
        }
        chatFrameKMP.offset = i;
        return i;
    }

    private void cancelAnimator() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57237f88", new Object[]{this});
            return;
        }
        ValueAnimator valueAnimator = this.onSabAtmosphereShowAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.onSabAtmosphereDismissAnimator;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        o3s.b(TAG, "cancelAnimator | liveId=" + getLiveId() + ", originalHeight=" + this.originalHeight + ", offset=" + this.offset);
        if (this.originalHeight > 0 && this.offset > 0) {
            bhw.e(getComponentView(), this.originalHeight);
            getComponentView().setTranslationY(0.0f);
            if (!nh4.q()) {
                this.originalHeight = 0;
                this.offset = 0;
            }
        }
    }

    private boolean checkLiveId(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8741a573", new Object[]{this, map})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || tBLiveDataModel.mVideoInfo == null) {
            return false;
        }
        String str = map.get("liveId");
        if (!TextUtils.isEmpty(str) && str != null && str.equals(this.mLiveDataModel.mVideoInfo.liveId)) {
            return true;
        }
        return false;
    }

    private void cleanAtmosphereData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6934e09c", new Object[]{this});
            return;
        }
        xf1 xf1Var = this.atmosphere2Component;
        if (xf1Var != null) {
            xf1Var.a();
            this.atmosphere2Component = null;
        }
    }

    private void cleanComponentData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27da8805", new Object[]{this});
            return;
        }
        this.commentManager = null;
        NormalComponent normalComponent = this.normalComponent;
        if (normalComponent != null) {
            normalComponent.a();
            this.normalComponent = null;
        }
        q6b q6bVar = this.hotSaleComponent;
        if (q6bVar != null) {
            q6bVar.a();
            this.hotSaleComponent = null;
        }
        cj2 cj2Var = this.bottomComponent;
        if (cj2Var != null) {
            cj2Var.a();
            this.bottomComponent = null;
        }
        qf1 qf1Var = this.atTopComponent;
        if (qf1Var != null) {
            qf1Var.a();
            this.atTopComponent = null;
        }
        zl8 zl8Var = this.everyBodySayComponent;
        if (zl8Var != null) {
            zl8Var.a();
            this.everyBodySayComponent = null;
        }
        k8p k8pVar = this.securityWarningComponent;
        if (k8pVar != null) {
            k8pVar.a();
            this.securityWarningComponent = null;
        }
        jv0 jv0Var = this.anchorResponseComponent;
        if (jv0Var != null) {
            jv0Var.a();
            this.anchorResponseComponent = null;
        }
    }

    private void clearContainerViewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("103683f", new Object[]{this});
            return;
        }
        this.mMainHandler.removeCallbacksAndMessages(null);
        bhw.d(getComponentView(), 0);
        int b2 = hw0.b(this.mContext, 180.0f);
        o3s.b(TAG, "clearContainerAnimator | liveId=" + getLiveId() + ", containerOriginalHeight=" + this.containerOriginalHeight + "180dp height = " + b2);
        bhw.e(getComponentView(), Math.max(this.containerOriginalHeight, b2));
        this.containerOriginalHeight = 0;
        this.mChatStyleConfig = jp3.b();
        this.hideHotSale = false;
    }

    private void commonCommentToScreen(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93904509", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        fzf a2 = hzf.a(taoLiveKtCommentEntity);
        NormalComponent normalComponent = this.normalComponent;
        if (normalComponent != null) {
            normalComponent.K(a2);
        }
    }

    private hp3 getChatStyleConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hp3) ipChange.ipc$dispatch("f2103ecc", new Object[]{this});
        }
        if (this.mChatStyleConfig == null) {
            this.mChatStyleConfig = jp3.b();
        }
        return this.mChatStyleConfig;
    }

    private ValueAnimator getValueAnimator(int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ValueAnimator) ipChange.ipc$dispatch("9b66e6cd", new Object[]{this, new Integer(i), new Integer(i2)});
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: tb.pl3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                ChatFrameKMP.this.lambda$getValueAnimator$19(valueAnimator);
            }
        });
        ofInt.setDuration(250L);
        return ofInt;
    }

    private void handleCommentDriverResult(TaoLiveKtCommentDriverResult taoLiveKtCommentDriverResult) {
        ITaoLiveKtCommentManager iTaoLiveKtCommentManager;
        ITaoLiveKtEnterAtmosphereEntity readComment;
        ITaoLiveKtCommentManager iTaoLiveKtCommentManager2;
        TaoLiveKtCommentEntity readAnchorResponse;
        k8p k8pVar;
        NormalComponent normalComponent;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b568c5a1", new Object[]{this, taoLiveKtCommentDriverResult});
            return;
        }
        TaoLiveKtCommentEntity normal = taoLiveKtCommentDriverResult.getNormal();
        if (!(normal == null || (normalComponent = this.normalComponent) == null)) {
            normalComponent.c(normal);
        }
        TaoLiveKtCommentEntity warning = taoLiveKtCommentDriverResult.getWarning();
        if (!(getChatStyleConfig().f20797a || warning == null || (k8pVar = this.securityWarningComponent) == null)) {
            k8pVar.c(warning);
        }
        TaoLiveKtCommentEntity normalResponse = taoLiveKtCommentDriverResult.getNormalResponse();
        if (!getChatStyleConfig().b && normalResponse != null) {
            commonCommentToScreen(normalResponse);
        }
        if (!(getChatStyleConfig().b || (iTaoLiveKtCommentManager2 = this.commentManager) == null || iTaoLiveKtCommentManager2.getCommentDataCenter() == null || (readAnchorResponse = this.commentManager.getCommentDataCenter().readAnchorResponse()) == null || this.anchorResponseComponent == null || this.commentShowPriority.getAnchorResponseShowing())) {
            this.anchorResponseComponent.c(readAnchorResponse);
        }
        TaoLiveKtCommentEntity everyBodySay = taoLiveKtCommentDriverResult.getEveryBodySay();
        if (!getChatStyleConfig().d && everyBodySay != null && this.everyBodySayComponent != null && !this.commentShowPriority.getEveryBodySayHidden()) {
            this.everyBodySayComponent.c(everyBodySay);
        }
        TaoLiveKtCommentEntity hotSale = taoLiveKtCommentDriverResult.getHotSale();
        if (!this.hideHotSale && !getChatStyleConfig().e && hotSale != null && this.hotSaleComponent != null && !this.commentShowPriority.getHotSaleHidden()) {
            this.hotSaleComponent.c(hotSale);
        }
        TaoLiveKtCommentEntity bottom = taoLiveKtCommentDriverResult.getBottom();
        if (!getChatStyleConfig().c && bottom != null && this.bottomComponent != null && !this.commentShowPriority.getBottomHidden()) {
            this.bottomComponent.c(bottom);
        }
        if (taoLiveKtCommentDriverResult.getAtmospherePop() && !getChatStyleConfig().f && this.atmosphere2Component != null && (iTaoLiveKtCommentManager = this.commentManager) != null && iTaoLiveKtCommentManager.getCommentDataCenter() != null && (readComment = this.commentManager.getCommentDataCenter().getEnterAtmospheres().readComment()) != null) {
            this.atmosphere2Component.f(readComment);
        }
    }

    private void handleLocalData(List<TaoLiveKtCommentEntity> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("66365f65", new Object[]{this, list});
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            commonCommentToScreen(list.get(i));
        }
    }

    private void handleLocalSendData(TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70f19761", new Object[]{this, taoLiveKtCommentSendResponse, taoLiveKtCommentEntity});
        } else if (taoLiveKtCommentSendResponse.getResultModel() != null) {
            if (!taoLiveKtCommentSendResponse.getSuccess()) {
                hw0.w(this.mContext, taoLiveKtCommentSendResponse.getResultModel().getErrorMsg(), 17);
            } else if (this.normalComponent != null) {
                if (taoLiveKtCommentSendResponse.getUserAction()) {
                    this.normalComponent.e0();
                }
                if (taoLiveKtCommentSendResponse.getCanShow()) {
                    parseImageCommentToScreen(taoLiveKtCommentEntity);
                } else if (taoLiveKtCommentSendResponse.getNeedAlert()) {
                    p44.f(taoLiveKtCommentSendResponse.getResultModel().getMessageInfo(), this.mContext);
                }
            }
        }
    }

    private void handlePriorityChanged(ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        zl8 zl8Var;
        q6b q6bVar;
        cj2 cj2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed6f179c", new Object[]{this, iTaoLiveKtCommentShowPriority});
            return;
        }
        if (iTaoLiveKtCommentShowPriority.getBottomHidden() && (cj2Var = this.bottomComponent) != null) {
            cj2Var.i(true);
            this.bottomComponent.a();
        }
        if (iTaoLiveKtCommentShowPriority.getHotSaleHidden() && (q6bVar = this.hotSaleComponent) != null) {
            q6bVar.h(true);
            this.hotSaleComponent.a();
        }
        if (iTaoLiveKtCommentShowPriority.getEveryBodySayHidden() && (zl8Var = this.everyBodySayComponent) != null) {
            zl8Var.m(true);
            this.everyBodySayComponent.a();
        }
    }

    private void initAtmosphereComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a0755d2", new Object[]{this});
        } else {
            this.atmosphere2Component = new xf1(this.mContext, this.mContainer);
        }
    }

    private void initChatViewStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bad6d8eb", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            String f2 = op3.f(ux9Var);
            o3s.b(TAG, "initChatViewStyle | bigCardInfo=" + f2);
            if (!TextUtils.isEmpty(f2)) {
                getComponentView().post(new c(f2));
            }
        }
    }

    private void initCommentManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd804b05", new Object[]{this});
            return;
        }
        ITaoLiveKtCommentManager iTaoLiveKtCommentManager = this.commentManager;
        if (iTaoLiveKtCommentManager != null) {
            iTaoLiveKtCommentManager.setDriverCallback(new g1a() { // from class: tb.fl3
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv lambda$initCommentManager$14;
                    lambda$initCommentManager$14 = ChatFrameKMP.this.lambda$initCommentManager$14((TaoLiveKtCommentDriverResult) obj);
                    return lambda$initCommentManager$14;
                }
            });
            this.commentManager.setLocalDriverCallback(new g1a() { // from class: tb.hl3
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv lambda$initCommentManager$15;
                    lambda$initCommentManager$15 = ChatFrameKMP.this.lambda$initCommentManager$15((List) obj);
                    return lambda$initCommentManager$15;
                }
            });
            this.commentManager.setLocalSendCallback(new u1a() { // from class: tb.jl3
                @Override // tb.u1a
                public final Object invoke(Object obj, Object obj2) {
                    xhv lambda$initCommentManager$16;
                    lambda$initCommentManager$16 = ChatFrameKMP.this.lambda$initCommentManager$16((TaoLiveKtCommentSendResponse) obj, (TaoLiveKtCommentEntity) obj2);
                    return lambda$initCommentManager$16;
                }
            });
            this.commentShowPriority.listenStatus(new g1a() { // from class: tb.ll3
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv lambda$initCommentManager$17;
                    lambda$initCommentManager$17 = ChatFrameKMP.this.lambda$initCommentManager$17((ITaoLiveKtCommentShowPriority) obj);
                    return lambda$initCommentManager$17;
                }
            });
            this.commentManager.setHotSaleCallBack(new g1a() { // from class: tb.nl3
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv lambda$initCommentManager$18;
                    lambda$initCommentManager$18 = ChatFrameKMP.this.lambda$initCommentManager$18((Map) obj);
                    return lambda$initCommentManager$18;
                }
            });
            this.commentManager.setupCommentOpen(this.mOpenConfig);
            updateTrivialComment();
            this.commentManager.startManager();
        }
    }

    private void initComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c00a1cd", new Object[]{this});
        } else if (d9m.f() != null) {
            ITaoLiveKtCommentManager commentManager = d9m.f().getCommentManager();
            this.commentManager = commentManager;
            if (commentManager != null) {
                if (commentManager.getCommentDataCenter() != null) {
                    this.commentShowPriority = this.commentManager.getCommentDataCenter().getPriority();
                }
                this.hotSaleComponent = new q6b(this.mContext, this.mContainer, this.mFrameContext, this.commentShowPriority);
                this.atTopComponent = new qf1(this.mContext, this.mContainer, this.mFrameContext);
                NormalComponent normalComponent = new NormalComponent(this.mContext, this.mContainer, this.mFrameContext);
                this.normalComponent = normalComponent;
                normalComponent.h0(this);
                this.normalComponent.j0(this.atTopComponent);
                this.bottomComponent = new cj2(this.mContext, this.mContainer, this.mFrameContext);
                this.everyBodySayComponent = new zl8(this.mContext, this.mContainer, this.mFrameContext, this.commentShowPriority);
                this.securityWarningComponent = new k8p(this.mContext, this.mContainer, this.mFrameContext);
                this.anchorResponseComponent = new jv0(this.mContext, this.mContainer, this.mFrameContext, this.commentShowPriority);
            }
        }
    }

    private void initContainerOriginalHeight() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50916210", new Object[]{this});
        } else if (getContainerView() != null) {
            getComponentView().post(new b());
        }
    }

    private void initMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c97f9b2", new Object[]{this});
        } else {
            this.mFrameContext.t().l(this.mMessageListener, new e(this));
        }
    }

    private void initOpenConfig() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d81d9e3", new Object[]{this});
            return;
        }
        ATaoLiveOpenEntity A = this.mFrameContext.A();
        if (A != null && (azdVar = A.abilityCompontent) != null) {
            OpenAbilityCompontentTypeEnum openAbilityCompontentTypeEnum = OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_LRCommentFeatMap;
            if (((ibt) azdVar).d(openAbilityCompontentTypeEnum)) {
                Object c2 = ((ibt) A.abilityCompontent).c(openAbilityCompontentTypeEnum);
                if (c2 instanceof String) {
                    this.mOpenConfig = urf.a(JSON.parseObject((String) c2));
                }
            }
        }
    }

    public static /* synthetic */ Object ipc$super(ChatFrameKMP chatFrameKMP, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -340027132:
                super.show();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case 91531079:
                super.onViewCreated((View) objArr[0]);
                return null;
            case 1659846701:
                super.onScrollStateChanged(((Number) objArr[0]).intValue());
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/comments/chatKMP/ChatFrameKMP");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getValueAnimator$19(ValueAnimator valueAnimator) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e71aec0", new Object[]{this, valueAnimator});
        } else {
            getComponentView().setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue() - this.originalHeight);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$initCommentManager$14(TaoLiveKtCommentDriverResult taoLiveKtCommentDriverResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("e3c132d0", new Object[]{this, taoLiveKtCommentDriverResult});
        }
        handleCommentDriverResult(taoLiveKtCommentDriverResult);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$initCommentManager$15(List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("7508ace4", new Object[]{this, list});
        }
        handleLocalData(list);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$initCommentManager$16(TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse, TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("73207ee7", new Object[]{this, taoLiveKtCommentSendResponse, taoLiveKtCommentEntity});
        }
        handleLocalSendData(taoLiveKtCommentSendResponse, taoLiveKtCommentEntity);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$initCommentManager$17(ITaoLiveKtCommentShowPriority iTaoLiveKtCommentShowPriority) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("68f1dee2", new Object[]{this, iTaoLiveKtCommentShowPriority});
        }
        handlePriorityChanged(iTaoLiveKtCommentShowPriority);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ xhv lambda$initCommentManager$18(Map map) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("ccbe6aad", new Object[]{this, map});
        }
        f3c h = this.mFrameContext.h();
        Object h2 = fkx.h(map);
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            str = null;
        } else {
            str = ux9Var.C();
        }
        h.c("com.taobao.taolive.goods.get.user_buy.data", h2, str);
        return null;
    }

    private void loge(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99ada172", new Object[]{this, str});
        } else if (this.mFrameContext != null) {
            o3s.b(TAG, this.mFrameContext.p() + ": " + str);
        }
    }

    private void parseImageCommentToScreen(TaoLiveKtCommentEntity taoLiveKtCommentEntity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("395f12c", new Object[]{this, taoLiveKtCommentEntity});
            return;
        }
        fzf a2 = hzf.a(taoLiveKtCommentEntity);
        NormalComponent normalComponent = this.normalComponent;
        if (normalComponent != null) {
            normalComponent.L(a2);
        }
        sjr.g().c(uyg.EVENT_KMP_COMMENT_SEND, taoLiveKtCommentEntity, this.mFrameContext.C());
    }

    private void updateChatStyleConfig(hp3 hp3Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0059bb", new Object[]{this, hp3Var});
        } else if (hp3Var != null) {
            this.mChatStyleConfig = hp3Var;
            updateComponentViewStatus();
            NormalComponent normalComponent = this.normalComponent;
            if (normalComponent != null) {
                normalComponent.d(this.mChatStyleConfig);
            }
            cj2 cj2Var = this.bottomComponent;
            if (cj2Var != null) {
                cj2Var.d(this.mChatStyleConfig);
            }
            q6b q6bVar = this.hotSaleComponent;
            if (q6bVar != null) {
                q6bVar.d(this.mChatStyleConfig);
            }
            qf1 qf1Var = this.atTopComponent;
            if (qf1Var != null) {
                qf1Var.d(this.mChatStyleConfig);
            }
            xf1 xf1Var = this.atmosphere2Component;
            if (xf1Var != null) {
                xf1Var.g(this.mChatStyleConfig);
            }
            zl8 zl8Var = this.everyBodySayComponent;
            if (zl8Var != null) {
                zl8Var.d(this.mChatStyleConfig);
            }
            k8p k8pVar = this.securityWarningComponent;
            if (k8pVar != null) {
                k8pVar.d(this.mChatStyleConfig);
            }
            jv0 jv0Var = this.anchorResponseComponent;
            if (jv0Var != null) {
                jv0Var.d(this.mChatStyleConfig);
            }
        }
    }

    private void updateChatViewStyle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e95c79c", new Object[]{this, str});
        } else if (TextUtils.isEmpty(str)) {
            o3s.b(TAG, "chatViewStyle is null");
        } else {
            try {
                JSONObject parseObject = JSON.parseObject(str);
                int intValue = parseObject.getIntValue("containerHeight");
                int intValue2 = parseObject.getIntValue("bottomOffset");
                String jSONString = parseObject.getJSONObject("commentShowStyle").toJSONString();
                if (!TextUtils.isEmpty(jSONString)) {
                    updateChatStyleConfig((hp3) fkx.f(jSONString, hp3.class));
                }
                o3s.b(TAG, "adjust container offset | liveId=" + getLiveId() + ", containerOriginalHeight=" + this.containerOriginalHeight + ", containerHeight=" + intValue + ", bottomOffset=" + intValue2);
                if (intValue2 >= 0) {
                    bhw.d(getComponentView(), intValue2);
                }
                if (intValue >= 0) {
                    bhw.e(getComponentView(), intValue);
                }
                if (intValue == -1) {
                    this.mMainHandler.postDelayed(new g(), nh4.c1() * 1000);
                    bhw.e(getComponentView(), Math.max(this.containerOriginalHeight, hw0.b(this.mContext, 180.0f)));
                    return;
                }
                this.hideHotSale = true;
            } catch (Exception e2) {
                o3s.b(TAG, "adjust container offset error: " + e2.getMessage());
            }
        }
    }

    private void updateComponentViewStatus() {
        jv0 jv0Var;
        k8p k8pVar;
        zl8 zl8Var;
        xf1 xf1Var;
        q6b q6bVar;
        cj2 cj2Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad398f52", new Object[]{this});
            return;
        }
        hp3 hp3Var = this.mChatStyleConfig;
        if (hp3Var != null) {
            if (hp3Var.c && (cj2Var = this.bottomComponent) != null) {
                cj2Var.b(8);
            }
            if (this.mChatStyleConfig.e && (q6bVar = this.hotSaleComponent) != null) {
                q6bVar.b(8);
            }
            if (this.mChatStyleConfig.f && (xf1Var = this.atmosphere2Component) != null) {
                xf1Var.d(8);
            }
            if (this.mChatStyleConfig.d && (zl8Var = this.everyBodySayComponent) != null) {
                zl8Var.b(8);
            }
            if (this.mChatStyleConfig.f20797a && (k8pVar = this.securityWarningComponent) != null) {
                k8pVar.b(8);
            }
            if (this.mChatStyleConfig.b && (jv0Var = this.anchorResponseComponent) != null) {
                jv0Var.b(8);
            }
        }
    }

    private void updateLiveDetail(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6a82b46", new Object[]{this, tBLiveDataModel});
            return;
        }
        NormalComponent normalComponent = this.normalComponent;
        if (normalComponent != null) {
            normalComponent.e(tBLiveDataModel);
        }
        cj2 cj2Var = this.bottomComponent;
        if (cj2Var != null) {
            cj2Var.e(tBLiveDataModel);
        }
        q6b q6bVar = this.hotSaleComponent;
        if (q6bVar != null) {
            q6bVar.e(tBLiveDataModel);
        }
        qf1 qf1Var = this.atTopComponent;
        if (qf1Var != null) {
            qf1Var.e(tBLiveDataModel);
        }
        xf1 xf1Var = this.atmosphere2Component;
        if (xf1Var != null) {
            xf1Var.h();
        }
        zl8 zl8Var = this.everyBodySayComponent;
        if (zl8Var != null) {
            zl8Var.e(tBLiveDataModel);
        }
        k8p k8pVar = this.securityWarningComponent;
        if (k8pVar != null) {
            k8pVar.e(tBLiveDataModel);
        }
        jv0 jv0Var = this.anchorResponseComponent;
        if (jv0Var != null) {
            jv0Var.e(tBLiveDataModel);
        }
    }

    private void updatePosition(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8fba6b9", new Object[]{this, new Integer(i), new Integer(i2)});
            return;
        }
        if (this.mAuctionFrameLayout == null) {
            Context context = this.mContext;
            if (context instanceof Activity) {
                ViewStub viewStub = (ViewStub) ((Activity) context).findViewById(R.id.taolive_room_auction_stub);
                viewStub.setLayoutResource(R.layout.taolive_frame_auction_flexalocal);
                this.mAuctionFrameLayout = (FrameLayout) viewStub.inflate();
            }
        }
        FrameLayout frameLayout = this.mAuctionFrameLayout;
        if (frameLayout != null && (layoutParams = frameLayout.getLayoutParams()) != null) {
            try {
                layoutParams.width = i;
                layoutParams.height = i2;
                if (i > 0 && i2 > 0) {
                    this.mAuctionFrameLayout.setLayoutParams(layoutParams);
                    this.mAuctionFrameLayout.setVisibility(0);
                }
                this.mAuctionFrameLayout.setVisibility(8);
            } catch (Exception e2) {
                o3s.b(TAG, e2.getMessage());
            }
        }
    }

    private void updateTrivialComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ceac206", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if ((ux9Var instanceof clo) && ((clo) ux9Var).t0() != null) {
            ((clo) this.mFrameContext).t0().i(new d());
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public boolean asyncRenderComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3514e8f6", new Object[]{this})).booleanValue();
        }
        return true;
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        return getComponentName();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public String getComponentName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("bb5fe8c7", new Object[]{this});
        }
        return "tl-chat";
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public int getLayoutResId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f1151e95", new Object[]{this})).intValue();
        }
        return R.layout.taolive_frame_comment_kmp_flexalocal;
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.showcase.control", "com.taobao.taolive.room.sab_atmosphere_show", "com.taobao.taolive.room.sab_atmosphere_dismiss", "com.taobao.taolive.room.goods_list_showing", CHAT_VIEW_STYLE_CHANGE};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var == null) {
            return null;
        }
        return ux9Var.C();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        loge("onCleanUp");
        cleanComponentData();
        cleanAtmosphereData();
        this.mFrameContext.t().a(this.mMessageListener);
        sjr.g().b(this);
        if (nh4.D0()) {
            cancelAnimator();
        }
        clearContainerViewStyle();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        a4s.b(this.mContext, sjr.g(), this);
        d9m.n().getDynamicXEngine().W0(si6.DX_EVENT_TLPERSONALINTRODUCTIONCLICK, new si6(this.mLiveDataModel, this.mFrameContext));
        initOpenConfig();
        initComponents();
        initAtmosphereComponent();
        updateLiveDetail(tBLiveDataModel);
        initMessageListener();
        initCommentManager();
        show();
        if (nh4.t()) {
            initContainerOriginalHeight();
            initChatViewStyle();
        }
        loge(Constants.KEY_DATA_RECEIVED_TIME);
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        sjr.g().b(this);
        clearContainerViewStyle();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onScrollStateChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
        } else {
            super.onScrollStateChanged(i);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void onVideoStatusChanged(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2319dd36", new Object[]{this, new Integer(i)});
        } else if (i == 5) {
            hide();
            ITaoLiveKtCommentManager iTaoLiveKtCommentManager = this.commentManager;
            if (iTaoLiveKtCommentManager != null) {
                iTaoLiveKtCommentManager.stopManager();
            }
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onViewCreated(View view) {
        View view2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("574a747", new Object[]{this, view});
            return;
        }
        super.onViewCreated(view);
        if (vc.a() && this.mLandscape && !((!vc.i(this.mContext) && !vc.d(this.mContext)) || (view2 = this.mContainer) == null || view2.getLayoutParams() == null)) {
            this.mContainer.getLayoutParams().width = hw0.h();
            View view3 = this.mContainer;
            view3.setLayoutParams(view3.getLayoutParams());
        }
        FlexaLiveX.w("ChatFrameKMP: class: " + getClass().getName() + ", pluginEnv: " + e9m.b());
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent
    public void show() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        } else {
            super.show();
        }
    }

    @Override // tb.x0d
    public void showNoticesIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df3464b7", new Object[]{this});
            return;
        }
        ITaoLiveKtCommentManager iTaoLiveKtCommentManager = this.commentManager;
        if (iTaoLiveKtCommentManager != null) {
            iTaoLiveKtCommentManager.showNoticesIfNeeded();
        }
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        int i;
        int intValue;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.showcase.control".equals(str)) {
            if (obj instanceof Map) {
                Map<String, String> map = (Map) obj;
                if (checkLiveId(map)) {
                    String str2 = map.get("eventType");
                    if ("cardShow".equals(str2)) {
                        String str3 = map.get("data");
                        try {
                            if (!TextUtils.isEmpty(str3) && (intValue = JSON.parseObject(str3).getIntValue("cardHeight")) >= 0) {
                                updatePosition(hw0.b(this.mContext, 370.0f), hw0.b(this.mContext, intValue) + hw0.b(this.mContext, 4.0f));
                            }
                        } catch (Exception e2) {
                            q0h.a("AuctionLiveFrame", e2.getMessage());
                        }
                    } else if ("cardHide".equals(str2)) {
                        updatePosition(0, 0);
                    }
                }
            }
        } else if (nh4.D0() && "com.taobao.taolive.room.sab_atmosphere_show".equals(str) && (obj instanceof Integer)) {
            getComponentView().post(new f(obj));
        } else if (nh4.D0() && "com.taobao.taolive.room.sab_atmosphere_dismiss".equals(str)) {
            o3s.b(TAG, "onSabAtmosphereDismiss | liveId=" + getLiveId() + ", originalHeight=" + this.originalHeight + ", offset=" + this.offset);
            int i2 = this.originalHeight;
            if (i2 > 0 && (i = this.offset) > 0) {
                this.onSabAtmosphereDismissAnimator = getValueAnimator(i2 - i, i2);
                ValueAnimator valueAnimator = this.onSabAtmosphereShowAnimator;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.onSabAtmosphereShowAnimator.cancel();
                }
                this.onSabAtmosphereDismissAnimator.start();
            }
        } else if ("com.taobao.taolive.room.goods_list_showing".equals(str)) {
            Object gLConfig = d9m.n().getGLConfig(null, "glPerformanceExclusive");
            if (!(gLConfig instanceof Boolean) || !((Boolean) gLConfig).booleanValue()) {
                hha.b(TAG, "gl event | state false.");
            } else if (obj instanceof Boolean) {
                hha.b(TAG, "gl event | show=" + obj);
                if (((Boolean) obj).booleanValue()) {
                    onPause();
                } else {
                    onResume();
                }
            }
        } else if (CHAT_VIEW_STYLE_CHANGE.equals(str) && nh4.t() && (obj instanceof String)) {
            updateChatViewStyle((String) obj);
        }
    }
}
