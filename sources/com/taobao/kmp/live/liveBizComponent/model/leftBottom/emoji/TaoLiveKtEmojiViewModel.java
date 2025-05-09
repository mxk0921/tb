package com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji;

import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.base.TaoLiveKtBaseModel;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import tb.a07;
import tb.ckf;
import tb.t2o;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\t\u0018\u0000 #2\u00020\u0001:\u0001$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R*\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR6\u0010\u000e\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0007\u001a\u0004\b\u000f\u0010\t\"\u0004\b\u0010\u0010\u000bR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR.\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR(\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u0007\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u0007\u001a\u0004\b!\u0010\t\"\u0004\b\"\u0010\u000b¨\u0006%"}, d2 = {"Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "Lcom/taobao/kmp/live/liveBizComponent/model/base/TaoLiveKtBaseModel;", "<init>", "()V", "", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiTabItem;", "tabInfoList", "Ljava/util/List;", "getTabInfoList", "()Ljava/util/List;", "setTabInfoList", "(Ljava/util/List;)V", "", "", "keywordAtmosphere", "getKeywordAtmosphere", "setKeywordAtmosphere", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "recentList", "getRecentList", "setRecentList", "", "emojiMap", "Ljava/util/Map;", "getEmojiMap", "()Ljava/util/Map;", "setEmojiMap", "(Ljava/util/Map;)V", "", "officialNormals", "getOfficialNormals", "setOfficialNormals", "officialLarges", "getOfficialLarges", "setOfficialLarges", "Companion", "a", "taoliveroombizsdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiViewModel extends TaoLiveKtBaseModel {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    private List<? extends Map<String, String>> keywordAtmosphere;
    private List<TaoLiveKtEmojiTabItem> tabInfoList;
    private List<TaoLiveKtEmojiIconItem> recentList = yz3.i();
    private Map<String, TaoLiveKtEmojiIconItem> emojiMap = new LinkedHashMap();
    private List<TaoLiveKtEmojiIconItem> officialNormals = new ArrayList();
    private List<TaoLiveKtEmojiIconItem> officialLarges = new ArrayList();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        static {
            t2o.a(1003487309);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(1003487308);
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel");
    }

    public final Map<String, TaoLiveKtEmojiIconItem> getEmojiMap() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("c7f10828", new Object[]{this});
        }
        return this.emojiMap;
    }

    public final List<Map<String, String>> getKeywordAtmosphere() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("1988818b", new Object[]{this});
        }
        return this.keywordAtmosphere;
    }

    public final List<TaoLiveKtEmojiIconItem> getOfficialLarges() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("87c0f1e7", new Object[]{this});
        }
        return this.officialLarges;
    }

    public final List<TaoLiveKtEmojiIconItem> getOfficialNormals() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("7f192c35", new Object[]{this});
        }
        return this.officialNormals;
    }

    public final List<TaoLiveKtEmojiIconItem> getRecentList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e9dcf0f1", new Object[]{this});
        }
        return this.recentList;
    }

    public final List<TaoLiveKtEmojiTabItem> getTabInfoList() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("6970b115", new Object[]{this});
        }
        return this.tabInfoList;
    }

    public final void setEmojiMap(Map<String, TaoLiveKtEmojiIconItem> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3609af66", new Object[]{this, map});
            return;
        }
        ckf.g(map, "<set-?>");
        this.emojiMap = map;
    }

    public final void setKeywordAtmosphere(List<? extends Map<String, String>> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a910a1", new Object[]{this, list});
        } else {
            this.keywordAtmosphere = list;
        }
    }

    public final void setOfficialLarges(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36f54b5d", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.officialLarges = list;
    }

    public final void setOfficialNormals(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cea5c837", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.officialNormals = list;
    }

    public final void setRecentList(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981393", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.recentList = list;
    }

    public final void setTabInfoList(List<TaoLiveKtEmojiTabItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7cdcb957", new Object[]{this, list});
        } else {
            this.tabInfoList = list;
        }
    }
}
