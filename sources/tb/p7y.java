package tb;

import android.content.Context;
import android.content.Intent;
import com.alibaba.wireless.aliprivacyext.jsbridge.c;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
@c(name = {"openAuthSettings"})
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
public class p7y extends osx {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes3.dex */
    public class a implements osk {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ pwx f25926a;

        public a(pwx pwxVar) {
            this.f25926a = pwxVar;
        }

        @Override // tb.osk
        public void b(Exception exc, Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("9230b976", new Object[]{this, exc, intent});
                return;
            }
            g01.d("OpenSettingsApi", "OpenSettingsApi failed", exc);
            p7y.e(p7y.this, this.f25926a, osx.d, null);
        }

        @Override // tb.osk
        public void a(Intent intent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("a20c3f3e", new Object[]{this, intent});
                return;
            }
            HashMap hashMap = new HashMap(1);
            hashMap.put("action", "open_settings");
            p7y.d(p7y.this, this.f25926a, "调用成功", hashMap);
        }
    }

    public static /* synthetic */ void d(p7y p7yVar, pwx pwxVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("bbe4761b", new Object[]{p7yVar, pwxVar, str, map});
        } else {
            p7yVar.c(pwxVar, str, map);
        }
    }

    public static /* synthetic */ void e(p7y p7yVar, pwx pwxVar, String str, Map map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6595a15c", new Object[]{p7yVar, pwxVar, str, map});
        } else {
            p7yVar.a(pwxVar, str, map);
        }
    }

    public static /* synthetic */ Object ipc$super(p7y p7yVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/alibaba/wireless/aliprivacyext/jsbridge/api/g");
    }

    @Override // tb.osx
    public boolean b(Context context, String str, String str2, pwx pwxVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("b709cffc", new Object[]{this, context, str, str2, pwxVar})).booleanValue();
        }
        br0.c().g(context, new a(pwxVar));
        return true;
    }
}
