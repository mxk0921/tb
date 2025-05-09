package com.taobao.android.tab2liveroom.liveroom.topAvatar;

import android.content.Context;
import android.graphics.Outline;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.ta.utdid2.android.utils.StringUtils;
import com.taobao.android.nav.Nav;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarAdapter;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarResult;
import com.taobao.android.tab2liveroom.liveroom.topAvatar.a;
import com.taobao.homepage.pop.utils.PopConst;
import com.taobao.schedule.ViewProxy;
import com.taobao.tao.flexbox.layoutmanager.ac.d;
import com.taobao.tao.flexbox.layoutmanager.module.TrackerModule;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.remotebusiness.RemoteBusiness;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.TaoliveOpenLiveRoom;
import com.taobao.taolive.room.openarchitecture.listener.WatchPlatformListenerEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MethodEnum;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import tb.akt;
import tb.alc;
import tb.cba;
import tb.g3l;
import tb.nwv;
import tb.s6o;
import tb.sj4;
import tb.sz3;
import tb.t2o;
import tb.tfs;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class LiveAvatarController implements a.b {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String MORE_LIVE = "更多直播";
    public static final String MORE_LIVE_URL = "https://gw.alicdn.com/imgextra/i2/O1CN010SzHJ81xQCSa7ICW5_!!6000000006437-2-tps-180-180.png";
    public static final String TAG = "LiveAvatorController";

    /* renamed from: a  reason: collision with root package name */
    public final Context f9521a;
    public final View b;
    public long c;
    public long d;
    public final float f;
    public final RecyclerView h;
    public View i;
    public TaoliveOpenLiveRoom j;
    public ArrayList<LiveAvatarResult.LiveAccount> k;
    public final com.taobao.android.tab2liveroom.liveroom.topAvatar.a l;
    public final alc m;
    public Map n;
    public String q;
    public LiveAvatarResult r;
    public LiveAvatarAdapter s;
    public String t;
    public boolean e = false;
    public boolean g = true;
    public boolean o = false;
    public boolean p = false;
    public boolean u = true;
    public final Handler v = new a(Looper.getMainLooper());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class a extends Handler {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(Looper looper) {
            super(looper);
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarController$1");
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
            } else if (!LiveAvatarController.j(LiveAvatarController.this)) {
                tfs.e(LiveAvatarController.TAG, "倒计时结束 关闭导航");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isAuto", (Object) Boolean.TRUE);
                LiveAvatarController.T(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
                LiveAvatarController.l(LiveAvatarController.this);
                if (LiveAvatarController.q(LiveAvatarController.this) != null) {
                    LiveAvatarController.q(LiveAvatarController.this).e();
                }
                LiveAvatarController.k(LiveAvatarController.this, true);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class b implements LiveAvatarAdapter.LiveAvatarViewHolder.OnItemClickListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarAdapter.LiveAvatarViewHolder.OnItemClickListener
        public void onItemClick(int i) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a487206", new Object[]{this, new Integer(i)});
                return;
            }
            String str = "1";
            if (i < LiveAvatarController.r(LiveAvatarController.this).size() && i >= 0 && ((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).status != null && ((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).status.redirectUrl != null) {
                String str2 = ((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).status.redirectUrl;
                if (!TextUtils.isEmpty(str2)) {
                    Object callWatchPlatform = LiveAvatarController.t(LiveAvatarController.this).callWatchPlatform(WatchPlatformListenerEnum.getGlobalContext, new Object[0]);
                    if (callWatchPlatform instanceof cba) {
                        z = ((cba) callWatchPlatform).e0();
                    }
                    tfs.e(LiveAvatarController.TAG, "执行二跳页跳转" + z);
                    str2 = str2 + "&isLiveMute=" + z;
                }
                Nav.from(LiveAvatarController.u(LiveAvatarController.this)).withExtras(null).toUri(str2);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("index", (Object) Integer.valueOf(i));
                if (TextUtils.isEmpty(((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).topParams)) {
                    str = "0";
                }
                jSONObject.put("is_reddot", (Object) str);
                if (((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).accountLiveTag != null) {
                    jSONObject.put("pushReason", (Object) ((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).accountLiveTag.pushReason);
                }
                LiveAvatarController.T(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Click", jSONObject);
                tfs.e(LiveAvatarController.TAG, "执行二跳页跳转" + str2);
            } else if (i > 0 && i < LiveAvatarController.r(LiveAvatarController.this).size() && StringUtils.equals(((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).specialType, LiveAvatarController.MORE_LIVE)) {
                LiveAvatarController.s(LiveAvatarController.this).sendLiveRoomMessage("onMoreLiveClick", null);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("index", (Object) Integer.valueOf(i));
                if (TextUtils.isEmpty(((LiveAvatarResult.LiveAccount) LiveAvatarController.r(LiveAvatarController.this).get(i)).topParams)) {
                    str = "0";
                }
                jSONObject2.put("is_reddot", (Object) str);
                LiveAvatarController.T(2101, "Page_TaobaoLiveWatch_Button-Tab2MoreLive", jSONObject2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class c implements View.OnTouchListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d4aa3aa4", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getAction() == 0 && LiveAvatarController.q(LiveAvatarController.this) != null && LiveAvatarController.q(LiveAvatarController.this).i()) {
                LiveAvatarController.v(LiveAvatarController.this).removeCallbacksAndMessages(null);
                LiveAvatarController.l(LiveAvatarController.this);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("isAuto", (Object) Boolean.FALSE);
                LiveAvatarController.T(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class d extends ViewOutlineProvider {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        public static /* synthetic */ Object ipc$super(d dVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarController$7");
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7054f590", new Object[]{this, view, outline});
            } else {
                outline.setRoundRect(view.getLeft(), view.getTop(), view.getWidth(), view.getHeight(), s6o.c(LiveAvatarController.u(LiveAvatarController.this), 12));
            }
        }
    }

    static {
        t2o.a(779092174);
        t2o.a(779092189);
    }

    public LiveAvatarController(a.c cVar) {
        Context context = cVar.f9530a;
        this.f9521a = context;
        this.f = cVar.f;
        this.i = cVar.c;
        this.j = cVar.d;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tab2_liveroom_fluid_sdk_live_avatar, (ViewGroup) null);
        this.b = inflate;
        this.h = (RecyclerView) inflate.findViewById(R.id.avatar_recycler_view);
        this.n = cVar.j;
        S("init");
        this.l = cVar.k;
        this.m = cVar.e;
    }

    public static /* synthetic */ boolean j(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f33546fc", new Object[]{liveAvatarController})).booleanValue();
        }
        return liveAvatarController.o;
    }

    public static /* synthetic */ boolean k(LiveAvatarController liveAvatarController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("81c60f62", new Object[]{liveAvatarController, new Boolean(z)})).booleanValue();
        }
        liveAvatarController.o = z;
        return z;
    }

    public static /* synthetic */ void l(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d128acd7", new Object[]{liveAvatarController});
        } else {
            liveAvatarController.D();
        }
    }

    public static /* synthetic */ String m(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("924a4517", new Object[]{liveAvatarController});
        }
        return liveAvatarController.q;
    }

    public static /* synthetic */ void n(LiveAvatarController liveAvatarController, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82a1ad9c", new Object[]{liveAvatarController, str, str2});
        } else {
            liveAvatarController.G(str, str2);
        }
    }

    public static /* synthetic */ long o(LiveAvatarController liveAvatarController, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9d5b05b3", new Object[]{liveAvatarController, new Long(j)})).longValue();
        }
        liveAvatarController.d = j;
        return j;
    }

    public static /* synthetic */ void p(LiveAvatarController liveAvatarController, LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbd5cd68", new Object[]{liveAvatarController, liveAvatarResult});
        } else {
            liveAvatarController.L(liveAvatarResult);
        }
    }

    public static /* synthetic */ com.taobao.android.tab2liveroom.liveroom.topAvatar.a q(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.tab2liveroom.liveroom.topAvatar.a) ipChange.ipc$dispatch("94b142c4", new Object[]{liveAvatarController});
        }
        return liveAvatarController.l;
    }

    public static /* synthetic */ ArrayList r(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("65953fef", new Object[]{liveAvatarController});
        }
        return liveAvatarController.k;
    }

    public static /* synthetic */ alc s(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (alc) ipChange.ipc$dispatch("639326d", new Object[]{liveAvatarController});
        }
        return liveAvatarController.m;
    }

    public static /* synthetic */ TaoliveOpenLiveRoom t(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoliveOpenLiveRoom) ipChange.ipc$dispatch("6a1d02df", new Object[]{liveAvatarController});
        }
        return liveAvatarController.j;
    }

    public static /* synthetic */ Context u(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("87132a", new Object[]{liveAvatarController});
        }
        return liveAvatarController.f9521a;
    }

    public static /* synthetic */ Handler v(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("ffbdb15", new Object[]{liveAvatarController});
        }
        return liveAvatarController.v;
    }

    public static /* synthetic */ LiveAvatarResult w(LiveAvatarController liveAvatarController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarResult) ipChange.ipc$dispatch("1219050e", new Object[]{liveAvatarController});
        }
        return liveAvatarController.r;
    }

    public static /* synthetic */ LiveAvatarResult x(LiveAvatarController liveAvatarController, LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LiveAvatarResult) ipChange.ipc$dispatch("1510f49e", new Object[]{liveAvatarController, liveAvatarResult});
        }
        liveAvatarController.r = liveAvatarResult;
        return liveAvatarResult;
    }

    public static /* synthetic */ boolean y(LiveAvatarController liveAvatarController, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("660a156b", new Object[]{liveAvatarController, new Boolean(z)})).booleanValue();
        }
        liveAvatarController.u = z;
        return z;
    }

    public final String A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("c27f9b30", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        if (!sz3.b(this.n)) {
            String I = nwv.I(this.n.get("id"), "");
            String I2 = nwv.I(this.n.get("userId"), "");
            if (!TextUtils.isEmpty(I)) {
                jSONObject.put("topLiveId", (Object) I);
            } else if (!TextUtils.isEmpty(I2)) {
                jSONObject.put("topAccountId", (Object) I2);
            }
            jSONObject.put("topParams", (Object) JSON.toJSONString(this.n));
        }
        return JSON.toJSONString(jSONObject);
    }

    public final void B() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f766c73a", new Object[]{this});
        } else if (akt.a1() && this.l != null && sz3.a(this.r.result)) {
            this.l.n();
            this.p = true;
        }
    }

    public void C(final boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6b3e51b4", new Object[]{this, new Boolean(z)});
        } else if (this.i != null) {
            if (this.u || !g3l.c()) {
                this.i.post(new Runnable() { // from class: tb.cwg
                    @Override // java.lang.Runnable
                    public final void run() {
                        LiveAvatarController.this.I(z);
                    }
                });
            }
        }
    }

    public final void D() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c530793d", new Object[]{this});
        } else if (this.l != null) {
            C(false);
        }
    }

    public final void E(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c94f9478", new Object[]{this, str});
            return;
        }
        LiveAvatarAdapter liveAvatarAdapter = this.s;
        if (liveAvatarAdapter != null && !sz3.a(liveAvatarAdapter.P())) {
            int size = this.s.P().size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                } else if (TextUtils.equals(str, this.s.P().get(size).accountId)) {
                    tfs.e(TAG, "filterRepeatIds1 = " + str + ",index= " + size);
                    this.s.O(size);
                    break;
                } else {
                    size--;
                }
            }
            B();
        }
    }

    public final void F(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7dc00709", new Object[]{this, str});
            return;
        }
        LiveAvatarResult liveAvatarResult = this.r;
        if (!(liveAvatarResult == null || sz3.a(liveAvatarResult.result))) {
            for (int size = this.r.result.size() - 1; size >= 0; size--) {
                if (TextUtils.equals(str, this.r.result.get(size).accountId)) {
                    tfs.e(TAG, "filterRepeatIds2 = " + str + ",index= " + size);
                    this.r.result.remove(size);
                }
            }
            B();
        }
    }

    public final /* synthetic */ void J(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5ae602b8", new Object[]{this, new Boolean(z)});
        } else if (z) {
            this.i.setOutlineProvider(new d());
            this.i.setClipToOutline(true);
        } else {
            this.i.setOutlineProvider(null);
            this.i.setClipToOutline(false);
        }
    }

    public void K(boolean z) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("498a4c14", new Object[]{this, new Boolean(z)});
            return;
        }
        this.c = System.currentTimeMillis();
        this.v.removeCallbacksAndMessages(null);
        long j = this.d;
        if (j > 0) {
            this.v.sendEmptyMessageDelayed(0, j);
        }
        if (this.i != null && (aVar = this.l) != null && aVar.i() && this.h != null && this.s != null) {
            U(z);
        }
    }

    public final void M(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("37f7b9a9", new Object[]{this, liveAvatarResult});
        } else if (this.s != null) {
            this.k.clear();
            this.k.addAll(liveAvatarResult.result);
            z(liveAvatarResult);
            this.s.notifyDataSetChanged();
        }
    }

    public void N(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c7eceb6", new Object[]{this, new Boolean(z)});
        } else {
            this.o = z;
        }
    }

    public void O(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7a798d1b", new Object[]{this, new Boolean(z)});
        } else if (this.i != null) {
            final boolean i = this.l.i();
            this.i.post(new Runnable() { // from class: tb.bwg
                @Override // java.lang.Runnable
                public final void run() {
                    LiveAvatarController.this.J(i);
                }
            });
        }
    }

    public void P(View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a64994df", new Object[]{this, view, taoliveOpenLiveRoom});
            return;
        }
        this.i = view;
        this.j = taoliveOpenLiveRoom;
    }

    public void Q(String str, Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f8430b5", new Object[]{this, str, obj});
        } else if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            if (str.equals("query") && (obj instanceof Map)) {
                this.n = (Map) obj;
            }
        }
    }

    public final void R(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c6d8c6", new Object[]{this, liveAvatarResult});
        } else if (liveAvatarResult.result != null) {
            ArrayList<LiveAvatarResult.LiveAccount> arrayList = new ArrayList<>();
            this.k = arrayList;
            arrayList.addAll(liveAvatarResult.result);
            z(liveAvatarResult);
            this.h.setLayoutManager(new LinearLayoutManager(this, this.f9521a, 0, false) { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController.2
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass2 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1545422228) {
                        return new Integer(super.getExtraLayoutSpace((RecyclerView.State) objArr[0]));
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarController$2");
                }

                @Override // androidx.recyclerview.widget.LinearLayoutManager
                public int getExtraLayoutSpace(RecyclerView.State state) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        return ((Number) ipChange2.ipc$dispatch("5c1d4594", new Object[]{this, state})).intValue();
                    }
                    return super.getExtraLayoutSpace(state) + 1;
                }
            });
            this.h.addItemDecoration(new LiveAvatarItemDecoration(s6o.c(this.f9521a, 7)));
            LiveAvatarAdapter liveAvatarAdapter = new LiveAvatarAdapter(this.k);
            this.s = liveAvatarAdapter;
            liveAvatarAdapter.Q(new b());
            this.h.setAdapter(this.s);
            new FrameLayout.LayoutParams(-1, -1).topMargin = (int) this.f;
            ViewProxy.setOnTouchListener(this.b, new c());
            this.h.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController.5
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(AnonymousClass5 r2, String str, Object... objArr) {
                    if (str.hashCode() == 1361287682) {
                        super.onScrollStateChanged((RecyclerView) objArr[0], ((Number) objArr[1]).intValue());
                        return null;
                    }
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/tab2liveroom/liveroom/topAvatar/LiveAvatarController$5");
                }

                @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
                public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("51239a02", new Object[]{this, recyclerView, new Integer(i)});
                        return;
                    }
                    super.onScrollStateChanged(recyclerView, i);
                    if ((i == 1 || i == 2) && LiveAvatarController.v(LiveAvatarController.this) != null) {
                        LiveAvatarController.v(LiveAvatarController.this).removeCallbacksAndMessages(null);
                    }
                }
            });
        }
    }

    public void V(View view, TaoliveOpenLiveRoom taoliveOpenLiveRoom) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7db98e6d", new Object[]{this, view, taoliveOpenLiveRoom});
        } else {
            P(view, taoliveOpenLiveRoom);
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("501e0c84", new Object[]{this, str});
            return;
        }
        this.q = str;
        G(str, "receiveDetail");
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void b(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57d3deda", new Object[]{this, new Boolean(z)});
        } else {
            this.g = z;
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83abc3db", new Object[]{this});
            return;
        }
        this.v.removeCallbacksAndMessages(null);
        long j = this.d;
        if (j > 0) {
            this.v.sendEmptyMessageDelayed(0, j);
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e72e62b", new Object[]{this});
            return;
        }
        this.v.removeCallbacksAndMessages(null);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.c <= this.d) {
            this.c = currentTimeMillis;
            tfs.e(TAG, "切tab重新计时mStartTime = " + this.c);
        }
    }

    public static void T(int i, String str, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("765a6a8c", new Object[]{new Integer(i), str, jSONObject});
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("pageName", (Object) "Page_TaobaoLiveWatch");
        jSONObject2.put(PopConst.POP_EVENT_ID_KEY, (Object) Integer.valueOf(i));
        jSONObject2.put("arg1", (Object) str);
        jSONObject.put("spm", "a2141.8001249");
        jSONObject.put("entryLivesource", "tb_tab2.guangguang_newlivetab.topbar");
        jSONObject2.put("args", (Object) jSONObject);
        TrackerModule.commit(new d.j(null, jSONObject2, null), false);
    }

    public final void L(LiveAvatarResult liveAvatarResult) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("275b4f58", new Object[]{this, liveAvatarResult});
            return;
        }
        tfs.e(TAG, "接口返回打开开播导航逻辑");
        if (!akt.d1()) {
            return;
        }
        if (this.k == null) {
            tfs.e(TAG, "首次接口返回打开开播导航逻辑");
            R(liveAvatarResult);
            if (this.l != null) {
                ((ViewGroup) this.b).removeView(this.h);
                this.l.o(this.h, this.g);
                if (!this.g) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("reason", (Object) "timeout");
                    T(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
                }
            }
        } else if (this.h != null) {
            tfs.e(TAG, "刷新接口返回打开开播导航逻辑");
            if (this.p && (aVar = this.l) != null) {
                aVar.o(this.h, false);
                this.p = false;
            }
            M(liveAvatarResult);
        }
    }

    public final void U(boolean z) {
        LiveAvatarAdapter liveAvatarAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bd480a54", new Object[]{this, new Boolean(z)});
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (this.h == null || (liveAvatarAdapter = this.s) == null) {
            jSONObject.put("onLiveNum", (Object) 0);
            jSONObject.put("isEmpty", (Object) "0");
        } else {
            jSONObject.put("onLiveNum", (Object) Integer.valueOf(liveAvatarAdapter.getItemCount()));
            jSONObject.put("isEmpty", (Object) "1");
        }
        jSONObject.put("isAuto", (Object) Integer.valueOf(z ? 1 : 0));
        jSONObject.put("time", (Object) Long.valueOf(System.currentTimeMillis()));
        tfs.e(TAG, "trackLiveTabTopBarShow = " + jSONObject.toJSONString());
        T(2201, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show", jSONObject);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void c(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3758b0b", new Object[]{this, new Boolean(z)});
            return;
        }
        if (!z) {
            N(true);
        }
        tfs.e(TAG, "onFirstStageVisible: " + z);
        if (!this.e) {
            S("appear");
        }
        K(z);
        C(true);
        O(true);
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d2f290e", new Object[]{this});
            return;
        }
        tfs.e(TAG, "onFirstStageDidAppear");
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar = this.l;
        if (aVar != null && aVar.i()) {
            O(true);
            C(true);
        }
    }

    @Override // com.taobao.android.tab2liveroom.liveroom.topAvatar.a.b
    public void f(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9c1f5c17", new Object[]{this, new Boolean(z)});
            return;
        }
        C(false);
        O(false);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isAuto", (Object) Boolean.valueOf(z));
        T(2101, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Collapse", jSONObject);
    }

    public final void z(LiveAvatarResult liveAvatarResult) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ac814c23", new Object[]{this, liveAvatarResult});
        } else if (StringUtils.equals(liveAvatarResult.version, "0823")) {
            LiveAvatarAdapter liveAvatarAdapter = this.s;
            if (liveAvatarAdapter != null) {
                liveAvatarAdapter.S(true);
            }
            alc alcVar = this.m;
            if (alcVar != null && alcVar.getOpenConfig() != null && this.m.getOpenConfig().b()) {
                LiveAvatarResult.LiveAccount liveAccount = new LiveAvatarResult.LiveAccount();
                liveAccount.accountNick = MORE_LIVE;
                liveAccount.avatarUrl = MORE_LIVE_URL;
                liveAccount.specialType = MORE_LIVE;
                liveAccount.status = new LiveAvatarResult.Status();
                this.k.add(liveAccount);
            }
        }
    }

    public static boolean H(String str, String str2, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("340e9124", new Object[]{str, str2, new Boolean(z)})).booleanValue();
        }
        JSONObject jSONObject = new JSONObject();
        if (!akt.e1()) {
            jSONObject.put("reason", (Object) "other");
            T(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
            return false;
        }
        try {
            String queryParameter = Uri.parse(str).getQueryParameter("hideLiveTopbar");
            tfs.e(TAG, "isOpenLiveAvatar source:" + str2 + " hideLiveTopbar:" + queryParameter + " isLastTab:" + z);
            if (!TextUtils.equals(str2, sj4.TAB2_SOURCE_OUTSIDE)) {
                return !nwv.o(queryParameter, false);
            }
            jSONObject.put("reason", (Object) "waitou");
            T(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject);
            return false;
        } catch (Exception e) {
            tfs.e(TAG, "isOpenLiveAvatar error:" + e.getMessage());
            return false;
        }
    }

    public final /* synthetic */ void I(boolean z) {
        com.taobao.android.tab2liveroom.liveroom.topAvatar.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5905f86", new Object[]{this, new Boolean(z)});
        } else if (this.j != null && (aVar = this.l) != null) {
            if (!z || aVar.i()) {
                HashMap hashMap = new HashMap();
                hashMap.put("isClear", Boolean.valueOf(z));
                if (this.j != null) {
                    tfs.e(TAG, "调用了直播清屏能力" + z);
                    this.j.callWatchPlatform(WatchPlatformListenerEnum.clearScreen, hashMap);
                }
            }
        }
    }

    public final void S(final String str) {
        Map map;
        Map map2;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f73099b9", new Object[]{this, str});
        } else if (!akt.l() || !TextUtils.equals(str, "appear") || !TextUtils.equals(this.t, "init")) {
            this.t = str;
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.cogman.container.center.nologin");
            mtopRequest.setVersion("1.0");
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("entityId", (Object) "104853");
            if (akt.l() && (map2 = this.n) != null && nwv.o(map2.get("live_tab_top_item_switch"), false)) {
                jSONObject.put("params", (Object) A());
                z = true;
            }
            mtopRequest.setData(JSON.toJSONString(jSONObject));
            this.e = true;
            MtopBusiness registerListener = RemoteBusiness.build(mtopRequest).registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController.6
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LiveAvatarController.this.e = false;
                    tfs.e(LiveAvatarController.TAG, "onError" + mtopResponse.getRetCode());
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                        return;
                    }
                    try {
                        LiveAvatarController.this.e = false;
                        LiveAvatarController.x(LiveAvatarController.this, (LiveAvatarResult) JSON.toJavaObject((JSONObject) mtopResponse.getOriginFastJsonObject().get("data"), LiveAvatarResult.class));
                        int i2 = LiveAvatarController.w(LiveAvatarController.this).showSeconds * 1000;
                        LiveAvatarController liveAvatarController = LiveAvatarController.this;
                        LiveAvatarController.y(liveAvatarController, LiveAvatarController.w(liveAvatarController).clear);
                        if (LiveAvatarController.w(LiveAvatarController.this).result != null) {
                            tfs.e(LiveAvatarController.TAG, "delayTime = " + i2 + "dataList = " + LiveAvatarController.w(LiveAvatarController.this).result.size());
                        }
                        LiveAvatarController liveAvatarController2 = LiveAvatarController.this;
                        LiveAvatarController.n(liveAvatarController2, LiveAvatarController.m(liveAvatarController2), str);
                        LiveAvatarController.o(LiveAvatarController.this, i2);
                        if (!LiveAvatarController.w(LiveAvatarController.this).enable) {
                            LiveAvatarController.q(LiveAvatarController.this).m(false);
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put("reason", (Object) "other");
                            LiveAvatarController.T(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject2);
                        } else if (LiveAvatarController.w(LiveAvatarController.this).result != null && LiveAvatarController.w(LiveAvatarController.this).result.size() > 0) {
                            LiveAvatarController liveAvatarController3 = LiveAvatarController.this;
                            LiveAvatarController.p(liveAvatarController3, LiveAvatarController.w(liveAvatarController3));
                        } else if (LiveAvatarController.w(LiveAvatarController.this).result == null || LiveAvatarController.w(LiveAvatarController.this).result.size() == 0) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("reason", (Object) "nodata");
                            LiveAvatarController.T(19997, "Page_TaobaoLiveWatch_Tab2_LiveTab_TopBar_Show_Failed", jSONObject3);
                        }
                    } catch (Exception e) {
                        tfs.e(LiveAvatarController.TAG, "e = " + e);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                        return;
                    }
                    LiveAvatarController.this.e = false;
                    tfs.e(LiveAvatarController.TAG, "onSystemError");
                }
            });
            registerListener.supportStreamJson(true);
            registerListener.reqMethod(MethodEnum.POST);
            registerListener.startRequest();
            if (z && (map = this.n) != null) {
                map.put("live_tab_top_item_switch", Boolean.FALSE);
            }
        } else {
            this.t = str;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r8.equals("receiveDetail") == false) goto L_0x003d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void G(java.lang.String r7, java.lang.String r8) {
        /*
            r6 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            com.android.alibaba.ip.runtime.IpChange r3 = com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController.$ipChange
            boolean r4 = r3 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r4 == 0) goto L_0x0018
            java.lang.String r4 = "a12b6d01"
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r6
            r5[r1] = r7
            r5[r0] = r8
            r3.ipc$dispatch(r4, r5)
            return
        L_0x0018:
            boolean r3 = android.text.TextUtils.isEmpty(r7)
            if (r3 == 0) goto L_0x0032
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "filterRepeatIds0 = "
            r8.<init>(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "LiveAvatorController"
            tb.tfs.e(r8, r7)
            return
        L_0x0032:
            r8.hashCode()
            r3 = -1
            int r4 = r8.hashCode()
            switch(r4) {
                case -1411068523: goto L_0x0055;
                case 3237136: goto L_0x0049;
                case 1062895892: goto L_0x003f;
                default: goto L_0x003d;
            }
        L_0x003d:
            r0 = -1
            goto L_0x005f
        L_0x003f:
            java.lang.String r1 = "receiveDetail"
            boolean r8 = r8.equals(r1)
            if (r8 != 0) goto L_0x005f
            goto L_0x003d
        L_0x0049:
            java.lang.String r0 = "init"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x0053
            goto L_0x003d
        L_0x0053:
            r0 = 1
            goto L_0x005f
        L_0x0055:
            java.lang.String r0 = "appear"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L_0x005e
            goto L_0x003d
        L_0x005e:
            r0 = 0
        L_0x005f:
            switch(r0) {
                case 0: goto L_0x007d;
                case 1: goto L_0x007d;
                case 2: goto L_0x0063;
                default: goto L_0x0062;
            }
        L_0x0062:
            goto L_0x0080
        L_0x0063:
            com.taobao.android.tab2liveroom.liveroom.topAvatar.a r8 = r6.l
            boolean r8 = r8.i()
            if (r8 == 0) goto L_0x0080
            com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarAdapter r8 = r6.s
            if (r8 == 0) goto L_0x0080
            java.util.List r8 = r8.P()
            boolean r8 = tb.sz3.a(r8)
            if (r8 != 0) goto L_0x0080
            r6.E(r7)
            goto L_0x0080
        L_0x007d:
            r6.F(r7)
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.android.tab2liveroom.liveroom.topAvatar.LiveAvatarController.G(java.lang.String, java.lang.String):void");
    }
}
