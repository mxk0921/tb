package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class fkg {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String BIZ_LINE = "guangguang";
    public static final String BIZ_SCENE = "guangguang";
    public static final int LE_VERSION = kdg.d();
    public static final String PAGE_IMAGE_EDIT = "image_edit";
    public static final String PAGE_PUBLISH = "publish";
    public static final String PAGE_RECORD = "record";
    public static final String PAGE_VIDEO_EDIT = "video_edit";
    public static final String TAG = "LcSdk";

    /* renamed from: a  reason: collision with root package name */
    public volatile boolean f19355a;
    public volatile boolean b;
    public d c;
    public yjg d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public static class b {
        public static final fkg INSTANCE = new fkg();

        static {
            t2o.a(511705324);
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface c {
        void a(int i, String str);

        void b(String str);
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
    public interface d extends c {
        void onCreate();

        void onDestroy();
    }

    static {
        t2o.a(511705322);
    }

    public static fkg c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (fkg) ipChange.ipc$dispatch("7f4a1a69", new Object[0]);
        }
        return b.INSTANCE;
    }

    public void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("518a4783", new Object[]{this});
            return;
        }
        odg.c(TAG, " sdk create: ");
        this.f19355a = true;
        if (this.d != null) {
            Globals.getApplication().unregisterComponentCallbacks(this.d);
        } else {
            this.d = new yjg();
        }
        Globals.getApplication().registerComponentCallbacks(this.d);
        d dVar = this.c;
        if (dVar != null) {
            dVar.onCreate();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89c49781", new Object[]{this});
        } else if (this.f19355a) {
            odg.c(TAG, " sdk destroy: ");
            this.f19355a = false;
            Globals.getApplication().unregisterComponentCallbacks(this.d);
            d dVar = this.c;
            if (dVar != null) {
                dVar.onDestroy();
                this.c = null;
                this.d = null;
            }
        }
    }

    public boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("c92ebd39", new Object[]{this})).booleanValue();
        }
        return this.b;
    }

    public boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("6b6a3f40", new Object[]{this})).booleanValue();
        }
        return this.f19355a;
    }

    public void f(d dVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("89d04e47", new Object[]{this, dVar});
            return;
        }
        this.c = dVar;
        this.d.a(dVar);
    }

    public void g(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b613f7", new Object[]{this, str});
            return;
        }
        yjg yjgVar = this.d;
        if (yjgVar != null) {
            yjgVar.b(str);
        }
    }

    public void h(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f3ba1308", new Object[]{this, new Boolean(z)});
        }
    }

    public void i(boolean z) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("84c887c1", new Object[]{this, new Boolean(z)});
        } else {
            this.b = z;
        }
    }

    public fkg() {
        this.d = new yjg();
    }
}
