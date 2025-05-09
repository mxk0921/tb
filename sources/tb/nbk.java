package tb;

import android.util.LruCache;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.a11y.ability.ocr.OCRResultData;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class nbk {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final nbk f24618a = new nbk();
    public static final LruCache<String, OCRResultData> b = new LruCache<>(20);

    static {
        t2o.a(335544345);
    }

    public static nbk c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (nbk) ipChange.ipc$dispatch("8bb2d4f4", new Object[0]);
        }
        return f24618a;
    }

    public void a(String str, OCRResultData oCRResultData) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("14c17864", new Object[]{this, str, oCRResultData});
        } else if (oCRResultData != null) {
            b.put(rov.c(str), oCRResultData);
        }
    }

    public OCRResultData b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (OCRResultData) ipChange.ipc$dispatch("ffce75d8", new Object[]{this, str});
        }
        return b.get(rov.c(str));
    }
}
