package tb;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.ali.user.mobile.login.ui.FingerPrintDialog;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.s;
import com.taobao.mediaplay.MediaPlayScreenType;
import com.taobao.search.musie.video.a;
import java.net.URLEncoder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import tv.danmaku.ijk.media.player.IMediaPlayer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public final class fht implements w8e, aub, asc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final ztb f19303a;
    public final aub b;
    public s c;

    static {
        t2o.a(815792792);
        t2o.a(815792791);
        t2o.a(452985012);
        t2o.a(774897787);
    }

    public fht(ztb ztbVar, aub aubVar) {
        ckf.g(ztbVar, "lifecycleImpl");
        ckf.g(aubVar, "loopImpl");
        this.f19303a = ztbVar;
        this.b = aubVar;
    }

    @Override // tb.w8e
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("589b5c6a", new Object[]{this});
        }
    }

    public Map<String, String> c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("fed84453", new Object[]{this});
        }
        Map<String, String> emptyMap = Collections.emptyMap();
        ckf.f(emptyMap, "emptyMap(...)");
        return emptyMap;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
        }
    }

    @Override // tb.w8e
    public void destroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.i(0L);
        }
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
        }
    }

    public void f(Context context, String str, boolean z, boolean z2, String str2, String str3, String str4, JSONObject jSONObject, String str5, int i, int i2, paw pawVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dbf66b93", new Object[]{this, context, str, new Boolean(z), new Boolean(z2), str2, str3, str4, jSONObject, str5, new Integer(i), new Integer(i2), pawVar});
            return;
        }
        ckf.g(context, "context");
        ckf.g(pawVar, "property");
        s.d dVar = new s.d();
        dVar.A = z2;
        dVar.m = str2;
        dVar.l = str;
        dVar.W = TextUtils.isEmpty(pawVar.d()) ? r4p.DEFAULE_VIDEO_PLAY_SCENES : pawVar.d();
        dVar.n = "search";
        if (TextUtils.isEmpty(str3)) {
            str3 = r4p.DEFAULT_VIDEO_BIZ_CODE;
        }
        dVar.o = str3;
        dVar.g = (Activity) context;
        if (TextUtils.isEmpty(str2)) {
            dVar.j = "NonTBVideo";
        } else {
            dVar.j = "TBVideo";
        }
        dVar.i = z;
        dVar.x = i;
        dVar.y = i2;
        if (jSONObject != null) {
            Set<String> keySet = jSONObject.keySet();
            ckf.f(keySet, "<get-keys>(...)");
            HashMap<String, String> hashMap = new HashMap<>();
            for (String str6 : keySet) {
                String string = jSONObject.getString(str6);
                if (!TextUtils.isEmpty(string)) {
                    hashMap.put(str6, URLEncoder.encode(string));
                }
            }
            dVar.c0 = hashMap;
        }
        dVar.q = a.i(str5);
        dVar.t = this;
        s c = s.c.c(null, dVar);
        this.c = c;
        ckf.d(c);
        c.D(4010, this);
        s sVar = this.c;
        ckf.d(sVar);
        sVar.E(FingerPrintDialog.ERROR_OTHER, null);
    }

    public void g(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.y(i, false);
        }
    }

    @Override // tb.w8e
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        s sVar = this.c;
        ckf.d(sVar);
        View o = sVar.o();
        ckf.f(o, "getPlayerView(...)");
        return o;
    }

    public void h(Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6358933", new Object[]{this, map});
        } else {
            ckf.g(map, "fovMap");
        }
    }

    @Override // tb.w8e
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.t(z);
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
        } else {
            this.b.onLoopCompletion();
        }
    }

    @Override // tb.asc
    public void onMediaClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("71919eba", new Object[]{this});
        } else {
            this.f19303a.onVideoClose();
        }
    }

    @Override // tb.asc
    public void onMediaComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3cf4b25", new Object[]{this});
        } else {
            this.f19303a.onVideoComplete();
        }
    }

    @Override // tb.asc
    public void onMediaError(IMediaPlayer iMediaPlayer, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f1d76e0c", new Object[]{this, iMediaPlayer, new Integer(i), new Integer(i2)});
        } else {
            this.f19303a.onVideoError(iMediaPlayer, i, i2);
        }
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
        } else {
            this.f19303a.onVideoPause(z);
        }
    }

    @Override // tb.asc
    public void onMediaPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c715ea20", new Object[]{this});
        } else {
            this.f19303a.onVideoPlay();
        }
    }

    @Override // tb.asc
    public void onMediaPrepared(IMediaPlayer iMediaPlayer) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c7be34b", new Object[]{this, iMediaPlayer});
        } else {
            this.f19303a.onVideoPrepared(iMediaPlayer);
        }
    }

    @Override // tb.asc
    public void onMediaProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("67b99eba", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
        } else {
            this.f19303a.onVideoProgressChanged(i, i2, i3);
        }
    }

    @Override // tb.asc
    public void onMediaScreenChanged(MediaPlayScreenType mediaPlayScreenType) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a373cb25", new Object[]{this, mediaPlayScreenType});
        } else if (mediaPlayScreenType != null) {
            if (mediaPlayScreenType == MediaPlayScreenType.NORMAL) {
                this.f19303a.onVideoNormalScreen();
            } else {
                this.f19303a.onVideoFullScreen();
            }
        }
    }

    @Override // tb.asc
    public void onMediaSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d62d2da4", new Object[]{this, new Integer(i)});
        } else {
            this.f19303a.onVideoSeekTo(i);
        }
    }

    @Override // tb.asc
    public void onMediaStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f694024", new Object[]{this});
        } else {
            this.f19303a.onVideoStart();
        }
    }

    @Override // tb.w8e
    public void pauseVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf67322c", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.u();
        }
    }

    @Override // tb.w8e
    public void playVideo() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4075d2ae", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.F();
        }
    }

    @Override // tb.w8e
    public void setPlayRate(float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b5e4523", new Object[]{this, new Float(f)});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.B(2000, f);
        }
    }

    @Override // tb.w8e
    public void start() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("810347e9", new Object[]{this});
            return;
        }
        s sVar = this.c;
        if (sVar != null) {
            sVar.F();
        }
    }
}
