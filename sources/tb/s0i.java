package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.detail2.core.framework.data.global.NewDetailScreenConfig;
import tb.dh7;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class s0i {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final float e = 120.0f;
    public static final float f = 30.0f;

    /* renamed from: a  reason: collision with root package name */
    public float f27715a = -1.0f;
    public final cxj b;
    public final dh7 c;
    public b d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType;

        static {
            int[] iArr = new int[NewDetailScreenConfig.ScreenType.values().length];
            $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType = iArr;
            try {
                iArr[NewDetailScreenConfig.ScreenType.FOLD_DEVICE_LANDSCAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[NewDetailScreenConfig.ScreenType.PAD_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class b implements dh7.l {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(352322140);
            t2o.a(352321930);
        }

        public b() {
        }

        @Override // tb.dh7.l
        public void a(int i, int i2, boolean z) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9a5b043d", new Object[]{this, new Integer(i), new Integer(i2), new Boolean(z)});
            } else {
                s0i.a(s0i.this);
            }
        }

        public /* synthetic */ b(s0i s0iVar, a aVar) {
            this();
        }
    }

    static {
        t2o.a(352322138);
    }

    public s0i(cxj cxjVar, dh7 dh7Var) {
        this.b = cxjVar;
        this.c = dh7Var;
    }

    public static /* synthetic */ void a(s0i s0iVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ad1e6315", new Object[]{s0iVar});
        } else {
            s0iVar.c();
        }
    }

    public final void b(NewDetailScreenConfig newDetailScreenConfig) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a863eaca", new Object[]{this, newDetailScreenConfig});
            return;
        }
        int b2 = newDetailScreenConfig.b();
        float f2 = pb6.f(this.b.i(), 480.0f);
        float f3 = b2 / f2;
        float f4 = e / f3;
        this.f27715a = f4;
        float f5 = f;
        if (f4 < f5) {
            this.f27715a = f5;
        }
        txj.e(txj.TAG_TIP, "MainPicScrollSpeedForPad: standardWidth:" + f2 + " widthMultiple:" + f3 + " mSpeedPerDp:" + this.f27715a);
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d6ad630f", new Object[]{this});
            return;
        }
        cxj cxjVar = this.b;
        if (cxjVar == null || cxjVar.i() == null) {
            this.f27715a = e;
            return;
        }
        NewDetailScreenConfig K = this.b.j().K();
        int i = a.$SwitchMap$com$taobao$android$detail2$core$framework$data$global$NewDetailScreenConfig$ScreenType[K.a().ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            b(K);
            return;
        }
        this.f27715a = e;
        txj.e(txj.TAG_TIP, "MainPicScrollSpeedForPhone: mSpeedPerDp:" + this.f27715a);
    }

    public float d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("4c964aef", new Object[]{this})).floatValue();
        }
        if (this.f27715a < 0.0f) {
            txj.e(txj.TAG_TIP, "MainPicScrollSpeed-CalculateSpeedPerDp call for init.");
            c();
            if (this.d == null && this.c != null) {
                b bVar = new b(this, null);
                this.d = bVar;
                this.c.t(bVar);
            }
        }
        return this.f27715a;
    }
}
