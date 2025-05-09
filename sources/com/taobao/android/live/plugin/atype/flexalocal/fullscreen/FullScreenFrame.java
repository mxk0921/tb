package com.taobao.android.live.plugin.atype.flexalocal.fullscreen;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.alilive.aliliveframework.frame.BaseFrame;
import com.taobao.android.live.plugin.atype.flexalocal.fullscreen.view.PassEventViewPager;
import com.taobao.android.live.plugin.atype.flexalocal.usertask.FloatingUserTaskFrame;
import com.taobao.android.live.plugin.proxy.FlexaLiveX;
import com.taobao.android.live.plugin.proxy.ir.room.IRRoomProxy;
import com.taobao.android.task.Coordinator;
import com.taobao.kmp.live.updown.model.TaoLiveKtSwitchModel;
import com.taobao.taobao.R;
import com.taobao.taolive.room.openarchitecture.entity.ATaoLiveOpenEntity;
import com.taobao.taolive.room.openarchitecture.listener.AccessListenerEnum;
import com.taobao.taolive.room.openarchitecture.opencompontent.ability.OpenAbilityCompontentTypeEnum;
import com.taobao.taolive.sdk.configurable.ComponentGroupConfig;
import com.taobao.taolive.sdk.model.TBLiveDataModel;
import com.taobao.taolive.sdk.model.common.AccountInfo;
import com.taobao.taolive.sdk.model.common.VideoInfo;
import com.taobao.taolive.sdk.model.message.MessageTypeFilter;
import com.taobao.taolive.sdk.model.message.TLiveMsg;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import tb.azd;
import tb.bl9;
import tb.ccc;
import tb.cpr;
import tb.cwd;
import tb.czd;
import tb.czs;
import tb.d9m;
import tb.e9m;
import tb.fkx;
import tb.giv;
import tb.gq0;
import tb.gu3;
import tb.h17;
import tb.hgb;
import tb.hjr;
import tb.hw0;
import tb.iba;
import tb.ibt;
import tb.idu;
import tb.igq;
import tb.jyw;
import tb.kyd;
import tb.lvs;
import tb.m09;
import tb.m8c;
import tb.nh4;
import tb.o3s;
import tb.qr4;
import tb.qvs;
import tb.r7e;
import tb.rbt;
import tb.rgd;
import tb.s3c;
import tb.s4g;
import tb.sjr;
import tb.t2o;
import tb.t54;
import tb.up6;
import tb.urf;
import tb.ux9;
import tb.uyg;
import tb.v2s;
import tb.vwl;
import tb.vx9;
import tb.w0u;
import tb.yiv;
import tb.yj4;
import tb.yqq;
import tb.ysv;
import tb.zfc;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public abstract class FullScreenFrame extends BaseFrame implements View.OnClickListener, s3c, m8c, ccc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String EVENT_ACTION_GOTO_HOME = "com.taobao.taolive.room.goto.home";
    public static final String EVENT_ADD_TIPS_VIEW = "com.taobao.taolive.room.add_tips_view";
    public static final String EVENT_BACK_TO_LIVE = "com.taobao.taolive.room.backToLive";
    public static final String EVENT_CLICK_ROOT_VIEW_FOR_REPLAY = "com.taobao.taolive.room.click_root_view";
    public static final String EVENT_DISABLE_LEFTRIGHT_SWITCH = "com.taobao.taolive.room.disable_leftright_switch";
    public static final String EVENT_ENABLE_LEFTRIGHT_SWITCH = "com.taobao.taolive.room.enable_leftright_switch";
    public static final String EVENT_LINKLIVE_INIT = "com.taobao.taolive.room_linklive_init";
    public static final String EVENT_MEDIAPLATFORM_ADDFAVOR = "com.taolive.taolive.room.mediaplatform_addfavor";
    public static final String EVENT_MEDIAPLATFORM_SCREEN_FLIPPED = "com.taobao.taolive.room.mediaplatform_screen_flipped";
    public static final String EVENT_MEDIAPLATFORM_SHOW_SHAREPANEL = "com.taolive.taolive.room.mediaplatform_show_sharepanel";
    public static final String EVENT_PREVIEW_VIDEO_FULL_SCREEN = "com.taobao.taolive.room.preview_video_full_screen";
    public static final String EVENT_PREVIEW_VIDEO_NORMAL_SCREEN = "com.taobao.taolive.room.preview_video_normal_screen";
    public static final String EVENT_ROOT_VIEW_CLICK = "com.taobao.taolive.room.root_view_click";
    public static final String EVENT_SHOW_LOGO = "com.taobao.taolive.room.show_logo";
    public static final String EVENT_SHOW_SCREEN_RECORD_BTN_FRAME = "com.taobao.taolive.room.show_screen_record_btns_frame";
    public static final String EVENT_TAOLIVE_ROOM_CLEAR_SCREEN = "com.taobao.taolive.room.clean_screen";
    public static final String EVENT_TAOLIVE_ROOM_DOUBLE_CLICK_FAVOR_SHOW = "com.taolive.taolive.room.double_click_favor_show";
    public static final String EVENT_TOPBAR_CLICK_AVATAR = "com.taobao.taolive.room.topbar_click_avatar";
    public static final int MESSAGE_INIT_GOODS_LIST = 2147483646;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_ICON = 2147483645;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_OPT = 2147483643;
    public static final int MESSAGE_INIT_PROJECT_SCREEN_SEARCH = 2147483644;
    private static final String TAG = "sxr=> FullScreenFrame";
    public View mAdView;
    public long mEnterClearScreenTime;
    public View mFrontView;
    public BaseFrame mInteractPanelFrame;
    public boolean mIsEnd;
    public kyd mKeyboardLayout;
    public VideoInfo mLiveDetailData;
    public PassEventViewPager mViewPager;
    public View mViewPagerBackground;
    private List<Runnable> preInflateRunnables;
    public SimpleAdapter simpleAdapter;
    public boolean mIsSwipeClearScreen = false;
    private final hgb.a mAppLifeCycleListener = new e(this);
    private final cpr.b mMessageListener = new f();
    public final Handler workerHandler = new Handler(Coordinator.getWorkerLooper());
    public boolean isClearScreen = false;
    public jyw weakHandler = new jyw(this);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class SimpleAdapter extends PagerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final ArrayList<View> f8462a;

        static {
            t2o.a(295698781);
        }

        public SimpleAdapter(ArrayList<View> arrayList) {
            this.f8462a = arrayList;
        }

        public static /* synthetic */ Object ipc$super(SimpleAdapter simpleAdapter, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenFrame$SimpleAdapter");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a141ccc", new Object[]{this, viewGroup, new Integer(i), obj});
            } else {
                viewGroup.removeView((View) obj);
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getCount() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4fed2753", new Object[]{this})).intValue();
            }
            return this.f8462a.size();
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public int getItemPosition(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("304bee8", new Object[]{this, obj})).intValue();
            }
            return -2;
        }

        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a6532022", new Object[]{this});
                return;
            }
            ArrayList<View> arrayList = this.f8462a;
            if (arrayList != null) {
                arrayList.clear();
            }
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public Object instantiateItem(ViewGroup viewGroup, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ipChange.ipc$dispatch("1038d332", new Object[]{this, viewGroup, new Integer(i)});
            }
            View view = this.f8462a.get(i);
            if (view != null) {
                viewGroup.removeView(view);
                viewGroup.addView(view);
                return view;
            }
            throw new IllegalStateException("SimpleAdapter instantiateItem View not found");
        }

        @Override // androidx.viewpager.widget.PagerAdapter
        public boolean isViewFromObject(View view, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("9e758b33", new Object[]{this, view, obj})).booleanValue();
            }
            if (view == obj) {
                return true;
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class a implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                FullScreenFrame.this.initTBLiveXBackFrameInner();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class b extends h17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ View f8464a;
        public final /* synthetic */ h17 b;

        public b(View view, h17 h17Var) {
            this.f8464a = view;
            this.b = h17Var;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenFrame$11");
        }

        @Override // tb.h17, tb.dy9
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd18a28", new Object[]{this, baseFrame});
                return;
            }
            h17 h17Var = this.b;
            if (h17Var != null) {
                h17Var.a(baseFrame);
            }
        }

        @Override // tb.h17, tb.dy9
        public void b(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("44c6963a", new Object[]{this, baseFrame});
                return;
            }
            FullScreenFrame.this.mInteractPanelFrame = baseFrame;
            if (baseFrame instanceof zfc) {
                ((zfc) baseFrame).setCoverView(this.f8464a);
            }
            h17 h17Var = this.b;
            if (h17Var != null) {
                h17Var.b(baseFrame);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class c extends h17 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            if (str.hashCode() == -573470168) {
                super.a((BaseFrame) objArr[0]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenFrame$12");
        }

        @Override // tb.h17, tb.dy9
        public void a(BaseFrame baseFrame) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddd18a28", new Object[]{this, baseFrame});
                return;
            }
            super.a(baseFrame);
            FullScreenFrame.this.mInteractPanelFrame.show();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class d implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
                return;
            }
            try {
                FullScreenFrame.this.initBTypeOtherFrameInner();
            } catch (Throwable th) {
                FlexaLiveX.w("[sxr=> FullScreenFrame#registerRemoteFrame#onBTypePluginInstalled]  error: " + th.getMessage());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class e implements hgb.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e(FullScreenFrame fullScreenFrame) {
        }

        @Override // tb.hgb.a
        public void onAppInBackgroud() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1c87472c", new Object[]{this});
            } else if (hjr.o() && d9m.f() != null) {
                o3s.b(FullScreenFrame.TAG, "full screen onAppInBackgroud");
                d9m.f().onAppDidEnterBackground();
            }
        }

        @Override // tb.hgb.a
        public void onAppInForeground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("111bbcb1", new Object[]{this});
            } else if (hjr.o() && d9m.f() != null) {
                o3s.b(FullScreenFrame.TAG, "full screen onAppInForeground");
                d9m.f().onAppWillEnterForeground();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class f implements cpr.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // tb.gtc
        public void onMessageReceived(int i, Object obj) {
            ux9 ux9Var;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b152aef", new Object[]{this, new Integer(i), obj});
            } else if (obj instanceof TLiveMsg) {
                TLiveMsg tLiveMsg = (TLiveMsg) obj;
                Map<String, ? extends Object> b = urf.b(fkx.d(new String(tLiveMsg.data)));
                if (hjr.d() && (ux9Var = FullScreenFrame.this.mFrameContext) != null && up6.c0(ux9Var) != null && !TextUtils.equals(up6.c0(FullScreenFrame.this.mFrameContext).topic, tLiveMsg.topic)) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("liveBizPmError", "1");
                    ux9 ux9Var2 = FullScreenFrame.this.mFrameContext;
                    if (ux9Var2 != null && ux9Var2.w() != null) {
                        FullScreenFrame.this.mFrameContext.w().b(hashMap);
                    }
                } else if (d9m.f() != null) {
                    d9m.f().didRevLivePowerMsg(i, b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class g implements gu3.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ boolean f8468a;

        public g(boolean z) {
            this.f8468a = z;
        }

        @Override // tb.gu3.d
        public void b(int i, PointF pointF) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("52566bcd", new Object[]{this, new Integer(i), pointF});
                return;
            }
            sjr.g().c("com.taolive.taolive.room.mediaplatform_addfavor", null, FullScreenFrame.this.mFrameContext.C());
            sjr.g().c("com.taolive.taolive.room.double_click_favor_show", pointF, FullScreenFrame.this.mFrameContext.C());
            if (giv.f() != null) {
                giv.f().n(FullScreenFrame.this.mFrameContext, "doublelike_CLK", new String[0]);
            }
        }

        @Override // tb.gu3.d
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9c5b509c", new Object[]{this});
                return;
            }
            o3s.b(FullScreenFrame.TAG, "mViewPager, onSingleClickListener: isNeedSingleClick: " + this.f8468a);
            if (this.f8468a) {
                sjr.g().c(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, Boolean.valueOf(true ^ FullScreenFrame.this.isClearScreen), FullScreenFrame.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class h implements gu3.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public h() {
        }

        @Override // tb.gu3.c
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7e19a8c4", new Object[]{this});
                return;
            }
            o3s.b(FullScreenFrame.TAG, "mViewPager, onClickListener");
            sjr.g().c(FullScreenFrame.EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, Boolean.valueOf(true ^ FullScreenFrame.this.isClearScreen), FullScreenFrame.this.observeUniqueIdentification());
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class i implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public i() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                FullScreenFrame.access$000(FullScreenFrame.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class j implements r7e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public j() {
        }

        @Override // tb.r7e
        public void a(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("34ae6dec", new Object[]{this, str, str2});
            } else {
                sjr.g().c(str, str2, FullScreenFrame.this.observeUniqueIdentification());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class k extends MessageTypeFilter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public k(FullScreenFrame fullScreenFrame) {
        }

        public static /* synthetic */ Object ipc$super(k kVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenFrame$8");
        }

        @Override // com.taobao.taolive.sdk.model.message.MessageTypeFilter
        public boolean filter(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c81f1ee8", new Object[]{this, new Integer(i)})).booleanValue();
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public class l implements bl9.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public l() {
        }

        @Override // tb.bl9.b
        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9bef331", new Object[]{this});
            } else {
                FullScreenFrame.this.initTBLiveXBackFrameInner();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class m {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final String TAG = "FullScreenViewPre";
        public static final ConcurrentHashMap<Integer, View> sCachedPool = new ConcurrentHashMap<>();

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
        public static final class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            private final String f8473a;
            private final int b;
            private final WeakReference<Context> c;

            static {
                t2o.a(295698783);
            }

            public a(int i, Context context, String str) {
                this.b = i;
                this.c = new WeakReference<>(context);
                this.f8473a = str;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                cwd A = v2s.o().A();
                A.c(m.TAG, "预inflate " + this.f8473a);
                Context context = this.c.get();
                if (context != null) {
                    try {
                        m.sCachedPool.put(Integer.valueOf(this.b), LayoutInflater.from(context).cloneInContext(context).inflate(this.b, (ViewGroup) null));
                    } catch (Throwable th) {
                        cwd A2 = v2s.o().A();
                        A2.c(m.TAG, "pre inflate error:" + th);
                    }
                }
            }
        }

        static {
            t2o.a(295698782);
        }

        public static void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b42d4c54", new Object[0]);
                return;
            }
            o3s.b(TAG, "清空缓存");
            sCachedPool.clear();
        }
    }

    static {
        t2o.a(295698767);
        t2o.a(806355016);
        t2o.a(806356101);
        t2o.a(806356161);
    }

    public FullScreenFrame(Context context, boolean z, TBLiveDataModel tBLiveDataModel, ux9 ux9Var) {
        super(context, z, tBLiveDataModel, ux9Var);
    }

    public static /* synthetic */ void access$000(FullScreenFrame fullScreenFrame) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a44675c", new Object[]{fullScreenFrame});
        } else {
            fullScreenFrame.initPrivateVipFrame();
        }
    }

    private boolean canTriggerKmpLifecycleWithConsistent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2e4f4f47", new Object[]{this})).booleanValue();
        }
        if (!qvs.u() || !hjr.o() || d9m.f() == null) {
            return false;
        }
        return true;
    }

    private boolean canTriggerKmpLifecycleWithOld() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("917b7148", new Object[]{this})).booleanValue();
        }
        if (qvs.u() || !hjr.o() || d9m.f() == null) {
            return false;
        }
        return true;
    }

    private void cleanBizManager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d43954a", new Object[]{this});
        } else if (d9m.f() != null) {
            d9m.f().unInstall();
            d9m.a();
        }
    }

    private Runnable convertResIdToRunnable(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Runnable) ipChange.ipc$dispatch("1735e978", new Object[]{this, new Integer(i2)});
        }
        return new m.a(i2, this.mContext, String.valueOf(i2));
    }

    private boolean enableWarmMockHideH5() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e289cac", new Object[]{this})).booleanValue();
        }
        if (qvs.J0() == 2 || qvs.J0() == 6) {
            return true;
        }
        return false;
    }

    private TaoLiveKtSwitchModel getKtSwitchModel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (TaoLiveKtSwitchModel) ipChange.ipc$dispatch("99be1ce7", new Object[]{this});
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var instanceof t54) || ((t54) ux9Var).w0() == null) {
            return null;
        }
        return ((t54) this.mFrameContext).w0().mTaoLiveKtSwitchModel;
    }

    private void initGoodsListFrameAsync() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b23e51a", new Object[]{this});
            return;
        }
        this.mFrontView.requestLayout();
        Message obtain = Message.obtain(this.weakHandler);
        obtain.what = MESSAGE_INIT_GOODS_LIST;
        if (Build.VERSION.SDK_INT >= 22) {
            obtain.setAsynchronous(false);
        }
        this.weakHandler.sendMessage(obtain);
    }

    private void initKMPMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d07bd3e4", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().l(this.mMessageListener, new k(this));
        }
        v2s.o().f().a(this.mAppLifeCycleListener);
    }

    private void initPrivateVipFrame() {
        BaseFrame createPrivateVipFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6cbcdca", new Object[]{this});
        } else if (d9m.e() != null && (createPrivateVipFrame = d9m.e().createPrivateVipFrame(this.mContext, this.mLandscape, this.mLiveDataModel, (ViewStub) this.mFrontView.findViewById(R.id.taolive_privatevip_container_stub))) != null) {
            addComponent(createPrivateVipFrame);
        }
    }

    public static /* synthetic */ Object ipc$super(FullScreenFrame fullScreenFrame, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1857981988:
                super.onDidAppear();
                return null;
            case -1801045031:
                super.onWillDisappear();
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -1272916118:
                super.onDataReceived((TBLiveDataModel) objArr[0]);
                return null;
            case -1257959318:
                super.onDidDisappear();
                return null;
            case -358672098:
                super.onViewHolderWillAppear();
                return null;
            case -309961236:
                super.onCleanUp();
                return null;
            case -236809011:
                super.onWillAppear();
                return null;
            case 631938923:
                super.onViewHolderDidAppear();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 1318062568:
                super.onViewHolderWillDisappear();
                return null;
            case 1890698363:
                super.onViewHolderDidDisappear();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/live/plugin/atype/flexalocal/fullscreen/FullScreenFrame");
        }
    }

    private void showAccountInfo() {
        VideoInfo videoInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10ea36c5", new Object[]{this});
        } else if (gq0.b() != null && (videoInfo = this.mLiveDetailData) != null && videoInfo.broadCaster != null && videoInfo.roomType != 13) {
            gq0.b().a(this.mContext, this.mLiveDetailData.broadCaster, false);
        }
    }

    private void showQAH5(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5eede68b", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            if (rgd.b().a() == null || !rgd.b().a().platformUtilsShouldOpenOnce("true", str)) {
                HashMap hashMap = new HashMap();
                float e2 = hw0.e() * lvs.r();
                hashMap.put("x", "0");
                hashMap.put("y", String.valueOf(hw0.u((hw0.e() - hw0.d(this.mContext)) - e2)));
                hashMap.put("width", String.valueOf(-1));
                hashMap.put("height", String.valueOf(hw0.u(e2)));
                hashMap.put("modal", "true");
                hashMap.put("exitAnimation", "1");
                hashMap.put("enterAnimation", "1");
                hashMap.put("bizData", "showQAH5");
                igq.n().g("alive_interactive_count_action", "showQAH5_addContainer", 1.0d);
                ux9 ux9Var = this.mFrameContext;
                if ((ux9Var instanceof t54) && ((t54) ux9Var).z0() != null) {
                    ((t54) this.mFrameContext).z0().f(iba.b(this.mContext, vx9.f(this.mFrameContext)), str, hashMap);
                }
            }
        }
    }

    private void uninstallMessageListener() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c4a030a0", new Object[]{this});
            return;
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.t() == null)) {
            this.mFrameContext.t().a(this.mMessageListener);
        }
        v2s.o().f().b(this.mAppLifeCycleListener);
    }

    public abstract /* synthetic */ String bizCode();

    public void clearComponents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc5b844a", new Object[]{this});
        } else if (hjr.o()) {
            o3s.b(TAG, "full screen clear components");
            cleanBizManager();
            uninstallMessageListener();
        }
    }

    public FrameLayout getPlayerControllerView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("ebbada", new Object[]{this});
        }
        return (FrameLayout) this.mFrontView.findViewById(R.id.taolive_player_controller_layout);
    }

    @Override // tb.m8c
    public View getUbeeContainer() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("e01a45e7", new Object[]{this});
        }
        View view = this.mFrontView;
        if (view == null) {
            return null;
        }
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.taolive_ubee_container_stub);
        if (viewStub != null) {
            viewStub.inflate();
        }
        return this.mFrontView.findViewById(R.id.taolive_ubee_container);
    }

    @Override // tb.ccc
    public void handleMessage(Message message) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("282a8c19", new Object[]{this, message});
        } else if (message.what == 2147483646) {
            v2s.o().A().c(TAG, "initGoodsListFrame");
            initGoodListFrame();
        }
    }

    public void hideKeyboard() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e8c20b50", new Object[]{this});
        } else {
            s4g.a((Activity) this.mContext, null);
        }
    }

    public void initAdView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc32af1f", new Object[]{this});
        }
    }

    public void initAdapter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bec36126", new Object[]{this});
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.mFrontView);
        this.simpleAdapter = new SimpleAdapter(arrayList);
    }

    public abstract void initAll();

    public void initB2BConnectingView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2ccd0e26", new Object[]{this});
        } else if (!vwl.e().c() && lvs.j() && v2s.o().I("link")) {
            this.mFrameContext.i().c(this, "tl-connect-mic", this.mFrontView.findViewById(R.id.taolive_bbconecting_stub));
        }
    }

    public void initBTypeOtherFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b1f40f0", new Object[]{this});
        } else if (!vwl.e().c()) {
            try {
                if (bl9.g().b()) {
                    initBTypeOtherFrameInner();
                } else {
                    bl9.g().i(new d());
                }
            } catch (Throwable th) {
                FlexaLiveX.w("[sxr=> FullScreenFrame#initBTypeOtherFrame]  error: " + th.getMessage());
            }
        }
    }

    public void initBTypeOtherFrameInner() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cc074f4", new Object[]{this});
        } else if (d9m.e() != null) {
            d9m.e().initBTypeOtherFrame(this, this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext);
            FlexaLiveX.w("[sxr=> FullScreenFrame#initBTypeOtherFrameInner] success");
        }
    }

    public void initBottomBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6578b3f", new Object[]{this});
        }
    }

    public void initChat() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dcb8650f", new Object[]{this});
        }
    }

    public void initCleanView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f992ae5", new Object[]{this});
        }
    }

    public void initClearScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b0b95f0", new Object[]{this});
        } else if (up6.B0(this.mFrameContext)) {
            this.mViewPager.setOnClearClickListener(new g(up6.n0(this.mFrameContext)), this.mLandscape);
        } else if (up6.n0(this.mFrameContext)) {
            this.mViewPager.setOnClearClickListener(new h(), this.mLandscape);
        }
    }

    public void initDoubleClickFavView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7320960", new Object[]{this});
        }
    }

    public void initFavor() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f214e095", new Object[]{this});
        }
    }

    public void initGoodListFrame() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a0091789", new Object[]{this});
        }
    }

    public void initH5Container() {
        BaseFrame createH5DynamicSDKFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cac0518b", new Object[]{this});
            return;
        }
        ViewStub viewStub = (ViewStub) this.mFrontView.findViewById(R.id.taolive_h5_container_fullscreen_stub);
        if (viewStub != null && rgd.b().a() != null && (createH5DynamicSDKFrame = rgd.b().a().createH5DynamicSDKFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createH5DynamicSDKFrame.onCreateView(viewStub);
            addComponent(createH5DynamicSDKFrame);
        }
    }

    public void initInput() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2455421", new Object[]{this});
        }
    }

    public void initInteractBizCenter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("943d1209", new Object[]{this});
        }
    }

    public void initInteractPanel(h17 h17Var) {
        View view;
        ViewGroup viewGroup;
        czd czdVar;
        View m2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b9ba1bd1", new Object[]{this, h17Var});
        } else if (!vwl.e().c() && this.mInteractPanelFrame == null) {
            ATaoLiveOpenEntity taoliveOpenLiveRoomEntity = rgd.b().a() != null ? rgd.b().a().getTaoliveOpenLiveRoomEntity(this.mFrameContext) : null;
            ViewGroup viewGroup2 = (taoliveOpenLiveRoomEntity == null || (czdVar = taoliveOpenLiveRoomEntity.uiCompontent) == null || ((rbt) czdVar).b() == null || (m2 = ((rbt) taoliveOpenLiveRoomEntity.uiCompontent).b().m()) == null) ? null : (ViewGroup) m2.findViewById(rgd.b().c(IRRoomProxy.R_ID_TAOLIVE_OPEN_INTERACT_PANEL_FRAME));
            if (viewGroup2 != null) {
                View inflate = LayoutInflater.from(this.mContext).inflate(R.layout.taolive_interact_container_flexalocal, (ViewGroup) null);
                viewGroup = (ViewGroup) inflate.findViewById(R.id.taolive_interact_list_container);
                view = inflate.findViewById(R.id.taolive_interact_cover);
                viewGroup2.addView(inflate);
            } else {
                Context context = this.mContext;
                int i2 = R.id.taolive_interact_list_container;
                viewGroup = (ViewGroup) e9m.a(context, i2);
                Context context2 = this.mContext;
                int i3 = R.id.taolive_interact_cover;
                View a2 = e9m.a(context2, i3);
                if (lvs.c()) {
                    viewGroup = (ViewGroup) this.mContainer.findViewById(i2);
                    view = this.mContainer.findViewById(i3);
                } else {
                    view = a2;
                }
            }
            this.mFrameContext.i().f(this, "tl-interact-panel", viewGroup, new b(view, h17Var));
        }
    }

    public void initInteractiveRightComponent() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("496cd19a", new Object[]{this});
        }
    }

    public void initMediaPlatform() {
        BaseFrame createMediaPlatformFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9139264e", new Object[]{this});
        } else if (rgd.b().a() != null && (createMediaPlatformFrame = rgd.b().a().createMediaPlatformFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createMediaPlatformFrame.onCreateView(null);
            addComponent(createMediaPlatformFrame);
        }
    }

    public void initNewBottomGuide() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93123f08", new Object[]{this});
        }
    }

    public void initPrivateVip() {
        VideoInfo c0;
        VideoInfo.AccessInfo accessInfo;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5373d451", new Object[]{this});
        } else if (vwl.e().c() || !lvs.t() || (c0 = up6.c0(this.mFrameContext)) == null || (accessInfo = c0.accessInfo) == null) {
        } else {
            if (accessInfo.access) {
                if (TextUtils.equals("PRIVATE", accessInfo.accessType)) {
                    str = "欢迎进入会员专属直播间";
                } else if (TextUtils.equals("VIP", c0.accessInfo.accessType)) {
                    str = "欢迎" + v2s.o().u().getNick() + "\n进入您的专属直播间！";
                } else {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    w0u.b(this.mContext, str);
                }
            } else if (bl9.g().b()) {
                initPrivateVipFrame();
            } else {
                bl9.g().i(new i());
            }
        }
    }

    public void initRank() {
        View view;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("964e93e3", new Object[]{this});
        } else if (!vwl.e().c() && !ComponentGroupConfig.componentEntranceHidden(ComponentGroupConfig.GROUP_TOP, ComponentGroupConfig.TOP_REWARD_RANK, this.mFrameContext)) {
            int i2 = R.id.taolive_rank_stub;
            ViewStub viewStub = (ViewStub) findViewById(i2);
            if (viewStub == null && (view = this.mFrontView) != null) {
                viewStub = (ViewStub) view.findViewById(i2);
            }
            this.mFrameContext.i().g(this, "tl-rank", viewStub);
        }
    }

    public void initRoomWatermark(VideoInfo videoInfo) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cff02c2d", new Object[]{this, videoInfo});
        }
    }

    public void initTBLiveXBackFrame() {
        azd azdVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("584204df", new Object[]{this});
        } else if (!vwl.e().c()) {
            ATaoLiveOpenEntity A = this.mFrameContext.A();
            if (A != null && (azdVar = A.abilityCompontent) != null && !((ibt) azdVar).d(OpenAbilityCompontentTypeEnum.TLOAbilityIdentifer_Disable_BackwardTips)) {
                return;
            }
            if (yqq.h(v2s.o().p().b("tblive_x_back", "XBackEnable", "true"))) {
                if (!lvs.g()) {
                    return;
                }
                if (bl9.g().b()) {
                    initTBLiveXBackFrameInner();
                } else {
                    bl9.g().i(new l());
                }
            } else if (lvs.g() && up6.k0(this.mFrameContext) && !TextUtils.isEmpty(up6.e(this.mFrameContext))) {
                if (bl9.g().b()) {
                    initTBLiveXBackFrameInner();
                } else {
                    bl9.g().i(new a());
                }
            }
        }
    }

    public void initTBLiveXBackFrameInner() {
        BaseFrame createRightBackwardTipsFrame;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3db5ce65", new Object[]{this});
        } else if (d9m.e() != null && (createRightBackwardTipsFrame = d9m.e().createRightBackwardTipsFrame(this.mContext, this.mLandscape, this.mLiveDataModel, this.mFrameContext)) != null) {
            createRightBackwardTipsFrame.onCreateView((ViewStub) this.mFrontView.findViewById(R.id.taolive_right_mid_tips_stub));
            addComponent(createRightBackwardTipsFrame);
        }
    }

    public void initTopBar() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3488935", new Object[]{this});
        }
    }

    public void initUserTask() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9bf365a7", new Object[]{this});
        } else if (!vwl.e().c() && !up6.q0(this.mFrameContext) && !ysv.M(this.mFrameContext)) {
            FloatingUserTaskFrame floatingUserTaskFrame = new FloatingUserTaskFrame(this.mContext, this.mFrameContext, "");
            floatingUserTaskFrame.createView((ViewStub) this.mFrontView.findViewById(R.id.taolive_user_task));
            floatingUserTaskFrame.setIUserTaskEventListener(new j());
            addComponent(floatingUserTaskFrame);
        }
    }

    public void initView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        initCleanView();
        initFrontView();
        initAdView();
        initViewPager();
    }

    public void initViewPager() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77226e75", new Object[]{this});
            return;
        }
        PassEventViewPager passEventViewPager = (PassEventViewPager) this.mContainer.findViewById(R.id.taolive_viewpager);
        this.mViewPager = passEventViewPager;
        if (passEventViewPager != null) {
            passEventViewPager.setFrameContext(this.mFrameContext);
        }
        this.mViewPagerBackground = this.mContainer.findViewById(R.id.taolive_viewpager_background);
        initAdapter();
        this.mViewPager.setAdapter(this.simpleAdapter);
        this.mViewPager.setCurrentItem(0);
        this.simpleAdapter.notifyDataSetChanged();
        initClearScreen();
        this.mViewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() { // from class: com.taobao.android.live.plugin.atype.flexalocal.fullscreen.FullScreenFrame.5
            public static volatile transient /* synthetic */ IpChange $ipChange;

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i2) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("6581cc1e", new Object[]{this, new Integer(i2)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageScrolled(int i2, float f2, int i3) {
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("f4c13b05", new Object[]{this, new Integer(i2), new Float(f2), new Integer(i3)});
                }
            }

            @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
            public void onPageSelected(int i2) {
                boolean z = true;
                IpChange ipChange2 = $ipChange;
                if (ipChange2 instanceof IpChange) {
                    ipChange2.ipc$dispatch("184d6f33", new Object[]{this, new Integer(i2)});
                    return;
                }
                sjr g2 = sjr.g();
                if (i2 != 0) {
                    z = false;
                }
                g2.c(FullScreenFrame.EVENT_MEDIAPLATFORM_SCREEN_FLIPPED, Boolean.valueOf(z), FullScreenFrame.this.observeUniqueIdentification());
            }
        });
    }

    @Override // tb.s3c
    public String[] observeEvents() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String[]) ipChange.ipc$dispatch("37b2602b", new Object[]{this});
        }
        return new String[]{EVENT_PREVIEW_VIDEO_NORMAL_SCREEN, EVENT_PREVIEW_VIDEO_FULL_SCREEN, uyg.EVENT_LINKLIVE_START, uyg.EVENT_LINKLIVE_STOP, EVENT_SHOW_LOGO, EVENT_TOPBAR_CLICK_AVATAR, EVENT_SHOW_SCREEN_RECORD_BTN_FRAME, EVENT_BACK_TO_LIVE, EVENT_ADD_TIPS_VIEW, EVENT_ROOT_VIEW_CLICK, EVENT_ENABLE_LEFTRIGHT_SWITCH, EVENT_DISABLE_LEFTRIGHT_SWITCH, EVENT_LINKLIVE_INIT, "com.taolive.taolive.room.mediaplatform_show_sharepanel", EVENT_TAOLIVE_ROOM_CLEAR_SCREEN, "com.taobao.taolive.room.ubee_for_morelive", uyg.EVENT_SHOW_QA, uyg.EVENT_CLEAR_SCREEN_NEW, "com.taobao.taolive.room.init_sab_atmosphere", "com.taobao.taolive.room.dismiss_sab_atmosphere", uyg.EVENT_CHANGE_CONTAINER_OFFSET, uyg.EVENT_CAN_SHOW_POP_LAYER, "com.taobao.taolive.room.hot_item_subscribe_success", uyg.c, uyg.d, uyg.f, uyg.EVENT_CLEAR_SCREEN_IMMERSIVE, uyg.EVENT_CLEAR_SCREEN_IMMERSIVE_RECOVER, uyg.EVENT_CLEAR_SCREEN_AND_HIDE_GOODS_ICON, uyg.EVENT_SEEK_BAR_TOUCH, uyg.EVENT_SHOW_PLAY_SPEED_GUIDE, uyg.EVENT_SCREEN_ORIENTATION_CHANGED};
    }

    public abstract /* synthetic */ String observeUniqueIdentification();

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCleanUp() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ed865dec", new Object[]{this});
            return;
        }
        super.onCleanUp();
        if (this.isClearScreen) {
            trackLeaveClearScreen();
        }
        if (hjr.o()) {
            o3s.b(TAG, "full screen clean up");
            cleanBizManager();
            uninstallMessageListener();
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.o() == null)) {
            this.mFrameContext.o().clear();
        }
        List<Runnable> list = this.preInflateRunnables;
        if (list != null) {
            for (Runnable runnable : list) {
                this.workerHandler.removeCallbacks(runnable);
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8dfcefe2", new Object[]{this, view});
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame
    public void onCreateView(ViewStub viewStub) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3782edd", new Object[]{this, viewStub});
        } else if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.taolive_frame_live_flexalocal);
            this.mContainer = viewStub.inflate();
            initAll();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponent, com.taobao.taolive.sdk.controller.IComponentLifeCycle2, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDataReceived(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b420d76a", new Object[]{this, tBLiveDataModel});
            return;
        }
        super.onDataReceived(tBLiveDataModel);
        if (hjr.o()) {
            m09.e().j();
            o3s.b(TAG, "full screen data received");
            initKMPBizManager(tBLiveDataModel);
            initKMPMessageListener();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDestroy() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        idu o = idu.o();
        ux9 ux9Var = this.mFrameContext;
        if (ux9Var != null) {
            str = ux9Var.p();
        } else {
            str = null;
        }
        o.l(str);
        kyd kydVar = this.mKeyboardLayout;
        if (kydVar != null) {
            kydVar.onDestory();
            this.mKeyboardLayout = null;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null) {
            passEventViewPager.setAdapter(null);
        }
        SimpleAdapter simpleAdapter = this.simpleAdapter;
        if (simpleAdapter != null) {
            simpleAdapter.h();
            this.simpleAdapter = null;
        }
        clearComponents();
        jyw jywVar = this.weakHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
        sjr.g().b(this);
        m.a();
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("914171dc", new Object[]{this});
            return;
        }
        super.onDidAppear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen did appear");
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b505106a", new Object[]{this});
            return;
        }
        o3s.b(TAG, "full screen did disappear");
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen trigger kmp did disappear");
            d9m.f().viewDidDisappear();
        }
        super.onDidDisappear();
        idu o = idu.o();
        ux9 ux9Var = this.mFrameContext;
        o.l(ux9Var != null ? ux9Var.p() : null);
        jyw jywVar = this.weakHandler;
        if (jywVar != null) {
            jywVar.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        if (hjr.o() && d9m.f() != null) {
            o3s.b(TAG, "full screen onPause");
            d9m.f().viewWillDisappear();
            d9m.f().viewDidDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (hjr.o() && d9m.f() != null) {
            o3s.b(TAG, "full screen onResume");
            d9m.f().viewWillAppear();
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25aa9f6b", new Object[]{this});
            return;
        }
        super.onViewHolderDidAppear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderDidAppear");
            d9m.f().viewDidAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderDidDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70b1c47b", new Object[]{this});
            return;
        }
        super.onViewHolderDidDisappear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderDidDisappear");
            d9m.f().viewDidDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea9f191e", new Object[]{this});
            return;
        }
        super.onViewHolderWillAppear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderWillAppear");
            d9m.f().viewWillAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.taolive.sdk.controller.IComponentLifeCycle2
    public void onViewHolderWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4e9009e8", new Object[]{this});
            return;
        }
        super.onViewHolderWillDisappear();
        if (canTriggerKmpLifecycleWithConsistent() && d9m.f() != null) {
            o3s.b(TAG, "full screen onViewHolderWillDisappear");
            d9m.f().viewWillDisappear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillAppear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1e294cd", new Object[]{this});
            return;
        }
        super.onWillAppear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen will appear");
            d9m.f().viewWillAppear();
        }
    }

    @Override // com.taobao.alilive.aliliveframework.frame.BaseFrame, com.taobao.alilive.aliliveframework.frame.IComponentLifeCycle
    public void onWillDisappear() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("94a63bd9", new Object[]{this});
            return;
        }
        super.onWillDisappear();
        if (canTriggerKmpLifecycleWithOld() && d9m.f() != null) {
            o3s.b(TAG, "full screen will disappear");
            d9m.f().viewWillDisappear();
        }
    }

    @Override // tb.m8c
    public void setBackView(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f84967d", new Object[]{this, view});
            return;
        }
        PassEventViewPager passEventViewPager = this.mViewPager;
        if (passEventViewPager != null) {
            passEventViewPager.setBackView(view);
        }
    }

    public void setUpView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("eaf59269", new Object[]{this});
            return;
        }
        idu.o().k(this.mContext, this.mFrameContext);
        VideoInfo c0 = up6.c0(this.mFrameContext);
        if (c0 != null && c0.broadCaster != null) {
            this.mLiveDetailData = c0;
            if (!hjr.O() && nh4.p()) {
                initInteractBizCenter();
            }
            initTopBar();
            initBottomBar();
            initNewBottomGuide();
            initRoomWatermark(c0);
            initTBLiveXBackFrame();
            if (yiv.a()) {
                initGoodsListFrameAsync();
            } else {
                initGoodListFrame();
            }
            showByStatus();
            initMediaPlatform();
            if (!enableWarmMockHideH5() && !up6.A0(this.mFrameContext)) {
                initH5Container();
            }
            initInteractPanel(null);
            initPrivateVip();
            initInteractiveRightComponent();
            initUserTask();
            initRank();
        }
    }

    public abstract void showByStatus();

    public void trackEnterClearScreen() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("28a3bd13", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        if (this.mIsSwipeClearScreen) {
            str = "slide";
        } else {
            str = "click";
        }
        hashMap.put("interact_type", str);
        if (giv.f() != null) {
            giv.f().p(this.mFrameContext, "clear_screen_enter", hashMap);
        }
    }

    public void trackLeaveClearScreen() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931edb54", new Object[]{this});
            return;
        }
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("duration", String.valueOf(SystemClock.elapsedRealtime() - this.mEnterClearScreenTime));
        if (this.mIsSwipeClearScreen) {
            str = "slide";
        } else {
            str = "click";
        }
        hashMap.put("interact_type", str);
        if (giv.f() != null) {
            giv.f().p(this.mFrameContext, "clear_screen_leave", hashMap);
        }
    }

    private void showInitInteractPanel() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4892d4c8", new Object[]{this});
            return;
        }
        if (giv.f() != null) {
            giv.f().n(this.mFrameContext, "morefunction", new String[0]);
        }
        ux9 ux9Var = this.mFrameContext;
        if (!(ux9Var == null || ux9Var.A() == null)) {
            this.mFrameContext.A().accessListener(AccessListenerEnum.onFloatViewShow, new Object[0]);
        }
        BaseFrame baseFrame = this.mInteractPanelFrame;
        if (baseFrame != null) {
            baseFrame.show();
        } else {
            initInteractPanel(new c());
        }
    }

    public boolean fromUpDownSwitch() {
        Map<String, String> map;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("2fb1746", new Object[]{this})).booleanValue();
        }
        TBLiveDataModel tBLiveDataModel = this.mLiveDataModel;
        if (tBLiveDataModel == null || (map = tBLiveDataModel.mInitParams) == null) {
            return false;
        }
        return "updownswitch".equalsIgnoreCase(map.get("livesource"));
    }

    @Override // tb.m8c
    public Object getControllerHolder(ViewGroup viewGroup) {
        FrameLayout playerControllerView;
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ipChange.ipc$dispatch("598b610e", new Object[]{this, viewGroup});
        }
        if (this.mFrontView == null || (playerControllerView = getPlayerControllerView()) == null) {
            return null;
        }
        playerControllerView.removeAllViews();
        playerControllerView.setVisibility(0);
        LayoutInflater from = LayoutInflater.from(this.mContext);
        int i3 = R.layout.taolive_replay_progress_bar_flexalocal;
        if (viewGroup == null) {
            viewGroup = playerControllerView;
        }
        ViewGroup viewGroup2 = (ViewGroup) from.inflate(i3, viewGroup);
        qr4 qr4Var = new qr4();
        qr4Var.f26892a = viewGroup2.findViewById(R.id.taolive_video_bar);
        qr4Var.c = (ImageView) viewGroup2.findViewById(R.id.taolive_video_enter_btn);
        qr4Var.d = (TextView) viewGroup2.findViewById(R.id.taolive_video_total_view);
        qr4Var.e = (TextView) viewGroup2.findViewById(R.id.taolive_video_time_view);
        qr4Var.f = (SeekBar) viewGroup2.findViewById(R.id.taolive_video_seekbar);
        qr4Var.i = R.drawable.taolive_video_play;
        qr4Var.j = R.drawable.taolive_video_pause;
        qr4Var.h = (TextView) this.mFrontView.findViewById(R.id.taolive_controller_playrate_icon);
        if (!v2s.o().I("videoRate")) {
            qr4Var.h.setVisibility(8);
        } else {
            TextView textView = qr4Var.h;
            if (!lvs.k()) {
                i2 = 8;
            }
            textView.setVisibility(i2);
        }
        if (giv.f() != null) {
            giv.f().p(this.mFrameContext, "Show-MultiSpeed", null);
        }
        return qr4Var;
    }

    public void initFrontView() {
        int i2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("db9072c5", new Object[]{this});
            return;
        }
        cwd A = v2s.o().A();
        if (this.mLandscape) {
            i2 = R.layout.taolive_video_content_land_flexalocal;
        } else {
            i2 = R.layout.taolive_video_content_new_flexalocal;
        }
        ConcurrentHashMap<Integer, View> concurrentHashMap = m.sCachedPool;
        if (concurrentHashMap.containsKey(Integer.valueOf(i2))) {
            View view = concurrentHashMap.get(Integer.valueOf(i2));
            if (view == null || this.mContext != view.getContext()) {
                A.c("FullScreenViewPreCache", "没有缓存 inflate ");
                this.mFrontView = LayoutInflater.from(this.mContext).inflate(i2, (ViewGroup) null);
            } else {
                this.mFrontView = concurrentHashMap.remove(Integer.valueOf(i2));
                A.c("FullScreenViewPreCache", "front View  使用预创建");
            }
        } else {
            A.c("FullScreenViewPreCache", "没有缓存 inflate ");
            this.mFrontView = LayoutInflater.from(this.mContext).inflate(i2, (ViewGroup) null);
        }
        if (!this.mLandscape) {
            ViewGroup viewGroup = (ViewGroup) this.mFrontView.findViewById(R.id.views_under_topbar);
            if (viewGroup != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) viewGroup.getLayoutParams();
                marginLayoutParams.topMargin = hw0.b(this.mContext, 0.0f);
                viewGroup.setLayoutParams(marginLayoutParams);
            }
            View findViewById = this.mFrontView.findViewById(R.id.taolive_left_top_container);
            if (findViewById != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) findViewById.getLayoutParams();
                marginLayoutParams2.topMargin = hw0.b(this.mContext, 8.0f);
                findViewById.setLayoutParams(marginLayoutParams2);
            }
            View findViewById2 = this.mFrontView.findViewById(R.id.taolive_more_live_guide_stub);
            if (findViewById2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                marginLayoutParams3.topMargin = 0;
                findViewById2.setLayoutParams(marginLayoutParams3);
            }
        }
        this.mFrontView.setSoundEffectsEnabled(false);
        ArrayList arrayList = new ArrayList();
        int i3 = R.layout.taolive_video_content_land_flexalocal;
        if (!concurrentHashMap.containsKey(Integer.valueOf(i3))) {
            arrayList.add(Integer.valueOf(i3));
        }
        int i4 = R.layout.taolive_video_content_new_flexalocal;
        if (!concurrentHashMap.containsKey(Integer.valueOf(i4))) {
            arrayList.add(Integer.valueOf(i4));
        }
        this.preInflateRunnables = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Runnable convertResIdToRunnable = convertResIdToRunnable(((Integer) it.next()).intValue());
            this.preInflateRunnables.add(convertResIdToRunnable);
            this.workerHandler.postDelayed(convertResIdToRunnable, 2000L);
        }
        View view2 = this.mFrontView;
        if (view2 != null) {
            View findViewById3 = view2.findViewById(R.id.taolive_room_top_mask);
            View findViewById4 = this.mFrontView.findViewById(R.id.taolive_comment_mask);
            if (this.mContext != null && findViewById3 != null && findViewById4 != null && (findViewById3.getBackground() instanceof GradientDrawable) && (findViewById4.getBackground() instanceof GradientDrawable)) {
                GradientDrawable gradientDrawable = (GradientDrawable) findViewById4.getBackground().mutate();
                gradientDrawable.setSize(findViewById4.getWidth(), hw0.b(this.mContext, 270.0f));
                ((GradientDrawable) findViewById3.getBackground().mutate()).setColors(new int[]{-2146363091, 1120557});
                gradientDrawable.setColors(new int[]{1120557, 1276188973});
            }
        }
    }

    private void initKMPBizManager(TBLiveDataModel tBLiveDataModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e0ea298", new Object[]{this, tBLiveDataModel});
        } else if (d9m.f() == null) {
            o3s.b(TAG, "initKMPBizManager error");
        } else {
            o3s.b(TAG, "initKMPBizManager");
            d9m.f().install("");
            czs mapKtDetailModelWithNativeDetailModel = mapKtDetailModelWithNativeDetailModel(tBLiveDataModel);
            d9m.f().updateUpDownSwitchModel(getKtSwitchModel());
            d9m.f().updateLiveDetail(mapKtDetailModelWithNativeDetailModel);
            d9m.f().updateLiveUtManager(giv.e());
            if (this.mFrameContext.J()) {
                d9m.f().onScreenOrientationChanged(true ^ this.mLandscape);
                this.mFrameContext.j0(false);
            }
        }
    }

    private czs mapKtDetailModelWithNativeDetailModel(TBLiveDataModel tBLiveDataModel) {
        VideoInfo videoInfo;
        String str;
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (czs) ipChange.ipc$dispatch("55e7138e", new Object[]{this, tBLiveDataModel});
        }
        czs czsVar = new czs();
        if (!(tBLiveDataModel == null || (videoInfo = tBLiveDataModel.mVideoInfo) == null)) {
            czsVar.Q(videoInfo.liveId);
            czsVar.K(up6.r(this.mFrameContext));
            czsVar.Y(tBLiveDataModel.mVideoInfo.roomStatus);
            czsVar.a0(tBLiveDataModel.mVideoInfo.topic);
            JSONObject jSONObject = tBLiveDataModel.mVideoInfo.originalData;
            czsVar.E(jSONObject.getJSONObject("broadCaster"));
            VideoInfo.OfficialLiveInfo officialLiveInfo = tBLiveDataModel.mVideoInfo.officialLiveInfo;
            if (officialLiveInfo != null) {
                czsVar.T(officialLiveInfo.officialLive);
                czsVar.V(officialLiveInfo.officialLiveTopic);
            }
            JSONArray jSONArray = jSONObject.getJSONArray("conventionList");
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < jSONArray.size(); i2++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i2);
                HashMap hashMap = new HashMap();
                for (String str2 : jSONObject2.keySet()) {
                    hashMap.put(str2, jSONObject2.getString(str2));
                }
                arrayList.add(hashMap);
            }
            czsVar.I(arrayList);
            czsVar.U(jSONObject.getJSONObject("officialLiveInfo"));
            czsVar.S(tBLiveDataModel.mVideoInfo.location);
            czsVar.R(tBLiveDataModel.mVideoInfo.liveIntroduction);
            czsVar.X(tBLiveDataModel.mVideoInfo.recommendReason);
            czsVar.P(tBLiveDataModel.mVideoInfo.itemNoBeauty);
            czsVar.F(tBLiveDataModel.mVideoInfo.closeAddOneComment);
            czsVar.b0(cpr.J);
            czsVar.M(tBLiveDataModel.mVideoInfo.fetchCommentsUseLMSDK);
            czsVar.O(tBLiveDataModel.mVideoInfo.fetchCommentsUseMtop);
            czsVar.c0(tBLiveDataModel.mVideoInfo.forceCommentsUseCdn);
            if (tBLiveDataModel.mVideoInfo.commentSwitchStatus == 0) {
                z = true;
            }
            czsVar.G(z);
            czsVar.Z(tBLiveDataModel.mVideoInfo.secretUserId);
            czsVar.W(tBLiveDataModel.mVideoInfo.originalData);
            VideoInfo.AdmireInfo admireInfo = tBLiveDataModel.mVideoInfo.admireInfo;
            if (admireInfo != null) {
                czsVar.H(admireInfo.contributionEnabled);
            }
            AccountInfo accountInfo = tBLiveDataModel.mVideoInfo.broadCaster;
            if (accountInfo != null) {
                czsVar.D(accountInfo.accountId);
                czsVar.J(tBLiveDataModel.mVideoInfo.broadCaster.encodeAccountId);
            }
            czsVar.W(tBLiveDataModel.mVideoInfo.originalData);
            if (!(getFrameContext() == null || getFrameContext().D() == null || (str = getFrameContext().D().get(yj4.PARAM_INTENT_URL)) == null)) {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("isFromRankNotice");
                String queryParameter2 = parse.getQueryParameter("trackId");
                String queryParameter3 = parse.getQueryParameter("trackName");
                HashMap hashMap2 = new HashMap();
                hashMap2.put("isFromRankNotice", queryParameter);
                hashMap2.put("trackId", queryParameter2);
                hashMap2.put("trackName", queryParameter3);
                czsVar.L(hashMap2);
            }
        }
        return czsVar;
    }

    public void onEvent(String str, Object obj) {
        int i2 = 0;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c3897928", new Object[]{this, str, obj});
            return;
        }
        int c2 = rgd.b().c(IRRoomProxy.R_ID_TAOLIVE_CLOSE_BTN);
        if (EVENT_PREVIEW_VIDEO_NORMAL_SCREEN.equals(str)) {
            if (this.mContainer.findViewById(c2) != null) {
                this.mContainer.findViewById(c2).setVisibility(0);
            }
        } else if (EVENT_PREVIEW_VIDEO_FULL_SCREEN.equals(str)) {
            if (this.mContainer.findViewById(c2) != null) {
                this.mContainer.findViewById(c2).setVisibility(8);
            }
        } else if (EVENT_TOPBAR_CLICK_AVATAR.equals(str)) {
            try {
                showAccountInfo();
            } catch (Exception e2) {
                o3s.b(TAG, e2.getMessage());
            }
        } else if (EVENT_SHOW_SCREEN_RECORD_BTN_FRAME.equals(str)) {
            showInitInteractPanel();
        } else if (EVENT_ENABLE_LEFTRIGHT_SWITCH.equals(str)) {
            PassEventViewPager passEventViewPager = this.mViewPager;
            if (passEventViewPager != null) {
                passEventViewPager.setCanScroll(true);
            }
        } else if (EVENT_DISABLE_LEFTRIGHT_SWITCH.equals(str)) {
            PassEventViewPager passEventViewPager2 = this.mViewPager;
            if (passEventViewPager2 != null) {
                passEventViewPager2.setCanScroll(false);
            }
        } else if (TextUtils.equals(str, EVENT_TAOLIVE_ROOM_CLEAR_SCREEN)) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            this.isClearScreen = booleanValue;
            PassEventViewPager passEventViewPager3 = this.mViewPager;
            if (booleanValue) {
                i2 = 4;
            }
            passEventViewPager3.setVisibility(i2);
            if (this.isClearScreen) {
                this.mEnterClearScreenTime = SystemClock.elapsedRealtime();
                trackEnterClearScreen();
                return;
            }
            trackLeaveClearScreen();
        } else if (uyg.EVENT_SHOW_QA.equals(str)) {
            if (obj instanceof String) {
                showQAH5(obj.toString());
            }
        } else if (uyg.EVENT_SCREEN_ORIENTATION_CHANGED.equals(str) && (obj instanceof String) && hjr.o()) {
            this.mFrameContext.j0(true);
        }
    }
}
