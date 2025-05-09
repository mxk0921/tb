package com.taobao.interact.publish.service;

import android.os.Parcel;
import android.os.Parcelable;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.Serializable;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class PublishConfig implements Parcelable, Serializable {
    public static final Parcelable.Creator<PublishConfig> CREATOR = new a();
    private AspectRatio aspectRatio;
    private String bizCode;
    private String bizLine;
    private String bizScene;
    private int compressImageMinSide;
    private int compressQuality;
    private boolean enablePosture;
    private int facing;
    private String finishButtonText;
    private boolean isAutoUpload;
    private boolean isMultiable;
    private boolean isRequestCompress;
    private boolean isRequestCrop;
    private boolean isRequestFilter;
    private boolean isRequestGraffiti;
    private boolean isRequestMosaic;
    private boolean isRequestOriginal;
    private boolean isRequestSticker;
    private boolean isRequestThumbnail;
    private boolean isUseNewUi;
    private int maxImageSize;
    private int maxMultiCount;
    private int maxStickerCount;
    private int maxVideoDuration;
    private int maxVideoSize;
    private String mediaType;
    private String mode;
    private int originImageEnable;
    private int requestImageMinSide;
    private BitmapSize targetSize;
    private BitmapSize thumbSize;
    private String version;
    private String videoBizCode;
    private int windowMode;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements Parcelable.Creator<PublishConfig> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a */
        public PublishConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            boolean z3;
            boolean z4;
            boolean z5;
            boolean z6;
            boolean z7;
            boolean z8;
            boolean z9;
            boolean z10 = true;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishConfig) ipChange.ipc$dispatch("e0fef9b7", new Object[]{this, parcel});
            }
            PublishConfig publishConfig = new PublishConfig();
            if (parcel.readInt() == 1) {
                z = true;
            } else {
                z = false;
            }
            publishConfig.isRequestCrop = z;
            if (parcel.readInt() == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            publishConfig.isRequestFilter = z2;
            if (parcel.readInt() == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            publishConfig.isRequestCompress = z3;
            if (parcel.readInt() == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            publishConfig.isRequestThumbnail = z4;
            publishConfig.targetSize = (BitmapSize) parcel.readParcelable(BitmapSize.class.getClassLoader());
            publishConfig.thumbSize = (BitmapSize) parcel.readParcelable(BitmapSize.class.getClassLoader());
            if (parcel.readInt() == 1) {
                z5 = true;
            } else {
                z5 = false;
            }
            publishConfig.isMultiable = z5;
            publishConfig.maxMultiCount = parcel.readInt();
            publishConfig.aspectRatio = (AspectRatio) parcel.readParcelable(AspectRatio.class.getClassLoader());
            publishConfig.bizCode = parcel.readString();
            if (parcel.readInt() == 1) {
                z6 = true;
            } else {
                z6 = false;
            }
            publishConfig.isRequestSticker = z6;
            publishConfig.maxStickerCount = parcel.readInt();
            if (parcel.readInt() == 1) {
                z7 = true;
            } else {
                z7 = false;
            }
            publishConfig.isRequestOriginal = z7;
            if (parcel.readInt() == 1) {
                z8 = true;
            } else {
                z8 = false;
            }
            publishConfig.isRequestGraffiti = z8;
            if (parcel.readInt() == 1) {
                z9 = true;
            } else {
                z9 = false;
            }
            publishConfig.isRequestMosaic = z9;
            publishConfig.version = parcel.readString();
            publishConfig.facing = parcel.readInt();
            if (parcel.readInt() != 1) {
                z10 = false;
            }
            publishConfig.enablePosture = z10;
            publishConfig.windowMode = parcel.readInt();
            return publishConfig;
        }

        /* renamed from: b */
        public PublishConfig[] newArray(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishConfig[]) ipChange.ipc$dispatch("a1a9502e", new Object[]{this, new Integer(i)});
            }
            return new PublishConfig[i];
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public int A;
        public int B;
        public int C;
        public int D;

        /* renamed from: a  reason: collision with root package name */
        public boolean f10845a;
        public String c;
        public String d;
        public String e;
        public String f;
        public String k;
        public String l;
        public int t;
        public AspectRatio u;
        public int z;
        public boolean b = false;
        public String g = "image";
        public int h = 10485760;
        public int i = 104857600;
        public int j = -1;
        public boolean m = true;
        public boolean n = true;
        public boolean o = true;
        public BitmapSize p = new BitmapSize();
        public BitmapSize q = new BitmapSize();
        public boolean r = true;
        public boolean s = false;
        public final int v = 5;
        public boolean w = false;
        public boolean x = false;
        public boolean y = false;

        static {
            t2o.a(495976487);
        }

        public static /* synthetic */ int A(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3a19b2e6", new Object[]{bVar})).intValue();
            }
            return bVar.C;
        }

        public static /* synthetic */ int B(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("a4493b05", new Object[]{bVar})).intValue();
            }
            return bVar.D;
        }

        public static /* synthetic */ BitmapSize C(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapSize) ipChange.ipc$dispatch("13951a97", new Object[]{bVar});
            }
            return bVar.q;
        }

        public static /* synthetic */ boolean D(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("68c00a61", new Object[]{bVar})).booleanValue();
            }
            return bVar.r;
        }

        public static /* synthetic */ boolean E(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("d2ef9280", new Object[]{bVar})).booleanValue();
            }
            return bVar.s;
        }

        public static /* synthetic */ int F(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("3d1f1a8e", new Object[]{bVar})).intValue();
            }
            return bVar.t;
        }

        public static /* synthetic */ AspectRatio G(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio) ipChange.ipc$dispatch("44da17d8", new Object[]{bVar});
            }
            return bVar.u;
        }

        public static /* synthetic */ String H(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("323db6e7", new Object[]{bVar});
            }
            return bVar.e;
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("55d261c6", new Object[]{bVar})).booleanValue();
            }
            return bVar.m;
        }

        public static /* synthetic */ boolean b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("c001e9e5", new Object[]{bVar})).booleanValue();
            }
            return bVar.n;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ae37ab37", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("18673345", new Object[]{bVar})).intValue();
            }
            return bVar.v;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("8296bb75", new Object[]{bVar})).booleanValue();
            }
            return bVar.w;
        }

        public static /* synthetic */ boolean f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("ecc64394", new Object[]{bVar})).booleanValue();
            }
            return bVar.x;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("56f5cbb3", new Object[]{bVar})).booleanValue();
            }
            return bVar.y;
        }

        public static /* synthetic */ String h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("d068f692", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ int i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("2b54dbe0", new Object[]{bVar})).intValue();
            }
            return bVar.z;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("95846410", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ int k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("ffb3ec1e", new Object[]{bVar})).intValue();
            }
            bVar.getClass();
            return 0;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("69e3744e", new Object[]{bVar})).booleanValue();
            }
            return bVar.f10845a;
        }

        public static /* synthetic */ boolean m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2a317204", new Object[]{bVar})).booleanValue();
            }
            return bVar.o;
        }

        public static /* synthetic */ boolean n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("89f926f8", new Object[]{bVar})).booleanValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ String o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("7a78eded", new Object[]{bVar});
            }
            return bVar.c;
        }

        public static /* synthetic */ String p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("21f4c7ae", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ String q(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("c970a16f", new Object[]{bVar});
            }
            return bVar.f;
        }

        public static /* synthetic */ String r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("70ec7b30", new Object[]{bVar});
            }
            return bVar.g;
        }

        public static /* synthetic */ int s(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("9ce6cf82", new Object[]{bVar})).intValue();
            }
            return bVar.i;
        }

        public static /* synthetic */ int t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("71657a1", new Object[]{bVar})).intValue();
            }
            return bVar.h;
        }

        public static /* synthetic */ int u(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7145dfc0", new Object[]{bVar})).intValue();
            }
            return bVar.j;
        }

        public static /* synthetic */ String v(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("edbe234", new Object[]{bVar});
            }
            return bVar.k;
        }

        public static /* synthetic */ String w(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("b657bbf5", new Object[]{bVar});
            }
            return bVar.l;
        }

        public static /* synthetic */ BitmapSize x(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapSize) ipChange.ipc$dispatch("601c0896", new Object[]{bVar});
            }
            return bVar.p;
        }

        public static /* synthetic */ int y(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("65baa2a8", new Object[]{bVar})).intValue();
            }
            return bVar.A;
        }

        public static /* synthetic */ int z(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("cfea2ac7", new Object[]{bVar})).intValue();
            }
            return bVar.B;
        }

        public PublishConfig I() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishConfig) ipChange.ipc$dispatch("a42b9175", new Object[]{this});
            }
            return new PublishConfig(this);
        }

        public b J(AspectRatio aspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3a6c89df", new Object[]{this, aspectRatio});
            }
            this.u = aspectRatio;
            return this;
        }

        public b K(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c32ff7e4", new Object[]{this, new Boolean(z)});
            }
            this.f10845a = z;
            return this;
        }

        public b L(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9381d1f8", new Object[]{this, str});
            }
            this.e = str;
            return this;
        }

        public b M(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("1832dff", new Object[]{this, str});
            }
            this.c = str;
            return this;
        }

        public b N(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b46326d5", new Object[]{this, str});
            }
            this.d = str;
            return this;
        }

        public b O(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9fd0b8f3", new Object[]{this, new Integer(i)});
            }
            this.B = i;
            return this;
        }

        public b P(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("74cdee4a", new Object[]{this, new Integer(i)});
            }
            this.A = i;
            return this;
        }

        public b Q(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("78fee5c9", new Object[]{this, new Integer(i)});
            }
            this.z = i;
            return this;
        }

        public b R(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("9428d00e", new Object[]{this, str});
            }
            this.l = str;
            return this;
        }

        public b S(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d024a06b", new Object[]{this, new Integer(i)});
            }
            this.h = i;
            return this;
        }

        public b T(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3b36e68d", new Object[]{this, new Integer(i)});
            }
            this.t = i;
            return this;
        }

        public b U(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("93d611d8", new Object[]{this, new Integer(i)});
            }
            this.j = i;
            return this;
        }

        public b V(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c58ae14b", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public b W(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("37729216", new Object[]{this, str});
            }
            this.g = str;
            return this;
        }

        public b X(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("82bcae3f", new Object[]{this, str});
            }
            this.k = str;
            return this;
        }

        public b Y(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("cfab12c5", new Object[]{this, new Boolean(z)});
            }
            this.s = z;
            return this;
        }

        public b Z(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c7511def", new Object[]{this, new Integer(i)});
            }
            this.D = i;
            return this;
        }

        @Deprecated
        public b a0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("495ce487", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public b b0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("98a89919", new Object[]{this, new Boolean(z)});
            }
            this.m = z;
            return this;
        }

        public b c0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("acba9a71", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public b d0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("ce2fe261", new Object[]{this, new Boolean(z)});
            }
            this.x = z;
            return this;
        }

        public b e0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("25ad736a", new Object[]{this, new Integer(i)});
            }
            this.C = i;
            return this;
        }

        public b f0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e09b5f1f", new Object[]{this, new Boolean(z)});
            }
            this.y = z;
            return this;
        }

        public b g0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6aa73438", new Object[]{this, new Boolean(z)});
            }
            this.w = z;
            return this;
        }

        @Deprecated
        public b h0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b30f3d37", new Object[]{this, new Boolean(z)});
            }
            this.o = z;
            return this;
        }

        public b i0(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("56d02ec3", new Object[]{this, bitmapSize});
            }
            this.p = bitmapSize;
            return this;
        }

        @Deprecated
        public b j0(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f6b2ee84", new Object[]{this, bitmapSize});
            }
            this.o = true;
            this.q = bitmapSize;
            return this;
        }

        public b k0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e1d21947", new Object[]{this, new Boolean(z)});
            }
            this.b = z;
            return this;
        }

        public b l0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7f0cef41", new Object[]{this, str});
            }
            this.f = str;
            return this;
        }
    }

    static {
        t2o.a(495976485);
    }

    public PublishConfig() {
        this.targetSize = new BitmapSize();
        this.thumbSize = new BitmapSize();
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxVideoSize = 104857600;
        this.maxImageSize = 10485760;
        this.maxVideoDuration = -1;
    }

    public static PublishConfig createDefault() {
        return new PublishConfig(new b());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public AspectRatio getAspectRatio() {
        return this.aspectRatio;
    }

    public String getBizCode() {
        return this.bizCode;
    }

    public String getBizLine() {
        return this.bizLine;
    }

    public String getBizScene() {
        return this.bizScene;
    }

    public int getCompressImageMinSide() {
        return this.compressImageMinSide;
    }

    public int getCompressQuality() {
        return this.compressQuality;
    }

    public int getFacing() {
        return this.facing;
    }

    public String getFinishButtonText() {
        return this.finishButtonText;
    }

    public int getMaxImageSize() {
        return this.maxImageSize;
    }

    public int getMaxMultiCount() {
        return this.maxMultiCount;
    }

    public int getMaxStickerCount() {
        return this.maxStickerCount;
    }

    public int getMaxVideoDuration() {
        return this.maxVideoDuration;
    }

    public int getMaxVideoSize() {
        return this.maxVideoSize;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public String getMode() {
        return this.mode;
    }

    public int getOriginImageEnable() {
        return this.originImageEnable;
    }

    public int getRequestImageMinSide() {
        return this.requestImageMinSide;
    }

    public BitmapSize getTargetSize() {
        return this.targetSize;
    }

    public BitmapSize getThumbSize() {
        return this.thumbSize;
    }

    public String getVersion() {
        return this.version;
    }

    public String getVideoBizCode() {
        return this.videoBizCode;
    }

    public int getWindowMode() {
        return this.windowMode;
    }

    public boolean isAutoUpload() {
        return this.isAutoUpload;
    }

    public boolean isEnablePosture() {
        return this.enablePosture;
    }

    public boolean isMultiable() {
        return this.isMultiable;
    }

    public boolean isRequestCompress() {
        return this.isRequestCompress;
    }

    public boolean isRequestCrop() {
        return this.isRequestCrop;
    }

    public boolean isRequestFilter() {
        return this.isRequestFilter;
    }

    public boolean isRequestGraffiti() {
        return this.isRequestGraffiti;
    }

    public boolean isRequestMosaic() {
        return this.isRequestMosaic;
    }

    public boolean isRequestOriginal() {
        return this.isRequestOriginal;
    }

    public boolean isRequestSticker() {
        return this.isRequestSticker;
    }

    public boolean isRequestThumbnail() {
        return this.isRequestThumbnail;
    }

    public boolean isUseNewUi() {
        return this.isUseNewUi;
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setBizCode(String str) {
        this.bizCode = str;
    }

    public void setEnablePosture(boolean z) {
        this.enablePosture = z;
    }

    public void setFacing(int i) {
        this.facing = i;
    }

    public void setFinishButtonText(String str) {
        this.finishButtonText = str;
    }

    public void setMaxMultiCount(int i) {
        this.maxMultiCount = i;
    }

    public void setMaxStickerCount(int i) {
        this.maxStickerCount = i;
    }

    public void setMultiable(boolean z) {
        this.isMultiable = z;
    }

    @Deprecated
    public void setRequestCompress(boolean z) {
        this.isRequestCompress = z;
    }

    public void setRequestCrop(boolean z) {
        this.isRequestCrop = z;
    }

    public void setRequestFilter(boolean z) {
        this.isRequestFilter = z;
    }

    public void setRequestGraffiti(boolean z) {
        this.isRequestGraffiti = z;
    }

    public void setRequestMosaic(boolean z) {
        this.isRequestMosaic = z;
    }

    public void setRequestOriginal(boolean z) {
        this.isRequestOriginal = z;
    }

    public void setRequestSticker(boolean z) {
        this.isRequestSticker = z;
    }

    @Deprecated
    public void setRequestThumbnail(boolean z) {
        this.isRequestThumbnail = z;
    }

    public void setTargetSize(BitmapSize bitmapSize) {
        this.targetSize = bitmapSize;
    }

    @Deprecated
    public void setThumbSize(BitmapSize bitmapSize) {
        this.thumbSize = bitmapSize;
    }

    public void setVersion(String str) {
        this.version = str;
    }

    public void setWindowMode(int i) {
        this.windowMode = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isRequestCrop ? 1 : 0);
        parcel.writeInt(this.isRequestFilter ? 1 : 0);
        parcel.writeInt(this.isRequestCompress ? 1 : 0);
        parcel.writeInt(this.isRequestThumbnail ? 1 : 0);
        parcel.writeParcelable(this.targetSize, 1);
        parcel.writeParcelable(this.thumbSize, 1);
        parcel.writeInt(this.isMultiable ? 1 : 0);
        parcel.writeInt(this.maxMultiCount);
        parcel.writeParcelable(this.aspectRatio, 1);
        parcel.writeString(this.bizCode);
        parcel.writeInt(this.isRequestSticker ? 1 : 0);
        parcel.writeInt(this.maxStickerCount);
        parcel.writeInt(this.isRequestOriginal ? 1 : 0);
        parcel.writeInt(this.isRequestGraffiti ? 1 : 0);
        parcel.writeInt(this.isRequestMosaic ? 1 : 0);
        parcel.writeString(this.version);
        parcel.writeInt(this.facing);
        parcel.writeInt(this.enablePosture ? 1 : 0);
        parcel.writeInt(this.windowMode);
    }

    public PublishConfig(b bVar) {
        this.targetSize = new BitmapSize();
        this.thumbSize = new BitmapSize();
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxVideoSize = 104857600;
        this.maxImageSize = 10485760;
        this.maxVideoDuration = -1;
        this.isRequestCrop = b.a(bVar);
        this.isRequestFilter = b.b(bVar);
        this.isRequestThumbnail = b.m(bVar);
        this.targetSize = b.x(bVar);
        this.thumbSize = b.C(bVar);
        this.isRequestCompress = b.D(bVar);
        this.isMultiable = b.E(bVar);
        this.maxMultiCount = b.F(bVar);
        this.aspectRatio = b.G(bVar);
        this.bizCode = b.H(bVar);
        this.isRequestSticker = b.c(bVar);
        this.maxStickerCount = b.d(bVar);
        this.isRequestOriginal = b.e(bVar);
        this.isRequestGraffiti = b.f(bVar);
        this.isRequestMosaic = b.g(bVar);
        this.version = b.h(bVar);
        this.facing = b.i(bVar);
        this.enablePosture = b.j(bVar);
        this.windowMode = b.k(bVar);
        this.isAutoUpload = b.l(bVar);
        this.isUseNewUi = b.n(bVar);
        this.bizLine = b.o(bVar);
        this.bizScene = b.p(bVar);
        this.videoBizCode = b.q(bVar);
        this.mediaType = b.r(bVar);
        this.maxVideoSize = b.s(bVar);
        this.maxImageSize = b.t(bVar);
        this.maxVideoDuration = b.u(bVar);
        this.mode = b.v(bVar);
        this.finishButtonText = b.w(bVar);
        this.compressQuality = b.y(bVar);
        this.compressImageMinSide = b.z(bVar);
        this.requestImageMinSide = b.A(bVar);
        this.originImageEnable = b.B(bVar);
    }
}
