package tb;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import com.android.alibaba.ip.runtime.IpChange;
import com.taobao.bootimage.data.BootImageInfo;
import java.util.List;

/* compiled from: Taobao */
/* loaded from: /Users/corson/Downloads/taobao_decompiled/build/apk/classes6.dex */
public class djq implements ckc {
    public static volatile transient /* synthetic */ IpChange $ipChange = null;
    private static final String b = "2ARCH_StateMachine";

    /* renamed from: a  reason: collision with root package name */
    private final xiq f17872a;

    static {
        t2o.a(736100404);
        t2o.a(736100399);
    }

    public djq(lh2 lh2Var, a29 a29Var) {
        this.f17872a = new xiq(new zh2(), lh2Var, a29Var);
    }

    public void a(Activity activity) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("8a989aea", new Object[]{this, activity});
            return;
        }
        tm1.a(b, "setActivity: ");
        this.f17872a.e(activity);
    }

    @Override // tb.ckc
    public void onCreateView(BootImageInfo bootImageInfo, ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("529c79f3", new Object[]{this, bootImageInfo, ei2Var, new Integer(i)});
            return;
        }
        tm1.a(b, "onCreateView: " + ei2Var);
    }

    @Override // tb.ckc
    public void onDownload(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2161d64", new Object[]{this, list, new Integer(i)});
        } else {
            this.f17872a.c(105, i);
        }
    }

    @Override // tb.ckc
    public void onStart(List<JSONObject> list, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("270aeca8", new Object[]{this, list, new Integer(i)});
            return;
        }
        tm1.a(b, "onStart: ");
        this.f17872a.c(100, i);
    }

    @Override // tb.ckc
    public void onTerminate(int i, int i2, int i3) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("24cfaf3a", new Object[]{this, new Integer(i), new Integer(i2), new Integer(i3)});
            return;
        }
        tm1.a(b, "onTerminate: ");
        this.f17872a.c(104, i);
    }

    @Override // tb.ckc
    public void onViewShown(ei2 ei2Var, int i) {
        IpChange ipChange = $ipChange;
        if (ipChange instanceof IpChange) {
            ipChange.ipc$dispatch("2fc759ce", new Object[]{this, ei2Var, new Integer(i)});
        } else {
            tm1.a(b, "onViewShown: ");
        }
    }
}
