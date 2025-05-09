package com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.festival.FestivalMgr;
import com.taobao.tao.Globals;
import tb.fve;
import tb.que;
import tb.t2o;
import tb.uk2;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class TbGlobalThemeSubscriber {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final a f10836a;
    public boolean b = false;
    public final BroadcastReceiver c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface a {
        void a();
    }

    static {
        t2o.a(491782847);
    }

    public TbGlobalThemeSubscriber(a aVar) {
        BroadcastReceiver broadcastReceiver = new BroadcastReceiver() { // from class: com.taobao.infoflow.taobao.subservice.framework.themeservice.impl.listener.TbGlobalThemeSubscriber.1
            public static volatile transient /* synthetic */ IpChange $ipChange;

            public static /* synthetic */ Object ipc$super(AnonymousClass1 r2, String str, Object... objArr) {
                str.hashCode();
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/infoflow/taobao/subservice/framework/themeservice/impl/listener/TbGlobalThemeSubscriber$1");
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("3c04d85a", new Object[]{this, context, intent});
                    return;
                }
                String action = intent.getAction();
                fve.f("TbGlobalThemeSubscriber", "onReceive " + action);
                if (FestivalMgr.ACTION_FESTIVAL_CHANGE.equals(action) && TbGlobalThemeSubscriber.a(TbGlobalThemeSubscriber.this)) {
                    TbGlobalThemeSubscriber.b(TbGlobalThemeSubscriber.this).a();
                }
            }
        };
        this.c = broadcastReceiver;
        this.f10836a = aVar;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d();
        uk2.a(true, broadcastReceiver, FestivalMgr.ACTION_FESTIVAL_CHANGE);
        fve.e("TbGlobalThemeSubscriber", "registerReceiver us time : " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms");
    }

    public static /* synthetic */ boolean a(TbGlobalThemeSubscriber tbGlobalThemeSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b074e46f", new Object[]{tbGlobalThemeSubscriber})).booleanValue();
        }
        return tbGlobalThemeSubscriber.d();
    }

    public static /* synthetic */ a b(TbGlobalThemeSubscriber tbGlobalThemeSubscriber) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bbae9864", new Object[]{tbGlobalThemeSubscriber});
        }
        return tbGlobalThemeSubscriber.f10836a;
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else {
            uk2.b(true, this.c);
        }
    }

    public final boolean d() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d24a59ad", new Object[]{this})).booleanValue();
        }
        boolean a2 = que.a(Globals.getApplication());
        if (a2 != this.b) {
            z = true;
        }
        if (z) {
            this.b = a2;
            fve.f("TbGlobalThemeSubscriber", "isDarkMode change, value:  " + a2);
        }
        return z;
    }
}
