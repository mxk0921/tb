package com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.List;
import kotlin.Metadata;
import tb.a07;
import tb.i04;
import tb.mop;
import tb.t2o;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR$\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\u000f\u0010\b\"\u0004\b\u0010\u0010\nR*\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiTabItem;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", mop.KEY_TAB_KEY_NAME, "Ljava/lang/String;", "getTabKey", "()Ljava/lang/String;", "setTabKey", "(Ljava/lang/String;)V", "tabIcon", "getTabIcon", "setTabIcon", "unTabIcon", "getUnTabIcon", "setUnTabIcon", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiStickerItem;", "stickerList", "Ljava/util/List;", "getStickerList", "()Ljava/util/List;", "setStickerList", "(Ljava/util/List;)V", "", "getLargeType", "()Z", "largeType", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiTabItem extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private List<TaoLiveKtEmojiStickerItem> stickerList;
    private String tabKey = "";
    private String tabIcon = "";
    private String unTabIcon = "";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487305);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487304);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiTabItem");
    }

    public final boolean getLargeType() {
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("38d2576a", new Object[]{this})).booleanValue();
        }
        List<TaoLiveKtEmojiStickerItem> list = this.stickerList;
        if (list != null && list.isEmpty()) {
            return false;
        }
        List<TaoLiveKtEmojiStickerItem> list2 = this.stickerList;
        if (list2 != null) {
            taoLiveKtEmojiStickerItem = (TaoLiveKtEmojiStickerItem) i04.a0(list2);
        } else {
            taoLiveKtEmojiStickerItem = null;
        }
        if (taoLiveKtEmojiStickerItem == null || !taoLiveKtEmojiStickerItem.getLargeType$taoliveroombizsdk_release()) {
            return false;
        }
        return true;
    }

    public final List<TaoLiveKtEmojiStickerItem> getStickerList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4bed487b", new Object[]{this});
        }
        return this.stickerList;
    }

    public final String getTabIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ae1e7081", new Object[]{this});
        }
        return this.tabIcon;
    }

    public final String getTabKey() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("33abb979", new Object[]{this});
        }
        return this.tabKey;
    }

    public final String getUnTabIcon() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("181c5e3a", new Object[]{this});
        }
        return this.unTabIcon;
    }

    public final void setStickerList(List<TaoLiveKtEmojiStickerItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9f30eb1", new Object[]{this, list});
        } else {
            this.stickerList = list;
        }
    }

    public final void setTabIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1cb3287d", new Object[]{this, str});
        } else {
            this.tabIcon = str;
        }
    }

    public final void setTabKey(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e175631d", new Object[]{this, str});
        } else {
            this.tabKey = str;
        }
    }

    public final void setUnTabIcon(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6dad24e4", new Object[]{this, str});
        } else {
            this.unTabIcon = str;
        }
    }
}
