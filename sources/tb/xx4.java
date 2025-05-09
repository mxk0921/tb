package tb;

import androidx.appcompat.taobao.util.Globals;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.qrcode.ShareQRCodeTask;
import tb.l7n;
import tb.lkp;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class xx4 extends yhp {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String QRCODE = "PanelQRCode";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public class a implements l7n.d {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ ShareQRCodeTask.a f31655a;

        public a(ShareQRCodeTask.a aVar) {
            this.f31655a = aVar;
        }

        public void a(boolean z, String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5b331b5", new Object[]{this, new Boolean(z), str});
                return;
            }
            ShareQRCodeTask shareQRCodeTask = new ShareQRCodeTask(gjp.a());
            int a2 = lkp.a(lkp.b.SHARE_PANNEL_QRCODE_COLOR);
            int i = a2 != -1 ? a2 : -10066330;
            xx4.d(xx4.this, str);
            shareQRCodeTask.c(str, i, 50, null, this.f31655a, z);
        }
    }

    static {
        t2o.a(666894458);
    }

    public xx4(whp whpVar) {
        super(whpVar);
    }

    public static /* synthetic */ String d(xx4 xx4Var, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("d7cb7715", new Object[]{xx4Var, str});
        }
        xx4Var.getClass();
        return str;
    }

    public static /* synthetic */ Object ipc$super(xx4 xx4Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/handler/worker/CreateQrWorker");
    }

    public void e(String str, String str2, boolean z, ShareQRCodeTask.a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("32b8dea6", new Object[]{this, str, str2, new Boolean(z), aVar});
        } else {
            new l7n(bwr.h().e()).e(Globals.getApplication(), str, str2, z, new a(aVar));
        }
    }
}
