package tb;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.ugc.uploader.UploaderTask;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class mf9 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final x6e f24009a;
    public final Handler b = new Handler(Looper.myLooper());

    static {
        t2o.a(758120525);
    }

    public mf9(Context context) {
        x6e a2 = omv.a();
        this.f24009a = a2;
        if (!a2.isInitialized()) {
            a2.initialize(context, new pmv(context, new smv(context)));
        }
    }

    public void a(List<UploaderTask> list, x8j x8jVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("c42749f5", new Object[]{this, list, x8jVar});
            return;
        }
        y8j y8jVar = new y8j(this.f24009a, list, x8jVar);
        for (UploaderTask uploaderTask : list) {
            this.f24009a.uploadAsync(uploaderTask, y8jVar, this.b);
        }
    }
}
