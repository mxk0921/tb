package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.behavir.BehaviR;
import com.taobao.android.behavir.init.BrDelayInitTask;
import com.taobao.android.behavix.adapter.BXBRBridge;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class zm1 implements BXBRBridge.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final zm1 f32858a = new zm1();

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f32859a;

        static {
            int[] iArr = new int[BXBRBridge.ExtAction.values().length];
            f32859a = iArr;
            try {
                iArr[BXBRBridge.ExtAction.UPLOAD_UPP_PLAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f32859a[BXBRBridge.ExtAction.UPLOAD_UPP_CONFIG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f32859a[BXBRBridge.ExtAction.UPDATE_SCENE_ARGS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        t2o.a(404750337);
        t2o.a(404750475);
    }

    public static zm1 a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (zm1) ipChange.ipc$dispatch("bb5f1834", new Object[0]);
        }
        return f32858a;
    }

    public void b(BXBRBridge.ExtAction extAction, Object... objArr) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("81be765d", new Object[]{this, extAction, objArr});
        } else if (extAction != null) {
            try {
                if (a.f32859a[extAction.ordinal()] == 3) {
                    BehaviR.getInstance().updateScene((ly1) objArr[0]);
                }
            } catch (Exception e) {
                om8.e("BXBRProxy", e);
            }
        }
    }

    public void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("78816afd", new Object[]{this});
        } else {
            wm1.b();
        }
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6e0c99b1", new Object[]{this});
            return;
        }
        dm1.c().k();
        dm1.c().l();
    }

    public void e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("efc3b09b", new Object[]{this});
        } else {
            BrDelayInitTask.j();
        }
    }
}
