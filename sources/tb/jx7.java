package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public abstract class jx7 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f22265a;
        public final /* synthetic */ b b;

        public a(int i, b bVar) {
            this.f22265a = i;
            this.b = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (!(drawable == null || succPhenixEvent.getDrawable().getBitmap() == null || succPhenixEvent.getDrawable().getBitmap().isRecycled() || this.f22265a == -1)) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = this.f22265a;
                if (i != intrinsicHeight) {
                    intrinsicWidth = (intrinsicWidth * i) / intrinsicHeight;
                }
                drawable.setBounds(0, 0, intrinsicWidth, i);
            }
            b bVar = this.b;
            if (bVar != null) {
                bVar.a(drawable);
            }
            return false;
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
    public interface b {
        void a(Drawable drawable);
    }

    static {
        t2o.a(486539441);
    }

    public static void a(String str, Context context, int i, b bVar, jx7 jx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("6865983f", new Object[]{str, context, new Integer(i), bVar, jx7Var});
            return;
        }
        fve.b(lx7.TAG, "DrawableFactory starts loading FILL-RESOLUTION image.");
        s0m.B().N0(context).U(p2b.c(str, null), str).addLoaderExtra(nd2.BUNDLE_BIZ_CODE, p2b.f(str, "5401")).succListener(new a(i, bVar)).fetch();
    }

    public static void b(String str, Context context, b bVar, jx7 jx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("874c0a52", new Object[]{str, context, bVar, jx7Var});
        } else {
            a(str, context, -1, bVar, jx7Var);
        }
    }
}
