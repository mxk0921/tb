package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.sender;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.purchase.aura.helper.RequestConfig;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent;
import com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtServiceContainer;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment.TaoLiveKtCommentEntity;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendModel;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResponse;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.send.TaoLiveKtCommentSendResultModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.comment.ITaoLiveKtCommentManager;
import com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.e3t;
import tb.es6;
import tb.exs;
import tb.g1a;
import tb.l1t;
import tb.m09;
import tb.mhr;
import tb.pys;
import tb.rxs;
import tb.t2o;
import tb.tvr;
import tb.u1a;
import tb.wsq;
import tb.xhv;
import tb.xys;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\t\u001a\u00020\b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010\"\u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u0004\u0018\u00010\u00162\b\u0010$\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b%\u0010&J'\u0010(\u001a\u00020\u00162\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0005H\u0016¢\u0006\u0004\b(\u0010)JD\u0010/\u001a\u00020\b2\b\u0010$\u001a\u0004\u0018\u00010\u00062)\u0010.\u001a%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b\u0018\u00010*j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b/\u00100JD\u00101\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162)\u0010.\u001a%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b\u0018\u00010*j\u0004\u0018\u0001`-H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\b2\u0006\u00103\u001a\u00020\u0011H\u0016¢\u0006\u0004\b4\u00105J5\u00106\u001a\u00020\b2$\u0010.\u001a \u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b\u0018\u00010*H\u0016¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0011H\u0016¢\u0006\u0004\b8\u00109R\u0016\u0010:\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R9\u0010<\u001a%\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\b\u0018\u00010*j\u0004\u0018\u0001`-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R&\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u0016\u0010?\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@RN\u0010G\u001a<\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(\f\u0012\u0015\u0012\u0013\u0018\u00010B¢\u0006\f\b+\u0012\b\b,\u0012\u0004\b\b(C\u0012\u0004\u0012\u00020\b\u0018\u00010Aj\u0004\u0018\u0001`D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/sender/TaoLiveKtCommentSender;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/ITaoLiveKtCommentSend;", "<init>", "()V", "", "", "inputParams", "Ltb/xhv;", "sendMTopComment", "(Ljava/util/Map;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;", "response", "handleCallback", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;)V", "handleLocalCallback", "content", "", "canShowComment", "(Ljava/lang/String;Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;)Z", "checkCommentForbiddenAlert", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResponse;)Z", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", "data", "commentInputParams", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;)Ljava/util/Map;", "", "rendersMap", "validSendComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;)Z", "getName", "()Ljava/lang/String;", "Ltb/exs;", es6.DP_BIZ_CONTEXT, "install", "(Ltb/exs;)V", yj4.PARAM_CHAT_RENDERS_ENHANCE, "fetchCommentActionSend", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", "params", "fetchCommentSend", "(Ljava/util/Map;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/TaoLiveCommentSendCallback;", "callback", "sendCommentAction", "(Ljava/lang/String;Ltb/g1a;)V", "sendComment", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendModel;Ltb/g1a;)V", "open", "updateHighLightCommentSwitch", "(Z)V", "fetchHighLightCommentSwitch", "(Ltb/g1a;)V", "canShowHighLightSwith", "()Z", "TaoLiveKtCommentSenderTag", "Ljava/lang/String;", "sendCallback", "Ltb/g1a;", "Ljava/util/Map;", "highLightCommentUserSwithOn", "Z", "Lkotlin/Function2;", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "entity", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/send/TaoLiveCommentSendLocalRev;", "getLocalSendCallback", "()Ltb/u1a;", "localSendCallback", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentSender extends TaoLiveKtComponent implements ITaoLiveKtCommentSend {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private String TaoLiveKtCommentSenderTag = "TaoLiveKtCommentSender";
    private boolean highLightCommentUserSwithOn;
    private Map<String, ? extends Object> rendersMap;
    private g1a<? super TaoLiveKtCommentSendResponse, xhv> sendCallback;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class b implements u1a<Map<String, ? extends Object>, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ g1a<Map<String, ? extends Object>, xhv> f10995a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
            this.f10995a = g1aVar;
        }

        public void a(Map<String, ? extends Object> map, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3d6736ee", new Object[]{this, map, new Boolean(z)});
            } else if (!z || map == null || !(!map.isEmpty())) {
                g1a<Map<String, ? extends Object>, xhv> g1aVar = this.f10995a;
                if (g1aVar != null) {
                    g1aVar.invoke(null);
                }
            } else {
                g1a<Map<String, ? extends Object>, xhv> g1aVar2 = this.f10995a;
                if (g1aVar2 != null) {
                    g1aVar2.invoke(map);
                }
            }
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(Map<String, ? extends Object> map, Boolean bool) {
            a(map, bool.booleanValue());
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827373);
        t2o.a(1003487352);
    }

    public static final /* synthetic */ boolean access$canShowComment(TaoLiveKtCommentSender taoLiveKtCommentSender, String str, TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("8a0cc25c", new Object[]{taoLiveKtCommentSender, str, taoLiveKtCommentSendResponse})).booleanValue();
        }
        return taoLiveKtCommentSender.canShowComment(str, taoLiveKtCommentSendResponse);
    }

    public static final /* synthetic */ Map access$getRendersMap$p(TaoLiveKtCommentSender taoLiveKtCommentSender) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("aede0afa", new Object[]{taoLiveKtCommentSender});
        }
        return taoLiveKtCommentSender.rendersMap;
    }

    public static final /* synthetic */ void access$handleCallback(TaoLiveKtCommentSender taoLiveKtCommentSender, TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4364d7d", new Object[]{taoLiveKtCommentSender, taoLiveKtCommentSendResponse});
        } else {
            taoLiveKtCommentSender.handleCallback(taoLiveKtCommentSendResponse);
        }
    }

    public static final /* synthetic */ void access$handleLocalCallback(TaoLiveKtCommentSender taoLiveKtCommentSender, TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed1f8db8", new Object[]{taoLiveKtCommentSender, taoLiveKtCommentSendResponse});
        } else {
            taoLiveKtCommentSender.handleLocalCallback(taoLiveKtCommentSendResponse);
        }
    }

    private final boolean canShowComment(String str, TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("415a6ef7", new Object[]{this, str, taoLiveKtCommentSendResponse})).booleanValue();
        }
        TaoLiveKtCommentSendResultModel resultModel = taoLiveKtCommentSendResponse.getResultModel();
        if (resultModel == null || ckf.b(resultModel.getShow(), "false") || pys.INSTANCE.b(str)) {
            return false;
        }
        if (!checkCommentForbiddenAlert(taoLiveKtCommentSendResponse)) {
            return true;
        }
        taoLiveKtCommentSendResponse.setNeedAlert(true);
        return false;
    }

    private final boolean checkCommentForbiddenAlert(TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        String str;
        String messageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fe9b3f9", new Object[]{this, taoLiveKtCommentSendResponse})).booleanValue();
        }
        TaoLiveKtCommentSendResultModel resultModel = taoLiveKtCommentSendResponse.getResultModel();
        String str2 = "";
        if (resultModel == null || (str = resultModel.getMessageCode()) == null) {
            str = str2;
        }
        TaoLiveKtCommentSendResultModel resultModel2 = taoLiveKtCommentSendResponse.getResultModel();
        if (!(resultModel2 == null || (messageInfo = resultModel2.getMessageInfo()) == null)) {
            str2 = messageInfo;
        }
        if (str2.length() > 0 && str.length() > 0) {
            for (String str3 : e3t.INSTANCE.r()) {
                if (ckf.b(str, str3)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final u1a<TaoLiveKtCommentSendResponse, TaoLiveKtCommentEntity, xhv> getLocalSendCallback() {
        ITaoLiveKtComponent iTaoLiveKtComponent;
        ITaoLiveKtCommentManager iTaoLiveKtCommentManager;
        ITaoLiveKtServiceContainer c;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (u1a) ipChange.ipc$dispatch("8f9bd392", new Object[]{this});
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (c = bizContext.c()) == null) {
            iTaoLiveKtComponent = null;
        } else {
            iTaoLiveKtComponent = c.implForService("ITaoLiveKtCommentManager");
        }
        if (iTaoLiveKtComponent instanceof ITaoLiveKtCommentManager) {
            iTaoLiveKtCommentManager = (ITaoLiveKtCommentManager) iTaoLiveKtComponent;
        } else {
            iTaoLiveKtCommentManager = null;
        }
        if (iTaoLiveKtCommentManager != null) {
            return iTaoLiveKtCommentManager.getLocalSendCallback();
        }
        return null;
    }

    private final void handleCallback(TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        Map<String, ? extends Object> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84f14742", new Object[]{this, taoLiveKtCommentSendResponse});
            return;
        }
        String str = this.TaoLiveKtCommentSenderTag;
        l1t l1tVar = l1t.INSTANCE;
        TaoLiveKtCommentSendResultModel resultModel = taoLiveKtCommentSendResponse.getResultModel();
        if (resultModel != null) {
            map = resultModel.getOriginData();
        } else {
            map = null;
        }
        mhr.b0(str, l1tVar.c(map));
        g1a<? super TaoLiveKtCommentSendResponse, xhv> g1aVar = this.sendCallback;
        if (g1aVar != null) {
            g1aVar.invoke(taoLiveKtCommentSendResponse);
        }
    }

    private final void handleLocalCallback(TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23416427", new Object[]{this, taoLiveKtCommentSendResponse});
            return;
        }
        TaoLiveKtCommentSendResultModel resultModel = taoLiveKtCommentSendResponse.getResultModel();
        if (resultModel != null) {
            taoLiveKtCommentSendResponse.setUserAction(pys.INSTANCE.d(resultModel.enhancedType()));
            TaoLiveKtCommentEntity g = rxs.INSTANCE.g(resultModel);
            u1a<TaoLiveKtCommentSendResponse, TaoLiveKtCommentEntity, xhv> localSendCallback = getLocalSendCallback();
            if (localSendCallback != null) {
                localSendCallback.invoke(taoLiveKtCommentSendResponse, g);
            }
        }
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentSender taoLiveKtCommentSender, String str, Object... objArr) {
        if (str.hashCode() == 1889805786) {
            super.install((exs) objArr[0]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/sender/TaoLiveKtCommentSender");
    }

    private final Map<String, Object> rendersMap(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel) {
        String str;
        String str2;
        String userToken;
        Map<String, Object> renders;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("32e3b5ab", new Object[]{this, taoLiveKtCommentSendModel});
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!(taoLiveKtCommentSendModel == null || (renders = taoLiveKtCommentSendModel.getRenders()) == null)) {
            linkedHashMap.putAll(renders);
        }
        String str3 = "";
        if (taoLiveKtCommentSendModel == null || (str = taoLiveKtCommentSendModel.getFanLevel()) == null) {
            str = str3;
        }
        linkedHashMap.put(m09.FANS_LEVEL_RENDER, str);
        if (taoLiveKtCommentSendModel == null || (str2 = taoLiveKtCommentSendModel.getEnhancedType()) == null) {
            str2 = str3;
        }
        linkedHashMap.put(yj4.PARAM_CHAT_RENDERS_ENHANCE, str2);
        if (tvr.c(linkedHashMap.get(yj4.PARAM_CHAT_RENDERS_ENHANCE)) && this.highLightCommentUserSwithOn) {
            linkedHashMap.put(yj4.PARAM_CHAT_RENDERS_ENHANCE, "favorHighlightComment");
        }
        if (!(taoLiveKtCommentSendModel == null || (userToken = taoLiveKtCommentSendModel.getUserToken()) == null)) {
            str3 = userToken;
        }
        linkedHashMap.put("userToken", str3);
        return kotlin.collections.a.r(linkedHashMap);
    }

    private final void sendMTopComment(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3a764cf", new Object[]{this, map});
            return;
        }
        String str = map.get("content");
        if (str == null) {
            str = "";
        }
        xys.INSTANCE.d(map, new a(str));
    }

    private final boolean validSendComment(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fe3c9496", new Object[]{this, taoLiveKtCommentSendModel})).booleanValue();
        }
        if (taoLiveKtCommentSendModel == null || (str = taoLiveKtCommentSendModel.getContent()) == null) {
            str = "";
        }
        if (wsq.Q0(str).toString().length() > 0) {
            return true;
        }
        return false;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public TaoLiveKtCommentSendModel fetchCommentActionSend(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentSendModel) ipChange.ipc$dispatch("3ea390f2", new Object[]{this, str});
        }
        if (str != null && str.length() == 0) {
            return null;
        }
        TaoLiveKtCommentSendModel taoLiveKtCommentSendModel = new TaoLiveKtCommentSendModel();
        taoLiveKtCommentSendModel.setEnhancedType(str);
        taoLiveKtCommentSendModel.setContent(pys.ACTION_NEW_MSG_KEY);
        return taoLiveKtCommentSendModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public TaoLiveKtCommentSendModel fetchCommentSend(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentSendModel) ipChange.ipc$dispatch("7d32c6d5", new Object[]{this, map});
        }
        Map<String, ? extends Object> map2 = null;
        if (!(map instanceof Object)) {
            map = null;
        }
        KMPJsonObject kMPJsonObject = new KMPJsonObject(map);
        TaoLiveKtCommentSendModel taoLiveKtCommentSendModel = new TaoLiveKtCommentSendModel();
        String string = kMPJsonObject.getString(yj4.PARAM_CHAT_RENDERS_ENHANCE);
        String str = "";
        if (string == null) {
            string = str;
        }
        taoLiveKtCommentSendModel.setEnhancedType(string);
        String string2 = kMPJsonObject.getString(m09.FANS_LEVEL_RENDER);
        if (string2 != null) {
            str = string2;
        }
        taoLiveKtCommentSendModel.setFanLevel(str);
        KMPJsonObject jsonObject = kMPJsonObject.getJsonObject("renders");
        if (jsonObject != null) {
            map2 = jsonObject.toMap();
        }
        taoLiveKtCommentSendModel.setRenders(map2);
        return taoLiveKtCommentSendModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public void fetchHighLightCommentSwitch(g1a<? super Map<String, ? extends Object>, xhv> g1aVar) {
        String str;
        String str2;
        czs a2;
        String h;
        czs a3;
        czs a4;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99979b66", new Object[]{this, g1aVar});
        } else if (canShowHighLightSwith()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            exs bizContext = getBizContext();
            String str3 = "";
            if (bizContext == null || (a4 = bizContext.a()) == null || (str = a4.a()) == null) {
                str = str3;
            }
            linkedHashMap.put("userId", str);
            exs bizContext2 = getBizContext();
            if (bizContext2 == null || (a3 = bizContext2.a()) == null || (str2 = a3.a()) == null) {
                str2 = str3;
            }
            linkedHashMap.put(RequestConfig.KEY_ANCHOR_ID, str2);
            exs bizContext3 = getBizContext();
            if (!(bizContext3 == null || (a2 = bizContext3.a()) == null || (h = a2.h()) == null)) {
                str3 = h;
            }
            linkedHashMap.put("anchorIdEncode", str3);
            linkedHashMap.put("commentType", "favorHighlightComment");
            xys.INSTANCE.e(linkedHashMap, new b(g1aVar));
        } else if (g1aVar != null) {
            g1aVar.invoke(null);
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return "ITaoLiveKtCommentSend";
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.component.ITaoLiveKtComponent
    public void install(exs exsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70a425da", new Object[]{this, exsVar});
            return;
        }
        super.install(exsVar);
        this.highLightCommentUserSwithOn = false;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public void sendComment(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel, g1a<? super TaoLiveKtCommentSendResponse, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b69ebcf4", new Object[]{this, taoLiveKtCommentSendModel, g1aVar});
        } else if (validSendComment(taoLiveKtCommentSendModel)) {
            this.sendCallback = g1aVar;
            sendMTopComment(commentInputParams(taoLiveKtCommentSendModel));
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public void sendCommentAction(String str, g1a<? super TaoLiveKtCommentSendResponse, xhv> g1aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("af5dfb64", new Object[]{this, str, g1aVar});
            return;
        }
        TaoLiveKtCommentSendModel fetchCommentActionSend = fetchCommentActionSend(str);
        if (fetchCommentActionSend != null) {
            sendComment(fetchCommentActionSend, g1aVar);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public void updateHighLightCommentSwitch(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eef715c5", new Object[]{this, new Boolean(z)});
        } else {
            this.highLightCommentUserSwithOn = z;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements u1a<TaoLiveKtCommentSendResultModel, Boolean, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ String b;

        public a(String str) {
            this.b = str;
        }

        @Override // tb.u1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel, Boolean bool) {
            a(taoLiveKtCommentSendResultModel, bool.booleanValue());
            return xhv.INSTANCE;
        }

        public void a(TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel, boolean z) {
            TaoLiveKtCommentSendResultModel resultModel;
            Map<String, Object> originData;
            boolean z2 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("aaf25e68", new Object[]{this, taoLiveKtCommentSendResultModel, new Boolean(z)});
                return;
            }
            ckf.g(taoLiveKtCommentSendResultModel, "result");
            TaoLiveKtCommentSendResponse taoLiveKtCommentSendResponse = new TaoLiveKtCommentSendResponse();
            taoLiveKtCommentSendResponse.setResultModel(taoLiveKtCommentSendResultModel);
            boolean z3 = (taoLiveKtCommentSendResultModel.getOriginData() == null || (originData = taoLiveKtCommentSendResultModel.getOriginData()) == null || !(originData.isEmpty() ^ true)) ? false : true;
            if (!z || !z3) {
                z2 = false;
            }
            taoLiveKtCommentSendResponse.setSuccess(z2);
            if (z2) {
                boolean access$canShowComment = TaoLiveKtCommentSender.access$canShowComment(TaoLiveKtCommentSender.this, this.b, taoLiveKtCommentSendResponse);
                taoLiveKtCommentSendResponse.setCanShow(access$canShowComment);
                TaoLiveKtCommentSendResultModel resultModel2 = taoLiveKtCommentSendResponse.getResultModel();
                if (resultModel2 != null) {
                    resultModel2.setRenders(TaoLiveKtCommentSender.access$getRendersMap$p(TaoLiveKtCommentSender.this));
                }
                if (access$canShowComment && (resultModel = taoLiveKtCommentSendResponse.getResultModel()) != null) {
                    resultModel.setComment(this.b);
                }
            }
            TaoLiveKtCommentSender.access$handleCallback(TaoLiveKtCommentSender.this, taoLiveKtCommentSendResponse);
            TaoLiveKtCommentSender.access$handleLocalCallback(TaoLiveKtCommentSender.this, taoLiveKtCommentSendResponse);
        }
    }

    private final Map<String, String> commentInputParams(TaoLiveKtCommentSendModel taoLiveKtCommentSendModel) {
        String str;
        String str2;
        String str3;
        String str4;
        czs a2;
        czs a3;
        String r;
        czs a4;
        czs a5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("b31dc73d", new Object[]{this, taoLiveKtCommentSendModel});
        }
        this.rendersMap = rendersMap(taoLiveKtCommentSendModel);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String c = l1t.INSTANCE.c(this.rendersMap);
        String str5 = "";
        if (c == null) {
            c = str5;
        }
        linkedHashMap.put("renders", c);
        if (taoLiveKtCommentSendModel == null || (str = taoLiveKtCommentSendModel.getContent()) == null) {
            str = str5;
        }
        linkedHashMap.put("content", str);
        exs bizContext = getBizContext();
        if (bizContext == null || (a5 = bizContext.a()) == null || (str2 = a5.v()) == null) {
            str2 = str5;
        }
        linkedHashMap.put("topic", str2);
        exs bizContext2 = getBizContext();
        if (bizContext2 == null || (a4 = bizContext2.a()) == null || (str3 = a4.a()) == null) {
            str3 = str5;
        }
        linkedHashMap.put("accountId", str3);
        if (taoLiveKtCommentSendModel == null || (str4 = taoLiveKtCommentSendModel.getExtraFlag()) == null) {
            str4 = str5;
        }
        linkedHashMap.put("extraFlag", str4);
        exs bizContext3 = getBizContext();
        if (!(bizContext3 == null || (a2 = bizContext3.a()) == null || !a2.z())) {
            exs bizContext4 = getBizContext();
            if (!(bizContext4 == null || (a3 = bizContext4.a()) == null || (r = a3.r()) == null)) {
                str5 = r;
            }
            linkedHashMap.put("relatedTopic", str5);
        }
        return kotlin.collections.a.r(linkedHashMap);
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.send.ITaoLiveKtCommentSend
    public boolean canShowHighLightSwith() {
        Object obj;
        czs a2;
        Map<String, Object> N;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e544cb5d", new Object[]{this})).booleanValue();
        }
        if (!e3t.INSTANCE.J()) {
            return false;
        }
        exs bizContext = getBizContext();
        if (bizContext == null || (a2 = bizContext.a()) == null || (N = a2.N()) == null || (obj = N.get("enable")) == null) {
            obj = "false";
        }
        return ckf.b(obj, "true");
    }
}
