package tb;

import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class zrr implements xjc {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public static xjc f32977a;
    public static final xjc b = new zrr();

    static {
        t2o.a(822083594);
        t2o.a(822083586);
    }

    public static xjc c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (xjc) ipChange.ipc$dispatch("434872c3", new Object[0]);
        }
        xjc xjcVar = f32977a;
        if (xjcVar == null) {
            return b;
        }
        return xjcVar;
    }

    public static void d(xjc xjcVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3784ea7", new Object[]{xjcVar});
        } else if (xjcVar != null && f32977a == null) {
            f32977a = xjcVar;
        }
    }

    @Override // tb.xjc
    public boolean a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("5c8678b2", new Object[]{this})).booleanValue();
        }
        return false;
    }

    @Override // tb.xjc
    public String b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5ba580a5", new Object[]{this, str});
        }
        return "lib" + str + jcq.SO_EXTENSION;
    }

    @Override // tb.xjc
    public String loadLibrary(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("5c39cb9a", new Object[]{this, str});
        }
        urr.a("TBPSoLoaderHelper", "Load library %s from apk", str);
        System.loadLibrary(str);
        return null;
    }
}
