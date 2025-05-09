package tb;

import android.content.SharedPreferences;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.launcher.common.LauncherRuntime;
import java.util.Locale;
import mtopsdk.common.util.SymbolExpUtil;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class ygq implements Runnable {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    private final int f32079a;
    private final long b;
    private final String c;
    private final String d;

    public ygq(String str, String str2, int i, long j) {
        this.d = str;
        this.c = str2;
        this.f32079a = i;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public void run() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("5c510192", new Object[]{this});
            return;
        }
        SharedPreferences sharedPreferences = LauncherRuntime.h.getSharedPreferences(this.c, 0);
        String string = sharedPreferences.getString(this.d, null);
        if (!TextUtils.isEmpty(string) && string.split(SymbolExpUtil.SYMBOL_VERTICALBAR).length >= 2) {
            Locale locale = Locale.US;
            int i = this.f32079a;
            long j = this.b;
            sharedPreferences.edit().putString(this.d, string.concat(i + ":" + j + "<")).commit();
        }
    }
}
