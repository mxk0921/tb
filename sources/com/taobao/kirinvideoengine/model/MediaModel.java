package com.taobao.kirinvideoengine.model;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.avplayer.DWAspectRatio;
import com.taobao.mediaplay.model.MediaLiveInfo;
import java.io.Serializable;
import java.util.HashMap;
import org.json.JSONObject;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class MediaModel implements Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public final boolean autoPlay;
    public String businessType;
    public final boolean canReuse;
    public final String contentId;
    public HashMap<String, String> controlParams;
    public final String dwInstanceType;
    public final boolean enableBackgroundPlayVideo;
    public final boolean enablePauseInBackGround;
    public boolean enableSurfaceView;
    public final int index;
    public final long interactiveId;
    public boolean isLocalVideo;
    public final MediaLiveInfo liveInfo;
    public final boolean looping;
    public final String mediaType;
    public final Boolean mute;
    public final Boolean releaseShortFocusWhenPause;
    public final String source;
    public final float speed;
    public final int startPos;
    public final String type;
    public final String uniqueIdentifier;
    public final Boolean useShortAudioFocus;
    public DWAspectRatio videoAspectRatio;
    public int videoHeight;
    public final String videoId;
    public final String videoPlayScenes;
    public final JSONObject videoResourceObj;
    public final String videoSource;
    public final String videoUrl;
    public int videoWidth;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public Boolean A;
        public HashMap<String, String> B;

        /* renamed from: a  reason: collision with root package name */
        public String f10885a;
        public String b;
        public String c;
        public String d;
        public String e;
        public String f;
        public JSONObject g;
        public String h;
        public String i;
        public String j;
        public MediaLiveInfo k;
        public final String l;
        public String m;
        public int n;
        public boolean o;
        public boolean p;
        public boolean q;
        public int r;
        public int s;
        public DWAspectRatio t;
        public boolean u;
        public boolean v;
        public boolean w;
        public boolean x;
        public Boolean y;
        public Boolean z;

        static {
            t2o.a(500170795);
        }

        public b(String str) {
            this.f = str;
            this.l = str;
        }

        public static /* synthetic */ long A(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("5b98c12a", new Object[]{bVar})).longValue();
            }
            bVar.getClass();
            return -1L;
        }

        public static /* synthetic */ String B(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("653c1d09", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ JSONObject C(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (JSONObject) ipChange.ipc$dispatch("d1378ca6", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ String D(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("29f24ac7", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ String E(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8c4d61a6", new Object[]{bVar});
            }
            return bVar.i;
        }

        public static /* synthetic */ String a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("171993cf", new Object[]{bVar});
            }
            return bVar.f10885a;
        }

        public static /* synthetic */ String b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7974aaae", new Object[]{bVar});
            }
            return bVar.b;
        }

        public static /* synthetic */ String c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("ca56c280", new Object[]{bVar});
            }
            return bVar.j;
        }

        public static /* synthetic */ MediaLiveInfo d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaLiveInfo) ipChange.ipc$dispatch("9ebb5416", new Object[]{bVar});
            }
            return bVar.k;
        }

        public static /* synthetic */ int e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("23699c95", new Object[]{bVar})).intValue();
            }
            bVar.getClass();
            return 0;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("f168071d", new Object[]{bVar});
            }
            return bVar.l;
        }

        public static /* synthetic */ String g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("53c31dfc", new Object[]{bVar});
            }
            return bVar.m;
        }

        public static /* synthetic */ int h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ccecb658", new Object[]{bVar})).intValue();
            }
            return bVar.n;
        }

        public static /* synthetic */ boolean i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("b01869aa", new Object[]{bVar})).booleanValue();
            }
            return bVar.o;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("93441ceb", new Object[]{bVar})).booleanValue();
            }
            return bVar.p;
        }

        public static /* synthetic */ boolean k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("766fd02c", new Object[]{bVar})).booleanValue();
            }
            return bVar.q;
        }

        public static /* synthetic */ float l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("599b8359", new Object[]{bVar})).floatValue();
            }
            bVar.getClass();
            return 1.0f;
        }

        public static /* synthetic */ String m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("dbcfc18d", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ int n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("df5ceaf2", new Object[]{bVar})).intValue();
            }
            return bVar.r;
        }

        public static /* synthetic */ int o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("c2889e33", new Object[]{bVar})).intValue();
            }
            return bVar.s;
        }

        public static /* synthetic */ DWAspectRatio p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (DWAspectRatio) ipChange.ipc$dispatch("2bae8038", new Object[]{bVar});
            }
            return bVar.t;
        }

        public static /* synthetic */ boolean q(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("88e004c6", new Object[]{bVar})).booleanValue();
            }
            return bVar.u;
        }

        public static /* synthetic */ boolean r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("6c0bb807", new Object[]{bVar})).booleanValue();
            }
            return bVar.v;
        }

        public static /* synthetic */ Boolean s(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("522db3c1", new Object[]{bVar});
            }
            return bVar.y;
        }

        public static /* synthetic */ Boolean t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("3b3578c2", new Object[]{bVar});
            }
            return bVar.z;
        }

        public static /* synthetic */ Boolean u(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Boolean) ipChange.ipc$dispatch("243d3dc3", new Object[]{bVar});
            }
            return bVar.A;
        }

        public static /* synthetic */ boolean v(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("f8ba850b", new Object[]{bVar})).booleanValue();
            }
            return bVar.w;
        }

        public static /* synthetic */ boolean w(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("dbe6384c", new Object[]{bVar})).booleanValue();
            }
            return bVar.x;
        }

        public static /* synthetic */ String x(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("3e2ad86c", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ HashMap y(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (HashMap) ipChange.ipc$dispatch("5ff9d9c1", new Object[]{bVar});
            }
            return bVar.B;
        }

        public static /* synthetic */ String z(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("a085ef4b", new Object[]{bVar});
            }
            return bVar.e;
        }

        public b F(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("892abe46", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public MediaModel G() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (MediaModel) ipChange.ipc$dispatch("2ac3852d", new Object[]{this});
            }
            return new MediaModel(this);
        }

        public b H(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7b05cb85", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public b I(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("aad078c7", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public b J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dd56176b", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b K(HashMap<String, String> hashMap) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ac3484c7", new Object[]{this, hashMap});
            }
            this.B = hashMap;
            return this;
        }

        public b L(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("106471fd", new Object[]{this, str});
            }
            this.f10885a = str;
            return this;
        }

        public b M(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("81f364d9", new Object[]{this, new Boolean(z)});
            }
            this.u = z;
            return this;
        }

        public b N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cd2d1969", new Object[]{this, new Boolean(z)});
            }
            this.v = z;
            return this;
        }

        public b O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dd089a32", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        public b P(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e019b604", new Object[]{this, bool});
            }
            this.z = bool;
            return this;
        }

        public b Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("dc6be1dd", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public b R(MediaLiveInfo mediaLiveInfo) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("130cc00e", new Object[]{this, mediaLiveInfo});
            }
            this.k = mediaLiveInfo;
            return this;
        }

        public b S(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b48a8201", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public b T(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("43febe1", new Object[]{this, str});
            }
            this.b = str;
            return this;
        }

        public b U(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4586a843", new Object[]{this, bool});
            }
            this.y = bool;
            return this;
        }

        public b V(Boolean bool) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4904d3a5", new Object[]{this, bool});
            }
            this.A = bool;
            return this;
        }

        public b W(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d13aa924", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b X(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3accb1c6", new Object[]{this, new Integer(i)});
            }
            this.n = i;
            return this;
        }

        public b Y(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ef01f365", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b Z(DWAspectRatio dWAspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1f3319c8", new Object[]{this, dWAspectRatio});
            }
            this.t = dWAspectRatio;
            return this;
        }

        public b a0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fc70c0b6", new Object[]{this, new Integer(i)});
            }
            this.s = i;
            return this;
        }

        public b b0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("11176529", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }

        public b c0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7e108789", new Object[]{this, str});
            }
            this.j = str;
            return this;
        }

        public b d0(JSONObject jSONObject) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a1664127", new Object[]{this, jSONObject});
            }
            this.g = jSONObject;
            return this;
        }

        public b e0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("71f3dfa9", new Object[]{this, str});
            }
            this.i = str;
            return this;
        }

        public b f0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4ff427eb", new Object[]{this, str});
            }
            this.h = str;
            return this;
        }

        public b g0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("878b40bf", new Object[]{this, new Integer(i)});
            }
            this.r = i;
            return this;
        }
    }

    static {
        t2o.a(500170793);
    }

    public String toString() {
        boolean z = false;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        StringBuilder sb = new StringBuilder("MediaModel{dwInstanceType='");
        sb.append(this.dwInstanceType);
        sb.append("', mediaType='");
        sb.append(this.mediaType);
        sb.append("', type='");
        sb.append(this.type);
        sb.append("', source='");
        sb.append(this.source);
        sb.append("', contentId='");
        sb.append(this.contentId);
        sb.append("', interactiveId=");
        sb.append(this.interactiveId);
        sb.append(", videoId='");
        sb.append(this.videoId);
        sb.append("', videoResourceObj='");
        if (this.videoResourceObj != null) {
            z = true;
        }
        sb.append(z);
        sb.append("', videoUrl='");
        sb.append(this.videoUrl);
        sb.append("', videoSource='");
        sb.append(this.videoSource);
        sb.append("', videoPlayScenes='");
        sb.append(this.videoPlayScenes);
        sb.append("', liveInfo=");
        sb.append(this.liveInfo);
        sb.append(", index=");
        sb.append(this.index);
        sb.append(", uniqueIdentifier='");
        sb.append(this.uniqueIdentifier);
        sb.append("', startPos=");
        sb.append(this.startPos);
        sb.append(", videoWidth=");
        sb.append(this.videoWidth);
        sb.append(", videoHeight=");
        sb.append(this.videoHeight);
        sb.append(", videoAspectRatio=");
        sb.append(this.videoAspectRatio);
        sb.append(", enableBackgroundPlayVideo=");
        sb.append(this.enableBackgroundPlayVideo);
        sb.append(", enablePauseInBackGround=");
        sb.append(this.enablePauseInBackGround);
        sb.append(", useShortAudioFocus=");
        sb.append(this.useShortAudioFocus);
        sb.append(", enableSurfaceView=");
        sb.append(this.enableSurfaceView);
        sb.append(", autoPlay=");
        sb.append(this.autoPlay);
        sb.append(", mute=");
        sb.append(this.mute);
        sb.append(", looping=");
        sb.append(this.looping);
        sb.append(", speed=");
        sb.append(this.speed);
        sb.append('}');
        return sb.toString();
    }

    private MediaModel(b bVar) {
        this.dwInstanceType = b.a(bVar);
        this.mediaType = b.b(bVar);
        this.type = b.m(bVar);
        this.source = b.x(bVar);
        this.contentId = b.z(bVar);
        this.interactiveId = b.A(bVar);
        this.videoId = b.B(bVar);
        this.videoResourceObj = b.C(bVar);
        this.videoUrl = b.D(bVar);
        this.videoSource = b.E(bVar);
        this.videoPlayScenes = b.c(bVar);
        this.liveInfo = b.d(bVar);
        this.index = b.e(bVar);
        this.uniqueIdentifier = b.f(bVar);
        this.businessType = b.g(bVar);
        this.startPos = b.h(bVar);
        this.autoPlay = b.i(bVar);
        this.canReuse = b.j(bVar);
        this.looping = b.k(bVar);
        this.speed = b.l(bVar);
        this.videoWidth = b.n(bVar);
        this.videoHeight = b.o(bVar);
        this.videoAspectRatio = b.p(bVar);
        this.enableBackgroundPlayVideo = b.q(bVar);
        this.enablePauseInBackGround = b.r(bVar);
        this.mute = b.s(bVar);
        this.useShortAudioFocus = b.t(bVar);
        this.releaseShortFocusWhenPause = b.u(bVar);
        this.enableSurfaceView = b.v(bVar);
        this.isLocalVideo = b.w(bVar);
        this.controlParams = b.y(bVar);
    }
}
