package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.h2t;
import tb.srv;
import tb.t2o;
import tb.tvr;
import tb.yh6;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\u0003J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006R$\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R2\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0019\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u0011\u0010#\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "isResponseMine", "()Z", "Ltb/xhv;", "modifyDXBizType", "isTopSelect", "isResponseOther", "", "bizType", "Ljava/lang/String;", "getBizType", "()Ljava/lang/String;", "setBizType", "(Ljava/lang/String;)V", "showType", "getShowType", "setShowType", yh6.CONFIG_KEY_TEMPLATE_NAME, "getTemplateName", "setTemplateName", "", "", "data", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "setData", "(Ljava/util/Map;)V", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getDataObj", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "dataObj", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentDxModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, ? extends Object> data;
    private String bizType = "";
    private String showType = "";
    private String templateName = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1010827329);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1010827328);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentDxModel taoLiveKtCommentDxModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentDxModel");
    }

    public final String getBizType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("9c07dca2", new Object[]{this});
        }
        return this.bizType;
    }

    public final Map<String, Object> getData() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("516a2e9c", new Object[]{this});
        }
        return this.data;
    }

    public final KMPJsonObject getDataObj() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("444f2c56", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.data;
        if (map == null) {
            map = null;
        }
        return new KMPJsonObject(map);
    }

    public final String getShowType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5d31bcc", new Object[]{this});
        }
        return this.showType;
    }

    public final String getTemplateName() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c8afad3e", new Object[]{this});
        }
        return this.templateName;
    }

    public final boolean isResponseOther() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ac382c50", new Object[]{this})).booleanValue();
        }
        return ckf.b(this.bizType, TaoLiveKtCommentDxBizType.AnchorResponse.getValue());
    }

    public final boolean isTopSelect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("22bee9b2", new Object[]{this})).booleanValue();
        }
        if (ckf.b(this.bizType, TaoLiveKtCommentDxBizType.TopSelected.getValue()) || ckf.b(this.bizType, TaoLiveKtCommentDxBizType.TopAnchorResponse.getValue())) {
            return true;
        }
        return false;
    }

    public final void setBizType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf7407c", new Object[]{this, str});
        } else {
            this.bizType = str;
        }
    }

    public final void setData(Map<String, ? extends Object> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9cd3172", new Object[]{this, map});
        } else {
            this.data = map;
        }
    }

    public final void setShowType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3f6db82a", new Object[]{this, str});
        } else {
            this.showType = str;
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

    public final void modifyDXBizType() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c454546", new Object[]{this});
        } else if (isResponseMine()) {
            this.bizType = TaoLiveKtCommentDxBizType.AnchorResponseMe.getValue();
            if (h2t.INSTANCE.r()) {
                str5 = "taolive_comment_denoise_response_mine";
            } else {
                str5 = "taolive_comment_response_mine";
            }
            this.templateName = str5;
        } else if (isResponseOther()) {
            if (h2t.INSTANCE.r()) {
                str4 = "taolive_comment_denoise_response_other";
            } else {
                str4 = "taolive_comment_response_other";
            }
            this.templateName = str4;
        } else {
            h2t h2tVar = h2t.INSTANCE;
            if (h2tVar.l() && ckf.b(this.bizType, TaoLiveKtCommentDxBizType.LiveAiInteractive.getValue())) {
                if (h2tVar.r()) {
                    str3 = "taolive_comment_denoise_ai_personality_introduction";
                } else {
                    str3 = "taolive_comment_ai_personality_introduction";
                }
                this.templateName = str3;
            } else if (ckf.b(this.bizType, TaoLiveKtCommentDxBizType.LiveCopilot.getValue())) {
                if (h2tVar.r()) {
                    str2 = "taolive_comment_denoise_ai_resp";
                } else {
                    str2 = "taolive_comment_ai_resp";
                }
                this.templateName = str2;
            } else {
                String str6 = this.showType;
                if (str6 != null && str6.equals(TaoLiveKtCommentDxShowType.WarnTips.getValue())) {
                    if (h2tVar.r()) {
                        str = "taolive_comment_denoise_bottom_warning";
                    } else {
                        str = "taolive_comment_bottom_warning";
                    }
                    this.templateName = str;
                }
            }
        }
    }

    private final boolean isResponseMine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9f2eac09", new Object[]{this})).booleanValue();
        }
        String string = getDataObj().getString("replyToUserId");
        return ckf.b(this.bizType, TaoLiveKtCommentDxBizType.AnchorResponse.getValue()) && (!tvr.c(string) && ckf.b(string, srv.b()));
    }
}
