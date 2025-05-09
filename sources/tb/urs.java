package tb;

import android.graphics.RectF;
import android.text.TextUtils;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.log.TLog;
import com.taobao.tao.navigation.NavigationTabIndicatorView;
import com.taobao.tao.navigation.TBFragmentTabHost;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class urs {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public final String f29573a;
    public final RectF b;
    public final RectF c;
    public final RectF d;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public String f29574a;
        public float b = -1.0f;

        public static b b() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("3e77e2d5", new Object[0]);
            }
            return new b();
        }

        public urs a() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (urs) ipChange.ipc$dispatch("e2edc49f", new Object[]{this});
            }
            if (TextUtils.isEmpty(this.f29574a)) {
                TLog.loge("TabViewInfo", "bizCode is null. build failed.");
                return null;
            }
            int a2 = xe2.a(this.f29574a);
            if (a2 == -1) {
                TLog.loge("TabViewInfo", "bizCode is invalid. build failed.");
                return null;
            }
            TBFragmentTabHost o = com.taobao.tao.navigation.a.o();
            if (o == null) {
                TLog.loge("TabViewInfo", "fragmentTabHost is null. build failed.");
                return null;
            }
            NavigationTabIndicatorView tabViewAtIndex = o.getTabViewAtIndex(a2);
            if (tabViewAtIndex == null) {
                TLog.loge("TabViewInfo", "indicatorView is null. build failed.");
                return null;
            }
            if (this.b == -1.0f) {
                this.b = o.getHeight();
            }
            float height = o.getHeight() - this.b;
            RectF rectF = new RectF(o.getLeft(), o.getTop() + height, o.getRight(), o.getBottom() + height);
            RectF rectF2 = new RectF(tabViewAtIndex.getX(), tabViewAtIndex.getY() - height, tabViewAtIndex.getRight(), tabViewAtIndex.getBottom());
            return new urs(this.f29574a, new RectF(rectF2.left, tabViewAtIndex.getY(), rectF2.right, rectF2.bottom), rectF2, rectF);
        }

        public b c(String str) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("5b821ebe", new Object[]{this, str});
            }
            this.f29574a = str;
            return this;
        }

        public b d(float f) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return (b) ipChange.ipc$dispatch("c4db07a", new Object[]{this, new Float(f)});
            }
            this.b = f;
            return this;
        }
    }

    public RectF a() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("eb3df003", new Object[]{this});
        }
        return this.c;
    }

    public RectF b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("5d0a14f5", new Object[]{this});
        }
        return this.d;
    }

    public RectF c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RectF) ipChange.ipc$dispatch("741803d", new Object[]{this});
        }
        return this.b;
    }

    public String toString() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (String) ipChange.ipc$dispatch("8126d80d", new Object[]{this});
        }
        return "TabViewInfo{bizCode='" + this.f29573a + "', tabRect=" + this.b + ", tabAlienEffectRect=" + this.c + ", tabHostRect=" + this.d + '}';
    }

    public urs(String str, RectF rectF, RectF rectF2, RectF rectF3) {
        this.f29573a = str;
        this.b = rectF;
        this.c = rectF2;
        this.d = rectF3;
    }
}
