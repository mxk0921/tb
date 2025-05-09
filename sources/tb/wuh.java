package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class wuh {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static xuh f30934a;
    public static xuh b;

    public static xuh a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuh) ipChange.ipc$dispatch("78e49519", new Object[0]);
        }
        if (b == null) {
            b = new yuh("mts-sdk-report");
        }
        return b;
    }

    public static xuh b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xuh) ipChange.ipc$dispatch("41675a86", new Object[0]);
        }
        if (f30934a == null) {
            f30934a = new yuh("mts-sdk-default");
        }
        return f30934a;
    }
}
