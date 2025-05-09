package tb;

import android.content.Context;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import kotlin.collections.a;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public final class r59 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(913309704);
    }

    public final void a(Context context, long j, long j2, String str, String str2, String str3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("869d19a6", new Object[]{this, context, new Long(j), new Long(j2), str, str2, str3});
            return;
        }
        ckf.g(context, "context");
        ckf.g(str, "feedbackId");
        ckf.g(str2, "title");
        ckf.g(str3, "content");
        try {
            Intent intent = new Intent("com.taobao.android.diagnose.action.feedback");
            intent.putExtra("feedbackID", str);
            intent.putExtra("title", str2);
            intent.putExtra("content", str3);
            LocalBroadcastManager.getInstance(context).sendBroadcast(intent);
            hf9.l(j, j2, "FEEDBACK", "taobao4android_feedback_21646297", a.i(jpu.a("feedbackID", str), jpu.a("title", str2), jpu.a("content", str3)), null);
            String b = uov.INSTANCE.b();
            TLog.loge(b, "Tlog upload success: ", "title: " + str2 + ", content: " + str3 + ", feedbackID: " + str);
        } catch (Exception e) {
            TLog.loge(uov.INSTANCE.b(), "Tlog upload error: ", e.toString());
        }
    }
}
