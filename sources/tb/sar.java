package tb;

import android.graphics.Color;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes5.dex */
public final class sar {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final t04 f27914a = new t04();
    public volatile boolean b = false;

    static {
        t2o.a(502267975);
    }

    public final void a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("3cba252b", new Object[]{this});
        } else if (!this.b) {
            this.b = true;
            c("#f0f0f0", "#111111");
            c("#f2f2f2", "#111111");
            c(why.DEFAULT_MASK_BACKGROUND_COLOR, "#222222");
            c("#FAFAFA", "#333333");
            c("#111111", "#EEEEEE");
            c("#333333", "#EEEEEE");
            c("#051b28", "#EEEEEE");
            c("#666666", "#aaaaaa");
            c("#999999", "#888888");
            c("#dddddd", "#777777");
            c("#cccccc", "#777777");
            c("#dcdcdc", "#777777");
            c("#eeeeee", "#383838");
            c("#ff5000", "#ff5000");
            c("#ff5500", "#ff5500");
            c("#FDA638", "#FDA638");
            c("#007AFF", "#0084FF");
            c("#34C759", "#30D158");
            c("#5856D6", "#5E5CE6");
            c("#FF2C55", "#FE375F");
            c("#AF52DE", "#BF59F2");
            c("#FF3B30", "#FF453A");
            c("#5BC7F9", "#63D2FF");
            c("#FFCC01", "#FFD60B");
        }
    }

    public void b(int i, v2m v2mVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("82dfc36c", new Object[]{this, new Integer(i), v2mVar});
            return;
        }
        a();
        int a2 = this.f27914a.a(i);
        if (a2 == -1) {
            v2mVar.b();
        } else {
            v2mVar.a(a2);
        }
    }

    public final void c(String str, String str2) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("1c923baf", new Object[]{this, str, str2});
        } else {
            this.f27914a.b(Color.parseColor(str), Color.parseColor(str2));
        }
    }
}
