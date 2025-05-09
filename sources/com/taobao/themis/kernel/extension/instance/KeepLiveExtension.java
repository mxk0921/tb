package com.taobao.themis.kernel.extension.instance;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.taobao.themis.kernel.basic.TMSLogger;
import tb.a07;
import tb.bbs;
import tb.ckf;
import tb.t2o;
import tb.u9h;
import tb.yjy;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public final class KeepLiveExtension implements yjy {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final a Companion = new a(null);

    /* renamed from: a  reason: collision with root package name */
    public final bbs f13569a;
    public boolean b;
    public final BroadcastReceiver c = new BroadcastReceiver() { // from class: com.taobao.themis.kernel.extension.instance.KeepLiveExtension$mBgServiceReceiver$1
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public static /* synthetic */ Object ipc$super(KeepLiveExtension$mBgServiceReceiver$1 keepLiveExtension$mBgServiceReceiver$1, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/themis/kernel/extension/instance/KeepLiveExtension$mBgServiceReceiver$1");
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                return;
            }
            ckf.g(context, "context");
            ckf.g(intent, CommonCode.Resolution.HAS_RESOLUTION_FROM_APK);
            if (!ckf.b(intent.getStringExtra("bizID"), KeepLiveExtension.b(KeepLiveExtension.this).d0())) {
                TMSLogger.b("KeepLiveExtension", "notifyKeepLive failed, appId not match");
                return;
            }
            String stringExtra = intent.getStringExtra("status");
            if (ckf.b(stringExtra, "stop")) {
                KeepLiveExtension.this.d(false);
                KeepLiveExtension.b(KeepLiveExtension.this).W().e();
            } else if (ckf.b(stringExtra, "start")) {
                KeepLiveExtension.this.d(true);
            }
        }
    };

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static final class a {
        static {
            t2o.a(839909585);
        }

        public /* synthetic */ a(a07 a07Var) {
            this();
        }

        public a() {
        }
    }

    static {
        t2o.a(839909584);
        t2o.a(839909563);
    }

    public KeepLiveExtension(bbs bbsVar) {
        ckf.g(bbsVar, "instance");
        this.f13569a = bbsVar;
    }

    public static final /* synthetic */ bbs b(KeepLiveExtension keepLiveExtension) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (bbs) ipChange.ipc$dispatch("e561bb0f", new Object[]{keepLiveExtension});
        }
        return keepLiveExtension.f13569a;
    }

    @Override // tb.t4c
    public void N(bbs bbsVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3dc73485", new Object[]{this, bbsVar});
            return;
        }
        ckf.g(bbsVar, "instance");
        yjy.a.a(this, bbsVar);
        LocalBroadcastManager.getInstance(bbsVar.I()).registerReceiver(this.c, new IntentFilter("com.taobao.taobao.mega.BACKGROUND_SERVICE"));
    }

    @Override // tb.yjy
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("21e6c935", new Object[]{this})).booleanValue();
        }
        if (this.b || u9h.d()) {
            return true;
        }
        return false;
    }

    @Override // tb.t4c
    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("896696a2", new Object[]{this});
            return;
        }
        LocalBroadcastManager.getInstance(this.f13569a.I()).unregisterReceiver(this.c);
        yjy.a.b(this);
    }

    public void d(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6937cf37", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }
}
