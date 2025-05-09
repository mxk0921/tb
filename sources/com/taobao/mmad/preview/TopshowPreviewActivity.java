package com.taobao.mmad.preview;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.motion.widget.Key;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.template.download.DXTemplateItem;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.avplayer.s;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.login4android.api.Login;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.mmad.preview.TopshowPreviewActivity;
import com.taobao.tao.remotebusiness.IRemoteBaseListener;
import com.taobao.tao.remotebusiness.IRemoteListener;
import com.taobao.tao.remotebusiness.MtopBusiness;
import com.taobao.tao.util.SystemBarDecorator;
import com.taobao.taobao.R;
import com.ut.mini.UTAnalytics;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import mtopsdk.mtop.domain.BaseOutDo;
import mtopsdk.mtop.domain.MtopRequest;
import mtopsdk.mtop.domain.MtopResponse;
import mtopsdk.mtop.intf.Mtop;
import tb.acq;
import tb.asc;
import tb.c21;
import tb.cv7;
import tb.ei2;
import tb.iwb;
import tb.j0u;
import tb.jgh;
import tb.k66;
import tb.kr7;
import tb.lsd;
import tb.mh2;
import tb.mjb;
import tb.owi;
import tb.ph2;
import tb.psg;
import tb.qt7;
import tb.t2o;
import tb.u11;
import tb.uh6;
import tb.vu7;
import tb.x3w;
import tb.ya6;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class TopshowPreviewActivity extends AppCompatActivity {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public vu7 f11067a;
    public ImageView b;
    public View c;
    public FrameLayout d;
    public FrameLayout e;
    public owi f;
    public s g;
    public ObjectAnimator h;
    public final mjb i = new c();
    public final asc j = new d();
    public final u11 k = new e();
    public final AnimatorListenerAdapter l = new f();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class a implements iwb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ya6 f11068a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public a(ya6 ya6Var, String str, String str2, String str3) {
            this.f11068a = ya6Var;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        @Override // tb.iwb
        public void onNotificationListener(k66 k66Var) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f1f5baf", new Object[]{this, k66Var});
            } else if (TopshowPreviewActivity.n3(TopshowPreviewActivity.this) != null && this.f11068a != null) {
                if (!k66Var.f22428a.isEmpty()) {
                    jgh.a("TopshowPreviewActivity", "DX template download success, refresh");
                    this.f11068a.p(k66Var.f22428a.get(0));
                    TopshowPreviewActivity.p3(TopshowPreviewActivity.this, this.b, this.c, this.d);
                    return;
                }
                TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "资源下载失败，请稍后再试");
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class b implements cv7 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Map f11069a;
        public final /* synthetic */ String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ String d;

        public b(Map map, String str, String str2, String str3) {
            this.f11069a = map;
            this.b = str;
            this.c = str2;
            this.d = str3;
        }

        public final /* synthetic */ void c() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("75375a7a", new Object[]{this});
            } else {
                TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "资源下载失败，请稍后再试");
            }
        }

        public final /* synthetic */ void d(String str, Map map, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ffc9eca1", new Object[]{this, str, map, str2});
                return;
            }
            String str3 = null;
            String str4 = !TextUtils.isEmpty(str) ? (String) map.get(str) : null;
            if (!TextUtils.isEmpty(str2)) {
                str3 = (String) map.get(str2);
            }
            if ((TextUtils.isEmpty(str) || !TextUtils.isEmpty(str4)) && (TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3))) {
                TopshowPreviewActivity.r3(TopshowPreviewActivity.this, str4, str3);
            } else {
                TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "资源下载失败，请稍后再试");
            }
        }

        @Override // tb.cv7
        public void onDownloadError(String str, int i, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cc722e3b", new Object[]{this, str, new Integer(i), str2});
            } else {
                TopshowPreviewActivity.q3(TopshowPreviewActivity.this).post(new Runnable() { // from class: tb.c5u
                    @Override // java.lang.Runnable
                    public final void run() {
                        TopshowPreviewActivity.b.this.c();
                    }
                });
            }
        }

        @Override // tb.cv7
        public void onFinish(String str, String str2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("79746b6d", new Object[]{this, str, str2});
                return;
            }
            this.f11069a.put(str, str2);
            jgh.a("TopshowPreviewActivity", "download succ, url=" + str + ", path=" + str2);
            int i = (!TextUtils.isEmpty(this.b) ? 1 : 0) + (!TextUtils.isEmpty(this.c) ? 1 : 0) + (1 ^ (TextUtils.isEmpty(this.d) ? 1 : 0));
            if (this.f11069a.size() != i) {
                jgh.a("TopshowPreviewActivity", "downloadMap.size() != needDownloadCount; downloadMap.size()=" + this.f11069a.size() + ", needDownloadCount=" + i);
                return;
            }
            View q3 = TopshowPreviewActivity.q3(TopshowPreviewActivity.this);
            final String str3 = this.b;
            final Map map = this.f11069a;
            final String str4 = this.c;
            q3.post(new Runnable() { // from class: tb.b5u
                @Override // java.lang.Runnable
                public final void run() {
                    TopshowPreviewActivity.b.this.d(str3, map, str4);
                }
            });
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class c implements mjb {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // tb.mjb
        public void a(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f83eb919", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.mjb
        public void b(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("29190544", new Object[]{this, new Integer(i)});
                return;
            }
            jgh.a("TopshowPreviewActivity", "notifyTerminate");
            TopshowPreviewActivity.s3(TopshowPreviewActivity.this).postDelayed(new Runnable() { // from class: tb.d5u
                @Override // java.lang.Runnable
                public final void run() {
                    TopshowPreviewActivity.c.this.l();
                }
            }, 500L);
        }

        @Override // tb.mjb
        public void c(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2fab6572", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.mjb
        public void d(BootImageInfo bootImageInfo, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("11d6b375", new Object[]{this, bootImageInfo, new Integer(i), new Integer(i2)});
            }
        }

        @Override // tb.mjb
        public boolean e(psg.a aVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("932c859d", new Object[]{this, aVar})).booleanValue();
            }
            return false;
        }

        @Override // tb.mjb
        public void f() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9e539127", new Object[]{this});
            }
        }

        @Override // tb.mjb
        public boolean g(JSONObject jSONObject, int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6cac902e", new Object[]{this, jSONObject, new Integer(i)})).booleanValue();
            }
            return true;
        }

        @Override // tb.mjb
        public void h() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("bc4073ee", new Object[]{this});
            }
        }

        @Override // tb.mjb
        public void i(List<qt7> list, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f9930d73", new Object[]{this, list, str});
            }
        }

        @Override // tb.mjb
        public void j(int i, lsd lsdVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9efa6ad8", new Object[]{this, new Integer(i), lsdVar});
            }
        }

        public final /* synthetic */ void l() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("15b56b12", new Object[]{this});
            } else if (!TopshowPreviewActivity.this.isFinishing()) {
                TopshowPreviewActivity.this.finish();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class d implements asc {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // tb.asc
        public void onMediaClose() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("71919eba", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaComplete() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
            } else if (TopshowPreviewActivity.t3(TopshowPreviewActivity.this) != null) {
                TopshowPreviewActivity.t3(TopshowPreviewActivity.this).i(0L);
                TopshowPreviewActivity.u3(TopshowPreviewActivity.this, null);
            }
        }

        @Override // tb.asc
        public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
                return;
            }
            jgh.a("TopshowPreviewActivity", "show video: onError." + i + ", " + i2);
        }

        @Override // tb.asc
        public void onMediaInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c0d4a24", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj});
            }
        }

        @Override // tb.asc
        public void onMediaPause(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("38b3f21c", new Object[]{this, new Boolean(z)});
            }
        }

        @Override // tb.asc
        public void onMediaPlay() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("c715ea20", new Object[]{this});
            }
        }

        @Override // tb.asc
        public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
            }
        }

        @Override // tb.asc
        public void onMediaProgressChanged(int i, int i2, int i3) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            } else {
                TopshowPreviewActivity.v3(TopshowPreviewActivity.this);
            }
        }

        @Override // tb.asc
        public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
            }
        }

        @Override // tb.asc
        public void onMediaSeekTo(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
            }
        }

        @Override // tb.asc
        public void onMediaStart() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("f694024", new Object[]{this});
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class e implements u11 {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // tb.u11, com.taobao.application.common.IApmEventListener
        public void onEvent(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("fef3fc41", new Object[]{this, new Integer(i)});
            } else if (i == 1) {
                jgh.a("TopshowPreviewActivity", "onEvent: to background");
                if (!TopshowPreviewActivity.this.isFinishing()) {
                    TopshowPreviewActivity.this.finish();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public class f extends AnimatorListenerAdapter {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        public static /* synthetic */ Object ipc$super(f fVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/preview/TopshowPreviewActivity$7");
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("8024e25a", new Object[]{this, animator});
            } else if (TopshowPreviewActivity.q3(TopshowPreviewActivity.this).getVisibility() != 0) {
                TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "资源下载失败，请稍后再试");
            }
        }
    }

    static {
        t2o.a(573571170);
    }

    public static /* synthetic */ Object ipc$super(TopshowPreviewActivity topshowPreviewActivity, String str, Object... objArr) {
        switch (str.hashCode()) {
            case -1512649357:
                super.onResume();
                return null;
            case -1504501726:
                super.onDestroy();
                return null;
            case -641568046:
                super.onCreate((Bundle) objArr[0]);
                return null;
            case 188604040:
                super.onStop();
                return null;
            case 514894248:
                super.attachBaseContext((Context) objArr[0]);
                return null;
            case 797441118:
                super.onPause();
                return null;
            default:
                int hashCode = str.hashCode();
                throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/mmad/preview/TopshowPreviewActivity");
        }
    }

    public static /* synthetic */ void m3(TopshowPreviewActivity topshowPreviewActivity, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f81f93cb", new Object[]{topshowPreviewActivity, str});
        } else {
            topshowPreviewActivity.H3(str);
        }
    }

    public static /* synthetic */ owi n3(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (owi) ipChange.ipc$dispatch("a2d71c2", new Object[]{topshowPreviewActivity});
        }
        return topshowPreviewActivity.f;
    }

    public static /* synthetic */ void o3(TopshowPreviewActivity topshowPreviewActivity, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("663a9c8d", new Object[]{topshowPreviewActivity, jSONObject});
        } else {
            topshowPreviewActivity.w3(jSONObject);
        }
    }

    public static /* synthetic */ void p3(TopshowPreviewActivity topshowPreviewActivity, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7caeaee2", new Object[]{topshowPreviewActivity, str, str2, str3});
        } else {
            topshowPreviewActivity.x3(str, str2, str3);
        }
    }

    public static /* synthetic */ View q3(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("3a089e47", new Object[]{topshowPreviewActivity});
        }
        return topshowPreviewActivity.c;
    }

    public static /* synthetic */ void r3(TopshowPreviewActivity topshowPreviewActivity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c362c9a", new Object[]{topshowPreviewActivity, str, str2});
        } else {
            topshowPreviewActivity.F3(str, str2);
        }
    }

    public static /* synthetic */ FrameLayout s3(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (FrameLayout) ipChange.ipc$dispatch("b0a6ccb2", new Object[]{topshowPreviewActivity});
        }
        return topshowPreviewActivity.d;
    }

    public static /* synthetic */ s t3(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("9ace1bd3", new Object[]{topshowPreviewActivity});
        }
        return topshowPreviewActivity.g;
    }

    public static /* synthetic */ s u3(TopshowPreviewActivity topshowPreviewActivity, s sVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s) ipChange.ipc$dispatch("889f5aec", new Object[]{topshowPreviewActivity, sVar});
        }
        topshowPreviewActivity.g = sVar;
        return sVar;
    }

    public static /* synthetic */ void v3(TopshowPreviewActivity topshowPreviewActivity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6f04249", new Object[]{topshowPreviewActivity});
        } else {
            topshowPreviewActivity.A3();
        }
    }

    public final void A3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7428f087", new Object[]{this});
            return;
        }
        ImageView imageView = this.b;
        if (imageView != null && imageView.getVisibility() != 8) {
            this.b.setVisibility(8);
        }
    }

    public final void B3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7458ca6", new Object[]{this});
        } else {
            c21.c(this.k);
        }
    }

    public final void H3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6401934", new Object[]{this, str});
            return;
        }
        j0u.a(str);
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1eb0a9a8", new Object[]{this, context});
            return;
        }
        super.attachBaseContext(context);
        acq.B(context);
    }

    public final /* synthetic */ void f(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fd3f05ab", new Object[]{this, view});
        } else {
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d9c272d2", new Object[]{this, bundle});
            return;
        }
        setTheme(R.style.Theme_BootImage);
        super.onCreate(bundle);
        this.f = new owi(new mh2(this.i));
        this.f11067a = new vu7(this.f.h());
        new SystemBarDecorator(this).enableImmersiveStatusBar();
        D3();
        B3();
        setContentView(this.d);
        G3();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        jgh.a("TopshowPreviewActivity", "onDestroy");
        this.f = null;
        this.b = null;
        this.f11067a = null;
        this.c = null;
        s sVar = this.g;
        if (sVar != null) {
            sVar.i(0L);
            this.g = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2f87fc5e", new Object[]{this});
            return;
        }
        super.onPause();
        UTAnalytics.getInstance().getDefaultTracker().pageDisAppear(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a5d6cd73", new Object[]{this});
            return;
        }
        super.onResume();
        UTAnalytics.getInstance().getDefaultTracker().pageAppear(this);
        UTAnalytics.getInstance().getDefaultTracker().updatePageName(this, "Page_Topshow_Preview");
        HashMap hashMap = new HashMap();
        hashMap.put("spm-cnt", "a2141.29632647");
        UTAnalytics.getInstance().getDefaultTracker().updatePageProperties(this, hashMap);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b3dde88", new Object[]{this});
            return;
        }
        super.onStop();
        jgh.a("TopshowPreviewActivity", "onStop");
        ObjectAnimator objectAnimator = this.h;
        if (objectAnimator != null) {
            objectAnimator.removeListener(this.l);
        }
    }

    public final void w3(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f6571785", new Object[]{this, jSONObject});
            return;
        }
        jgh.a("TopshowPreviewActivity", "checkDownloadDX");
        ya6 b2 = this.f.h().g().b();
        b2.k();
        b2.e(jSONObject);
        JSONObject f2 = ph2.f(jSONObject);
        if (f2 == null) {
            jgh.a("TopshowPreviewActivity", "content is null");
            H3("资源下载失败，请稍后再试");
            return;
        }
        String string = f2.getString("imgUrl");
        String string2 = f2.getString("videoUrl");
        String string3 = f2.getString("interactVideo");
        DXTemplateItem g = b2.g(ya6.b(this.f.h().d().m().getJSONObject("template")));
        if (g != null) {
            if (uh6.h().q(ya6.BIZ_TYPE, g)) {
                jgh.a("TopshowPreviewActivity", "DX template exist, checkResource");
                b2.p(g);
                x3(string, string2, string3);
                return;
            }
            b2.f(g);
        }
        jgh.a("TopshowPreviewActivity", "listen DX download");
        this.f.h().g().b().n(new a(b2, string, string2, string3));
    }

    public final void x3(String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("93675101", new Object[]{this, str, str2, str3});
        } else if (this.f != null && this.f11067a != null) {
            jgh.a("TopshowPreviewActivity", "checkLocalImageAndVideo: imageUrl=" + str + ", videoUrl=" + str2 + ", interactVideo=" + str3);
            ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
            this.f11067a.c(str);
            this.f11067a.c(str2);
            this.f11067a.c(str3);
            this.f11067a.g(new b(concurrentHashMap, str, str2, str3));
        }
    }

    public final void y3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("691fe2d7", new Object[]{this});
            return;
        }
        TextView textView = (TextView) this.c.findViewById(R.id.tv_close);
        textView.setText("跳过广告");
        textView.setOnClickListener(new View.OnClickListener() { // from class: tb.a5u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TopshowPreviewActivity.this.f(view);
            }
        });
        textView.setTextColor(-1);
        textView.setTextSize(13.0f);
        TextView textView2 = (TextView) this.c.findViewById(R.id.tv_countdown);
        textView2.setTextSize(13.0f);
        textView2.setText("5");
        textView2.setTextColor(-1);
        View findViewById = this.c.findViewById(R.id.ll_close);
        findViewById.setBackgroundResource(R.drawable.bootimage_commercial_skip_bg);
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = kr7.a(23.0f);
            layoutParams.width = kr7.a(75.0f);
            findViewById.setLayoutParams(layoutParams);
        }
    }

    public final Map<String, String> z3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("759aea34", new Object[]{this});
        }
        if (getIntent() == null || getIntent().getData() == null) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        Uri data = getIntent().getData();
        for (String str : data.getQueryParameterNames()) {
            hashMap.put(str, data.getQueryParameter(str));
        }
        return hashMap;
    }

    public final void F3(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8c8ac076", new Object[]{this, str, str2});
            return;
        }
        jgh.a("TopshowPreviewActivity", "renderView: imageUrl=" + str + ", videoLocalPath=" + str2);
        this.c.setVisibility(0);
        View view = this.c;
        int i = R.id.iv_bg_view;
        this.f.h().i(new ei2((ImageView) this.c.findViewById(R.id.iv_main), (ViewGroup) this.c.findViewById(R.id.fl_animation_view), this.c.findViewById(R.id.rv_title), this.c.findViewById(R.id.iv_bottom_tb_logo), this.c.findViewById(i)));
        this.f.h().g().g((FrameLayout) view.findViewById(i).getParent());
        this.b.setImageURI(Uri.parse(str));
        C3(str2);
    }

    public final void G3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3914048a", new Object[]{this});
        } else if (!Login.checkSessionValid()) {
            H3("请先登录账号");
        } else {
            MtopRequest mtopRequest = new MtopRequest();
            mtopRequest.setApiName("mtop.alimama.topshow.interact");
            mtopRequest.setVersion("1.0");
            mtopRequest.setNeedEcode(true);
            mtopRequest.setNeedSession(true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("namespace", (Object) "preview");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putAll(z3());
            jSONObject2.put(x3w.KEY_NEW_DETAIL_VISIBLE_BLOCK_WIDTH, (Object) Integer.valueOf(kr7.f()));
            jSONObject2.put("screenHeight", (Object) Integer.valueOf(kr7.e()));
            jSONObject.put("data", (Object) jSONObject2.toString());
            mtopRequest.setData(jSONObject.toString());
            MtopBusiness build = MtopBusiness.build(Mtop.instance(Mtop.Id.INNER, this), mtopRequest);
            build.setConnectionTimeoutMilliSecond(3000);
            build.setSocketTimeoutMilliSecond(5000);
            build.registerListener((IRemoteListener) new IRemoteBaseListener() { // from class: com.taobao.mmad.preview.TopshowPreviewActivity.1
                public static volatile transient /* synthetic */ IpChange $ipChange;

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d8806274", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "数据获取失败，请确认二维码有效性！");
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteListener
                public void onSuccess(int i, MtopResponse mtopResponse, BaseOutDo baseOutDo, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("7aa9dc19", new Object[]{this, new Integer(i), mtopResponse, baseOutDo, obj});
                    } else if (mtopResponse != null && mtopResponse.getDataJsonObject() != null) {
                        JSONObject parseObject = JSON.parseObject(new String(mtopResponse.getBytedata()));
                        if (parseObject == null) {
                            TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "数据获取失败，请确认二维码有效性！");
                            return;
                        }
                        JSONObject jSONObject3 = parseObject.getJSONObject("data");
                        String string = jSONObject3.getString("failure");
                        JSONObject jSONObject4 = jSONObject3.getJSONObject("model");
                        if ("true".equals(string)) {
                            TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "数据获取失败，请确认二维码有效性！");
                            return;
                        }
                        JSONObject jSONObject5 = jSONObject4.getJSONObject("data");
                        TopshowPreviewActivity.n3(TopshowPreviewActivity.this).j(Collections.singletonList(jSONObject5), 1001);
                        TopshowPreviewActivity.o3(TopshowPreviewActivity.this, jSONObject5);
                    }
                }

                @Override // com.taobao.tao.remotebusiness.IRemoteBaseListener
                public void onSystemError(int i, MtopResponse mtopResponse, Object obj) {
                    IpChange ipChange2 = $ipChange;
                    if (ipChange2 instanceof IpChange) {
                        ipChange2.ipc$dispatch("d3b51d43", new Object[]{this, new Integer(i), mtopResponse, obj});
                    } else {
                        TopshowPreviewActivity.m3(TopshowPreviewActivity.this, "数据获取失败，请确认二维码有效性！");
                    }
                }
            });
            build.startRequest();
        }
    }

    public final void C3(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("aa176921", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            this.e.removeAllViews();
            s.d dVar = new s.d();
            dVar.n = "mama";
            dVar.o = "topshow_preview";
            dVar.g = this;
            dVar.i = true;
            dVar.q = DWAspectRatio.DW_CENTER_CROP;
            dVar.k = 2;
            dVar.r = 2;
            dVar.j = "NonTBVideo";
            dVar.l = str;
            dVar.t = this.j;
            dVar.x = this.d.getMeasuredWidth();
            dVar.y = this.d.getMeasuredHeight();
            s c2 = s.c.c("TopshowPreviewActivity", dVar);
            this.g = c2;
            this.e.addView(c2.o(), new ViewGroup.LayoutParams(this.d.getMeasuredWidth(), this.d.getMeasuredHeight()));
            this.g.v();
            this.g.F();
        }
    }

    public final void D3() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ce529ddc", new Object[]{this});
            return;
        }
        FrameLayout frameLayout = new FrameLayout(this);
        this.d = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        ImageView imageView = new ImageView(this);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageResource(R.drawable.tbavsdk_video_loading);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, Key.ROTATION, 0.0f, 360.0f);
        this.h = ofFloat;
        ofFloat.setRepeatCount(5);
        this.h.setDuration(1000L);
        this.h.addListener(this.l);
        this.h.start();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(kr7.a(48.0f), kr7.a(48.0f));
        layoutParams.gravity = 17;
        this.d.addView(imageView, layoutParams);
        View inflate = LayoutInflater.from(this).inflate(R.layout.bootimage_base, (ViewGroup) null, false);
        this.c = inflate;
        inflate.setVisibility(4);
        this.d.addView(this.c, new FrameLayout.LayoutParams(-1, -1));
        this.b = (ImageView) this.c.findViewById(R.id.iv_main);
        this.c.findViewById(R.id.iv_left_top_tb_logo).setVisibility(0);
        this.c.findViewById(R.id.iv_ipv6_logo).setVisibility(0);
        View view = this.c;
        int i = R.id.iv_bg_view;
        FrameLayout frameLayout2 = (FrameLayout) view.findViewById(i).getParent();
        FrameLayout frameLayout3 = new FrameLayout(this);
        this.e = frameLayout3;
        frameLayout2.addView(frameLayout3, frameLayout2.indexOfChild(this.c.findViewById(i)) + 1, new ViewGroup.LayoutParams(-1, -1));
        y3();
    }
}
