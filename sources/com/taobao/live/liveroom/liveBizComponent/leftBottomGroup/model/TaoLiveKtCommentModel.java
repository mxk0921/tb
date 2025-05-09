package com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.l1t;
import tb.srv;
import tb.t2o;
import tb.tvr;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u001a\n\u0002\u0010\t\n\u0002\b\t\b\u0000\u0018\u0000 02\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0011\u0010\u0006J\u001d\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0010R$\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0006\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\u0017R$\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0014\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\u0017R$\u0010\u001e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\u0017R$\u0010!\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\u0017R2\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0010\"\u0004\b'\u0010(R$\u0010*\u001a\u0004\u0018\u00010)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00062"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "", "", "originMedalList", "()Ljava/util/List;", "", "showAtBottom", "()Z", "", "originBgStyle", "()Ljava/util/Map;", "guangGuangJumpUrl", "favorHighlightCommentStyle", "commentId", "Ljava/lang/String;", "getCommentId", "setCommentId", "(Ljava/lang/String;)V", "content", "getContent", "setContent", "publisherId", "getPublisherId", "setPublisherId", "publisherNick", "getPublisherNick", "setPublisherNick", "tbNick", "getTbNick", "setTbNick", "renders", "Ljava/util/Map;", "getRenders", "setRenders", "(Ljava/util/Map;)V", "", "timestamp", "Ljava/lang/Long;", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Companion", "a", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtCommentModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private Map<String, ? extends Object> renders;
    private Long timestamp;
    private String commentId = "";
    private String content = "";
    private String publisherId = "";
    private String publisherNick = "";
    private String tbNick = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1010827334);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1010827333);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtCommentModel taoLiveKtCommentModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/live/liveroom/liveBizComponent/leftBottomGroup/model/TaoLiveKtCommentModel");
    }

    public final Map<String, Object> favorHighlightCommentStyle() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("74ac9644", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.renders;
        Object obj = map != null ? map.get("favorHighlightCommentStyle") : null;
        String str2 = obj instanceof String ? (String) obj : null;
        if (tvr.c(str2)) {
            return null;
        }
        Map<String, Object> e = l1t.INSTANCE.e(str2);
        if (tvr.c(e) || (str = this.publisherId) == null || str.length() == 0 || !ckf.b(this.publisherId, srv.b())) {
            return e;
        }
        Map t = e != null ? kotlin.collections.a.t(e) : null;
        if (t != null) {
            t.remove("objectiveTips");
        }
        if (t != null) {
            return kotlin.collections.a.r(t);
        }
        return null;
    }

    public final String getCommentId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("18a4055", new Object[]{this});
        }
        return this.commentId;
    }

    public final String getContent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f1ec9696", new Object[]{this});
        }
        return this.content;
    }

    public final String getPublisherId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("62a16698", new Object[]{this});
        }
        return this.publisherId;
    }

    public final String getPublisherNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("51fe8ad0", new Object[]{this});
        }
        return this.publisherNick;
    }

    public final Map<String, Object> getRenders() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("bdabe023", new Object[]{this});
        }
        return this.renders;
    }

    public final String getTbNick() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7a3a5f72", new Object[]{this});
        }
        return this.tbNick;
    }

    public final Long getTimestamp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Long) ipChange.ipc$dispatch("62937f4e", new Object[]{this});
        }
        return this.timestamp;
    }

    public final String guangGuangJumpUrl() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8eafb2b8", new Object[]{this});
        }
        String str = this.publisherId;
        if (str != null && str.length() != 0 && ckf.b(this.publisherId, srv.b())) {
            return null;
        }
        Map<String, ? extends Object> map = this.renders;
        if (map != null) {
            obj = map.get("guangGuangJumpUrl");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    public final String name() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa84494e", new Object[]{this});
        }
        if (tvr.c(this.tbNick)) {
            return this.publisherNick;
        }
        return this.tbNick;
    }

    public final Map<String, Object> originBgStyle() {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("8065c762", new Object[]{this});
        }
        Map<String, ? extends Object> map = this.renders;
        String str = null;
        if (map != null) {
            obj = map.get("backgroundStyle");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        }
        return l1t.INSTANCE.e(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List<java.lang.Object> originMedalList() {
        /*
            r4 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentModel.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x0015
            java.lang.String r1 = "72e81ed1"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            java.lang.Object r0 = r0.ipc$dispatch(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0015:
            tb.zys r0 = tb.zys.INSTANCE
            boolean r0 = r0.c()
            r1 = 0
            if (r0 == 0) goto L_0x002c
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r4.renders
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "taobaoMedalList"
            java.lang.Object r0 = r0.get(r2)
            goto L_0x0037
        L_0x002a:
            r0 = r1
            goto L_0x0037
        L_0x002c:
            java.util.Map<java.lang.String, ? extends java.lang.Object> r0 = r4.renders
            if (r0 == 0) goto L_0x002a
            java.lang.String r2 = "medalList"
            java.lang.Object r0 = r0.get(r2)
        L_0x0037:
            tb.l1t r2 = tb.l1t.INSTANCE
            boolean r3 = r0 instanceof java.lang.String
            if (r3 == 0) goto L_0x0040
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
        L_0x0040:
            java.util.List r0 = r2.d(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.leftBottomGroup.model.TaoLiveKtCommentModel.originMedalList():java.util.List");
    }

    public final void setCommentId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b1fb8629", new Object[]{this, str});
        } else {
            this.commentId = str;
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

    public final void setPublisherId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9429b46", new Object[]{this, str});
        } else {
            this.publisherId = str;
        }
    }

    public final void setPublisherNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2272b10e", new Object[]{this, str});
        } else {
            this.publisherNick = str;
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

    public final void setTbNick(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6cbb7c44", new Object[]{this, str});
        } else {
            this.tbNick = str;
        }
    }

    public final void setTimestamp(Long l) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("43e6779a", new Object[]{this, l});
        } else {
            this.timestamp = l;
        }
    }

    public final boolean showAtBottom() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21ee3166", new Object[]{this})).booleanValue();
        }
        Map<String, ? extends Object> map = this.renders;
        return ckf.b(map != null ? map.get("showMod") : null, "BOTTOM");
    }
}
