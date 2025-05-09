package tb;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.nav.Nav;
import java.util.HashMap;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class yoj {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final Nav f32241a;
    public final nmd b;

    static {
        t2o.a(760217730);
    }

    public yoj(Context context, nmd nmdVar) {
        this.f32241a = Nav.from(context);
        this.b = nmdVar;
    }

    public static yoj b(Context context, nmd nmdVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yoj) ipChange.ipc$dispatch("a864607b", new Object[]{context, nmdVar});
        }
        return new yoj(context, nmdVar);
    }

    public yoj a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yoj) ipChange.ipc$dispatch("2ab8a119", new Object[]{this});
        }
        this.f32241a.allowEscape();
        return this;
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("629c0097", new Object[]{this, str});
            return;
        }
        Intent intent = new Intent("afc_page_open_broadcast");
        intent.putExtra("pageName", "scan");
        intent.putExtra("pageUrl", str);
        intent.putExtra("openTimestamp", System.currentTimeMillis());
        LocalBroadcastManager.getInstance(caa.c()).sendBroadcast(intent);
    }

    public boolean d(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("27e4e8c6", new Object[]{this, str})).booleanValue();
        }
        nmd nmdVar = this.b;
        if (nmdVar == null) {
            c(str);
            return this.f32241a.toUri(str);
        }
        HashMap<String, String> a2 = nmdVar.a();
        if (a2 != null) {
            Uri.Builder buildUpon = Uri.parse(str).buildUpon();
            String str2 = a2.get("spm");
            if (!TextUtils.isEmpty(str2) && Uri.parse(str).getQueryParameter("spm") == null) {
                buildUpon.appendQueryParameter("spm", str2);
            }
            Uri build = buildUpon.build();
            c(build.toString());
            return this.f32241a.toUri(build);
        }
        c(str);
        return this.f32241a.toUri(str);
    }

    public yoj e(Bundle bundle) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (yoj) ipChange.ipc$dispatch("c46466e6", new Object[]{this, bundle});
        }
        this.f32241a.withExtras(bundle);
        return this;
    }
}
