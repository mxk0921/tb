package tb;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class vc0 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String[] f29915a = {"e", "type", "tkFlag", "tk_cps_ut", "_cps9", js0.E_URL, "etype", "eadt", "clickid", wll.ALI_TRACK_ID, "acttype", jbk.O2O_URL, "epid", "eads", "tk_cps_param", "o2oclickid", "tkSid", "tkSid2"};

    public x7l a(Intent intent, zmj zmjVar, x7l x7lVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (x7l) ipChange.ipc$dispatch("4cb84046", new Object[]{this, intent, zmjVar, x7lVar});
        }
        if (x7lVar == null) {
            x7lVar = new x7l();
        }
        Uri uri = x7lVar.b;
        if (uri == null) {
            uri = y7l.a(intent.getData());
        }
        x7lVar.f31193a = !TextUtils.isEmpty(y7l.b(f29915a, uri));
        return x7lVar;
    }

    static {
        t2o.a(578814084);
        t2o.a(578814085);
    }
}
