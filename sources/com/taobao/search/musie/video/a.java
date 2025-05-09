package com.taobao.search.musie.video;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.search.musie.video.VideoControlView;
import java.util.HashMap;
import java.util.Map;
import tb.aub;
import tb.fht;
import tb.paw;
import tb.spc;
import tb.t2o;
import tb.tpc;
import tb.w8e;
import tb.ztb;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class a implements spc, ztb, aub {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Context f11598a;
    public w8e b;
    public FrameLayout c;
    public FrameLayout d;
    public tpc e;
    public boolean f;
    public boolean g;
    public VideoControlView h;
    public String i;
    public boolean j;
    public String k;
    public int l;
    public int m;
    public paw n;

    /* compiled from: Taobao */
    /* renamed from: com.taobao.search.musie.video.a$a  reason: collision with other inner class name */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class C0653a implements VideoControlView.b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public C0653a() {
        }

        public void a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b4b2fc15", new Object[]{this});
            } else if (a.g(a.this) != null) {
                a.g(a.this).a();
            }
        }

        public void b(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("dc85f95d", new Object[]{this, new Boolean(z)});
            } else {
                a.this.mute(z);
            }
        }

        public void c(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("2f32ccb8", new Object[]{this, new Boolean(z)});
            } else if (z) {
                a.this.play();
            } else {
                a.this.pause();
            }
        }

        public void d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c1876b8", new Object[]{this, new Float(f)});
            } else if (a.g(a.this) != null) {
                a.g(a.this).setPlayRate(f);
            }
        }

        public void e(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5158474", new Object[]{this, new Integer(i)});
            } else {
                a.this.seekTo(i);
            }
        }
    }

    static {
        t2o.a(815792788);
        t2o.a(986710279);
        t2o.a(452985010);
        t2o.a(452985012);
    }

    public a(Context context) {
        this.f11598a = context;
    }

    public static /* synthetic */ w8e g(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (w8e) ipChange.ipc$dispatch("5711131f", new Object[]{aVar});
        }
        return aVar.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r4.equals(tb.pg1.ATOM_EXT_fill) == false) goto L_0x0029;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.taobao.avplayer.DWAspectRatio i(java.lang.String r4) {
        /*
            r0 = 0
            r1 = 1
            com.android.alibaba.ip.runtime.IpChange r2 = com.taobao.search.musie.video.a.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x0015
            java.lang.String r3 = "29a482b5"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r4
            java.lang.Object r4 = r2.ipc$dispatch(r3, r1)
            com.taobao.avplayer.DWAspectRatio r4 = (com.taobao.avplayer.DWAspectRatio) r4
            return r4
        L_0x0015:
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x001e
            com.taobao.avplayer.DWAspectRatio r4 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            return r4
        L_0x001e:
            r4.hashCode()
            r2 = -1
            int r3 = r4.hashCode()
            switch(r3) {
                case 3143043: goto L_0x0041;
                case 94852023: goto L_0x0036;
                case 951526612: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            r0 = -1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "contain"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x0034
            goto L_0x0029
        L_0x0034:
            r0 = 2
            goto L_0x004a
        L_0x0036:
            java.lang.String r0 = "cover"
            boolean r4 = r4.equals(r0)
            if (r4 != 0) goto L_0x003f
            goto L_0x0029
        L_0x003f:
            r0 = 1
            goto L_0x004a
        L_0x0041:
            java.lang.String r1 = "fill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x004a
            goto L_0x0029
        L_0x004a:
            switch(r0) {
                case 0: goto L_0x0056;
                case 1: goto L_0x0053;
                case 2: goto L_0x0050;
                default: goto L_0x004d;
            }
        L_0x004d:
            com.taobao.avplayer.DWAspectRatio r4 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            return r4
        L_0x0050:
            com.taobao.avplayer.DWAspectRatio r4 = com.taobao.avplayer.DWAspectRatio.DW_FIT_CENTER
            return r4
        L_0x0053:
            com.taobao.avplayer.DWAspectRatio r4 = com.taobao.avplayer.DWAspectRatio.DW_CENTER_CROP
            return r4
        L_0x0056:
            com.taobao.avplayer.DWAspectRatio r4 = com.taobao.avplayer.DWAspectRatio.DW_FIT_X_Y
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.search.musie.video.a.i(java.lang.String):com.taobao.avplayer.DWAspectRatio");
    }

    @Override // tb.spc
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7c2dab56", new Object[]{this});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            w8eVar.a();
        }
    }

    @Override // tb.spc
    public void b(String str, boolean z, boolean z2, String str2, paw pawVar, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f852dcfa", new Object[]{this, str, new Boolean(z), new Boolean(z2), str2, pawVar, new Integer(i), new Integer(i2)});
            return;
        }
        this.i = str;
        this.j = z;
        this.g = z2;
        this.k = str2;
        this.l = i;
        this.m = i2;
        this.c = new FrameLayout(this.f11598a);
        FrameLayout frameLayout = new FrameLayout(this.f11598a);
        this.d = frameLayout;
        this.n = pawVar;
        this.c.addView(frameLayout, -1, -1);
        if (pawVar.h()) {
            FrameLayout frameLayout2 = new FrameLayout(this.f11598a);
            frameLayout2.setTag(Boolean.TRUE);
            this.c.addView(frameLayout2, -1, -1);
            VideoControlView videoControlView = new VideoControlView(this.f11598a);
            this.h = videoControlView;
            this.c.addView(videoControlView, -1, -1);
            this.h.setMuteState(z2);
            this.h.setShowCenterPlay(pawVar.g());
            this.h.setShowMute(pawVar.j());
            this.h.setPlayRateVisible(pawVar.l());
            this.h.setShowPlay(pawVar.k());
            this.h.setSeekBarEnabled(pawVar.f());
            this.h.setShowFullScreen(pawVar.i());
            this.h.setCallback(new C0653a());
        }
    }

    @Override // tb.spc
    public void c(tpc tpcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e631879", new Object[]{this, tpcVar});
        } else {
            this.e = tpcVar;
        }
    }

    @Override // tb.spc
    public JSONObject d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (JSONObject) ipChange.ipc$dispatch("24f3d1be", new Object[]{this});
        }
        w8e w8eVar = this.b;
        JSONObject jSONObject = null;
        if (w8eVar == null) {
            return null;
        }
        Map<String, String> c = ((fht) w8eVar).c();
        if (c != null && !c.isEmpty()) {
            jSONObject = new JSONObject();
            for (Map.Entry<String, String> entry : c.entrySet()) {
                jSONObject.put(entry.getKey(), (Object) entry.getValue());
            }
        }
        return jSONObject;
    }

    @Override // tb.spc
    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1f4059a7", new Object[]{this});
            return;
        }
        this.f = false;
        this.c = null;
        this.d = null;
        this.h = null;
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            ((fht) w8eVar).b();
            ((fht) this.b).destroy();
            this.b = null;
        }
    }

    @Override // tb.spc
    public void f(JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("97af191e", new Object[]{this, jSONObject});
        } else if (this.b != null && jSONObject != null) {
            HashMap hashMap = new HashMap();
            String string = jSONObject.getString("FOV");
            if (string != null) {
                hashMap.put("FOV", string);
            }
            String string2 = jSONObject.getString("latitude");
            if (string2 != null) {
                hashMap.put("latitude", string2);
            }
            String string3 = jSONObject.getString("longitude");
            if (string3 != null) {
                hashMap.put("longitude", string3);
            }
            ((fht) this.b).h(hashMap);
        }
    }

    @Override // tb.spc
    public View getView() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("576a35e4", new Object[]{this});
        }
        return this.c;
    }

    public void h() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("289049fa", new Object[]{this});
        } else if (this.b == null) {
            fht fhtVar = new fht(this, this);
            this.b = fhtVar;
            fhtVar.f(this.f11598a, this.i, this.g, this.j, this.k, this.n.a(), this.n.b(), this.n.e(), this.n.c(), this.l, this.m, this.n);
            this.d.addView(((fht) this.b).getView(), -1, -1);
        }
    }

    @Override // tb.spc
    public void mute(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4254d4b4", new Object[]{this, new Boolean(z)});
            return;
        }
        this.g = z;
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            w8eVar.mute(z);
            VideoControlView videoControlView = this.h;
            if (videoControlView != null) {
                videoControlView.setMuteState(z);
            }
        }
    }

    @Override // tb.aub
    public void onLoopCompletion() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4a22ee66", new Object[]{this});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoFinish();
        }
    }

    @Override // tb.ztb
    public void onVideoClose() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24db3403", new Object[]{this});
        }
    }

    @Override // tb.ztb
    public void onVideoComplete() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d3c2c53c", new Object[]{this});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoFinish();
        }
    }

    @Override // tb.ztb
    public void onVideoError(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a7a1a1cf", new Object[]{this, obj, new Integer(i), new Integer(i2)});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoFail();
        }
    }

    @Override // tb.ztb
    public void onVideoFullScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5dcccbde", new Object[]{this});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            ((fht) w8eVar).d();
        }
    }

    @Override // tb.ztb
    public void onVideoInfo(Object obj, int i, int i2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4b7a5aed", new Object[]{this, obj, new Integer(i), new Integer(i2)});
        }
    }

    @Override // tb.ztb
    public void onVideoNormalScreen() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ff4b0936", new Object[]{this});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            ((fht) w8eVar).e();
        }
    }

    @Override // tb.ztb
    public void onVideoPause(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee9d05f3", new Object[]{this, new Boolean(z)});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoStop();
        }
    }

    @Override // tb.ztb
    public void onVideoPlay() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("931007b7", new Object[]{this});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoStart();
        }
    }

    @Override // tb.ztb
    public void onVideoPrepared(Object obj) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3faee61c", new Object[]{this, obj});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            w8eVar.mute(this.g);
        }
    }

    @Override // tb.ztb
    public void onVideoProgressChanged(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a8a811", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoProgressChanged(i, i3);
            VideoControlView videoControlView = this.h;
            if (videoControlView != null) {
                videoControlView.setProgress(i, i3, i2);
            }
        }
    }

    @Override // tb.ztb
    public void onVideoSeekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("dd6694ad", new Object[]{this, new Integer(i)});
        }
    }

    @Override // tb.ztb
    public void onVideoStart() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2b2d56d", new Object[]{this});
            return;
        }
        tpc tpcVar = this.e;
        if (tpcVar != null) {
            tpcVar.onVideoStart();
        }
    }

    @Override // tb.spc
    public void pause() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("315dbf7d", new Object[]{this});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            w8eVar.pauseVideo();
            VideoControlView videoControlView = this.h;
            if (videoControlView != null) {
                videoControlView.pause();
            }
        }
    }

    @Override // tb.spc
    public void play() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6fe955bb", new Object[]{this});
            return;
        }
        if (this.b == null) {
            h();
        }
        VideoControlView videoControlView = this.h;
        if (videoControlView != null) {
            videoControlView.play();
        }
        if (!this.f) {
            ((fht) this.b).start();
            this.f = true;
            return;
        }
        ((fht) this.b).playVideo();
    }

    @Override // tb.spc
    public void seekTo(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("49645829", new Object[]{this, new Integer(i)});
            return;
        }
        w8e w8eVar = this.b;
        if (w8eVar != null) {
            ((fht) w8eVar).g(i);
        }
    }
}
