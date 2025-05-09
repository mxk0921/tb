package tb;

import android.taobao.windvane.webview.IWVWebView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes.dex */
public class hrw extends drw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static volatile hrw f20848a;

    static {
        t2o.a(989856231);
    }

    public static hrw c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (hrw) ipChange.ipc$dispatch("1513833", new Object[0]);
        }
        if (f20848a == null) {
            synchronized (hrw.class) {
                try {
                    if (f20848a == null) {
                        f20848a = new hrw();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f20848a;
    }

    public static /* synthetic */ Object ipc$super(hrw hrwVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in android/taobao/windvane/jsbridge/WVJsPreprocessor");
    }

    @Override // tb.crw
    public boolean a(String str, String str2, String str3, String str4) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("25e99ff9", new Object[]{this, str, str2, str3, str4})).booleanValue();
        }
        if (ftw.f().b(str, str2, str3)) {
            return true;
        }
        y71.commitFail(y71.MONITOR_POINT_URL_CONFIG_JS_API_TYPE, 1, str2 + "." + str3, str);
        return false;
    }

    @Override // tb.drw
    public boolean b(IWVWebView iWVWebView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5ad0c10d", new Object[]{this, iWVWebView})).booleanValue();
        }
        if (vpw.commonConfig.A && (iWVWebView instanceof a7e)) {
            a7e a7eVar = (a7e) iWVWebView;
            if (a7eVar.canUseGlobalUrlConfig() || a7eVar.canUseUrlConfig()) {
                return true;
            }
        }
        return false;
    }
}
