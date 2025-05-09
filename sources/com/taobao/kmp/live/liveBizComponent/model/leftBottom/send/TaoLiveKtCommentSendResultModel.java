package com.taobao.kmp.live.liveBizComponent.model.leftBottom.send;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import com.taobao.taolive.sdk.model.message.ChatMessage;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonArray;
import com.taobao.uniinfra_kmp.common_utils.serialization.KMPJsonObject;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.srv;
import tb.t2o;
import tb.to8;
import tb.tvr;
import tb.xrf;
import tb.yj4;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u0000 =2\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u0006J\u001d\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u001bR$\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\u001bR$\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\u001bR$\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\u001bR$\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u0018\u001a\u0004\b&\u0010\u0006\"\u0004\b'\u0010\u001bR$\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0018\u001a\u0004\b)\u0010\u0006\"\u0004\b*\u0010\u001bR$\u0010,\u001a\u0004\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00102\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010\u0018\u001a\u0004\b3\u0010\u0006\"\u0004\b4\u0010\u001bR$\u00105\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010\u0018\u001a\u0004\b6\u0010\u0006\"\u0004\b7\u0010\u001bR2\u00108\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010\r\"\u0004\b;\u0010<¨\u0006?"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResultModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "", "", "originMedalList", "()Ljava/util/List;", "", "originBgStyle", "()Ljava/util/Map;", yj4.PARAM_CHAT_RENDERS_ENHANCE, "favorHighlightCommentStyle", "", "publishTime", "Ljava/lang/Long;", "getPublishTime", "()Ljava/lang/Long;", "setPublishTime", "(Ljava/lang/Long;)V", "commentId", "Ljava/lang/String;", "getCommentId", "setCommentId", "(Ljava/lang/String;)V", "tbNick", "getTbNick", "setTbNick", "show", "getShow", "setShow", "success", "getSuccess", "setSuccess", "messageCode", "getMessageCode", "setMessageCode", "messageInfo", "getMessageInfo", "setMessageInfo", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "ext", "Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "getExt", "()Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;", "setExt", "(Lcom/taobao/uniinfra_kmp/common_utils/serialization/KMPJsonObject;)V", "errorMsg", "getErrorMsg", "setErrorMsg", to8.COMMENT, "getComment", "setComment", "renders", "Ljava/util/Map;", "getRenders", "setRenders", "(Ljava/util/Map;)V", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentSendResultModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private String errorMsg;
    private KMPJsonObject ext;
    private Long publishTime;
    private Map<String, ? extends Object> renders;
    private String commentId = "";
    private String tbNick = "";
    private String show = "";
    private String success = "";
    private String messageCode = "";
    private String messageInfo = "";
    private String comment = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487316);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487315);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentSendResultModel taoLiveKtCommentSendResultModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/send/TaoLiveKtCommentSendResultModel");
    }

    public final String enhancedType() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("de37c529", new Object[]{this});
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

    public final Map<String, Object> favorHighlightCommentStyle() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("74ac9644", new Object[]{this});
        }
        KMPJsonObject kMPJsonObject = this.ext;
        if (kMPJsonObject != null) {
            str = kMPJsonObject.getString("favorHighlightCommentStyle");
        } else {
            str = null;
        }
        if (!(str instanceof String)) {
            str = null;
        }
        if (!tvr.c(str) && str != null) {
            return xrf.b(str);
        }
        return null;
    }

    public final String getComment() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("52c12870", new Object[]{this});
        }
        return this.comment;
    }

    public final String getCommentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a4055", new Object[]{this});
        }
        return this.commentId;
    }

    public final String getErrorMsg() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e1cc388a", new Object[]{this});
        }
        return this.errorMsg;
    }

    public final KMPJsonObject getExt() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (KMPJsonObject) ipChange.ipc$dispatch("b0903aa2", new Object[]{this});
        }
        return this.ext;
    }

    public final String getMessageCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("439bc85b", new Object[]{this});
        }
        return this.messageCode;
    }

    public final String getMessageInfo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("3658843a", new Object[]{this});
        }
        return this.messageInfo;
    }

    public final Long getPublishTime() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("1af728a8", new Object[]{this});
        }
        return this.publishTime;
    }

    public final Map<String, Object> getRenders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdabe023", new Object[]{this});
        }
        return this.renders;
    }

    public final String getShow() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("fed0a166", new Object[]{this});
        }
        return this.show;
    }

    public final String getSuccess() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("67ca054c", new Object[]{this});
        }
        return this.success;
    }

    public final String getTbNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a3a5f72", new Object[]{this});
        }
        return this.tbNick;
    }

    public final String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        if (tvr.c(this.tbNick)) {
            return srv.a();
        }
        return this.tbNick;
    }

    public final Map<String, Object> originBgStyle() {
        KMPJsonObject kMPJsonObject;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8065c762", new Object[]{this});
        }
        KMPJsonObject kMPJsonObject2 = this.ext;
        if (kMPJsonObject2 != null) {
            kMPJsonObject = kMPJsonObject2.getJsonObject("backgroundStyle");
        } else {
            kMPJsonObject = null;
        }
        if (kMPJsonObject != null) {
            return kMPJsonObject.toMap();
        }
        return null;
    }

    public final List<Object> originMedalList() {
        KMPJsonArray jsonArray;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("72e81ed1", new Object[]{this});
        }
        KMPJsonObject kMPJsonObject = this.ext;
        if (kMPJsonObject == null || (jsonArray = kMPJsonObject.getJsonArray(ChatMessage.KEY_MEDAL_LIST_DT)) == null) {
            return null;
        }
        return jsonArray.toList();
    }

    public final void setComment(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c676e6e", new Object[]{this, str});
        } else {
            this.comment = str;
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

    public final void setErrorMsg(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e298332c", new Object[]{this, str});
        } else {
            this.errorMsg = str;
        }
    }

    public final void setExt(KMPJsonObject kMPJsonObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ced47664", new Object[]{this, kMPJsonObject});
        } else {
            this.ext = kMPJsonObject;
        }
    }

    public final void setMessageCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("479471e3", new Object[]{this, str});
        } else {
            this.messageCode = str;
        }
    }

    public final void setMessageInfo(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac6f31e4", new Object[]{this, str});
        } else {
            this.messageInfo = str;
        }
    }

    public final void setPublishTime(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("13322c80", new Object[]{this, l});
        } else {
            this.publishTime = l;
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

    public final void setShow(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fc2cbd0", new Object[]{this, str});
        } else {
            this.show = str;
        }
    }

    public final void setSuccess(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("987a2d12", new Object[]{this, str});
        } else {
            this.success = str;
        }
    }

    public final void setTbNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbb7c44", new Object[]{this, str});
        } else {
            this.tbNick = str;
        }
    }
}
