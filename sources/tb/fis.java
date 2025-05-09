package tb;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.share.taopassword.constants.TPTargetType;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class fis {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(665845947);
    }

    public void a(Context context, String str, dis disVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1fa99aef", new Object[]{this, context, str, disVar});
        } else if (!TextUtils.isEmpty(str)) {
            try {
                ((ClipboardManager) context.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText(blo.TAO_FLAG, str));
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (disVar != null) {
                disVar.b(str);
            }
        } else if (disVar != null) {
            disVar.onFailed("remote service return data is null!");
        }
    }

    public void b(Context context, TPTargetType tPTargetType, String str, dis disVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("91a80014", new Object[]{this, context, tPTargetType, str, disVar});
        } else if (tPTargetType != null && !TextUtils.isEmpty(str)) {
            String c = kwr.c(tPTargetType);
            a(context, str, disVar);
            if (!TextUtils.isEmpty(c) && !ogs.f25380a) {
                kwr.e(context, c);
            }
            disVar.a(true);
        }
    }
}
