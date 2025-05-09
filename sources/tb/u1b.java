package tb;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.business.FeedListResponse;
import com.taobao.android.livehome.plugin.atype.flexalocal.homepage2.fragment.main.module.DinamicDataObject;
import com.taobao.phenix.intf.event.FailPhenixEvent;
import com.taobao.phenix.intf.event.SuccPhenixEvent;
import com.taobao.tao.log.TLog;
import com.taobao.taobao.R;
import com.taobao.uikit.extend.feature.view.TUrlImageView;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class u1b extends t0b implements nlc {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String p = u1b.class.getSimpleName();
    public TUrlImageView e;
    public FrameLayout f;
    public TUrlImageView g;
    public TUrlImageView h;
    public boolean i;
    public boolean j;
    public String k = "";
    public String l = "";
    public boolean m = true;
    public int n = 0;
    public z1b o;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29073a;

        public a(boolean z) {
            this.f29073a = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (this.f29073a) {
                str = "homeMain_cache_headArea_bgImg_render_end";
            } else {
                str = "homeMain_mtop_headArea_bgImg_render_end";
            }
            mbu.b(str, u1b.this.c);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29074a;
        public final /* synthetic */ TUrlImageView b;

        public b(boolean z, TUrlImageView tUrlImageView) {
            this.f29074a = z;
            this.b = tUrlImageView;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (!this.f29074a) {
                this.b.setImageUrl("");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f29075a;

        public c(boolean z) {
            this.f29075a = z;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            String str;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            if (this.f29075a) {
                str = "homeMain_cache_headArea_bgImg_render_end";
            } else {
                str = "homeMain_mtop_headArea_bgImg_render_end";
            }
            mbu.b(str, u1b.this.c);
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements s8d<FailPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        /* renamed from: a */
        public boolean onHappen(FailPhenixEvent failPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5fa0e8d0", new Object[]{this, failPhenixEvent})).booleanValue();
            }
            TLog.loge("TaoLiveHomepage", "NewChannelCommercialCard bg download failed");
            if (u1b.d(u1b.this) < 3) {
                u1b.g(u1b.this).setImageUrl(u1b.f(u1b.this));
            } else {
                if (u1b.h(u1b.this) != null) {
                    u1b.h(u1b.this).c(true);
                    u1b.h(u1b.this).b(false);
                }
                u1b.g(u1b.this).setImageUrl("https://gw.alicdn.com/imgextra/i2/O1CN01j32P8U26dmiZXwscZ_!!6000000007685-0-tps-750-720.jpg");
                u1b.i(u1b.this, true);
            }
            u1b.e(u1b.this);
            return false;
        }
    }

    static {
        t2o.a(310378735);
        t2o.a(806355483);
    }

    public u1b(ViewGroup viewGroup, Context context, b0h b0hVar) {
        super(viewGroup, context, b0hVar);
    }

    public static /* synthetic */ int d(u1b u1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("a3e2d37", new Object[]{u1bVar})).intValue();
        }
        return u1bVar.n;
    }

    public static /* synthetic */ int e(u1b u1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("e16da2f", new Object[]{u1bVar})).intValue();
        }
        int i = u1bVar.n;
        u1bVar.n = 1 + i;
        return i;
    }

    public static /* synthetic */ String f(u1b u1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1fa67dd", new Object[]{u1bVar});
        }
        return u1bVar.k;
    }

    public static /* synthetic */ TUrlImageView g(u1b u1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TUrlImageView) ipChange.ipc$dispatch("bd05d7ba", new Object[]{u1bVar});
        }
        return u1bVar.e;
    }

    public static /* synthetic */ z1b h(u1b u1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (z1b) ipChange.ipc$dispatch("c27760e1", new Object[]{u1bVar});
        }
        return u1bVar.o;
    }

    public static /* synthetic */ boolean i(u1b u1bVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a93bb29a", new Object[]{u1bVar, new Boolean(z)})).booleanValue();
        }
        u1bVar.getClass();
        return z;
    }

    public static /* synthetic */ Object ipc$super(u1b u1bVar, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            u1bVar.b();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/livehome/plugin/atype/flexalocal/homepage2/fragment/main/component/HomeMainTopBgView");
    }

    @Override // tb.t0b
    public View a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("ebecba09", new Object[]{this});
        }
        if (this.b == null) {
            return null;
        }
        qyg.c().f(this);
        this.f = (FrameLayout) this.b.findViewById(R.id.live_home_main_top_atmosphere_layout);
        this.g = (TUrlImageView) this.b.findViewById(R.id.live_home_main_top_atmosphere_front);
        this.h = (TUrlImageView) this.b.findViewById(R.id.live_home_main_top_atmosphere_next);
        TUrlImageView tUrlImageView = (TUrlImageView) this.b.findViewById(R.id.live_home_main_top_background);
        this.e = tUrlImageView;
        tUrlImageView.setWhenNullClearImg(true);
        return this.b;
    }

    public final void j(TUrlImageView tUrlImageView, boolean z, String str) {
        float f;
        boolean z2 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9eabffdb", new Object[]{this, tUrlImageView, new Boolean(z), str});
            return;
        }
        if (!z || TextUtils.isEmpty(str)) {
            z2 = false;
        }
        if (z2) {
            tUrlImageView.setImageUrl(str);
        }
        ViewPropertyAnimator animate = tUrlImageView.animate();
        if (z2) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        animate.alpha(f).setDuration(250L).withEndAction(new b(z2, tUrlImageView)).start();
    }

    public void l(Object obj, boolean z) {
        DinamicDataObject dinamicDataObject;
        HashMap<String, JSONObject> hashMap;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8358cb4b", new Object[]{this, obj, new Boolean(z)});
            return;
        }
        TLog.loge(p, "BindData");
        JSONObject jSONObject = new JSONObject();
        if (obj instanceof FeedListResponse) {
            FeedListResponse feedListResponse = (FeedListResponse) obj;
            if (!(feedListResponse.getData() == null || (hashMap = (dinamicDataObject = (DinamicDataObject) feedListResponse.getData().headData).data) == null || hashMap.get("data") == null)) {
                jSONObject = dinamicDataObject.data.get("data");
            }
        }
        k(jSONObject, z);
    }

    public void m(z1b z1bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9ae09062", new Object[]{this, z1bVar});
        } else {
            this.o = z1bVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0066  */
    @Override // tb.nlc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onLiveEvent(java.lang.String r6, java.lang.Object r7) {
        /*
            r5 = this;
            r0 = 1
            r1 = 0
            com.android.alibaba.ip.runtime.IpChange r2 = tb.u1b.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0018
            java.lang.String r3 = "25d9ef1c"
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r1] = r5
            r4[r0] = r6
            r6 = 2
            r4[r6] = r7
            r2.ipc$dispatch(r3, r4)
            return
        L_0x0018:
            java.lang.String r2 = "com.taobao.live.home.top_marquee_background"
            boolean r6 = android.text.TextUtils.equals(r2, r6)
            if (r6 == 0) goto L_0x00db
            android.widget.FrameLayout r6 = r5.f
            if (r6 == 0) goto L_0x0031
            int r6 = r6.getVisibility()
            r2 = 8
            if (r6 != r2) goto L_0x0031
            boolean r6 = r5.i
            if (r6 == 0) goto L_0x0031
            return
        L_0x0031:
            boolean r6 = r7 instanceof com.alibaba.fastjson.JSONObject
            java.lang.String r2 = ""
            if (r6 == 0) goto L_0x005e
            com.alibaba.fastjson.JSONObject r7 = (com.alibaba.fastjson.JSONObject) r7
            java.lang.String r6 = "imageUrl"
            java.lang.String r3 = r7.getString(r6)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x004a
            java.lang.String r6 = r7.getString(r6)
            goto L_0x004b
        L_0x004a:
            r6 = r2
        L_0x004b:
            java.lang.String r3 = "isCache"
            java.lang.Object r4 = r7.get(r3)
            if (r4 == 0) goto L_0x005c
            java.lang.Boolean r7 = r7.getBoolean(r3)
            boolean r7 = r7.booleanValue()
            goto L_0x0060
        L_0x005c:
            r7 = 0
            goto L_0x0060
        L_0x005e:
            r6 = r2
            goto L_0x005c
        L_0x0060:
            boolean r3 = tb.lrq.a(r6)
            if (r3 == 0) goto L_0x0068
            java.lang.String r6 = r5.k
        L_0x0068:
            boolean r3 = tb.lrq.a(r6)
            if (r3 != 0) goto L_0x007f
            java.lang.String r3 = r5.l
            boolean r3 = tb.lrq.a(r3)
            if (r3 != 0) goto L_0x007f
            java.lang.String r3 = r5.l
            boolean r3 = r3.equals(r6)
            if (r3 == 0) goto L_0x007f
            return
        L_0x007f:
            r5.l = r6
            com.taobao.uikit.extend.feature.view.TUrlImageView r3 = r5.g
            if (r3 == 0) goto L_0x00db
            com.taobao.uikit.extend.feature.view.TUrlImageView r3 = r5.h
            if (r3 == 0) goto L_0x00db
            boolean r3 = tb.lrq.a(r6)
            if (r3 != 0) goto L_0x00ba
            tb.z1b r3 = r5.o
            if (r3 == 0) goto L_0x0096
            r3.c(r0)
        L_0x0096:
            boolean r3 = r5.m
            if (r3 == 0) goto L_0x00af
            com.taobao.uikit.extend.feature.view.TUrlImageView r3 = r5.g
            r5.j(r3, r0, r6)
            com.taobao.uikit.extend.feature.view.TUrlImageView r3 = r5.g
            tb.u1b$a r4 = new tb.u1b$a
            r4.<init>(r7)
            r3.succListener(r4)
            com.taobao.uikit.extend.feature.view.TUrlImageView r7 = r5.h
            r5.j(r7, r1, r2)
            goto L_0x00cb
        L_0x00af:
            com.taobao.uikit.extend.feature.view.TUrlImageView r7 = r5.h
            r5.j(r7, r0, r6)
            com.taobao.uikit.extend.feature.view.TUrlImageView r7 = r5.g
            r5.j(r7, r1, r2)
            goto L_0x00cb
        L_0x00ba:
            tb.z1b r7 = r5.o
            if (r7 == 0) goto L_0x00c1
            r7.c(r1)
        L_0x00c1:
            com.taobao.uikit.extend.feature.view.TUrlImageView r7 = r5.g
            r5.j(r7, r1, r2)
            com.taobao.uikit.extend.feature.view.TUrlImageView r7 = r5.h
            r5.j(r7, r1, r2)
        L_0x00cb:
            tb.z1b r7 = r5.o
            if (r7 == 0) goto L_0x00d6
            boolean r6 = tb.lrq.a(r6)
            r7.e(r6)
        L_0x00d6:
            boolean r6 = r5.m
            r6 = r6 ^ r0
            r5.m = r6
        L_0x00db:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u1b.onLiveEvent(java.lang.String, java.lang.Object):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void k(com.alibaba.fastjson.JSONObject r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.u1b.k(com.alibaba.fastjson.JSONObject, boolean):void");
    }
}
