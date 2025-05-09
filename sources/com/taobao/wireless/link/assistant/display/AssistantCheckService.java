package com.taobao.wireless.link.assistant.display;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Timer;
import java.util.TimerTask;
import tb.br7;
import tb.irg;
import tb.jsg;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class AssistantCheckService extends Service {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public Context f14165a;
    public Timer b;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public static class a extends TimerTask {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public Context f14166a;

        static {
            t2o.a(1030750238);
        }

        public a(Context context) {
            this.f14166a = context;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/wireless/link/assistant/display/AssistantCheckService$RefreshTask");
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            irg.a("link_tag", "AssistantCheckService === RefreshTask === 1.5s检测，显示小助手");
            if (!jsg.q(this.f14166a)) {
                br7.d(this.f14166a);
            }
        }
    }

    static {
        t2o.a(1030750237);
    }

    public static /* synthetic */ Object ipc$super(AssistantCheckService assistantCheckService, String str, Object... objArr) {
        int hashCode = str.hashCode();
        if (hashCode == -1504501726) {
            super.onDestroy();
            return null;
        } else if (hashCode == 413640386) {
            super.onCreate();
            return null;
        } else if (hashCode == 1992651935) {
            return new Integer(super.onStartCommand((Intent) objArr[0], ((Number) objArr[1]).intValue(), ((Number) objArr[2]).intValue()));
        } else {
            int hashCode2 = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode2 + " in com/taobao/wireless/link/assistant/display/AssistantCheckService");
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (IBinder) ipChange.ipc$dispatch("30c27bd", new Object[]{this, intent});
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("18a7a6c2", new Object[]{this});
            return;
        }
        super.onCreate();
        this.f14165a = this;
    }

    @Override // android.app.Service
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        Timer timer = this.b;
        if (timer != null) {
            timer.cancel();
            this.b = null;
            irg.a("link_tag", "AssistantCheckService === onDestroy === Service被终止的同时也停止定时器继续运行");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("76c5749f", new Object[]{this, intent, new Integer(i), new Integer(i2)})).intValue();
        }
        if (this.b == null) {
            Timer timer = new Timer();
            this.b = timer;
            timer.scheduleAtFixedRate(new a(this.f14165a), 0L, 1500L);
            irg.a("link_tag", "AssistantCheckService === onStartCommand === 开启定时器，每隔1.5秒刷新一次");
        }
        return super.onStartCommand(intent, i, i2);
    }
}
