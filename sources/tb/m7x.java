package tb;

import android.view.View;
import android.view.ViewGroup;
import io.unicorn.plugin.platform.WeexNestedFrameLayout;
import io.unicorn.plugin.platform.WeexPlatformView;
import java.util.HashMap;
import java.util.Map;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
public class m7x {

    /* renamed from: a  reason: collision with root package name */
    public final WeexPlatformView f23830a;
    public WeexNestedFrameLayout b;
    public final yce c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes10.dex */
    public class a implements pce {
        public a() {
        }

        @Override // tb.pce
        public void a(Map<String, Object> map) {
            if (map != null) {
                boolean booleanValue = ((Boolean) map.get("state")).booleanValue();
                String str = (String) map.get("acceptGestureType");
                if (booleanValue && ied.PULL_HORIZONTAL_DRAG.equals(str)) {
                    m7x m7xVar = m7x.this;
                    if (m7xVar.b != null) {
                        m7xVar.b.setInterceptRoll(true);
                    }
                }
            }
        }
    }

    static {
        t2o.a(945815820);
    }

    public m7x(WeexPlatformView weexPlatformView, yce yceVar) {
        this.f23830a = weexPlatformView;
        this.c = yceVar;
        if (weexPlatformView.getMUSInstance() != null) {
            weexPlatformView.getMUSInstance().setGestureEventListener(new a());
        }
    }

    public View b(View view) {
        if (this.b == null) {
            this.b = new WeexNestedFrameLayout(this.f23830a.getContext());
            this.b.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            if (view != null) {
                this.b.addView(view);
            }
        }
        return this.b;
    }

    public void c(boolean z, double d) {
        this.b.setPlatformListCanScroll(z);
        yce yceVar = this.c;
        yceVar.k(z);
        yceVar.a(d);
    }

    public void d(boolean z, int i) {
        this.b.setPlatformListCanScroll(false);
        this.c.k(false);
        HashMap hashMap = new HashMap();
        if (this.b.isActionMove()) {
            i = 0;
        }
        hashMap.put("enable", Boolean.TRUE);
        hashMap.put("velocity", Integer.valueOf(i));
        this.f23830a.fireEvent("scrollable.scroll", hashMap);
    }

    public void e(boolean z) {
        if (this.b.isMoveSlideUp()) {
            this.b.setPlatformListCanScroll(false);
            this.c.k(false);
            HashMap hashMap = new HashMap();
            hashMap.put("enable", Boolean.TRUE);
            this.f23830a.fireEvent("scrollable.scroll", hashMap);
        }
    }
}
