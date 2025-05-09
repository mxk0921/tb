package com.taobao.taobao.scancode.gateway.activity;

import android.app.Activity;
import android.media.AudioAttributes;
import android.media.SoundPool;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.virtual_thread.face.VExecutors;
import com.taobao.taobao.R;
import java.util.concurrent.ExecutorService;
import tb.agh;
import tb.caa;
import tb.qqt;
import tb.t2o;
import tb.vpt;
import tb.zio;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class ResultViewController implements LifecycleObserver {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String d = ResultViewController.class.getSimpleName();

    /* renamed from: a  reason: collision with root package name */
    public SoundPool f12922a;
    public final LifecycleOwner b;
    public final ExecutorService c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements qqt {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a(ResultViewController resultViewController) {
        }

        @Override // tb.qqt
        public String newThreadName() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("57dab4a4", new Object[]{this});
            }
            return "scan_sound" + hashCode();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class b extends zio {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taobao/scancode/gateway/activity/ResultViewController$2");
        }

        @Override // tb.zio
        public void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15c1193f", new Object[]{this});
            } else {
                ResultViewController.a(ResultViewController.this).getLifecycle().addObserver(ResultViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class c implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ResultViewController.b(ResultViewController.this);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class d implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (ResultViewController.c(ResultViewController.this) != null) {
                ResultViewController.c(ResultViewController.this).play(1, 1.0f, 1.0f, 0, 0, 1.0f);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class e implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ResultViewController.d(ResultViewController.this);
            }
        }
    }

    static {
        t2o.a(760217685);
    }

    public ResultViewController(Activity activity) {
        ExecutorService newSingleThreadExecutor = VExecutors.newSingleThreadExecutor(new a(this));
        this.c = newSingleThreadExecutor;
        if (activity instanceof LifecycleOwner) {
            this.b = (LifecycleOwner) activity;
            vpt.g("addObserver", new b());
            newSingleThreadExecutor.submit(new c());
        }
    }

    public static /* synthetic */ LifecycleOwner a(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LifecycleOwner) ipChange.ipc$dispatch("3db17927", new Object[]{resultViewController});
        }
        return resultViewController.b;
    }

    public static /* synthetic */ void b(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cd2467ab", new Object[]{resultViewController});
        } else {
            resultViewController.g();
        }
    }

    public static /* synthetic */ SoundPool c(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (SoundPool) ipChange.ipc$dispatch("799e8b3d", new Object[]{resultViewController});
        }
        return resultViewController.f12922a;
    }

    public static /* synthetic */ void d(ResultViewController resultViewController) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b3c35ad", new Object[]{resultViewController});
        } else {
            resultViewController.f();
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    private void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
        } else if (this.b != null) {
            this.c.submit(new e());
            this.b.getLifecycle().removeObserver(this);
            agh.h(d, "release removeObserver");
        }
    }

    public void e(Activity activity, View view, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("398eec9e", new Object[]{this, activity, view, new Integer(i)});
        } else if (i == 1) {
            activity.addContentView(view, new FrameLayout.LayoutParams(-1, -1));
        } else if (view != null && view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
    }

    public final void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        try {
            if (this.f12922a != null) {
                agh.h(d, "prepare do release");
                this.f12922a.release();
                this.f12922a = null;
            }
        } catch (Throwable th) {
            String str = d;
            agh.r("Scan", str, agh.f(str, th));
        }
        try {
            this.c.shutdown();
        } catch (Exception unused) {
        }
    }

    public final void g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f8cbe1a2", new Object[]{this});
            return;
        }
        try {
            SoundPool build = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(14).setContentType(4).build()).build();
            this.f12922a = build;
            build.load(caa.c(), R.raw.kakalib_scan, 1);
        } catch (Exception unused) {
            this.f12922a = null;
        }
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84fa1d42", new Object[]{this});
        } else {
            this.c.submit(new d());
        }
    }
}
