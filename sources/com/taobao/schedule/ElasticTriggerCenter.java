package com.taobao.schedule;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.android.dinamicx.widget.DXWidgetNode;
import com.taobao.falco.WindowHookManager;
import com.taobao.falco.s;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import java.util.HashMap;
import tb.c21;
import tb.e2c;
import tb.ja8;
import tb.la8;
import tb.obq;
import tb.pxn;
import tb.sz8;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ElasticTriggerCenter implements e2c {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public boolean f11518a;
    public final BroadcastReceiver b;
    public final SceneIdentifier.d c;
    public final WindowHookManager.a d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements SceneIdentifier.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ElasticTriggerCenter elasticTriggerCenter) {
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.d
        public void background() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("550392b5", new Object[]{this});
            } else {
                ElasticSchedulerEngine.m().t().l("background", null);
            }
        }

        @Override // com.taobao.analysis.scene.SceneIdentifier.d
        public void foreground() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ddb1944a", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b implements WindowHookManager.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ int f11520a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ long d;

            public a(int i, float f, float f2, long j) {
                this.f11520a = i;
                this.b = f;
                this.c = f2;
                this.d = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                } else {
                    ElasticTriggerCenter.a(ElasticTriggerCenter.this, this.f11520a, this.b, this.c, this.d);
                }
            }
        }

        public b() {
        }

        @Override // com.taobao.falco.WindowHookManager.a
        public void a(Activity activity, KeyEvent keyEvent, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2a6b4835", new Object[]{this, activity, keyEvent, new Long(j)});
            }
        }

        @Override // com.taobao.falco.WindowHookManager.a
        public void d(Activity activity, int i, float f, float f2, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("73e110ee", new Object[]{this, activity, new Integer(i), new Float(f), new Float(f2), new Long(j)});
                return;
            }
            if (i == 0) {
                sz8.b("elastic_schedule", "touch_down");
                sz8.e();
            }
            ja8.a(new a(i, f, f2, j));
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Object f11521a;
        public final /* synthetic */ String b;

        public c(Object obj, String str) {
            this.f11521a = obj;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (pxn.d().n()) {
                Object obj = this.f11521a;
                if (obj instanceof DXWidgetNode) {
                    DXWidgetNode dXWidgetNode = (DXWidgetNode) obj;
                    String e = dXWidgetNode.getDXRuntimeContext().p().e();
                    String accessibilityText = dXWidgetNode.getAccessibilityText();
                    la8.d("elastic.TriggerCenter", "[handlerTriggerEvent]DXType", "template", e, "accessibilityText", accessibilityText, "type", this.b);
                    HashMap hashMap = new HashMap(2);
                    hashMap.put("template", e);
                    hashMap.put("accessibilityText", accessibilityText);
                    ElasticSchedulerEngine.m().r().c(hashMap, this.b);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f11522a;
        public final /* synthetic */ long b;

        public d(String str, long j) {
            this.f11522a = str;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ElasticTriggerCenter.b(ElasticTriggerCenter.this, this.f11522a, this.b);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class e {
        public static final ElasticTriggerCenter INSTANCE = new ElasticTriggerCenter();
    }

    public static /* synthetic */ void a(ElasticTriggerCenter elasticTriggerCenter, int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cae0d94a", new Object[]{elasticTriggerCenter, new Integer(i), new Float(f), new Float(f2), new Long(j)});
        } else {
            elasticTriggerCenter.f(i, f, f2, j);
        }
    }

    public static /* synthetic */ void b(ElasticTriggerCenter elasticTriggerCenter, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27202f6f", new Object[]{elasticTriggerCenter, str, new Long(j)});
        } else {
            elasticTriggerCenter.d(str, j);
        }
    }

    public static ElasticTriggerCenter e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ElasticTriggerCenter) ipChange.ipc$dispatch("42d0b936", new Object[0]);
        }
        return e.INSTANCE;
    }

    public void c(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82024d24", new Object[]{this, str, new Long(j)});
        } else if (pxn.d().j()) {
            ja8.a(new d(str, j));
        }
    }

    public void g(View view, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4106d11a", new Object[]{this, view, str});
            return;
        }
        Object tag = view.getTag(DXWidgetNode.TAG_WIDGET_NODE);
        if (tag != null) {
            ja8.a(new c(tag, str));
        }
    }

    public final boolean h(float f, float f2) {
        float f3;
        float f4;
        int width;
        int height;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("270d5656", new Object[]{this, new Float(f), new Float(f2)})).booleanValue();
        }
        Activity i = c21.i();
        if (i != null && !"com.taobao.tao.welcome.Welcome".equals(i.getLocalClassName()) && !obq.BIZ_NAME.equals(i.getLocalClassName())) {
            return false;
        }
        try {
            NavigationTabIndicatorView tabViewAtIndex = com.taobao.tao.navigation.a.o().getTabViewAtIndex(3);
            int[] iArr = new int[2];
            Pair.create(Integer.valueOf(iArr[0]), Integer.valueOf(iArr[1]));
            tabViewAtIndex.getLocationInWindow(iArr);
            f3 = f - iArr[0];
            f4 = f2 - iArr[1];
            width = tabViewAtIndex.getWidth();
            height = tabViewAtIndex.getHeight();
        } catch (Exception e2) {
            la8.b("elastic.TriggerCenter", "isTabCart error.", e2, new Object[0]);
        }
        if (f3 < 0.0f || f3 > width || f4 < 0.0f || f4 > height) {
            return false;
        }
        return true;
    }

    public void i(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("381c355e", new Object[]{this, context});
            return;
        }
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("homepageSecondRefreshEnd");
        LocalBroadcastManager.getInstance(context).registerReceiver(this.b, intentFilter);
        SceneIdentifier.registerLifecycleListener(this.c);
        WindowHookManager.j(this.d);
    }

    public ElasticTriggerCenter() {
        this.f11518a = false;
        this.b = new BroadcastReceiver(this) { // from class: com.taobao.schedule.ElasticTriggerCenter.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/schedule/ElasticTriggerCenter$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                if ("homepageSecondRefreshEnd".equals(action)) {
                    sz8.b("elastic_schedule", "second_refresh");
                    sz8.e();
                    la8.c("elastic.TriggerCenter", "onReceive.", "action", action);
                    ElasticSchedulerEngine.m().t().l("second_refresh", null);
                    ElasticSchedulerEngine.m().s().d();
                }
            }
        };
        this.c = new a(this);
        this.d = new b();
    }

    public final void d(String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c6f1d8a7", new Object[]{this, str, new Long(j)});
            return;
        }
        HashMap hashMap = new HashMap(2);
        hashMap.put("template", str);
        hashMap.put("version", Long.valueOf(j));
        ElasticSchedulerEngine.m().r().c(hashMap, "view_visible");
    }

    public final void f(int i, float f, float f2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81ae44f6", new Object[]{this, new Integer(i), new Float(f), new Float(f2), new Long(j)});
            return;
        }
        ElasticSchedulerEngine.m().b().h(i, f, f2, j);
        if (i == 0) {
            if (h(f, f2)) {
                HashMap hashMap = new HashMap(1);
                hashMap.put("template", "tab_cart");
                ElasticSchedulerEngine.m().r().c(hashMap, s.SCENE);
                this.f11518a = true;
            }
        } else if (i == 1 && this.f11518a) {
            if (!h(f, f2)) {
                HashMap hashMap2 = new HashMap(1);
                hashMap2.put("template", "tab_cart");
                ElasticSchedulerEngine.m().r().c(hashMap2, "touch_cancel");
            }
            this.f11518a = false;
        }
    }
}
