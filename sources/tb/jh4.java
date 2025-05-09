package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.orange.OrangeConfig;
import java.util.Arrays;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class jh4 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static List<String> f21992a;

    static {
        t2o.a(701497350);
    }

    public static boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("d6fa61cf", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAddParams", "1"));
    }

    public static boolean b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8fc1e0", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAutoAddParams", "1"));
    }

    public static boolean c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("544ea94d", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "enableAutoAddTrackParams", "1"));
    }

    public static boolean d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3d296977", new Object[0])).booleanValue();
        }
        return TextUtils.equals(OrangeConfig.getInstance().getConfig("android_commission", "enableMtopErrorRetryOnce", "1"), "1");
    }

    public static boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5e0cc30e", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "closeBusinessJSApi", "0"));
    }

    public static boolean f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("1c4430", new Object[0])).booleanValue();
        }
        return "1".equals(OrangeConfig.getInstance().getConfig("android_commission", "commissionAddTraceDegree", "0"));
    }

    public static List<String> g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (List) ipChange.ipc$dispatch("4d7c77c5", new Object[0]);
        }
        if (f21992a == null) {
            f21992a = Arrays.asList(OrangeConfig.getInstance().getConfig("android_commission", "trackParamKeyList", "tcpParam;outerSceneId;outerAdUserParam;tcpOuterParam").split(";"));
        }
        return f21992a;
    }
}
