package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$H5TabBundle;
import com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$NativeDXTabBundle;
import com.taobao.android.live.plugin.atype.flexalocal.good.view.liveGoodsList.liveStateMutitabView.impl.GoodsLiveStateMutitabView;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tb.wbc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class p3a {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAB_TYPE_H5 = "h5";
    public static final String TAB_TYPE_NATIVE_DX = "nativeDX";

    /* renamed from: a  reason: collision with root package name */
    public final xea f25855a;
    public final List<aqs> b;
    public int c = 0;

    static {
        t2o.a(295699160);
    }

    public p3a(xea xeaVar, List<aqs> list) {
        this.f25855a = xeaVar;
        this.b = list;
        hha.b("GLTabHelper", "[GLTabHelper] init");
    }

    public final aqs a(VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqs) ipChange.ipc$dispatch("5c947561", new Object[]{this, extraGoodsTabItem});
        }
        String str = extraGoodsTabItem.type;
        str.hashCode();
        if (str.equals("h5")) {
            return i(this.f25855a.i(), extraGoodsTabItem);
        }
        if (!str.equals(TAB_TYPE_NATIVE_DX)) {
            return null;
        }
        return k(this.f25855a.i(), extraGoodsTabItem);
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            c();
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f45d331f", new Object[]{this});
            return;
        }
        for (aqs aqsVar : this.b) {
            if (aqsVar != null) {
                hha.b("GLTabHelper", "destroyTabs | bundle=" + aqsVar);
                aqsVar.destroy();
            }
        }
        this.b.clear();
    }

    public final aqs d(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqs) ipChange.ipc$dispatch("2398556f", new Object[]{this, new Integer(i)});
        }
        if (i < 0) {
            hha.b("GLTabHelper", "[findTabBundleByIndex] index < 0");
            return null;
        } else if (this.b.isEmpty()) {
            hha.b("GLTabHelper", "[findTabBundleByIndex] tabBundles isEmpty");
            return null;
        } else if (i >= this.b.size()) {
            hha.b("GLTabHelper", "[findTabBundleByIndex] index >= this.tabBundles.size()");
            return null;
        } else {
            try {
                return this.b.get(i);
            } catch (Exception e) {
                hha.b("GLTabHelper", "[findTabBundleByIndex] error = " + e.getMessage());
                return null;
            }
        }
    }

    public aqs e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqs) ipChange.ipc$dispatch("b7db87b5", new Object[]{this});
        }
        return d(this.c);
    }

    public int f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("66e38d1a", new Object[]{this})).intValue();
        }
        return this.c;
    }

    public TabBundleInfo$NativeDXTabBundle g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBundleInfo$NativeDXTabBundle) ipChange.ipc$dispatch("3e48ac5b", new Object[]{this});
        }
        if (this.b.isEmpty()) {
            return null;
        }
        for (aqs aqsVar : this.b) {
            if (aqsVar instanceof TabBundleInfo$NativeDXTabBundle) {
                return (TabBundleInfo$NativeDXTabBundle) aqsVar;
            }
        }
        return null;
    }

    public List<aqs> h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("a4b23ace", new Object[]{this});
        }
        return this.b;
    }

    public final aqs i(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aqs) ipChange.ipc$dispatch("f805da9c", new Object[]{this, context, extraGoodsTabItem});
        }
        if (context == null || extraGoodsTabItem == null) {
            hha.b("GLTabHelper", "[initH5Container] tabItem = null");
            return null;
        }
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (kkr.i().h() == null) {
            hha.b("GLTabHelper", "[initH5Container] H5TabFrameAdapter = null");
            return null;
        }
        wbc.a b = kkr.i().h().b(this.f25855a.i(), extraGoodsTabItem, this.f25855a.O(), this.f25855a.t());
        if (b != null) {
            View a2 = kkr.i().h().a(b);
            if (a2 != null) {
                hha.b("GLTabHelper", "[initH5Container] frameView added");
                frameLayout.addView(a2);
                TabBundleInfo$H5TabBundle tabBundleInfo$H5TabBundle = new TabBundleInfo$H5TabBundle(0, extraGoodsTabItem);
                tabBundleInfo$H5TabBundle.url = extraGoodsTabItem.url;
                tabBundleInfo$H5TabBundle.showTopBarType = extraGoodsTabItem.showTopBarType;
                tabBundleInfo$H5TabBundle.baseFrame = b;
                tabBundleInfo$H5TabBundle.frameView = a2;
                tabBundleInfo$H5TabBundle.tabFrameLayout = frameLayout;
                return tabBundleInfo$H5TabBundle;
            }
        } else {
            hha.b("GLTabHelper", "[initH5Container] baseFrame = null");
        }
        return null;
    }

    public void m(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efe1b9c8", new Object[]{this, new Integer(i)});
        } else {
            this.c = i;
        }
    }

    public final TabBundleInfo$NativeDXTabBundle k(Context context, VideoInfo.ExtraGoodsTabItem extraGoodsTabItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TabBundleInfo$NativeDXTabBundle) ipChange.ipc$dispatch("2cfad564", new Object[]{this, context, extraGoodsTabItem});
        }
        TabBundleInfo$NativeDXTabBundle tabBundleInfo$NativeDXTabBundle = new TabBundleInfo$NativeDXTabBundle(0, extraGoodsTabItem);
        hha.b("GLTabHelper", "[initNativeDXContainer].");
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        xea xeaVar = this.f25855a;
        GoodsLiveStateMutitabView goodsLiveStateMutitabView = new GoodsLiveStateMutitabView(xeaVar, xeaVar.O());
        frameLayout.addView(goodsLiveStateMutitabView);
        goodsLiveStateMutitabView.initData();
        if (extraGoodsTabItem == null) {
            hha.b("GLTabHelper", "[initNativeDXContainer] isLandscape = " + this.f25855a.O());
            tabBundleInfo$NativeDXTabBundle.key = "nativeDX_宝贝";
            tabBundleInfo$NativeDXTabBundle.tabType = TAB_TYPE_NATIVE_DX;
        } else {
            tabBundleInfo$NativeDXTabBundle.tabType = extraGoodsTabItem.type;
        }
        tabBundleInfo$NativeDXTabBundle.baseFrame = null;
        tabBundleInfo$NativeDXTabBundle.stateMultiTabView = goodsLiveStateMutitabView;
        tabBundleInfo$NativeDXTabBundle.tabFrameLayout = frameLayout;
        tabBundleInfo$NativeDXTabBundle.frameView = goodsLiveStateMutitabView;
        return tabBundleInfo$NativeDXTabBundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b6 A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:10:0x0027, B:12:0x0034, B:13:0x0038, B:15:0x003e, B:17:0x0046, B:20:0x004f, B:23:0x0056, B:25:0x005d, B:28:0x0073, B:30:0x0079, B:35:0x008f, B:38:0x009a, B:45:0x00ab, B:46:0x00b6, B:48:0x00c2), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c2 A[Catch: all -> 0x0053, TRY_LEAVE, TryCatch #0 {all -> 0x0053, blocks: (B:10:0x0027, B:12:0x0034, B:13:0x0038, B:15:0x003e, B:17:0x0046, B:20:0x004f, B:23:0x0056, B:25:0x005d, B:28:0x0073, B:30:0x0079, B:35:0x008f, B:38:0x009a, B:45:0x00ab, B:46:0x00b6, B:48:0x00c2), top: B:52:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            r10 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "GLTabHelper"
            com.android.alibaba.ip.runtime.IpChange r3 = tb.p3a.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0017
            java.lang.String r2 = "270d8916"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r0] = r10
            r4[r1] = r11
            r3.ipc$dispatch(r2, r4)
            return
        L_0x0017:
            if (r11 == 0) goto L_0x00de
            boolean r3 = r11.isEmpty()
            if (r3 != 0) goto L_0x00de
            java.lang.String r3 = "extraGoodsTabList"
            java.lang.Object r11 = r11.get(r3)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Class<com.taobao.taolive.sdk.model.common.VideoInfo$ExtraGoodsTabItem> r3 = com.taobao.taolive.sdk.model.common.VideoInfo.ExtraGoodsTabItem.class
            java.util.List r11 = com.alibaba.fastjson.JSON.parseArray(r11, r3)     // Catch: all -> 0x0053
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: all -> 0x0053
            r3.<init>()     // Catch: all -> 0x0053
            if (r11 == 0) goto L_0x0056
            java.util.Iterator r4 = r11.iterator()     // Catch: all -> 0x0053
        L_0x0038:
            boolean r5 = r4.hasNext()     // Catch: all -> 0x0053
            if (r5 == 0) goto L_0x0056
            java.lang.Object r5 = r4.next()     // Catch: all -> 0x0053
            com.taobao.taolive.sdk.model.common.VideoInfo$ExtraGoodsTabItem r5 = (com.taobao.taolive.sdk.model.common.VideoInfo.ExtraGoodsTabItem) r5     // Catch: all -> 0x0053
            if (r5 == 0) goto L_0x0038
            java.lang.String r6 = r5.type     // Catch: all -> 0x0053
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: all -> 0x0053
            if (r6 == 0) goto L_0x004f
            goto L_0x0038
        L_0x004f:
            r3.add(r5)     // Catch: all -> 0x0053
            goto L_0x0038
        L_0x0053:
            r11 = move-exception
            goto L_0x00c9
        L_0x0056:
            boolean r4 = r3.isEmpty()     // Catch: all -> 0x0053
            r5 = 0
            if (r4 == 0) goto L_0x0072
            java.lang.String r11 = "[initMultiContainerInner] safetyTabList is empty"
            tb.hha.b(r2, r11)     // Catch: all -> 0x0053
            tb.xea r11 = r10.f25855a     // Catch: all -> 0x0053
            android.content.Context r11 = r11.i()     // Catch: all -> 0x0053
            com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$NativeDXTabBundle r11 = r10.k(r11, r5)     // Catch: all -> 0x0053
            java.util.List<tb.aqs> r0 = r10.b     // Catch: all -> 0x0053
            r0.add(r11)     // Catch: all -> 0x0053
            return
        L_0x0072:
            r4 = 0
        L_0x0073:
            int r6 = r3.size()     // Catch: all -> 0x0053
            if (r4 >= r6) goto L_0x00de
            java.lang.Object r6 = r11.get(r4)     // Catch: all -> 0x0053
            com.taobao.taolive.sdk.model.common.VideoInfo$ExtraGoodsTabItem r6 = (com.taobao.taolive.sdk.model.common.VideoInfo.ExtraGoodsTabItem) r6     // Catch: all -> 0x0053
            java.lang.String r7 = r6.type     // Catch: all -> 0x0053
            int r8 = r7.hashCode()     // Catch: all -> 0x0053
            r9 = 3277(0xccd, float:4.592E-42)
            if (r8 == r9) goto L_0x009a
            r9 = 2045685483(0x79eeaeeb, float:1.549143E35)
            if (r8 == r9) goto L_0x008f
            goto L_0x00a4
        L_0x008f:
            java.lang.String r8 = "nativeDX"
            boolean r7 = r7.equals(r8)     // Catch: all -> 0x0053
            if (r7 == 0) goto L_0x00a4
            r7 = 1
            goto L_0x00a5
        L_0x009a:
            java.lang.String r8 = "h5"
            boolean r7 = r7.equals(r8)     // Catch: all -> 0x0053
            if (r7 == 0) goto L_0x00a4
            r7 = 0
            goto L_0x00a5
        L_0x00a4:
            r7 = -1
        L_0x00a5:
            if (r7 == 0) goto L_0x00b6
            if (r7 == r1) goto L_0x00ab
            r6 = r5
            goto L_0x00c0
        L_0x00ab:
            tb.xea r7 = r10.f25855a     // Catch: all -> 0x0053
            android.content.Context r7 = r7.i()     // Catch: all -> 0x0053
            com.taobao.android.live.plugin.atype.flexalocal.good.tab.TabBundleInfo$NativeDXTabBundle r6 = r10.k(r7, r6)     // Catch: all -> 0x0053
            goto L_0x00c0
        L_0x00b6:
            tb.xea r7 = r10.f25855a     // Catch: all -> 0x0053
            android.content.Context r7 = r7.i()     // Catch: all -> 0x0053
            tb.aqs r6 = r10.i(r7, r6)     // Catch: all -> 0x0053
        L_0x00c0:
            if (r6 == 0) goto L_0x00c7
            java.util.List<tb.aqs> r7 = r10.b     // Catch: all -> 0x0053
            r7.add(r6)     // Catch: all -> 0x0053
        L_0x00c7:
            int r4 = r4 + r1
            goto L_0x0073
        L_0x00c9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "[initMultiContainerInner] json error: "
            r0.<init>(r1)
            java.lang.String r11 = r11.getMessage()
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            tb.hha.b(r2, r11)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.p3a.j(java.util.Map):void");
    }

    public void l(ViewPager viewPager, PagerAdapter pagerAdapter, ArrayList<VideoInfo.ExtraGoodsTabItem> arrayList) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1df84665", new Object[]{this, viewPager, pagerAdapter, arrayList});
        } else if (arrayList != null && !arrayList.isEmpty() && pagerAdapter != null && !TextUtils.isEmpty(arrayList.get(0).type)) {
            ArrayList arrayList2 = new ArrayList();
            boolean z2 = false;
            for (int i = 0; i < arrayList.size(); i++) {
                VideoInfo.ExtraGoodsTabItem extraGoodsTabItem = arrayList.get(i);
                Iterator<aqs> it = this.b.iterator();
                while (true) {
                    if (it.hasNext()) {
                        aqs next = it.next();
                        if (pfa.T(next.tabItem, extraGoodsTabItem)) {
                            arrayList2.add(next);
                            it.remove();
                            break;
                        }
                    } else {
                        hha.b("GLTabHelper", "refreshTab | createTab " + extraGoodsTabItem.type);
                        aqs a2 = a(extraGoodsTabItem);
                        if (a2 != null) {
                            arrayList2.add(a2);
                        }
                        z2 = true;
                    }
                }
            }
            if (!this.b.isEmpty() || z2) {
                z = false;
            }
            c();
            this.b.addAll(arrayList2);
            pagerAdapter.notifyDataSetChanged();
            if (!z) {
                viewPager.setCurrentItem(0);
                this.c = 0;
            }
        }
    }
}
