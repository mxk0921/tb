package tb;

import android.os.Handler;
import android.os.Looper;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.mytaobao.basement.BasementViewController;
import com.taobao.mytaobao.pagev2.MtbWeexManager;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class ryo {
    public static volatile transient /* synthetic */ IpChange $ipChange;
    public static final Handler d = new Handler(Looper.getMainLooper());

    /* renamed from: a  reason: collision with root package name */
    public final JSONObject f27679a = new JSONObject();
    public final BasementViewController.i b;
    public final MtbWeexManager c;

    /* compiled from: Taobao */
    /* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
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
                ryo.a(ryo.this);
            }
        }
    }

    static {
        t2o.a(745537651);
    }

    public ryo(BasementViewController.i iVar) {
        this.b = iVar;
    }

    public static /* synthetic */ void a(ryo ryoVar) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a9f13171", new Object[]{ryoVar});
        } else {
            ryoVar.c();
        }
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("226c8326", new Object[]{this});
        } else {
            d.removeCallbacksAndMessages(null);
        }
    }

    public final void c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("77330346", new Object[]{this});
            return;
        }
        this.f27679a.put("status", (Object) "end");
        BasementViewController.i iVar = this.b;
        if (iVar != null) {
            iVar.k("notifyMyTaoBaoScrollStatusChange", this.f27679a);
        }
        MtbWeexManager mtbWeexManager = this.c;
        if (mtbWeexManager != null) {
            mtbWeexManager.B("notifyMyTaoBaoScrollStatusChange", this.f27679a);
        }
    }

    public final void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("a547d04d", new Object[]{this});
            return;
        }
        this.f27679a.put("status", (Object) "start");
        BasementViewController.i iVar = this.b;
        if (iVar != null) {
            iVar.k("notifyMyTaoBaoScrollStatusChange", this.f27679a);
        }
        MtbWeexManager mtbWeexManager = this.c;
        if (mtbWeexManager != null) {
            mtbWeexManager.B("notifyMyTaoBaoScrollStatusChange", this.f27679a);
        }
    }

    public void e(int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("62ef402d", new Object[]{this, new Integer(i)});
        } else if (i == 1) {
            d();
        } else if (i == 0) {
            d.post(new a());
        }
    }

    public ryo(MtbWeexManager mtbWeexManager) {
        this.c = mtbWeexManager;
    }
}
