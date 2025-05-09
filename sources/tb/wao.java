package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class wao {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static final String f30570a = "downloading";
    public static final String b = "not_found";

    static {
        t2o.a(350224393);
    }

    public wao(boolean z) {
    }

    public static wao a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("3efa8a5a", new Object[0]);
        }
        return new wao(false);
    }

    public static wao b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("12691d90", new Object[]{str});
        }
        return new wao(false, str);
    }

    public static wao c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (wao) ipChange.ipc$dispatch("8e5f5554", new Object[0]);
        }
        return new wao(true, "success");
    }

    public wao(boolean z, String str) {
    }
}
