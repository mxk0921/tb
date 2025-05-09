package tb;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tab2interact.core.component.browser.BrowserBadge;
import com.taobao.tab2interact.core.component.browser.data.BrowserBadgeModel;
import com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import tb.bmi;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class em2 extends v7<d> implements BrowserBadge.d {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final BrowserBadge f;
    public final ShortVideoTabMessageObserver g = new a();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a extends ShortVideoTabMessageObserver {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            int hashCode = str.hashCode();
            if (hashCode == -115635015) {
                super.K((ShortVideoTabMessageObserver.VideoState) objArr[0], (String) objArr[1]);
                return null;
            } else if (hashCode == 1066730172) {
                super.I((String) objArr[0], (ShortVideoTabMessageObserver.ContentType) objArr[1], (String) objArr[2]);
                return null;
            } else {
                int hashCode2 = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/tab2interact/tabadapter/shortvideo/component/browser/BrowserBadgeShortVideoTabAdapter$1");
            }
        }

        @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
        public void I(String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3f9502bc", new Object[]{this, str, contentType, str2});
                return;
            }
            super.I(str, contentType, str2);
            em2.M(em2.this, str, contentType, str2);
        }

        @Override // com.taobao.tab2interact.tabadapter.shortvideo.message.observer.ShortVideoTabMessageObserver
        public void K(ShortVideoTabMessageObserver.VideoState videoState, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f91b8cb9", new Object[]{this, videoState, str});
                return;
            }
            super.K(videoState, str);
            em2.N(em2.this, videoState, str);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements bmi.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f18671a;

        public b(String str) {
            this.f18671a = str;
        }

        @Override // tb.bmi.a
        public void onResult(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2bc05ded", new Object[]{this, jSONObject});
            } else {
                em2.O(em2.this, jSONObject, this.f18671a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType;

        static {
            int[] iArr = new int[ShortVideoTabMessageObserver.ContentType.values().length];
            $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType = iArr;
            try {
                iArr[ShortVideoTabMessageObserver.ContentType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[ShortVideoTabMessageObserver.ContentType.LIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[ShortVideoTabMessageObserver.ContentType.PICTURE_ALBUM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[ShortVideoTabMessageObserver.ContentType.GG_GAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[ShortVideoTabMessageObserver.ContentType.COLLECTION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[ShortVideoTabMessageObserver.ContentType.EXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class d {

        /* renamed from: a  reason: collision with root package name */
        public String f18672a;
        public ShortVideoTabMessageObserver.ContentType b;
        public boolean c = false;
        public long d;
        public boolean e;

        static {
            t2o.a(689963253);
        }
    }

    static {
        t2o.a(689963249);
        t2o.a(689963021);
    }

    public em2(jmi jmiVar, vv1 vv1Var, yps ypsVar, BrowserBadge browserBadge) {
        super(jmiVar, vv1Var, ypsVar);
        this.f = browserBadge;
        browserBadge.q1(this);
    }

    public static /* synthetic */ void M(em2 em2Var, String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5719709", new Object[]{em2Var, str, contentType, str2});
        } else {
            em2Var.V(str, contentType, str2);
        }
    }

    public static /* synthetic */ void N(em2 em2Var, ShortVideoTabMessageObserver.VideoState videoState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd844609", new Object[]{em2Var, videoState, str});
        } else {
            em2Var.W(videoState, str);
        }
    }

    public static /* synthetic */ void O(em2 em2Var, JSONObject jSONObject, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5788e123", new Object[]{em2Var, jSONObject, str});
        } else {
            em2Var.e0(jSONObject, str);
        }
    }

    public static /* synthetic */ Object ipc$super(em2 em2Var, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1544323859:
                super.A((String) objArr[0], (String) objArr[1]);
                return null;
            case -172691066:
                super.C((String) objArr[0], (String) objArr[1]);
                return null;
            case 79699924:
                super.B((String) objArr[0]);
                return null;
            case 1335953106:
                super.D((String) objArr[0], (String) objArr[1]);
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tab2interact/tabadapter/shortvideo/component/browser/BrowserBadgeShortVideoTabAdapter");
        }
    }

    @Override // tb.w7, tb.wx1
    public void A(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3f37ced", new Object[]{this, str, str2});
            return;
        }
        super.A(str, str2);
        if (L(str) && this.f.F0(str)) {
            f0(str);
            g0(str);
        }
    }

    @Override // tb.w7, tb.wx1
    public void B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c01fd4", new Object[]{this, str});
            return;
        }
        super.B(str);
        if (L(str) && this.f.F0(str)) {
            h0(str);
        }
    }

    @Override // tb.wx1
    public void C(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5b4f186", new Object[]{this, str, str2});
            return;
        }
        super.C(str, str2);
        if (L(str) && this.f.F0(str)) {
            i0();
        }
    }

    @Override // tb.wx1
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4fa106d2", new Object[]{this, str, str2});
            return;
        }
        super.D(str, str2);
        if (L(str) && this.f.F0(str)) {
            i0();
        }
    }

    public final boolean P(long j) {
        BrowserBadgeModel.BrowserTaskModel browserTaskModel;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2de72c3d", new Object[]{this, new Long(j)})).booleanValue();
        }
        BrowserBadgeModel T = T();
        if (T == null || (browserTaskModel = T.e) == null || browserTaskModel.c > j) {
            return false;
        }
        return true;
    }

    /* renamed from: R */
    public d F() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d) ipChange.ipc$dispatch("9321ff87", new Object[]{this});
        }
        return new d();
    }

    public final long S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("2499e09a", new Object[]{this})).longValue();
        }
        return this.f.N0();
    }

    public final BrowserBadgeModel T() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BrowserBadgeModel) ipChange.ipc$dispatch("b1bf6e47", new Object[]{this});
        }
        return this.f.O0();
    }

    public final String U() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26f9ba8e", new Object[]{this});
        }
        return this.f.S0();
    }

    public final boolean X() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("868b0075", new Object[]{this})).booleanValue();
        }
        return this.f.W0();
    }

    public final boolean Y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("137c623b", new Object[]{this, str})).booleanValue();
        }
        String c2 = G().c();
        if (c2 == null || !TextUtils.equals(str, c2)) {
            return false;
        }
        return true;
    }

    public final boolean Z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("66f088f1", new Object[]{this})).booleanValue();
        }
        return this.f.X0();
    }

    public void b0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8e853025", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度获取的时机");
        d H = H();
        if (H != null && H.c && !H.e) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度获取的时机，开启浏览任务计时器");
            this.f.u1();
        }
    }

    public void c0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1816b3ca", new Object[]{this});
        } else {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "组件开启的时机");
        }
    }

    public void d0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90797f16", new Object[]{this});
            return;
        }
        vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "组件暂停的时机");
        this.f.b1(BrowserBadge.PAUSE_ANIMATE_SCENE_COMPONENT_STOPPED);
    }

    public final void f0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("383f7429", new Object[]{this, str});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(csp.CARD_DATA_CHANGE_NAME);
        arrayList.add(csp.VIDEO_STATE_CHANGE_NAME);
        dsp.INSTANCE.a(I(), G(), str, arrayList, this.g, J());
    }

    public final void g0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e5097cea", new Object[]{this, str});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", (Object) csp.GET_CARD_DATA_NAME);
        dsp.INSTANCE.d(G(), jSONObject, str, new b(str), J());
    }

    public final void h0(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6089842", new Object[]{this, str});
        } else {
            dsp.INSTANCE.g(I(), G(), str, this.g, J());
        }
    }

    public final void i0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b53c4a1e", new Object[]{this});
            return;
        }
        HashMap hashMap = new HashMap();
        String c2 = G().c();
        if (TextUtils.equals(c2, "video")) {
            hashMap.put("x_tab_source", "recommend");
        } else if (TextUtils.equals(c2, "newFollow")) {
            hashMap.put("x_tab_source", "follow");
        }
        d H = H();
        if (H != null) {
            hashMap.put("x_content_id", H.f18672a);
        }
        this.f.t1(hashMap);
    }

    public void a0(long j, long j2, long j3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4454fdc4", new Object[]{this, new Long(j), new Long(j2), new Long(j3)});
            return;
        }
        d H = H();
        if (H != null && !H.e && Q(j3)) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "浏览任务进度发生改变的时机，检查已达到最大浏览时长");
            H.e = true;
            this.f.b1(BrowserBadge.PAUSE_ANIMATE_SCENE_MAX_TIMING_DURATION_REACHED);
        }
        long S = j - S();
        if (j2 <= j || P(S)) {
            this.f.f1(j, j2, S);
        } else if (!X() && S >= 50) {
            if (!j0r.a() || !TextUtils.equals(U(), BrowserBadge.PAUSE_ANIMATE_SCENE_VIDEO_PAUSED)) {
                this.f.f1(j, j2, S);
            } else {
                this.f.L0(j, j2, S, j0r.g());
            }
        }
    }

    public final boolean Q(long j) {
        BrowserBadgeModel.BrowserTaskModel browserTaskModel;
        ShortVideoTabMessageObserver.ContentType contentType;
        BrowserBadgeModel.BrowserTaskModel.ContentType contentType2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a2aa597f", new Object[]{this, new Long(j)})).booleanValue();
        }
        BrowserBadgeModel T = T();
        if (T == null || (browserTaskModel = T.e) == null) {
            return true;
        }
        Map<BrowserBadgeModel.BrowserTaskModel.ContentType, BrowserBadgeModel.BrowserTaskModel.a> map = browserTaskModel.d;
        if (map == null) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，timingRuleModelMap为空");
            return true;
        }
        d H = H();
        if (H == null || (contentType = H.b) == null) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，tabInfo不满足条件");
            return true;
        }
        switch (c.$SwitchMap$com$taobao$tab2interact$tabadapter$shortvideo$message$observer$ShortVideoTabMessageObserver$ContentType[contentType.ordinal()]) {
            case 1:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.VIDEO;
                break;
            case 2:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.LIVE;
                break;
            case 3:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.PICTURE_ALBUM;
                break;
            case 4:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.GG_GAME;
                break;
            case 5:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.COLLECTION;
                break;
            case 6:
                contentType2 = BrowserBadgeModel.BrowserTaskModel.ContentType.EXT;
                break;
            default:
                contentType2 = null;
                break;
        }
        BrowserBadgeModel.BrowserTaskModel.a aVar = (BrowserBadgeModel.BrowserTaskModel.a) ((HashMap) map).get(contentType2);
        if (aVar == null) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "检查是否达到最大浏览时长，timingRuleModel为空");
            return true;
        }
        long j2 = H.d + j;
        H.d = j2;
        long j3 = aVar.f11807a;
        return j3 >= 0 && j3 <= j2;
    }

    public final void V(String str, ShortVideoTabMessageObserver.ContentType contentType, String str2) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4bac5b15", new Object[]{this, str, contentType, str2});
            return;
        }
        d K = K(str2);
        if (K == null) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "处理当前Active卡片的数据，tabInfo为空");
            return;
        }
        K.f18672a = str;
        K.b = contentType;
        if (contentType == ShortVideoTabMessageObserver.ContentType.VIDEO) {
            z = false;
        }
        K.c = z;
        K.e = false;
        K.d = 0L;
        if (Y(str2)) {
            if (K.c) {
                this.f.u1();
            }
            i0();
            if (Z()) {
                this.f.g1("ACTIVE_CARD_CHANGE_FAIL_RETRY");
            }
        }
    }

    public final void W(ShortVideoTabMessageObserver.VideoState videoState, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57b638b8", new Object[]{this, videoState, str});
            return;
        }
        d K = K(str);
        if (K == null) {
            vgh.c(this, "BrowserBadgeShortVideoTabAdapter", "处理卡片的视频状态，tabInfo为空");
        } else if (videoState == ShortVideoTabMessageObserver.VideoState.START || videoState == ShortVideoTabMessageObserver.VideoState.PROGRESS_UPDATE) {
            K.c = true;
            if (Y(str) && !K.e) {
                this.f.u1();
            }
        } else if (videoState == ShortVideoTabMessageObserver.VideoState.PAUSE) {
            K.c = false;
            if (Y(str)) {
                this.f.b1(BrowserBadge.PAUSE_ANIMATE_SCENE_VIDEO_PAUSED);
            }
        } else if (videoState == ShortVideoTabMessageObserver.VideoState.PROGRESS_FINISH) {
            K.e = true;
            if (Y(str)) {
                this.f.b1(BrowserBadge.PAUSE_ANIMATE_SCENE_VIDEO_FINISHED);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r9.equals("EXT") == false) goto L_0x0068;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e0(com.alibaba.fastjson.JSONObject r9, java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.em2.e0(com.alibaba.fastjson.JSONObject, java.lang.String):void");
    }
}
