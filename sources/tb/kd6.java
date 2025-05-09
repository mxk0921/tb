package tb;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.login4android.api.Coordinator;
import com.taobao.taobao.R;
import com.taobao.taolive.movehighlight.dx.widget.structLayout.StructListAdapter;
import com.taobao.taolive.room.service.IPlayPublicService;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.LiveItem;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class kd6 implements n0e, PlayerController2.n, PlayerController2.r, PlayerController2.p, PlayerController2.o {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String TAG = kd6.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public final Context f22584a;
    public List<LiveItem.TimeMovingLabelInfos> b;
    public final ux9 c;
    public View d;
    public RecyclerView e;
    public StructListAdapter f;
    public PlayerController2 g;
    public String h;
    public LiveItem.TimeMovingLabelInfos i;
    public boolean j;
    public k0e k;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements m9d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.m9d
        public boolean a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5c1881ff", new Object[]{this, new Integer(i)})).booleanValue();
            }
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", kd6.this.h);
                hashMap.put("dianjijiaohu_type", String.valueOf(2));
                sbu.f(kd6.d(kd6.this), "jichujiaohu_view", hashMap);
            } catch (Exception unused) {
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements p0e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                kd6.g(kd6.this).setVisibility(0);
                if (kd6.h(kd6.this) != null) {
                    Collections.sort(kd6.e(kd6.this));
                    kd6.h(kd6.this).V(kd6.e(kd6.this));
                    kd6.h(kd6.this).notifyDataSetChanged();
                }
            }
        }

        public b() {
        }

        @Override // tb.p0e
        public void a(Object obj) {
            List<LiveItem.TimeMovingLabelInfos> list;
            LiveItem.SpfPlayVideo spfPlayVideo;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8ef92c46", new Object[]{this, obj});
            } else if (obj instanceof LiveItem.TimeMovingPlayInfo) {
                LiveItem.TimeMovingPlayInfo timeMovingPlayInfo = (LiveItem.TimeMovingPlayInfo) obj;
                if (!TextUtils.isEmpty(timeMovingPlayInfo.itemId)) {
                    kd6.this.h = timeMovingPlayInfo.itemId;
                }
                kd6.f(kd6.this, null);
                if (uwa.x() && (spfPlayVideo = timeMovingPlayInfo.spfPlayVideo) != null) {
                    List<LiveItem.TimeMovingLabelInfos> list2 = spfPlayVideo.timeMovingLabelInfos;
                    if (list2 != null && list2.size() > 0) {
                        kd6.f(kd6.this, timeMovingPlayInfo.spfPlayVideo.timeMovingLabelInfos);
                    }
                } else if (uwa.x() && (list = timeMovingPlayInfo.timeMovingLabelInfos) != null) {
                    kd6.f(kd6.this, list);
                }
                if (kd6.e(kd6.this) == null || kd6.e(kd6.this).size() == 0) {
                    kd6.g(kd6.this).setVisibility(8);
                } else {
                    new Handler().post(new a());
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ long f22588a;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f22589a;

            public a(int i) {
                this.f22589a = i;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else if (kd6.e(kd6.this) != null && !kd6.e(kd6.this).isEmpty()) {
                    if (this.f22589a < kd6.e(kd6.this).size()) {
                        if (this.f22589a > 0) {
                            kd6 kd6Var = kd6.this;
                            kd6.j(kd6Var, (LiveItem.TimeMovingLabelInfos) kd6.e(kd6Var).get(this.f22589a - 1), false);
                            return;
                        }
                        kd6.k(kd6.this);
                    } else if (this.f22589a == kd6.e(kd6.this).size()) {
                        kd6 kd6Var2 = kd6.this;
                        kd6.j(kd6Var2, (LiveItem.TimeMovingLabelInfos) kd6.e(kd6Var2).get(this.f22589a - 1), false);
                    }
                }
            }
        }

        public c(long j) {
            this.f22588a = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            int i = kd6.i(kd6.this, this.f22588a);
            View view = kd6.this.d;
            if (view != null) {
                view.post(new a(i));
            }
        }
    }

    static {
        t2o.a(779092664);
        t2o.a(779092670);
        t2o.a(779093528);
        t2o.a(779093532);
        t2o.a(779093530);
        t2o.a(779093529);
    }

    public kd6(Context context, q06 q06Var, String str, ux9 ux9Var) {
        this.c = ux9Var;
        this.f22584a = context;
        n(str);
        m();
        l();
    }

    public static /* synthetic */ ux9 d(kd6 kd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ux9) ipChange.ipc$dispatch("96ae584", new Object[]{kd6Var});
        }
        return kd6Var.c;
    }

    public static /* synthetic */ List e(kd6 kd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("8469aa6c", new Object[]{kd6Var});
        }
        return kd6Var.b;
    }

    public static /* synthetic */ List f(kd6 kd6Var, List list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("5636be99", new Object[]{kd6Var, list});
        }
        kd6Var.b = list;
        return list;
    }

    public static /* synthetic */ RecyclerView g(kd6 kd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("e9455fa3", new Object[]{kd6Var});
        }
        return kd6Var.e;
    }

    public static /* synthetic */ StructListAdapter h(kd6 kd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (StructListAdapter) ipChange.ipc$dispatch("bc015472", new Object[]{kd6Var});
        }
        return kd6Var.f;
    }

    public static /* synthetic */ int i(kd6 kd6Var, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("58781f9", new Object[]{kd6Var, new Long(j)})).intValue();
        }
        return kd6Var.r(j);
    }

    public static /* synthetic */ void j(kd6 kd6Var, LiveItem.TimeMovingLabelInfos timeMovingLabelInfos, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("26caf82e", new Object[]{kd6Var, timeMovingLabelInfos, new Boolean(z)});
        } else {
            kd6Var.s(timeMovingLabelInfos, z);
        }
    }

    public static /* synthetic */ void k(kd6 kd6Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b09c3080", new Object[]{kd6Var});
        } else {
            kd6Var.o();
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.r
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c95d1c6", new Object[]{this, new Boolean(z)});
        }
    }

    @Override // tb.n0e
    public void b(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe14a72", new Object[]{this, new Integer(i)});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.b;
        if (list != null && list.get(i) != null) {
            s(this.b.get(i), true);
        }
    }

    @Override // com.taobao.taolive.sdk.ui.media.playercontrol.PlayerController2.r
    public void c(boolean z, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8624ddbe", new Object[]{this, new Boolean(z), new Long(j)});
        } else if (z) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("item_id", this.h);
                hashMap.put("dianjijiaohu_type", String.valueOf(2));
                sbu.f(this.c, "jichujiaohu_dianji", hashMap);
            } catch (Exception unused) {
            }
            Coordinator.execute(new c(j));
        }
    }

    public void l() {
        k0e k0eVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("85a7e227", new Object[]{this});
            return;
        }
        z6m h = dxa.b(this.c).h();
        if (h != null && (k0eVar = h.b) != null) {
            this.k = k0eVar;
            this.h = h.f32573a;
            PlayerController2 g = k0eVar.g();
            this.g = g;
            if (g != null) {
                g.setPlayProgressListener(this);
                this.g.setSeekStopTrackingListener(this);
                this.g.setPlayerStatusListener(this);
                this.g.setmPlayStartOrCompletionListener(this);
                this.g.setPlayRateListener(new a());
            }
        }
    }

    public void m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84263210", new Object[]{this});
        } else {
            dxa.b(this.c).r(new b());
        }
    }

    public void n(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e4e0194", new Object[]{this, str});
            return;
        }
        View inflate = LayoutInflater.from(this.f22584a).inflate(R.layout.taolive_highligt_dx_timeshift_struct_list, (ViewGroup) null);
        this.d = inflate;
        this.e = (RecyclerView) inflate.findViewById(R.id.taolive_higlight_dx_timeshift_struct_list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this.f22584a);
        linearLayoutManager.setOrientation(0);
        this.e.setLayoutManager(linearLayoutManager);
        this.b = ztt.b(str);
        StructListAdapter structListAdapter = new StructListAdapter(this.f22584a, this.b, this, this.h, this.c);
        this.f = structListAdapter;
        structListAdapter.V(this.b);
        this.e.setAdapter(this.f);
    }

    public final void o() {
        StructListAdapter structListAdapter;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f49df65e", new Object[]{this});
            return;
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.b;
        if (list != null && !list.isEmpty() && (structListAdapter = this.f) != null && this.e != null) {
            structListAdapter.U(-1);
            this.f.notifyDataSetChanged();
            this.e.smoothScrollToPosition(0);
            this.i = this.b.get(0);
            this.j = false;
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cbef83c", new Object[]{this});
        }
    }

    public void q(long j) {
        List<LiveItem.TimeMovingLabelInfos> list;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b7f5a1d", new Object[]{this, new Long(j)});
        } else if (this.f != null && (list = this.b) != null && list.size() > 0) {
            if (this.i == null || (j < this.b.get(0).oppsTime && this.i != this.b.get(0))) {
                o();
            }
            LiveItem.TimeMovingLabelInfos timeMovingLabelInfos = this.i;
            if (j >= timeMovingLabelInfos.oppsTime && !this.j) {
                s(timeMovingLabelInfos, false);
            }
        }
    }

    public final int r(long j) {
        int i = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("9307352f", new Object[]{this, new Long(j)})).intValue();
        }
        List<LiveItem.TimeMovingLabelInfos> list = this.b;
        if (list != null && list.size() > 0) {
            int size = this.b.size() - 1;
            while (i <= size) {
                int i2 = (i + size) / 2;
                if (this.b.size() > i2) {
                    if (this.b.get(i2).oppsTime > j) {
                        size = i2 - 1;
                    } else if (this.b.get(i2).oppsTime <= j) {
                        i = i2 + 1;
                    }
                }
            }
        }
        return i;
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebf607be", new Object[]{this});
            return;
        }
        VideoInfo c0 = up6.c0(this.c);
        HashMap hashMap = new HashMap();
        hashMap.put("item_id", this.h);
        hashMap.put("entrySpm", iba.r(vx9.f(this.c)));
        hashMap.put("entryLiveSource", iba.o(vx9.f(this.c)));
        hashMap.put("spm-url", iba.J(vx9.f(this.c)));
        hashMap.put("jiangjie_ID", up6.H(this.c));
        if (c0 != null) {
            hashMap.put("feed_id", c0.liveId);
            hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(c0.status));
            AccountInfo accountInfo = c0.broadCaster;
            if (accountInfo != null) {
                hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
            }
        }
        hashMap.put("spm-cnt", sbu.c(this.c));
        sbu.i(this.c, 19999, "livefinished", hashMap);
    }

    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93e52dae", new Object[]{this});
            return;
        }
        try {
            VideoInfo c0 = up6.c0(this.c);
            HashMap hashMap = new HashMap();
            hashMap.put("item_id", this.h);
            hashMap.put("entrySpm", iba.r(vx9.f(this.c)));
            hashMap.put("entryLiveSource", iba.o(vx9.f(this.c)));
            hashMap.put("spm-url", iba.J(vx9.f(this.c)));
            hashMap.put("jiangjie_ID", up6.H(this.c));
            if (c0 != null) {
                hashMap.put("feed_id", c0.liveId);
                hashMap.put(z9u.KEY_LIVE_STATUS, String.valueOf(c0.status));
                AccountInfo accountInfo = c0.broadCaster;
                if (accountInfo != null) {
                    hashMap.put(z9u.KEY_ACCOUNT_ID, accountInfo.accountId);
                }
            }
            hashMap.put("spm-cnt", sbu.c(this.c));
            sbu.i(this.c, 19999, "livestart", hashMap);
        } catch (Exception unused) {
        }
    }

    public final void s(LiveItem.TimeMovingLabelInfos timeMovingLabelInfos, boolean z) {
        ux9 ux9Var;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a637806", new Object[]{this, timeMovingLabelInfos, new Boolean(z)});
            return;
        }
        StructListAdapter structListAdapter = this.f;
        if (structListAdapter != null && this.e != null && this.b != null) {
            structListAdapter.U(timeMovingLabelInfos.hashCode());
            this.f.notifyDataSetChanged();
            int indexOf = this.b.indexOf(timeMovingLabelInfos);
            if (indexOf >= 0) {
                if (z && (ux9Var = this.c) != null) {
                    IPlayPublicService x = ux9Var.x();
                    String str = TAG;
                    o3s.b(str, "结构化标签,IPlayPublicService:" + x);
                    if (x != null) {
                        long j = timeMovingLabelInfos.oppsTime;
                        if (j >= 0) {
                            x.seekTo(j);
                            sbu.i(this.c, 19999, "timeshiftSeekToByStruct", null);
                            if (!x.isPlaying()) {
                                x.l();
                            }
                            if (this.c.h() != null) {
                                this.c.h().e("replay_play_status_change", "play");
                            }
                        }
                    }
                }
                this.e.smoothScrollToPosition(indexOf);
                if (indexOf < this.b.size() - 1) {
                    this.i = this.b.get(indexOf + 1);
                    this.j = false;
                    return;
                }
                List<LiveItem.TimeMovingLabelInfos> list = this.b;
                this.i = list.get(list.size() - 1);
                this.j = true;
            }
        }
    }
}
