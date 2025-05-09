package tb;

import com.alibaba.security.realidentity.g4;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes2.dex */
public class gdv {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f19917a;
    public static final gdv INIT = new gdv(1, "init");
    public static final gdv LIFECYCLE = new gdv(2, "lifeCycle");
    public static final gdv NETWORK = new gdv(3, g4.c.g);
    public static final gdv DATAPARSE = new gdv(4, p6j.MTOP_STAGE_DATAPARSE);
    public static final gdv DRAWVIEW = new gdv(5, "drawView");
    public static final gdv PAGELOAD = new gdv(6, "pageLoad");
    public static final gdv SUB_CREATE_VIEW = new gdv(7, "createView");
    public static final gdv SUB_BIND_VIEW = new gdv(8, "bindData");

    public gdv(int i, String str) {
        this.f19917a = str;
    }

    public String a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("7c09e698", new Object[]{this});
        }
        return this.f19917a;
    }
}
