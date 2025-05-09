package tb;

import android.view.MotionEvent;
import android.view.View;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import tb.ngl;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
public class v5b extends ngl {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class a extends ngl.a {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316896);
        }

        public a() {
            this.f24716a = View.TRANSLATION_X;
        }

        public static /* synthetic */ Object ipc$super(a aVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/bouncy/viewpager/HorizontalOverScrollBounceEffectDecorator$AnimationAttributesHorizontal");
        }

        @Override // tb.ngl.a
        public void a(View view) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("ce90a9db", new Object[]{this, view});
                return;
            }
            this.b = view.getTranslationX();
            this.c = view.getWidth();
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes8.dex */
    public static class b extends ngl.e {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        static {
            t2o.a(503316897);
        }

        public static /* synthetic */ Object ipc$super(b bVar, String str, Object... objArr) {
            str.hashCode();
            int hashCode = str.hashCode();
            throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/bouncy/viewpager/HorizontalOverScrollBounceEffectDecorator$MotionAttributesHorizontal");
        }

        @Override // tb.ngl.e
        public boolean a(View view, MotionEvent motionEvent) {
            boolean z = false;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("53c43834", new Object[]{this, view, motionEvent})).booleanValue();
            }
            if (motionEvent.getHistorySize() == 0) {
                return false;
            }
            float y = motionEvent.getY(0) - motionEvent.getHistoricalY(0, 0);
            float x = motionEvent.getX(0) - motionEvent.getHistoricalX(0, 0);
            if (Math.abs(x) < Math.abs(y)) {
                return false;
            }
            this.f24719a = view.getTranslationX();
            this.b = x;
            if (x > 0.0f) {
                z = true;
            }
            this.c = z;
            return true;
        }
    }

    static {
        t2o.a(503316895);
    }

    public v5b(u4d u4dVar) {
        this(u4dVar, 3.0f, 1.0f, -2.0f);
    }

    public static /* synthetic */ Object ipc$super(v5b v5bVar, String str, Object... objArr) {
        str.hashCode();
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/tao/flexbox/layoutmanager/component/bouncy/viewpager/HorizontalOverScrollBounceEffectDecorator");
    }

    @Override // tb.ngl
    public ngl.a b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngl.a) ipChange.ipc$dispatch("939d97f7", new Object[]{this});
        }
        return new a();
    }

    @Override // tb.ngl
    public ngl.e c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (ngl.e) ipChange.ipc$dispatch("dd20650d", new Object[]{this});
        }
        return new b();
    }

    @Override // tb.ngl
    public void f(View view, float f) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f5ccc448", new Object[]{this, view, new Float(f)});
        } else {
            view.setTranslationX(f);
        }
    }

    @Override // tb.ngl
    public void g(View view, float f, MotionEvent motionEvent) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b6fc3dc0", new Object[]{this, view, new Float(f), motionEvent});
            return;
        }
        view.setTranslationX(f);
        motionEvent.offsetLocation(f - motionEvent.getX(0), 0.0f);
    }

    public v5b(u4d u4dVar, float f, float f2, float f3) {
        super(u4dVar, f3, f, f2);
    }
}
