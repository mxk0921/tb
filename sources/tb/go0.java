package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.android.aura.annotation.AURAExtensionImpl;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.InstantReloadException;
import com.android.alibaba.ip.runtime.IpChange;

/* compiled from: Taobao */
@AURAExtensionImpl(code = "alibuy.impl.nextrpc.stream.handler")
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
public final class go0 extends qt {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public io0 e;
    public long f = 0;
    public final Handler g = new Handler(Looper.getMainLooper());
    public Runnable h;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes4.dex */
    public class a implements Runnable {
        public static volatile transient /* synthetic */ IpChange $ipChange;

        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            IpChange ipChange = $ipChange;
            if (ipChange instanceof IpChange) {
                ipChange.ipc$dispatch("5c510192", new Object[]{this});
            } else {
                jo0.d("STREAM_DATA_TIME_OUT");
            }
        }
    }

    static {
        t2o.a(301990007);
    }

    public static /* synthetic */ Object ipc$super(go0 go0Var, String str, Object... objArr) {
        if (str.hashCode() == -1504501726) {
            super.onDestroy();
            return null;
        }
        int hashCode = str.hashCode();
        throw new InstantReloadException("String switch could not find '" + str + "' with hashcode " + hashCode + " in com/taobao/android/buy/extension/stream/AliBuyStreamResponseHandlerExtension");
    }

    public final io0 J0() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (io0) ipChange.ipc$dispatch("b156ec4d", new Object[]{this});
        }
        io0 io0Var = this.e;
        if (io0Var != null) {
            return io0Var;
        }
        io0 io0Var2 = (io0) x().get("aliBuyGlobalDataStreamResponseProcessor", io0.class);
        this.e = io0Var2;
        if (io0Var2 == null) {
            this.e = new io0(B(), x());
            x().update("aliBuyGlobalDataStreamResponseProcessor", this.e);
        }
        return this.e;
    }

    @Override // tb.zs, tb.ybb
    public void onDestroy() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a6532022", new Object[]{this});
            return;
        }
        super.onDestroy();
        io0 io0Var = this.e;
        if (io0Var != null) {
            io0Var.j();
        }
    }

    public final void K0(io0 io0Var, toq toqVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b5d66108", new Object[]{this, io0Var, toqVar});
        } else if (toqVar.b()) {
            ck.g().e("stream", "收到流式首包数据");
            io0Var.A(true);
            io0Var.z(toqVar);
            jo0.a();
            if (this.h == null) {
                this.h = new a();
            }
            this.g.postDelayed(this.h, l0r.DEFAULT_TCP_CONNECT_TIMEOUT_MS);
        } else {
            ck.g().e("stream", "进入流式桶，但不是流式数据");
            jo0.d("STREAM_BUCKET_BUT_NOT_HEADER");
        }
    }

    public final void L0(io0 io0Var, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("9357346e", new Object[]{this, io0Var, jSONObject});
            return;
        }
        ck.g().e("stream", "收到流式二段包数据");
        io0Var.A(false);
        Runnable runnable = this.h;
        if (runnable != null) {
            this.g.removeCallbacks(runnable);
        }
        io0Var.s();
        if (jSONObject.isEmpty()) {
            jo0.d("STREAM_DATA_EMPTY");
        }
        jo0.c();
        jo0.b((String) B().g("itemCount", String.class), this.f, System.currentTimeMillis(), ik.a((kk) x().get("aura_data_response", kk.class)));
    }

    @Override // tb.qt
    public boolean L(mn mnVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("db1f04f", new Object[]{this, mnVar})).booleanValue();
        }
        JSONObject jSONObject = mnVar.b().getJSONObject("data");
        if (jSONObject == null) {
            ck.g().e("stream", "protocol is null");
            return false;
        }
        io0 J0 = J0();
        toq toqVar = new toq(jSONObject);
        int y = mnVar.y();
        if (y == 1) {
            this.f = System.currentTimeMillis();
            K0(J0, toqVar);
        } else if (y == 2) {
            L0(J0, jSONObject);
        } else {
            ck.g().e("stream", "不支持>2的流式数据");
            jo0.d("STREAM_DATA_NO_IDENTIFIER_COUNT");
        }
        return false;
    }

    @Override // tb.qt
    public boolean m0(mn mnVar) {
        boolean z = true;
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return ((Boolean) ipChange.ipc$dispatch("7187460c", new Object[]{this, mnVar})).booleanValue();
        }
        int y = mnVar.y();
        if (y == 1) {
            ck.g().e("stream", "流式首段包异常");
            return false;
        }
        io0 J0 = J0();
        if (y != 2 || J0.p()) {
            z = false;
        }
        StringBuilder sb = new StringBuilder("STREAM_DATA_EXCEPTION");
        String str = "_错误提示";
        sb.append(z ? "_忽略" : str);
        sb.append(mnVar.h());
        jo0.d(sb.toString());
        rbb g = ck.g();
        if (z) {
            str = "_忽略";
        }
        g.e("stream", str);
        return z;
    }
}
