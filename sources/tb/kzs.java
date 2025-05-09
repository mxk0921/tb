package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiIconItem;
import com.taobao.kmp.live.liveBizComponent.model.leftBottom.emoji.TaoLiveKtEmojiStickerItem;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class kzs {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion;
    public static final List<String> e;
    public static final List<String> f;
    public static final int g = 7;
    public static final int h = 3;
    public static final String i = "TaoLiveEmojiNormalCacheKey";
    public static final String j = "TaoLiveEmojiRecentCacheKey";

    /* renamed from: a  reason: collision with root package name */
    public List<TaoLiveKtEmojiIconItem> f23029a = yz3.i();
    public List<TaoLiveKtEmojiIconItem> b = yz3.i();
    public TaoLiveKtEmojiStickerItem c;
    public boolean d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(1010827267);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public static final /* synthetic */ List a(a aVar, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("6b4224f6", new Object[]{aVar, str});
            }
            return aVar.f(str);
        }

        public static final /* synthetic */ void b(a aVar, String str, List list) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("45964b2b", new Object[]{aVar, str, list});
            } else {
                aVar.g(str, list);
            }
        }

        public final int c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("85622849", new Object[]{this})).intValue();
            }
            return kzs.b() + kzs.a();
        }

        public final List<String> d() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("807d43cf", new Object[]{this});
            }
            return kzs.c();
        }

        public final List<String> e() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("e98857db", new Object[]{this});
            }
            return kzs.d();
        }

        public final List<String> f(String str) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("9c582d68", new Object[]{this, str});
            }
            String str3 = mhr.Y().get(str);
            if (str3 == null) {
                str3 = "";
            }
            List<Object> a2 = xrf.a(str3);
            ArrayList arrayList = null;
            if (a2 != null) {
                List<Object> list = a2;
                ArrayList arrayList2 = new ArrayList(zz3.q(list, 10));
                for (Object obj : list) {
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    arrayList2.add(str2);
                }
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                return yz3.i();
            }
            return arrayList;
        }

        public final void g(String str, List<String> list) {
            String str2;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("6cfd7e39", new Object[]{this, str, list});
                return;
            }
            if (list == null || (str2 = xrf.e(list)) == null) {
                str2 = "";
            }
            if (str2.length() > 0) {
                mhr.Y().set(str, str2);
            }
        }

        public a() {
        }
    }

    static {
        t2o.a(1010827266);
        a aVar = new a(null);
        Companion = aVar;
        e = new ArrayList();
        f = new ArrayList();
        e = i04.E0(a.a(aVar, "TaoLiveEmojiNormalCacheKey"));
        f = i04.E0(a.a(aVar, "TaoLiveEmojiRecentCacheKey"));
    }

    public static final /* synthetic */ int a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("39a206ec", new Object[0])).intValue();
        }
        return h;
    }

    public static final /* synthetic */ int b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("69e635b6", new Object[0])).intValue();
        }
        return g;
    }

    public static final /* synthetic */ List c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59b93920", new Object[0]);
        }
        return e;
    }

    public static final /* synthetic */ List d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("59eb1994", new Object[0]);
        }
        return f;
    }

    public final void e(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem, List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e17c8965", new Object[]{this, taoLiveKtEmojiIconItem, list});
            return;
        }
        String matchKey = taoLiveKtEmojiIconItem.getMatchKey();
        list.remove(matchKey);
        list.add(0, matchKey);
    }

    public final void f(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("117b5caa", new Object[]{this, taoLiveKtEmojiIconItem});
            return;
        }
        List<String> list = e;
        e(taoLiveKtEmojiIconItem, list);
        if (((ArrayList) list).size() >= g) {
            d04.C(list);
        }
    }

    public final void g(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a161501e", new Object[]{this, taoLiveKtEmojiIconItem});
            return;
        }
        e(taoLiveKtEmojiIconItem, f);
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.b) {
            if (((TaoLiveKtEmojiIconItem) obj).getNormalType()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : this.b) {
            if (((TaoLiveKtEmojiIconItem) obj2).getLargeType()) {
                arrayList2.add(obj2);
            }
        }
        if (arrayList.size() >= g) {
            ((ArrayList) f).remove(((TaoLiveKtEmojiIconItem) i04.l0(arrayList)).getMatchKey());
        }
        if (arrayList2.size() >= h) {
            ((ArrayList) f).remove(((TaoLiveKtEmojiIconItem) i04.l0(arrayList2)).getMatchKey());
        }
    }

    public final void h(TaoLiveKtEmojiIconItem taoLiveKtEmojiIconItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97a13f72", new Object[]{this, taoLiveKtEmojiIconItem});
        } else if (taoLiveKtEmojiIconItem != null) {
            this.d = true;
            if (taoLiveKtEmojiIconItem.getNormalType()) {
                f(taoLiveKtEmojiIconItem);
            }
            g(taoLiveKtEmojiIconItem);
        }
    }

    public final void i() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a24b65", new Object[]{this});
        } else if (this.d) {
            List<String> list = e;
            if (!list.isEmpty()) {
                a.b(Companion, i, list);
            }
            List<String> list2 = f;
            if (!list2.isEmpty()) {
                a.b(Companion, j, list2);
            }
        }
    }

    public final List<TaoLiveKtEmojiIconItem> j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("80d1dce5", new Object[]{this});
        }
        return this.f23029a;
    }

    public final List<TaoLiveKtEmojiIconItem> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("e9dcf0f1", new Object[]{this});
        }
        return this.b;
    }

    public final void l(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5a40a61f", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.f23029a = list;
    }

    public final void m(List<TaoLiveKtEmojiIconItem> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("12981393", new Object[]{this, list});
            return;
        }
        ckf.g(list, "<set-?>");
        this.b = list;
    }

    public final TaoLiveKtEmojiStickerItem n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtEmojiStickerItem) ipChange.ipc$dispatch("4c4e6351", new Object[]{this});
        }
        if (this.f23029a.isEmpty()) {
            return null;
        }
        if (this.c == null) {
            this.c = new TaoLiveKtEmojiStickerItem();
        }
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem = this.c;
        if (taoLiveKtEmojiStickerItem != null) {
            taoLiveKtEmojiStickerItem.setTitle("最近使用");
        }
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem2 = this.c;
        if (taoLiveKtEmojiStickerItem2 != null) {
            taoLiveKtEmojiStickerItem2.setType("recently");
        }
        TaoLiveKtEmojiStickerItem taoLiveKtEmojiStickerItem3 = this.c;
        if (taoLiveKtEmojiStickerItem3 != null) {
            taoLiveKtEmojiStickerItem3.setEmojiList(i04.E0(this.f23029a));
        }
        return this.c;
    }
}
