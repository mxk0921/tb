package tb;

import com.alibaba.android.umbrella.link.UMLinkLogInterface;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class zk6 extends sb5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public volatile UMLinkLogInterface f32820a;

    public static /* synthetic */ Object ipc$super(zk6 zk6Var, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/dinamicx/DXUmbrellaImpl");
    }

    @Override // tb.sb5
    public void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6, String str7) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("d68fbbcd", new Object[]{this, str, str2, str3, str4, str5, map, str6, str7});
            return;
        }
        if (this.f32820a == null) {
            d();
        }
        if (this.f32820a != null) {
            this.f32820a.commitFailure(str, str2, str3, str4, str5, map, str6, str7);
        }
    }

    @Override // tb.sb5
    public void b(String str, String str2, String str3, String str4, String str5, Map<String, String> map) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ec5cd960", new Object[]{this, str, str2, str3, str4, str5, map});
            return;
        }
        if (this.f32820a == null) {
            d();
        }
        if (this.f32820a != null) {
            this.f32820a.commitSuccess(str, str2, str3, str4, str5, map);
        }
    }

    @Override // tb.sb5
    public void c(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map, Map<String, Object> map2) {
        cyu cyuVar;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("44f2b787", new Object[]{this, str, str2, str3, str4, str5, str6, map, map2});
            return;
        }
        if (this.f32820a == null) {
            d();
        }
        if (this.f32820a != null) {
            if (map2 != null) {
                cyuVar = cyu.b(map2);
            } else {
                cyuVar = null;
            }
            this.f32820a.logErrorRawDim(str, str2, str3, null, str5, str6, map, cyuVar);
        }
    }

    public final synchronized void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5b7c70ea", new Object[]{this});
            return;
        }
        if (this.f32820a == null) {
            this.f32820a = hdv.a();
        }
    }
}
