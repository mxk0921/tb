package tb;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.capture.scan.b;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class oda {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Activity f25314a;
    public final yr3 b;
    public final String c;
    public final CaptureManager d;

    static {
        t2o.a(730857589);
    }

    public oda(Activity activity, yr3 yr3Var, String str, CaptureManager captureManager) {
        this.f25314a = activity;
        this.b = yr3Var;
        this.c = str;
        this.d = captureManager;
    }

    public void a(Bitmap bitmap, b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc52e4ad", new Object[]{this, bitmap, bVar, lsoVar});
            return;
        }
        HashMap hashMap = new HashMap(8);
        if (!TextUtils.isEmpty(this.c)) {
            hashMap.put(qu3.KEY, this.c);
        }
        if (this.d.U()) {
            o63.a(this.f25314a, bitmap, bVar.B(), this.b, hashMap, null, 0, bVar.w());
            b(bVar, lsoVar);
            return;
        }
        agh.h("_scancode_GoIrpIfNeededTask", "goAndSendScanResult2Irp: find to get lock");
    }

    public void b(b bVar, lso lsoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("669e0f4a", new Object[]{this, bVar, lsoVar});
        } else {
            zmf.g().a(bVar, lsoVar);
        }
    }
}
