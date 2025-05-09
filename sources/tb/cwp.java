package tb;

import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.live.plugin.atype.flexalocal.good.business.EnterGoodsData;
import com.taobao.taobao.R;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tb.gzp;
import tb.ufg;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class cwp implements hqd, s3c {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_APPEAR = "good.showcase.appear";
    public static final String EVENT_DISAPPEAR = "good.showcase.disappear";

    /* renamed from: a  reason: collision with root package name */
    public final FrameLayout f17372a;
    public final VideoInfo b;
    public final bwl c;
    public final gzp d;
    public ufg e;
    public final w1o f;
    public c g;
    public final xea h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements gzp.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public void a(LiveItem liveItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ecea48e", new Object[]{this, liveItem});
            } else if (cwp.b(cwp.this) != null) {
                cwp.b(cwp.this).i(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements ufg.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ List f17374a;
        public final /* synthetic */ hmc b;
        public final /* synthetic */ gzp.b c;

        public b(List list, hmc hmcVar, gzp.b bVar) {
            this.f17374a = list;
            this.b = hmcVar;
            this.c = bVar;
        }

        @Override // tb.ufg.b
        public void a(List<LiveItem> list, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("887cf403", new Object[]{this, list, new Boolean(z)});
                return;
            }
            if (cwp.c(cwp.this) != null) {
                cwp.c(cwp.this).w(list, this.f17374a, this.b, this.c, z);
            }
            if (cwp.d(cwp.this) != null) {
                cwp.d(cwp.this).b();
                cwp.e(cwp.this, null);
            }
        }

        @Override // tb.ufg.b
        public void b(LiveItem liveItem) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d620f6d0", new Object[]{this, liveItem});
            } else if (cwp.b(cwp.this) != null) {
                cwp.b(cwp.this).i(false);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f17375a;
        public final long b;

        static {
            t2o.a(295699109);
        }

        public /* synthetic */ c(String str, a aVar) {
            this(str);
        }

        public static /* synthetic */ String a(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("827bdab1", new Object[]{cVar});
            }
            return cVar.f17375a;
        }

        public static /* synthetic */ long b(c cVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("fe2f884", new Object[]{cVar})).longValue();
            }
            return cVar.b;
        }

        public c(String str) {
            this.f17375a = str;
            this.b = f4s.a();
        }
    }

    static {
        t2o.a(295699106);
        t2o.a(295699051);
        t2o.a(806355016);
    }

    public cwp(ViewGroup viewGroup, hmc hmcVar, VideoInfo videoInfo, xea xeaVar, EnterGoodsData enterGoodsData) {
        List<LiveItem> list;
        List<LiveItem> list2;
        FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.fl_show_case_card);
        this.f17372a = frameLayout;
        FrameLayout frameLayout2 = (FrameLayout) viewGroup.findViewById(R.id.fl_show_case_big_card);
        this.h = xeaVar;
        frameLayout.removeAllViews();
        frameLayout.clearAnimation();
        this.b = videoInfo;
        if (xeaVar == null) {
            hha.b("ShowcaseControllerCommon", "ShowcaseController | context is null.");
            return;
        }
        if (!xeaVar.Q()) {
            if (!TextUtils.equals(videoInfo.roomStatus, "2") || !wda.w()) {
                bwl bwlVar = new bwl(frameLayout, videoInfo, xeaVar);
                this.c = bwlVar;
                bwlVar.g();
                gzp gzpVar = new gzp(frameLayout, videoInfo, xeaVar);
                this.d = gzpVar;
                this.e = new ufg(frameLayout2, videoInfo, xeaVar);
                if (enterGoodsData == null) {
                    list = videoInfo.curItemList;
                } else {
                    list = enterGoodsData.curItemList;
                }
                if (enterGoodsData == null) {
                    list2 = videoInfo.popItemCardList;
                } else {
                    list2 = enterGoodsData.popItemCardList;
                }
                a aVar = new a();
                b bVar = new b(list2, hmcVar, aVar);
                if (xeaVar.O() || !pfa.z(videoInfo, enterGoodsData, list)) {
                    hha.b("ShowcaseControllerCommon", "ShowcaseController | init small card.");
                    gzpVar.w(list, list2, hmcVar, aVar, false);
                } else {
                    hha.b("ShowcaseControllerCommon", "ShowcaseController | init big card.");
                    this.e.j(list, hmcVar, bVar);
                }
            } else {
                this.f = new w1o(frameLayout, videoInfo, xeaVar);
            }
        }
        sjr.g().a(this);
    }

    public static /* synthetic */ bwl b(cwp cwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bwl) ipChange.ipc$dispatch("4d0e455c", new Object[]{cwpVar});
        }
        return cwpVar.c;
    }

    public static /* synthetic */ gzp c(cwp cwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (gzp) ipChange.ipc$dispatch("c80abc1", new Object[]{cwpVar});
        }
        return cwpVar.d;
    }

    public static /* synthetic */ ufg d(cwp cwpVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ufg) ipChange.ipc$dispatch("54ec4b08", new Object[]{cwpVar});
        }
        return cwpVar.e;
    }

    public static /* synthetic */ ufg e(cwp cwpVar, ufg ufgVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ufg) ipChange.ipc$dispatch("5fa550f5", new Object[]{cwpVar, ufgVar});
        }
        cwpVar.e = ufgVar;
        return ufgVar;
    }

    @Override // tb.hqd
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("63ce8f54", new Object[]{this});
            return;
        }
        gzp gzpVar = this.d;
        if (gzpVar != null) {
            gzpVar.K(1);
        }
        w1o w1oVar = this.f;
        if (w1oVar != null) {
            w1oVar.p();
        }
        ufg ufgVar = this.e;
        if (ufgVar != null) {
            ufgVar.i();
        }
    }

    @Override // tb.s3c
    public String bizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("36951559", new Object[]{this});
        }
        xea xeaVar = this.h;
        if (xeaVar == null || xeaVar.q() == null) {
            return null;
        }
        return this.h.q().C();
    }

    @Override // tb.hqd
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        f(true, null);
        this.g = null;
        this.f17372a.clearAnimation();
        gzp gzpVar = this.d;
        if (gzpVar != null) {
            gzpVar.b();
        }
        bwl bwlVar = this.c;
        if (bwlVar != null) {
            bwlVar.b();
        }
        w1o w1oVar = this.f;
        if (w1oVar != null) {
            w1oVar.b();
        }
        ufg ufgVar = this.e;
        if (ufgVar != null) {
            ufgVar.b();
        }
        this.f17372a.removeAllViews();
        sjr.g().b(this);
    }

    public final void f(boolean z, c cVar) {
        long j;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8f072bf", new Object[]{this, new Boolean(z), cVar});
        } else if (!z || this.g != null) {
            c cVar2 = this.g;
            String str2 = "-1";
            String a2 = cVar2 == null ? str2 : c.a(cVar2);
            if (cVar != null) {
                str2 = c.a(cVar);
            }
            long j2 = -1;
            if (z) {
                j = f4s.a();
            } else {
                j = cVar == null ? -1L : c.b(cVar);
            }
            c cVar3 = this.g;
            if (cVar3 != null) {
                j2 = c.b(cVar3);
            }
            HashMap<String, String> hashMap = new HashMap<>();
            hashMap.put("showCardNotifyId", a2);
            hashMap.put("hideCardNotifyId", str2);
            hashMap.put("showCardTime", Long.toString(j2));
            hashMap.put("hideCardTime", Long.toString(j));
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            hashMap.put("isLeave", str);
            hashMap.put("cardTime", Long.toString(j - j2));
            hha.c("ShowcaseControllerCommon", "trackAuctionEvent | isLeave=" + z + " showCardNotifyId=" + a2 + " hideCardNotifyId=" + str2 + " showCardTime=" + j2 + " hideCardTime=" + j);
            if (kkr.i().o() != null) {
                kkr.i().o().c("GLShowcaseAuctionExclude", hashMap);
            }
        }
    }

    public void g(LiveItem liveItem) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("170544c8", new Object[]{this, liveItem});
            return;
        }
        gzp gzpVar = this.d;
        if (gzpVar != null) {
            gzpVar.F(liveItem, false);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed697d42", new Object[]{this, new Boolean(z)});
            return;
        }
        gzp gzpVar = this.d;
        if (gzpVar != null) {
            gzpVar.I(z);
        }
        bwl bwlVar = this.c;
        if (bwlVar != null) {
            bwlVar.i(z);
        }
        w1o w1oVar = this.f;
        if (w1oVar != null) {
            w1oVar.F(z);
        }
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{"com.taobao.taolive.showcase.control", "com.taobao.taolive.goods.showcase.close", "com.taobao.taolive.goods.showcase.update", "com.taobao.taolive.room.sab_atmosphere_show", "com.taobao.taolive.room.sab_atmosphere_dismiss", uyg.EVENT_TYPE_PLAYBACK_SHOWCASE_CONTROL};
    }

    @Override // tb.s3c
    public String observeUniqueIdentification() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("4914bdfe", new Object[]{this});
        }
        xea xeaVar = this.h;
        if (xeaVar == null || xeaVar.q() == null) {
            return null;
        }
        return this.h.q().C();
    }

    @Override // tb.s3c
    public void onEvent(String str, Object obj) {
        w1o w1oVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
        } else if ("com.taobao.taolive.showcase.control".equalsIgnoreCase(str)) {
            if (obj instanceof Map) {
                HashMap hashMap = (HashMap) obj;
                String str2 = (String) hashMap.get("liveid");
                String str3 = (String) hashMap.get("eventType");
                String str4 = (String) hashMap.get("notifyId");
                VideoInfo videoInfo = this.b;
                if (videoInfo == null || TextUtils.equals(videoInfo.liveId, str2)) {
                    hha.b("ShowcaseControllerCommon", "onEvent | liveid check failed. liveId=" + str2);
                    return;
                }
                hha.c("ShowcaseControllerCommon", "onEvent | eventType=" + str3);
                if (TextUtils.equals("cardShow", str3)) {
                    this.g = new c(str4, null);
                    h(false);
                } else if (TextUtils.equals("cardHide", str3)) {
                    h(true);
                    f(false, new c(str4, null));
                    this.g = null;
                }
            }
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.close", str)) {
            a();
        } else if (TextUtils.equals("com.taobao.taolive.goods.showcase.update", str)) {
            if (obj instanceof LiveItem) {
                g((LiveItem) obj);
            }
        } else if (nh4.D0() && "com.taobao.taolive.room.sab_atmosphere_show".equals(str)) {
            gzp gzpVar = this.d;
            if (gzpVar != null) {
                gzpVar.B(true);
            }
        } else if (nh4.D0() && "com.taobao.taolive.room.sab_atmosphere_dismiss".equals(str)) {
            gzp gzpVar2 = this.d;
            if (gzpVar2 != null) {
                gzpVar2.B(false);
            }
        } else if (TextUtils.equals(uyg.EVENT_TYPE_PLAYBACK_SHOWCASE_CONTROL, str) && (w1oVar = this.f) != null && (obj instanceof HashMap)) {
            w1oVar.B((HashMap) obj);
        }
    }
}
