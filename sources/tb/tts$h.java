package tb;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.etao.feimagesearch.SingleIrpActivity;
import com.etao.feimagesearch.model.IrpParamModel;
import com.etao.feimagesearch.model.PhotoFrom;
import com.taobao.android.nav.Nav;
import tb.nmj;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class tts$h implements nmj.a {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    static {
        t2o.a(730857500);
        t2o.a(481296434);
    }

    public tts$h() {
    }

    public void a(Context context, String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("79874c34", new Object[]{this, context, str});
        } else if (context != null && !TextUtils.isEmpty(str)) {
            Nav.from(context).toUri(str);
        }
    }

    public void b(Activity activity, String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2c30f1ca", new Object[]{this, activity, str, str2});
        } else {
            a(activity, str);
        }
    }

    public void c(Activity activity, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b5c734f", new Object[]{this, activity, new Integer(i)});
            return;
        }
        Uri.Builder buildUpon = Uri.parse("https://m.taobao.com/image_search/permission_guide/index.html").buildUpon();
        buildUpon.appendQueryParameter(nbf.STDPOP_NAV_MODE, nbf.STDPOP_MODE_VALUE);
        buildUpon.appendQueryParameter(nbf.STDPOP_MODE, "fullscreen");
        buildUpon.appendQueryParameter("permissionType", String.valueOf(i));
        Nav.from(activity).toUri(buildUpon.build().toString());
    }

    public void d(Context context, IrpParamModel irpParamModel) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e0365c8e", new Object[]{this, context, irpParamModel});
        } else if (context != null && irpParamModel != null) {
            try {
                Intent createJumpIntent = irpParamModel.createJumpIntent();
                if (!(context instanceof Activity)) {
                    createJumpIntent.addFlags(268435456);
                }
                if (irpParamModel.getPhotoFrom() == PhotoFrom.Values.WIDGET || irpParamModel.getPhotoFrom() == PhotoFrom.Values.FLOAT_BAR) {
                    createJumpIntent.setComponent(new ComponentName(context, SingleIrpActivity.class));
                }
                context.startActivity(createJumpIntent);
            } catch (Exception unused) {
            }
            pmf.G0();
        }
    }
}
