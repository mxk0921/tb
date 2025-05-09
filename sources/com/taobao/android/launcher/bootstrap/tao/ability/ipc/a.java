package com.taobao.android.launcher.bootstrap.tao.ability.ipc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import com.android.alibaba.ip.runtime.IpChange;
import tb.b8l;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static b f8157a;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.android.launcher.bootstrap.tao.ability.ipc.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface AbstractC0433a {
        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i);

        Intent c(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler);

        Intent d(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i);

        Context getAppContext();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface b {
        Intent a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter);

        Intent b(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i);

        void c();
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        AbstractC0433a getContext();
    }

    public static void a(c cVar, b8l b8lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1d75090f", new Object[]{cVar, b8lVar});
        } else {
            f8157a = IPCKnifeImpl.e(cVar.getContext(), b8lVar);
        }
    }

    public static void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e26c67bc", new Object[0]);
            return;
        }
        b bVar = f8157a;
        if (bVar != null) {
            bVar.c();
            return;
        }
        throw new IllegalStateException("IPCKnife is not initialized");
    }

    public static Intent c(c cVar, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("10ef33a", new Object[]{cVar, broadcastReceiver, intentFilter});
        }
        b bVar = f8157a;
        if (bVar == null) {
            return cVar.getContext().a(broadcastReceiver, intentFilter);
        }
        return bVar.a(broadcastReceiver, intentFilter);
    }

    public static Intent d(c cVar, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Intent) ipChange.ipc$dispatch("f7e42569", new Object[]{cVar, broadcastReceiver, intentFilter, new Integer(i)});
        }
        b bVar = f8157a;
        if (bVar == null) {
            return cVar.getContext().b(broadcastReceiver, intentFilter, i);
        }
        return bVar.b(broadcastReceiver, intentFilter, i);
    }
}
