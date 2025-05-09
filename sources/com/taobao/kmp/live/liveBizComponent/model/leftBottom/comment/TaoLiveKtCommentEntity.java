package com.taobao.kmp.live.liveBizComponent.model.leftBottom.comment;

import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.h2t;
import tb.ksl;
import tb.t2o;
import tb.yh6;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006J\r\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\tR2\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u0018R$\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR$\u0010#\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b$\u0010\t\"\u0004\b%\u0010\u0018R$\u0010'\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010\u0015\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u0018R$\u00100\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0015\u001a\u0004\b1\u0010\t\"\u0004\b2\u0010\u0018R,\u00104\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R*\u0010;\u001a\n\u0012\u0004\u0012\u00020:\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u00105\u001a\u0004\b<\u00107\"\u0004\b=\u00109R2\u0010>\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u000f\u001a\u0004\b?\u0010\u0011\"\u0004\b@\u0010\u0013R2\u0010A\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010\u000f\u001a\u0004\bB\u0010\u0011\"\u0004\bC\u0010\u0013R$\u0010E\u001a\u0004\u0018\u00010D8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010K\u001a\u0004\u0018\u00010\u00078F@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0015\u001a\u0004\bL\u0010\t\"\u0004\bM\u0010\u0018R$\u0010N\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010\u0015\u001a\u0004\bO\u0010\t\"\u0004\bP\u0010\u0018R$\u0010Q\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010\u0015\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u0018R2\u0010T\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010\u000f\u001a\u0004\bU\u0010\u0011\"\u0004\bV\u0010\u0013R\"\u0010W\u001a\u00020\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010]\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b]\u0010\u001b\u001a\u0004\b^\u0010\u001d\"\u0004\b_\u0010\u001fR$\u0010a\u001a\u0004\u0018\u00010`8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\"\u0010g\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010\u0006\"\u0004\bj\u0010kR$\u0010m\u001a\u0004\u0018\u00010l8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bm\u0010n\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR2\u0010s\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010\u000f\u001a\u0004\bt\u0010\u0011\"\u0004\bu\u0010\u0013¨\u0006v"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentEntity;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/ITaoLiveKtOutViewModel;", "<init>", "()V", "", "isUserReplyMine", "()Z", "", "enhancedTypeValue", "()Ljava/lang/String;", "isButtonType", "borderHexColor", "", "", "originData", "Ljava/util/Map;", "getOriginData", "()Ljava/util/Map;", "setOriginData", "(Ljava/util/Map;)V", "commentId", "Ljava/lang/String;", "getCommentId", "setCommentId", "(Ljava/lang/String;)V", "", RemoteMessageConst.SEND_TIME, "Ljava/lang/Long;", "getSendTime", "()Ljava/lang/Long;", "setSendTime", "(Ljava/lang/Long;)V", "revTime", "getRevTime", "setRevTime", "publisherId", "getPublisherId", "setPublisherId", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType;", "commentType", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType;", "getCommentType", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType;", "setCommentType", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentType;)V", "name", "getName", "setName", "content", "getContent", "setContent", "", "originBadgeInfos", "Ljava/util/List;", "getOriginBadgeInfos", "()Ljava/util/List;", "setOriginBadgeInfos", "(Ljava/util/List;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBadgeModel;", "badgeInfos", "getBadgeInfos", "setBadgeInfos", "renders", "getRenders", "setRenders", "originBgStyle", "getOriginBgStyle", "setOriginBgStyle", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBgStyle;", "bgStyle", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBgStyle;", "getBgStyle", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBgStyle;", "setBgStyle", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentBgStyle;)V", "guangGuangJumpUrl", "getGuangGuangJumpUrl", "setGuangGuangJumpUrl", yh6.CONFIG_KEY_TEMPLATE_NAME, "getTemplateName", "setTemplateName", "dxBizType", "getDxBizType", "setDxBizType", ksl.PARSER_KEY_DX_DATA, "getDxData", "setDxData", "disappearTime", "J", "getDisappearTime", "()J", "setDisappearTime", "(J)V", "itemId", "getItemId", "setItemId", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "criticalModel", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "getCriticalModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;", "setCriticalModel", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/comment/TaoLiveKtCommentCriticalModel;)V", "disableCommentButton", "Z", "getDisableCommentButton", "setDisableCommentButton", "(Z)V", "Ltb/czs;", "detailModel", "Ltb/czs;", "getDetailModel", "()Ltb/czs;", "setDetailModel", "(Ltb/czs;)V", "favorHighlightCommentStyle", "getFavorHighlightCommentStyle", "setFavorHighlightCommentStyle", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentEntity implements ITaoLiveKtOutViewModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private List<TaoLiveKtCommentBadgeModel> badgeInfos;
    private TaoLiveKtCommentBgStyle bgStyle;
    private TaoLiveKtCommentCriticalModel criticalModel;
    private czs detailModel;
    private boolean disableCommentButton;
    private long disappearTime;
    private Map<String, ? extends Object> dxData;
    private Map<String, ? extends Object> favorHighlightCommentStyle;
    private String guangGuangJumpUrl;
    private Long itemId;
    private List<? extends Object> originBadgeInfos;
    private Map<String, ? extends Object> originBgStyle;
    private Map<String, ? extends Object> originData;
    private Map<String, ? extends Object> renders;
    private Long revTime;
    private Long sendTime;
    private String commentId = "";
    private String publisherId = "";
    private TaoLiveKtCommentType commentType = TaoLiveKtCommentType.Normal;
    private String name = "";
    private String content = "";
    private String templateName = "";
    private String dxBizType = "";

    static {
        t2o.a(1003487294);
        t2o.a(1003487283);
    }

    public final String borderHexColor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1029ba25", new Object[]{this});
        }
        if (isUserReplyMine()) {
            return "#CBB88F";
        }
        return "";
    }

    public final String enhancedTypeValue() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4e1a0218", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.renders;
        String str = null;
        if (map != null) {
            obj = map.get(yj4.PARAM_CHAT_RENDERS_ENHANCE);
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    public final List<TaoLiveKtCommentBadgeModel> getBadgeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1a80c48", new Object[]{this});
        }
        return this.badgeInfos;
    }

    public final TaoLiveKtCommentBgStyle getBgStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentBgStyle) ipChange.ipc$dispatch("32fcb167", new Object[]{this});
        }
        return this.bgStyle;
    }

    public final String getCommentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a4055", new Object[]{this});
        }
        return this.commentId;
    }

    public final TaoLiveKtCommentType getCommentType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentType) ipChange.ipc$dispatch("49687bc", new Object[]{this});
        }
        return this.commentType;
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    public final TaoLiveKtCommentCriticalModel getCriticalModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtCommentCriticalModel) ipChange.ipc$dispatch("f51d23a7", new Object[]{this});
        }
        return this.criticalModel;
    }

    public final czs getDetailModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("d902976d", new Object[]{this});
        }
        return this.detailModel;
    }

    public final boolean getDisableCommentButton() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4c13dea", new Object[]{this})).booleanValue();
        }
        return this.disableCommentButton;
    }

    public final long getDisappearTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e08670d5", new Object[]{this})).longValue();
        }
        return this.disappearTime;
    }

    public final String getDxBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("97ad51d6", new Object[]{this});
        }
        return this.dxBizType;
    }

    public final Map<String, Object> getDxData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("7ecc9ad0", new Object[]{this});
        }
        return this.dxData;
    }

    public final Map<String, Object> getFavorHighlightCommentStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("9847d0ba", new Object[]{this});
        }
        return this.favorHighlightCommentStyle;
    }

    public final String getGuangGuangJumpUrl() {
        czs czsVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c0d7dae", new Object[]{this});
        }
        if (!h2t.INSTANCE.u() || (czsVar = this.detailModel) == null || !czsVar.f()) {
            return null;
        }
        return this.guangGuangJumpUrl;
    }

    public final Long getItemId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("dec590aa", new Object[]{this});
        }
        return this.itemId;
    }

    public final String getName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.name;
    }

    public final List<Object> getOriginBadgeInfos() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("79dcc742", new Object[]{this});
        }
        return this.originBadgeInfos;
    }

    public final Map<String, Object> getOriginBgStyle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("d70ec52c", new Object[]{this});
        }
        return this.originBgStyle;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public Map<String, Object> getOriginData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("830078e2", new Object[]{this});
        }
        return this.originData;
    }

    public final String getPublisherId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62a16698", new Object[]{this});
        }
        return this.publisherId;
    }

    public final Map<String, Object> getRenders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdabe023", new Object[]{this});
        }
        return this.renders;
    }

    public final Long getRevTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("cc393194", new Object[]{this});
        }
        return this.revTime;
    }

    public final Long getSendTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("88968fe3", new Object[]{this});
        }
        return this.sendTime;
    }

    public final String getTemplateName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.templateName;
    }

    public final boolean isButtonType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("904ca7e1", new Object[]{this})).booleanValue();
        }
        if (ckf.b(enhancedTypeValue(), TaoLiveKtCommentEnhancedType.Follow.getValue()) || ckf.b(enhancedTypeValue(), TaoLiveKtCommentEnhancedType.Share.getValue())) {
            return true;
        }
        return false;
    }

    public final void setBadgeInfos(List<TaoLiveKtCommentBadgeModel> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f430631c", new Object[]{this, list});
        } else {
            this.badgeInfos = list;
        }
    }

    public final void setBgStyle(TaoLiveKtCommentBgStyle taoLiveKtCommentBgStyle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("209c5429", new Object[]{this, taoLiveKtCommentBgStyle});
        } else {
            this.bgStyle = taoLiveKtCommentBgStyle;
        }
    }

    public final void setCommentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fb8629", new Object[]{this, str});
        } else {
            this.commentId = str;
        }
    }

    public final void setCommentType(TaoLiveKtCommentType taoLiveKtCommentType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b3d6ee", new Object[]{this, taoLiveKtCommentType});
        } else {
            this.commentType = taoLiveKtCommentType;
        }
    }

    public final void setContent(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52a9c508", new Object[]{this, str});
        } else {
            this.content = str;
        }
    }

    public final void setCriticalModel(TaoLiveKtCommentCriticalModel taoLiveKtCommentCriticalModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b13cb72d", new Object[]{this, taoLiveKtCommentCriticalModel});
        } else {
            this.criticalModel = taoLiveKtCommentCriticalModel;
        }
    }

    public final void setDetailModel(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc2277fd", new Object[]{this, czsVar});
        } else {
            this.detailModel = czsVar;
        }
    }

    public final void setDisableCommentButton(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd338a22", new Object[]{this, new Boolean(z)});
        } else {
            this.disableCommentButton = z;
        }
    }

    public final void setDisappearTime(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c773a40f", new Object[]{this, new Long(j)});
        } else {
            this.disappearTime = j;
        }
    }

    public final void setDxBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e03aa4c8", new Object[]{this, str});
        } else {
            this.dxBizType = str;
        }
    }

    public final void setDxData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c54bebe", new Object[]{this, map});
        } else {
            this.dxData = map;
        }
    }

    public final void setFavorHighlightCommentStyle(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df38414", new Object[]{this, map});
        } else {
            this.favorHighlightCommentStyle = map;
        }
    }

    public final void setGuangGuangJumpUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13213ff0", new Object[]{this, str});
        } else {
            this.guangGuangJumpUrl = str;
        }
    }

    public final void setItemId(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db724956", new Object[]{this, l});
        } else {
            this.itemId = l;
        }
    }

    public final void setName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("99b22cde", new Object[]{this, str});
        } else {
            this.name = str;
        }
    }

    public final void setOriginBadgeInfos(List<? extends Object> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("881ce62", new Object[]{this, list});
        } else {
            this.originBadgeInfos = list;
        }
    }

    public final void setOriginBgStyle(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4b4847a", new Object[]{this, map});
        } else {
            this.originBgStyle = map;
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.model.base.ITaoLiveKtOutViewModel
    public void setOriginData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("371348ec", new Object[]{this, map});
        } else {
            this.originData = map;
        }
    }

    public final void setPublisherId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429b46", new Object[]{this, str});
        } else {
            this.publisherId = str;
        }
    }

    public final void setRenders(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("df508163", new Object[]{this, map});
        } else {
            this.renders = map;
        }
    }

    public final void setRevTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b4cc1b14", new Object[]{this, l});
        } else {
            this.revTime = l;
        }
    }

    public final void setSendTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("76ebde3d", new Object[]{this, l});
        } else {
            this.sendTime = l;
        }
    }

    public final void setTemplateName(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dde46ef8", new Object[]{this, str});
        } else {
            this.templateName = str;
        }
    }

    private final boolean isUserReplyMine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("36a02653", new Object[]{this})).booleanValue();
        }
        Map<String, ? extends Object> map = this.renders;
        String str = null;
        Object obj = map != null ? map.get("repliedEncryptUserId") : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() <= 0) {
            return false;
        }
        czs czsVar = this.detailModel;
        if (czsVar != null) {
            str = czsVar.u();
        }
        return ckf.b(str2, str);
    }
}
