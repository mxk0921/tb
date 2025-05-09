package tb;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import anet.channel.util.ErrorConstant;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.trtc.api.ITrtcObserver;
import com.taobao.trtc.api.TrtcAudioDevice;
import com.taobao.trtc.api.TrtcConfig;
import com.taobao.trtc.api.TrtcConstants;
import com.taobao.trtc.api.TrtcDefines;
import com.taobao.trtc.utils.TrtcLog;
import com.uc.webview.base.cyclone.BSError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.SurfaceViewRenderer;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class bio implements ITrtcObserver.e, ITrtcObserver.c, ITrtcObserver.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final String k = bio.class.getName();

    /* renamed from: a  reason: collision with root package name */
    public com.taobao.trtc.api.c f16408a;
    public TrtcConfig b;
    public final Context c;
    public final aio d;
    public final RelativeLayout e;
    public com.taobao.trtc.rtcroom.b g;
    public TrtcDefines.g j;
    public final Map<String, SurfaceViewRenderer> f = new HashMap();
    public final ArrayList<Bundle> h = new ArrayList<>();
    public final AtomicBoolean i = new AtomicBoolean(false);

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16409a;

        public a(String str) {
            this.f16409a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (bio.b(bio.this).get(this.f16409a) == null) {
                SurfaceViewRenderer surfaceViewRenderer = new SurfaceViewRenderer(bio.i(bio.this));
                bio.j(bio.this).addView(surfaceViewRenderer, new RelativeLayout.LayoutParams(-1, -1));
                String k = bio.k();
                TrtcLog.j(k, "add remote view to view maps, id: " + this.f16409a);
                bio.b(bio.this).put(this.f16409a, surfaceViewRenderer);
                if (bio.m(bio.this) != null && bio.m(bio.this).h() != null) {
                    bio.m(bio.this).h().setRemoteVideoView(surfaceViewRenderer, this.f16409a);
                }
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16410a;

        public b(String str) {
            this.f16410a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (bio.b(bio.this).get(this.f16410a) != null) {
                String k = bio.k();
                TrtcLog.j(k, "remove remote view from maps, id: " + this.f16410a);
                bio.j(bio.this).removeView((View) bio.b(bio.this).get(this.f16410a));
                bio.b(bio.this).remove(this.f16410a);
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
    public class c extends com.taobao.trtc.api.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(395313607);
        }

        public c() {
        }

        public static /* synthetic */ Object ipc$super(c cVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/trtc/rtcroom/RtcRoomImpl$EventHandler");
        }

        @Override // com.taobao.trtc.api.a
        public void h(int i, Bundle bundle, Map<String, Object> map) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b1436032", new Object[]{this, new Integer(i), bundle, map});
                return;
            }
            if (i != 105) {
                if (i != 106) {
                    if (i == 304) {
                        if (bio.q(bio.this) != null) {
                            bio.q(bio.this).sendFirstRender(bio.r(bio.this).d);
                        }
                    } else {
                        return;
                    }
                } else if (bundle != null && bio.q(bio.this) != null) {
                    bio.q(bio.this).sendFirstRender(bundle.getString("userId"));
                    return;
                } else {
                    return;
                }
            }
            if (bundle != null && bio.q(bio.this) != null && bundle.getInt(TrtcConstants.TRTC_PARAMS_PHONE_STATE) == 1) {
                bio.q(bio.this).sendError(-1101, "phone active");
            }
        }
    }

    static {
        t2o.a(395313604);
        t2o.a(395313394);
        t2o.a(395313392);
        t2o.a(395313390);
    }

    public bio(Context context, aio aioVar) {
        this.c = context;
        this.e = new RelativeLayout(context);
        this.d = aioVar;
    }

    public static /* synthetic */ Map b(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Map) ipChange.ipc$dispatch("f2e39865", new Object[]{bioVar});
        }
        return bioVar.f;
    }

    public static /* synthetic */ Context i(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Context) ipChange.ipc$dispatch("90dde587", new Object[]{bioVar});
        }
        return bioVar.c;
    }

    public static /* synthetic */ RelativeLayout j(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RelativeLayout) ipChange.ipc$dispatch("5584b57e", new Object[]{bioVar});
        }
        return bioVar.e;
    }

    public static /* synthetic */ String k() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("642796a6", new Object[0]);
        }
        return k;
    }

    public static /* synthetic */ com.taobao.trtc.api.c m(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.api.c) ipChange.ipc$dispatch("da0251a6", new Object[]{bioVar});
        }
        return bioVar.f16408a;
    }

    public static /* synthetic */ aio q(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (aio) ipChange.ipc$dispatch("a8f0d1ae", new Object[]{bioVar});
        }
        return bioVar.d;
    }

    public static /* synthetic */ com.taobao.trtc.rtcroom.b r(bio bioVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (com.taobao.trtc.rtcroom.b) ipChange.ipc$dispatch("ea1ef7fb", new Object[]{bioVar});
        }
        return bioVar.g;
    }

    public View A() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("a225c41b", new Object[]{this});
        }
        return this.e;
    }

    public synchronized boolean B(com.taobao.trtc.rtcroom.b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c54440ee", new Object[]{this, bVar})).booleanValue();
        }
        if (!(this.c == null || bVar == null || this.d == null)) {
            this.g = bVar;
            this.b = new TrtcConfig.a().q(bVar.f13962a).c(bVar.b).v(bVar.d).i(this).f(this).k(new c()).s(false, false).o(true).t(false).u(false).l(false).a();
            if (this.f16408a == null) {
                this.f16408a = com.taobao.trtc.api.c.c(this.c);
            }
            this.f16408a.q();
            this.f16408a.i(this.b);
            return true;
        }
        TrtcLog.i(k, "init error");
        return false;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void D(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("54825390", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            new Handler(this.c.getMainLooper()).post(new a(str));
            aio aioVar = this.d;
            if (aioVar != null) {
                aioVar.sendRemoteJoin(str);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void E(TrtcDefines.TrtcChannelAction trtcChannelAction, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7ee6972a", new Object[]{this, trtcChannelAction, str, str2, str3});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void G(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a08348ac", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void H(TrtcDefines.TrtcErrorEvent trtcErrorEvent, int i, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3875e64a", new Object[]{this, trtcErrorEvent, new Integer(i), str});
        }
    }

    public synchronized void I() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9f4d98d3", new Object[]{this});
        } else if (this.f16408a == null) {
            TrtcLog.i(k, "leave channel error");
        } else if (!this.i.get()) {
            Bundle bundle = new Bundle();
            bundle.putString("api", "leaveChannel");
            this.h.add(bundle);
            TrtcLog.j(k, "cached api leaveChannel");
        } else {
            TrtcDefines.g gVar = this.j;
            if (gVar != null) {
                this.f16408a.k(gVar.f13881a, "");
                this.j = null;
            }
            for (String str : ((HashMap) this.f).keySet()) {
                this.f16408a.h().setRemoteVideoView(null, str);
            }
            ((HashMap) this.f).clear();
            this.d.sendLeaveRoom();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void J(String str, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a43c5222", new Object[]{this, str, new Boolean(z)});
        }
    }

    public synchronized void K(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("29bbed9b", new Object[]{this, new Boolean(z)});
            return;
        }
        com.taobao.trtc.api.c cVar = this.f16408a;
        if (!(cVar == null || cVar.g() == null)) {
            this.f16408a.g().muteLocal(z);
        }
    }

    public synchronized void L(int i) {
        boolean z = true;
        synchronized (this) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("489f7d65", new Object[]{this, new Integer(i)});
                return;
            }
            com.taobao.trtc.api.c cVar = this.f16408a;
            if (!(cVar == null || cVar.g() == null)) {
                TrtcAudioDevice g = this.f16408a.g();
                if (i != 2) {
                    z = false;
                }
                g.enableSpeakerphone(z);
            }
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1580a46b", new Object[]{this});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("7d023d9b", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void d(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5e4711c", new Object[]{this, str, str2, str3, str4});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void e(ArrayList<String> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2744305", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void f(TrtcDefines.l lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ea1e4d2", new Object[]{this, lVar});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void g(TrtcDefines.TrtcNetWorkQuality trtcNetWorkQuality) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10fee0eb", new Object[]{this, trtcNetWorkQuality});
            return;
        }
        aio aioVar = this.d;
        if (!(trtcNetWorkQuality == TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_GOOD || trtcNetWorkQuality == TrtcDefines.TrtcNetWorkQuality.E_NETWORK_QUALITY_NORMAL)) {
            z = false;
        }
        aioVar.sendNetStat(z);
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void h(ArrayList<TrtcDefines.n> arrayList) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a13bd2ae", new Object[]{this, arrayList});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void l(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bf89f55f", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void n(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("777c61d2", new Object[]{this, str, str2});
        } else if (!TextUtils.isEmpty(str)) {
            com.taobao.trtc.api.c cVar = this.f16408a;
            if (!(cVar == null || cVar.h() == null)) {
                this.f16408a.h().setRemoteVideoView(null, str);
            }
            aio aioVar = this.d;
            if (aioVar != null) {
                aioVar.sendRemoteLeave(str, null);
            }
            new Handler(this.c.getMainLooper()).post(new b(str));
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void o(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62a151f", new Object[]{this, new Boolean(z)});
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r5 != 4) goto L_0x0024;
     */
    @Override // com.taobao.trtc.api.ITrtcObserver.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAudioRouteChanged(int r5) {
        /*
            r4 = this;
            r0 = 1
            r1 = 2
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bio.$ipChange
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange
            if (r3 == 0) goto L_0x001a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r5)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r1 = 0
            r5[r1] = r4
            r5[r0] = r3
            java.lang.String r0 = "66a6119a"
            r2.ipc$dispatch(r0, r5)
            return
        L_0x001a:
            if (r5 == r0) goto L_0x0024
            if (r5 == r1) goto L_0x0025
            r0 = 3
            if (r5 == r0) goto L_0x0025
            r0 = 4
            if (r5 == r0) goto L_0x0025
        L_0x0024:
            r0 = 2
        L_0x0025:
            tb.aio r5 = r4.d
            r5.sendAudioMode(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bio.onAudioRouteChanged(int):void");
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void onBlueToothDeviceDisconnected() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8c28207", new Object[]{this});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void onLiveChannelIdUpdate(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cfb0de8d", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void p(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efb3c428", new Object[]{this, new Integer(i)});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void s() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89945196", new Object[]{this});
        }
    }

    public void t(View view, boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e1ae6a6f", new Object[]{this, view, new Boolean(z)});
        } else if (view == null) {
        } else {
            if (z) {
                this.e.removeView(view);
                TrtcLog.j(k, "detach remote render");
                return;
            }
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(2);
            this.e.addView(view, layoutParams);
            TrtcLog.j(k, "attach remote render");
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void u(String str, int i, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c2d7bba5", new Object[]{this, str, new Integer(i), str2, str3, str4});
        }
    }

    public synchronized void v() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
            return;
        }
        com.taobao.trtc.api.c cVar = this.f16408a;
        if (cVar != null) {
            cVar.q();
            this.f16408a = null;
        }
        this.b = null;
        this.g = null;
    }

    public View w() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (View) ipChange.ipc$dispatch("fb80e4a", new Object[]{this});
        }
        Iterator it = ((HashMap) this.f).values().iterator();
        if (it.hasNext()) {
            return (SurfaceViewRenderer) it.next();
        }
        return null;
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.c
    public void x(TrtcDefines.e eVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c0423f27", new Object[]{this, eVar});
        } else if (eVar.b != 0) {
            this.d.sendError(BSError.BSDIFF_OLD_FILE_DEC_FAILED, eVar.c);
        } else {
            this.d.sendEnterRoom();
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.a
    public void y(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e74d5e1", new Object[]{this, str});
        }
    }

    @Override // com.taobao.trtc.api.ITrtcObserver.e
    public void C(TrtcDefines.TrtcMediaConnectionState trtcMediaConnectionState) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e20a9d0", new Object[]{this, trtcMediaConnectionState});
        } else if (trtcMediaConnectionState == TrtcDefines.TrtcMediaConnectionState.E_MEDIA_CONNECTION_DISCONNECTED) {
            this.d.sendNetStat(false);
            this.d.sendError(ErrorConstant.ERROR_GET_PROCESS_NULL, "media connection disconnect");
        }
    }

    public synchronized void F(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("25d88994", new Object[]{this, str, str2});
        } else if (this.f16408a == null) {
            this.d.sendError(BSError.BSDIFF_OLD_FILE_DEC_FAILED, "rtc engine not initialized");
        } else {
            if (TextUtils.isEmpty(str)) {
                str = this.g.c;
            }
            String str3 = k;
            TrtcLog.j(str3, "joinChannel: " + str);
            if (!this.i.get()) {
                Bundle bundle = new Bundle();
                bundle.putString("api", "joinChannel");
                bundle.putString("channelId", str);
                bundle.putString(TrtcConstants.TRTC_PARAMS_EXTENSION, str2);
                this.h.add(bundle);
                TrtcLog.j(str3, "cached api joinChannel");
                return;
            }
            TrtcDefines.g gVar = new TrtcDefines.g();
            gVar.f13881a = str;
            gVar.b = str2;
            gVar.d = true;
            gVar.f = false;
            gVar.e = false;
            this.j = gVar;
            this.f16408a.j(gVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0078 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0071 A[SYNTHETIC] */
    @Override // com.taobao.trtc.api.ITrtcObserver.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized void z(boolean r7) {
        /*
            r6 = this;
            r0 = 1
            r1 = 0
            monitor-enter(r6)
            com.android.alibaba.ip.runtime.IpChange r2 = tb.bio.$ipChange     // Catch: all -> 0x001c
            boolean r3 = r2 instanceof com.android.alibaba.ip.runtime.IpChange     // Catch: all -> 0x001c
            if (r3 == 0) goto L_0x001f
            java.lang.String r3 = "cda22ffa"
            java.lang.Boolean r4 = new java.lang.Boolean     // Catch: all -> 0x001c
            r4.<init>(r7)     // Catch: all -> 0x001c
            r7 = 2
            java.lang.Object[] r7 = new java.lang.Object[r7]     // Catch: all -> 0x001c
            r7[r1] = r6     // Catch: all -> 0x001c
            r7[r0] = r4     // Catch: all -> 0x001c
            r2.ipc$dispatch(r3, r7)     // Catch: all -> 0x001c
            monitor-exit(r6)
            return
        L_0x001c:
            r7 = move-exception
            goto L_0x008f
        L_0x001f:
            java.util.concurrent.atomic.AtomicBoolean r7 = r6.i     // Catch: all -> 0x001c
            r7.set(r0)     // Catch: all -> 0x001c
            com.taobao.trtc.api.c r7 = r6.f16408a     // Catch: all -> 0x001c
            if (r7 != 0) goto L_0x002a
            monitor-exit(r6)
            return
        L_0x002a:
            com.taobao.trtc.api.TrtcAudioDevice r7 = r7.g()     // Catch: all -> 0x001c
            r7.setAudioEventObserver(r6)     // Catch: all -> 0x001c
            java.util.ArrayList<android.os.Bundle> r7 = r6.h     // Catch: all -> 0x001c
            java.util.Iterator r7 = r7.iterator()     // Catch: all -> 0x001c
        L_0x0037:
            boolean r2 = r7.hasNext()     // Catch: all -> 0x001c
            if (r2 == 0) goto L_0x0088
            java.lang.Object r2 = r7.next()     // Catch: all -> 0x001c
            android.os.Bundle r2 = (android.os.Bundle) r2     // Catch: all -> 0x001c
            java.lang.String r3 = "api"
            java.lang.String r3 = r2.getString(r3)     // Catch: all -> 0x001c
            int r4 = r3.hashCode()     // Catch: all -> 0x001c
            r5 = -1801390983(0xffffffff94a0f479, float:-1.6252299E-26)
            if (r4 == r5) goto L_0x0063
            r5 = 1873156684(0x6fa61a4c, float:1.02812605E29)
            if (r4 == r5) goto L_0x0058
            goto L_0x006e
        L_0x0058:
            java.lang.String r4 = "leaveChannel"
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x001c
            if (r3 == 0) goto L_0x006e
            r3 = 1
            goto L_0x006f
        L_0x0063:
            java.lang.String r4 = "joinChannel"
            boolean r3 = r3.equals(r4)     // Catch: all -> 0x001c
            if (r3 == 0) goto L_0x006e
            r3 = 0
            goto L_0x006f
        L_0x006e:
            r3 = -1
        L_0x006f:
            if (r3 == 0) goto L_0x0078
            if (r3 == r0) goto L_0x0074
            goto L_0x0037
        L_0x0074:
            r6.I()     // Catch: all -> 0x001c
            goto L_0x0037
        L_0x0078:
            java.lang.String r3 = "channelId"
            java.lang.String r3 = r2.getString(r3)     // Catch: all -> 0x001c
            java.lang.String r4 = "extension"
            java.lang.String r2 = r2.getString(r4)     // Catch: all -> 0x001c
            r6.F(r3, r2)     // Catch: all -> 0x001c
            goto L_0x0037
        L_0x0088:
            java.util.ArrayList<android.os.Bundle> r7 = r6.h     // Catch: all -> 0x001c
            r7.clear()     // Catch: all -> 0x001c
            monitor-exit(r6)
            return
        L_0x008f:
            monitor-exit(r6)     // Catch: all -> 0x001c
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: tb.bio.z(boolean):void");
    }
}
