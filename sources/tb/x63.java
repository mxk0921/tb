package tb;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.net.URLEncoder;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public final class x63 extends mz1<y63> implements hdd, qlb {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ Bitmap f31172a;
        public final /* synthetic */ x63 b;

        /* compiled from: Taobao */
        /* renamed from: tb.x63$a$a  reason: collision with other inner class name */
        /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
        public static final class RunnableC1096a implements Runnable {
            public static volatile transient /* synthetic */ IpChange $ipChange;

            /* renamed from: a  reason: collision with root package name */
            public final /* synthetic */ String f31173a;
            public final /* synthetic */ String b;
            public final /* synthetic */ x63 c;

            public RunnableC1096a(String str, String str2, x63 x63Var) {
                this.f31173a = str;
                this.b = str2;
                this.c = x63Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                IpChange ipChange = $ipChange;
                if (ipChange instanceof IpChange) {
                    ipChange.ipc$dispatch("5c510192", new Object[]{this});
                    return;
                }
                h73 h73Var = h73.INSTANCE;
                String str = this.f31173a;
                String str2 = this.b;
                ckf.f(str2, "picPath");
                h73Var.d(str, str2, 0);
                Nav from = Nav.from(((y63) x63.y(this.c)).I());
                from.toUri(Uri.parse("https://web.m.taobao.com/app/taowise/feeds/home?g_code=pltAnswerTabAgent&g_channelSrp=pltAnswerTab&imageToken=" + this.f31173a + "&inputHint=" + ((Object) URLEncoder.encode("有问题？继续追问吧")) + "&sendButtonText=" + ((Object) URLEncoder.encode("追问"))));
            }
        }

        public a(Bitmap bitmap, x63 x63Var) {
            this.f31172a = bitmap;
            this.b = x63Var;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                ((y63) x63.y(this.b)).I().runOnUiThread(new RunnableC1096a(String.valueOf(SystemClock.elapsedRealtime()), mld.k(((y63) x63.y(this.b)).I(), gd2.d(this.f31172a, new RectF(0.0f, 0.285f, 1.0f, 0.5f)), 90), this.b));
            }
        }
    }

    static {
        t2o.a(730857556);
        t2o.a(481297512);
        t2o.a(481297500);
    }

    public static /* synthetic */ Object ipc$super(x63 x63Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/etao/feimagesearch/capture/dynamic/biz/CaptureQuestionPresenter");
    }

    public static final /* synthetic */ d32 y(x63 x63Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (d32) ipChange.ipc$dispatch("b16f7d98", new Object[]{x63Var});
        }
        return x63Var.f24401a;
    }

    @Override // tb.hdd
    public void d(byte[] bArr, int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f2128929", new Object[]{this, bArr, new Integer(i), new Integer(i2), new Integer(i3), new Integer(i4), new Integer(i5), new Boolean(z), new Integer(i6)});
        }
    }

    @Override // tb.qlb
    public void j(Bitmap bitmap, boolean z, boolean z2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fb8f6b2e", new Object[]{this, bitmap, new Boolean(z), new Boolean(z2)});
            return;
        }
        ckf.g(bitmap, "snapshot");
        z7m.c(new a(bitmap, this));
    }
}
