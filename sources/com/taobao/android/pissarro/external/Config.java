package com.taobao.android.pissarro.external;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.interact.publish.service.PublishConfig;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import tb.t2o;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class Config implements Cloneable, Serializable {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final int ARTWORK_MODE = 1;
    public static final int ARTWORK_OR_CLOP_MODE = 2;
    public static final int CLIP_MODE = 0;
    public static final int DEFAULT_FACING_BACK = 0;
    public static final int DEFAULT_FACING_FRONT = 1;
    public static final int WINDOW_DIALOG_MODE = 0;
    public static final int WINDOW_PAGE_MODE = 1;
    private AspectRatio aspectRatio;
    private BitmapSize bitmapSize;
    private String bizCode;
    private String bizLine;
    private String bizScene;
    private int definitionMode;
    private boolean disableAlbumSelect;
    private boolean enableClip;
    private boolean enableFilter;
    private boolean enableGraffiti;
    private boolean enableMosaic;
    private boolean enablePosture;
    private boolean enableSticker;
    private int facing;
    private String finishButtonText;
    private boolean isAutoUpload;
    private boolean isSupportGif;
    private boolean isUseNewUi;
    private int maxImageSize;
    private int maxSelectCount;
    private int maxStickerCount;
    private int maxVideoDuration;
    private int maxVideoSize;
    private String mediaType;
    private String mode;
    private boolean multiple;
    private PublishConfig publishConfig;
    private String returnPage;
    private List<String> stickerIds;
    private String videoBizCode;
    private int windowMode;

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface DefaultFacing {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface Mode {
    }

    /* compiled from: Taobao */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public @interface WindowMode {
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public String A;
        public PublishConfig B;
        public AspectRatio d;
        public BitmapSize h;
        public String m;
        public boolean n;
        public boolean q;
        public String s;
        public String t;
        public String u;
        public String z;

        /* renamed from: a  reason: collision with root package name */
        public boolean f9166a = true;
        public int b = 9;
        public boolean c = false;
        public boolean e = false;
        public boolean f = false;
        public int g = 6;
        public int i = 2;
        public boolean j = false;
        public boolean k = false;
        public int l = 0;
        public int o = 0;
        public boolean p = false;
        public boolean r = false;
        public String v = "image";
        public int w = 104857600;
        public int x = 10485760;
        public int y = -1;

        static {
            t2o.a(623902764);
        }

        public static /* synthetic */ boolean A(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("3e707e81", new Object[]{bVar})).booleanValue();
            }
            return bVar.f;
        }

        public static /* synthetic */ int B(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("447449cf", new Object[]{bVar})).intValue();
            }
            return bVar.g;
        }

        public static /* synthetic */ int C(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4a78152e", new Object[]{bVar})).intValue();
            }
            return bVar.i;
        }

        public static /* synthetic */ BitmapSize D(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (BitmapSize) ipChange.ipc$dispatch("70ebc7ec", new Object[]{bVar});
            }
            return bVar.h;
        }

        public static /* synthetic */ boolean E(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("567fabfd", new Object[]{bVar})).booleanValue();
            }
            return bVar.j;
        }

        public static /* synthetic */ boolean a(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("205d85a6", new Object[]{bVar})).booleanValue();
            }
            return bVar.f9166a;
        }

        public static /* synthetic */ int b(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("266150f4", new Object[]{bVar})).intValue();
            }
            return bVar.b;
        }

        public static /* synthetic */ boolean c(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("5b0ef7d7", new Object[]{bVar})).booleanValue();
            }
            return bVar.k;
        }

        public static /* synthetic */ int d(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("6112c325", new Object[]{bVar})).intValue();
            }
            return bVar.l;
        }

        public static /* synthetic */ boolean e(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("67168e95", new Object[]{bVar})).booleanValue();
            }
            bVar.getClass();
            return false;
        }

        public static /* synthetic */ String f(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("73c0b8b0", new Object[]{bVar});
            }
            return bVar.m;
        }

        public static /* synthetic */ boolean g(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("731e2553", new Object[]{bVar})).booleanValue();
            }
            return bVar.n;
        }

        public static /* synthetic */ int h(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("7921f0a1", new Object[]{bVar})).intValue();
            }
            return bVar.o;
        }

        public static /* synthetic */ List i(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (List) ipChange.ipc$dispatch("8618da9a", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean j(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("85298770", new Object[]{bVar})).booleanValue();
            }
            return bVar.p;
        }

        public static /* synthetic */ String k(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("77c93135", new Object[]{bVar});
            }
            bVar.getClass();
            return null;
        }

        public static /* synthetic */ boolean l(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("91311e2e", new Object[]{bVar})).booleanValue();
            }
            return bVar.q;
        }

        public static /* synthetic */ boolean m(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("2c651c64", new Object[]{bVar})).booleanValue();
            }
            return bVar.c;
        }

        public static /* synthetic */ boolean n(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("15849858", new Object[]{bVar})).booleanValue();
            }
            return bVar.r;
        }

        public static /* synthetic */ String o(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8b250d4d", new Object[]{bVar});
            }
            return bVar.s;
        }

        public static /* synthetic */ String p(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8bf38bce", new Object[]{bVar});
            }
            return bVar.t;
        }

        public static /* synthetic */ String q(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8cc20a4f", new Object[]{bVar});
            }
            return bVar.u;
        }

        public static /* synthetic */ String r(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8d9088d0", new Object[]{bVar});
            }
            return bVar.v;
        }

        public static /* synthetic */ int s(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("33979122", new Object[]{bVar})).intValue();
            }
            return bVar.w;
        }

        public static /* synthetic */ int t(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("399b5c81", new Object[]{bVar})).intValue();
            }
            return bVar.y;
        }

        public static /* synthetic */ String u(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("8ffc0453", new Object[]{bVar});
            }
            return bVar.z;
        }

        public static /* synthetic */ String v(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (String) ipChange.ipc$dispatch("90ca82d4", new Object[]{bVar});
            }
            return bVar.A;
        }

        public static /* synthetic */ int w(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Number) ipChange.ipc$dispatch("4ba6be9e", new Object[]{bVar})).intValue();
            }
            return bVar.x;
        }

        public static /* synthetic */ AspectRatio x(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (AspectRatio) ipChange.ipc$dispatch("3e773822", new Object[]{bVar});
            }
            return bVar.d;
        }

        public static /* synthetic */ PublishConfig y(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (PublishConfig) ipChange.ipc$dispatch("b8d66e55", new Object[]{bVar});
            }
            return bVar.B;
        }

        public static /* synthetic */ boolean z(b bVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("386cb322", new Object[]{bVar})).booleanValue();
            }
            return bVar.e;
        }

        public Config F() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (Config) ipChange.ipc$dispatch("27e51815", new Object[]{this});
            }
            return new Config(this);
        }

        public b G(AspectRatio aspectRatio) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e36d58ec", new Object[]{this, aspectRatio});
            }
            this.d = aspectRatio;
            return this;
        }

        public b H(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("712fa304", new Object[]{this, new Boolean(z)});
            }
            this.q = z;
            return this;
        }

        public b I(BitmapSize bitmapSize) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a6b50e92", new Object[]{this, bitmapSize});
            }
            this.h = bitmapSize;
            return this;
        }

        public b J(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f2239c18", new Object[]{this, str});
            }
            this.m = str;
            return this;
        }

        public b K(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6340495f", new Object[]{this, str});
            }
            this.s = str;
            return this;
        }

        public b L(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d8691ab5", new Object[]{this, str});
            }
            this.t = str;
            return this;
        }

        public b M(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("838ec6d", new Object[]{this, new Integer(i)});
            }
            this.i = i;
            return this;
        }

        public b N(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("51eeb4b1", new Object[]{this, new Boolean(z)});
            }
            this.p = z;
            return this;
        }

        public b O(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("7de53981", new Object[]{this, new Boolean(z)});
            }
            this.c = z;
            return this;
        }

        public b P(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("f8bd3b99", new Object[]{this, new Boolean(z)});
            }
            this.e = z;
            return this;
        }

        public b Q(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("6f724589", new Object[]{this, new Boolean(z)});
            }
            this.j = z;
            return this;
        }

        public b R(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c3029ac7", new Object[]{this, new Boolean(z)});
            }
            this.k = z;
            return this;
        }

        public b S(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b091d233", new Object[]{this, new Boolean(z)});
            }
            this.n = z;
            return this;
        }

        public b T(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d3eb435e", new Object[]{this, new Boolean(z)});
            }
            this.f = z;
            return this;
        }

        public b U(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("30ac20a9", new Object[]{this, new Integer(i)});
            }
            this.l = i;
            return this;
        }

        public b V(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("431062ae", new Object[]{this, str});
            }
            this.A = str;
            return this;
        }

        public b W(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5ad2fccb", new Object[]{this, new Integer(i)});
            }
            this.x = i;
            return this;
        }

        public b X(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("53d182b4", new Object[]{this, new Integer(i)});
            }
            this.b = i;
            return this;
        }

        public b Y(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("a9a281f1", new Object[]{this, new Integer(i)});
            }
            this.g = i;
            return this;
        }

        public b Z(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("d71d43f8", new Object[]{this, new Integer(i)});
            }
            this.y = i;
            return this;
        }

        public b a0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("e6b365ab", new Object[]{this, new Integer(i)});
            }
            this.w = i;
            return this;
        }

        public b b0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("89364ab6", new Object[]{this, str});
            }
            this.v = str;
            return this;
        }

        public b c0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("acaef99f", new Object[]{this, str});
            }
            this.z = str;
            return this;
        }

        public b d0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("fc27bd04", new Object[]{this, new Boolean(z)});
            }
            this.f9166a = z;
            return this;
        }

        public b e0(PublishConfig publishConfig) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("440102c3", new Object[]{this, publishConfig});
            }
            this.B = publishConfig;
            return this;
        }

        public b f0(boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("b6d34aa7", new Object[]{this, new Boolean(z)});
            }
            this.r = z;
            return this;
        }

        public b g0(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("367ca421", new Object[]{this, str});
            }
            this.u = str;
            return this;
        }

        public b h0(int i) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("4f6cc9f0", new Object[]{this, new Integer(i)});
            }
            this.o = i;
            return this;
        }
    }

    static {
        t2o.a(623902762);
    }

    public static Config createDefault() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("7a82614c", new Object[0]);
        }
        return new b().F();
    }

    public AspectRatio getAspectRatio() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (AspectRatio) ipChange.ipc$dispatch("6b40fb1d", new Object[]{this});
        }
        return this.aspectRatio;
    }

    public BitmapSize getBitmapSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BitmapSize) ipChange.ipc$dispatch("bcd6949f", new Object[]{this});
        }
        return this.bitmapSize;
    }

    public String getBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("826ffbcf", new Object[]{this});
        }
        return this.bizCode;
    }

    public String getBizLine() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("26095428", new Object[]{this});
        }
        return this.bizLine;
    }

    public String getBizScene() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("e69425aa", new Object[]{this});
        }
        return this.bizScene;
    }

    public int getDefinitionMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("59e82d06", new Object[]{this})).intValue();
        }
        return this.definitionMode;
    }

    public int getFacing() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("116a8f4a", new Object[]{this})).intValue();
        }
        return this.facing;
    }

    public String getFinishButtonText() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("f56c411", new Object[]{this});
        }
        return this.finishButtonText;
    }

    public int getMaxImageSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("5285d2e8", new Object[]{this})).intValue();
        }
        return this.maxImageSize;
    }

    public int getMaxSelectCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("6e1fc5f", new Object[]{this})).intValue();
        }
        return this.maxSelectCount;
    }

    public int getMaxStickerCount() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("751d5f9a", new Object[]{this})).intValue();
        }
        return this.maxStickerCount;
    }

    public int getMaxVideoDuration() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("34ebbb9b", new Object[]{this})).intValue();
        }
        return this.maxVideoDuration;
    }

    public int getMaxVideoSize() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("f12e1e08", new Object[]{this})).intValue();
        }
        return this.maxVideoSize;
    }

    public String getMediaType() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5a5b4171", new Object[]{this});
        }
        return this.mediaType;
    }

    public String getMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("24310680", new Object[]{this});
        }
        return this.mode;
    }

    public PublishConfig getPublishConfig() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (PublishConfig) ipChange.ipc$dispatch("bcee60c2", new Object[]{this});
        }
        return this.publishConfig;
    }

    public String getReturnPage() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("735aa244", new Object[]{this});
        }
        return this.returnPage;
    }

    public List<String> getStickerIds() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("c104ef0f", new Object[]{this});
        }
        return this.stickerIds;
    }

    public String getVideoBizCode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("a2c1babe", new Object[]{this});
        }
        return this.videoBizCode;
    }

    public int getWindowMode() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("ee9851a3", new Object[]{this})).intValue();
        }
        return this.windowMode;
    }

    public boolean isAutoUpload() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b181dce5", new Object[]{this})).booleanValue();
        }
        return this.isAutoUpload;
    }

    public boolean isDisableAlbumSelect() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3e8abd18", new Object[]{this})).booleanValue();
        }
        return this.disableAlbumSelect;
    }

    public boolean isEnableClip() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1ccde48", new Object[]{this})).booleanValue();
        }
        return this.enableClip;
    }

    public boolean isEnableFilter() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3f48cb30", new Object[]{this})).booleanValue();
        }
        return this.enableFilter;
    }

    public boolean isEnableGraffiti() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3fea9940", new Object[]{this})).booleanValue();
        }
        return this.enableGraffiti;
    }

    public boolean isEnableMosaic() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("56f75342", new Object[]{this})).booleanValue();
        }
        return this.enableMosaic;
    }

    public boolean isEnablePosture() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("93c4b7c6", new Object[]{this})).booleanValue();
        }
        return this.enablePosture;
    }

    public boolean isEnableSticker() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("40cb95bb", new Object[]{this})).booleanValue();
        }
        return this.enableSticker;
    }

    public boolean isMultiple() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("e1cb94e5", new Object[]{this})).booleanValue();
        }
        return this.multiple;
    }

    public boolean isSupportGif() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("a099b4a", new Object[]{this})).booleanValue();
        }
        return this.isSupportGif;
    }

    public boolean isUseNewUi() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f1249b62", new Object[]{this})).booleanValue();
        }
        return this.isUseNewUi;
    }

    public void setAspectRatio(AspectRatio aspectRatio) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6604c5c3", new Object[]{this, aspectRatio});
        } else {
            this.aspectRatio = aspectRatio;
        }
    }

    public void setBitmapSize(BitmapSize bitmapSize) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c136269", new Object[]{this, bitmapSize});
        } else {
            this.bitmapSize = bitmapSize;
        }
    }

    public void setBizCode(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d29306ef", new Object[]{this, str});
        } else {
            this.bizCode = str;
        }
    }

    public void setDefinitionMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3162a7c4", new Object[]{this, new Integer(i)});
        } else {
            this.definitionMode = i;
        }
    }

    public void setEnableClip(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("344296d8", new Object[]{this, new Boolean(z)});
        } else {
            this.enableClip = z;
        }
    }

    public void setEnableFilter(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("456cf4f0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableFilter = z;
        }
    }

    public void setEnableGraffiti(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0ba16e0", new Object[]{this, new Boolean(z)});
        } else {
            this.enableGraffiti = z;
        }
    }

    public void setEnableMosaic(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("238f6f1e", new Object[]{this, new Boolean(z)});
        } else {
            this.enableMosaic = z;
        }
    }

    public void setEnablePosture(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bcac448a", new Object[]{this, new Boolean(z)});
        } else {
            this.enablePosture = z;
        }
    }

    public void setEnableSticker(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b0812535", new Object[]{this, new Boolean(z)});
        } else {
            this.enableSticker = z;
        }
    }

    public void setFacing(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b24d4200", new Object[]{this, new Integer(i)});
        } else {
            this.facing = i;
        }
    }

    public void setFinishButtonText(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("17c44c85", new Object[]{this, str});
        } else {
            this.finishButtonText = str;
        }
    }

    public void setMaxSelectCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("23a2c38b", new Object[]{this, new Integer(i)});
        } else {
            this.maxSelectCount = i;
        }
    }

    public void setMaxStickerCount(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a8e23748", new Object[]{this, new Integer(i)});
        } else {
            this.maxStickerCount = i;
        }
    }

    public void setMultiple(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("269e85db", new Object[]{this, new Boolean(z)});
        } else {
            this.multiple = z;
        }
    }

    public void setStickerIds(List<String> list) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("206fd935", new Object[]{this, list});
        } else {
            this.stickerIds = list;
        }
    }

    public void setSupportGif(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("239d7a16", new Object[]{this, new Boolean(z)});
        } else {
            this.isSupportGif = z;
        }
    }

    public void setWindowMode(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1b48f0c7", new Object[]{this, new Integer(i)});
        } else {
            this.windowMode = i;
        }
    }

    private Config(b bVar) {
        this.isUseNewUi = false;
        this.mediaType = "image";
        this.maxImageSize = 10485760;
        this.maxVideoSize = 104857600;
        this.maxVideoDuration = -1;
        this.multiple = b.a(bVar);
        this.maxSelectCount = b.b(bVar);
        this.enableClip = b.m(bVar);
        this.aspectRatio = b.x(bVar);
        this.enableFilter = b.z(bVar);
        this.enableSticker = b.A(bVar);
        this.maxStickerCount = b.B(bVar);
        this.definitionMode = b.C(bVar);
        this.bitmapSize = b.D(bVar);
        this.enableGraffiti = b.E(bVar);
        this.enableMosaic = b.c(bVar);
        this.facing = b.d(bVar);
        this.isSupportGif = b.e(bVar);
        this.bizCode = b.f(bVar);
        this.enablePosture = b.g(bVar);
        this.windowMode = b.h(bVar);
        this.stickerIds = b.i(bVar);
        this.disableAlbumSelect = b.j(bVar);
        this.returnPage = b.k(bVar);
        this.isAutoUpload = b.l(bVar);
        this.isUseNewUi = b.n(bVar);
        this.bizLine = b.o(bVar);
        this.bizScene = b.p(bVar);
        this.videoBizCode = b.q(bVar);
        this.mediaType = b.r(bVar);
        this.maxVideoSize = b.s(bVar);
        this.maxVideoDuration = b.t(bVar);
        this.mode = b.u(bVar);
        this.finishButtonText = b.v(bVar);
        this.maxImageSize = b.w(bVar);
        this.publishConfig = b.y(bVar);
    }

    public Config clone() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Config) ipChange.ipc$dispatch("90a1f504", new Object[]{this});
        }
        try {
            return (Config) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }
}
