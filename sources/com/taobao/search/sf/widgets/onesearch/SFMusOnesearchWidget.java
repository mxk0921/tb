package com.taobao.search.sf.widgets.onesearch;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.mtl.appmonitor.AppMonitor;
import com.alibaba.mtl.appmonitor.model.DimensionSet;
import com.alibaba.mtl.appmonitor.model.DimensionValueSet;
import com.alibaba.mtl.appmonitor.model.MeasureSet;
import com.alibaba.mtl.appmonitor.model.MeasureValueSet;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.weex_framework.MUSDKInstance;
import com.taobao.android.weex_framework.a;
import com.taobao.search.sf.MainSearchResultActivity;
import tb.a07;
import tb.amo;
import tb.anx;
import tb.axh;
import tb.b64;
import tb.bbz;
import tb.ckf;
import tb.cnx;
import tb.f64;
import tb.f6p;
import tb.h1p;
import tb.hxk;
import tb.kgw;
import tb.npc;
import tb.phw;
import tb.r4p;
import tb.t2o;
import tb.ude;
import tb.vfw;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class SFMusOnesearchWidget extends phw<b, FrameLayout, b64> implements npc, cnx, View.OnLayoutChangeListener {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);
    public static boolean h;

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.android.weex_framework.a f11720a;
    public b b;
    public boolean c;
    public boolean d;
    public BroadcastReceiver e;
    public boolean f;
    public boolean g;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(815793700);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }

        public final void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a23a9aa", new Object[]{this});
            } else if (!SFMusOnesearchWidget.s2()) {
                SFMusOnesearchWidget.u2(true);
                MeasureSet create = MeasureSet.create();
                create.addMeasure("load_time");
                DimensionSet create2 = DimensionSet.create();
                create2.addDimension("sversion");
                AppMonitor.register(h1p.a.KEY_NS_PARAM_MODULE_NAME, "performance", create, create2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static final class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final String f11721a;
        public final int b;
        public final boolean c;

        static {
            t2o.a(815793701);
        }

        public b(String str, int i, boolean z) {
            ckf.g(str, "url");
            this.f11721a = str;
            this.b = i;
            this.c = z;
        }

        public final int a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4703e217", new Object[]{this})).intValue();
            }
            return this.b;
        }

        public final boolean b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c578903d", new Object[]{this})).booleanValue();
            }
            return this.c;
        }

        public final String c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("de8f0660", new Object[]{this});
            }
            return this.f11721a;
        }

        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (ckf.b(this.f11721a, bVar.f11721a) && this.b == bVar.b && this.c == bVar.c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return (((this.f11721a.hashCode() * 31) + this.b) * 31) + bbz.a(this.c);
        }

        public String toString() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
            }
            return "MusOnesearchBean(url=" + this.f11721a + ", height=" + this.b + ", newSearch=" + this.c + ')';
        }
    }

    static {
        t2o.a(815793699);
        t2o.a(982515990);
        t2o.a(993002201);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SFMusOnesearchWidget(Activity activity, ude udeVar, b64 b64Var, ViewGroup viewGroup, vfw vfwVar) {
        super(activity, udeVar, b64Var, viewGroup, vfwVar);
        ckf.g(activity, "activity");
        ckf.g(udeVar, com.alibaba.triver.triver_shop.newShop.event.broadcast.a.MSG_SOURCE_PARENT);
    }

    public static /* synthetic */ Object ipc$super(SFMusOnesearchWidget sFMusOnesearchWidget, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1303831088:
                super.bindWithData(objArr[0]);
                return null;
            case -211767613:
                super.onComponentDestroy();
                return null;
            case 217607196:
                super.onCtxResume();
                return null;
            case 299066517:
                super.onCtxPause();
                return null;
            case 593843865:
                super.onCtxDestroy();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/onesearch/SFMusOnesearchWidget");
        }
    }

    public static final /* synthetic */ com.taobao.android.weex_framework.a q2(SFMusOnesearchWidget sFMusOnesearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.android.weex_framework.a) ipChange.ipc$dispatch("687ada8e", new Object[]{sFMusOnesearchWidget});
        }
        return sFMusOnesearchWidget.f11720a;
    }

    public static final /* synthetic */ boolean s2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e55f3164", new Object[0])).booleanValue();
        }
        return h;
    }

    public static final /* synthetic */ boolean t2(SFMusOnesearchWidget sFMusOnesearchWidget) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("fea2d798", new Object[]{sFMusOnesearchWidget})).booleanValue();
        }
        return sFMusOnesearchWidget.f;
    }

    public static final /* synthetic */ void u2(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5db32f80", new Object[]{new Boolean(z)});
        } else {
            h = z;
        }
    }

    public final void A2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9631f0c9", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = (FrameLayout) getView();
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    public final void B2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b52a8026", new Object[]{this});
        } else if (this.e == null) {
            this.e = new BroadcastReceiver() { // from class: com.taobao.search.sf.widgets.onesearch.SFMusOnesearchWidget$initReceiver$1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                public static /* synthetic */ Object ipc$super(SFMusOnesearchWidget$initReceiver$1 sFMusOnesearchWidget$initReceiver$1, String str, Object... objArr) {
                    str.hashCode();
                    int hashCode = str.hashCode();
                    throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/search/sf/widgets/onesearch/SFMusOnesearchWidget$initReceiver$1");
                }

                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    a q2;
                    Bundle extras;
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    } else if (SFMusOnesearchWidget.t2(SFMusOnesearchWidget.this) && (q2 = SFMusOnesearchWidget.q2(SFMusOnesearchWidget.this)) != null && !q2.isDestroyed() && intent != null && (extras = intent.getExtras()) != null) {
                        int i = extras.getInt("tipNumber");
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put((JSONObject) "count", (String) Integer.valueOf(i));
                        q2.sendInstanceMessage("MUISE", "messageCountChange", jSONObject);
                    }
                }
            };
        }
    }

    /* renamed from: C2 */
    public FrameLayout onCreateView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("6075f6f2", new Object[]{this});
        }
        return new FrameLayout(getActivity());
    }

    public final void D2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86bccc00", new Object[]{this});
        } else {
            Companion.a();
        }
    }

    public final void E2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("69d3c93", new Object[]{this});
            return;
        }
        com.taobao.android.weex_framework.a aVar = this.f11720a;
        if (aVar != null && !aVar.isDestroyed()) {
            aVar.destroy();
        }
    }

    public final void F2() {
        MainSearchResultActivity mainSearchResultActivity;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b561d89a", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar != null && bVar.b()) {
            D2();
            Activity activity = getActivity();
            if (activity instanceof MainSearchResultActivity) {
                mainSearchResultActivity = (MainSearchResultActivity) activity;
            } else {
                mainSearchResultActivity = null;
            }
            if (mainSearchResultActivity != null) {
                w2(System.currentTimeMillis() - mainSearchResultActivity.a5());
            }
        }
    }

    @Override // tb.cnx
    public boolean K(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1f36856c", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        return true;
    }

    @Override // tb.abx
    public String getLogTag() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("55d7c1cd", new Object[]{this});
        }
        return "SFMusOnesearchWidget";
    }

    @Override // tb.cnx
    public boolean m2(String str, JSONObject jSONObject, f64.a aVar, f64.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("9ac25dbb", new Object[]{this, str, jSONObject, aVar, aVar2})).booleanValue();
        }
        ckf.d(str);
        postEvent(f64.a(str, jSONObject, aVar, aVar2));
        return true;
    }

    @Override // tb.abx
    public void onComponentDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f360aec3", new Object[]{this});
            return;
        }
        super.onComponentDestroy();
        E2();
        if (this.e != null) {
            LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(this.e);
        }
    }

    @Override // tb.abx
    public void onCtxDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23655699", new Object[]{this});
            return;
        }
        super.onCtxDestroy();
        E2();
        if (!this.d) {
            x2("1010", "nerver load");
        }
    }

    @Override // tb.abx
    public void onCtxPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("11d36495", new Object[]{this});
            return;
        }
        super.onCtxPause();
        com.taobao.android.weex_framework.a aVar = this.f11720a;
        if (aVar != null) {
            aVar.onActivityPause();
        }
        com.taobao.android.weex_framework.a aVar2 = this.f11720a;
        if (aVar2 != null) {
            aVar2.onActivityStop();
        }
    }

    @Override // tb.abx
    public void onCtxResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cf86c1c", new Object[]{this});
            return;
        }
        super.onCtxResume();
        com.taobao.android.weex_framework.a aVar = this.f11720a;
        if (aVar != null) {
            aVar.onActivityStart();
        }
        com.taobao.android.weex_framework.a aVar2 = this.f11720a;
        if (aVar2 != null) {
            aVar2.onActivityResume();
        }
    }

    @Override // tb.npc
    public void onDestroyed(MUSDKInstance mUSDKInstance) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32f7f995", new Object[]{this, mUSDKInstance});
        } else if (mUSDKInstance != null) {
            kgw.c(mUSDKInstance.getRenderRoot());
        }
    }

    @Override // tb.npc
    public void onJSException(com.taobao.android.weex_framework.a aVar, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c41b6de", new Object[]{this, aVar, new Integer(i), str});
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("899df952", new Object[]{this, view, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Integer(i6), new Integer(i7), new Integer(i8)});
            return;
        }
        ckf.d(view);
        int measuredHeight = view.getMeasuredHeight();
        ROOT_VIEW view2 = getView();
        ckf.d(view2);
        ViewGroup.LayoutParams layoutParams = ((FrameLayout) view2).getLayoutParams();
        ckf.d(layoutParams);
        if (measuredHeight != layoutParams.height) {
            ROOT_VIEW view3 = getView();
            ckf.d(view3);
            ViewGroup.LayoutParams layoutParams2 = ((FrameLayout) view3).getLayoutParams();
            ckf.d(layoutParams2);
            layoutParams2.height = measuredHeight;
            ROOT_VIEW view4 = getView();
            ckf.d(view4);
            ((FrameLayout) view4).requestLayout();
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
    public void onRefreshFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0861e4", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = true;
        z2();
    }

    @Override // tb.npc
    public void onRefreshSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("963c382f", new Object[]{this, aVar});
        }
    }

    @Override // tb.npc
    public void onRenderFailed(com.taobao.android.weex_framework.a aVar, int i, String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc0cbe2b", new Object[]{this, aVar, new Integer(i), str, new Boolean(z)});
            return;
        }
        this.d = true;
        String valueOf = String.valueOf(i);
        ckf.d(str);
        x2(valueOf, str);
        z2();
    }

    @Override // tb.npc
    public void onRenderSuccess(com.taobao.android.weex_framework.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2b2aeb48", new Object[]{this, aVar});
            return;
        }
        this.d = true;
        this.f = true;
        if (aVar != null) {
            View renderRoot = aVar.getRenderRoot();
            kgw.c(renderRoot);
            FrameLayout frameLayout = (FrameLayout) getView();
            if (frameLayout != null) {
                frameLayout.addView(renderRoot);
            }
        }
        if (!this.g) {
            this.g = true;
            F2();
            y2();
        }
    }

    /* renamed from: v2 */
    public void bindWithData(b bVar) {
        ViewGroup.LayoutParams layoutParams;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6c3fbcf", new Object[]{this, bVar});
            return;
        }
        super.bindWithData(bVar);
        if (bVar != null) {
            this.b = bVar;
            attachToContainer();
            FrameLayout frameLayout = (FrameLayout) getView();
            if (!(frameLayout == null || (layoutParams = frameLayout.getLayoutParams()) == null)) {
                layoutParams.height = bVar.a();
            }
            com.taobao.android.weex_framework.a aVar = this.f11720a;
            if (aVar != null) {
                aVar.destroy();
            }
            String f = f6p.f(bVar.c(), "_mus_tpl");
            if (TextUtils.isEmpty(f)) {
                f = bVar.c();
            }
            com.taobao.android.weex_framework.a a2 = anx.a(getActivity(), this, null);
            a2.registerRenderListener(this);
            axh.Companion.a(a2, f, bVar.c(), null, null);
            this.f11720a = a2;
            B2();
            LocalBroadcastManager.getInstance(getActivity()).registerReceiver(this.e, new IntentFilter("msg.action.ACTION_MPM_MESSAGE_BOX_UNREAD"));
        }
    }

    public final void w2(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("604e8299", new Object[]{this, new Long(j)});
            return;
        }
        MeasureValueSet create = MeasureValueSet.create();
        create.setValue("load_time", j);
        DimensionValueSet create2 = DimensionValueSet.create();
        create2.setValue("sversion", r4p.SERVER_VERSION_VALUE);
        AppMonitor.Stat.commit(h1p.a.KEY_NS_PARAM_MODULE_NAME, "performance", create2, create);
    }

    public final void z2() {
        com.taobao.search.sf.widgets.onesearch.a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5467727c", new Object[]{this});
        } else if (!this.c) {
            b bVar = this.b;
            if (bVar == null || !bVar.b()) {
                A2();
                postEvent(hxk.a());
            } else {
                ude parent = getParent();
                if (parent instanceof com.taobao.search.sf.widgets.onesearch.a) {
                    aVar = (com.taobao.search.sf.widgets.onesearch.a) parent;
                } else {
                    aVar = null;
                }
                if (aVar != null) {
                    aVar.destroyAndRemoveFromParent();
                } else {
                    return;
                }
            }
            this.c = true;
        }
    }

    public final void x2(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b70b574", new Object[]{this, str, str2});
            return;
        }
        b bVar = this.b;
        if (bVar != null && bVar.b()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "sversion", r4p.SERVER_VERSION_VALUE);
            AppMonitor.Alarm.commitFail(h1p.a.KEY_NS_PARAM_MODULE_NAME, "abailable", jSONObject.toString(), str, str2);
            AppMonitor.Alarm.commitFail(h1p.a.KEY_NS_PARAM_MODULE_NAME, "abailable_error", jSONObject.toString(), str, str2);
        }
    }

    public final void y2() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("20615a59", new Object[]{this});
            return;
        }
        b bVar = this.b;
        if (bVar != null && bVar.b()) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put((JSONObject) "sversion", r4p.SERVER_VERSION_VALUE);
            AppMonitor.Alarm.commitSuccess(h1p.a.KEY_NS_PARAM_MODULE_NAME, amo.a.POINT_NAME, jSONObject.toString());
        }
    }
}
