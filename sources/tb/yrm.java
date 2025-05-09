package tb;

import android.net.Uri;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mediaplay.model.MediaLiveInfo;
import com.taobao.taolive.room.player.preload.instance.PreloadParams;
import com.taobao.taolive.room.player.standard.StandardMediaData;
import com.taobao.taolive.room.player.standard.manager.LiveMediaManager;
import com.taobao.taolive.sdk.ui.media.IMediaPlayer;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class yrm extends hz1 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final MediaLiveInfo h = LiveMediaManager.e2(StandardMediaData.generate(this.c));
    public asm i;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements IMediaPlayer.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.e
        public boolean onInfo(IMediaPlayer iMediaPlayer, long j, long j2, long j3, Object obj) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5622e1ba", new Object[]{this, iMediaPlayer, new Long(j), new Long(j2), new Long(j3), obj})).booleanValue();
            }
            yrm yrmVar = yrm.this;
            return yrmVar.o(yrm.z(yrmVar), j, j2, j3, obj);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements IMediaPlayer.c {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public b() {
        }

        @Override // com.taobao.taolive.sdk.ui.media.IMediaPlayer.c
        public boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("1e2c1ca", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)})).booleanValue();
            }
            yrm yrmVar = yrm.this;
            yrmVar.r("[Metrics-VideoPrePlay]onError code: " + i + " extra: " + i2);
            yrm.this.n(i, i2);
            yrm.this.m();
            return false;
        }
    }

    static {
        t2o.a(779093109);
    }

    public yrm(PreloadParams preloadParams) {
        super(preloadParams);
    }

    public static /* synthetic */ Object ipc$super(yrm yrmVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/taolive/room/player/preload/instance/PreloadLiveInstance");
    }

    public static /* synthetic */ asm z(yrm yrmVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (asm) ipChange.ipc$dispatch("520c8d06", new Object[]{yrmVar});
        }
        return yrmVar.i;
    }

    public final String A() {
        Uri uri;
        ufi a2;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("82d247c0", new Object[]{this});
        }
        try {
            uri = this.g;
        } catch (Throwable th) {
            o3s.b("PreloadLiveInstance", "buildReuseToken error, e: " + th);
        }
        if (uri == null) {
            return null;
        }
        Map d = sr4.d(uri.getQueryParameter(yj4.PARAM_UT_PARAMS), null);
        if (d != null) {
            String e = sr4.e(d.get("ndCardType"), null);
            if (!TextUtils.isEmpty(e) && !TextUtils.equals(e, "contentlive")) {
                return null;
            }
        }
        ufi ufiVar = this.b;
        if (ufiVar != null && !TextUtils.isEmpty(ufiVar.f29342a) && !this.b.f29342a.startsWith("null")) {
            return null;
        }
        String queryParameter = this.g.getQueryParameter(yj4.PARAM_PLAY_VIEW_TOKEN);
        if (TextUtils.isEmpty(queryParameter)) {
            return null;
        }
        String replace = queryParameter.replace("_", "");
        if (!TextUtils.isEmpty(replace) && B(replace)) {
            String queryParameter2 = this.g.getQueryParameter(yj4.PARAM_CUSTOM_PLAY_CTRL);
            if (!TextUtils.isEmpty(queryParameter2) && (a2 = yx4.a(mxg.a(mxf.e(queryParameter2)), null)) != null) {
                return a2.b;
            }
        }
        return null;
    }

    @Override // tb.mcd
    public void a(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86da0d1", new Object[]{this, new Boolean(z)});
            return;
        }
        asm asmVar = this.i;
        if (asmVar == null) {
            return;
        }
        if (z) {
            asmVar.Q1(this.e, true);
        } else {
            asmVar.Q1(0L, true);
        }
    }

    @Override // tb.mcd
    public String c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("711474dc", new Object[]{this});
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.i2();
        }
        return null;
    }

    @Override // tb.mcd
    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8849d9f", new Object[]{this});
            return;
        }
        asm asmVar = this.i;
        if (asmVar != null && asmVar.y0()) {
            this.i.R0();
            this.i = null;
        }
    }

    @Override // tb.mcd
    public int e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("d25640a7", new Object[]{this})).intValue();
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.S();
        }
        return -1;
    }

    @Override // tb.mcd
    public void f(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("16c4bb25", new Object[]{this, str});
            return;
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            asmVar.G1(str, 0);
        }
    }

    @Override // tb.mcd
    public boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ca37cbe2", new Object[]{this})).booleanValue();
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.p0();
        }
        return false;
    }

    @Override // tb.mcd
    public boolean h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("62468bf6", new Object[]{this})).booleanValue();
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.T1();
        }
        return false;
    }

    @Override // tb.hz1
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2cb6c360", new Object[]{this});
            return;
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            asmVar.t(new b());
        }
    }

    @Override // tb.hz1
    public void t() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5383a56c", new Object[]{this});
            return;
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            asmVar.u(new a());
        }
    }

    @Override // tb.hz1
    public void u() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("86d6d1f7", new Object[]{this});
            return;
        }
        asm asmVar = new asm(this.f20975a, this.f);
        this.i = asmVar;
        asmVar.Y1(this.h, null);
        if (this.h == null) {
            String A = A();
            if (!TextUtils.isEmpty(A)) {
                o3s.b("PreloadLiveInstance", "满足构建token的的条件，重新构建token：" + A);
                this.i.v1(A);
            } else {
                ufi ufiVar = this.b;
                if (ufiVar != null && !TextUtils.isEmpty(ufiVar.f29342a)) {
                    this.i.v1(this.b.f29342a);
                }
            }
        }
        this.i.K();
    }

    @Override // tb.hz1
    public ViewGroup v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ViewGroup) ipChange.ipc$dispatch("efdf8cfc", new Object[]{this});
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.l0();
        }
        return null;
    }

    @Override // tb.hz1
    public boolean w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("4e8f0f3a", new Object[]{this})).booleanValue();
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            return asmVar.r0();
        }
        return false;
    }

    @Override // tb.hz1
    public void x() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c677ca29", new Object[]{this});
            return;
        }
        asm asmVar = this.i;
        if (asmVar != null) {
            asmVar.I1();
        }
    }

    public final boolean B(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b5c88d8", new Object[]{this, str})).booleanValue();
        }
        if (str == null || str.isEmpty()) {
            return false;
        }
        boolean matches = str.matches("\\d+");
        o3s.b("PreloadLiveInstance", "字符串中只有数字");
        return matches;
    }
}
