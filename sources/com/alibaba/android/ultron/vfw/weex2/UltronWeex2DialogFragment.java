package com.alibaba.android.ultron.vfw.weex2;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.android.ultron.vfw.weex2.a;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.model.UltronTradeHybridInstanceRenderMode;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.utils.UltronTradeHybridSwitcherHelper;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment;
import com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.UltronTradeHybridActivity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.autosize.TBDeviceUtils;
import com.taobao.android.nav.Nav;
import com.taobao.android.ultron.common.utils.UnifyLog;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.common.MUSEventTarget;
import com.taobao.tao.Globals;
import com.taobao.tao.tbmainfragment.ISupportFragment;
import com.taobao.taobao.R;
import com.taobao.weex.common.Constants;
import com.ut.mini.UTAnalytics;
import com.ut.mini.UTTracker;
import java.util.Map;
import tb.dbv;
import tb.dde;
import tb.h15;
import tb.h6e;
import tb.hav;
import tb.kbv;
import tb.lbv;
import tb.mbv;
import tb.nbf;
import tb.nbv;
import tb.npc;
import tb.obv;
import tb.pce;
import tb.qbv;
import tb.qxq;
import tb.t2o;
import tb.v9v;
import tb.vu3;
import tb.wbl;
import tb.xcv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class UltronWeex2DialogFragment extends TradeHybridBaseFragment implements xcv {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_NAME = "bizName";
    public static final String BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_ACTION = "ultron.hybrid.dialog.downgrade";
    public static final String BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_PAGE = "ultronHybridDialogDowngradePage";
    public static final String CONTAINER_BIZ_NAME = "containerBizName";
    public static final String CONTAINER_RES_ID = "containerResId";
    public static final String EXPECT_HEIGHT = "expectHeight";
    public static final String EXPECT_WIDTH = "expectWidth";
    public static final String FRAGMENT_TAG = "UltronWeex2DialogFragment";
    public static final String IS_INSTANCE_REUSE = "isInstanceReuse";
    public static final String IS_PRE_RENDER = "isPreRender";
    public static final String WEEX2_URL = "weex2Url";
    public com.taobao.android.weex_framework.a c;
    public FrameLayout d;
    public String e;
    public String f;
    public String g;
    public String h;
    public int k;
    public int l;
    public int m;
    public UltronWeex2DataPrefetchCache s;
    public kbv v;
    public BroadcastReceiver y;
    public boolean i = false;
    public boolean j = false;
    public boolean n = false;
    public boolean o = false;
    public boolean p = false;
    public boolean q = false;
    public long r = 0;
    public final JSONObject t = new JSONObject();
    public final JSONObject u = new JSONObject();
    public boolean w = false;
    public boolean x = false;
    public boolean z = false;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class a implements npc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // tb.npc
        public void onDestroyed(MUSDKInstance mUSDKInstance) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
            }
        }

        @Override // tb.npc
        public void onPrepareSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("27a2635b", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
            }
        }

        @Override // tb.npc
        public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
                return;
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
            ultronWeex2DialogFragment.n = true;
            ultronWeex2DialogFragment.r3(UltronWeex2DialogFragment.r2(ultronWeex2DialogFragment));
        }

        @Override // tb.npc
        public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
                return;
            }
            StringBuilder sb = new StringBuilder("onJSException,errorType:");
            sb.append(i);
            sb.append(" errorMsg:");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            UnifyLog.e("UltronWeex2DialogFragment.IMUSRenderListener", sb.toString());
            UltronWeex2DialogFragment.this.o = true;
        }

        @Override // tb.npc
        public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("onRefreshFailed,errorType:");
            sb.append(i);
            sb.append(" errorMsg:");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(" fatal:");
            sb.append(z);
            UnifyLog.e("UltronWeex2DialogFragment.IMUSRenderListener", sb.toString());
            UltronWeex2DialogFragment.this.o = true;
        }

        @Override // tb.npc
        public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
                return;
            }
            StringBuilder sb = new StringBuilder("onRenderFailed,errorType:");
            sb.append(i);
            sb.append(" errorMsg:");
            if (str == null) {
                str = "";
            }
            sb.append(str);
            sb.append(" fatal:");
            sb.append(z);
            UnifyLog.e("UltronWeex2DialogFragment.IMUSRenderListener", sb.toString());
            UltronWeex2DialogFragment.this.o = true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class b implements a.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.alibaba.android.ultron.vfw.weex2.a.d
        public void a(String str, com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c747c99a", new Object[]{this, str, aVar});
            } else if (TextUtils.isEmpty(str) || aVar == null) {
                hav.g(UltronWeex2DialogFragment.FRAGMENT_TAG, "rebuildInstanceByPreRender:", "onInstanceCreatedInMain callback is invalid");
            } else if (!UltronWeex2DialogFragment.this.A2(aVar)) {
                hav.g(UltronWeex2DialogFragment.FRAGMENT_TAG, "rebuildInstanceByPreRender:", "onInstanceCreatedInMain container is invalid");
            } else {
                UltronWeex2DialogFragment.this.z3(aVar);
                UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                ultronWeex2DialogFragment.r3(UltronWeex2DialogFragment.r2(ultronWeex2DialogFragment));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class c implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
                return;
            }
            hav.g(UltronWeex2DialogFragment.FRAGMENT_TAG, "setupWeex2GestureListener:", "onGestureEvent:" + map);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f2363a;
        public String b;
        public String c;
        public com.taobao.android.weex_framework.a d;
        public boolean e = false;
        public boolean f = false;
        public int g;
        public int h;
        public int i;

        static {
            t2o.a(157286790);
        }

        public UltronWeex2DialogFragment a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (UltronWeex2DialogFragment) ipChange.ipc$dispatch("5bff747b", new Object[]{this});
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment = new UltronWeex2DialogFragment();
            ultronWeex2DialogFragment.y3(this.d);
            Bundle bundle = new Bundle();
            bundle.putString("bizName", this.f2363a);
            bundle.putString(UltronWeex2DialogFragment.CONTAINER_BIZ_NAME, this.b);
            bundle.putString(UltronWeex2DialogFragment.WEEX2_URL, this.c);
            bundle.putBoolean("isPreRender", this.e);
            bundle.putBoolean(UltronWeex2DialogFragment.IS_INSTANCE_REUSE, this.f);
            bundle.putInt(UltronWeex2DialogFragment.CONTAINER_RES_ID, this.g);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_WIDTH, this.h);
            bundle.putInt(UltronWeex2DialogFragment.EXPECT_HEIGHT, this.i);
            ultronWeex2DialogFragment.setArguments(bundle);
            ultronWeex2DialogFragment.init();
            return ultronWeex2DialogFragment;
        }

        public e b(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("2f5d886c", new Object[]{this, str});
            }
            this.f2363a = str;
            return this;
        }

        public e c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("3549f7c9", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public e d(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("5edcf419", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public e e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("da0e809f", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public e f(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("98361de8", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public e g(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("e25e7c69", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public e h(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("93a817a3", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public e i(com.taobao.android.weex_framework.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("a826fbef", new Object[]{this, aVar});
            }
            this.d = aVar;
            return this;
        }

        public e j(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (e) ipChange.ipc$dispatch("abf3c888", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }
    }

    static {
        t2o.a(157286783);
        t2o.a(157286791);
        t2o.a(157286773);
    }

    public static /* synthetic */ Object ipc$super(UltronWeex2DialogFragment ultronWeex2DialogFragment, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1589549411:
                super.onAttach((Context) objArr[0]);
                return null;
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 797441118:
                super.onPause();
                return null;
            case 2127624665:
                super.onDetach();
                return null;
            case 2133689546:
                super.onStart();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/UltronWeex2DialogFragment");
        }
    }

    public static /* synthetic */ JSONObject r2(UltronWeex2DialogFragment ultronWeex2DialogFragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("cb7d1811", new Object[]{ultronWeex2DialogFragment});
        }
        return ultronWeex2DialogFragment.Q2();
    }

    public static /* synthetic */ boolean s2(UltronWeex2DialogFragment ultronWeex2DialogFragment, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fff3d624", new Object[]{ultronWeex2DialogFragment, new Boolean(z)})).booleanValue();
        }
        ultronWeex2DialogFragment.z = z;
        return z;
    }

    public void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("677091ea", new Object[]{this});
            return;
        }
        if (!this.j && this.c != null) {
            C2();
        }
        l3(Globals.getApplication());
    }

    public void B3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("945f5c22", new Object[]{this, str});
        } else {
            this.h = str;
        }
    }

    public void C3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c10df071", new Object[]{this, str});
        } else {
            this.g = str;
        }
    }

    public void E2(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab765749", new Object[]{this, activity});
        } else if (!(activity instanceof FragmentActivity)) {
            hav.g(FRAGMENT_TAG, "dismissByActivity:", "activity is not a FragmentActivity");
        } else {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            Fragment findFragmentByTag = fragmentActivity.getSupportFragmentManager().findFragmentByTag(FRAGMENT_TAG);
            if (this != findFragmentByTag) {
                hav.g(FRAGMENT_TAG, "dismissByActivity:", "fragment is not this fragment");
            } else if (!z2(fragmentActivity)) {
                hav.g(FRAGMENT_TAG, "dismissByActivity:", "container is invalid");
            } else {
                ((UltronWeex2DialogFragment) findFragmentByTag).dismiss();
            }
        }
    }

    public void E3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2965d1b", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            UnifyLog.e("UltronWeex2DialogFragment.showFragmentContainer", "activity is null");
            return;
        }
        View findViewById = activity.findViewById(this.k);
        if (findViewById == null) {
            UnifyLog.e("UltronWeex2DialogFragment.showFragmentContainer", "container is null");
        } else {
            findViewById.setVisibility(0);
        }
    }

    public void F3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("933b48e8", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.setTag("bizLifecycleListener", "");
        }
    }

    public void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("45c6392", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.setTag("tradePrefetchCache", "");
        }
    }

    public void J2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5cacafae", new Object[]{this});
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            UnifyLog.e("UltronWeex2DialogFragment.dismissFragmentContainer", "activity is null");
            return;
        }
        View findViewById = activity.findViewById(this.k);
        if (findViewById == null) {
            UnifyLog.e("UltronWeex2DialogFragment.dismissFragmentContainer", "container is null");
        } else {
            findViewById.setVisibility(8);
        }
    }

    public void K2(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f30181", new Object[]{this, activity});
        } else {
            M2(activity, null);
        }
    }

    public JSONObject O2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("a872eb48", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.putAll(this.t);
        return jSONObject;
    }

    public final JSONObject Q2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("83dbc9fd", new Object[]{this});
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = this.u;
        if (jSONObject2 != null && !jSONObject2.isEmpty()) {
            jSONObject.putAll(this.u);
        }
        return jSONObject;
    }

    public UltronWeex2DataPrefetchCache R2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (UltronWeex2DataPrefetchCache) ipChange.ipc$dispatch("3aa66c89", new Object[]{this});
        }
        return this.s;
    }

    @Override // tb.xcv
    public void S() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1a730856", new Object[]{this});
            return;
        }
        this.p = true;
        JSONObject O2 = O2();
        if (!O2.isEmpty()) {
            p3(O2);
        }
    }

    public com.taobao.android.weex_framework.a S2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("83131ca4", new Object[]{this});
        }
        return this.c;
    }

    public String T2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("39ed72d4", new Object[]{this});
        }
        return this.h;
    }

    public String U2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e0b73ea5", new Object[]{this});
        }
        return this.g;
    }

    public boolean W2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea044c95", new Object[]{this})).booleanValue();
        }
        return this.p;
    }

    public boolean X2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b2d58ae3", new Object[]{this})).booleanValue();
        }
        return this.q;
    }

    public boolean a3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f660326a", new Object[]{this})).booleanValue();
        }
        return this.o;
    }

    public boolean b3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("dff279be", new Object[]{this})).booleanValue();
        }
        return this.n;
    }

    public boolean c3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b8825494", new Object[]{this})).booleanValue();
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar == null || aVar.isDestroyed()) {
            return true;
        }
        return false;
    }

    public boolean d3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c4bb7b70", new Object[]{this})).booleanValue();
        }
        if (!UltronTradeHybridSwitcherHelper.INSTANCE.o() || !mbv.a(this.g, dbv.PRE_RENDER_URL_LOGISTICS)) {
            return false;
        }
        return true;
    }

    public void doDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e637df6", new Object[]{this});
            return;
        }
        if (!this.j && this.c != null) {
            C2();
        }
        l3(getContext());
    }

    public final void e3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68e62c98", new Object[]{this, aVar});
            return;
        }
        this.n = false;
        this.o = false;
        this.p = false;
        this.c = aVar;
        m3();
        u2();
        v2();
        o3();
    }

    public boolean f3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("bbda90cf", new Object[]{this})).booleanValue();
        }
        return true ^ (getActivity() instanceof UltronTradeHybridActivity);
    }

    public boolean g3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4b52edce", new Object[]{this})).booleanValue();
        }
        return this.w;
    }

    public final void j3(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a209f72", new Object[]{this, new Boolean(z)});
        } else if (!UltronTradeHybridSwitcherHelper.c() || getContext() == null) {
        } else {
            if (z) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_ACTION);
                this.y = new BroadcastReceiver() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.6
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    public static /* synthetic */ Object ipc$super(AnonymousClass6 r2, String str, Object... objArr) {
                        str.hashCode();
                        int hashCode = str.hashCode();
                        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/android/ultron/vfw/weex2/UltronWeex2DialogFragment$6");
                    }

                    @Override // android.content.BroadcastReceiver
                    public void onReceive(Context context, Intent intent) {
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                        } else if (intent != null) {
                            try {
                                if (TextUtils.equals(intent.getAction(), UltronWeex2DialogFragment.BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_ACTION)) {
                                    UltronWeex2DialogFragment.s2(UltronWeex2DialogFragment.this, true);
                                    UltronWeex2DialogFragment.this.dismissAllowingStateLoss();
                                }
                                if (UltronWeex2DialogFragment.this.y != null) {
                                    LocalBroadcastManager.getInstance(context).unregisterReceiver(UltronWeex2DialogFragment.this.y);
                                    UltronWeex2DialogFragment.this.y = null;
                                }
                            } catch (Throwable th) {
                                h15 success = nbv.a.a("FragmentDowngradeError").success(false);
                                nbv.a(success.message("降级失败：" + th.toString()).sampling(1.0f));
                            }
                        }
                    }
                };
                LocalBroadcastManager.getInstance(getContext()).registerReceiver(this.y, intentFilter);
            } else if (this.y != null) {
                LocalBroadcastManager.getInstance(getContext()).unregisterReceiver(this.y);
                this.y = null;
            }
        }
    }

    public void k3(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("912fb6e2", new Object[]{this, context});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar == null) {
            UnifyLog.e("UltronWeex2DialogFragment.rebindContext", "mWeex2Instance is null");
        } else {
            aVar.resetContext(context);
        }
    }

    public void m3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe85bf4", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar == null) {
            UnifyLog.e("UltronWeex2DialogFragment.registerRenderListener", "mWeex2Instance is null");
        } else {
            aVar.registerRenderListener(new a());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0040, code lost:
        if ((r5 + ",errorMsg:" + r6) == null) goto L_0x002a;
     */
    @Override // tb.xcv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void n0(java.lang.String r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 0
            com.android.alibaba.ip.runtime.IpChange r1 = com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.$ipChange
            boolean r2 = r1 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r2 == 0) goto L_0x0018
            java.lang.String r2 = "1435fd2c"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r0] = r4
            r0 = 1
            r3[r0] = r5
            r5 = 2
            r3[r5] = r6
            r1.ipc$dispatch(r2, r3)
            return
        L_0x0018:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "errorCode:"
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = ""
            if (r1 != 0) goto L_0x002c
        L_0x002a:
            r6 = r2
            goto L_0x0043
        L_0x002c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r5)
            java.lang.String r5 = ",errorMsg:"
            r1.append(r5)
            r1.append(r6)
            java.lang.String r5 = r1.toString()
            if (r5 != 0) goto L_0x0043
            goto L_0x002a
        L_0x0043:
            java.lang.String[] r5 = new java.lang.String[]{r6}
            java.lang.String r6 = "UltronWeex2DialogFragment.onBizFailed"
            com.taobao.android.ultron.common.utils.UnifyLog.e(r6, r5)
            r4.p = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.n0(java.lang.String, java.lang.String):void");
    }

    public void n3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("322f8711", new Object[]{this});
        } else if (this.c != null && d3()) {
            this.c.setTag("tradeHostFragment", "");
            qbv.j().n().y(this.g);
        }
    }

    public void o3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbcc1b9b", new Object[]{this});
        } else if (this.c != null && d3()) {
            this.c.setTag("tradeHostFragment", this);
            qbv.j().n().b(this.g, this.c);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("bcd5231c", new Object[]{this, layoutInflater, viewGroup, bundle});
        }
        this.d = (FrameLayout) layoutInflater.inflate(R.layout.ultron_weex2_dialog_fragment_layout, viewGroup, false);
        com.taobao.android.weex_framework.a aVar = this.c;
        if (!(aVar == null || aVar.getRenderRoot() == null)) {
            View renderRoot = this.c.getRenderRoot();
            ViewGroup viewGroup2 = (ViewGroup) renderRoot.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(renderRoot);
            }
            this.d.addView(renderRoot);
            D3();
        }
        u3();
        x3();
        return this.d;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        doDestroy();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDetach() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ed0f9d9", new Object[]{this});
            return;
        }
        super.onDetach();
        J2();
        this.q = false;
        kbv kbvVar = this.v;
        if (kbvVar != null) {
            kbvVar.a(this, this.c);
        }
        if (!h3()) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            FragmentActivity activity = getActivity();
            if (TextUtils.isEmpty(this.f)) {
                str = "";
            } else {
                str = this.f;
            }
            defaultTracker.updatePageName(activity, str);
        }
        j3(false);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("cb4cc7a6", new Object[]{this, new Integer(i), keyEvent})).booleanValue();
        }
        if (!this.q || i != 4) {
            return false;
        }
        E2(getActivity());
        return true;
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.Fragment
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityPause();
        }
        kbv kbvVar = this.v;
        if (kbvVar != null) {
            kbvVar.b(this, this.c);
        }
        if (!h3()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7f2d84ca", new Object[]{this});
            return;
        }
        super.onStart();
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityStart();
        }
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityStop();
        }
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment
    public String p2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("72d4e50f", new Object[]{this});
        }
        if (TextUtils.isEmpty(U2())) {
            return "";
        }
        return U2();
    }

    public void p3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfad7564", new Object[]{this, jSONObject});
        } else if (!this.i) {
            UnifyLog.e("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "can't send backgroundMessage to a nonPreRender instance");
        } else if (this.c == null) {
            UnifyLog.e("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "mWeex2Instance is null");
        } else if (jSONObject == null) {
            UnifyLog.e("UltronWeex2DialogFragment.sendBackgroundMessageToWeex2", "message is null");
        } else {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("backgroundData", (Object) jSONObject);
            this.c.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
            this.t.putAll(jSONObject);
        }
    }

    public void q3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c1c5241", new Object[]{this, jSONObject});
        } else if (!this.i) {
            hav.g(FRAGMENT_TAG, "sendCustomMessageToWeex2:", "can't send backgroundMessage to a nonPreRender instance");
        } else {
            com.taobao.android.weex_framework.a aVar = this.c;
            if (aVar == null) {
                hav.g(FRAGMENT_TAG, "sendCustomMessageToWeex2:", "mWeex2Instance is null");
            } else if (jSONObject == null) {
                hav.g(FRAGMENT_TAG, "sendCustomMessageToWeex2:", "customMessage is null");
            } else {
                aVar.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject);
            }
        }
    }

    public final void t3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8ffee727", new Object[]{this, jSONObject});
            return;
        }
        JSONObject jSONObject2 = this.u;
        if (jSONObject2 != null) {
            jSONObject2.clear();
            if (jSONObject != null) {
                this.u.putAll(jSONObject);
            }
        }
    }

    public void u2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("83fca9cf", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.setTag("bizLifecycleListener", this);
        }
    }

    public void v2() {
        UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6ee040b", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null && (ultronWeex2DataPrefetchCache = this.s) != null) {
            aVar.setTag("tradePrefetchCache", ultronWeex2DataPrefetchCache);
        }
    }

    public void v3(kbv kbvVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6948ee76", new Object[]{this, kbvVar});
        } else {
            this.v = kbvVar;
        }
    }

    public void w3(UltronWeex2DataPrefetchCache ultronWeex2DataPrefetchCache) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebc1c0ad", new Object[]{this, ultronWeex2DataPrefetchCache});
            return;
        }
        this.s = ultronWeex2DataPrefetchCache;
        v2();
    }

    public final void x3() {
        View findViewById;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18d6042c", new Object[]{this});
        } else if (this.d != null && !TextUtils.isEmpty(this.g) && TextUtils.equals(lbv.e(this.g, "pageType"), "pop") && (findViewById = this.d.findViewById(R.id.dialog_fragment_layout_container)) != null) {
            findViewById.setBackgroundColor(Color.parseColor("#00000000"));
        }
    }

    public void y3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6bfb82b2", new Object[]{this, aVar});
            return;
        }
        if (this.c != null) {
            C2();
        }
        this.n = false;
        this.o = false;
        this.p = false;
        this.c = aVar;
        u2();
        v2();
        o3();
    }

    public void z3(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("da9d7918", new Object[]{this, aVar});
            return;
        }
        if (this.c != null) {
            C2();
        }
        if (aVar == null) {
            hav.g(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "musInstance is null");
            this.c = null;
            return;
        }
        hav.g(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "use musInstance");
        e3(aVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public class d implements pce {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            boolean z = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("267b7fce", new Object[]{this, map});
                return;
            }
            UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
            if (map == null || !"true".equals(String.valueOf(map.get("state")))) {
                z = false;
            }
            ultronWeex2DialogFragment.w = z;
        }
    }

    public void A3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("50b63a2f", new Object[]{this, str});
            return;
        }
        if (this.c != null) {
            C2();
        }
        if (TextUtils.isEmpty(str)) {
            hav.g(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "instanceId is empty");
            this.c = null;
            return;
        }
        hav.g(FRAGMENT_TAG, "setWeex2InstanceByPreRender:", "use instanceId");
        e3(com.alibaba.android.ultron.vfw.weex2.a.g().h(str, true));
    }

    public void C2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("449bdcb3", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar == null) {
            UnifyLog.e("UltronWeex2DialogFragment.destroyWeex2Instance", "mWeex2Instance is null");
        } else if (aVar.isDestroyed()) {
            UnifyLog.e("UltronWeex2DialogFragment.destroyWeex2Instance", "mWeex2Instance already destroyed");
            this.c = null;
        } else {
            F3();
            G3();
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "removeRenderListenerOnDestroy", true)) {
                this.c.removeRenderListener();
            }
            n3();
            this.c.destroy();
            this.c = null;
        }
    }

    public void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3ae0eb0", new Object[]{this});
        } else if (this.c == null) {
            hav.g(FRAGMENT_TAG, "setupWeex2GestureListener:", "mWeex2Instance is null");
        } else {
            if (lbv.q(this.g) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_REFUND_DETAIL, "enablePrintWeexGesture", true)) {
                this.c.setGestureEventListener(new c(this));
            }
            if (TextUtils.equals(lbv.e(this.g, nbf.STDPOP_NAV_MODE), nbf.STDPOP_MODE_VALUE)) {
                this.c.setGestureEventListener(new d());
                this.c.setWeexScrollListener(new dde() { // from class: com.alibaba.android.ultron.vfw.weex2.UltronWeex2DialogFragment.5
                    public static volatile transient /* synthetic */ IpChange $ipChange;

                    @Override // tb.dde
                    public void a(Map<String, Object> map) {
                        boolean z = true;
                        IpChange ipChange2 = $ipChange;
                        if (ipChange2 instanceof IpChange) {
                            ipChange2.ipc$dispatch("4568a0fc", new Object[]{this, map});
                        } else if (map != null && UltronWeex2DialogFragment.this.d != null) {
                            Object obj = map.get(Constants.Name.CONTENT_OFFSET);
                            if (obj instanceof org.json.JSONObject) {
                                UltronWeex2DialogFragment ultronWeex2DialogFragment = UltronWeex2DialogFragment.this;
                                if (((org.json.JSONObject) obj).optDouble("y") >= vu3.b.GEO_NOT_SUPPORT) {
                                    z = false;
                                }
                                ultronWeex2DialogFragment.w = z;
                            }
                        }
                    }
                });
            }
        }
    }

    public void i3(String str, boolean z) {
        String str2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1364bc4d", new Object[]{this, str, new Boolean(z)});
        } else if (TextUtils.isEmpty(str)) {
            hav.g(FRAGMENT_TAG, "onDowngrade:", "params is invalid");
        } else if (z || !UltronTradeHybridSwitcherHelper.c() || getActivity() == null) {
            this.z = true;
            dismissAllowingStateLoss();
            Nav.from(getActivity()).disableTransition().toUri(Uri.parse(str));
        } else {
            Bundle bundle = new Bundle();
            if (TextUtils.isEmpty(this.e)) {
                str2 = "";
            } else {
                str2 = this.e;
            }
            bundle.putString(BROADCAST_ULTRON_HYBRID_DIALOG_DOWNGRADE_PAGE, str2);
            Nav.from(getActivity()).disableTransition().withExtras(bundle).toUri(Uri.parse(str));
        }
    }

    public void init() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fede197", new Object[]{this});
            return;
        }
        Bundle arguments = getArguments();
        this.e = arguments.getString("bizName");
        this.f = arguments.getString(CONTAINER_BIZ_NAME);
        this.g = arguments.getString(WEEX2_URL);
        this.i = arguments.getBoolean("isPreRender", false);
        this.j = arguments.getBoolean(IS_INSTANCE_REUSE, false);
        this.k = arguments.getInt(CONTAINER_RES_ID);
        this.l = arguments.getInt(EXPECT_WIDTH);
        this.m = arguments.getInt(EXPECT_HEIGHT);
        lbv.l();
    }

    public final void l3(Context context) {
        int f;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("faaee6cf", new Object[]{this, context});
        } else if (!this.i) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "can't rebuild instance with nonPreRender");
        } else if (this.j) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "can't rebuild instance with instanceReuse");
        } else if (this.c != null) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "former instance must destroy before rebuild");
        } else if (context == null) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "context is null");
        } else if (TextUtils.isEmpty(this.g)) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "mWeex2Url is empty");
        } else if (D2()) {
            hav.g(FRAGMENT_TAG, "rebuildInstanceByPreRender:", "disableRebuildByHostState");
        } else {
            boolean equals = TextUtils.equals("true", lbv.e(this.g, dbv.QUERY_ASYNC_CREATE_INSTANCE));
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = this.l;
            if (i <= 0) {
                i = displayMetrics.widthPixels;
            }
            int i2 = this.m;
            int i3 = i2 <= 0 ? displayMetrics.heightPixels : i2;
            String str = "default";
            if (mbv.a(this.g, dbv.PRE_RENDER_URL_LOGISTICS)) {
                A3(com.alibaba.android.ultron.vfw.weex2.a.g().e(context, TextUtils.isEmpty(this.e) ? str : this.e, this.g, UltronTradeHybridInstanceRenderMode.UNSPECIFIC, i, i3));
                if (v9v.i(wbl.NEW_BABEL_ORDER, "checkAndDestroyInstance", true) && com.alibaba.android.ultron.vfw.weex2.a.g().c(this.c)) {
                    C2();
                    return;
                }
                return;
            }
            String str2 = UltronTradeHybridInstanceRenderMode.TEXTURE;
            if (!equals) {
                com.alibaba.android.ultron.vfw.weex2.a g = com.alibaba.android.ultron.vfw.weex2.a.g();
                if (!TextUtils.isEmpty(this.e)) {
                    str = this.e;
                }
                A3(g.e(context, str, this.g, UltronTradeHybridSwitcherHelper.k() ? UltronTradeHybridInstanceRenderMode.SURFACE : str2, i, i3));
                if (v9v.i(wbl.NEW_BABEL_ORDER, "checkAndDestroyInstance", true) && com.alibaba.android.ultron.vfw.weex2.a.g().c(this.c)) {
                    C2();
                    return;
                }
                return;
            }
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "useRealDisplayHeight", true) && (f = lbv.f(context)) > 0) {
                i3 = f;
            }
            mbv.b bVar = new mbv.b();
            if (!TextUtils.isEmpty(this.e)) {
                str = this.e;
            }
            mbv.b i4 = bVar.c(str).i(this.g);
            if (UltronTradeHybridSwitcherHelper.k()) {
                str2 = UltronTradeHybridInstanceRenderMode.SURFACE;
            }
            com.alibaba.android.ultron.vfw.weex2.a.g().b(context, i, i3, i4.h(str2).a(), null, new b());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int i, boolean z, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Animation) ipChange.ipc$dispatch("40dfa474", new Object[]{this, new Integer(i), new Boolean(z), new Integer(i2)});
        }
        long f = v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "transitionAnimDuration", 250L);
        if (z) {
            boolean a2 = mbv.a(this.g, dbv.PRE_RENDER_URL_ORDER_DETAIL);
            boolean i3 = v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableOffsetEnterAnim", false);
            TranslateAnimation translateAnimation = new TranslateAnimation(1, 1.0f, 1, 0.0f, 1, 0.0f, 1, 0.0f);
            if (!a2 || !i3) {
                translateAnimation.setDuration(f);
            } else {
                translateAnimation.setStartOffset(v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enterAnimStartOffsetDuration", 50L));
                translateAnimation.setDuration(v9v.f(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enterAnimDuration", 200L));
            }
            return translateAnimation;
        } else if (this.z) {
            return null;
        } else {
            TranslateAnimation translateAnimation2 = new TranslateAnimation(1, 0.0f, 1, 1.0f, 1, 0.0f, 1, 0.0f);
            translateAnimation2.setDuration(f);
            return translateAnimation2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "showFragmentContainerOnResume", true)) {
            E3();
        }
        com.taobao.android.weex_framework.a aVar = this.c;
        if (aVar != null) {
            aVar.onActivityResume();
        }
        if (!h3()) {
            UTAnalytics.getInstance().getDefaultTracker().pageAppearDonotSkip(getActivity());
            UTTracker defaultTracker = UTAnalytics.getInstance().getDefaultTracker();
            FragmentActivity activity = getActivity();
            if (TextUtils.isEmpty(this.e)) {
                str = "";
            } else {
                str = this.e;
            }
            defaultTracker.updatePageName(activity, str);
        }
        kbv kbvVar = this.v;
        if (kbvVar != null) {
            kbvVar.c(this, this.c);
        }
    }

    public void r3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("890d75f", new Object[]{this, jSONObject});
        } else if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableAsyncCreateInstance", false)) {
            hav.g(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "switcher is off");
        } else if (!this.i) {
            hav.g(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "can't send backgroundMessage to a nonPreRender instance");
        } else if (this.c == null) {
            hav.g(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "mWeex2Instance is null");
        } else if (jSONObject == null) {
            hav.g(FRAGMENT_TAG, "sendEarlyMessageToWeex2:", "earlyMsg is null");
        } else if (this.n) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("earlyMessageData", (Object) jSONObject);
            this.c.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.background", jSONObject2);
        } else {
            t3(jSONObject);
        }
    }

    public final void u3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e6736b0", new Object[]{this});
        } else if (this.d != null && !TextUtils.isEmpty(this.g)) {
            if (!mbv.a(this.g, dbv.PRE_RENDER_URL_ORDER_DETAIL) || !v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "setDarkStatusBar", true)) {
                hav.g(FRAGMENT_TAG, "setDarkStatusBar:", "switcher is off: " + this.g);
            } else if (getActivity() != null && getActivity().getWindow() != null && getActivity().getWindow().getDecorView() != null && Build.VERSION.SDK_INT >= 23) {
                View decorView = getActivity().getWindow().getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
        }
    }

    public boolean A2(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("122c0701", new Object[]{this, aVar})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_DETAIL, "enableAsyncCreateInstance", false) || !X2()) {
            return true;
        }
        if (aVar != null) {
            aVar.destroy();
        }
        nbv.a(nbv.a.a("checkPrerenderContainerValid").success(false).message("checkRenderContainerValid - container hasFragmentDisplay!").sampling(v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "checkPrerenderContainerValid", 1.0f)));
        return false;
    }

    public final boolean D2() {
        ISupportFragment h;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f13c782a", new Object[]{this})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableDisableRebuildByHostState", true)) {
            return false;
        }
        try {
            if (!(getActivity() instanceof FragmentActivity) || (h = qxq.h(getActivity().getSupportFragmentManager())) == null || !(h.asFragment() instanceof h6e)) {
                return false;
            }
            boolean isResumed = h.asFragment().isResumed();
            hav.g(FRAGMENT_TAG, "disableRebuildByHostState:", "rebuild? " + isResumed);
            return !isResumed;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final void N2(FragmentManager fragmentManager, Fragment fragment, boolean z, boolean z2) {
        boolean z3 = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d87320a", new Object[]{this, fragmentManager, fragment, new Boolean(z), new Boolean(z2)});
            return;
        }
        try {
            FragmentTransaction beginTransaction = fragmentManager.beginTransaction();
            if (z && fragment != null) {
                beginTransaction.remove(fragment);
            }
            beginTransaction.add(this.k, this, FRAGMENT_TAG);
            if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableAddFragmentNow", false)) {
                beginTransaction.commitNowAllowingStateLoss();
            } else {
                beginTransaction.commitAllowingStateLoss();
            }
            this.r = System.currentTimeMillis();
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder("add failed, fragment is null? ");
            if (fragment != null) {
                z3 = false;
            }
            sb.append(z3);
            sb.append(", savedInstanceState is not null? ");
            sb.append(z2);
            sb.append(", throwable: ");
            sb.append(th.toString());
            hav.g(FRAGMENT_TAG, "displayByActivity:", sb.toString());
        }
    }

    public boolean h3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fb194f12", new Object[]{this})).booleanValue();
        }
        if (TextUtils.equals(lbv.e(this.g, "skipTradeHybridContainerUt"), "true")) {
            return true;
        }
        return (!(getActivity() instanceof UltronTradeHybridActivity) || !((UltronTradeHybridActivity) getActivity()).y3()) && !f3();
    }

    @Override // com.alibaba.android.ultron.vfw.weex2.highPerformance.widget.TradeHybridBaseFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a141669d", new Object[]{this, context});
            return;
        }
        super.onAttach(context);
        if (v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "rebindActivityContext", true)) {
            k3(context);
            hav.g(FRAGMENT_TAG, "onAttach:", "rebindContext: " + this.g);
        }
        this.x = TBDeviceUtils.p(context);
        E3();
        if (this.c == null && !this.i) {
            String str = this.e;
            obv.h(false, str, "OnError: mWeex2Instance is null and mbPreRender is false, isFoldDevice: " + this.x);
        }
        this.q = true;
        kbv kbvVar = this.v;
        if (kbvVar != null) {
            kbvVar.d(this, this.c);
        }
        if (!h3()) {
            UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(getActivity());
        }
        this.z = false;
        j3(true);
        if (mbv.a(this.g, dbv.PRE_RENDER_URL_LOGISTICS) || mbv.a(this.g, dbv.PRE_RENDER_URL_REFUND_LOGISTICS)) {
            lbv.k();
            if (!lbv.c || !lbv.d) {
                boolean z = lbv.c;
                boolean z2 = lbv.d;
                nbv.a(nbv.a.a("registerPlatFromViewError").message("进入物流但没有注册platformView, 普通地图：" + z + ", 地图v4：" + z2).sampling(1.0f));
            }
        }
    }

    public void s3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("918e40e9", new Object[]{this, jSONObject});
            return;
        }
        if (getContext() != null) {
            this.x = TBDeviceUtils.p(getContext());
        }
        if (!this.i) {
            String str = this.e;
            obv.h(false, str, "OnError: can't send preRenderMessage to a nonPreRender instance, isFoldDevice: " + this.x);
        } else if (this.c == null) {
            String str2 = this.e;
            obv.h(false, str2, "OnError: mWeex2Instance is null, isFoldDevice: " + this.x);
        } else if (jSONObject == null) {
            String str3 = this.e;
            obv.h(false, str3, "OnError: message is null, isFoldDevice: " + this.x);
        } else {
            String str4 = this.e;
            obv.h(true, str4, "OnSuccess!, isFoldDevice: " + this.x);
            if (mbv.a(this.g, dbv.PRE_RENDER_URL_LOGISTICS) && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_ORDER_LIST, "enableLogisticsFragmentOpt", false)) {
                jSONObject.put("enableFragmentOpt", "true");
            }
            this.c.dispatchEvent(MUSEventTarget.MUS_DOCUMENT_TARGET, "preload.update", jSONObject);
            M0().r(jSONObject);
        }
    }

    public final boolean z2(FragmentActivity fragmentActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c9dffe07", new Object[]{this, fragmentActivity})).booleanValue();
        }
        if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "tryCheckFragmentContainerValid", false) || fragmentActivity.findViewById(this.k) != null) {
            return true;
        }
        nbv.a(nbv.a.a("fragmentAddedCatch").success(false).message("checkFragmentContainerValid - container is null!").sampling(v9v.d(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "tryCheckFragmentContainerValid", 1.0f)));
        return false;
    }

    public void M2(Activity activity, Bundle bundle) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2db3c9b3", new Object[]{this, activity, bundle});
        } else if (!(activity instanceof FragmentActivity)) {
            hav.g(FRAGMENT_TAG, "displayByActivity:", "activity is not a FragmentActivity");
        } else {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
            Fragment findFragmentByTag = supportFragmentManager.findFragmentByTag(FRAGMENT_TAG);
            if (findFragmentByTag == null && v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_COMMON_CONTAINER, "enableFindFragmentById", false)) {
                findFragmentByTag = supportFragmentManager.findFragmentById(this.k);
                StringBuilder sb = new StringBuilder("hit! findFragmentById valid? ");
                sb.append(findFragmentByTag != null);
                hav.g(FRAGMENT_TAG, "displayByActivity:", sb.toString());
            }
            if (!z2(fragmentActivity)) {
                hav.g(FRAGMENT_TAG, "displayByActivity:", "container is invalid");
                return;
            }
            boolean isAdded = isAdded();
            boolean z2 = findFragmentByTag != null;
            boolean z3 = bundle != null;
            boolean z4 = !z3 && z2;
            boolean z5 = System.currentTimeMillis() - this.r < 500;
            if (isAdded || this.q || z4 || z5) {
                String str = "fragment already displayed: isAdded:" + isAdded + ", mbFragmentDisplay:" + this.q + ", fragmentNotNull:" + z2 + ", savedInstanceStateNotNull:" + z3 + ", displayTooFast:" + z5 + ", mWeex2Url:" + this.g;
                hav.g(FRAGMENT_TAG, "displayByActivity:", str);
                nbv.a(nbv.a.a("fragmentAddedCatch").success(false).message("errorMsg: ".concat(str)).sampling(0.01f));
                if (!this.q && z2 && !z5 && UltronTradeHybridSwitcherHelper.q(supportFragmentManager, false)) {
                    N2(supportFragmentManager, findFragmentByTag, true, z3);
                    return;
                }
                return;
            }
            if (!v9v.i(UltronTradeHybridSwitcherHelper.ORANGE_KEY_HYBRID_CONTAINER, "enableRemovePreviousFragment", true) || bundle == null || findFragmentByTag == null) {
                z = false;
            }
            N2(supportFragmentManager, findFragmentByTag, z, z3);
        }
    }
}
