package tb;

import com.huawei.nfc.sdk.service.ICUPOnlinePayCallBackService;
import com.huawei.nfc.sdk.service.ICUPOnlinePayService;
import com.huawei.nfc.sdk.service.c;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
class j9b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ k9b f21849a;
    final /* synthetic */ c b;

    public j9b(c cVar, k9b k9bVar) {
        this.b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        byte[] bArr;
        ICUPOnlinePayService iCUPOnlinePayService;
        ICUPOnlinePayService iCUPOnlinePayService2;
        ICUPOnlinePayCallBackService iCUPOnlinePayCallBackService;
        bArr = this.b.f5530a;
        synchronized (bArr) {
            this.b.getClass();
            this.b.n();
            iCUPOnlinePayService = this.b.c;
            if (iCUPOnlinePayService != null) {
                try {
                    iCUPOnlinePayService2 = this.b.c;
                    iCUPOnlinePayCallBackService = this.b.g;
                    iCUPOnlinePayService2.getUnionOnlinePayStatus(iCUPOnlinePayCallBackService);
                } catch (Exception unused) {
                    this.b.m();
                }
            }
        }
    }
}
