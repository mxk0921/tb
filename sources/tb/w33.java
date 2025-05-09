package tb;

import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.accessibility.A11yInitHelper;
import com.taobao.android.task.Coordinator;
import com.taobao.android.tracker.DynamicTrackWeexModule;
import com.taobao.calendar.receiver.CalendarReceiver;
import com.taobao.login4android.broadcast.LoginBroadcastHelper;
import com.taobao.weex.WXSDKEngine;
import com.taobao.weex.common.WXException;
import tb.b02;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class w33 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f30429a;

        public a(Application application) {
            this.f30429a = application;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                hu2.f().h(this.f30429a);
                hu2.i();
                LoginBroadcastHelper.registerLoginReceiver(this.f30429a, new CalendarReceiver());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class b implements b02.b<p5c> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Application f30430a;

        public b(Application application) {
            this.f30430a = application;
        }

        @Override // tb.b02.b
        public void a(String str, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("96fce058", new Object[]{this, str, bundle});
            } else {
                Log.e("CapsuleBundle", "FavSdkManager init failed");
            }
        }

        /* renamed from: c */
        public void b(p5c p5cVar, Bundle bundle) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dff0ef1", new Object[]{this, p5cVar, bundle});
            } else {
                p5cVar.init(this.f30430a, null);
            }
        }
    }

    public static void a(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fe67c6", new Object[]{application});
            return;
        }
        Log.e("CapsuleBundle", "initBundle");
        b(application);
        p58.m().i();
        try {
            WXSDKEngine.registerModule("dynamicTracker", DynamicTrackWeexModule.class);
        } catch (WXException e) {
            e.printStackTrace();
        }
        Coordinator.execute(new a(application));
        try {
            A11yInitHelper.init(application);
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("CapsuleBundle", th.getMessage());
        }
        try {
            ld1.a(application);
        } catch (Throwable th2) {
            th2.printStackTrace();
            Log.e("CapsuleBundle", th2.getMessage());
        }
    }

    public static void b(Application application) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18357a49", new Object[]{application});
        } else {
            vcq.a(application).c(xcq.c().k(v8f.h(application, "com.taobao.android.favsdk.favtaobaouse.FavSdkManager").f(new b(application)).a()).n());
        }
    }
}
