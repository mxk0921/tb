package com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager;

import com.alibaba.security.realidentity.p1;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiTabItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiViewModel;
import com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager;
import com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtEmojiManager;
import com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent;
import com.taobao.message.chat.aura.messageflow.input.ChatInputConstant;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import tb.ckf;
import tb.czs;
import tb.dzs;
import tb.exs;
import tb.f1t;
import tb.g1a;
import tb.i04;
import tb.j0t;
import tb.kzs;
import tb.lzs;
import tb.t2o;
import tb.wh6;
import tb.xhv;
import tb.yz3;

/* compiled from: Taobao */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u00052\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00052\b\u0010\u001d\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0011J\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u0019\u0010!\u001a\u0004\u0018\u00010\u000e2\u0006\u0010 \u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\"J\u0019\u0010%\u001a\u00020\u00052\b\u0010$\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0005H\u0016¢\u0006\u0004\b'\u0010\u0004J\u000f\u0010(\u001a\u00020\u0005H\u0016¢\u0006\u0004\b(\u0010\u0004J\u000f\u0010)\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0004R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00102\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00105\u001a\u00020*8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00104¨\u00066"}, d2 = {"Lcom/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtEmojiManager;", "Lcom/taobao/live/liveroom/liveBizComponent/ktManager/base/TaoLiveKtComponent;", "Lcom/taobao/kmp/live/liveBizComponent/service/biz/liveResource/ITaoLiveKtEmojiManager;", "<init>", "()V", "Ltb/xhv;", "requestEmojiData", "mkEmojiViewModel", "", "filePath", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiStickerItem;", "sticker", "mkEmojiList", "(Ljava/lang/String;Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiStickerItem;)V", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", ChatInputConstant.PANEL_ID_EMOJI, "addCacheList", "(Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;)V", "thumbnail", "absoluteFilePath", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "fetchDefaultQuickEmojis", "()Ljava/util/List;", "from", "", "to", "fetchFrontItems", "(Ljava/util/List;Ljava/util/List;)V", "item", "addRecentUsedEmoji", "cacheRecentUsedEmojiIfNeeded", "key", "matchedEmoji", "(Ljava/lang/String;)Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiIconItem;", "Ltb/czs;", "model", "updateLiveDetail", "(Ltb/czs;)V", "viewDidDisappear", "prepareRecentUsedEmojis", "prepareRecentNormalSection", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "curViewModel", "Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "Ltb/kzs;", "recentUsedCache", "Ltb/kzs;", "getKLiveEmojiPath", "()Ljava/lang/String;", "kLiveEmojiPath", "getEmojiViewModel", "()Lcom/taobao/kmp/live/liveBizComponent/model/leftBottom/emoji/TaoLiveKtEmojiViewModel;", "emojiViewModel", "tao-live-crossplatform-foundation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class TaoLiveKtEmojiManager extends TaoLiveKtComponent implements ITaoLiveKtEmojiManager {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    private TaoLiveKtEmojiViewModel curViewModel;
    private final kzs recentUsedCache = new kzs();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a implements g1a<TaoLiveKtEmojiViewModel, xhv> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("40ca29a3", new Object[]{this, taoLiveKtEmojiViewModel});
                return;
            }
            ckf.g(taoLiveKtEmojiViewModel, p1.d);
            TaoLiveKtEmojiManager.access$setCurViewModel$p(TaoLiveKtEmojiManager.this, taoLiveKtEmojiViewModel);
            TaoLiveKtEmojiManager.access$mkEmojiViewModel(TaoLiveKtEmojiManager.this);
        }

        @Override // tb.g1a
        public /* bridge */ /* synthetic */ xhv invoke(TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel) {
            a(taoLiveKtEmojiViewModel);
            return xhv.INSTANCE;
        }
    }

    static {
        t2o.a(1010827268);
        t2o.a(1003487351);
    }

    private final String absoluteFilePath(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("ca9a448d", new Object[]{this, str, str2});
        }
        return f1t.INSTANCE.k(str + wh6.DIR + str2);
    }

    public static final /* synthetic */ void access$mkEmojiViewModel(TaoLiveKtEmojiManager taoLiveKtEmojiManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2d40b2de", new Object[]{taoLiveKtEmojiManager});
        } else {
            taoLiveKtEmojiManager.mkEmojiViewModel();
        }
    }

    public static final /* synthetic */ void access$setCurViewModel$p(TaoLiveKtEmojiManager taoLiveKtEmojiManager, TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b214afa", new Object[]{taoLiveKtEmojiManager, taoLiveKtEmojiViewModel});
        } else {
            taoLiveKtEmojiManager.curViewModel = taoLiveKtEmojiViewModel;
        }
    }

    private final void addCacheList(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        List<TaoLiveKtEmojiIconItem> officialLarges;
        List<TaoLiveKtEmojiIconItem> officialNormals;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e9fa1d84", new Object[]{this, taoLiveKtEmojiIconItem});
        } else if (taoLiveKtEmojiIconItem.getOfficialType()) {
            if (taoLiveKtEmojiIconItem.getNormalType()) {
                TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
                if (taoLiveKtEmojiViewModel != null && (officialNormals = taoLiveKtEmojiViewModel.getOfficialNormals()) != null) {
                    officialNormals.add(taoLiveKtEmojiIconItem);
                    return;
                }
                return;
            }
            TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel2 = this.curViewModel;
            if (taoLiveKtEmojiViewModel2 != null && (officialLarges = taoLiveKtEmojiViewModel2.getOfficialLarges()) != null) {
                officialLarges.add(taoLiveKtEmojiIconItem);
            }
        }
    }

    private final List<TaoLiveKtEmojiIconItem> fetchDefaultQuickEmojis() {
        List<TaoLiveKtEmojiIconItem> list;
        List<TaoLiveKtEmojiIconItem> list2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("47925b6d", new Object[]{this});
        }
        ArrayList arrayList = new ArrayList();
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        if (taoLiveKtEmojiViewModel == null || (list = taoLiveKtEmojiViewModel.getOfficialNormals()) == null) {
            list = yz3.i();
        }
        fetchFrontItems(list, arrayList);
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel2 = this.curViewModel;
        if (taoLiveKtEmojiViewModel2 == null || (list2 = taoLiveKtEmojiViewModel2.getOfficialLarges()) == null) {
            list2 = yz3.i();
        }
        fetchFrontItems(list2, arrayList);
        return i04.B0(arrayList);
    }

    private final void fetchFrontItems(List<TaoLiveKtEmojiIconItem> list, List<TaoLiveKtEmojiIconItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb9d695a", new Object[]{this, list, list2});
        } else if (list.size() > 2) {
            list2.addAll(list.subList(0, 2));
        } else {
            list2.addAll(list);
        }
    }

    private final String getKLiveEmojiPath() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f64460ef", new Object[]{this});
        }
        f1t f1tVar = f1t.INSTANCE;
        return f1tVar.E(f1tVar.v() + "/emojis");
    }

    public static /* synthetic */ Object ipc$super(TaoLiveKtEmojiManager taoLiveKtEmojiManager, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -54136528) {
            super.viewDidDisappear();
            return null;
        } else if (hashCode == 567228013) {
            super.updateLiveDetail((czs) objArr[0]);
            return null;
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/live/liveroom/liveBizComponent/bottomGroup/manager/TaoLiveKtEmojiManager");
        }
    }

    private final void mkEmojiList(final String str, final TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("909b8ddf", new Object[]{this, str, taoLiveKtEmojiStickerItem});
        } else if (str.length() != 0) {
            f1t.INSTANCE.B(str.concat("/config.json"), new g1a() { // from class: tb.fzs
                @Override // tb.g1a
                public final Object invoke(Object obj) {
                    xhv mkEmojiList$lambda$4;
                    mkEmojiList$lambda$4 = TaoLiveKtEmojiManager.mkEmojiList$lambda$4(TaoLiveKtEmojiManager.this, str, taoLiveKtEmojiStickerItem, (String) obj);
                    return mkEmojiList$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final tb.xhv mkEmojiList$lambda$4(com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtEmojiManager r8, java.lang.String r9, com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtEmojiManager.mkEmojiList$lambda$4(com.taobao.live.liveroom.liveBizComponent.bottomGroup.manager.TaoLiveKtEmojiManager, java.lang.String, com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem, java.lang.String):tb.xhv");
    }

    private final void mkEmojiViewModel() {
        List<TaoLiveKtEmojiTabItem> tabInfoList;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("249c81a3", new Object[]{this});
            return;
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        if (!(taoLiveKtEmojiViewModel == null || (tabInfoList = taoLiveKtEmojiViewModel.getTabInfoList()) == null)) {
            for (TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem : tabInfoList) {
                List<TaoLiveKtEmojiStickerItem> stickerList = taoLiveKtEmojiTabItem.getStickerList();
                if (stickerList != null) {
                    for (final TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem : stickerList) {
                        if (taoLiveKtEmojiStickerItem.enableRule()) {
                            String resUrl = taoLiveKtEmojiStickerItem.getResUrl();
                            if (resUrl == null) {
                                resUrl = "";
                            }
                            new j0t().m(resUrl, getKLiveEmojiPath(), new g1a() { // from class: tb.hzs
                                @Override // tb.g1a
                                public final Object invoke(Object obj) {
                                    xhv mkEmojiViewModel$lambda$2$lambda$1$lambda$0;
                                    mkEmojiViewModel$lambda$2$lambda$1$lambda$0 = TaoLiveKtEmojiManager.mkEmojiViewModel$lambda$2$lambda$1$lambda$0(TaoLiveKtEmojiManager.this, taoLiveKtEmojiStickerItem, (String) obj);
                                    return mkEmojiViewModel$lambda$2$lambda$1$lambda$0;
                                }
                            });
                        }
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xhv mkEmojiViewModel$lambda$2$lambda$1$lambda$0(TaoLiveKtEmojiManager taoLiveKtEmojiManager, TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xhv) ipChange.ipc$dispatch("c0b3b601", new Object[]{taoLiveKtEmojiManager, taoLiveKtEmojiStickerItem, str});
        }
        if (str != null) {
            taoLiveKtEmojiManager.mkEmojiList(str, taoLiveKtEmojiStickerItem);
        }
        return xhv.INSTANCE;
    }

    private final void requestEmojiData() {
        String str;
        czs a2;
        String h;
        czs a3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24f0eb48", new Object[]{this});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        exs bizContext = getBizContext();
        String str2 = "";
        if (bizContext == null || (a3 = bizContext.a()) == null || (str = a3.m()) == null) {
            str = str2;
        }
        linkedHashMap.put("liveId", str);
        exs bizContext2 = getBizContext();
        if (!(bizContext2 == null || (a2 = bizContext2.a()) == null || (h = a2.h()) == null)) {
            str2 = h;
        }
        linkedHashMap.put("encryptAnchorId", str2);
        lzs.INSTANCE.a(linkedHashMap, new a());
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public void addRecentUsedEmoji(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a13f72", new Object[]{this, taoLiveKtEmojiIconItem});
        } else {
            this.recentUsedCache.h(taoLiveKtEmojiIconItem);
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public void cacheRecentUsedEmojiIfNeeded() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a24b65", new Object[]{this});
        } else {
            this.recentUsedCache.i();
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public TaoLiveKtEmojiViewModel getEmojiViewModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiViewModel) ipChange.ipc$dispatch("8adf734d", new Object[]{this});
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        if (taoLiveKtEmojiViewModel == null) {
            return dzs.INSTANCE.b();
        }
        return taoLiveKtEmojiViewModel;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public TaoLiveKtEmojiIconItem matchedEmoji(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiIconItem) ipChange.ipc$dispatch("5432f181", new Object[]{this, str});
        }
        ckf.g(str, "key");
        TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem = (TaoLiveKtEmojiIconItem) kotlin.collections.a.r(getEmojiViewModel().getEmojiMap()).get(str);
        if (taoLiveKtEmojiIconItem == null) {
            return (TaoLiveKtEmojiIconItem) kotlin.collections.a.r(dzs.INSTANCE.b().getEmojiMap()).get(str);
        }
        return taoLiveKtEmojiIconItem;
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public void prepareRecentNormalSection() {
        List<TaoLiveKtEmojiTabItem> tabInfoList;
        List list;
        TaoLiveKtEmojiStickerItem n;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d3db63", new Object[]{this});
            return;
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        if (!(taoLiveKtEmojiViewModel == null || (tabInfoList = taoLiveKtEmojiViewModel.getTabInfoList()) == null || tabInfoList.isEmpty())) {
            TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = (TaoLiveKtEmojiTabItem) i04.a0(tabInfoList);
            List<TaoLiveKtEmojiStickerItem> stickerList = taoLiveKtEmojiTabItem.getStickerList();
            if (stickerList != null) {
                list = i04.E0(stickerList);
            } else {
                list = new ArrayList();
            }
            if (!list.isEmpty()) {
                List<String> B0 = i04.B0(kzs.Companion.d());
                kzs kzsVar = this.recentUsedCache;
                ArrayList arrayList = new ArrayList();
                for (String str : B0) {
                    if (str == null) {
                        str = "";
                    }
                    TaoLiveKtEmojiIconItem matchedEmoji = matchedEmoji(str);
                    if (matchedEmoji != null) {
                        arrayList.add(matchedEmoji);
                    }
                }
                kzsVar.l(arrayList);
                if (!this.recentUsedCache.j().isEmpty() && (n = this.recentUsedCache.n()) != null) {
                    if (!list.contains(n)) {
                        list.add(0, n);
                    }
                    taoLiveKtEmojiTabItem.setStickerList(i04.B0(list));
                }
            }
        }
    }

    @Override // com.taobao.kmp.live.liveBizComponent.service.biz.liveResource.ITaoLiveKtEmojiManager
    public void prepareRecentUsedEmojis() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16ac9d73", new Object[]{this});
            return;
        }
        List<String> B0 = i04.B0(kzs.Companion.e());
        kzs kzsVar = this.recentUsedCache;
        ArrayList arrayList = new ArrayList();
        for (String str : B0) {
            if (str == null) {
                str = "";
            }
            TaoLiveKtEmojiIconItem matchedEmoji = matchedEmoji(str);
            if (matchedEmoji != null) {
                arrayList.add(matchedEmoji);
            }
        }
        kzsVar.m(arrayList);
        List E0 = i04.E0(this.recentUsedCache.k());
        for (TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem : fetchDefaultQuickEmojis()) {
            if (!B0.contains(taoLiveKtEmojiIconItem.getMatchKey())) {
                ArrayList arrayList2 = (ArrayList) E0;
                if (arrayList2.size() < kzs.Companion.c()) {
                    arrayList2.add(taoLiveKtEmojiIconItem);
                }
            }
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        if (taoLiveKtEmojiViewModel != null) {
            taoLiveKtEmojiViewModel.setRecentList(i04.B0(E0));
        }
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtDataServer
    public void updateLiveDetail(czs czsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("21cf366d", new Object[]{this, czsVar});
            return;
        }
        super.updateLiveDetail(czsVar);
        requestEmojiData();
    }

    @Override // com.taobao.live.liveroom.liveBizComponent.ktManager.base.TaoLiveKtComponent, com.taobao.kmp.live.liveBizComponent.service.base.ITaoLiveKtLifeCycle
    public void viewDidDisappear() {
        List<TaoLiveKtEmojiIconItem> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcc5f130", new Object[]{this});
            return;
        }
        super.viewDidDisappear();
        cacheRecentUsedEmojiIfNeeded();
        dzs dzsVar = dzs.INSTANCE;
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = this.curViewModel;
        List<TaoLiveKtEmojiIconItem> list2 = null;
        if (taoLiveKtEmojiViewModel != null) {
            list = taoLiveKtEmojiViewModel.getOfficialNormals();
        } else {
            list = null;
        }
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel2 = this.curViewModel;
        if (taoLiveKtEmojiViewModel2 != null) {
            list2 = taoLiveKtEmojiViewModel2.getOfficialLarges();
        }
        dzsVar.a(list, list2);
    }
}
