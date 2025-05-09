package tb;

import android.text.TextUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes9.dex */
public class qie extends cqe {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(1039138849);
    }

    public static /* synthetic */ Object ipc$super(qie qieVar, String str, Object... objArr) {
        if (str.hashCode() == -1468633154) {
            qieVar.j((ImageView) objArr[0], (HashMap) objArr[1], (cjd) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/tmall/stylekit/render/ImageButtonRender");
    }

    @Override // tb.cqe, tb.qfw, tb.cik
    public void a(Object obj, String str, String str2, cjd cjdVar, String str3) {
        ImageButton imageButton;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d46ca812", new Object[]{this, obj, str, str2, cjdVar, str3});
        } else if ((obj instanceof ImageButton) && (imageButton = (ImageButton) obj) != null) {
            String str4 = ntq.i().k(str3).get(str2);
            if (!TextUtils.isEmpty(str4)) {
                str2 = str4;
            }
            HashMap<String, Object> hashMap = ntq.i().g(str, str3).get(str2);
            if (hashMap != null && hashMap.size() != 0) {
                l(imageButton, hashMap, cjdVar);
            }
        }
    }

    public void l(ImageButton imageButton, HashMap<String, Object> hashMap, cjd cjdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1e716791", new Object[]{this, imageButton, hashMap, cjdVar});
        } else if (imageButton != null && hashMap != null && hashMap.size() != 0) {
            if (cjdVar != null) {
                cjdVar.c(imageButton);
            }
            j(imageButton, hashMap, null);
            if (cjdVar != null) {
                cjdVar.a(imageButton);
            }
        }
    }
}
