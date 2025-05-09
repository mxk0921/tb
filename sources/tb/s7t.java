package tb;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.taobao.R;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import com.taobao.taolive.sdk.utils.VideoStatus;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s7t {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String g = s7t.class.getSimpleName();
    public static s7t h;

    /* renamed from: a  reason: collision with root package name */
    public r4d f27851a;
    public TelephonyManager c;
    public PhoneStateListener f;
    public ArrayList<b3d> b = new ArrayList<>();
    public boolean d = false;
    public VideoStatus e = VideoStatus.VIDEO_NORMAL_STATUS;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a extends PhoneStateListener {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            if (str.hashCode() == -1198008378) {
                super.onCallStateChanged(((Number) objArr[0]).intValue(), (String) objArr[1]);
                return null;
            }
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/miniLive/services/TaoLiveVideoViewManager$1");
        }

        @Override // android.telephony.PhoneStateListener
        public void onCallStateChanged(int i, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b897d7c6", new Object[]{this, new Integer(i), str});
            } else if (s7t.a(s7t.this) != null) {
                String b = s7t.b();
                efs.a(b, "mPhoneStateListener state " + i);
                if (i != 0) {
                    if ((i == 1 || i == 2) && s7t.a(s7t.this).isPlaying()) {
                        s7t.a(s7t.this).pause();
                        s7t.d(s7t.this, true);
                    }
                } else if (!s7t.a(s7t.this).isPlaying() && s7t.c(s7t.this)) {
                    s7t.a(s7t.this).start();
                    s7t.d(s7t.this, false);
                }
                super.onCallStateChanged(i, str);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements IMediaPlayer.h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.h
        public void onPrepared(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("d91c57f9", new Object[]{this, iMediaPlayer});
                return;
            }
            v2s.o().A().b(cwd.LOG_TAG, "mediaPlayer: onPrepared");
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                Iterator it = s7t.e(s7t.this).iterator();
                while (it.hasNext()) {
                    ((b3d) it.next()).onPrepared();
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class c implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public c() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            cwd A = v2s.o().A();
            A.b(cwd.LOG_TAG, "mediaPlayer: onError what---" + i + "  extra---" + i2);
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                for (int i3 = 0; i3 < s7t.e(s7t.this).size(); i3++) {
                    ((b3d) s7t.e(s7t.this).get(i3)).onError(iMediaPlayer, i, i2);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class d implements IMediaPlayer.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public d() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            cwd A = v2s.o().A();
            A.b(cwd.LOG_TAG, "mediaPlayer: onInfo what---" + j + "  extra---" + j2);
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                Iterator it = s7t.e(s7t.this).iterator();
                while (it.hasNext()) {
                    ((b3d) it.next()).c(iMediaPlayer, j, j2, obj);
                }
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class e implements IMediaPlayer.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public e() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.b
        public void onCompletion(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9b380e18", new Object[]{this, iMediaPlayer});
                return;
            }
            v2s.o().A().b(cwd.LOG_TAG, "mediaPlayer: onCompletion");
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                for (int i = 0; i < s7t.e(s7t.this).size(); i++) {
                    ((b3d) s7t.e(s7t.this).get(i)).onCompletion(iMediaPlayer);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class f implements IMediaPlayer.i {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public f() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.i
        public void onStart(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("cb76ac0", new Object[]{this, iMediaPlayer});
                return;
            }
            v2s.o().A().b(cwd.LOG_TAG, "mediaPlayer: onStart");
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                Iterator it = s7t.e(s7t.this).iterator();
                while (it.hasNext()) {
                    ((b3d) it.next()).onStart(iMediaPlayer);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class g implements IMediaPlayer.f {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public g() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.f
        public void onPause(IMediaPlayer iMediaPlayer) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("e1f7bf54", new Object[]{this, iMediaPlayer});
                return;
            }
            v2s.o().A().b(cwd.LOG_TAG, "mediaPlayer: onPause");
            if (s7t.e(s7t.this) != null && s7t.e(s7t.this).size() > 0) {
                Iterator it = s7t.e(s7t.this).iterator();
                while (it.hasNext()) {
                    ((b3d) it.next()).onPause(iMediaPlayer);
                }
            }
        }
    }

    static {
        t2o.a(779092042);
    }

    public s7t() {
        Application a2 = imr.b().a();
        if (a2 != null) {
            this.c = (TelephonyManager) a2.getSystemService("phone");
            a aVar = new a();
            this.f = aVar;
            try {
                this.c.listen(aVar, 32);
            } catch (Exception unused) {
            }
        }
    }

    public static /* synthetic */ r4d a(s7t s7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("2c5ac747", new Object[]{s7tVar});
        }
        return s7tVar.f27851a;
    }

    public static /* synthetic */ String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("6c2478e8", new Object[0]);
        }
        return g;
    }

    public static /* synthetic */ boolean c(s7t s7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("af4279c9", new Object[]{s7tVar})).booleanValue();
        }
        return s7tVar.d;
    }

    public static /* synthetic */ boolean d(s7t s7tVar, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("71e96a71", new Object[]{s7tVar, new Boolean(z)})).booleanValue();
        }
        s7tVar.d = z;
        return z;
    }

    public static /* synthetic */ ArrayList e(s7t s7tVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ArrayList) ipChange.ipc$dispatch("4ef38e20", new Object[]{s7tVar});
        }
        return s7tVar.b;
    }

    public static s7t j() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (s7t) ipChange.ipc$dispatch("322f8490", new Object[0]);
        }
        if (h == null) {
            h = new s7t();
        }
        return h;
    }

    public r4d f(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("49b48c8e", new Object[]{this, preloadParams});
        }
        if (preloadParams == null) {
            return null;
        }
        r4d g2 = g(preloadParams);
        g2.start();
        return g2;
    }

    public r4d g(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("cc320ce5", new Object[]{this, preloadParams});
        }
        if (!TextUtils.isEmpty(preloadParams.a())) {
            preloadParams.a();
        }
        return h(preloadParams);
    }

    public final r4d h(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (r4d) ipChange.ipc$dispatch("29791728", new Object[]{this, preloadParams});
        }
        if (this.f27851a == null) {
            k(preloadParams);
        }
        ViewGroup viewGroup = (ViewGroup) ((uy1) this.f27851a).getView().getParent();
        if (viewGroup != null) {
            viewGroup.removeView(((uy1) this.f27851a).getView());
        }
        return this.f27851a;
    }

    public void i() {
        PhoneStateListener phoneStateListener;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        this.e = VideoStatus.VIDEO_NORMAL_STATUS;
        TelephonyManager telephonyManager = this.c;
        if (!(telephonyManager == null || (phoneStateListener = this.f) == null)) {
            telephonyManager.listen(phoneStateListener, 0);
            this.c = null;
            this.f = null;
        }
        r4d r4dVar = this.f27851a;
        if (r4dVar != null) {
            r4dVar.release();
            this.f27851a.destroy();
            this.f27851a = null;
        }
        ArrayList<b3d> arrayList = this.b;
        if (arrayList != null) {
            arrayList.clear();
            this.b = null;
        }
        h = null;
    }

    public final void k(PreloadParams preloadParams) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d4dd7ef5", new Object[]{this, preloadParams});
            return;
        }
        o3s.b(g, "initVideoViewWithParams标准化流程");
        t4q t4qVar = new t4q(preloadParams);
        this.f27851a = t4qVar;
        t4qVar.I();
        m(preloadParams.b());
    }

    public void l(b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d70bbf7c", new Object[]{this, b3dVar});
            return;
        }
        ArrayList<b3d> arrayList = this.b;
        if (arrayList != null && b3dVar != null && !arrayList.contains(b3dVar)) {
            this.b.add(b3dVar);
        }
    }

    public final void m(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("30e4ca", new Object[]{this, context});
        } else if (this.f27851a != null) {
            int color = context.getResources().getColor(R.color.minilive_text_color_gray);
            r4d r4dVar = this.f27851a;
            if (r4dVar instanceof t4q) {
                ((t4q) this.f27851a).Q(new ColorDrawable(color));
            } else if (((uy1) r4dVar).getVideoView() != null) {
                ((uy1) this.f27851a).getVideoView().setBackgroundColor(color);
            }
            ((uy1) this.f27851a).n(new b());
            ((uy1) this.f27851a).d(new c());
            ((uy1) this.f27851a).f(new d());
            ((uy1) this.f27851a).s(new e());
            ((uy1) this.f27851a).z(new f());
            ((uy1) this.f27851a).q(new g());
        }
    }

    public void n(b3d b3dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e6592023", new Object[]{this, b3dVar});
            return;
        }
        ArrayList<b3d> arrayList = this.b;
        if (arrayList != null && b3dVar != null && arrayList.contains(b3dVar)) {
            this.b.remove(b3dVar);
        }
    }

    public VideoStatus o() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (VideoStatus) ipChange.ipc$dispatch("da300dcb", new Object[]{this});
        }
        return this.e;
    }
}
