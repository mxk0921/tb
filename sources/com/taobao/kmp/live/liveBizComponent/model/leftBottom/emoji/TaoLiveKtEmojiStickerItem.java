package com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji;

import com.alibaba.android.aura.taobao.adapter.extension.linkage.service.utils.LinkageUtils;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.network.diagnosis.model.NetworkAbility;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 +2\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR$\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\t\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR$\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\t\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR$\u0010\u0017\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\t\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\rR$\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R(\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0006¨\u0006-"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiStickerItem;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "enableRule", "()Z", "", "groupId", "Ljava/lang/String;", "getGroupId", "()Ljava/lang/String;", "setGroupId", "(Ljava/lang/String;)V", "resUrl", "getResUrl", "setResUrl", "title", "getTitle", "setTitle", "type", NetworkAbility.API_GET_TYPE, "setType", "stickerType", "getStickerType", "setStickerType", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiRuleConfig;", LinkageUtils.PolicyType.RULE, "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiRuleConfig;", "getRule$taoliveroombizsdk_release", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiRuleConfig;", "setRule$taoliveroombizsdk_release", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiRuleConfig;)V", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "emojiList", "Ljava/util/List;", "getEmojiList", "()Ljava/util/List;", "setEmojiList", "(Ljava/util/List;)V", "getLargeType$taoliveroombizsdk_release", "largeType", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiStickerItem extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private TaoLiveKtEmojiRuleConfig rule;
    private String groupId = "";
    private String resUrl = "";
    private String title = "";
    private String type = "";
    private String stickerType = "";
    private List<TaoLiveKtEmojiIconItem> emojiList = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487303);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487302);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiStickerItem");
    }

    public final boolean enableRule() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("41ee942a", new Object[]{this})).booleanValue();
        }
        TaoLiveKtEmojiRuleConfig taoLiveKtEmojiRuleConfig = this.rule;
        if (taoLiveKtEmojiRuleConfig == null) {
            return true;
        }
        return taoLiveKtEmojiRuleConfig.getEffective();
    }

    public final List<TaoLiveKtEmojiIconItem> getEmojiList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("b77bcd2", new Object[]{this});
        }
        return this.emojiList;
    }

    public final String getGroupId() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("99b7d9b5", new Object[]{this});
        }
        return this.groupId;
    }

    public final boolean getLargeType$taoliveroombizsdk_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("aeddfcbe", new Object[]{this})).booleanValue();
        }
        String str = this.stickerType;
        String str2 = "";
        if (str == null) {
            str = str2;
        }
        if (str.length() > 0 && ckf.b(str, TaoLiveKtStickerType.Large.getValue())) {
            return true;
        }
        String str3 = this.type;
        if (str3 != null) {
            str2 = str3;
        }
        if (str2.length() <= 0 || !TaoLiveKtEmojiType.Companion.a(str2)) {
            return false;
        }
        return true;
    }

    public final String getResUrl() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("576de474", new Object[]{this});
        }
        return this.resUrl;
    }

    public final TaoLiveKtEmojiRuleConfig getRule$taoliveroombizsdk_release() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiRuleConfig) ipChange.ipc$dispatch("5f9d0d55", new Object[]{this});
        }
        return this.rule;
    }

    public final String getStickerType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39cd48b8", new Object[]{this});
        }
        return this.stickerType;
    }

    public final String getTitle() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("b5267f97", new Object[]{this});
        }
        return this.title;
    }

    public final String getType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("13e5e549", new Object[]{this});
        }
        return this.type;
    }

    public final void setEmojiList(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a07cf23a", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.emojiList = list;
    }

    public final void setGroupId(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a446e5c9", new Object[]{this, str});
        } else {
            this.groupId = str;
        }
    }

    public final void setResUrl(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("35f89782", new Object[]{this, str});
        } else {
            this.resUrl = str;
        }
    }

    public final void setRule$taoliveroombizsdk_release(TaoLiveKtEmojiRuleConfig taoLiveKtEmojiRuleConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505a7c5", new Object[]{this, taoLiveKtEmojiRuleConfig});
        } else {
            this.rule = taoLiveKtEmojiRuleConfig;
        }
    }

    public final void setStickerType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1792fd26", new Object[]{this, str});
        } else {
            this.stickerType = str;
        }
    }

    public final void setTitle(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c820927", new Object[]{this, str});
        } else {
            this.title = str;
        }
    }

    public final void setType(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd56044d", new Object[]{this, str});
        } else {
            this.type = str;
        }
    }
}
