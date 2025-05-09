package com.alibaba.ability.impl.broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.abilityidl.ability.AbsBroadcastAbility;
import com.taobao.android.abilityidl.ability.BroadcastEventResult;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import tb.a04;
import tb.a07;
import tb.ckf;
import tb.ekb;
import tb.el2;
import tb.gmi;
import tb.kmi;
import tb.t2o;
import tb.xhv;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public final class BroadcastAbility extends AbsBroadcastAbility {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, BroadcastReceiver>> f1932a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, ConcurrentHashMap<String, gmi>> b = new ConcurrentHashMap<>();
    public final AtomicInteger c = new AtomicInteger(0);
    public kmi d;
    public LocalBroadcastManager e;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class a {
        static {
            t2o.a(100663298);
        }

        public a() {
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
    public static final class b extends gmi {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ el2 d;
        public final /* synthetic */ ConcurrentHashMap e;
        public final /* synthetic */ String f;
        public final /* synthetic */ ekb g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(el2 el2Var, ConcurrentHashMap concurrentHashMap, String str, ekb ekbVar, String str2, String str3, String str4, String str5, boolean z) {
            super(str4, str5, z);
            this.d = el2Var;
            this.e = concurrentHashMap;
            this.f = str;
            this.g = ekbVar;
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/broadcast/BroadcastAbility$addEventListener$messageCallback$1");
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // tb.gmi
        public void d(Map<?, ?> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("4cdeb5f6", new Object[]{this, map});
                return;
            }
            if (this.d.c) {
                this.e.remove(this.f);
            }
            ekb ekbVar = this.g;
            BroadcastEventResult broadcastEventResult = new BroadcastEventResult();
            boolean z = map instanceof Map;
            Map map2 = map;
            if (!z) {
                map2 = null;
            }
            broadcastEventResult.detail = map2;
            xhv xhvVar = xhv.INSTANCE;
            ekbVar.onEvent(broadcastEventResult);
        }
    }

    static {
        t2o.a(100663297);
    }

    public static final /* synthetic */ LocalBroadcastManager access$getLocalBroadcastManager(BroadcastAbility broadcastAbility, Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("6dc84553", new Object[]{broadcastAbility, context});
        }
        return broadcastAbility.c(context);
    }

    public static /* synthetic */ Object ipc$super(BroadcastAbility broadcastAbility, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/ability/impl/broadcast/BroadcastAbility");
    }

    public final String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a7b56d35", new Object[]{this});
        }
        return "listener_id#" + this.c.incrementAndGet();
    }

    public final String b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7d51bc5e", new Object[]{this, str, str2});
        }
        if (ckf.b(str, "__APP__")) {
            return str2;
        }
        return str + '.' + str2;
    }

    public final LocalBroadcastManager c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LocalBroadcastManager) ipChange.ipc$dispatch("68f06522", new Object[]{this, context});
        }
        LocalBroadcastManager localBroadcastManager = this.e;
        if (localBroadcastManager != null) {
            return localBroadcastManager;
        }
        LocalBroadcastManager instance = LocalBroadcastManager.getInstance(context);
        this.e = instance;
        ckf.f(instance, "LocalBroadcastManager.ge…astManager = it\n        }");
        return instance;
    }

    public final kmi d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (kmi) ipChange.ipc$dispatch("43b6f74e", new Object[]{this});
        }
        kmi kmiVar = this.d;
        if (kmiVar != null) {
            return kmiVar;
        }
        kmi kmiVar2 = new kmi();
        this.d = kmiVar2;
        return kmiVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r2 != null) goto L_0x00ab;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void dispatchEvent(tb.kdb r7, tb.ll2 r8, tb.jdb r9) {
        /*
            r6 = this;
            com.android.alibaba.ip.runtime.IpChange r0 = com.alibaba.ability.impl.broadcast.BroadcastAbility.$ipChange
            boolean r1 = r0 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r1 == 0) goto L_0x001b
            java.lang.String r1 = "3f67a4c2"
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r6
            r3 = 1
            r2[r3] = r7
            r7 = 2
            r2[r7] = r8
            r7 = 3
            r2[r7] = r9
            r0.ipc$dispatch(r1, r2)
            return
        L_0x001b:
            java.lang.String r0 = "abilityContext"
            tb.ckf.g(r7, r0)
            java.lang.String r0 = "params"
            tb.ckf.g(r8, r0)
            java.lang.String r0 = "callback"
            tb.ckf.g(r9, r0)
            java.lang.String r0 = r8.b
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r0 = r2
        L_0x0036:
            if (r0 == 0) goto L_0x00b5
            java.lang.String r1 = "__APP__"
            java.lang.String r3 = r8.f23391a
            boolean r1 = tb.ckf.b(r1, r3)
            if (r1 == 0) goto L_0x009b
            tb.ldb r7 = r7.l()
            android.content.Context r7 = r7.getContext()
            if (r7 == 0) goto L_0x0089
            androidx.localbroadcastmanager.content.LocalBroadcastManager r7 = r6.c(r7)
            android.content.Intent r9 = new android.content.Intent
            r9.<init>(r0)
            java.util.Map<java.lang.String, ? extends java.lang.Object> r8 = r8.c
            if (r8 == 0) goto L_0x0083
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x0061:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0083
            java.lang.Object r0 = r8.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x007e
            java.lang.String r0 = r0.toString()
            goto L_0x007f
        L_0x007e:
            r0 = r2
        L_0x007f:
            r9.putExtra(r1, r0)
            goto L_0x0061
        L_0x0083:
            tb.xhv r8 = tb.xhv.INSTANCE
            r7.sendBroadcast(r9)
            goto L_0x00b4
        L_0x0089:
            com.alibaba.ability.result.ErrorResult r7 = new com.alibaba.ability.result.ErrorResult
            r4 = 4
            r5 = 0
            java.lang.String r1 = "500"
            java.lang.String r2 = "env.getContext is null"
            r3 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r9.O(r7)
            return
        L_0x009b:
            java.lang.String r7 = r8.f23391a
            if (r7 == 0) goto L_0x00a9
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x00a6
            r2 = r7
        L_0x00a6:
            if (r2 == 0) goto L_0x00a9
            goto L_0x00ab
        L_0x00a9:
            java.lang.String r2 = "__MEGA_GLOBAL_MESSAGE__"
        L_0x00ab:
            tb.kmi r7 = r6.d()
            java.util.Map<java.lang.String, ? extends java.lang.Object> r8 = r8.c
            r7.c(r2, r0, r8)
        L_0x00b4:
            return
        L_0x00b5:
            com.alibaba.ability.result.ErrorResult$a$a r7 = com.alibaba.ability.result.ErrorResult.a.Companion
            java.lang.String r8 = "eventName is empty"
            com.alibaba.ability.result.ErrorResult r7 = r7.g(r8)
            r9.O(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.dispatchEvent(tb.kdb, tb.ll2, tb.jdb):void");
    }

    public final void e(LocalBroadcastManager localBroadcastManager, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1dca091a", new Object[]{this, localBroadcastManager, str});
            return;
        }
        ConcurrentHashMap<String, BroadcastReceiver> concurrentHashMap = this.f1932a.get(str);
        if (concurrentHashMap != null) {
            for (BroadcastReceiver broadcastReceiver : concurrentHashMap.values()) {
                localBroadcastManager.unregisterReceiver(broadcastReceiver);
            }
            this.f1932a.remove(str);
        }
    }

    @Override // tb.st, tb.odb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        LocalBroadcastManager localBroadcastManager = this.e;
        if (localBroadcastManager != null) {
            Enumeration<String> keys = this.f1932a.keys();
            ckf.f(keys, "broadcastReceiverMap.keys()");
            Iterator s = a04.s(keys);
            while (true) {
                a04.a aVar = (a04.a) s;
                if (!aVar.hasNext()) {
                    break;
                }
                String str = (String) aVar.next();
                ckf.f(str, "key");
                e(localBroadcastManager, str);
            }
            this.e = null;
        }
        kmi kmiVar = this.d;
        if (kmiVar != null) {
            kmiVar.b();
        }
        this.d = null;
        this.b.clear();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a2, code lost:
        if (r2 != null) goto L_0x00a7;
     */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void removeEventListener(tb.kdb r7, tb.vl2 r8, tb.jdb r9) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.removeEventListener(tb.kdb, tb.vl2, tb.jdb):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    @Override // com.taobao.android.abilityidl.ability.AbsBroadcastAbility
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void addEventListener(tb.kdb r18, final tb.el2 r19, final tb.ekb r20) {
        /*
            Method dump skipped, instructions count: 279
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.ability.impl.broadcast.BroadcastAbility.addEventListener(tb.kdb, tb.el2, tb.ekb):void");
    }
}
