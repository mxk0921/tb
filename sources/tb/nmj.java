package tb;

import android.app.Activity;
import android.content.Context;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.model.IrpParamModel;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class nmj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static a f24828a;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public interface a {
    }

    static {
        t2o.a(481296433);
    }

    public static void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79874c34", new Object[]{context, str});
        } else {
            ((tts$h) f24828a).a(context, str);
        }
    }

    public static void b(a aVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e7647ab3", new Object[]{aVar});
        } else {
            f24828a = aVar;
        }
    }

    public static void c(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c30f1ca", new Object[]{activity, str, str2});
        } else {
            ((tts$h) f24828a).b(activity, str, str2);
        }
    }

    public static void d(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c734f", new Object[]{activity, new Integer(i)});
        } else {
            ((tts$h) f24828a).c(activity, i);
        }
    }

    public static void e(Context context, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0365c8e", new Object[]{context, irpParamModel});
        } else if (!(context instanceof Activity) || !((Activity) context).isFinishing()) {
            ((tts$h) f24828a).d(context, irpParamModel);
        }
    }
}
