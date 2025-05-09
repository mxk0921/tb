package tb;

import android.net.Uri;
import android.util.Log;
import com.alibaba.android.split.core.splitinstall.SplitLoaderHolder;
import com.android.alibaba.ip.runtime.IpChange;
import java.io.IOException;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class ybq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ String f31968a;
    public final /* synthetic */ String b;

    public ybq(String str, String str2) {
        this.f31968a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        try {
            Log.e("SplitCompat", "load :" + this.f31968a);
            SplitLoaderHolder.INSTANCE.get().load(acq.PLUGIN_NAME, acq.p().o().getContentResolver().openAssetFileDescriptor(Uri.fromFile(p9h.d(acq.j(acq.p()), this.b)), "r"));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
