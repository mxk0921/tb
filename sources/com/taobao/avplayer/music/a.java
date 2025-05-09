package com.taobao.avplayer.music;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWHighPerformanceInstanceNew;
import com.taobao.avplayer.music.BackgroundAudioService;
import com.taobao.taobaoavsdk.AVSDKLog;
import java.util.HashMap;
import tb.eib;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static volatile a g;

    /* renamed from: a  reason: collision with root package name */
    public final Context f10194a;
    public DWHighPerformanceInstanceNew b;
    public eib c;
    public String d;
    public ServiceConnectionC0538a e;
    public BackgroundAudioService.MusicBinder f;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.avplayer.music.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public class ServiceConnectionC0538a implements ServiceConnection {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(452985114);
        }

        public ServiceConnectionC0538a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("1495fa3c", new Object[]{this, componentName, iBinder});
                return;
            }
            AVSDKLog.e("AVSDK-tb-Music", "MusicServiceConnection onServiceConnected start");
            a aVar = a.this;
            aVar.f = (BackgroundAudioService.MusicBinder) iBinder;
            if (a.a(aVar) != null) {
                a aVar2 = a.this;
                a.c(aVar2, a.a(aVar2));
                a.b(a.this, null);
            }
            AVSDKLog.e("AVSDK-tb-Music", "MusicServiceConnection onServiceConnected finish");
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5a4ef237", new Object[]{this, componentName});
            }
        }
    }

    static {
        t2o.a(452985113);
    }

    public a(Context context) {
        this.f10194a = context;
        AVSDKLog.e("AVSDK-tb-Music", "BackgroundAudioPlayerManager init");
        z();
    }

    public static /* synthetic */ String a(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("576336e", new Object[]{aVar});
        }
        return aVar.d;
    }

    public static /* synthetic */ String b(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("aa6f4f22", new Object[]{aVar, str});
        }
        aVar.d = str;
        return str;
    }

    public static /* synthetic */ void c(a aVar, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2e8a1abd", new Object[]{aVar, str});
        } else {
            aVar.s(str);
        }
    }

    public static Bitmap g(Bitmap bitmap, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("8232ad4", new Object[]{bitmap, new Integer(i), new Integer(i2)});
        }
        if (bitmap == null) {
            return null;
        }
        int height = bitmap.getHeight();
        int width = bitmap.getWidth();
        Matrix matrix = new Matrix();
        matrix.postScale(i / width, i2 / height);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        if (!bitmap.isRecycled()) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public static a j(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (a) ipChange.ipc$dispatch("bd3f61b", new Object[]{context});
        }
        if (g == null) {
            g = new a(context);
        }
        return g;
    }

    public void A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1841cf73", new Object[]{this});
        } else if (this.c != null) {
            m().onCustomAction("updateAlbumArtBitmap", null);
        }
    }

    public boolean d(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew, DWHighPerformanceInstanceNew.g gVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("eca10f44", new Object[]{this, dWHighPerformanceInstanceNew, gVar})).booleanValue();
        }
        if (this.b != null || dWHighPerformanceInstanceNew == null) {
            return false;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + "BackgroundAudioPlayerManager attach " + dWHighPerformanceInstanceNew);
        this.b = dWHighPerformanceInstanceNew;
        this.c = gVar;
        return true;
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
        } else if (this.c != null) {
            m().onClose();
        }
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efcc75ba", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).a();
        }
    }

    public boolean h(DWHighPerformanceInstanceNew dWHighPerformanceInstanceNew) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("60c36dd1", new Object[]{this, dWHighPerformanceInstanceNew})).booleanValue();
        }
        if (dWHighPerformanceInstanceNew != null && dWHighPerformanceInstanceNew != this.b) {
            return false;
        }
        AVSDKLog.e("AVSDK-tb-Music", this + "BackgroundAudioPlayerManager detach " + dWHighPerformanceInstanceNew);
        if (m() != null) {
            m().onStop();
        }
        this.b = null;
        this.c = null;
        this.d = null;
        return true;
    }

    public Bitmap i() {
        Bitmap g2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("9d238b9e", new Object[]{this});
        }
        eib eibVar = this.c;
        if (eibVar == null) {
            return null;
        }
        Bitmap bitmap = ((DWHighPerformanceInstanceNew.g) eibVar).b().mAlbumArtBitamp;
        if (bitmap == null || ((bitmap.getHeight() <= 128 && bitmap.getWidth() <= 128) || (g2 = g(bitmap, 128, 128)) == null)) {
            return bitmap;
        }
        ((DWHighPerformanceInstanceNew.g) this.c).b().mAlbumArtBitamp = g2;
        return g2;
    }

    public HashMap<String, String> k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (HashMap) ipChange.ipc$dispatch("b06c612f", new Object[]{this});
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            return ((DWHighPerformanceInstanceNew.g) eibVar).b().mMetaData;
        }
        return null;
    }

    public boolean l() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1775683a", new Object[]{this})).booleanValue();
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            return ((DWHighPerformanceInstanceNew.g) eibVar).b().mCanShowPreviousNextButton;
        }
        return false;
    }

    public BackgroundAudioService.MusicBinder m() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BackgroundAudioService.MusicBinder) ipChange.ipc$dispatch("6e543af", new Object[]{this});
        }
        return this.f;
    }

    public void n() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7e11a900", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).c();
        }
    }

    public void o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("40ce0e90", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).d();
        }
    }

    public void p() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
        } else if (this.c != null) {
            m().onPause();
        }
    }

    public void q() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("507c0687", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).e();
        }
    }

    public void r() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
        } else if (this.c != null) {
            m().onPlay();
        }
    }

    public final void s(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a2a95e4", new Object[]{this, str});
        } else if (!TextUtils.isEmpty(str)) {
            m().onPlayFromMediaId(str, null);
        }
    }

    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d18aa709", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).f();
        }
    }

    public void u(int i, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3f5e279", new Object[]{this, new Integer(i), new Boolean(z), new Boolean(z2)});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).g(i, z, z2);
        }
    }

    public void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("468ef3f0", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).h();
        }
    }

    public void w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49e6356c", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).i();
        }
    }

    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            String videoUrl = ((DWHighPerformanceInstanceNew.g) eibVar).b().mPlayContext.getVideoUrl();
            if (m() != null) {
                s(videoUrl);
            } else {
                this.d = videoUrl;
            }
        }
    }

    public void y() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cb56e19b", new Object[]{this});
            return;
        }
        eib eibVar = this.c;
        if (eibVar != null) {
            ((DWHighPerformanceInstanceNew.g) eibVar).j();
        }
    }

    public final void z() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c029cdd9", new Object[]{this});
            return;
        }
        Intent intent = new Intent(this.f10194a, BackgroundAudioService.class);
        this.e = new ServiceConnectionC0538a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f10194a.startForegroundService(intent);
        } else {
            this.f10194a.startService(intent);
        }
        this.f10194a.bindService(intent, this.e, 1);
    }
}
