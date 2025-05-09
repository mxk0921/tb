package tb;

import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.detail.rate.widget.DisplayVideoViewV2;
import java.util.ArrayList;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public final class psn {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String DX_RECYCLER_LAYOUT_SCROLL_STATE_BEGIN = "onScrollBegin";
    public static final String DX_RECYCLER_LAYOUT_SCROLL_STATE_END = "onScrollEnd";

    /* renamed from: a  reason: collision with root package name */
    public static String f26274a = "onScrollEnd";
    public static boolean c;
    public static final psn INSTANCE = new psn();
    public static final ArrayList<DisplayVideoViewV2> b = new ArrayList<>();

    public final void a(DisplayVideoViewV2 displayVideoViewV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("be6b424d", new Object[]{this, displayVideoViewV2});
            return;
        }
        ckf.g(displayVideoViewV2, "video");
        b.add(displayVideoViewV2);
    }

    public final void c(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ee2b53a2", new Object[]{this, str});
            return;
        }
        ckf.g(str, "state");
        b(str);
        if (f() && g()) {
            ArrayList<DisplayVideoViewV2> arrayList = b;
            if (arrayList.size() > 0) {
                ((DisplayVideoViewV2) i04.l0(arrayList)).dealPlayVideo();
                arrayList.clear();
            }
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b42d4c54", new Object[]{this});
            return;
        }
        b.clear();
        c = false;
    }

    public final boolean e() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("ea596f5c", new Object[]{this})).booleanValue();
        }
        return c;
    }

    public final void h(DisplayVideoViewV2 displayVideoViewV2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e3e6c7d7", new Object[]{this, displayVideoViewV2});
            return;
        }
        ckf.g(displayVideoViewV2, "video");
        b.remove(displayVideoViewV2);
    }

    public final void b(String str) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("10a49785", new Object[]{this, str});
            return;
        }
        ckf.g(str, "state");
        f26274a = str;
        c = true;
    }

    public final boolean f() {
        boolean z;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("f2312d58", new Object[]{this})).booleanValue();
        }
        if (xgn.INSTANCE.p()) {
            ufp ufpVar = ufp.INSTANCE;
            if (ufpVar.b() || ufpVar.a()) {
                z = true;
                String a2 = d1g.INSTANCE.a();
                odg.c(a2, "video control append = " + z);
                return z;
            }
        }
        z = false;
        String a22 = d1g.INSTANCE.a();
        odg.c(a22, "video control append = " + z);
        return z;
    }

    public final boolean g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("3cb55f4f", new Object[]{this})).booleanValue();
        }
        return f() && TextUtils.equals(DX_RECYCLER_LAYOUT_SCROLL_STATE_END, f26274a);
    }
}
