package tb;

import android.text.TextUtils;
import android.util.SparseArray;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public class opo implements aft<String, Void> {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray<vct<String, Void>> f25554a;

    public opo() {
        w35.a("SafeModeLauncherProvider");
        SparseArray<vct<String, Void>> sparseArray = new SparseArray<>(5);
        this.f25554a = sparseArray;
        sparseArray.put(-427297510, new cye("InitChangeAppIcon"));
        sparseArray.put(18938326, new eye("InitClearSpeedFlag"));
        sparseArray.put(-99685344, new i5f("InitSafeMode"));
        sparseArray.put(-781420870, new l6f("InitTMSSafeMode"));
        sparseArray.put(-1989387751, new u7f("InitUpdate"));
        w35.c();
    }

    public static int b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Number) ipChange.ipc$dispatch("be1b105f", new Object[]{str})).intValue();
        }
        int length = str.length();
        if (length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            i = (i * 31) + str.charAt(i2);
        }
        return i;
    }

    /* renamed from: c */
    public vct<String, Void> a(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (vct) ipChange.ipc$dispatch("8948aea4", new Object[]{this, str});
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        vct<String, Void> vctVar = this.f25554a.get(str.hashCode());
        if (vctVar != null) {
            return vctVar;
        }
        jdh.a("SafeModeLauncherProvider", "task '%s' not found, fallback to customized hashCode.", str);
        return this.f25554a.get(b(str));
    }
}
