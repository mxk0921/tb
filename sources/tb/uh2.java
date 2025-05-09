package tb;

import android.content.Context;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import com.taobao.mmad.biz.interact.controller.interact.view.BootImageInteractBaseView;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes7.dex */
public class uh2 {
    public static volatile transient /* synthetic */ IpChange $ipChange;

    /* renamed from: a  reason: collision with root package name */
    public BootImageInteractBaseView f29368a;
    public BootImageInfo b;
    public JSONObject c;
    public Context d;

    static {
        t2o.a(573571101);
    }

    public uh2(Context context, BootImageInfo bootImageInfo) {
        this.d = context;
        this.b = bootImageInfo;
        d();
    }

    public void b() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("e32ba67f", new Object[]{this});
        }
    }

    public BootImageInteractBaseView c() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            return (BootImageInteractBaseView) ipChange.ipc$dispatch("4b862bd4", new Object[]{this});
        }
        return null;
    }

    public void d() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("b8b1d232", new Object[]{this});
        }
    }

    public void e(Context context, BootImageInfo bootImageInfo, JSONObject jSONObject) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("485fa26b", new Object[]{this, context, bootImageInfo, jSONObject});
            return;
        }
        this.d = context;
        this.b = bootImageInfo;
        this.c = jSONObject;
    }

    public void f() {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("ebbb9904", new Object[]{this});
        }
    }

    public uh2() {
    }
}
