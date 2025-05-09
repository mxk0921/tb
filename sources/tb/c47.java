package tb;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class c47 implements ezc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    @Override // tb.ezc
    public void a(Context context, Intent intent, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("4eb827af", new Object[]{this, context, intent, new Integer(i)});
        } else if (context != null) {
            ((Activity) context).startActivityForResult(intent, i);
        }
    }
}
