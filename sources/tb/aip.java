package tb;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.util.BitmapUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public abstract class aip {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(666894559);
        t2o.a(666894558);
    }

    public aip(Context context) {
        context.getApplicationContext();
    }

    public Bitmap a(View view) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (Bitmap) ipChange.ipc$dispatch("df37ab95", new Object[]{this, view});
        }
        return BitmapUtil.createViewBitmap(view);
    }

    public String b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("61a547ae", new Object[]{this});
        }
        return "";
    }
}
