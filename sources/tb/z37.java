package tb;

import com.android.alibaba.ip.runtime.IpChange;
import java.util.ArrayList;
import java.util.List;
import tb.bui;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class z37 {
    public static final List<bui> ALL_EXTENSION_TYPES;
    public static final bui BMP;
    public static final bui GIF;
    public static final bui JPEG;
    public static final bui PNG;
    public static final bui WEBP;
    public static final bui WEBP_A = new bui("WEBP", "WEBP_A", new String[]{"webp"}, true, (bui.a) new d());
    public static final bui PNG_A = new bui("PNG", "PNG_A", new String[]{"png"}, true, (bui.a) new f());
    public static final bui HEIF = new bui("HEIF", "HEIF", new String[]{"heic"}, new i());
    public static final bui AVIF = new bui("AVIF", "AVIF", new String[]{"avif"}, new j());
    public static final bui APNG = new bui("PNG", "apng", true, new String[]{"png"}, (bui.a) new a());

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            if (bArr == null || bArr.length < 41 || !cui.n(bArr, 0, cui.PNG_HEADER) || !cui.b(bArr)) {
                return false;
            }
            return true;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class b implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.g(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class c implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.l(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class d implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.j(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class e implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.i(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class f implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.h(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class g implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.e(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class h implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.d(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class i implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.f(bArr);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class j implements bui.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        @Override // tb.bui.a
        public boolean a(byte[] bArr) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("cc02bff5", new Object[]{this, bArr})).booleanValue();
            }
            return cui.c(bArr);
        }
    }

    static {
        t2o.a(618659886);
        bui buiVar = new bui("JPEG", "JPEG", new String[]{ryp.FILE_TYPE_IMAGE_JPG, "jpeg"}, new b());
        JPEG = buiVar;
        bui buiVar2 = new bui("WEBP", "WEBP", new String[]{"webp"}, new c());
        WEBP = buiVar2;
        bui buiVar3 = new bui("PNG", "PNG", new String[]{"png"}, new e());
        PNG = buiVar3;
        bui buiVar4 = new bui("GIF", "GIF", true, new String[]{"gif"}, (bui.a) new g());
        GIF = buiVar4;
        bui buiVar5 = new bui("BMP", "BMP", new String[]{"bmp"}, new h());
        BMP = buiVar5;
        ArrayList arrayList = new ArrayList();
        ALL_EXTENSION_TYPES = arrayList;
        arrayList.add(buiVar);
        arrayList.add(buiVar2);
        arrayList.add(buiVar3);
        arrayList.add(buiVar4);
        arrayList.add(buiVar5);
    }
}
