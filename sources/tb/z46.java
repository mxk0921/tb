package tb;

import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.android.dinamicx.DXRuntimeContext;
import com.taobao.android.dinamicx.expression.event.DXEvent;
import kotlin.Metadata;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public class z46 extends mv5 {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public RecyclerView c;

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/xhv;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXEvent b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ DXRuntimeContext d;

        public a(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.b = dXEvent;
            this.c = objArr;
            this.d = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public final void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                z46.f(z46.this, this.b, this.c, this.d);
            }
        }
    }

    /* compiled from: Taobao */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"tb/z46$b", "Ljava/lang/Runnable;", "Ltb/xhv;", "run", "()V", "megaUtils_release"}, k = 1, mv = {1, 4, 1})
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public static final class b implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;
        public final /* synthetic */ DXEvent b;
        public final /* synthetic */ Object[] c;
        public final /* synthetic */ DXRuntimeContext d;

        public b(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
            this.b = dXEvent;
            this.c = objArr;
            this.d = dXRuntimeContext;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView g;
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else if (z46.this.g() == null || ((g = z46.this.g()) != null && g.getScrollState() == 0)) {
                z46.f(z46.this, this.b, this.c, this.d);
            } else {
                jb6.n(this);
            }
        }
    }

    public static final /* synthetic */ void f(z46 z46Var, DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("58b34922", new Object[]{z46Var, dXEvent, objArr, dXRuntimeContext});
        } else {
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }

    public static /* synthetic */ Object ipc$super(z46 z46Var, String str, Object... objArr) {
        if (str.hashCode() == -103056537) {
            super.handleEvent((DXEvent) objArr[0], (Object[]) objArr[1], (DXRuntimeContext) objArr[2]);
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/megautils/perform/dx/DXMultiRunModeEventChainHandler");
    }

    public final RecyclerView g() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (RecyclerView) ipChange.ipc$dispatch("23bc5268", new Object[]{this});
        }
        return this.c;
    }

    public final void h(RecyclerView recyclerView) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("46db97ca", new Object[]{this, recyclerView});
        } else {
            this.c = recyclerView;
        }
    }

    @Override // tb.mv5, tb.ob5, tb.mvb
    public void handleEvent(DXEvent dXEvent, Object[] objArr, DXRuntimeContext dXRuntimeContext) {
        Object obj;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("f9db7b67", new Object[]{this, dXEvent, objArr, dXRuntimeContext});
        } else if (objArr != null && objArr.length != 0 && (obj = objArr[0]) != null && !TextUtils.isEmpty(String.valueOf(obj))) {
            if (objArr.length == 1 || objArr[objArr.length - 1] == null) {
                super.handleEvent(dXEvent, objArr, dXRuntimeContext);
                return;
            }
            String valueOf = String.valueOf(objArr[objArr.length - 1]);
            int hashCode = valueOf.hashCode();
            if (hashCode != -2017976178) {
                if (hashCode == 2112570534 && valueOf.equals("runModeRvIdle")) {
                    Object[] array = ic1.C(objArr, 1).toArray(new Object[0]);
                    if (array != null) {
                        jb6.n(new b(dXEvent, array, dXRuntimeContext));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else if (valueOf.equals("runModePost")) {
                Object[] array2 = ic1.C(objArr, 1).toArray(new Object[0]);
                if (array2 != null) {
                    jb6.n(new a(dXEvent, array2, dXRuntimeContext));
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            super.handleEvent(dXEvent, objArr, dXRuntimeContext);
        }
    }
}
