package tb;

import android.content.Context;
import android.graphics.Typeface;
import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class k7z {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String ALIBABA_FONT_BOLD = "iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf";
    public static final String ALIBABA_FONT_MIDDLE = "iconfonts/AlibabaSans102_v1_TaoBao-Md.ttf";
    public static final String TAG = "FontUtils";
    public static boolean b;
    public static final k7z INSTANCE = new k7z();

    /* renamed from: a  reason: collision with root package name */
    public static final LruCache<String, Typeface> f22456a = new LruCache<>(5);

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 0})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Context f22457a;

        public a(Context context) {
            this.f22457a = context;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
                return;
            }
            try {
                for (String str : yz3.l("iconfonts/AlibabaSans102_v1_TaoBao-Bd.ttf", k7z.ALIBABA_FONT_MIDDLE)) {
                    k7z.a(k7z.INSTANCE).put(str, Typeface.createFromAsset(this.f22457a.getAssets(), str));
                }
            } catch (Exception e) {
                tgh.c(k7z.TAG, "initTypefaceCache() error", e);
            }
        }
    }

    static {
        t2o.a(912262789);
    }

    public static final /* synthetic */ LruCache a(k7z k7zVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (LruCache) ipChange.ipc$dispatch("9f4f3b50", new Object[]{k7zVar});
        }
        return f22456a;
    }

    @JvmStatic
    public static final void c(Context context) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0af7106", new Object[]{context});
            return;
        }
        ckf.h(context, "context");
        if (!b) {
            pos.a(new a(context));
            b = true;
        }
    }

    public final Typeface b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("3553bf54", new Object[]{this, str});
        }
        ckf.h(str, "fontName");
        return f22456a.get(str);
    }

    public final Typeface d(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Typeface) ipChange.ipc$dispatch("87265de4", new Object[]{this, context, str});
        }
        ckf.h(context, "context");
        ckf.h(str, "fontName");
        try {
            Typeface createFromAsset = Typeface.createFromAsset(context.getAssets(), str);
            if (createFromAsset == null) {
                return null;
            }
            f22456a.put(str, createFromAsset);
            return createFromAsset;
        } catch (Exception e) {
            tgh.c(TAG, "loadTypeface() error", e);
            return null;
        }
    }
}
