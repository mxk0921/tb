package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiTabItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiViewModel;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class dzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final dzs INSTANCE;

    /* renamed from: a  reason: collision with root package name */
    public static final TaoLiveKtEmojiViewModel f18183a = new TaoLiveKtEmojiViewModel();

    static {
        t2o.a(1010827265);
        dzs dzsVar = new dzs();
        INSTANCE = dzsVar;
        dzsVar.c();
    }

    public final void a(List<TaoLiveKtEmojiIconItem> list, List<TaoLiveKtEmojiIconItem> list2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f7ce98e", new Object[]{this, list, list2});
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (list != null && tvr.a(list)) {
            TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = f18183a;
            taoLiveKtEmojiViewModel.getOfficialNormals().clear();
            taoLiveKtEmojiViewModel.getOfficialNormals().addAll(list);
            for (TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem : list) {
                String matchKey = taoLiveKtEmojiIconItem.getMatchKey();
                if (matchKey == null) {
                    matchKey = "";
                }
                linkedHashMap.put(matchKey, taoLiveKtEmojiIconItem);
            }
        }
        if (list2 != null && tvr.a(list2)) {
            TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel2 = f18183a;
            taoLiveKtEmojiViewModel2.getOfficialLarges().clear();
            taoLiveKtEmojiViewModel2.getOfficialLarges().addAll(list2);
            for (TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem2 : list2) {
                String matchKey2 = taoLiveKtEmojiIconItem2.getMatchKey();
                if (matchKey2 == null) {
                    matchKey2 = "";
                }
                linkedHashMap.put(matchKey2, taoLiveKtEmojiIconItem2);
            }
        }
        if (!linkedHashMap.isEmpty()) {
            TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel3 = f18183a;
            taoLiveKtEmojiViewModel3.getEmojiMap().clear();
            taoLiveKtEmojiViewModel3.getEmojiMap().putAll(linkedHashMap);
        }
    }

    public final TaoLiveKtEmojiViewModel b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiViewModel) ipChange.ipc$dispatch("f77746c5", new Object[]{this});
        }
        return f18183a;
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78df8559", new Object[]{this});
            return;
        }
        TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem = new TaoLiveKtEmojiTabItem();
        taoLiveKtEmojiTabItem.setTabIcon("https://gw.alicdn.com/imgextra/i1/O1CN01FCqEL51z4KeWzEJA3_!!6000000006660-2-tps-60-62.png");
        taoLiveKtEmojiTabItem.setUnTabIcon("https://gw.alicdn.com/imgextra/i4/O1CN01duDmhs1GlF34GfvtG_!!6000000000662-2-tps-60-60.png");
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem = new TaoLiveKtEmojiStickerItem();
        taoLiveKtEmojiStickerItem.setTitle("全部表情");
        taoLiveKtEmojiStickerItem.setType("official_sticker");
        TaoLiveKtEmojiViewModel taoLiveKtEmojiViewModel = f18183a;
        taoLiveKtEmojiStickerItem.setEmojiList(taoLiveKtEmojiViewModel.getOfficialNormals());
        taoLiveKtEmojiTabItem.setStickerList(xz3.e(taoLiveKtEmojiStickerItem));
        TaoLiveKtEmojiTabItem taoLiveKtEmojiTabItem2 = new TaoLiveKtEmojiTabItem();
        taoLiveKtEmojiTabItem2.setTabIcon("https://gw.alicdn.com/imgextra/i2/O1CN01jgDxAL20CPFaqRses_!!6000000006813-2-tps-60-60.png");
        taoLiveKtEmojiTabItem2.setUnTabIcon("https://gw.alicdn.com/imgextra/i2/O1CN01HXF8JD29QRwBkccQo_!!6000000008062-2-tps-60-60.png");
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem2 = new TaoLiveKtEmojiStickerItem();
        taoLiveKtEmojiStickerItem2.setTitle("全部表情");
        taoLiveKtEmojiStickerItem2.setType("official_strip_sticker");
        taoLiveKtEmojiStickerItem2.setEmojiList(taoLiveKtEmojiViewModel.getOfficialLarges());
        taoLiveKtEmojiTabItem2.setStickerList(xz3.e(taoLiveKtEmojiStickerItem2));
        taoLiveKtEmojiViewModel.setTabInfoList(yz3.l(taoLiveKtEmojiTabItem, taoLiveKtEmojiTabItem2));
    }
}
