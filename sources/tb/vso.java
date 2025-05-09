package tb;

import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.structure.capture.CaptureManager;
import tb.l53;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class vso {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(481296408);
    }

    public static boolean b(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("216219fd", new Object[]{str, str2})).booleanValue();
        }
        if (l53.b.b(str) != l53.b.b(str2)) {
            return true;
        }
        return false;
    }

    public static void c(String str, CaptureManager captureManager) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("36c89be2", new Object[]{str, captureManager});
        } else {
            captureManager.v0(l53.b.b(str));
        }
    }

    public static boolean a(String str, boolean z, CaptureManager captureManager, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("91ab7a4c", new Object[]{str, new Boolean(z), captureManager, str2})).booleanValue();
        }
        int b = l53.b.b(str);
        if (!z && captureManager.t() == b) {
            return true;
        }
        if (b == 0) {
            jzu.g(p73.f25916a, "clickScanTab", "pssource", str2);
        } else if (b == 1) {
            jzu.g(p73.f25916a, "clickPhotoSearchTab", "pssource", str2);
        } else if (b == 2) {
            jzu.g(p73.f25916a, "clickMarketingTab", "pssource", str2);
        } else if (b == 3) {
            jzu.g(p73.f25916a, "clickTranslateTab", "pssource", str2);
        } else if (b == 4) {
            jzu.g(p73.f25916a, "clickQuestionTab", "pssource", str2);
        } else if (b == 5) {
            jzu.g(p73.f25916a, "clickIdentifyAllTab", "pssource", str2);
        }
        return false;
    }
}
