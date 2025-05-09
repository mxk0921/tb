package com.taobao.falco;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import anet.channel.util.ALog;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.analysis.scene.SceneIdentifier;
import com.taobao.analysis.v3.FalcoGlobalTracer;
import com.taobao.android.autosize.TBAutoSizeConfig;
import com.taobao.android.nav.Nav;
import com.taobao.falco.FalcoNativePageLifecycleCallbacks;
import com.taobao.falco.WindowHookManager;
import com.taobao.falco.b;
import com.taobao.falco.m;
import com.taobao.falco.s;
import com.taobao.falco.u;
import com.taobao.monitor.impl.trace.l;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import tb.c21;
import tb.ccs;
import tb.ckh;
import tb.crt;
import tb.hx9;
import tb.ic;
import tb.obq;
import tb.tz8;
import tb.u11;
import tb.w11;
import tb.xy8;
import tb.yy8;
import tb.zzb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class FalcoLoadActionMonitor implements FalcoNativePageLifecycleCallbacks.a, l.c, u11, b.a, w11, WindowHookManager.a, u {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public long B;
    public volatile t e;
    public Handler j;
    public h k;
    public String r;
    public WindowHookManager t;
    public volatile e u;
    public final Set<String> y;

    /* renamed from: a  reason: collision with root package name */
    public final LinkedList<g> f10441a = new LinkedList<>();
    public final Map<Long, n> b = new ConcurrentHashMap();
    public final Map<Integer, LinkedList<c>> c = new HashMap();
    public final TaskStack d = new TaskStack(null);
    public long f = 0;
    public float g = 0.0f;
    public float h = 0.0f;
    public int i = 0;
    public volatile long q = -1;
    public boolean v = true;
    public long w = -1;
    public int x = 0;
    public int z = 0;
    public int A = 0;
    public final Map<Long, Long> C = new HashMap(2);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class ActivityRecord extends BasePageRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public boolean isDying = false;
        public String leaveType = null;
        public final TaskStack parent;

        public ActivityRecord(i iVar, TaskStack taskStack) {
            super(iVar);
            this.parent = taskStack;
        }

        public static /* synthetic */ Object ipc$super(ActivityRecord activityRecord, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLoadActionMonitor$ActivityRecord");
        }

        public SubPageRecord addSubPageRecord(int i, long j, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubPageRecord) ipChange.ipc$dispatch("f9e197ea", new Object[]{this, new Integer(i), new Long(j), str, str2});
            }
            i iVar = new i(j, str, str2);
            if (i == 2) {
                SubPageRecord subPageRecord = new SubPageRecord(iVar, this);
                addFirst(subPageRecord);
                return subPageRecord;
            }
            if (i == 3) {
                if (isEmpty()) {
                    SubPageRecord subPageRecord2 = new SubPageRecord(iVar, this);
                    addFirst(subPageRecord2);
                    return subPageRecord2;
                }
                SubPageRecord first = getFirst();
                int d = f.d(first.pageInfo.f10449a);
                if (d == 2) {
                    SubPageRecord subPageRecord3 = new SubPageRecord(iVar, first);
                    first.addFirst(subPageRecord3);
                    return subPageRecord3;
                } else if (d == 3) {
                    SubPageRecord subPageRecord4 = new SubPageRecord(iVar, this);
                    addFirst(subPageRecord4);
                    return subPageRecord4;
                }
            }
            return null;
        }

        public i currentPageInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("b003774d", new Object[]{this});
            }
            if (isEmpty()) {
                return this.pageInfo;
            }
            return getFirst().currentPageInfo();
        }

        public List<Long> customViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("11493e43", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SubPageRecord> it = iterator();
            while (it.hasNext()) {
                SubPageRecord next = it.next();
                if (f.d(next.pageInfo.f10449a) == 3) {
                    arrayList.add(Long.valueOf(next.pageInfo.f10449a));
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class BasePageRecord extends LinkedList<SubPageRecord> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final i pageInfo;

        public BasePageRecord(i iVar) {
            this.pageInfo = iVar;
        }

        public static /* synthetic */ Object ipc$super(BasePageRecord basePageRecord, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLoadActionMonitor$BasePageRecord");
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c2a9726", new Object[]{this, obj})).booleanValue();
            }
            if (!(obj instanceof BasePageRecord) || ((BasePageRecord) obj).pageInfo.f10449a != this.pageInfo.f10449a) {
                return false;
            }
            return true;
        }

        @Override // java.util.AbstractList, java.util.Collection, java.util.List
        public int hashCode() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("53a9ab15", new Object[]{this})).intValue();
            }
            return this.pageInfo.hashCode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class LoadRunnable implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final int DO_BACKGROUND = 12;
        public static final int DO_BEGIN_TRANSITION = 15;
        public static final int DO_FINISH_TRANSITION = 16;
        public static final int DO_FRAGMENT_VIEW_CREATE = 21;
        public static final int DO_FRAGMENT_VIEW_DESTROY = 22;
        public static final int DO_GET_CUSTOM_VIEW_SPAN = 17;
        public static final int DO_GET_LOAD_ACTION_SPAN = 9;
        public static final int DO_GET_TOUCH_ACTION_SPAN = 10;
        public static final int DO_KEY_BACK = 11;
        public static final int DO_KEY_CUSTOM_ENTER = 18;
        public static final int DO_NOTHING = -1;
        public static final int DO_PAGE_CREATE = 3;
        public static final int DO_PAGE_DESTROYED = 14;
        public static final int DO_PAGE_FIRST_FRAME_RENDER = 5;
        public static final int DO_PAGE_INTERACTIVE = 7;
        public static final int DO_PAGE_PAUSE = 13;
        public static final int DO_PAGE_PRE_ATTACH = 20;
        public static final int DO_PAGE_START = 4;
        public static final int DO_PAGE_STOP = 8;
        public static final int DO_PAGE_VISIBLE = 6;
        public static final int DO_REMOVE_INTERACTION_LISTENER = 24;
        public static final int DO_SET_INTERACTION_LISTENER = 23;
        public static final int DO_START_ACTIVITY = 2;
        public static final int DO_TOUCH_DOWN = 0;
        public static final int DO_TOUCH_MOVE = 19;
        public static final int DO_TOUCH_UP = 1;
        public static final int DO_UPDATE_MILESTONE_METRICS = 25;

        /* renamed from: a  reason: collision with root package name */
        public final FalcoLoadActionMonitor f10442a;
        public final int b;
        public final Object[] c;

        /* compiled from: Taobao */
        @Retention(RetentionPolicy.SOURCE)
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public @interface Definition {
        }

        public LoadRunnable(FalcoLoadActionMonitor falcoLoadActionMonitor, int i, Object... objArr) {
            this.f10442a = falcoLoadActionMonitor;
            this.b = i;
            this.c = objArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            switch (this.b) {
                case 0:
                    FalcoLoadActionMonitor.f(this.f10442a, ((Long) this.c[0]).longValue(), ((Float) this.c[1]).floatValue(), ((Float) this.c[2]).floatValue());
                    return;
                case 1:
                    FalcoLoadActionMonitor.r(this.f10442a, ((Long) this.c[0]).longValue(), ((Float) this.c[1]).floatValue(), ((Float) this.c[2]).floatValue());
                    return;
                case 2:
                    FalcoLoadActionMonitor.B(this.f10442a, ((Long) this.c[0]).longValue());
                    return;
                case 3:
                    FalcoLoadActionMonitor falcoLoadActionMonitor = this.f10442a;
                    Object[] objArr = this.c;
                    FalcoLoadActionMonitor.Z(falcoLoadActionMonitor, (String) objArr[0], (String) objArr[1], (String) objArr[2], (String) objArr[3], ((Long) objArr[4]).longValue(), ((Long) this.c[5]).longValue(), ((Long) this.c[6]).longValue(), ((Long) this.c[7]).longValue(), ((Boolean) this.c[8]).booleanValue());
                    return;
                case 4:
                    FalcoLoadActionMonitor.J(this.f10442a, ((Long) this.c[0]).longValue(), ((Long) this.c[1]).longValue());
                    return;
                case 5:
                    FalcoLoadActionMonitor.K(this.f10442a, ((Long) this.c[0]).longValue(), ((Long) this.c[1]).longValue(), ((Long) this.c[2]).longValue(), ((Long) this.c[3]).longValue());
                    return;
                case 6:
                    FalcoLoadActionMonitor falcoLoadActionMonitor2 = this.f10442a;
                    Object[] objArr2 = this.c;
                    FalcoLoadActionMonitor.L(falcoLoadActionMonitor2, (String) objArr2[0], ((Long) objArr2[1]).longValue());
                    return;
                case 7:
                    FalcoLoadActionMonitor falcoLoadActionMonitor3 = this.f10442a;
                    Object[] objArr3 = this.c;
                    FalcoLoadActionMonitor.M(falcoLoadActionMonitor3, (String) objArr3[0], ((Long) objArr3[1]).longValue());
                    return;
                case 8:
                    FalcoLoadActionMonitor falcoLoadActionMonitor4 = this.f10442a;
                    long longValue = ((Long) this.c[0]).longValue();
                    long longValue2 = ((Long) this.c[1]).longValue();
                    Object[] objArr4 = this.c;
                    FalcoLoadActionMonitor.N(falcoLoadActionMonitor4, longValue, longValue2, (String) objArr4[2], (String) objArr4[3], (String) objArr4[4], (String) objArr4[5], ((Boolean) objArr4[6]).booleanValue());
                    return;
                case 9:
                    FalcoLoadActionMonitor.g(this.f10442a, (m.a) this.c[0]);
                    return;
                case 10:
                    FalcoLoadActionMonitor.h(this.f10442a, (s.b) this.c[0]);
                    return;
                case 11:
                    FalcoLoadActionMonitor.i(this.f10442a, ((Integer) this.c[0]).intValue(), ((Long) this.c[1]).longValue());
                    return;
                case 12:
                    FalcoLoadActionMonitor.j(this.f10442a);
                    return;
                case 13:
                    FalcoLoadActionMonitor.k(this.f10442a, ((Long) this.c[0]).longValue());
                    return;
                case 14:
                    FalcoLoadActionMonitor.l(this.f10442a, ((Long) this.c[0]).longValue());
                    return;
                case 15:
                    FalcoLoadActionMonitor falcoLoadActionMonitor5 = this.f10442a;
                    Object[] objArr5 = this.c;
                    FalcoLoadActionMonitor.m(falcoLoadActionMonitor5, (u.a) objArr5[0], ((Long) objArr5[1]).longValue());
                    return;
                case 16:
                    FalcoLoadActionMonitor falcoLoadActionMonitor6 = this.f10442a;
                    Object[] objArr6 = this.c;
                    FalcoLoadActionMonitor.n(falcoLoadActionMonitor6, (u.a) objArr6[0], ((Long) objArr6[1]).longValue());
                    return;
                case 17:
                    FalcoLoadActionMonitor falcoLoadActionMonitor7 = this.f10442a;
                    Object[] objArr7 = this.c;
                    FalcoLoadActionMonitor.p(falcoLoadActionMonitor7, (u.a) objArr7[0], (m.a) objArr7[1]);
                    return;
                case 18:
                    FalcoLoadActionMonitor.q(this.f10442a, ((Long) this.c[0]).longValue());
                    return;
                case 19:
                    FalcoLoadActionMonitor.s(this.f10442a, ((Long) this.c[0]).longValue(), ((Float) this.c[1]).floatValue(), ((Float) this.c[2]).floatValue());
                    return;
                case 20:
                    FalcoLoadActionMonitor.t(this.f10442a, ((Long) this.c[0]).longValue(), ((Long) this.c[1]).longValue());
                    return;
                case 21:
                    FalcoLoadActionMonitor falcoLoadActionMonitor8 = this.f10442a;
                    long longValue3 = ((Long) this.c[0]).longValue();
                    Object[] objArr8 = this.c;
                    FalcoLoadActionMonitor.u(falcoLoadActionMonitor8, longValue3, (String) objArr8[1], (String) objArr8[2]);
                    return;
                case 22:
                    FalcoLoadActionMonitor.v(this.f10442a, ((Long) this.c[0]).longValue());
                    return;
                case 23:
                    FalcoLoadActionMonitor.w(this.f10442a, (h) this.c[0]);
                    return;
                case 24:
                    FalcoLoadActionMonitor.x(this.f10442a, null);
                    return;
                case 25:
                    FalcoLoadActionMonitor falcoLoadActionMonitor9 = this.f10442a;
                    Object[] objArr9 = this.c;
                    FalcoLoadActionMonitor.y(falcoLoadActionMonitor9, (ckh) objArr9[0], ((Long) objArr9[1]).longValue(), (n) this.c[2]);
                    return;
                default:
                    return;
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class SubPageRecord extends BasePageRecord {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final BasePageRecord parent;
        public int status = 0;
        public boolean isDying = false;
        public String leaveType = null;
        public long leaveTimestamp = -1;
        public String originPageName = null;
        public String simpleName = null;
        public boolean hasUsed = false;

        public SubPageRecord(i iVar, BasePageRecord basePageRecord) {
            super(iVar);
            this.parent = basePageRecord;
        }

        public static /* synthetic */ Object ipc$super(SubPageRecord subPageRecord, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLoadActionMonitor$SubPageRecord");
        }

        public i currentPageInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("b003774d", new Object[]{this});
            }
            if (isEmpty()) {
                return this.pageInfo;
            }
            return getFirst().pageInfo;
        }

        public List<Long> customViews() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("11493e43", new Object[]{this});
            }
            ArrayList arrayList = new ArrayList();
            Iterator<SubPageRecord> it = iterator();
            while (it.hasNext()) {
                SubPageRecord next = it.next();
                if (f.d(next.pageInfo.f10449a) == 3) {
                    arrayList.add(Long.valueOf(next.pageInfo.f10449a));
                }
            }
            return arrayList;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10443a;
        public final /* synthetic */ Fragment b;
        public final /* synthetic */ long c;
        public final /* synthetic */ long d;

        public a(Activity activity, Fragment fragment, long j, long j2) {
            this.f10443a = activity;
            this.b = fragment;
            this.c = j;
            this.d = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                FalcoLoadActionMonitor.z(FalcoLoadActionMonitor.this, this.f10443a, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements Choreographer.FrameCallback {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Activity f10444a;
        public final /* synthetic */ long b;
        public final /* synthetic */ Fragment c;
        public final /* synthetic */ long d;

        /* compiled from: Taobao */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
        public class a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ long f10445a;

            public a(long j) {
                this.f10445a = j;
            }

            @Override // java.lang.Runnable
            public void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (FalcoLoadActionMonitor.C(FalcoLoadActionMonitor.this) != null) {
                    WindowHookManager C = FalcoLoadActionMonitor.C(FalcoLoadActionMonitor.this);
                    b bVar = b.this;
                    C.e(bVar.f10444a, bVar.c);
                }
                b bVar2 = b.this;
                crt.h(new LoadRunnable(FalcoLoadActionMonitor.this, 5, Long.valueOf(bVar2.b), Long.valueOf(b.this.d), Long.valueOf(this.f10445a), Long.valueOf(currentTimeMillis)));
            }
        }

        public b(Activity activity, Fragment fragment, long j, long j2) {
            this.f10444a = activity;
            this.c = fragment;
            this.b = j;
            this.d = j2;
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f46aacbb", new Object[]{this, new Long(j)});
            } else {
                FalcoLoadActionMonitor.D(FalcoLoadActionMonitor.this).postAtFrontOfQueue(new a(System.currentTimeMillis()));
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public boolean f10446a;
        public boolean b;
        public long c;

        public c() {
        }

        public /* synthetic */ c(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements FalcoNativePageLifecycleCallbacks.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final FalcoLoadActionMonitor f10447a;

        public d(FalcoLoadActionMonitor falcoLoadActionMonitor) {
            this.f10447a = falcoLoadActionMonitor;
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void a(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dce5770a", new Object[]{this, fragmentManager, fragment, view, bundle});
            } else {
                FalcoLoadActionMonitor.G(this.f10447a, fragment, view, bundle);
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void b(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a68ca3e", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.X(this.f10447a, fragment, System.currentTimeMillis());
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void c(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c8137aff", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.R(this.f10447a, fragment, System.currentTimeMillis());
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void d(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("93910177", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.Y(this.f10447a, fragment);
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void e(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e970430a", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.H(this.f10447a, fragment, System.currentTimeMillis());
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void f(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f2658eb2", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.j0(this.f10447a, fragment);
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void g(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("871739b1", new Object[]{this, fragmentManager, fragment, bundle});
            } else {
                FalcoLoadActionMonitor.F(this.f10447a, fragment, bundle, System.currentTimeMillis());
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void h(FragmentManager fragmentManager, Fragment fragment) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("953163f4", new Object[]{this, fragmentManager, fragment});
            } else {
                FalcoLoadActionMonitor.I(this.f10447a, fragment, System.currentTimeMillis());
            }
        }

        @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.b
        public void i(FragmentManager fragmentManager, Fragment fragment, Context context) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("69cbbd64", new Object[]{this, fragmentManager, fragment, context});
            } else {
                FalcoLoadActionMonitor.E(this.f10447a, fragment, System.currentTimeMillis());
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public static final e DEFAULT = new e();

        public void c(Activity activity, Bundle bundle, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2ca47521", new Object[]{this, activity, bundle, new Long(j), new Long(j2)});
            }
        }

        public void d(Activity activity) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            }
        }

        public void e(Activity activity, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e84c3aef", new Object[]{this, activity, new Long(j)});
            }
        }

        public void f(Activity activity, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("92cd9fc2", new Object[]{this, activity, new Long(j)});
            }
        }

        public void g(Activity activity, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
            }
        }

        public void h(Activity activity, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e33d8eec", new Object[]{this, activity, new Long(j), new Long(j2)});
            }
        }

        public void i(Activity activity, long j, long j2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("61063638", new Object[]{this, activity, new Long(j), new Long(j2)});
            }
        }

        public void j(Fragment fragment, Bundle bundle, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("60c67808", new Object[]{this, fragment, bundle, new Long(j)});
            }
        }

        public void k(Fragment fragment, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("99a625db", new Object[]{this, fragment, new Long(j)});
            }
        }

        public void l(Fragment fragment, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b51e03e8", new Object[]{this, fragment, new Long(j)});
            }
        }

        public void m(Fragment fragment, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("161f1c9d", new Object[]{this, fragment, new Long(j)});
            }
        }

        public void o(Fragment fragment, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7eb45c33", new Object[]{this, fragment, new Long(j)});
            }
        }

        public void p(Fragment fragment, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("70852a67", new Object[]{this, fragment, new Long(j)});
            }
        }

        public void q(t tVar, n nVar, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fa449ae", new Object[]{this, tVar, nVar, new Long(j)});
            } else if (tVar != null) {
                tVar.finish();
            }
        }

        public void r(n nVar, long j, String str, String str2, String str3, long j2, Set<String> set) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7aa4a46f", new Object[]{this, nVar, new Long(j), str, str2, str3, new Long(j2), set});
            } else if (nVar != null) {
                nVar.H(j2);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class f {
        public static volatile transient /* synthetic */ IpChange $ipChange = null;
        public static final long MASK_PAGE_STATE = 240518168576L;
        public static final long MASK_PAGE_TYPE = 30064771072L;
        public static final int PAGE_STATE_DEFAULT = 0;
        public static final int PAGE_STATE_INVALID = 1;
        public static final int PAGE_TYPE_ACTIVITY = 1;
        public static final int PAGE_TYPE_CUSTOM_VIEW = 3;
        public static final int PAGE_TYPE_DEFAULT = 0;
        public static final int PAGE_TYPE_FRAGMENT = 2;

        public static long b(int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4b2e9e11", new Object[]{new Integer(i), new Integer(i2)})).longValue();
            }
            return i | (i2 << 32);
        }

        public static int d(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("dd915291", new Object[]{new Long(j)})).intValue();
            }
            return (int) ((j & MASK_PAGE_TYPE) >>> 32);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class g {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public long f10448a;
        public long b;
        public long c;
        public String d;
        public String e;
        public String f;
        public String g;
        public String h;
        public String i;
        public t j;
        public xy8 k;
        public boolean l;

        public g() {
        }

        public void a() {
            t tVar;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("51af759a", new Object[]{this});
                return;
            }
            if (!this.l && (tVar = this.j) != null) {
                tVar.finish();
            }
            xy8 xy8Var = this.k;
            if (xy8Var != null) {
                xy8Var.F();
            }
        }

        public /* synthetic */ g(a aVar) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface h {
        void a(ckh ckhVar, long j, n nVar);

        void b(n nVar);

        void c(t tVar, n nVar);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class i {

        /* renamed from: a  reason: collision with root package name */
        public final long f10449a;
        public String b;
        public String c;

        public i(long j, String str, String str2) {
            this.f10449a = j;
            this.b = str;
            this.c = str2;
        }
    }

    public FalcoLoadActionMonitor() {
        HashSet hashSet = new HashSet(5);
        this.y = hashSet;
        hashSet.add("com.taobao.tao.welcome.Welcome");
        hashSet.add(obq.BIZ_NAME);
        hashSet.add("com.taobao.tao.tbmainfragment.TBMainFragment");
        hashSet.add("com.taobao.android.autosize.orientation.ConfigChangeProvider$ConfigChangeObserver");
        hashSet.add("com.taobao.android.autosize.orientation.ConfigChangeProvider$ConfigChangeObserverSupportV4");
    }

    public static /* synthetic */ void B(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("57c7f203", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.i0(j);
        }
    }

    public static /* synthetic */ WindowHookManager C(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (WindowHookManager) ipChange.ipc$dispatch("31a38143", new Object[]{falcoLoadActionMonitor});
        }
        return falcoLoadActionMonitor.t;
    }

    public static /* synthetic */ Handler D(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Handler) ipChange.ipc$dispatch("6c9be26f", new Object[]{falcoLoadActionMonitor});
        }
        return falcoLoadActionMonitor.j;
    }

    public static /* synthetic */ void E(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bb31acb7", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.x0(fragment, j);
        }
    }

    public static /* synthetic */ void F(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, Bundle bundle, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea0593fc", new Object[]{falcoLoadActionMonitor, fragment, bundle, new Long(j)});
        } else {
            falcoLoadActionMonitor.u0(fragment, bundle, j);
        }
    }

    public static /* synthetic */ void G(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3f029ed", new Object[]{falcoLoadActionMonitor, fragment, view, bundle});
        } else {
            falcoLoadActionMonitor.Q0(fragment, view, bundle);
        }
    }

    public static /* synthetic */ void H(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c9daeba", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.z0(fragment, j);
        }
    }

    public static /* synthetic */ void I(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3d1704bb", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.y0(fragment, j);
        }
    }

    public static /* synthetic */ void J(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("848a115f", new Object[]{falcoLoadActionMonitor, new Long(j), new Long(j2)});
        } else {
            falcoLoadActionMonitor.e0(j, j2);
        }
    }

    public static /* synthetic */ void K(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, long j2, long j3, long j4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b832a87e", new Object[]{falcoLoadActionMonitor, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
        } else {
            falcoLoadActionMonitor.T(j, j2, j3, j4);
        }
    }

    public static /* synthetic */ void L(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("52d33ebd", new Object[]{falcoLoadActionMonitor, str, new Long(j)});
        } else {
            falcoLoadActionMonitor.h0(str, j);
        }
    }

    public static /* synthetic */ void M(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e94ba7e", new Object[]{falcoLoadActionMonitor, str, new Long(j)});
        } else {
            falcoLoadActionMonitor.b0(str, j);
        }
    }

    public static /* synthetic */ void N(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, long j2, String str, String str2, String str3, String str4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b04cdc31", new Object[]{falcoLoadActionMonitor, new Long(j), new Long(j2), str, str2, str3, str4, new Boolean(z)});
        } else {
            falcoLoadActionMonitor.f0(j, j2, str, str2, str3, str4, z);
        }
    }

    public static /* synthetic */ void R(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d905abc", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.w0(fragment, j);
        }
    }

    public static /* synthetic */ void X(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe09b0bd", new Object[]{falcoLoadActionMonitor, fragment, new Long(j)});
        } else {
            falcoLoadActionMonitor.A0(fragment, j);
        }
    }

    public static /* synthetic */ void Y(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8b4e88c6", new Object[]{falcoLoadActionMonitor, fragment});
        } else {
            falcoLoadActionMonitor.R0(fragment);
        }
    }

    public static /* synthetic */ n Z(FalcoLoadActionMonitor falcoLoadActionMonitor, String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("f4d8631b", new Object[]{falcoLoadActionMonitor, str, str2, str3, str4, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Boolean(z)});
        }
        return falcoLoadActionMonitor.J0(str, str2, str3, str4, j, j2, j3, j4, z);
    }

    public static /* synthetic */ void f(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fe8a39c1", new Object[]{falcoLoadActionMonitor, new Long(j), new Float(f2), new Float(f3)});
        } else {
            falcoLoadActionMonitor.L0(j, f2, f3);
        }
    }

    public static /* synthetic */ void g(FalcoLoadActionMonitor falcoLoadActionMonitor, m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1861e997", new Object[]{falcoLoadActionMonitor, aVar});
        } else {
            falcoLoadActionMonitor.U(aVar);
        }
    }

    public static /* synthetic */ void h(FalcoLoadActionMonitor falcoLoadActionMonitor, s.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89ce1f97", new Object[]{falcoLoadActionMonitor, bVar});
        } else {
            falcoLoadActionMonitor.V(bVar);
        }
    }

    public static /* synthetic */ void i(FalcoLoadActionMonitor falcoLoadActionMonitor, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("68ecf614", new Object[]{falcoLoadActionMonitor, new Integer(i2), new Long(j)});
        } else {
            falcoLoadActionMonitor.G0(i2, j);
        }
    }

    public static /* synthetic */ void j(FalcoLoadActionMonitor falcoLoadActionMonitor) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("acfb1492", new Object[]{falcoLoadActionMonitor});
        } else {
            falcoLoadActionMonitor.P();
        }
    }

    public static /* synthetic */ void j0(FalcoLoadActionMonitor falcoLoadActionMonitor, Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9e3949f0", new Object[]{falcoLoadActionMonitor, fragment});
        } else {
            falcoLoadActionMonitor.v0(fragment);
        }
    }

    public static /* synthetic */ void k(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1f18e73", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.c0(j);
        }
    }

    public static /* synthetic */ void l(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f17b2874", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.a0(j);
        }
    }

    public static /* synthetic */ void m(FalcoLoadActionMonitor falcoLoadActionMonitor, u.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c04f4778", new Object[]{falcoLoadActionMonitor, aVar, new Long(j)});
        } else {
            falcoLoadActionMonitor.Q(aVar, j);
        }
    }

    public static /* synthetic */ void n(FalcoLoadActionMonitor falcoLoadActionMonitor, u.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78dc07d7", new Object[]{falcoLoadActionMonitor, aVar, new Long(j)});
        } else {
            falcoLoadActionMonitor.S(aVar, j);
        }
    }

    public static /* synthetic */ void p(FalcoLoadActionMonitor falcoLoadActionMonitor, u.a aVar, m.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("53996b9e", new Object[]{falcoLoadActionMonitor, aVar, aVar2});
        } else {
            falcoLoadActionMonitor.W(aVar, aVar2);
        }
    }

    public static /* synthetic */ void q(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efa19078", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.I0(j);
        }
    }

    public static /* synthetic */ void r(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("42155782", new Object[]{falcoLoadActionMonitor, new Long(j), new Float(f2), new Float(f3)});
        } else {
            falcoLoadActionMonitor.N0(j, f2, f3);
        }
    }

    public static /* synthetic */ void s(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, float f2, float f3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b80d90e", new Object[]{falcoLoadActionMonitor, new Long(j), new Float(f2), new Float(f3)});
        } else {
            falcoLoadActionMonitor.M0(j, f2, f3);
        }
    }

    public static /* synthetic */ void t(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bacee215", new Object[]{falcoLoadActionMonitor, new Long(j), new Long(j2)});
        } else {
            falcoLoadActionMonitor.d0(j, j2);
        }
    }

    public static /* synthetic */ void u(FalcoLoadActionMonitor falcoLoadActionMonitor, long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f522da4", new Object[]{falcoLoadActionMonitor, new Long(j), str, str2});
        } else {
            falcoLoadActionMonitor.o0(j, str, str2);
        }
    }

    public static /* synthetic */ void v(FalcoLoadActionMonitor falcoLoadActionMonitor, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4119a91", new Object[]{falcoLoadActionMonitor, new Long(j)});
        } else {
            falcoLoadActionMonitor.F0(j);
        }
    }

    public static /* synthetic */ void w(FalcoLoadActionMonitor falcoLoadActionMonitor, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17a3446", new Object[]{falcoLoadActionMonitor, hVar});
        } else {
            falcoLoadActionMonitor.K0(hVar);
        }
    }

    public static /* synthetic */ h x(FalcoLoadActionMonitor falcoLoadActionMonitor, h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (h) ipChange.ipc$dispatch("fa704231", new Object[]{falcoLoadActionMonitor, hVar});
        }
        falcoLoadActionMonitor.k = hVar;
        return hVar;
    }

    public static /* synthetic */ void y(FalcoLoadActionMonitor falcoLoadActionMonitor, ckh ckhVar, long j, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6fbfb80", new Object[]{falcoLoadActionMonitor, ckhVar, new Long(j), nVar});
        } else {
            falcoLoadActionMonitor.l0(ckhVar, j, nVar);
        }
    }

    public static /* synthetic */ void z(FalcoLoadActionMonitor falcoLoadActionMonitor, Activity activity, Fragment fragment, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d60c8759", new Object[]{falcoLoadActionMonitor, activity, fragment, new Long(j), new Long(j2)});
        } else {
            falcoLoadActionMonitor.C0(activity, fragment, j, j2);
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void A(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c8321", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            s0(activity, keyEvent, j);
        }
    }

    public final void A0(Fragment fragment, long j) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("70852a67", new Object[]{this, fragment, new Long(j)});
            return;
        }
        long b2 = f.b(fragment.hashCode(), 2);
        FragmentActivity activity = fragment.getActivity();
        String name = fragment.getClass().getName();
        if (activity == null) {
            str = name;
        } else {
            str = activity.getLocalClassName() + "_" + name;
        }
        String simpleName = fragment.getClass().getSimpleName();
        O().p(fragment, b2);
        Long valueOf = Long.valueOf(b2);
        Long valueOf2 = Long.valueOf(j);
        if (this.x == 0) {
            z = true;
        } else {
            z = false;
        }
        crt.h(new LoadRunnable(this, 8, valueOf, valueOf2, str, name, simpleName, "", Boolean.valueOf(z)));
    }

    public void B0(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c4a636", new Object[]{this, intent});
        } else {
            crt.h(new LoadRunnable(this, 2, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final void C0(Activity activity, Fragment fragment, long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb2b0b6d", new Object[]{this, activity, fragment, new Long(j), new Long(j2)});
        } else {
            Choreographer.getInstance().postFrameCallback(new b(activity, fragment, j, j2));
        }
    }

    public void E0(e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("173ac8be", new Object[]{this, eVar});
        } else {
            this.u = eVar;
        }
    }

    public final void F0(long j) {
        i currentPageInfo;
        boolean z;
        String str;
        boolean z2 = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("245a14c3", new Object[]{this, new Long(j)});
            return;
        }
        SubPageRecord correspondSubPageRecord = this.d.correspondSubPageRecord(j);
        if (correspondSubPageRecord != null) {
            correspondSubPageRecord.hasUsed = true;
            if (TextUtils.isEmpty(correspondSubPageRecord.leaveType)) {
                BasePageRecord basePageRecord = correspondSubPageRecord.parent;
                if (!basePageRecord.isEmpty()) {
                    SubPageRecord first = basePageRecord.getFirst();
                    if (first.pageInfo.f10449a == j) {
                        z2 = true;
                    }
                    if (z2 || first.hasUsed) {
                        z = z2;
                        str = "back";
                    } else {
                        z = z2;
                        str = n.LEAVE_TYPE_JUMP_NEXT_PAGE;
                    }
                } else {
                    str = n.LEAVE_TYPE_JUMP_NEXT_PAGE;
                    z = false;
                }
                correspondSubPageRecord.leaveType = str;
                correspondSubPageRecord.leaveTimestamp = -1L;
                correspondSubPageRecord.originPageName = null;
                correspondSubPageRecord.simpleName = null;
                Iterator<SubPageRecord> it = correspondSubPageRecord.iterator();
                while (it.hasNext()) {
                    SubPageRecord next = it.next();
                    if (f.d(next.pageInfo.f10449a) == 3 && next.status != 1) {
                        k0(next, str, correspondSubPageRecord.leaveTimestamp);
                    }
                }
                long j2 = correspondSubPageRecord.leaveTimestamp;
                i iVar = correspondSubPageRecord.pageInfo;
                g0(j, 2, j2, iVar.b, correspondSubPageRecord.originPageName, correspondSubPageRecord.simpleName, iVar.c, str);
                z2 = z;
            }
        }
        this.d.dyingFragmentSubPageRecord(j);
        if (this.k != null && z2 && (currentPageInfo = this.d.currentPageInfo()) != null) {
            this.k.b((n) ((ConcurrentHashMap) this.b).get(Long.valueOf(currentPageInfo.f10449a)));
        }
    }

    public final void H0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ca13e5bd", new Object[]{this});
            return;
        }
        Context a2 = yy8.a();
        if (a2 != null) {
            this.z = TBAutoSizeConfig.x().H(a2);
            this.A = TBAutoSizeConfig.x().B(a2);
        }
    }

    public final void K0(h hVar) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b461ba2", new Object[]{this, hVar});
            return;
        }
        this.k = hVar;
        i currentPageInfo = this.d.currentPageInfo();
        t tVar = null;
        if (currentPageInfo != null) {
            nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(currentPageInfo.f10449a));
        } else {
            nVar = null;
        }
        g peek = this.f10441a.peek();
        if (peek != null) {
            tVar = peek.j;
        }
        hVar.c(tVar, nVar);
        hVar.b(nVar);
    }

    public final e O() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (e) ipChange.ipc$dispatch("95c0249d", new Object[]{this});
        }
        e eVar = this.u;
        if (eVar == null) {
            return e.DEFAULT;
        }
        return eVar;
    }

    public final String O0(long j, float f2, float f3, n nVar) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("1bbbe447", new Object[]{this, new Long(j), new Float(f2), new Float(f3), nVar});
        }
        if (this.f == 0) {
            this.f = j;
            this.g = f2;
            this.h = f3;
            this.i = 1;
            return String.valueOf(j);
        }
        float abs = Math.abs(f2 - this.g);
        float abs2 = Math.abs(f3 - this.h);
        if (j - this.f <= 1000) {
            float f4 = (float) this.B;
            if (abs <= f4 && abs2 <= f4) {
                int i2 = this.i + 1;
                this.i = i2;
                if (i2 == 3) {
                    if (nVar != null) {
                        nVar.b();
                        if (!TextUtils.isEmpty(nVar.getPageName())) {
                            str = nVar.getPageName();
                            ALog.e("falco.LoadActionMonitor", "Detected a rageClicks event, occurred on the page: " + str, null, new Object[0]);
                        }
                    }
                    str = "";
                    ALog.e("falco.LoadActionMonitor", "Detected a rageClicks event, occurred on the page: " + str, null, new Object[0]);
                }
                return String.valueOf(this.f);
            }
        }
        this.f = j;
        this.g = f2;
        this.h = f3;
        this.i = 1;
        return String.valueOf(this.f);
    }

    public final void P() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c681c20", new Object[]{this});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doBackground", null, new Object[0]);
        Iterator<g> it = this.f10441a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.f10441a.clear();
        this.v = false;
        this.w = -1L;
        this.r = null;
        this.f = 0L;
        this.g = 0.0f;
        this.h = 0.0f;
        this.i = 0;
    }

    public void P0(ckh ckhVar, long j, n nVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4c48fd0c", new Object[]{this, ckhVar, new Long(j), nVar});
        } else {
            crt.h(new LoadRunnable(this, 25, ckhVar, Long.valueOf(j), nVar));
        }
    }

    public final void Q0(Fragment fragment, View view, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c7e3a7b5", new Object[]{this, fragment, view, bundle});
        } else if (view != null) {
            long b2 = f.b(fragment.hashCode(), 2);
            FragmentActivity activity = fragment.getActivity();
            String name = fragment.getClass().getName();
            if (activity != null) {
                name = activity.getLocalClassName() + "_" + name;
            }
            crt.h(new LoadRunnable(this, 21, Long.valueOf(b2), name, null));
        }
    }

    public final void R0(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6876aee4", new Object[]{this, fragment});
        } else {
            crt.h(new LoadRunnable(this, 22, Long.valueOf(f.b(fragment.hashCode(), 2))));
        }
    }

    public void S0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("74d8f149", new Object[]{this});
        } else {
            crt.h(new LoadRunnable(this, 24, new Object[0]));
        }
    }

    public void T0(h hVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82324ded", new Object[]{this, hVar});
        } else if (hVar != null) {
            crt.h(new LoadRunnable(this, 23, hVar));
        }
    }

    public final void U(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("27a7e7d4", new Object[]{this, aVar});
        } else {
            aVar.a(m0());
        }
    }

    public final void V(s.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("396588be", new Object[]{this, bVar});
        } else {
            bVar.onTouchActionSpan(q0());
        }
    }

    public final void W(u.a aVar, m.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77e8378e", new Object[]{this, aVar, aVar2});
            return;
        }
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(f.b(aVar.f10480a, 3)));
        if (nVar != null) {
            aVar2.a(nVar);
        }
    }

    @Override // com.taobao.falco.WindowHookManager.a
    public void a(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2a6b4835", new Object[]{this, activity, keyEvent, new Long(j)});
        } else {
            s0(activity, keyEvent, j);
        }
    }

    public final void a0(long j) {
        SubPageRecord removeSubPageRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("983ab8fe", new Object[]{this, new Long(j)});
            return;
        }
        int d2 = f.d(j);
        if (d2 == 1) {
            ActivityRecord removeActivityRecord = this.d.removeActivityRecord(j);
            if (removeActivityRecord != null) {
                for (Long l : removeActivityRecord.customViews()) {
                    this.d.removeSubPageRecord(3, l.longValue());
                    ((ConcurrentHashMap) this.b).remove(l);
                }
            }
        } else if (d2 == 2 && (removeSubPageRecord = this.d.removeSubPageRecord(2, j)) != null) {
            for (Long l2 : removeSubPageRecord.customViews()) {
                this.d.removeSubPageRecord(3, l2.longValue());
                ((ConcurrentHashMap) this.b).remove(l2);
            }
        }
        ((ConcurrentHashMap) this.b).remove(Long.valueOf(j));
    }

    @Override // com.taobao.falco.u
    public void b(u.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff619013", new Object[]{this, aVar});
        } else if (aVar == null) {
            ALog.e("falco.LoadActionMonitor", "[finishTransitionWithViewInfo] invalid viewInfo", null, new Object[0]);
        } else {
            crt.h(new LoadRunnable(this, 16, aVar, Long.valueOf(System.currentTimeMillis())));
        }
    }

    @Override // com.taobao.falco.u
    public void c(u.a aVar, m.a aVar2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71675999", new Object[]{this, aVar, aVar2});
        } else if (aVar == null || aVar2 == null) {
            ALog.e("falco.LoadActionMonitor", "[getViewLoadActionSpan] invalid viewInfo or callback is null", null, new Object[0]);
        } else {
            crt.h(new LoadRunnable(this, 17, aVar, aVar2));
        }
    }

    @Override // com.taobao.falco.WindowHookManager.a
    public void d(Activity activity, int i2, float f2, float f3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("73e110ee", new Object[]{this, activity, new Integer(i2), new Float(f2), new Float(f3), new Long(j)});
        } else {
            t0(activity, i2, f2, f3, j);
        }
    }

    public final void d0(long j, long j2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("96bf8ef5", new Object[]{this, new Long(j), new Long(j2)});
        } else {
            ((HashMap) this.C).put(Long.valueOf(j), Long.valueOf(j2));
        }
    }

    @Override // com.taobao.falco.u
    public void e(u.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ab7327bd", new Object[]{this, aVar});
        } else if (aVar == null) {
            ALog.e("falco.LoadActionMonitor", "[beginTransitionWithViewInfo] invalid viewInfo", null, new Object[0]);
        } else {
            crt.h(new LoadRunnable(this, 15, aVar, Long.valueOf(System.currentTimeMillis())));
        }
    }

    public final void g0(long j, int i2, long j2, String str, String str2, String str3, String str4, String str5) {
        LinkedList linkedList;
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee7cd626", new Object[]{this, new Long(j), new Integer(i2), new Long(j2), str, str2, str3, str4, str5});
            return;
        }
        if (!TextUtils.isEmpty(str3) && (linkedList = (LinkedList) ((HashMap) this.c).get(Integer.valueOf(str3.hashCode()))) != null) {
            Iterator it = linkedList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (c) it.next();
                if (cVar != null && cVar.c == j) {
                    break;
                }
            }
            if (cVar != null) {
                linkedList.remove(cVar);
            }
            if (linkedList.isEmpty()) {
                ((HashMap) this.c).remove(Integer.valueOf(str3.hashCode()));
            }
        }
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
        if (nVar != null && nVar.F1() == j) {
            nVar.L1(str5);
        }
        O().r(nVar, j, str, str2, str4, j2, this.y);
    }

    public final void k0(SubPageRecord subPageRecord, String str, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("503334e5", new Object[]{this, subPageRecord, str, new Long(j)});
            return;
        }
        subPageRecord.status = 1;
        i iVar = subPageRecord.pageInfo;
        long j2 = iVar.f10449a;
        String str2 = iVar.b;
        g0(j2, 3, j, str2, str2, null, iVar.c, str);
    }

    public final void l0(ckh ckhVar, long j, n nVar) {
        i currentPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a42160e0", new Object[]{this, ckhVar, new Long(j), nVar});
        } else if (this.k != null && (currentPageInfo = this.d.currentPageInfo()) != null) {
            if (nVar.F1() == currentPageInfo.f10449a || nVar.d() == currentPageInfo.f10449a) {
                this.k.a(ckhVar, j, nVar);
            }
        }
    }

    public m m0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (m) ipChange.ipc$dispatch("15f0a69e", new Object[]{this});
        }
        return (m) ((ConcurrentHashMap) this.b).get(Long.valueOf(this.q));
    }

    public void n0(m.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("75f8332b", new Object[]{this, aVar});
        } else if (aVar != null) {
            crt.h(new LoadRunnable(this, 9, aVar));
        }
    }

    @Override // com.taobao.monitor.impl.trace.l.c
    public void o(Activity activity, int i2, float f2, float f3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("747a3d9a", new Object[]{this, activity, new Integer(i2), new Float(f2), new Float(f3), new Long(j)});
        } else {
            t0(activity, i2, f2, f3, j + p0());
        }
    }

    public final void o0(long j, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d44696d5", new Object[]{this, new Long(j), str, str2});
        } else {
            this.d.addSubPageRecord(2, j, str, str2);
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityCreated(Activity activity, Bundle bundle) {
        String str;
        long j;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cce650e1", new Object[]{this, activity, bundle});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String localClassName = activity.getLocalClassName();
        String simpleName = activity.getClass().getSimpleName();
        long b2 = f.b(activity.hashCode(), 1);
        Intent intent = activity.getIntent();
        long j2 = -1;
        if (intent != null) {
            str = intent.getDataString();
            j2 = intent.getLongExtra(Nav.NAV_TO_URL_START_UPTIME, -1L);
            j = intent.getLongExtra(Nav.NAV_START_ACTIVITY_UPTIME, -1L);
        } else {
            str = null;
            j = -1;
        }
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        if (j2 > 0 && j > 0) {
            long p0 = p0();
            j2 += p0;
            j += p0;
        }
        O().c(activity, bundle, b2, currentTimeMillis);
        crt.h(new LoadRunnable(this, 3, localClassName, localClassName, simpleName, str, Long.valueOf(b2), Long.valueOf(currentTimeMillis), Long.valueOf(j2), Long.valueOf(j), Boolean.valueOf(z)));
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityDestroyed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4148cc84", new Object[]{this, activity});
            return;
        }
        WindowHookManager windowHookManager = this.t;
        if (windowHookManager != null) {
            windowHookManager.k(activity);
        }
        long b2 = f.b(activity.hashCode(), 1);
        O().d(activity);
        crt.h(new LoadRunnable(this, 14, Long.valueOf(b2)));
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityPaused(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a4658a75", new Object[]{this, activity});
            return;
        }
        long b2 = f.b(activity.hashCode(), 1);
        O().e(activity, b2);
        crt.h(new LoadRunnable(this, 13, Long.valueOf(b2)));
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityResumed(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3e8abf42", new Object[]{this, activity});
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = f.b(activity.hashCode(), 1);
        this.d.topResumedActivityCode = b2;
        O().f(activity, b2);
        C0(activity, null, b2, currentTimeMillis);
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c9c12a", new Object[]{this, activity, bundle});
        } else {
            O().g(activity, bundle);
        }
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityStarted(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5e01616c", new Object[]{this, activity});
            return;
        }
        this.x++;
        long currentTimeMillis = System.currentTimeMillis();
        long b2 = f.b(activity.hashCode(), 1);
        O().h(activity, b2, currentTimeMillis);
        crt.h(new LoadRunnable(this, 4, Long.valueOf(b2), Long.valueOf(currentTimeMillis)));
    }

    @Override // com.taobao.falco.FalcoNativePageLifecycleCallbacks.a
    public void onActivityStopped(Activity activity) {
        String str;
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dc236bb8", new Object[]{this, activity});
            return;
        }
        int i2 = this.x - 1;
        this.x = i2;
        if (i2 < 0) {
            this.x = 0;
        }
        long currentTimeMillis = System.currentTimeMillis();
        String localClassName = activity.getLocalClassName();
        String simpleName = activity.getClass().getSimpleName();
        Intent intent = activity.getIntent();
        if (intent != null) {
            str = intent.getDataString();
        } else {
            str = null;
        }
        if (str == null) {
            str = "";
        }
        long b2 = f.b(activity.hashCode(), 1);
        if (this.d.topResumedActivityCode == b2) {
            this.d.topResumedActivityCode = -1L;
        }
        O().i(activity, b2, currentTimeMillis);
        Long valueOf = Long.valueOf(b2);
        Long valueOf2 = Long.valueOf(currentTimeMillis);
        if (this.x == 0) {
            z = true;
        } else {
            z = false;
        }
        crt.h(new LoadRunnable(this, 8, valueOf, valueOf2, localClassName, localClassName, simpleName, str, Boolean.valueOf(z)));
    }

    @Override // tb.u11, com.taobao.application.common.IApmEventListener
    public void onEvent(int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i2)});
        } else if (i2 == 1) {
            crt.h(new LoadRunnable(this, 12, new Object[0]));
        }
    }

    @Override // com.taobao.application.common.IPageListener
    public void onPageChanged(String str, int i2, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fcf1be38", new Object[]{this, str, new Integer(i2), new Long(j)});
            return;
        }
        long p0 = j + p0();
        if (i2 == 2) {
            crt.h(new LoadRunnable(this, 6, str, Long.valueOf(p0)));
        } else if (i2 == 3) {
            crt.h(new LoadRunnable(this, 7, str, Long.valueOf(p0)));
        }
    }

    public final long p0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6f970731", new Object[]{this})).longValue();
        }
        return System.currentTimeMillis() - SystemClock.uptimeMillis();
    }

    public s q0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("a87333a", new Object[]{this});
        }
        return this.e;
    }

    public void r0(s.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3efda1bd", new Object[]{this, bVar});
        } else if (bVar != null) {
            crt.h(new LoadRunnable(this, 10, bVar));
        }
    }

    public final void s0(Activity activity, KeyEvent keyEvent, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3976a0c6", new Object[]{this, activity, keyEvent, new Long(j)});
            return;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 4) {
            crt.h(new LoadRunnable(this, 11, Integer.valueOf(keyEvent.getAction()), Long.valueOf(j)));
        } else if (keyCode == WindowHookManager.a.KEYCODE_CUSTOM_ENTER) {
            crt.h(new LoadRunnable(this, 18, Long.valueOf(j)));
        }
    }

    public final void t0(Activity activity, int i2, float f2, float f3, long j) {
        int i3;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b011bbf", new Object[]{this, activity, new Integer(i2), new Float(f2), new Float(f3), new Long(j)});
            return;
        }
        if (i2 == 0) {
            i3 = 0;
        } else if (1 == i2) {
            i3 = 1;
        } else if (2 == i2) {
            i3 = 19;
        } else {
            i3 = -1;
        }
        if (i3 != -1) {
            crt.h(new LoadRunnable(this, i3, Long.valueOf(j), Float.valueOf(f2), Float.valueOf(f3)));
        }
    }

    public final void u0(Fragment fragment, Bundle bundle, long j) {
        String str;
        boolean z;
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("60c67808", new Object[]{this, fragment, bundle, new Long(j)});
            return;
        }
        long b2 = f.b(fragment.hashCode(), 2);
        FragmentActivity activity = fragment.getActivity();
        String name = fragment.getClass().getName();
        String simpleName = fragment.getClass().getSimpleName();
        if (activity != null) {
            str = activity.getLocalClassName() + "_" + name;
        } else {
            str = name;
        }
        if (bundle != null) {
            z = true;
        } else {
            z = false;
        }
        Bundle arguments = fragment.getArguments();
        long j3 = -1;
        if (arguments != null) {
            j3 = arguments.getLong("NAV_TO_URL_START_TIME", -1L);
            j2 = arguments.getLong(hx9.KEY_FRAGMENT_START_TIME, -1L);
        } else {
            j2 = -1;
        }
        O().j(fragment, bundle, b2);
        crt.h(new LoadRunnable(this, 3, str, name, simpleName, null, Long.valueOf(b2), Long.valueOf(j), Long.valueOf(j3), Long.valueOf(j2), Boolean.valueOf(z)));
    }

    public final void v0(Fragment fragment) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3ec9209", new Object[]{this, fragment});
            return;
        }
        WindowHookManager windowHookManager = this.t;
        if (windowHookManager != null) {
            windowHookManager.l(fragment);
        }
        long b2 = f.b(fragment.hashCode(), 2);
        O().k(fragment, b2);
        crt.h(new LoadRunnable(this, 14, Long.valueOf(b2)));
    }

    public final void w0(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b51e03e8", new Object[]{this, fragment, new Long(j)});
            return;
        }
        long b2 = f.b(fragment.hashCode(), 2);
        O().l(fragment, b2);
        crt.h(new LoadRunnable(this, 13, Long.valueOf(b2)));
    }

    public final void x0(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e4a8038d", new Object[]{this, fragment, new Long(j)});
        } else {
            crt.h(new LoadRunnable(this, 20, Long.valueOf(f.b(fragment.hashCode(), 2)), Long.valueOf(j)));
        }
    }

    public final void y0(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("161f1c9d", new Object[]{this, fragment, new Long(j)});
            return;
        }
        FragmentActivity activity = fragment.getActivity();
        long b2 = f.b(fragment.hashCode(), 2);
        O().m(fragment, b2);
        this.j.postAtFrontOfQueue(new a(activity, fragment, b2, j));
    }

    public final void z0(Fragment fragment, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7eb45c33", new Object[]{this, fragment, new Long(j)});
            return;
        }
        long b2 = f.b(fragment.hashCode(), 2);
        O().o(fragment, b2);
        crt.h(new LoadRunnable(this, 4, Long.valueOf(b2), Long.valueOf(j)));
    }

    public void D0(boolean z, boolean z2, boolean z3, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7b829d9a", new Object[]{this, new Boolean(z), new Boolean(z2), new Boolean(z3), new Long(j)});
            return;
        }
        this.B = j;
        this.j = new Handler(Looper.getMainLooper());
        try {
            if (z2) {
                WindowHookManager windowHookManager = new WindowHookManager();
                this.t = windowHookManager;
                windowHookManager.i(this, z3);
            } else {
                zzb<?> a2 = ic.a(ic.WINDOW_EVENT_DISPATCHER);
                if (a2 != null) {
                    ALog.e("falco.LoadActionMonitor", "register windowDispatcher", null, new Object[0]);
                    a2.addListener(this);
                }
            }
            FalcoNativePageLifecycleCallbacks.a().c(this);
            FalcoNativePageLifecycleCallbacks.a().e(new d(this));
            c21.e(this);
            c21.c(this);
            if (z) {
                new com.taobao.falco.a().a(this);
            }
        } catch (Throwable th) {
            ALog.e("falco.LoadActionMonitor", "registerPageMonitor error", null, th, new Object[0]);
        }
    }

    public final void I0(long j) {
        long j2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ecbf778a", new Object[]{this, new Long(j)});
            return;
        }
        i currentPageInfo = this.d.currentPageInfo();
        String str = "";
        if (currentPageInfo != null) {
            j2 = currentPageInfo.f10449a;
            if (!TextUtils.isEmpty(currentPageInfo.b)) {
                str = currentPageInfo.b;
            }
        } else {
            j2 = -1;
        }
        ALog.e("falco.LoadActionMonitor", "doKeyCustomEnter", null, "pageName", str, "pageCode", Long.valueOf(j2), "time", Long.valueOf(j));
        L0(j, 0.0f, 0.0f);
        N0(j, 0.0f, 0.0f);
    }

    public final void c0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4ff2c841", new Object[]{this, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPagePause", null, "pageCode", Long.valueOf(j));
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
        if (nVar != null && nVar.F1() == j) {
            nVar.e2();
        }
    }

    public final void i0(long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3de1817", new Object[]{this, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onStartActivity", null, "time", Long.valueOf(j));
        g peek = this.f10441a.peek();
        if (peek != null) {
            this.r = peek.g;
            peek.c = j;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static final class TaskStack extends LinkedList<ActivityRecord> {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        private final Map<Long, ActivityRecord> mDyingActivityRecords;
        private final Map<Long, SubPageRecord> mDyingFragmentRecords;
        private final Map<Long, SubPageRecord> mSubPageRecords;
        public volatile long topResumedActivityCode;

        private TaskStack() {
            this.topResumedActivityCode = -1L;
            this.mSubPageRecords = new HashMap();
            this.mDyingActivityRecords = new HashMap();
            this.mDyingFragmentRecords = new HashMap();
        }

        public static /* synthetic */ Object ipc$super(TaskStack taskStack, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/falco/FalcoLoadActionMonitor$TaskStack");
        }

        public ActivityRecord addActivityRecord(long j, String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityRecord) ipChange.ipc$dispatch("9d89b917", new Object[]{this, new Long(j), str, str2});
            }
            ActivityRecord activityRecord = new ActivityRecord(new i(j, str, str2), this);
            addFirst(activityRecord);
            return activityRecord;
        }

        public SubPageRecord addSubPageRecord(int i, long j, String str, String str2) {
            ActivityRecord activityRecord;
            SubPageRecord subPageRecord;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubPageRecord) ipChange.ipc$dispatch("f9e197ea", new Object[]{this, new Integer(i), new Long(j), str, str2});
            }
            if (i == 2) {
                subPageRecord = this.mDyingFragmentRecords.remove(Long.valueOf(j));
                if (subPageRecord != null) {
                    subPageRecord.isDying = false;
                    subPageRecord.parent.addFirst(subPageRecord);
                    return subPageRecord;
                }
                if (isEmpty()) {
                    addActivityRecord(-1L, "", "");
                }
                activityRecord = getFirst();
            } else {
                activityRecord = null;
                if (i == 3) {
                    subPageRecord = this.mSubPageRecords.get(Long.valueOf(j));
                    if (subPageRecord != null) {
                        subPageRecord.parent.remove(subPageRecord);
                        subPageRecord.parent.addFirst(subPageRecord);
                        return subPageRecord;
                    } else if (!isEmpty()) {
                        activityRecord = getFirst();
                    }
                } else {
                    subPageRecord = null;
                }
            }
            if (!(activityRecord == null || (subPageRecord = activityRecord.addSubPageRecord(i, j, str, str2)) == null)) {
                this.mSubPageRecords.put(Long.valueOf(j), subPageRecord);
            }
            return subPageRecord;
        }

        public ActivityRecord correspondActivityRecord(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityRecord) ipChange.ipc$dispatch("b6ee78d9", new Object[]{this, new Long(j)});
            }
            Iterator<ActivityRecord> it = iterator();
            while (it.hasNext()) {
                ActivityRecord next = it.next();
                if (next.pageInfo.f10449a == j) {
                    return next;
                }
            }
            return null;
        }

        public SubPageRecord correspondSubPageRecord(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubPageRecord) ipChange.ipc$dispatch("af90bc9b", new Object[]{this, new Long(j)});
            }
            return this.mSubPageRecords.get(Long.valueOf(j));
        }

        public i currentPageInfo() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (i) ipChange.ipc$dispatch("b003774d", new Object[]{this});
            }
            ActivityRecord correspondActivityRecord = correspondActivityRecord(this.topResumedActivityCode);
            if (correspondActivityRecord != null) {
                return correspondActivityRecord.currentPageInfo();
            }
            return null;
        }

        public void dyingFragmentSubPageRecord(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f08a787a", new Object[]{this, new Long(j)});
                return;
            }
            SubPageRecord subPageRecord = this.mSubPageRecords.get(Long.valueOf(j));
            if (subPageRecord != null) {
                subPageRecord.parent.remove(subPageRecord);
                subPageRecord.isDying = true;
                this.mDyingFragmentRecords.put(Long.valueOf(j), subPageRecord);
            }
        }

        public ActivityRecord removeActivityRecord(long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (ActivityRecord) ipChange.ipc$dispatch("59f36ece", new Object[]{this, new Long(j)});
            }
            ActivityRecord correspondActivityRecord = correspondActivityRecord(j);
            if (correspondActivityRecord != null) {
                Iterator<SubPageRecord> it = correspondActivityRecord.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (f.d(it.next().pageInfo.f10449a) == 2) {
                            correspondActivityRecord.isDying = true;
                            this.mDyingActivityRecords.put(Long.valueOf(j), correspondActivityRecord);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                remove(correspondActivityRecord);
            }
            return correspondActivityRecord;
        }

        public SubPageRecord removeSubPageRecord(int i, long j) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (SubPageRecord) ipChange.ipc$dispatch("3bdd28d3", new Object[]{this, new Integer(i), new Long(j)});
            }
            SubPageRecord remove = this.mSubPageRecords.remove(Long.valueOf(j));
            if (remove != null) {
                if (i == 2) {
                    if (remove.isDying) {
                        this.mDyingFragmentRecords.remove(Long.valueOf(j));
                    } else {
                        remove.parent.remove(remove);
                    }
                    BasePageRecord basePageRecord = remove.parent;
                    if (basePageRecord instanceof ActivityRecord) {
                        ActivityRecord activityRecord = (ActivityRecord) basePageRecord;
                        if (activityRecord.isDying && activityRecord.isEmpty()) {
                            this.mDyingActivityRecords.remove(Long.valueOf(activityRecord.pageInfo.f10449a));
                        }
                    }
                } else if (i == 3) {
                    remove.parent.remove(remove);
                }
            }
            return remove;
        }

        public /* synthetic */ TaskStack(a aVar) {
            this();
        }
    }

    public final void G0(int i2, long j) {
        long j2;
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1472cb83", new Object[]{this, new Integer(i2), new Long(j)});
            return;
        }
        i currentPageInfo = this.d.currentPageInfo();
        if (currentPageInfo != null) {
            j2 = currentPageInfo.f10449a;
            str = currentPageInfo.b;
        } else {
            j2 = -1;
            str = "";
        }
        ALog.e("falco.LoadActionMonitor", "doKeyBack", null, "pageName", str, "pageCode", Long.valueOf(j2), "time", Long.valueOf(j));
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j2));
        if (nVar != null) {
            nVar.L1("back");
        }
        if (i2 == 0) {
            L0(j, 0.0f, 0.0f);
        } else if (i2 == 1) {
            N0(j, 0.0f, 0.0f);
        }
    }

    public final void b0(String str, long j) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a3a548b", new Object[]{this, str, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onPageInteractive", null, "page", str, "time", Long.valueOf(j));
        LinkedList linkedList = (LinkedList) ((HashMap) this.c).get(Integer.valueOf(str.hashCode()));
        if (linkedList != null) {
            while (!linkedList.isEmpty() && ((cVar = (c) linkedList.getFirst()) == null || (cVar.f10446a && cVar.b))) {
                linkedList.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2 != null && !cVar2.b) {
                    cVar2.b = true;
                    n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(cVar2.c));
                    if (nVar != null) {
                        nVar.S1(Long.valueOf(j));
                        xy8 W1 = nVar.W1();
                        if (W1 != null) {
                            W1.O(nVar.getFalcoId());
                            W1.K((String) nVar.A0(n.PAGE_NAME.getKey()));
                            W1.L((String) nVar.A0(n.PAGE_URL.getKey()));
                            W1.Q();
                            W1.F();
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void e0(long j, long j2) {
        SubPageRecord correspondSubPageRecord;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aacbd40f", new Object[]{this, new Long(j), new Long(j2)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPageStart", null, "pageCode", Long.valueOf(j), "time", Long.valueOf(j2));
        int d2 = f.d(j);
        if (d2 == 1) {
            ActivityRecord correspondActivityRecord = this.d.correspondActivityRecord(j);
            if (correspondActivityRecord != null) {
                correspondActivityRecord.leaveType = null;
            }
        } else if (d2 == 2 && (correspondSubPageRecord = this.d.correspondSubPageRecord(j)) != null) {
            correspondSubPageRecord.leaveType = null;
            correspondSubPageRecord.leaveTimestamp = -1L;
            correspondSubPageRecord.originPageName = null;
            correspondSubPageRecord.simpleName = null;
        }
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
        if (nVar != null && !nVar.K1()) {
            nVar.K(Long.valueOf(j2));
        }
    }

    public final void h0(String str, long j) {
        c cVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9b422dfb", new Object[]{this, str, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "onPageVisible", null, "page", str, "time", Long.valueOf(j));
        LinkedList linkedList = (LinkedList) ((HashMap) this.c).get(Integer.valueOf(str.hashCode()));
        if (linkedList != null) {
            while (!linkedList.isEmpty() && ((cVar = (c) linkedList.getFirst()) == null || (cVar.f10446a && cVar.b))) {
                linkedList.removeFirst();
            }
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                c cVar2 = (c) it.next();
                if (cVar2 != null && !cVar2.f10446a) {
                    cVar2.f10446a = true;
                    n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(cVar2.c));
                    if (nVar != null) {
                        nVar.R1(Long.valueOf(j));
                        return;
                    }
                    return;
                }
            }
        }
    }

    public final void M0(long j, float f2, float f3) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25af24d8", new Object[]{this, new Long(j), new Float(f2), new Float(f3)});
            return;
        }
        i currentPageInfo = this.d.currentPageInfo();
        if (currentPageInfo == null || TextUtils.isEmpty(currentPageInfo.b)) {
            str = "";
        } else {
            str = currentPageInfo.b;
        }
        ALog.e("falco.LoadActionMonitor", "onTouchMove", null, "pageName", str, "time", Long.valueOf(j));
        g peek = this.f10441a.peek();
        if (peek != null) {
            t tVar = peek.j;
            if (tVar != null) {
                tVar.L1(Long.valueOf(j));
                tVar.K1(f2, f3);
            }
            if (!peek.l) {
                peek.b = j;
                xy8 xy8Var = peek.k;
                if (xy8Var != null) {
                    xy8Var.R();
                }
            }
        }
    }

    public final void N0(long j, float f2, float f3) {
        n nVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("683c05ce", new Object[]{this, new Long(j), new Float(f2), new Float(f3)});
            return;
        }
        i currentPageInfo = this.d.currentPageInfo();
        String str = "";
        if (currentPageInfo != null) {
            if (!TextUtils.isEmpty(currentPageInfo.b)) {
                str = currentPageInfo.b;
            }
            nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(currentPageInfo.f10449a));
            if (nVar != null) {
                nVar.Z1(true);
                nVar.c(Long.valueOf(j));
            }
        } else {
            nVar = null;
        }
        ALog.e("falco.LoadActionMonitor", "onTouchUp", null, "pageName", str, "time", Long.valueOf(j));
        g peek = this.f10441a.peek();
        if (peek != null) {
            t tVar = peek.j;
            if (tVar != null && !tVar.B0()) {
                tVar.N1(Long.valueOf(j));
                tVar.M1(f2, f3);
                s.a C1 = tVar.C1();
                if (C1 != null && (Math.abs(f2 - C1.f10478a) > 50.0f || Math.abs(f3 - C1.b) > 50.0f)) {
                    tVar.y1(t.CATEGORY_FLICK);
                }
                h hVar = this.k;
                if (hVar != null) {
                    hVar.c(tVar, nVar);
                }
            }
            if (!peek.l) {
                peek.b = j;
                xy8 xy8Var = peek.k;
                if (xy8Var != null) {
                    xy8Var.R();
                }
            }
        }
    }

    public final void S(u.a aVar, long j) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("90b59899", new Object[]{this, aVar, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doFinishCustomViewTransition", null, "page", aVar.b, "pageCode", Integer.valueOf(aVar.f10480a), "transitionType", aVar.d, ccs.KEY_IS_HOME_PAGE, Boolean.valueOf(aVar.e), "time", Long.valueOf(j));
        T(f.b(aVar.f10480a, 3), -1L, -1L, (aVar.e || "back".equals(aVar.d)) ? -1L : j);
    }

    public final void Q(u.a aVar, long j) {
        String str;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b579b279", new Object[]{this, aVar, new Long(j)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doBeginCustomViewTransition", null, "pageName", aVar.b, "pageCode", Integer.valueOf(aVar.f10480a), "transitionType", aVar.d, ccs.KEY_IS_HOME_PAGE, Boolean.valueOf(aVar.e), "time", Long.valueOf(j));
        long b2 = f.b(aVar.f10480a, 3);
        if ("back".equals(aVar.d)) {
            SubPageRecord removeSubPageRecord = this.d.removeSubPageRecord(3, b2);
            if (removeSubPageRecord != null && removeSubPageRecord.status != 1) {
                k0(removeSubPageRecord, "back", System.currentTimeMillis());
                return;
            }
            return;
        }
        SubPageRecord addSubPageRecord = this.d.addSubPageRecord(3, b2, aVar.b, aVar.c);
        if (addSubPageRecord != null) {
            if (addSubPageRecord.parent.size() > 1) {
                SubPageRecord subPageRecord = addSubPageRecord.parent.get(1);
                if (f.d(subPageRecord.pageInfo.f10449a) == 3 && subPageRecord.status != 1) {
                    k0(subPageRecord, n.LEAVE_TYPE_JUMP_NEXT_PAGE, System.currentTimeMillis());
                }
            }
            if (!aVar.e) {
                if (TextUtils.isEmpty(aVar.b)) {
                    str = "";
                } else {
                    str = aVar.b;
                }
                n J0 = J0(str, str, null, aVar.c, b2, j, -1L, -1L, false);
                if (J0 != null) {
                    J0.L(Long.valueOf(j));
                }
            } else if (!((ConcurrentHashMap) this.b).containsKey(Long.valueOf(b2))) {
                i iVar = addSubPageRecord.parent.pageInfo;
                i iVar2 = addSubPageRecord.pageInfo;
                iVar2.b = iVar.b;
                iVar2.c = iVar.c;
                n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(iVar.f10449a));
                if (nVar != null) {
                    nVar.n0(b2);
                    ((ConcurrentHashMap) this.b).put(Long.valueOf(b2), nVar);
                }
                addSubPageRecord.status = 1;
            }
        }
    }

    public final void T(long j, long j2, long j3, long j4) {
        i currentPageInfo;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d8fcf45", new Object[]{this, new Long(j), new Long(j2), new Long(j3), new Long(j4)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doFirstFrameRender", null, "pageCode", Long.valueOf(j), "pageResumeTime", Long.valueOf(j2), "firstFrameRenderStart", Long.valueOf(j3), "firstFrameRenderEnd", Long.valueOf(j4));
        if (f.d(j) == 1) {
            H0();
        }
        if (!(this.k == null || (currentPageInfo = this.d.currentPageInfo()) == null)) {
            this.k.b((n) ((ConcurrentHashMap) this.b).get(Long.valueOf(currentPageInfo.f10449a)));
        }
        n nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
        if (nVar != null && nVar.Q1() && !nVar.K1()) {
            if (j2 > 0) {
                nVar.T1(Long.valueOf(j2));
            }
            if (j3 > 0) {
                nVar.L(Long.valueOf(j3));
            }
            if (j4 > 0) {
                nVar.w(Long.valueOf(j4));
            }
        }
    }

    public final void L0(long j, float f2, float f3) {
        String str;
        n nVar;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24d3dee7", new Object[]{this, new Long(j), new Float(f2), new Float(f3)});
            return;
        }
        i currentPageInfo = this.d.currentPageInfo();
        String str2 = "";
        if (currentPageInfo != null) {
            str2 = !TextUtils.isEmpty(currentPageInfo.b) ? currentPageInfo.b : str2;
            str = !TextUtils.isEmpty(currentPageInfo.c) ? currentPageInfo.c : str2;
            nVar = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(currentPageInfo.f10449a));
            if (nVar != null) {
                nVar.Z1(true);
                str2 = nVar.getFalcoId();
            }
        } else {
            str2 = str2;
            str = str2;
            nVar = null;
        }
        ALog.e("falco.LoadActionMonitor", "onTouchDown", null, "pageName", str2, "time", Long.valueOf(j));
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var != null) {
            this.e = (t) tz8Var.d(s.MODULE, s.SCENE).g(j).j();
            this.e.y1("tap");
            this.e.y(str2);
            this.e.l0(str);
            this.e.J1(Long.valueOf(j));
            this.e.I1(f2, f3);
            this.e.A1(str2);
            this.e.G1(this.z, this.A);
            aVar = null;
        } else {
            aVar = null;
            this.e = null;
        }
        g gVar = new g(aVar);
        gVar.f10448a = j;
        gVar.b = j;
        gVar.d = str2;
        gVar.e = str;
        gVar.f = f2 + "_" + f3;
        gVar.g = gVar.b + "_" + gVar.f;
        gVar.h = str2;
        if (this.e != null) {
            gVar.j = this.e;
            gVar.i = this.e.getFalcoId();
            this.e.F1(O0(j, f2, f3, nVar));
        }
        xy8 xy8Var = new xy8();
        xy8Var.N(xy8.TOPIC_LOAD_ACTION);
        xy8Var.M("load");
        xy8Var.I(str2);
        xy8Var.J(str);
        xy8Var.R();
        gVar.k = xy8Var.q();
        this.f10441a.push(gVar);
        if (this.f10441a.size() > 10) {
            this.f10441a.removeLast().a();
        }
    }

    public final void f0(long j, long j2, String str, String str2, String str3, String str4, boolean z) {
        String str5;
        String str6;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("48883fe9", new Object[]{this, new Long(j), new Long(j2), str, str2, str3, str4, new Boolean(z)});
            return;
        }
        ALog.e("falco.LoadActionMonitor", "doPageStop", null, "pageName", str, "pageCode", Long.valueOf(j), "time", Long.valueOf(j2));
        if (f.d(j) == 1) {
            if (z) {
                str6 = n.LEAVE_TYPE_F2B;
            } else if (this.d.isEmpty() || j != this.d.getFirst().pageInfo.f10449a) {
                str6 = n.LEAVE_TYPE_JUMP_NEXT_PAGE;
            } else {
                str6 = "back";
            }
            ActivityRecord correspondActivityRecord = this.d.correspondActivityRecord(j);
            if (correspondActivityRecord != null) {
                correspondActivityRecord.leaveType = str6;
                Iterator<SubPageRecord> it = correspondActivityRecord.iterator();
                while (it.hasNext()) {
                    SubPageRecord next = it.next();
                    if (f.d(next.pageInfo.f10449a) == 3 && next.status != 1) {
                        k0(next, str6, j2);
                    }
                }
            }
            g0(j, 1, j2, str, str2, str3, str4, str6);
            return;
        }
        SubPageRecord correspondSubPageRecord = this.d.correspondSubPageRecord(j);
        if (z) {
            str5 = n.LEAVE_TYPE_F2B;
        } else {
            if (!this.d.isEmpty()) {
                ActivityRecord first = this.d.getFirst();
                if (correspondSubPageRecord != null) {
                    if (correspondSubPageRecord.parent.pageInfo.f10449a != first.pageInfo.f10449a) {
                        str5 = n.LEAVE_TYPE_JUMP_NEXT_PAGE;
                    } else if (!TextUtils.isEmpty(first.leaveType)) {
                        str5 = first.leaveType;
                    }
                }
            }
            str5 = null;
        }
        if (!TextUtils.isEmpty(str5)) {
            if (correspondSubPageRecord != null) {
                correspondSubPageRecord.leaveType = str5;
                correspondSubPageRecord.leaveTimestamp = -1L;
                correspondSubPageRecord.originPageName = null;
                correspondSubPageRecord.simpleName = null;
                Iterator<SubPageRecord> it2 = correspondSubPageRecord.iterator();
                while (it2.hasNext()) {
                    SubPageRecord next2 = it2.next();
                    if (f.d(next2.pageInfo.f10449a) == 3 && next2.status != 1) {
                        k0(next2, str5, j2);
                    }
                }
            }
            g0(j, 2, j2, str, str2, str3, str4, str5);
        } else if (correspondSubPageRecord != null) {
            correspondSubPageRecord.leaveType = null;
            correspondSubPageRecord.leaveTimestamp = j2;
            correspondSubPageRecord.originPageName = str2;
            correspondSubPageRecord.simpleName = str3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final n J0(String str, String str2, String str3, String str4, long j, long j2, long j3, long j4, boolean z) {
        g gVar;
        n nVar;
        a aVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (n) ipChange.ipc$dispatch("52774978", new Object[]{this, str, str2, str3, str4, new Long(j), new Long(j2), new Long(j3), new Long(j4), new Boolean(z)});
        }
        ALog.e("falco.LoadActionMonitor", "doPageCreate", null, "pageName", str, "pageCode", Long.valueOf(j), "time", Long.valueOf(j2));
        if (f.d(j) == 1) {
            this.d.addActivityRecord(j, str, str4);
        }
        tz8 tz8Var = FalcoGlobalTracer.get();
        if (tz8Var == null) {
            return null;
        }
        n nVar2 = (n) ((ConcurrentHashMap) this.b).get(Long.valueOf(j));
        if (nVar2 != null) {
            return nVar2;
        }
        if (!this.f10441a.isEmpty()) {
            if (TextUtils.isEmpty(this.r)) {
                this.r = this.f10441a.peek().g;
            }
            gVar = null;
            while (this.f10441a.size() > 1) {
                gVar = this.f10441a.peekLast();
                if (gVar.g.equals(this.r)) {
                    break;
                }
                gVar.a();
                this.f10441a.removeLast();
            }
            if (this.f10441a.size() == 1) {
                gVar = this.f10441a.peek();
            }
            this.r = null;
        } else {
            gVar = null;
        }
        if (gVar == null) {
            if (this.v) {
                nVar = (n) tz8Var.d(m.MODULE, "tap").g(SceneIdentifier.getProcessStartTime()).e();
            } else {
                if (this.w == -1) {
                    this.w = j2;
                }
                nVar = (n) tz8Var.d(m.MODULE, "tap").g(this.w).e();
            }
            nVar.d2(true);
            nVar.Q("");
            nVar.B("");
            nVar.A1("");
            nVar.C1("");
        } else {
            gVar.l = true;
            nVar = (n) tz8Var.d(m.MODULE, "tap").g(gVar.b).e();
            nVar.d2(false);
            nVar.g2(Long.valueOf(gVar.f10448a));
            nVar.Q(gVar.d);
            nVar.B(gVar.e);
            nVar.A1(gVar.h);
            nVar.C1(gVar.i);
            long j5 = gVar.c;
            if (j5 > 0) {
                nVar.O1(Long.valueOf(j5));
            }
            nVar.Y1(gVar.k.q());
        }
        nVar.b0();
        nVar.Z("native");
        nVar.c0(Long.valueOf(j2));
        nVar.y(str);
        nVar.b2(str2);
        nVar.P1(j);
        nVar.o0(this);
        nVar.B1(z);
        if (!TextUtils.isEmpty(str4)) {
            nVar.l0(str4);
        }
        Long l = (Long) ((HashMap) this.C).remove(Long.valueOf(j));
        if (l != null) {
            nVar.U1(l);
        } else {
            nVar.U1(Long.valueOf(j2));
        }
        if (j3 > 0) {
            aVar = 0;
            aVar = 0;
            if (j4 > 0) {
                nVar.V(Long.valueOf(j3));
                nVar.U(Long.valueOf(j4));
            }
        } else {
            aVar = 0;
        }
        this.q = j;
        ((ConcurrentHashMap) this.b).put(Long.valueOf(j), nVar);
        if (!TextUtils.isEmpty(str3)) {
            LinkedList linkedList = (LinkedList) ((HashMap) this.c).get(Integer.valueOf(str3.hashCode()));
            if (linkedList == null) {
                linkedList = new LinkedList();
                ((HashMap) this.c).put(Integer.valueOf(str3.hashCode()), linkedList);
            }
            c cVar = new c(aVar);
            cVar.c = j;
            linkedList.addLast(cVar);
        }
        O().q(gVar == null ? aVar : gVar.j, nVar, j);
        return nVar;
    }
}
