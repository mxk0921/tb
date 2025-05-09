package tb;

import android.util.Log;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.tao.Globals;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class pxw {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public static class a implements u5h {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ b f26391a;

        public a(b bVar) {
            this.f26391a = bVar;
        }

        @Override // tb.u5h
        public void onLoadFinished(l6h l6hVar) {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("b3924ed3", new Object[]{this, l6hVar});
                return;
            }
            l6hVar.i();
            if (l6hVar.i()) {
                b bVar = this.f26391a;
                if (bVar != null) {
                    bVar.onSuccess();
                    return;
                }
                return;
            }
            b bVar2 = this.f26391a;
            if (bVar2 != null) {
                bVar2.onFail();
            }
        }
    }

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
    public interface b {
        void onFail();

        void onSuccess();
    }

    static {
        t2o.a(978321410);
    }

    public static void a(b bVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("fc8853be", new Object[]{bVar});
            return;
        }
        try {
            com.taobao.android.weex.b.d().c(Globals.getApplication());
        } catch (Throwable th) {
            Log.e("WasmRuntime", "init weex before wasm failed", th);
        }
        bzn.d().a("wasm_runtime", new a(bVar));
    }
}
