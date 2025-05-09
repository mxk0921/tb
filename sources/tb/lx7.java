package tb;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.phenix.intf.event.SuccPhenixEvent;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public abstract class lx7 {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    public static final String TAG = "DrawableFactory";

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static class a implements s8d<SuccPhenixEvent> {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ int f23620a;
        public final /* synthetic */ b b;

        public a(int i, b bVar) {
            this.f23620a = i;
            this.b = bVar;
        }

        /* renamed from: a */
        public boolean onHappen(SuccPhenixEvent succPhenixEvent) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                return ((Boolean) ipChange.ipc$dispatch("362cccf4", new Object[]{this, succPhenixEvent})).booleanValue();
            }
            BitmapDrawable drawable = succPhenixEvent.getDrawable();
            if (!(drawable == null || succPhenixEvent.getDrawable().getBitmap() == null || succPhenixEvent.getDrawable().getBitmap().isRecycled() || this.f23620a == -1)) {
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                int i = this.f23620a;
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
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public interface b {
        void a(Drawable drawable);
    }

    static {
        t2o.a(912262882);
    }

    public static void b(String str, Context context, int i, b bVar, lx7 lx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("676ff5e3", new Object[]{str, context, new Integer(i), bVar, lx7Var});
        } else {
            s0m.B().N0(context).T(str).succListener(new a(i, bVar)).fetch();
        }
    }

    public static void c(String str, Context context, b bVar, lx7 lx7Var) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("cc764736", new Object[]{str, context, bVar, lx7Var});
        } else {
            b(str, context, -1, bVar, lx7Var);
        }
    }

    public abstract void a(String str, Context context, int i, b bVar);
}
